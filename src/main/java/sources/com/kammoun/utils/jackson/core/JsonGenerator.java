package com.kammoun.utils.jackson.core;

import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.exc.StreamWriteException;
import com.kammoun.utils.jackson.core.io.CharacterEscapes;
import com.kammoun.utils.jackson.core.type.WritableTypeId;
import com.kammoun.utils.jackson.core.util.JacksonFeatureSet;
import com.kammoun.utils.jackson.core.util.VersionUtil;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class JsonGenerator implements Closeable, Flushable, Versioned {
    protected static final JacksonFeatureSet<StreamWriteCapability> DEFAULT_WRITE_CAPABILITIES = JacksonFeatureSet.fromDefaults(StreamWriteCapability.values());
    protected static final JacksonFeatureSet<StreamWriteCapability> DEFAULT_TEXTUAL_WRITE_CAPABILITIES = DEFAULT_WRITE_CAPABILITIES.with(StreamWriteCapability.CAN_WRITE_FORMATTED_NUMBERS);
    protected static final JacksonFeatureSet<StreamWriteCapability> DEFAULT_BINARY_WRITE_CAPABILITIES = DEFAULT_WRITE_CAPABILITIES.with(StreamWriteCapability.CAN_WRITE_BINARY_NATIVELY);
    protected PrettyPrinter _cfgPrettyPrinter;

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false),
        USE_FAST_DOUBLE_WRITER(false),
        WRITE_HEX_UPPER_CASE(true),
        ESCAPE_FORWARD_SLASHES(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        public static int collectDefaults() {
            int i = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        Feature(boolean z) {
            this._defaultState = z;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public abstract JsonGenerator setCodec(ObjectCodec objectCodec);

    public abstract ObjectCodec getCodec();

    public StreamWriteConstraints streamWriteConstraints() {
        return StreamWriteConstraints.defaults();
    }

    @Override
    public abstract Version version();

    public abstract JsonStreamContext getOutputContext();

    public Object getOutputTarget() {
        return null;
    }

    public Object currentValue() {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext == null) {
            return null;
        }
        return outputContext.getCurrentValue();
    }

    public void assignCurrentValue(Object obj) {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext != null) {
            outputContext.setCurrentValue(obj);
        }
    }

    @Deprecated
    public Object getCurrentValue() {
        return currentValue();
    }

    @Deprecated
    public void setCurrentValue(Object obj) {
        assignCurrentValue(obj);
    }

    public abstract JsonGenerator enable(Feature feature);

    public abstract JsonGenerator disable(Feature feature);

    public final JsonGenerator configure(Feature feature, boolean z) {
        if (z) {
            enable(feature);
        } else {
            disable(feature);
        }
        return this;
    }

    public abstract boolean isEnabled(Feature feature);

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return isEnabled(streamWriteFeature.mappedFeature());
    }

    public abstract int getFeatureMask();

    @Deprecated
    public abstract JsonGenerator setFeatureMask(int i);

    public JsonGenerator overrideStdFeatures(int i, int i2) {
        return setFeatureMask((getFeatureMask() & (i2 ^ (-1))) | (i & i2));
    }

    public int getFormatFeatures() {
        return 0;
    }

    public JsonGenerator overrideFormatFeatures(int i, int i2) {
        return this;
    }

    public void setSchema(FormatSchema formatSchema) {
        throw new UnsupportedOperationException(String.format("Generator of type %s does not support schema of type '%s'", getClass().getName(), formatSchema.getSchemaType()));
    }

    public FormatSchema getSchema() {
        return null;
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._cfgPrettyPrinter = prettyPrinter;
        return this;
    }

    public PrettyPrinter getPrettyPrinter() {
        return this._cfgPrettyPrinter;
    }

    public abstract JsonGenerator useDefaultPrettyPrinter();

    public JsonGenerator setHighestNonEscapedChar(int i) {
        return this;
    }

    public int getHighestEscapedChar() {
        return 0;
    }

    public CharacterEscapes getCharacterEscapes() {
        return null;
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        throw new UnsupportedOperationException();
    }

    public int getOutputBuffered() {
        return -1;
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return false;
    }

    public boolean canWriteObjectId() {
        return false;
    }

    public boolean canWriteTypeId() {
        return false;
    }

    public boolean canWriteBinaryNatively() {
        return false;
    }

    public boolean canOmitFields() {
        return true;
    }

    public boolean canWriteFormattedNumbers() {
        return false;
    }

    public JacksonFeatureSet<StreamWriteCapability> getWriteCapabilities() {
        return DEFAULT_WRITE_CAPABILITIES;
    }

    public abstract void writeStartArray() throws IOException;

    @Deprecated
    public void writeStartArray(int i) throws IOException {
        writeStartArray();
    }

    public void writeStartArray(Object obj) throws IOException {
        writeStartArray();
        setCurrentValue(obj);
    }

    public void writeStartArray(Object obj, int i) throws IOException {
        writeStartArray(i);
        setCurrentValue(obj);
    }

    public abstract void writeEndArray() throws IOException;

    public abstract void writeStartObject() throws IOException;

    public void writeStartObject(Object obj) throws IOException {
        writeStartObject();
        setCurrentValue(obj);
    }

    public void writeStartObject(Object obj, int i) throws IOException {
        writeStartObject(obj);
    }

    public abstract void writeEndObject() throws IOException;

    public abstract void writeFieldName(String str) throws IOException;

    public abstract void writeFieldName(SerializableString serializableString) throws IOException;

    public void writeFieldId(long j) throws IOException {
        writeFieldName(Long.toString(j));
    }

    public void writeArray(int[] iArr, int i, int i2) throws IOException {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        _verifyOffsets(iArr.length, i, i2);
        writeStartArray(iArr, i2);
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            writeNumber(iArr[i4]);
        }
        writeEndArray();
    }

    public void writeArray(long[] jArr, int i, int i2) throws IOException {
        if (jArr == null) {
            throw new IllegalArgumentException("null array");
        }
        _verifyOffsets(jArr.length, i, i2);
        writeStartArray(jArr, i2);
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            writeNumber(jArr[i4]);
        }
        writeEndArray();
    }

    public void writeArray(double[] dArr, int i, int i2) throws IOException {
        if (dArr == null) {
            throw new IllegalArgumentException("null array");
        }
        _verifyOffsets(dArr.length, i, i2);
        writeStartArray(dArr, i2);
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            writeNumber(dArr[i4]);
        }
        writeEndArray();
    }

    public void writeArray(String[] strArr, int i, int i2) throws IOException {
        if (strArr == null) {
            throw new IllegalArgumentException("null array");
        }
        _verifyOffsets(strArr.length, i, i2);
        writeStartArray(strArr, i2);
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            writeString(strArr[i4]);
        }
        writeEndArray();
    }

    public abstract void writeString(String str) throws IOException;

    public void writeString(Reader reader, int i) throws IOException {
        _reportUnsupportedOperation();
    }

    public abstract void writeString(char[] cArr, int i, int i2) throws IOException;

    public abstract void writeString(SerializableString serializableString) throws IOException;

    public abstract void writeRawUTF8String(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeUTF8String(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeRaw(String str) throws IOException;

    public abstract void writeRaw(String str, int i, int i2) throws IOException;

    public abstract void writeRaw(char[] cArr, int i, int i2) throws IOException;

    public abstract void writeRaw(char c) throws IOException;

    public void writeRaw(SerializableString serializableString) throws IOException {
        writeRaw(serializableString.getValue());
    }

    public abstract void writeRawValue(String str) throws IOException;

    public abstract void writeRawValue(String str, int i, int i2) throws IOException;

    public abstract void writeRawValue(char[] cArr, int i, int i2) throws IOException;

    public void writeRawValue(SerializableString serializableString) throws IOException {
        writeRawValue(serializableString.getValue());
    }

    public abstract void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException;

    public void writeBinary(byte[] bArr, int i, int i2) throws IOException {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, i, i2);
    }

    public void writeBinary(byte[] bArr) throws IOException {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, 0, bArr.length);
    }

    public int writeBinary(InputStream inputStream, int i) throws IOException {
        return writeBinary(Base64Variants.getDefaultVariant(), inputStream, i);
    }

    public abstract int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException;

    public void writeNumber(short s) throws IOException {
        writeNumber((int) s);
    }

    public abstract void writeNumber(int i) throws IOException;

    public abstract void writeNumber(long j) throws IOException;

    public abstract void writeNumber(BigInteger bigInteger) throws IOException;

    public abstract void writeNumber(double d) throws IOException;

    public abstract void writeNumber(float f) throws IOException;

    public abstract void writeNumber(BigDecimal bigDecimal) throws IOException;

    public abstract void writeNumber(String str) throws IOException;

    public void writeNumber(char[] cArr, int i, int i2) throws IOException {
        writeNumber(new String(cArr, i, i2));
    }

    public abstract void writeBoolean(boolean z) throws IOException;

    public abstract void writeNull() throws IOException;

    public void writeEmbeddedObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
        } else {
            if (!(obj instanceof byte[])) {
                throw new JsonGenerationException("No native support for writing embedded objects of type " + obj.getClass().getName(), this);
            }
            writeBinary((byte[]) obj);
        }
    }

    public void writeObjectId(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void writeObjectRef(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void writeTypeId(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public WritableTypeId writeTypePrefix(WritableTypeId writableTypeId) throws IOException {
        Object obj = writableTypeId.id;
        JsonToken jsonToken = writableTypeId.valueShape;
        if (!canWriteTypeId()) {
            String valueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            writableTypeId.wrapperWritten = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.include;
            if (jsonToken != JsonToken.START_OBJECT && inclusion.requiresObjectContext()) {
                WritableTypeId.Inclusion inclusion2 = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                inclusion = inclusion2;
                writableTypeId.include = inclusion2;
            }
            switch (inclusion) {
                case PARENT_PROPERTY:
                case PAYLOAD_PROPERTY:
                    break;
                case METADATA_PROPERTY:
                    writeStartObject(writableTypeId.forValue);
                    writeStringField(writableTypeId.asProperty, valueOf);
                    return writableTypeId;
                case WRAPPER_OBJECT:
                    writeStartObject();
                    writeFieldName(valueOf);
                    break;
                case WRAPPER_ARRAY:
                default:
                    writeStartArray();
                    writeString(valueOf);
                    break;
            }
        } else {
            writableTypeId.wrapperWritten = false;
            writeTypeId(obj);
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            writeStartObject(writableTypeId.forValue);
        } else if (jsonToken == JsonToken.START_ARRAY) {
            writeStartArray();
        }
        return writableTypeId;
    }

    public WritableTypeId writeTypeSuffix(WritableTypeId writableTypeId) throws IOException {
        JsonToken jsonToken = writableTypeId.valueShape;
        if (jsonToken == JsonToken.START_OBJECT) {
            writeEndObject();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            writeEndArray();
        }
        if (writableTypeId.wrapperWritten) {
            switch (writableTypeId.include) {
                case PARENT_PROPERTY:
                    Object obj = writableTypeId.id;
                    writeStringField(writableTypeId.asProperty, obj instanceof String ? (String) obj : String.valueOf(obj));
                    break;
                case PAYLOAD_PROPERTY:
                case METADATA_PROPERTY:
                    break;
                case WRAPPER_OBJECT:
                default:
                    writeEndObject();
                    break;
                case WRAPPER_ARRAY:
                    writeEndArray();
                    break;
            }
        }
        return writableTypeId;
    }

    public void writePOJO(Object obj) throws IOException {
        writeObject(obj);
    }

    public abstract void writeObject(Object obj) throws IOException;

    public abstract void writeTree(TreeNode treeNode) throws IOException;

    public void writeBinaryField(String str, byte[] bArr) throws IOException {
        writeFieldName(str);
        writeBinary(bArr);
    }

    public void writeBooleanField(String str, boolean z) throws IOException {
        writeFieldName(str);
        writeBoolean(z);
    }

    public void writeNullField(String str) throws IOException {
        writeFieldName(str);
        writeNull();
    }

    public void writeStringField(String str, String str2) throws IOException {
        writeFieldName(str);
        writeString(str2);
    }

    public void writeNumberField(String str, short s) throws IOException {
        writeFieldName(str);
        writeNumber(s);
    }

    public void writeNumberField(String str, int i) throws IOException {
        writeFieldName(str);
        writeNumber(i);
    }

    public void writeNumberField(String str, long j) throws IOException {
        writeFieldName(str);
        writeNumber(j);
    }

    public void writeNumberField(String str, BigInteger bigInteger) throws IOException {
        writeFieldName(str);
        writeNumber(bigInteger);
    }

    public void writeNumberField(String str, float f) throws IOException {
        writeFieldName(str);
        writeNumber(f);
    }

    public void writeNumberField(String str, double d) throws IOException {
        writeFieldName(str);
        writeNumber(d);
    }

    public void writeNumberField(String str, BigDecimal bigDecimal) throws IOException {
        writeFieldName(str);
        writeNumber(bigDecimal);
    }

    public void writeArrayFieldStart(String str) throws IOException {
        writeFieldName(str);
        writeStartArray();
    }

    public void writeObjectFieldStart(String str) throws IOException {
        writeFieldName(str);
        writeStartObject();
    }

    public void writePOJOField(String str, Object obj) throws IOException {
        writeObjectField(str, obj);
    }

    public void writeObjectField(String str, Object obj) throws IOException {
        writeFieldName(str);
        writeObject(obj);
    }

    public void writeOmittedField(String str) throws IOException {
    }

    public void copyCurrentEvent(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.currentToken();
        switch (currentToken == null ? -1 : currentToken.id()) {
            case -1:
                throw _constructWriteException("No current event to copy");
            case 0:
            default:
                throw new IllegalStateException("Internal error: unknown current token, " + currentToken);
            case 1:
                writeStartObject();
                return;
            case 2:
                writeEndObject();
                return;
            case 3:
                writeStartArray();
                return;
            case 4:
                writeEndArray();
                return;
            case 5:
                writeFieldName(jsonParser.currentName());
                return;
            case 6:
                _copyCurrentStringValue(jsonParser);
                return;
            case 7:
                _copyCurrentIntValue(jsonParser);
                return;
            case 8:
                _copyCurrentFloatValue(jsonParser);
                return;
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
        }
    }

    public void copyCurrentEventExact(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.currentToken();
        switch (currentToken == null ? -1 : currentToken.id()) {
            case -1:
                throw _constructWriteException("No current event to copy");
            case 0:
            default:
                throw new IllegalStateException("Internal error: unknown current token, " + currentToken);
            case 1:
                writeStartObject();
                return;
            case 2:
                writeEndObject();
                return;
            case 3:
                writeStartArray();
                return;
            case 4:
                writeEndArray();
                return;
            case 5:
                writeFieldName(jsonParser.currentName());
                return;
            case 6:
                _copyCurrentStringValue(jsonParser);
                return;
            case 7:
                _copyCurrentIntValue(jsonParser);
                return;
            case 8:
                _copyCurrentFloatValueExact(jsonParser);
                return;
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
        }
    }

    public void copyCurrentStructure(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.currentToken();
        int id = currentToken == null ? -1 : currentToken.id();
        if (id == 5) {
            writeFieldName(jsonParser.currentName());
            JsonToken nextToken = jsonParser.nextToken();
            id = nextToken == null ? -1 : nextToken.id();
        }
        switch (id) {
            case 1:
                writeStartObject();
                _copyCurrentContents(jsonParser);
                return;
            case 3:
                writeStartArray();
                _copyCurrentContents(jsonParser);
                return;
            default:
                copyCurrentEvent(jsonParser);
                return;
        }
    }

    protected void _copyCurrentContents(JsonParser jsonParser) throws IOException {
        int i = 1;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken != null) {
                switch (nextToken.id()) {
                    case 1:
                        writeStartObject();
                        i++;
                        break;
                    case 2:
                        writeEndObject();
                        i--;
                        if (i != 0) {
                            break;
                        } else {
                            return;
                        }
                    case 3:
                        writeStartArray();
                        i++;
                        break;
                    case 4:
                        writeEndArray();
                        i--;
                        if (i != 0) {
                            break;
                        } else {
                            return;
                        }
                    case 5:
                        writeFieldName(jsonParser.currentName());
                        break;
                    case 6:
                        _copyCurrentStringValue(jsonParser);
                        break;
                    case 7:
                        _copyCurrentIntValue(jsonParser);
                        break;
                    case 8:
                        _copyCurrentFloatValue(jsonParser);
                        break;
                    case 9:
                        writeBoolean(true);
                        break;
                    case 10:
                        writeBoolean(false);
                        break;
                    case 11:
                        writeNull();
                        break;
                    case 12:
                        writeObject(jsonParser.getEmbeddedObject());
                        break;
                    default:
                        throw new IllegalStateException("Internal error: unknown current token, " + nextToken);
                }
            } else {
                return;
            }
        }
    }

    protected void _copyCurrentFloatValue(JsonParser jsonParser) throws IOException {
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        if (numberType == JsonParser.NumberType.BIG_DECIMAL) {
            writeNumber(jsonParser.getDecimalValue());
        } else if (numberType == JsonParser.NumberType.FLOAT) {
            writeNumber(jsonParser.getFloatValue());
        } else {
            writeNumber(jsonParser.getDoubleValue());
        }
    }

    protected void _copyCurrentFloatValueExact(JsonParser jsonParser) throws IOException {
        Number numberValueExact = jsonParser.getNumberValueExact();
        if (numberValueExact instanceof BigDecimal) {
            writeNumber((BigDecimal) numberValueExact);
        } else if (numberValueExact instanceof Double) {
            writeNumber(numberValueExact.doubleValue());
        } else {
            writeNumber(numberValueExact.floatValue());
        }
    }

    protected void _copyCurrentIntValue(JsonParser jsonParser) throws IOException {
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        if (numberType == JsonParser.NumberType.INT) {
            writeNumber(jsonParser.getIntValue());
        } else if (numberType == JsonParser.NumberType.LONG) {
            writeNumber(jsonParser.getLongValue());
        } else {
            writeNumber(jsonParser.getBigIntegerValue());
        }
    }

    protected void _copyCurrentStringValue(JsonParser jsonParser) throws IOException {
        if (jsonParser.hasTextCharacters()) {
            writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
        } else {
            writeString(jsonParser.getText());
        }
    }

    @Override
    public abstract void flush() throws IOException;

    public abstract boolean isClosed();

    @Override
    public abstract void close() throws IOException;

    public void _reportError(String str) throws JsonGenerationException {
        throw ((JsonGenerationException) _constructWriteException(str));
    }

    public final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    public void _reportUnsupportedOperation() {
        _reportUnsupportedOperation("Operation not supported by `JsonGenerator` of type " + getClass().getName());
    }

    protected void _reportUnsupportedOperation(String str) {
        throw new UnsupportedOperationException(str);
    }

    protected StreamWriteException _constructWriteException(String str) {
        return new JsonGenerationException(str, this);
    }

    protected StreamWriteException _constructWriteException(String str, Object obj) {
        return _constructWriteException(String.format(str, obj));
    }

    protected StreamWriteException _constructWriteException(String str, Object obj, Object obj2) {
        return _constructWriteException(String.format(str, obj, obj2));
    }

    protected StreamWriteException _constructWriteException(String str, Throwable th) {
        return new JsonGenerationException(str, th, this);
    }

    protected final void _verifyOffsets(int i, int i2, int i3) {
        if (i2 < 0 || i2 + i3 > i) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i)));
        }
    }

    public void _writeSimpleObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj instanceof String) {
            writeString((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                writeNumber(number.intValue());
                return;
            }
            if (number instanceof Long) {
                writeNumber(number.longValue());
                return;
            }
            if (number instanceof Double) {
                writeNumber(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                writeNumber(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                writeNumber(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                writeNumber(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                writeNumber((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                writeNumber((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                writeNumber(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                writeNumber(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            writeBinary((byte[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            writeBoolean(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }
}
