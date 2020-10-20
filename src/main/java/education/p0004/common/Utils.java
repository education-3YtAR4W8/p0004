package education.p0004.common;

import education.p0004.common.dao.RoomInfoDao;
import education.p0004.common.entity.RoomInfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static int getHourOrMinute(int targetTime, boolean isHour) {
        String time = String.valueOf(targetTime);
        String hour;
        String minute;
        if (time.length() == 3) {
            // 0時～9時台
            hour = time.substring(0, 1);
            minute = time.substring(1);
        } else {
            // 10時～23時台
            hour = time.substring(0, 2);
            minute = time.substring(2);
        }
        if (isHour) {
            // 時間を返却
            return Integer.parseInt(hour);
        } else {
            // 分を返却
            return Integer.parseInt(minute);
        }
    }

    public static String setEndTimeSuffix(String targetString) {
        return targetString + Const.SUFFIX_END_TIME;
    }

    public static String removeEndTimeSuffix(String targetString) {
        return targetString.replace(Const.SUFFIX_END_TIME, "");
    }


    public static boolean isEndTime(String reserveClassification) {
        return reserveClassification.contains(Const.SUFFIX_END_TIME);
    }

    public static String combineHourAndMinute(String hour, String minute) {
        String combinedString = "";
        String zeroPaddingMin;
        if (!hour.equals("") && !minute.equals("")) {
            zeroPaddingMin = String.format("%2s", minute).replace(" ", "0");
            combinedString = hour + zeroPaddingMin;
        }
        return combinedString;
    }

    public static String combineHourAndMinuteWithColon(String hour, String minute) {
        String combinedString = "";
        String zeroPaddingMin;
        if (!hour.equals("") && !minute.equals("")) {
            zeroPaddingMin = String.format("%2s", minute).replace(" ", "0");
            combinedString = hour + ":" + zeroPaddingMin;
        }
        return combinedString;
    }

    public static String combineBeginTimeAndEndTime(String beginTime, String endTime) {
        String combinedTime = "";
        if(!beginTime.equals("") && !endTime.equals("")) {
            combinedTime = beginTime + " - " + endTime;
        }
        return combinedTime;
    }

    public static Date parseDate(String date) {
        SimpleDateFormat sbFormat = new SimpleDateFormat("yyyyMMdd");
        sbFormat.setLenient(false);
        try {
            return sbFormat.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String getFormattedDate(Date date) {
        SimpleDateFormat sbFormat = new SimpleDateFormat("yyyy年MM月dd日");
        sbFormat.setLenient(false);
        return sbFormat.format(date);
    }

    public static Boolean existsRoomNo(String roomNo, RoomInfoDao roomInfoDao) {
        RoomInfo roomInfo = roomInfoDao.selectByRoomNo(roomNo);
        return roomInfo != null;
    }

    public static Boolean canConvertToNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static Boolean isCorrectTime(int[] beginTime, int[] endTime) {
        int startHour = beginTime[0];
        int closeHour = endTime[0];
        if (closeHour - startHour > 0) {
            // 終了時 > 開始時の場合
            return true;
        } else if (closeHour - startHour == 0) {
            // 終了時 = 開始時の場合
            if (endTime[1] - beginTime[1] > 0) {
                // 終了分 > 開始分の場合
                return true;
            } else {
                // 終了分 ≦ 開始分の場合（同じ場合は時間の幅がないので不整合とする）
                return false;
            }
        } else {
            // 終了時 < 開始時の場合
            return false;
        }
    }
}
