package education.p0004.reserve;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReserveForm {
    private String cmbReserveHourBegin;
    private String cmbReserveMinuteBegin;
    private String cmbReserveHourEnd;
    private String cmbReserveMinuteEnd;
    private String reservationDate;
    private String roomId;
}
