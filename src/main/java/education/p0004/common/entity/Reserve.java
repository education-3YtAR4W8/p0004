package education.p0004.common.entity;

import lombok.Data;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "reserve_tbl")
@Data
public class Reserve {
    @Id
    @Column(name = "id")
    String id = UUID.randomUUID().toString();

    @Column(name = "room_id")
    String roomId;

    @Column(name = "reservation_date")
    Date reservationDate;

    @Column(name = "user_id")
    String userId;

    @Column(name = "start_time")
    LocalTime start_time;

    @Column(name = "end_time")
    LocalTime end_time;

//    Boolean isLoginUser = false;
}
