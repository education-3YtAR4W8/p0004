package education.p0004.common.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2020-09-09T15:45:30.138+0900")
public final class _Reserve extends org.seasar.doma.jdbc.entity.AbstractEntityType<education.p0004.common.entity.Reserve> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _Reserve __singleton = new _Reserve();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, education.p0004.common.entity.Reserve, java.lang.Integer, Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(education.p0004.common.entity.Reserve.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "id", "id", __namingType, false, __idGenerator);

    /** the user */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.Reserve, java.lang.String, Object> $user = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.Reserve.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "user", "user", __namingType, true, true, false);

    /** the day */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.Reserve, java.sql.Date, Object> $day = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.Reserve.class, java.sql.Date.class, java.sql.Date.class, () -> new org.seasar.doma.wrapper.DateWrapper(), null, null, "day", "day", __namingType, true, true, false);

    /** the startTime */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.Reserve, java.sql.Time, Object> $startTime = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.Reserve.class, java.sql.Time.class, java.sql.Time.class, () -> new org.seasar.doma.wrapper.TimeWrapper(), null, null, "startTime", "start_time", __namingType, true, true, false);

    /** the endTime */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.Reserve, java.sql.Time, Object> $endTime = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.Reserve.class, java.sql.Time.class, java.sql.Time.class, () -> new org.seasar.doma.wrapper.TimeWrapper(), null, null, "endTime", "end_time", __namingType, true, true, false);

    /** the roomNumber */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.Reserve, java.lang.Integer, Object> $roomNumber = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.Reserve.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "roomNumber", "room_number", __namingType, true, true, false);

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
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reserve, ?>> __list = new java.util.ArrayList<>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Reserve, ?>> __map = new java.util.HashMap<>(6);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($user);
        __map.put("user", $user);
        __list.add($day);
        __map.put("day", $day);
        __list.add($startTime);
        __map.put("startTime", $startTime);
        __list.add($endTime);
        __map.put("endTime", $endTime);
        __list.add($roomNumber);
        __map.put("roomNumber", $roomNumber);
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
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, education.p0004.common.entity.Reserve, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public education.p0004.common.entity.Reserve newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<education.p0004.common.entity.Reserve, ?>> __args) {
        education.p0004.common.entity.Reserve entity = new education.p0004.common.entity.Reserve();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("user") != null) __args.get("user").save(entity);
        if (__args.get("day") != null) __args.get("day").save(entity);
        if (__args.get("startTime") != null) __args.get("startTime").save(entity);
        if (__args.get("endTime") != null) __args.get("endTime").save(entity);
        if (__args.get("roomNumber") != null) __args.get("roomNumber").save(entity);
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
