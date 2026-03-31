package com.kammoun.utils.jackson.databind.ser;

import com.kammoun.utils.jackson.annotation.JsonInclude;
import com.kammoun.utils.jackson.databind.AnnotationIntrospector;
import com.kammoun.utils.jackson.databind.BeanDescription;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.JsonSerializer;
import com.kammoun.utils.jackson.databind.MapperFeature;
import com.kammoun.utils.jackson.databind.SerializationConfig;
import com.kammoun.utils.jackson.databind.SerializationFeature;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import com.kammoun.utils.jackson.databind.annotation.JsonSerialize;
import com.kammoun.utils.jackson.databind.introspect.Annotated;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMember;
import com.kammoun.utils.jackson.databind.introspect.BeanPropertyDefinition;
import com.kammoun.utils.jackson.databind.jsontype.TypeSerializer;
import com.kammoun.utils.jackson.databind.util.Annotations;
import com.kammoun.utils.jackson.databind.util.ArrayBuilders;
import com.kammoun.utils.jackson.databind.util.BeanUtil;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import com.kammoun.utils.jackson.databind.util.NameTransformer;

public class PropertyBuilder {
    private static final Object NO_DEFAULT_MARKER = Boolean.FALSE;
    protected final SerializationConfig _config;
    protected final BeanDescription _beanDesc;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected Object _defaultBean;
    protected final JsonInclude.Value _defaultInclusion;
    protected final boolean _useRealPropertyDefaults;

    public PropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        this._config = serializationConfig;
        this._beanDesc = beanDescription;
        JsonInclude.Value merge = JsonInclude.Value.merge(beanDescription.findPropertyInclusion(JsonInclude.Value.empty()), serializationConfig.getDefaultPropertyInclusion(beanDescription.getBeanClass(), JsonInclude.Value.empty()));
        this._defaultInclusion = JsonInclude.Value.merge(serializationConfig.getDefaultPropertyInclusion(), merge);
        this._useRealPropertyDefaults = merge.getValueInclusion() == JsonInclude.Include.NON_DEFAULT;
        this._annotationIntrospector = this._config.getAnnotationIntrospector();
    }

    public Annotations getClassAnnotations() {
        return this._beanDesc.getClassAnnotations();
    }

    public BeanPropertyWriter buildWriter(SerializerProvider serializerProvider, BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, TypeSerializer typeSerializer2, AnnotatedMember annotatedMember, boolean z) throws JsonMappingException {
        Object defaultBean;
        try {
            JavaType findSerializationType = findSerializationType(annotatedMember, z, javaType);
            if (typeSerializer2 != null) {
                if (findSerializationType == null) {
                    findSerializationType = javaType;
                }
                if (findSerializationType.getContentType() == null) {
                    serializerProvider.reportBadPropertyDefinition(this._beanDesc, beanPropertyDefinition, "serialization type " + findSerializationType + " has no content", new Object[0]);
                }
                findSerializationType = findSerializationType.withContentTypeHandler(typeSerializer2);
                findSerializationType.getContentType();
            }
            Object obj = null;
            boolean z2 = false;
            JavaType javaType2 = findSerializationType == null ? javaType : findSerializationType;
            AnnotatedMember accessor = beanPropertyDefinition.getAccessor();
            if (accessor == null) {
                return (BeanPropertyWriter) serializerProvider.reportBadPropertyDefinition(this._beanDesc, beanPropertyDefinition, "could not determine property type", new Object[0]);
            }
            JsonInclude.Value withOverrides = this._config.getDefaultInclusion(javaType2.getRawClass(), accessor.getRawType(), this._defaultInclusion).withOverrides(beanPropertyDefinition.findInclusion());
            JsonInclude.Include valueInclusion = withOverrides.getValueInclusion();
            if (valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
                valueInclusion = JsonInclude.Include.ALWAYS;
            }
            switch (valueInclusion) {
                case NON_DEFAULT:
                    if (!this._useRealPropertyDefaults || (defaultBean = getDefaultBean()) == null) {
                        obj = BeanUtil.getDefaultValue(javaType2);
                        z2 = true;
                    } else {
                        if (serializerProvider.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                            annotatedMember.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                        }
                        try {
                            obj = annotatedMember.getValue(defaultBean);
                        } catch (Exception e) {
                            _throwWrapped(e, beanPropertyDefinition.getName(), defaultBean);
                        }
                    }
                    if (obj != null) {
                        if (obj.getClass().isArray()) {
                            obj = ArrayBuilders.getArrayComparator(obj);
                            break;
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                    break;
                case NON_ABSENT:
                    z2 = true;
                    if (javaType2.isReferenceType()) {
                        obj = BeanPropertyWriter.MARKER_FOR_EMPTY;
                        break;
                    }
                    break;
                case NON_EMPTY:
                    z2 = true;
                    obj = BeanPropertyWriter.MARKER_FOR_EMPTY;
                    break;
                case CUSTOM:
                    obj = serializerProvider.includeFilterInstance(beanPropertyDefinition, withOverrides.getValueFilter());
                    break;
                case NON_NULL:
                    z2 = true;
                case ALWAYS:
                default:
                    SerializationFeature serializationFeature = SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
                    if (javaType2.isContainerType() && !this._config.isEnabled(serializationFeature)) {
                        obj = BeanPropertyWriter.MARKER_FOR_EMPTY;
                        break;
                    }
                    break;
            }
            Class<?>[] findViews = beanPropertyDefinition.findViews();
            if (findViews == null) {
                findViews = this._beanDesc.findDefaultViews();
            }
            BeanPropertyWriter _constructPropertyWriter = _constructPropertyWriter(beanPropertyDefinition, annotatedMember, this._beanDesc.getClassAnnotations(), javaType, jsonSerializer, typeSerializer, findSerializationType, z2, obj, findViews);
            Object findNullSerializer = this._annotationIntrospector.findNullSerializer(annotatedMember);
            if (findNullSerializer != null) {
                _constructPropertyWriter.assignNullSerializer(serializerProvider.serializerInstance(annotatedMember, findNullSerializer));
            }
            NameTransformer findUnwrappingNameTransformer = this._annotationIntrospector.findUnwrappingNameTransformer(annotatedMember);
            if (findUnwrappingNameTransformer != null) {
                _constructPropertyWriter = _constructPropertyWriter.unwrappingWriter(findUnwrappingNameTransformer);
            }
            return _constructPropertyWriter;
        } catch (JsonMappingException e2) {
            return beanPropertyDefinition == null ? (BeanPropertyWriter) serializerProvider.reportBadDefinition(javaType, ClassUtil.exceptionMessage(e2)) : (BeanPropertyWriter) serializerProvider.reportBadPropertyDefinition(this._beanDesc, beanPropertyDefinition, ClassUtil.exceptionMessage(e2), new Object[0]);
        }
    }

    protected BeanPropertyWriter _constructPropertyWriter(BeanPropertyDefinition beanPropertyDefinition, AnnotatedMember annotatedMember, Annotations annotations, JavaType javaType, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, JavaType javaType2, boolean z, Object obj, Class<?>[] clsArr) throws JsonMappingException {
        return new BeanPropertyWriter(beanPropertyDefinition, annotatedMember, annotations, javaType, jsonSerializer, typeSerializer, javaType2, z, obj, clsArr);
    }

    protected JavaType findSerializationType(Annotated annotated, boolean z, JavaType javaType) throws JsonMappingException {
        JavaType refineSerializationType = this._annotationIntrospector.refineSerializationType(this._config, annotated, javaType);
        if (refineSerializationType != javaType) {
            Class<?> rawClass = refineSerializationType.getRawClass();
            Class<?> rawClass2 = javaType.getRawClass();
            if (!rawClass.isAssignableFrom(rawClass2) && !rawClass2.isAssignableFrom(rawClass)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + annotated.getName() + "': class " + rawClass.getName() + " not a super-type of (declared) class " + rawClass2.getName());
            }
            z = true;
            javaType = refineSerializationType;
        }
        JsonSerialize.Typing findSerializationTyping = this._annotationIntrospector.findSerializationTyping(annotated);
        if (findSerializationTyping != null && findSerializationTyping != JsonSerialize.Typing.DEFAULT_TYPING) {
            z = findSerializationTyping == JsonSerialize.Typing.STATIC;
        }
        if (z) {
            return javaType.withStaticTyping();
        }
        return null;
    }

    protected Object getDefaultBean() {
        Object obj = this._defaultBean;
        if (obj == null) {
            obj = this._beanDesc.instantiateBean(this._config.canOverrideAccessModifiers());
            if (obj == null) {
                obj = NO_DEFAULT_MARKER;
            }
            this._defaultBean = obj;
        }
        if (obj == NO_DEFAULT_MARKER) {
            return null;
        }
        return this._defaultBean;
    }

    @Deprecated
    protected Object getPropertyDefaultValue(String str, AnnotatedMember annotatedMember, JavaType javaType) {
        Object defaultBean = getDefaultBean();
        if (defaultBean == null) {
            return getDefaultValue(javaType);
        }
        try {
            return annotatedMember.getValue(defaultBean);
        } catch (Exception e) {
            return _throwWrapped(e, str, defaultBean);
        }
    }

    @Deprecated
    protected Object getDefaultValue(JavaType javaType) {
        return BeanUtil.getDefaultValue(javaType);
    }

    protected Object _throwWrapped(Exception exc, String str, Object obj) {
        Throwable th = exc;
        while (true) {
            Throwable th2 = th;
            if (th2.getCause() == null) {
                ClassUtil.throwIfError(th2);
                ClassUtil.throwIfRTE(th2);
                throw new IllegalArgumentException("Failed to get property '" + str + "' of default " + obj.getClass().getName() + " instance");
            }
            th = th2.getCause();
        }
    }
}
