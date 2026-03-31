package com.kammoun.utils.jackson.databind.deser.std;

import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.StreamReadCapability;
import com.kammoun.utils.jackson.databind.BeanProperty;
import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.DeserializationFeature;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.annotation.JacksonStdImpl;
import com.kammoun.utils.jackson.databind.deser.ContextualDeserializer;
import com.kammoun.utils.jackson.databind.deser.ResolvableDeserializer;
import com.kammoun.utils.jackson.databind.jsontype.TypeDeserializer;
import com.kammoun.utils.jackson.databind.type.LogicalType;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import com.kammoun.utils.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JacksonStdImpl
public class UntypedObjectDeserializer extends StdDeserializer<Object> implements ResolvableDeserializer, ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected static final Object[] NO_OBJECTS = new Object[0];
    protected JsonDeserializer<Object> _mapDeserializer;
    protected JsonDeserializer<Object> _listDeserializer;
    protected JsonDeserializer<Object> _stringDeserializer;
    protected JsonDeserializer<Object> _numberDeserializer;
    protected JavaType _listType;
    protected JavaType _mapType;
    protected final boolean _nonMerging;

    @JacksonStdImpl
    @Deprecated
    public static class Vanilla extends StdDeserializer<Object> {
        private static final long serialVersionUID = 1;
        public static final Vanilla std = new Vanilla();
        protected final boolean _nonMerging;

        public Vanilla() {
            this(false);
        }

        protected Vanilla(boolean z) {
            super((Class<?>) Object.class);
            this._nonMerging = z;
        }

        public static Vanilla instance(boolean z) {
            return z ? new Vanilla(true) : std;
        }

        @Override
        public LogicalType logicalType() {
            return LogicalType.Untyped;
        }

        @Override
        public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
            if (this._nonMerging) {
                return Boolean.FALSE;
            }
            return null;
        }

        @Override
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            switch (jsonParser.currentTokenId()) {
                case 1:
                    if (jsonParser.nextToken() == JsonToken.END_OBJECT) {
                        return new LinkedHashMap(2);
                    }
                    break;
                case 2:
                    return new LinkedHashMap(2);
                case 3:
                    return jsonParser.nextToken() == JsonToken.END_ARRAY ? deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? UntypedObjectDeserializer.NO_OBJECTS : new ArrayList(2) : deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? mapArrayToArray(jsonParser, deserializationContext) : mapArray(jsonParser, deserializationContext);
                case 4:
                default:
                    return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
                case 5:
                    break;
                case 6:
                    return jsonParser.getText();
                case 7:
                    return deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.getNumberValue();
                case 8:
                    return _deserializeFP(jsonParser, deserializationContext);
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.getEmbeddedObject();
            }
            return mapObject(jsonParser, deserializationContext);
        }

        @Override
        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            switch (jsonParser.currentTokenId()) {
                case 1:
                case 3:
                case 5:
                    return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
                case 2:
                case 4:
                default:
                    return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
                case 6:
                    return jsonParser.getText();
                case 7:
                    return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS) ? jsonParser.getBigIntegerValue() : jsonParser.getNumberValue();
                case 8:
                    return _deserializeFP(jsonParser, deserializationContext);
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.getEmbeddedObject();
            }
        }

        @Override
        public java.lang.Object deserialize(com.kammoun.utils.jackson.core.JsonParser r6, com.kammoun.utils.jackson.databind.DeserializationContext r7, java.lang.Object r8) throws java.io.IOException {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.deserialize(com.kammoun.utils.jackson.core.JsonParser, com.kammoun.utils.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
        }

        protected Object _deserializeFP(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonParser.NumberTypeFP numberTypeFP = jsonParser.getNumberTypeFP();
            return numberTypeFP == JsonParser.NumberTypeFP.BIG_DECIMAL ? jsonParser.getDecimalValue() : (jsonParser.isNaN() || !deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) ? numberTypeFP == JsonParser.NumberTypeFP.FLOAT32 ? Float.valueOf(jsonParser.getFloatValue()) : Double.valueOf(jsonParser.getDoubleValue()) : jsonParser.getDecimalValue();
        }

        protected Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Object deserialize = deserialize(jsonParser, deserializationContext);
            if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(deserialize);
                return arrayList;
            }
            ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
            int i = 0 + 1;
            resetAndStart[0] = deserialize;
            int i2 = i;
            do {
                Object deserialize2 = deserialize(jsonParser, deserializationContext);
                i2++;
                if (i >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    i = 0;
                }
                int i3 = i;
                i++;
                resetAndStart[i3] = deserialize2;
            } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
            ArrayList arrayList2 = new ArrayList(i2);
            leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i, arrayList2);
            deserializationContext.returnObjectBuffer(leaseObjectBuffer);
            return arrayList2;
        }

        protected Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
            int i = 0;
            do {
                Object deserialize = deserialize(jsonParser, deserializationContext);
                if (i >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    i = 0;
                }
                int i2 = i;
                i++;
                resetAndStart[i2] = deserialize;
            } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
            Object[] completeAndClearBuffer = leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i);
            deserializationContext.returnObjectBuffer(leaseObjectBuffer);
            return completeAndClearBuffer;
        }

        protected Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String nextFieldName;
            String currentName = jsonParser.currentName();
            jsonParser.nextToken();
            Object deserialize = deserialize(jsonParser, deserializationContext);
            String nextFieldName2 = jsonParser.nextFieldName();
            if (nextFieldName2 == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(currentName, deserialize);
                return linkedHashMap;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put(currentName, deserialize);
            do {
                jsonParser.nextToken();
                Object deserialize2 = deserialize(jsonParser, deserializationContext);
                Object put = linkedHashMap2.put(nextFieldName2, deserialize2);
                if (put != null) {
                    return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap2, nextFieldName2, put, deserialize2, jsonParser.nextFieldName());
                }
                nextFieldName = jsonParser.nextFieldName();
                nextFieldName2 = nextFieldName;
            } while (nextFieldName != null);
            return linkedHashMap2;
        }

        protected Object _mapObjectWithDups(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
            boolean isEnabled = deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES);
            if (isEnabled) {
                _squashDups(map, str, obj, obj2);
            }
            while (str2 != null) {
                jsonParser.nextToken();
                Object deserialize = deserialize(jsonParser, deserializationContext);
                Object put = map.put(str2, deserialize);
                if (put != null && isEnabled) {
                    _squashDups(map, str2, put, deserialize);
                }
                str2 = jsonParser.nextFieldName();
            }
            return map;
        }

        private void _squashDups(Map<String, Object> map, String str, Object obj, Object obj2) {
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                map.put(str, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                arrayList.add(obj2);
                map.put(str, arrayList);
            }
        }
    }

    @Deprecated
    public UntypedObjectDeserializer() {
        this((JavaType) null, (JavaType) null);
    }

    public UntypedObjectDeserializer(JavaType javaType, JavaType javaType2) {
        super((Class<?>) Object.class);
        this._listType = javaType;
        this._mapType = javaType2;
        this._nonMerging = false;
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, JsonDeserializer<?> jsonDeserializer3, JsonDeserializer<?> jsonDeserializer4) {
        super((Class<?>) Object.class);
        this._mapDeserializer = jsonDeserializer;
        this._listDeserializer = jsonDeserializer2;
        this._stringDeserializer = jsonDeserializer3;
        this._numberDeserializer = jsonDeserializer4;
        this._listType = untypedObjectDeserializer._listType;
        this._mapType = untypedObjectDeserializer._mapType;
        this._nonMerging = untypedObjectDeserializer._nonMerging;
    }

    protected UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, boolean z) {
        super((Class<?>) Object.class);
        this._mapDeserializer = untypedObjectDeserializer._mapDeserializer;
        this._listDeserializer = untypedObjectDeserializer._listDeserializer;
        this._stringDeserializer = untypedObjectDeserializer._stringDeserializer;
        this._numberDeserializer = untypedObjectDeserializer._numberDeserializer;
        this._listType = untypedObjectDeserializer._listType;
        this._mapType = untypedObjectDeserializer._mapType;
        this._nonMerging = z;
    }

    @Override
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        JavaType constructType = deserializationContext.constructType(Object.class);
        JavaType constructType2 = deserializationContext.constructType(String.class);
        TypeFactory typeFactory = deserializationContext.getTypeFactory();
        if (this._listType == null) {
            this._listDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructCollectionType(List.class, constructType)));
        } else {
            this._listDeserializer = _findCustomDeser(deserializationContext, this._listType);
        }
        if (this._mapType == null) {
            this._mapDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructMapType(Map.class, constructType2, constructType)));
        } else {
            this._mapDeserializer = _findCustomDeser(deserializationContext, this._mapType);
        }
        this._stringDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, constructType2));
        this._numberDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructType(Number.class)));
        JavaType unknownType = TypeFactory.unknownType();
        this._mapDeserializer = deserializationContext.handleSecondaryContextualization(this._mapDeserializer, null, unknownType);
        this._listDeserializer = deserializationContext.handleSecondaryContextualization(this._listDeserializer, null, unknownType);
        this._stringDeserializer = deserializationContext.handleSecondaryContextualization(this._stringDeserializer, null, unknownType);
        this._numberDeserializer = deserializationContext.handleSecondaryContextualization(this._numberDeserializer, null, unknownType);
    }

    protected JsonDeserializer<Object> _findCustomDeser(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        return deserializationContext.findNonContextualValueDeserializer(javaType);
    }

    protected JsonDeserializer<Object> _clearIfStdImpl(JsonDeserializer<Object> jsonDeserializer) {
        if (ClassUtil.isJacksonStdImpl(jsonDeserializer)) {
            return null;
        }
        return jsonDeserializer;
    }

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        boolean z = beanProperty == null && Boolean.FALSE.equals(deserializationContext.getConfig().getDefaultMergeable(Object.class));
        return (this._stringDeserializer == null && this._numberDeserializer == null && this._mapDeserializer == null && this._listDeserializer == null && getClass() == UntypedObjectDeserializer.class) ? UntypedObjectDeserializerNR.instance(z) : z != this._nonMerging ? new UntypedObjectDeserializer(this, z) : this;
    }

    @Override
    public boolean isCachable() {
        return true;
    }

    @Override
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    @Override
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.currentTokenId()) {
            case 1:
            case 2:
            case 5:
                return this._mapDeserializer != null ? this._mapDeserializer.deserialize(jsonParser, deserializationContext) : mapObject(jsonParser, deserializationContext);
            case 3:
                return deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? mapArrayToArray(jsonParser, deserializationContext) : this._listDeserializer != null ? this._listDeserializer.deserialize(jsonParser, deserializationContext) : mapArray(jsonParser, deserializationContext);
            case 4:
            default:
                return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
            case 6:
                return this._stringDeserializer != null ? this._stringDeserializer.deserialize(jsonParser, deserializationContext) : jsonParser.getText();
            case 7:
                return this._numberDeserializer != null ? this._numberDeserializer.deserialize(jsonParser, deserializationContext) : deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.getNumberValue();
            case 8:
                return this._numberDeserializer != null ? this._numberDeserializer.deserialize(jsonParser, deserializationContext) : _deserializeFP(jsonParser, deserializationContext);
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
        }
    }

    @Override
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        switch (jsonParser.currentTokenId()) {
            case 1:
            case 3:
            case 5:
                return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
            case 2:
            case 4:
            default:
                return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
            case 6:
                return this._stringDeserializer != null ? this._stringDeserializer.deserialize(jsonParser, deserializationContext) : jsonParser.getText();
            case 7:
                return this._numberDeserializer != null ? this._numberDeserializer.deserialize(jsonParser, deserializationContext) : deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.getNumberValue();
            case 8:
                return this._numberDeserializer != null ? this._numberDeserializer.deserialize(jsonParser, deserializationContext) : _deserializeFP(jsonParser, deserializationContext);
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
        }
    }

    @Override
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this._nonMerging) {
            return deserialize(jsonParser, deserializationContext);
        }
        switch (jsonParser.currentTokenId()) {
            case 1:
            case 2:
            case 5:
                return this._mapDeserializer != null ? this._mapDeserializer.deserialize(jsonParser, deserializationContext, obj) : obj instanceof Map ? mapObject(jsonParser, deserializationContext, (Map) obj) : mapObject(jsonParser, deserializationContext);
            case 3:
                return this._listDeserializer != null ? this._listDeserializer.deserialize(jsonParser, deserializationContext, obj) : obj instanceof Collection ? mapArray(jsonParser, deserializationContext, (Collection) obj) : deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? mapArrayToArray(jsonParser, deserializationContext) : mapArray(jsonParser, deserializationContext);
            case 4:
            default:
                return deserialize(jsonParser, deserializationContext);
            case 6:
                return this._stringDeserializer != null ? this._stringDeserializer.deserialize(jsonParser, deserializationContext, obj) : jsonParser.getText();
            case 7:
                return this._numberDeserializer != null ? this._numberDeserializer.deserialize(jsonParser, deserializationContext, obj) : deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.getNumberValue();
            case 8:
                return this._numberDeserializer != null ? this._numberDeserializer.deserialize(jsonParser, deserializationContext, obj) : _deserializeFP(jsonParser, deserializationContext);
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
        }
    }

    protected Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
            return new ArrayList(2);
        }
        Object deserialize = deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(deserialize);
            return arrayList;
        }
        Object deserialize2 = deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(deserialize);
            arrayList2.add(deserialize2);
            return arrayList2;
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        int i = 0 + 1;
        resetAndStart[0] = deserialize;
        int i2 = i + 1;
        resetAndStart[i] = deserialize2;
        int i3 = i2;
        do {
            Object deserialize3 = deserialize(jsonParser, deserializationContext);
            i3++;
            if (i2 >= resetAndStart.length) {
                resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                i2 = 0;
            }
            int i4 = i2;
            i2++;
            resetAndStart[i4] = deserialize3;
        } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
        ArrayList arrayList3 = new ArrayList(i3);
        leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i2, arrayList3);
        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
        return arrayList3;
    }

    protected Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            collection.add(deserialize(jsonParser, deserializationContext));
        }
        return collection;
    }

    protected Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        String nextFieldName;
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            str = jsonParser.nextFieldName();
        } else if (currentToken == JsonToken.FIELD_NAME) {
            str = jsonParser.currentName();
        } else {
            if (currentToken != JsonToken.END_OBJECT) {
                return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            }
            str = null;
        }
        if (str == null) {
            return new LinkedHashMap(2);
        }
        jsonParser.nextToken();
        Object deserialize = deserialize(jsonParser, deserializationContext);
        String nextFieldName2 = jsonParser.nextFieldName();
        if (nextFieldName2 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(str, deserialize);
            return linkedHashMap;
        }
        jsonParser.nextToken();
        Object deserialize2 = deserialize(jsonParser, deserializationContext);
        String nextFieldName3 = jsonParser.nextFieldName();
        if (nextFieldName3 == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(str, deserialize);
            return linkedHashMap2.put(nextFieldName2, deserialize2) != null ? _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap2, str, deserialize, deserialize2, nextFieldName3) : linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(str, deserialize);
        if (linkedHashMap3.put(nextFieldName2, deserialize2) != null) {
            return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, str, deserialize, deserialize2, nextFieldName3);
        }
        do {
            jsonParser.nextToken();
            Object deserialize3 = deserialize(jsonParser, deserializationContext);
            Object put = linkedHashMap3.put(nextFieldName3, deserialize3);
            if (put != null) {
                return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, nextFieldName3, put, deserialize3, jsonParser.nextFieldName());
            }
            nextFieldName = jsonParser.nextFieldName();
            nextFieldName3 = nextFieldName;
        } while (nextFieldName != null);
        return linkedHashMap3;
    }

    protected Object _mapObjectWithDups(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
        boolean isEnabled = deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES);
        if (isEnabled) {
            _squashDups(map, str, obj, obj2);
        }
        while (str2 != null) {
            jsonParser.nextToken();
            Object deserialize = deserialize(jsonParser, deserializationContext);
            Object put = map.put(str2, deserialize);
            if (put != null && isEnabled) {
                _squashDups(map, str, put, deserialize);
            }
            str2 = jsonParser.nextFieldName();
        }
        return map;
    }

    private void _squashDups(Map<String, Object> map, String str, Object obj, Object obj2) {
        if (obj instanceof List) {
            ((List) obj).add(obj2);
            map.put(str, obj);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            map.put(str, arrayList);
        }
    }

    protected Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
            return NO_OBJECTS;
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        int i = 0;
        do {
            Object deserialize = deserialize(jsonParser, deserializationContext);
            if (i >= resetAndStart.length) {
                resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                i = 0;
            }
            int i2 = i;
            i++;
            resetAndStart[i2] = deserialize;
        } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
        Object[] completeAndClearBuffer = leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i);
        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
        return completeAndClearBuffer;
    }

    protected Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String nextFieldName;
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        if (currentToken == JsonToken.END_OBJECT) {
            return map;
        }
        String currentName = jsonParser.currentName();
        do {
            jsonParser.nextToken();
            Object obj = map.get(currentName);
            Object deserialize = obj != null ? deserialize(jsonParser, deserializationContext, obj) : deserialize(jsonParser, deserializationContext);
            if (deserialize != obj) {
                map.put(currentName, deserialize);
            }
            nextFieldName = jsonParser.nextFieldName();
            currentName = nextFieldName;
        } while (nextFieldName != null);
        return map;
    }

    protected Object _deserializeFP(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonParser.NumberTypeFP numberTypeFP = jsonParser.getNumberTypeFP();
        return numberTypeFP == JsonParser.NumberTypeFP.BIG_DECIMAL ? jsonParser.getDecimalValue() : (jsonParser.isNaN() || !deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) ? numberTypeFP == JsonParser.NumberTypeFP.FLOAT32 ? Float.valueOf(jsonParser.getFloatValue()) : Double.valueOf(jsonParser.getDoubleValue()) : jsonParser.getDecimalValue();
    }
}
