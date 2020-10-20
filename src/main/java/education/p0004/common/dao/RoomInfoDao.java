package education.p0004.common.dao;

import education.p0004.common.entity.RoomInfo;
import org.seasar.doma.Select;
import org.seasar.doma.Dao;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface RoomInfoDao {
    @Select
    RoomInfo selectByRoomNo(String roomNo);

}
