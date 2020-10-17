package education.p0004.common.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2020-10-12T00:27:12.757+0900")
public class ReserveDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements education.p0004.common.dao.ReserveDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.ReserveDao.class, "selectAllSortedWithReservationDate", java.lang.String.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public ReserveDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<education.p0004.common.entity.Reserve> selectAllSortedWithReservationDate(java.lang.String roomId) {
        entering("education.p0004.common.dao.ReserveDaoImpl", "selectAllSortedWithReservationDate", roomId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/education/p0004/common/dao/ReserveDao/selectAllSortedWithReservationDate.sql");
            __query.setEntityType(education.p0004.common.entity._Reserve.getSingletonInternal());
            __query.addParameter("roomId", java.lang.String.class, roomId);
            __query.setCallerClassName("education.p0004.common.dao.ReserveDaoImpl");
            __query.setCallerMethodName("selectAllSortedWithReservationDate");
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
            exiting("education.p0004.common.dao.ReserveDaoImpl", "selectAllSortedWithReservationDate", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.ReserveDaoImpl", "selectAllSortedWithReservationDate", __e);
            throw __e;
        }
    }

}
