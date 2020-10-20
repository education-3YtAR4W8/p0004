package education.p0004;

import education.p0004.common.CommonInformationSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class ApplicationConfiguration {
    @Autowired
    CommonInformationSession commonInformationSession;

    @EventListener(ApplicationReadyEvent.class)
    public void applicationReadyEvent() {
        commonInformationSession.loginUserId = "user1";
    }
}