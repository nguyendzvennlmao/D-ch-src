package com.kammoun.utils.jackson.databind;

import com.kammoun.utils.jackson.annotation.JsonCreator;
import com.kammoun.utils.jackson.annotation.JsonFormat;
import com.kammoun.utils.jackson.annotation.JsonInclude;
import com.kammoun.utils.jackson.databind.annotation.JsonPOJOBuilder;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedAndMetadata;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedClass;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedConstructor;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedField;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMember;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMethod;
import com.kammoun.utils.jackson.databind.introspect.BeanPropertyDefinition;
import com.kammoun.utils.jackson.databind.introspect.ObjectIdInfo;
import com.kammoun.utils.jackson.databind.type.TypeBindings;
import com.kammoun.utils.jackson.databind.util.Annotations;
import com.kammoun.utils.jackson.databind.util.Converter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class BeanDescription {
    protected final JavaType _type;

    public BeanDescription(JavaType javaType) {
        this._type = javaType;
    }

    public JavaType getType() {
        return this._type;
    }

    public Class<?> getBeanClass() {
        return this._type.getRawClass();
    }

    public boolean isRecordType() {
        return this._type.isRecordType();
    }

    public boolean isNonStaticInnerClass() {
        return getClassInfo().isNonStaticInnerClass();
    }

    public abstract AnnotatedClass getClassInfo();

    public abstract ObjectIdInfo getObjectIdInfo();

    public abstract boolean hasKnownClassAnnotations();

    @Deprecated
    public abstract TypeBindings bindingsForBeanType();

    @Deprecated
    public abstract JavaType resolveType(Type type);

    public abstract Annotations getClassAnnotations();

    public abstract List<BeanPropertyDefinition> findProperties();

    public abstract Set<String> getIgnoredPropertyNames();

    public abstract List<BeanPropertyDefinition> findBackReferences();

    @Deprecated
    public abstract Map<String, AnnotatedMember> findBackReferenceProperties();

    public abstract List<AnnotatedConstructor> getConstructors();

    public abstract List<AnnotatedAndMetadata<AnnotatedConstructor, JsonCreator.Mode>> getConstructorsWithMode();

    public abstract List<AnnotatedMethod> getFactoryMethods();

    public abstract List<AnnotatedAndMetadata<AnnotatedMethod, JsonCreator.Mode>> getFactoryMethodsWithMode();

    public abstract AnnotatedConstructor findDefaultConstructor();

    @Deprecated
    public abstract Constructor<?> findSingleArgConstructor(Class<?>... clsArr);

    @Deprecated
    public abstract Method findFactoryMethod(Class<?>... clsArr);

    public AnnotatedMember findJsonKeyAccessor() {
        return null;
    }

    public abstract AnnotatedMember findJsonValueAccessor();

    public abstract AnnotatedMember findAnyGetter();

    public abstract AnnotatedMember findAnySetterAccessor();

    public abstract AnnotatedMethod findMethod(String str, Class<?>[] clsArr);

    @Deprecated
    public abstract AnnotatedMethod findJsonValueMethod();

    @Deprecated
    public AnnotatedMethod findAnySetter() {
        AnnotatedMember findAnySetterAccessor = findAnySetterAccessor();
        if (findAnySetterAccessor instanceof AnnotatedMethod) {
            return (AnnotatedMethod) findAnySetterAccessor;
        }
        return null;
    }

    @Deprecated
    public AnnotatedMember findAnySetterField() {
        AnnotatedMember findAnySetterAccessor = findAnySetterAccessor();
        if (findAnySetterAccessor instanceof AnnotatedField) {
            return findAnySetterAccessor;
        }
        return null;
    }

    public abstract JsonInclude.Value findPropertyInclusion(JsonInclude.Value value);

    public abstract JsonFormat.Value findExpectedFormat();

    @Deprecated
    public JsonFormat.Value findExpectedFormat(JsonFormat.Value value) {
        JsonFormat.Value findExpectedFormat = findExpectedFormat();
        return value == null ? findExpectedFormat : findExpectedFormat == null ? value : value.withOverrides(findExpectedFormat);
    }

    public abstract Converter<Object, Object> findSerializationConverter();

    public abstract Converter<Object, Object> findDeserializationConverter();

    public String findClassDescription() {
        return null;
    }

    public abstract Map<Object, AnnotatedMember> findInjectables();

    public abstract Class<?> findPOJOBuilder();

    public abstract JsonPOJOBuilder.Value findPOJOBuilderConfig();

    public abstract Object instantiateBean(boolean z);

    public abstract Class<?>[] findDefaultViews();
}
