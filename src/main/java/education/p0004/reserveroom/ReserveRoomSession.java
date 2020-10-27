package education.p0004.reserveroom;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ReserveRoomSession implements Serializable {
    private static final long serialVersionUID = 1L;

    public String loginUserId;
}
