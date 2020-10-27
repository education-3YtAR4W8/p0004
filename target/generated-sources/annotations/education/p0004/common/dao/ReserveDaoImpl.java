package education.p0004.common.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2020-10-07T21:51:51.868+0900")
public class ReserveDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements education.p0004.common.dao.ReserveDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.ReserveDao.class, "selectByRoomIdAndDispDate", java.lang.String.class, java.time.LocalDate.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.ReserveDao.class, "selectByRoomIdAndBeginAndEndDatetime", java.lang.String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.ReserveDao.class, "insert", education.p0004.common.entity.Reserve.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public ReserveDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<education.p0004.common.entity.Reserve> selectByRoomIdAndDispDate(java.lang.String roomId, java.time.LocalDate dispDate) {
        entering("education.p0004.common.dao.ReserveDaoImpl", "selectByRoomIdAndDispDate", roomId, dispDate);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/education/p0004/common/dao/ReserveDao/selectByRoomIdAndDispDate.sql");
            __query.setEntityType(education.p0004.common.entity._Reserve.getSingletonInternal());
            __query.addParameter("roomId", java.lang.String.class, roomId);
            __query.addParameter("dispDate", java.time.LocalDate.class, dispDate);
            __query.setCallerClassName("education.p0004.common.dao.ReserveDaoImpl");
            __query.setCallerMethodName("selectByRoomIdAndDispDate");
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
            exiting("education.p0004.common.dao.ReserveDaoImpl", "selectByRoomIdAndDispDate", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.ReserveDaoImpl", "selectByRoomIdAndDispDate", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<education.p0004.common.entity.Reserve> selectByRoomIdAndBeginAndEndDatetime(java.lang.String roomId, java.time.LocalDateTime begin, java.time.LocalDateTime end) {
        entering("education.p0004.common.dao.ReserveDaoImpl", "selectByRoomIdAndBeginAndEndDatetime", roomId, begin, end);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/education/p0004/common/dao/ReserveDao/selectByRoomIdAndBeginAndEndDatetime.sql");
            __query.setEntityType(education.p0004.common.entity._Reserve.getSingletonInternal());
            __query.addParameter("roomId", java.lang.String.class, roomId);
            __query.addParameter("begin", java.time.LocalDateTime.class, begin);
            __query.addParameter("end", java.time.LocalDateTime.class, end);
            __query.setCallerClassName("education.p0004.common.dao.ReserveDaoImpl");
            __query.setCallerMethodName("selectByRoomIdAndBeginAndEndDatetime");
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
            exiting("education.p0004.common.dao.ReserveDaoImpl", "selectByRoomIdAndBeginAndEndDatetime", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.ReserveDaoImpl", "selectByRoomIdAndBeginAndEndDatetime", __e);
            throw __e;
        }
    }

    @Override
    public int insert(education.p0004.common.entity.Reserve reserve) {
        entering("education.p0004.common.dao.ReserveDaoImpl", "insert", reserve);
        try {
            if (reserve == null) {
                throw new org.seasar.doma.DomaNullPointerException("reserve");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<education.p0004.common.entity.Reserve> __query = getQueryImplementors().createAutoInsertQuery(__method2, education.p0004.common.entity._Reserve.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntity(reserve);
            __query.setCallerClassName("education.p0004.common.dao.ReserveDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("education.p0004.common.dao.ReserveDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.ReserveDaoImpl", "insert", __e);
            throw __e;
        }
    }

}
