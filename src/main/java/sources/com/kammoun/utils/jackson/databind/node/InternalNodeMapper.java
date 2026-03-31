package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.databind.JsonNode;
import com.kammoun.utils.jackson.databind.JsonSerializable;
import com.kammoun.utils.jackson.databind.ObjectReader;
import com.kammoun.utils.jackson.databind.ObjectWriter;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import com.kammoun.utils.jackson.databind.json.JsonMapper;
import com.kammoun.utils.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class InternalNodeMapper {
    private static final JsonMapper JSON_MAPPER = new JsonMapper();
    private static final ObjectWriter STD_WRITER = JSON_MAPPER.writer();
    private static final ObjectWriter PRETTY_WRITER = JSON_MAPPER.writer().withDefaultPrettyPrinter();
    private static final ObjectReader NODE_READER = JSON_MAPPER.readerFor(JsonNode.class);

    public static final class IteratorStack {
        private Iterator<?>[] _stack;
        private int _top;
        private int _end;

        public void push(Iterator<?> it) {
            if (this._top < this._end) {
                Iterator<?>[] itArr = this._stack;
                int i = this._top;
                this._top = i + 1;
                itArr[i] = it;
                return;
            }
            if (this._stack == null) {
                this._end = 10;
                this._stack = new Iterator[this._end];
            } else {
                this._end += Math.min(4000, Math.max(20, this._end >> 1));
                this._stack = (Iterator[]) Arrays.copyOf(this._stack, this._end);
            }
            Iterator<?>[] itArr2 = this._stack;
            int i2 = this._top;
            this._top = i2 + 1;
            itArr2[i2] = it;
        }

        public Iterator<?> popOrNull() {
            if (this._top == 0) {
                return null;
            }
            Iterator<?>[] itArr = this._stack;
            int i = this._top - 1;
            this._top = i;
            return itArr[i];
        }
    }

    public static class WrapperForSerializer extends JsonSerializable.Base {
        protected final BaseJsonNode _root;
        protected SerializerProvider _context;

        public WrapperForSerializer(BaseJsonNode baseJsonNode) {
            this._root = baseJsonNode;
        }

        @Override
        public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            this._context = serializerProvider;
            _serializeNonRecursive(jsonGenerator, this._root);
        }

        @Override
        public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
            serialize(jsonGenerator, serializerProvider);
        }

        protected void _serializeNonRecursive(JsonGenerator jsonGenerator, JsonNode jsonNode) throws IOException {
            if (jsonNode instanceof ObjectNode) {
                jsonGenerator.writeStartObject(this, jsonNode.size());
                _serializeNonRecursive(jsonGenerator, new IteratorStack(), jsonNode.fields());
            } else if (!(jsonNode instanceof ArrayNode)) {
                jsonNode.serialize(jsonGenerator, this._context);
            } else {
                jsonGenerator.writeStartArray(this, jsonNode.size());
                _serializeNonRecursive(jsonGenerator, new IteratorStack(), jsonNode.elements());
            }
        }

        protected void _serializeNonRecursive(JsonGenerator jsonGenerator, IteratorStack iteratorStack, Iterator<?> it) throws IOException {
            JsonNode jsonNode;
            Iterator<?> it2 = it;
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) next;
                        jsonGenerator.writeFieldName((String) entry.getKey());
                        jsonNode = (JsonNode) entry.getValue();
                    } else {
                        jsonNode = (JsonNode) next;
                    }
                    if (jsonNode instanceof ObjectNode) {
                        iteratorStack.push(it2);
                        it2 = jsonNode.fields();
                        jsonGenerator.writeStartObject(jsonNode, jsonNode.size());
                    } else if (jsonNode instanceof ArrayNode) {
                        iteratorStack.push(it2);
                        it2 = jsonNode.elements();
                        jsonGenerator.writeStartArray(jsonNode, jsonNode.size());
                    } else if (jsonNode instanceof POJONode) {
                        try {
                            jsonNode.serialize(jsonGenerator, this._context);
                        } catch (IOException | RuntimeException e) {
                            jsonGenerator.writeString(String.format("[ERROR: (%s) %s]", e.getClass().getName(), e.getMessage()));
                        }
                    } else {
                        jsonNode.serialize(jsonGenerator, this._context);
                    }
                } else {
                    if (jsonGenerator.getOutputContext().inArray()) {
                        jsonGenerator.writeEndArray();
                    } else {
                        jsonGenerator.writeEndObject();
                    }
                    it2 = iteratorStack.popOrNull();
                    if (it2 == null) {
                        return;
                    }
                }
            }
        }
    }

    InternalNodeMapper() {
    }

    public static String nodeToString(BaseJsonNode baseJsonNode) {
        try {
            return STD_WRITER.writeValueAsString(_wrapper(baseJsonNode));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String nodeToPrettyString(BaseJsonNode baseJsonNode) {
        try {
            return PRETTY_WRITER.writeValueAsString(_wrapper(baseJsonNode));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] valueToBytes(Object obj) throws IOException {
        return JSON_MAPPER.writeValueAsBytes(obj);
    }

    public static JsonNode bytesToNode(byte[] bArr) throws IOException {
        return (JsonNode) NODE_READER.readValue(bArr);
    }

    private static JsonSerializable _wrapper(BaseJsonNode baseJsonNode) {
        return new WrapperForSerializer(baseJsonNode);
    }
}
