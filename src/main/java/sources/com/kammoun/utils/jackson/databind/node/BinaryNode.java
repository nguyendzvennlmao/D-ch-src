package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.core.Base64Variants;
import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public class BinaryNode extends ValueNode {
    private static final long serialVersionUID = 2;
    static final BinaryNode EMPTY_BINARY_NODE = new BinaryNode(new byte[0]);
    protected final byte[] _data;

    public BinaryNode(byte[] bArr) {
        this._data = bArr;
    }

    public BinaryNode(byte[] bArr, int i, int i2) {
        if (i == 0 && i2 == bArr.length) {
            this._data = bArr;
        } else {
            this._data = new byte[i2];
            System.arraycopy(bArr, i, this._data, 0, i2);
        }
    }

    public static BinaryNode valueOf(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? EMPTY_BINARY_NODE : new BinaryNode(bArr);
    }

    public static BinaryNode valueOf(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        return i2 == 0 ? EMPTY_BINARY_NODE : new BinaryNode(bArr, i, i2);
    }

    @Override
    public JsonNodeType getNodeType() {
        return JsonNodeType.BINARY;
    }

    @Override
    public JsonToken asToken() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override
    public byte[] binaryValue() {
        return this._data;
    }

    @Override
    public String asText() {
        return Base64Variants.getDefaultVariant().encode(this._data, false);
    }

    @Override
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._data == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeBinary(serializerProvider.getConfig().getBase64Variant(), this._data, 0, this._data.length);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof BinaryNode)) {
            return false;
        }
        byte[] bArr = ((BinaryNode) obj)._data;
        if (this._data == bArr) {
            return true;
        }
        if (this._data == null || bArr == null) {
            return false;
        }
        return Arrays.equals(this._data, bArr);
    }

    @Override
    public int hashCode() {
        if (this._data == null) {
            return -1;
        }
        return this._data.length;
    }
}
