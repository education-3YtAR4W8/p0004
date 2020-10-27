package education.p0004.common.entity;

import lombok.Data;
import org.seasar.doma.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reserve_tbl")
public class Reserve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reserve_id")
    public Integer reserveId;

    @Column(name = "user_id")
    public String userId;

    @Column(name = "room_id")
    public String roomId;

    @Column(name = "begin_datetime")
    public LocalDateTime beginDatetime;

    @Column(name = "end_datetime")
    public LocalDateTime endDatetime;
}
