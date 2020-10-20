package education.p0004.reservation;

import education.p0004.common.Const;
import education.p0004.common.Utils;
import education.p0004.common.dao.ReserveInfoDao;
import education.p0004.common.dao.RoomInfoDao;
import education.p0004.common.entity.ReserveInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class ReservationController {

    @Autowired
    ReservationInfoSession reservationInfoSession;
    @Autowired
    RoomInfoDao roomInfoDao;
    @Autowired
    ReserveInfoDao reserveInfoDao;

    @GetMapping(path = "/reserveroom/{date}/{roomNo}")
    String showReservePage(Model model, @PathVariable String date,
                               @PathVariable String roomNo) {

        // 有効日付チェック
        Date validDate = Utils.parseDate(date);
        if (validDate == null) {
            return "error";
        }
        // 会議室存在チェック
        if (!Utils.existsRoomNo(roomNo, roomInfoDao)) {
            return "error";
        }
        reservationInfoSession.reservationDate = date;
        reservationInfoSession.roomNo = roomNo;

        // 会議室と日付に紐づく予約情報を取得
        List<ReserveInfo> reserveInfoListSelectedByRoomNoAndDate =
                reserveInfoDao.selectByRoomNoAndDateOrderByBeginTime(roomNo, date);

        Reservation reservation = new Reservation();
        // ユーザIDに紐づく予約情報のみのリスト作成
        List<ReserveInfo> primaryReservationInfo = reservation.getPrimaryReservationInfo(
                reserveInfoListSelectedByRoomNoAndDate, reservationInfoSession.loginUserId);

        reservation.setReserveInfoOnTimeTable(reserveInfoListSelectedByRoomNoAndDate,
                reservationInfoSession.loginUserId);

        // 予約ページ情報生成
        ReservePage reservePage = new ReservePage(
                reservationInfoSession.loginUserId,
                Utils.getFormattedDate(validDate),
                reservation.createTimeTable(),
                reservation.createPrimaryReservationInfoForDisplay(primaryReservationInfo),
                reservationInfoSession.resultMsgSuccess,
                reservationInfoSession.resultMsgFailed);

        // 再読み込みした際にメッセージを表示しないように初期化
        reservationInfoSession.resultMsgSuccess = "";
        reservationInfoSession.resultMsgFailed = "";

        model.addAttribute("reservePage", reservePage);

        return "reserve";
    }

    @PostMapping(path = "/reserveroom/reserve/")
    String reserve(@ModelAttribute InputInfo inputInfo) {

        // リダイレクト情報作成
        StringBuilder sb = new StringBuilder();
        sb.append("redirect:/reserveroom/");
        sb.append(reservationInfoSession.reservationDate);
        sb.append("/");
        sb.append(reservationInfoSession.roomNo);

        String inputBeginHour = inputInfo.getBeginHour();
        String inputBeginMinute = inputInfo.getBeginMinute();
        String inputEndHour = inputInfo.getEndHour();
        String inputEndMinute = inputInfo.getEndMinute();

        // 入力値チェック
        if(!Utils.canConvertToNumber(inputBeginHour)
                || !Utils.canConvertToNumber(inputBeginMinute)
                || !Utils.canConvertToNumber(inputEndHour)
                || !Utils.canConvertToNumber(inputEndMinute)) {

            // 結果メッセージを設定しリダイレクト
            reservationInfoSession.resultMsgFailed = Const.RESULT_MSG_RESERVE_INPUT_INVALID_VALUE;
            return sb.toString();
        }

        // 時間整合性チェック
        int[] beginTimeArray = {Integer.parseInt(inputBeginHour), Integer.parseInt(inputBeginMinute)};
        int[] endTimeArray = {Integer.parseInt(inputEndHour), Integer.parseInt(inputEndMinute)};
        if (!Utils.isCorrectTime(beginTimeArray, endTimeArray)) {

            // 結果メッセージを設定しリダイレクト
            reservationInfoSession.resultMsgFailed = Const.RESULT_MSG_RESERVE_INCORRECT_TIME;
            return sb.toString();
        }

        // 予約重複チェック
        int combinedBeginTime = Integer.parseInt(Utils.combineHourAndMinute(inputBeginHour, inputBeginMinute));
        int combinedEndTime = Integer.parseInt(Utils.combineHourAndMinute(inputEndHour, inputEndMinute));
        List<ReserveInfo> reserveInfoList =
                reserveInfoDao.selectOverlappingReserveByBeginAndEndTime(combinedBeginTime, combinedEndTime,
                        reservationInfoSession.roomNo, reservationInfoSession.reservationDate);
        if (!reserveInfoList.isEmpty()) {
            // 時間が被っている予約が取得できた場合
            // 結果メッセージを設定しリダイレクト
            reservationInfoSession.resultMsgFailed = Const.RESULT_MSG_RESERVE_OVERLAPPING_TIME;
            return sb.toString();
        }

        // 予約情報作成
        Reservation reservation = new Reservation();
        ReserveInfo reserveInfo = reservation.createReservationInfo(
                reservationInfoSession.roomNo,
                reservationInfoSession.loginUserId,
                combinedBeginTime,
                combinedEndTime,
                reservationInfoSession.reservationDate);

        // 予約登録
        int insertNum = reserveInfoDao.insertReserveInfo(reserveInfo);
        if (insertNum == 1) {
            reservationInfoSession.resultMsgSuccess = Const.RESULT_MSG_RESERVE_SUCCESS;
        } else {
            reservationInfoSession.resultMsgFailed = Const.RESULT_MSG_RESERVE_FAILED;
        }

        return sb.toString();
    }

    @PostMapping(path = "/reserveroom/delete/")
    String delete(@ModelAttribute InputInfo inputInfo) {

        if (inputInfo.getReservationNo() == null) {
            // 入力情報が選択されていない場合
            reservationInfoSession.resultMsgFailed = Const.RESULT_MSG_DELETE_UNSELECTED;

        } else {

            // 削除対象予約の情報があるか確認
            ReserveInfo reserveInfo = reserveInfoDao.selectByReservationNo(inputInfo.getReservationNo());
            if (reserveInfo != null) {
                if (reserveInfo.getUserId().equals(reservationInfoSession.loginUserId)) {
                    // 削除対象予約情報のユーザーIDとログインユーザーIDが一致する場合
                    int deleteNum = reserveInfoDao.deleteReservationBasedOnReservationNo(reserveInfo);
                    if (deleteNum == 1) {
                        reservationInfoSession.resultMsgSuccess = Const.RESULT_MSG_DELETE_SUCCESS;
                    } else {
                        reservationInfoSession.resultMsgFailed = Const.RESULT_MSG_DELETE_FAILED;
                    }
                } else {
                    // 上記以外場合は削除失敗とする
                    reservationInfoSession.resultMsgFailed = Const.RESULT_MSG_DELETE_FAILED;
                }
            } else {
                // 削除対象予約が取得できなかった場合は削除失敗とする
                reservationInfoSession.resultMsgFailed = Const.RESULT_MSG_DELETE_FAILED;
            }
        }

        // リダイレクト情報作成
        StringBuilder sb = new StringBuilder();
        sb.append("redirect:/reserveroom/");
        sb.append(reservationInfoSession.reservationDate);
        sb.append("/");
        sb.append(reservationInfoSession.roomNo);

        return sb.toString();
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class ReservePage {
        private String loginUserId;
        private String reservationDate;
        private Map<Integer, OneHourDetail> timeTableMap;
        private Map<String, String> primaryReservationMap;
        private String resultMsgSuccess;
        private String resultMsgFailed;
    }

}
