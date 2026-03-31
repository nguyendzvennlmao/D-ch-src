package com.kammoun.utils.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotation
public @interface JsonTypeInfo {

    public enum As {
        PROPERTY,
        WRAPPER_OBJECT,
        WRAPPER_ARRAY,
        EXTERNAL_PROPERTY,
        EXISTING_PROPERTY
    }

    public enum Id {
        NONE(null),
        CLASS("@class"),
        MINIMAL_CLASS("@c"),
        NAME("@type"),
        SIMPLE_NAME("@type"),
        DEDUCTION(null),
        CUSTOM(null);

        private final String _defaultPropertyName;

        Id(String str) {
            this._defaultPropertyName = str;
        }

        public String getDefaultPropertyName() {
            return this._defaultPropertyName;
        }
    }

    @Deprecated
    public static abstract class None {
    }

    public static class Value implements JacksonAnnotationValue<JsonTypeInfo>, Serializable {
        private static final long serialVersionUID = 1;
        protected static final Value EMPTY = new Value(Id.NONE, As.PROPERTY, null, null, false, null);
        protected final Id _idType;
        protected final As _inclusionType;
        protected final String _propertyName;
        protected final Class<?> _defaultImpl;
        protected final boolean _idVisible;
        protected final Boolean _requireTypeIdForSubtypes;

        protected Value(Id id, As as, String str, Class<?> cls, boolean z, Boolean bool) {
            this._defaultImpl = cls;
            this._idType = id;
            this._inclusionType = as;
            this._propertyName = str;
            this._idVisible = z;
            this._requireTypeIdForSubtypes = bool;
        }

        public static Value construct(Id id, As as, String str, Class<?> cls, boolean z, Boolean bool) {
            if (str == null || str.isEmpty()) {
                str = id != null ? id.getDefaultPropertyName() : JsonProperty.USE_DEFAULT_NAME;
            }
            if (cls == null || cls.isAnnotation()) {
                cls = null;
            }
            return new Value(id, as, str, cls, z, bool);
        }

        public static Value from(JsonTypeInfo jsonTypeInfo) {
            if (jsonTypeInfo == null) {
                return null;
            }
            return construct(jsonTypeInfo.use(), jsonTypeInfo.include(), jsonTypeInfo.property(), jsonTypeInfo.defaultImpl(), jsonTypeInfo.visible(), jsonTypeInfo.requireTypeIdForSubtypes().asBoolean());
        }

        public Value withDefaultImpl(Class<?> cls) {
            return cls == this._defaultImpl ? this : new Value(this._idType, this._inclusionType, this._propertyName, cls, this._idVisible, this._requireTypeIdForSubtypes);
        }

        public Value withIdType(Id id) {
            return id == this._idType ? this : new Value(id, this._inclusionType, this._propertyName, this._defaultImpl, this._idVisible, this._requireTypeIdForSubtypes);
        }

        public Value withInclusionType(As as) {
            return as == this._inclusionType ? this : new Value(this._idType, as, this._propertyName, this._defaultImpl, this._idVisible, this._requireTypeIdForSubtypes);
        }

        public Value withPropertyName(String str) {
            return str == this._propertyName ? this : new Value(this._idType, this._inclusionType, str, this._defaultImpl, this._idVisible, this._requireTypeIdForSubtypes);
        }

        public Value withIdVisible(boolean z) {
            return z == this._idVisible ? this : new Value(this._idType, this._inclusionType, this._propertyName, this._defaultImpl, z, this._requireTypeIdForSubtypes);
        }

        public Value withRequireTypeIdForSubtypes(Boolean bool) {
            return this._requireTypeIdForSubtypes == bool ? this : new Value(this._idType, this._inclusionType, this._propertyName, this._defaultImpl, this._idVisible, bool);
        }

        @Override
        public Class<JsonTypeInfo> valueFor() {
            return JsonTypeInfo.class;
        }

        public Class<?> getDefaultImpl() {
            return this._defaultImpl;
        }

        public Id getIdType() {
            return this._idType;
        }

        public As getInclusionType() {
            return this._inclusionType;
        }

        public String getPropertyName() {
            return this._propertyName;
        }

        public boolean getIdVisible() {
            return this._idVisible;
        }

        public Boolean getRequireTypeIdForSubtypes() {
            return this._requireTypeIdForSubtypes;
        }

        public static boolean isEnabled(Value value) {
            return (value == null || value._idType == null || value._idType == Id.NONE) ? false : true;
        }

        public String toString() {
            Object[] objArr = new Object[6];
            objArr[0] = this._idType;
            objArr[1] = this._inclusionType;
            objArr[2] = this._propertyName;
            objArr[3] = this._defaultImpl == null ? "NULL" : this._defaultImpl.getName();
            objArr[4] = Boolean.valueOf(this._idVisible);
            objArr[5] = this._requireTypeIdForSubtypes;
            return String.format("JsonTypeInfo.Value(idType=%s,includeAs=%s,propertyName=%s,defaultImpl=%s,idVisible=%s,requireTypeIdForSubtypes=%s)", objArr);
        }

        public int hashCode() {
            return (31 * ((31 * ((31 * ((31 * ((31 * ((31 * 1) + (this._idType != null ? this._idType.hashCode() : 0))) + (this._inclusionType != null ? this._inclusionType.hashCode() : 0))) + (this._propertyName != null ? this._propertyName.hashCode() : 0))) + (this._defaultImpl != null ? this._defaultImpl.hashCode() : 0))) + (this._requireTypeIdForSubtypes.booleanValue() ? 11 : -17))) + (this._idVisible ? 11 : -17);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && obj.getClass() == getClass() && _equals(this, (Value) obj);
        }

        private static boolean _equals(Value value, Value value2) {
            return value._idType == value2._idType && value._inclusionType == value2._inclusionType && value._defaultImpl == value2._defaultImpl && value._idVisible == value2._idVisible && _equal(value._propertyName, value2._propertyName) && _equal(value._requireTypeIdForSubtypes, value2._requireTypeIdForSubtypes);
        }

        private static <T> boolean _equal(T t, T t2) {
            if (t == null) {
                return t2 == null;
            }
            if (t2 == null) {
                return false;
            }
            return t.equals(t2);
        }
    }

    Id use();

    As include() default As.PROPERTY;

    String property() default "";

    Class<?> defaultImpl() default JsonTypeInfo.class;

    boolean visible() default false;

    OptBoolean requireTypeIdForSubtypes() default OptBoolean.DEFAULT;
}
