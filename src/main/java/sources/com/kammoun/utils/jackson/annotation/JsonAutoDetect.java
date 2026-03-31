package com.kammoun.utils.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotation
public @interface JsonAutoDetect {

    public static class Value implements JacksonAnnotationValue<JsonAutoDetect>, Serializable {
        private static final long serialVersionUID = 1;
        private static final Visibility DEFAULT_FIELD_VISIBILITY = Visibility.PUBLIC_ONLY;
        protected static final Value DEFAULT = new Value(DEFAULT_FIELD_VISIBILITY, Visibility.PUBLIC_ONLY, Visibility.PUBLIC_ONLY, Visibility.ANY, Visibility.PUBLIC_ONLY);
        protected static final Value NO_OVERRIDES = new Value(Visibility.DEFAULT, Visibility.DEFAULT, Visibility.DEFAULT, Visibility.DEFAULT, Visibility.DEFAULT);
        protected final Visibility _fieldVisibility;
        protected final Visibility _getterVisibility;
        protected final Visibility _isGetterVisibility;
        protected final Visibility _setterVisibility;
        protected final Visibility _creatorVisibility;

        private Value(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            this._fieldVisibility = visibility;
            this._getterVisibility = visibility2;
            this._isGetterVisibility = visibility3;
            this._setterVisibility = visibility4;
            this._creatorVisibility = visibility5;
        }

        public static Value defaultVisibility() {
            return DEFAULT;
        }

        public static Value noOverrides() {
            return NO_OVERRIDES;
        }

        public static Value from(JsonAutoDetect jsonAutoDetect) {
            return construct(jsonAutoDetect.fieldVisibility(), jsonAutoDetect.getterVisibility(), jsonAutoDetect.isGetterVisibility(), jsonAutoDetect.setterVisibility(), jsonAutoDetect.creatorVisibility());
        }

        public static Value construct(PropertyAccessor propertyAccessor, Visibility visibility) {
            Visibility visibility2 = Visibility.DEFAULT;
            Visibility visibility3 = Visibility.DEFAULT;
            Visibility visibility4 = Visibility.DEFAULT;
            Visibility visibility5 = Visibility.DEFAULT;
            Visibility visibility6 = Visibility.DEFAULT;
            switch (propertyAccessor) {
                case CREATOR:
                    visibility6 = visibility;
                    break;
                case FIELD:
                    visibility2 = visibility;
                    break;
                case GETTER:
                    visibility3 = visibility;
                    break;
                case IS_GETTER:
                    visibility4 = visibility;
                    break;
                case SETTER:
                    visibility5 = visibility;
                    break;
                case ALL:
                    visibility6 = visibility;
                    visibility5 = visibility;
                    visibility4 = visibility;
                    visibility3 = visibility;
                    visibility2 = visibility;
                    break;
            }
            return construct(visibility2, visibility3, visibility4, visibility5, visibility6);
        }

        public static Value construct(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            Value _predefined = _predefined(visibility, visibility2, visibility3, visibility4, visibility5);
            if (_predefined == null) {
                _predefined = new Value(visibility, visibility2, visibility3, visibility4, visibility5);
            }
            return _predefined;
        }

        public Value withFieldVisibility(Visibility visibility) {
            return construct(visibility, this._getterVisibility, this._isGetterVisibility, this._setterVisibility, this._creatorVisibility);
        }

        public Value withGetterVisibility(Visibility visibility) {
            return construct(this._fieldVisibility, visibility, this._isGetterVisibility, this._setterVisibility, this._creatorVisibility);
        }

        public Value withIsGetterVisibility(Visibility visibility) {
            return construct(this._fieldVisibility, this._getterVisibility, visibility, this._setterVisibility, this._creatorVisibility);
        }

        public Value withSetterVisibility(Visibility visibility) {
            return construct(this._fieldVisibility, this._getterVisibility, this._isGetterVisibility, visibility, this._creatorVisibility);
        }

        public Value withCreatorVisibility(Visibility visibility) {
            return construct(this._fieldVisibility, this._getterVisibility, this._isGetterVisibility, this._setterVisibility, visibility);
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public Value withOverrides(Value value) {
            if (value == null || value == NO_OVERRIDES || value == this) {
                return this;
            }
            if (_equals(this, value)) {
                return this;
            }
            Visibility visibility = value._fieldVisibility;
            if (visibility == Visibility.DEFAULT) {
                visibility = this._fieldVisibility;
            }
            Visibility visibility2 = value._getterVisibility;
            if (visibility2 == Visibility.DEFAULT) {
                visibility2 = this._getterVisibility;
            }
            Visibility visibility3 = value._isGetterVisibility;
            if (visibility3 == Visibility.DEFAULT) {
                visibility3 = this._isGetterVisibility;
            }
            Visibility visibility4 = value._setterVisibility;
            if (visibility4 == Visibility.DEFAULT) {
                visibility4 = this._setterVisibility;
            }
            Visibility visibility5 = value._creatorVisibility;
            if (visibility5 == Visibility.DEFAULT) {
                visibility5 = this._creatorVisibility;
            }
            return construct(visibility, visibility2, visibility3, visibility4, visibility5);
        }

        @Override
        public Class<JsonAutoDetect> valueFor() {
            return JsonAutoDetect.class;
        }

        public Visibility getFieldVisibility() {
            return this._fieldVisibility;
        }

        public Visibility getGetterVisibility() {
            return this._getterVisibility;
        }

        public Visibility getIsGetterVisibility() {
            return this._isGetterVisibility;
        }

        public Visibility getSetterVisibility() {
            return this._setterVisibility;
        }

        public Visibility getCreatorVisibility() {
            return this._creatorVisibility;
        }

        protected Object readResolve() {
            Value _predefined = _predefined(this._fieldVisibility, this._getterVisibility, this._isGetterVisibility, this._setterVisibility, this._creatorVisibility);
            return _predefined == null ? this : _predefined;
        }

        public String toString() {
            return String.format("JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)", this._fieldVisibility, this._getterVisibility, this._isGetterVisibility, this._setterVisibility, this._creatorVisibility);
        }

        public int hashCode() {
            return ((1 + this._fieldVisibility.ordinal()) ^ (((3 * this._getterVisibility.ordinal()) - (7 * this._isGetterVisibility.ordinal())) + (11 * this._setterVisibility.ordinal()))) ^ (13 * this._creatorVisibility.ordinal());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && obj.getClass() == getClass() && _equals(this, (Value) obj);
        }

        private static Value _predefined(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            if (visibility == DEFAULT_FIELD_VISIBILITY) {
                if (visibility2 == DEFAULT._getterVisibility && visibility3 == DEFAULT._isGetterVisibility && visibility4 == DEFAULT._setterVisibility && visibility5 == DEFAULT._creatorVisibility) {
                    return DEFAULT;
                }
                return null;
            }
            if (visibility == Visibility.DEFAULT && visibility2 == Visibility.DEFAULT && visibility3 == Visibility.DEFAULT && visibility4 == Visibility.DEFAULT && visibility5 == Visibility.DEFAULT) {
                return NO_OVERRIDES;
            }
            return null;
        }

        private static boolean _equals(Value value, Value value2) {
            return value._fieldVisibility == value2._fieldVisibility && value._getterVisibility == value2._getterVisibility && value._isGetterVisibility == value2._isGetterVisibility && value._setterVisibility == value2._setterVisibility && value._creatorVisibility == value2._creatorVisibility;
        }
    }

    public enum Visibility {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        NONE,
        DEFAULT;

        public boolean isVisible(Member member) {
            switch (this) {
                case ANY:
                    return true;
                case NONE:
                    return false;
                case NON_PRIVATE:
                    return !Modifier.isPrivate(member.getModifiers());
                case PROTECTED_AND_PUBLIC:
                    if (Modifier.isProtected(member.getModifiers())) {
                        return true;
                    }
                    break;
                case PUBLIC_ONLY:
                    break;
                default:
                    return false;
            }
            return Modifier.isPublic(member.getModifiers());
        }
    }

    Visibility getterVisibility() default Visibility.DEFAULT;

    Visibility isGetterVisibility() default Visibility.DEFAULT;

    Visibility setterVisibility() default Visibility.DEFAULT;

    Visibility creatorVisibility() default Visibility.DEFAULT;

    Visibility fieldVisibility() default Visibility.DEFAULT;
}
