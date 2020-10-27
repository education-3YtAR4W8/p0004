package education.p0004.common;

import education.p0004.reserveroom.ReserveRoomSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class ApplicationConfiguration {

    @Autowired
    ReserveRoomSession reserveRoomSession;

    @EventListener(ApplicationReadyEvent.class)
    public void applicationReadyEvent() {
        reserveRoomSession.loginUserId = "u1";
    }
}
