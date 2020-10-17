package education.p0004.common.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2020-10-11T16:46:31.197+0900")
public class UserDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements education.p0004.common.dao.UserDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(education.p0004.common.dao.UserDao.class, "selectAll");

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public UserDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<education.p0004.common.entity.User> selectAll() {
        entering("education.p0004.common.dao.UserDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/education/p0004/common/dao/UserDao/selectAll.sql");
            __query.setEntityType(education.p0004.common.entity._User.getSingletonInternal());
            __query.setCallerClassName("education.p0004.common.dao.UserDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<education.p0004.common.entity.User>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<education.p0004.common.entity.User>(education.p0004.common.entity._User.getSingletonInternal()));
            java.util.List<education.p0004.common.entity.User> __result = __command.execute();
            __query.complete();
            exiting("education.p0004.common.dao.UserDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("education.p0004.common.dao.UserDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

}
