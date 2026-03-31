package com.kammoun.utils.jackson.databind.exc;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.databind.BeanDescription;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.introspect.BeanPropertyDefinition;

public class InvalidDefinitionException extends JsonMappingException {
    protected final JavaType _type;
    protected transient BeanDescription _beanDesc;
    protected transient BeanPropertyDefinition _property;

    protected InvalidDefinitionException(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        this._type = javaType;
        this._beanDesc = null;
        this._property = null;
    }

    protected InvalidDefinitionException(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        super(jsonGenerator, str);
        this._type = javaType;
        this._beanDesc = null;
        this._property = null;
    }

    protected InvalidDefinitionException(JsonParser jsonParser, String str, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        super(jsonParser, str);
        this._type = beanDescription == null ? null : beanDescription.getType();
        this._beanDesc = beanDescription;
        this._property = beanPropertyDefinition;
    }

    protected InvalidDefinitionException(JsonGenerator jsonGenerator, String str, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        super(jsonGenerator, str);
        this._type = beanDescription == null ? null : beanDescription.getType();
        this._beanDesc = beanDescription;
        this._property = beanPropertyDefinition;
    }

    public static InvalidDefinitionException from(JsonParser jsonParser, String str, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        return new InvalidDefinitionException(jsonParser, str, beanDescription, beanPropertyDefinition);
    }

    public static InvalidDefinitionException from(JsonParser jsonParser, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonParser, str, javaType);
    }

    public static InvalidDefinitionException from(JsonGenerator jsonGenerator, String str, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        return new InvalidDefinitionException(jsonGenerator, str, beanDescription, beanPropertyDefinition);
    }

    public static InvalidDefinitionException from(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonGenerator, str, javaType);
    }

    public JavaType getType() {
        return this._type;
    }

    public BeanDescription getBeanDescription() {
        return this._beanDesc;
    }

    public BeanPropertyDefinition getProperty() {
        return this._property;
    }
}
