package education.p0004.reservation;

import lombok.Data;

import java.io.Serializable;

@Data
public class InputInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    String reservationNo;
    String beginHour;
    String beginMinute;
    String endHour;
    String endMinute;
}
