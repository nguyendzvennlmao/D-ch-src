package com.kammoun.utils.jackson.databind.ser.std;

import com.kammoun.utils.jackson.annotation.JsonInclude;
import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.databind.AnnotationIntrospector;
import com.kammoun.utils.jackson.databind.BeanProperty;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.JsonSerializer;
import com.kammoun.utils.jackson.databind.MapperFeature;
import com.kammoun.utils.jackson.databind.RuntimeJsonMappingException;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import com.kammoun.utils.jackson.databind.annotation.JsonSerialize;
import com.kammoun.utils.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.kammoun.utils.jackson.databind.jsontype.TypeSerializer;
import com.kammoun.utils.jackson.databind.ser.ContextualSerializer;
import com.kammoun.utils.jackson.databind.ser.impl.PropertySerializerMap;
import com.kammoun.utils.jackson.databind.type.ReferenceType;
import com.kammoun.utils.jackson.databind.util.ArrayBuilders;
import com.kammoun.utils.jackson.databind.util.BeanUtil;
import com.kammoun.utils.jackson.databind.util.NameTransformer;
import java.io.IOException;

public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements ContextualSerializer {
    private static final long serialVersionUID = 1;
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    protected final JavaType _referredType;
    protected final BeanProperty _property;
    protected final TypeSerializer _valueTypeSerializer;
    protected final JsonSerializer<Object> _valueSerializer;
    protected final NameTransformer _unwrapper;
    protected transient PropertySerializerMap _dynamicSerializers;
    protected final Object _suppressableValue;
    protected final boolean _suppressNulls;

    public ReferenceTypeSerializer(ReferenceType referenceType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super(referenceType);
        this._referredType = referenceType.getReferencedType();
        this._property = null;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = null;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
    }

    public ReferenceTypeSerializer(ReferenceTypeSerializer<?> referenceTypeSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer, Object obj, boolean z) {
        super(referenceTypeSerializer);
        this._referredType = referenceTypeSerializer._referredType;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
        this._property = beanProperty;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = nameTransformer;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }

    @Override
    public JsonSerializer<T> unwrappingSerializer(NameTransformer nameTransformer) {
        JsonSerializer<?> jsonSerializer = this._valueSerializer;
        if (jsonSerializer != null) {
            jsonSerializer = jsonSerializer.unwrappingSerializer(nameTransformer);
            if (jsonSerializer == this._valueSerializer) {
                return this;
            }
        }
        NameTransformer chainedTransformer = this._unwrapper == null ? nameTransformer : NameTransformer.chainedTransformer(nameTransformer, this._unwrapper);
        return (this._valueSerializer == jsonSerializer && this._unwrapper == chainedTransformer) ? this : withResolved(this._property, this._valueTypeSerializer, jsonSerializer, chainedTransformer);
    }

    protected abstract ReferenceTypeSerializer<T> withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer);

    public abstract ReferenceTypeSerializer<T> withContentInclusion(Object obj, boolean z);

    protected abstract boolean _isValuePresent(T t);

    protected abstract Object _getReferenced(T t);

    protected abstract Object _getReferencedIfPresent(T t);

    @Override
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonInclude.Value findPropertyInclusion;
        JsonInclude.Include contentInclusion;
        Object obj;
        boolean z;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            typeSerializer = typeSerializer.forProperty(beanProperty);
        }
        JsonSerializer<?> findAnnotatedContentSerializer = findAnnotatedContentSerializer(serializerProvider, beanProperty);
        if (findAnnotatedContentSerializer == null) {
            findAnnotatedContentSerializer = this._valueSerializer;
            if (findAnnotatedContentSerializer != null) {
                findAnnotatedContentSerializer = serializerProvider.handlePrimaryContextualization(findAnnotatedContentSerializer, beanProperty);
            } else if (_useStatic(serializerProvider, beanProperty, this._referredType)) {
                findAnnotatedContentSerializer = _findSerializer(serializerProvider, this._referredType, beanProperty);
            }
        }
        JsonSerializer<?> findContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, findAnnotatedContentSerializer);
        ReferenceTypeSerializer<T> withResolved = (this._property == beanProperty && this._valueTypeSerializer == typeSerializer && this._valueSerializer == findContextualConvertingSerializer) ? this : withResolved(beanProperty, typeSerializer, findContextualConvertingSerializer, this._unwrapper);
        if (beanProperty != null && (findPropertyInclusion = beanProperty.findPropertyInclusion(serializerProvider.getConfig(), handledType())) != null && (contentInclusion = findPropertyInclusion.getContentInclusion()) != JsonInclude.Include.USE_DEFAULTS) {
            switch (contentInclusion) {
                case NON_DEFAULT:
                    obj = BeanUtil.getDefaultValue(this._referredType);
                    z = true;
                    if (obj != null && obj.getClass().isArray()) {
                        obj = ArrayBuilders.getArrayComparator(obj);
                        break;
                    }
                    break;
                case NON_ABSENT:
                    z = true;
                    obj = this._referredType.isReferenceType() ? MARKER_FOR_EMPTY : null;
                    break;
                case NON_EMPTY:
                    z = true;
                    obj = MARKER_FOR_EMPTY;
                    break;
                case CUSTOM:
                    obj = serializerProvider.includeFilterInstance(null, findPropertyInclusion.getContentFilter());
                    if (obj != null) {
                        z = serializerProvider.includeFilterSuppressNulls(obj);
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case NON_NULL:
                    obj = null;
                    z = true;
                    break;
                case ALWAYS:
                default:
                    obj = null;
                    z = false;
                    break;
            }
            if (this._suppressableValue != obj || this._suppressNulls != z) {
                withResolved = withResolved.withContentInclusion(obj, z);
            }
        }
        return withResolved;
    }

    protected boolean _useStatic(SerializerProvider serializerProvider, BeanProperty beanProperty, JavaType javaType) {
        if (javaType.isJavaLangObject()) {
            return false;
        }
        if (javaType.isFinal() || javaType.useStaticType()) {
            return true;
        }
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (annotationIntrospector != null && beanProperty != null && beanProperty.getMember() != null) {
            JsonSerialize.Typing findSerializationTyping = annotationIntrospector.findSerializationTyping(beanProperty.getMember());
            if (findSerializationTyping == JsonSerialize.Typing.STATIC) {
                return true;
            }
            if (findSerializationTyping == JsonSerialize.Typing.DYNAMIC) {
                return false;
            }
        }
        return serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING);
    }

    @Override
    public boolean isEmpty(SerializerProvider serializerProvider, T t) {
        if (!_isValuePresent(t)) {
            return true;
        }
        Object _getReferenced = _getReferenced(t);
        if (_getReferenced == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            try {
                jsonSerializer = _findCachedSerializer(serializerProvider, _getReferenced.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        return this._suppressableValue == MARKER_FOR_EMPTY ? jsonSerializer.isEmpty(serializerProvider, _getReferenced) : this._suppressableValue.equals(_getReferenced);
    }

    @Override
    public boolean isUnwrappingSerializer() {
        return this._unwrapper != null;
    }

    public JavaType getReferredType() {
        return this._referredType;
    }

    @Override
    public void serialize(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object _getReferencedIfPresent = _getReferencedIfPresent(t);
        if (_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            return;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            jsonSerializer = _findCachedSerializer(serializerProvider, _getReferencedIfPresent.getClass());
        }
        if (this._valueTypeSerializer != null) {
            jsonSerializer.serializeWithType(_getReferencedIfPresent, jsonGenerator, serializerProvider, this._valueTypeSerializer);
        } else {
            jsonSerializer.serialize(_getReferencedIfPresent, jsonGenerator, serializerProvider);
        }
    }

    @Override
    public void serializeWithType(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        Object _getReferencedIfPresent = _getReferencedIfPresent(t);
        if (_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
            }
        } else {
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = _findCachedSerializer(serializerProvider, _getReferencedIfPresent.getClass());
            }
            jsonSerializer.serializeWithType(_getReferencedIfPresent, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    @Override
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            jsonSerializer = _findSerializer(jsonFormatVisitorWrapper.getProvider(), this._referredType, this._property);
            if (this._unwrapper != null) {
                jsonSerializer = jsonSerializer.unwrappingSerializer(this._unwrapper);
            }
        }
        jsonSerializer.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, this._referredType);
    }

    private final JsonSerializer<Object> _findCachedSerializer(SerializerProvider serializerProvider, Class<?> cls) throws JsonMappingException {
        JsonSerializer<Object> serializerFor = this._dynamicSerializers.serializerFor(cls);
        if (serializerFor == null) {
            serializerFor = this._referredType.hasGenericTypes() ? serializerProvider.findPrimaryPropertySerializer(serializerProvider.constructSpecializedType(this._referredType, cls), this._property) : serializerProvider.findPrimaryPropertySerializer(cls, this._property);
            if (this._unwrapper != null) {
                serializerFor = serializerFor.unwrappingSerializer(this._unwrapper);
            }
            this._dynamicSerializers = this._dynamicSerializers.newWith(cls, serializerFor);
        }
        return serializerFor;
    }

    private final JsonSerializer<Object> _findSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return serializerProvider.findPrimaryPropertySerializer(javaType, beanProperty);
    }
}
