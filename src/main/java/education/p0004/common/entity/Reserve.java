package education.p0004.common.entity;

import lombok.Data;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Table(name = "reserve_tbl")
@Data
public class Reserve {
    @Id
    @Column(name = "id")
    String id;

    @Column(name = "user_id")
    String user_id;

    @Column(name = "room_id")
    String room_id;

    @Column(name = "used_begin_time")
    String used_begin_time;

    @Column(name = "used_end_time")
    String used_end_time;
}
