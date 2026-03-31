package com.kammoun.utils.jackson.databind.ser.std;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.databind.BeanProperty;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.JsonSerializer;
import com.kammoun.utils.jackson.databind.PropertyMetadata;
import com.kammoun.utils.jackson.databind.PropertyName;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMember;
import com.kammoun.utils.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.kammoun.utils.jackson.databind.jsontype.TypeSerializer;
import com.kammoun.utils.jackson.databind.node.ObjectNode;
import com.kammoun.utils.jackson.databind.ser.PropertyWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;

public class MapProperty extends PropertyWriter {
    private static final long serialVersionUID = 1;
    private static final BeanProperty BOGUS_PROP = new BeanProperty.Bogus();
    protected final TypeSerializer _typeSerializer;
    protected final BeanProperty _property;
    protected Object _key;
    protected Object _value;
    protected JsonSerializer<Object> _keySerializer;
    protected JsonSerializer<Object> _valueSerializer;

    public MapProperty(TypeSerializer typeSerializer, BeanProperty beanProperty) {
        super(beanProperty == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : beanProperty.getMetadata());
        this._typeSerializer = typeSerializer;
        this._property = beanProperty == null ? BOGUS_PROP : beanProperty;
    }

    public void reset(Object obj, Object obj2, JsonSerializer<Object> jsonSerializer, JsonSerializer<Object> jsonSerializer2) {
        this._key = obj;
        this._value = obj2;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
    }

    @Deprecated
    public void reset(Object obj, JsonSerializer<Object> jsonSerializer, JsonSerializer<Object> jsonSerializer2) {
        reset(obj, this._value, jsonSerializer, jsonSerializer2);
    }

    @Override
    public String getName() {
        return this._key instanceof String ? (String) this._key : String.valueOf(this._key);
    }

    public Object getValue() {
        return this._value;
    }

    public void setValue(Object obj) {
        this._value = obj;
    }

    @Override
    public PropertyName getFullName() {
        return new PropertyName(getName());
    }

    @Override
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this._property.getAnnotation(cls);
    }

    @Override
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return (A) this._property.getContextAnnotation(cls);
    }

    @Override
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        this._keySerializer.serialize(this._key, jsonGenerator, serializerProvider);
        if (this._typeSerializer == null) {
            this._valueSerializer.serialize(this._value, jsonGenerator, serializerProvider);
        } else {
            this._valueSerializer.serializeWithType(this._value, jsonGenerator, serializerProvider, this._typeSerializer);
        }
    }

    @Override
    public void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        if (jsonGenerator.canOmitFields()) {
            return;
        }
        jsonGenerator.writeOmittedField(getName());
    }

    @Override
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        if (this._typeSerializer == null) {
            this._valueSerializer.serialize(this._value, jsonGenerator, serializerProvider);
        } else {
            this._valueSerializer.serializeWithType(this._value, jsonGenerator, serializerProvider, this._typeSerializer);
        }
    }

    @Override
    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        jsonGenerator.writeNull();
    }

    @Override
    public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException {
        this._property.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
    }

    @Override
    @Deprecated
    public void depositSchemaProperty(ObjectNode objectNode, SerializerProvider serializerProvider) throws JsonMappingException {
    }

    @Override
    public JavaType getType() {
        return this._property.getType();
    }

    @Override
    public PropertyName getWrapperName() {
        return this._property.getWrapperName();
    }

    @Override
    public AnnotatedMember getMember() {
        return this._property.getMember();
    }
}
