package education.p0004.common.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2020-10-11T16:46:30.777+0900")
public final class _Room extends org.seasar.doma.jdbc.entity.AbstractEntityType<education.p0004.common.entity.Room> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _Room __singleton = new _Room();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the id */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, education.p0004.common.entity.Room, java.lang.String, Object> $id = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(education.p0004.common.entity.Room.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "id", "id", __namingType, false);

    /** the name */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, education.p0004.common.entity.Room, java.lang.String, Object> $name = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(education.p0004.common.entity.Room.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "name", "name", __namingType, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<education.p0004.common.entity.Room>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Room, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Room, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Room, ?>> __entityPropertyTypeMap;

    private _Room() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Room";
        __catalogName = "";
        __schemaName = "";
        __tableName = "room_tbl";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Room, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Room, ?>> __list = new java.util.ArrayList<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Room, ?>> __map = new java.util.HashMap<>(2);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __idList.add($name);
        __list.add($name);
        __map.put("name", $name);
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
    public void preInsert(education.p0004.common.entity.Room entity, org.seasar.doma.jdbc.entity.PreInsertContext<education.p0004.common.entity.Room> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(education.p0004.common.entity.Room entity, org.seasar.doma.jdbc.entity.PreUpdateContext<education.p0004.common.entity.Room> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(education.p0004.common.entity.Room entity, org.seasar.doma.jdbc.entity.PreDeleteContext<education.p0004.common.entity.Room> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(education.p0004.common.entity.Room entity, org.seasar.doma.jdbc.entity.PostInsertContext<education.p0004.common.entity.Room> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(education.p0004.common.entity.Room entity, org.seasar.doma.jdbc.entity.PostUpdateContext<education.p0004.common.entity.Room> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(education.p0004.common.entity.Room entity, org.seasar.doma.jdbc.entity.PostDeleteContext<education.p0004.common.entity.Room> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Room, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Room, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<education.p0004.common.entity.Room, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, education.p0004.common.entity.Room, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, education.p0004.common.entity.Room, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public education.p0004.common.entity.Room newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<education.p0004.common.entity.Room, ?>> __args) {
        education.p0004.common.entity.Room entity = new education.p0004.common.entity.Room();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("name") != null) __args.get("name").save(entity);
        return entity;
    }

    @Override
    public Class<education.p0004.common.entity.Room> getEntityClass() {
        return education.p0004.common.entity.Room.class;
    }

    @Override
    public education.p0004.common.entity.Room getOriginalStates(education.p0004.common.entity.Room __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(education.p0004.common.entity.Room __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Room getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Room newInstance() {
        return new _Room();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<education.p0004.common.entity.Room> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
