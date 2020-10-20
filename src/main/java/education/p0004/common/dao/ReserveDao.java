package education.p0004.common.dao;

import education.p0004.common.entity.Reserve;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Dao
@ConfigAutowireable
public interface ReserveDao {
    @Select
    List<Reserve> selectByRoomIdAndReservationDateOrderByStartTime(String roomId, Date reservationDate);

    @Select
    Integer selectExistsReserveByTime(Reserve reserve);

    @Insert
    int insert(Reserve reserve);

    @Delete(sqlFile = true)
    int delete(String roomId, Date reservationDate, LocalTime startTime);
}
