package com.kammoun.utils.jackson.databind.deser.std;

import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.StreamReadCapability;
import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.DeserializationFeature;
import com.kammoun.utils.jackson.databind.annotation.JacksonStdImpl;
import com.kammoun.utils.jackson.databind.jsontype.TypeDeserializer;
import com.kammoun.utils.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JacksonStdImpl
public final class UntypedObjectDeserializerNR extends StdDeserializer<Object> {
    private static final long serialVersionUID = 1;
    protected static final Object[] NO_OBJECTS = new Object[0];
    public static final UntypedObjectDeserializerNR std = new UntypedObjectDeserializerNR();
    protected final boolean _nonMerging;

    public static final class Scope {
        private final Scope _parent;
        private Scope _child;
        private boolean _isObject;
        private boolean _squashDups;
        private String _deferredKey;
        private Map<String, Object> _map;
        private List<Object> _list;

        private Scope(Scope scope) {
            this._parent = scope;
            this._isObject = false;
            this._squashDups = false;
        }

        private Scope(Scope scope, boolean z, boolean z2) {
            this._parent = scope;
            this._isObject = z;
            this._squashDups = z2;
        }

        public static Scope rootObjectScope(boolean z) {
            return new Scope(null, true, z);
        }

        public static Scope rootArrayScope() {
            return new Scope(null);
        }

        private Scope resetAsArray() {
            this._isObject = false;
            return this;
        }

        private Scope resetAsObject(boolean z) {
            this._isObject = true;
            this._squashDups = z;
            return this;
        }

        public Scope childObject() {
            return this._child == null ? new Scope(this, true, this._squashDups) : this._child.resetAsObject(this._squashDups);
        }

        public Scope childObject(String str) {
            this._deferredKey = str;
            return this._child == null ? new Scope(this, true, this._squashDups) : this._child.resetAsObject(this._squashDups);
        }

        public Scope childArray() {
            return this._child == null ? new Scope(this) : this._child.resetAsArray();
        }

        public Scope childArray(String str) {
            this._deferredKey = str;
            return this._child == null ? new Scope(this) : this._child.resetAsArray();
        }

        public boolean isObject() {
            return this._isObject;
        }

        public void putValue(String str, Object obj) {
            if (this._squashDups) {
                _putValueHandleDups(str, obj);
                return;
            }
            if (this._map == null) {
                this._map = new LinkedHashMap();
            }
            this._map.put(str, obj);
        }

        public Scope putDeferredValue(Object obj) {
            String str = (String) Objects.requireNonNull(this._deferredKey);
            this._deferredKey = null;
            if (this._squashDups) {
                _putValueHandleDups(str, obj);
                return this;
            }
            if (this._map == null) {
                this._map = new LinkedHashMap();
            }
            this._map.put(str, obj);
            return this;
        }

        public void addValue(Object obj) {
            if (this._list == null) {
                this._list = new ArrayList();
            }
            this._list.add(obj);
        }

        public Object finishRootObject() {
            return this._map == null ? emptyMap() : this._map;
        }

        public Scope finishBranchObject() {
            Map<String, Object> map;
            if (this._map == null) {
                map = new LinkedHashMap();
            } else {
                map = this._map;
                this._map = null;
            }
            if (this._parent.isObject()) {
                return this._parent.putDeferredValue(map);
            }
            this._parent.addValue(map);
            return this._parent;
        }

        public Object finishRootArray(boolean z) {
            return this._list == null ? z ? UntypedObjectDeserializerNR.NO_OBJECTS : emptyList() : z ? this._list.toArray(UntypedObjectDeserializerNR.NO_OBJECTS) : this._list;
        }

        public Scope finishBranchArray(boolean z) {
            List<Object> array;
            if (this._list == null) {
                array = z ? UntypedObjectDeserializerNR.NO_OBJECTS : emptyList();
            } else {
                array = z ? this._list.toArray(UntypedObjectDeserializerNR.NO_OBJECTS) : this._list;
                this._list = null;
            }
            if (this._parent.isObject()) {
                return this._parent.putDeferredValue(array);
            }
            this._parent.addValue(array);
            return this._parent;
        }

        private void _putValueHandleDups(String str, Object obj) {
            if (this._map == null) {
                this._map = new LinkedHashMap();
                this._map.put(str, obj);
                return;
            }
            Object put = this._map.put(str, obj);
            if (put != null) {
                if (put instanceof List) {
                    ((List) put).add(obj);
                    this._map.put(str, put);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(put);
                    arrayList.add(obj);
                    this._map.put(str, arrayList);
                }
            }
        }

        public static Map<String, Object> emptyMap() {
            return new LinkedHashMap(2);
        }

        public static List<Object> emptyList() {
            return new ArrayList(2);
        }
    }

    public UntypedObjectDeserializerNR() {
        this(false);
    }

    protected UntypedObjectDeserializerNR(boolean z) {
        super((Class<?>) Object.class);
        this._nonMerging = z;
    }

    public static UntypedObjectDeserializerNR instance(boolean z) {
        return z ? new UntypedObjectDeserializerNR(true) : std;
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
                return _deserializeNR(jsonParser, deserializationContext, Scope.rootObjectScope(deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)));
            case 2:
                return Scope.emptyMap();
            case 3:
                return _deserializeNR(jsonParser, deserializationContext, Scope.rootArrayScope());
            case 4:
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            case 5:
                return _deserializeObjectAtName(jsonParser, deserializationContext);
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
                return _deserializeAnyScalar(jsonParser, deserializationContext, jsonParser.currentTokenId());
        }
    }

    @Override
    public java.lang.Object deserialize(com.kammoun.utils.jackson.core.JsonParser r6, com.kammoun.utils.jackson.databind.DeserializationContext r7, java.lang.Object r8) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.databind.deser.std.UntypedObjectDeserializerNR.deserialize(com.kammoun.utils.jackson.core.JsonParser, com.kammoun.utils.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }

    private Object _deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object _deserializeAnyScalar;
        Scope rootObjectScope = Scope.rootObjectScope(deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES));
        String currentName = jsonParser.currentName();
        while (true) {
            String str = currentName;
            if (str == null) {
                return rootObjectScope.finishRootObject();
            }
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            switch (nextToken.id()) {
                case 1:
                    _deserializeAnyScalar = _deserializeNR(jsonParser, deserializationContext, rootObjectScope.childObject());
                    break;
                case 2:
                    return rootObjectScope.finishRootObject();
                case 3:
                    _deserializeAnyScalar = _deserializeNR(jsonParser, deserializationContext, rootObjectScope.childArray());
                    break;
                default:
                    _deserializeAnyScalar = _deserializeAnyScalar(jsonParser, deserializationContext, nextToken.id());
                    break;
            }
            rootObjectScope.putValue(str, _deserializeAnyScalar);
            currentName = jsonParser.nextFieldName();
        }
    }

    private Object _deserializeNR(JsonParser jsonParser, DeserializationContext deserializationContext, Scope scope) throws IOException {
        Object embeddedObject;
        Object embeddedObject2;
        boolean hasSomeOfFeatures = deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS);
        boolean isEnabled = deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        Scope scope2 = scope;
        while (true) {
            Scope scope3 = scope2;
            if (scope3.isObject()) {
                String nextFieldName = jsonParser.nextFieldName();
                while (true) {
                    String str = nextFieldName;
                    if (str != null) {
                        JsonToken nextToken = jsonParser.nextToken();
                        if (nextToken == null) {
                            nextToken = JsonToken.NOT_AVAILABLE;
                        }
                        switch (nextToken.id()) {
                            case 1:
                                scope3 = scope3.childObject(str);
                                nextFieldName = jsonParser.nextFieldName();
                            case 2:
                            case 4:
                            case 5:
                            default:
                                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                            case 3:
                                scope2 = scope3.childArray(str);
                                break;
                            case 6:
                                embeddedObject = jsonParser.getText();
                                scope3.putValue(str, embeddedObject);
                                nextFieldName = jsonParser.nextFieldName();
                            case 7:
                                embeddedObject = hasSomeOfFeatures ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.getNumberValue();
                                scope3.putValue(str, embeddedObject);
                                nextFieldName = jsonParser.nextFieldName();
                            case 8:
                                embeddedObject = _deserializeFP(jsonParser, deserializationContext);
                                scope3.putValue(str, embeddedObject);
                                nextFieldName = jsonParser.nextFieldName();
                            case 9:
                                embeddedObject = Boolean.TRUE;
                                scope3.putValue(str, embeddedObject);
                                nextFieldName = jsonParser.nextFieldName();
                            case 10:
                                embeddedObject = Boolean.FALSE;
                                scope3.putValue(str, embeddedObject);
                                nextFieldName = jsonParser.nextFieldName();
                            case 11:
                                embeddedObject = null;
                                scope3.putValue(str, embeddedObject);
                                nextFieldName = jsonParser.nextFieldName();
                            case 12:
                                embeddedObject = jsonParser.getEmbeddedObject();
                                scope3.putValue(str, embeddedObject);
                                nextFieldName = jsonParser.nextFieldName();
                        }
                    } else {
                        if (scope3 == scope) {
                            return scope3.finishRootObject();
                        }
                        scope2 = scope3.finishBranchObject();
                    }
                }
            } else {
                while (true) {
                    JsonToken nextToken2 = jsonParser.nextToken();
                    if (nextToken2 == null) {
                        nextToken2 = JsonToken.NOT_AVAILABLE;
                    }
                    switch (nextToken2.id()) {
                        case 1:
                            scope2 = scope3.childObject();
                            break;
                        case 2:
                        case 5:
                        default:
                            return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                        case 3:
                            scope2 = scope3.childArray();
                            break;
                        case 4:
                            if (scope3 != scope) {
                                scope2 = scope3.finishBranchArray(isEnabled);
                                break;
                            } else {
                                return scope3.finishRootArray(isEnabled);
                            }
                        case 6:
                            embeddedObject2 = jsonParser.getText();
                            scope3.addValue(embeddedObject2);
                        case 7:
                            embeddedObject2 = hasSomeOfFeatures ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.getNumberValue();
                            scope3.addValue(embeddedObject2);
                        case 8:
                            embeddedObject2 = _deserializeFP(jsonParser, deserializationContext);
                            scope3.addValue(embeddedObject2);
                        case 9:
                            embeddedObject2 = Boolean.TRUE;
                            scope3.addValue(embeddedObject2);
                        case 10:
                            embeddedObject2 = Boolean.FALSE;
                            scope3.addValue(embeddedObject2);
                        case 11:
                            embeddedObject2 = null;
                            scope3.addValue(embeddedObject2);
                        case 12:
                            embeddedObject2 = jsonParser.getEmbeddedObject();
                            scope3.addValue(embeddedObject2);
                    }
                }
            }
        }
    }

    private Object _deserializeAnyScalar(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
        switch (i) {
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
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
    }

    protected Object _deserializeFP(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonParser.NumberTypeFP numberTypeFP = jsonParser.getNumberTypeFP();
        return numberTypeFP == JsonParser.NumberTypeFP.BIG_DECIMAL ? jsonParser.getDecimalValue() : (jsonParser.isNaN() || !deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) ? numberTypeFP == JsonParser.NumberTypeFP.FLOAT32 ? Float.valueOf(jsonParser.getFloatValue()) : Double.valueOf(jsonParser.getDoubleValue()) : jsonParser.getDecimalValue();
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
