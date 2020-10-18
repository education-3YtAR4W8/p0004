package education.p0004.common.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2020-09-02T22:24:37.673+0900")
public final class _Reservation extends org.seasar.doma.jdbc.entity.AbstractEntityType<education.p0004.common.entity.Reservation> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _Reservation __singleton = new _Reservation();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<education.p0004.common.entity.Reservation>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reservation, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reservation, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reservation, ?>> __entityPropertyTypeMap;

    private _Reservation() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Reservation";
        __catalogName = "";
        __schemaName = "";
        __tableName = "reservation_tbl";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reservation, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reservation, ?>> __list = new java.util.ArrayList<>(0);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reservation, ?>> __map = new java.util.HashMap<>(0);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(education.p0004.common.entity.Reservation entity, org.seasar.doma.jdbc.entity.PreInsertContext<education.p0004.common.entity.Reservation> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(education.p0004.common.entity.Reservation entity, org.seasar.doma.jdbc.entity.PreUpdateContext<education.p0004.common.entity.Reservation> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(education.p0004.common.entity.Reservation entity, org.seasar.doma.jdbc.entity.PreDeleteContext<education.p0004.common.entity.Reservation> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(education.p0004.common.entity.Reservation entity, org.seasar.doma.jdbc.entity.PostInsertContext<education.p0004.common.entity.Reservation> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(education.p0004.common.entity.Reservation entity, org.seasar.doma.jdbc.entity.PostUpdateContext<education.p0004.common.entity.Reservation> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(education.p0004.common.entity.Reservation entity, org.seasar.doma.jdbc.entity.PostDeleteContext<education.p0004.common.entity.Reservation> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reservation, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reservation, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reservation, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, education.p0004.common.entity.Reservation, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, education.p0004.common.entity.Reservation, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public education.p0004.common.entity.Reservation newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<education.p0004.common.entity.Reservation, ?>> __args) {
        education.p0004.common.entity.Reservation entity = new education.p0004.common.entity.Reservation();
        return entity;
    }

    @Override
    public Class<education.p0004.common.entity.Reservation> getEntityClass() {
        return education.p0004.common.entity.Reservation.class;
    }

    @Override
    public education.p0004.common.entity.Reservation getOriginalStates(education.p0004.common.entity.Reservation __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(education.p0004.common.entity.Reservation __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Reservation getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Reservation newInstance() {
        return new _Reservation();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<education.p0004.common.entity.Reservation> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
