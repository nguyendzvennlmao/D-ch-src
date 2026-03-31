package com.kammoun.utils.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotation
public @interface JsonInclude {

    public enum Include {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        CUSTOM,
        USE_DEFAULTS
    }

    public static class Value implements JacksonAnnotationValue<JsonInclude>, Serializable {
        private static final long serialVersionUID = 1;
        protected static final Value EMPTY = new Value(Include.USE_DEFAULTS, Include.USE_DEFAULTS, null, null);
        protected final Include _valueInclusion;
        protected final Include _contentInclusion;
        protected final Class<?> _valueFilter;
        protected final Class<?> _contentFilter;

        public Value(JsonInclude jsonInclude) {
            this(jsonInclude.value(), jsonInclude.content(), jsonInclude.valueFilter(), jsonInclude.contentFilter());
        }

        protected Value(Include include, Include include2, Class<?> cls, Class<?> cls2) {
            this._valueInclusion = include == null ? Include.USE_DEFAULTS : include;
            this._contentInclusion = include2 == null ? Include.USE_DEFAULTS : include2;
            this._valueFilter = cls == Void.class ? null : cls;
            this._contentFilter = cls2 == Void.class ? null : cls2;
        }

        public static Value empty() {
            return EMPTY;
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public static Value mergeAll(Value... valueArr) {
            Value value = null;
            for (Value value2 : valueArr) {
                if (value2 != null) {
                    value = value == null ? value2 : value.withOverrides(value2);
                }
            }
            return value;
        }

        protected Object readResolve() {
            return (this._valueInclusion == Include.USE_DEFAULTS && this._contentInclusion == Include.USE_DEFAULTS && this._valueFilter == null && this._contentFilter == null) ? EMPTY : this;
        }

        public Value withOverrides(Value value) {
            if (value == null || value == EMPTY) {
                return this;
            }
            Include include = value._valueInclusion;
            Include include2 = value._contentInclusion;
            Class<?> cls = value._valueFilter;
            Class<?> cls2 = value._contentFilter;
            boolean z = (include == this._valueInclusion || include == Include.USE_DEFAULTS) ? false : true;
            boolean z2 = (include2 == this._contentInclusion || include2 == Include.USE_DEFAULTS) ? false : true;
            return z ? z2 ? new Value(include, include2, cls, cls2) : new Value(include, this._contentInclusion, cls, cls2) : z2 ? new Value(this._valueInclusion, include2, cls, cls2) : cls != this._valueFilter || cls2 != this._valueFilter ? new Value(this._valueInclusion, this._contentInclusion, cls, cls2) : this;
        }

        public static Value construct(Include include, Include include2) {
            return ((include == Include.USE_DEFAULTS || include == null) && (include2 == Include.USE_DEFAULTS || include2 == null)) ? EMPTY : new Value(include, include2, null, null);
        }

        public static Value construct(Include include, Include include2, Class<?> cls, Class<?> cls2) {
            if (cls == Void.class) {
                cls = null;
            }
            if (cls2 == Void.class) {
                cls2 = null;
            }
            return ((include == Include.USE_DEFAULTS || include == null) && (include2 == Include.USE_DEFAULTS || include2 == null) && cls == null && cls2 == null) ? EMPTY : new Value(include, include2, cls, cls2);
        }

        public static Value from(JsonInclude jsonInclude) {
            if (jsonInclude == null) {
                return EMPTY;
            }
            Include value = jsonInclude.value();
            Include content = jsonInclude.content();
            if (value == Include.USE_DEFAULTS && content == Include.USE_DEFAULTS) {
                return EMPTY;
            }
            Class<?> valueFilter = jsonInclude.valueFilter();
            if (valueFilter == Void.class) {
                valueFilter = null;
            }
            Class<?> contentFilter = jsonInclude.contentFilter();
            if (contentFilter == Void.class) {
                contentFilter = null;
            }
            return new Value(value, content, valueFilter, contentFilter);
        }

        public Value withValueInclusion(Include include) {
            return include == this._valueInclusion ? this : new Value(include, this._contentInclusion, this._valueFilter, this._contentFilter);
        }

        public Value withValueFilter(Class<?> cls) {
            Include include;
            if (cls == null || cls == Void.class) {
                include = Include.USE_DEFAULTS;
                cls = null;
            } else {
                include = Include.CUSTOM;
            }
            return construct(include, this._contentInclusion, cls, this._contentFilter);
        }

        public Value withContentFilter(Class<?> cls) {
            Include include;
            if (cls == null || cls == Void.class) {
                include = Include.USE_DEFAULTS;
                cls = null;
            } else {
                include = Include.CUSTOM;
            }
            return construct(this._valueInclusion, include, this._valueFilter, cls);
        }

        public Value withContentInclusion(Include include) {
            return include == this._contentInclusion ? this : new Value(this._valueInclusion, include, this._valueFilter, this._contentFilter);
        }

        @Override
        public Class<JsonInclude> valueFor() {
            return JsonInclude.class;
        }

        public Include getValueInclusion() {
            return this._valueInclusion;
        }

        public Include getContentInclusion() {
            return this._contentInclusion;
        }

        public Class<?> getValueFilter() {
            return this._valueFilter;
        }

        public Class<?> getContentFilter() {
            return this._contentFilter;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(80);
            sb.append("JsonInclude.Value(value=").append(this._valueInclusion).append(",content=").append(this._contentInclusion);
            if (this._valueFilter != null) {
                sb.append(",valueFilter=").append(this._valueFilter.getName()).append(".class");
            }
            if (this._contentFilter != null) {
                sb.append(",contentFilter=").append(this._contentFilter.getName()).append(".class");
            }
            return sb.append(')').toString();
        }

        public int hashCode() {
            return (this._valueInclusion.hashCode() << 2) + this._contentInclusion.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            return value._valueInclusion == this._valueInclusion && value._contentInclusion == this._contentInclusion && value._valueFilter == this._valueFilter && value._contentFilter == this._contentFilter;
        }
    }

    Include value() default Include.ALWAYS;

    Include content() default Include.ALWAYS;

    Class<?> valueFilter() default Void.class;

    Class<?> contentFilter() default Void.class;
}
