package education.p0004.common.dao;

import education.p0004.common.entity.ReserveInfo;
import org.seasar.doma.*;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface ReserveInfoDao {
    @Select
    List<ReserveInfo> selectByRoomNoAndDateOrderByBeginTime(String roomNo, String reserveDate);

    @Select
    ReserveInfo selectByReservationNo(String reservationNo);

    @Select
    List<ReserveInfo> selectOverlappingReserveByBeginAndEndTime (int beginTime, int endTime,
                                                                 String roomNo, String reserveDate);

    @Insert
    int insertReserveInfo(ReserveInfo reserveInfo);

    @Delete
    int deleteReservationBasedOnReservationNo(ReserveInfo reserveInfo);


}
