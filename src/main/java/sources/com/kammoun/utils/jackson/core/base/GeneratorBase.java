package com.kammoun.utils.jackson.core.base;

import com.kammoun.utils.jackson.core.Base64Variant;
import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonStreamContext;
import com.kammoun.utils.jackson.core.ObjectCodec;
import com.kammoun.utils.jackson.core.PrettyPrinter;
import com.kammoun.utils.jackson.core.SerializableString;
import com.kammoun.utils.jackson.core.TreeNode;
import com.kammoun.utils.jackson.core.Version;
import com.kammoun.utils.jackson.core.io.IOContext;
import com.kammoun.utils.jackson.core.io.UTF8Writer;
import com.kammoun.utils.jackson.core.json.DupDetector;
import com.kammoun.utils.jackson.core.json.JsonWriteContext;
import com.kammoun.utils.jackson.core.json.PackageVersion;
import com.kammoun.utils.jackson.core.util.DefaultPrettyPrinter;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

public abstract class GeneratorBase extends JsonGenerator {
    public static final int SURR1_FIRST = 55296;
    public static final int SURR1_LAST = 56319;
    public static final int SURR2_FIRST = 56320;
    public static final int SURR2_LAST = 57343;
    protected static final int DERIVED_FEATURES_MASK = (JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
    protected static final String WRITE_BINARY = "write a binary value";
    protected static final String WRITE_BOOLEAN = "write a boolean value";
    protected static final String WRITE_NULL = "write a null";
    protected static final String WRITE_NUMBER = "write a number";
    protected static final String WRITE_RAW = "write a raw (unencoded) value";
    protected static final String WRITE_STRING = "write a string";
    protected static final int MAX_BIG_DECIMAL_SCALE = 9999;
    protected ObjectCodec _objectCodec;
    protected int _features;
    protected final IOContext _ioContext;
    protected boolean _cfgNumbersAsStrings;
    protected JsonWriteContext _writeContext;
    protected boolean _closed;

    @Deprecated
    protected GeneratorBase(int i, ObjectCodec objectCodec) {
        this(i, objectCodec, (IOContext) null);
    }

    public GeneratorBase(int i, ObjectCodec objectCodec, IOContext iOContext) {
        this._features = i;
        this._objectCodec = objectCodec;
        this._ioContext = iOContext;
        this._writeContext = JsonWriteContext.createRootContext(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? DupDetector.rootDetector(this) : null);
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    @Deprecated
    protected GeneratorBase(int i, ObjectCodec objectCodec, JsonWriteContext jsonWriteContext) {
        this(i, objectCodec, null, jsonWriteContext);
    }

    protected GeneratorBase(int i, ObjectCodec objectCodec, IOContext iOContext, JsonWriteContext jsonWriteContext) {
        this._features = i;
        this._objectCodec = objectCodec;
        this._ioContext = iOContext;
        this._writeContext = jsonWriteContext;
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    @Override
    public Version version() {
        return PackageVersion.VERSION;
    }

    @Override
    public Object currentValue() {
        return this._writeContext.getCurrentValue();
    }

    @Override
    public void assignCurrentValue(Object obj) {
        if (this._writeContext != null) {
            this._writeContext.setCurrentValue(obj);
        }
    }

    @Override
    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (this._features & feature.getMask()) != 0;
    }

    @Override
    public int getFeatureMask() {
        return this._features;
    }

    @Override
    public JsonGenerator enable(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this._features |= mask;
        if ((mask & DERIVED_FEATURES_MASK) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = true;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(127);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION && this._writeContext.getDupDetector() == null) {
                this._writeContext = this._writeContext.withDupDetector(DupDetector.rootDetector(this));
            }
        }
        return this;
    }

    @Override
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this._features &= mask ^ (-1);
        if ((mask & DERIVED_FEATURES_MASK) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = false;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(0);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                this._writeContext = this._writeContext.withDupDetector(null);
            }
        }
        return this;
    }

    @Override
    @Deprecated
    public JsonGenerator setFeatureMask(int i) {
        int i2 = i ^ this._features;
        this._features = i;
        if (i2 != 0) {
            _checkStdFeatureChanges(i, i2);
        }
        return this;
    }

    @Override
    public JsonGenerator overrideStdFeatures(int i, int i2) {
        int i3 = this._features;
        int i4 = (i3 & (i2 ^ (-1))) | (i & i2);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this._features = i4;
            _checkStdFeatureChanges(i4, i5);
        }
        return this;
    }

    public void _checkStdFeatureChanges(int i, int i2) {
        if ((i2 & DERIVED_FEATURES_MASK) == 0) {
            return;
        }
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i2)) {
            if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i)) {
                setHighestNonEscapedChar(127);
            } else {
                setHighestNonEscapedChar(0);
            }
        }
        if (JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i2)) {
            if (!JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i)) {
                this._writeContext = this._writeContext.withDupDetector(null);
            } else if (this._writeContext.getDupDetector() == null) {
                this._writeContext = this._writeContext.withDupDetector(DupDetector.rootDetector(this));
            }
        }
    }

    @Override
    public JsonGenerator useDefaultPrettyPrinter() {
        return getPrettyPrinter() != null ? this : setPrettyPrinter(_constructDefaultPrettyPrinter());
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
    public JsonStreamContext getOutputContext() {
        return this._writeContext;
    }

    public IOContext ioContext() {
        return this._ioContext;
    }

    @Override
    public void writeStartObject(Object obj) throws IOException {
        writeStartObject();
        if (obj != null) {
            assignCurrentValue(obj);
        }
    }

    @Override
    public void writeFieldName(SerializableString serializableString) throws IOException {
        writeFieldName(serializableString.getValue());
    }

    @Override
    public void writeString(SerializableString serializableString) throws IOException {
        writeString(serializableString.getValue());
    }

    @Override
    public void writeRawValue(String str) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(str);
    }

    @Override
    public void writeRawValue(String str, int i, int i2) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(str, i, i2);
    }

    @Override
    public void writeRawValue(char[] cArr, int i, int i2) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(cArr, i, i2);
    }

    @Override
    public void writeRawValue(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(serializableString);
    }

    @Override
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException {
        _reportUnsupportedOperation();
        return 0;
    }

    @Override
    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
        } else if (this._objectCodec != null) {
            this._objectCodec.writeValue(this, obj);
        } else {
            _writeSimpleObject(obj);
        }
    }

    @Override
    public void writeTree(TreeNode treeNode) throws IOException {
        if (treeNode == null) {
            writeNull();
        } else {
            if (this._objectCodec == null) {
                throw new IllegalStateException("No ObjectCodec defined");
            }
            this._objectCodec.writeValue(this, treeNode);
        }
    }

    @Override
    public abstract void flush() throws IOException;

    @Override
    public void close() throws IOException {
        if (this._closed) {
            return;
        }
        if (this._ioContext != null) {
            this._ioContext.close();
        }
        this._closed = true;
    }

    @Override
    public boolean isClosed() {
        return this._closed;
    }

    protected abstract void _releaseBuffers();

    protected abstract void _verifyValueWrite(String str) throws IOException;

    protected PrettyPrinter _constructDefaultPrettyPrinter() {
        return new DefaultPrettyPrinter();
    }

    public String _asString(BigDecimal bigDecimal) throws IOException {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._features)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale < -9999 || scale > MAX_BIG_DECIMAL_SCALE) {
            _reportError(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(scale), Integer.valueOf(MAX_BIG_DECIMAL_SCALE), Integer.valueOf(MAX_BIG_DECIMAL_SCALE)));
        }
        return bigDecimal.toPlainString();
    }

    public final int _decodeSurrogate(int i, int i2) throws IOException {
        if (i2 < 56320 || i2 > 57343) {
            _reportError(String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        return (i << 10) + i2 + UTF8Writer.SURROGATE_BASE;
    }

    public void _checkRangeBoundsForByteArray(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            _reportError("Invalid `byte[]` argument: `null`");
        }
        int length = bArr.length;
        int i3 = i + i2;
        if ((i | i2 | i3 | (length - i3)) < 0) {
            _reportError(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
        }
    }

    public void _checkRangeBoundsForCharArray(char[] cArr, int i, int i2) throws IOException {
        if (cArr == null) {
            _reportError("Invalid `char[]` argument: `null`");
        }
        int length = cArr.length;
        int i3 = i + i2;
        if ((i | i2 | i3 | (length - i3)) < 0) {
            _reportError(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
        }
    }

    public void _checkRangeBoundsForString(String str, int i, int i2) throws IOException {
        if (str == null) {
            _reportError("Invalid `String` argument: `null`");
        }
        int length = str.length();
        int i3 = i + i2;
        if ((i | i2 | i3 | (length - i3)) < 0) {
            _reportError(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `String` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
        }
    }
}
