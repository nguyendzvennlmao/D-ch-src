package com.kammoun.utils.jackson.databind;

import com.kammoun.utils.jackson.core.JsonFactory;
import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.ObjectCodec;
import com.kammoun.utils.jackson.core.Version;
import com.kammoun.utils.jackson.core.Versioned;
import com.kammoun.utils.jackson.databind.cfg.MutableConfigOverride;
import com.kammoun.utils.jackson.databind.deser.BeanDeserializerModifier;
import com.kammoun.utils.jackson.databind.deser.DeserializationProblemHandler;
import com.kammoun.utils.jackson.databind.deser.Deserializers;
import com.kammoun.utils.jackson.databind.deser.KeyDeserializers;
import com.kammoun.utils.jackson.databind.deser.ValueInstantiators;
import com.kammoun.utils.jackson.databind.introspect.ClassIntrospector;
import com.kammoun.utils.jackson.databind.jsontype.NamedType;
import com.kammoun.utils.jackson.databind.ser.BeanSerializerModifier;
import com.kammoun.utils.jackson.databind.ser.Serializers;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import com.kammoun.utils.jackson.databind.type.TypeModifier;
import java.util.Collection;
import java.util.Collections;

public abstract class Module implements Versioned {

    public interface SetupContext {
        Version getMapperVersion();

        <C extends ObjectCodec> C getOwner();

        TypeFactory getTypeFactory();

        boolean isEnabled(MapperFeature mapperFeature);

        boolean isEnabled(DeserializationFeature deserializationFeature);

        boolean isEnabled(SerializationFeature serializationFeature);

        boolean isEnabled(JsonFactory.Feature feature);

        boolean isEnabled(JsonParser.Feature feature);

        boolean isEnabled(JsonGenerator.Feature feature);

        MutableConfigOverride configOverride(Class<?> cls);

        void addDeserializers(Deserializers deserializers);

        void addKeyDeserializers(KeyDeserializers keyDeserializers);

        void addSerializers(Serializers serializers);

        void addKeySerializers(Serializers serializers);

        void addBeanDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier);

        void addBeanSerializerModifier(BeanSerializerModifier beanSerializerModifier);

        void addAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver);

        void addTypeModifier(TypeModifier typeModifier);

        void addValueInstantiators(ValueInstantiators valueInstantiators);

        void setClassIntrospector(ClassIntrospector classIntrospector);

        void insertAnnotationIntrospector(AnnotationIntrospector annotationIntrospector);

        void appendAnnotationIntrospector(AnnotationIntrospector annotationIntrospector);

        void registerSubtypes(Class<?>... clsArr);

        void registerSubtypes(NamedType... namedTypeArr);

        void registerSubtypes(Collection<Class<?>> collection);

        void setMixInAnnotations(Class<?> cls, Class<?> cls2);

        void addDeserializationProblemHandler(DeserializationProblemHandler deserializationProblemHandler);

        void setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy);
    }

    public abstract String getModuleName();

    @Override
    public abstract Version version();

    public Object getTypeId() {
        return getClass().getName();
    }

    public abstract void setupModule(SetupContext setupContext);

    public Iterable<? extends Module> getDependencies() {
        return Collections.emptyList();
    }
}
