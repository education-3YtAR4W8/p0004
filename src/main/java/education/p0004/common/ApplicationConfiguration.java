package education.p0004.common;

import education.p0004.reservation.ReservationInfoSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class ApplicationConfiguration {
    @Autowired
    ReservationInfoSession reservationInfoSession;

    @EventListener(ApplicationReadyEvent.class)
    public void applicationReadyEvent() {
        reservationInfoSession.loginUserId = "User1";
        reservationInfoSession.resultMsgSuccess = "";
        reservationInfoSession.resultMsgFailed = "";
    }

}
