package com.kammoun.utils.jackson.databind.deser.std;

import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.databind.BeanProperty;
import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.JsonNode;
import com.kammoun.utils.jackson.databind.deser.std.BaseNodeDeserializer;
import com.kammoun.utils.jackson.databind.jsontype.TypeDeserializer;
import com.kammoun.utils.jackson.databind.node.ArrayNode;
import com.kammoun.utils.jackson.databind.node.JsonNodeFactory;
import com.kammoun.utils.jackson.databind.node.ObjectNode;
import com.kammoun.utils.jackson.databind.type.LogicalType;
import java.io.IOException;

public class JsonNodeDeserializer extends BaseNodeDeserializer<JsonNode> {
    private static final JsonNodeDeserializer instance = new JsonNodeDeserializer();

    static final class ArrayDeserializer extends BaseNodeDeserializer<ArrayNode> {
        private static final long serialVersionUID = 1;
        protected static final ArrayDeserializer _instance = new ArrayDeserializer();

        protected ArrayDeserializer() {
            super(ArrayNode.class, true);
        }

        public static ArrayDeserializer getInstance() {
            return _instance;
        }

        protected ArrayDeserializer(ArrayDeserializer arrayDeserializer, boolean z, boolean z2) {
            super(arrayDeserializer, z, z2);
        }

        @Override
        protected JsonDeserializer<?> _createWithMerge(boolean z, boolean z2) {
            return new ArrayDeserializer(this, z, z2);
        }

        @Override
        public ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return (ArrayNode) deserializationContext.handleUnexpectedToken(ArrayNode.class, jsonParser);
            }
            JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
            ArrayNode arrayNode = nodeFactory.arrayNode();
            _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.ContainerStack(), arrayNode);
            return arrayNode;
        }

        @Override
        public ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ArrayNode arrayNode) throws IOException {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return (ArrayNode) deserializationContext.handleUnexpectedToken(ArrayNode.class, jsonParser);
            }
            _deserializeContainerNoRecursion(jsonParser, deserializationContext, deserializationContext.getNodeFactory(), new BaseNodeDeserializer.ContainerStack(), arrayNode);
            return arrayNode;
        }
    }

    static final class ObjectDeserializer extends BaseNodeDeserializer<ObjectNode> {
        private static final long serialVersionUID = 1;
        protected static final ObjectDeserializer _instance = new ObjectDeserializer();

        protected ObjectDeserializer() {
            super(ObjectNode.class, true);
        }

        public static ObjectDeserializer getInstance() {
            return _instance;
        }

        protected ObjectDeserializer(ObjectDeserializer objectDeserializer, boolean z, boolean z2) {
            super(objectDeserializer, z, z2);
        }

        @Override
        protected JsonDeserializer<?> _createWithMerge(boolean z, boolean z2) {
            return new ObjectDeserializer(this, z, z2);
        }

        @Override
        public ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
            if (!jsonParser.isExpectedStartObjectToken()) {
                return jsonParser.hasToken(JsonToken.FIELD_NAME) ? _deserializeObjectAtName(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.ContainerStack()) : jsonParser.hasToken(JsonToken.END_OBJECT) ? nodeFactory.objectNode() : (ObjectNode) deserializationContext.handleUnexpectedToken(ObjectNode.class, jsonParser);
            }
            ObjectNode objectNode = nodeFactory.objectNode();
            _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.ContainerStack(), objectNode);
            return objectNode;
        }

        @Override
        public ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode) throws IOException {
            return (jsonParser.isExpectedStartObjectToken() || jsonParser.hasToken(JsonToken.FIELD_NAME)) ? (ObjectNode) updateObject(jsonParser, deserializationContext, objectNode, new BaseNodeDeserializer.ContainerStack()) : (ObjectNode) deserializationContext.handleUnexpectedToken(ObjectNode.class, jsonParser);
        }
    }

    protected JsonNodeDeserializer() {
        super(JsonNode.class, null);
    }

    protected JsonNodeDeserializer(JsonNodeDeserializer jsonNodeDeserializer, boolean z, boolean z2) {
        super(jsonNodeDeserializer, z, z2);
    }

    @Override
    protected JsonDeserializer<?> _createWithMerge(boolean z, boolean z2) {
        return new JsonNodeDeserializer(this, z, z2);
    }

    public static JsonDeserializer<? extends JsonNode> getDeserializer(Class<?> cls) {
        return cls == ObjectNode.class ? ObjectDeserializer.getInstance() : cls == ArrayNode.class ? ArrayDeserializer.getInstance() : instance;
    }

    @Override
    public JsonNode getNullValue(DeserializationContext deserializationContext) {
        return deserializationContext.getNodeFactory().nullNode();
    }

    @Override
    public Object getAbsentValue(DeserializationContext deserializationContext) {
        return null;
    }

    @Override
    public JsonNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        BaseNodeDeserializer.ContainerStack containerStack = new BaseNodeDeserializer.ContainerStack();
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        switch (jsonParser.currentTokenId()) {
            case 1:
                return _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, containerStack, nodeFactory.objectNode());
            case 2:
                return nodeFactory.objectNode();
            case 3:
                return _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, containerStack, nodeFactory.arrayNode());
            case 4:
            default:
                return _deserializeAnyScalar(jsonParser, deserializationContext);
            case 5:
                return _deserializeObjectAtName(jsonParser, deserializationContext, nodeFactory, containerStack);
        }
    }

    @Override
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    @Override
    public JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        return super.createContextual(deserializationContext, beanProperty);
    }

    @Override
    public boolean isCachable() {
        return super.isCachable();
    }

    @Override
    public LogicalType logicalType() {
        return super.logicalType();
    }

    @Override
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return super.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }
}
