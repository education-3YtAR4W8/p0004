package education.p0004.reserve;

import education.p0004.common.CommonInformationSession;
import education.p0004.common.dao.ReserveDao;
import education.p0004.common.entity.Reserve;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;

@Controller
public class ReserveController {

    @Autowired
    ReserveDao reserveDao;

    @Autowired
    CommonInformationSession session;

    @GetMapping(path = "reserveroom/{reservationDate}/{roomId}")
    String index(@PathVariable("reservationDate") String reservationDate, @PathVariable("roomId") String roomId, Model model) throws ParseException {

        Map<Integer, Integer> minutesMap = new HashMap<>();
        minutesMap.put(0,0);
        minutesMap.put(1,15);
        minutesMap.put(2,30);
        minutesMap.put(3,45);

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date formattedReservationDate = format.parse(reservationDate);
        List<Reserve> reserveList = reserveDao.selectByRoomIdAndReservationDateOrderByStartTime(roomId, formattedReservationDate);

        List<Reserve> ownReservationList = new ArrayList<>();
        for (Reserve reserve : reserveList) {
            if (reserve.getUserId().equals(session.loginUserId)) {
                ownReservationList.add(reserve);
            }
        }

        List<ReserveSchedule> reserveScheduleList = new ArrayList<>();
        int reserveListIndex = 0;
        for (int i = 0; i < 24; i++) {
            ReserveSchedule reserveSchedule = new ReserveSchedule();
            while (reserveSchedule.reservationHourList.size() < 4) {
                Reserve reserve = null;
                if (reserveList.size() > reserveListIndex) {
                    reserve = reserveList.get(reserveListIndex);
                }

                LocalTime targetStartTime = LocalTime.of(i,minutesMap.get(reserveSchedule.reservationHourList.size()));
                if (isReservation(reserve, targetStartTime)) {
                    System.out.println("targetTime:" + targetStartTime);
                    System.out.println("reserve.getStart_time():" + reserve.getStart_time());
                    System.out.println("reserve.getEnd_time():" + reserve.getEnd_time());
                    Reservation reservation = new Reservation();
                    if (reserve.getUserId().equals(session.loginUserId)) {
                        reservation.loginUserScheduled = true;
                    } else {
                        reservation.scheduled = true;
                    }
                    reserveSchedule.reservationHourList.add(reservation);

                    int targetEndTimeIndex = reserveSchedule.reservationHourList.size();
                    LocalTime targetEndTime;
                    if (targetEndTimeIndex == 4) {
                        targetEndTime = LocalTime.of(i + 1, minutesMap.get(0));
                    } else {
                        targetEndTime =LocalTime.of(i,minutesMap.get(targetEndTimeIndex));
                    }

                    if (targetEndTime.equals(reserve.getEnd_time())) {
                        reserveListIndex++;
                    }
                } else {
                    reserveSchedule.reservationHourList.add(new Reservation());
                }
            }
            reserveScheduleList.add(reserveSchedule);
        }

        ReservePage page = new ReservePage();
        page.setReserveScheduleList(reserveScheduleList);
        page.setReservationDate(reservationDate);
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        page.setTitle(df.format(formattedReservationDate));
        page.setRoomId(roomId);
        page.setOwnReservationList(ownReservationList);
        page.setInsertError(session.insertError);
        page.setInsertSuccess(session.insertSuccess);
        page.setDeleteError(session.deleteError);
        session.insertError = false;
        session.insertSuccess = false;
        session.deleteError = false;
        model.addAttribute("page", page);
        return "reserve";

    }

    @PostMapping(path = "reserveroom/reserve/")
    String insert(@ModelAttribute ReserveForm reserveForm){
        String redirectUrl = "/reserveroom/" + reserveForm.getReservationDate() + "/" + reserveForm.getRoomId();
        Reserve reserve = new Reserve();
        LocalTime startTime = LocalTime.of(Integer.parseInt(reserveForm.getCmbReserveHourBegin()), Integer.parseInt(reserveForm.getCmbReserveMinuteBegin()),0);
        LocalTime endTime = LocalTime.of(Integer.parseInt(reserveForm.getCmbReserveHourEnd()),Integer.parseInt(reserveForm.getCmbReserveMinuteEnd()),0);

        if (startTime.isAfter(endTime) || startTime.equals(endTime)) {
            session.insertError = true;
            return "redirect:" + redirectUrl;
        }

        reserve.setStart_time(startTime);
        reserve.setEnd_time(endTime);
        reserve.setRoomId(reserveForm.getRoomId());
        StringBuilder sb = new StringBuilder();
        sb.append(reserveForm.getReservationDate());
        sb.insert(4, "-");
        sb.insert(7, "-");
        reserve.setReservationDate(java.sql.Date.valueOf(sb.toString()));
        reserve.setUserId(session.loginUserId);

        Integer count = reserveDao.selectExistsReserveByTime(reserve);
        if (count != 0) {
            session.insertError = true;
            return "redirect:" + redirectUrl;
        }

        reserveDao.insert(reserve);
        session.insertSuccess = true;
        return "redirect:" + redirectUrl;
    }

    @PostMapping(path = "reserveroom/delete/")
    String delete(@RequestParam("deleteStartTime")LocalTime deleteStartTime, @RequestParam("reservationDate")String reservationDate, @RequestParam("roomId")String roomId) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Date formattedReservationDate = format.parse(reservationDate);
            reserveDao.delete(roomId, formattedReservationDate, deleteStartTime);
        } catch (ParseException e) {
            session.deleteError = true;
        }
        String redirectUrl = "/reserveroom/" + reservationDate + "/" + roomId;
        return "redirect:" + redirectUrl;
    }

    static public boolean isReservation(Reserve reserve, LocalTime targetTime) {
        if (reserve == null) {
            return false;
        }
        return targetTime.equals(reserve.getStart_time()) || targetTime.isAfter(reserve.getStart_time());
    }

    @Getter
    @Setter
    static public class ReservePage {
        String title;
        String reservationDate;
        String roomId;
        List<ReserveSchedule> reserveScheduleList = new ArrayList<>();
        List<Reserve> ownReservationList = new ArrayList<>();
        Boolean insertError = false;
        Boolean insertSuccess = false;
        Boolean deleteError = false;
    }

    @Getter
    @Setter
    static public class ReserveSchedule {
        List<Reservation> reservationHourList = new ArrayList<>();
    }

    @Getter
    @Setter
    static public class Reservation {
        //予約ありなし
        boolean scheduled = false;
        //自分の予約かどうか
        boolean loginUserScheduled = false;
    }

}
