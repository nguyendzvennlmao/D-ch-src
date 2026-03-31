package com.kammoun.utils.jackson.core.base;

import com.kammoun.utils.jackson.core.Base64Variant;
import com.kammoun.utils.jackson.core.JsonLocation;
import com.kammoun.utils.jackson.core.JsonParseException;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonProcessingException;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.StreamReadCapability;
import com.kammoun.utils.jackson.core.StreamReadConstraints;
import com.kammoun.utils.jackson.core.StreamReadFeature;
import com.kammoun.utils.jackson.core.Version;
import com.kammoun.utils.jackson.core.exc.StreamConstraintsException;
import com.kammoun.utils.jackson.core.io.ContentReference;
import com.kammoun.utils.jackson.core.io.IOContext;
import com.kammoun.utils.jackson.core.io.NumberInput;
import com.kammoun.utils.jackson.core.json.DupDetector;
import com.kammoun.utils.jackson.core.json.JsonReadContext;
import com.kammoun.utils.jackson.core.json.PackageVersion;
import com.kammoun.utils.jackson.core.util.ByteArrayBuilder;
import com.kammoun.utils.jackson.core.util.JacksonFeatureSet;
import com.kammoun.utils.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public abstract class ParserBase extends ParserMinimalBase {
    protected static final JacksonFeatureSet<StreamReadCapability> JSON_READ_CAPABILITIES = DEFAULT_READ_CAPABILITIES;
    protected final IOContext _ioContext;
    protected final StreamReadConstraints _streamReadConstraints;
    protected boolean _closed;
    protected int _inputPtr;
    protected int _inputEnd;
    protected long _currInputProcessed;
    protected int _currInputRow;
    protected int _currInputRowStart;
    protected long _tokenInputTotal;
    protected int _tokenInputRow;
    protected int _tokenInputCol;
    protected JsonReadContext _parsingContext;
    protected JsonToken _nextToken;
    protected final TextBuffer _textBuffer;
    protected char[] _nameCopyBuffer;
    protected boolean _nameCopied;
    protected ByteArrayBuilder _byteArrayBuilder;
    protected byte[] _binaryValue;
    protected int _numTypesValid;
    protected int _numberInt;
    protected long _numberLong;
    protected float _numberFloat;
    protected double _numberDouble;
    protected BigInteger _numberBigInt;
    protected BigDecimal _numberBigDecimal;
    protected String _numberString;
    protected boolean _numberIsNaN;
    protected boolean _numberNegative;
    protected int _intLength;
    protected int _fractLength;
    protected int _expLength;

    public ParserBase(IOContext iOContext, int i) {
        super(i);
        this._currInputRow = 1;
        this._tokenInputRow = 1;
        this._numTypesValid = 0;
        this._ioContext = iOContext;
        StreamReadConstraints streamReadConstraints = iOContext.streamReadConstraints();
        this._streamReadConstraints = streamReadConstraints == null ? StreamReadConstraints.defaults() : streamReadConstraints;
        this._textBuffer = iOContext.constructReadConstrainedTextBuffer();
        this._parsingContext = JsonReadContext.createRootContext(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? DupDetector.rootDetector(this) : null);
    }

    @Override
    public Version version() {
        return PackageVersion.VERSION;
    }

    @Override
    public Object currentValue() {
        return this._parsingContext.getCurrentValue();
    }

    @Override
    public void assignCurrentValue(Object obj) {
        this._parsingContext.setCurrentValue(obj);
    }

    @Override
    public JsonParser enable(JsonParser.Feature feature) {
        this._features |= feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION && this._parsingContext.getDupDetector() == null) {
            this._parsingContext = this._parsingContext.withDupDetector(DupDetector.rootDetector(this));
        }
        return this;
    }

    @Override
    public JsonParser disable(JsonParser.Feature feature) {
        this._features &= feature.getMask() ^ (-1);
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION) {
            this._parsingContext = this._parsingContext.withDupDetector(null);
        }
        return this;
    }

    @Override
    @Deprecated
    public JsonParser setFeatureMask(int i) {
        int i2 = this._features ^ i;
        if (i2 != 0) {
            this._features = i;
            _checkStdFeatureChanges(i, i2);
        }
        return this;
    }

    @Override
    public JsonParser overrideStdFeatures(int i, int i2) {
        int i3 = this._features;
        int i4 = (i3 & (i2 ^ (-1))) | (i & i2);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this._features = i4;
            _checkStdFeatureChanges(i4, i5);
        }
        return this;
    }

    protected void _checkStdFeatureChanges(int i, int i2) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i2 & mask) == 0 || (i & mask) == 0) {
            return;
        }
        if (this._parsingContext.getDupDetector() == null) {
            this._parsingContext = this._parsingContext.withDupDetector(DupDetector.rootDetector(this));
        } else {
            this._parsingContext = this._parsingContext.withDupDetector(null);
        }
    }

    @Override
    @Deprecated
    public String getCurrentName() throws IOException {
        JsonReadContext parent;
        return ((this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) && (parent = this._parsingContext.getParent()) != null) ? parent.getCurrentName() : this._parsingContext.getCurrentName();
    }

    @Override
    public void overrideCurrentName(String str) {
        JsonReadContext jsonReadContext = this._parsingContext;
        if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
            jsonReadContext = jsonReadContext.getParent();
        }
        try {
            jsonReadContext.setCurrentName(str);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void close() throws IOException {
        if (this._closed) {
            return;
        }
        this._inputPtr = Math.max(this._inputPtr, this._inputEnd);
        this._closed = true;
        try {
            _closeInput();
        } finally {
            _releaseBuffers();
            this._ioContext.close();
        }
    }

    @Override
    public boolean isClosed() {
        return this._closed;
    }

    @Override
    public JsonReadContext getParsingContext() {
        return this._parsingContext;
    }

    @Override
    @Deprecated
    public JsonLocation getTokenLocation() {
        return new JsonLocation(_contentReference(), -1L, getTokenCharacterOffset(), getTokenLineNr(), getTokenColumnNr());
    }

    @Override
    @Deprecated
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_contentReference(), -1L, this._currInputProcessed + this._inputPtr, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override
    public boolean hasTextCharacters() {
        if (this._currToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    @Override
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        if (this._binaryValue == null) {
            if (this._currToken != JsonToken.VALUE_STRING) {
                _reportError("Current token (" + this._currToken + ") not VALUE_STRING, can not access as binary");
            }
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    public long getTokenCharacterOffset() {
        return this._tokenInputTotal;
    }

    public int getTokenLineNr() {
        return this._tokenInputRow;
    }

    public int getTokenColumnNr() {
        int i = this._tokenInputCol;
        return i < 0 ? i : i + 1;
    }

    protected abstract void _closeInput() throws IOException;

    public void _releaseBuffers() throws IOException {
        this._textBuffer.releaseBuffers();
        char[] cArr = this._nameCopyBuffer;
        if (cArr != null) {
            this._nameCopyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr);
        }
    }

    @Override
    public void _handleEOF() throws JsonParseException {
        if (this._parsingContext.inRoot()) {
            return;
        }
        _reportInvalidEOF(String.format(": expected close marker for %s (start marker at %s)", this._parsingContext.inArray() ? "Array" : "Object", this._parsingContext.startLocation(_contentReference())), null);
    }

    public final int _eofAsNextChar() throws JsonParseException {
        _handleEOF();
        return -1;
    }

    public ByteArrayBuilder _getByteArrayBuilder() {
        if (this._byteArrayBuilder == null) {
            this._byteArrayBuilder = new ByteArrayBuilder();
        } else {
            this._byteArrayBuilder.reset();
        }
        return this._byteArrayBuilder;
    }

    protected final JsonToken reset(boolean z, int i, int i2, int i3) throws IOException {
        return (i2 >= 1 || i3 >= 1) ? resetFloat(z, i, i2, i3) : resetInt(z, i);
    }

    public final JsonToken resetInt(boolean z, int i) throws IOException {
        this._streamReadConstraints.validateIntegerLength(i);
        this._numberNegative = z;
        this._numberIsNaN = false;
        this._intLength = i;
        this._fractLength = 0;
        this._expLength = 0;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    public final JsonToken resetFloat(boolean z, int i, int i2, int i3) throws IOException {
        this._streamReadConstraints.validateFPLength(i + i2 + i3);
        this._numberNegative = z;
        this._numberIsNaN = false;
        this._intLength = i;
        this._fractLength = i2;
        this._expLength = i3;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken resetAsNaN(String str, double d) throws IOException {
        this._textBuffer.resetWithString(str);
        this._numberDouble = d;
        this._numTypesValid = 8;
        this._numberIsNaN = true;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override
    public boolean isNaN() throws IOException {
        return this._currToken == JsonToken.VALUE_NUMBER_FLOAT && this._numberIsNaN;
    }

    @Override
    public Number getNumberValue() throws IOException {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            if ((this._numTypesValid & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((this._numTypesValid & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((this._numTypesValid & 4) != 0) {
                return _getBigInteger();
            }
            _throwInternal();
        }
        if ((this._numTypesValid & 16) != 0) {
            return _getBigDecimal();
        }
        if ((this._numTypesValid & 32) != 0) {
            return Float.valueOf(_getNumberFloat());
        }
        if ((this._numTypesValid & 8) == 0) {
            _throwInternal();
        }
        return Double.valueOf(_getNumberDouble());
    }

    @Override
    public Number getNumberValueExact() throws IOException {
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(0);
            }
            if ((this._numTypesValid & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((this._numTypesValid & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((this._numTypesValid & 4) != 0) {
                return _getBigInteger();
            }
            _throwInternal();
        }
        if (this._numTypesValid == 0) {
            _parseNumericValue(16);
        }
        if ((this._numTypesValid & 16) != 0) {
            return _getBigDecimal();
        }
        if ((this._numTypesValid & 32) != 0) {
            return Float.valueOf(_getNumberFloat());
        }
        if ((this._numTypesValid & 8) == 0) {
            _throwInternal();
        }
        return Double.valueOf(_getNumberDouble());
    }

    @Override
    public Object getNumberValueDeferred() throws IOException {
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(0);
            }
            if ((this._numTypesValid & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((this._numTypesValid & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((this._numTypesValid & 4) != 0) {
                return this._numberBigInt != null ? this._numberBigInt : this._numberString != null ? this._numberString : _getBigInteger();
            }
            _throwInternal();
        }
        return this._currToken == JsonToken.VALUE_NUMBER_FLOAT ? (this._numTypesValid & 16) != 0 ? _getBigDecimal() : (this._numTypesValid & 8) != 0 ? Double.valueOf(_getNumberDouble()) : (this._numTypesValid & 32) != 0 ? Float.valueOf(_getNumberFloat()) : this._textBuffer.contentsAsString() : getNumberValue();
    }

    @Override
    public JsonParser.NumberType getNumberType() throws IOException {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        return this._currToken == JsonToken.VALUE_NUMBER_INT ? (this._numTypesValid & 1) != 0 ? JsonParser.NumberType.INT : (this._numTypesValid & 2) != 0 ? JsonParser.NumberType.LONG : JsonParser.NumberType.BIG_INTEGER : (this._numTypesValid & 16) != 0 ? JsonParser.NumberType.BIG_DECIMAL : (this._numTypesValid & 32) != 0 ? JsonParser.NumberType.FLOAT : JsonParser.NumberType.DOUBLE;
    }

    @Override
    public int getIntValue() throws IOException {
        if ((this._numTypesValid & 1) == 0) {
            if (this._numTypesValid == 0) {
                return _parseIntValue();
            }
            if ((this._numTypesValid & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override
    public long getLongValue() throws IOException {
        if ((this._numTypesValid & 2) == 0) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(2);
            }
            if ((this._numTypesValid & 2) == 0) {
                convertNumberToLong();
            }
        }
        return this._numberLong;
    }

    @Override
    public BigInteger getBigIntegerValue() throws IOException {
        if ((this._numTypesValid & 4) == 0) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(4);
            }
            if ((this._numTypesValid & 4) == 0) {
                convertNumberToBigInteger();
            }
        }
        return _getBigInteger();
    }

    @Override
    public float getFloatValue() throws IOException {
        if ((this._numTypesValid & 32) == 0) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(32);
            }
            if ((this._numTypesValid & 32) == 0) {
                convertNumberToFloat();
            }
        }
        return _getNumberFloat();
    }

    @Override
    public double getDoubleValue() throws IOException {
        if ((this._numTypesValid & 8) == 0) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(8);
            }
            if ((this._numTypesValid & 8) == 0) {
                convertNumberToDouble();
            }
        }
        return _getNumberDouble();
    }

    @Override
    public BigDecimal getDecimalValue() throws IOException {
        if ((this._numTypesValid & 16) == 0) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(16);
            }
            if ((this._numTypesValid & 16) == 0) {
                convertNumberToBigDecimal();
            }
        }
        return _getBigDecimal();
    }

    @Override
    public StreamReadConstraints streamReadConstraints() {
        return this._streamReadConstraints;
    }

    protected void _parseNumericValue(int i) throws IOException {
        if (this._closed) {
            _reportError("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this._currToken != JsonToken.VALUE_NUMBER_INT) {
            if (this._currToken == JsonToken.VALUE_NUMBER_FLOAT) {
                _parseSlowFloat(i);
                return;
            } else {
                _reportError("Current token (%s) not numeric, can not use numeric value accessors", this._currToken);
                return;
            }
        }
        int i2 = this._intLength;
        if (i2 <= 9) {
            this._numberInt = this._textBuffer.contentsAsInt(this._numberNegative);
            this._numTypesValid = 1;
            return;
        }
        if (i2 > 18) {
            if (i2 == 19) {
                char[] textBuffer = this._textBuffer.getTextBuffer();
                int textOffset = this._textBuffer.getTextOffset();
                if (this._numberNegative) {
                    textOffset++;
                }
                if (NumberInput.inLongRange(textBuffer, textOffset, i2, this._numberNegative)) {
                    this._numberLong = NumberInput.parseLong19(textBuffer, textOffset, this._numberNegative);
                    this._numTypesValid = 2;
                    return;
                }
            }
            _parseSlowInt(i);
            return;
        }
        long contentsAsLong = this._textBuffer.contentsAsLong(this._numberNegative);
        if (i2 == 10) {
            if (this._numberNegative) {
                if (contentsAsLong >= -2147483648L) {
                    this._numberInt = (int) contentsAsLong;
                    this._numTypesValid = 1;
                    return;
                }
            } else if (contentsAsLong <= 2147483647L) {
                this._numberInt = (int) contentsAsLong;
                this._numTypesValid = 1;
                return;
            }
        }
        this._numberLong = contentsAsLong;
        this._numTypesValid = 2;
    }

    public int _parseIntValue() throws IOException {
        if (this._closed) {
            _reportError("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this._currToken != JsonToken.VALUE_NUMBER_INT || this._intLength > 9) {
            _parseNumericValue(1);
            if ((this._numTypesValid & 1) == 0) {
                convertNumberToInt();
            }
            return this._numberInt;
        }
        int contentsAsInt = this._textBuffer.contentsAsInt(this._numberNegative);
        this._numberInt = contentsAsInt;
        this._numTypesValid = 1;
        return contentsAsInt;
    }

    private void _parseSlowFloat(int i) throws IOException {
        if (i == 16) {
            this._numberBigDecimal = null;
            this._numberString = this._textBuffer.contentsAsString();
            this._numTypesValid = 16;
        } else if (i == 32) {
            this._numberFloat = 0.0f;
            this._numberString = this._textBuffer.contentsAsString();
            this._numTypesValid = 32;
        } else {
            this._numberDouble = 0.0d;
            this._numberString = this._textBuffer.contentsAsString();
            this._numTypesValid = 8;
        }
    }

    private void _parseSlowInt(int i) throws IOException {
        String contentsAsString = this._textBuffer.contentsAsString();
        if (i == 1 || i == 2) {
            _reportTooLongIntegral(i, contentsAsString);
        }
        if (i == 8 || i == 32) {
            this._numberString = contentsAsString;
            this._numTypesValid = 8;
        } else {
            this._numberBigInt = null;
            this._numberString = contentsAsString;
            this._numTypesValid = 4;
        }
    }

    protected void _reportTooLongIntegral(int i, String str) throws IOException {
        if (i == 1) {
            reportOverflowInt(str);
        } else {
            reportOverflowLong(str);
        }
    }

    public void convertNumberToInt() throws IOException {
        if ((this._numTypesValid & 2) != 0) {
            int i = (int) this._numberLong;
            if (i != this._numberLong) {
                reportOverflowInt(getText(), currentToken());
            }
            this._numberInt = i;
        } else if ((this._numTypesValid & 4) != 0) {
            BigInteger _getBigInteger = _getBigInteger();
            if (BI_MIN_INT.compareTo(_getBigInteger) > 0 || BI_MAX_INT.compareTo(_getBigInteger) < 0) {
                reportOverflowInt();
            }
            this._numberInt = _getBigInteger.intValue();
        } else if ((this._numTypesValid & 8) != 0) {
            double _getNumberDouble = _getNumberDouble();
            if (_getNumberDouble < -2.147483648E9d || _getNumberDouble > 2.147483647E9d) {
                reportOverflowInt();
            }
            this._numberInt = (int) _getNumberDouble;
        } else if ((this._numTypesValid & 16) != 0) {
            BigDecimal _getBigDecimal = _getBigDecimal();
            if (BD_MIN_INT.compareTo(_getBigDecimal) > 0 || BD_MAX_INT.compareTo(_getBigDecimal) < 0) {
                reportOverflowInt();
            }
            this._numberInt = _getBigDecimal.intValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 1;
    }

    protected void convertNumberToLong() throws IOException {
        if ((this._numTypesValid & 1) != 0) {
            this._numberLong = this._numberInt;
        } else if ((this._numTypesValid & 4) != 0) {
            BigInteger _getBigInteger = _getBigInteger();
            if (BI_MIN_LONG.compareTo(_getBigInteger) > 0 || BI_MAX_LONG.compareTo(_getBigInteger) < 0) {
                reportOverflowLong();
            }
            this._numberLong = _getBigInteger.longValue();
        } else if ((this._numTypesValid & 8) != 0) {
            double _getNumberDouble = _getNumberDouble();
            if (_getNumberDouble < -9.223372036854776E18d || _getNumberDouble > 9.223372036854776E18d) {
                reportOverflowLong();
            }
            this._numberLong = (long) _getNumberDouble;
        } else if ((this._numTypesValid & 16) != 0) {
            BigDecimal _getBigDecimal = _getBigDecimal();
            if (BD_MIN_LONG.compareTo(_getBigDecimal) > 0 || BD_MAX_LONG.compareTo(_getBigDecimal) < 0) {
                reportOverflowLong();
            }
            this._numberLong = _getBigDecimal.longValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 2;
    }

    protected void convertNumberToBigInteger() throws IOException {
        if ((this._numTypesValid & 16) != 0) {
            this._numberBigInt = _convertBigDecimalToBigInteger(_getBigDecimal());
        } else if ((this._numTypesValid & 2) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberLong);
        } else if ((this._numTypesValid & 1) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberInt);
        } else if ((this._numTypesValid & 8) == 0) {
            _throwInternal();
        } else if (this._numberString != null) {
            this._numberBigInt = _convertBigDecimalToBigInteger(_getBigDecimal());
        } else {
            this._numberBigInt = _convertBigDecimalToBigInteger(BigDecimal.valueOf(_getNumberDouble()));
        }
        this._numTypesValid |= 4;
    }

    protected void convertNumberToDouble() throws IOException {
        if ((this._numTypesValid & 16) != 0) {
            if (this._numberString != null) {
                this._numberDouble = _getNumberDouble();
            } else {
                this._numberDouble = _getBigDecimal().doubleValue();
            }
        } else if ((this._numTypesValid & 4) != 0) {
            if (this._numberString != null) {
                this._numberDouble = _getNumberDouble();
            } else {
                this._numberDouble = _getBigInteger().doubleValue();
            }
        } else if ((this._numTypesValid & 2) != 0) {
            this._numberDouble = this._numberLong;
        } else if ((this._numTypesValid & 1) != 0) {
            this._numberDouble = this._numberInt;
        } else if ((this._numTypesValid & 32) == 0) {
            _throwInternal();
        } else if (this._numberString != null) {
            this._numberDouble = _getNumberDouble();
        } else {
            this._numberDouble = _getNumberFloat();
        }
        this._numTypesValid |= 8;
    }

    protected void convertNumberToFloat() throws IOException {
        if ((this._numTypesValid & 16) != 0) {
            if (this._numberString != null) {
                this._numberFloat = _getNumberFloat();
            } else {
                this._numberFloat = _getBigDecimal().floatValue();
            }
        } else if ((this._numTypesValid & 4) != 0) {
            if (this._numberString != null) {
                this._numberFloat = _getNumberFloat();
            } else {
                this._numberFloat = _getBigInteger().floatValue();
            }
        } else if ((this._numTypesValid & 2) != 0) {
            this._numberFloat = (float) this._numberLong;
        } else if ((this._numTypesValid & 1) != 0) {
            this._numberFloat = this._numberInt;
        } else if ((this._numTypesValid & 8) == 0) {
            _throwInternal();
        } else if (this._numberString != null) {
            this._numberFloat = _getNumberFloat();
        } else {
            this._numberFloat = (float) _getNumberDouble();
        }
        this._numTypesValid |= 32;
    }

    protected void convertNumberToBigDecimal() throws IOException {
        if ((this._numTypesValid & 8) != 0) {
            this._numberBigDecimal = NumberInput.parseBigDecimal(this._numberString == null ? getText() : this._numberString, isEnabled(StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER));
        } else if ((this._numTypesValid & 4) != 0) {
            this._numberBigDecimal = new BigDecimal(_getBigInteger());
        } else if ((this._numTypesValid & 2) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberLong);
        } else if ((this._numTypesValid & 1) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberInt);
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 16;
    }

    protected BigInteger _convertBigDecimalToBigInteger(BigDecimal bigDecimal) throws IOException {
        this._streamReadConstraints.validateBigIntegerScale(bigDecimal.scale());
        return bigDecimal.toBigInteger();
    }

    protected BigInteger _getBigInteger() throws JsonParseException {
        if (this._numberBigInt != null) {
            return this._numberBigInt;
        }
        if (this._numberString == null) {
            throw new IllegalStateException("cannot get BigInteger from current parser state");
        }
        try {
            this._numberBigInt = NumberInput.parseBigInteger(this._numberString, isEnabled(StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER));
        } catch (NumberFormatException e) {
            _wrapError("Malformed numeric value (" + _longNumberDesc(this._numberString) + ")", e);
        }
        this._numberString = null;
        return this._numberBigInt;
    }

    protected BigDecimal _getBigDecimal() throws JsonParseException {
        if (this._numberBigDecimal != null) {
            return this._numberBigDecimal;
        }
        if (this._numberString == null) {
            throw new IllegalStateException("cannot get BigDecimal from current parser state");
        }
        try {
            this._numberBigDecimal = NumberInput.parseBigDecimal(this._numberString, isEnabled(StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER));
        } catch (NumberFormatException e) {
            _wrapError("Malformed numeric value (" + _longNumberDesc(this._numberString) + ")", e);
        }
        this._numberString = null;
        return this._numberBigDecimal;
    }

    protected double _getNumberDouble() throws JsonParseException {
        if (this._numberString != null) {
            try {
                this._numberDouble = NumberInput.parseDouble(this._numberString, isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER));
            } catch (NumberFormatException e) {
                _wrapError("Malformed numeric value (" + _longNumberDesc(this._numberString) + ")", e);
            }
            this._numberString = null;
        }
        return this._numberDouble;
    }

    protected float _getNumberFloat() throws JsonParseException {
        if (this._numberString != null) {
            try {
                this._numberFloat = NumberInput.parseFloat(this._numberString, isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER));
            } catch (NumberFormatException e) {
                _wrapError("Malformed numeric value (" + _longNumberDesc(this._numberString) + ")", e);
            }
            this._numberString = null;
        }
        return this._numberFloat;
    }

    public void createChildArrayContext(int i, int i2) throws IOException {
        this._parsingContext = this._parsingContext.createChildArrayContext(i, i2);
        this._streamReadConstraints.validateNestingDepth(this._parsingContext.getNestingDepth());
    }

    public void createChildObjectContext(int i, int i2) throws IOException {
        this._parsingContext = this._parsingContext.createChildObjectContext(i, i2);
        this._streamReadConstraints.validateNestingDepth(this._parsingContext.getNestingDepth());
    }

    public char _handleUnrecognizedCharacterEscape(char c) throws JsonProcessingException {
        if (isEnabled(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        throw _constructReadException("Unrecognized character escape " + _getCharDesc(c), _currentLocationMinusOne());
    }

    public void _reportMismatchedEndMarker(int i, char c) throws JsonParseException {
        JsonReadContext parsingContext = getParsingContext();
        throw _constructReadException(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c), parsingContext.typeDesc(), parsingContext.startLocation(_contentReference())), _currentLocationMinusOne());
    }

    public void _throwUnquotedSpace(int i, String str) throws JsonParseException {
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32) {
            throw _constructReadException("Illegal unquoted character (" + _getCharDesc((char) i) + "): has to be escaped using backslash to be included in " + str, _currentLocationMinusOne());
        }
    }

    public String _validJsonTokenList() throws IOException {
        return _validJsonValueList();
    }

    public String _validJsonValueList() throws IOException {
        return isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'+INF'/'-INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    protected char _decodeEscaped() throws IOException {
        throw new UnsupportedOperationException();
    }

    public final int _decodeBase64Escape(Base64Variant base64Variant, int i, int i2) throws IOException {
        if (i != 92) {
            throw reportInvalidBase64Char(base64Variant, i, i2);
        }
        char _decodeEscaped = _decodeEscaped();
        if (_decodeEscaped <= ' ' && i2 == 0) {
            return -1;
        }
        int decodeBase64Char = base64Variant.decodeBase64Char((int) _decodeEscaped);
        if (decodeBase64Char >= 0 || decodeBase64Char == -2) {
            return decodeBase64Char;
        }
        throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i2);
    }

    public final int _decodeBase64Escape(Base64Variant base64Variant, char c, int i) throws IOException {
        if (c != '\\') {
            throw reportInvalidBase64Char(base64Variant, c, i);
        }
        char _decodeEscaped = _decodeEscaped();
        if (_decodeEscaped <= ' ' && i == 0) {
            return -1;
        }
        int decodeBase64Char = base64Variant.decodeBase64Char(_decodeEscaped);
        if (decodeBase64Char >= 0 || (decodeBase64Char == -2 && i >= 2)) {
            return decodeBase64Char;
        }
        throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i);
    }

    protected IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i, int i2) throws IllegalArgumentException {
        return reportInvalidBase64Char(base64Variant, i, i2, null);
    }

    public IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i, int i2, String str) throws IllegalArgumentException {
        String format = i <= 32 ? String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i), Integer.valueOf(i2 + 1)) : base64Variant.usesPaddingChar(i) ? "Unexpected padding character ('" + base64Variant.getPaddingChar() + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character" : (!Character.isDefined(i) || Character.isISOControl(i)) ? "Illegal character (code 0x" + Integer.toHexString(i) + ") in base64 content" : "Illegal character '" + ((char) i) + "' (code 0x" + Integer.toHexString(i) + ") in base64 content";
        if (str != null) {
            format = format + ": " + str;
        }
        return new IllegalArgumentException(format);
    }

    public void _handleBase64MissingPadding(Base64Variant base64Variant) throws IOException {
        _reportError(base64Variant.missingPaddingMessage());
    }

    @Deprecated
    protected Object _getSourceReference() {
        if (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this._features)) {
            return this._ioContext.contentReference().getRawContent();
        }
        return null;
    }

    public ContentReference _contentReference() {
        return JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this._features) ? this._ioContext.contentReference() : _contentReferenceRedacted();
    }

    protected ContentReference _contentReferenceRedacted() {
        return ContentReference.redacted();
    }

    public static int[] growArrayBy(int[] iArr, int i) throws IllegalArgumentException {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length + i;
        if (length < 0) {
            throw new IllegalArgumentException("Unable to grow array to longer than `Integer.MAX_VALUE`");
        }
        return Arrays.copyOf(iArr, length);
    }

    public int[] _growNameDecodeBuffer(int[] iArr, int i) throws StreamConstraintsException {
        this._streamReadConstraints.validateNameLength(iArr.length << 2);
        return growArrayBy(iArr, i);
    }

    @Deprecated
    protected void loadMoreGuaranteed() throws IOException {
        if (loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    @Deprecated
    protected boolean loadMore() throws IOException {
        return false;
    }

    protected void _finishString() throws IOException {
    }
}
