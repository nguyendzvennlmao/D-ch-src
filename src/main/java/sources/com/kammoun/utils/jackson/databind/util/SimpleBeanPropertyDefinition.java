package com.kammoun.utils.jackson.databind.util;

import com.kammoun.utils.jackson.annotation.JsonInclude;
import com.kammoun.utils.jackson.databind.AnnotationIntrospector;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.PropertyMetadata;
import com.kammoun.utils.jackson.databind.PropertyName;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedField;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMember;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMethod;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedParameter;
import com.kammoun.utils.jackson.databind.introspect.BeanPropertyDefinition;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SimpleBeanPropertyDefinition extends BeanPropertyDefinition {
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final AnnotatedMember _member;
    protected final PropertyMetadata _metadata;
    protected final PropertyName _fullName;
    protected final JsonInclude.Value _inclusion;

    protected SimpleBeanPropertyDefinition(AnnotationIntrospector annotationIntrospector, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Value value) {
        this._annotationIntrospector = annotationIntrospector;
        this._member = annotatedMember;
        this._fullName = propertyName;
        this._metadata = propertyMetadata == null ? PropertyMetadata.STD_OPTIONAL : propertyMetadata;
        this._inclusion = value;
    }

    public static SimpleBeanPropertyDefinition construct(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember) {
        return new SimpleBeanPropertyDefinition(mapperConfig.getAnnotationIntrospector(), annotatedMember, PropertyName.construct(annotatedMember.getName()), null, EMPTY_INCLUDE);
    }

    public static SimpleBeanPropertyDefinition construct(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName) {
        return construct(mapperConfig, annotatedMember, propertyName, (PropertyMetadata) null, EMPTY_INCLUDE);
    }

    public static SimpleBeanPropertyDefinition construct(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Include include) {
        return new SimpleBeanPropertyDefinition(mapperConfig.getAnnotationIntrospector(), annotatedMember, propertyName, propertyMetadata, (include == null || include == JsonInclude.Include.USE_DEFAULTS) ? EMPTY_INCLUDE : JsonInclude.Value.construct(include, null));
    }

    public static SimpleBeanPropertyDefinition construct(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Value value) {
        return new SimpleBeanPropertyDefinition(mapperConfig.getAnnotationIntrospector(), annotatedMember, propertyName, propertyMetadata, value);
    }

    @Override
    public BeanPropertyDefinition withSimpleName(String str) {
        return (!this._fullName.hasSimpleName(str) || this._fullName.hasNamespace()) ? new SimpleBeanPropertyDefinition(this._annotationIntrospector, this._member, new PropertyName(str), this._metadata, this._inclusion) : this;
    }

    @Override
    public BeanPropertyDefinition withName(PropertyName propertyName) {
        return this._fullName.equals(propertyName) ? this : new SimpleBeanPropertyDefinition(this._annotationIntrospector, this._member, propertyName, this._metadata, this._inclusion);
    }

    public BeanPropertyDefinition withMetadata(PropertyMetadata propertyMetadata) {
        return propertyMetadata.equals(this._metadata) ? this : new SimpleBeanPropertyDefinition(this._annotationIntrospector, this._member, this._fullName, propertyMetadata, this._inclusion);
    }

    public BeanPropertyDefinition withInclusion(JsonInclude.Value value) {
        return this._inclusion == value ? this : new SimpleBeanPropertyDefinition(this._annotationIntrospector, this._member, this._fullName, this._metadata, value);
    }

    @Override
    public String getName() {
        return this._fullName.getSimpleName();
    }

    @Override
    public PropertyName getFullName() {
        return this._fullName;
    }

    @Override
    public boolean hasName(PropertyName propertyName) {
        return this._fullName.equals(propertyName);
    }

    @Override
    public String getInternalName() {
        return getName();
    }

    @Override
    public PropertyName getWrapperName() {
        if (this._annotationIntrospector == null || this._member == null) {
            return null;
        }
        return this._annotationIntrospector.findWrapperName(this._member);
    }

    @Override
    public boolean isExplicitlyIncluded() {
        return false;
    }

    @Override
    public boolean isExplicitlyNamed() {
        return false;
    }

    @Override
    public PropertyMetadata getMetadata() {
        return this._metadata;
    }

    @Override
    public JavaType getPrimaryType() {
        return this._member == null ? TypeFactory.unknownType() : this._member.getType();
    }

    @Override
    public Class<?> getRawPrimaryType() {
        return this._member == null ? Object.class : this._member.getRawType();
    }

    @Override
    public JsonInclude.Value findInclusion() {
        return this._inclusion;
    }

    @Override
    public List<PropertyName> findAliases() {
        List<PropertyName> findPropertyAliases;
        AnnotatedMember primaryMember = getPrimaryMember();
        return (primaryMember == null || (findPropertyAliases = this._annotationIntrospector.findPropertyAliases(primaryMember)) == null) ? Collections.emptyList() : findPropertyAliases;
    }

    @Override
    public boolean hasGetter() {
        return getGetter() != null;
    }

    @Override
    public boolean hasSetter() {
        return getSetter() != null;
    }

    @Override
    public boolean hasField() {
        return this._member instanceof AnnotatedField;
    }

    @Override
    public boolean hasConstructorParameter() {
        return this._member instanceof AnnotatedParameter;
    }

    @Override
    public AnnotatedMethod getGetter() {
        if ((this._member instanceof AnnotatedMethod) && ((AnnotatedMethod) this._member).getParameterCount() == 0) {
            return (AnnotatedMethod) this._member;
        }
        return null;
    }

    @Override
    public AnnotatedMethod getSetter() {
        if ((this._member instanceof AnnotatedMethod) && ((AnnotatedMethod) this._member).getParameterCount() == 1) {
            return (AnnotatedMethod) this._member;
        }
        return null;
    }

    @Override
    public AnnotatedField getField() {
        if (this._member instanceof AnnotatedField) {
            return (AnnotatedField) this._member;
        }
        return null;
    }

    @Override
    public AnnotatedParameter getConstructorParameter() {
        if (this._member instanceof AnnotatedParameter) {
            return (AnnotatedParameter) this._member;
        }
        return null;
    }

    @Override
    public Iterator<AnnotatedParameter> getConstructorParameters() {
        AnnotatedParameter constructorParameter = getConstructorParameter();
        return constructorParameter == null ? ClassUtil.emptyIterator() : Collections.singleton(constructorParameter).iterator();
    }

    @Override
    public AnnotatedMember getPrimaryMember() {
        return this._member;
    }
}
