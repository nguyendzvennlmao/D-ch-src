package com.kammoun.utils.jackson.databind.deser.std;

import com.kammoun.utils.jackson.annotation.JsonFormat;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.databind.BeanProperty;
import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.DeserializationFeature;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.MapperFeature;
import com.kammoun.utils.jackson.databind.annotation.JacksonStdImpl;
import com.kammoun.utils.jackson.databind.cfg.CoercionAction;
import com.kammoun.utils.jackson.databind.cfg.CoercionInputShape;
import com.kammoun.utils.jackson.databind.deser.ContextualDeserializer;
import com.kammoun.utils.jackson.databind.deser.SettableBeanProperty;
import com.kammoun.utils.jackson.databind.deser.ValueInstantiator;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMethod;
import com.kammoun.utils.jackson.databind.type.LogicalType;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import com.kammoun.utils.jackson.databind.util.CompactStringObjectMap;
import com.kammoun.utils.jackson.databind.util.EnumResolver;
import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

@JacksonStdImpl
public class EnumDeserializer extends StdScalarDeserializer<Object> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected Object[] _enumsByIndex;
    private final Enum<?> _enumDefaultValue;
    protected final CompactStringObjectMap _lookupByName;
    protected volatile CompactStringObjectMap _lookupByToString;
    protected final Boolean _caseInsensitive;
    private Boolean _useDefaultValueForUnknownEnum;
    private Boolean _useNullForUnknownEnum;
    protected final boolean _isFromIntValue;
    protected final CompactStringObjectMap _lookupByEnumNaming;

    @Deprecated
    public EnumDeserializer(EnumResolver enumResolver, Boolean bool) {
        this(enumResolver, bool.booleanValue(), (EnumResolver) null, (EnumResolver) null);
    }

    @Deprecated
    public EnumDeserializer(EnumResolver enumResolver, boolean z, EnumResolver enumResolver2) {
        super(enumResolver.getEnumClass());
        this._lookupByName = enumResolver.constructLookup();
        this._enumsByIndex = enumResolver.getRawEnums();
        this._enumDefaultValue = enumResolver.getDefaultValue();
        this._caseInsensitive = Boolean.valueOf(z);
        this._isFromIntValue = enumResolver.isFromIntValue();
        this._lookupByEnumNaming = enumResolver2 == null ? null : enumResolver2.constructLookup();
        this._lookupByToString = null;
    }

    public EnumDeserializer(EnumResolver enumResolver, boolean z, EnumResolver enumResolver2, EnumResolver enumResolver3) {
        super(enumResolver.getEnumClass());
        this._lookupByName = enumResolver.constructLookup();
        this._enumsByIndex = enumResolver.getRawEnums();
        this._enumDefaultValue = enumResolver.getDefaultValue();
        this._caseInsensitive = Boolean.valueOf(z);
        this._isFromIntValue = enumResolver.isFromIntValue();
        this._lookupByEnumNaming = enumResolver2 == null ? null : enumResolver2.constructLookup();
        this._lookupByToString = enumResolver3 == null ? null : enumResolver3.constructLookup();
    }

    protected EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool, Boolean bool2, Boolean bool3) {
        super(enumDeserializer);
        this._lookupByName = enumDeserializer._lookupByName;
        this._enumsByIndex = enumDeserializer._enumsByIndex;
        this._enumDefaultValue = enumDeserializer._enumDefaultValue;
        this._caseInsensitive = bool;
        this._isFromIntValue = enumDeserializer._isFromIntValue;
        this._useDefaultValueForUnknownEnum = bool2;
        this._useNullForUnknownEnum = bool3;
        this._lookupByEnumNaming = enumDeserializer._lookupByEnumNaming;
        this._lookupByToString = enumDeserializer._lookupByToString;
    }

    @Deprecated
    protected EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool) {
        this(enumDeserializer, bool, (Boolean) null, (Boolean) null);
    }

    @Deprecated
    public EnumDeserializer(EnumResolver enumResolver) {
        this(enumResolver, (Boolean) null);
    }

    @Deprecated
    public static JsonDeserializer<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) {
        return deserializerForCreator(deserializationConfig, cls, annotatedMethod, null, null);
    }

    public static JsonDeserializer<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod, annotatedMethod.getParameterType(0), valueInstantiator, settableBeanPropertyArr);
    }

    public static JsonDeserializer<?> deserializerForNoArgsCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod);
    }

    public EnumDeserializer withResolved(Boolean bool, Boolean bool2, Boolean bool3) {
        return (Objects.equals(this._caseInsensitive, bool) && Objects.equals(this._useDefaultValueForUnknownEnum, bool2) && Objects.equals(this._useNullForUnknownEnum, bool3)) ? this : new EnumDeserializer(this, bool, bool2, bool3);
    }

    @Deprecated
    public EnumDeserializer withResolved(Boolean bool) {
        return withResolved(bool, this._useDefaultValueForUnknownEnum, this._useNullForUnknownEnum);
    }

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        return withResolved((Boolean) Optional.ofNullable(findFormatFeature(deserializationContext, beanProperty, handledType(), JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)).orElse(this._caseInsensitive), (Boolean) Optional.ofNullable(findFormatFeature(deserializationContext, beanProperty, handledType(), JsonFormat.Feature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)).orElse(this._useDefaultValueForUnknownEnum), (Boolean) Optional.ofNullable(findFormatFeature(deserializationContext, beanProperty, handledType(), JsonFormat.Feature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)).orElse(this._useNullForUnknownEnum));
    }

    @Override
    public boolean isCachable() {
        return true;
    }

    @Override
    public LogicalType logicalType() {
        return LogicalType.Enum;
    }

    @Override
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._enumDefaultValue;
    }

    @Override
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return jsonParser.hasToken(JsonToken.VALUE_STRING) ? _fromString(jsonParser, deserializationContext, jsonParser.getText()) : jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT) ? this._isFromIntValue ? _fromString(jsonParser, deserializationContext, jsonParser.getText()) : _fromInteger(jsonParser, deserializationContext, jsonParser.getIntValue()) : jsonParser.isExpectedStartObjectToken() ? _fromString(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass)) : _deserializeOther(jsonParser, deserializationContext);
    }

    protected java.lang.Object _fromString(com.kammoun.utils.jackson.core.JsonParser r7, com.kammoun.utils.jackson.databind.DeserializationContext r8, java.lang.String r9) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.databind.deser.std.EnumDeserializer._fromString(com.kammoun.utils.jackson.core.JsonParser, com.kammoun.utils.jackson.databind.DeserializationContext, java.lang.String):java.lang.Object");
    }

    private CompactStringObjectMap _resolveCurrentLookup(DeserializationContext deserializationContext) {
        return this._lookupByEnumNaming != null ? this._lookupByEnumNaming : deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? _getToStringLookup(deserializationContext) : this._lookupByName;
    }

    protected Object _fromInteger(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
        CoercionAction findCoercionAction = deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.Integer);
        if (findCoercionAction == CoercionAction.Fail) {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return deserializationContext.handleWeirdNumberValue(_enumClass(), Integer.valueOf(i), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
            }
            _checkCoercionFail(deserializationContext, findCoercionAction, handledType(), Integer.valueOf(i), "Integer value (" + i + ")");
        }
        switch (findCoercionAction) {
            case AsNull:
                return null;
            case AsEmpty:
                return getEmptyValue(deserializationContext);
            case TryConvert:
            default:
                if (i >= 0 && i < this._enumsByIndex.length) {
                    return this._enumsByIndex[i];
                }
                if (useDefaultValueForUnknownEnum(deserializationContext)) {
                    return this._enumDefaultValue;
                }
                if (useNullForUnknownEnum(deserializationContext)) {
                    return null;
                }
                return deserializationContext.handleWeirdNumberValue(_enumClass(), Integer.valueOf(i), "index value outside legal index range [0..%s]", Integer.valueOf(this._enumsByIndex.length - 1));
        }
    }

    private final Object _deserializeAltString(JsonParser jsonParser, DeserializationContext deserializationContext, CompactStringObjectMap compactStringObjectMap, String str) throws IOException {
        char charAt;
        Object findCaseInsensitive;
        String trim = str.trim();
        if (trim.isEmpty()) {
            if (useDefaultValueForUnknownEnum(deserializationContext)) {
                return this._enumDefaultValue;
            }
            if (useNullForUnknownEnum(deserializationContext)) {
                return null;
            }
            switch (str.isEmpty() ? _checkCoercionFail(deserializationContext, _findCoercionFromEmptyString(deserializationContext), handledType(), str, "empty String (\"\")") : _checkCoercionFail(deserializationContext, _findCoercionFromBlankString(deserializationContext), handledType(), str, "blank String (all whitespace)")) {
                case AsNull:
                default:
                    return null;
                case AsEmpty:
                case TryConvert:
                    return getEmptyValue(deserializationContext);
            }
        }
        if (Boolean.TRUE.equals(this._caseInsensitive) && (findCaseInsensitive = compactStringObjectMap.findCaseInsensitive(trim)) != null) {
            return findCaseInsensitive;
        }
        if (!deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS) && !this._isFromIntValue && (charAt = trim.charAt(0)) >= '0' && charAt <= '9' && (charAt != '0' || trim.length() <= 1)) {
            try {
                int parseInt = Integer.parseInt(trim);
                if (!deserializationContext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
                    return deserializationContext.handleWeirdStringValue(_enumClass(), trim, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                }
                if (parseInt >= 0 && parseInt < this._enumsByIndex.length) {
                    return this._enumsByIndex[parseInt];
                }
            } catch (NumberFormatException e) {
            }
        }
        if (useDefaultValueForUnknownEnum(deserializationContext)) {
            return this._enumDefaultValue;
        }
        if (useNullForUnknownEnum(deserializationContext)) {
            return null;
        }
        return deserializationContext.handleWeirdStringValue(_enumClass(), trim, "not one of the values accepted for Enum class: %s", compactStringObjectMap.keys());
    }

    protected Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return jsonParser.hasToken(JsonToken.START_ARRAY) ? _deserializeFromArray(jsonParser, deserializationContext) : deserializationContext.handleUnexpectedToken(_enumClass(), jsonParser);
    }

    protected Class<?> _enumClass() {
        return handledType();
    }

    @Deprecated
    protected CompactStringObjectMap _getToStringLookup(DeserializationContext deserializationContext) {
        CompactStringObjectMap compactStringObjectMap = this._lookupByToString;
        if (compactStringObjectMap == null) {
            synchronized (this) {
                compactStringObjectMap = this._lookupByToString;
                if (compactStringObjectMap == null) {
                    compactStringObjectMap = EnumResolver.constructUsingToString(deserializationContext.getConfig(), _enumClass()).constructLookup();
                    this._lookupByToString = compactStringObjectMap;
                }
            }
        }
        return compactStringObjectMap;
    }

    protected boolean useNullForUnknownEnum(DeserializationContext deserializationContext) {
        return Boolean.TRUE.equals(this._useNullForUnknownEnum) || deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL);
    }

    protected boolean useDefaultValueForUnknownEnum(DeserializationContext deserializationContext) {
        return this._enumDefaultValue != null && (Boolean.TRUE.equals(this._useDefaultValueForUnknownEnum) || deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE));
    }
}
