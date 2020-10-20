package education.p0004.common.entity;

import lombok.Data;
import org.seasar.doma.*;
import java.sql.*;


@Entity
@Table(name = "reserve_tbl")
@Data
public class Reserve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "user")
    String user;

    @Column(name = "day")
    Date day;

    @Column(name = "start_time")
    Time startTime;

    @Column(name = "end_time")
    Time endTime;

    @Column(name = "room_number")
    Integer roomNumber;
}
