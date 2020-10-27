package education.p0004.common.dao;

import education.p0004.common.entity.Reserve;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Dao
@ConfigAutowireable
public interface ReserveDao {
    @Select
    List<Reserve> selectByRoomIdAndDispDate(String roomId, LocalDate dispDate);

    @Select
    List<Reserve> selectByRoomIdAndBeginAndEndDatetime(String roomId, LocalDateTime begin, LocalDateTime end);

    @Insert
    int insert(Reserve reserve);
}
