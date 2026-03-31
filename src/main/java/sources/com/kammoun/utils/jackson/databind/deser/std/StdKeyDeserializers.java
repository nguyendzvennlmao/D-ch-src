package com.kammoun.utils.jackson.databind.deser.std;

import com.kammoun.utils.jackson.annotation.JsonCreator;
import com.kammoun.utils.jackson.databind.BeanDescription;
import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.KeyDeserializer;
import com.kammoun.utils.jackson.databind.MapperFeature;
import com.kammoun.utils.jackson.databind.deser.KeyDeserializers;
import com.kammoun.utils.jackson.databind.deser.std.StdKeyDeserializer;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedAndMetadata;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedConstructor;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMember;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMethod;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import com.kammoun.utils.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

public class StdKeyDeserializers implements KeyDeserializers, Serializable {
    private static final long serialVersionUID = 1;

    public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumResolver) {
        return new StdKeyDeserializer.EnumKD(enumResolver, null);
    }

    public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
        return new StdKeyDeserializer.EnumKD(enumResolver, annotatedMethod);
    }

    public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumResolver, EnumResolver enumResolver2, EnumResolver enumResolver3, EnumResolver enumResolver4) {
        return new StdKeyDeserializer.EnumKD(enumResolver, null, enumResolver2, enumResolver3, enumResolver4);
    }

    public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumResolver, AnnotatedMethod annotatedMethod, EnumResolver enumResolver2, EnumResolver enumResolver3, EnumResolver enumResolver4) {
        return new StdKeyDeserializer.EnumKD(enumResolver, annotatedMethod, enumResolver2, enumResolver3, enumResolver4);
    }

    public static KeyDeserializer constructDelegatingKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<?> jsonDeserializer) {
        return new StdKeyDeserializer.DelegatingKD(javaType.getRawClass(), jsonDeserializer);
    }

    public static KeyDeserializer findStringBasedKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        BeanDescription introspectForCreation = deserializationConfig.introspectForCreation(javaType);
        AnnotatedAndMetadata<AnnotatedConstructor, JsonCreator.Mode> _findStringConstructor = _findStringConstructor(introspectForCreation);
        if (_findStringConstructor != null && _findStringConstructor.metadata != null) {
            return _constructCreatorKeyDeserializer(deserializationConfig, _findStringConstructor.annotated);
        }
        List<AnnotatedAndMetadata<AnnotatedMethod, JsonCreator.Mode>> factoryMethodsWithMode = introspectForCreation.getFactoryMethodsWithMode();
        factoryMethodsWithMode.removeIf(annotatedAndMetadata -> {
            return (((AnnotatedMethod) annotatedAndMetadata.annotated).getParameterCount() == 1 && ((AnnotatedMethod) annotatedAndMetadata.annotated).getRawParameterType(0) == String.class && annotatedAndMetadata.metadata != JsonCreator.Mode.PROPERTIES) ? false : true;
        });
        AnnotatedMethod _findExplicitStringFactoryMethod = _findExplicitStringFactoryMethod(factoryMethodsWithMode);
        if (_findExplicitStringFactoryMethod != null) {
            return _constructCreatorKeyDeserializer(deserializationConfig, _findExplicitStringFactoryMethod);
        }
        if (_findStringConstructor != null) {
            return _constructCreatorKeyDeserializer(deserializationConfig, _findStringConstructor.annotated);
        }
        if (factoryMethodsWithMode.isEmpty()) {
            return null;
        }
        return _constructCreatorKeyDeserializer(deserializationConfig, factoryMethodsWithMode.get(0).annotated);
    }

    private static KeyDeserializer _constructCreatorKeyDeserializer(DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember instanceof AnnotatedConstructor) {
            Constructor<?> annotated = ((AnnotatedConstructor) annotatedMember).getAnnotated();
            if (deserializationConfig.canOverrideAccessModifiers()) {
                ClassUtil.checkAndFixAccess(annotated, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new StdKeyDeserializer.StringCtorKeyDeserializer(annotated);
        }
        Method annotated2 = ((AnnotatedMethod) annotatedMember).getAnnotated();
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotated2, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new StdKeyDeserializer.StringFactoryKeyDeserializer(annotated2);
    }

    private static AnnotatedAndMetadata<AnnotatedConstructor, JsonCreator.Mode> _findStringConstructor(BeanDescription beanDescription) {
        for (AnnotatedAndMetadata<AnnotatedConstructor, JsonCreator.Mode> annotatedAndMetadata : beanDescription.getConstructorsWithMode()) {
            AnnotatedConstructor annotatedConstructor = annotatedAndMetadata.annotated;
            if (annotatedConstructor.getParameterCount() == 1 && String.class == annotatedConstructor.getRawParameterType(0)) {
                return annotatedAndMetadata;
            }
        }
        return null;
    }

    private static AnnotatedMethod _findExplicitStringFactoryMethod(List<AnnotatedAndMetadata<AnnotatedMethod, JsonCreator.Mode>> list) throws JsonMappingException {
        AnnotatedMethod annotatedMethod = null;
        for (AnnotatedAndMetadata<AnnotatedMethod, JsonCreator.Mode> annotatedAndMetadata : list) {
            if (annotatedAndMetadata.metadata != null) {
                if (annotatedMethod != null) {
                    throw new IllegalArgumentException("Multiple suitable annotated Creator factory methods to be used as the Key deserializer for type " + ClassUtil.nameOf(annotatedAndMetadata.annotated.getDeclaringClass()));
                }
                annotatedMethod = annotatedAndMetadata.annotated;
            }
        }
        return annotatedMethod;
    }

    @Override
    public KeyDeserializer findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass.isPrimitive()) {
            rawClass = ClassUtil.wrapperType(rawClass);
        }
        return StdKeyDeserializer.forType(rawClass);
    }
}
