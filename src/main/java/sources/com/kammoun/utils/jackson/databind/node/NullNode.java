package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.databind.JsonNode;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import java.io.IOException;

public class NullNode extends ValueNode {
    private static final long serialVersionUID = 1;
    public static final NullNode instance = new NullNode();

    protected NullNode() {
    }

    protected Object readResolve() {
        return instance;
    }

    public static NullNode getInstance() {
        return instance;
    }

    @Override
    public JsonNodeType getNodeType() {
        return JsonNodeType.NULL;
    }

    @Override
    public JsonToken asToken() {
        return JsonToken.VALUE_NULL;
    }

    @Override
    @Deprecated
    public String asText(String str) {
        return str;
    }

    @Override
    public String asText() {
        return "null";
    }

    @Override
    public JsonNode requireNonNull() {
        return (JsonNode) _reportRequiredViolation("requireNonNull() called on `NullNode`", new Object[0]);
    }

    @Override
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        serializerProvider.defaultSerializeNull(jsonGenerator);
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || (obj instanceof NullNode);
    }

    @Override
    public int hashCode() {
        return JsonNodeType.NULL.ordinal();
    }
}
