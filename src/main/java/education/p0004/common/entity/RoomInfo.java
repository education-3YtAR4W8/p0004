package education.p0004.common.entity;

import lombok.Data;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Table(name = "room_info_tbl")
@Data
public class RoomInfo {
    @Id
    @Column(name = "room_no")
    String roomNo;

    @Column(name = "reservation_no")
    String reservationNo;
}
