package education.p0004.reservation;

import education.p0004.common.Const;
import education.p0004.common.Utils;
import education.p0004.common.entity.ReserveInfo;

import java.util.Map;
import java.util.TreeMap;

public class TimeTable {

    public Map<Integer, OneHourDetail> timeTableMap = new TreeMap<>();

    public void setBeginAndEndTimePoint(ReserveInfo reserveInfo, String loginUser) {
        int beginHour;
        int beginMinute;
        int endHour;
        int endMinute;
        String reserveKind;
        if (loginUser.equals(reserveInfo.getUserId())) {
            reserveKind = Const.RESERVATION_KIND_PRIMARY;
        } else {
            reserveKind = Const.RESERVATION_KIND_SECONDARY;
        }
        beginHour = Utils.getHourOrMinute(reserveInfo.getBeginTime(), true);
        beginMinute = Utils.getHourOrMinute(reserveInfo.getBeginTime(), false);
        endHour = Utils.getHourOrMinute(reserveInfo.getEndTime(), true);
        endMinute = Utils.getHourOrMinute(reserveInfo.getEndTime(), false);

        // 予約の開始時刻を設定
        OneHourDetail oneHourDetailBegin = timeTableMap.get(beginHour);
        if (oneHourDetailBegin == null) {
            oneHourDetailBegin = new OneHourDetail();
        }
        oneHourDetailBegin.setReservationClassification(beginMinute, reserveKind);
        timeTableMap.put(beginHour, oneHourDetailBegin);

        // 予約の終了時刻を設定
        // 設定用に加工
        if (endMinute == 0) {
            endHour -= 1;
            endMinute += 45;
        } else {
            endMinute -= 15;
        }
        OneHourDetail oneHourDetailEnd = timeTableMap.get(endHour);
        if (oneHourDetailEnd == null) {
            oneHourDetailEnd = new OneHourDetail();
        }
        // 終了時刻用のサフィックスを付与
        reserveKind = Utils.setEndTimeSuffix(reserveKind);
        oneHourDetailEnd.setReservationClassification(endMinute, reserveKind);
        timeTableMap.put(endHour, oneHourDetailEnd);
    }

    public Map<Integer, OneHourDetail> getTimeTableOfReservation() {

        String reserveKind = "";
        boolean endFlag = false;
        for (int i : Const.HOURS) {

            OneHourDetail oneHourDetail = timeTableMap.get(i);
            if (oneHourDetail == null) {
                oneHourDetail = new OneHourDetail();
            }

            Map<Integer, String> reservationClassificationMap =
                    oneHourDetail.getReservationClassificationMap();
            for (int j : reservationClassificationMap.keySet()) {

                // 設定する予約分類を決定する
                if (reserveKind.equals("")) {

                    reserveKind = reservationClassificationMap.get(j);
                    // 対象ループの予約分類が"0"(予約なし)の場合
                    if (reserveKind.equals(Const.RESERVATION_KIND_NONE)) {
                        // 初期化して次のループへ
                        reserveKind = "";
                        continue;
                    }

                    // 設定した予約分類に終了時刻サフィックスが付与されている場合
                    // ex)9:00-9:15などの15分間の予約が対象
                    if (Utils.isEndTime(reserveKind)) {
                        // 終了時間サフィックスを削除して再設定
                        reserveKind = Utils.removeEndTimeSuffix(reserveKind);
                    }
                }

                // 対象ループの予約分類に終了時刻サフィックスが付与されている場合
                if (Utils.isEndTime(reservationClassificationMap.get(j))) {
                    endFlag = true;
                }

                oneHourDetail.setReservationClassification(j, reserveKind);

                // 対象ループの予約分類に終了時刻サフィックスが付与されている場合
                if (endFlag) {
                    // 取得した予約分類を初期化
                    reserveKind = "";
                    endFlag = false;
                }
            }
            timeTableMap.put(i, oneHourDetail);
        }
        return timeTableMap;
    }
}
