package com.kammoun.utils.jackson.databind.deser.std;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.util.VersionUtil;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.cfg.CoercionAction;
import com.kammoun.utils.jackson.databind.cfg.CoercionInputShape;
import com.kammoun.utils.jackson.databind.exc.InvalidFormatException;
import com.kammoun.utils.jackson.databind.type.LogicalType;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.IllformedLocaleException;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class FromStringDeserializer<T> extends StdScalarDeserializer<T> {

    public static class Std extends FromStringDeserializer<Object> {
        private static final long serialVersionUID = 1;
        public static final int STD_FILE = 1;
        public static final int STD_URL = 2;
        public static final int STD_URI = 3;
        public static final int STD_CLASS = 4;
        public static final int STD_JAVA_TYPE = 5;
        public static final int STD_CURRENCY = 6;
        public static final int STD_PATTERN = 7;
        public static final int STD_LOCALE = 8;
        public static final int STD_CHARSET = 9;
        public static final int STD_TIME_ZONE = 10;
        public static final int STD_INET_ADDRESS = 11;
        public static final int STD_INET_SOCKET_ADDRESS = 12;
        protected static final String LOCALE_EXT_MARKER = "_#";
        protected final int _kind;

        protected Std(Class<?> cls, int i) {
            super(cls);
            this._kind = i;
        }

        @Override
        protected Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            switch (this._kind) {
                case 1:
                    return new File(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return deserializationContext.findClass(str);
                    } catch (Exception e) {
                        return deserializationContext.handleInstantiationProblem(this._valueClass, str, ClassUtil.getRootCause(e));
                    }
                case 5:
                    return deserializationContext.getTypeFactory().constructFromCanonical(str);
                case 6:
                    try {
                        return Currency.getInstance(str);
                    } catch (IllegalArgumentException e2) {
                        return deserializationContext.handleWeirdStringValue(this._valueClass, str, "Unrecognized currency", new Object[0]);
                    }
                case 7:
                    try {
                        return Pattern.compile(str);
                    } catch (PatternSyntaxException e3) {
                        return deserializationContext.handleWeirdStringValue(this._valueClass, str, "Invalid Pattern, problem: " + e3.getDescription(), new Object[0]);
                    }
                case 8:
                    return _deserializeLocale(str, deserializationContext);
                case 9:
                    return Charset.forName(str);
                case 10:
                    return TimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (!str.startsWith("[")) {
                        int indexOf = str.indexOf(58);
                        if (indexOf < 0 || str.indexOf(58, indexOf + 1) >= 0) {
                            return new InetSocketAddress(str, 0);
                        }
                        return new InetSocketAddress(str.substring(0, indexOf), Integer.parseInt(str.substring(indexOf + 1)));
                    }
                    int lastIndexOf = str.lastIndexOf(93);
                    if (lastIndexOf == -1) {
                        throw new InvalidFormatException(deserializationContext.getParser(), "Bracketed IPv6 address must contain closing bracket", str, (Class<?>) InetSocketAddress.class);
                    }
                    int indexOf2 = str.indexOf(58, lastIndexOf);
                    return new InetSocketAddress(str.substring(0, lastIndexOf + 1), indexOf2 > -1 ? Integer.parseInt(str.substring(indexOf2 + 1)) : 0);
                default:
                    VersionUtil.throwInternal();
                    return null;
            }
        }

        @Override
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            switch (this._kind) {
                case 3:
                    return URI.create(JsonProperty.USE_DEFAULT_NAME);
                case 8:
                    return Locale.ROOT;
                default:
                    return super.getEmptyValue(deserializationContext);
            }
        }

        @Override
        protected Object _deserializeFromEmptyStringDefault(DeserializationContext deserializationContext) throws IOException {
            return getEmptyValue(deserializationContext);
        }

        @Override
        protected boolean _shouldTrim() {
            return this._kind != 7;
        }

        protected int _firstHyphenOrUnderscore(String str) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '_' || charAt == '-') {
                    return i;
                }
            }
            return -1;
        }

        private Locale _deserializeLocale(String str, DeserializationContext deserializationContext) throws IOException {
            int _firstHyphenOrUnderscore = _firstHyphenOrUnderscore(str);
            if (_firstHyphenOrUnderscore < 0) {
                return new Locale(str);
            }
            String substring = str.substring(0, _firstHyphenOrUnderscore);
            String substring2 = str.substring(_firstHyphenOrUnderscore + 1);
            int _firstHyphenOrUnderscore2 = _firstHyphenOrUnderscore(substring2);
            if (_firstHyphenOrUnderscore2 < 0) {
                return new Locale(substring, substring2);
            }
            String substring3 = substring2.substring(0, _firstHyphenOrUnderscore2);
            int indexOf = substring2.indexOf(LOCALE_EXT_MARKER);
            return indexOf < 0 ? new Locale(substring, substring3, substring2.substring(_firstHyphenOrUnderscore2 + 1)) : _deSerializeBCP47Locale(substring2, _firstHyphenOrUnderscore2, substring, substring3, indexOf);
        }

        private Locale _deSerializeBCP47Locale(String str, int i, String str2, String str3, int i2) {
            String str4 = JsonProperty.USE_DEFAULT_NAME;
            if (i2 > 0 && i2 > i) {
                try {
                    str4 = str.substring(i + 1, i2);
                } catch (IllformedLocaleException e) {
                    return new Locale(str2, str3, str4);
                }
            }
            String substring = str.substring(i2 + 2);
            int indexOf = substring.indexOf(95);
            if (indexOf < 0) {
                int indexOf2 = substring.indexOf(45);
                return indexOf2 < 0 ? new Locale.Builder().setLanguage(str2).setRegion(str3).setVariant(str4).setScript(substring).build() : new Locale.Builder().setLanguage(str2).setRegion(str3).setVariant(str4).setExtension(substring.charAt(0), substring.substring(indexOf2 + 1)).build();
            }
            int length = substring.length();
            Locale.Builder script = new Locale.Builder().setLanguage(str2).setRegion(str3).setVariant(str4).setScript(substring.substring(0, indexOf));
            if (indexOf + 1 < length) {
                script = script.setExtension(substring.charAt(indexOf + 1), substring.substring(Math.min(length, indexOf + 3)));
            }
            return script.build();
        }
    }

    public static class StringBufferDeserializer extends FromStringDeserializer<Object> {
        public StringBufferDeserializer() {
            super(StringBuffer.class);
        }

        @Override
        public LogicalType logicalType() {
            return LogicalType.Textual;
        }

        @Override
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return new StringBuffer();
        }

        @Override
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String valueAsString = jsonParser.getValueAsString();
            return valueAsString != null ? _deserialize(valueAsString, deserializationContext) : super.deserialize(jsonParser, deserializationContext);
        }

        @Override
        protected Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            return new StringBuffer(str);
        }
    }

    public static class StringBuilderDeserializer extends FromStringDeserializer<Object> {
        public StringBuilderDeserializer() {
            super(StringBuilder.class);
        }

        @Override
        public LogicalType logicalType() {
            return LogicalType.Textual;
        }

        @Override
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return new StringBuilder();
        }

        @Override
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String valueAsString = jsonParser.getValueAsString();
            return valueAsString != null ? _deserialize(valueAsString, deserializationContext) : super.deserialize(jsonParser, deserializationContext);
        }

        @Override
        protected Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            return new StringBuilder(str);
        }
    }

    public static Class<?>[] types() {
        return new Class[]{File.class, URL.class, URI.class, Class.class, JavaType.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class, StringBuilder.class, StringBuffer.class};
    }

    public FromStringDeserializer(Class<?> cls) {
        super(cls);
    }

    public static FromStringDeserializer<?> findDeserializer(Class<?> cls) {
        int i;
        if (cls == File.class) {
            i = 1;
        } else if (cls == URL.class) {
            i = 2;
        } else if (cls == URI.class) {
            i = 3;
        } else if (cls == Class.class) {
            i = 4;
        } else if (cls == JavaType.class) {
            i = 5;
        } else if (cls == Currency.class) {
            i = 6;
        } else if (cls == Pattern.class) {
            i = 7;
        } else if (cls == Locale.class) {
            i = 8;
        } else if (cls == Charset.class) {
            i = 9;
        } else if (cls == TimeZone.class) {
            i = 10;
        } else if (cls == InetAddress.class) {
            i = 11;
        } else {
            if (cls != InetSocketAddress.class) {
                if (cls == StringBuilder.class) {
                    return new StringBuilderDeserializer();
                }
                if (cls == StringBuffer.class) {
                    return new StringBufferDeserializer();
                }
                return null;
            }
            i = 12;
        }
        return new Std(cls, i);
    }

    @Override
    public LogicalType logicalType() {
        return LogicalType.OtherScalar;
    }

    @Override
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        String valueAsString = jsonParser.getValueAsString();
        if (valueAsString == null) {
            JsonToken currentToken = jsonParser.currentToken();
            if (currentToken != JsonToken.START_OBJECT) {
                return (T) _deserializeFromOther(jsonParser, deserializationContext, currentToken);
            }
            valueAsString = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
        }
        if (valueAsString.isEmpty()) {
            return (T) _deserializeFromEmptyString(deserializationContext);
        }
        if (_shouldTrim()) {
            String str2 = valueAsString;
            valueAsString = valueAsString.trim();
            if (valueAsString != str2 && valueAsString.isEmpty()) {
                return (T) _deserializeFromEmptyString(deserializationContext);
            }
        }
        try {
            return _deserialize(valueAsString, deserializationContext);
        } catch (IllegalArgumentException | MalformedURLException e) {
            str = "not a valid textual representation";
            String message = e.getMessage();
            throw deserializationContext.weirdStringException(valueAsString, this._valueClass, message != null ? str + ", problem: " + message : "not a valid textual representation").withCause(e);
        }
    }

    public abstract T _deserialize(String str, DeserializationContext deserializationContext) throws IOException;

    protected boolean _shouldTrim() {
        return true;
    }

    protected Object _deserializeFromOther(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        if (jsonToken == JsonToken.START_ARRAY) {
            return _deserializeFromArray(jsonParser, deserializationContext);
        }
        if (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT) {
            return deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
        Object embeddedObject = jsonParser.getEmbeddedObject();
        if (embeddedObject == null) {
            return null;
        }
        return this._valueClass.isAssignableFrom(embeddedObject.getClass()) ? embeddedObject : _deserializeEmbedded(embeddedObject, deserializationContext);
    }

    public T _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportInputMismatch(this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this._valueClass.getName());
        return null;
    }

    @Deprecated
    protected final T _deserializeFromEmptyString() throws IOException {
        return null;
    }

    protected Object _deserializeFromEmptyString(DeserializationContext deserializationContext) throws IOException {
        CoercionAction findCoercionAction = deserializationContext.findCoercionAction(logicalType(), this._valueClass, CoercionInputShape.EmptyString);
        if (findCoercionAction == CoercionAction.Fail) {
            deserializationContext.reportInputMismatch(this, "Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", _coercedTypeDesc());
        }
        return findCoercionAction == CoercionAction.AsNull ? getNullValue(deserializationContext) : findCoercionAction == CoercionAction.AsEmpty ? getEmptyValue(deserializationContext) : _deserializeFromEmptyStringDefault(deserializationContext);
    }

    protected Object _deserializeFromEmptyStringDefault(DeserializationContext deserializationContext) throws IOException {
        return getNullValue(deserializationContext);
    }
}
