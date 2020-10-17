package education.p0004.common.dao;

import education.p0004.common.entity.Reserve;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface ReserveDao {
    @Select
    List<Reserve> selectAllSortedWithReservationDate(String roomId);
}
