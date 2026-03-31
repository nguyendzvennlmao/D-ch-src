package com.kammoun.utils.jackson.databind.introspect;

import com.kammoun.utils.jackson.annotation.JsonInclude;
import com.kammoun.utils.jackson.databind.AnnotationIntrospector;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.PropertyMetadata;
import com.kammoun.utils.jackson.databind.PropertyName;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import com.kammoun.utils.jackson.databind.util.Named;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class BeanPropertyDefinition implements Named {
    protected static final JsonInclude.Value EMPTY_INCLUDE = JsonInclude.Value.empty();

    public abstract BeanPropertyDefinition withName(PropertyName propertyName);

    public abstract BeanPropertyDefinition withSimpleName(String str);

    @Override
    public abstract String getName();

    public abstract PropertyName getFullName();

    public boolean hasName(PropertyName propertyName) {
        return getFullName().equals(propertyName);
    }

    public abstract String getInternalName();

    public abstract PropertyName getWrapperName();

    public abstract boolean isExplicitlyIncluded();

    public boolean isExplicitlyNamed() {
        return isExplicitlyIncluded();
    }

    public abstract JavaType getPrimaryType();

    public abstract Class<?> getRawPrimaryType();

    public abstract PropertyMetadata getMetadata();

    public boolean isRequired() {
        return getMetadata().isRequired();
    }

    public boolean couldDeserialize() {
        return getMutator() != null;
    }

    public boolean couldSerialize() {
        return getAccessor() != null;
    }

    public abstract boolean hasGetter();

    public abstract boolean hasSetter();

    public abstract boolean hasField();

    public abstract boolean hasConstructorParameter();

    public abstract AnnotatedMethod getGetter();

    public abstract AnnotatedMethod getSetter();

    public abstract AnnotatedField getField();

    public abstract AnnotatedParameter getConstructorParameter();

    public Iterator<AnnotatedParameter> getConstructorParameters() {
        return ClassUtil.emptyIterator();
    }

    public AnnotatedMember getAccessor() {
        AnnotatedMethod getter = getGetter();
        if (getter == null) {
            getter = getField();
        }
        return getter;
    }

    public AnnotatedMember getMutator() {
        AnnotatedParameter constructorParameter = getConstructorParameter();
        if (constructorParameter == null) {
            constructorParameter = getSetter();
            if (constructorParameter == null) {
                constructorParameter = getField();
            }
        }
        return constructorParameter;
    }

    public AnnotatedMember getNonConstructorMutator() {
        AnnotatedMethod setter = getSetter();
        if (setter == null) {
            setter = getField();
        }
        return setter;
    }

    public abstract AnnotatedMember getPrimaryMember();

    public Class<?>[] findViews() {
        return null;
    }

    public AnnotationIntrospector.ReferenceProperty findReferenceType() {
        return null;
    }

    public String findReferenceName() {
        AnnotationIntrospector.ReferenceProperty findReferenceType = findReferenceType();
        if (findReferenceType == null) {
            return null;
        }
        return findReferenceType.getName();
    }

    public boolean isTypeId() {
        return false;
    }

    public ObjectIdInfo findObjectIdInfo() {
        return null;
    }

    public abstract JsonInclude.Value findInclusion();

    public List<PropertyName> findAliases() {
        return Collections.emptyList();
    }
}
