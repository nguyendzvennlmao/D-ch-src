package com.kammoun.utils.jackson.databind.ser;

import com.kammoun.utils.jackson.annotation.JsonFormat;
import com.kammoun.utils.jackson.annotation.JsonIgnoreProperties;
import com.kammoun.utils.jackson.annotation.JsonInclude;
import com.kammoun.utils.jackson.annotation.JsonIncludeProperties;
import com.kammoun.utils.jackson.databind.BeanDescription;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.JsonSerializable;
import com.kammoun.utils.jackson.databind.JsonSerializer;
import com.kammoun.utils.jackson.databind.MapperFeature;
import com.kammoun.utils.jackson.databind.SerializationConfig;
import com.kammoun.utils.jackson.databind.SerializationFeature;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import com.kammoun.utils.jackson.databind.annotation.JsonSerialize;
import com.kammoun.utils.jackson.databind.cfg.SerializerFactoryConfig;
import com.kammoun.utils.jackson.databind.ext.OptionalHandlerFactory;
import com.kammoun.utils.jackson.databind.introspect.Annotated;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedClass;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMember;
import com.kammoun.utils.jackson.databind.introspect.BasicBeanDescription;
import com.kammoun.utils.jackson.databind.introspect.BeanPropertyDefinition;
import com.kammoun.utils.jackson.databind.jsontype.NamedType;
import com.kammoun.utils.jackson.databind.jsontype.TypeResolverBuilder;
import com.kammoun.utils.jackson.databind.jsontype.TypeSerializer;
import com.kammoun.utils.jackson.databind.ser.impl.IndexedListSerializer;
import com.kammoun.utils.jackson.databind.ser.impl.IndexedStringListSerializer;
import com.kammoun.utils.jackson.databind.ser.impl.IteratorSerializer;
import com.kammoun.utils.jackson.databind.ser.impl.MapEntrySerializer;
import com.kammoun.utils.jackson.databind.ser.impl.StringArraySerializer;
import com.kammoun.utils.jackson.databind.ser.impl.StringCollectionSerializer;
import com.kammoun.utils.jackson.databind.ser.std.AtomicReferenceSerializer;
import com.kammoun.utils.jackson.databind.ser.std.BooleanSerializer;
import com.kammoun.utils.jackson.databind.ser.std.ByteBufferSerializer;
import com.kammoun.utils.jackson.databind.ser.std.CalendarSerializer;
import com.kammoun.utils.jackson.databind.ser.std.CollectionSerializer;
import com.kammoun.utils.jackson.databind.ser.std.DateSerializer;
import com.kammoun.utils.jackson.databind.ser.std.EnumSerializer;
import com.kammoun.utils.jackson.databind.ser.std.EnumSetSerializer;
import com.kammoun.utils.jackson.databind.ser.std.InetAddressSerializer;
import com.kammoun.utils.jackson.databind.ser.std.InetSocketAddressSerializer;
import com.kammoun.utils.jackson.databind.ser.std.IterableSerializer;
import com.kammoun.utils.jackson.databind.ser.std.JsonValueSerializer;
import com.kammoun.utils.jackson.databind.ser.std.MapSerializer;
import com.kammoun.utils.jackson.databind.ser.std.NumberSerializer;
import com.kammoun.utils.jackson.databind.ser.std.NumberSerializers;
import com.kammoun.utils.jackson.databind.ser.std.ObjectArraySerializer;
import com.kammoun.utils.jackson.databind.ser.std.SerializableSerializer;
import com.kammoun.utils.jackson.databind.ser.std.StdArraySerializers;
import com.kammoun.utils.jackson.databind.ser.std.StdDelegatingSerializer;
import com.kammoun.utils.jackson.databind.ser.std.StdJdkSerializers;
import com.kammoun.utils.jackson.databind.ser.std.StdKeySerializers;
import com.kammoun.utils.jackson.databind.ser.std.StringSerializer;
import com.kammoun.utils.jackson.databind.ser.std.TimeZoneSerializer;
import com.kammoun.utils.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.kammoun.utils.jackson.databind.ser.std.ToStringSerializer;
import com.kammoun.utils.jackson.databind.ser.std.TokenBufferSerializer;
import com.kammoun.utils.jackson.databind.type.ArrayType;
import com.kammoun.utils.jackson.databind.type.CollectionLikeType;
import com.kammoun.utils.jackson.databind.type.CollectionType;
import com.kammoun.utils.jackson.databind.type.MapLikeType;
import com.kammoun.utils.jackson.databind.type.MapType;
import com.kammoun.utils.jackson.databind.type.ReferenceType;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import com.kammoun.utils.jackson.databind.util.ArrayBuilders;
import com.kammoun.utils.jackson.databind.util.BeanUtil;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import com.kammoun.utils.jackson.databind.util.Converter;
import com.kammoun.utils.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasicSerializerFactory extends SerializerFactory implements Serializable {
    protected static final HashMap<String, JsonSerializer<?>> _concrete;
    protected static final HashMap<String, Class<? extends JsonSerializer<?>>> _concreteLazy;
    protected final SerializerFactoryConfig _factoryConfig;

    public BasicSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        this._factoryConfig = serializerFactoryConfig == null ? new SerializerFactoryConfig() : serializerFactoryConfig;
    }

    public SerializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    public abstract SerializerFactory withConfig(SerializerFactoryConfig serializerFactoryConfig);

    @Override
    public final SerializerFactory withAdditionalSerializers(Serializers serializers) {
        return withConfig(this._factoryConfig.withAdditionalSerializers(serializers));
    }

    @Override
    public final SerializerFactory withAdditionalKeySerializers(Serializers serializers) {
        return withConfig(this._factoryConfig.withAdditionalKeySerializers(serializers));
    }

    @Override
    public final SerializerFactory withSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
        return withConfig(this._factoryConfig.withSerializerModifier(beanSerializerModifier));
    }

    @Override
    public abstract JsonSerializer<Object> createSerializer(SerializerProvider serializerProvider, JavaType javaType) throws JsonMappingException;

    @Override
    public JsonSerializer<Object> createKeySerializer(SerializerProvider serializerProvider, JavaType javaType, JsonSerializer<Object> jsonSerializer) throws JsonMappingException {
        SerializationConfig config = serializerProvider.getConfig();
        BeanDescription introspect = config.introspect(javaType);
        JsonSerializer<Object> jsonSerializer2 = null;
        if (this._factoryConfig.hasKeySerializers()) {
            Iterator<Serializers> it = this._factoryConfig.keySerializers().iterator();
            while (it.hasNext()) {
                jsonSerializer2 = it.next().findSerializer(config, javaType, introspect);
                if (jsonSerializer2 != null) {
                    break;
                }
            }
        }
        if (jsonSerializer2 == null) {
            jsonSerializer2 = _findKeySerializer(serializerProvider, introspect.getClassInfo());
            if (jsonSerializer2 == null) {
                jsonSerializer2 = jsonSerializer;
                if (jsonSerializer2 == null) {
                    jsonSerializer2 = StdKeySerializers.getStdKeySerializer(config, javaType.getRawClass(), false);
                    if (jsonSerializer2 == null) {
                        AnnotatedMember findJsonKeyAccessor = introspect.findJsonKeyAccessor();
                        if (findJsonKeyAccessor == null) {
                            findJsonKeyAccessor = introspect.findJsonValueAccessor();
                        }
                        if (findJsonKeyAccessor != null) {
                            JsonSerializer<Object> createKeySerializer = createKeySerializer(serializerProvider, findJsonKeyAccessor.getType(), jsonSerializer);
                            if (config.canOverrideAccessModifiers()) {
                                ClassUtil.checkAndFixAccess(findJsonKeyAccessor.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                            }
                            jsonSerializer2 = JsonValueSerializer.construct(config, findJsonKeyAccessor, null, createKeySerializer);
                        } else {
                            jsonSerializer2 = StdKeySerializers.getFallbackKeySerializer(config, javaType.getRawClass(), introspect.getClassInfo());
                        }
                    }
                }
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonSerializer2 = it2.next().modifyKeySerializer(config, javaType, introspect, jsonSerializer2);
            }
        }
        return jsonSerializer2;
    }

    @Override
    @Deprecated
    public JsonSerializer<Object> createKeySerializer(SerializationConfig serializationConfig, JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        BeanDescription introspect = serializationConfig.introspect(javaType);
        JsonSerializer<Object> jsonSerializer2 = null;
        if (this._factoryConfig.hasKeySerializers()) {
            Iterator<Serializers> it = this._factoryConfig.keySerializers().iterator();
            while (it.hasNext()) {
                jsonSerializer2 = it.next().findSerializer(serializationConfig, javaType, introspect);
                if (jsonSerializer2 != null) {
                    break;
                }
            }
        }
        if (jsonSerializer2 == null) {
            jsonSerializer2 = jsonSerializer;
            if (jsonSerializer2 == null) {
                jsonSerializer2 = StdKeySerializers.getStdKeySerializer(serializationConfig, javaType.getRawClass(), false);
                if (jsonSerializer2 == null) {
                    jsonSerializer2 = StdKeySerializers.getFallbackKeySerializer(serializationConfig, javaType.getRawClass(), introspect.getClassInfo());
                }
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonSerializer2 = it2.next().modifyKeySerializer(serializationConfig, javaType, introspect, jsonSerializer2);
            }
        }
        return jsonSerializer2;
    }

    @Override
    public TypeSerializer createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) {
        AnnotatedClass classInfo = serializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder<?> findTypeResolver = serializationConfig.getAnnotationIntrospector().findTypeResolver(serializationConfig, classInfo, javaType);
        Collection<NamedType> collection = null;
        if (findTypeResolver == null) {
            findTypeResolver = serializationConfig.getDefaultTyper(javaType);
        } else {
            collection = serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, classInfo);
        }
        if (findTypeResolver == null) {
            return null;
        }
        return findTypeResolver.buildTypeSerializer(serializationConfig, javaType, collection);
    }

    protected abstract Iterable<Serializers> customSerializers();

    public final JsonSerializer<?> findSerializerByLookup(JavaType javaType, SerializationConfig serializationConfig, BeanDescription beanDescription, boolean z) {
        Class<? extends JsonSerializer<?>> cls;
        String name = javaType.getRawClass().getName();
        JsonSerializer<?> jsonSerializer = _concrete.get(name);
        return (jsonSerializer != null || (cls = _concreteLazy.get(name)) == null) ? jsonSerializer : (JsonSerializer) ClassUtil.createInstance(cls, false);
    }

    public final JsonSerializer<?> findSerializerByAnnotations(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        if (JsonSerializable.class.isAssignableFrom(javaType.getRawClass())) {
            return SerializableSerializer.instance;
        }
        AnnotatedMember findJsonValueAccessor = beanDescription.findJsonValueAccessor();
        if (findJsonValueAccessor == null) {
            return null;
        }
        if (serializerProvider.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(findJsonValueAccessor.getMember(), serializerProvider.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        JavaType type = findJsonValueAccessor.getType();
        JsonSerializer<Object> findSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, findJsonValueAccessor);
        if (findSerializerFromAnnotation == null) {
            findSerializerFromAnnotation = (JsonSerializer) type.getValueHandler();
        }
        TypeSerializer typeSerializer = (TypeSerializer) type.getTypeHandler();
        if (typeSerializer == null) {
            typeSerializer = createTypeSerializer(serializerProvider.getConfig(), type);
        }
        return JsonValueSerializer.construct(serializerProvider.getConfig(), findJsonValueAccessor, typeSerializer, findSerializerFromAnnotation);
    }

    public final JsonSerializer<?> findSerializerByPrimaryType(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        if (javaType.isEnumType()) {
            return buildEnumSerializer(serializerProvider.getConfig(), javaType, beanDescription);
        }
        Class<?> rawClass = javaType.getRawClass();
        JsonSerializer<?> findOptionalStdSerializer = findOptionalStdSerializer(serializerProvider, javaType, beanDescription, z);
        if (findOptionalStdSerializer != null) {
            return findOptionalStdSerializer;
        }
        if (Calendar.class.isAssignableFrom(rawClass)) {
            return CalendarSerializer.instance;
        }
        if (Date.class.isAssignableFrom(rawClass)) {
            return DateSerializer.instance;
        }
        if (Map.Entry.class.isAssignableFrom(rawClass)) {
            JavaType findSuperType = javaType.findSuperType(Map.Entry.class);
            return buildMapEntrySerializer(serializerProvider, javaType, beanDescription, z, findSuperType.containedTypeOrUnknown(0), findSuperType.containedTypeOrUnknown(1));
        }
        if (ByteBuffer.class.isAssignableFrom(rawClass)) {
            return new ByteBufferSerializer();
        }
        if (InetAddress.class.isAssignableFrom(rawClass)) {
            return new InetAddressSerializer();
        }
        if (InetSocketAddress.class.isAssignableFrom(rawClass)) {
            return new InetSocketAddressSerializer();
        }
        if (TimeZone.class.isAssignableFrom(rawClass)) {
            return new TimeZoneSerializer();
        }
        if (Charset.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (!Number.class.isAssignableFrom(rawClass)) {
            if (ClassLoader.class.isAssignableFrom(rawClass)) {
                return new ToEmptyObjectSerializer(javaType);
            }
            return null;
        }
        switch (beanDescription.findExpectedFormat().getShape()) {
            case STRING:
                return ToStringSerializer.instance;
            case OBJECT:
            case ARRAY:
                return null;
            default:
                return NumberSerializer.instance;
        }
    }

    protected JsonSerializer<?> findOptionalStdSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findSerializer(serializerProvider.getConfig(), javaType, beanDescription);
    }

    public final JsonSerializer<?> findSerializerByAddonType(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (Iterator.class.isAssignableFrom(rawClass)) {
            JavaType[] findTypeParameters = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterator.class);
            return buildIteratorSerializer(serializationConfig, javaType, beanDescription, z, (findTypeParameters == null || findTypeParameters.length != 1) ? TypeFactory.unknownType() : findTypeParameters[0]);
        }
        if (Iterable.class.isAssignableFrom(rawClass)) {
            JavaType[] findTypeParameters2 = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterable.class);
            return buildIterableSerializer(serializationConfig, javaType, beanDescription, z, (findTypeParameters2 == null || findTypeParameters2.length != 1) ? TypeFactory.unknownType() : findTypeParameters2[0]);
        }
        if (CharSequence.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        return null;
    }

    public JsonSerializer<Object> findSerializerFromAnnotation(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findSerializer = serializerProvider.getAnnotationIntrospector().findSerializer(annotated);
        if (findSerializer == null) {
            return null;
        }
        return findConvertingSerializer(serializerProvider, annotated, serializerProvider.serializerInstance(annotated, findSerializer));
    }

    protected JsonSerializer<?> findConvertingSerializer(SerializerProvider serializerProvider, Annotated annotated, JsonSerializer<?> jsonSerializer) throws JsonMappingException {
        Converter<Object, Object> findConverter = findConverter(serializerProvider, annotated);
        return findConverter == null ? jsonSerializer : new StdDelegatingSerializer(findConverter, findConverter.getOutputType(serializerProvider.getTypeFactory()), jsonSerializer);
    }

    protected Converter<Object, Object> findConverter(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findSerializationConverter = serializerProvider.getAnnotationIntrospector().findSerializationConverter(annotated);
        if (findSerializationConverter == null) {
            return null;
        }
        return serializerProvider.converterInstance(annotated, findSerializationConverter);
    }

    public JsonSerializer<?> buildContainerSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        SerializationConfig config = serializerProvider.getConfig();
        if (!z && javaType.useStaticType() && (!javaType.isContainerType() || !javaType.getContentType().isJavaLangObject())) {
            z = true;
        }
        TypeSerializer createTypeSerializer = createTypeSerializer(config, javaType.getContentType());
        if (createTypeSerializer != null) {
            z = false;
        }
        JsonSerializer<Object> _findContentSerializer = _findContentSerializer(serializerProvider, beanDescription.getClassInfo());
        if (javaType.isMapLikeType()) {
            MapLikeType mapLikeType = (MapLikeType) javaType;
            JsonSerializer<Object> _findKeySerializer = _findKeySerializer(serializerProvider, beanDescription.getClassInfo());
            if (mapLikeType instanceof MapType) {
                return buildMapSerializer(serializerProvider, (MapType) mapLikeType, beanDescription, z, _findKeySerializer, createTypeSerializer, _findContentSerializer);
            }
            JsonSerializer<?> jsonSerializer = null;
            MapLikeType mapLikeType2 = (MapLikeType) javaType;
            Iterator<Serializers> it = customSerializers().iterator();
            while (it.hasNext()) {
                jsonSerializer = it.next().findMapLikeSerializer(config, mapLikeType2, beanDescription, _findKeySerializer, createTypeSerializer, _findContentSerializer);
                if (jsonSerializer != null) {
                    break;
                }
            }
            if (jsonSerializer == null) {
                jsonSerializer = findSerializerByAnnotations(serializerProvider, javaType, beanDescription);
            }
            if (jsonSerializer != null && this._factoryConfig.hasSerializerModifiers()) {
                Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
                while (it2.hasNext()) {
                    jsonSerializer = it2.next().modifyMapLikeSerializer(config, mapLikeType2, beanDescription, jsonSerializer);
                }
            }
            return jsonSerializer;
        }
        if (!javaType.isCollectionLikeType()) {
            if (javaType.isArrayType()) {
                return buildArraySerializer(serializerProvider, (ArrayType) javaType, beanDescription, z, createTypeSerializer, _findContentSerializer);
            }
            return null;
        }
        CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
        if (collectionLikeType instanceof CollectionType) {
            return buildCollectionSerializer(serializerProvider, (CollectionType) collectionLikeType, beanDescription, z, createTypeSerializer, _findContentSerializer);
        }
        JsonSerializer<?> jsonSerializer2 = null;
        CollectionLikeType collectionLikeType2 = (CollectionLikeType) javaType;
        Iterator<Serializers> it3 = customSerializers().iterator();
        while (it3.hasNext()) {
            jsonSerializer2 = it3.next().findCollectionLikeSerializer(config, collectionLikeType2, beanDescription, createTypeSerializer, _findContentSerializer);
            if (jsonSerializer2 != null) {
                break;
            }
        }
        if (jsonSerializer2 == null) {
            jsonSerializer2 = findSerializerByAnnotations(serializerProvider, javaType, beanDescription);
        }
        if (jsonSerializer2 != null && this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it4 = this._factoryConfig.serializerModifiers().iterator();
            while (it4.hasNext()) {
                jsonSerializer2 = it4.next().modifyCollectionLikeSerializer(config, collectionLikeType2, beanDescription, jsonSerializer2);
            }
        }
        return jsonSerializer2;
    }

    protected JsonSerializer<?> buildCollectionSerializer(SerializerProvider serializerProvider, CollectionType collectionType, BeanDescription beanDescription, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) throws JsonMappingException {
        SerializationConfig config = serializerProvider.getConfig();
        JsonSerializer<?> jsonSerializer2 = null;
        Iterator<Serializers> it = customSerializers().iterator();
        while (it.hasNext()) {
            jsonSerializer2 = it.next().findCollectionSerializer(config, collectionType, beanDescription, typeSerializer, jsonSerializer);
            if (jsonSerializer2 != null) {
                break;
            }
        }
        if (jsonSerializer2 == null) {
            jsonSerializer2 = findSerializerByAnnotations(serializerProvider, collectionType, beanDescription);
            if (jsonSerializer2 == null) {
                if (beanDescription.findExpectedFormat().getShape() == JsonFormat.Shape.OBJECT) {
                    return null;
                }
                Class<?> rawClass = collectionType.getRawClass();
                if (EnumSet.class.isAssignableFrom(rawClass)) {
                    JavaType contentType = collectionType.getContentType();
                    if (!contentType.isEnumImplType()) {
                        contentType = null;
                    }
                    jsonSerializer2 = buildEnumSetSerializer(contentType);
                } else {
                    Class<?> rawClass2 = collectionType.getContentType().getRawClass();
                    if (isIndexedList(rawClass)) {
                        if (rawClass2 != String.class) {
                            jsonSerializer2 = buildIndexedListSerializer(collectionType.getContentType(), z, typeSerializer, jsonSerializer);
                        } else if (ClassUtil.isJacksonStdImpl(jsonSerializer)) {
                            jsonSerializer2 = IndexedStringListSerializer.instance;
                        }
                    } else if (rawClass2 == String.class && ClassUtil.isJacksonStdImpl(jsonSerializer)) {
                        jsonSerializer2 = StringCollectionSerializer.instance;
                    }
                    if (jsonSerializer2 == null) {
                        jsonSerializer2 = buildCollectionSerializer(collectionType.getContentType(), z, typeSerializer, jsonSerializer);
                    }
                }
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonSerializer2 = it2.next().modifyCollectionSerializer(config, collectionType, beanDescription, jsonSerializer2);
            }
        }
        return jsonSerializer2;
    }

    protected boolean isIndexedList(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    public ContainerSerializer<?> buildIndexedListSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return new IndexedListSerializer(javaType, z, typeSerializer, jsonSerializer);
    }

    public ContainerSerializer<?> buildCollectionSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return new CollectionSerializer(javaType, z, typeSerializer, jsonSerializer);
    }

    public JsonSerializer<?> buildEnumSetSerializer(JavaType javaType) {
        return new EnumSetSerializer(javaType);
    }

    protected JsonSerializer<?> buildMapSerializer(SerializerProvider serializerProvider, MapType mapType, BeanDescription beanDescription, boolean z, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2) throws JsonMappingException {
        if (beanDescription.findExpectedFormat().getShape() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        JsonSerializer<?> jsonSerializer3 = null;
        SerializationConfig config = serializerProvider.getConfig();
        Iterator<Serializers> it = customSerializers().iterator();
        while (it.hasNext()) {
            jsonSerializer3 = it.next().findMapSerializer(config, mapType, beanDescription, jsonSerializer, typeSerializer, jsonSerializer2);
            if (jsonSerializer3 != null) {
                break;
            }
        }
        if (jsonSerializer3 == null) {
            jsonSerializer3 = findSerializerByAnnotations(serializerProvider, mapType, beanDescription);
            if (jsonSerializer3 == null) {
                Object findFilterId = findFilterId(config, beanDescription);
                JsonIgnoreProperties.Value defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, beanDescription.getClassInfo());
                Set<String> findIgnoredForSerialization = defaultPropertyIgnorals == null ? null : defaultPropertyIgnorals.findIgnoredForSerialization();
                JsonIncludeProperties.Value defaultPropertyInclusions = config.getDefaultPropertyInclusions(Map.class, beanDescription.getClassInfo());
                jsonSerializer3 = _checkMapContentInclusion(serializerProvider, beanDescription, MapSerializer.construct(findIgnoredForSerialization, defaultPropertyInclusions == null ? null : defaultPropertyInclusions.getIncluded(), mapType, z, typeSerializer, jsonSerializer, jsonSerializer2, findFilterId));
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonSerializer3 = it2.next().modifyMapSerializer(config, mapType, beanDescription, jsonSerializer3);
            }
        }
        return jsonSerializer3;
    }

    protected MapSerializer _checkMapContentInclusion(SerializerProvider serializerProvider, BeanDescription beanDescription, MapSerializer mapSerializer) throws JsonMappingException {
        Object obj;
        JavaType contentType = mapSerializer.getContentType();
        JsonInclude.Value _findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, contentType, Map.class);
        JsonInclude.Include contentInclusion = _findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : _findInclusionWithContent.getContentInclusion();
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            return !serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES) ? mapSerializer.withContentInclusion(null, true) : mapSerializer;
        }
        boolean z = true;
        switch (contentInclusion) {
            case NON_DEFAULT:
                obj = BeanUtil.getDefaultValue(contentType);
                if (obj != null && obj.getClass().isArray()) {
                    obj = ArrayBuilders.getArrayComparator(obj);
                    break;
                }
                break;
            case NON_ABSENT:
                obj = contentType.isReferenceType() ? MapSerializer.MARKER_FOR_EMPTY : null;
                break;
            case NON_EMPTY:
                obj = MapSerializer.MARKER_FOR_EMPTY;
                break;
            case CUSTOM:
                obj = serializerProvider.includeFilterInstance(null, _findInclusionWithContent.getContentFilter());
                if (obj != null) {
                    z = serializerProvider.includeFilterSuppressNulls(obj);
                    break;
                }
                break;
            case NON_NULL:
            default:
                obj = null;
                break;
        }
        return mapSerializer.withContentInclusion(obj, z);
    }

    protected JsonSerializer<?> buildMapEntrySerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2, JavaType javaType3) throws JsonMappingException {
        Object obj;
        if (JsonFormat.Value.merge(beanDescription.findExpectedFormat(), serializerProvider.getDefaultPropertyFormat(Map.Entry.class)).getShape() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        MapEntrySerializer mapEntrySerializer = new MapEntrySerializer(javaType3, javaType2, javaType3, z, createTypeSerializer(serializerProvider.getConfig(), javaType3), null);
        JavaType contentType = mapEntrySerializer.getContentType();
        JsonInclude.Value _findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, contentType, Map.Entry.class);
        JsonInclude.Include contentInclusion = _findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : _findInclusionWithContent.getContentInclusion();
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            return mapEntrySerializer;
        }
        boolean z2 = true;
        switch (contentInclusion) {
            case NON_DEFAULT:
                obj = BeanUtil.getDefaultValue(contentType);
                if (obj != null && obj.getClass().isArray()) {
                    obj = ArrayBuilders.getArrayComparator(obj);
                    break;
                }
                break;
            case NON_ABSENT:
                obj = contentType.isReferenceType() ? MapSerializer.MARKER_FOR_EMPTY : null;
                break;
            case NON_EMPTY:
                obj = MapSerializer.MARKER_FOR_EMPTY;
                break;
            case CUSTOM:
                obj = serializerProvider.includeFilterInstance(null, _findInclusionWithContent.getContentFilter());
                if (obj != null) {
                    z2 = serializerProvider.includeFilterSuppressNulls(obj);
                    break;
                }
                break;
            case NON_NULL:
            default:
                obj = null;
                break;
        }
        return mapEntrySerializer.withContentInclusion(obj, z2);
    }

    protected JsonInclude.Value _findInclusionWithContent(SerializerProvider serializerProvider, BeanDescription beanDescription, JavaType javaType, Class<?> cls) throws JsonMappingException {
        SerializationConfig config = serializerProvider.getConfig();
        JsonInclude.Value defaultPropertyInclusion = config.getDefaultPropertyInclusion(cls, beanDescription.findPropertyInclusion(config.getDefaultPropertyInclusion()));
        JsonInclude.Value defaultPropertyInclusion2 = config.getDefaultPropertyInclusion(javaType.getRawClass(), null);
        if (defaultPropertyInclusion2 != null) {
            switch (defaultPropertyInclusion2.getValueInclusion()) {
                case CUSTOM:
                    defaultPropertyInclusion = defaultPropertyInclusion.withContentFilter(defaultPropertyInclusion2.getContentFilter());
                    break;
                case USE_DEFAULTS:
                    break;
                default:
                    defaultPropertyInclusion = defaultPropertyInclusion.withContentInclusion(defaultPropertyInclusion2.getValueInclusion());
                    break;
            }
        }
        return defaultPropertyInclusion;
    }

    protected JsonSerializer<?> buildArraySerializer(SerializerProvider serializerProvider, ArrayType arrayType, BeanDescription beanDescription, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) throws JsonMappingException {
        SerializationConfig config = serializerProvider.getConfig();
        JsonSerializer<?> jsonSerializer2 = null;
        Iterator<Serializers> it = customSerializers().iterator();
        while (it.hasNext()) {
            jsonSerializer2 = it.next().findArraySerializer(config, arrayType, beanDescription, typeSerializer, jsonSerializer);
            if (jsonSerializer2 != null) {
                break;
            }
        }
        if (jsonSerializer2 == null) {
            Class<?> rawClass = arrayType.getRawClass();
            if (jsonSerializer == null || ClassUtil.isJacksonStdImpl(jsonSerializer)) {
                jsonSerializer2 = String[].class == rawClass ? StringArraySerializer.instance : StdArraySerializers.findStandardImpl(rawClass);
            }
            if (jsonSerializer2 == null) {
                jsonSerializer2 = new ObjectArraySerializer(arrayType.getContentType(), z, typeSerializer, jsonSerializer);
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonSerializer2 = it2.next().modifyArraySerializer(config, arrayType, beanDescription, jsonSerializer2);
            }
        }
        return jsonSerializer2;
    }

    public JsonSerializer<?> findReferenceSerializer(SerializerProvider serializerProvider, ReferenceType referenceType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        TypeSerializer typeSerializer = (TypeSerializer) contentType.getTypeHandler();
        SerializationConfig config = serializerProvider.getConfig();
        if (typeSerializer == null) {
            typeSerializer = createTypeSerializer(config, contentType);
        }
        JsonSerializer<Object> jsonSerializer = (JsonSerializer) contentType.getValueHandler();
        Iterator<Serializers> it = customSerializers().iterator();
        while (it.hasNext()) {
            JsonSerializer<?> findReferenceSerializer = it.next().findReferenceSerializer(config, referenceType, beanDescription, typeSerializer, jsonSerializer);
            if (findReferenceSerializer != null) {
                return findReferenceSerializer;
            }
        }
        if (referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            return buildAtomicReferenceSerializer(serializerProvider, referenceType, beanDescription, z, typeSerializer, jsonSerializer);
        }
        return null;
    }

    protected JsonSerializer<?> buildAtomicReferenceSerializer(SerializerProvider serializerProvider, ReferenceType referenceType, BeanDescription beanDescription, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) throws JsonMappingException {
        Object obj;
        boolean z2;
        JavaType referencedType = referenceType.getReferencedType();
        JsonInclude.Value _findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, referencedType, AtomicReference.class);
        JsonInclude.Include contentInclusion = _findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : _findInclusionWithContent.getContentInclusion();
        if (contentInclusion != JsonInclude.Include.USE_DEFAULTS && contentInclusion != JsonInclude.Include.ALWAYS) {
            z2 = true;
            switch (contentInclusion) {
                case NON_DEFAULT:
                    obj = BeanUtil.getDefaultValue(referencedType);
                    if (obj != null && obj.getClass().isArray()) {
                        obj = ArrayBuilders.getArrayComparator(obj);
                        break;
                    }
                    break;
                case NON_ABSENT:
                    obj = referencedType.isReferenceType() ? MapSerializer.MARKER_FOR_EMPTY : null;
                    break;
                case NON_EMPTY:
                    obj = MapSerializer.MARKER_FOR_EMPTY;
                    break;
                case CUSTOM:
                    obj = serializerProvider.includeFilterInstance(null, _findInclusionWithContent.getContentFilter());
                    if (obj != null) {
                        z2 = serializerProvider.includeFilterSuppressNulls(obj);
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                case NON_NULL:
                default:
                    obj = null;
                    break;
            }
        } else {
            obj = null;
            z2 = false;
        }
        return new AtomicReferenceSerializer(referenceType, z, typeSerializer, jsonSerializer).withContentInclusion(obj, z2);
    }

    protected JsonSerializer<?> buildIteratorSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2) throws JsonMappingException {
        return new IteratorSerializer(javaType2, z, createTypeSerializer(serializationConfig, javaType2));
    }

    protected JsonSerializer<?> buildIterableSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2) throws JsonMappingException {
        return new IterableSerializer(javaType2, z, createTypeSerializer(serializationConfig, javaType2));
    }

    protected JsonSerializer<?> buildEnumSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JsonFormat.Value findExpectedFormat = beanDescription.findExpectedFormat();
        if (findExpectedFormat.getShape() == JsonFormat.Shape.OBJECT) {
            ((BasicBeanDescription) beanDescription).removeProperty("declaringClass");
            if (!javaType.isEnumType()) {
                return null;
            }
            _removeEnumSelfReferences((BasicBeanDescription) beanDescription);
            return null;
        }
        JsonSerializer construct = EnumSerializer.construct(javaType.getRawClass(), serializationConfig, beanDescription, findExpectedFormat);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it = this._factoryConfig.serializerModifiers().iterator();
            while (it.hasNext()) {
                construct = it.next().modifyEnumSerializer(serializationConfig, javaType, beanDescription, construct);
            }
        }
        return construct;
    }

    private void _removeEnumSelfReferences(BasicBeanDescription basicBeanDescription) {
        Class<? extends Enum<?>> findEnumType = ClassUtil.findEnumType(basicBeanDescription.getBeanClass());
        Iterator<BeanPropertyDefinition> it = basicBeanDescription.findProperties().iterator();
        while (it.hasNext()) {
            JavaType primaryType = it.next().getPrimaryType();
            if (primaryType.isEnumType() && primaryType.isTypeOrSubTypeOf(findEnumType)) {
                it.remove();
            }
        }
    }

    protected JsonSerializer<Object> _findKeySerializer(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findKeySerializer = serializerProvider.getAnnotationIntrospector().findKeySerializer(annotated);
        if (findKeySerializer != null) {
            return serializerProvider.serializerInstance(annotated, findKeySerializer);
        }
        return null;
    }

    protected JsonSerializer<Object> _findContentSerializer(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findContentSerializer = serializerProvider.getAnnotationIntrospector().findContentSerializer(annotated);
        if (findContentSerializer != null) {
            return serializerProvider.serializerInstance(annotated, findContentSerializer);
        }
        return null;
    }

    public Object findFilterId(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        return serializationConfig.getAnnotationIntrospector().findFilterId(beanDescription.getClassInfo());
    }

    public boolean usesStaticTyping(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        JsonSerialize.Typing findSerializationTyping = serializationConfig.getAnnotationIntrospector().findSerializationTyping(beanDescription.getClassInfo());
        if (findSerializationTyping != null) {
            switch (findSerializationTyping) {
                case DYNAMIC:
                    return false;
                case STATIC:
                    return true;
            }
        }
        return serializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
    }

    static {
        HashMap<String, Class<? extends JsonSerializer<?>>> hashMap = new HashMap<>();
        HashMap<String, JsonSerializer<?>> hashMap2 = new HashMap<>();
        hashMap2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        hashMap2.put(StringBuffer.class.getName(), toStringSerializer);
        hashMap2.put(StringBuilder.class.getName(), toStringSerializer);
        hashMap2.put(Character.class.getName(), toStringSerializer);
        hashMap2.put(Character.TYPE.getName(), toStringSerializer);
        NumberSerializers.addAll(hashMap2);
        hashMap2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        hashMap2.put(Boolean.class.getName(), new BooleanSerializer(false));
        hashMap2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        hashMap2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        hashMap2.put(Calendar.class.getName(), CalendarSerializer.instance);
        hashMap2.put(Date.class.getName(), DateSerializer.instance);
        for (Map.Entry<Class<?>, Object> entry : StdJdkSerializers.all()) {
            Object value = entry.getValue();
            if (value instanceof JsonSerializer) {
                hashMap2.put(entry.getKey().getName(), (JsonSerializer) value);
            } else {
                hashMap.put(entry.getKey().getName(), (Class) value);
            }
        }
        hashMap.put(TokenBuffer.class.getName(), TokenBufferSerializer.class);
        _concrete = hashMap2;
        _concreteLazy = hashMap;
    }
}
