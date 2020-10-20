package education.p0004.common.dao;

import education.p0004.common.entity.Reserve;
import education.p0004.reserveroom.ReserveroomController;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Delete;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface ReserveDao {

    @Select
    List<Reserve> reserveSelectAll();

    @Select
    List<Reserve> reserveSelectByDayAndRoomObySTime(ReserveroomController.ReserveInfo reserveInfo);

    @Insert
    int reserveInsert (Reserve reserve);

    @Delete
    int reserveDeleteByDayAndRoom (Reserve reserve);

}
