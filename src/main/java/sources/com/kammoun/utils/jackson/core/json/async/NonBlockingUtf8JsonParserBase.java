package com.kammoun.utils.jackson.core.json.async;

import com.kammoun.donutCore.sell.model.SellLevelData;
import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.core.JsonFactory;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonPointer;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.io.CharTypes;
import com.kammoun.utils.jackson.core.io.IOContext;
import com.kammoun.utils.jackson.core.io.doubleparser.AbstractBigDecimalParser;
import com.kammoun.utils.jackson.core.io.doubleparser.FastDoubleMath;
import com.kammoun.utils.jackson.core.json.JsonReadFeature;
import com.kammoun.utils.jackson.core.sym.ByteQuadsCanonicalizer;
import com.kammoun.utils.jackson.core.sym.CharsToNameCanonicalizer;
import com.kammoun.utils.jackson.core.util.VersionUtil;
import com.kammoun.utils.jackson.databind.deser.std.StdKeyDeserializer;
import java.io.IOException;

public abstract class NonBlockingUtf8JsonParserBase extends NonBlockingJsonParserBase {
    private static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    protected int _origBufferLen;

    public NonBlockingUtf8JsonParserBase(IOContext iOContext, int i, ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
        super(iOContext, i, byteQuadsCanonicalizer);
    }

    public final boolean needMoreInput() {
        return this._inputPtr >= this._inputEnd && !this._endOfInput;
    }

    public void endOfInput() {
        this._endOfInput = true;
    }

    @Override
    protected char _decodeEscaped() throws IOException {
        VersionUtil.throwInternal();
        return ' ';
    }

    @Override
    public JsonToken nextToken() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            if (this._closed) {
                return null;
            }
            return this._endOfInput ? this._currToken == JsonToken.NOT_AVAILABLE ? _finishTokenWithEOF() : _eofAsNextToken() : JsonToken.NOT_AVAILABLE;
        }
        if (this._currToken == JsonToken.NOT_AVAILABLE) {
            return _finishToken();
        }
        this._numTypesValid = 0;
        this._tokenInputTotal = this._currInputProcessed + this._inputPtr;
        this._binaryValue = null;
        int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
        switch (this._majorState) {
            case 0:
                return _startDocument(nextUnsignedByteFromBuffer);
            case 1:
                return _startValue(nextUnsignedByteFromBuffer);
            case 2:
                return _startFieldName(nextUnsignedByteFromBuffer);
            case 3:
                return _startFieldNameAfterComma(nextUnsignedByteFromBuffer);
            case 4:
                return _startValueExpectColon(nextUnsignedByteFromBuffer);
            case 5:
                return _startValue(nextUnsignedByteFromBuffer);
            case 6:
                return _startValueExpectComma(nextUnsignedByteFromBuffer);
            default:
                VersionUtil.throwInternal();
                return null;
        }
    }

    protected abstract byte getNextSignedByteFromBuffer();

    protected abstract int getNextUnsignedByteFromBuffer();

    protected abstract byte getByteFromBuffer(int i);

    protected final JsonToken _finishToken() throws IOException {
        switch (this._minorState) {
            case 1:
                return _finishBOM(this._pending32);
            case 2:
            case 3:
            case 6:
            case 11:
            case SellLevelData.PROGRESS_BAR_LENGTH:
            case 21:
            case 27:
            case 28:
            case 29:
            case CharsToNameCanonicalizer.HASH_MULT:
            case JsonFactory.DEFAULT_QUOTE_CHAR:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 46:
            case JsonPointer.SEPARATOR:
            case 48:
            case 49:
            default:
                VersionUtil.throwInternal();
                return null;
            case 4:
                return _startFieldName(getNextUnsignedByteFromBuffer());
            case 5:
                return _startFieldNameAfterComma(getNextUnsignedByteFromBuffer());
            case 7:
                return _parseEscapedName(this._quadLength, this._pending32, this._pendingBytes);
            case 8:
                return _finishFieldWithEscape();
            case 9:
                return _finishAposName(this._quadLength, this._pending32, this._pendingBytes);
            case 10:
                return _finishUnquotedName(this._quadLength, this._pending32, this._pendingBytes);
            case 12:
                return _startValue(getNextUnsignedByteFromBuffer());
            case StdKeyDeserializer.TYPE_URI:
                return _startValueExpectComma(getNextUnsignedByteFromBuffer());
            case StdKeyDeserializer.TYPE_URL:
                return _startValueExpectColon(getNextUnsignedByteFromBuffer());
            case StdKeyDeserializer.TYPE_CLASS:
                return _startValueAfterComma(getNextUnsignedByteFromBuffer());
            case 16:
                return _finishKeywordToken("null", this._pending32, JsonToken.VALUE_NULL);
            case StdKeyDeserializer.TYPE_BYTE_ARRAY:
                return _finishKeywordToken("true", this._pending32, JsonToken.VALUE_TRUE);
            case 18:
                return _finishKeywordToken("false", this._pending32, JsonToken.VALUE_FALSE);
            case 19:
                return _finishNonStdToken(this._nonStdTokenType, this._pending32);
            case 22:
                return _finishNumberPlus(getNextUnsignedByteFromBuffer());
            case 23:
                return _finishNumberMinus(getNextUnsignedByteFromBuffer());
            case 24:
                return _finishNumberLeadingZeroes();
            case 25:
                return _finishNumberLeadingNegZeroes();
            case 26:
                return _finishNumberIntegralPart(this._textBuffer.getBufferWithoutReset(), this._textBuffer.getCurrentSegmentSize());
            case 30:
                return _finishFloatFraction();
            case 31:
                return _finishFloatExponent(true, getNextUnsignedByteFromBuffer());
            case AbstractBigDecimalParser.MANY_DIGITS_THRESHOLD:
                return _finishFloatExponent(false, getNextUnsignedByteFromBuffer());
            case 40:
                return _finishRegularString();
            case 41:
                int _decodeSplitEscaped = _decodeSplitEscaped(this._quoted32, this._quotedDigits);
                if (_decodeSplitEscaped < 0) {
                    return JsonToken.NOT_AVAILABLE;
                }
                this._textBuffer.append((char) _decodeSplitEscaped);
                return this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
            case 42:
                this._textBuffer.append((char) _decodeUTF8_2(this._pending32, getNextSignedByteFromBuffer()));
                return this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
            case 43:
                return !_decodeSplitUTF8_3(this._pending32, this._pendingBytes, getNextSignedByteFromBuffer()) ? JsonToken.NOT_AVAILABLE : this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
            case 44:
                return !_decodeSplitUTF8_4(this._pending32, this._pendingBytes, getNextSignedByteFromBuffer()) ? JsonToken.NOT_AVAILABLE : this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
            case 45:
                return _finishAposString();
            case 50:
                return _finishErrorToken();
            case 51:
                return _startSlashComment(this._pending32);
            case 52:
                return _finishCComment(this._pending32, true);
            case FastDoubleMath.DOUBLE_SIGNIFICAND_WIDTH:
                return _finishCComment(this._pending32, false);
            case 54:
                return _finishCppComment(this._pending32);
            case 55:
                return _finishHashComment(this._pending32);
        }
    }

    protected final JsonToken _finishTokenWithEOF() throws IOException {
        JsonToken jsonToken = this._currToken;
        switch (this._minorState) {
            case 3:
                return _eofAsNextToken();
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case StdKeyDeserializer.TYPE_URI:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case SellLevelData.PROGRESS_BAR_LENGTH:
            case 21:
            case 22:
            case 23:
            case 27:
            case 28:
            case 29:
            case CharsToNameCanonicalizer.HASH_MULT:
            case JsonFactory.DEFAULT_QUOTE_CHAR:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case JsonPointer.SEPARATOR:
            case 48:
            case 49:
            case 51:
            default:
                _reportInvalidEOF(": was expecting rest of token (internal state: " + this._minorState + ")", this._currToken);
                return jsonToken;
            case 12:
                return _eofAsNextToken();
            case 16:
                return _finishKeywordTokenWithEOF("null", this._pending32, JsonToken.VALUE_NULL);
            case StdKeyDeserializer.TYPE_BYTE_ARRAY:
                return _finishKeywordTokenWithEOF("true", this._pending32, JsonToken.VALUE_TRUE);
            case 18:
                return _finishKeywordTokenWithEOF("false", this._pending32, JsonToken.VALUE_FALSE);
            case 19:
                return _finishNonStdTokenWithEOF(this._nonStdTokenType, this._pending32);
            case 24:
            case 25:
                return _valueCompleteInt(0, "0");
            case 26:
                int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                if (this._numberNegative) {
                    currentSegmentSize--;
                }
                this._intLength = currentSegmentSize;
                return _valueComplete(JsonToken.VALUE_NUMBER_INT);
            case 30:
                this._expLength = 0;
                return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
            case 31:
                _reportInvalidEOF(": was expecting fraction after exponent marker", JsonToken.VALUE_NUMBER_FLOAT);
                _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                return _eofAsNextToken();
            case AbstractBigDecimalParser.MANY_DIGITS_THRESHOLD:
                return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
            case 50:
                return _finishErrorTokenWithEOF();
            case 52:
            case FastDoubleMath.DOUBLE_SIGNIFICAND_WIDTH:
                _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                return _eofAsNextToken();
            case 54:
            case 55:
                return _eofAsNextToken();
        }
    }

    private final JsonToken _startDocument(int i) throws IOException {
        int i2 = i & 255;
        if (i2 == 239 && this._minorState != 1) {
            return _finishBOM(1);
        }
        while (i2 <= 32) {
            if (i2 != 32) {
                if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
            if (this._inputPtr >= this._inputEnd) {
                this._minorState = 3;
                if (this._closed) {
                    return null;
                }
                return this._endOfInput ? _eofAsNextToken() : JsonToken.NOT_AVAILABLE;
            }
            i2 = getNextUnsignedByteFromBuffer();
        }
        return _startValue(i2);
    }

    private final JsonToken _finishBOM(int i) throws IOException {
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            switch (i) {
                case 1:
                    if (nextUnsignedByteFromBuffer == 187) {
                        break;
                    } else {
                        _reportError("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", Integer.valueOf(nextUnsignedByteFromBuffer));
                        break;
                    }
                case 2:
                    if (nextUnsignedByteFromBuffer == 191) {
                        break;
                    } else {
                        _reportError("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", Integer.valueOf(nextUnsignedByteFromBuffer));
                        break;
                    }
                case 3:
                    this._currInputProcessed -= 3;
                    return _startDocument(nextUnsignedByteFromBuffer);
            }
            i++;
        }
        this._pending32 = i;
        this._minorState = 1;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _startFieldName(int i) throws IOException {
        String _fastParseName;
        if (i <= 32) {
            i = _skipWS(i);
            if (i <= 0) {
                this._minorState = 4;
                return this._currToken;
            }
        }
        _updateTokenLocation();
        return i != 34 ? i == 125 ? _closeObjectScope() : _handleOddName(i) : (this._inputPtr + 13 > this._inputEnd || (_fastParseName = _fastParseName()) == null) ? _parseEscapedName(0, 0, 0) : _fieldComplete(_fastParseName);
    }

    private final JsonToken _startFieldNameAfterComma(int i) throws IOException {
        String _fastParseName;
        if (i <= 32) {
            i = _skipWS(i);
            if (i <= 0) {
                this._minorState = 5;
                return this._currToken;
            }
        }
        if (i != 44) {
            if (i == 125) {
                return _closeObjectScope();
            }
            if (i == 35) {
                return _finishHashComment(5);
            }
            if (i == 47) {
                return _startSlashComment(5);
            }
            _reportUnexpectedChar(i, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 4;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte byteFromBuffer = getByteFromBuffer(i2);
        this._inputPtr = i2 + 1;
        if (byteFromBuffer <= 32) {
            byteFromBuffer = _skipWS(byteFromBuffer);
            if (byteFromBuffer <= 0) {
                this._minorState = 4;
                return this._currToken;
            }
        }
        _updateTokenLocation();
        return byteFromBuffer != 34 ? (byteFromBuffer != 125 || (this._features & FEAT_MASK_TRAILING_COMMA) == 0) ? _handleOddName(byteFromBuffer) : _closeObjectScope() : (this._inputPtr + 13 > this._inputEnd || (_fastParseName = _fastParseName()) == null) ? _parseEscapedName(0, 0, 0) : _fieldComplete(_fastParseName);
    }

    private final JsonToken _startValue(int i) throws IOException {
        if (i <= 32) {
            i = _skipWS(i);
            if (i <= 0) {
                this._minorState = 12;
                return this._currToken;
            }
        }
        _updateTokenLocation();
        this._parsingContext.expectComma();
        if (i == 34) {
            return _startString();
        }
        switch (i) {
            case 35:
                return _finishHashComment(12);
            case 43:
                return _startPositiveNumber();
            case 45:
                return _startNegativeNumber();
            case 46:
                if (isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                    return _startFloatThatStartsWithPeriod();
                }
                break;
            case JsonPointer.SEPARATOR:
                return _startSlashComment(12);
            case 48:
                return _startNumberLeadingZero();
            case 49:
            case 50:
            case 51:
            case 52:
            case FastDoubleMath.DOUBLE_SIGNIFICAND_WIDTH:
            case 54:
            case 55:
            case 56:
            case 57:
                return _startPositiveNumber(i);
            case 91:
                return _startArrayScope();
            case 93:
                return _closeArrayScope();
            case 102:
                return _startFalseToken();
            case 110:
                return _startNullToken();
            case 116:
                return _startTrueToken();
            case 123:
                return _startObjectScope();
            case 125:
                return _closeObjectScope();
        }
        return _startUnexpectedValue(false, i);
    }

    private final JsonToken _startValueExpectComma(int i) throws IOException {
        if (i <= 32) {
            i = _skipWS(i);
            if (i <= 0) {
                this._minorState = 13;
                return this._currToken;
            }
        }
        if (i != 44) {
            if (i == 93) {
                return _closeArrayScope();
            }
            if (i == 125) {
                return _closeObjectScope();
            }
            if (i == 47) {
                return _startSlashComment(13);
            }
            if (i == 35) {
                return _finishHashComment(13);
            }
            _reportUnexpectedChar(i, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        this._parsingContext.expectComma();
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 15;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte byteFromBuffer = getByteFromBuffer(i2);
        this._inputPtr = i2 + 1;
        if (byteFromBuffer <= 32) {
            byteFromBuffer = _skipWS(byteFromBuffer);
            if (byteFromBuffer <= 0) {
                this._minorState = 15;
                return this._currToken;
            }
        }
        _updateTokenLocation();
        if (byteFromBuffer == 34) {
            return _startString();
        }
        switch (byteFromBuffer) {
            case 35:
                return _finishHashComment(15);
            case 43:
                return _startPositiveNumber();
            case 45:
                return _startNegativeNumber();
            case JsonPointer.SEPARATOR:
                return _startSlashComment(15);
            case 48:
                return _startNumberLeadingZero();
            case 49:
            case 50:
            case 51:
            case 52:
            case FastDoubleMath.DOUBLE_SIGNIFICAND_WIDTH:
            case 54:
            case 55:
            case 56:
            case 57:
                return _startPositiveNumber(byteFromBuffer);
            case 91:
                return _startArrayScope();
            case 93:
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                    return _closeArrayScope();
                }
                break;
            case 102:
                return _startFalseToken();
            case 110:
                return _startNullToken();
            case 116:
                return _startTrueToken();
            case 123:
                return _startObjectScope();
            case 125:
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                    return _closeObjectScope();
                }
                break;
        }
        return _startUnexpectedValue(true, byteFromBuffer);
    }

    private final JsonToken _startValueExpectColon(int i) throws IOException {
        if (i <= 32) {
            i = _skipWS(i);
            if (i <= 0) {
                this._minorState = 14;
                return this._currToken;
            }
        }
        if (i != 58) {
            if (i == 47) {
                return _startSlashComment(14);
            }
            if (i == 35) {
                return _finishHashComment(14);
            }
            _reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
        }
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 12;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte byteFromBuffer = getByteFromBuffer(i2);
        this._inputPtr = i2 + 1;
        if (byteFromBuffer <= 32) {
            byteFromBuffer = _skipWS(byteFromBuffer);
            if (byteFromBuffer <= 0) {
                this._minorState = 12;
                return this._currToken;
            }
        }
        _updateTokenLocation();
        if (byteFromBuffer == 34) {
            return _startString();
        }
        switch (byteFromBuffer) {
            case 35:
                return _finishHashComment(12);
            case 43:
                return _startPositiveNumber();
            case 45:
                return _startNegativeNumber();
            case JsonPointer.SEPARATOR:
                return _startSlashComment(12);
            case 48:
                return _startNumberLeadingZero();
            case 49:
            case 50:
            case 51:
            case 52:
            case FastDoubleMath.DOUBLE_SIGNIFICAND_WIDTH:
            case 54:
            case 55:
            case 56:
            case 57:
                return _startPositiveNumber(byteFromBuffer);
            case 91:
                return _startArrayScope();
            case 102:
                return _startFalseToken();
            case 110:
                return _startNullToken();
            case 116:
                return _startTrueToken();
            case 123:
                return _startObjectScope();
            default:
                return _startUnexpectedValue(false, byteFromBuffer);
        }
    }

    private final JsonToken _startValueAfterComma(int i) throws IOException {
        if (i <= 32) {
            i = _skipWS(i);
            if (i <= 0) {
                this._minorState = 15;
                return this._currToken;
            }
        }
        _updateTokenLocation();
        if (i == 34) {
            return _startString();
        }
        switch (i) {
            case 35:
                return _finishHashComment(15);
            case 43:
                return _startPositiveNumber();
            case 45:
                return _startNegativeNumber();
            case JsonPointer.SEPARATOR:
                return _startSlashComment(15);
            case 48:
                return _startNumberLeadingZero();
            case 49:
            case 50:
            case 51:
            case 52:
            case FastDoubleMath.DOUBLE_SIGNIFICAND_WIDTH:
            case 54:
            case 55:
            case 56:
            case 57:
                return _startPositiveNumber(i);
            case 91:
                return _startArrayScope();
            case 93:
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                    return _closeArrayScope();
                }
                break;
            case 102:
                return _startFalseToken();
            case 110:
                return _startNullToken();
            case 116:
                return _startTrueToken();
            case 123:
                return _startObjectScope();
            case 125:
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                    return _closeObjectScope();
                }
                break;
        }
        return _startUnexpectedValue(true, i);
    }

    protected com.kammoun.utils.jackson.core.JsonToken _startUnexpectedValue(boolean r6, int r7) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.core.json.async.NonBlockingUtf8JsonParserBase._startUnexpectedValue(boolean, int):com.kammoun.utils.jackson.core.JsonToken");
    }

    private final int _skipWS(int i) throws IOException {
        do {
            if (i != 32) {
                if (i == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                }
            }
            if (this._inputPtr >= this._inputEnd) {
                this._currToken = JsonToken.NOT_AVAILABLE;
                return 0;
            }
            i = getNextUnsignedByteFromBuffer();
        } while (i <= 32);
        return i;
    }

    private final JsonToken _startSlashComment(int i) throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd) {
            this._pending32 = i;
            this._minorState = 51;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte nextSignedByteFromBuffer = getNextSignedByteFromBuffer();
        if (nextSignedByteFromBuffer == 42) {
            return _finishCComment(i, false);
        }
        if (nextSignedByteFromBuffer == 47) {
            return _finishCppComment(i);
        }
        _reportUnexpectedChar(nextSignedByteFromBuffer & 255, "was expecting either '*' or '/' for a comment");
        return null;
    }

    private final JsonToken _finishHashComment(int i) throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            _reportUnexpectedChar(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (nextUnsignedByteFromBuffer < 32) {
                if (nextUnsignedByteFromBuffer == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (nextUnsignedByteFromBuffer == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (nextUnsignedByteFromBuffer != 9) {
                    _throwInvalidSpace(nextUnsignedByteFromBuffer);
                }
                return _startAfterComment(i);
            }
        }
        this._minorState = 55;
        this._pending32 = i;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _finishCppComment(int i) throws IOException {
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (nextUnsignedByteFromBuffer < 32) {
                if (nextUnsignedByteFromBuffer == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (nextUnsignedByteFromBuffer == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (nextUnsignedByteFromBuffer != 9) {
                    _throwInvalidSpace(nextUnsignedByteFromBuffer);
                }
                return _startAfterComment(i);
            }
        }
        this._minorState = 54;
        this._pending32 = i;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _finishCComment(int i, boolean z) throws IOException {
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (nextUnsignedByteFromBuffer < 32) {
                if (nextUnsignedByteFromBuffer == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (nextUnsignedByteFromBuffer == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (nextUnsignedByteFromBuffer != 9) {
                    _throwInvalidSpace(nextUnsignedByteFromBuffer);
                }
            } else if (nextUnsignedByteFromBuffer == 42) {
                z = true;
            } else if (nextUnsignedByteFromBuffer == 47 && z) {
                return _startAfterComment(i);
            }
            z = false;
        }
        this._minorState = z ? 52 : 53;
        this._pending32 = i;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _startAfterComment(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            this._minorState = i;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
        switch (i) {
            case 4:
                return _startFieldName(nextUnsignedByteFromBuffer);
            case 5:
                return _startFieldNameAfterComma(nextUnsignedByteFromBuffer);
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                VersionUtil.throwInternal();
                return null;
            case 12:
                return _startValue(nextUnsignedByteFromBuffer);
            case StdKeyDeserializer.TYPE_URI:
                return _startValueExpectComma(nextUnsignedByteFromBuffer);
            case StdKeyDeserializer.TYPE_URL:
                return _startValueExpectColon(nextUnsignedByteFromBuffer);
            case StdKeyDeserializer.TYPE_CLASS:
                return _startValueAfterComma(nextUnsignedByteFromBuffer);
        }
    }

    protected JsonToken _startFalseToken() throws IOException {
        int byteFromBuffer;
        int i = this._inputPtr;
        if (i + 4 < this._inputEnd) {
            int i2 = i + 1;
            if (getByteFromBuffer(i) == 97) {
                int i3 = i2 + 1;
                if (getByteFromBuffer(i2) == 108) {
                    int i4 = i3 + 1;
                    if (getByteFromBuffer(i3) == 115) {
                        int i5 = i4 + 1;
                        if (getByteFromBuffer(i4) == 101 && ((byteFromBuffer = getByteFromBuffer(i5) & 255) < 48 || (byteFromBuffer | 32) == 125)) {
                            this._inputPtr = i5;
                            return _valueComplete(JsonToken.VALUE_FALSE);
                        }
                    }
                }
            }
        }
        this._minorState = 18;
        return _finishKeywordToken("false", 1, JsonToken.VALUE_FALSE);
    }

    protected JsonToken _startTrueToken() throws IOException {
        int byteFromBuffer;
        int i = this._inputPtr;
        if (i + 3 < this._inputEnd) {
            int i2 = i + 1;
            if (getByteFromBuffer(i) == 114) {
                int i3 = i2 + 1;
                if (getByteFromBuffer(i2) == 117) {
                    int i4 = i3 + 1;
                    if (getByteFromBuffer(i3) == 101 && ((byteFromBuffer = getByteFromBuffer(i4) & 255) < 48 || (byteFromBuffer | 32) == 125)) {
                        this._inputPtr = i4;
                        return _valueComplete(JsonToken.VALUE_TRUE);
                    }
                }
            }
        }
        this._minorState = 17;
        return _finishKeywordToken("true", 1, JsonToken.VALUE_TRUE);
    }

    protected JsonToken _startNullToken() throws IOException {
        int byteFromBuffer;
        int i = this._inputPtr;
        if (i + 3 < this._inputEnd) {
            int i2 = i + 1;
            if (getByteFromBuffer(i) == 117) {
                int i3 = i2 + 1;
                if (getByteFromBuffer(i2) == 108) {
                    int i4 = i3 + 1;
                    if (getByteFromBuffer(i3) == 108 && ((byteFromBuffer = getByteFromBuffer(i4) & 255) < 48 || (byteFromBuffer | 32) == 125)) {
                        this._inputPtr = i4;
                        return _valueComplete(JsonToken.VALUE_NULL);
                    }
                }
            }
        }
        this._minorState = 16;
        return _finishKeywordToken("null", 1, JsonToken.VALUE_NULL);
    }

    protected JsonToken _finishKeywordToken(String str, int i, JsonToken jsonToken) throws IOException {
        int length = str.length();
        while (this._inputPtr < this._inputEnd) {
            byte byteFromBuffer = getByteFromBuffer(this._inputPtr);
            if (i == length) {
                if (byteFromBuffer < 48 || (byteFromBuffer | 32) == 125) {
                    return _valueComplete(jsonToken);
                }
            } else if (byteFromBuffer == str.charAt(i)) {
                i++;
                this._inputPtr++;
            }
            this._minorState = 50;
            this._textBuffer.resetWithCopy(str, 0, i);
            return _finishErrorToken();
        }
        this._pending32 = i;
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    protected JsonToken _finishKeywordTokenWithEOF(String str, int i, JsonToken jsonToken) throws IOException {
        if (i == str.length()) {
            this._currToken = jsonToken;
            return jsonToken;
        }
        this._textBuffer.resetWithCopy(str, 0, i);
        return _finishErrorTokenWithEOF();
    }

    protected JsonToken _finishNonStdToken(int i, int i2) throws IOException {
        String _nonStdToken = _nonStdToken(i);
        int length = _nonStdToken.length();
        while (this._inputPtr < this._inputEnd) {
            byte byteFromBuffer = getByteFromBuffer(this._inputPtr);
            if (i2 == length) {
                if (byteFromBuffer < 48 || (byteFromBuffer | 32) == 125) {
                    return _valueNonStdNumberComplete(i);
                }
            } else if (byteFromBuffer == _nonStdToken.charAt(i2)) {
                i2++;
                this._inputPtr++;
            }
            this._minorState = 50;
            this._textBuffer.resetWithCopy(_nonStdToken, 0, i2);
            return _finishErrorToken();
        }
        this._nonStdTokenType = i;
        this._pending32 = i2;
        this._minorState = 19;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    protected JsonToken _finishNonStdTokenWithEOF(int i, int i2) throws IOException {
        String _nonStdToken = _nonStdToken(i);
        if (i2 == _nonStdToken.length()) {
            return _valueNonStdNumberComplete(i);
        }
        this._textBuffer.resetWithCopy(_nonStdToken, 0, i2);
        return _finishErrorTokenWithEOF();
    }

    protected JsonToken _finishErrorToken() throws IOException {
        while (this._inputPtr < this._inputEnd) {
            char nextSignedByteFromBuffer = (char) getNextSignedByteFromBuffer();
            if (Character.isJavaIdentifierPart(nextSignedByteFromBuffer)) {
                this._textBuffer.append(nextSignedByteFromBuffer);
                if (this._textBuffer.size() < this._ioContext.errorReportConfiguration().getMaxErrorTokenLength()) {
                }
            }
            return _reportErrorToken(this._textBuffer.contentsAsString());
        }
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    protected JsonToken _finishErrorTokenWithEOF() throws IOException {
        return _reportErrorToken(this._textBuffer.contentsAsString());
    }

    protected JsonToken _reportErrorToken(String str) throws IOException {
        _reportError("Unrecognized token '%s': was expecting %s", this._textBuffer.contentsAsString(), _validJsonTokenList());
        return JsonToken.NOT_AVAILABLE;
    }

    protected JsonToken _startFloatThatStartsWithPeriod() throws IOException {
        this._numberNegative = false;
        this._intLength = 0;
        return _startFloat(this._textBuffer.emptyAndGetCurrentSegment(), 0, 46);
    }

    protected JsonToken _startPositiveNumber(int i) throws IOException {
        this._numberNegative = false;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = (char) i;
        if (this._inputPtr >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(1);
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i2 = 1;
        byte byteFromBuffer = getByteFromBuffer(this._inputPtr);
        while (true) {
            int i3 = byteFromBuffer & 255;
            if (i3 < 48) {
                if (i3 == 46) {
                    this._intLength = i2;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i2, i3);
                }
            } else if (i3 <= 57) {
                if (i2 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i4 = i2;
                i2++;
                emptyAndGetCurrentSegment[i4] = (char) i3;
                int i5 = this._inputPtr + 1;
                this._inputPtr = i5;
                if (i5 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i2);
                    JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken2;
                    return jsonToken2;
                }
                byteFromBuffer = getByteFromBuffer(this._inputPtr);
            } else if ((i3 | 32) == 101) {
                this._intLength = i2;
                this._inputPtr++;
                return _startFloat(emptyAndGetCurrentSegment, i2, i3);
            }
        }
        this._intLength = i2;
        this._textBuffer.setCurrentLength(i2);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    protected JsonToken _startNegativeNumber() throws IOException {
        this._numberNegative = true;
        if (this._inputPtr >= this._inputEnd) {
            this._minorState = 23;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
        if (nextUnsignedByteFromBuffer <= 48) {
            if (nextUnsignedByteFromBuffer == 48) {
                return _finishNumberLeadingNegZeroes();
            }
            _reportUnexpectedNumberChar(nextUnsignedByteFromBuffer, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (nextUnsignedByteFromBuffer > 57) {
            if (nextUnsignedByteFromBuffer == 73) {
                return _finishNonStdToken(3, 2);
            }
            _reportUnexpectedNumberChar(nextUnsignedByteFromBuffer, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        emptyAndGetCurrentSegment[1] = (char) nextUnsignedByteFromBuffer;
        if (this._inputPtr >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(2);
            this._intLength = 1;
            JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        byte byteFromBuffer = getByteFromBuffer(this._inputPtr);
        int i = 2;
        while (true) {
            if (byteFromBuffer < 48) {
                if (byteFromBuffer == 46) {
                    this._intLength = i - 1;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i, byteFromBuffer);
                }
            } else if (byteFromBuffer <= 57) {
                if (i >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i2 = i;
                i++;
                emptyAndGetCurrentSegment[i2] = (char) byteFromBuffer;
                int i3 = this._inputPtr + 1;
                this._inputPtr = i3;
                if (i3 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i);
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                }
                byteFromBuffer = getByteFromBuffer(this._inputPtr) & 255 ? 1 : 0;
            } else if ((byteFromBuffer | 32) == 101) {
                this._intLength = i - 1;
                this._inputPtr++;
                return _startFloat(emptyAndGetCurrentSegment, i, byteFromBuffer);
            }
        }
        this._intLength = i - 1;
        this._textBuffer.setCurrentLength(i);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    protected JsonToken _startPositiveNumber() throws IOException {
        this._numberNegative = false;
        if (this._inputPtr >= this._inputEnd) {
            this._minorState = 22;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
        if (nextUnsignedByteFromBuffer <= 48) {
            if (nextUnsignedByteFromBuffer == 48) {
                if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                    _reportUnexpectedNumberChar(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                }
                return _finishNumberLeadingPosZeroes();
            }
            _reportUnexpectedNumberChar(nextUnsignedByteFromBuffer, "expected digit (0-9) to follow plus sign, for valid numeric value");
        } else if (nextUnsignedByteFromBuffer > 57) {
            if (nextUnsignedByteFromBuffer == 73) {
                return _finishNonStdToken(2, 2);
            }
            _reportUnexpectedNumberChar(nextUnsignedByteFromBuffer, "expected digit (0-9) to follow plus sign, for valid numeric value");
        }
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            _reportUnexpectedNumberChar(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '+';
        emptyAndGetCurrentSegment[1] = (char) nextUnsignedByteFromBuffer;
        if (this._inputPtr >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(2);
            this._intLength = 1;
            JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        byte byteFromBuffer = getByteFromBuffer(this._inputPtr);
        int i = 2;
        while (true) {
            if (byteFromBuffer < 48) {
                if (byteFromBuffer == 46) {
                    this._intLength = i - 1;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i, byteFromBuffer);
                }
            } else if (byteFromBuffer <= 57) {
                if (i >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i2 = i;
                i++;
                emptyAndGetCurrentSegment[i2] = (char) byteFromBuffer;
                int i3 = this._inputPtr + 1;
                this._inputPtr = i3;
                if (i3 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i);
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                }
                byteFromBuffer = getByteFromBuffer(this._inputPtr) & 255 ? 1 : 0;
            } else if ((byteFromBuffer | 32) == 101) {
                this._intLength = i - 1;
                this._inputPtr++;
                return _startFloat(emptyAndGetCurrentSegment, i, byteFromBuffer);
            }
        }
        this._intLength = i - 1;
        this._textBuffer.setCurrentLength(i);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    protected JsonToken _startNumberLeadingZero() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            this._minorState = 24;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i2 = i + 1;
        int byteFromBuffer = getByteFromBuffer(i) & 255;
        if (byteFromBuffer < 48) {
            if (byteFromBuffer == 46) {
                this._inputPtr = i2;
                this._intLength = 1;
                char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                emptyAndGetCurrentSegment[0] = '0';
                return _startFloat(emptyAndGetCurrentSegment, 1, byteFromBuffer);
            }
        } else {
            if (byteFromBuffer <= 57) {
                return _finishNumberLeadingZeroes();
            }
            if ((byteFromBuffer | 32) == 101) {
                this._inputPtr = i2;
                this._intLength = 1;
                char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                emptyAndGetCurrentSegment2[0] = '0';
                return _startFloat(emptyAndGetCurrentSegment2, 1, byteFromBuffer);
            }
            if ((byteFromBuffer | 32) != 125) {
                _reportUnexpectedNumberChar(byteFromBuffer, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
        }
        return _valueCompleteInt(0, "0");
    }

    protected JsonToken _finishNumberMinus(int i) throws IOException {
        return _finishNumberPlusMinus(i, true);
    }

    protected JsonToken _finishNumberPlus(int i) throws IOException {
        return _finishNumberPlusMinus(i, false);
    }

    protected JsonToken _finishNumberPlusMinus(int i, boolean z) throws IOException {
        if (i <= 48) {
            if (i == 48) {
                if (z) {
                    return _finishNumberLeadingNegZeroes();
                }
                if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                    _reportUnexpectedNumberChar(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                }
                return _finishNumberLeadingPosZeroes();
            }
            if (i == 46 && isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                if (z) {
                    this._inputPtr--;
                    return _finishNumberLeadingNegZeroes();
                }
                if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                    _reportUnexpectedNumberChar(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                }
                this._inputPtr--;
                return _finishNumberLeadingPosZeroes();
            }
            _reportUnexpectedNumberChar(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        } else if (i > 57) {
            if (i == 73) {
                return _finishNonStdToken(z ? 3 : 2, 2);
            }
            _reportUnexpectedNumberChar(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        }
        if (!z && !isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            _reportUnexpectedNumberChar(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = z ? '-' : '+';
        emptyAndGetCurrentSegment[1] = (char) i;
        this._intLength = 1;
        return _finishNumberIntegralPart(emptyAndGetCurrentSegment, 2);
    }

    protected JsonToken _finishNumberLeadingZeroes() throws IOException {
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (nextUnsignedByteFromBuffer < 48) {
                if (nextUnsignedByteFromBuffer == 46) {
                    char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment[0] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment, 1, nextUnsignedByteFromBuffer);
                }
            } else if (nextUnsignedByteFromBuffer <= 57) {
                if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                    reportInvalidNumber("Leading zeroes not allowed");
                }
                if (nextUnsignedByteFromBuffer != 48) {
                    char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment2[0] = (char) nextUnsignedByteFromBuffer;
                    this._intLength = 1;
                    return _finishNumberIntegralPart(emptyAndGetCurrentSegment2, 1);
                }
            } else {
                if ((nextUnsignedByteFromBuffer | 32) == 101) {
                    char[] emptyAndGetCurrentSegment3 = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment3[0] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment3, 1, nextUnsignedByteFromBuffer);
                }
                if ((nextUnsignedByteFromBuffer | 32) != 125) {
                    _reportUnexpectedNumberChar(nextUnsignedByteFromBuffer, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            }
            this._inputPtr--;
            return _valueCompleteInt(0, "0");
        }
        this._minorState = 24;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    protected JsonToken _finishNumberLeadingNegZeroes() throws IOException {
        return _finishNumberLeadingPosNegZeroes(true);
    }

    protected JsonToken _finishNumberLeadingPosZeroes() throws IOException {
        return _finishNumberLeadingPosNegZeroes(false);
    }

    protected JsonToken _finishNumberLeadingPosNegZeroes(boolean z) throws IOException {
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (nextUnsignedByteFromBuffer < 48) {
                if (nextUnsignedByteFromBuffer == 46) {
                    char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment[0] = z ? '-' : '+';
                    emptyAndGetCurrentSegment[1] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment, 2, nextUnsignedByteFromBuffer);
                }
            } else if (nextUnsignedByteFromBuffer <= 57) {
                if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                    reportInvalidNumber("Leading zeroes not allowed");
                }
                if (nextUnsignedByteFromBuffer != 48) {
                    char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment2[0] = z ? '-' : '+';
                    emptyAndGetCurrentSegment2[1] = (char) nextUnsignedByteFromBuffer;
                    this._intLength = 1;
                    return _finishNumberIntegralPart(emptyAndGetCurrentSegment2, 2);
                }
            } else {
                if ((nextUnsignedByteFromBuffer | 32) == 101) {
                    char[] emptyAndGetCurrentSegment3 = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment3[0] = z ? '-' : '+';
                    emptyAndGetCurrentSegment3[1] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment3, 2, nextUnsignedByteFromBuffer);
                }
                if ((nextUnsignedByteFromBuffer | 32) != 125) {
                    _reportUnexpectedNumberChar(nextUnsignedByteFromBuffer, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            }
            this._inputPtr--;
            return _valueCompleteInt(0, "0");
        }
        this._minorState = z ? 25 : 24;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    protected JsonToken _finishNumberIntegralPart(char[] cArr, int i) throws IOException {
        int i2 = this._numberNegative ? -1 : 0;
        while (this._inputPtr < this._inputEnd) {
            int byteFromBuffer = getByteFromBuffer(this._inputPtr) & 255;
            if (byteFromBuffer < 48) {
                if (byteFromBuffer == 46) {
                    this._intLength = i + i2;
                    this._inputPtr++;
                    return _startFloat(cArr, i, byteFromBuffer);
                }
            } else if (byteFromBuffer <= 57) {
                this._inputPtr++;
                if (i >= cArr.length) {
                    cArr = this._textBuffer.expandCurrentSegment();
                }
                int i3 = i;
                i++;
                cArr[i3] = (char) byteFromBuffer;
            } else if ((byteFromBuffer | 32) == 101) {
                this._intLength = i + i2;
                this._inputPtr++;
                return _startFloat(cArr, i, byteFromBuffer);
            }
            this._intLength = i + i2;
            this._textBuffer.setCurrentLength(i);
            return _valueComplete(JsonToken.VALUE_NUMBER_INT);
        }
        this._minorState = 26;
        this._textBuffer.setCurrentLength(i);
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    protected JsonToken _startFloat(char[] cArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.expandCurrentSegment();
            }
            i++;
            cArr[i] = '.';
            while (this._inputPtr < this._inputEnd) {
                byte nextSignedByteFromBuffer = getNextSignedByteFromBuffer();
                if (nextSignedByteFromBuffer < 48 || nextSignedByteFromBuffer > 57) {
                    i2 = nextSignedByteFromBuffer & 255;
                    if (i3 == 0 && !isEnabled(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                        _reportUnexpectedNumberChar(i2, "Decimal point not followed by a digit");
                    }
                } else {
                    if (i >= cArr.length) {
                        cArr = this._textBuffer.expandCurrentSegment();
                    }
                    int i4 = i;
                    i++;
                    cArr[i4] = (char) nextSignedByteFromBuffer;
                    i3++;
                }
            }
            this._textBuffer.setCurrentLength(i);
            this._minorState = 30;
            this._fractLength = i3;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        this._fractLength = i3;
        int i5 = 0;
        if ((i2 | 32) == 101) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.expandCurrentSegment();
            }
            int i6 = i;
            i++;
            cArr[i6] = (char) i2;
            if (this._inputPtr >= this._inputEnd) {
                this._textBuffer.setCurrentLength(i);
                this._minorState = 31;
                this._expLength = 0;
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken2;
                return jsonToken2;
            }
            byte nextSignedByteFromBuffer2 = getNextSignedByteFromBuffer();
            if (nextSignedByteFromBuffer2 == 45 || nextSignedByteFromBuffer2 == 43) {
                if (i >= cArr.length) {
                    cArr = this._textBuffer.expandCurrentSegment();
                }
                i++;
                cArr[i] = (char) nextSignedByteFromBuffer2;
                if (this._inputPtr >= this._inputEnd) {
                    this._textBuffer.setCurrentLength(i);
                    this._minorState = 32;
                    this._expLength = 0;
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                }
                nextSignedByteFromBuffer2 = getNextSignedByteFromBuffer();
            }
            while (nextSignedByteFromBuffer2 >= 48 && nextSignedByteFromBuffer2 <= 57) {
                i5++;
                if (i >= cArr.length) {
                    cArr = this._textBuffer.expandCurrentSegment();
                }
                int i7 = i;
                i++;
                cArr[i7] = (char) nextSignedByteFromBuffer2;
                if (this._inputPtr >= this._inputEnd) {
                    this._textBuffer.setCurrentLength(i);
                    this._minorState = 32;
                    this._expLength = i5;
                    JsonToken jsonToken4 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken4;
                    return jsonToken4;
                }
                nextSignedByteFromBuffer2 = getNextSignedByteFromBuffer();
            }
            int i8 = nextSignedByteFromBuffer2 & 255;
            if (i5 == 0) {
                _reportUnexpectedNumberChar(i8, "Exponent indicator not followed by a digit");
            }
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(i);
        this._expLength = i5;
        return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
    }

    protected JsonToken _finishFloatFraction() throws IOException {
        int i = this._fractLength;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        byte nextSignedByteFromBuffer = getNextSignedByteFromBuffer();
        boolean z = true;
        while (z) {
            if (nextSignedByteFromBuffer >= 48 && nextSignedByteFromBuffer <= 57) {
                i++;
                if (currentSegmentSize >= bufferWithoutReset.length) {
                    bufferWithoutReset = this._textBuffer.expandCurrentSegment();
                }
                int i2 = currentSegmentSize;
                currentSegmentSize++;
                bufferWithoutReset[i2] = (char) nextSignedByteFromBuffer;
                if (this._inputPtr >= this._inputEnd) {
                    this._textBuffer.setCurrentLength(currentSegmentSize);
                    this._fractLength = i;
                    return JsonToken.NOT_AVAILABLE;
                }
                nextSignedByteFromBuffer = getNextSignedByteFromBuffer();
            } else if ((nextSignedByteFromBuffer | 34) == 102) {
                _reportUnexpectedNumberChar(nextSignedByteFromBuffer, "JSON does not support parsing numbers that have 'f' or 'd' suffixes");
            } else if (nextSignedByteFromBuffer == 46) {
                _reportUnexpectedNumberChar(nextSignedByteFromBuffer, "Cannot parse number with more than one decimal point");
            } else {
                z = false;
            }
        }
        if (i == 0 && !isEnabled(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            _reportUnexpectedNumberChar(nextSignedByteFromBuffer, "Decimal point not followed by a digit");
        }
        this._fractLength = i;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        if ((nextSignedByteFromBuffer | 32) != 101) {
            this._inputPtr--;
            this._textBuffer.setCurrentLength(currentSegmentSize);
            this._expLength = 0;
            return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
        }
        this._textBuffer.append((char) nextSignedByteFromBuffer);
        this._expLength = 0;
        if (this._inputPtr >= this._inputEnd) {
            this._minorState = 31;
            return JsonToken.NOT_AVAILABLE;
        }
        this._minorState = 32;
        return _finishFloatExponent(true, getNextUnsignedByteFromBuffer());
    }

    protected JsonToken _finishFloatExponent(boolean z, int i) throws IOException {
        if (z) {
            this._minorState = 32;
            if (i == 45 || i == 43) {
                this._textBuffer.append((char) i);
                if (this._inputPtr >= this._inputEnd) {
                    this._minorState = 32;
                    this._expLength = 0;
                    return JsonToken.NOT_AVAILABLE;
                }
                i = getNextSignedByteFromBuffer();
            }
        }
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i2 = this._expLength;
        while (i >= 48 && i <= 57) {
            i2++;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.expandCurrentSegment();
            }
            int i3 = currentSegmentSize;
            currentSegmentSize++;
            bufferWithoutReset[i3] = (char) i;
            if (this._inputPtr >= this._inputEnd) {
                this._textBuffer.setCurrentLength(currentSegmentSize);
                this._expLength = i2;
                return JsonToken.NOT_AVAILABLE;
            }
            i = getNextSignedByteFromBuffer();
        }
        int i4 = i & 255;
        if (i2 == 0) {
            _reportUnexpectedNumberChar(i4, "Exponent indicator not followed by a digit");
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        this._expLength = i2;
        return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
    }

    private final String _fastParseName() throws IOException {
        int[] iArr = _icLatin1;
        int i = this._inputPtr;
        int i2 = i + 1;
        int byteFromBuffer = getByteFromBuffer(i) & 255;
        if (iArr[byteFromBuffer] != 0) {
            if (byteFromBuffer != 34) {
                return null;
            }
            this._inputPtr = i2;
            return JsonProperty.USE_DEFAULT_NAME;
        }
        int i3 = i2 + 1;
        int byteFromBuffer2 = getByteFromBuffer(i2) & 255;
        if (iArr[byteFromBuffer2] != 0) {
            if (byteFromBuffer2 != 34) {
                return null;
            }
            this._inputPtr = i3;
            return _findName(byteFromBuffer, 1);
        }
        int i4 = (byteFromBuffer << 8) | byteFromBuffer2;
        int i5 = i3 + 1;
        int byteFromBuffer3 = getByteFromBuffer(i3) & 255;
        if (iArr[byteFromBuffer3] != 0) {
            if (byteFromBuffer3 != 34) {
                return null;
            }
            this._inputPtr = i5;
            return _findName(i4, 2);
        }
        int i6 = (i4 << 8) | byteFromBuffer3;
        int i7 = i5 + 1;
        int byteFromBuffer4 = getByteFromBuffer(i5) & 255;
        if (iArr[byteFromBuffer4] != 0) {
            if (byteFromBuffer4 != 34) {
                return null;
            }
            this._inputPtr = i7;
            return _findName(i6, 3);
        }
        int i8 = (i6 << 8) | byteFromBuffer4;
        int i9 = i7 + 1;
        int byteFromBuffer5 = getByteFromBuffer(i7) & 255;
        if (iArr[byteFromBuffer5] == 0) {
            this._quad1 = i8;
            return _parseMediumName(i9, byteFromBuffer5);
        }
        if (byteFromBuffer5 != 34) {
            return null;
        }
        this._inputPtr = i9;
        return _findName(i8, 4);
    }

    private final String _parseMediumName(int i, int i2) throws IOException {
        int[] iArr = _icLatin1;
        int i3 = i + 1;
        int byteFromBuffer = getByteFromBuffer(i) & 255;
        if (iArr[byteFromBuffer] != 0) {
            if (byteFromBuffer != 34) {
                return null;
            }
            this._inputPtr = i3;
            return _findName(this._quad1, i2, 1);
        }
        int i4 = (i2 << 8) | byteFromBuffer;
        int i5 = i3 + 1;
        int byteFromBuffer2 = getByteFromBuffer(i3) & 255;
        if (iArr[byteFromBuffer2] != 0) {
            if (byteFromBuffer2 != 34) {
                return null;
            }
            this._inputPtr = i5;
            return _findName(this._quad1, i4, 2);
        }
        int i6 = (i4 << 8) | byteFromBuffer2;
        int i7 = i5 + 1;
        int byteFromBuffer3 = getByteFromBuffer(i5) & 255;
        if (iArr[byteFromBuffer3] != 0) {
            if (byteFromBuffer3 != 34) {
                return null;
            }
            this._inputPtr = i7;
            return _findName(this._quad1, i6, 3);
        }
        int i8 = (i6 << 8) | byteFromBuffer3;
        int i9 = i7 + 1;
        int byteFromBuffer4 = getByteFromBuffer(i7) & 255;
        if (iArr[byteFromBuffer4] == 0) {
            return _parseMediumName2(i9, byteFromBuffer4, i8);
        }
        if (byteFromBuffer4 != 34) {
            return null;
        }
        this._inputPtr = i9;
        return _findName(this._quad1, i8, 4);
    }

    private final String _parseMediumName2(int i, int i2, int i3) throws IOException {
        int[] iArr = _icLatin1;
        int i4 = i + 1;
        int byteFromBuffer = getByteFromBuffer(i) & 255;
        if (iArr[byteFromBuffer] != 0) {
            if (byteFromBuffer != 34) {
                return null;
            }
            this._inputPtr = i4;
            return _findName(this._quad1, i3, i2, 1);
        }
        int i5 = (i2 << 8) | byteFromBuffer;
        int i6 = i4 + 1;
        int byteFromBuffer2 = getByteFromBuffer(i4) & 255;
        if (iArr[byteFromBuffer2] != 0) {
            if (byteFromBuffer2 != 34) {
                return null;
            }
            this._inputPtr = i6;
            return _findName(this._quad1, i3, i5, 2);
        }
        int i7 = (i5 << 8) | byteFromBuffer2;
        int i8 = i6 + 1;
        int byteFromBuffer3 = getByteFromBuffer(i6) & 255;
        if (iArr[byteFromBuffer3] != 0) {
            if (byteFromBuffer3 != 34) {
                return null;
            }
            this._inputPtr = i8;
            return _findName(this._quad1, i3, i7, 3);
        }
        int i9 = (i7 << 8) | byteFromBuffer3;
        int i10 = i8 + 1;
        if ((getByteFromBuffer(i8) & 255) != 34) {
            return null;
        }
        this._inputPtr = i10;
        return _findName(this._quad1, i3, i9, 4);
    }

    private final JsonToken _parseEscapedName(int i, int i2, int i3) throws IOException {
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (iArr2[nextUnsignedByteFromBuffer] == 0) {
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | nextUnsignedByteFromBuffer;
                } else {
                    if (i >= iArr.length) {
                        int[] _growNameDecodeBuffer = _growNameDecodeBuffer(iArr, iArr.length);
                        iArr = _growNameDecodeBuffer;
                        this._quadBuffer = _growNameDecodeBuffer;
                    }
                    int i4 = i;
                    i++;
                    iArr[i4] = i2;
                    i2 = nextUnsignedByteFromBuffer;
                    i3 = 1;
                }
            } else {
                if (nextUnsignedByteFromBuffer == 34) {
                    if (i3 > 0) {
                        if (i >= iArr.length) {
                            int[] _growNameDecodeBuffer2 = _growNameDecodeBuffer(iArr, iArr.length);
                            iArr = _growNameDecodeBuffer2;
                            this._quadBuffer = _growNameDecodeBuffer2;
                        }
                        int i5 = i;
                        i++;
                        iArr[i5] = _padLastQuad(i2, i3);
                    } else if (i == 0) {
                        return _fieldComplete(JsonProperty.USE_DEFAULT_NAME);
                    }
                    String findName = this._symbols.findName(iArr, i);
                    if (findName == null) {
                        findName = _addName(iArr, i, i3);
                    }
                    return _fieldComplete(findName);
                }
                if (nextUnsignedByteFromBuffer != 92) {
                    _throwUnquotedSpace(nextUnsignedByteFromBuffer, "name");
                } else {
                    nextUnsignedByteFromBuffer = _decodeCharEscape();
                    if (nextUnsignedByteFromBuffer < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 7;
                        this._quadLength = i;
                        this._pending32 = i2;
                        this._pendingBytes = i3;
                        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                        this._currToken = jsonToken;
                        return jsonToken;
                    }
                }
                if (i >= iArr.length) {
                    int[] _growNameDecodeBuffer3 = _growNameDecodeBuffer(iArr, iArr.length);
                    iArr = _growNameDecodeBuffer3;
                    this._quadBuffer = _growNameDecodeBuffer3;
                }
                if (nextUnsignedByteFromBuffer > 127) {
                    if (i3 >= 4) {
                        int i6 = i;
                        i++;
                        iArr[i6] = i2;
                        i2 = 0;
                        i3 = 0;
                    }
                    if (nextUnsignedByteFromBuffer < 2048) {
                        i2 = (i2 << 8) | 192 | (nextUnsignedByteFromBuffer >> 6);
                        i3++;
                    } else {
                        int i7 = (i2 << 8) | 224 | (nextUnsignedByteFromBuffer >> 12);
                        int i8 = i3 + 1;
                        if (i8 >= 4) {
                            int i9 = i;
                            i++;
                            iArr[i9] = i7;
                            i7 = 0;
                            i8 = 0;
                        }
                        i2 = (i7 << 8) | 128 | ((nextUnsignedByteFromBuffer >> 6) & 63);
                        i3 = i8 + 1;
                    }
                    nextUnsignedByteFromBuffer = 128 | (nextUnsignedByteFromBuffer & 63);
                }
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | nextUnsignedByteFromBuffer;
                } else {
                    int i10 = i;
                    i++;
                    iArr[i10] = i2;
                    i2 = nextUnsignedByteFromBuffer;
                    i3 = 1;
                }
            }
        }
        this._quadLength = i;
        this._pending32 = i2;
        this._pendingBytes = i3;
        this._minorState = 7;
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private JsonToken _handleOddName(int i) throws IOException {
        switch (i) {
            case 35:
                if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) != 0) {
                    return _finishHashComment(4);
                }
                break;
            case 39:
                if ((this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
                    return _finishAposName(0, 0, 0);
                }
                break;
            case JsonPointer.SEPARATOR:
                return _startSlashComment(4);
            case 93:
                return _closeArrayScope();
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar((char) i, "was expecting double-quote to start field name");
        }
        if (CharTypes.getInputCodeUtf8JsNames()[i] != 0) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return _finishUnquotedName(0, i, 1);
    }

    private JsonToken _finishUnquotedName(int i, int i2, int i3) throws IOException {
        int[] iArr = this._quadBuffer;
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        while (this._inputPtr < this._inputEnd) {
            int byteFromBuffer = getByteFromBuffer(this._inputPtr) & 255;
            if (inputCodeUtf8JsNames[byteFromBuffer] != 0) {
                if (i3 > 0) {
                    if (i >= iArr.length) {
                        int[] _growNameDecodeBuffer = _growNameDecodeBuffer(iArr, iArr.length);
                        iArr = _growNameDecodeBuffer;
                        this._quadBuffer = _growNameDecodeBuffer;
                    }
                    int i4 = i;
                    i++;
                    iArr[i4] = i2;
                }
                String findName = this._symbols.findName(iArr, i);
                if (findName == null) {
                    findName = _addName(iArr, i, i3);
                }
                return _fieldComplete(findName);
            }
            this._inputPtr++;
            if (i3 < 4) {
                i3++;
                i2 = (i2 << 8) | byteFromBuffer;
            } else {
                if (i >= iArr.length) {
                    int[] _growNameDecodeBuffer2 = _growNameDecodeBuffer(iArr, iArr.length);
                    iArr = _growNameDecodeBuffer2;
                    this._quadBuffer = _growNameDecodeBuffer2;
                }
                int i5 = i;
                i++;
                iArr[i5] = i2;
                i2 = byteFromBuffer;
                i3 = 1;
            }
        }
        this._quadLength = i;
        this._pending32 = i2;
        this._pendingBytes = i3;
        this._minorState = 10;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    private JsonToken _finishAposName(int i, int i2, int i3) throws IOException {
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (nextUnsignedByteFromBuffer == 39) {
                if (i3 > 0) {
                    if (i >= iArr.length) {
                        int[] _growNameDecodeBuffer = _growNameDecodeBuffer(iArr, iArr.length);
                        iArr = _growNameDecodeBuffer;
                        this._quadBuffer = _growNameDecodeBuffer;
                    }
                    int i4 = i;
                    i++;
                    iArr[i4] = _padLastQuad(i2, i3);
                } else if (i == 0) {
                    return _fieldComplete(JsonProperty.USE_DEFAULT_NAME);
                }
                String findName = this._symbols.findName(iArr, i);
                if (findName == null) {
                    findName = _addName(iArr, i, i3);
                }
                return _fieldComplete(findName);
            }
            if (nextUnsignedByteFromBuffer != 34 && iArr2[nextUnsignedByteFromBuffer] != 0) {
                if (nextUnsignedByteFromBuffer != 92) {
                    _throwUnquotedSpace(nextUnsignedByteFromBuffer, "name");
                } else {
                    nextUnsignedByteFromBuffer = _decodeCharEscape();
                    if (nextUnsignedByteFromBuffer < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 9;
                        this._quadLength = i;
                        this._pending32 = i2;
                        this._pendingBytes = i3;
                        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                        this._currToken = jsonToken;
                        return jsonToken;
                    }
                }
                if (nextUnsignedByteFromBuffer > 127) {
                    if (i3 >= 4) {
                        if (i >= iArr.length) {
                            int[] _growNameDecodeBuffer2 = _growNameDecodeBuffer(iArr, iArr.length);
                            iArr = _growNameDecodeBuffer2;
                            this._quadBuffer = _growNameDecodeBuffer2;
                        }
                        int i5 = i;
                        i++;
                        iArr[i5] = i2;
                        i2 = 0;
                        i3 = 0;
                    }
                    if (nextUnsignedByteFromBuffer < 2048) {
                        i2 = (i2 << 8) | 192 | (nextUnsignedByteFromBuffer >> 6);
                        i3++;
                    } else {
                        int i6 = (i2 << 8) | 224 | (nextUnsignedByteFromBuffer >> 12);
                        int i7 = i3 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                int[] _growNameDecodeBuffer3 = _growNameDecodeBuffer(iArr, iArr.length);
                                iArr = _growNameDecodeBuffer3;
                                this._quadBuffer = _growNameDecodeBuffer3;
                            }
                            int i8 = i;
                            i++;
                            iArr[i8] = i6;
                            i6 = 0;
                            i7 = 0;
                        }
                        i2 = (i6 << 8) | 128 | ((nextUnsignedByteFromBuffer >> 6) & 63);
                        i3 = i7 + 1;
                    }
                    nextUnsignedByteFromBuffer = 128 | (nextUnsignedByteFromBuffer & 63);
                }
            }
            if (i3 < 4) {
                i3++;
                i2 = (i2 << 8) | nextUnsignedByteFromBuffer;
            } else {
                if (i >= iArr.length) {
                    int[] _growNameDecodeBuffer4 = _growNameDecodeBuffer(iArr, iArr.length);
                    iArr = _growNameDecodeBuffer4;
                    this._quadBuffer = _growNameDecodeBuffer4;
                }
                int i9 = i;
                i++;
                iArr[i9] = i2;
                i2 = nextUnsignedByteFromBuffer;
                i3 = 1;
            }
        }
        this._quadLength = i;
        this._pending32 = i2;
        this._pendingBytes = i3;
        this._minorState = 9;
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    protected final JsonToken _finishFieldWithEscape() throws IOException {
        int i;
        int i2;
        int _decodeSplitEscaped = _decodeSplitEscaped(this._quoted32, this._quotedDigits);
        if (_decodeSplitEscaped < 0) {
            this._minorState = 8;
            return JsonToken.NOT_AVAILABLE;
        }
        if (this._quadLength >= this._quadBuffer.length) {
            this._quadBuffer = _growNameDecodeBuffer(this._quadBuffer, 32);
        }
        int i3 = this._pending32;
        int i4 = this._pendingBytes;
        if (_decodeSplitEscaped > 127) {
            if (i4 >= 4) {
                int[] iArr = this._quadBuffer;
                int i5 = this._quadLength;
                this._quadLength = i5 + 1;
                iArr[i5] = i3;
                i3 = 0;
                i4 = 0;
            }
            if (_decodeSplitEscaped < 2048) {
                i3 = (i3 << 8) | 192 | (_decodeSplitEscaped >> 6);
                i4++;
            } else {
                int i6 = (i3 << 8) | 224 | (_decodeSplitEscaped >> 12);
                int i7 = i4 + 1;
                if (i7 >= 4) {
                    int[] iArr2 = this._quadBuffer;
                    int i8 = this._quadLength;
                    this._quadLength = i8 + 1;
                    iArr2[i8] = i6;
                    i6 = 0;
                    i7 = 0;
                }
                i3 = (i6 << 8) | 128 | ((_decodeSplitEscaped >> 6) & 63);
                i4 = i7 + 1;
            }
            _decodeSplitEscaped = 128 | (_decodeSplitEscaped & 63);
        }
        if (i4 < 4) {
            i2 = i4 + 1;
            i = (i3 << 8) | _decodeSplitEscaped;
        } else {
            int[] iArr3 = this._quadBuffer;
            int i9 = this._quadLength;
            this._quadLength = i9 + 1;
            iArr3[i9] = i3;
            i = _decodeSplitEscaped;
            i2 = 1;
        }
        return this._minorStateAfterSplit == 9 ? _finishAposName(this._quadLength, i, i2) : _parseEscapedName(this._quadLength, i, i2);
    }

    private int _decodeSplitEscaped(int i, int i2) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            this._quoted32 = i;
            this._quotedDigits = i2;
            return -1;
        }
        byte nextSignedByteFromBuffer = getNextSignedByteFromBuffer();
        if (i2 == -1) {
            switch (nextSignedByteFromBuffer) {
                case JsonFactory.DEFAULT_QUOTE_CHAR:
                case JsonPointer.SEPARATOR:
                case 92:
                    return nextSignedByteFromBuffer;
                case 98:
                    return 8;
                case 102:
                    return 12;
                case 110:
                    return 10;
                case 114:
                    return 13;
                case 116:
                    return 9;
                case 117:
                    if (this._inputPtr < this._inputEnd) {
                        nextSignedByteFromBuffer = getNextSignedByteFromBuffer();
                        i2 = 0;
                        break;
                    } else {
                        this._quotedDigits = 0;
                        this._quoted32 = 0;
                        return -1;
                    }
                default:
                    return _handleUnrecognizedCharacterEscape((char) nextSignedByteFromBuffer);
            }
        }
        int i3 = nextSignedByteFromBuffer & 255;
        while (true) {
            int i4 = i3;
            int charToHex = CharTypes.charToHex(i4);
            if (charToHex < 0) {
                _reportUnexpectedChar(i4 & 255, "expected a hex-digit for character escape sequence");
            }
            i = (i << 4) | charToHex;
            i2++;
            if (i2 == 4) {
                return i;
            }
            if (this._inputPtr >= this._inputEnd) {
                this._quotedDigits = i2;
                this._quoted32 = i;
                return -1;
            }
            i3 = getNextUnsignedByteFromBuffer();
        }
    }

    protected JsonToken _startString() throws IOException {
        int i = this._inputPtr;
        int i2 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, i + emptyAndGetCurrentSegment.length);
        while (true) {
            if (i >= min) {
                break;
            }
            int byteFromBuffer = getByteFromBuffer(i) & 255;
            if (iArr[byteFromBuffer] == 0) {
                i++;
                int i3 = i2;
                i2++;
                emptyAndGetCurrentSegment[i3] = (char) byteFromBuffer;
            } else if (byteFromBuffer == 34) {
                this._inputPtr = i + 1;
                this._textBuffer.setCurrentLength(i2);
                return _valueComplete(JsonToken.VALUE_STRING);
            }
        }
        this._textBuffer.setCurrentLength(i2);
        this._inputPtr = i;
        return _finishRegularString();
    }

    private final JsonToken _finishRegularString() throws IOException {
        int[] iArr = _icUTF8;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i = this._inputPtr;
        int i2 = this._inputEnd - 5;
        while (i < this._inputEnd) {
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int min = Math.min(this._inputEnd, i + (bufferWithoutReset.length - currentSegmentSize));
            while (true) {
                if (i < min) {
                    int i3 = i;
                    i++;
                    int byteFromBuffer = getByteFromBuffer(i3) & 255;
                    if (iArr[byteFromBuffer] == 0) {
                        int i4 = currentSegmentSize;
                        currentSegmentSize++;
                        bufferWithoutReset[i4] = (char) byteFromBuffer;
                    } else {
                        if (byteFromBuffer == 34) {
                            this._inputPtr = i;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            return _valueComplete(JsonToken.VALUE_STRING);
                        }
                        if (i >= i2) {
                            this._inputPtr = i;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            if (!_decodeSplitMultiByte(byteFromBuffer, iArr[byteFromBuffer], i < this._inputEnd)) {
                                this._minorStateAfterSplit = 40;
                                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                                this._currToken = jsonToken;
                                return jsonToken;
                            }
                            bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
                            currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                            i = this._inputPtr;
                        } else {
                            switch (iArr[byteFromBuffer]) {
                                case 1:
                                    this._inputPtr = i;
                                    byteFromBuffer = _decodeFastCharEscape();
                                    i = this._inputPtr;
                                    break;
                                case 2:
                                    i++;
                                    byteFromBuffer = _decodeUTF8_2(byteFromBuffer, getByteFromBuffer(i));
                                    break;
                                case 3:
                                    int i5 = i + 1;
                                    byte byteFromBuffer2 = getByteFromBuffer(i);
                                    i = i5 + 1;
                                    byteFromBuffer = _decodeUTF8_3(byteFromBuffer, byteFromBuffer2, getByteFromBuffer(i5));
                                    break;
                                case 4:
                                    int i6 = i + 1;
                                    byte byteFromBuffer3 = getByteFromBuffer(i);
                                    int i7 = i6 + 1;
                                    byte byteFromBuffer4 = getByteFromBuffer(i6);
                                    i = i7 + 1;
                                    int _decodeUTF8_4 = _decodeUTF8_4(byteFromBuffer, byteFromBuffer3, byteFromBuffer4, getByteFromBuffer(i7));
                                    int i8 = currentSegmentSize;
                                    currentSegmentSize++;
                                    bufferWithoutReset[i8] = (char) (55296 | (_decodeUTF8_4 >> 10));
                                    if (currentSegmentSize >= bufferWithoutReset.length) {
                                        bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                        currentSegmentSize = 0;
                                    }
                                    byteFromBuffer = 56320 | (_decodeUTF8_4 & FastDoubleMath.DOUBLE_EXPONENT_BIAS);
                                    break;
                                default:
                                    if (byteFromBuffer >= 32) {
                                        _reportInvalidChar(byteFromBuffer);
                                        break;
                                    } else {
                                        _throwUnquotedSpace(byteFromBuffer, "string value");
                                        break;
                                    }
                            }
                            if (currentSegmentSize >= bufferWithoutReset.length) {
                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                currentSegmentSize = 0;
                            }
                            int i9 = currentSegmentSize;
                            currentSegmentSize++;
                            bufferWithoutReset[i9] = (char) byteFromBuffer;
                        }
                    }
                }
            }
        }
        this._inputPtr = i;
        this._minorState = 40;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    protected JsonToken _startAposString() throws IOException {
        int i = this._inputPtr;
        int i2 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, i + emptyAndGetCurrentSegment.length);
        while (i < min) {
            int byteFromBuffer = getByteFromBuffer(i) & 255;
            if (byteFromBuffer == 39) {
                this._inputPtr = i + 1;
                this._textBuffer.setCurrentLength(i2);
                return _valueComplete(JsonToken.VALUE_STRING);
            }
            if (iArr[byteFromBuffer] != 0) {
                break;
            }
            i++;
            int i3 = i2;
            i2++;
            emptyAndGetCurrentSegment[i3] = (char) byteFromBuffer;
        }
        this._textBuffer.setCurrentLength(i2);
        this._inputPtr = i;
        return _finishAposString();
    }

    private final JsonToken _finishAposString() throws IOException {
        int[] iArr = _icUTF8;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i = this._inputPtr;
        int i2 = this._inputEnd - 5;
        while (i < this._inputEnd) {
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int min = Math.min(this._inputEnd, i + (bufferWithoutReset.length - currentSegmentSize));
            while (true) {
                if (i < min) {
                    int i3 = i;
                    i++;
                    int byteFromBuffer = getByteFromBuffer(i3) & 255;
                    if (iArr[byteFromBuffer] == 0 || byteFromBuffer == 34) {
                        if (byteFromBuffer == 39) {
                            this._inputPtr = i;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            return _valueComplete(JsonToken.VALUE_STRING);
                        }
                        int i4 = currentSegmentSize;
                        currentSegmentSize++;
                        bufferWithoutReset[i4] = (char) byteFromBuffer;
                    } else if (i >= i2) {
                        this._inputPtr = i;
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        if (!_decodeSplitMultiByte(byteFromBuffer, iArr[byteFromBuffer], i < this._inputEnd)) {
                            this._minorStateAfterSplit = 45;
                            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                            this._currToken = jsonToken;
                            return jsonToken;
                        }
                        bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
                        currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                        i = this._inputPtr;
                    } else {
                        switch (iArr[byteFromBuffer]) {
                            case 1:
                                this._inputPtr = i;
                                byteFromBuffer = _decodeFastCharEscape();
                                i = this._inputPtr;
                                break;
                            case 2:
                                i++;
                                byteFromBuffer = _decodeUTF8_2(byteFromBuffer, getByteFromBuffer(i));
                                break;
                            case 3:
                                int i5 = i + 1;
                                byte byteFromBuffer2 = getByteFromBuffer(i);
                                i = i5 + 1;
                                byteFromBuffer = _decodeUTF8_3(byteFromBuffer, byteFromBuffer2, getByteFromBuffer(i5));
                                break;
                            case 4:
                                int i6 = i + 1;
                                byte byteFromBuffer3 = getByteFromBuffer(i);
                                int i7 = i6 + 1;
                                byte byteFromBuffer4 = getByteFromBuffer(i6);
                                i = i7 + 1;
                                int _decodeUTF8_4 = _decodeUTF8_4(byteFromBuffer, byteFromBuffer3, byteFromBuffer4, getByteFromBuffer(i7));
                                int i8 = currentSegmentSize;
                                currentSegmentSize++;
                                bufferWithoutReset[i8] = (char) (55296 | (_decodeUTF8_4 >> 10));
                                if (currentSegmentSize >= bufferWithoutReset.length) {
                                    bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                    currentSegmentSize = 0;
                                }
                                byteFromBuffer = 56320 | (_decodeUTF8_4 & FastDoubleMath.DOUBLE_EXPONENT_BIAS);
                                break;
                            default:
                                if (byteFromBuffer >= 32) {
                                    _reportInvalidChar(byteFromBuffer);
                                    break;
                                } else {
                                    _throwUnquotedSpace(byteFromBuffer, "string value");
                                    break;
                                }
                        }
                        if (currentSegmentSize >= bufferWithoutReset.length) {
                            bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                            currentSegmentSize = 0;
                        }
                        int i9 = currentSegmentSize;
                        currentSegmentSize++;
                        bufferWithoutReset[i9] = (char) byteFromBuffer;
                    }
                }
            }
        }
        this._inputPtr = i;
        this._minorState = 45;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final boolean _decodeSplitMultiByte(int i, int i2, boolean z) throws IOException {
        switch (i2) {
            case 1:
                int _decodeSplitEscaped = _decodeSplitEscaped(0, -1);
                if (_decodeSplitEscaped < 0) {
                    this._minorState = 41;
                    return false;
                }
                this._textBuffer.append((char) _decodeSplitEscaped);
                return true;
            case 2:
                if (z) {
                    this._textBuffer.append((char) _decodeUTF8_2(i, getNextSignedByteFromBuffer()));
                    return true;
                }
                this._minorState = 42;
                this._pending32 = i;
                return false;
            case 3:
                int i3 = i & 15;
                if (z) {
                    return _decodeSplitUTF8_3(i3, 1, getNextSignedByteFromBuffer());
                }
                this._minorState = 43;
                this._pending32 = i3;
                this._pendingBytes = 1;
                return false;
            case 4:
                int i4 = i & 7;
                if (z) {
                    return _decodeSplitUTF8_4(i4, 1, getNextSignedByteFromBuffer());
                }
                this._pending32 = i4;
                this._pendingBytes = 1;
                this._minorState = 44;
                return false;
            default:
                if (i < 32) {
                    _throwUnquotedSpace(i, "string value");
                } else {
                    _reportInvalidChar(i);
                }
                this._textBuffer.append((char) i);
                return true;
        }
    }

    private final boolean _decodeSplitUTF8_3(int i, int i2, int i3) throws IOException {
        if (i2 == 1) {
            if ((i3 & 192) != 128) {
                _reportInvalidOther(i3 & 255, this._inputPtr);
            }
            i = (i << 6) | (i3 & 63);
            if (this._inputPtr >= this._inputEnd) {
                this._minorState = 43;
                this._pending32 = i;
                this._pendingBytes = 2;
                return false;
            }
            i3 = getNextSignedByteFromBuffer();
        }
        if ((i3 & 192) != 128) {
            _reportInvalidOther(i3 & 255, this._inputPtr);
        }
        this._textBuffer.append((char) ((i << 6) | (i3 & 63)));
        return true;
    }

    private final boolean _decodeSplitUTF8_4(int i, int i2, int i3) throws IOException {
        if (i2 == 1) {
            if ((i3 & 192) != 128) {
                _reportInvalidOther(i3 & 255, this._inputPtr);
            }
            i = (i << 6) | (i3 & 63);
            if (this._inputPtr >= this._inputEnd) {
                this._minorState = 44;
                this._pending32 = i;
                this._pendingBytes = 2;
                return false;
            }
            i2 = 2;
            i3 = getNextSignedByteFromBuffer();
        }
        if (i2 == 2) {
            if ((i3 & 192) != 128) {
                _reportInvalidOther(i3 & 255, this._inputPtr);
            }
            i = (i << 6) | (i3 & 63);
            if (this._inputPtr >= this._inputEnd) {
                this._minorState = 44;
                this._pending32 = i;
                this._pendingBytes = 3;
                return false;
            }
            i3 = getNextSignedByteFromBuffer();
        }
        if ((i3 & 192) != 128) {
            _reportInvalidOther(i3 & 255, this._inputPtr);
        }
        int i4 = ((i << 6) | (i3 & 63)) - 65536;
        this._textBuffer.append((char) (55296 | (i4 >> 10)));
        this._textBuffer.append((char) (56320 | (i4 & FastDoubleMath.DOUBLE_EXPONENT_BIAS)));
        return true;
    }

    private final int _decodeCharEscape() throws IOException {
        return this._inputEnd - this._inputPtr < 5 ? _decodeSplitEscaped(0, -1) : _decodeFastCharEscape();
    }

    private final int _decodeFastCharEscape() throws IOException {
        byte nextSignedByteFromBuffer = getNextSignedByteFromBuffer();
        switch (nextSignedByteFromBuffer) {
            case JsonFactory.DEFAULT_QUOTE_CHAR:
            case JsonPointer.SEPARATOR:
            case 92:
                return (char) nextSignedByteFromBuffer;
            case 98:
                return 8;
            case 102:
                return 12;
            case 110:
                return 10;
            case 114:
                return 13;
            case 116:
                return 9;
            case 117:
                byte nextSignedByteFromBuffer2 = getNextSignedByteFromBuffer();
                int charToHex = CharTypes.charToHex(nextSignedByteFromBuffer2);
                if (charToHex >= 0) {
                    nextSignedByteFromBuffer2 = getNextSignedByteFromBuffer();
                    int charToHex2 = CharTypes.charToHex(nextSignedByteFromBuffer2);
                    if (charToHex2 >= 0) {
                        int i = (charToHex << 4) | charToHex2;
                        nextSignedByteFromBuffer2 = getNextSignedByteFromBuffer();
                        int charToHex3 = CharTypes.charToHex(nextSignedByteFromBuffer2);
                        if (charToHex3 >= 0) {
                            int i2 = (i << 4) | charToHex3;
                            nextSignedByteFromBuffer2 = getNextSignedByteFromBuffer();
                            int charToHex4 = CharTypes.charToHex(nextSignedByteFromBuffer2);
                            if (charToHex4 >= 0) {
                                return (i2 << 4) | charToHex4;
                            }
                        }
                    }
                }
                _reportUnexpectedChar(nextSignedByteFromBuffer2 & 255, "expected a hex-digit for character escape sequence");
                return -1;
            default:
                return _handleUnrecognizedCharacterEscape((char) nextSignedByteFromBuffer);
        }
    }

    private final int _decodeUTF8_2(int i, int i2) throws IOException {
        if ((i2 & 192) != 128) {
            _reportInvalidOther(i2 & 255, this._inputPtr);
        }
        return ((i & 31) << 6) | (i2 & 63);
    }

    private final int _decodeUTF8_3(int i, int i2, int i3) throws IOException {
        int i4 = i & 15;
        if ((i2 & 192) != 128) {
            _reportInvalidOther(i2 & 255, this._inputPtr);
        }
        int i5 = (i4 << 6) | (i2 & 63);
        if ((i3 & 192) != 128) {
            _reportInvalidOther(i3 & 255, this._inputPtr);
        }
        return (i5 << 6) | (i3 & 63);
    }

    private final int _decodeUTF8_4(int i, int i2, int i3, int i4) throws IOException {
        if ((i2 & 192) != 128) {
            _reportInvalidOther(i2 & 255, this._inputPtr);
        }
        int i5 = ((i & 7) << 6) | (i2 & 63);
        if ((i3 & 192) != 128) {
            _reportInvalidOther(i3 & 255, this._inputPtr);
        }
        int i6 = (i5 << 6) | (i3 & 63);
        if ((i4 & 192) != 128) {
            _reportInvalidOther(i4 & 255, this._inputPtr);
        }
        return ((i6 << 6) | (i4 & 63)) - 65536;
    }
}
