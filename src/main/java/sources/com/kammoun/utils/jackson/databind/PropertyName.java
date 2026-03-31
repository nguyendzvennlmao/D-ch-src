package com.kammoun.utils.jackson.databind;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.core.SerializableString;
import com.kammoun.utils.jackson.core.io.SerializedString;
import com.kammoun.utils.jackson.core.util.InternCache;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.Objects;

public class PropertyName implements Serializable {
    private static final long serialVersionUID = 1;
    private static final String _USE_DEFAULT = "";
    private static final String _NO_NAME = "";
    public static final PropertyName USE_DEFAULT = new PropertyName(JsonProperty.USE_DEFAULT_NAME, null);
    public static final PropertyName NO_NAME = new PropertyName(new String(JsonProperty.USE_DEFAULT_NAME), null);
    protected final String _simpleName;
    protected final String _namespace;
    protected SerializableString _encodedSimple;

    public PropertyName(String str) {
        this(str, null);
    }

    public PropertyName(String str, String str2) {
        this._simpleName = ClassUtil.nonNullString(str);
        this._namespace = str2;
    }

    protected Object readResolve() {
        return (this._namespace == null && (this._simpleName == null || JsonProperty.USE_DEFAULT_NAME.equals(this._simpleName))) ? USE_DEFAULT : this;
    }

    public static PropertyName construct(String str) {
        return (str == null || str.isEmpty()) ? USE_DEFAULT : new PropertyName(InternCache.instance.intern(str), null);
    }

    public static PropertyName construct(String str, String str2) {
        if (str == null) {
            str = JsonProperty.USE_DEFAULT_NAME;
        }
        return (str2 == null && str.isEmpty()) ? USE_DEFAULT : new PropertyName(InternCache.instance.intern(str), str2);
    }

    public static PropertyName merge(PropertyName propertyName, PropertyName propertyName2) {
        if (propertyName == null) {
            return propertyName2;
        }
        if (propertyName2 == null) {
            return propertyName;
        }
        String _nonEmpty = _nonEmpty(propertyName._namespace, propertyName2._namespace);
        String _nonEmpty2 = _nonEmpty(propertyName._simpleName, propertyName2._simpleName);
        return (_nonEmpty == propertyName._namespace && _nonEmpty2 == propertyName._simpleName) ? propertyName : (_nonEmpty == propertyName2._namespace && _nonEmpty2 == propertyName2._simpleName) ? propertyName2 : construct(_nonEmpty2, _nonEmpty);
    }

    private static String _nonEmpty(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 != null && str.isEmpty()) {
            return str2;
        }
        return str;
    }

    public PropertyName internSimpleName() {
        String intern;
        if (!this._simpleName.isEmpty() && (intern = InternCache.instance.intern(this._simpleName)) != this._simpleName) {
            return new PropertyName(intern, this._namespace);
        }
        return this;
    }

    public PropertyName withSimpleName(String str) {
        if (str == null) {
            str = JsonProperty.USE_DEFAULT_NAME;
        }
        return str.equals(this._simpleName) ? this : new PropertyName(str, this._namespace);
    }

    public PropertyName withNamespace(String str) {
        if (str == null) {
            if (this._namespace == null) {
                return this;
            }
        } else if (str.equals(this._namespace)) {
            return this;
        }
        return new PropertyName(this._simpleName, str);
    }

    public String getSimpleName() {
        return this._simpleName;
    }

    public SerializableString simpleAsEncoded(MapperConfig<?> mapperConfig) {
        SerializableString serializableString = this._encodedSimple;
        if (serializableString == null) {
            serializableString = mapperConfig == null ? new SerializedString(this._simpleName) : mapperConfig.compileString(this._simpleName);
            this._encodedSimple = serializableString;
        }
        return serializableString;
    }

    public String getNamespace() {
        return this._namespace;
    }

    public boolean hasSimpleName() {
        return !this._simpleName.isEmpty();
    }

    public boolean hasSimpleName(String str) {
        return this._simpleName.equals(str);
    }

    public boolean hasNamespace() {
        return this._namespace != null;
    }

    public boolean isEmpty() {
        return this._namespace == null && this._simpleName.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        PropertyName propertyName = (PropertyName) obj;
        if (this._simpleName == null) {
            if (propertyName._simpleName != null) {
                return false;
            }
        } else if (!this._simpleName.equals(propertyName._simpleName)) {
            return false;
        }
        return this._namespace == null ? null == propertyName._namespace : this._namespace.equals(propertyName._namespace);
    }

    public int hashCode() {
        return (Objects.hashCode(this._simpleName) * 31) + Objects.hashCode(this._namespace);
    }

    public String toString() {
        return this._namespace == null ? this._simpleName : "{" + this._namespace + "}" + this._simpleName;
    }
}
