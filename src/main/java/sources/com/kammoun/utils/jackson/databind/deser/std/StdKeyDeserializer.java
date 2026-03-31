package com.kammoun.utils.jackson.databind.deser.std;

import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.io.NumberInput;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.DeserializationFeature;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.KeyDeserializer;
import com.kammoun.utils.jackson.databind.annotation.JacksonStdImpl;
import com.kammoun.utils.jackson.databind.cfg.EnumFeature;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMethod;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import com.kammoun.utils.jackson.databind.util.EnumResolver;
import com.kammoun.utils.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@JacksonStdImpl
public class StdKeyDeserializer extends KeyDeserializer implements Serializable {
    private static final long serialVersionUID = 1;
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_BYTE = 2;
    public static final int TYPE_SHORT = 3;
    public static final int TYPE_CHAR = 4;
    public static final int TYPE_INT = 5;
    public static final int TYPE_LONG = 6;
    public static final int TYPE_FLOAT = 7;
    public static final int TYPE_DOUBLE = 8;
    public static final int TYPE_LOCALE = 9;
    public static final int TYPE_DATE = 10;
    public static final int TYPE_CALENDAR = 11;
    public static final int TYPE_UUID = 12;
    public static final int TYPE_URI = 13;
    public static final int TYPE_URL = 14;
    public static final int TYPE_CLASS = 15;
    public static final int TYPE_CURRENCY = 16;
    public static final int TYPE_BYTE_ARRAY = 17;
    protected final int _kind;
    protected final Class<?> _keyClass;
    protected final FromStringDeserializer<?> _deser;

    static final class DelegatingKD extends KeyDeserializer implements Serializable {
        private static final long serialVersionUID = 1;
        protected final Class<?> _keyClass;
        protected final JsonDeserializer<?> _delegate;

        public DelegatingKD(Class<?> cls, JsonDeserializer<?> jsonDeserializer) {
            this._keyClass = cls;
            this._delegate = jsonDeserializer;
        }

        @Override
        public final Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            if (str == null) {
                return null;
            }
            TokenBuffer bufferForInputBuffering = deserializationContext.bufferForInputBuffering();
            bufferForInputBuffering.writeString(str);
            try {
                JsonParser asParser = bufferForInputBuffering.asParser();
                asParser.nextToken();
                Object deserialize = this._delegate.deserialize(asParser, deserializationContext);
                return deserialize != null ? deserialize : deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
            } catch (Exception e) {
                return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation: %s", e.getMessage());
            }
        }

        public Class<?> getKeyClass() {
            return this._keyClass;
        }
    }

    @JacksonStdImpl
    static final class EnumKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        protected final EnumResolver _byNameResolver;
        protected final AnnotatedMethod _factory;
        protected volatile EnumResolver _byToStringResolver;
        protected volatile EnumResolver _byIndexResolver;
        protected final EnumResolver _byEnumNamingResolver;
        protected final Enum<?> _enumDefaultValue;

        public EnumKD(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
            super(-1, enumResolver.getEnumClass());
            this._byNameResolver = enumResolver;
            this._factory = annotatedMethod;
            this._enumDefaultValue = enumResolver.getDefaultValue();
            this._byEnumNamingResolver = null;
            this._byToStringResolver = null;
        }

        public EnumKD(EnumResolver enumResolver, AnnotatedMethod annotatedMethod, EnumResolver enumResolver2, EnumResolver enumResolver3, EnumResolver enumResolver4) {
            super(-1, enumResolver.getEnumClass());
            this._byNameResolver = enumResolver;
            this._factory = annotatedMethod;
            this._enumDefaultValue = enumResolver.getDefaultValue();
            this._byEnumNamingResolver = enumResolver2;
            this._byToStringResolver = enumResolver3;
            this._byIndexResolver = enumResolver4;
        }

        @Override
        public Object _parse(String str, DeserializationContext deserializationContext) throws IOException {
            if (this._factory != null) {
                try {
                    return this._factory.call1(str);
                } catch (Exception e) {
                    ClassUtil.unwrapAndThrowAsIAE(e);
                }
            }
            EnumResolver _resolveCurrentResolver = _resolveCurrentResolver(deserializationContext);
            Enum<?> findEnum = _resolveCurrentResolver.findEnum(str);
            if (findEnum == null && deserializationContext.isEnabled(EnumFeature.READ_ENUM_KEYS_USING_INDEX)) {
                _resolveCurrentResolver = _getIndexResolver(deserializationContext);
                findEnum = _resolveCurrentResolver.findEnum(str);
            }
            if (findEnum == null) {
                if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                    findEnum = this._enumDefaultValue;
                } else if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "not one of the values accepted for Enum class: %s", _resolveCurrentResolver.getEnumIds());
                }
            }
            return findEnum;
        }

        protected EnumResolver _resolveCurrentResolver(DeserializationContext deserializationContext) {
            return this._byEnumNamingResolver != null ? this._byEnumNamingResolver : deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? _getToStringResolver(deserializationContext) : this._byNameResolver;
        }

        @Deprecated
        private EnumResolver _getToStringResolver(DeserializationContext deserializationContext) {
            EnumResolver enumResolver = this._byToStringResolver;
            if (enumResolver == null) {
                synchronized (this) {
                    enumResolver = this._byToStringResolver;
                    if (enumResolver == null) {
                        enumResolver = EnumResolver.constructUsingToString(deserializationContext.getConfig(), this._byNameResolver.getEnumClass());
                        this._byToStringResolver = enumResolver;
                    }
                }
            }
            return enumResolver;
        }

        @Deprecated
        private EnumResolver _getIndexResolver(DeserializationContext deserializationContext) {
            EnumResolver enumResolver = this._byIndexResolver;
            if (enumResolver == null) {
                synchronized (this) {
                    enumResolver = this._byIndexResolver;
                    if (enumResolver == null) {
                        enumResolver = EnumResolver.constructUsingIndex(deserializationContext.getConfig(), this._byNameResolver.getEnumClass());
                        this._byIndexResolver = enumResolver;
                    }
                }
            }
            return enumResolver;
        }
    }

    static final class StringCtorKeyDeserializer extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        protected final Constructor<?> _ctor;

        public StringCtorKeyDeserializer(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this._ctor = constructor;
        }

        @Override
        public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this._ctor.newInstance(str);
        }
    }

    static final class StringFactoryKeyDeserializer extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        final Method _factoryMethod;

        public StringFactoryKeyDeserializer(Method method) {
            super(-1, method.getDeclaringClass());
            this._factoryMethod = method;
        }

        @Override
        public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this._factoryMethod.invoke(null, str);
        }
    }

    @JacksonStdImpl
    static final class StringKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        private static final StringKD sString = new StringKD(String.class);
        private static final StringKD sObject = new StringKD(Object.class);

        private StringKD(Class<?> cls) {
            super(-1, cls);
        }

        public static StringKD forType(Class<?> cls) {
            return cls == String.class ? sString : cls == Object.class ? sObject : new StringKD(cls);
        }

        @Override
        public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            return str;
        }
    }

    protected StdKeyDeserializer(int i, Class<?> cls) {
        this(i, cls, null);
    }

    protected StdKeyDeserializer(int i, Class<?> cls, FromStringDeserializer<?> fromStringDeserializer) {
        this._kind = i;
        this._keyClass = cls;
        this._deser = fromStringDeserializer;
    }

    public static StdKeyDeserializer forType(Class<?> cls) {
        int i;
        if (cls == String.class || cls == Object.class || cls == CharSequence.class || cls == Serializable.class) {
            return StringKD.forType(cls);
        }
        if (cls == UUID.class) {
            i = 12;
        } else if (cls == Integer.class) {
            i = 5;
        } else if (cls == Long.class) {
            i = 6;
        } else if (cls == Date.class) {
            i = 10;
        } else if (cls == Calendar.class) {
            i = 11;
        } else if (cls == Boolean.class) {
            i = 1;
        } else if (cls == Byte.class) {
            i = 2;
        } else if (cls == Character.class) {
            i = 4;
        } else if (cls == Short.class) {
            i = 3;
        } else if (cls == Float.class) {
            i = 7;
        } else if (cls == Double.class) {
            i = 8;
        } else if (cls == URI.class) {
            i = 13;
        } else if (cls == URL.class) {
            i = 14;
        } else if (cls == Class.class) {
            i = 15;
        } else {
            if (cls == Locale.class) {
                return new StdKeyDeserializer(9, cls, FromStringDeserializer.findDeserializer(Locale.class));
            }
            if (cls == Currency.class) {
                return new StdKeyDeserializer(16, cls, FromStringDeserializer.findDeserializer(Currency.class));
            }
            if (cls != byte[].class) {
                return null;
            }
            i = 17;
        }
        return new StdKeyDeserializer(i, cls);
    }

    @Override
    public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
        if (str == null) {
            return null;
        }
        try {
            Object _parse = _parse(str, deserializationContext);
            if (_parse != null) {
                return _parse;
            }
            if (ClassUtil.isEnumType(this._keyClass) && deserializationContext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
        } catch (Exception e) {
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation, problem: (%s) %s", e.getClass().getName(), ClassUtil.exceptionMessage(e));
        }
    }

    public Class<?> getKeyClass() {
        return this._keyClass;
    }

    protected Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
        switch (this._kind) {
            case 1:
                return "true".equals(str) ? Boolean.TRUE : "false".equals(str) ? Boolean.FALSE : deserializationContext.handleWeirdKey(this._keyClass, str, "value not 'true' or 'false'", new Object[0]);
            case 2:
                int _parseInt = _parseInt(str);
                return (_parseInt < -128 || _parseInt > 255) ? deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) _parseInt);
            case 3:
                int _parseInt2 = _parseInt(str);
                return (_parseInt2 < -32768 || _parseInt2 > 32767) ? deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 16-bit value", new Object[0]) : Short.valueOf((short) _parseInt2);
            case 4:
                return str.length() == 1 ? Character.valueOf(str.charAt(0)) : deserializationContext.handleWeirdKey(this._keyClass, str, "can only convert 1-character Strings", new Object[0]);
            case 5:
                return Integer.valueOf(_parseInt(str));
            case 6:
                return Long.valueOf(_parseLong(str));
            case 7:
                return Float.valueOf((float) _parseDouble(str));
            case 8:
                return Double.valueOf(_parseDouble(str));
            case 9:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e) {
                    return _weirdKey(deserializationContext, str, e);
                }
            case 10:
                return deserializationContext.parseDate(str);
            case 11:
                return deserializationContext.constructCalendar(deserializationContext.parseDate(str));
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e2) {
                    return _weirdKey(deserializationContext, str, e2);
                }
            case TYPE_URI:
                try {
                    return URI.create(str);
                } catch (Exception e3) {
                    return _weirdKey(deserializationContext, str, e3);
                }
            case TYPE_URL:
                try {
                    return new URL(str);
                } catch (MalformedURLException e4) {
                    return _weirdKey(deserializationContext, str, e4);
                }
            case TYPE_CLASS:
                try {
                    return deserializationContext.findClass(str);
                } catch (Exception e5) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "unable to parse key as Class", new Object[0]);
                }
            case 16:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e6) {
                    return _weirdKey(deserializationContext, str, e6);
                }
            case TYPE_BYTE_ARRAY:
                try {
                    return deserializationContext.getConfig().getBase64Variant().decode(str);
                } catch (IllegalArgumentException e7) {
                    return _weirdKey(deserializationContext, str, e7);
                }
            default:
                throw new IllegalStateException("Internal error: unknown key type " + this._keyClass);
        }
    }

    protected int _parseInt(String str) throws IllegalArgumentException {
        return NumberInput.parseInt(str);
    }

    protected long _parseLong(String str) throws IllegalArgumentException {
        return NumberInput.parseLong(str);
    }

    protected double _parseDouble(String str) throws IllegalArgumentException {
        return NumberInput.parseDouble(str, false);
    }

    protected Object _weirdKey(DeserializationContext deserializationContext, String str, Exception exc) throws IOException {
        return deserializationContext.handleWeirdKey(this._keyClass, str, "problem: %s", ClassUtil.exceptionMessage(exc));
    }
}
