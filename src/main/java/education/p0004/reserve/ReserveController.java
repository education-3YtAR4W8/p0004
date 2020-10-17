package education.p0004.reserve;

import education.p0004.common.dao.ReserveDao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Configuration


@Controller
public class ReserveController {
    @Autowired
    ReserveDao reserveDao;
    @Autowired
    CommonInformationSession commonInformationSession;

    @Configuration
    public class ApplicationConfiguration {
        @Autowired
        CommonInformationSession commonInformationSession;

        @EventListener(ApplicationReadyEvent.class)
          public void applicationReadyEvent() {
            commonInformationSession.loginUserId = "user1";
        }
    }

    @GetMapping(path = "/reserve/{reservationDate}/{roomId}")
    public String reserve(
            Model model,
            @PathVariable("reservationDate") Optional<String> reservationDate,
            @PathVariable("roomId") Optional<String> roomId
    ) {
        if (reservationDate.isPresent() && roomId.isPresent()) {
            InputForm inputForm = Optional.ofNullable(commonInformationSession.inputForm).orElse(new InputForm());



            //RequestPage requestPage = new RequestPage(reservationDate, roomId);
            //requestPage.reservationInfo = getReservationInformation(reservationDate, roomId);

        } else {
            //パラメーターが存在しない場合
        }
        return "reserve";
    }

    //List<ReservationInfo> getReservationInformation(Optional<String> reservationDate, Optional<String> roomId) {
//}


    @Getter
    @Setter
    @AllArgsConstructor
    static public class RequestPage {
        private Optional<String> reservationDate;
        private Optional<String> roomId;
        //private List<ReservationInfo> reservationInfo = new ArrayList<>();
    }

    @Getter
    @AllArgsConstructor
    static public class ReservationInfo {
        private String reservationDate;
        private String usedBeginTime;
        private String usedEndTime;
    }
}
