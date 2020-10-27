package education.p0004.reserveroom;

import education.p0004.common.dao.ReserveDao;
import education.p0004.common.entity.Reserve;
import education.p0004.common.exception.NotFoundException;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
public class ReserveRoomController {
    @Autowired
    ReserveRoomSession reserveRoomSession;
    @Autowired
    ReserveDao reserveDao;

    static final DateTimeFormatter formatterForDispDate = DateTimeFormatter.ofPattern("yyyyMMdd");
    static final DateTimeFormatter formatterForReserveTime = DateTimeFormatter.ofPattern("HH:mm:ss");
    static final DateTimeFormatter formatterForReserveDatetime = DateTimeFormatter.ofPattern("yyyyMMdd HHmmss");


    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleResourceNotFoundException() {
        return "error/notfound";
    }


    @GetMapping(path = "/reserveroom/{dispDate}/{roomId}")
    public String index(Model model, @PathVariable("dispDate") String strDispDate, @PathVariable("roomId") String roomId) {
        Page page = new Page();
        page.loginUserId = reserveRoomSession.loginUserId;

        if (isValidDispDate(strDispDate)) {
            page.dispDate = LocalDate.parse(strDispDate, DateTimeFormatter.ofPattern("yyyyMMdd"));
        } else {
            page.isInvalidDispDate = true;
        }

        page.roomId = roomId;
        page.reserves = reserveDao.selectByRoomIdAndDispDate(roomId, page.dispDate);

        model.addAttribute("page", page);
        return "reserve";
    }

    private boolean isValidDispDate(String dispDate) {
        try {
            LocalDate.parse(dispDate, formatterForDispDate);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Data
    static public class Page {
        List<Reserve> reserves;
        LocalDate dispDate;
        String roomId = "";
        String loginUserId = "";
        Boolean isInvalidDispDate = false;

        public boolean isReservedByLoginUser(Integer hour, Integer minute) {
            return reserves.stream().anyMatch(it -> {
                if (!it.userId.equals(loginUserId)) {
                    return false;
                }
                LocalDateTime target = LocalDateTime.of(dispDate, LocalTime.of(hour, minute));
                return target.compareTo(it.beginDatetime) >= 0 && target.compareTo(it.endDatetime) < 0;
            });
        }

        public boolean isReservedByAnotherUser(Integer hour, Integer minute) {
            return reserves.stream().anyMatch(it -> {
                if (it.userId.equals(loginUserId)) {
                    return false;
                }
                LocalDateTime target = LocalDateTime.of(dispDate, LocalTime.of(hour, minute));
                return target.compareTo(it.beginDatetime) >= 0 && target.compareTo(it.endDatetime) < 0;
            });
        }
    }
}
