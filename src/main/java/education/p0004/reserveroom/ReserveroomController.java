package education.p0004.reserveroom;

import education.p0004.common.dao.*;
import education.p0004.common.entity.Reserve;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Calendar;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ReserveroomController {

    final Integer RESERVE_SPAN = 15;    // 単位：分

    @Autowired
    ReserveroomSession reserveroomSession;
    @Autowired
    ReserveDao reserveDao;

    /*
    // 3つ目の引数を追加し、特定ユーザー名としました。
    */
    @GetMapping(path = "reserveroom/{dayOfInput}/{roomOfInput}/{userOfInput}")
    String reserveroom(Model model
            , @PathVariable("dayOfInput") String dayOfInput
            , @PathVariable("roomOfInput") String roomOfInput
            , @PathVariable("userOfInput") String userOfInput
    ) {
        reserveroomSession.dayOfInput = dayOfInput;
        reserveroomSession.roomOfInput = roomOfInput;
        reserveroomSession.userOfInput = userOfInput;

        ReservePage reservePage = new ReservePage();
        ReserveInfo reserveInfo = new ReserveInfo();

        try {
            SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMdd");
            reserveroomSession.dayOfDate = sdFormat.parse(reserveroomSession.dayOfInput);
            reserveInfo.day = reserveroomSession.dayOfDate;
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
        reserveroomSession.roomOfInteger = Integer.valueOf(reserveroomSession.roomOfInput).intValue();
        reserveInfo.room = reserveroomSession.roomOfInteger;
        List<Reserve> reserveList = reserveDao.reserveSelectByDayAndRoomObySTime(reserveInfo);
        reservePage.targetDate = new SimpleDateFormat("yyyy年MM月dd日").format(reserveroomSession.dayOfDate);

        /*
        // 最初に配列作成の為に、「予約を取り消す」での個数を取得する。
        */
        Integer reserveMaxCount = 0;
        for (Reserve reserve : reserveList) {
            if (reserveroomSession.userOfInput.compareTo(reserve.getUser()) == 0) {
                reserveMaxCount++;
            }
        }

        String[][] myReserve = new String[reserveMaxCount][2];
        Integer reserveCount = 0;
        for (Reserve reserve : reserveList) {
            if (reserveroomSession.userOfInput.compareTo(reserve.getUser()) == 0) {

                IntegerTime targetStartTime = daoDateToIntegerHourAndMinute(reserve.getStartTime().getTime());
                IntegerTime targetEndTime = daoDateToIntegerHourAndMinute(reserve.getEndTime().getTime());

                String reserveSpan = String.format("%2d:%02d - %2d:%02d"
                        , targetStartTime.hour, targetStartTime.minute, targetEndTime.hour, targetEndTime.minute);
                myReserve[reserveCount][0] = String.valueOf(reserve.getId());
                myReserve[reserveCount][1] = reserveSpan;
                reserveCount++;
            }
        }

        reservePage.myReserve = myReserve;
        String[][] reserveExist = reserveMakeMatrix(reserveList);

        reservePage.reserveDim = reserveExist;
        reservePage.messageId = reserveroomSession.messageId;
        reservePage.errorId = reserveroomSession.errorId;
        reservePage.reserveSpan = RESERVE_SPAN;
        model.addAttribute("page", reservePage);
        reserveroomSession.messageId = 0;
        reserveroomSession.errorId = 0;

        return "reserve";
    }

    @PostMapping(path = "reserveroom/reserve")
    String reserve(
            @RequestParam("selectReserveHourBegin") String reserveHourStart
            , @RequestParam("selectReserveMinuteBegin") String reserveMinuteStart
            , @RequestParam("selectReserveHourEnd") String reserveHourEnd
            , @RequestParam("selectReserveMinuteEnd") String reserveMinuteEnd
    ) {

        if (reserveHourStart.equals("選択...") || reserveMinuteStart.equals("選択...") || reserveHourEnd.equals("選択...") || reserveMinuteEnd.equals("選択...")) {
            reserveroomSession.errorId = 1;
        } else {
            Integer reserveStartHourToInt = Integer.parseInt(reserveHourStart);
            Integer reserveStartMinuteToInt = Integer.parseInt(reserveMinuteStart);
            Integer reserveEndHourToInt = Integer.parseInt(reserveHourEnd);
            Integer reserveEndMinuteToInt = Integer.parseInt(reserveMinuteEnd);
            if (reserveEndHourToInt == 24) {
                if (reserveEndMinuteToInt != 0) {
                    reserveroomSession.errorId = 2;
                } else {
                    /*
                    // 登録時間が24:00の場合、返還を行うとエラーとなる為、23:59で扱う
                    */
                    reserveEndHourToInt = 23;
                    reserveEndMinuteToInt = 59;
                }
            }
            if (reserveroomSession.errorId == 0) {
                LocalTime reserveStartTime = LocalTime.parse(String.format("%02d", reserveStartHourToInt) + ":" + String.format("%02d", reserveStartMinuteToInt));
                LocalTime reserveEndTime = LocalTime.parse(String.format("%02d", reserveEndHourToInt) + ":" + String.format("%02d", reserveEndMinuteToInt));
                if (reserveStartTime.compareTo(reserveEndTime) >= 0) {
                    reserveroomSession.errorId = 2;
                }
            }

            if (reserveroomSession.errorId == 0) {
                ReserveInfo reserveInfo = new ReserveInfo();
                reserveInfo.day = reserveroomSession.dayOfDate;
                reserveInfo.room = reserveroomSession.roomOfInteger;
                List<Reserve> reserveList = reserveDao.reserveSelectByDayAndRoomObySTime(reserveInfo);
                String[][] reserveExist = reserveMakeMatrix(reserveList);

                try {
                    SimpleDateFormat startFormat = new SimpleDateFormat("hh:mm");
                    Date startTime = startFormat.parse(String.format("%02d", reserveStartHourToInt) + ":" + String.format("%02d", reserveStartMinuteToInt));
                    Calendar startCalendar = Calendar.getInstance();
                    startCalendar.setTime(startTime);

                    SimpleDateFormat endFormat = new SimpleDateFormat("hh:mm");
                    Date endTime = endFormat.parse(String.format("%02d", reserveEndHourToInt) + ":" + String.format("%02d", reserveEndMinuteToInt));
                    Calendar endCalendar = Calendar.getInstance();
                    endCalendar.setTime(endTime);

                    for (int i = 0; i < 24 * 4; i++) {      // ループの最大は、枠（15分単位）の個数の最大値としている
                        if (i == 0) {
                            startCalendar.add(Calendar.MINUTE, 0);
                        } else {
                            startCalendar.add(Calendar.MINUTE, RESERVE_SPAN);
                        }
                        if (startCalendar.getTime().compareTo(endCalendar.getTime()) < 0) {
                            Integer targetHour = startCalendar.get(Calendar.HOUR) + (startCalendar.get(Calendar.AM_PM) * 12);
                            Integer targetMinute = startCalendar.get(Calendar.MINUTE);
                            if (!(reserveExist[targetHour][targetMinute / RESERVE_SPAN] == null)) {
                                reserveroomSession.errorId = 3;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } catch (ParseException e) {
                    System.err.println(e.getMessage());
                    reserveroomSession.errorId = 4;
                }

                if (reserveroomSession.errorId == 0) {
                    Reserve reserveDate = new Reserve();

                    reserveDate.setUser(reserveroomSession.userOfInput);

                    Calendar reserveCalendar = Calendar.getInstance();
                    reserveCalendar.setTime(reserveroomSession.dayOfDate);
                    LocalDate reserveLocalDate = LocalDate.of(reserveCalendar.get(Calendar.YEAR), reserveCalendar.get(Calendar.MONTH) + 1, reserveCalendar.get(Calendar.DAY_OF_MONTH));
                    java.sql.Date javaSqlReserveDate = java.sql.Date.valueOf(reserveLocalDate);
                    reserveDate.setDay(javaSqlReserveDate);

                    LocalTime startLocalTime = LocalTime.of(Integer.parseInt(reserveHourStart), Integer.parseInt(reserveMinuteStart), 0);
                    java.sql.Time startJavaSqlTime = java.sql.Time.valueOf(startLocalTime);
                    reserveDate.setStartTime(startJavaSqlTime);

                    LocalTime endLocalTime = LocalTime.of(reserveEndHourToInt, reserveEndMinuteToInt, 0);
                    java.sql.Time endJavaSqlTime = java.sql.Time.valueOf(endLocalTime);
                    reserveDate.setEndTime(endJavaSqlTime);

                    reserveDate.setRoomNumber(reserveroomSession.roomOfInteger);

                    Integer result = reserveDao.reserveInsert(reserveDate);

                    reserveroomSession.messageId = 1;
                }
            }
        }

        return "redirect:/reserveroom/" + reserveroomSession.dayOfInput + "/" + reserveroomSession.roomOfInput + "/" + reserveroomSession.userOfInput + "/";
    }

    @PostMapping(path = "reserveroom/delete")
    String delete(Model model
            , @RequestParam("deleteId") String deleteId
    ) {

        Reserve reserveDelete = new Reserve();

//        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMdd");
        java.sql.Date sqlDate = new java.sql.Date((reserveroomSession.dayOfDate).getTime());
        reserveDelete.setDay(sqlDate);

        reserveDelete.setRoomNumber(reserveroomSession.roomOfInteger);
        reserveDelete.setId(Integer.valueOf(deleteId).intValue());

        Integer result = reserveDao.reserveDeleteByDayAndRoom(reserveDelete);

        return "redirect:/reserveroom/" + reserveroomSession.dayOfInput + "/" + reserveroomSession.roomOfInput + "/" + reserveroomSession.userOfInput + "/";
    }


    @Getter
    @Setter
    static public class ReservePage {
        String targetDate;
        String[][] reserveDim;
        String[][] myReserve;
        Integer messageId;
        Integer errorId;
        Integer reserveSpan;
    }

    @Getter
    @Setter
    static public class ReserveInfo {
        Date day;
        Integer room;
        Integer id;
    }

    public class IntegerTime {
        Integer hour;
        Integer minute;
    }

    /*
    // 予約が入っているかどうかを二次元配列マトリックスに設定する。
    //　　一次元：時間
    //　　二次元：６０分を予約間隔で割った値（予約間隔が１５分の場合、６０／１５＝４）
    */
    private String[][] reserveMakeMatrix(List<Reserve> reserveList) {
        String[][] reserveExist = new String[24][60 / RESERVE_SPAN];

        for (Reserve reserve : reserveList) {
            Timestamp startTimestamp = new Timestamp(reserve.getStartTime().getTime());
            Timestamp endTimestamp = new Timestamp(reserve.getEndTime().getTime());

            Calendar startCalendar = Calendar.getInstance();
            startCalendar.setTime(startTimestamp);
            Calendar endCalendar = Calendar.getInstance();
            endCalendar.setTime(endTimestamp);

            for (int i = 0; i < 24 * 4; i++) {      // ループの最大は、枠（15分単位）の個数の最大値としている
                if (i == 0) {
                    startCalendar.add(Calendar.MINUTE, 0);
                } else {
                    startCalendar.add(Calendar.MINUTE, RESERVE_SPAN);
                }
                if (startCalendar.getTime().compareTo(endCalendar.getTime()) < 0) {
                    Integer targetHour = startCalendar.get(Calendar.HOUR) + (startCalendar.get(Calendar.AM_PM) * 12);
                    Integer targetMinute = startCalendar.get(Calendar.MINUTE);
                    if (reserve.getUser().equals(reserveroomSession.userOfInput)) {
                        reserveExist[targetHour][targetMinute / RESERVE_SPAN] = "col bg-primary";
                    } else {
                        reserveExist[targetHour][targetMinute / RESERVE_SPAN] = "col bg-secondary";
                    }
                } else {
                    break;
                }
            }
        }
        return reserveExist;
    }

    private IntegerTime daoDateToIntegerHourAndMinute(long dbDate) {

        Timestamp timestamp = new Timestamp(dbDate);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(timestamp);

        IntegerTime integerTime = new IntegerTime();
        integerTime.hour = calendar.get(Calendar.HOUR) + (calendar.get(Calendar.AM_PM) * 12);
        integerTime.minute = calendar.get(Calendar.MINUTE);

        return integerTime;
    }

    /*
    // セッション変数への初期値の設定
    */
    @Configuration
    public class ApplicationConfiguration {
        @Autowired
        ReserveroomSession reserveroomSession;

        @EventListener(ApplicationReadyEvent.class)
        public void applicationReadyEvent() {
            reserveroomSession.userOfInput = "Sample";
        }
    }

}
