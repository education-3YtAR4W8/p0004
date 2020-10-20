package education.p0004.common.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2020-09-27T22:37:47.823+0900")
public final class _ReserveInfo extends org.seasar.doma.jdbc.entity.AbstractEntityType<education.p0004.common.entity.ReserveInfo> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _ReserveInfo __singleton = new _ReserveInfo();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the reservationNo */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, education.p0004.common.entity.ReserveInfo, java.lang.String, Object> $reservationNo = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(education.p0004.common.entity.ReserveInfo.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "reservationNo", "reservation_no", __namingType, false);

    /** the roomNo */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.ReserveInfo, java.lang.String, Object> $roomNo = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.ReserveInfo.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "roomNo", "room_no", __namingType, true, true, false);

    /** the userId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.ReserveInfo, java.lang.String, Object> $userId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.ReserveInfo.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "userId", "user_id", __namingType, true, true, false);

    /** the beginTime */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.ReserveInfo, java.lang.Integer, Object> $beginTime = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.ReserveInfo.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "beginTime", "begin_time", __namingType, true, true, false);

    /** the endTime */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.ReserveInfo, java.lang.Integer, Object> $endTime = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.ReserveInfo.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "endTime", "end_time", __namingType, true, true, false);

    /** the reserveDate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, education.p0004.common.entity.ReserveInfo, java.lang.String, Object> $reserveDate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(education.p0004.common.entity.ReserveInfo.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "reserveDate", "reserve_date", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<education.p0004.common.entity.ReserveInfo>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.ReserveInfo, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.ReserveInfo, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.ReserveInfo, ?>> __entityPropertyTypeMap;

    private _ReserveInfo() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "ReserveInfo";
        __catalogName = "";
        __schemaName = "";
        __tableName = "reserve_info_tbl";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.ReserveInfo, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.ReserveInfo, ?>> __list = new java.util.ArrayList<>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.ReserveInfo, ?>> __map = new java.util.HashMap<>(6);
        __idList.add($reservationNo);
        __list.add($reservationNo);
        __map.put("reservationNo", $reservationNo);
        __list.add($roomNo);
        __map.put("roomNo", $roomNo);
        __list.add($userId);
        __map.put("userId", $userId);
        __list.add($beginTime);
        __map.put("beginTime", $beginTime);
        __list.add($endTime);
        __map.put("endTime", $endTime);
        __list.add($reserveDate);
        __map.put("reserveDate", $reserveDate);
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
    public void preInsert(education.p0004.common.entity.ReserveInfo entity, org.seasar.doma.jdbc.entity.PreInsertContext<education.p0004.common.entity.ReserveInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(education.p0004.common.entity.ReserveInfo entity, org.seasar.doma.jdbc.entity.PreUpdateContext<education.p0004.common.entity.ReserveInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(education.p0004.common.entity.ReserveInfo entity, org.seasar.doma.jdbc.entity.PreDeleteContext<education.p0004.common.entity.ReserveInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(education.p0004.common.entity.ReserveInfo entity, org.seasar.doma.jdbc.entity.PostInsertContext<education.p0004.common.entity.ReserveInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(education.p0004.common.entity.ReserveInfo entity, org.seasar.doma.jdbc.entity.PostUpdateContext<education.p0004.common.entity.ReserveInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(education.p0004.common.entity.ReserveInfo entity, org.seasar.doma.jdbc.entity.PostDeleteContext<education.p0004.common.entity.ReserveInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.ReserveInfo, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.ReserveInfo, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.ReserveInfo, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, education.p0004.common.entity.ReserveInfo, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, education.p0004.common.entity.ReserveInfo, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public education.p0004.common.entity.ReserveInfo newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<education.p0004.common.entity.ReserveInfo, ?>> __args) {
        education.p0004.common.entity.ReserveInfo entity = new education.p0004.common.entity.ReserveInfo();
        if (__args.get("reservationNo") != null) __args.get("reservationNo").save(entity);
        if (__args.get("roomNo") != null) __args.get("roomNo").save(entity);
        if (__args.get("userId") != null) __args.get("userId").save(entity);
        if (__args.get("beginTime") != null) __args.get("beginTime").save(entity);
        if (__args.get("endTime") != null) __args.get("endTime").save(entity);
        if (__args.get("reserveDate") != null) __args.get("reserveDate").save(entity);
        return entity;
    }

    @Override
    public Class<education.p0004.common.entity.ReserveInfo> getEntityClass() {
        return education.p0004.common.entity.ReserveInfo.class;
    }

    @Override
    public education.p0004.common.entity.ReserveInfo getOriginalStates(education.p0004.common.entity.ReserveInfo __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(education.p0004.common.entity.ReserveInfo __entity) {
    }

    /**
     * @return the singleton
     */
    public static _ReserveInfo getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _ReserveInfo newInstance() {
        return new _ReserveInfo();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<education.p0004.common.entity.ReserveInfo> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
