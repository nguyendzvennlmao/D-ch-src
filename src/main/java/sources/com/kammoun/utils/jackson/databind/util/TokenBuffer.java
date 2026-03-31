package com.kammoun.utils.jackson.databind.util;

import com.kammoun.utils.jackson.core.Base64Variant;
import com.kammoun.utils.jackson.core.JacksonException;
import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonLocation;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonStreamContext;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.ObjectCodec;
import com.kammoun.utils.jackson.core.SerializableString;
import com.kammoun.utils.jackson.core.StreamReadCapability;
import com.kammoun.utils.jackson.core.StreamReadConstraints;
import com.kammoun.utils.jackson.core.StreamReadFeature;
import com.kammoun.utils.jackson.core.StreamWriteCapability;
import com.kammoun.utils.jackson.core.TreeNode;
import com.kammoun.utils.jackson.core.Version;
import com.kammoun.utils.jackson.core.base.ParserMinimalBase;
import com.kammoun.utils.jackson.core.io.JsonEOFException;
import com.kammoun.utils.jackson.core.io.NumberInput;
import com.kammoun.utils.jackson.core.json.JsonWriteContext;
import com.kammoun.utils.jackson.core.util.ByteArrayBuilder;
import com.kammoun.utils.jackson.core.util.JacksonFeatureSet;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.DeserializationFeature;
import com.kammoun.utils.jackson.databind.JsonSerializable;
import com.kammoun.utils.jackson.databind.cfg.PackageVersion;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

public class TokenBuffer extends JsonGenerator {
    protected static final int DEFAULT_GENERATOR_FEATURES = JsonGenerator.Feature.collectDefaults();
    protected ObjectCodec _objectCodec;
    protected JsonStreamContext _parentContext;
    protected int _generatorFeatures;
    protected StreamReadConstraints _streamReadConstraints;
    protected boolean _closed;
    protected boolean _hasNativeTypeIds;
    protected boolean _hasNativeObjectIds;
    protected boolean _mayHaveNativeIds;
    protected boolean _forceBigDecimal;
    protected Segment _first;
    protected Segment _last;
    protected int _appendAt;
    protected Object _typeId;
    protected Object _objectId;
    protected boolean _hasNativeId;
    protected JsonWriteContext _writeContext;

    public static final class Parser extends ParserMinimalBase {
        protected ObjectCodec _codec;
        protected StreamReadConstraints _streamReadConstraints;
        protected final boolean _hasNativeTypeIds;
        protected final boolean _hasNativeObjectIds;
        protected final boolean _hasNativeIds;
        protected Segment _segment;
        protected int _segmentPtr;
        protected TokenBufferReadContext _parsingContext;
        protected boolean _closed;
        protected transient ByteArrayBuilder _byteBuilder;
        protected JsonLocation _location;

        @Deprecated
        public Parser(Segment segment, ObjectCodec objectCodec, boolean z, boolean z2) {
            this(segment, objectCodec, z, z2, null);
        }

        @Deprecated
        public Parser(Segment segment, ObjectCodec objectCodec, boolean z, boolean z2, JsonStreamContext jsonStreamContext) {
            this(segment, objectCodec, z, z2, jsonStreamContext, StreamReadConstraints.defaults());
        }

        public Parser(Segment segment, ObjectCodec objectCodec, boolean z, boolean z2, JsonStreamContext jsonStreamContext, StreamReadConstraints streamReadConstraints) {
            this._location = null;
            this._segment = segment;
            this._segmentPtr = -1;
            this._codec = objectCodec;
            this._streamReadConstraints = streamReadConstraints;
            this._parsingContext = TokenBufferReadContext.createRootContext(jsonStreamContext);
            this._hasNativeTypeIds = z;
            this._hasNativeObjectIds = z2;
            this._hasNativeIds = z || z2;
        }

        public void setLocation(JsonLocation jsonLocation) {
            this._location = jsonLocation;
        }

        @Override
        public ObjectCodec getCodec() {
            return this._codec;
        }

        @Override
        public void setCodec(ObjectCodec objectCodec) {
            this._codec = objectCodec;
        }

        @Override
        public Version version() {
            return PackageVersion.VERSION;
        }

        @Override
        public JacksonFeatureSet<StreamReadCapability> getReadCapabilities() {
            return DEFAULT_READ_CAPABILITIES;
        }

        @Override
        public StreamReadConstraints streamReadConstraints() {
            return this._streamReadConstraints;
        }

        public JsonToken peekNextToken() throws IOException {
            if (this._closed) {
                return null;
            }
            Segment segment = this._segment;
            int i = this._segmentPtr + 1;
            if (i >= 16) {
                i = 0;
                segment = segment == null ? null : segment.next();
            }
            if (segment == null) {
                return null;
            }
            return segment.type(i);
        }

        @Override
        public void close() throws IOException {
            if (this._closed) {
                return;
            }
            this._closed = true;
        }

        @Override
        public JsonToken nextToken() throws IOException {
            if (this._closed || this._segment == null) {
                return null;
            }
            int i = this._segmentPtr + 1;
            this._segmentPtr = i;
            if (i >= 16) {
                this._segmentPtr = 0;
                this._segment = this._segment.next();
                if (this._segment == null) {
                    return null;
                }
            }
            this._currToken = this._segment.type(this._segmentPtr);
            if (this._currToken == JsonToken.FIELD_NAME) {
                Object _currentObject = _currentObject();
                this._parsingContext.setCurrentName(_currentObject instanceof String ? (String) _currentObject : _currentObject.toString());
            } else if (this._currToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext();
            } else if (this._currToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext();
            } else if (this._currToken == JsonToken.END_OBJECT || this._currToken == JsonToken.END_ARRAY) {
                this._parsingContext = this._parsingContext.parentOrCopy();
            } else {
                this._parsingContext.updateForValue();
            }
            return this._currToken;
        }

        @Override
        public String nextFieldName() throws IOException {
            if (this._closed || this._segment == null) {
                return null;
            }
            int i = this._segmentPtr + 1;
            if (i >= 16 || this._segment.type(i) != JsonToken.FIELD_NAME) {
                if (nextToken() == JsonToken.FIELD_NAME) {
                    return currentName();
                }
                return null;
            }
            this._segmentPtr = i;
            this._currToken = JsonToken.FIELD_NAME;
            Object obj = this._segment.get(i);
            String obj2 = obj instanceof String ? (String) obj : obj.toString();
            this._parsingContext.setCurrentName(obj2);
            return obj2;
        }

        @Override
        public boolean isClosed() {
            return this._closed;
        }

        @Override
        public JsonStreamContext getParsingContext() {
            return this._parsingContext;
        }

        @Override
        public JsonLocation currentLocation() {
            return this._location == null ? JsonLocation.NA : this._location;
        }

        @Override
        public JsonLocation currentTokenLocation() {
            return currentLocation();
        }

        @Override
        @Deprecated
        public JsonLocation getTokenLocation() {
            return currentTokenLocation();
        }

        @Override
        @Deprecated
        public JsonLocation getCurrentLocation() {
            return currentLocation();
        }

        @Override
        public String currentName() {
            return (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) ? this._parsingContext.getParent().getCurrentName() : this._parsingContext.getCurrentName();
        }

        @Override
        public void overrideCurrentName(String str) {
            TokenBufferReadContext tokenBufferReadContext = this._parsingContext;
            if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
                tokenBufferReadContext = tokenBufferReadContext.getParent();
            }
            if (tokenBufferReadContext instanceof TokenBufferReadContext) {
                try {
                    tokenBufferReadContext.setCurrentName(str);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        @Override
        @Deprecated
        public String getCurrentName() {
            return currentName();
        }

        @Override
        public String getText() {
            if (this._currToken == JsonToken.VALUE_STRING || this._currToken == JsonToken.FIELD_NAME) {
                Object _currentObject = _currentObject();
                return _currentObject instanceof String ? (String) _currentObject : ClassUtil.nullOrToString(_currentObject);
            }
            if (this._currToken == null) {
                return null;
            }
            switch (this._currToken) {
                case VALUE_NUMBER_INT:
                case VALUE_NUMBER_FLOAT:
                    return ClassUtil.nullOrToString(_currentObject());
                default:
                    return this._currToken.asString();
            }
        }

        @Override
        public char[] getTextCharacters() {
            String text = getText();
            if (text == null) {
                return null;
            }
            return text.toCharArray();
        }

        @Override
        public int getTextLength() {
            String text = getText();
            if (text == null) {
                return 0;
            }
            return text.length();
        }

        @Override
        public int getTextOffset() {
            return 0;
        }

        @Override
        public boolean hasTextCharacters() {
            return false;
        }

        @Override
        public boolean isNaN() {
            if (this._currToken != JsonToken.VALUE_NUMBER_FLOAT) {
                return false;
            }
            Object _currentObject = _currentObject();
            return _currentObject instanceof Double ? !Double.isFinite(((Double) _currentObject).doubleValue()) : (_currentObject instanceof Float) && !Double.isFinite((double) ((Float) _currentObject).floatValue());
        }

        @Override
        public BigInteger getBigIntegerValue() throws IOException {
            Number numberValue = getNumberValue(true);
            if (numberValue instanceof BigInteger) {
                return (BigInteger) numberValue;
            }
            if (!(numberValue instanceof BigDecimal)) {
                return BigInteger.valueOf(numberValue.longValue());
            }
            BigDecimal bigDecimal = (BigDecimal) numberValue;
            streamReadConstraints().validateBigIntegerScale(bigDecimal.scale());
            return bigDecimal.toBigInteger();
        }

        @Override
        public BigDecimal getDecimalValue() throws IOException {
            Number numberValue = getNumberValue(true);
            return numberValue instanceof BigDecimal ? (BigDecimal) numberValue : numberValue instanceof Integer ? BigDecimal.valueOf(numberValue.intValue()) : numberValue instanceof Long ? BigDecimal.valueOf(numberValue.longValue()) : numberValue instanceof BigInteger ? new BigDecimal((BigInteger) numberValue) : BigDecimal.valueOf(numberValue.doubleValue());
        }

        @Override
        public double getDoubleValue() throws IOException {
            return getNumberValue().doubleValue();
        }

        @Override
        public float getFloatValue() throws IOException {
            return getNumberValue().floatValue();
        }

        @Override
        public int getIntValue() throws IOException {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) _currentObject() : getNumberValue();
            return ((numberValue instanceof Integer) || _smallerThanInt(numberValue)) ? numberValue.intValue() : _convertNumberToInt(numberValue);
        }

        @Override
        public long getLongValue() throws IOException {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) _currentObject() : getNumberValue();
            return ((numberValue instanceof Long) || _smallerThanLong(numberValue)) ? numberValue.longValue() : _convertNumberToLong(numberValue);
        }

        @Override
        public JsonParser.NumberType getNumberType() throws IOException {
            Object numberValueDeferred = getNumberValueDeferred();
            if (numberValueDeferred instanceof Integer) {
                return JsonParser.NumberType.INT;
            }
            if (numberValueDeferred instanceof Long) {
                return JsonParser.NumberType.LONG;
            }
            if (numberValueDeferred instanceof Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (numberValueDeferred instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (numberValueDeferred instanceof BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (numberValueDeferred instanceof Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (numberValueDeferred instanceof Short) {
                return JsonParser.NumberType.INT;
            }
            if (numberValueDeferred instanceof String) {
                return this._currToken == JsonToken.VALUE_NUMBER_FLOAT ? JsonParser.NumberType.BIG_DECIMAL : JsonParser.NumberType.BIG_INTEGER;
            }
            return null;
        }

        @Override
        public JsonParser.NumberTypeFP getNumberTypeFP() throws IOException {
            if (this._currToken == JsonToken.VALUE_NUMBER_FLOAT) {
                Object _currentObject = _currentObject();
                if (_currentObject instanceof Double) {
                    return JsonParser.NumberTypeFP.DOUBLE64;
                }
                if (_currentObject instanceof BigDecimal) {
                    return JsonParser.NumberTypeFP.BIG_DECIMAL;
                }
                if (_currentObject instanceof Float) {
                    return JsonParser.NumberTypeFP.FLOAT32;
                }
            }
            return JsonParser.NumberTypeFP.UNKNOWN;
        }

        @Override
        public final Number getNumberValue() throws IOException {
            return getNumberValue(false);
        }

        @Override
        public Object getNumberValueDeferred() throws IOException {
            _checkIsNumber();
            return _currentObject();
        }

        private Number getNumberValue(boolean z) throws IOException {
            _checkIsNumber();
            Object _currentObject = _currentObject();
            if (_currentObject instanceof Number) {
                return (Number) _currentObject;
            }
            if (!(_currentObject instanceof String)) {
                throw new IllegalStateException("Internal error: entry should be a Number, but is of type " + ClassUtil.classNameOf(_currentObject));
            }
            String str = (String) _currentObject;
            int length = str.length();
            if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
                return (z || length >= 19) ? NumberInput.parseBigInteger(str, isEnabled(StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER)) : length >= 10 ? Long.valueOf(NumberInput.parseLong(str)) : Integer.valueOf(NumberInput.parseInt(str));
            }
            if (!z) {
                return Double.valueOf(NumberInput.parseDouble(str, isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
            }
            BigDecimal parseBigDecimal = NumberInput.parseBigDecimal(str, isEnabled(StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER));
            if (parseBigDecimal == null) {
                throw new IllegalStateException("Internal error: failed to parse number '" + str + "'");
            }
            return parseBigDecimal;
        }

        private final boolean _smallerThanInt(Number number) {
            return (number instanceof Short) || (number instanceof Byte);
        }

        private final boolean _smallerThanLong(Number number) {
            return (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }

        protected int _convertNumberToInt(Number number) throws IOException {
            if (number instanceof Long) {
                long longValue = number.longValue();
                int i = (int) longValue;
                if (i != longValue) {
                    reportOverflowInt();
                }
                return i;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (BI_MIN_INT.compareTo(bigInteger) > 0 || BI_MAX_INT.compareTo(bigInteger) < 0) {
                    reportOverflowInt();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double doubleValue = number.doubleValue();
                    if (doubleValue < -2.147483648E9d || doubleValue > 2.147483647E9d) {
                        reportOverflowInt();
                    }
                    return (int) doubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (BD_MIN_INT.compareTo(bigDecimal) > 0 || BD_MAX_INT.compareTo(bigDecimal) < 0) {
                        reportOverflowInt();
                    }
                } else {
                    _throwInternal();
                }
            }
            return number.intValue();
        }

        protected long _convertNumberToLong(Number number) throws IOException {
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (BI_MIN_LONG.compareTo(bigInteger) > 0 || BI_MAX_LONG.compareTo(bigInteger) < 0) {
                    reportOverflowLong();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double doubleValue = number.doubleValue();
                    if (doubleValue < -9.223372036854776E18d || doubleValue > 9.223372036854776E18d) {
                        reportOverflowLong();
                    }
                    return (long) doubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (BD_MIN_LONG.compareTo(bigDecimal) > 0 || BD_MAX_LONG.compareTo(bigDecimal) < 0) {
                        reportOverflowLong();
                    }
                } else {
                    _throwInternal();
                }
            }
            return number.longValue();
        }

        @Override
        public Object getEmbeddedObject() {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return _currentObject();
            }
            return null;
        }

        @Override
        public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object _currentObject = _currentObject();
                if (_currentObject instanceof byte[]) {
                    return (byte[]) _currentObject;
                }
            }
            if (this._currToken != JsonToken.VALUE_STRING) {
                throw _constructError("Current token (" + this._currToken + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            }
            String text = getText();
            if (text == null) {
                return null;
            }
            ByteArrayBuilder byteArrayBuilder = this._byteBuilder;
            if (byteArrayBuilder == null) {
                ByteArrayBuilder byteArrayBuilder2 = new ByteArrayBuilder(100);
                byteArrayBuilder = byteArrayBuilder2;
                this._byteBuilder = byteArrayBuilder2;
            } else {
                this._byteBuilder.reset();
            }
            _decodeBase64(text, byteArrayBuilder, base64Variant);
            return byteArrayBuilder.toByteArray();
        }

        @Override
        public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
            byte[] binaryValue = getBinaryValue(base64Variant);
            if (binaryValue == null) {
                return 0;
            }
            outputStream.write(binaryValue, 0, binaryValue.length);
            return binaryValue.length;
        }

        @Override
        public boolean canReadObjectId() {
            return this._hasNativeObjectIds;
        }

        @Override
        public boolean canReadTypeId() {
            return this._hasNativeTypeIds;
        }

        @Override
        public Object getTypeId() {
            return this._segment.findTypeId(this._segmentPtr);
        }

        @Override
        public Object getObjectId() {
            return this._segment.findObjectId(this._segmentPtr);
        }

        protected final Object _currentObject() {
            return this._segment.get(this._segmentPtr);
        }

        protected final void _checkIsNumber() throws JacksonException {
            if (this._currToken == null || !this._currToken.isNumeric()) {
                throw _constructError("Current token (" + this._currToken + ") not numeric, cannot use numeric value accessors");
            }
        }

        @Override
        protected void _handleEOF() {
            _throwInternal();
        }
    }

    public static final class Segment {
        public static final int TOKENS_PER_SEGMENT = 16;
        private static final JsonToken[] TOKEN_TYPES_BY_INDEX = new JsonToken[16];
        protected Segment _next;
        protected long _tokenTypes;
        protected final Object[] _tokens = new Object[16];
        protected TreeMap<Integer, Object> _nativeIds;

        public JsonToken type(int i) {
            long j = this._tokenTypes;
            if (i > 0) {
                j >>= i << 2;
            }
            return TOKEN_TYPES_BY_INDEX[((int) j) & 15];
        }

        public int rawType(int i) {
            long j = this._tokenTypes;
            if (i > 0) {
                j >>= i << 2;
            }
            return ((int) j) & 15;
        }

        public Object get(int i) {
            return this._tokens[i];
        }

        public Segment next() {
            return this._next;
        }

        public boolean hasIds() {
            return this._nativeIds != null;
        }

        public Segment append(int i, JsonToken jsonToken) {
            if (i < 16) {
                set(i, jsonToken);
                return null;
            }
            this._next = new Segment();
            this._next.set(0, jsonToken);
            return this._next;
        }

        public Segment append(int i, JsonToken jsonToken, Object obj, Object obj2) {
            if (i < 16) {
                set(i, jsonToken, obj, obj2);
                return null;
            }
            this._next = new Segment();
            this._next.set(0, jsonToken, obj, obj2);
            return this._next;
        }

        public Segment append(int i, JsonToken jsonToken, Object obj) {
            if (i < 16) {
                set(i, jsonToken, obj);
                return null;
            }
            this._next = new Segment();
            this._next.set(0, jsonToken, obj);
            return this._next;
        }

        public Segment append(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            if (i < 16) {
                set(i, jsonToken, obj, obj2, obj3);
                return null;
            }
            this._next = new Segment();
            this._next.set(0, jsonToken, obj, obj2, obj3);
            return this._next;
        }

        private void set(int i, JsonToken jsonToken) {
            long ordinal = jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes |= ordinal;
        }

        private void set(int i, JsonToken jsonToken, Object obj, Object obj2) {
            long ordinal = jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes |= ordinal;
            assignNativeIds(i, obj, obj2);
        }

        private void set(int i, JsonToken jsonToken, Object obj) {
            this._tokens[i] = obj;
            long ordinal = jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes |= ordinal;
        }

        private void set(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            this._tokens[i] = obj;
            long ordinal = jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes |= ordinal;
            assignNativeIds(i, obj2, obj3);
        }

        private final void assignNativeIds(int i, Object obj, Object obj2) {
            if (this._nativeIds == null) {
                this._nativeIds = new TreeMap<>();
            }
            if (obj != null) {
                this._nativeIds.put(Integer.valueOf(_objectIdIndex(i)), obj);
            }
            if (obj2 != null) {
                this._nativeIds.put(Integer.valueOf(_typeIdIndex(i)), obj2);
            }
        }

        Object findObjectId(int i) {
            if (this._nativeIds == null) {
                return null;
            }
            return this._nativeIds.get(Integer.valueOf(_objectIdIndex(i)));
        }

        Object findTypeId(int i) {
            if (this._nativeIds == null) {
                return null;
            }
            return this._nativeIds.get(Integer.valueOf(_typeIdIndex(i)));
        }

        private final int _typeIdIndex(int i) {
            return i + i;
        }

        private final int _objectIdIndex(int i) {
            return i + i + 1;
        }

        static {
            JsonToken[] values = JsonToken.values();
            System.arraycopy(values, 1, TOKEN_TYPES_BY_INDEX, 1, Math.min(15, values.length - 1));
        }
    }

    public TokenBuffer(ObjectCodec objectCodec, boolean z) {
        this._streamReadConstraints = StreamReadConstraints.defaults();
        this._hasNativeId = false;
        this._objectCodec = objectCodec;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        this._writeContext = JsonWriteContext.createRootContext(null);
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = z;
        this._hasNativeObjectIds = z;
        this._mayHaveNativeIds = this._hasNativeTypeIds || this._hasNativeObjectIds;
    }

    public TokenBuffer(JsonParser jsonParser) {
        this(jsonParser, (DeserializationContext) null);
    }

    public TokenBuffer(JsonParser jsonParser, DeserializationContext deserializationContext) {
        this._streamReadConstraints = StreamReadConstraints.defaults();
        this._hasNativeId = false;
        this._objectCodec = jsonParser.getCodec();
        this._streamReadConstraints = jsonParser.streamReadConstraints();
        this._parentContext = jsonParser.getParsingContext();
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        this._writeContext = JsonWriteContext.createRootContext(null);
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = jsonParser.canReadTypeId();
        this._hasNativeObjectIds = jsonParser.canReadObjectId();
        this._mayHaveNativeIds = this._hasNativeTypeIds || this._hasNativeObjectIds;
        this._forceBigDecimal = deserializationContext == null ? false : deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
    }

    @Deprecated
    public static TokenBuffer asCopyOfValue(JsonParser jsonParser) throws IOException {
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser);
        tokenBuffer.copyCurrentStructure(jsonParser);
        return tokenBuffer;
    }

    public TokenBuffer overrideParentContext(JsonStreamContext jsonStreamContext) {
        this._parentContext = jsonStreamContext;
        return this;
    }

    public TokenBuffer forceUseOfBigDecimal(boolean z) {
        this._forceBigDecimal = z;
        return this;
    }

    @Override
    public Version version() {
        return PackageVersion.VERSION;
    }

    public JsonParser asParser() {
        return asParser(this._objectCodec);
    }

    public JsonParser asParserOnFirstToken() throws IOException {
        JsonParser asParser = asParser(this._objectCodec);
        asParser.nextToken();
        return asParser;
    }

    public JsonParser asParser(ObjectCodec objectCodec) {
        return new Parser(this._first, objectCodec, this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext, this._streamReadConstraints);
    }

    public JsonParser asParser(StreamReadConstraints streamReadConstraints) {
        return new Parser(this._first, this._objectCodec, this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext, streamReadConstraints);
    }

    public JsonParser asParser(JsonParser jsonParser) {
        Parser parser = new Parser(this._first, jsonParser.getCodec(), this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext, jsonParser.streamReadConstraints());
        parser.setLocation(jsonParser.currentTokenLocation());
        return parser;
    }

    public JsonToken firstToken() {
        return this._first.type(0);
    }

    public boolean isEmpty() {
        return this._appendAt == 0 && this._first == this._last;
    }

    public TokenBuffer append(TokenBuffer tokenBuffer) throws IOException {
        if (!this._hasNativeTypeIds) {
            this._hasNativeTypeIds = tokenBuffer.canWriteTypeId();
        }
        if (!this._hasNativeObjectIds) {
            this._hasNativeObjectIds = tokenBuffer.canWriteObjectId();
        }
        this._mayHaveNativeIds = this._hasNativeTypeIds || this._hasNativeObjectIds;
        JsonParser asParser = tokenBuffer.asParser();
        while (asParser.nextToken() != null) {
            copyCurrentStructure(asParser);
        }
        return this;
    }

    public void serialize(JsonGenerator jsonGenerator) throws IOException {
        Segment segment = this._first;
        int i = -1;
        boolean z = this._mayHaveNativeIds;
        boolean z2 = z && segment.hasIds();
        while (true) {
            i++;
            if (i >= 16) {
                i = 0;
                segment = segment.next();
                if (segment == null) {
                    return;
                } else {
                    z2 = z && segment.hasIds();
                }
            }
            JsonToken type = segment.type(i);
            if (type == null) {
                return;
            }
            if (z2) {
                Object findObjectId = segment.findObjectId(i);
                if (findObjectId != null) {
                    jsonGenerator.writeObjectId(findObjectId);
                }
                Object findTypeId = segment.findTypeId(i);
                if (findTypeId != null) {
                    jsonGenerator.writeTypeId(findTypeId);
                }
            }
            switch (type) {
                case START_OBJECT:
                    jsonGenerator.writeStartObject();
                    break;
                case END_OBJECT:
                    jsonGenerator.writeEndObject();
                    break;
                case START_ARRAY:
                    jsonGenerator.writeStartArray();
                    break;
                case END_ARRAY:
                    jsonGenerator.writeEndArray();
                    break;
                case FIELD_NAME:
                    Object obj = segment.get(i);
                    if (!(obj instanceof SerializableString)) {
                        jsonGenerator.writeFieldName((String) obj);
                        break;
                    } else {
                        jsonGenerator.writeFieldName((SerializableString) obj);
                        break;
                    }
                case VALUE_STRING:
                    Object obj2 = segment.get(i);
                    if (!(obj2 instanceof SerializableString)) {
                        jsonGenerator.writeString((String) obj2);
                        break;
                    } else {
                        jsonGenerator.writeString((SerializableString) obj2);
                        break;
                    }
                case VALUE_NUMBER_INT:
                    Object obj3 = segment.get(i);
                    if (!(obj3 instanceof Integer)) {
                        if (!(obj3 instanceof BigInteger)) {
                            if (!(obj3 instanceof Long)) {
                                if (!(obj3 instanceof Short)) {
                                    jsonGenerator.writeNumber(((Number) obj3).intValue());
                                    break;
                                } else {
                                    jsonGenerator.writeNumber(((Short) obj3).shortValue());
                                    break;
                                }
                            } else {
                                jsonGenerator.writeNumber(((Long) obj3).longValue());
                                break;
                            }
                        } else {
                            jsonGenerator.writeNumber((BigInteger) obj3);
                            break;
                        }
                    } else {
                        jsonGenerator.writeNumber(((Integer) obj3).intValue());
                        break;
                    }
                case VALUE_NUMBER_FLOAT:
                    Object obj4 = segment.get(i);
                    if (!(obj4 instanceof Double)) {
                        if (!(obj4 instanceof BigDecimal)) {
                            if (!(obj4 instanceof Float)) {
                                if (obj4 != null) {
                                    if (!(obj4 instanceof String)) {
                                        _reportError(String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize", obj4.getClass().getName()));
                                        break;
                                    } else {
                                        jsonGenerator.writeNumber((String) obj4);
                                        break;
                                    }
                                } else {
                                    jsonGenerator.writeNull();
                                    break;
                                }
                            } else {
                                jsonGenerator.writeNumber(((Float) obj4).floatValue());
                                break;
                            }
                        } else {
                            jsonGenerator.writeNumber((BigDecimal) obj4);
                            break;
                        }
                    } else {
                        jsonGenerator.writeNumber(((Double) obj4).doubleValue());
                        break;
                    }
                case VALUE_TRUE:
                    jsonGenerator.writeBoolean(true);
                    break;
                case VALUE_FALSE:
                    jsonGenerator.writeBoolean(false);
                    break;
                case VALUE_NULL:
                    jsonGenerator.writeNull();
                    break;
                case VALUE_EMBEDDED_OBJECT:
                    Object obj5 = segment.get(i);
                    if (!(obj5 instanceof RawValue)) {
                        if (!(obj5 instanceof JsonSerializable)) {
                            jsonGenerator.writeEmbeddedObject(obj5);
                            break;
                        } else {
                            jsonGenerator.writeObject(obj5);
                            break;
                        }
                    } else {
                        ((RawValue) obj5).serialize(jsonGenerator);
                        break;
                    }
                default:
                    throw new RuntimeException("Internal error: should never end up through this code path");
            }
        }
    }

    public TokenBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken nextToken;
        if (!jsonParser.hasToken(JsonToken.FIELD_NAME)) {
            copyCurrentStructure(jsonParser);
            return this;
        }
        writeStartObject();
        do {
            copyCurrentStructure(jsonParser);
            nextToken = jsonParser.nextToken();
        } while (nextToken == JsonToken.FIELD_NAME);
        if (nextToken != JsonToken.END_OBJECT) {
            deserializationContext.reportWrongTokenException(TokenBuffer.class, JsonToken.END_OBJECT, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + nextToken, new Object[0]);
        }
        writeEndObject();
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[TokenBuffer: ");
        JsonParser asParser = asParser();
        int i = 0;
        boolean z = this._hasNativeTypeIds || this._hasNativeObjectIds;
        while (true) {
            try {
                JsonToken nextToken = asParser.nextToken();
                if (nextToken == null) {
                    break;
                }
                if (z) {
                    _appendNativeIds(sb);
                }
                if (i < 100) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(nextToken.toString());
                    if (nextToken == JsonToken.FIELD_NAME) {
                        sb.append('(');
                        sb.append(asParser.currentName());
                        sb.append(')');
                    }
                }
                i++;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        if (i >= 100) {
            sb.append(" ... (truncated ").append(i - 100).append(" entries)");
        }
        sb.append(']');
        return sb.toString();
    }

    private final void _appendNativeIds(StringBuilder sb) {
        Object findObjectId = this._last.findObjectId(this._appendAt - 1);
        if (findObjectId != null) {
            sb.append("[objectId=").append(String.valueOf(findObjectId)).append(']');
        }
        Object findTypeId = this._last.findTypeId(this._appendAt - 1);
        if (findTypeId != null) {
            sb.append("[typeId=").append(String.valueOf(findTypeId)).append(']');
        }
    }

    @Override
    public JsonGenerator enable(JsonGenerator.Feature feature) {
        this._generatorFeatures |= feature.getMask();
        return this;
    }

    @Override
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        this._generatorFeatures &= feature.getMask() ^ (-1);
        return this;
    }

    @Override
    public boolean isEnabled(JsonGenerator.Feature feature) {
        return (this._generatorFeatures & feature.getMask()) != 0;
    }

    @Override
    public int getFeatureMask() {
        return this._generatorFeatures;
    }

    @Override
    @Deprecated
    public JsonGenerator setFeatureMask(int i) {
        this._generatorFeatures = i;
        return this;
    }

    @Override
    public JsonGenerator overrideStdFeatures(int i, int i2) {
        this._generatorFeatures = (getFeatureMask() & (i2 ^ (-1))) | (i & i2);
        return this;
    }

    @Override
    public JsonGenerator useDefaultPrettyPrinter() {
        return this;
    }

    @Override
    public JsonGenerator setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    @Override
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override
    public final JsonWriteContext getOutputContext() {
        return this._writeContext;
    }

    @Override
    public boolean canWriteBinaryNatively() {
        return true;
    }

    @Override
    public JacksonFeatureSet<StreamWriteCapability> getWriteCapabilities() {
        return DEFAULT_WRITE_CAPABILITIES;
    }

    @Override
    public void flush() throws IOException {
    }

    @Override
    public void close() throws IOException {
        this._closed = true;
    }

    @Override
    public boolean isClosed() {
        return this._closed;
    }

    @Override
    public final void writeStartArray() throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext();
    }

    @Override
    public void writeStartArray(Object obj) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext(obj);
    }

    @Override
    public void writeStartArray(Object obj, int i) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext(obj);
    }

    @Override
    public final void writeEndArray() throws IOException {
        _appendEndMarker(JsonToken.END_ARRAY);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    @Override
    public final void writeStartObject() throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext();
    }

    @Override
    public void writeStartObject(Object obj) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext(obj);
    }

    @Override
    public void writeStartObject(Object obj, int i) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext(obj);
    }

    @Override
    public final void writeEndObject() throws IOException {
        _appendEndMarker(JsonToken.END_OBJECT);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    @Override
    public final void writeFieldName(String str) throws IOException {
        this._writeContext.writeFieldName(str);
        _appendFieldName(str);
    }

    @Override
    public void writeFieldName(SerializableString serializableString) throws IOException {
        this._writeContext.writeFieldName(serializableString.getValue());
        _appendFieldName(serializableString);
    }

    @Override
    public void writeString(String str) throws IOException {
        if (str == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_STRING, str);
        }
    }

    @Override
    public void writeString(char[] cArr, int i, int i2) throws IOException {
        writeString(new String(cArr, i, i2));
    }

    @Override
    public void writeString(SerializableString serializableString) throws IOException {
        if (serializableString == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_STRING, serializableString);
        }
    }

    @Override
    public void writeString(Reader reader, int i) throws IOException {
        int read;
        if (reader == null) {
            _reportError("null reader");
        }
        int i2 = i >= 0 ? i : Integer.MAX_VALUE;
        char[] cArr = new char[1000];
        StringBuilder sb = new StringBuilder(1000);
        while (i2 > 0 && (read = reader.read(cArr, 0, Math.min(i2, cArr.length))) > 0) {
            sb.append(cArr, 0, read);
            i2 -= read;
        }
        if (i2 > 0 && i >= 0) {
            _reportError("Was not able to read enough from reader");
        }
        _appendValue(JsonToken.VALUE_STRING, sb.toString());
    }

    @Override
    public void writeRawUTF8String(byte[] bArr, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override
    public void writeUTF8String(byte[] bArr, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override
    public void writeRaw(String str) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override
    public void writeRaw(String str, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override
    public void writeRaw(SerializableString serializableString) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override
    public void writeRaw(char[] cArr, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override
    public void writeRaw(char c) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override
    public void writeRawValue(String str) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new RawValue(str));
    }

    @Override
    public void writeRawValue(String str, int i, int i2) throws IOException {
        if (i > 0 || i2 != str.length()) {
            str = str.substring(i, i + i2);
        }
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new RawValue(str));
    }

    @Override
    public void writeRawValue(char[] cArr, int i, int i2) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new String(cArr, i, i2));
    }

    @Override
    public void writeNumber(short s) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    @Override
    public void writeNumber(int i) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    @Override
    public void writeNumber(long j) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    @Override
    public void writeNumber(double d) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    @Override
    public void writeNumber(float f) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    @Override
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override
    public void writeNumber(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override
    public void writeNumber(String str) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    private void writeLazyInteger(Object obj) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, obj);
    }

    private void writeLazyDecimal(Object obj) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, obj);
    }

    @Override
    public void writeBoolean(boolean z) throws IOException {
        _appendValue(z ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    @Override
    public void writeNull() throws IOException {
        _appendValue(JsonToken.VALUE_NULL);
    }

    @Override
    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof RawValue)) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else if (this._objectCodec == null) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            this._objectCodec.writeValue(this, obj);
        }
    }

    @Override
    public void writeTree(TreeNode treeNode) throws IOException {
        if (treeNode == null) {
            writeNull();
        } else if (this._objectCodec == null) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, treeNode);
        } else {
            this._objectCodec.writeTree(this, treeNode);
        }
    }

    @Override
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        writeObject(bArr2);
    }

    @Override
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean canWriteTypeId() {
        return this._hasNativeTypeIds;
    }

    @Override
    public boolean canWriteObjectId() {
        return this._hasNativeObjectIds;
    }

    @Override
    public void writeTypeId(Object obj) {
        this._typeId = obj;
        this._hasNativeId = true;
    }

    @Override
    public void writeObjectId(Object obj) {
        this._objectId = obj;
        this._hasNativeId = true;
    }

    @Override
    public void writeEmbeddedObject(Object obj) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    @Override
    public void copyCurrentEvent(JsonParser jsonParser) throws IOException {
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        switch (jsonParser.currentToken()) {
            case START_OBJECT:
                writeStartObject();
                return;
            case END_OBJECT:
                writeEndObject();
                return;
            case START_ARRAY:
                writeStartArray();
                return;
            case END_ARRAY:
                writeEndArray();
                return;
            case FIELD_NAME:
                writeFieldName(jsonParser.currentName());
                return;
            case VALUE_STRING:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case VALUE_NUMBER_INT:
                switch (jsonParser.getNumberType()) {
                    case INT:
                        writeNumber(jsonParser.getIntValue());
                        return;
                    case BIG_INTEGER:
                        writeLazyInteger(jsonParser.getNumberValueDeferred());
                        return;
                    default:
                        writeNumber(jsonParser.getLongValue());
                        return;
                }
            case VALUE_NUMBER_FLOAT:
                writeLazyDecimal(jsonParser.getNumberValueDeferred());
                return;
            case VALUE_TRUE:
                writeBoolean(true);
                return;
            case VALUE_FALSE:
                writeBoolean(false);
                return;
            case VALUE_NULL:
                writeNull();
                return;
            case VALUE_EMBEDDED_OBJECT:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + jsonParser.currentToken());
        }
    }

    @Override
    public void copyCurrentStructure(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == JsonToken.FIELD_NAME) {
            if (this._mayHaveNativeIds) {
                _checkNativeIds(jsonParser);
            }
            writeFieldName(jsonParser.currentName());
            currentToken = jsonParser.nextToken();
        } else if (currentToken == null) {
            throw new JsonEOFException(jsonParser, null, "Unexpected end-of-input");
        }
        switch (currentToken) {
            case START_OBJECT:
                if (this._mayHaveNativeIds) {
                    _checkNativeIds(jsonParser);
                }
                writeStartObject();
                _copyBufferContents(jsonParser);
                return;
            case END_OBJECT:
                writeEndObject();
                return;
            case START_ARRAY:
                if (this._mayHaveNativeIds) {
                    _checkNativeIds(jsonParser);
                }
                writeStartArray();
                _copyBufferContents(jsonParser);
                return;
            case END_ARRAY:
                writeEndArray();
                return;
            default:
                _copyBufferValue(jsonParser, currentToken);
                return;
        }
    }

    protected void _copyBufferContents(JsonParser jsonParser) throws IOException {
        int i = 1;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken != null) {
                switch (nextToken) {
                    case START_OBJECT:
                        if (this._mayHaveNativeIds) {
                            _checkNativeIds(jsonParser);
                        }
                        writeStartObject();
                        i++;
                        break;
                    case END_OBJECT:
                        writeEndObject();
                        i--;
                        if (i != 0) {
                            break;
                        } else {
                            return;
                        }
                    case START_ARRAY:
                        if (this._mayHaveNativeIds) {
                            _checkNativeIds(jsonParser);
                        }
                        writeStartArray();
                        i++;
                        break;
                    case END_ARRAY:
                        writeEndArray();
                        i--;
                        if (i != 0) {
                            break;
                        } else {
                            return;
                        }
                    case FIELD_NAME:
                        if (this._mayHaveNativeIds) {
                            _checkNativeIds(jsonParser);
                        }
                        writeFieldName(jsonParser.currentName());
                        break;
                    default:
                        _copyBufferValue(jsonParser, nextToken);
                        break;
                }
            } else {
                return;
            }
        }
    }

    private void _copyBufferValue(JsonParser jsonParser, JsonToken jsonToken) throws IOException {
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        switch (jsonToken) {
            case VALUE_STRING:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case VALUE_NUMBER_INT:
                switch (jsonParser.getNumberType()) {
                    case INT:
                        writeNumber(jsonParser.getIntValue());
                        return;
                    case BIG_INTEGER:
                        writeLazyInteger(jsonParser.getNumberValueDeferred());
                        return;
                    default:
                        writeNumber(jsonParser.getLongValue());
                        return;
                }
            case VALUE_NUMBER_FLOAT:
                writeLazyDecimal(jsonParser.getNumberValueDeferred());
                return;
            case VALUE_TRUE:
                writeBoolean(true);
                return;
            case VALUE_FALSE:
                writeBoolean(false);
                return;
            case VALUE_NULL:
                writeNull();
                return;
            case VALUE_EMBEDDED_OBJECT:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + jsonToken);
        }
    }

    private final void _checkNativeIds(JsonParser jsonParser) throws IOException {
        Object typeId = jsonParser.getTypeId();
        this._typeId = typeId;
        if (typeId != null) {
            this._hasNativeId = true;
        }
        Object objectId = jsonParser.getObjectId();
        this._objectId = objectId;
        if (objectId != null) {
            this._hasNativeId = true;
        }
    }

    protected final void _appendValue(JsonToken jsonToken) {
        this._writeContext.writeValue();
        Segment append = this._hasNativeId ? this._last.append(this._appendAt, jsonToken, this._objectId, this._typeId) : this._last.append(this._appendAt, jsonToken);
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    protected final void _appendValue(JsonToken jsonToken, Object obj) {
        this._writeContext.writeValue();
        Segment append = this._hasNativeId ? this._last.append(this._appendAt, jsonToken, obj, this._objectId, this._typeId) : this._last.append(this._appendAt, jsonToken, obj);
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    protected final void _appendFieldName(Object obj) {
        Segment append = this._hasNativeId ? this._last.append(this._appendAt, JsonToken.FIELD_NAME, obj, this._objectId, this._typeId) : this._last.append(this._appendAt, JsonToken.FIELD_NAME, obj);
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    protected final void _appendStartMarker(JsonToken jsonToken) {
        Segment append = this._hasNativeId ? this._last.append(this._appendAt, jsonToken, this._objectId, this._typeId) : this._last.append(this._appendAt, jsonToken);
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    protected final void _appendEndMarker(JsonToken jsonToken) {
        Segment append = this._last.append(this._appendAt, jsonToken);
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    @Override
    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }
}
