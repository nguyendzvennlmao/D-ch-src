package com.kammoun.utils.jackson.databind.ser.std;

import com.kammoun.utils.jackson.annotation.JsonFormat;
import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.SerializableString;
import com.kammoun.utils.jackson.databind.BeanDescription;
import com.kammoun.utils.jackson.databind.BeanProperty;
import com.kammoun.utils.jackson.databind.EnumNamingStrategy;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.JsonNode;
import com.kammoun.utils.jackson.databind.JsonSerializer;
import com.kammoun.utils.jackson.databind.SerializationConfig;
import com.kammoun.utils.jackson.databind.SerializationFeature;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import com.kammoun.utils.jackson.databind.annotation.JacksonStdImpl;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedClass;
import com.kammoun.utils.jackson.databind.introspect.EnumNamingStrategyFactory;
import com.kammoun.utils.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.kammoun.utils.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.kammoun.utils.jackson.databind.node.ArrayNode;
import com.kammoun.utils.jackson.databind.node.ObjectNode;
import com.kammoun.utils.jackson.databind.ser.ContextualSerializer;
import com.kammoun.utils.jackson.databind.util.EnumValues;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

@JacksonStdImpl
public class EnumSerializer extends StdScalarSerializer<Enum<?>> implements ContextualSerializer {
    private static final long serialVersionUID = 1;
    protected final EnumValues _values;
    protected final Boolean _serializeAsIndex;
    protected final EnumValues _valuesByEnumNaming;
    protected final EnumValues _valuesByToString;

    @Deprecated
    public EnumSerializer(EnumValues enumValues, Boolean bool) {
        this(enumValues, bool, null, null);
    }

    @Deprecated
    public EnumSerializer(EnumValues enumValues, Boolean bool, EnumValues enumValues2) {
        this(enumValues, bool, enumValues2, null);
    }

    public EnumSerializer(EnumValues enumValues, Boolean bool, EnumValues enumValues2, EnumValues enumValues3) {
        super(enumValues.getEnumClass(), false);
        this._values = enumValues;
        this._serializeAsIndex = bool;
        this._valuesByEnumNaming = enumValues2;
        this._valuesByToString = enumValues3;
    }

    public static EnumSerializer construct(Class<?> cls, SerializationConfig serializationConfig, BeanDescription beanDescription, JsonFormat.Value value) {
        return new EnumSerializer(EnumValues.constructFromName(serializationConfig, beanDescription.getClassInfo()), _isShapeWrittenUsingIndex(cls, value, true, null), constructEnumNamingStrategyValues(serializationConfig, cls, beanDescription.getClassInfo()), EnumValues.constructFromToString(serializationConfig, beanDescription.getClassInfo()));
    }

    @Override
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (findFormatOverrides != null) {
            Boolean _isShapeWrittenUsingIndex = _isShapeWrittenUsingIndex(handledType(), findFormatOverrides, false, this._serializeAsIndex);
            if (!Objects.equals(_isShapeWrittenUsingIndex, this._serializeAsIndex)) {
                return new EnumSerializer(this._values, _isShapeWrittenUsingIndex, this._valuesByEnumNaming, this._valuesByToString);
            }
        }
        return this;
    }

    public EnumValues getEnumValues() {
        return this._values;
    }

    @Override
    public final void serialize(Enum<?> r5, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._valuesByEnumNaming != null) {
            jsonGenerator.writeString(this._valuesByEnumNaming.serializedValueFor(r5));
            return;
        }
        if (_serializeAsIndex(serializerProvider)) {
            jsonGenerator.writeNumber(r5.ordinal());
        } else if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            jsonGenerator.writeString(this._valuesByToString.serializedValueFor(r5));
        } else {
            jsonGenerator.writeString(this._values.serializedValueFor(r5));
        }
    }

    @Override
    @Deprecated
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        if (_serializeAsIndex(serializerProvider)) {
            return createSchemaNode("integer", true);
        }
        ObjectNode createSchemaNode = createSchemaNode("string", true);
        if (type != null && serializerProvider.constructType(type).isEnumType()) {
            ArrayNode putArray = createSchemaNode.putArray("enum");
            Iterator<SerializableString> it = this._values.values().iterator();
            while (it.hasNext()) {
                putArray.add(it.next().getValue());
            }
        }
        return createSchemaNode;
    }

    @Override
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
        SerializerProvider provider = jsonFormatVisitorWrapper.getProvider();
        if (_serializeAsIndex(provider)) {
            visitIntFormat(jsonFormatVisitorWrapper, javaType, JsonParser.NumberType.INT);
            return;
        }
        JsonStringFormatVisitor expectStringFormat = jsonFormatVisitorWrapper.expectStringFormat(javaType);
        if (expectStringFormat != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (provider == null || !provider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                Iterator<SerializableString> it = this._values.values().iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(it.next().getValue());
                }
            } else {
                Iterator<SerializableString> it2 = this._valuesByToString.values().iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(it2.next().getValue());
                }
            }
            expectStringFormat.enumTypes(linkedHashSet);
        }
    }

    protected final boolean _serializeAsIndex(SerializerProvider serializerProvider) {
        return this._serializeAsIndex != null ? this._serializeAsIndex.booleanValue() : serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
    }

    protected static Boolean _isShapeWrittenUsingIndex(Class<?> cls, JsonFormat.Value value, boolean z, Boolean bool) {
        JsonFormat.Shape shape = value == null ? null : value.getShape();
        if (shape == null) {
            return bool;
        }
        if (shape == JsonFormat.Shape.ANY || shape == JsonFormat.Shape.SCALAR) {
            return bool;
        }
        if (shape == JsonFormat.Shape.STRING || shape == JsonFormat.Shape.NATURAL) {
            return Boolean.FALSE;
        }
        if (shape.isNumeric() || shape == JsonFormat.Shape.ARRAY) {
            return Boolean.TRUE;
        }
        Object[] objArr = new Object[3];
        objArr[0] = shape;
        objArr[1] = cls.getName();
        objArr[2] = z ? "class" : "property";
        throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", objArr));
    }

    public static EnumValues constructEnumNamingStrategyValues(SerializationConfig serializationConfig, Class<Enum<?>> cls, AnnotatedClass annotatedClass) {
        EnumNamingStrategy createEnumNamingStrategyInstance = EnumNamingStrategyFactory.createEnumNamingStrategyInstance(serializationConfig.getAnnotationIntrospector().findEnumNamingStrategy(serializationConfig, annotatedClass), serializationConfig.canOverrideAccessModifiers());
        if (createEnumNamingStrategyInstance == null) {
            return null;
        }
        return EnumValues.constructUsingEnumNamingStrategy(serializationConfig, annotatedClass, createEnumNamingStrategyInstance);
    }
}
