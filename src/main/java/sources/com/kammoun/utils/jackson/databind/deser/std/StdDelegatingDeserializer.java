package com.kammoun.utils.jackson.databind.deser.std;

import com.kammoun.utils.jackson.core.JacksonException;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.databind.BeanProperty;
import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.deser.ContextualDeserializer;
import com.kammoun.utils.jackson.databind.deser.ResolvableDeserializer;
import com.kammoun.utils.jackson.databind.jsontype.TypeDeserializer;
import com.kammoun.utils.jackson.databind.type.LogicalType;
import com.kammoun.utils.jackson.databind.util.AccessPattern;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import com.kammoun.utils.jackson.databind.util.Converter;
import com.kammoun.utils.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Collection;

public class StdDelegatingDeserializer<T> extends StdDeserializer<T> implements ContextualDeserializer, ResolvableDeserializer {
    private static final long serialVersionUID = 1;
    protected final Converter<Object, T> _converter;
    protected final JavaType _delegateType;
    protected final JsonDeserializer<Object> _delegateDeserializer;

    public StdDelegatingDeserializer(Converter<?, T> converter) {
        super((Class<?>) Object.class);
        this._converter = converter;
        this._delegateType = null;
        this._delegateDeserializer = null;
    }

    public StdDelegatingDeserializer(Converter<Object, T> converter, JavaType javaType, JsonDeserializer<?> jsonDeserializer) {
        super(javaType);
        this._converter = converter;
        this._delegateType = javaType;
        this._delegateDeserializer = jsonDeserializer;
    }

    protected StdDelegatingDeserializer(StdDelegatingDeserializer<T> stdDelegatingDeserializer) {
        super(stdDelegatingDeserializer);
        this._converter = stdDelegatingDeserializer._converter;
        this._delegateType = stdDelegatingDeserializer._delegateType;
        this._delegateDeserializer = stdDelegatingDeserializer._delegateDeserializer;
    }

    protected StdDelegatingDeserializer<T> withDelegate(Converter<Object, T> converter, JavaType javaType, JsonDeserializer<?> jsonDeserializer) {
        ClassUtil.verifyMustOverride(StdDelegatingDeserializer.class, this, "withDelegate");
        return new StdDelegatingDeserializer<>(converter, javaType, jsonDeserializer);
    }

    @Override
    public JsonDeserializer<T> unwrappingDeserializer(NameTransformer nameTransformer) {
        ClassUtil.verifyMustOverride(StdDelegatingDeserializer.class, this, "unwrappingDeserializer");
        return replaceDelegatee(this._delegateDeserializer.unwrappingDeserializer(nameTransformer));
    }

    @Override
    public JsonDeserializer<T> replaceDelegatee(JsonDeserializer<?> jsonDeserializer) {
        ClassUtil.verifyMustOverride(StdDelegatingDeserializer.class, this, "replaceDelegatee");
        return jsonDeserializer == this._delegateDeserializer ? this : new StdDelegatingDeserializer(this._converter, this._delegateType, jsonDeserializer);
    }

    @Override
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        if (this._delegateDeserializer == null || !(this._delegateDeserializer instanceof ResolvableDeserializer)) {
            return;
        }
        ((ResolvableDeserializer) this._delegateDeserializer).resolve(deserializationContext);
    }

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        if (this._delegateDeserializer != null) {
            JsonDeserializer<?> handleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(this._delegateDeserializer, beanProperty, this._delegateType);
            return handleSecondaryContextualization != this._delegateDeserializer ? withDelegate(this._converter, this._delegateType, handleSecondaryContextualization) : this;
        }
        JavaType inputType = this._converter.getInputType(deserializationContext.getTypeFactory());
        return withDelegate(this._converter, inputType, deserializationContext.findContextualValueDeserializer(inputType, beanProperty));
    }

    @Override
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object deserialize = this._delegateDeserializer.deserialize(jsonParser, deserializationContext);
        if (deserialize == null) {
            return null;
        }
        return convertValue(deserialize);
    }

    @Override
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        Object deserialize = this._delegateDeserializer.deserialize(jsonParser, deserializationContext);
        if (deserialize == null) {
            return null;
        }
        return convertValue(deserialize);
    }

    @Override
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return this._delegateType.getRawClass().isAssignableFrom(obj.getClass()) ? (T) this._delegateDeserializer.deserialize(jsonParser, deserializationContext, obj) : (T) _handleIncompatibleUpdateValue(jsonParser, deserializationContext, obj);
    }

    @Override
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer, T t) throws IOException, JacksonException {
        return !this._delegateType.getRawClass().isAssignableFrom(t.getClass()) ? _handleIncompatibleUpdateValue(jsonParser, deserializationContext, t) : this._delegateDeserializer.deserialize(jsonParser, deserializationContext, t);
    }

    protected Object _handleIncompatibleUpdateValue(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        throw new UnsupportedOperationException(String.format("Cannot update object of type %s (using deserializer for type %s)" + obj.getClass().getName(), this._delegateType));
    }

    @Override
    public Class<?> handledType() {
        return this._delegateDeserializer.handledType();
    }

    @Override
    public LogicalType logicalType() {
        return this._delegateDeserializer.logicalType();
    }

    @Override
    public boolean isCachable() {
        return this._delegateDeserializer != null && this._delegateDeserializer.isCachable();
    }

    @Override
    public JsonDeserializer<?> getDelegatee() {
        return this._delegateDeserializer;
    }

    @Override
    public Collection<Object> getKnownPropertyNames() {
        return this._delegateDeserializer.getKnownPropertyNames();
    }

    @Override
    public T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return _convertIfNonNull(this._delegateDeserializer.getNullValue(deserializationContext));
    }

    @Override
    public AccessPattern getNullAccessPattern() {
        return this._delegateDeserializer.getNullAccessPattern();
    }

    @Override
    public Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return _convertIfNonNull(this._delegateDeserializer.getAbsentValue(deserializationContext));
    }

    @Override
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return _convertIfNonNull(this._delegateDeserializer.getEmptyValue(deserializationContext));
    }

    @Override
    public AccessPattern getEmptyAccessPattern() {
        return this._delegateDeserializer.getEmptyAccessPattern();
    }

    @Override
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._delegateDeserializer.supportsUpdate(deserializationConfig);
    }

    protected T convertValue(Object obj) {
        return this._converter.convert(obj);
    }

    protected T _convertIfNonNull(Object obj) {
        if (obj == null) {
            return null;
        }
        return this._converter.convert(obj);
    }
}
