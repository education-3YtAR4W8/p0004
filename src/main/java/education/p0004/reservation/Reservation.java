package education.p0004.reservation;

import education.p0004.common.Utils;
import education.p0004.common.entity.ReserveInfo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Reservation {

    TimeTable timeTable = new TimeTable();

    public void setReserveInfoOnTimeTable(List<ReserveInfo> reserveInfoList, String loginUser) {
        for (ReserveInfo reserveInfo : reserveInfoList) {
            timeTable.setBeginAndEndTimePoint(reserveInfo, loginUser);
        }
    }

    public Map<Integer, OneHourDetail> createTimeTable() {
        return timeTable.getTimeTableOfReservation();
    }

    public List<ReserveInfo> getPrimaryReservationInfo(List<ReserveInfo> reserveInfoList, String userId) {
        List<ReserveInfo> primaryReservationInfoList = new ArrayList<>();
        for (ReserveInfo reserveInfo : reserveInfoList) {
            if (userId.equals(reserveInfo.getUserId())) {
                primaryReservationInfoList.add(reserveInfo);
            }
        }
        return primaryReservationInfoList;
    }

    public Map<String, String> createPrimaryReservationInfoForDisplay(List<ReserveInfo> reserveInfoList) {

        Map<String, String> primaryReservationMap = new LinkedHashMap<>();
        int beginHour;
        int beginMinute;
        int endHour;
        int endMinute;
        String combinedBeginTime;
        String combinedEndTime;
        String primaryReservationTime;

        for (ReserveInfo reserveInfo : reserveInfoList) {
            // 開始時刻
            beginHour = Utils.getHourOrMinute(reserveInfo.getBeginTime(), true);
            beginMinute = Utils.getHourOrMinute(reserveInfo.getBeginTime(), false);
            combinedBeginTime = Utils.combineHourAndMinuteWithColon(Integer.toString(beginHour),
                    Integer.toString(beginMinute));
            // 終了時刻
            endHour = Utils.getHourOrMinute(reserveInfo.getEndTime(), true);
            endMinute = Utils.getHourOrMinute(reserveInfo.getEndTime(), false);
            combinedEndTime = Utils.combineHourAndMinuteWithColon(Integer.toString(endHour),
                    Integer.toString(endMinute));
            // 「開始時刻 - 終了時刻」を取得
            primaryReservationTime = Utils.combineBeginTimeAndEndTime(combinedBeginTime, combinedEndTime);
            primaryReservationMap.put(reserveInfo.getReservationNo(), primaryReservationTime);
        }

        return primaryReservationMap;
    };

    public ReserveInfo createReservationInfo(String roomNo, String userId, int beginTime, int endTime,
                                             String reserveDate) {
        ReserveInfo reserveInfo = new ReserveInfo();
        reserveInfo.setRoomNo(roomNo);
        reserveInfo.setUserId(userId);
        reserveInfo.setBeginTime(beginTime);
        reserveInfo.setEndTime(endTime);
        reserveInfo.setReserveDate(reserveDate);

        // 予約番号生成
        StringBuilder sb = new StringBuilder();
        sb.append(roomNo);
        sb.append(userId);
        sb.append(beginTime);
        sb.append(endTime);
        sb.append(reserveDate);

        String reservationNo = sb.toString();
        reserveInfo.setReservationNo(reservationNo);
        System.out.println("新規予約番号="+reservationNo);

        return reserveInfo;
    }
}
