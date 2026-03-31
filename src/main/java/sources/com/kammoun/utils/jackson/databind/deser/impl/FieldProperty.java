package com.kammoun.utils.jackson.databind.deser.impl;

import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.MapperFeature;
import com.kammoun.utils.jackson.databind.PropertyName;
import com.kammoun.utils.jackson.databind.deser.NullValueProvider;
import com.kammoun.utils.jackson.databind.deser.SettableBeanProperty;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedField;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMember;
import com.kammoun.utils.jackson.databind.introspect.BeanPropertyDefinition;
import com.kammoun.utils.jackson.databind.jsontype.TypeDeserializer;
import com.kammoun.utils.jackson.databind.util.Annotations;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public final class FieldProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final AnnotatedField _annotated;
    protected final transient Field _field;
    protected final boolean _skipNulls;

    public FieldProperty(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedField annotatedField) {
        super(beanPropertyDefinition, javaType, typeDeserializer, annotations);
        this._annotated = annotatedField;
        this._field = annotatedField.getAnnotated();
        this._skipNulls = NullsConstantProvider.isSkipper(this._nullProvider);
    }

    protected FieldProperty(FieldProperty fieldProperty, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(fieldProperty, jsonDeserializer, nullValueProvider);
        this._annotated = fieldProperty._annotated;
        this._field = fieldProperty._field;
        this._skipNulls = NullsConstantProvider.isSkipper(nullValueProvider);
    }

    protected FieldProperty(FieldProperty fieldProperty, PropertyName propertyName) {
        super(fieldProperty, propertyName);
        this._annotated = fieldProperty._annotated;
        this._field = fieldProperty._field;
        this._skipNulls = fieldProperty._skipNulls;
    }

    protected FieldProperty(FieldProperty fieldProperty) {
        super(fieldProperty);
        this._annotated = fieldProperty._annotated;
        Field annotated = this._annotated.getAnnotated();
        if (annotated == null) {
            throw new IllegalArgumentException("Missing field (broken JDK (de)serialization?)");
        }
        this._field = annotated;
        this._skipNulls = fieldProperty._skipNulls;
    }

    @Override
    public SettableBeanProperty withName(PropertyName propertyName) {
        return new FieldProperty(this, propertyName);
    }

    @Override
    public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        if (this._valueDeserializer == jsonDeserializer) {
            return this;
        }
        return new FieldProperty(this, jsonDeserializer, this._valueDeserializer == this._nullProvider ? jsonDeserializer : this._nullProvider);
    }

    @Override
    public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
        return new FieldProperty(this, this._valueDeserializer, nullValueProvider);
    }

    @Override
    public void fixAccess(DeserializationConfig deserializationConfig) {
        ClassUtil.checkAndFixAccess(this._field, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        if (this._annotated == null) {
            return null;
        }
        return (A) this._annotated.getAnnotation(cls);
    }

    @Override
    public AnnotatedMember getMember() {
        return this._annotated;
    }

    @Override
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object deserializeWithType;
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            if (this._skipNulls) {
                return;
            } else {
                deserializeWithType = this._nullProvider.getNullValue(deserializationContext);
            }
        } else if (this._valueTypeDeserializer == null) {
            deserializeWithType = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
            if (deserializeWithType == null) {
                if (this._skipNulls) {
                    return;
                } else {
                    deserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                }
            }
        } else {
            deserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, this._valueTypeDeserializer);
        }
        try {
            this._field.set(obj, deserializeWithType);
        } catch (Exception e) {
            _throwAsIOE(jsonParser, e, deserializeWithType);
        }
    }

    @Override
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object deserializeWithType;
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            if (this._skipNulls) {
                return obj;
            }
            deserializeWithType = this._nullProvider.getNullValue(deserializationContext);
        } else if (this._valueTypeDeserializer == null) {
            deserializeWithType = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
            if (deserializeWithType == null) {
                if (this._skipNulls) {
                    return obj;
                }
                deserializeWithType = this._nullProvider.getNullValue(deserializationContext);
            }
        } else {
            deserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, this._valueTypeDeserializer);
        }
        try {
            this._field.set(obj, deserializeWithType);
        } catch (Exception e) {
            _throwAsIOE(jsonParser, e, deserializeWithType);
        }
        return obj;
    }

    @Override
    public void set(Object obj, Object obj2) throws IOException {
        try {
            this._field.set(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
    }

    @Override
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        try {
            this._field.set(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
        return obj;
    }

    Object readResolve() {
        return new FieldProperty(this);
    }
}
