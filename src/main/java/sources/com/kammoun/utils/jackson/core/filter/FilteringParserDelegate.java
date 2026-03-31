package com.kammoun.utils.jackson.core.filter;

import com.kammoun.utils.jackson.core.Base64Variant;
import com.kammoun.utils.jackson.core.JsonLocation;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonStreamContext;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.filter.TokenFilter;
import com.kammoun.utils.jackson.core.util.JsonParserDelegate;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class FilteringParserDelegate extends JsonParserDelegate {
    protected TokenFilter rootFilter;
    protected boolean _allowMultipleMatches;
    protected TokenFilter.Inclusion _inclusion;
    protected JsonToken _currToken;
    protected JsonToken _lastClearedToken;
    protected TokenFilterContext _headContext;
    protected TokenFilterContext _exposedContext;
    protected TokenFilter _itemFilter;
    protected int _matchCount;

    @Deprecated
    public FilteringParserDelegate(JsonParser jsonParser, TokenFilter tokenFilter, boolean z, boolean z2) {
        this(jsonParser, tokenFilter, z ? TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH : TokenFilter.Inclusion.ONLY_INCLUDE_ALL, z2);
    }

    public FilteringParserDelegate(JsonParser jsonParser, TokenFilter tokenFilter, TokenFilter.Inclusion inclusion, boolean z) {
        super(jsonParser);
        this.rootFilter = tokenFilter;
        this._itemFilter = tokenFilter;
        this._headContext = TokenFilterContext.createRootContext(tokenFilter);
        this._inclusion = inclusion;
        this._allowMultipleMatches = z;
    }

    public TokenFilter getFilter() {
        return this.rootFilter;
    }

    public int getMatchCount() {
        return this._matchCount;
    }

    @Override
    public JsonToken currentToken() {
        return this._currToken;
    }

    @Override
    @Deprecated
    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    @Override
    public final int currentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override
    @Deprecated
    public final int getCurrentTokenId() {
        return currentTokenId();
    }

    @Override
    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    @Override
    public boolean hasTokenId(int i) {
        JsonToken jsonToken = this._currToken;
        return jsonToken == null ? 0 == i : jsonToken.id() == i;
    }

    @Override
    public final boolean hasToken(JsonToken jsonToken) {
        return this._currToken == jsonToken;
    }

    @Override
    public boolean isExpectedStartArrayToken() {
        return this._currToken == JsonToken.START_ARRAY;
    }

    @Override
    public boolean isExpectedStartObjectToken() {
        return this._currToken == JsonToken.START_OBJECT;
    }

    @Override
    public JsonLocation currentLocation() {
        return this.delegate.currentLocation();
    }

    @Override
    @Deprecated
    public JsonLocation getCurrentLocation() {
        return this.delegate.getCurrentLocation();
    }

    @Override
    public JsonLocation currentTokenLocation() {
        return this.delegate.currentTokenLocation();
    }

    @Override
    @Deprecated
    public JsonLocation getTokenLocation() {
        return this.delegate.getTokenLocation();
    }

    @Override
    public JsonStreamContext getParsingContext() {
        return _filterContext();
    }

    @Override
    @Deprecated
    public String getCurrentName() throws IOException {
        JsonStreamContext _filterContext = _filterContext();
        if (this._currToken != JsonToken.START_OBJECT && this._currToken != JsonToken.START_ARRAY) {
            return _filterContext.getCurrentName();
        }
        JsonStreamContext parent = _filterContext.getParent();
        if (parent == null) {
            return null;
        }
        return parent.getCurrentName();
    }

    @Override
    public String currentName() throws IOException {
        JsonStreamContext _filterContext = _filterContext();
        if (this._currToken != JsonToken.START_OBJECT && this._currToken != JsonToken.START_ARRAY) {
            return _filterContext.getCurrentName();
        }
        JsonStreamContext parent = _filterContext.getParent();
        if (parent == null) {
            return null;
        }
        return parent.getCurrentName();
    }

    @Override
    public void clearCurrentToken() {
        if (this._currToken != null) {
            this._lastClearedToken = this._currToken;
            this._currToken = null;
        }
    }

    @Override
    public JsonToken getLastClearedToken() {
        return this._lastClearedToken;
    }

    @Override
    public void overrideCurrentName(String str) {
        throw new UnsupportedOperationException("Can not currently override name during filtering read");
    }

    @Override
    public com.kammoun.utils.jackson.core.JsonToken nextToken() throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.core.filter.FilteringParserDelegate.nextToken():com.kammoun.utils.jackson.core.JsonToken");
    }

    protected final JsonToken _nextToken2() throws IOException {
        JsonToken _nextTokenWithBuffering;
        TokenFilter checkValue;
        JsonToken _nextTokenWithBuffering2;
        JsonToken _nextTokenWithBuffering3;
        while (true) {
            JsonToken nextToken = this.delegate.nextToken();
            if (nextToken != null) {
                switch (nextToken.id()) {
                    case 1:
                        TokenFilter tokenFilter = this._itemFilter;
                        if (tokenFilter == TokenFilter.INCLUDE_ALL) {
                            this._headContext = this._headContext.createChildObjectContext(tokenFilter, true);
                            this._currToken = nextToken;
                            return nextToken;
                        }
                        if (tokenFilter == null) {
                            this.delegate.skipChildren();
                            break;
                        } else {
                            TokenFilter checkValue2 = this._headContext.checkValue(tokenFilter);
                            if (checkValue2 == null) {
                                this.delegate.skipChildren();
                                break;
                            } else {
                                if (checkValue2 != TokenFilter.INCLUDE_ALL) {
                                    checkValue2 = checkValue2.filterStartObject();
                                }
                                this._itemFilter = checkValue2;
                                if (checkValue2 == TokenFilter.INCLUDE_ALL) {
                                    this._headContext = this._headContext.createChildObjectContext(checkValue2, true);
                                    this._currToken = nextToken;
                                    return nextToken;
                                }
                                if (checkValue2 != null && this._inclusion == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                    this._headContext = this._headContext.createChildObjectContext(checkValue2, true);
                                    this._currToken = nextToken;
                                    return nextToken;
                                }
                                this._headContext = this._headContext.createChildObjectContext(checkValue2, false);
                                if (this._inclusion == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (_nextTokenWithBuffering3 = _nextTokenWithBuffering(this._headContext)) != null) {
                                    this._currToken = _nextTokenWithBuffering3;
                                    return _nextTokenWithBuffering3;
                                }
                            }
                        }
                        break;
                    case 2:
                        boolean isStartHandled = this._headContext.isStartHandled();
                        TokenFilter filter = this._headContext.getFilter();
                        if (filter != null && filter != TokenFilter.INCLUDE_ALL) {
                            boolean includeEmptyArray = filter.includeEmptyArray(this._headContext.hasCurrentName());
                            filter.filterFinishObject();
                            if (includeEmptyArray) {
                                return _nextBuffered(this._headContext);
                            }
                        }
                        this._headContext = this._headContext.getParent();
                        this._itemFilter = this._headContext.getFilter();
                        if (!isStartHandled) {
                            break;
                        } else {
                            this._currToken = nextToken;
                            return nextToken;
                        }
                    case 3:
                        TokenFilter tokenFilter2 = this._itemFilter;
                        if (tokenFilter2 == TokenFilter.INCLUDE_ALL) {
                            this._headContext = this._headContext.createChildArrayContext(tokenFilter2, true);
                            this._currToken = nextToken;
                            return nextToken;
                        }
                        if (tokenFilter2 == null) {
                            this.delegate.skipChildren();
                            break;
                        } else {
                            TokenFilter checkValue3 = this._headContext.checkValue(tokenFilter2);
                            if (checkValue3 == null) {
                                this.delegate.skipChildren();
                                break;
                            } else {
                                if (checkValue3 != TokenFilter.INCLUDE_ALL) {
                                    checkValue3 = checkValue3.filterStartArray();
                                }
                                this._itemFilter = checkValue3;
                                if (checkValue3 == TokenFilter.INCLUDE_ALL) {
                                    this._headContext = this._headContext.createChildArrayContext(checkValue3, true);
                                    this._currToken = nextToken;
                                    return nextToken;
                                }
                                if (checkValue3 != null && this._inclusion == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                    this._headContext = this._headContext.createChildArrayContext(checkValue3, true);
                                    this._currToken = nextToken;
                                    return nextToken;
                                }
                                this._headContext = this._headContext.createChildArrayContext(checkValue3, false);
                                if (this._inclusion == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (_nextTokenWithBuffering = _nextTokenWithBuffering(this._headContext)) != null) {
                                    this._currToken = _nextTokenWithBuffering;
                                    return _nextTokenWithBuffering;
                                }
                            }
                        }
                        break;
                    case 4:
                        boolean isStartHandled2 = this._headContext.isStartHandled();
                        TokenFilter filter2 = this._headContext.getFilter();
                        if (filter2 != null && filter2 != TokenFilter.INCLUDE_ALL) {
                            boolean includeEmptyArray2 = filter2.includeEmptyArray(this._headContext.hasCurrentIndex());
                            filter2.filterFinishArray();
                            if (includeEmptyArray2) {
                                return _nextBuffered(this._headContext);
                            }
                        }
                        this._headContext = this._headContext.getParent();
                        this._itemFilter = this._headContext.getFilter();
                        if (!isStartHandled2) {
                            break;
                        } else {
                            this._currToken = nextToken;
                            return nextToken;
                        }
                    case 5:
                        String currentName = this.delegate.currentName();
                        TokenFilter fieldName = this._headContext.setFieldName(currentName);
                        if (fieldName == TokenFilter.INCLUDE_ALL) {
                            this._itemFilter = fieldName;
                            this._currToken = nextToken;
                            return nextToken;
                        }
                        if (fieldName == null) {
                            this.delegate.nextToken();
                            this.delegate.skipChildren();
                            break;
                        } else {
                            TokenFilter includeProperty = fieldName.includeProperty(currentName);
                            if (includeProperty == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                                break;
                            } else {
                                this._itemFilter = includeProperty;
                                if (includeProperty == TokenFilter.INCLUDE_ALL) {
                                    if (!_verifyAllowedMatches()) {
                                        this.delegate.nextToken();
                                        this.delegate.skipChildren();
                                        break;
                                    } else if (this._inclusion != TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                                        break;
                                    } else {
                                        this._currToken = nextToken;
                                        return nextToken;
                                    }
                                } else if (this._inclusion != TokenFilter.Inclusion.ONLY_INCLUDE_ALL && (_nextTokenWithBuffering2 = _nextTokenWithBuffering(this._headContext)) != null) {
                                    this._currToken = _nextTokenWithBuffering2;
                                    return _nextTokenWithBuffering2;
                                }
                            }
                        }
                        break;
                    default:
                        TokenFilter tokenFilter3 = this._itemFilter;
                        if (tokenFilter3 != TokenFilter.INCLUDE_ALL) {
                            if (tokenFilter3 != null && ((checkValue = this._headContext.checkValue(tokenFilter3)) == TokenFilter.INCLUDE_ALL || (checkValue != null && checkValue.includeValue(this.delegate)))) {
                                if (!_verifyAllowedMatches()) {
                                    break;
                                } else {
                                    this._currToken = nextToken;
                                    return nextToken;
                                }
                            }
                        } else {
                            this._currToken = nextToken;
                            return nextToken;
                        }
                        break;
                }
            } else {
                this._currToken = nextToken;
                return nextToken;
            }
        }
    }

    protected final JsonToken _nextTokenWithBuffering(TokenFilterContext tokenFilterContext) throws IOException {
        TokenFilter checkValue;
        while (true) {
            JsonToken nextToken = this.delegate.nextToken();
            if (nextToken != null) {
                switch (nextToken.id()) {
                    case 1:
                        TokenFilter tokenFilter = this._itemFilter;
                        if (tokenFilter == TokenFilter.INCLUDE_ALL) {
                            this._headContext = this._headContext.createChildObjectContext(tokenFilter, true);
                            return nextToken;
                        }
                        if (tokenFilter == null) {
                            this.delegate.skipChildren();
                            break;
                        } else {
                            TokenFilter checkValue2 = this._headContext.checkValue(tokenFilter);
                            if (checkValue2 == null) {
                                this.delegate.skipChildren();
                                break;
                            } else {
                                if (checkValue2 != TokenFilter.INCLUDE_ALL) {
                                    checkValue2 = checkValue2.filterStartObject();
                                }
                                this._itemFilter = checkValue2;
                                if (checkValue2 == TokenFilter.INCLUDE_ALL) {
                                    this._headContext = this._headContext.createChildObjectContext(checkValue2, true);
                                    return _nextBuffered(tokenFilterContext);
                                }
                                if (checkValue2 != null && this._inclusion == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                    this._headContext = this._headContext.createChildArrayContext(checkValue2, true);
                                    return _nextBuffered(tokenFilterContext);
                                }
                                this._headContext = this._headContext.createChildObjectContext(checkValue2, false);
                                break;
                            }
                        }
                    case 2:
                        TokenFilter filter = this._headContext.getFilter();
                        if (filter != null && filter != TokenFilter.INCLUDE_ALL) {
                            boolean includeEmptyObject = filter.includeEmptyObject(this._headContext.hasCurrentName());
                            filter.filterFinishObject();
                            if (includeEmptyObject) {
                                this._headContext._currentName = this._headContext._parent == null ? null : this._headContext._parent._currentName;
                                this._headContext._needToHandleName = false;
                                return _nextBuffered(tokenFilterContext);
                            }
                        }
                        boolean z = this._headContext == tokenFilterContext;
                        boolean z2 = z && this._headContext.isStartHandled();
                        this._headContext = this._headContext.getParent();
                        this._itemFilter = this._headContext.getFilter();
                        if (!z2) {
                            if (!z) {
                                break;
                            } else {
                                return null;
                            }
                        } else {
                            return nextToken;
                        }
                    case 3:
                        TokenFilter checkValue3 = this._headContext.checkValue(this._itemFilter);
                        if (checkValue3 == null) {
                            this.delegate.skipChildren();
                            break;
                        } else {
                            if (checkValue3 != TokenFilter.INCLUDE_ALL) {
                                checkValue3 = checkValue3.filterStartArray();
                            }
                            this._itemFilter = checkValue3;
                            if (checkValue3 == TokenFilter.INCLUDE_ALL) {
                                this._headContext = this._headContext.createChildArrayContext(checkValue3, true);
                                return _nextBuffered(tokenFilterContext);
                            }
                            if (checkValue3 != null && this._inclusion == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                this._headContext = this._headContext.createChildArrayContext(checkValue3, true);
                                return _nextBuffered(tokenFilterContext);
                            }
                            this._headContext = this._headContext.createChildArrayContext(checkValue3, false);
                            break;
                        }
                    case 4:
                        TokenFilter filter2 = this._headContext.getFilter();
                        if (filter2 != null && filter2 != TokenFilter.INCLUDE_ALL) {
                            boolean includeEmptyArray = filter2.includeEmptyArray(this._headContext.hasCurrentIndex());
                            filter2.filterFinishArray();
                            if (includeEmptyArray) {
                                return _nextBuffered(tokenFilterContext);
                            }
                        }
                        boolean z3 = this._headContext == tokenFilterContext;
                        boolean z4 = z3 && this._headContext.isStartHandled();
                        this._headContext = this._headContext.getParent();
                        this._itemFilter = this._headContext.getFilter();
                        if (!z4) {
                            if (!z3) {
                                break;
                            } else {
                                return null;
                            }
                        } else {
                            return nextToken;
                        }
                    case 5:
                        String currentName = this.delegate.currentName();
                        TokenFilter fieldName = this._headContext.setFieldName(currentName);
                        if (fieldName != TokenFilter.INCLUDE_ALL) {
                            if (fieldName != null) {
                                TokenFilter includeProperty = fieldName.includeProperty(currentName);
                                if (includeProperty != null) {
                                    this._itemFilter = includeProperty;
                                    if (includeProperty == TokenFilter.INCLUDE_ALL) {
                                        if (!_verifyAllowedMatches()) {
                                            this._itemFilter = this._headContext.setFieldName(currentName);
                                            break;
                                        } else {
                                            return _nextBuffered(tokenFilterContext);
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    this.delegate.nextToken();
                                    this.delegate.skipChildren();
                                    break;
                                }
                            } else {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                                break;
                            }
                        } else {
                            this._itemFilter = fieldName;
                            return _nextBuffered(tokenFilterContext);
                        }
                    default:
                        TokenFilter tokenFilter2 = this._itemFilter;
                        if (tokenFilter2 != TokenFilter.INCLUDE_ALL) {
                            if (tokenFilter2 != null && ((checkValue = this._headContext.checkValue(tokenFilter2)) == TokenFilter.INCLUDE_ALL || (checkValue != null && checkValue.includeValue(this.delegate)))) {
                                if (!_verifyAllowedMatches()) {
                                    break;
                                } else {
                                    return _nextBuffered(tokenFilterContext);
                                }
                            }
                        } else {
                            return _nextBuffered(tokenFilterContext);
                        }
                        break;
                }
            } else {
                return nextToken;
            }
        }
    }

    private JsonToken _nextBuffered(TokenFilterContext tokenFilterContext) throws IOException {
        this._exposedContext = tokenFilterContext;
        TokenFilterContext tokenFilterContext2 = tokenFilterContext;
        JsonToken nextTokenToRead = tokenFilterContext2.nextTokenToRead();
        if (nextTokenToRead != null) {
            return nextTokenToRead;
        }
        while (tokenFilterContext2 != this._headContext) {
            tokenFilterContext2 = this._exposedContext.findChildOf(tokenFilterContext2);
            this._exposedContext = tokenFilterContext2;
            if (tokenFilterContext2 == null) {
                throw _constructError("Unexpected problem: chain of filtered context broken");
            }
            JsonToken nextTokenToRead2 = this._exposedContext.nextTokenToRead();
            if (nextTokenToRead2 != null) {
                return nextTokenToRead2;
            }
        }
        throw _constructError("Internal error: failed to locate expected buffered tokens");
    }

    private final boolean _verifyAllowedMatches() throws IOException {
        if (this._matchCount != 0 && !this._allowMultipleMatches) {
            return false;
        }
        this._matchCount++;
        return true;
    }

    @Override
    public JsonToken nextValue() throws IOException {
        JsonToken nextToken = nextToken();
        if (nextToken == JsonToken.FIELD_NAME) {
            nextToken = nextToken();
        }
        return nextToken;
    }

    @Override
    public JsonParser skipChildren() throws IOException {
        if (this._currToken != JsonToken.START_OBJECT && this._currToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken nextToken = nextToken();
            if (nextToken == null) {
                return this;
            }
            if (nextToken.isStructStart()) {
                i++;
            } else if (nextToken.isStructEnd()) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else {
                continue;
            }
        }
    }

    @Override
    public String getText() throws IOException {
        return this._currToken == JsonToken.FIELD_NAME ? currentName() : this.delegate.getText();
    }

    @Override
    public boolean hasTextCharacters() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return false;
        }
        return this.delegate.hasTextCharacters();
    }

    @Override
    public char[] getTextCharacters() throws IOException {
        return this._currToken == JsonToken.FIELD_NAME ? currentName().toCharArray() : this.delegate.getTextCharacters();
    }

    @Override
    public int getTextLength() throws IOException {
        return this._currToken == JsonToken.FIELD_NAME ? currentName().length() : this.delegate.getTextLength();
    }

    @Override
    public int getTextOffset() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return 0;
        }
        return this.delegate.getTextOffset();
    }

    @Override
    public BigInteger getBigIntegerValue() throws IOException {
        return this.delegate.getBigIntegerValue();
    }

    @Override
    public boolean getBooleanValue() throws IOException {
        return this.delegate.getBooleanValue();
    }

    @Override
    public byte getByteValue() throws IOException {
        return this.delegate.getByteValue();
    }

    @Override
    public short getShortValue() throws IOException {
        return this.delegate.getShortValue();
    }

    @Override
    public BigDecimal getDecimalValue() throws IOException {
        return this.delegate.getDecimalValue();
    }

    @Override
    public double getDoubleValue() throws IOException {
        return this.delegate.getDoubleValue();
    }

    @Override
    public float getFloatValue() throws IOException {
        return this.delegate.getFloatValue();
    }

    @Override
    public int getIntValue() throws IOException {
        return this.delegate.getIntValue();
    }

    @Override
    public long getLongValue() throws IOException {
        return this.delegate.getLongValue();
    }

    @Override
    public JsonParser.NumberType getNumberType() throws IOException {
        return this.delegate.getNumberType();
    }

    @Override
    public Number getNumberValue() throws IOException {
        return this.delegate.getNumberValue();
    }

    @Override
    public int getValueAsInt() throws IOException {
        return this.delegate.getValueAsInt();
    }

    @Override
    public int getValueAsInt(int i) throws IOException {
        return this.delegate.getValueAsInt(i);
    }

    @Override
    public long getValueAsLong() throws IOException {
        return this.delegate.getValueAsLong();
    }

    @Override
    public long getValueAsLong(long j) throws IOException {
        return this.delegate.getValueAsLong(j);
    }

    @Override
    public double getValueAsDouble() throws IOException {
        return this.delegate.getValueAsDouble();
    }

    @Override
    public double getValueAsDouble(double d) throws IOException {
        return this.delegate.getValueAsDouble(d);
    }

    @Override
    public boolean getValueAsBoolean() throws IOException {
        return this.delegate.getValueAsBoolean();
    }

    @Override
    public boolean getValueAsBoolean(boolean z) throws IOException {
        return this.delegate.getValueAsBoolean(z);
    }

    @Override
    public String getValueAsString() throws IOException {
        return this._currToken == JsonToken.FIELD_NAME ? currentName() : this.delegate.getValueAsString();
    }

    @Override
    public String getValueAsString(String str) throws IOException {
        return this._currToken == JsonToken.FIELD_NAME ? currentName() : this.delegate.getValueAsString(str);
    }

    @Override
    public Object getEmbeddedObject() throws IOException {
        return this.delegate.getEmbeddedObject();
    }

    @Override
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        return this.delegate.getBinaryValue(base64Variant);
    }

    @Override
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        return this.delegate.readBinaryValue(base64Variant, outputStream);
    }

    protected JsonStreamContext _filterContext() {
        return this._exposedContext != null ? this._exposedContext : this._headContext;
    }
}
