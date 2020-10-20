package education.p0004.common.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2020-09-09T15:45:30.368+0900")
public class ReserveDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements education.p0004.common.dao.ReserveDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.ReserveDao.class, "reserveSelectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.ReserveDao.class, "reserveSelectByDayAndRoomObySTime", education.p0004.reserveroom.ReserveroomController.ReserveInfo.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.ReserveDao.class, "reserveInsert", education.p0004.common.entity.Reserve.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.ReserveDao.class, "reserveDeleteByDayAndRoom", education.p0004.common.entity.Reserve.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public ReserveDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<education.p0004.common.entity.Reserve> reserveSelectAll() {
        entering("education.p0004.common.dao.ReserveDaoImpl", "reserveSelectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/education/p0004/common/dao/ReserveDao/reserveSelectAll.sql");
            __query.setEntityType(education.p0004.common.entity._Reserve.getSingletonInternal());
            __query.setCallerClassName("education.p0004.common.dao.ReserveDaoImpl");
            __query.setCallerMethodName("reserveSelectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<education.p0004.common.entity.Reserve>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<education.p0004.common.entity.Reserve>(education.p0004.common.entity._Reserve.getSingletonInternal()));
            java.util.List<education.p0004.common.entity.Reserve> __result = __command.execute();
            __query.complete();
            exiting("education.p0004.common.dao.ReserveDaoImpl", "reserveSelectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.ReserveDaoImpl", "reserveSelectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<education.p0004.common.entity.Reserve> reserveSelectByDayAndRoomObySTime(education.p0004.reserveroom.ReserveroomController.ReserveInfo reserveInfo) {
        entering("education.p0004.common.dao.ReserveDaoImpl", "reserveSelectByDayAndRoomObySTime", reserveInfo);
        try {
            if (reserveInfo == null) {
                throw new org.seasar.doma.DomaNullPointerException("reserveInfo");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/education/p0004/common/dao/ReserveDao/reserveSelectByDayAndRoomObySTime.sql");
            __query.setEntityType(education.p0004.common.entity._Reserve.getSingletonInternal());
            __query.addParameter("reserveInfo", education.p0004.reserveroom.ReserveroomController.ReserveInfo.class, reserveInfo);
            __query.setCallerClassName("education.p0004.common.dao.ReserveDaoImpl");
            __query.setCallerMethodName("reserveSelectByDayAndRoomObySTime");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<education.p0004.common.entity.Reserve>> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<education.p0004.common.entity.Reserve>(education.p0004.common.entity._Reserve.getSingletonInternal()));
            java.util.List<education.p0004.common.entity.Reserve> __result = __command.execute();
            __query.complete();
            exiting("education.p0004.common.dao.ReserveDaoImpl", "reserveSelectByDayAndRoomObySTime", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.ReserveDaoImpl", "reserveSelectByDayAndRoomObySTime", __e);
            throw __e;
        }
    }

    @Override
    public int reserveInsert(education.p0004.common.entity.Reserve reserve) {
        entering("education.p0004.common.dao.ReserveDaoImpl", "reserveInsert", reserve);
        try {
            if (reserve == null) {
                throw new org.seasar.doma.DomaNullPointerException("reserve");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<education.p0004.common.entity.Reserve> __query = getQueryImplementors().createAutoInsertQuery(__method2, education.p0004.common.entity._Reserve.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntity(reserve);
            __query.setCallerClassName("education.p0004.common.dao.ReserveDaoImpl");
            __query.setCallerMethodName("reserveInsert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("education.p0004.common.dao.ReserveDaoImpl", "reserveInsert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.ReserveDaoImpl", "reserveInsert", __e);
            throw __e;
        }
    }

    @Override
    public int reserveDeleteByDayAndRoom(education.p0004.common.entity.Reserve reserve) {
        entering("education.p0004.common.dao.ReserveDaoImpl", "reserveDeleteByDayAndRoom", reserve);
        try {
            if (reserve == null) {
                throw new org.seasar.doma.DomaNullPointerException("reserve");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<education.p0004.common.entity.Reserve> __query = getQueryImplementors().createAutoDeleteQuery(__method3, education.p0004.common.entity._Reserve.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(reserve);
            __query.setCallerClassName("education.p0004.common.dao.ReserveDaoImpl");
            __query.setCallerMethodName("reserveDeleteByDayAndRoom");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("education.p0004.common.dao.ReserveDaoImpl", "reserveDeleteByDayAndRoom", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.ReserveDaoImpl", "reserveDeleteByDayAndRoom", __e);
            throw __e;
        }
    }

}
