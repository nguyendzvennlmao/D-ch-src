package com.kammoun.utils.jackson.databind;

import com.kammoun.utils.jackson.annotation.JsonFormat;
import com.kammoun.utils.jackson.annotation.JsonInclude;
import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMember;
import com.kammoun.utils.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import com.kammoun.utils.jackson.databind.util.Annotations;
import com.kammoun.utils.jackson.databind.util.Named;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

public interface BeanProperty extends Named {
    public static final JsonFormat.Value EMPTY_FORMAT = new JsonFormat.Value();
    public static final JsonInclude.Value EMPTY_INCLUDE = JsonInclude.Value.empty();

    public static class Bogus implements BeanProperty {
        @Override
        public String getName() {
            return JsonProperty.USE_DEFAULT_NAME;
        }

        @Override
        public PropertyName getFullName() {
            return PropertyName.NO_NAME;
        }

        @Override
        public JavaType getType() {
            return TypeFactory.unknownType();
        }

        @Override
        public PropertyName getWrapperName() {
            return null;
        }

        @Override
        public PropertyMetadata getMetadata() {
            return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        }

        @Override
        public boolean isRequired() {
            return false;
        }

        @Override
        public boolean isVirtual() {
            return false;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            return null;
        }

        @Override
        public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        @Deprecated
        public JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationIntrospector) {
            return JsonFormat.Value.empty();
        }

        @Override
        public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            return JsonFormat.Value.empty();
        }

        @Override
        public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            return null;
        }

        @Override
        public List<PropertyName> findAliases(MapperConfig<?> mapperConfig) {
            return Collections.emptyList();
        }

        @Override
        public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException {
        }
    }

    public static class Std implements BeanProperty, Serializable {
        private static final long serialVersionUID = 1;
        protected final PropertyName _name;
        protected final JavaType _type;
        protected final PropertyName _wrapperName;
        protected final PropertyMetadata _metadata;
        protected final AnnotatedMember _member;

        public Std(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AnnotatedMember annotatedMember, PropertyMetadata propertyMetadata) {
            this._name = propertyName;
            this._type = javaType;
            this._wrapperName = propertyName2;
            this._metadata = propertyMetadata;
            this._member = annotatedMember;
        }

        @Deprecated
        public Std(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, Annotations annotations, AnnotatedMember annotatedMember, PropertyMetadata propertyMetadata) {
            this(propertyName, javaType, propertyName2, annotatedMember, propertyMetadata);
        }

        public Std(Std std, JavaType javaType) {
            this(std._name, javaType, std._wrapperName, std._member, std._metadata);
        }

        public Std withType(JavaType javaType) {
            return new Std(this, javaType);
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            if (this._member == null) {
                return null;
            }
            return (A) this._member.getAnnotation(cls);
        }

        @Override
        public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
            return null;
        }

        @Override
        @Deprecated
        public JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationIntrospector) {
            JsonFormat.Value findFormat;
            return (this._member == null || annotationIntrospector == null || (findFormat = annotationIntrospector.findFormat(this._member)) == null) ? EMPTY_FORMAT : findFormat;
        }

        @Override
        public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            JsonFormat.Value defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector == null || this._member == null) {
                return defaultPropertyFormat;
            }
            JsonFormat.Value findFormat = annotationIntrospector.findFormat(this._member);
            return findFormat == null ? defaultPropertyFormat : defaultPropertyFormat.withOverrides(findFormat);
        }

        @Override
        public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            JsonInclude.Value defaultInclusion = mapperConfig.getDefaultInclusion(cls, this._type.getRawClass());
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector == null || this._member == null) {
                return defaultInclusion;
            }
            JsonInclude.Value findPropertyInclusion = annotationIntrospector.findPropertyInclusion(this._member);
            return findPropertyInclusion == null ? defaultInclusion : defaultInclusion.withOverrides(findPropertyInclusion);
        }

        @Override
        public List<PropertyName> findAliases(MapperConfig<?> mapperConfig) {
            return Collections.emptyList();
        }

        @Override
        public String getName() {
            return this._name.getSimpleName();
        }

        @Override
        public PropertyName getFullName() {
            return this._name;
        }

        @Override
        public JavaType getType() {
            return this._type;
        }

        @Override
        public PropertyName getWrapperName() {
            return this._wrapperName;
        }

        @Override
        public boolean isRequired() {
            return this._metadata.isRequired();
        }

        @Override
        public PropertyMetadata getMetadata() {
            return this._metadata;
        }

        @Override
        public AnnotatedMember getMember() {
            return this._member;
        }

        @Override
        public boolean isVirtual() {
            return false;
        }

        @Override
        public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) {
            throw new UnsupportedOperationException("Instances of " + getClass().getName() + " should not get visited");
        }
    }

    @Override
    String getName();

    PropertyName getFullName();

    JavaType getType();

    PropertyName getWrapperName();

    PropertyMetadata getMetadata();

    boolean isRequired();

    boolean isVirtual();

    <A extends Annotation> A getAnnotation(Class<A> cls);

    <A extends Annotation> A getContextAnnotation(Class<A> cls);

    AnnotatedMember getMember();

    @Deprecated
    JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationIntrospector);

    JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls);

    JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls);

    List<PropertyName> findAliases(MapperConfig<?> mapperConfig);

    void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException;
}
