package com.kammoun.utils.jackson.databind.deser.std;

import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.StreamReadFeature;
import com.kammoun.utils.jackson.core.io.NumberInput;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.DeserializationFeature;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.annotation.JacksonStdImpl;
import com.kammoun.utils.jackson.databind.cfg.CoercionAction;
import com.kammoun.utils.jackson.databind.cfg.CoercionInputShape;
import com.kammoun.utils.jackson.databind.jsontype.TypeDeserializer;
import com.kammoun.utils.jackson.databind.type.LogicalType;
import com.kammoun.utils.jackson.databind.util.AccessPattern;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

public class NumberDeserializers {
    private static final HashSet<String> _classNames = new HashSet<>();

    @JacksonStdImpl
    public static class BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
        public static final BigDecimalDeserializer instance = new BigDecimalDeserializer();

        public BigDecimalDeserializer() {
            super((Class<?>) BigDecimal.class);
        }

        @Override
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigDecimal.ZERO;
        }

        @Override
        public final LogicalType logicalType() {
            return LogicalType.Float;
        }

        @Override
        public java.math.BigDecimal deserialize(com.kammoun.utils.jackson.core.JsonParser r7, com.kammoun.utils.jackson.databind.DeserializationContext r8) throws java.io.IOException {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer.deserialize(com.kammoun.utils.jackson.core.JsonParser, com.kammoun.utils.jackson.databind.DeserializationContext):java.math.BigDecimal");
        }
    }

    @JacksonStdImpl
    public static class BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
        public static final BigIntegerDeserializer instance = new BigIntegerDeserializer();

        public BigIntegerDeserializer() {
            super((Class<?>) BigInteger.class);
        }

        @Override
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigInteger.ZERO;
        }

        @Override
        public final LogicalType logicalType() {
            return LogicalType.Integer;
        }

        @Override
        public BigInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String extractScalarFromObject;
            if (jsonParser.isExpectedNumberIntToken()) {
                return jsonParser.getBigIntegerValue();
            }
            switch (jsonParser.currentTokenId()) {
                case 1:
                    extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
                    break;
                case 2:
                case 4:
                case 5:
                case 7:
                default:
                    return (BigInteger) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                case 3:
                    return _deserializeFromArray(jsonParser, deserializationContext);
                case 6:
                    extractScalarFromObject = jsonParser.getText();
                    break;
                case 8:
                    CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                    if (_checkFloatToIntCoercion == CoercionAction.AsNull) {
                        return getNullValue(deserializationContext);
                    }
                    if (_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                        return (BigInteger) getEmptyValue(deserializationContext);
                    }
                    BigDecimal decimalValue = jsonParser.getDecimalValue();
                    jsonParser.streamReadConstraints().validateBigIntegerScale(decimalValue.scale());
                    return decimalValue.toBigInteger();
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (BigInteger) getEmptyValue(deserializationContext);
            }
            String trim = extractScalarFromObject.trim();
            if (_hasTextualNull(trim)) {
                return getNullValue(deserializationContext);
            }
            if (_isIntNumber(trim)) {
                jsonParser.streamReadConstraints().validateIntegerLength(trim.length());
                try {
                    return NumberInput.parseBigInteger(trim, jsonParser.isEnabled(StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER));
                } catch (IllegalArgumentException e) {
                }
            }
            return (BigInteger) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid representation", new Object[0]);
        }
    }

    @JacksonStdImpl
    public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer<Boolean> {
        private static final long serialVersionUID = 1;
        static final BooleanDeserializer primitiveInstance = new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
        static final BooleanDeserializer wrapperInstance = new BooleanDeserializer(Boolean.class, null);

        public BooleanDeserializer(Class<Boolean> cls, Boolean bool) {
            super(cls, LogicalType.Boolean, bool, Boolean.FALSE);
        }

        @Override
        public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken currentToken = jsonParser.currentToken();
            return currentToken == JsonToken.VALUE_TRUE ? Boolean.TRUE : currentToken == JsonToken.VALUE_FALSE ? Boolean.FALSE : this._primitive ? Boolean.valueOf(_parseBooleanPrimitive(jsonParser, deserializationContext)) : _parseBoolean(jsonParser, deserializationContext, this._valueClass);
        }

        @Override
        public Boolean deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            JsonToken currentToken = jsonParser.currentToken();
            return currentToken == JsonToken.VALUE_TRUE ? Boolean.TRUE : currentToken == JsonToken.VALUE_FALSE ? Boolean.FALSE : this._primitive ? Boolean.valueOf(_parseBooleanPrimitive(jsonParser, deserializationContext)) : _parseBoolean(jsonParser, deserializationContext, this._valueClass);
        }

        @Override
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override
        public AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @JacksonStdImpl
    public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer<Byte> {
        private static final long serialVersionUID = 1;
        static final ByteDeserializer primitiveInstance = new ByteDeserializer(Byte.TYPE, (byte) 0);
        static final ByteDeserializer wrapperInstance = new ByteDeserializer(Byte.class, null);

        public ByteDeserializer(Class<Byte> cls, Byte b) {
            super(cls, LogicalType.Integer, b, (byte) 0);
        }

        @Override
        public Byte deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.isExpectedNumberIntToken() ? Byte.valueOf(jsonParser.getByteValue()) : this._primitive ? Byte.valueOf(_parseBytePrimitive(jsonParser, deserializationContext)) : _parseByte(jsonParser, deserializationContext);
        }

        protected Byte _parseByte(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String extractScalarFromObject;
            switch (jsonParser.currentTokenId()) {
                case 1:
                    extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
                    break;
                case 2:
                case 4:
                case 5:
                case 9:
                case 10:
                default:
                    return (Byte) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                case 3:
                    return _deserializeFromArray(jsonParser, deserializationContext);
                case 6:
                    extractScalarFromObject = jsonParser.getText();
                    break;
                case 7:
                    return Byte.valueOf(jsonParser.getByteValue());
                case 8:
                    CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                    return _checkFloatToIntCoercion == CoercionAction.AsNull ? getNullValue(deserializationContext) : _checkFloatToIntCoercion == CoercionAction.AsEmpty ? (Byte) getEmptyValue(deserializationContext) : Byte.valueOf(jsonParser.getByteValue());
                case 11:
                    return getNullValue(deserializationContext);
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Byte) getEmptyValue(deserializationContext);
            }
            String trim = extractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, trim)) {
                return getNullValue(deserializationContext);
            }
            try {
                int parseInt = NumberInput.parseInt(trim);
                return _byteOverflow(parseInt) ? (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "overflow, value cannot be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) parseInt);
            } catch (IllegalArgumentException e) {
                return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid Byte value", new Object[0]);
            }
        }

        @Override
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override
        public AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @JacksonStdImpl
    public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer<Character> {
        private static final long serialVersionUID = 1;
        static final CharacterDeserializer primitiveInstance = new CharacterDeserializer(Character.TYPE, 0);
        static final CharacterDeserializer wrapperInstance = new CharacterDeserializer(Character.class, null);

        public CharacterDeserializer(Class<Character> cls, Character ch) {
            super(cls, LogicalType.Integer, ch, (char) 0);
        }

        @Override
        public Character deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String extractScalarFromObject;
            switch (jsonParser.currentTokenId()) {
                case 1:
                    extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
                    break;
                case 2:
                case 4:
                case 5:
                case 8:
                case 9:
                case 10:
                default:
                    return (Character) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                case 3:
                    return _deserializeFromArray(jsonParser, deserializationContext);
                case 6:
                    extractScalarFromObject = jsonParser.getText();
                    break;
                case 7:
                    CoercionAction findCoercionAction = deserializationContext.findCoercionAction(logicalType(), this._valueClass, CoercionInputShape.Integer);
                    switch (findCoercionAction) {
                        case Fail:
                            _checkCoercionFail(deserializationContext, findCoercionAction, this._valueClass, jsonParser.getNumberValue(), "Integer value (" + jsonParser.getText() + ")");
                        case AsNull:
                            return getNullValue(deserializationContext);
                        case AsEmpty:
                            return (Character) getEmptyValue(deserializationContext);
                        default:
                            int intValue = jsonParser.getIntValue();
                            return (intValue < 0 || intValue > 65535) ? (Character) deserializationContext.handleWeirdNumberValue(handledType(), Integer.valueOf(intValue), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]) : Character.valueOf((char) intValue);
                    }
                    break;
                case 11:
                    if (this._primitive) {
                        _verifyNullForPrimitive(deserializationContext);
                    }
                    return getNullValue(deserializationContext);
            }
            if (extractScalarFromObject.length() == 1) {
                return Character.valueOf(extractScalarFromObject.charAt(0));
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Character) getEmptyValue(deserializationContext);
            }
            String trim = extractScalarFromObject.trim();
            return _checkTextualNull(deserializationContext, trim) ? getNullValue(deserializationContext) : (Character) deserializationContext.handleWeirdStringValue(handledType(), trim, "Expected either Integer value code or 1-character String", new Object[0]);
        }

        @Override
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override
        public AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @JacksonStdImpl
    public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer<Double> {
        private static final long serialVersionUID = 1;
        static final DoubleDeserializer primitiveInstance = new DoubleDeserializer(Double.TYPE, Double.valueOf(0.0d));
        static final DoubleDeserializer wrapperInstance = new DoubleDeserializer(Double.class, null);

        public DoubleDeserializer(Class<Double> cls, Double d) {
            super(cls, LogicalType.Float, d, Double.valueOf(0.0d));
        }

        @Override
        public Double deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT) ? Double.valueOf(jsonParser.getDoubleValue()) : this._primitive ? Double.valueOf(_parseDoublePrimitive(jsonParser, deserializationContext)) : _parseDouble(jsonParser, deserializationContext);
        }

        @Override
        public Double deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            return jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT) ? Double.valueOf(jsonParser.getDoubleValue()) : this._primitive ? Double.valueOf(_parseDoublePrimitive(jsonParser, deserializationContext)) : _parseDouble(jsonParser, deserializationContext);
        }

        protected final java.lang.Double _parseDouble(com.kammoun.utils.jackson.core.JsonParser r7, com.kammoun.utils.jackson.databind.DeserializationContext r8) throws java.io.IOException {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer._parseDouble(com.kammoun.utils.jackson.core.JsonParser, com.kammoun.utils.jackson.databind.DeserializationContext):java.lang.Double");
        }

        @Override
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override
        public AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @JacksonStdImpl
    public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer<Float> {
        private static final long serialVersionUID = 1;
        static final FloatDeserializer primitiveInstance = new FloatDeserializer(Float.TYPE, Float.valueOf(0.0f));
        static final FloatDeserializer wrapperInstance = new FloatDeserializer(Float.class, null);

        public FloatDeserializer(Class<Float> cls, Float f) {
            super(cls, LogicalType.Float, f, Float.valueOf(0.0f));
        }

        @Override
        public Float deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT) ? Float.valueOf(jsonParser.getFloatValue()) : this._primitive ? Float.valueOf(_parseFloatPrimitive(jsonParser, deserializationContext)) : _parseFloat(jsonParser, deserializationContext);
        }

        protected final java.lang.Float _parseFloat(com.kammoun.utils.jackson.core.JsonParser r7, com.kammoun.utils.jackson.databind.DeserializationContext r8) throws java.io.IOException {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer._parseFloat(com.kammoun.utils.jackson.core.JsonParser, com.kammoun.utils.jackson.databind.DeserializationContext):java.lang.Float");
        }

        @Override
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override
        public AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @JacksonStdImpl
    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer<Integer> {
        private static final long serialVersionUID = 1;
        static final IntegerDeserializer primitiveInstance = new IntegerDeserializer(Integer.TYPE, 0);
        static final IntegerDeserializer wrapperInstance = new IntegerDeserializer(Integer.class, null);

        public IntegerDeserializer(Class<Integer> cls, Integer num) {
            super(cls, LogicalType.Integer, num, 0);
        }

        @Override
        public boolean isCachable() {
            return true;
        }

        @Override
        public Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.isExpectedNumberIntToken() ? Integer.valueOf(jsonParser.getIntValue()) : this._primitive ? Integer.valueOf(_parseIntPrimitive(jsonParser, deserializationContext)) : _parseInteger(jsonParser, deserializationContext, Integer.class);
        }

        @Override
        public Integer deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            return jsonParser.isExpectedNumberIntToken() ? Integer.valueOf(jsonParser.getIntValue()) : this._primitive ? Integer.valueOf(_parseIntPrimitive(jsonParser, deserializationContext)) : _parseInteger(jsonParser, deserializationContext, Integer.class);
        }

        @Override
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override
        public AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @JacksonStdImpl
    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer<Long> {
        private static final long serialVersionUID = 1;
        static final LongDeserializer primitiveInstance = new LongDeserializer(Long.TYPE, 0L);
        static final LongDeserializer wrapperInstance = new LongDeserializer(Long.class, null);

        public LongDeserializer(Class<Long> cls, Long l) {
            super(cls, LogicalType.Integer, l, 0L);
        }

        @Override
        public boolean isCachable() {
            return true;
        }

        @Override
        public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.isExpectedNumberIntToken() ? Long.valueOf(jsonParser.getLongValue()) : this._primitive ? Long.valueOf(_parseLongPrimitive(jsonParser, deserializationContext)) : _parseLong(jsonParser, deserializationContext, Long.class);
        }

        @Override
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override
        public AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    @JacksonStdImpl
    public static class NumberDeserializer extends StdScalarDeserializer<Object> {
        public static final NumberDeserializer instance = new NumberDeserializer();

        public NumberDeserializer() {
            super((Class<?>) Number.class);
        }

        @Override
        public final LogicalType logicalType() {
            return LogicalType.Integer;
        }

        @Override
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String extractScalarFromObject;
            switch (jsonParser.currentTokenId()) {
                case 1:
                    extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
                    break;
                case 2:
                case 4:
                case 5:
                default:
                    return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                case 3:
                    return _deserializeFromArray(jsonParser, deserializationContext);
                case 6:
                    extractScalarFromObject = jsonParser.getText();
                    break;
                case 7:
                    return deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.getNumberValue();
                case 8:
                    return (!deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) || jsonParser.isNaN()) ? jsonParser.getNumberValue() : jsonParser.getDecimalValue();
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return getEmptyValue(deserializationContext);
            }
            String trim = extractScalarFromObject.trim();
            if (_hasTextualNull(trim)) {
                return getNullValue(deserializationContext);
            }
            if (_isPosInf(trim)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            if (_isNegInf(trim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            if (_isNaN(trim)) {
                return Double.valueOf(Double.NaN);
            }
            if (!_isIntNumber(trim)) {
                if (NumberInput.looksLikeValidNumber(trim)) {
                    jsonParser.streamReadConstraints().validateFPLength(trim.length());
                    return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? NumberInput.parseBigDecimal(trim, jsonParser.isEnabled(StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER)) : Double.valueOf(NumberInput.parseDouble(trim, jsonParser.isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
                }
                return deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid number", new Object[0]);
            }
            jsonParser.streamReadConstraints().validateIntegerLength(trim.length());
            if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                return NumberInput.parseBigInteger(trim, jsonParser.isEnabled(StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER));
            }
            long parseLong = NumberInput.parseLong(trim);
            return (deserializationContext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) || parseLong > 2147483647L || parseLong < -2147483648L) ? Long.valueOf(parseLong) : Integer.valueOf((int) parseLong);
        }

        @Override
        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            switch (jsonParser.currentTokenId()) {
                case 6:
                case 7:
                case 8:
                    return deserialize(jsonParser, deserializationContext);
                default:
                    return typeDeserializer.deserializeTypedFromScalar(jsonParser, deserializationContext);
            }
        }
    }

    public static abstract class PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
        private static final long serialVersionUID = 1;
        protected final LogicalType _logicalType;
        protected final T _nullValue;
        protected final T _emptyValue;
        protected final boolean _primitive;

        protected PrimitiveOrWrapperDeserializer(Class<T> cls, LogicalType logicalType, T t, T t2) {
            super((Class<?>) cls);
            this._logicalType = logicalType;
            this._nullValue = t;
            this._emptyValue = t2;
            this._primitive = cls.isPrimitive();
        }

        @Deprecated
        protected PrimitiveOrWrapperDeserializer(Class<T> cls, T t, T t2) {
            this(cls, LogicalType.OtherScalar, t, t2);
        }

        @Override
        public AccessPattern getNullAccessPattern() {
            return this._primitive ? AccessPattern.DYNAMIC : this._nullValue == null ? AccessPattern.ALWAYS_NULL : AccessPattern.CONSTANT;
        }

        @Override
        public final T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
            if (this._primitive && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                deserializationContext.reportInputMismatch(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", ClassUtil.classNameOf(handledType()));
            }
            return this._nullValue;
        }

        @Override
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return this._emptyValue;
        }

        @Override
        public final LogicalType logicalType() {
            return this._logicalType;
        }
    }

    @JacksonStdImpl
    public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer<Short> {
        private static final long serialVersionUID = 1;
        static final ShortDeserializer primitiveInstance = new ShortDeserializer(Short.TYPE, 0);
        static final ShortDeserializer wrapperInstance = new ShortDeserializer(Short.class, null);

        public ShortDeserializer(Class<Short> cls, Short sh) {
            super(cls, LogicalType.Integer, sh, (short) 0);
        }

        @Override
        public Short deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.isExpectedNumberIntToken() ? Short.valueOf(jsonParser.getShortValue()) : this._primitive ? Short.valueOf(_parseShortPrimitive(jsonParser, deserializationContext)) : _parseShort(jsonParser, deserializationContext);
        }

        protected Short _parseShort(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String extractScalarFromObject;
            switch (jsonParser.currentTokenId()) {
                case 1:
                    extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
                    break;
                case 2:
                case 4:
                case 5:
                case 9:
                case 10:
                default:
                    return (Short) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                case 3:
                    return _deserializeFromArray(jsonParser, deserializationContext);
                case 6:
                    extractScalarFromObject = jsonParser.getText();
                    break;
                case 7:
                    return Short.valueOf(jsonParser.getShortValue());
                case 8:
                    CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                    return _checkFloatToIntCoercion == CoercionAction.AsNull ? getNullValue(deserializationContext) : _checkFloatToIntCoercion == CoercionAction.AsEmpty ? (Short) getEmptyValue(deserializationContext) : Short.valueOf(jsonParser.getShortValue());
                case 11:
                    return getNullValue(deserializationContext);
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, extractScalarFromObject);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Short) getEmptyValue(deserializationContext);
            }
            String trim = extractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, trim)) {
                return getNullValue(deserializationContext);
            }
            try {
                int parseInt = NumberInput.parseInt(trim);
                return _shortOverflow(parseInt) ? (Short) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "overflow, value cannot be represented as 16-bit value", new Object[0]) : Short.valueOf((short) parseInt);
            } catch (IllegalArgumentException e) {
                return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid Short value", new Object[0]);
            }
        }

        @Override
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override
        public AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }
    }

    public static JsonDeserializer<?> find(Class<?> cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return IntegerDeserializer.primitiveInstance;
            }
            if (cls == Boolean.TYPE) {
                return BooleanDeserializer.primitiveInstance;
            }
            if (cls == Long.TYPE) {
                return LongDeserializer.primitiveInstance;
            }
            if (cls == Double.TYPE) {
                return DoubleDeserializer.primitiveInstance;
            }
            if (cls == Character.TYPE) {
                return CharacterDeserializer.primitiveInstance;
            }
            if (cls == Byte.TYPE) {
                return ByteDeserializer.primitiveInstance;
            }
            if (cls == Short.TYPE) {
                return ShortDeserializer.primitiveInstance;
            }
            if (cls == Float.TYPE) {
                return FloatDeserializer.primitiveInstance;
            }
            if (cls == Void.TYPE) {
                return NullifyingDeserializer.instance;
            }
        } else {
            if (!_classNames.contains(str)) {
                return null;
            }
            if (cls == Integer.class) {
                return IntegerDeserializer.wrapperInstance;
            }
            if (cls == Boolean.class) {
                return BooleanDeserializer.wrapperInstance;
            }
            if (cls == Long.class) {
                return LongDeserializer.wrapperInstance;
            }
            if (cls == Double.class) {
                return DoubleDeserializer.wrapperInstance;
            }
            if (cls == Character.class) {
                return CharacterDeserializer.wrapperInstance;
            }
            if (cls == Byte.class) {
                return ByteDeserializer.wrapperInstance;
            }
            if (cls == Short.class) {
                return ShortDeserializer.wrapperInstance;
            }
            if (cls == Float.class) {
                return FloatDeserializer.wrapperInstance;
            }
            if (cls == Number.class) {
                return NumberDeserializer.instance;
            }
            if (cls == BigDecimal.class) {
                return BigDecimalDeserializer.instance;
            }
            if (cls == BigInteger.class) {
                return BigIntegerDeserializer.instance;
            }
        }
        throw new IllegalArgumentException("Internal error: can't find deserializer for " + cls.getName());
    }

    static {
        for (Class cls : new Class[]{Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class}) {
            _classNames.add(cls.getName());
        }
    }
}
