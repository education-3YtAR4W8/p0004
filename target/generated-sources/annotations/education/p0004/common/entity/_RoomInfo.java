package education.p0004.common.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2020-09-02T22:30:45.384+0900")
public final class _RoomInfo extends org.seasar.doma.jdbc.entity.AbstractEntityType<education.p0004.common.entity.RoomInfo> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _RoomInfo __singleton = new _RoomInfo();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the roomNo */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, education.p0004.common.entity.RoomInfo, java.lang.String, Object> $roomNo = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(education.p0004.common.entity.RoomInfo.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "roomNo", "room_no", __namingType, false);

    /** the reservationNo */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.RoomInfo, java.lang.String, Object> $reservationNo = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.RoomInfo.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "reservationNo", "reservation_no", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<education.p0004.common.entity.RoomInfo>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.RoomInfo, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.RoomInfo, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.RoomInfo, ?>> __entityPropertyTypeMap;

    private _RoomInfo() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "RoomInfo";
        __catalogName = "";
        __schemaName = "";
        __tableName = "room_info_tbl";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.RoomInfo, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.RoomInfo, ?>> __list = new java.util.ArrayList<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.RoomInfo, ?>> __map = new java.util.HashMap<>(2);
        __idList.add($roomNo);
        __list.add($roomNo);
        __map.put("roomNo", $roomNo);
        __list.add($reservationNo);
        __map.put("reservationNo", $reservationNo);
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
    public void preInsert(education.p0004.common.entity.RoomInfo entity, org.seasar.doma.jdbc.entity.PreInsertContext<education.p0004.common.entity.RoomInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(education.p0004.common.entity.RoomInfo entity, org.seasar.doma.jdbc.entity.PreUpdateContext<education.p0004.common.entity.RoomInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(education.p0004.common.entity.RoomInfo entity, org.seasar.doma.jdbc.entity.PreDeleteContext<education.p0004.common.entity.RoomInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(education.p0004.common.entity.RoomInfo entity, org.seasar.doma.jdbc.entity.PostInsertContext<education.p0004.common.entity.RoomInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(education.p0004.common.entity.RoomInfo entity, org.seasar.doma.jdbc.entity.PostUpdateContext<education.p0004.common.entity.RoomInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(education.p0004.common.entity.RoomInfo entity, org.seasar.doma.jdbc.entity.PostDeleteContext<education.p0004.common.entity.RoomInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.RoomInfo, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.RoomInfo, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.RoomInfo, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, education.p0004.common.entity.RoomInfo, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, education.p0004.common.entity.RoomInfo, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public education.p0004.common.entity.RoomInfo newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<education.p0004.common.entity.RoomInfo, ?>> __args) {
        education.p0004.common.entity.RoomInfo entity = new education.p0004.common.entity.RoomInfo();
        if (__args.get("roomNo") != null) __args.get("roomNo").save(entity);
        if (__args.get("reservationNo") != null) __args.get("reservationNo").save(entity);
        return entity;
    }

    @Override
    public Class<education.p0004.common.entity.RoomInfo> getEntityClass() {
        return education.p0004.common.entity.RoomInfo.class;
    }

    @Override
    public education.p0004.common.entity.RoomInfo getOriginalStates(education.p0004.common.entity.RoomInfo __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(education.p0004.common.entity.RoomInfo __entity) {
    }

    /**
     * @return the singleton
     */
    public static _RoomInfo getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _RoomInfo newInstance() {
        return new _RoomInfo();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<education.p0004.common.entity.RoomInfo> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
