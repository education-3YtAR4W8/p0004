package education.p0004.common.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2020-10-07T21:51:51.547+0900")
public final class _Reserve extends org.seasar.doma.jdbc.entity.AbstractEntityType<education.p0004.common.entity.Reserve> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _Reserve __singleton = new _Reserve();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the reserveId */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, education.p0004.common.entity.Reserve, java.lang.Integer, Object> $reserveId = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(education.p0004.common.entity.Reserve.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "reserveId", "reserve_id", __namingType, false, __idGenerator);

    /** the userId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.Reserve, java.lang.String, Object> $userId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.Reserve.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "userId", "user_id", __namingType, true, true, false);

    /** the roomId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.Reserve, java.lang.String, Object> $roomId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.Reserve.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "roomId", "room_id", __namingType, true, true, false);

    /** the beginDatetime */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.Reserve, java.time.LocalDateTime, Object> $beginDatetime = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.Reserve.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "beginDatetime", "begin_datetime", __namingType, true, true, false);

    /** the endDatetime */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.Reserve, java.time.LocalDateTime, Object> $endDatetime = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.Reserve.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "endDatetime", "end_datetime", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<education.p0004.common.entity.Reserve>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reserve, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reserve, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reserve, ?>> __entityPropertyTypeMap;

    private _Reserve() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Reserve";
        __catalogName = "";
        __schemaName = "";
        __tableName = "reserve_tbl";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reserve, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reserve, ?>> __list = new java.util.ArrayList<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reserve, ?>> __map = new java.util.HashMap<>(5);
        __idList.add($reserveId);
        __list.add($reserveId);
        __map.put("reserveId", $reserveId);
        __list.add($userId);
        __map.put("userId", $userId);
        __list.add($roomId);
        __map.put("roomId", $roomId);
        __list.add($beginDatetime);
        __map.put("beginDatetime", $beginDatetime);
        __list.add($endDatetime);
        __map.put("endDatetime", $endDatetime);
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
    public void preInsert(education.p0004.common.entity.Reserve entity, org.seasar.doma.jdbc.entity.PreInsertContext<education.p0004.common.entity.Reserve> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(education.p0004.common.entity.Reserve entity, org.seasar.doma.jdbc.entity.PreUpdateContext<education.p0004.common.entity.Reserve> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(education.p0004.common.entity.Reserve entity, org.seasar.doma.jdbc.entity.PreDeleteContext<education.p0004.common.entity.Reserve> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(education.p0004.common.entity.Reserve entity, org.seasar.doma.jdbc.entity.PostInsertContext<education.p0004.common.entity.Reserve> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(education.p0004.common.entity.Reserve entity, org.seasar.doma.jdbc.entity.PostUpdateContext<education.p0004.common.entity.Reserve> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(education.p0004.common.entity.Reserve entity, org.seasar.doma.jdbc.entity.PostDeleteContext<education.p0004.common.entity.Reserve> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reserve, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reserve, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reserve, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, education.p0004.common.entity.Reserve, ?, ?> getGeneratedIdPropertyType() {
        return $reserveId;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, education.p0004.common.entity.Reserve, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public education.p0004.common.entity.Reserve newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<education.p0004.common.entity.Reserve, ?>> __args) {
        education.p0004.common.entity.Reserve entity = new education.p0004.common.entity.Reserve();
        if (__args.get("reserveId") != null) __args.get("reserveId").save(entity);
        if (__args.get("userId") != null) __args.get("userId").save(entity);
        if (__args.get("roomId") != null) __args.get("roomId").save(entity);
        if (__args.get("beginDatetime") != null) __args.get("beginDatetime").save(entity);
        if (__args.get("endDatetime") != null) __args.get("endDatetime").save(entity);
        return entity;
    }

    @Override
    public Class<education.p0004.common.entity.Reserve> getEntityClass() {
        return education.p0004.common.entity.Reserve.class;
    }

    @Override
    public education.p0004.common.entity.Reserve getOriginalStates(education.p0004.common.entity.Reserve __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(education.p0004.common.entity.Reserve __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Reserve getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Reserve newInstance() {
        return new _Reserve();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<education.p0004.common.entity.Reserve> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
