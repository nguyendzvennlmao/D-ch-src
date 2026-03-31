package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.core.Base64Variant;
import com.kammoun.utils.jackson.core.Base64Variants;
import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.io.CharTypes;
import com.kammoun.utils.jackson.core.io.NumberInput;
import com.kammoun.utils.jackson.core.util.ByteArrayBuilder;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import com.kammoun.utils.jackson.databind.exc.InvalidFormatException;
import java.io.IOException;
import java.util.Objects;

public class TextNode extends ValueNode {
    private static final long serialVersionUID = 2;
    static final TextNode EMPTY_STRING_NODE = new TextNode(JsonProperty.USE_DEFAULT_NAME);
    protected final String _value;

    public TextNode(String str) {
        this._value = str;
    }

    public static TextNode valueOf(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? EMPTY_STRING_NODE : new TextNode(str);
    }

    @Override
    public JsonNodeType getNodeType() {
        return JsonNodeType.STRING;
    }

    @Override
    public JsonToken asToken() {
        return JsonToken.VALUE_STRING;
    }

    @Override
    public String textValue() {
        return this._value;
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        String trim = this._value.trim();
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(Math.max(16, Math.min(65536, 4 + ((trim.length() >> 2) * 3))));
        try {
            base64Variant.decode(trim, byteArrayBuilder);
            return byteArrayBuilder.toByteArray();
        } catch (IllegalArgumentException e) {
            throw InvalidFormatException.from(null, String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", e.getMessage()), trim, byte[].class);
        }
    }

    @Override
    public byte[] binaryValue() throws IOException {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Override
    public String asText() {
        return this._value;
    }

    @Override
    @Deprecated
    public String asText(String str) {
        return this._value == null ? str : this._value;
    }

    @Override
    public boolean asBoolean(boolean z) {
        if (this._value != null) {
            String trim = this._value.trim();
            if ("true".equals(trim)) {
                return true;
            }
            if ("false".equals(trim)) {
                return false;
            }
        }
        return z;
    }

    @Override
    public int asInt(int i) {
        return NumberInput.parseAsInt(this._value, i);
    }

    @Override
    public long asLong(long j) {
        return NumberInput.parseAsLong(this._value, j);
    }

    @Override
    public double asDouble(double d) {
        return NumberInput.parseAsDouble(this._value, d);
    }

    @Override
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._value == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeString(this._value);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof TextNode)) {
            return Objects.equals(((TextNode) obj)._value, this._value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this._value);
    }

    @Deprecated
    protected static void appendQuoted(StringBuilder sb, String str) {
        sb.append('\"');
        CharTypes.appendQuoted(sb, str);
        sb.append('\"');
    }
}
