package education.p0004.common.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2020-09-02T22:24:38.001+0900")
public class RoomInfoDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements education.p0004.common.dao.RoomInfoDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.RoomInfoDao.class, "selectByRoomNo", java.lang.String.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public RoomInfoDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public education.p0004.common.entity.RoomInfo selectByRoomNo(java.lang.String roomNo) {
        entering("education.p0004.common.dao.RoomInfoDaoImpl", "selectByRoomNo", roomNo);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/education/p0004/common/dao/RoomInfoDao/selectByRoomNo.sql");
            __query.setEntityType(education.p0004.common.entity._RoomInfo.getSingletonInternal());
            __query.addParameter("roomNo", java.lang.String.class, roomNo);
            __query.setCallerClassName("education.p0004.common.dao.RoomInfoDaoImpl");
            __query.setCallerMethodName("selectByRoomNo");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<education.p0004.common.entity.RoomInfo> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<education.p0004.common.entity.RoomInfo>(education.p0004.common.entity._RoomInfo.getSingletonInternal()));
            education.p0004.common.entity.RoomInfo __result = __command.execute();
            __query.complete();
            exiting("education.p0004.common.dao.RoomInfoDaoImpl", "selectByRoomNo", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.RoomInfoDaoImpl", "selectByRoomNo", __e);
            throw __e;
        }
    }

}
