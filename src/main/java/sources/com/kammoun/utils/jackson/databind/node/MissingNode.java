package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.databind.JsonNode;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import com.kammoun.utils.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

public final class MissingNode extends ValueNode {
    private static final long serialVersionUID = 1;
    private static final MissingNode instance = new MissingNode();

    protected MissingNode() {
    }

    protected Object readResolve() {
        return instance;
    }

    @Override
    public boolean isMissingNode() {
        return true;
    }

    @Override
    public <T extends JsonNode> T deepCopy() {
        return this;
    }

    public static MissingNode getInstance() {
        return instance;
    }

    @Override
    public JsonNodeType getNodeType() {
        return JsonNodeType.MISSING;
    }

    @Override
    public JsonToken asToken() {
        return JsonToken.NOT_AVAILABLE;
    }

    @Override
    public String asText() {
        return JsonProperty.USE_DEFAULT_NAME;
    }

    @Override
    @Deprecated
    public String asText(String str) {
        return str;
    }

    @Override
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNull();
    }

    @Override
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonGenerator.writeNull();
    }

    @Override
    public JsonNode require() {
        return (JsonNode) _reportRequiredViolation("require() called on `MissingNode`", new Object[0]);
    }

    @Override
    public JsonNode requireNonNull() {
        return (JsonNode) _reportRequiredViolation("requireNonNull() called on `MissingNode`", new Object[0]);
    }

    @Override
    public int hashCode() {
        return JsonNodeType.MISSING.ordinal();
    }

    @Override
    public String toString() {
        return JsonProperty.USE_DEFAULT_NAME;
    }

    @Override
    public String toPrettyString() {
        return JsonProperty.USE_DEFAULT_NAME;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this;
    }
}
