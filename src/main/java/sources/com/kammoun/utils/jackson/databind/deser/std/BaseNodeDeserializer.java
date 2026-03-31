package com.kammoun.utils.jackson.databind.deser.std;

import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.StreamReadCapability;
import com.kammoun.utils.jackson.databind.BeanProperty;
import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.DeserializationFeature;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.JsonNode;
import com.kammoun.utils.jackson.databind.cfg.DatatypeFeatures;
import com.kammoun.utils.jackson.databind.cfg.JsonNodeFeature;
import com.kammoun.utils.jackson.databind.deser.ContextualDeserializer;
import com.kammoun.utils.jackson.databind.jsontype.TypeDeserializer;
import com.kammoun.utils.jackson.databind.node.ArrayNode;
import com.kammoun.utils.jackson.databind.node.ContainerNode;
import com.kammoun.utils.jackson.databind.node.JsonNodeFactory;
import com.kammoun.utils.jackson.databind.node.ObjectNode;
import com.kammoun.utils.jackson.databind.type.LogicalType;
import com.kammoun.utils.jackson.databind.util.RawValue;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

abstract class BaseNodeDeserializer<T extends JsonNode> extends StdDeserializer<T> implements ContextualDeserializer {
    protected final Boolean _supportsUpdates;
    protected final boolean _mergeArrays;
    protected final boolean _mergeObjects;

    public static final class ContainerStack {
        private ContainerNode[] _stack;
        private int _top;
        private int _end;

        public int size() {
            return this._top;
        }

        public void push(ContainerNode containerNode) {
            if (this._top < this._end) {
                ContainerNode[] containerNodeArr = this._stack;
                int i = this._top;
                this._top = i + 1;
                containerNodeArr[i] = containerNode;
                return;
            }
            if (this._stack == null) {
                this._end = 10;
                this._stack = new ContainerNode[this._end];
            } else {
                this._end += Math.min(4000, Math.max(20, this._end >> 1));
                this._stack = (ContainerNode[]) Arrays.copyOf(this._stack, this._end);
            }
            ContainerNode[] containerNodeArr2 = this._stack;
            int i2 = this._top;
            this._top = i2 + 1;
            containerNodeArr2[i2] = containerNode;
        }

        public ContainerNode popOrNull() {
            if (this._top == 0) {
                return null;
            }
            ContainerNode[] containerNodeArr = this._stack;
            int i = this._top - 1;
            this._top = i;
            return containerNodeArr[i];
        }
    }

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this._supportsUpdates = bool;
        this._mergeArrays = true;
        this._mergeObjects = true;
    }

    public BaseNodeDeserializer(BaseNodeDeserializer<?> baseNodeDeserializer, boolean z, boolean z2) {
        super(baseNodeDeserializer);
        this._supportsUpdates = baseNodeDeserializer._supportsUpdates;
        this._mergeArrays = z;
        this._mergeObjects = z2;
    }

    @Override
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override
    public boolean isCachable() {
        return true;
    }

    @Override
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Boolean defaultMergeable = config.getDefaultMergeable(ArrayNode.class);
        Boolean defaultMergeable2 = config.getDefaultMergeable(ObjectNode.class);
        Boolean defaultMergeable3 = config.getDefaultMergeable(JsonNode.class);
        boolean _shouldMerge = _shouldMerge(defaultMergeable, defaultMergeable3);
        boolean _shouldMerge2 = _shouldMerge(defaultMergeable2, defaultMergeable3);
        return (_shouldMerge == this._mergeArrays && _shouldMerge2 == this._mergeObjects) ? this : _createWithMerge(_shouldMerge, _shouldMerge2);
    }

    private static boolean _shouldMerge(Boolean bool, Boolean bool2) {
        if (bool != null) {
            return bool.booleanValue();
        }
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return true;
    }

    protected abstract JsonDeserializer<?> _createWithMerge(boolean z, boolean z2);

    protected void _handleDuplicateField(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, String str, ObjectNode objectNode, JsonNode jsonNode, JsonNode jsonNode2) throws IOException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            deserializationContext.reportInputMismatch(JsonNode.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
        }
        if (deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            if (jsonNode.isArray()) {
                ((ArrayNode) jsonNode).add(jsonNode2);
                objectNode.replace(str, jsonNode);
            } else {
                ArrayNode arrayNode = jsonNodeFactory.arrayNode();
                arrayNode.add(jsonNode);
                arrayNode.add(jsonNode2);
                objectNode.replace(str, arrayNode);
            }
        }
    }

    public final ObjectNode _deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, ContainerStack containerStack) throws IOException {
        JsonNode _deserializeAnyScalar;
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        String currentName = jsonParser.currentName();
        while (true) {
            String str = currentName;
            if (str == null) {
                return objectNode;
            }
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            switch (nextToken.id()) {
                case 1:
                    _deserializeAnyScalar = _deserializeContainerNoRecursion(jsonParser, deserializationContext, jsonNodeFactory, containerStack, jsonNodeFactory.objectNode());
                    break;
                case 3:
                    _deserializeAnyScalar = _deserializeContainerNoRecursion(jsonParser, deserializationContext, jsonNodeFactory, containerStack, jsonNodeFactory.arrayNode());
                    break;
                default:
                    _deserializeAnyScalar = _deserializeAnyScalar(jsonParser, deserializationContext);
                    break;
            }
            JsonNode replace = objectNode.replace(str, _deserializeAnyScalar);
            if (replace != null) {
                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, str, objectNode, replace, _deserializeAnyScalar);
            }
            currentName = jsonParser.nextFieldName();
        }
    }

    public final JsonNode updateObject(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode, ContainerStack containerStack) throws IOException {
        String currentName;
        JsonNode _deserializeRareScalar;
        if (jsonParser.isExpectedStartObjectToken()) {
            currentName = jsonParser.nextFieldName();
        } else {
            if (!jsonParser.hasToken(JsonToken.FIELD_NAME)) {
                return (JsonNode) deserialize(jsonParser, deserializationContext);
            }
            currentName = jsonParser.currentName();
        }
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        while (currentName != null) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonNode jsonNode = objectNode.get(currentName);
            if (jsonNode != null) {
                if (jsonNode instanceof ObjectNode) {
                    if (nextToken == JsonToken.START_OBJECT && this._mergeObjects) {
                        JsonNode updateObject = updateObject(jsonParser, deserializationContext, (ObjectNode) jsonNode, containerStack);
                        if (updateObject != jsonNode) {
                            objectNode.set(currentName, updateObject);
                        }
                    }
                } else if ((jsonNode instanceof ArrayNode) && nextToken == JsonToken.START_ARRAY && this._mergeArrays) {
                    _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, containerStack, (ArrayNode) jsonNode);
                }
                currentName = jsonParser.nextFieldName();
            }
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            switch (nextToken.id()) {
                case 1:
                    _deserializeRareScalar = _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, containerStack, nodeFactory.objectNode());
                    break;
                case 2:
                case 4:
                case 5:
                case 8:
                default:
                    _deserializeRareScalar = _deserializeRareScalar(jsonParser, deserializationContext);
                    break;
                case 3:
                    _deserializeRareScalar = _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, containerStack, nodeFactory.arrayNode());
                    break;
                case 6:
                    _deserializeRareScalar = nodeFactory.textNode(jsonParser.getText());
                    break;
                case 7:
                    _deserializeRareScalar = _fromInt(jsonParser, deserializationContext, nodeFactory);
                    break;
                case 9:
                    _deserializeRareScalar = nodeFactory.booleanNode(true);
                    break;
                case 10:
                    _deserializeRareScalar = nodeFactory.booleanNode(false);
                    break;
                case 11:
                    if (!deserializationContext.isEnabled(JsonNodeFeature.READ_NULL_PROPERTIES)) {
                        break;
                    } else {
                        _deserializeRareScalar = nodeFactory.nullNode();
                        break;
                    }
            }
            objectNode.set(currentName, _deserializeRareScalar);
            currentName = jsonParser.nextFieldName();
        }
        return objectNode;
    }

    public final com.kammoun.utils.jackson.databind.node.ContainerNode<?> _deserializeContainerNoRecursion(com.kammoun.utils.jackson.core.JsonParser r10, com.kammoun.utils.jackson.databind.DeserializationContext r11, com.kammoun.utils.jackson.databind.node.JsonNodeFactory r12, com.kammoun.utils.jackson.databind.deser.std.BaseNodeDeserializer.ContainerStack r13, com.kammoun.utils.jackson.databind.node.ContainerNode<?> r14) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.databind.deser.std.BaseNodeDeserializer._deserializeContainerNoRecursion(com.kammoun.utils.jackson.core.JsonParser, com.kammoun.utils.jackson.databind.DeserializationContext, com.kammoun.utils.jackson.databind.node.JsonNodeFactory, com.kammoun.utils.jackson.databind.deser.std.BaseNodeDeserializer$ContainerStack, com.kammoun.utils.jackson.databind.node.ContainerNode):com.kammoun.utils.jackson.databind.node.ContainerNode");
    }

    public final JsonNode _deserializeAnyScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        switch (jsonParser.currentTokenId()) {
            case 2:
                return nodeFactory.objectNode();
            case 3:
            case 4:
            case 5:
            default:
                return (JsonNode) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            case 6:
                return nodeFactory.textNode(jsonParser.getText());
            case 7:
                return _fromInt(jsonParser, deserializationContext, nodeFactory);
            case 8:
                return _fromFloat(jsonParser, deserializationContext, nodeFactory);
            case 9:
                return nodeFactory.booleanNode(true);
            case 10:
                return nodeFactory.booleanNode(false);
            case 11:
                return nodeFactory.nullNode();
            case 12:
                return _fromEmbedded(jsonParser, deserializationContext);
        }
    }

    protected final JsonNode _deserializeRareScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.currentTokenId()) {
            case 2:
                return deserializationContext.getNodeFactory().objectNode();
            case 8:
                return _fromFloat(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            case 12:
                return _fromEmbedded(jsonParser, deserializationContext);
            default:
                return (JsonNode) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
    }

    protected final JsonNode _fromInt(JsonParser jsonParser, int i, JsonNodeFactory jsonNodeFactory) throws IOException {
        if (i != 0) {
            return DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(i) ? jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue()) : jsonNodeFactory.numberNode(jsonParser.getLongValue());
        }
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        return numberType == JsonParser.NumberType.INT ? jsonNodeFactory.numberNode(jsonParser.getIntValue()) : numberType == JsonParser.NumberType.LONG ? jsonNodeFactory.numberNode(jsonParser.getLongValue()) : jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue());
    }

    protected final JsonNode _fromInt(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        JsonParser.NumberType numberType = (deserializationFeatures & F_MASK_INT_COERCIONS) != 0 ? DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures) ? JsonParser.NumberType.BIG_INTEGER : DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures) ? JsonParser.NumberType.LONG : jsonParser.getNumberType() : jsonParser.getNumberType();
        return numberType == JsonParser.NumberType.INT ? jsonNodeFactory.numberNode(jsonParser.getIntValue()) : numberType == JsonParser.NumberType.LONG ? jsonNodeFactory.numberNode(jsonParser.getLongValue()) : jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue());
    }

    protected final JsonNode _fromFloat(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberTypeFP numberTypeFP = jsonParser.getNumberTypeFP();
        return numberTypeFP == JsonParser.NumberTypeFP.BIG_DECIMAL ? _fromBigDecimal(deserializationContext, jsonNodeFactory, jsonParser.getDecimalValue()) : deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.isNaN() ? deserializationContext.isEnabled(JsonNodeFeature.FAIL_ON_NAN_TO_BIG_DECIMAL_COERCION) ? (JsonNode) deserializationContext.handleWeirdNumberValue(handledType(), Double.valueOf(jsonParser.getDoubleValue()), "Cannot convert NaN into BigDecimal", new Object[0]) : jsonNodeFactory.numberNode(jsonParser.getDoubleValue()) : _fromBigDecimal(deserializationContext, jsonNodeFactory, jsonParser.getDecimalValue()) : numberTypeFP == JsonParser.NumberTypeFP.FLOAT32 ? jsonNodeFactory.numberNode(jsonParser.getFloatValue()) : jsonNodeFactory.numberNode(jsonParser.getDoubleValue());
    }

    protected final JsonNode _fromBigDecimal(DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, BigDecimal bigDecimal) {
        DatatypeFeatures datatypeFeatures = deserializationContext.getDatatypeFeatures();
        if (datatypeFeatures.isExplicitlySet(JsonNodeFeature.STRIP_TRAILING_BIGDECIMAL_ZEROES) ? datatypeFeatures.isEnabled(JsonNodeFeature.STRIP_TRAILING_BIGDECIMAL_ZEROES) : jsonNodeFactory.willStripTrailingBigDecimalZeroes()) {
            try {
                bigDecimal = bigDecimal.stripTrailingZeros();
            } catch (ArithmeticException e) {
            }
        }
        return jsonNodeFactory.numberNode(bigDecimal);
    }

    protected final JsonNode _fromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        Object embeddedObject = jsonParser.getEmbeddedObject();
        return embeddedObject == null ? nodeFactory.nullNode() : embeddedObject.getClass() == byte[].class ? nodeFactory.binaryNode((byte[]) embeddedObject) : embeddedObject instanceof RawValue ? nodeFactory.rawValueNode((RawValue) embeddedObject) : embeddedObject instanceof JsonNode ? (JsonNode) embeddedObject : nodeFactory.pojoNode(embeddedObject);
    }
}
