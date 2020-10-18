package education.p0004.common.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2020-10-18T16:17:20.604+0900")
public class ReserveInfoDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements education.p0004.common.dao.ReserveInfoDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.ReserveInfoDao.class, "selectByRoomNoAndDateOrderByBeginTime", java.lang.String.class, java.lang.String.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.ReserveInfoDao.class, "selectByReservationNo", java.lang.String.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.ReserveInfoDao.class, "selectOverlappingReserveByBeginAndEndTime", int.class, int.class, java.lang.String.class, java.lang.String.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.ReserveInfoDao.class, "insertReserveInfo", education.p0004.common.entity.ReserveInfo.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.ReserveInfoDao.class, "deleteReservationBasedOnReservationNo", education.p0004.common.entity.ReserveInfo.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public ReserveInfoDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<education.p0004.common.entity.ReserveInfo> selectByRoomNoAndDateOrderByBeginTime(java.lang.String roomNo, java.lang.String reserveDate) {
        entering("education.p0004.common.dao.ReserveInfoDaoImpl", "selectByRoomNoAndDateOrderByBeginTime", roomNo, reserveDate);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/education/p0004/common/dao/ReserveInfoDao/selectByRoomNoAndDateOrderByBeginTime.sql");
            __query.setEntityType(education.p0004.common.entity._ReserveInfo.getSingletonInternal());
            __query.addParameter("roomNo", java.lang.String.class, roomNo);
            __query.addParameter("reserveDate", java.lang.String.class, reserveDate);
            __query.setCallerClassName("education.p0004.common.dao.ReserveInfoDaoImpl");
            __query.setCallerMethodName("selectByRoomNoAndDateOrderByBeginTime");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<education.p0004.common.entity.ReserveInfo>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<education.p0004.common.entity.ReserveInfo>(education.p0004.common.entity._ReserveInfo.getSingletonInternal()));
            java.util.List<education.p0004.common.entity.ReserveInfo> __result = __command.execute();
            __query.complete();
            exiting("education.p0004.common.dao.ReserveInfoDaoImpl", "selectByRoomNoAndDateOrderByBeginTime", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.ReserveInfoDaoImpl", "selectByRoomNoAndDateOrderByBeginTime", __e);
            throw __e;
        }
    }

    @Override
    public education.p0004.common.entity.ReserveInfo selectByReservationNo(java.lang.String reservationNo) {
        entering("education.p0004.common.dao.ReserveInfoDaoImpl", "selectByReservationNo", reservationNo);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/education/p0004/common/dao/ReserveInfoDao/selectByReservationNo.sql");
            __query.setEntityType(education.p0004.common.entity._ReserveInfo.getSingletonInternal());
            __query.addParameter("reservationNo", java.lang.String.class, reservationNo);
            __query.setCallerClassName("education.p0004.common.dao.ReserveInfoDaoImpl");
            __query.setCallerMethodName("selectByReservationNo");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<education.p0004.common.entity.ReserveInfo> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<education.p0004.common.entity.ReserveInfo>(education.p0004.common.entity._ReserveInfo.getSingletonInternal()));
            education.p0004.common.entity.ReserveInfo __result = __command.execute();
            __query.complete();
            exiting("education.p0004.common.dao.ReserveInfoDaoImpl", "selectByReservationNo", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.ReserveInfoDaoImpl", "selectByReservationNo", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<education.p0004.common.entity.ReserveInfo> selectOverlappingReserveByBeginAndEndTime(int beginTime, int endTime, java.lang.String roomNo, java.lang.String reserveDate) {
        entering("education.p0004.common.dao.ReserveInfoDaoImpl", "selectOverlappingReserveByBeginAndEndTime", beginTime, endTime, roomNo, reserveDate);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/education/p0004/common/dao/ReserveInfoDao/selectOverlappingReserveByBeginAndEndTime.sql");
            __query.setEntityType(education.p0004.common.entity._ReserveInfo.getSingletonInternal());
            __query.addParameter("beginTime", int.class, beginTime);
            __query.addParameter("endTime", int.class, endTime);
            __query.addParameter("roomNo", java.lang.String.class, roomNo);
            __query.addParameter("reserveDate", java.lang.String.class, reserveDate);
            __query.setCallerClassName("education.p0004.common.dao.ReserveInfoDaoImpl");
            __query.setCallerMethodName("selectOverlappingReserveByBeginAndEndTime");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<education.p0004.common.entity.ReserveInfo>> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<education.p0004.common.entity.ReserveInfo>(education.p0004.common.entity._ReserveInfo.getSingletonInternal()));
            java.util.List<education.p0004.common.entity.ReserveInfo> __result = __command.execute();
            __query.complete();
            exiting("education.p0004.common.dao.ReserveInfoDaoImpl", "selectOverlappingReserveByBeginAndEndTime", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.ReserveInfoDaoImpl", "selectOverlappingReserveByBeginAndEndTime", __e);
            throw __e;
        }
    }

    @Override
    public int insertReserveInfo(education.p0004.common.entity.ReserveInfo reserveInfo) {
        entering("education.p0004.common.dao.ReserveInfoDaoImpl", "insertReserveInfo", reserveInfo);
        try {
            if (reserveInfo == null) {
                throw new org.seasar.doma.DomaNullPointerException("reserveInfo");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<education.p0004.common.entity.ReserveInfo> __query = getQueryImplementors().createAutoInsertQuery(__method3, education.p0004.common.entity._ReserveInfo.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(reserveInfo);
            __query.setCallerClassName("education.p0004.common.dao.ReserveInfoDaoImpl");
            __query.setCallerMethodName("insertReserveInfo");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("education.p0004.common.dao.ReserveInfoDaoImpl", "insertReserveInfo", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.ReserveInfoDaoImpl", "insertReserveInfo", __e);
            throw __e;
        }
    }

    @Override
    public int deleteReservationBasedOnReservationNo(education.p0004.common.entity.ReserveInfo reserveInfo) {
        entering("education.p0004.common.dao.ReserveInfoDaoImpl", "deleteReservationBasedOnReservationNo", reserveInfo);
        try {
            if (reserveInfo == null) {
                throw new org.seasar.doma.DomaNullPointerException("reserveInfo");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<education.p0004.common.entity.ReserveInfo> __query = getQueryImplementors().createAutoDeleteQuery(__method4, education.p0004.common.entity._ReserveInfo.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(reserveInfo);
            __query.setCallerClassName("education.p0004.common.dao.ReserveInfoDaoImpl");
            __query.setCallerMethodName("deleteReservationBasedOnReservationNo");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("education.p0004.common.dao.ReserveInfoDaoImpl", "deleteReservationBasedOnReservationNo", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.ReserveInfoDaoImpl", "deleteReservationBasedOnReservationNo", __e);
            throw __e;
        }
    }

}
