package com.kammoun.utils.jackson.core.json;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.core.Base64Variant;
import com.kammoun.utils.jackson.core.JsonFactory;
import com.kammoun.utils.jackson.core.JsonLocation;
import com.kammoun.utils.jackson.core.JsonParseException;
import com.kammoun.utils.jackson.core.JsonPointer;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.ObjectCodec;
import com.kammoun.utils.jackson.core.base.GeneratorBase;
import com.kammoun.utils.jackson.core.exc.StreamConstraintsException;
import com.kammoun.utils.jackson.core.io.CharTypes;
import com.kammoun.utils.jackson.core.io.IOContext;
import com.kammoun.utils.jackson.core.io.doubleparser.FastDoubleMath;
import com.kammoun.utils.jackson.core.sym.ByteQuadsCanonicalizer;
import com.kammoun.utils.jackson.core.util.ByteArrayBuilder;
import com.kammoun.utils.jackson.databind.deser.std.StdKeyDeserializer;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class UTF8DataInputJsonParser extends JsonParserBase {
    protected final ByteQuadsCanonicalizer _symbols;
    protected int[] _quadBuffer;
    protected boolean _tokenIncomplete;
    private int _quad1;
    protected DataInput _inputData;
    protected int _nextByte;

    public UTF8DataInputJsonParser(IOContext iOContext, int i, DataInput dataInput, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, int i2) {
        super(iOContext, i, objectCodec);
        this._quadBuffer = new int[16];
        this._nextByte = -1;
        this._symbols = byteQuadsCanonicalizer;
        this._inputData = dataInput;
        this._nextByte = i2;
    }

    @Override
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        return 0;
    }

    @Override
    public Object getInputSource() {
        return this._inputData;
    }

    @Override
    protected void _closeInput() throws IOException {
    }

    @Override
    protected void _releaseBuffers() throws IOException {
        super._releaseBuffers();
        this._symbols.release();
    }

    @Override
    public String getText() throws IOException {
        if (this._currToken != JsonToken.VALUE_STRING) {
            return _getText2(this._currToken);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    @Override
    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsToWriter(writer);
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            String currentName = this._parsingContext.getCurrentName();
            writer.write(currentName);
            return currentName.length();
        }
        if (jsonToken == null) {
            return 0;
        }
        if (jsonToken.isNumeric()) {
            return this._textBuffer.contentsToWriter(writer);
        }
        char[] asCharArray = jsonToken.asCharArray();
        writer.write(asCharArray);
        return asCharArray.length;
    }

    @Override
    public String getValueAsString() throws IOException {
        if (this._currToken != JsonToken.VALUE_STRING) {
            return this._currToken == JsonToken.FIELD_NAME ? currentName() : super.getValueAsString(null);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    @Override
    public String getValueAsString(String str) throws IOException {
        if (this._currToken != JsonToken.VALUE_STRING) {
            return this._currToken == JsonToken.FIELD_NAME ? currentName() : super.getValueAsString(str);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    @Override
    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(0);
        }
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
    public int getValueAsInt(int i) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(i);
        }
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

    protected final String _getText2(JsonToken jsonToken) throws IOException {
        if (jsonToken == null) {
            return null;
        }
        switch (jsonToken.id()) {
            case 5:
                return this._parsingContext.getCurrentName();
            case 6:
            case 7:
            case 8:
                return this._textBuffer.contentsAsString();
            default:
                return jsonToken.asString();
        }
    }

    @Override
    public char[] getTextCharacters() throws IOException {
        if (this._currToken == null) {
            return null;
        }
        switch (this._currToken.id()) {
            case 5:
                if (!this._nameCopied) {
                    String currentName = this._parsingContext.getCurrentName();
                    int length = currentName.length();
                    if (this._nameCopyBuffer == null) {
                        this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
                    } else if (this._nameCopyBuffer.length < length) {
                        this._nameCopyBuffer = new char[length];
                    }
                    currentName.getChars(0, length, this._nameCopyBuffer, 0);
                    this._nameCopied = true;
                }
                return this._nameCopyBuffer;
            case 6:
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                    break;
                }
                break;
            case 7:
            case 8:
                break;
            default:
                return this._currToken.asCharArray();
        }
        return this._textBuffer.getTextBuffer();
    }

    @Override
    public int getTextLength() throws IOException {
        if (this._currToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.size();
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return this._parsingContext.getCurrentName().length();
        }
        if (this._currToken != null) {
            return this._currToken.isNumeric() ? this._textBuffer.size() : this._currToken.asCharArray().length;
        }
        return 0;
    }

    @Override
    public int getTextOffset() throws IOException {
        if (this._currToken == null) {
            return 0;
        }
        switch (this._currToken.id()) {
            case 5:
                return 0;
            case 6:
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                    break;
                }
                break;
            case 7:
            case 8:
                break;
            default:
                return 0;
        }
        return this._textBuffer.getTextOffset();
    }

    @Override
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        if (this._currToken != JsonToken.VALUE_STRING && (this._currToken != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            _reportError("Current token (" + this._currToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e) {
                throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e.getMessage());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            int _readBinary = _readBinary(base64Variant, outputStream, allocBase64Buffer);
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
            return _readBinary;
        } catch (Throwable th) {
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
            throw th;
        }
    }

    protected int _readBinary(com.kammoun.utils.jackson.core.Base64Variant r8, java.io.OutputStream r9, byte[] r10) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.core.json.UTF8DataInputJsonParser._readBinary(com.kammoun.utils.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    @Override
    public JsonToken nextToken() throws IOException {
        JsonToken _handleUnexpectedValue;
        if (this._closed) {
            return null;
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        this._tokenInputRow = this._currInputRow;
        if ((_skipWSOrEnd | 32) == 125) {
            _closeScope(_skipWSOrEnd);
            return this._currToken;
        }
        if (this._parsingContext.expectComma()) {
            if (_skipWSOrEnd != 44) {
                _reportUnexpectedChar(_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            _skipWSOrEnd = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd | 32) == 125) {
                _closeScope(_skipWSOrEnd);
                return this._currToken;
            }
        }
        if (!this._parsingContext.inObject()) {
            return _nextTokenNotInObject(_skipWSOrEnd);
        }
        this._parsingContext.setCurrentName(_parseName(_skipWSOrEnd));
        this._currToken = JsonToken.FIELD_NAME;
        int _skipColon = _skipColon();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return this._currToken;
        }
        switch (_skipColon) {
            case 43:
                if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                    _handleUnexpectedValue = _handleUnexpectedValue(_skipColon);
                    break;
                } else {
                    _handleUnexpectedValue = _parsePosNumber();
                    break;
                }
            case 45:
                _handleUnexpectedValue = _parseNegNumber();
                break;
            case 46:
                _handleUnexpectedValue = _parseFloatThatStartsWithPeriod(false, false);
                break;
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case FastDoubleMath.DOUBLE_SIGNIFICAND_WIDTH:
            case 54:
            case 55:
            case 56:
            case 57:
                _handleUnexpectedValue = _parseUnsignedNumber(_skipColon);
                break;
            case 91:
                _handleUnexpectedValue = JsonToken.START_ARRAY;
                break;
            case 102:
                _matchToken("false", 1);
                _handleUnexpectedValue = JsonToken.VALUE_FALSE;
                break;
            case 110:
                _matchToken("null", 1);
                _handleUnexpectedValue = JsonToken.VALUE_NULL;
                break;
            case 116:
                _matchToken("true", 1);
                _handleUnexpectedValue = JsonToken.VALUE_TRUE;
                break;
            case 123:
                _handleUnexpectedValue = JsonToken.START_OBJECT;
                break;
            default:
                _handleUnexpectedValue = _handleUnexpectedValue(_skipColon);
                break;
        }
        this._nextToken = _handleUnexpectedValue;
        return this._currToken;
    }

    private final JsonToken _nextTokenNotInObject(int i) throws IOException {
        if (i == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        switch (i) {
            case 43:
                if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                    JsonToken _parsePosNumber = _parsePosNumber();
                    this._currToken = _parsePosNumber;
                    return _parsePosNumber;
                }
                JsonToken _handleUnexpectedValue = _handleUnexpectedValue(i);
                this._currToken = _handleUnexpectedValue;
                return _handleUnexpectedValue;
            case 45:
                JsonToken _parseNegNumber = _parseNegNumber();
                this._currToken = _parseNegNumber;
                return _parseNegNumber;
            case 46:
                JsonToken _parseFloatThatStartsWithPeriod = _parseFloatThatStartsWithPeriod(false, false);
                this._currToken = _parseFloatThatStartsWithPeriod;
                return _parseFloatThatStartsWithPeriod;
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case FastDoubleMath.DOUBLE_SIGNIFICAND_WIDTH:
            case 54:
            case 55:
            case 56:
            case 57:
                JsonToken _parseUnsignedNumber = _parseUnsignedNumber(i);
                this._currToken = _parseUnsignedNumber;
                return _parseUnsignedNumber;
            case 91:
                createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                JsonToken jsonToken2 = JsonToken.START_ARRAY;
                this._currToken = jsonToken2;
                return jsonToken2;
            case 102:
                _matchToken("false", 1);
                JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
                this._currToken = jsonToken3;
                return jsonToken3;
            case 110:
                _matchToken("null", 1);
                JsonToken jsonToken4 = JsonToken.VALUE_NULL;
                this._currToken = jsonToken4;
                return jsonToken4;
            case 116:
                _matchToken("true", 1);
                JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
                this._currToken = jsonToken5;
                return jsonToken5;
            case 123:
                createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                JsonToken jsonToken6 = JsonToken.START_OBJECT;
                this._currToken = jsonToken6;
                return jsonToken6;
            default:
                JsonToken _handleUnexpectedValue2 = _handleUnexpectedValue(i);
                this._currToken = _handleUnexpectedValue2;
                return _handleUnexpectedValue2;
        }
    }

    private final JsonToken _nextAfterName() throws IOException {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    @Override
    public void finishToken() throws IOException {
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
    }

    @Override
    public String nextFieldName() throws IOException {
        JsonToken _handleUnexpectedValue;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWS = _skipWS();
        this._binaryValue = null;
        this._tokenInputRow = this._currInputRow;
        if ((_skipWS | 32) == 125) {
            _closeScope(_skipWS);
            return null;
        }
        if (this._parsingContext.expectComma()) {
            if (_skipWS != 44) {
                _reportUnexpectedChar(_skipWS, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            _skipWS = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWS | 32) == 125) {
                _closeScope(_skipWS);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            _nextTokenNotInObject(_skipWS);
            return null;
        }
        String _parseName = _parseName(_skipWS);
        this._parsingContext.setCurrentName(_parseName);
        this._currToken = JsonToken.FIELD_NAME;
        int _skipColon = _skipColon();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return _parseName;
        }
        switch (_skipColon) {
            case 43:
                if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                    _handleUnexpectedValue = _handleUnexpectedValue(_skipColon);
                    break;
                } else {
                    _handleUnexpectedValue = _parsePosNumber();
                    break;
                }
            case 45:
                _handleUnexpectedValue = _parseNegNumber();
                break;
            case 46:
                _parseFloatThatStartsWithPeriod(false, false);
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case FastDoubleMath.DOUBLE_SIGNIFICAND_WIDTH:
            case 54:
            case 55:
            case 56:
            case 57:
                _handleUnexpectedValue = _parseUnsignedNumber(_skipColon);
                break;
            case 91:
                _handleUnexpectedValue = JsonToken.START_ARRAY;
                break;
            case 102:
                _matchToken("false", 1);
                _handleUnexpectedValue = JsonToken.VALUE_FALSE;
                break;
            case 110:
                _matchToken("null", 1);
                _handleUnexpectedValue = JsonToken.VALUE_NULL;
                break;
            case 116:
                _matchToken("true", 1);
                _handleUnexpectedValue = JsonToken.VALUE_TRUE;
                break;
            case 123:
                _handleUnexpectedValue = JsonToken.START_OBJECT;
                break;
            default:
                _handleUnexpectedValue = _handleUnexpectedValue(_skipColon);
                break;
        }
        this._nextToken = _handleUnexpectedValue;
        return _parseName;
    }

    @Override
    public String nextTextValue() throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            if (nextToken() == JsonToken.VALUE_STRING) {
                return getText();
            }
            return null;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            }
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            return null;
        }
        if (jsonToken != JsonToken.START_OBJECT) {
            return null;
        }
        createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        return null;
    }

    @Override
    public int nextIntValue(int i) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getIntValue() : i;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getIntValue();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return i;
    }

    @Override
    public long nextLongValue(long j) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getLongValue() : j;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getLongValue();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return j;
    }

    @Override
    public Boolean nextBooleanValue() throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            JsonToken nextToken = nextToken();
            if (nextToken == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (nextToken == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            return null;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (jsonToken == JsonToken.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            return null;
        }
        if (jsonToken != JsonToken.START_OBJECT) {
            return null;
        }
        createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        return null;
    }

    @Deprecated
    protected final JsonToken _parseFloatThatStartsWithPeriod() throws IOException {
        return _parseFloatThatStartsWithPeriod(false, false);
    }

    protected final JsonToken _parseFloatThatStartsWithPeriod(boolean z, boolean z2) throws IOException {
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return _handleUnexpectedValue(46);
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i = 0;
        if (z) {
            i = 0 + 1;
            emptyAndGetCurrentSegment[0] = '-';
        }
        return _parseFloat(emptyAndGetCurrentSegment, i, 46, z, 0);
    }

    protected JsonToken _parseUnsignedNumber(int i) throws IOException {
        int readUnsignedByte;
        int i2;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i == 48) {
            readUnsignedByte = _handleLeadingZeroes();
            if (readUnsignedByte <= 57 && readUnsignedByte >= 48) {
                i2 = 0;
            } else {
                if (readUnsignedByte == 120 || readUnsignedByte == 88) {
                    return _handleInvalidNumberStart(readUnsignedByte, false);
                }
                emptyAndGetCurrentSegment[0] = '0';
                i2 = 1;
            }
        } else {
            emptyAndGetCurrentSegment[0] = (char) i;
            readUnsignedByte = this._inputData.readUnsignedByte();
            i2 = 1;
        }
        int i3 = i2;
        while (readUnsignedByte <= 57 && readUnsignedByte >= 48) {
            i3++;
            if (i2 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int i4 = i2;
            i2++;
            emptyAndGetCurrentSegment[i4] = (char) readUnsignedByte;
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
        if (readUnsignedByte == 46 || (readUnsignedByte | 32) == 101) {
            return _parseFloat(emptyAndGetCurrentSegment, i2, readUnsignedByte, false, i3);
        }
        this._textBuffer.setCurrentLength(i2);
        this._nextByte = readUnsignedByte;
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace();
        }
        return resetInt(false, i3);
    }

    protected final JsonToken _parsePosNumber() throws IOException {
        return _parseSignedNumber(false);
    }

    protected final JsonToken _parseNegNumber() throws IOException {
        return _parseSignedNumber(true);
    }

    private final JsonToken _parseSignedNumber(boolean z) throws IOException {
        int readUnsignedByte;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i = 0;
        if (z) {
            i = 0 + 1;
            emptyAndGetCurrentSegment[0] = '-';
        }
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        int i2 = i;
        int i3 = i + 1;
        emptyAndGetCurrentSegment[i2] = (char) readUnsignedByte2;
        if (readUnsignedByte2 <= 48) {
            if (readUnsignedByte2 != 48) {
                return readUnsignedByte2 == 46 ? _parseFloatThatStartsWithPeriod(z, true) : _handleInvalidNumberStart(readUnsignedByte2, z, true);
            }
            readUnsignedByte = _handleLeadingZeroes();
        } else {
            if (readUnsignedByte2 > 57) {
                return _handleInvalidNumberStart(readUnsignedByte2, z, true);
            }
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
        int i4 = 1;
        while (readUnsignedByte <= 57 && readUnsignedByte >= 48) {
            i4++;
            if (i3 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            int i5 = i3;
            i3++;
            emptyAndGetCurrentSegment[i5] = (char) readUnsignedByte;
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
        if (readUnsignedByte == 46 || (readUnsignedByte | 32) == 101) {
            return _parseFloat(emptyAndGetCurrentSegment, i3, readUnsignedByte, z, i4);
        }
        this._textBuffer.setCurrentLength(i3);
        this._nextByte = readUnsignedByte;
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace();
        }
        return resetInt(z, i4);
    }

    private final int _handleLeadingZeroes() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte < 48 || readUnsignedByte > 57) {
            return readUnsignedByte;
        }
        if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        while (readUnsignedByte == 48) {
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
        return readUnsignedByte;
    }

    private final JsonToken _parseFloat(char[] cArr, int i, int i2, boolean z, int i3) throws IOException {
        int i4 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i5 = i;
            i++;
            cArr[i5] = (char) i2;
            while (true) {
                i2 = this._inputData.readUnsignedByte();
                if (i2 < 48 || i2 > 57) {
                    break;
                }
                i4++;
                if (i >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i = 0;
                }
                int i6 = i;
                i++;
                cArr[i6] = (char) i2;
            }
            if (i4 == 0 && !isEnabled(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                _reportUnexpectedNumberChar(i2, "Decimal point not followed by a digit");
            }
        }
        int i7 = 0;
        if ((i2 | 32) == 101) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i8 = i;
            i++;
            cArr[i8] = (char) i2;
            i2 = this._inputData.readUnsignedByte();
            if (i2 == 45 || i2 == 43) {
                if (i >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i = 0;
                }
                int i9 = i;
                i++;
                cArr[i9] = (char) i2;
                i2 = this._inputData.readUnsignedByte();
            }
            while (i2 <= 57 && i2 >= 48) {
                i7++;
                if (i >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i = 0;
                }
                int i10 = i;
                i++;
                cArr[i10] = (char) i2;
                i2 = this._inputData.readUnsignedByte();
            }
            if (i7 == 0) {
                _reportUnexpectedNumberChar(i2, "Exponent indicator not followed by a digit");
            }
        }
        this._nextByte = i2;
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace();
        }
        this._textBuffer.setCurrentLength(i);
        return resetFloat(z, i3, i4, i7);
    }

    private final void _verifyRootSpace() throws IOException {
        int i = this._nextByte;
        if (i > 32) {
            _reportMissingRootWS(i);
            return;
        }
        this._nextByte = -1;
        if (i == 13 || i == 10) {
            this._currInputRow++;
        }
    }

    protected final String _parseName(int i) throws IOException {
        if (i != 34) {
            return _handleOddName(i);
        }
        int[] iArr = INPUT_CODES_LATIN1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] != 0) {
            return readUnsignedByte == 34 ? JsonProperty.USE_DEFAULT_NAME : parseName(0, readUnsignedByte, 0);
        }
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte2] != 0) {
            return readUnsignedByte2 == 34 ? findName(readUnsignedByte, 1) : parseName(readUnsignedByte, readUnsignedByte2, 1);
        }
        int i2 = (readUnsignedByte << 8) | readUnsignedByte2;
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte3] != 0) {
            return readUnsignedByte3 == 34 ? findName(i2, 2) : parseName(i2, readUnsignedByte3, 2);
        }
        int i3 = (i2 << 8) | readUnsignedByte3;
        int readUnsignedByte4 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte4] != 0) {
            return readUnsignedByte4 == 34 ? findName(i3, 3) : parseName(i3, readUnsignedByte4, 3);
        }
        int i4 = (i3 << 8) | readUnsignedByte4;
        int readUnsignedByte5 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte5] != 0) {
            return readUnsignedByte5 == 34 ? findName(i4, 4) : parseName(i4, readUnsignedByte5, 4);
        }
        this._quad1 = i4;
        return _parseMediumName(readUnsignedByte5);
    }

    private final String _parseMediumName(int i) throws IOException {
        int[] iArr = INPUT_CODES_LATIN1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] != 0) {
            return readUnsignedByte == 34 ? findName(this._quad1, i, 1) : parseName(this._quad1, i, readUnsignedByte, 1);
        }
        int i2 = (i << 8) | readUnsignedByte;
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte2] != 0) {
            return readUnsignedByte2 == 34 ? findName(this._quad1, i2, 2) : parseName(this._quad1, i2, readUnsignedByte2, 2);
        }
        int i3 = (i2 << 8) | readUnsignedByte2;
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte3] != 0) {
            return readUnsignedByte3 == 34 ? findName(this._quad1, i3, 3) : parseName(this._quad1, i3, readUnsignedByte3, 3);
        }
        int i4 = (i3 << 8) | readUnsignedByte3;
        int readUnsignedByte4 = this._inputData.readUnsignedByte();
        return iArr[readUnsignedByte4] != 0 ? readUnsignedByte4 == 34 ? findName(this._quad1, i4, 4) : parseName(this._quad1, i4, readUnsignedByte4, 4) : _parseMediumName2(readUnsignedByte4, i4);
    }

    private final String _parseMediumName2(int i, int i2) throws IOException {
        int[] iArr = INPUT_CODES_LATIN1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] != 0) {
            return readUnsignedByte == 34 ? findName(this._quad1, i2, i, 1) : parseName(this._quad1, i2, i, readUnsignedByte, 1);
        }
        int i3 = (i << 8) | readUnsignedByte;
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte2] != 0) {
            return readUnsignedByte2 == 34 ? findName(this._quad1, i2, i3, 2) : parseName(this._quad1, i2, i3, readUnsignedByte2, 2);
        }
        int i4 = (i3 << 8) | readUnsignedByte2;
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte3] != 0) {
            return readUnsignedByte3 == 34 ? findName(this._quad1, i2, i4, 3) : parseName(this._quad1, i2, i4, readUnsignedByte3, 3);
        }
        int i5 = (i4 << 8) | readUnsignedByte3;
        int readUnsignedByte4 = this._inputData.readUnsignedByte();
        return iArr[readUnsignedByte4] != 0 ? readUnsignedByte4 == 34 ? findName(this._quad1, i2, i5, 4) : parseName(this._quad1, i2, i5, readUnsignedByte4, 4) : _parseLongName(readUnsignedByte4, i2, i5);
    }

    private final String _parseLongName(int i, int i2, int i3) throws IOException {
        this._quadBuffer[0] = this._quad1;
        this._quadBuffer[1] = i2;
        this._quadBuffer[2] = i3;
        int[] iArr = INPUT_CODES_LATIN1;
        int i4 = 3;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte] != 0) {
                return readUnsignedByte == 34 ? findName(this._quadBuffer, i4, i, 1) : parseEscapedName(this._quadBuffer, i4, i, readUnsignedByte, 1);
            }
            int i5 = (i << 8) | readUnsignedByte;
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte2] != 0) {
                return readUnsignedByte2 == 34 ? findName(this._quadBuffer, i4, i5, 2) : parseEscapedName(this._quadBuffer, i4, i5, readUnsignedByte2, 2);
            }
            int i6 = (i5 << 8) | readUnsignedByte2;
            int readUnsignedByte3 = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte3] != 0) {
                return readUnsignedByte3 == 34 ? findName(this._quadBuffer, i4, i6, 3) : parseEscapedName(this._quadBuffer, i4, i6, readUnsignedByte3, 3);
            }
            int i7 = (i6 << 8) | readUnsignedByte3;
            int readUnsignedByte4 = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte4] != 0) {
                return readUnsignedByte4 == 34 ? findName(this._quadBuffer, i4, i7, 4) : parseEscapedName(this._quadBuffer, i4, i7, readUnsignedByte4, 4);
            }
            if (i4 >= this._quadBuffer.length) {
                this._quadBuffer = growArrayBy(this._quadBuffer, i4);
            }
            int i8 = i4;
            i4++;
            this._quadBuffer[i8] = i7;
            i = readUnsignedByte4;
        }
    }

    private final String parseName(int i, int i2, int i3) throws IOException {
        return parseEscapedName(this._quadBuffer, 0, i, i2, i3);
    }

    private final String parseName(int i, int i2, int i3, int i4) throws IOException {
        this._quadBuffer[0] = i;
        return parseEscapedName(this._quadBuffer, 1, i2, i3, i4);
    }

    private final String parseName(int i, int i2, int i3, int i4, int i5) throws IOException {
        this._quadBuffer[0] = i;
        this._quadBuffer[1] = i2;
        return parseEscapedName(this._quadBuffer, 2, i3, i4, i5);
    }

    protected final String parseEscapedName(int[] iArr, int i, int i2, int i3, int i4) throws IOException {
        int[] iArr2 = INPUT_CODES_LATIN1;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    _throwUnquotedSpace(i3, "name");
                } else {
                    i3 = _decodeEscaped();
                }
                if (i3 > 127) {
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            int[] growArrayBy = growArrayBy(iArr, iArr.length);
                            iArr = growArrayBy;
                            this._quadBuffer = growArrayBy;
                        }
                        int i5 = i;
                        i++;
                        iArr[i5] = i2;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i2 = (i2 << 8) | 192 | (i3 >> 6);
                        i4++;
                    } else {
                        int i6 = (i2 << 8) | 224 | (i3 >> 12);
                        int i7 = i4 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                int[] growArrayBy2 = growArrayBy(iArr, iArr.length);
                                iArr = growArrayBy2;
                                this._quadBuffer = growArrayBy2;
                            }
                            int i8 = i;
                            i++;
                            iArr[i8] = i6;
                            i6 = 0;
                            i7 = 0;
                        }
                        i2 = (i6 << 8) | 128 | ((i3 >> 6) & 63);
                        i4 = i7 + 1;
                    }
                    i3 = 128 | (i3 & 63);
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    int[] growArrayBy3 = growArrayBy(iArr, iArr.length);
                    iArr = growArrayBy3;
                    this._quadBuffer = growArrayBy3;
                }
                int i9 = i;
                i++;
                iArr[i9] = i2;
                i2 = i3;
                i4 = 1;
            }
            i3 = this._inputData.readUnsignedByte();
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                int[] growArrayBy4 = growArrayBy(iArr, iArr.length);
                iArr = growArrayBy4;
                this._quadBuffer = growArrayBy4;
            }
            int i10 = i;
            i++;
            iArr[i10] = pad(i2, i4);
        }
        String findName = this._symbols.findName(iArr, i);
        if (findName == null) {
            findName = addName(iArr, i, i4);
        }
        return findName;
    }

    protected String _handleOddName(int i) throws IOException {
        if (i == 39 && (this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
            return _parseAposName();
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar((char) _decodeCharForError(i), "was expecting double-quote to start field name");
        }
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        if (inputCodeUtf8JsNames[i] != 0) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this._quadBuffer;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        do {
            if (i4 < 4) {
                i4++;
                i3 = (i3 << 8) | i;
            } else {
                if (i2 >= iArr.length) {
                    int[] growArrayBy = growArrayBy(iArr, iArr.length);
                    iArr = growArrayBy;
                    this._quadBuffer = growArrayBy;
                }
                int i5 = i2;
                i2++;
                iArr[i5] = i3;
                i3 = i;
                i4 = 1;
            }
            i = this._inputData.readUnsignedByte();
        } while (inputCodeUtf8JsNames[i] == 0);
        this._nextByte = i;
        if (i4 > 0) {
            if (i2 >= iArr.length) {
                int[] growArrayBy2 = growArrayBy(iArr, iArr.length);
                iArr = growArrayBy2;
                this._quadBuffer = growArrayBy2;
            }
            int i6 = i2;
            i2++;
            iArr[i6] = i3;
        }
        String findName = this._symbols.findName(iArr, i2);
        if (findName == null) {
            findName = addName(iArr, i2, i4);
        }
        return findName;
    }

    protected String _parseAposName() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte == 39) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        int[] iArr = this._quadBuffer;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int[] iArr2 = INPUT_CODES_LATIN1;
        while (readUnsignedByte != 39) {
            if (readUnsignedByte != 34 && iArr2[readUnsignedByte] != 0) {
                if (readUnsignedByte != 92) {
                    _throwUnquotedSpace(readUnsignedByte, "name");
                } else {
                    readUnsignedByte = _decodeEscaped();
                }
                if (readUnsignedByte > 127) {
                    if (i3 >= 4) {
                        if (i >= iArr.length) {
                            int[] growArrayBy = growArrayBy(iArr, iArr.length);
                            iArr = growArrayBy;
                            this._quadBuffer = growArrayBy;
                        }
                        int i4 = i;
                        i++;
                        iArr[i4] = i2;
                        i2 = 0;
                        i3 = 0;
                    }
                    if (readUnsignedByte < 2048) {
                        i2 = (i2 << 8) | 192 | (readUnsignedByte >> 6);
                        i3++;
                    } else {
                        int i5 = (i2 << 8) | 224 | (readUnsignedByte >> 12);
                        int i6 = i3 + 1;
                        if (i6 >= 4) {
                            if (i >= iArr.length) {
                                int[] growArrayBy2 = growArrayBy(iArr, iArr.length);
                                iArr = growArrayBy2;
                                this._quadBuffer = growArrayBy2;
                            }
                            int i7 = i;
                            i++;
                            iArr[i7] = i5;
                            i5 = 0;
                            i6 = 0;
                        }
                        i2 = (i5 << 8) | 128 | ((readUnsignedByte >> 6) & 63);
                        i3 = i6 + 1;
                    }
                    readUnsignedByte = 128 | (readUnsignedByte & 63);
                }
            }
            if (i3 < 4) {
                i3++;
                i2 = (i2 << 8) | readUnsignedByte;
            } else {
                if (i >= iArr.length) {
                    int[] growArrayBy3 = growArrayBy(iArr, iArr.length);
                    iArr = growArrayBy3;
                    this._quadBuffer = growArrayBy3;
                }
                int i8 = i;
                i++;
                iArr[i8] = i2;
                i2 = readUnsignedByte;
                i3 = 1;
            }
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
        if (i3 > 0) {
            if (i >= iArr.length) {
                int[] growArrayBy4 = growArrayBy(iArr, iArr.length);
                iArr = growArrayBy4;
                this._quadBuffer = growArrayBy4;
            }
            int i9 = i;
            i++;
            iArr[i9] = pad(i2, i3);
        }
        String findName = this._symbols.findName(iArr, i);
        if (findName == null) {
            findName = addName(iArr, i, i3);
        }
        return findName;
    }

    private final String findName(int i, int i2) throws JsonParseException, StreamConstraintsException {
        int pad = pad(i, i2);
        String findName = this._symbols.findName(pad);
        if (findName != null) {
            return findName;
        }
        this._quadBuffer[0] = pad;
        return addName(this._quadBuffer, 1, i2);
    }

    private final String findName(int i, int i2, int i3) throws JsonParseException, StreamConstraintsException {
        int pad = pad(i2, i3);
        String findName = this._symbols.findName(i, pad);
        if (findName != null) {
            return findName;
        }
        this._quadBuffer[0] = i;
        this._quadBuffer[1] = pad;
        return addName(this._quadBuffer, 2, i3);
    }

    private final String findName(int i, int i2, int i3, int i4) throws JsonParseException, StreamConstraintsException {
        int pad = pad(i3, i4);
        String findName = this._symbols.findName(i, i2, pad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = pad(pad, i4);
        return addName(iArr, 3, i4);
    }

    private final String findName(int[] iArr, int i, int i2, int i3) throws JsonParseException, StreamConstraintsException {
        if (i >= iArr.length) {
            int[] growArrayBy = growArrayBy(iArr, iArr.length);
            iArr = growArrayBy;
            this._quadBuffer = growArrayBy;
        }
        int i4 = i + 1;
        iArr[i] = pad(i2, i3);
        String findName = this._symbols.findName(iArr, i4);
        return findName == null ? addName(iArr, i4, i3) : findName;
    }

    private final String addName(int[] iArr, int i, int i2) throws JsonParseException, StreamConstraintsException {
        int i3;
        int i4;
        int i5;
        int i6 = ((i << 2) - 4) + i2;
        if (i2 < 4) {
            i3 = iArr[i - 1];
            iArr[i - 1] = i3 << ((4 - i2) << 3);
        } else {
            i3 = 0;
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i7 = 0;
        int i8 = 0;
        while (i8 < i6) {
            int i9 = (iArr[i8 >> 2] >> ((3 - (i8 & 3)) << 3)) & 255;
            i8++;
            if (i9 > 127) {
                if ((i9 & 224) == 192) {
                    i4 = i9 & 31;
                    i5 = 1;
                } else if ((i9 & 240) == 224) {
                    i4 = i9 & 15;
                    i5 = 2;
                } else if ((i9 & 248) == 240) {
                    i4 = i9 & 7;
                    i5 = 3;
                } else {
                    _reportInvalidInitial(i9);
                    i4 = 1;
                    i5 = 1;
                }
                if (i8 + i5 > i6) {
                    _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                }
                int i10 = iArr[i8 >> 2] >> ((3 - (i8 & 3)) << 3);
                i8++;
                if ((i10 & 192) != 128) {
                    _reportInvalidOther(i10);
                }
                i9 = (i4 << 6) | (i10 & 63);
                if (i5 > 1) {
                    int i11 = iArr[i8 >> 2] >> ((3 - (i8 & 3)) << 3);
                    i8++;
                    if ((i11 & 192) != 128) {
                        _reportInvalidOther(i11);
                    }
                    i9 = (i9 << 6) | (i11 & 63);
                    if (i5 > 2) {
                        int i12 = iArr[i8 >> 2] >> ((3 - (i8 & 3)) << 3);
                        i8++;
                        if ((i12 & 192) != 128) {
                            _reportInvalidOther(i12 & 255);
                        }
                        i9 = (i9 << 6) | (i12 & 63);
                    }
                }
                if (i5 > 2) {
                    int i13 = i9 - 65536;
                    if (i7 >= emptyAndGetCurrentSegment.length) {
                        emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                    }
                    int i14 = i7;
                    i7++;
                    emptyAndGetCurrentSegment[i14] = (char) (GeneratorBase.SURR1_FIRST + (i13 >> 10));
                    i9 = 56320 | (i13 & FastDoubleMath.DOUBLE_EXPONENT_BIAS);
                }
            }
            if (i7 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
            }
            int i15 = i7;
            i7++;
            emptyAndGetCurrentSegment[i15] = (char) i9;
        }
        String str = new String(emptyAndGetCurrentSegment, 0, i7);
        if (!this._symbols.isCanonicalizing()) {
            return str;
        }
        if (i2 < 4) {
            iArr[i - 1] = i3;
        }
        return this._symbols.addName(str, iArr, i);
    }

    @Override
    protected void _finishString() throws IOException {
        int i = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = INPUT_CODES_UTF8;
        int length = emptyAndGetCurrentSegment.length;
        do {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte] != 0) {
                if (readUnsignedByte == 34) {
                    this._textBuffer.setCurrentLength(i);
                    return;
                } else {
                    _finishString2(emptyAndGetCurrentSegment, i, readUnsignedByte);
                    return;
                }
            }
            int i2 = i;
            i++;
            emptyAndGetCurrentSegment[i2] = (char) readUnsignedByte;
        } while (i < length);
        _finishString2(emptyAndGetCurrentSegment, i, this._inputData.readUnsignedByte());
    }

    private String _finishAndReturnString() throws IOException {
        int i = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = INPUT_CODES_UTF8;
        int length = emptyAndGetCurrentSegment.length;
        do {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte] != 0) {
                if (readUnsignedByte == 34) {
                    return this._textBuffer.setCurrentAndReturn(i);
                }
                _finishString2(emptyAndGetCurrentSegment, i, readUnsignedByte);
                return this._textBuffer.contentsAsString();
            }
            int i2 = i;
            i++;
            emptyAndGetCurrentSegment[i2] = (char) readUnsignedByte;
        } while (i < length);
        _finishString2(emptyAndGetCurrentSegment, i, this._inputData.readUnsignedByte());
        return this._textBuffer.contentsAsString();
    }

    private final void _finishString2(char[] cArr, int i, int i2) throws IOException {
        int[] iArr = INPUT_CODES_UTF8;
        int length = cArr.length;
        while (true) {
            if (iArr[i2] == 0) {
                if (i >= length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i = 0;
                    length = cArr.length;
                }
                int i3 = i;
                i++;
                cArr[i3] = (char) i2;
                i2 = this._inputData.readUnsignedByte();
            } else {
                if (i2 == 34) {
                    this._textBuffer.setCurrentLength(i);
                    return;
                }
                switch (iArr[i2]) {
                    case 1:
                        i2 = _decodeEscaped();
                        break;
                    case 2:
                        i2 = _decodeUtf8_2(i2);
                        break;
                    case 3:
                        i2 = _decodeUtf8_3(i2);
                        break;
                    case 4:
                        int _decodeUtf8_4 = _decodeUtf8_4(i2);
                        if (i >= cArr.length) {
                            cArr = this._textBuffer.finishCurrentSegment();
                            i = 0;
                            length = cArr.length;
                        }
                        int i4 = i;
                        i++;
                        cArr[i4] = (char) (55296 | (_decodeUtf8_4 >> 10));
                        i2 = 56320 | (_decodeUtf8_4 & FastDoubleMath.DOUBLE_EXPONENT_BIAS);
                        break;
                    default:
                        if (i2 >= 32) {
                            _reportInvalidChar(i2);
                            break;
                        } else {
                            _throwUnquotedSpace(i2, "string value");
                            break;
                        }
                }
                if (i >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i = 0;
                    length = cArr.length;
                }
                int i5 = i;
                i++;
                cArr[i5] = (char) i2;
                i2 = this._inputData.readUnsignedByte();
            }
        }
    }

    protected void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int[] iArr = INPUT_CODES_UTF8;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte] != 0) {
                if (readUnsignedByte != 34) {
                    switch (iArr[readUnsignedByte]) {
                        case 1:
                            _decodeEscaped();
                            break;
                        case 2:
                            _skipUtf8_2();
                            break;
                        case 3:
                            _skipUtf8_3();
                            break;
                        case 4:
                            _skipUtf8_4();
                            break;
                        default:
                            if (readUnsignedByte >= 32) {
                                _reportInvalidChar(readUnsignedByte);
                                break;
                            } else {
                                _throwUnquotedSpace(readUnsignedByte, "string value");
                                break;
                            }
                    }
                } else {
                    return;
                }
            }
        }
    }

    protected com.kammoun.utils.jackson.core.JsonToken _handleUnexpectedValue(int r6) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.core.json.UTF8DataInputJsonParser._handleUnexpectedValue(int):com.kammoun.utils.jackson.core.JsonToken");
    }

    protected JsonToken _handleApos() throws IOException {
        int i = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = INPUT_CODES_UTF8;
        while (true) {
            int length = emptyAndGetCurrentSegment.length;
            if (i >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i = 0;
                length = emptyAndGetCurrentSegment.length;
            }
            while (true) {
                char readUnsignedByte = this._inputData.readUnsignedByte();
                if (readUnsignedByte == '\'') {
                    this._textBuffer.setCurrentLength(i);
                    return JsonToken.VALUE_STRING;
                }
                if (iArr[readUnsignedByte] == 0 || readUnsignedByte == '\"') {
                    int i2 = i;
                    i++;
                    emptyAndGetCurrentSegment[i2] = readUnsignedByte;
                    if (i >= length) {
                        break;
                    }
                } else {
                    switch (iArr[readUnsignedByte]) {
                        case 1:
                            readUnsignedByte = _decodeEscaped();
                            break;
                        case 2:
                            readUnsignedByte = _decodeUtf8_2(readUnsignedByte);
                            break;
                        case 3:
                            readUnsignedByte = _decodeUtf8_3(readUnsignedByte);
                            break;
                        case 4:
                            int _decodeUtf8_4 = _decodeUtf8_4(readUnsignedByte);
                            int i3 = i;
                            i++;
                            emptyAndGetCurrentSegment[i3] = (char) (55296 | (_decodeUtf8_4 >> 10));
                            if (i >= emptyAndGetCurrentSegment.length) {
                                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                                i = 0;
                            }
                            readUnsignedByte = 56320 | (_decodeUtf8_4 & FastDoubleMath.DOUBLE_EXPONENT_BIAS);
                            break;
                        default:
                            if (readUnsignedByte < ' ') {
                                _throwUnquotedSpace(readUnsignedByte, "string value");
                            }
                            _reportInvalidChar(readUnsignedByte);
                            break;
                    }
                    if (i >= emptyAndGetCurrentSegment.length) {
                        emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                        i = 0;
                    }
                    int i4 = i;
                    i++;
                    emptyAndGetCurrentSegment[i4] = readUnsignedByte;
                }
            }
        }
    }

    protected JsonToken _handleInvalidNumberStart(int i, boolean z) throws IOException {
        return _handleInvalidNumberStart(i, z, false);
    }

    protected JsonToken _handleInvalidNumberStart(int i, boolean z, boolean z2) throws IOException {
        String str;
        while (i == 73) {
            i = this._inputData.readUnsignedByte();
            if (i != 78) {
                if (i != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            _matchToken(str, 3);
            if ((this._features & FEAT_MASK_NON_NUM_NUMBERS) != 0) {
                return resetAsNaN(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            _reportError("Non-standard token '" + str + "': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
        }
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) && z2 && !z) {
            _reportUnexpectedNumberChar(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        _reportUnexpectedNumberChar(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        return null;
    }

    protected final void _matchToken(String str, int i) throws IOException {
        int length = str.length();
        do {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (readUnsignedByte != str.charAt(i)) {
                _reportInvalidToken(readUnsignedByte, str.substring(0, i));
            }
            i++;
        } while (i < length);
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if (readUnsignedByte2 >= 48 && readUnsignedByte2 != 93 && readUnsignedByte2 != 125) {
            _checkMatchEnd(str, i, readUnsignedByte2);
        }
        this._nextByte = readUnsignedByte2;
    }

    private final void _checkMatchEnd(String str, int i, int i2) throws IOException {
        char _decodeCharForError = (char) _decodeCharForError(i2);
        if (Character.isJavaIdentifierPart(_decodeCharForError)) {
            _reportInvalidToken(_decodeCharForError, str.substring(0, i));
        }
    }

    private final int _skipWS() throws IOException {
        int i = this._nextByte;
        if (i < 0) {
            i = this._inputData.readUnsignedByte();
        } else {
            this._nextByte = -1;
        }
        while (i <= 32) {
            if (i == 13 || i == 10) {
                this._currInputRow++;
            }
            i = this._inputData.readUnsignedByte();
        }
        return (i == 47 || i == 35) ? _skipWSComment(i) : i;
    }

    private final int _skipWSOrEnd() throws IOException {
        int i = this._nextByte;
        if (i < 0) {
            try {
                i = this._inputData.readUnsignedByte();
            } catch (EOFException e) {
                return _eofAsNextChar();
            }
        } else {
            this._nextByte = -1;
        }
        while (i <= 32) {
            if (i == 13 || i == 10) {
                this._currInputRow++;
            }
            try {
                i = this._inputData.readUnsignedByte();
            } catch (EOFException e2) {
                return _eofAsNextChar();
            }
        }
        return (i == 47 || i == 35) ? _skipWSComment(i) : i;
    }

    private final int _skipWSComment(int i) throws IOException {
        while (true) {
            if (i > 32) {
                if (i != 47) {
                    if (i == 35 && _skipYAMLComment()) {
                    }
                    return i;
                }
                _skipComment();
            } else if (i == 13 || i == 10) {
                this._currInputRow++;
            }
            i = this._inputData.readUnsignedByte();
        }
    }

    private final int _skipColon() throws IOException {
        int i = this._nextByte;
        if (i < 0) {
            i = this._inputData.readUnsignedByte();
        } else {
            this._nextByte = -1;
        }
        if (i == 58) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (readUnsignedByte > 32) {
                return (readUnsignedByte == 47 || readUnsignedByte == 35) ? _skipColon2(readUnsignedByte, true) : readUnsignedByte;
            }
            if (readUnsignedByte == 32 || readUnsignedByte == 9) {
                readUnsignedByte = this._inputData.readUnsignedByte();
                if (readUnsignedByte > 32) {
                    return (readUnsignedByte == 47 || readUnsignedByte == 35) ? _skipColon2(readUnsignedByte, true) : readUnsignedByte;
                }
            }
            return _skipColon2(readUnsignedByte, true);
        }
        if (i == 32 || i == 9) {
            i = this._inputData.readUnsignedByte();
        }
        if (i != 58) {
            return _skipColon2(i, false);
        }
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if (readUnsignedByte2 > 32) {
            return (readUnsignedByte2 == 47 || readUnsignedByte2 == 35) ? _skipColon2(readUnsignedByte2, true) : readUnsignedByte2;
        }
        if (readUnsignedByte2 == 32 || readUnsignedByte2 == 9) {
            readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (readUnsignedByte2 > 32) {
                return (readUnsignedByte2 == 47 || readUnsignedByte2 == 35) ? _skipColon2(readUnsignedByte2, true) : readUnsignedByte2;
            }
        }
        return _skipColon2(readUnsignedByte2, true);
    }

    private final int _skipColon2(int i, boolean z) throws IOException {
        while (true) {
            if (i > 32) {
                if (i == 47) {
                    _skipComment();
                } else if (i != 35 || !_skipYAMLComment()) {
                    if (z) {
                        return i;
                    }
                    if (i != 58) {
                        _reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i == 13 || i == 10) {
                this._currInputRow++;
            }
            i = this._inputData.readUnsignedByte();
        }
    }

    private final void _skipComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte == 47) {
            _skipLine();
        } else if (readUnsignedByte == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(readUnsignedByte, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void _skipCComment() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        int readUnsignedByte = this._inputData.readUnsignedByte();
        while (true) {
            int i = inputCodeComment[readUnsignedByte];
            if (i != 0) {
                switch (i) {
                    case 2:
                        _skipUtf8_2();
                        break;
                    case 3:
                        _skipUtf8_3();
                        break;
                    case 4:
                        _skipUtf8_4();
                        break;
                    case 10:
                    case StdKeyDeserializer.TYPE_URI:
                        this._currInputRow++;
                        break;
                    case 42:
                        break;
                    default:
                        _reportInvalidChar(readUnsignedByte);
                        break;
                }
                readUnsignedByte = this._inputData.readUnsignedByte();
                if (readUnsignedByte == 47) {
                    return;
                }
            }
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
    }

    private final boolean _skipYAMLComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _skipLine() throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.core.json.UTF8DataInputJsonParser._skipLine():void");
    }

    @Override
    protected char _decodeEscaped() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        switch (readUnsignedByte) {
            case JsonFactory.DEFAULT_QUOTE_CHAR:
            case JsonPointer.SEPARATOR:
            case 92:
                return (char) readUnsignedByte;
            case 98:
                return '\b';
            case 102:
                return '\f';
            case 110:
                return '\n';
            case 114:
                return '\r';
            case 116:
                return '\t';
            case 117:
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    int readUnsignedByte2 = this._inputData.readUnsignedByte();
                    int charToHex = CharTypes.charToHex(readUnsignedByte2);
                    if (charToHex < 0) {
                        _reportUnexpectedChar(readUnsignedByte2, "expected a hex-digit for character escape sequence");
                    }
                    i = (i << 4) | charToHex;
                }
                return (char) i;
            default:
                return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(readUnsignedByte));
        }
    }

    protected int _decodeCharForError(int i) throws IOException {
        boolean z;
        int i2 = i & 255;
        if (i2 > 127) {
            if ((i2 & 224) == 192) {
                i2 &= 31;
                z = true;
            } else if ((i2 & 240) == 224) {
                i2 &= 15;
                z = 2;
            } else if ((i2 & 248) == 240) {
                i2 &= 7;
                z = 3;
            } else {
                _reportInvalidInitial(i2 & 255);
                z = true;
            }
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if ((readUnsignedByte & 192) != 128) {
                _reportInvalidOther(readUnsignedByte & 255);
            }
            i2 = (i2 << 6) | (readUnsignedByte & 63);
            if (z > 1) {
                int readUnsignedByte2 = this._inputData.readUnsignedByte();
                if ((readUnsignedByte2 & 192) != 128) {
                    _reportInvalidOther(readUnsignedByte2 & 255);
                }
                i2 = (i2 << 6) | (readUnsignedByte2 & 63);
                if (z > 2) {
                    int readUnsignedByte3 = this._inputData.readUnsignedByte();
                    if ((readUnsignedByte3 & 192) != 128) {
                        _reportInvalidOther(readUnsignedByte3 & 255);
                    }
                    i2 = (i2 << 6) | (readUnsignedByte3 & 63);
                }
            }
        }
        return i2;
    }

    private final int _decodeUtf8_2(int i) throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & 255);
        }
        return ((i & 31) << 6) | (readUnsignedByte & 63);
    }

    private final int _decodeUtf8_3(int i) throws IOException {
        int i2 = i & 15;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & 255);
        }
        int i3 = (i2 << 6) | (readUnsignedByte & 63);
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & 255);
        }
        return (i3 << 6) | (readUnsignedByte2 & 63);
    }

    private final int _decodeUtf8_4(int i) throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & 255);
        }
        int i2 = ((i & 7) << 6) | (readUnsignedByte & 63);
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & 255);
        }
        int i3 = (i2 << 6) | (readUnsignedByte2 & 63);
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte3 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte3 & 255);
        }
        return ((i3 << 6) | (readUnsignedByte3 & 63)) - 65536;
    }

    private final void _skipUtf8_2() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & 255);
        }
    }

    private final void _skipUtf8_3() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & 255);
        }
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & 255);
        }
    }

    private final void _skipUtf8_4() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & 255);
        }
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & 255);
        }
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte3 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte3 & 255);
        }
    }

    protected void _reportInvalidToken(int i, String str) throws IOException {
        _reportInvalidToken(i, str, _validJsonTokenList());
    }

    protected void _reportInvalidToken(int i, String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            char _decodeCharForError = (char) _decodeCharForError(i);
            if (!Character.isJavaIdentifierPart(_decodeCharForError)) {
                _reportError("Unrecognized token '" + sb.toString() + "': was expecting " + str2);
                return;
            } else {
                sb.append(_decodeCharForError);
                i = this._inputData.readUnsignedByte();
            }
        }
    }

    protected void _reportInvalidChar(int i) throws JsonParseException {
        if (i < 32) {
            _throwInvalidSpace(i);
        }
        _reportInvalidInitial(i);
    }

    protected void _reportInvalidInitial(int i) throws JsonParseException {
        _reportError("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    private void _reportInvalidOther(int i) throws JsonParseException {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    protected final byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        int readUnsignedByte;
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (readUnsignedByte2 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(readUnsignedByte2);
                if (decodeBase64Char < 0) {
                    if (readUnsignedByte2 == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, readUnsignedByte2, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                int i = decodeBase64Char;
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                int decodeBase64Char2 = base64Variant.decodeBase64Char(readUnsignedByte3);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, readUnsignedByte3, 1);
                }
                int i2 = (i << 6) | decodeBase64Char2;
                int readUnsignedByte4 = this._inputData.readUnsignedByte();
                int decodeBase64Char3 = base64Variant.decodeBase64Char(readUnsignedByte4);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (readUnsignedByte4 == 34) {
                            _getByteArrayBuilder.append(i2 >> 4);
                            if (base64Variant.requiresPaddingOnRead()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, readUnsignedByte4, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        readUnsignedByte = this._inputData.readUnsignedByte();
                        if (base64Variant.usesPaddingChar(readUnsignedByte) || (readUnsignedByte == 92 && _decodeBase64Escape(base64Variant, readUnsignedByte, 3) == -2)) {
                            _getByteArrayBuilder.append(i2 >> 4);
                        }
                    }
                }
                int i3 = (i2 << 6) | decodeBase64Char3;
                int readUnsignedByte5 = this._inputData.readUnsignedByte();
                int decodeBase64Char4 = base64Variant.decodeBase64Char(readUnsignedByte5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (readUnsignedByte5 == 34) {
                            _getByteArrayBuilder.appendTwoBytes(i3 >> 2);
                            if (base64Variant.requiresPaddingOnRead()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, readUnsignedByte5, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i3 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i3 << 6) | decodeBase64Char4);
            }
        }
        throw reportInvalidBase64Char(base64Variant, readUnsignedByte, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
    }

    @Override
    public JsonLocation currentLocation() {
        return new JsonLocation(_contentReference(), -1L, -1L, this._currInputRow, -1);
    }

    @Override
    protected JsonLocation _currentLocationMinusOne() {
        return currentLocation();
    }

    @Override
    public JsonLocation currentTokenLocation() {
        return new JsonLocation(_contentReference(), -1L, -1L, this._tokenInputRow, -1);
    }

    private void _closeScope(int i) throws JsonParseException {
        if (i == 93) {
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
        }
        if (i == 125) {
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
        }
    }

    private static final int pad(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }
}
