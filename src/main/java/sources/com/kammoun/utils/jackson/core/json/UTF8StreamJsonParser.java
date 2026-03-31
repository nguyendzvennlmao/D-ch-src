package com.kammoun.utils.jackson.core.json;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.core.Base64Variant;
import com.kammoun.utils.jackson.core.JsonFactory;
import com.kammoun.utils.jackson.core.JsonLocation;
import com.kammoun.utils.jackson.core.JsonParseException;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonPointer;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.ObjectCodec;
import com.kammoun.utils.jackson.core.SerializableString;
import com.kammoun.utils.jackson.core.base.GeneratorBase;
import com.kammoun.utils.jackson.core.exc.StreamConstraintsException;
import com.kammoun.utils.jackson.core.io.CharTypes;
import com.kammoun.utils.jackson.core.io.IOContext;
import com.kammoun.utils.jackson.core.io.doubleparser.AbstractBigDecimalParser;
import com.kammoun.utils.jackson.core.io.doubleparser.FastDoubleMath;
import com.kammoun.utils.jackson.core.sym.ByteQuadsCanonicalizer;
import com.kammoun.utils.jackson.core.util.ByteArrayBuilder;
import com.kammoun.utils.jackson.databind.deser.std.StdKeyDeserializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class UTF8StreamJsonParser extends JsonParserBase {
    protected static final byte BYTE_LF = 10;
    protected final ByteQuadsCanonicalizer _symbols;
    protected int[] _quadBuffer;
    protected boolean _tokenIncomplete;
    private int _quad1;
    protected int _nameStartOffset;
    protected int _nameStartRow;
    protected int _nameStartCol;
    protected InputStream _inputStream;
    protected byte[] _inputBuffer;
    protected boolean _bufferRecyclable;

    @Deprecated
    public UTF8StreamJsonParser(IOContext iOContext, int i, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i2, int i3, boolean z) {
        this(iOContext, i, inputStream, objectCodec, byteQuadsCanonicalizer, bArr, i2, i3, 0, z);
    }

    public UTF8StreamJsonParser(IOContext iOContext, int i, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(iOContext, i, objectCodec);
        this._quadBuffer = new int[16];
        this._inputStream = inputStream;
        this._symbols = byteQuadsCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this._currInputRowStart = i2 - i4;
        this._currInputProcessed = (-i2) + i4;
        this._bufferRecyclable = z;
    }

    @Override
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i = this._inputEnd - this._inputPtr;
        if (i < 1) {
            return 0;
        }
        int i2 = this._inputPtr;
        this._inputPtr += i;
        outputStream.write(this._inputBuffer, i2, i);
        return i;
    }

    @Override
    public Object getInputSource() {
        return this._inputStream;
    }

    protected final boolean _loadMore() throws IOException {
        int length;
        if (this._inputStream == null || (length = this._inputBuffer.length) == 0) {
            return false;
        }
        int i = this._inputEnd;
        this._currInputProcessed += i;
        this._currInputRowStart -= i;
        streamReadConstraints().validateDocumentLength(this._currInputProcessed);
        int read = this._inputStream.read(this._inputBuffer, 0, length);
        if (read > 0) {
            this._nameStartOffset -= i;
            this._inputPtr = 0;
            this._inputEnd = read;
            return true;
        }
        this._inputEnd = 0;
        this._inputPtr = 0;
        _closeInput();
        if (read == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this._inputBuffer.length + " bytes");
        }
        return false;
    }

    @Override
    protected void _closeInput() throws IOException {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    @Override
    public void _releaseBuffers() throws IOException {
        byte[] bArr;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (bArr = this._inputBuffer) == null || bArr == NO_BYTES) {
            return;
        }
        this._inputBuffer = NO_BYTES;
        this._ioContext.releaseReadIOBuffer(bArr);
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
        if (this._currToken == null) {
            return 0;
        }
        switch (this._currToken.id()) {
            case 5:
                return this._parsingContext.getCurrentName().length();
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
                return this._currToken.asCharArray().length;
        }
        return this._textBuffer.size();
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

    protected int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int i = 0;
        int length = bArr.length - 3;
        int i2 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            int i4 = bArr2[i3] & 255;
            if (i4 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(i4);
                if (decodeBase64Char < 0) {
                    if (i4 == 34) {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, i4, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i > length) {
                    i2 += i;
                    outputStream.write(bArr, 0, i);
                    i = 0;
                }
                int i5 = decodeBase64Char;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                int i7 = bArr3[i6] & 255;
                int decodeBase64Char2 = base64Variant.decodeBase64Char(i7);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, i7, 1);
                }
                int i8 = (i5 << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr4 = this._inputBuffer;
                int i9 = this._inputPtr;
                this._inputPtr = i9 + 1;
                int i10 = bArr4[i9] & 255;
                int decodeBase64Char3 = base64Variant.decodeBase64Char(i10);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (i10 == 34) {
                            int i11 = i;
                            i++;
                            bArr[i11] = (byte) (i8 >> 4);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                        } else {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant, i10, 2);
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr5 = this._inputBuffer;
                        int i12 = this._inputPtr;
                        this._inputPtr = i12 + 1;
                        int i13 = bArr5[i12] & 255;
                        if (!base64Variant.usesPaddingChar(i13) && _decodeBase64Escape(base64Variant, i13, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, i13, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        int i14 = i;
                        i++;
                        bArr[i14] = (byte) (i8 >> 4);
                    }
                }
                int i15 = (i8 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr6 = this._inputBuffer;
                int i16 = this._inputPtr;
                this._inputPtr = i16 + 1;
                int i17 = bArr6[i16] & 255;
                int decodeBase64Char4 = base64Variant.decodeBase64Char(i17);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (i17 == 34) {
                            int i18 = i15 >> 2;
                            int i19 = i;
                            int i20 = i + 1;
                            bArr[i19] = (byte) (i18 >> 8);
                            i = i20 + 1;
                            bArr[i20] = (byte) i18;
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                        } else {
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant, i17, 3);
                        }
                    }
                    if (decodeBase64Char4 == -2) {
                        int i21 = i15 >> 2;
                        int i22 = i;
                        int i23 = i + 1;
                        bArr[i22] = (byte) (i21 >> 8);
                        i = i23 + 1;
                        bArr[i23] = (byte) i21;
                    }
                }
                int i24 = (i15 << 6) | decodeBase64Char4;
                int i25 = i;
                int i26 = i + 1;
                bArr[i25] = (byte) (i24 >> 16);
                int i27 = i26 + 1;
                bArr[i26] = (byte) (i24 >> 8);
                i = i27 + 1;
                bArr[i27] = (byte) i24;
            }
        }
        this._tokenIncomplete = false;
        if (i > 0) {
            i2 += i;
            outputStream.write(bArr, 0, i);
        }
        return i2;
    }

    @Override
    public JsonToken nextToken() throws IOException {
        JsonToken _handleUnexpectedValue;
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
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            JsonToken jsonToken2 = JsonToken.END_OBJECT;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        if (this._parsingContext.expectComma()) {
            if (_skipWSOrEnd != 44) {
                _reportUnexpectedChar(_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            _skipWSOrEnd = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                return _closeScope(_skipWSOrEnd);
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            return _nextTokenNotInObject(_skipWSOrEnd);
        }
        _updateNameLocation();
        this._parsingContext.setCurrentName(_parseName(_skipWSOrEnd));
        this._currToken = JsonToken.FIELD_NAME;
        int _skipColon = _skipColon();
        _updateLocation();
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
                    _handleUnexpectedValue = _parseSignedNumber(false);
                    break;
                }
            case 45:
                _handleUnexpectedValue = _parseSignedNumber(true);
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
                _matchFalse();
                _handleUnexpectedValue = JsonToken.VALUE_FALSE;
                break;
            case 110:
                _matchNull();
                _handleUnexpectedValue = JsonToken.VALUE_NULL;
                break;
            case 116:
                _matchTrue();
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
                    JsonToken _parseSignedNumber = _parseSignedNumber(false);
                    this._currToken = _parseSignedNumber;
                    return _parseSignedNumber;
                }
                JsonToken _handleUnexpectedValue = _handleUnexpectedValue(i);
                this._currToken = _handleUnexpectedValue;
                return _handleUnexpectedValue;
            case 45:
                JsonToken _parseSignedNumber2 = _parseSignedNumber(true);
                this._currToken = _parseSignedNumber2;
                return _parseSignedNumber2;
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
                _matchFalse();
                JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
                this._currToken = jsonToken3;
                return jsonToken3;
            case 110:
                _matchNull();
                JsonToken jsonToken4 = JsonToken.VALUE_NULL;
                this._currToken = jsonToken4;
                return jsonToken4;
            case 116:
                _matchTrue();
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
    public boolean nextFieldName(SerializableString serializableString) throws IOException {
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return false;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return false;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            this._currToken = JsonToken.END_ARRAY;
            return false;
        }
        if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            this._currToken = JsonToken.END_OBJECT;
            return false;
        }
        if (this._parsingContext.expectComma()) {
            if (_skipWSOrEnd != 44) {
                _reportUnexpectedChar(_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            _skipWSOrEnd = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                _closeScope(_skipWSOrEnd);
                return false;
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(_skipWSOrEnd);
            return false;
        }
        _updateNameLocation();
        if (_skipWSOrEnd == 34) {
            byte[] asQuotedUTF8 = serializableString.asQuotedUTF8();
            int length = asQuotedUTF8.length;
            if (this._inputPtr + length + 4 < this._inputEnd) {
                int i = this._inputPtr + length;
                if (this._inputBuffer[i] == 34) {
                    int i2 = 0;
                    int i3 = this._inputPtr;
                    while (i3 != i) {
                        if (asQuotedUTF8[i2] == this._inputBuffer[i3]) {
                            i2++;
                            i3++;
                        }
                    }
                    this._parsingContext.setCurrentName(serializableString.getValue());
                    _isNextTokenNameYes(_skipColonFast(i3 + 1));
                    return true;
                }
            }
        }
        return _isNextTokenNameMaybe(_skipWSOrEnd, serializableString);
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
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        }
        if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        }
        if (this._parsingContext.expectComma()) {
            if (_skipWSOrEnd != 44) {
                _reportUnexpectedChar(_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            _skipWSOrEnd = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                _closeScope(_skipWSOrEnd);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(_skipWSOrEnd);
            return null;
        }
        _updateNameLocation();
        String _parseName = _parseName(_skipWSOrEnd);
        this._parsingContext.setCurrentName(_parseName);
        this._currToken = JsonToken.FIELD_NAME;
        int _skipColon = _skipColon();
        _updateLocation();
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
                    _handleUnexpectedValue = _parseSignedNumber(false);
                    break;
                }
            case 45:
                _handleUnexpectedValue = _parseSignedNumber(true);
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
                _matchFalse();
                _handleUnexpectedValue = JsonToken.VALUE_FALSE;
                break;
            case 110:
                _matchNull();
                _handleUnexpectedValue = JsonToken.VALUE_NULL;
                break;
            case 116:
                _matchTrue();
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

    private final int _skipColonFast(int i) throws IOException {
        int i2 = i + 1;
        byte b = this._inputBuffer[i];
        if (b == 58) {
            int i3 = i2 + 1;
            byte b2 = this._inputBuffer[i2];
            if (b2 > 32) {
                if (b2 != 47 && b2 != 35) {
                    this._inputPtr = i3;
                    return b2;
                }
            } else if (b2 == 32 || b2 == 9) {
                i3++;
                byte b3 = this._inputBuffer[i3];
                if (b3 > 32 && b3 != 47 && b3 != 35) {
                    this._inputPtr = i3;
                    return b3;
                }
            }
            this._inputPtr = i3 - 1;
            return _skipColon2(true);
        }
        if (b == 32 || b == 9) {
            i2++;
            b = this._inputBuffer[i2];
        }
        if (b != 58) {
            this._inputPtr = i2 - 1;
            return _skipColon2(false);
        }
        int i4 = i2;
        int i5 = i2 + 1;
        byte b4 = this._inputBuffer[i4];
        if (b4 > 32) {
            if (b4 != 47 && b4 != 35) {
                this._inputPtr = i5;
                return b4;
            }
        } else if (b4 == 32 || b4 == 9) {
            i5++;
            byte b5 = this._inputBuffer[i5];
            if (b5 > 32 && b5 != 47 && b5 != 35) {
                this._inputPtr = i5;
                return b5;
            }
        }
        this._inputPtr = i5 - 1;
        return _skipColon2(true);
    }

    private final void _isNextTokenNameYes(int i) throws IOException {
        this._currToken = JsonToken.FIELD_NAME;
        _updateLocation();
        switch (i) {
            case JsonFactory.DEFAULT_QUOTE_CHAR:
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return;
            case 43:
                if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                    this._nextToken = _parseSignedNumber(false);
                    return;
                } else {
                    this._nextToken = _handleUnexpectedValue(i);
                    return;
                }
            case 45:
                this._nextToken = _parseSignedNumber(true);
                return;
            case 46:
                this._nextToken = _parseFloatThatStartsWithPeriod(false, false);
                return;
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
                this._nextToken = _parseUnsignedNumber(i);
                return;
            case 91:
                this._nextToken = JsonToken.START_ARRAY;
                return;
            case 102:
                _matchFalse();
                this._nextToken = JsonToken.VALUE_FALSE;
                return;
            case 110:
                _matchNull();
                this._nextToken = JsonToken.VALUE_NULL;
                return;
            case 116:
                _matchTrue();
                this._nextToken = JsonToken.VALUE_TRUE;
                return;
            case 123:
                this._nextToken = JsonToken.START_OBJECT;
                return;
            default:
                this._nextToken = _handleUnexpectedValue(i);
                return;
        }
    }

    private final boolean _isNextTokenNameMaybe(int i, SerializableString serializableString) throws IOException {
        JsonToken _handleUnexpectedValue;
        String _parseName = _parseName(i);
        this._parsingContext.setCurrentName(_parseName);
        boolean equals = _parseName.equals(serializableString.getValue());
        this._currToken = JsonToken.FIELD_NAME;
        int _skipColon = _skipColon();
        _updateLocation();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return equals;
        }
        switch (_skipColon) {
            case 43:
                if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                    _handleUnexpectedValue = _handleUnexpectedValue(_skipColon);
                    break;
                } else {
                    _handleUnexpectedValue = _parseSignedNumber(false);
                    break;
                }
            case 45:
                _handleUnexpectedValue = _parseSignedNumber(true);
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
                _matchFalse();
                _handleUnexpectedValue = JsonToken.VALUE_FALSE;
                break;
            case 110:
                _matchNull();
                _handleUnexpectedValue = JsonToken.VALUE_NULL;
                break;
            case 116:
                _matchTrue();
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
        return equals;
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
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i == 48) {
            i = _verifyNoLeadingZeroes();
        }
        emptyAndGetCurrentSegment[0] = (char) i;
        int i2 = 1;
        int i3 = 1;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - 1);
        while (this._inputPtr < min) {
            byte[] bArr = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            int i5 = bArr[i4] & 255;
            if (i5 < 48 || i5 > 57) {
                if (i5 == 46 || (i5 | 32) == 101) {
                    return _parseFloat(emptyAndGetCurrentSegment, i3, i5, false, i2);
                }
                this._inputPtr--;
                this._textBuffer.setCurrentLength(i3);
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(i5);
                }
                return resetInt(false, i2);
            }
            i2++;
            int i6 = i3;
            i3++;
            emptyAndGetCurrentSegment[i6] = (char) i5;
        }
        return _parseNumber2(emptyAndGetCurrentSegment, i3, false, i2);
    }

    private final JsonToken _parseSignedNumber(boolean z) throws IOException {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i = 0;
        if (z) {
            i = 0 + 1;
            emptyAndGetCurrentSegment[0] = '-';
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (i3 <= 48) {
            if (i3 != 48) {
                return i3 == 46 ? _parseFloatThatStartsWithPeriod(z, true) : _handleInvalidNumberStart(i3, z, true);
            }
            i3 = _verifyNoLeadingZeroes();
        } else if (i3 > 57) {
            return _handleInvalidNumberStart(i3, z, true);
        }
        int i4 = i;
        int i5 = i + 1;
        emptyAndGetCurrentSegment[i4] = (char) i3;
        int i6 = 1;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - i5);
        while (this._inputPtr < min) {
            byte[] bArr2 = this._inputBuffer;
            int i7 = this._inputPtr;
            this._inputPtr = i7 + 1;
            int i8 = bArr2[i7] & 255;
            if (i8 < 48 || i8 > 57) {
                if (i8 == 46 || (i8 | 32) == 101) {
                    return _parseFloat(emptyAndGetCurrentSegment, i5, i8, z, i6);
                }
                this._inputPtr--;
                this._textBuffer.setCurrentLength(i5);
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(i8);
                }
                return resetInt(z, i6);
            }
            i6++;
            int i9 = i5;
            i5++;
            emptyAndGetCurrentSegment[i9] = (char) i8;
        }
        return _parseNumber2(emptyAndGetCurrentSegment, i5, z, i6);
    }

    private final JsonToken _parseNumber2(char[] cArr, int i, boolean z, int i2) throws IOException {
        int i3;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                this._textBuffer.setCurrentLength(i);
                return resetInt(z, i2);
            }
            byte[] bArr = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            i3 = bArr[i4] & 255;
            if (i3 > 57 || i3 < 48) {
                break;
            }
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i5 = i;
            i++;
            cArr[i5] = (char) i3;
            i2++;
        }
        if (i3 == 46 || (i3 | 32) == 101) {
            return _parseFloat(cArr, i, i3, z, i2);
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(i);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(this._inputBuffer[this._inputPtr] & 255);
        }
        return resetInt(z, i2);
    }

    private final int _verifyNoLeadingZeroes() throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.core.json.UTF8StreamJsonParser._verifyNoLeadingZeroes():int");
    }

    private final JsonToken _parseFloat(char[] cArr, int i, int i2, boolean z, int i3) throws IOException {
        int i4 = 0;
        boolean z2 = false;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i5 = i;
            i++;
            cArr[i5] = (char) i2;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                i2 = bArr[i6] & 255;
                if (i2 < 48 || i2 > 57) {
                    break;
                }
                i4++;
                if (i >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i = 0;
                }
                int i7 = i;
                i++;
                cArr[i7] = (char) i2;
            }
            if (i4 == 0 && !isEnabled(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                _reportUnexpectedNumberChar(i2, "Decimal point not followed by a digit");
            }
        }
        int i8 = 0;
        if ((i2 | 32) == 101) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i9 = i;
            i++;
            cArr[i9] = (char) i2;
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            i2 = bArr2[i10] & 255;
            if (i2 == 45 || i2 == 43) {
                if (i >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i = 0;
                }
                int i11 = i;
                i++;
                cArr[i11] = (char) i2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                i2 = bArr3[i12] & 255;
            }
            while (true) {
                if (i2 < 48 || i2 > 57) {
                    break;
                }
                i8++;
                if (i >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i = 0;
                }
                int i13 = i;
                i++;
                cArr[i13] = (char) i2;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                byte[] bArr4 = this._inputBuffer;
                int i14 = this._inputPtr;
                this._inputPtr = i14 + 1;
                i2 = bArr4[i14] & 255;
            }
            if (i8 == 0) {
                _reportUnexpectedNumberChar(i2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(i2);
            }
        }
        this._textBuffer.setCurrentLength(i);
        return resetFloat(z, i3, i4, i8);
    }

    private final void _verifyRootSpace(int i) throws IOException {
        this._inputPtr++;
        switch (i) {
            case 9:
            case AbstractBigDecimalParser.MANY_DIGITS_THRESHOLD:
                return;
            case 10:
                this._currInputRow++;
                this._currInputRowStart = this._inputPtr;
                return;
            case StdKeyDeserializer.TYPE_URI:
                this._inputPtr--;
                return;
            default:
                _reportMissingRootWS(i);
                return;
        }
    }

    protected final String _parseName(int i) throws IOException {
        if (i != 34) {
            return _handleOddName(i);
        }
        if (this._inputPtr + 13 > this._inputEnd) {
            return slowParseName();
        }
        byte[] bArr = this._inputBuffer;
        int[] iArr = INPUT_CODES_LATIN1;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (iArr[i3] != 0) {
            return i3 == 34 ? JsonProperty.USE_DEFAULT_NAME : parseName(0, i3, 0);
        }
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        int i5 = bArr[i4] & 255;
        if (iArr[i5] != 0) {
            return i5 == 34 ? findName(i3, 1) : parseName(i3, i5, 1);
        }
        int i6 = (i3 << 8) | i5;
        int i7 = this._inputPtr;
        this._inputPtr = i7 + 1;
        int i8 = bArr[i7] & 255;
        if (iArr[i8] != 0) {
            return i8 == 34 ? findName(i6, 2) : parseName(i6, i8, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        int i11 = bArr[i10] & 255;
        if (iArr[i11] != 0) {
            return i11 == 34 ? findName(i9, 3) : parseName(i9, i11, 3);
        }
        int i12 = (i9 << 8) | i11;
        int i13 = this._inputPtr;
        this._inputPtr = i13 + 1;
        int i14 = bArr[i13] & 255;
        if (iArr[i14] != 0) {
            return i14 == 34 ? findName(i12, 4) : parseName(i12, i14, 4);
        }
        this._quad1 = i12;
        return parseMediumName(i14);
    }

    protected final String parseMediumName(int i) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = INPUT_CODES_LATIN1;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (iArr[i3] != 0) {
            return i3 == 34 ? findName(this._quad1, i, 1) : parseName(this._quad1, i, i3, 1);
        }
        int i4 = (i << 8) | i3;
        int i5 = this._inputPtr;
        this._inputPtr = i5 + 1;
        int i6 = bArr[i5] & 255;
        if (iArr[i6] != 0) {
            return i6 == 34 ? findName(this._quad1, i4, 2) : parseName(this._quad1, i4, i6, 2);
        }
        int i7 = (i4 << 8) | i6;
        int i8 = this._inputPtr;
        this._inputPtr = i8 + 1;
        int i9 = bArr[i8] & 255;
        if (iArr[i9] != 0) {
            return i9 == 34 ? findName(this._quad1, i7, 3) : parseName(this._quad1, i7, i9, 3);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = this._inputPtr;
        this._inputPtr = i11 + 1;
        int i12 = bArr[i11] & 255;
        return iArr[i12] != 0 ? i12 == 34 ? findName(this._quad1, i10, 4) : parseName(this._quad1, i10, i12, 4) : parseMediumName2(i12, i10);
    }

    protected final String parseMediumName2(int i, int i2) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = INPUT_CODES_LATIN1;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        int i4 = bArr[i3] & 255;
        if (iArr[i4] != 0) {
            return i4 == 34 ? findName(this._quad1, i2, i, 1) : parseName(this._quad1, i2, i, i4, 1);
        }
        int i5 = (i << 8) | i4;
        int i6 = this._inputPtr;
        this._inputPtr = i6 + 1;
        int i7 = bArr[i6] & 255;
        if (iArr[i7] != 0) {
            return i7 == 34 ? findName(this._quad1, i2, i5, 2) : parseName(this._quad1, i2, i5, i7, 2);
        }
        int i8 = (i5 << 8) | i7;
        int i9 = this._inputPtr;
        this._inputPtr = i9 + 1;
        int i10 = bArr[i9] & 255;
        if (iArr[i10] != 0) {
            return i10 == 34 ? findName(this._quad1, i2, i8, 3) : parseName(this._quad1, i2, i8, i10, 3);
        }
        int i11 = (i8 << 8) | i10;
        int i12 = this._inputPtr;
        this._inputPtr = i12 + 1;
        int i13 = bArr[i12] & 255;
        return iArr[i13] != 0 ? i13 == 34 ? findName(this._quad1, i2, i11, 4) : parseName(this._quad1, i2, i11, i13, 4) : parseLongName(i13, i2, i11);
    }

    protected final String parseLongName(int i, int i2, int i3) throws IOException {
        this._quadBuffer[0] = this._quad1;
        this._quadBuffer[1] = i2;
        this._quadBuffer[2] = i3;
        byte[] bArr = this._inputBuffer;
        int[] iArr = INPUT_CODES_LATIN1;
        int i4 = 3;
        while (this._inputPtr + 4 <= this._inputEnd) {
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            int i6 = bArr[i5] & 255;
            if (iArr[i6] != 0) {
                return i6 == 34 ? findName(this._quadBuffer, i4, i, 1) : parseEscapedName(this._quadBuffer, i4, i, i6, 1);
            }
            int i7 = (i << 8) | i6;
            int i8 = this._inputPtr;
            this._inputPtr = i8 + 1;
            int i9 = bArr[i8] & 255;
            if (iArr[i9] != 0) {
                return i9 == 34 ? findName(this._quadBuffer, i4, i7, 2) : parseEscapedName(this._quadBuffer, i4, i7, i9, 2);
            }
            int i10 = (i7 << 8) | i9;
            int i11 = this._inputPtr;
            this._inputPtr = i11 + 1;
            int i12 = bArr[i11] & 255;
            if (iArr[i12] != 0) {
                return i12 == 34 ? findName(this._quadBuffer, i4, i10, 3) : parseEscapedName(this._quadBuffer, i4, i10, i12, 3);
            }
            int i13 = (i10 << 8) | i12;
            int i14 = this._inputPtr;
            this._inputPtr = i14 + 1;
            int i15 = bArr[i14] & 255;
            if (iArr[i15] != 0) {
                return i15 == 34 ? findName(this._quadBuffer, i4, i13, 4) : parseEscapedName(this._quadBuffer, i4, i13, i15, 4);
            }
            if (i4 >= this._quadBuffer.length) {
                this._quadBuffer = _growNameDecodeBuffer(this._quadBuffer, i4);
            }
            int i16 = i4;
            i4++;
            this._quadBuffer[i16] = i13;
            i = i15;
        }
        return parseEscapedName(this._quadBuffer, i4, 0, i, 0);
    }

    protected String slowParseName() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        return i2 == 34 ? JsonProperty.USE_DEFAULT_NAME : parseEscapedName(this._quadBuffer, 0, 0, i2, 0);
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
                            int[] _growNameDecodeBuffer = _growNameDecodeBuffer(iArr, iArr.length);
                            iArr = _growNameDecodeBuffer;
                            this._quadBuffer = _growNameDecodeBuffer;
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
                                int[] _growNameDecodeBuffer2 = _growNameDecodeBuffer(iArr, iArr.length);
                                iArr = _growNameDecodeBuffer2;
                                this._quadBuffer = _growNameDecodeBuffer2;
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
                    int[] _growNameDecodeBuffer3 = _growNameDecodeBuffer(iArr, iArr.length);
                    iArr = _growNameDecodeBuffer3;
                    this._quadBuffer = _growNameDecodeBuffer3;
                }
                int i9 = i;
                i++;
                iArr[i9] = i2;
                i2 = i3;
                i4 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            i3 = bArr[i10] & 255;
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                int[] _growNameDecodeBuffer4 = _growNameDecodeBuffer(iArr, iArr.length);
                iArr = _growNameDecodeBuffer4;
                this._quadBuffer = _growNameDecodeBuffer4;
            }
            int i11 = i;
            i++;
            iArr[i11] = _padLastQuad(i2, i4);
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
        while (true) {
            if (i4 < 4) {
                i4++;
                i3 = (i3 << 8) | i;
            } else {
                if (i2 >= iArr.length) {
                    int[] _growNameDecodeBuffer = _growNameDecodeBuffer(iArr, iArr.length);
                    iArr = _growNameDecodeBuffer;
                    this._quadBuffer = _growNameDecodeBuffer;
                }
                int i5 = i2;
                i2++;
                iArr[i5] = i3;
                i3 = i;
                i4 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            i = this._inputBuffer[this._inputPtr] & 255;
            if (inputCodeUtf8JsNames[i] != 0) {
                break;
            }
            this._inputPtr++;
        }
        if (i4 > 0) {
            if (i2 >= iArr.length) {
                int[] _growNameDecodeBuffer2 = _growNameDecodeBuffer(iArr, iArr.length);
                iArr = _growNameDecodeBuffer2;
                this._quadBuffer = _growNameDecodeBuffer2;
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
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 39) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        int[] iArr = this._quadBuffer;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int[] iArr2 = INPUT_CODES_LATIN1;
        while (i2 != 39) {
            if (iArr2[i2] != 0 && i2 != 34) {
                if (i2 != 92) {
                    _throwUnquotedSpace(i2, "name");
                } else {
                    i2 = _decodeEscaped();
                }
                if (i2 > 127) {
                    if (i5 >= 4) {
                        if (i3 >= iArr.length) {
                            int[] _growNameDecodeBuffer = _growNameDecodeBuffer(iArr, iArr.length);
                            iArr = _growNameDecodeBuffer;
                            this._quadBuffer = _growNameDecodeBuffer;
                        }
                        int i6 = i3;
                        i3++;
                        iArr[i6] = i4;
                        i4 = 0;
                        i5 = 0;
                    }
                    if (i2 < 2048) {
                        i4 = (i4 << 8) | 192 | (i2 >> 6);
                        i5++;
                    } else {
                        int i7 = (i4 << 8) | 224 | (i2 >> 12);
                        int i8 = i5 + 1;
                        if (i8 >= 4) {
                            if (i3 >= iArr.length) {
                                int[] _growNameDecodeBuffer2 = _growNameDecodeBuffer(iArr, iArr.length);
                                iArr = _growNameDecodeBuffer2;
                                this._quadBuffer = _growNameDecodeBuffer2;
                            }
                            int i9 = i3;
                            i3++;
                            iArr[i9] = i7;
                            i7 = 0;
                            i8 = 0;
                        }
                        i4 = (i7 << 8) | 128 | ((i2 >> 6) & 63);
                        i5 = i8 + 1;
                    }
                    i2 = 128 | (i2 & 63);
                }
            }
            if (i5 < 4) {
                i5++;
                i4 = (i4 << 8) | i2;
            } else {
                if (i3 >= iArr.length) {
                    int[] _growNameDecodeBuffer3 = _growNameDecodeBuffer(iArr, iArr.length);
                    iArr = _growNameDecodeBuffer3;
                    this._quadBuffer = _growNameDecodeBuffer3;
                }
                int i10 = i3;
                i3++;
                iArr[i10] = i4;
                i4 = i2;
                i5 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this._inputBuffer;
            int i11 = this._inputPtr;
            this._inputPtr = i11 + 1;
            i2 = bArr2[i11] & 255;
        }
        if (i5 > 0) {
            if (i3 >= iArr.length) {
                int[] _growNameDecodeBuffer4 = _growNameDecodeBuffer(iArr, iArr.length);
                iArr = _growNameDecodeBuffer4;
                this._quadBuffer = _growNameDecodeBuffer4;
            }
            int i12 = i3;
            i3++;
            iArr[i12] = _padLastQuad(i4, i5);
        }
        String findName = this._symbols.findName(iArr, i3);
        if (findName == null) {
            findName = addName(iArr, i3, i5);
        }
        return findName;
    }

    private final String findName(int i, int i2) throws JsonParseException, StreamConstraintsException {
        int _padLastQuad = _padLastQuad(i, i2);
        String findName = this._symbols.findName(_padLastQuad);
        if (findName != null) {
            return findName;
        }
        this._quadBuffer[0] = _padLastQuad;
        return addName(this._quadBuffer, 1, i2);
    }

    private final String findName(int i, int i2, int i3) throws JsonParseException, StreamConstraintsException {
        int _padLastQuad = _padLastQuad(i2, i3);
        String findName = this._symbols.findName(i, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        this._quadBuffer[0] = i;
        this._quadBuffer[1] = _padLastQuad;
        return addName(this._quadBuffer, 2, i3);
    }

    private final String findName(int i, int i2, int i3, int i4) throws JsonParseException, StreamConstraintsException {
        int _padLastQuad = _padLastQuad(i3, i4);
        String findName = this._symbols.findName(i, i2, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = _padLastQuad(_padLastQuad, i4);
        return addName(iArr, 3, i4);
    }

    private final String findName(int[] iArr, int i, int i2, int i3) throws JsonParseException, StreamConstraintsException {
        if (i >= iArr.length) {
            int[] _growNameDecodeBuffer = _growNameDecodeBuffer(iArr, iArr.length);
            iArr = _growNameDecodeBuffer;
            this._quadBuffer = _growNameDecodeBuffer;
        }
        int i4 = i + 1;
        iArr[i] = _padLastQuad(i2, i3);
        String findName = this._symbols.findName(iArr, i4);
        return findName == null ? addName(iArr, i4, i3) : findName;
    }

    private final String addName(int[] iArr, int i, int i2) throws JsonParseException, StreamConstraintsException {
        int i3;
        int i4;
        int i5;
        int i6 = ((i << 2) - 4) + i2;
        this._streamReadConstraints.validateNameLength(i6);
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
        if (i2 < 4) {
            iArr[i - 1] = i3;
        }
        return this._symbols.addName(str, iArr, i);
    }

    private static final int _padLastQuad(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    protected void _loadMoreGuaranteed() throws IOException {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    @Override
    protected void _finishString() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            _loadMoreGuaranteed();
            i = this._inputPtr;
        }
        int i2 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = INPUT_CODES_UTF8;
        int min = Math.min(this._inputEnd, i + emptyAndGetCurrentSegment.length);
        byte[] bArr = this._inputBuffer;
        while (true) {
            if (i >= min) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (iArr[i3] == 0) {
                i++;
                int i4 = i2;
                i2++;
                emptyAndGetCurrentSegment[i4] = (char) i3;
            } else if (i3 == 34) {
                this._inputPtr = i + 1;
                this._textBuffer.setCurrentLength(i2);
                return;
            }
        }
        this._inputPtr = i;
        _finishString2(emptyAndGetCurrentSegment, i2);
    }

    protected String _finishAndReturnString() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            _loadMoreGuaranteed();
            i = this._inputPtr;
        }
        int i2 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = INPUT_CODES_UTF8;
        int min = Math.min(this._inputEnd, i + emptyAndGetCurrentSegment.length);
        byte[] bArr = this._inputBuffer;
        while (true) {
            if (i >= min) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (iArr[i3] == 0) {
                i++;
                int i4 = i2;
                i2++;
                emptyAndGetCurrentSegment[i4] = (char) i3;
            } else if (i3 == 34) {
                this._inputPtr = i + 1;
                return this._textBuffer.setCurrentAndReturn(i2);
            }
        }
        this._inputPtr = i;
        _finishString2(emptyAndGetCurrentSegment, i2);
        return this._textBuffer.contentsAsString();
    }

    private final void _finishString2(char[] cArr, int i) throws IOException {
        int[] iArr = INPUT_CODES_UTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                _loadMoreGuaranteed();
                i2 = this._inputPtr;
            }
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int min = Math.min(this._inputEnd, i2 + (cArr.length - i));
            while (true) {
                if (i2 < min) {
                    int i3 = i2;
                    i2++;
                    char c = bArr[i3] & 255 ? 1 : 0;
                    if (iArr[c] != 0) {
                        this._inputPtr = i2;
                        if (c == '\"') {
                            this._textBuffer.setCurrentLength(i);
                            return;
                        }
                        switch (iArr[c]) {
                            case 1:
                                c = _decodeEscaped();
                                break;
                            case 2:
                                c = _decodeUtf8_2(c);
                                break;
                            case 3:
                                if (this._inputEnd - this._inputPtr < 2) {
                                    c = _decodeUtf8_3(c);
                                    break;
                                } else {
                                    c = _decodeUtf8_3fast(c);
                                    break;
                                }
                            case 4:
                                int _decodeUtf8_4 = _decodeUtf8_4(c);
                                int i4 = i;
                                i++;
                                cArr[i4] = (char) (55296 | (_decodeUtf8_4 >> 10));
                                if (i >= cArr.length) {
                                    cArr = this._textBuffer.finishCurrentSegment();
                                    i = 0;
                                }
                                c = 56320 | (_decodeUtf8_4 & FastDoubleMath.DOUBLE_EXPONENT_BIAS);
                                break;
                            default:
                                if (c >= ' ') {
                                    _reportInvalidChar(c);
                                    break;
                                } else {
                                    _throwUnquotedSpace(c, "string value");
                                    break;
                                }
                        }
                        if (i >= cArr.length) {
                            cArr = this._textBuffer.finishCurrentSegment();
                            i = 0;
                        }
                        int i5 = i;
                        i++;
                        cArr[i5] = c;
                    } else {
                        int i6 = i;
                        i++;
                        cArr[i6] = c;
                    }
                } else {
                    this._inputPtr = i2;
                }
            }
        }
    }

    protected void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int[] iArr = INPUT_CODES_UTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i = this._inputPtr;
            int i2 = this._inputEnd;
            if (i >= i2) {
                _loadMoreGuaranteed();
                i = this._inputPtr;
                i2 = this._inputEnd;
            }
            while (true) {
                if (i < i2) {
                    int i3 = i;
                    i++;
                    int i4 = bArr[i3] & 255;
                    if (iArr[i4] != 0) {
                        this._inputPtr = i;
                        if (i4 != 34) {
                            switch (iArr[i4]) {
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
                                    _skipUtf8_4(i4);
                                    break;
                                default:
                                    if (i4 >= 32) {
                                        _reportInvalidChar(i4);
                                        break;
                                    } else {
                                        _throwUnquotedSpace(i4, "string value");
                                        break;
                                    }
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    this._inputPtr = i;
                }
            }
        }
    }

    protected com.kammoun.utils.jackson.core.JsonToken _handleUnexpectedValue(int r8) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.core.json.UTF8StreamJsonParser._handleUnexpectedValue(int):com.kammoun.utils.jackson.core.JsonToken");
    }

    protected JsonToken _handleApos() throws IOException {
        int i = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = INPUT_CODES_UTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            if (i >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i2 = this._inputEnd;
            int length = this._inputPtr + (emptyAndGetCurrentSegment.length - i);
            if (length < i2) {
                i2 = length;
            }
            while (true) {
                if (this._inputPtr < i2) {
                    int i3 = this._inputPtr;
                    this._inputPtr = i3 + 1;
                    char c = bArr[i3] & 255 ? 1 : 0;
                    if (c == '\'') {
                        this._textBuffer.setCurrentLength(i);
                        return JsonToken.VALUE_STRING;
                    }
                    if (iArr[c] == 0 || c == '\"') {
                        int i4 = i;
                        i++;
                        emptyAndGetCurrentSegment[i4] = c;
                    } else {
                        switch (iArr[c]) {
                            case 1:
                                c = _decodeEscaped();
                                break;
                            case 2:
                                c = _decodeUtf8_2(c);
                                break;
                            case 3:
                                if (this._inputEnd - this._inputPtr < 2) {
                                    c = _decodeUtf8_3(c);
                                    break;
                                } else {
                                    c = _decodeUtf8_3fast(c);
                                    break;
                                }
                            case 4:
                                int _decodeUtf8_4 = _decodeUtf8_4(c);
                                int i5 = i;
                                i++;
                                emptyAndGetCurrentSegment[i5] = (char) (55296 | (_decodeUtf8_4 >> 10));
                                if (i >= emptyAndGetCurrentSegment.length) {
                                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                                    i = 0;
                                }
                                c = 56320 | (_decodeUtf8_4 & FastDoubleMath.DOUBLE_EXPONENT_BIAS);
                                break;
                            default:
                                if (c < ' ') {
                                    _throwUnquotedSpace(c, "string value");
                                }
                                _reportInvalidChar(c);
                                break;
                        }
                        if (i >= emptyAndGetCurrentSegment.length) {
                            emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            i = 0;
                        }
                        int i6 = i;
                        i++;
                        emptyAndGetCurrentSegment[i6] = c;
                    }
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
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            i = bArr[i2];
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
            _reportError("Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", str);
        }
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) && z2 && !z) {
            _reportUnexpectedNumberChar(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        _reportUnexpectedNumberChar(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        return null;
    }

    protected final void _matchTrue() throws IOException {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i3 + 1;
                if (bArr[i3] == 117) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || (i | 32) == 125)) {
                        this._inputPtr = i5;
                        return;
                    }
                }
            }
        }
        _matchToken2("true", 1);
    }

    protected final void _matchFalse() throws IOException {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i3 + 1;
                if (bArr[i3] == 108) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 115) {
                        int i6 = i5 + 1;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || (i | 32) == 125)) {
                            this._inputPtr = i6;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken2("false", 1);
    }

    protected final void _matchNull() throws IOException {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i3 + 1;
                if (bArr[i3] == 108) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || (i | 32) == 125)) {
                        this._inputPtr = i5;
                        return;
                    }
                }
            }
        }
        _matchToken2("null", 1);
    }

    protected final void _matchToken(String str, int i) throws IOException {
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i)) {
                _reportInvalidToken(str.substring(0, i));
            }
            this._inputPtr++;
            i++;
        } while (i < length);
        int i2 = this._inputBuffer[this._inputPtr] & 255;
        if (i2 < 48 || i2 == 93 || i2 == 125) {
            return;
        }
        _checkMatchEnd(str, i, i2);
    }

    private final void _matchToken2(String str, int i) throws IOException {
        int i2;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i)) {
                _reportInvalidToken(str.substring(0, i));
            }
            this._inputPtr++;
            i++;
        } while (i < length);
        if ((this._inputPtr < this._inputEnd || _loadMore()) && (i2 = this._inputBuffer[this._inputPtr] & 255) >= 48 && i2 != 93 && i2 != 125) {
            _checkMatchEnd(str, i, i2);
        }
    }

    private final void _checkMatchEnd(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) _decodeCharForError(i2))) {
            _reportInvalidToken(str.substring(0, i));
        }
    }

    private final int _skipWS() throws IOException {
        while (this._inputPtr < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 > 32) {
                if (i2 != 47 && i2 != 35) {
                    return i2;
                }
                this._inputPtr--;
                return _skipWS2();
            }
            if (i2 != 32) {
                if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 == 13) {
                    _skipCR();
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
        }
        return _skipWS2();
    }

    private final int _skipWS2() throws IOException {
        int i;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            i = bArr[i2] & 255;
            if (i > 32) {
                if (i == 47) {
                    _skipComment();
                } else if (i != 35 || !_skipYAMLComment()) {
                    break;
                }
            } else if (i != 32) {
                if (i == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i == 13) {
                    _skipCR();
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                }
            }
        }
        return i;
    }

    private final int _skipWSOrEnd() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 > 32) {
            if (i2 != 47 && i2 != 35) {
                return i2;
            }
            this._inputPtr--;
            return _skipWSOrEnd2();
        }
        if (i2 != 32) {
            if (i2 == 10) {
                this._currInputRow++;
                this._currInputRowStart = this._inputPtr;
            } else if (i2 == 13) {
                _skipCR();
            } else if (i2 != 9) {
                _throwInvalidSpace(i2);
            }
        }
        while (this._inputPtr < this._inputEnd) {
            byte[] bArr2 = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            int i4 = bArr2[i3] & 255;
            if (i4 > 32) {
                if (i4 != 47 && i4 != 35) {
                    return i4;
                }
                this._inputPtr--;
                return _skipWSOrEnd2();
            }
            if (i4 != 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i4 == 13) {
                    _skipCR();
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
        }
        return _skipWSOrEnd2();
    }

    private final int _skipWSOrEnd2() throws IOException {
        int i;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            i = bArr[i2] & 255;
            if (i > 32) {
                if (i == 47) {
                    _skipComment();
                } else if (i != 35 || !_skipYAMLComment()) {
                    break;
                }
            } else if (i != 32) {
                if (i == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i == 13) {
                    _skipCR();
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                }
            }
        }
        return i;
    }

    private final int _skipColon() throws IOException {
        if (this._inputPtr + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        byte b = this._inputBuffer[this._inputPtr];
        if (b == 58) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr + 1;
            this._inputPtr = i;
            byte b2 = bArr[i];
            if (b2 > 32) {
                if (b2 == 47 || b2 == 35) {
                    return _skipColon2(true);
                }
                this._inputPtr++;
                return b2;
            }
            if (b2 == 32 || b2 == 9) {
                byte[] bArr2 = this._inputBuffer;
                int i2 = this._inputPtr + 1;
                this._inputPtr = i2;
                byte b3 = bArr2[i2];
                if (b3 > 32) {
                    if (b3 == 47 || b3 == 35) {
                        return _skipColon2(true);
                    }
                    this._inputPtr++;
                    return b3;
                }
            }
            return _skipColon2(true);
        }
        if (b == 32 || b == 9) {
            byte[] bArr3 = this._inputBuffer;
            int i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            b = bArr3[i3];
        }
        if (b != 58) {
            return _skipColon2(false);
        }
        byte[] bArr4 = this._inputBuffer;
        int i4 = this._inputPtr + 1;
        this._inputPtr = i4;
        byte b4 = bArr4[i4];
        if (b4 > 32) {
            if (b4 == 47 || b4 == 35) {
                return _skipColon2(true);
            }
            this._inputPtr++;
            return b4;
        }
        if (b4 == 32 || b4 == 9) {
            byte[] bArr5 = this._inputBuffer;
            int i5 = this._inputPtr + 1;
            this._inputPtr = i5;
            byte b5 = bArr5[i5];
            if (b5 > 32) {
                if (b5 == 47 || b5 == 35) {
                    return _skipColon2(true);
                }
                this._inputPtr++;
                return b5;
            }
        }
        return _skipColon2(true);
    }

    private final int _skipColon2(boolean z) throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", null);
                return -1;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 > 32) {
                if (i2 == 47) {
                    _skipComment();
                } else if (i2 != 35 || !_skipYAMLComment()) {
                    if (z) {
                        return i2;
                    }
                    if (i2 != 58) {
                        _reportUnexpectedChar(i2, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i2 != 32) {
                if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 == 13) {
                    _skipCR();
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
        }
    }

    private final void _skipComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 47) {
            _skipLine();
        } else if (i2 == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(i2, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void _skipCComment() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                int i2 = bArr[i] & 255;
                int i3 = inputCodeComment[i2];
                if (i3 != 0) {
                    switch (i3) {
                        case 2:
                            _skipUtf8_2();
                            break;
                        case 3:
                            _skipUtf8_3();
                            break;
                        case 4:
                            _skipUtf8_4(i2);
                            break;
                        case 10:
                            this._currInputRow++;
                            this._currInputRowStart = this._inputPtr;
                            break;
                        case StdKeyDeserializer.TYPE_URI:
                            _skipCR();
                            break;
                        case 42:
                            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                                break;
                            } else if (this._inputBuffer[this._inputPtr] != 47) {
                                break;
                            } else {
                                this._inputPtr++;
                                return;
                            }
                            break;
                        default:
                            _reportInvalidChar(i2);
                            break;
                    }
                }
            }
        }
        _reportInvalidEOF(" in a comment", null);
    }

    private final boolean _skipYAMLComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _skipLine() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & 255;
            int i3 = inputCodeComment[i2];
            if (i3 != 0) {
                switch (i3) {
                    case 2:
                        _skipUtf8_2();
                        break;
                    case 3:
                        _skipUtf8_3();
                        break;
                    case 4:
                        _skipUtf8_4(i2);
                        break;
                    case 10:
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                        return;
                    case StdKeyDeserializer.TYPE_URI:
                        _skipCR();
                        return;
                    case 42:
                        break;
                    default:
                        if (i3 >= 0) {
                            break;
                        } else {
                            _reportInvalidChar(i2);
                            break;
                        }
                }
            }
        }
    }

    @Override
    protected char _decodeEscaped() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i];
        switch (b) {
            case JsonFactory.DEFAULT_QUOTE_CHAR:
            case JsonPointer.SEPARATOR:
            case 92:
                return (char) b;
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
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
                    }
                    byte[] bArr2 = this._inputBuffer;
                    int i4 = this._inputPtr;
                    this._inputPtr = i4 + 1;
                    byte b2 = bArr2[i4];
                    int charToHex = CharTypes.charToHex(b2);
                    if (charToHex < 0) {
                        _reportUnexpectedChar(b2 & 255, "expected a hex-digit for character escape sequence");
                    }
                    i2 = (i2 << 4) | charToHex;
                }
                return (char) i2;
            default:
                return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(b));
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
            int nextByte = nextByte();
            if ((nextByte & 192) != 128) {
                _reportInvalidOther(nextByte & 255);
            }
            i2 = (i2 << 6) | (nextByte & 63);
            if (z > 1) {
                int nextByte2 = nextByte();
                if ((nextByte2 & 192) != 128) {
                    _reportInvalidOther(nextByte2 & 255);
                }
                i2 = (i2 << 6) | (nextByte2 & 63);
                if (z > 2) {
                    int nextByte3 = nextByte();
                    if ((nextByte3 & 192) != 128) {
                        _reportInvalidOther(nextByte3 & 255);
                    }
                    i2 = (i2 << 6) | (nextByte3 & 63);
                }
            }
        }
        return i2;
    }

    private final int _decodeUtf8_2(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    private final int _decodeUtf8_3(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        int i4 = (i2 << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i5 = this._inputPtr;
        this._inputPtr = i5 + 1;
        byte b2 = bArr2[i5];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, this._inputPtr);
        }
        return (i4 << 6) | (b2 & 63);
    }

    private final int _decodeUtf8_3fast(int i) throws IOException {
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        int i4 = (i2 << 6) | (b & 63);
        byte[] bArr2 = this._inputBuffer;
        int i5 = this._inputPtr;
        this._inputPtr = i5 + 1;
        byte b2 = bArr2[i5];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, this._inputPtr);
        }
        return (i4 << 6) | (b2 & 63);
    }

    private final int _decodeUtf8_4(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        int i3 = ((i & 7) << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, this._inputPtr);
        }
        int i5 = (i3 << 6) | (b2 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i6 = this._inputPtr;
        this._inputPtr = i6 + 1;
        byte b3 = bArr3[i6];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, this._inputPtr);
        }
        return ((i5 << 6) | (b3 & 63)) - 65536;
    }

    private final void _skipUtf8_2() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
    }

    private final void _skipUtf8_3() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b2 = bArr2[i2];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, this._inputPtr);
        }
    }

    private final void _skipUtf8_4(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        byte b3 = bArr3[i4];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, this._inputPtr);
        }
    }

    protected final void _skipCR() throws IOException {
        if ((this._inputPtr < this._inputEnd || _loadMore()) && this._inputBuffer[this._inputPtr] == 10) {
            this._inputPtr++;
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    private int nextByte() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return bArr[i] & 255;
    }

    protected void _reportInvalidToken(String str, int i) throws IOException {
        this._inputPtr = i;
        _reportInvalidToken(str, _validJsonTokenList());
    }

    protected void _reportInvalidToken(String str) throws IOException {
        _reportInvalidToken(str, _validJsonTokenList());
    }

    protected void _reportInvalidToken(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char _decodeCharForError = (char) _decodeCharForError(bArr[i]);
            if (!Character.isJavaIdentifierPart(_decodeCharForError)) {
                break;
            }
            sb.append(_decodeCharForError);
            if (sb.length() >= this._ioContext.errorReportConfiguration().getMaxErrorTokenLength()) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
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

    protected void _reportInvalidOther(int i) throws JsonParseException {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    protected void _reportInvalidOther(int i, int i2) throws JsonParseException {
        this._inputPtr = i2;
        _reportInvalidOther(i);
    }

    protected final byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(i2);
                if (decodeBase64Char < 0) {
                    if (i2 == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, i2, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                int i3 = decodeBase64Char;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr2 = this._inputBuffer;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                int i5 = bArr2[i4] & 255;
                int decodeBase64Char2 = base64Variant.decodeBase64Char(i5);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, i5, 1);
                }
                int i6 = (i3 << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                int i8 = bArr3[i7] & 255;
                int decodeBase64Char3 = base64Variant.decodeBase64Char(i8);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (i8 == 34) {
                            _getByteArrayBuilder.append(i6 >> 4);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, i8, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i9 = this._inputPtr;
                        this._inputPtr = i9 + 1;
                        int i10 = bArr4[i9] & 255;
                        if (!base64Variant.usesPaddingChar(i10) && _decodeBase64Escape(base64Variant, i10, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, i10, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        _getByteArrayBuilder.append(i6 >> 4);
                    }
                }
                int i11 = (i6 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr5 = this._inputBuffer;
                int i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                int i13 = bArr5[i12] & 255;
                int decodeBase64Char4 = base64Variant.decodeBase64Char(i13);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (i13 == 34) {
                            _getByteArrayBuilder.appendTwoBytes(i11 >> 2);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, i13, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i11 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i11 << 6) | decodeBase64Char4);
            }
        }
    }

    @Override
    public JsonLocation currentLocation() {
        return new JsonLocation(_contentReference(), this._currInputProcessed + this._inputPtr, -1L, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override
    public JsonLocation _currentLocationMinusOne() {
        int i = this._inputPtr - 1;
        return new JsonLocation(_contentReference(), this._currInputProcessed + i, -1L, this._currInputRow, (i - this._currInputRowStart) + 1);
    }

    @Override
    public JsonLocation currentTokenLocation() {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return new JsonLocation(_contentReference(), this._tokenInputTotal - 1, -1L, this._tokenInputRow, this._tokenInputCol);
        }
        return new JsonLocation(_contentReference(), this._currInputProcessed + (this._nameStartOffset - 1), -1L, this._nameStartRow, this._nameStartCol);
    }

    private final void _updateLocation() {
        this._tokenInputRow = this._currInputRow;
        int i = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + i;
        this._tokenInputCol = i - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        this._nameStartRow = this._currInputRow;
        int i = this._inputPtr;
        this._nameStartOffset = i;
        this._nameStartCol = i - this._currInputRowStart;
    }

    private final JsonToken _closeScope(int i) throws JsonParseException {
        if (i == 125) {
            _closeObjectScope();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this._currToken = jsonToken;
            return jsonToken;
        }
        _closeArrayScope();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final void _closeArrayScope() throws JsonParseException {
        _updateLocation();
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, '}');
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    private final void _closeObjectScope() throws JsonParseException {
        _updateLocation();
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, ']');
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }
}
