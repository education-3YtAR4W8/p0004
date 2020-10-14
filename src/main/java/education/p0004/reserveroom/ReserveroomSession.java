package education.p0004.reserveroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
@Scope(value="session", proxyMode= ScopedProxyMode.TARGET_CLASS)
public class ReserveroomSession implements Serializable {
    private static final long serialVersionUID = 1L;

	String dayOfInput;
	Date dayOfDate;
	String roomOfInput;
	Integer roomOfInteger;
	String userOfInput;
	Integer messageId;
	Integer errorId;

}
