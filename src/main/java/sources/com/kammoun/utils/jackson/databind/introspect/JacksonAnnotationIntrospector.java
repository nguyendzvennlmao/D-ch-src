package com.kammoun.utils.jackson.databind.introspect;

import com.kammoun.utils.jackson.annotation.JacksonAnnotationsInside;
import com.kammoun.utils.jackson.annotation.JacksonInject;
import com.kammoun.utils.jackson.annotation.JsonAlias;
import com.kammoun.utils.jackson.annotation.JsonAnyGetter;
import com.kammoun.utils.jackson.annotation.JsonAnySetter;
import com.kammoun.utils.jackson.annotation.JsonAutoDetect;
import com.kammoun.utils.jackson.annotation.JsonBackReference;
import com.kammoun.utils.jackson.annotation.JsonClassDescription;
import com.kammoun.utils.jackson.annotation.JsonCreator;
import com.kammoun.utils.jackson.annotation.JsonEnumDefaultValue;
import com.kammoun.utils.jackson.annotation.JsonFilter;
import com.kammoun.utils.jackson.annotation.JsonFormat;
import com.kammoun.utils.jackson.annotation.JsonGetter;
import com.kammoun.utils.jackson.annotation.JsonIdentityInfo;
import com.kammoun.utils.jackson.annotation.JsonIdentityReference;
import com.kammoun.utils.jackson.annotation.JsonIgnore;
import com.kammoun.utils.jackson.annotation.JsonIgnoreProperties;
import com.kammoun.utils.jackson.annotation.JsonIgnoreType;
import com.kammoun.utils.jackson.annotation.JsonInclude;
import com.kammoun.utils.jackson.annotation.JsonIncludeProperties;
import com.kammoun.utils.jackson.annotation.JsonKey;
import com.kammoun.utils.jackson.annotation.JsonManagedReference;
import com.kammoun.utils.jackson.annotation.JsonMerge;
import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.annotation.JsonPropertyDescription;
import com.kammoun.utils.jackson.annotation.JsonPropertyOrder;
import com.kammoun.utils.jackson.annotation.JsonRawValue;
import com.kammoun.utils.jackson.annotation.JsonRootName;
import com.kammoun.utils.jackson.annotation.JsonSetter;
import com.kammoun.utils.jackson.annotation.JsonSubTypes;
import com.kammoun.utils.jackson.annotation.JsonTypeId;
import com.kammoun.utils.jackson.annotation.JsonTypeInfo;
import com.kammoun.utils.jackson.annotation.JsonTypeName;
import com.kammoun.utils.jackson.annotation.JsonUnwrapped;
import com.kammoun.utils.jackson.annotation.JsonValue;
import com.kammoun.utils.jackson.annotation.JsonView;
import com.kammoun.utils.jackson.annotation.ObjectIdGenerators;
import com.kammoun.utils.jackson.core.Version;
import com.kammoun.utils.jackson.databind.AnnotationIntrospector;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.JsonSerializer;
import com.kammoun.utils.jackson.databind.KeyDeserializer;
import com.kammoun.utils.jackson.databind.MapperFeature;
import com.kammoun.utils.jackson.databind.PropertyMetadata;
import com.kammoun.utils.jackson.databind.PropertyName;
import com.kammoun.utils.jackson.databind.annotation.EnumNaming;
import com.kammoun.utils.jackson.databind.annotation.JsonAppend;
import com.kammoun.utils.jackson.databind.annotation.JsonDeserialize;
import com.kammoun.utils.jackson.databind.annotation.JsonNaming;
import com.kammoun.utils.jackson.databind.annotation.JsonPOJOBuilder;
import com.kammoun.utils.jackson.databind.annotation.JsonSerialize;
import com.kammoun.utils.jackson.databind.annotation.JsonTypeIdResolver;
import com.kammoun.utils.jackson.databind.annotation.JsonTypeResolver;
import com.kammoun.utils.jackson.databind.annotation.JsonValueInstantiator;
import com.kammoun.utils.jackson.databind.cfg.HandlerInstantiator;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;
import com.kammoun.utils.jackson.databind.cfg.PackageVersion;
import com.kammoun.utils.jackson.databind.ext.Java7Support;
import com.kammoun.utils.jackson.databind.jsontype.NamedType;
import com.kammoun.utils.jackson.databind.jsontype.TypeIdResolver;
import com.kammoun.utils.jackson.databind.jsontype.TypeResolverBuilder;
import com.kammoun.utils.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.kammoun.utils.jackson.databind.ser.BeanPropertyWriter;
import com.kammoun.utils.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.kammoun.utils.jackson.databind.ser.impl.AttributePropertyWriter;
import com.kammoun.utils.jackson.databind.ser.std.RawSerializer;
import com.kammoun.utils.jackson.databind.type.MapLikeType;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import com.kammoun.utils.jackson.databind.util.Converter;
import com.kammoun.utils.jackson.databind.util.ExceptionUtil;
import com.kammoun.utils.jackson.databind.util.LRUMap;
import com.kammoun.utils.jackson.databind.util.NameTransformer;
import com.kammoun.utils.jackson.databind.util.SimpleBeanPropertyDefinition;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public class JacksonAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    private static final long serialVersionUID = 1;
    private static final Class<? extends Annotation>[] ANNOTATIONS_TO_INFER_SER = {JsonSerialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonRawValue.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class};
    private static final Class<? extends Annotation>[] ANNOTATIONS_TO_INFER_DESER = {JsonDeserialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class, JsonMerge.class};
    private static final Java7Support _java7Helper;
    protected transient LRUMap<String, Boolean> _annotationsInside = new LRUMap<>(48, 48);
    protected boolean _cfgConstructorPropertiesImpliesCreator = true;

    @Override
    public Version version() {
        return PackageVersion.VERSION;
    }

    protected Object readResolve() {
        if (this._annotationsInside == null) {
            this._annotationsInside = new LRUMap<>(48, 48);
        }
        return this;
    }

    public JacksonAnnotationIntrospector setConstructorPropertiesImpliesCreator(boolean z) {
        this._cfgConstructorPropertiesImpliesCreator = z;
        return this;
    }

    @Override
    public boolean isAnnotationBundle(Annotation annotation) {
        Class<? extends Annotation> annotationType = annotation.annotationType();
        String name = annotationType.getName();
        Boolean bool = this._annotationsInside.get(name);
        if (bool == null) {
            bool = Boolean.valueOf(annotationType.getAnnotation(JacksonAnnotationsInside.class) != null);
            this._annotationsInside.putIfAbsent(name, bool);
        }
        return bool.booleanValue();
    }

    @Override
    @Deprecated
    public String findEnumValue(Enum<?> r4) {
        JsonProperty jsonProperty;
        String value;
        try {
            Field field = r4.getDeclaringClass().getField(r4.name());
            if (field != null && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null && (value = jsonProperty.value()) != null) {
                if (!value.isEmpty()) {
                    return value;
                }
            }
        } catch (NoSuchFieldException e) {
        } catch (SecurityException e2) {
        }
        return r4.name();
    }

    @Override
    @Deprecated
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        JsonProperty jsonProperty;
        HashMap hashMap = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null) {
                String value = jsonProperty.value();
                if (!value.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(field.getName(), value);
                }
            }
        }
        if (hashMap != null) {
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) hashMap.get(enumArr[i].name());
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return strArr;
    }

    @Override
    public String[] findEnumValues(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, Enum<?>[] enumArr, String[] strArr) {
        String value;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotatedField annotatedField : annotatedClass.fields()) {
            JsonProperty jsonProperty = (JsonProperty) annotatedField.getAnnotation(JsonProperty.class);
            if (jsonProperty != null && (value = jsonProperty.value()) != null && !value.isEmpty()) {
                linkedHashMap.put(annotatedField.getName(), value);
            }
        }
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            String str = (String) linkedHashMap.get(enumArr[i].name());
            if (str != null) {
                strArr[i] = str;
            }
        }
        return strArr;
    }

    @Override
    @Deprecated
    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        JsonAlias jsonAlias;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (jsonAlias = (JsonAlias) field.getAnnotation(JsonAlias.class)) != null) {
                String[] value = jsonAlias.value();
                if (value.length != 0) {
                    String name = field.getName();
                    int length = enumArr.length;
                    for (int i = 0; i < length; i++) {
                        if (name.equals(enumArr[i].name())) {
                            strArr[i] = value;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void findEnumAliases(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, Enum<?>[] enumArr, String[][] strArr) {
        HashMap hashMap = new HashMap();
        for (AnnotatedField annotatedField : annotatedClass.fields()) {
            JsonAlias jsonAlias = (JsonAlias) annotatedField.getAnnotation(JsonAlias.class);
            if (jsonAlias != null) {
                hashMap.putIfAbsent(annotatedField.getName(), jsonAlias.value());
            }
        }
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            strArr[i] = (String[]) hashMap.getOrDefault(enumArr[i].name(), new String[0]);
        }
    }

    @Override
    @Deprecated
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return ClassUtil.findFirstAnnotatedEnumValue(cls, JsonEnumDefaultValue.class);
    }

    @Override
    public Enum<?> findDefaultEnumValue(AnnotatedClass annotatedClass, Enum<?>[] enumArr) {
        for (AnnotatedField annotatedField : annotatedClass.fields()) {
            if (annotatedField.getType().isEnumType() && ((JsonEnumDefaultValue) _findAnnotation(annotatedField, JsonEnumDefaultValue.class)) != null) {
                for (Enum<?> r0 : enumArr) {
                    if (r0.name().equals(annotatedField.getName())) {
                        return r0;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public PropertyName findRootName(AnnotatedClass annotatedClass) {
        JsonRootName jsonRootName = (JsonRootName) _findAnnotation(annotatedClass, JsonRootName.class);
        if (jsonRootName == null) {
            return null;
        }
        String namespace = jsonRootName.namespace();
        if (namespace != null && namespace.isEmpty()) {
            namespace = null;
        }
        return PropertyName.construct(jsonRootName.value(), namespace);
    }

    @Override
    public Boolean isIgnorableType(AnnotatedClass annotatedClass) {
        JsonIgnoreType jsonIgnoreType = (JsonIgnoreType) _findAnnotation(annotatedClass, JsonIgnoreType.class);
        if (jsonIgnoreType == null) {
            return null;
        }
        return Boolean.valueOf(jsonIgnoreType.value());
    }

    @Override
    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonIgnoreProperties jsonIgnoreProperties = (JsonIgnoreProperties) _findAnnotation(annotated, JsonIgnoreProperties.class);
        return jsonIgnoreProperties == null ? JsonIgnoreProperties.Value.empty() : JsonIgnoreProperties.Value.from(jsonIgnoreProperties);
    }

    @Override
    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(Annotated annotated) {
        return findPropertyIgnoralByName(null, annotated);
    }

    @Override
    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonIncludeProperties jsonIncludeProperties = (JsonIncludeProperties) _findAnnotation(annotated, JsonIncludeProperties.class);
        return jsonIncludeProperties == null ? JsonIncludeProperties.Value.all() : JsonIncludeProperties.Value.from(jsonIncludeProperties);
    }

    @Override
    public Object findFilterId(Annotated annotated) {
        JsonFilter jsonFilter = (JsonFilter) _findAnnotation(annotated, JsonFilter.class);
        if (jsonFilter == null) {
            return null;
        }
        String value = jsonFilter.value();
        if (value.isEmpty()) {
            return null;
        }
        return value;
    }

    @Override
    public Object findNamingStrategy(AnnotatedClass annotatedClass) {
        JsonNaming jsonNaming = (JsonNaming) _findAnnotation(annotatedClass, JsonNaming.class);
        if (jsonNaming == null) {
            return null;
        }
        return jsonNaming.value();
    }

    @Override
    public Object findEnumNamingStrategy(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        EnumNaming enumNaming = (EnumNaming) _findAnnotation(annotatedClass, EnumNaming.class);
        if (enumNaming == null) {
            return null;
        }
        return enumNaming.value();
    }

    @Override
    public String findClassDescription(AnnotatedClass annotatedClass) {
        JsonClassDescription jsonClassDescription = (JsonClassDescription) _findAnnotation(annotatedClass, JsonClassDescription.class);
        if (jsonClassDescription == null) {
            return null;
        }
        return jsonClassDescription.value();
    }

    @Override
    public VisibilityChecker<?> findAutoDetectVisibility(AnnotatedClass annotatedClass, VisibilityChecker<?> visibilityChecker) {
        JsonAutoDetect jsonAutoDetect = (JsonAutoDetect) _findAnnotation(annotatedClass, JsonAutoDetect.class);
        return jsonAutoDetect == null ? visibilityChecker : visibilityChecker.with(jsonAutoDetect);
    }

    @Override
    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        PropertyName _findConstructorName = _findConstructorName(annotatedMember);
        if (_findConstructorName == null) {
            return null;
        }
        return _findConstructorName.getSimpleName();
    }

    @Override
    public List<PropertyName> findPropertyAliases(Annotated annotated) {
        JsonAlias jsonAlias = (JsonAlias) _findAnnotation(annotated, JsonAlias.class);
        if (jsonAlias == null) {
            return null;
        }
        String[] value = jsonAlias.value();
        int length = value.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (String str : value) {
            arrayList.add(PropertyName.construct(str));
        }
        return arrayList;
    }

    @Override
    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return _isIgnorable(annotatedMember);
    }

    @Override
    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotatedMember, JsonProperty.class);
        if (jsonProperty != null) {
            return Boolean.valueOf(jsonProperty.required());
        }
        return null;
    }

    @Override
    public JsonProperty.Access findPropertyAccess(Annotated annotated) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.access();
        }
        return null;
    }

    @Override
    public String findPropertyDescription(Annotated annotated) {
        JsonPropertyDescription jsonPropertyDescription = (JsonPropertyDescription) _findAnnotation(annotated, JsonPropertyDescription.class);
        if (jsonPropertyDescription == null) {
            return null;
        }
        return jsonPropertyDescription.value();
    }

    @Override
    public Integer findPropertyIndex(Annotated annotated) {
        int index;
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty == null || (index = jsonProperty.index()) == -1) {
            return null;
        }
        return Integer.valueOf(index);
    }

    @Override
    public String findPropertyDefaultValue(Annotated annotated) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty == null) {
            return null;
        }
        String defaultValue = jsonProperty.defaultValue();
        if (defaultValue.isEmpty()) {
            return null;
        }
        return defaultValue;
    }

    @Override
    public JsonFormat.Value findFormat(Annotated annotated) {
        JsonFormat jsonFormat = (JsonFormat) _findAnnotation(annotated, JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        return JsonFormat.Value.from(jsonFormat);
    }

    @Override
    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        JsonManagedReference jsonManagedReference = (JsonManagedReference) _findAnnotation(annotatedMember, JsonManagedReference.class);
        if (jsonManagedReference != null) {
            return AnnotationIntrospector.ReferenceProperty.managed(jsonManagedReference.value());
        }
        JsonBackReference jsonBackReference = (JsonBackReference) _findAnnotation(annotatedMember, JsonBackReference.class);
        if (jsonBackReference != null) {
            return AnnotationIntrospector.ReferenceProperty.back(jsonBackReference.value());
        }
        return null;
    }

    @Override
    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        JsonUnwrapped jsonUnwrapped = (JsonUnwrapped) _findAnnotation(annotatedMember, JsonUnwrapped.class);
        if (jsonUnwrapped == null || !jsonUnwrapped.enabled()) {
            return null;
        }
        return NameTransformer.simpleTransformer(jsonUnwrapped.prefix(), jsonUnwrapped.suffix());
    }

    @Override
    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        String name;
        JacksonInject jacksonInject = (JacksonInject) _findAnnotation(annotatedMember, JacksonInject.class);
        if (jacksonInject == null) {
            return null;
        }
        JacksonInject.Value from = JacksonInject.Value.from(jacksonInject);
        if (!from.hasId()) {
            if (annotatedMember instanceof AnnotatedMethod) {
                AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
                name = annotatedMethod.getParameterCount() == 0 ? annotatedMember.getRawType().getName() : annotatedMethod.getRawParameterType(0).getName();
            } else {
                name = annotatedMember.getRawType().getName();
            }
            from = from.withId(name);
        }
        return from;
    }

    @Override
    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        JacksonInject.Value findInjectableValue = findInjectableValue(annotatedMember);
        if (findInjectableValue == null) {
            return null;
        }
        return findInjectableValue.getId();
    }

    @Override
    public Class<?>[] findViews(Annotated annotated) {
        JsonView jsonView = (JsonView) _findAnnotation(annotated, JsonView.class);
        if (jsonView == null) {
            return null;
        }
        return jsonView.value();
    }

    @Override
    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<?> rawParameterType = annotatedMethod.getRawParameterType(0);
        Class<?> rawParameterType2 = annotatedMethod2.getRawParameterType(0);
        if (rawParameterType.isPrimitive()) {
            if (rawParameterType2.isPrimitive()) {
                return null;
            }
            return annotatedMethod;
        }
        if (rawParameterType2.isPrimitive()) {
            return annotatedMethod2;
        }
        if (rawParameterType == String.class) {
            if (rawParameterType2 != String.class) {
                return annotatedMethod;
            }
            return null;
        }
        if (rawParameterType2 == String.class) {
            return annotatedMethod2;
        }
        return null;
    }

    @Override
    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        return null;
    }

    @Override
    public JsonTypeInfo.Value findPolymorphicTypeInfo(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonTypeInfo jsonTypeInfo = (JsonTypeInfo) _findAnnotation(annotated, JsonTypeInfo.class);
        if (jsonTypeInfo == null) {
            return null;
        }
        return JsonTypeInfo.Value.from(jsonTypeInfo);
    }

    @Override
    public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        return _findTypeResolver(mapperConfig, annotatedClass, javaType);
    }

    @Override
    public TypeResolverBuilder<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return null;
        }
        return _findTypeResolver(mapperConfig, annotatedMember, javaType);
    }

    @Override
    public TypeResolverBuilder<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.getContentType() == null) {
            throw new IllegalArgumentException("Must call method with a container or reference type (got " + javaType + ")");
        }
        return _findTypeResolver(mapperConfig, annotatedMember, javaType);
    }

    @Override
    public List<NamedType> findSubtypes(Annotated annotated) {
        JsonSubTypes jsonSubTypes = (JsonSubTypes) _findAnnotation(annotated, JsonSubTypes.class);
        if (jsonSubTypes == null) {
            return null;
        }
        JsonSubTypes.Type[] value = jsonSubTypes.value();
        if (jsonSubTypes.failOnRepeatedNames()) {
            return findSubtypesCheckRepeatedNames(annotated.getName(), value);
        }
        ArrayList arrayList = new ArrayList(value.length);
        for (JsonSubTypes.Type type : value) {
            arrayList.add(new NamedType(type.value(), type.name()));
            for (String str : type.names()) {
                arrayList.add(new NamedType(type.value(), str));
            }
        }
        return arrayList;
    }

    private List<NamedType> findSubtypesCheckRepeatedNames(String str, JsonSubTypes.Type[] typeArr) {
        ArrayList arrayList = new ArrayList(typeArr.length);
        HashSet hashSet = new HashSet();
        for (JsonSubTypes.Type type : typeArr) {
            String name = type.name();
            if (!name.isEmpty() && hashSet.contains(name)) {
                throw new IllegalArgumentException("Annotated type [" + str + "] got repeated subtype name [" + name + "]");
            }
            hashSet.add(name);
            arrayList.add(new NamedType(type.value(), name));
            for (String str2 : type.names()) {
                if (!str2.isEmpty() && hashSet.contains(str2)) {
                    throw new IllegalArgumentException("Annotated type [" + str + "] got repeated subtype name [" + str2 + "]");
                }
                hashSet.add(str2);
                arrayList.add(new NamedType(type.value(), str2));
            }
        }
        return arrayList;
    }

    @Override
    public String findTypeName(AnnotatedClass annotatedClass) {
        JsonTypeName jsonTypeName = (JsonTypeName) _findAnnotation(annotatedClass, JsonTypeName.class);
        if (jsonTypeName == null) {
            return null;
        }
        return jsonTypeName.value();
    }

    @Override
    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return Boolean.valueOf(_hasAnnotation(annotatedMember, JsonTypeId.class));
    }

    @Override
    public ObjectIdInfo findObjectIdInfo(Annotated annotated) {
        JsonIdentityInfo jsonIdentityInfo = (JsonIdentityInfo) _findAnnotation(annotated, JsonIdentityInfo.class);
        if (jsonIdentityInfo == null || jsonIdentityInfo.generator() == ObjectIdGenerators.None.class) {
            return null;
        }
        return new ObjectIdInfo(PropertyName.construct(jsonIdentityInfo.property()), jsonIdentityInfo.scope(), jsonIdentityInfo.generator(), jsonIdentityInfo.resolver());
    }

    @Override
    public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectIdInfo) {
        JsonIdentityReference jsonIdentityReference = (JsonIdentityReference) _findAnnotation(annotated, JsonIdentityReference.class);
        if (jsonIdentityReference == null) {
            return objectIdInfo;
        }
        if (objectIdInfo == null) {
            objectIdInfo = ObjectIdInfo.empty();
        }
        return objectIdInfo.withAlwaysAsId(jsonIdentityReference.alwaysAsId());
    }

    @Override
    public Object findSerializer(Annotated annotated) {
        Class<? extends JsonSerializer> using;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize != null && (using = jsonSerialize.using()) != JsonSerializer.None.class) {
            return using;
        }
        JsonRawValue jsonRawValue = (JsonRawValue) _findAnnotation(annotated, JsonRawValue.class);
        if (jsonRawValue == null || !jsonRawValue.value()) {
            return null;
        }
        return new RawSerializer(annotated.getRawType());
    }

    @Override
    public Object findKeySerializer(Annotated annotated) {
        Class<? extends JsonSerializer> keyUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null || (keyUsing = jsonSerialize.keyUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return keyUsing;
    }

    @Override
    public Object findContentSerializer(Annotated annotated) {
        Class<? extends JsonSerializer> contentUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null || (contentUsing = jsonSerialize.contentUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return contentUsing;
    }

    @Override
    public Object findNullSerializer(Annotated annotated) {
        Class<? extends JsonSerializer> nullsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null || (nullsUsing = jsonSerialize.nullsUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return nullsUsing;
    }

    @Override
    public JsonInclude.Value findPropertyInclusion(Annotated annotated) {
        JsonInclude jsonInclude = (JsonInclude) _findAnnotation(annotated, JsonInclude.class);
        JsonInclude.Value empty = jsonInclude == null ? JsonInclude.Value.empty() : JsonInclude.Value.from(jsonInclude);
        if (empty.getValueInclusion() == JsonInclude.Include.USE_DEFAULTS) {
            empty = _refinePropertyInclusion(annotated, empty);
        }
        return empty;
    }

    private JsonInclude.Value _refinePropertyInclusion(Annotated annotated, JsonInclude.Value value) {
        if (((JsonSerialize) _findAnnotation(annotated, JsonSerialize.class)) != null) {
            switch (r0.include()) {
                case ALWAYS:
                    return value.withValueInclusion(JsonInclude.Include.ALWAYS);
                case NON_NULL:
                    return value.withValueInclusion(JsonInclude.Include.NON_NULL);
                case NON_DEFAULT:
                    return value.withValueInclusion(JsonInclude.Include.NON_DEFAULT);
                case NON_EMPTY:
                    return value.withValueInclusion(JsonInclude.Include.NON_EMPTY);
            }
        }
        return value;
    }

    @Override
    public JsonSerialize.Typing findSerializationTyping(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return jsonSerialize.typing();
    }

    @Override
    public Object findSerializationConverter(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.converter(), Converter.None.class);
    }

    @Override
    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotatedMember, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.contentConverter(), Converter.None.class);
    }

    @Override
    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws JsonMappingException {
        JavaType withStaticTyping;
        JavaType withStaticTyping2;
        JavaType javaType2 = javaType;
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        Class<?> _classIfExplicit = jsonSerialize == null ? null : _classIfExplicit(jsonSerialize.as());
        if (_classIfExplicit != null) {
            if (javaType2.hasRawClass(_classIfExplicit)) {
                javaType2 = javaType2.withStaticTyping();
            } else {
                Class<?> rawClass = javaType2.getRawClass();
                try {
                    if (_classIfExplicit.isAssignableFrom(rawClass)) {
                        javaType2 = typeFactory.constructGeneralizedType(javaType2, _classIfExplicit);
                    } else if (rawClass.isAssignableFrom(_classIfExplicit)) {
                        javaType2 = typeFactory.constructSpecializedType(javaType2, _classIfExplicit);
                    } else {
                        if (!_primitiveAndWrapper(rawClass, _classIfExplicit)) {
                            throw _databindException(String.format("Cannot refine serialization type %s into %s; types not related", javaType2, _classIfExplicit.getName()));
                        }
                        javaType2 = javaType2.withStaticTyping();
                    }
                } catch (IllegalArgumentException e) {
                    throw _databindException(e, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", javaType2, _classIfExplicit.getName(), annotated.getName(), e.getMessage()));
                }
            }
        }
        if (javaType2.isMapLikeType()) {
            JavaType keyType = javaType2.getKeyType();
            Class<?> _classIfExplicit2 = jsonSerialize == null ? null : _classIfExplicit(jsonSerialize.keyAs());
            if (_classIfExplicit2 != null) {
                if (keyType.hasRawClass(_classIfExplicit2)) {
                    withStaticTyping2 = keyType.withStaticTyping();
                } else {
                    Class<?> rawClass2 = keyType.getRawClass();
                    try {
                        if (_classIfExplicit2.isAssignableFrom(rawClass2)) {
                            withStaticTyping2 = typeFactory.constructGeneralizedType(keyType, _classIfExplicit2);
                        } else if (rawClass2.isAssignableFrom(_classIfExplicit2)) {
                            withStaticTyping2 = typeFactory.constructSpecializedType(keyType, _classIfExplicit2);
                        } else {
                            if (!_primitiveAndWrapper(rawClass2, _classIfExplicit2)) {
                                throw _databindException(String.format("Cannot refine serialization key type %s into %s; types not related", keyType, _classIfExplicit2.getName()));
                            }
                            withStaticTyping2 = keyType.withStaticTyping();
                        }
                    } catch (IllegalArgumentException e2) {
                        throw _databindException(e2, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType2, _classIfExplicit2.getName(), annotated.getName(), e2.getMessage()));
                    }
                }
                javaType2 = ((MapLikeType) javaType2).withKeyType(withStaticTyping2);
            }
        }
        JavaType contentType = javaType2.getContentType();
        if (contentType != null) {
            Class<?> _classIfExplicit3 = jsonSerialize == null ? null : _classIfExplicit(jsonSerialize.contentAs());
            if (_classIfExplicit3 != null) {
                if (contentType.hasRawClass(_classIfExplicit3)) {
                    withStaticTyping = contentType.withStaticTyping();
                } else {
                    Class<?> rawClass3 = contentType.getRawClass();
                    try {
                        if (_classIfExplicit3.isAssignableFrom(rawClass3)) {
                            withStaticTyping = typeFactory.constructGeneralizedType(contentType, _classIfExplicit3);
                        } else if (rawClass3.isAssignableFrom(_classIfExplicit3)) {
                            withStaticTyping = typeFactory.constructSpecializedType(contentType, _classIfExplicit3);
                        } else {
                            if (!_primitiveAndWrapper(rawClass3, _classIfExplicit3)) {
                                throw _databindException(String.format("Cannot refine serialization content type %s into %s; types not related", contentType, _classIfExplicit3.getName()));
                            }
                            withStaticTyping = contentType.withStaticTyping();
                        }
                    } catch (IllegalArgumentException e3) {
                        throw _databindException(e3, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType2, _classIfExplicit3.getName(), annotated.getName(), e3.getMessage()));
                    }
                }
                javaType2 = javaType2.withContentType(withStaticTyping);
            }
        }
        return javaType2;
    }

    @Override
    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedClass) {
        JsonPropertyOrder jsonPropertyOrder = (JsonPropertyOrder) _findAnnotation(annotatedClass, JsonPropertyOrder.class);
        if (jsonPropertyOrder == null) {
            return null;
        }
        return jsonPropertyOrder.value();
    }

    @Override
    public Boolean findSerializationSortAlphabetically(Annotated annotated) {
        return _findSortAlpha(annotated);
    }

    private final Boolean _findSortAlpha(Annotated annotated) {
        JsonPropertyOrder jsonPropertyOrder = (JsonPropertyOrder) _findAnnotation(annotated, JsonPropertyOrder.class);
        if (jsonPropertyOrder == null || !jsonPropertyOrder.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override
    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, List<BeanPropertyWriter> list) {
        JsonAppend jsonAppend = (JsonAppend) _findAnnotation(annotatedClass, JsonAppend.class);
        if (jsonAppend == null) {
            return;
        }
        boolean prepend = jsonAppend.prepend();
        JavaType javaType = null;
        JsonAppend.Attr[] attrs = jsonAppend.attrs();
        int length = attrs.length;
        for (int i = 0; i < length; i++) {
            if (javaType == null) {
                javaType = mapperConfig.constructType(Object.class);
            }
            BeanPropertyWriter _constructVirtualProperty = _constructVirtualProperty(attrs[i], mapperConfig, annotatedClass, javaType);
            if (prepend) {
                list.add(i, _constructVirtualProperty);
            } else {
                list.add(_constructVirtualProperty);
            }
        }
        JsonAppend.Prop[] props = jsonAppend.props();
        int length2 = props.length;
        for (int i2 = 0; i2 < length2; i2++) {
            BeanPropertyWriter _constructVirtualProperty2 = _constructVirtualProperty(props[i2], mapperConfig, annotatedClass);
            if (prepend) {
                list.add(i2, _constructVirtualProperty2);
            } else {
                list.add(_constructVirtualProperty2);
            }
        }
    }

    protected BeanPropertyWriter _constructVirtualProperty(JsonAppend.Attr attr, MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        PropertyMetadata propertyMetadata = attr.required() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        String value = attr.value();
        PropertyName _propertyName = _propertyName(attr.propName(), attr.propNamespace());
        if (!_propertyName.hasSimpleName()) {
            _propertyName = PropertyName.construct(value);
        }
        return AttributePropertyWriter.construct(value, SimpleBeanPropertyDefinition.construct(mapperConfig, new VirtualAnnotatedMember(annotatedClass, annotatedClass.getRawType(), value, javaType), _propertyName, propertyMetadata, attr.include()), annotatedClass.getAnnotations(), javaType);
    }

    protected BeanPropertyWriter _constructVirtualProperty(JsonAppend.Prop prop, MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        PropertyMetadata propertyMetadata = prop.required() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        PropertyName _propertyName = _propertyName(prop.name(), prop.namespace());
        JavaType constructType = mapperConfig.constructType(prop.type());
        SimpleBeanPropertyDefinition construct = SimpleBeanPropertyDefinition.construct(mapperConfig, new VirtualAnnotatedMember(annotatedClass, annotatedClass.getRawType(), _propertyName.getSimpleName(), constructType), _propertyName, propertyMetadata, prop.include());
        Class<? extends VirtualBeanPropertyWriter> value = prop.value();
        HandlerInstantiator handlerInstantiator = mapperConfig.getHandlerInstantiator();
        VirtualBeanPropertyWriter virtualPropertyWriterInstance = handlerInstantiator == null ? null : handlerInstantiator.virtualPropertyWriterInstance(mapperConfig, value);
        if (virtualPropertyWriterInstance == null) {
            virtualPropertyWriterInstance = (VirtualBeanPropertyWriter) ClassUtil.createInstance(value, mapperConfig.canOverrideAccessModifiers());
        }
        return virtualPropertyWriterInstance.withConfig(mapperConfig, annotatedClass, construct, constructType);
    }

    @Override
    public PropertyName findNameForSerialization(Annotated annotated) {
        boolean z = false;
        JsonGetter jsonGetter = (JsonGetter) _findAnnotation(annotated, JsonGetter.class);
        if (jsonGetter != null) {
            String value = jsonGetter.value();
            if (!value.isEmpty()) {
                return PropertyName.construct(value);
            }
            z = true;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty == null) {
            if (z || _hasOneOf(annotated, ANNOTATIONS_TO_INFER_SER)) {
                return PropertyName.USE_DEFAULT;
            }
            return null;
        }
        String namespace = jsonProperty.namespace();
        if (namespace != null && namespace.isEmpty()) {
            namespace = null;
        }
        return PropertyName.construct(jsonProperty.value(), namespace);
    }

    @Override
    public Boolean hasAsKey(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonKey jsonKey = (JsonKey) _findAnnotation(annotated, JsonKey.class);
        if (jsonKey == null) {
            return null;
        }
        return Boolean.valueOf(jsonKey.value());
    }

    @Override
    public Boolean hasAsValue(Annotated annotated) {
        JsonValue jsonValue = (JsonValue) _findAnnotation(annotated, JsonValue.class);
        if (jsonValue == null) {
            return null;
        }
        return Boolean.valueOf(jsonValue.value());
    }

    @Override
    public Boolean hasAnyGetter(Annotated annotated) {
        JsonAnyGetter jsonAnyGetter = (JsonAnyGetter) _findAnnotation(annotated, JsonAnyGetter.class);
        if (jsonAnyGetter == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnyGetter.enabled());
    }

    @Override
    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return _hasAnnotation(annotatedMethod, JsonAnyGetter.class);
    }

    @Override
    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        JsonValue jsonValue = (JsonValue) _findAnnotation(annotatedMethod, JsonValue.class);
        return jsonValue != null && jsonValue.value();
    }

    @Override
    public Object findDeserializer(Annotated annotated) {
        Class<? extends JsonDeserializer> using;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null || (using = jsonDeserialize.using()) == JsonDeserializer.None.class) {
            return null;
        }
        return using;
    }

    @Override
    public Object findKeyDeserializer(Annotated annotated) {
        Class<? extends KeyDeserializer> keyUsing;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null || (keyUsing = jsonDeserialize.keyUsing()) == KeyDeserializer.None.class) {
            return null;
        }
        return keyUsing;
    }

    @Override
    public Object findContentDeserializer(Annotated annotated) {
        Class<? extends JsonDeserializer> contentUsing;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null || (contentUsing = jsonDeserialize.contentUsing()) == JsonDeserializer.None.class) {
            return null;
        }
        return contentUsing;
    }

    @Override
    public Object findDeserializationConverter(Annotated annotated) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.converter(), Converter.None.class);
    }

    @Override
    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotatedMember, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.contentConverter(), Converter.None.class);
    }

    @Override
    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws JsonMappingException {
        JavaType javaType2 = javaType;
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        Class<?> _classIfExplicit = jsonDeserialize == null ? null : _classIfExplicit(jsonDeserialize.as());
        if (_classIfExplicit != null && !javaType2.hasRawClass(_classIfExplicit) && !_primitiveAndWrapper(javaType2, _classIfExplicit)) {
            try {
                javaType2 = typeFactory.constructSpecializedType(javaType2, _classIfExplicit);
            } catch (IllegalArgumentException e) {
                throw _databindException(e, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", javaType2, _classIfExplicit.getName(), annotated.getName(), e.getMessage()));
            }
        }
        if (javaType2.isMapLikeType()) {
            JavaType keyType = javaType2.getKeyType();
            Class<?> _classIfExplicit2 = jsonDeserialize == null ? null : _classIfExplicit(jsonDeserialize.keyAs());
            if (_classIfExplicit2 != null && !_primitiveAndWrapper(keyType, _classIfExplicit2)) {
                try {
                    javaType2 = ((MapLikeType) javaType2).withKeyType(typeFactory.constructSpecializedType(keyType, _classIfExplicit2));
                } catch (IllegalArgumentException e2) {
                    throw _databindException(e2, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType2, _classIfExplicit2.getName(), annotated.getName(), e2.getMessage()));
                }
            }
        }
        JavaType contentType = javaType2.getContentType();
        if (contentType != null) {
            Class<?> _classIfExplicit3 = jsonDeserialize == null ? null : _classIfExplicit(jsonDeserialize.contentAs());
            if (_classIfExplicit3 != null && !_primitiveAndWrapper(contentType, _classIfExplicit3)) {
                try {
                    javaType2 = javaType2.withContentType(typeFactory.constructSpecializedType(contentType, _classIfExplicit3));
                } catch (IllegalArgumentException e3) {
                    throw _databindException(e3, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType2, _classIfExplicit3.getName(), annotated.getName(), e3.getMessage()));
                }
            }
        }
        return javaType2;
    }

    @Override
    public Object findValueInstantiator(AnnotatedClass annotatedClass) {
        JsonValueInstantiator jsonValueInstantiator = (JsonValueInstantiator) _findAnnotation(annotatedClass, JsonValueInstantiator.class);
        if (jsonValueInstantiator == null) {
            return null;
        }
        return jsonValueInstantiator.value();
    }

    @Override
    public Class<?> findPOJOBuilder(AnnotatedClass annotatedClass) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotatedClass, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.builder());
    }

    @Override
    public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedClass) {
        JsonPOJOBuilder jsonPOJOBuilder = (JsonPOJOBuilder) _findAnnotation(annotatedClass, JsonPOJOBuilder.class);
        if (jsonPOJOBuilder == null) {
            return null;
        }
        return new JsonPOJOBuilder.Value(jsonPOJOBuilder);
    }

    @Override
    public PropertyName findNameForDeserialization(Annotated annotated) {
        boolean z = false;
        JsonSetter jsonSetter = (JsonSetter) _findAnnotation(annotated, JsonSetter.class);
        if (jsonSetter != null) {
            String value = jsonSetter.value();
            if (!value.isEmpty()) {
                return PropertyName.construct(value);
            }
            z = true;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty == null) {
            if (z || _hasOneOf(annotated, ANNOTATIONS_TO_INFER_DESER)) {
                return PropertyName.USE_DEFAULT;
            }
            return null;
        }
        String namespace = jsonProperty.namespace();
        if (namespace != null && namespace.isEmpty()) {
            namespace = null;
        }
        return PropertyName.construct(jsonProperty.value(), namespace);
    }

    @Override
    public Boolean hasAnySetter(Annotated annotated) {
        JsonAnySetter jsonAnySetter = (JsonAnySetter) _findAnnotation(annotated, JsonAnySetter.class);
        if (jsonAnySetter == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnySetter.enabled());
    }

    @Override
    public JsonSetter.Value findSetterInfo(Annotated annotated) {
        return JsonSetter.Value.from((JsonSetter) _findAnnotation(annotated, JsonSetter.class));
    }

    @Override
    public Boolean findMergeInfo(Annotated annotated) {
        JsonMerge jsonMerge = (JsonMerge) _findAnnotation(annotated, JsonMerge.class);
        if (jsonMerge == null) {
            return null;
        }
        return jsonMerge.value().asBoolean();
    }

    @Override
    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return _hasAnnotation(annotatedMethod, JsonAnySetter.class);
    }

    @Override
    @Deprecated
    public boolean hasCreatorAnnotation(Annotated annotated) {
        Boolean hasCreatorAnnotation;
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(annotated, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode() != JsonCreator.Mode.DISABLED;
        }
        if (!this._cfgConstructorPropertiesImpliesCreator || !(annotated instanceof AnnotatedConstructor) || _java7Helper == null || (hasCreatorAnnotation = _java7Helper.hasCreatorAnnotation(annotated)) == null) {
            return false;
        }
        return hasCreatorAnnotation.booleanValue();
    }

    @Override
    @Deprecated
    public JsonCreator.Mode findCreatorBinding(Annotated annotated) {
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(annotated, JsonCreator.class);
        if (jsonCreator == null) {
            return null;
        }
        return jsonCreator.mode();
    }

    @Override
    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, Annotated annotated) {
        Boolean hasCreatorAnnotation;
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(annotated, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode();
        }
        if (this._cfgConstructorPropertiesImpliesCreator && mapperConfig.isEnabled(MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) && (annotated instanceof AnnotatedConstructor) && _java7Helper != null && (hasCreatorAnnotation = _java7Helper.hasCreatorAnnotation(annotated)) != null && hasCreatorAnnotation.booleanValue()) {
            return JsonCreator.Mode.PROPERTIES;
        }
        return null;
    }

    protected boolean _isIgnorable(Annotated annotated) {
        Boolean findTransient;
        JsonIgnore jsonIgnore = (JsonIgnore) _findAnnotation(annotated, JsonIgnore.class);
        if (jsonIgnore != null) {
            return jsonIgnore.value();
        }
        if (_java7Helper == null || (findTransient = _java7Helper.findTransient(annotated)) == null) {
            return false;
        }
        return findTransient.booleanValue();
    }

    protected Class<?> _classIfExplicit(Class<?> cls) {
        if (cls == null || ClassUtil.isBogusClass(cls)) {
            return null;
        }
        return cls;
    }

    protected Class<?> _classIfExplicit(Class<?> cls, Class<?> cls2) {
        Class<?> _classIfExplicit = _classIfExplicit(cls);
        if (_classIfExplicit == null || _classIfExplicit == cls2) {
            return null;
        }
        return _classIfExplicit;
    }

    protected PropertyName _propertyName(String str, String str2) {
        return str.isEmpty() ? PropertyName.USE_DEFAULT : (str2 == null || str2.isEmpty()) ? PropertyName.construct(str) : PropertyName.construct(str, str2);
    }

    protected PropertyName _findConstructorName(Annotated annotated) {
        PropertyName findConstructorName;
        if (!(annotated instanceof AnnotatedParameter)) {
            return null;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) annotated;
        if (annotatedParameter.getOwner() == null || _java7Helper == null || (findConstructorName = _java7Helper.findConstructorName(annotatedParameter)) == null) {
            return null;
        }
        return findConstructorName;
    }

    protected TypeResolverBuilder<?> _findTypeResolver(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) {
        TypeResolverBuilder<?> _constructStdTypeResolverBuilder;
        JsonTypeInfo.Value findPolymorphicTypeInfo = findPolymorphicTypeInfo(mapperConfig, annotated);
        JsonTypeResolver jsonTypeResolver = (JsonTypeResolver) _findAnnotation(annotated, JsonTypeResolver.class);
        if (jsonTypeResolver != null) {
            if (findPolymorphicTypeInfo == null) {
                return null;
            }
            _constructStdTypeResolverBuilder = mapperConfig.typeResolverBuilderInstance(annotated, jsonTypeResolver.value());
        } else {
            if (findPolymorphicTypeInfo == null) {
                return null;
            }
            if (findPolymorphicTypeInfo.getIdType() == JsonTypeInfo.Id.NONE) {
                return _constructNoTypeResolverBuilder();
            }
            _constructStdTypeResolverBuilder = _constructStdTypeResolverBuilder(mapperConfig, findPolymorphicTypeInfo, javaType);
        }
        JsonTypeIdResolver jsonTypeIdResolver = (JsonTypeIdResolver) _findAnnotation(annotated, JsonTypeIdResolver.class);
        TypeIdResolver typeIdResolverInstance = jsonTypeIdResolver == null ? null : mapperConfig.typeIdResolverInstance(annotated, jsonTypeIdResolver.value());
        if (typeIdResolverInstance != null) {
            typeIdResolverInstance.init(javaType);
        }
        if (findPolymorphicTypeInfo.getInclusionType() == JsonTypeInfo.As.EXTERNAL_PROPERTY && (annotated instanceof AnnotatedClass)) {
            findPolymorphicTypeInfo = findPolymorphicTypeInfo.withInclusionType(JsonTypeInfo.As.PROPERTY);
        }
        Class<?> defaultImpl = findPolymorphicTypeInfo.getDefaultImpl();
        if (defaultImpl != null && defaultImpl != JsonTypeInfo.None.class && !defaultImpl.isAnnotation()) {
            findPolymorphicTypeInfo = findPolymorphicTypeInfo.withDefaultImpl(defaultImpl);
        }
        return _constructStdTypeResolverBuilder.init(findPolymorphicTypeInfo, typeIdResolverInstance);
    }

    protected StdTypeResolverBuilder _constructStdTypeResolverBuilder() {
        return new StdTypeResolverBuilder();
    }

    protected TypeResolverBuilder<?> _constructStdTypeResolverBuilder(MapperConfig<?> mapperConfig, JsonTypeInfo.Value value, JavaType javaType) {
        return new StdTypeResolverBuilder(value);
    }

    protected StdTypeResolverBuilder _constructNoTypeResolverBuilder() {
        return StdTypeResolverBuilder.noTypeInfoBuilder();
    }

    private boolean _primitiveAndWrapper(Class<?> cls, Class<?> cls2) {
        return cls.isPrimitive() ? cls == ClassUtil.primitiveType(cls2) : cls2.isPrimitive() && cls2 == ClassUtil.primitiveType(cls);
    }

    private boolean _primitiveAndWrapper(JavaType javaType, Class<?> cls) {
        return javaType.isPrimitive() ? javaType.hasRawClass(ClassUtil.primitiveType(cls)) : cls.isPrimitive() && cls == ClassUtil.primitiveType(javaType.getRawClass());
    }

    private JsonMappingException _databindException(String str) {
        return new JsonMappingException((Closeable) null, str);
    }

    private JsonMappingException _databindException(Throwable th, String str) {
        return new JsonMappingException((Closeable) null, str, th);
    }

    static {
        Java7Support java7Support = null;
        try {
            java7Support = Java7Support.instance();
        } catch (Throwable th) {
            ExceptionUtil.rethrowIfFatal(th);
        }
        _java7Helper = java7Support;
    }
}
