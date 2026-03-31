package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.core.Base64Variant;
import com.kammoun.utils.jackson.core.JacksonException;
import com.kammoun.utils.jackson.core.JsonLocation;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonStreamContext;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.ObjectCodec;
import com.kammoun.utils.jackson.core.StreamReadCapability;
import com.kammoun.utils.jackson.core.Version;
import com.kammoun.utils.jackson.core.base.ParserMinimalBase;
import com.kammoun.utils.jackson.core.util.JacksonFeatureSet;
import com.kammoun.utils.jackson.databind.JsonNode;
import com.kammoun.utils.jackson.databind.cfg.PackageVersion;
import com.kammoun.utils.jackson.databind.node.NodeCursor;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TreeTraversingParser extends ParserMinimalBase {
    protected ObjectCodec _objectCodec;
    protected NodeCursor _nodeCursor;
    protected boolean _closed;

    public TreeTraversingParser(JsonNode jsonNode) {
        this(jsonNode, null);
    }

    public TreeTraversingParser(JsonNode jsonNode, ObjectCodec objectCodec) {
        super(0);
        this._objectCodec = objectCodec;
        this._nodeCursor = new NodeCursor.RootCursor(jsonNode, null);
    }

    @Override
    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    @Override
    public ObjectCodec getCodec() {
        return this._objectCodec;
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
    public void close() throws IOException {
        if (this._closed) {
            return;
        }
        this._closed = true;
        this._nodeCursor = null;
        this._currToken = null;
    }

    @Override
    public JsonToken nextToken() throws IOException {
        this._currToken = this._nodeCursor.nextToken();
        if (this._currToken == null) {
            this._closed = true;
            return null;
        }
        switch (this._currToken) {
            case START_OBJECT:
                this._nodeCursor = this._nodeCursor.startObject();
                break;
            case START_ARRAY:
                this._nodeCursor = this._nodeCursor.startArray();
                break;
            case END_OBJECT:
            case END_ARRAY:
                this._nodeCursor = this._nodeCursor.getParent();
                break;
        }
        return this._currToken;
    }

    @Override
    public JsonParser skipChildren() throws IOException {
        if (this._currToken == JsonToken.START_OBJECT) {
            this._nodeCursor = this._nodeCursor.getParent();
            this._currToken = JsonToken.END_OBJECT;
        } else if (this._currToken == JsonToken.START_ARRAY) {
            this._nodeCursor = this._nodeCursor.getParent();
            this._currToken = JsonToken.END_ARRAY;
        }
        return this;
    }

    @Override
    public boolean isClosed() {
        return this._closed;
    }

    @Override
    public String currentName() {
        NodeCursor nodeCursor = this._nodeCursor;
        if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
            nodeCursor = nodeCursor.getParent();
        }
        if (nodeCursor == null) {
            return null;
        }
        return nodeCursor.getCurrentName();
    }

    @Override
    @Deprecated
    public String getCurrentName() {
        return currentName();
    }

    @Override
    public void overrideCurrentName(String str) {
        NodeCursor nodeCursor = this._nodeCursor;
        if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
            nodeCursor = nodeCursor.getParent();
        }
        if (nodeCursor != null) {
            nodeCursor.overrideCurrentName(str);
        }
    }

    @Override
    public JsonStreamContext getParsingContext() {
        return this._nodeCursor;
    }

    @Override
    public JsonLocation currentLocation() {
        return JsonLocation.NA;
    }

    @Override
    public JsonLocation currentTokenLocation() {
        return JsonLocation.NA;
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
    public String getText() {
        if (this._currToken == null) {
            return null;
        }
        switch (this._currToken) {
            case FIELD_NAME:
                return this._nodeCursor.getCurrentName();
            case VALUE_STRING:
                return currentNode().textValue();
            case VALUE_NUMBER_INT:
            case VALUE_NUMBER_FLOAT:
                return String.valueOf(currentNode().numberValue());
            case VALUE_EMBEDDED_OBJECT:
                JsonNode currentNode = currentNode();
                if (currentNode != null && currentNode.isBinary()) {
                    return currentNode.asText();
                }
                break;
        }
        return this._currToken.asString();
    }

    @Override
    public char[] getTextCharacters() throws IOException {
        return getText().toCharArray();
    }

    @Override
    public int getTextLength() throws IOException {
        return getText().length();
    }

    @Override
    public int getTextOffset() throws IOException {
        return 0;
    }

    @Override
    public boolean hasTextCharacters() {
        return false;
    }

    @Override
    public JsonParser.NumberType getNumberType() throws IOException {
        JsonNode currentNumericNode = currentNumericNode();
        if (currentNumericNode == null) {
            return null;
        }
        return currentNumericNode.numberType();
    }

    @Override
    public JsonParser.NumberTypeFP getNumberTypeFP() throws IOException {
        JsonParser.NumberType numberType = getNumberType();
        return numberType == JsonParser.NumberType.BIG_DECIMAL ? JsonParser.NumberTypeFP.BIG_DECIMAL : numberType == JsonParser.NumberType.DOUBLE ? JsonParser.NumberTypeFP.DOUBLE64 : numberType == JsonParser.NumberType.FLOAT ? JsonParser.NumberTypeFP.FLOAT32 : JsonParser.NumberTypeFP.UNKNOWN;
    }

    @Override
    public BigInteger getBigIntegerValue() throws IOException {
        return currentNumericNode().bigIntegerValue();
    }

    @Override
    public BigDecimal getDecimalValue() throws IOException {
        return currentNumericNode().decimalValue();
    }

    @Override
    public double getDoubleValue() throws IOException {
        return currentNumericNode().doubleValue();
    }

    @Override
    public float getFloatValue() throws IOException {
        return (float) currentNumericNode().doubleValue();
    }

    @Override
    public int getIntValue() throws IOException {
        NumericNode numericNode = (NumericNode) currentNumericNode();
        if (!numericNode.canConvertToInt()) {
            reportOverflowInt();
        }
        return numericNode.intValue();
    }

    @Override
    public long getLongValue() throws IOException {
        NumericNode numericNode = (NumericNode) currentNumericNode();
        if (!numericNode.canConvertToLong()) {
            reportOverflowLong();
        }
        return numericNode.longValue();
    }

    @Override
    public Number getNumberValue() throws IOException {
        return currentNumericNode().numberValue();
    }

    @Override
    public Object getEmbeddedObject() {
        JsonNode currentNode;
        if (this._closed || (currentNode = currentNode()) == null) {
            return null;
        }
        if (currentNode.isPojo()) {
            return ((POJONode) currentNode).getPojo();
        }
        if (currentNode.isBinary()) {
            return ((BinaryNode) currentNode).binaryValue();
        }
        return null;
    }

    @Override
    public boolean isNaN() {
        if (this._closed) {
            return false;
        }
        JsonNode currentNode = currentNode();
        if (currentNode instanceof NumericNode) {
            return ((NumericNode) currentNode).isNaN();
        }
        return false;
    }

    @Override
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        JsonNode currentNode = currentNode();
        if (currentNode != null) {
            return currentNode instanceof TextNode ? ((TextNode) currentNode).getBinaryValue(base64Variant) : currentNode.binaryValue();
        }
        return null;
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

    protected JsonNode currentNode() {
        if (this._closed || this._nodeCursor == null) {
            return null;
        }
        return this._nodeCursor.currentNode();
    }

    protected JsonNode currentNumericNode() throws JacksonException {
        JsonNode currentNode = currentNode();
        if (currentNode != null && currentNode.isNumber()) {
            return currentNode;
        }
        throw _constructError("Current token (" + (currentNode == null ? null : currentNode.asToken()) + ") not numeric, cannot use numeric value accessors");
    }

    @Override
    protected void _handleEOF() {
        _throwInternal();
    }
}
