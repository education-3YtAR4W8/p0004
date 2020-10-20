package education.p0004.reservation;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ReservationInfoSession implements Serializable {
    private static final long serialVersionUID = 1L;

    public String loginUserId;
    public String reservationDate;
    public String roomNo;
    public String resultMsgSuccess;
    public String resultMsgFailed;
}
