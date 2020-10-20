package education.p0004.common.entity;

import lombok.Data;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Table(name = "reserve_info_tbl")
@Data
public class ReserveInfo {
    @Id
    @Column(name = "reservation_no")
    String reservationNo;

    @Column(name = "room_no")
    String roomNo;

    @Column(name = "user_id")
    String userId;

    @Column(name = "begin_time")
    int beginTime ;

    @Column(name = "end_time")
    int endTime;

    @Column(name = "reserve_date")
    String reserveDate;
}
