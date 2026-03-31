package com.kammoun.utils.jackson.databind.introspect;

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
import com.kammoun.utils.jackson.databind.AnnotationIntrospector;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.JsonSerializer;
import com.kammoun.utils.jackson.databind.KeyDeserializer;
import com.kammoun.utils.jackson.databind.PropertyName;
import com.kammoun.utils.jackson.databind.annotation.JsonPOJOBuilder;
import com.kammoun.utils.jackson.databind.annotation.JsonSerialize;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;
import com.kammoun.utils.jackson.databind.jsontype.NamedType;
import com.kammoun.utils.jackson.databind.jsontype.TypeResolverBuilder;
import com.kammoun.utils.jackson.databind.ser.BeanPropertyWriter;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import com.kammoun.utils.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AnnotationIntrospectorPair extends AnnotationIntrospector implements Serializable {
    private static final long serialVersionUID = 1;
    protected final AnnotationIntrospector _primary;
    protected final AnnotationIntrospector _secondary;

    public AnnotationIntrospectorPair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._primary = annotationIntrospector;
        this._secondary = annotationIntrospector2;
    }

    @Override
    public Version version() {
        return this._primary.version();
    }

    public static AnnotationIntrospector create(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        return annotationIntrospector == null ? annotationIntrospector2 : annotationIntrospector2 == null ? annotationIntrospector : new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }

    @Override
    public Collection<AnnotationIntrospector> allIntrospectors() {
        return allIntrospectors(new ArrayList());
    }

    @Override
    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        this._primary.allIntrospectors(collection);
        this._secondary.allIntrospectors(collection);
        return collection;
    }

    @Override
    public boolean isAnnotationBundle(Annotation annotation) {
        return this._primary.isAnnotationBundle(annotation) || this._secondary.isAnnotationBundle(annotation);
    }

    @Override
    public PropertyName findRootName(AnnotatedClass annotatedClass) {
        return PropertyName.merge(this._primary.findRootName(annotatedClass), this._secondary.findRootName(annotatedClass));
    }

    @Override
    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonIgnoreProperties.Value findPropertyIgnoralByName = this._secondary.findPropertyIgnoralByName(mapperConfig, annotated);
        JsonIgnoreProperties.Value findPropertyIgnoralByName2 = this._primary.findPropertyIgnoralByName(mapperConfig, annotated);
        return findPropertyIgnoralByName == null ? findPropertyIgnoralByName2 : findPropertyIgnoralByName.withOverrides(findPropertyIgnoralByName2);
    }

    @Override
    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonIncludeProperties.Value findPropertyInclusionByName = this._secondary.findPropertyInclusionByName(mapperConfig, annotated);
        JsonIncludeProperties.Value findPropertyInclusionByName2 = this._primary.findPropertyInclusionByName(mapperConfig, annotated);
        return findPropertyInclusionByName == null ? findPropertyInclusionByName2 : findPropertyInclusionByName.withOverrides(findPropertyInclusionByName2);
    }

    @Override
    public Boolean isIgnorableType(AnnotatedClass annotatedClass) {
        Boolean isIgnorableType = this._primary.isIgnorableType(annotatedClass);
        if (isIgnorableType == null) {
            isIgnorableType = this._secondary.isIgnorableType(annotatedClass);
        }
        return isIgnorableType;
    }

    @Override
    public Object findFilterId(Annotated annotated) {
        Object findFilterId = this._primary.findFilterId(annotated);
        if (findFilterId == null) {
            findFilterId = this._secondary.findFilterId(annotated);
        }
        return findFilterId;
    }

    @Override
    public Object findNamingStrategy(AnnotatedClass annotatedClass) {
        Object findNamingStrategy = this._primary.findNamingStrategy(annotatedClass);
        if (findNamingStrategy == null) {
            findNamingStrategy = this._secondary.findNamingStrategy(annotatedClass);
        }
        return findNamingStrategy;
    }

    @Override
    public Object findEnumNamingStrategy(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        Object findEnumNamingStrategy = this._primary.findEnumNamingStrategy(mapperConfig, annotatedClass);
        if (findEnumNamingStrategy == null) {
            findEnumNamingStrategy = this._secondary.findEnumNamingStrategy(mapperConfig, annotatedClass);
        }
        return findEnumNamingStrategy;
    }

    @Override
    public String findClassDescription(AnnotatedClass annotatedClass) {
        String findClassDescription = this._primary.findClassDescription(annotatedClass);
        if (findClassDescription == null || findClassDescription.isEmpty()) {
            findClassDescription = this._secondary.findClassDescription(annotatedClass);
        }
        return findClassDescription;
    }

    @Override
    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(Annotated annotated) {
        JsonIgnoreProperties.Value findPropertyIgnorals = this._secondary.findPropertyIgnorals(annotated);
        JsonIgnoreProperties.Value findPropertyIgnorals2 = this._primary.findPropertyIgnorals(annotated);
        return findPropertyIgnorals == null ? findPropertyIgnorals2 : findPropertyIgnorals.withOverrides(findPropertyIgnorals2);
    }

    @Override
    public VisibilityChecker<?> findAutoDetectVisibility(AnnotatedClass annotatedClass, VisibilityChecker<?> visibilityChecker) {
        return this._primary.findAutoDetectVisibility(annotatedClass, this._secondary.findAutoDetectVisibility(annotatedClass, visibilityChecker));
    }

    @Override
    public JsonTypeInfo.Value findPolymorphicTypeInfo(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonTypeInfo.Value findPolymorphicTypeInfo = this._primary.findPolymorphicTypeInfo(mapperConfig, annotated);
        if (findPolymorphicTypeInfo == null) {
            findPolymorphicTypeInfo = this._secondary.findPolymorphicTypeInfo(mapperConfig, annotated);
        }
        return findPolymorphicTypeInfo;
    }

    @Override
    public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        TypeResolverBuilder<?> findTypeResolver = this._primary.findTypeResolver(mapperConfig, annotatedClass, javaType);
        if (findTypeResolver == null) {
            findTypeResolver = this._secondary.findTypeResolver(mapperConfig, annotatedClass, javaType);
        }
        return findTypeResolver;
    }

    @Override
    public TypeResolverBuilder<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        TypeResolverBuilder<?> findPropertyTypeResolver = this._primary.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType);
        if (findPropertyTypeResolver == null) {
            findPropertyTypeResolver = this._secondary.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType);
        }
        return findPropertyTypeResolver;
    }

    @Override
    public TypeResolverBuilder<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        TypeResolverBuilder<?> findPropertyContentTypeResolver = this._primary.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType);
        if (findPropertyContentTypeResolver == null) {
            findPropertyContentTypeResolver = this._secondary.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType);
        }
        return findPropertyContentTypeResolver;
    }

    @Override
    public List<NamedType> findSubtypes(Annotated annotated) {
        List<NamedType> findSubtypes = this._primary.findSubtypes(annotated);
        List<NamedType> findSubtypes2 = this._secondary.findSubtypes(annotated);
        if (findSubtypes == null || findSubtypes.isEmpty()) {
            return findSubtypes2;
        }
        if (findSubtypes2 == null || findSubtypes2.isEmpty()) {
            return findSubtypes;
        }
        ArrayList arrayList = new ArrayList(findSubtypes.size() + findSubtypes2.size());
        arrayList.addAll(findSubtypes);
        arrayList.addAll(findSubtypes2);
        return arrayList;
    }

    @Override
    public String findTypeName(AnnotatedClass annotatedClass) {
        String findTypeName = this._primary.findTypeName(annotatedClass);
        if (findTypeName == null || findTypeName.isEmpty()) {
            findTypeName = this._secondary.findTypeName(annotatedClass);
        }
        return findTypeName;
    }

    @Override
    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        AnnotationIntrospector.ReferenceProperty findReferenceType = this._primary.findReferenceType(annotatedMember);
        return findReferenceType == null ? this._secondary.findReferenceType(annotatedMember) : findReferenceType;
    }

    @Override
    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        NameTransformer findUnwrappingNameTransformer = this._primary.findUnwrappingNameTransformer(annotatedMember);
        return findUnwrappingNameTransformer == null ? this._secondary.findUnwrappingNameTransformer(annotatedMember) : findUnwrappingNameTransformer;
    }

    @Override
    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        JacksonInject.Value findInjectableValue = this._primary.findInjectableValue(annotatedMember);
        if (findInjectableValue == null || findInjectableValue.getUseInput() == null) {
            JacksonInject.Value findInjectableValue2 = this._secondary.findInjectableValue(annotatedMember);
            if (findInjectableValue2 != null) {
                findInjectableValue = findInjectableValue == null ? findInjectableValue2 : findInjectableValue.withUseInput(findInjectableValue2.getUseInput());
            }
        }
        return findInjectableValue;
    }

    @Override
    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return this._primary.hasIgnoreMarker(annotatedMember) || this._secondary.hasIgnoreMarker(annotatedMember);
    }

    @Override
    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        Boolean hasRequiredMarker = this._primary.hasRequiredMarker(annotatedMember);
        return hasRequiredMarker == null ? this._secondary.hasRequiredMarker(annotatedMember) : hasRequiredMarker;
    }

    @Override
    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        Object findInjectableValueId = this._primary.findInjectableValueId(annotatedMember);
        return findInjectableValueId == null ? this._secondary.findInjectableValueId(annotatedMember) : findInjectableValueId;
    }

    @Override
    public Object findSerializer(Annotated annotated) {
        Object findSerializer = this._primary.findSerializer(annotated);
        return _isExplicitClassOrOb(findSerializer, JsonSerializer.None.class) ? findSerializer : _explicitClassOrOb(this._secondary.findSerializer(annotated), JsonSerializer.None.class);
    }

    @Override
    public Object findKeySerializer(Annotated annotated) {
        Object findKeySerializer = this._primary.findKeySerializer(annotated);
        return _isExplicitClassOrOb(findKeySerializer, JsonSerializer.None.class) ? findKeySerializer : _explicitClassOrOb(this._secondary.findKeySerializer(annotated), JsonSerializer.None.class);
    }

    @Override
    public Object findContentSerializer(Annotated annotated) {
        Object findContentSerializer = this._primary.findContentSerializer(annotated);
        return _isExplicitClassOrOb(findContentSerializer, JsonSerializer.None.class) ? findContentSerializer : _explicitClassOrOb(this._secondary.findContentSerializer(annotated), JsonSerializer.None.class);
    }

    @Override
    public Object findNullSerializer(Annotated annotated) {
        Object findNullSerializer = this._primary.findNullSerializer(annotated);
        return _isExplicitClassOrOb(findNullSerializer, JsonSerializer.None.class) ? findNullSerializer : _explicitClassOrOb(this._secondary.findNullSerializer(annotated), JsonSerializer.None.class);
    }

    @Override
    public JsonInclude.Value findPropertyInclusion(Annotated annotated) {
        JsonInclude.Value findPropertyInclusion = this._secondary.findPropertyInclusion(annotated);
        JsonInclude.Value findPropertyInclusion2 = this._primary.findPropertyInclusion(annotated);
        return findPropertyInclusion == null ? findPropertyInclusion2 : findPropertyInclusion.withOverrides(findPropertyInclusion2);
    }

    @Override
    public JsonSerialize.Typing findSerializationTyping(Annotated annotated) {
        JsonSerialize.Typing findSerializationTyping = this._primary.findSerializationTyping(annotated);
        return findSerializationTyping == null ? this._secondary.findSerializationTyping(annotated) : findSerializationTyping;
    }

    @Override
    public Object findSerializationConverter(Annotated annotated) {
        Object findSerializationConverter = this._primary.findSerializationConverter(annotated);
        return findSerializationConverter == null ? this._secondary.findSerializationConverter(annotated) : findSerializationConverter;
    }

    @Override
    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        Object findSerializationContentConverter = this._primary.findSerializationContentConverter(annotatedMember);
        return findSerializationContentConverter == null ? this._secondary.findSerializationContentConverter(annotatedMember) : findSerializationContentConverter;
    }

    @Override
    public Class<?>[] findViews(Annotated annotated) {
        Class<?>[] findViews = this._primary.findViews(annotated);
        if (findViews == null) {
            findViews = this._secondary.findViews(annotated);
        }
        return findViews;
    }

    @Override
    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        Boolean isTypeId = this._primary.isTypeId(annotatedMember);
        return isTypeId == null ? this._secondary.isTypeId(annotatedMember) : isTypeId;
    }

    @Override
    public ObjectIdInfo findObjectIdInfo(Annotated annotated) {
        ObjectIdInfo findObjectIdInfo = this._primary.findObjectIdInfo(annotated);
        return findObjectIdInfo == null ? this._secondary.findObjectIdInfo(annotated) : findObjectIdInfo;
    }

    @Override
    public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectIdInfo) {
        return this._primary.findObjectReferenceInfo(annotated, this._secondary.findObjectReferenceInfo(annotated, objectIdInfo));
    }

    @Override
    public JsonFormat.Value findFormat(Annotated annotated) {
        JsonFormat.Value findFormat = this._primary.findFormat(annotated);
        JsonFormat.Value findFormat2 = this._secondary.findFormat(annotated);
        return findFormat2 == null ? findFormat : findFormat2.withOverrides(findFormat);
    }

    @Override
    public PropertyName findWrapperName(Annotated annotated) {
        return PropertyName.merge(this._primary.findWrapperName(annotated), this._secondary.findWrapperName(annotated));
    }

    @Override
    public String findPropertyDefaultValue(Annotated annotated) {
        String findPropertyDefaultValue = this._primary.findPropertyDefaultValue(annotated);
        return (findPropertyDefaultValue == null || findPropertyDefaultValue.isEmpty()) ? this._secondary.findPropertyDefaultValue(annotated) : findPropertyDefaultValue;
    }

    @Override
    public String findPropertyDescription(Annotated annotated) {
        String findPropertyDescription = this._primary.findPropertyDescription(annotated);
        return findPropertyDescription == null ? this._secondary.findPropertyDescription(annotated) : findPropertyDescription;
    }

    @Override
    public Integer findPropertyIndex(Annotated annotated) {
        Integer findPropertyIndex = this._primary.findPropertyIndex(annotated);
        return findPropertyIndex == null ? this._secondary.findPropertyIndex(annotated) : findPropertyIndex;
    }

    @Override
    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        String findImplicitPropertyName = this._primary.findImplicitPropertyName(annotatedMember);
        return findImplicitPropertyName == null ? this._secondary.findImplicitPropertyName(annotatedMember) : findImplicitPropertyName;
    }

    @Override
    public List<PropertyName> findPropertyAliases(Annotated annotated) {
        List<PropertyName> findPropertyAliases = this._primary.findPropertyAliases(annotated);
        return findPropertyAliases == null ? this._secondary.findPropertyAliases(annotated) : findPropertyAliases;
    }

    @Override
    public JsonProperty.Access findPropertyAccess(Annotated annotated) {
        JsonProperty.Access findPropertyAccess = this._primary.findPropertyAccess(annotated);
        if (findPropertyAccess != null && findPropertyAccess != JsonProperty.Access.AUTO) {
            return findPropertyAccess;
        }
        JsonProperty.Access findPropertyAccess2 = this._secondary.findPropertyAccess(annotated);
        return findPropertyAccess2 != null ? findPropertyAccess2 : JsonProperty.Access.AUTO;
    }

    @Override
    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        AnnotatedMethod resolveSetterConflict = this._primary.resolveSetterConflict(mapperConfig, annotatedMethod, annotatedMethod2);
        if (resolveSetterConflict == null) {
            resolveSetterConflict = this._secondary.resolveSetterConflict(mapperConfig, annotatedMethod, annotatedMethod2);
        }
        return resolveSetterConflict;
    }

    @Override
    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        return PropertyName.merge(this._secondary.findRenameByField(mapperConfig, annotatedField, propertyName), this._primary.findRenameByField(mapperConfig, annotatedField, propertyName));
    }

    @Override
    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws JsonMappingException {
        return this._primary.refineSerializationType(mapperConfig, annotated, this._secondary.refineSerializationType(mapperConfig, annotated, javaType));
    }

    @Override
    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedClass) {
        String[] findSerializationPropertyOrder = this._primary.findSerializationPropertyOrder(annotatedClass);
        return findSerializationPropertyOrder == null ? this._secondary.findSerializationPropertyOrder(annotatedClass) : findSerializationPropertyOrder;
    }

    @Override
    public Boolean findSerializationSortAlphabetically(Annotated annotated) {
        Boolean findSerializationSortAlphabetically = this._primary.findSerializationSortAlphabetically(annotated);
        return findSerializationSortAlphabetically == null ? this._secondary.findSerializationSortAlphabetically(annotated) : findSerializationSortAlphabetically;
    }

    @Override
    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, List<BeanPropertyWriter> list) {
        this._primary.findAndAddVirtualProperties(mapperConfig, annotatedClass, list);
        this._secondary.findAndAddVirtualProperties(mapperConfig, annotatedClass, list);
    }

    @Override
    public PropertyName findNameForSerialization(Annotated annotated) {
        return PropertyName.merge(this._primary.findNameForSerialization(annotated), this._secondary.findNameForSerialization(annotated));
    }

    @Override
    public Boolean hasAsKey(MapperConfig<?> mapperConfig, Annotated annotated) {
        Boolean hasAsKey = this._primary.hasAsKey(mapperConfig, annotated);
        if (hasAsKey == null) {
            hasAsKey = this._secondary.hasAsKey(mapperConfig, annotated);
        }
        return hasAsKey;
    }

    @Override
    public Boolean hasAsValue(Annotated annotated) {
        Boolean hasAsValue = this._primary.hasAsValue(annotated);
        if (hasAsValue == null) {
            hasAsValue = this._secondary.hasAsValue(annotated);
        }
        return hasAsValue;
    }

    @Override
    public Boolean hasAnyGetter(Annotated annotated) {
        Boolean hasAnyGetter = this._primary.hasAnyGetter(annotated);
        if (hasAnyGetter == null) {
            hasAnyGetter = this._secondary.hasAnyGetter(annotated);
        }
        return hasAnyGetter;
    }

    @Override
    @Deprecated
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return this._primary.findEnumValues(cls, enumArr, this._secondary.findEnumValues(cls, enumArr, strArr));
    }

    @Override
    public String[] findEnumValues(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, Enum<?>[] enumArr, String[] strArr) {
        return this._primary.findEnumValues(mapperConfig, annotatedClass, enumArr, this._secondary.findEnumValues(mapperConfig, annotatedClass, enumArr, strArr));
    }

    @Override
    @Deprecated
    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        this._secondary.findEnumAliases(cls, enumArr, strArr);
        this._primary.findEnumAliases(cls, enumArr, strArr);
    }

    @Override
    public void findEnumAliases(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, Enum<?>[] enumArr, String[][] strArr) {
        this._secondary.findEnumAliases(mapperConfig, annotatedClass, enumArr, strArr);
        this._primary.findEnumAliases(mapperConfig, annotatedClass, enumArr, strArr);
    }

    @Override
    @Deprecated
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        Enum<?> findDefaultEnumValue = this._primary.findDefaultEnumValue(cls);
        return findDefaultEnumValue == null ? this._secondary.findDefaultEnumValue(cls) : findDefaultEnumValue;
    }

    @Override
    public Enum<?> findDefaultEnumValue(AnnotatedClass annotatedClass, Enum<?>[] enumArr) {
        Enum<?> findDefaultEnumValue = this._primary.findDefaultEnumValue(annotatedClass, enumArr);
        return findDefaultEnumValue == null ? this._secondary.findDefaultEnumValue(annotatedClass, enumArr) : findDefaultEnumValue;
    }

    @Override
    @Deprecated
    public String findEnumValue(Enum<?> r4) {
        String findEnumValue = this._primary.findEnumValue(r4);
        return findEnumValue == null ? this._secondary.findEnumValue(r4) : findEnumValue;
    }

    @Override
    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAsValueAnnotation(annotatedMethod) || this._secondary.hasAsValueAnnotation(annotatedMethod);
    }

    @Override
    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAnyGetterAnnotation(annotatedMethod) || this._secondary.hasAnyGetterAnnotation(annotatedMethod);
    }

    @Override
    public Object findDeserializer(Annotated annotated) {
        Object findDeserializer = this._primary.findDeserializer(annotated);
        return _isExplicitClassOrOb(findDeserializer, JsonDeserializer.None.class) ? findDeserializer : _explicitClassOrOb(this._secondary.findDeserializer(annotated), JsonDeserializer.None.class);
    }

    @Override
    public Object findKeyDeserializer(Annotated annotated) {
        Object findKeyDeserializer = this._primary.findKeyDeserializer(annotated);
        return _isExplicitClassOrOb(findKeyDeserializer, KeyDeserializer.None.class) ? findKeyDeserializer : _explicitClassOrOb(this._secondary.findKeyDeserializer(annotated), KeyDeserializer.None.class);
    }

    @Override
    public Object findContentDeserializer(Annotated annotated) {
        Object findContentDeserializer = this._primary.findContentDeserializer(annotated);
        return _isExplicitClassOrOb(findContentDeserializer, JsonDeserializer.None.class) ? findContentDeserializer : _explicitClassOrOb(this._secondary.findContentDeserializer(annotated), JsonDeserializer.None.class);
    }

    @Override
    public Object findDeserializationConverter(Annotated annotated) {
        Object findDeserializationConverter = this._primary.findDeserializationConverter(annotated);
        return findDeserializationConverter == null ? this._secondary.findDeserializationConverter(annotated) : findDeserializationConverter;
    }

    @Override
    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        Object findDeserializationContentConverter = this._primary.findDeserializationContentConverter(annotatedMember);
        return findDeserializationContentConverter == null ? this._secondary.findDeserializationContentConverter(annotatedMember) : findDeserializationContentConverter;
    }

    @Override
    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws JsonMappingException {
        return this._primary.refineDeserializationType(mapperConfig, annotated, this._secondary.refineDeserializationType(mapperConfig, annotated, javaType));
    }

    @Override
    public Object findValueInstantiator(AnnotatedClass annotatedClass) {
        Object findValueInstantiator = this._primary.findValueInstantiator(annotatedClass);
        return findValueInstantiator == null ? this._secondary.findValueInstantiator(annotatedClass) : findValueInstantiator;
    }

    @Override
    public Class<?> findPOJOBuilder(AnnotatedClass annotatedClass) {
        Class<?> findPOJOBuilder = this._primary.findPOJOBuilder(annotatedClass);
        return findPOJOBuilder == null ? this._secondary.findPOJOBuilder(annotatedClass) : findPOJOBuilder;
    }

    @Override
    public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedClass) {
        JsonPOJOBuilder.Value findPOJOBuilderConfig = this._primary.findPOJOBuilderConfig(annotatedClass);
        return findPOJOBuilderConfig == null ? this._secondary.findPOJOBuilderConfig(annotatedClass) : findPOJOBuilderConfig;
    }

    @Override
    public PropertyName findNameForDeserialization(Annotated annotated) {
        return PropertyName.merge(this._primary.findNameForDeserialization(annotated), this._secondary.findNameForDeserialization(annotated));
    }

    @Override
    public Boolean hasAnySetter(Annotated annotated) {
        Boolean hasAnySetter = this._primary.hasAnySetter(annotated);
        if (hasAnySetter == null) {
            hasAnySetter = this._secondary.hasAnySetter(annotated);
        }
        return hasAnySetter;
    }

    @Override
    public JsonSetter.Value findSetterInfo(Annotated annotated) {
        JsonSetter.Value findSetterInfo = this._secondary.findSetterInfo(annotated);
        JsonSetter.Value findSetterInfo2 = this._primary.findSetterInfo(annotated);
        return findSetterInfo == null ? findSetterInfo2 : findSetterInfo.withOverrides(findSetterInfo2);
    }

    @Override
    public Boolean findMergeInfo(Annotated annotated) {
        Boolean findMergeInfo = this._primary.findMergeInfo(annotated);
        if (findMergeInfo == null) {
            findMergeInfo = this._secondary.findMergeInfo(annotated);
        }
        return findMergeInfo;
    }

    @Override
    @Deprecated
    public boolean hasCreatorAnnotation(Annotated annotated) {
        return this._primary.hasCreatorAnnotation(annotated) || this._secondary.hasCreatorAnnotation(annotated);
    }

    @Override
    @Deprecated
    public JsonCreator.Mode findCreatorBinding(Annotated annotated) {
        JsonCreator.Mode findCreatorBinding = this._primary.findCreatorBinding(annotated);
        return findCreatorBinding != null ? findCreatorBinding : this._secondary.findCreatorBinding(annotated);
    }

    @Override
    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonCreator.Mode findCreatorAnnotation = this._primary.findCreatorAnnotation(mapperConfig, annotated);
        return findCreatorAnnotation == null ? this._secondary.findCreatorAnnotation(mapperConfig, annotated) : findCreatorAnnotation;
    }

    @Override
    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAnySetterAnnotation(annotatedMethod) || this._secondary.hasAnySetterAnnotation(annotatedMethod);
    }

    protected boolean _isExplicitClassOrOb(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return false;
        }
        return ((obj instanceof Class) && ClassUtil.isBogusClass((Class) obj)) ? false : true;
    }

    protected Object _explicitClassOrOb(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return null;
        }
        if ((obj instanceof Class) && ClassUtil.isBogusClass((Class) obj)) {
            return null;
        }
        return obj;
    }
}
