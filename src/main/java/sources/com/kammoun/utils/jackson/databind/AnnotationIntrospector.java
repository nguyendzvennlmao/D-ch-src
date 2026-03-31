package com.kammoun.utils.jackson.databind;

import com.kammoun.utils.jackson.annotation.JacksonInject;
import com.kammoun.utils.jackson.annotation.JsonCreator;
import com.kammoun.utils.jackson.annotation.JsonFormat;
import com.kammoun.utils.jackson.annotation.JsonIgnoreProperties;
import com.kammoun.utils.jackson.annotation.JsonInclude;
import com.kammoun.utils.jackson.annotation.JsonIncludeProperties;
import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.annotation.JsonSetter;
import com.kammoun.utils.jackson.annotation.JsonTypeInfo;
import com.kammoun.utils.jackson.core.Version;
import com.kammoun.utils.jackson.core.Versioned;
import com.kammoun.utils.jackson.databind.annotation.JsonPOJOBuilder;
import com.kammoun.utils.jackson.databind.annotation.JsonSerialize;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;
import com.kammoun.utils.jackson.databind.introspect.Annotated;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedClass;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedField;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMember;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMethod;
import com.kammoun.utils.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.kammoun.utils.jackson.databind.introspect.NopAnnotationIntrospector;
import com.kammoun.utils.jackson.databind.introspect.ObjectIdInfo;
import com.kammoun.utils.jackson.databind.introspect.VisibilityChecker;
import com.kammoun.utils.jackson.databind.jsontype.NamedType;
import com.kammoun.utils.jackson.databind.jsontype.TypeResolverBuilder;
import com.kammoun.utils.jackson.databind.ser.BeanPropertyWriter;
import com.kammoun.utils.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class AnnotationIntrospector implements Versioned, Serializable {

    public static class ReferenceProperty {
        private final Type _type;
        private final String _name;

        public enum Type {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        public ReferenceProperty(Type type, String str) {
            this._type = type;
            this._name = str;
        }

        public static ReferenceProperty managed(String str) {
            return new ReferenceProperty(Type.MANAGED_REFERENCE, str);
        }

        public static ReferenceProperty back(String str) {
            return new ReferenceProperty(Type.BACK_REFERENCE, str);
        }

        public Type getType() {
            return this._type;
        }

        public String getName() {
            return this._name;
        }

        public boolean isManagedReference() {
            return this._type == Type.MANAGED_REFERENCE;
        }

        public boolean isBackReference() {
            return this._type == Type.BACK_REFERENCE;
        }
    }

    public interface XmlExtensions {
        String findNamespace(MapperConfig<?> mapperConfig, Annotated annotated);

        Boolean isOutputAsAttribute(MapperConfig<?> mapperConfig, Annotated annotated);

        Boolean isOutputAsText(MapperConfig<?> mapperConfig, Annotated annotated);

        Boolean isOutputAsCData(MapperConfig<?> mapperConfig, Annotated annotated);
    }

    public static AnnotationIntrospector nopInstance() {
        return NopAnnotationIntrospector.instance;
    }

    public static AnnotationIntrospector pair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        return new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }

    public Collection<AnnotationIntrospector> allIntrospectors() {
        return Collections.singletonList(this);
    }

    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        collection.add(this);
        return collection;
    }

    @Override
    public abstract Version version();

    public boolean isAnnotationBundle(Annotation annotation) {
        return false;
    }

    public ObjectIdInfo findObjectIdInfo(Annotated annotated) {
        return null;
    }

    public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectIdInfo) {
        return objectIdInfo;
    }

    public PropertyName findRootName(AnnotatedClass annotatedClass) {
        return null;
    }

    public Boolean isIgnorableType(AnnotatedClass annotatedClass) {
        return null;
    }

    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        return findPropertyIgnorals(annotated);
    }

    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        return JsonIncludeProperties.Value.all();
    }

    public Object findFilterId(Annotated annotated) {
        return null;
    }

    public Object findNamingStrategy(AnnotatedClass annotatedClass) {
        return null;
    }

    public Object findEnumNamingStrategy(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        return null;
    }

    public String findClassDescription(AnnotatedClass annotatedClass) {
        return null;
    }

    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(Annotated annotated) {
        return JsonIgnoreProperties.Value.empty();
    }

    public VisibilityChecker<?> findAutoDetectVisibility(AnnotatedClass annotatedClass, VisibilityChecker<?> visibilityChecker) {
        return visibilityChecker;
    }

    public JsonTypeInfo.Value findPolymorphicTypeInfo(MapperConfig<?> mapperConfig, Annotated annotated) {
        return null;
    }

    public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        return null;
    }

    public TypeResolverBuilder<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public TypeResolverBuilder<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public List<NamedType> findSubtypes(Annotated annotated) {
        return null;
    }

    public String findTypeName(AnnotatedClass annotatedClass) {
        return null;
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return null;
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        return null;
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        return null;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return false;
    }

    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        Object findInjectableValueId = findInjectableValueId(annotatedMember);
        if (findInjectableValueId != null) {
            return JacksonInject.Value.forId(findInjectableValueId);
        }
        return null;
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        return null;
    }

    public Class<?>[] findViews(Annotated annotated) {
        return null;
    }

    public JsonFormat.Value findFormat(Annotated annotated) {
        return JsonFormat.Value.empty();
    }

    public PropertyName findWrapperName(Annotated annotated) {
        return null;
    }

    public String findPropertyDefaultValue(Annotated annotated) {
        return null;
    }

    public String findPropertyDescription(Annotated annotated) {
        return null;
    }

    public Integer findPropertyIndex(Annotated annotated) {
        return null;
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        return null;
    }

    public List<PropertyName> findPropertyAliases(Annotated annotated) {
        return null;
    }

    public JsonProperty.Access findPropertyAccess(Annotated annotated) {
        return null;
    }

    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        return null;
    }

    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        return null;
    }

    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findSerializer(Annotated annotated) {
        return null;
    }

    public Object findKeySerializer(Annotated annotated) {
        return null;
    }

    public Object findContentSerializer(Annotated annotated) {
        return null;
    }

    public Object findNullSerializer(Annotated annotated) {
        return null;
    }

    public JsonSerialize.Typing findSerializationTyping(Annotated annotated) {
        return null;
    }

    public Object findSerializationConverter(Annotated annotated) {
        return null;
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    public JsonInclude.Value findPropertyInclusion(Annotated annotated) {
        return JsonInclude.Value.empty();
    }

    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws JsonMappingException {
        return javaType;
    }

    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedClass) {
        return null;
    }

    public Boolean findSerializationSortAlphabetically(Annotated annotated) {
        return null;
    }

    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, List<BeanPropertyWriter> list) {
    }

    public PropertyName findNameForSerialization(Annotated annotated) {
        return null;
    }

    public Boolean hasAsKey(MapperConfig<?> mapperConfig, Annotated annotated) {
        return null;
    }

    public Boolean hasAsValue(Annotated annotated) {
        return ((annotated instanceof AnnotatedMethod) && hasAsValueAnnotation((AnnotatedMethod) annotated)) ? true : null;
    }

    public Boolean hasAnyGetter(Annotated annotated) {
        return ((annotated instanceof AnnotatedMethod) && hasAnyGetterAnnotation((AnnotatedMethod) annotated)) ? true : null;
    }

    @Deprecated
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }

    public String[] findEnumValues(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }

    @Deprecated
    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
    }

    public void findEnumAliases(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, Enum<?>[] enumArr, String[][] strArr) {
    }

    public Enum<?> findDefaultEnumValue(AnnotatedClass annotatedClass, Enum<?>[] enumArr) {
        return findDefaultEnumValue(annotatedClass.getRawType());
    }

    @Deprecated
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return null;
    }

    @Deprecated
    public String findEnumValue(Enum<?> r3) {
        return r3.name();
    }

    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public Object findDeserializer(Annotated annotated) {
        return null;
    }

    public Object findKeyDeserializer(Annotated annotated) {
        return null;
    }

    public Object findContentDeserializer(Annotated annotated) {
        return null;
    }

    public Object findDeserializationConverter(Annotated annotated) {
        return null;
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws JsonMappingException {
        return javaType;
    }

    public Object findValueInstantiator(AnnotatedClass annotatedClass) {
        return null;
    }

    public Class<?> findPOJOBuilder(AnnotatedClass annotatedClass) {
        return null;
    }

    public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedClass) {
        return null;
    }

    public PropertyName findNameForDeserialization(Annotated annotated) {
        return null;
    }

    public Boolean hasAnySetter(Annotated annotated) {
        return null;
    }

    public JsonSetter.Value findSetterInfo(Annotated annotated) {
        return JsonSetter.Value.empty();
    }

    public Boolean findMergeInfo(Annotated annotated) {
        return null;
    }

    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, Annotated annotated) {
        if (!hasCreatorAnnotation(annotated)) {
            return null;
        }
        JsonCreator.Mode findCreatorBinding = findCreatorBinding(annotated);
        if (findCreatorBinding == null) {
            findCreatorBinding = JsonCreator.Mode.DEFAULT;
        }
        return findCreatorBinding;
    }

    @Deprecated
    public boolean hasCreatorAnnotation(Annotated annotated) {
        return false;
    }

    @Deprecated
    public JsonCreator.Mode findCreatorBinding(Annotated annotated) {
        return null;
    }

    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public <A extends Annotation> A _findAnnotation(Annotated annotated, Class<A> cls) {
        return (A) annotated.getAnnotation(cls);
    }

    public boolean _hasAnnotation(Annotated annotated, Class<? extends Annotation> cls) {
        return annotated.hasAnnotation(cls);
    }

    public boolean _hasOneOf(Annotated annotated, Class<? extends Annotation>[] clsArr) {
        return annotated.hasOneOf(clsArr);
    }
}
