package com.kammoun.utils.jackson.databind.introspect;

import com.kammoun.utils.jackson.annotation.JsonInclude;
import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.annotation.JsonSetter;
import com.kammoun.utils.jackson.annotation.Nulls;
import com.kammoun.utils.jackson.databind.AnnotationIntrospector;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.PropertyMetadata;
import com.kammoun.utils.jackson.databind.PropertyName;
import com.kammoun.utils.jackson.databind.cfg.ConfigOverride;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public class POJOPropertyBuilder extends BeanPropertyDefinition implements Comparable<POJOPropertyBuilder> {
    private static final AnnotationIntrospector.ReferenceProperty NOT_REFEFERENCE_PROP = AnnotationIntrospector.ReferenceProperty.managed(JsonProperty.USE_DEFAULT_NAME);
    protected final boolean _forSerialization;
    protected final MapperConfig<?> _config;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final PropertyName _name;
    protected final PropertyName _internalName;
    protected Linked<AnnotatedField> _fields;
    protected Linked<AnnotatedParameter> _ctorParameters;
    protected Linked<AnnotatedMethod> _getters;
    protected Linked<AnnotatedMethod> _setters;
    protected transient PropertyMetadata _metadata;
    protected transient AnnotationIntrospector.ReferenceProperty _referenceInfo;

    public static final class Linked<T> {
        public final T value;
        public final Linked<T> next;
        public final PropertyName name;
        public final boolean isNameExplicit;
        public final boolean isVisible;
        public final boolean isMarkedIgnored;

        public Linked(T t, Linked<T> linked, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
            this.value = t;
            this.next = linked;
            this.name = (propertyName == null || propertyName.isEmpty()) ? null : propertyName;
            if (z) {
                if (this.name == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
                if (!propertyName.hasSimpleName()) {
                    z = false;
                }
            }
            this.isNameExplicit = z;
            this.isVisible = z2;
            this.isMarkedIgnored = z3;
        }

        public Linked<T> withoutNext() {
            return this.next == null ? this : new Linked<>(this.value, null, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withValue(T t) {
            return t == this.value ? this : new Linked<>(t, this.next, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withNext(Linked<T> linked) {
            return linked == this.next ? this : new Linked<>(this.value, linked, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withoutIgnored() {
            Linked<T> withoutIgnored;
            if (!this.isMarkedIgnored) {
                return (this.next == null || (withoutIgnored = this.next.withoutIgnored()) == this.next) ? this : withNext(withoutIgnored);
            }
            if (this.next == null) {
                return null;
            }
            return this.next.withoutIgnored();
        }

        public Linked<T> withoutNonVisible() {
            Linked<T> withoutNonVisible = this.next == null ? null : this.next.withoutNonVisible();
            return this.isVisible ? withNext(withoutNonVisible) : withoutNonVisible;
        }

        protected Linked<T> append(Linked<T> linked) {
            return this.next == null ? withNext(linked) : withNext(this.next.append(linked));
        }

        public Linked<T> trimByVisibility() {
            if (this.next == null) {
                return this;
            }
            Linked<T> trimByVisibility = this.next.trimByVisibility();
            return this.name != null ? trimByVisibility.name == null ? withNext(null) : withNext(trimByVisibility) : trimByVisibility.name != null ? trimByVisibility : this.isVisible == trimByVisibility.isVisible ? withNext(trimByVisibility) : this.isVisible ? withNext(null) : trimByVisibility;
        }

        public String toString() {
            String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.value.toString(), Boolean.valueOf(this.isVisible), Boolean.valueOf(this.isMarkedIgnored), Boolean.valueOf(this.isNameExplicit));
            if (this.next != null) {
                format = format + ", " + this.next.toString();
            }
            return format;
        }
    }

    protected static class MemberIterator<T extends AnnotatedMember> implements Iterator<T> {
        private Linked<T> next;

        public MemberIterator(Linked<T> linked) {
            this.next = linked;
        }

        @Override
        public boolean hasNext() {
            return this.next != null;
        }

        @Override
        public T next() {
            if (this.next == null) {
                throw new NoSuchElementException();
            }
            T t = this.next.value;
            this.next = this.next.next;
            return t;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public interface WithMember<T> {
        T withMember(AnnotatedMember annotatedMember);
    }

    public POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName) {
        this(mapperConfig, annotationIntrospector, z, propertyName, propertyName);
    }

    protected POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName, PropertyName propertyName2) {
        this._config = mapperConfig;
        this._annotationIntrospector = annotationIntrospector;
        this._internalName = propertyName;
        this._name = propertyName2;
        this._forSerialization = z;
    }

    protected POJOPropertyBuilder(POJOPropertyBuilder pOJOPropertyBuilder, PropertyName propertyName) {
        this._config = pOJOPropertyBuilder._config;
        this._annotationIntrospector = pOJOPropertyBuilder._annotationIntrospector;
        this._internalName = pOJOPropertyBuilder._internalName;
        this._name = propertyName;
        this._fields = pOJOPropertyBuilder._fields;
        this._ctorParameters = pOJOPropertyBuilder._ctorParameters;
        this._getters = pOJOPropertyBuilder._getters;
        this._setters = pOJOPropertyBuilder._setters;
        this._forSerialization = pOJOPropertyBuilder._forSerialization;
    }

    @Override
    public POJOPropertyBuilder withName(PropertyName propertyName) {
        return new POJOPropertyBuilder(this, propertyName);
    }

    @Override
    public POJOPropertyBuilder withSimpleName(String str) {
        PropertyName withSimpleName = this._name.withSimpleName(str);
        return withSimpleName == this._name ? this : new POJOPropertyBuilder(this, withSimpleName);
    }

    @Override
    public int compareTo(POJOPropertyBuilder pOJOPropertyBuilder) {
        if (this._ctorParameters != null) {
            if (pOJOPropertyBuilder._ctorParameters == null) {
                return -1;
            }
        } else if (pOJOPropertyBuilder._ctorParameters != null) {
            return 1;
        }
        return getName().compareTo(pOJOPropertyBuilder.getName());
    }

    @Override
    public String getName() {
        if (this._name == null) {
            return null;
        }
        return this._name.getSimpleName();
    }

    @Override
    public PropertyName getFullName() {
        return this._name;
    }

    @Override
    public boolean hasName(PropertyName propertyName) {
        return this._name.equals(propertyName);
    }

    @Override
    public String getInternalName() {
        return this._internalName.getSimpleName();
    }

    @Override
    public PropertyName getWrapperName() {
        AnnotatedMember primaryMember = getPrimaryMember();
        if (primaryMember == null || this._annotationIntrospector == null) {
            return null;
        }
        return this._annotationIntrospector.findWrapperName(primaryMember);
    }

    @Override
    public boolean isExplicitlyIncluded() {
        return _anyExplicits(this._fields) || _anyExplicits(this._getters) || _anyExplicits(this._setters) || _anyExplicitNames(this._ctorParameters);
    }

    @Override
    public boolean isExplicitlyNamed() {
        return _anyExplicitNames(this._fields) || _anyExplicitNames(this._getters) || _anyExplicitNames(this._setters) || _anyExplicitNames(this._ctorParameters);
    }

    @Override
    public PropertyMetadata getMetadata() {
        if (this._metadata == null) {
            AnnotatedMember primaryMemberUnchecked = getPrimaryMemberUnchecked();
            if (primaryMemberUnchecked == null) {
                this._metadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
            } else {
                Boolean hasRequiredMarker = this._annotationIntrospector.hasRequiredMarker(primaryMemberUnchecked);
                String findPropertyDescription = this._annotationIntrospector.findPropertyDescription(primaryMemberUnchecked);
                Integer findPropertyIndex = this._annotationIntrospector.findPropertyIndex(primaryMemberUnchecked);
                String findPropertyDefaultValue = this._annotationIntrospector.findPropertyDefaultValue(primaryMemberUnchecked);
                if (hasRequiredMarker == null && findPropertyIndex == null && findPropertyDefaultValue == null) {
                    this._metadata = findPropertyDescription == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : PropertyMetadata.STD_REQUIRED_OR_OPTIONAL.withDescription(findPropertyDescription);
                } else {
                    this._metadata = PropertyMetadata.construct(hasRequiredMarker, findPropertyDescription, findPropertyIndex, findPropertyDefaultValue);
                }
                if (!this._forSerialization) {
                    this._metadata = _getSetterInfo(this._metadata, primaryMemberUnchecked);
                }
            }
        }
        return this._metadata;
    }

    protected PropertyMetadata _getSetterInfo(PropertyMetadata propertyMetadata, AnnotatedMember annotatedMember) {
        Boolean mergeable;
        Boolean findMergeInfo;
        boolean z = true;
        Nulls nulls = null;
        Nulls nulls2 = null;
        AnnotatedMember accessor = getAccessor();
        if (annotatedMember != null) {
            if (this._annotationIntrospector != null) {
                if (accessor != null && (findMergeInfo = this._annotationIntrospector.findMergeInfo(annotatedMember)) != null) {
                    z = false;
                    if (findMergeInfo.booleanValue()) {
                        propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.MergeInfo.createForPropertyOverride(accessor));
                    }
                }
                JsonSetter.Value findSetterInfo = this._annotationIntrospector.findSetterInfo(annotatedMember);
                if (findSetterInfo != null) {
                    nulls = findSetterInfo.nonDefaultValueNulls();
                    nulls2 = findSetterInfo.nonDefaultContentNulls();
                }
            }
            if (z || nulls == null || nulls2 == null) {
                ConfigOverride configOverride = this._config.getConfigOverride(_rawTypeOf(annotatedMember));
                JsonSetter.Value setterInfo = configOverride.getSetterInfo();
                if (setterInfo != null) {
                    if (nulls == null) {
                        nulls = setterInfo.nonDefaultValueNulls();
                    }
                    if (nulls2 == null) {
                        nulls2 = setterInfo.nonDefaultContentNulls();
                    }
                }
                if (z && accessor != null && (mergeable = configOverride.getMergeable()) != null) {
                    z = false;
                    if (mergeable.booleanValue()) {
                        propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.MergeInfo.createForTypeOverride(accessor));
                    }
                }
            }
        }
        if (z || nulls == null || nulls2 == null) {
            JsonSetter.Value defaultSetterInfo = this._config.getDefaultSetterInfo();
            if (nulls == null) {
                nulls = defaultSetterInfo.nonDefaultValueNulls();
            }
            if (nulls2 == null) {
                nulls2 = defaultSetterInfo.nonDefaultContentNulls();
            }
            if (z) {
                if (Boolean.TRUE.equals(this._config.getDefaultMergeable()) && accessor != null) {
                    propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.MergeInfo.createForDefaults(accessor));
                }
            }
        }
        if (nulls != null || nulls2 != null) {
            propertyMetadata = propertyMetadata.withNulls(nulls, nulls2);
        }
        return propertyMetadata;
    }

    @Override
    public JavaType getPrimaryType() {
        if (this._forSerialization) {
            AnnotatedMethod getter = getGetter();
            if (getter == null) {
                getter = getField();
                if (getter == null) {
                    return TypeFactory.unknownType();
                }
            }
            return getter.getType();
        }
        AnnotatedParameter constructorParameter = getConstructorParameter();
        if (constructorParameter == null) {
            AnnotatedMethod setter = getSetter();
            if (setter != null) {
                return setter.getParameterType(0);
            }
            constructorParameter = getField();
        }
        if (constructorParameter == null) {
            constructorParameter = getGetter();
            if (constructorParameter == null) {
                return TypeFactory.unknownType();
            }
        }
        return constructorParameter.getType();
    }

    @Override
    public Class<?> getRawPrimaryType() {
        return getPrimaryType().getRawClass();
    }

    @Override
    public boolean hasGetter() {
        return this._getters != null;
    }

    @Override
    public boolean hasSetter() {
        return this._setters != null;
    }

    @Override
    public boolean hasField() {
        return this._fields != null;
    }

    @Override
    public boolean hasConstructorParameter() {
        return this._ctorParameters != null;
    }

    @Override
    public boolean couldDeserialize() {
        return (this._ctorParameters == null && this._setters == null && (this._fields == null || !_anyVisible(this._fields))) ? false : true;
    }

    @Override
    public boolean couldSerialize() {
        return (this._getters == null && this._fields == null) ? false : true;
    }

    @Override
    public AnnotatedMethod getGetter() {
        Linked<AnnotatedMethod> linked = this._getters;
        if (linked == null) {
            return null;
        }
        Linked<AnnotatedMethod> linked2 = linked.next;
        if (linked2 == null) {
            return linked.value;
        }
        while (linked2 != null) {
            Class<?> declaringClass = linked.value.getDeclaringClass();
            Class<?> declaringClass2 = linked2.value.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    linked = linked2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                    continue;
                }
                linked2 = linked2.next;
            }
            int _getterPriority = _getterPriority(linked2.value);
            int _getterPriority2 = _getterPriority(linked.value);
            if (_getterPriority == _getterPriority2) {
                throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + linked.value.getFullName() + " vs " + linked2.value.getFullName());
            }
            if (_getterPriority < _getterPriority2) {
                linked = linked2;
            }
            linked2 = linked2.next;
        }
        this._getters = linked.withoutNext();
        return linked.value;
    }

    public AnnotatedMethod getGetterUnchecked() {
        Linked<AnnotatedMethod> linked = this._getters;
        if (linked == null) {
            return null;
        }
        return linked.value;
    }

    @Override
    public AnnotatedMethod getSetter() {
        Linked<AnnotatedMethod> linked = this._setters;
        if (linked == null) {
            return null;
        }
        Linked<AnnotatedMethod> linked2 = linked.next;
        if (linked2 == null) {
            return linked.value;
        }
        while (linked2 != null) {
            AnnotatedMethod _selectSetter = _selectSetter(linked.value, linked2.value);
            if (_selectSetter != linked.value) {
                if (_selectSetter != linked2.value) {
                    return _selectSetterFromMultiple(linked, linked2);
                }
                linked = linked2;
            }
            linked2 = linked2.next;
        }
        this._setters = linked.withoutNext();
        return linked.value;
    }

    public AnnotatedMethod getSetterUnchecked() {
        Linked<AnnotatedMethod> linked = this._setters;
        if (linked == null) {
            return null;
        }
        return linked.value;
    }

    protected AnnotatedMethod _selectSetterFromMultiple(Linked<AnnotatedMethod> linked, Linked<AnnotatedMethod> linked2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(linked.value);
        arrayList.add(linked2.value);
        Linked<AnnotatedMethod> linked3 = linked2.next;
        while (true) {
            Linked<AnnotatedMethod> linked4 = linked3;
            if (linked4 == null) {
                break;
            }
            AnnotatedMethod _selectSetter = _selectSetter(linked.value, linked4.value);
            if (_selectSetter != linked.value) {
                if (_selectSetter == linked4.value) {
                    arrayList.clear();
                    linked = linked4;
                } else {
                    arrayList.add(linked4.value);
                }
            }
            linked3 = linked4.next;
        }
        if (!arrayList.isEmpty()) {
            throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s", getName(), (String) arrayList.stream().map((v0) -> {
                return v0.getFullName();
            }).collect(Collectors.joining(" vs "))));
        }
        this._setters = linked.withoutNext();
        return linked.value;
    }

    protected AnnotatedMethod _selectSetter(AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<?> declaringClass = annotatedMethod.getDeclaringClass();
        Class<?> declaringClass2 = annotatedMethod2.getDeclaringClass();
        if (declaringClass != declaringClass2) {
            if (declaringClass.isAssignableFrom(declaringClass2)) {
                return annotatedMethod2;
            }
            if (declaringClass2.isAssignableFrom(declaringClass)) {
                return annotatedMethod;
            }
        }
        int _setterPriority = _setterPriority(annotatedMethod2);
        int _setterPriority2 = _setterPriority(annotatedMethod);
        if (_setterPriority != _setterPriority2) {
            return _setterPriority < _setterPriority2 ? annotatedMethod2 : annotatedMethod;
        }
        if (this._annotationIntrospector == null) {
            return null;
        }
        return this._annotationIntrospector.resolveSetterConflict(this._config, annotatedMethod, annotatedMethod2);
    }

    @Override
    public AnnotatedField getField() {
        if (this._fields == null) {
            return null;
        }
        AnnotatedField annotatedField = this._fields.value;
        Linked linked = this._fields.next;
        while (true) {
            Linked linked2 = linked;
            if (linked2 == null) {
                return annotatedField;
            }
            AnnotatedField annotatedField2 = (AnnotatedField) linked2.value;
            Class<?> declaringClass = annotatedField.getDeclaringClass();
            Class<?> declaringClass2 = annotatedField2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedField = annotatedField2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                    continue;
                }
                linked = linked2.next;
            }
            boolean isStatic = annotatedField.isStatic();
            if (isStatic == annotatedField2.isStatic()) {
                throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + annotatedField.getFullName() + " vs " + annotatedField2.getFullName());
            }
            if (isStatic) {
                annotatedField = annotatedField2;
            }
            linked = linked2.next;
        }
    }

    public AnnotatedField getFieldUnchecked() {
        Linked<AnnotatedField> linked = this._fields;
        if (linked == null) {
            return null;
        }
        return linked.value;
    }

    @Override
    public AnnotatedParameter getConstructorParameter() {
        if (this._ctorParameters == null) {
            return null;
        }
        Linked<AnnotatedParameter> linked = this._ctorParameters;
        while (!(linked.value.getOwner() instanceof AnnotatedConstructor)) {
            linked = linked.next;
            if (linked == null) {
                return this._ctorParameters.value;
            }
        }
        return linked.value;
    }

    @Override
    public Iterator<AnnotatedParameter> getConstructorParameters() {
        return this._ctorParameters == null ? ClassUtil.emptyIterator() : new MemberIterator(this._ctorParameters);
    }

    @Override
    public AnnotatedMember getPrimaryMember() {
        if (this._forSerialization) {
            return getAccessor();
        }
        AnnotatedMember mutator = getMutator();
        if (mutator == null) {
            mutator = getAccessor();
        }
        return mutator;
    }

    protected AnnotatedMember getPrimaryMemberUnchecked() {
        if (this._forSerialization) {
            if (this._getters != null) {
                return this._getters.value;
            }
            if (this._fields != null) {
                return this._fields.value;
            }
            return null;
        }
        if (this._ctorParameters != null) {
            return this._ctorParameters.value;
        }
        if (this._setters != null) {
            return this._setters.value;
        }
        if (this._fields != null) {
            return this._fields.value;
        }
        if (this._getters != null) {
            return this._getters.value;
        }
        return null;
    }

    protected int _getterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    protected int _setterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        return (!name.startsWith("set") || name.length() <= 3) ? 2 : 1;
    }

    @Override
    public Class<?>[] findViews() {
        return (Class[]) fromMemberAnnotations(new WithMember<Class<?>[]>() {
            @Override
            public Class<?>[] withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findViews(annotatedMember);
            }
        });
    }

    @Override
    public AnnotationIntrospector.ReferenceProperty findReferenceType() {
        AnnotationIntrospector.ReferenceProperty referenceProperty = this._referenceInfo;
        if (referenceProperty != null) {
            if (referenceProperty == NOT_REFEFERENCE_PROP) {
                return null;
            }
            return referenceProperty;
        }
        AnnotationIntrospector.ReferenceProperty referenceProperty2 = (AnnotationIntrospector.ReferenceProperty) fromMemberAnnotations(new WithMember<AnnotationIntrospector.ReferenceProperty>() {
            @Override
            public AnnotationIntrospector.ReferenceProperty withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findReferenceType(annotatedMember);
            }
        });
        this._referenceInfo = referenceProperty2 == null ? NOT_REFEFERENCE_PROP : referenceProperty2;
        return referenceProperty2;
    }

    @Override
    public boolean isTypeId() {
        Boolean bool = (Boolean) fromMemberAnnotations(new WithMember<Boolean>() {
            @Override
            public Boolean withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.isTypeId(annotatedMember);
            }
        });
        return bool != null && bool.booleanValue();
    }

    @Override
    public ObjectIdInfo findObjectIdInfo() {
        return (ObjectIdInfo) fromMemberAnnotations(new WithMember<ObjectIdInfo>() {
            @Override
            public ObjectIdInfo withMember(AnnotatedMember annotatedMember) {
                ObjectIdInfo findObjectIdInfo = POJOPropertyBuilder.this._annotationIntrospector.findObjectIdInfo(annotatedMember);
                if (findObjectIdInfo != null) {
                    findObjectIdInfo = POJOPropertyBuilder.this._annotationIntrospector.findObjectReferenceInfo(annotatedMember, findObjectIdInfo);
                }
                return findObjectIdInfo;
            }
        });
    }

    @Override
    public JsonInclude.Value findInclusion() {
        JsonInclude.Value findPropertyInclusion = this._annotationIntrospector == null ? null : this._annotationIntrospector.findPropertyInclusion(getAccessor());
        return findPropertyInclusion == null ? JsonInclude.Value.empty() : findPropertyInclusion;
    }

    @Override
    public List<PropertyName> findAliases() {
        List<PropertyName> findPropertyAliases;
        AnnotatedMember primaryMember = getPrimaryMember();
        return (primaryMember == null || (findPropertyAliases = this._annotationIntrospector.findPropertyAliases(primaryMember)) == null) ? Collections.emptyList() : findPropertyAliases;
    }

    public JsonProperty.Access findAccess() {
        return (JsonProperty.Access) fromMemberAnnotationsExcept(new WithMember<JsonProperty.Access>() {
            @Override
            public JsonProperty.Access withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findPropertyAccess(annotatedMember);
            }
        }, JsonProperty.Access.AUTO);
    }

    public void addField(AnnotatedField annotatedField, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._fields = new Linked<>(annotatedField, this._fields, propertyName, z, z2, z3);
    }

    public void addCtor(AnnotatedParameter annotatedParameter, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._ctorParameters = new Linked<>(annotatedParameter, this._ctorParameters, propertyName, z, z2, z3);
    }

    public void addGetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._getters = new Linked<>(annotatedMethod, this._getters, propertyName, z, z2, z3);
    }

    public void addSetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._setters = new Linked<>(annotatedMethod, this._setters, propertyName, z, z2, z3);
    }

    public void addAll(POJOPropertyBuilder pOJOPropertyBuilder) {
        this._fields = merge(this._fields, pOJOPropertyBuilder._fields);
        this._ctorParameters = merge(this._ctorParameters, pOJOPropertyBuilder._ctorParameters);
        this._getters = merge(this._getters, pOJOPropertyBuilder._getters);
        this._setters = merge(this._setters, pOJOPropertyBuilder._setters);
    }

    private static <T> Linked<T> merge(Linked<T> linked, Linked<T> linked2) {
        return linked == null ? linked2 : linked2 == null ? linked : linked.append(linked2);
    }

    public void removeIgnored() {
        this._fields = _removeIgnored(this._fields);
        this._getters = _removeIgnored(this._getters);
        this._setters = _removeIgnored(this._setters);
        this._ctorParameters = _removeIgnored(this._ctorParameters);
    }

    @Deprecated
    public JsonProperty.Access removeNonVisible(boolean z) {
        return removeNonVisible(z, null);
    }

    public JsonProperty.Access removeNonVisible(boolean z, POJOPropertiesCollector pOJOPropertiesCollector) {
        JsonProperty.Access findAccess = findAccess();
        if (findAccess == null) {
            findAccess = JsonProperty.Access.AUTO;
        }
        switch (findAccess) {
            case READ_ONLY:
                if (pOJOPropertiesCollector != null) {
                    pOJOPropertiesCollector._collectIgnorals(getName());
                    Iterator<PropertyName> it = findExplicitNames().iterator();
                    while (it.hasNext()) {
                        pOJOPropertiesCollector._collectIgnorals(it.next().getSimpleName());
                    }
                }
                this._setters = null;
                this._ctorParameters = null;
                if (!this._forSerialization) {
                    this._fields = null;
                    break;
                }
                break;
            case READ_WRITE:
                break;
            case WRITE_ONLY:
                this._getters = null;
                if (this._forSerialization) {
                    this._fields = null;
                    break;
                }
                break;
            case AUTO:
            default:
                this._getters = _removeNonVisible(this._getters);
                this._ctorParameters = _removeNonVisible(this._ctorParameters);
                if (!z || this._getters == null) {
                    this._fields = _removeNonVisible(this._fields);
                    this._setters = _removeNonVisible(this._setters);
                    break;
                }
                break;
        }
        return findAccess;
    }

    public void removeConstructors() {
        this._ctorParameters = null;
    }

    public void trimByVisibility() {
        this._fields = _trimByVisibility(this._fields);
        this._getters = _trimByVisibility(this._getters);
        this._setters = _trimByVisibility(this._setters);
        this._ctorParameters = _trimByVisibility(this._ctorParameters);
    }

    public void mergeAnnotations(boolean z) {
        if (z) {
            if (this._getters != null) {
                this._getters = _applyAnnotations(this._getters, _mergeAnnotations(0, this._getters, this._fields, this._ctorParameters, this._setters));
                return;
            } else {
                if (this._fields != null) {
                    this._fields = _applyAnnotations(this._fields, _mergeAnnotations(0, this._fields, this._ctorParameters, this._setters));
                    return;
                }
                return;
            }
        }
        if (this._ctorParameters != null) {
            this._ctorParameters = _applyAnnotations(this._ctorParameters, _mergeAnnotations(0, this._ctorParameters, this._setters, this._fields, this._getters));
        } else if (this._setters != null) {
            this._setters = _applyAnnotations(this._setters, _mergeAnnotations(0, this._setters, this._fields, this._getters));
        } else if (this._fields != null) {
            this._fields = _applyAnnotations(this._fields, _mergeAnnotations(0, this._fields, this._getters));
        }
    }

    private AnnotationMap _mergeAnnotations(int i, Linked<? extends AnnotatedMember>... linkedArr) {
        AnnotationMap _getAllAnnotations = _getAllAnnotations(linkedArr[i]);
        do {
            i++;
            if (i >= linkedArr.length) {
                return _getAllAnnotations;
            }
        } while (linkedArr[i] == null);
        return AnnotationMap.merge(_getAllAnnotations, _mergeAnnotations(i, linkedArr));
    }

    private <T extends AnnotatedMember> AnnotationMap _getAllAnnotations(Linked<T> linked) {
        AnnotationMap allAnnotations = linked.value.getAllAnnotations();
        if (linked.next != null) {
            allAnnotations = AnnotationMap.merge(allAnnotations, _getAllAnnotations(linked.next));
        }
        return allAnnotations;
    }

    private <T extends AnnotatedMember> Linked<T> _applyAnnotations(Linked<T> linked, AnnotationMap annotationMap) {
        AnnotatedMember annotatedMember = (AnnotatedMember) linked.value.withAnnotations(annotationMap);
        if (linked.next != null) {
            linked = linked.withNext(_applyAnnotations(linked.next, annotationMap));
        }
        return linked.withValue(annotatedMember);
    }

    private <T> Linked<T> _removeIgnored(Linked<T> linked) {
        return linked == null ? linked : linked.withoutIgnored();
    }

    private <T> Linked<T> _removeNonVisible(Linked<T> linked) {
        return linked == null ? linked : linked.withoutNonVisible();
    }

    private <T> Linked<T> _trimByVisibility(Linked<T> linked) {
        return linked == null ? linked : linked.trimByVisibility();
    }

    private <T> boolean _anyExplicits(Linked<T> linked) {
        while (linked != null) {
            if (linked.name != null && linked.name.hasSimpleName()) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyExplicitNames(Linked<T> linked) {
        while (linked != null) {
            if (linked.name != null && linked.isNameExplicit) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    public boolean anyVisible() {
        return _anyVisible(this._fields) || _anyVisible(this._getters) || _anyVisible(this._setters) || _anyVisible(this._ctorParameters);
    }

    private <T> boolean _anyVisible(Linked<T> linked) {
        while (linked != null) {
            if (linked.isVisible) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    public boolean anyIgnorals() {
        return _anyIgnorals(this._fields) || _anyIgnorals(this._getters) || _anyIgnorals(this._setters) || _anyIgnorals(this._ctorParameters);
    }

    private <T> boolean _anyIgnorals(Linked<T> linked) {
        while (linked != null) {
            if (linked.isMarkedIgnored) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    public boolean anyExplicitsWithoutIgnoral() {
        return _anyExplicitsWithoutIgnoral(this._fields) || _anyExplicitsWithoutIgnoral(this._getters) || _anyExplicitsWithoutIgnoral(this._setters) || _anyExplicitNamesWithoutIgnoral(this._ctorParameters);
    }

    private <T> boolean _anyExplicitsWithoutIgnoral(Linked<T> linked) {
        while (linked != null) {
            if (!linked.isMarkedIgnored && linked.name != null && linked.name.hasSimpleName()) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyExplicitNamesWithoutIgnoral(Linked<T> linked) {
        while (linked != null) {
            if (!linked.isMarkedIgnored && linked.name != null && linked.isNameExplicit) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    public Set<PropertyName> findExplicitNames() {
        Set<PropertyName> _findExplicitNames = _findExplicitNames(this._ctorParameters, _findExplicitNames(this._setters, _findExplicitNames(this._getters, _findExplicitNames(this._fields, null))));
        return _findExplicitNames == null ? Collections.emptySet() : _findExplicitNames;
    }

    public Collection<POJOPropertyBuilder> explode(Collection<PropertyName> collection) {
        HashMap hashMap = new HashMap();
        _explode(collection, hashMap, this._fields);
        _explode(collection, hashMap, this._getters);
        _explode(collection, hashMap, this._setters);
        _explode(collection, hashMap, this._ctorParameters);
        return hashMap.values();
    }

    private void _explode(Collection<PropertyName> collection, Map<PropertyName, POJOPropertyBuilder> map, Linked<?> linked) {
        Linked linked2 = linked;
        while (true) {
            Linked linked3 = linked2;
            if (linked3 == null) {
                return;
            }
            PropertyName propertyName = linked3.name;
            if (linked3.isNameExplicit && propertyName != null) {
                POJOPropertyBuilder pOJOPropertyBuilder = map.get(propertyName);
                if (pOJOPropertyBuilder == null) {
                    pOJOPropertyBuilder = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, this._internalName, propertyName);
                    map.put(propertyName, pOJOPropertyBuilder);
                }
                if (linked == this._fields) {
                    pOJOPropertyBuilder._fields = linked3.withNext(pOJOPropertyBuilder._fields);
                } else if (linked == this._getters) {
                    pOJOPropertyBuilder._getters = linked3.withNext(pOJOPropertyBuilder._getters);
                } else if (linked == this._setters) {
                    pOJOPropertyBuilder._setters = linked3.withNext(pOJOPropertyBuilder._setters);
                } else {
                    if (linked != this._ctorParameters) {
                        throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                    }
                    pOJOPropertyBuilder._ctorParameters = linked3.withNext(pOJOPropertyBuilder._ctorParameters);
                }
            } else if (linked3.isVisible) {
                throw new IllegalStateException("Conflicting/ambiguous property name definitions (implicit name " + ClassUtil.name(this._name) + "): found multiple explicit names: " + collection + ", but also implicit accessor: " + linked3);
            }
            linked2 = linked3.next;
        }
    }

    private Set<PropertyName> _findExplicitNames(Linked<? extends AnnotatedMember> linked, Set<PropertyName> set) {
        while (linked != null) {
            if (linked.isNameExplicit && linked.name != null) {
                if (set == null) {
                    set = new HashSet();
                }
                set.add(linked.name);
            }
            linked = linked.next;
        }
        return set;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Property '").append(this._name).append("'; ctors: ").append(this._ctorParameters).append(", field(s): ").append(this._fields).append(", getter(s): ").append(this._getters).append(", setter(s): ").append(this._setters);
        sb.append("]");
        return sb.toString();
    }

    protected <T> T fromMemberAnnotations(WithMember<T> withMember) {
        T t = null;
        if (this._annotationIntrospector != null) {
            if (!this._forSerialization) {
                if (this._ctorParameters != null) {
                    t = withMember.withMember(this._ctorParameters.value);
                }
                if (t == null && this._setters != null) {
                    t = withMember.withMember(this._setters.value);
                }
            } else if (this._getters != null) {
                t = withMember.withMember(this._getters.value);
            }
            if (t == null && this._fields != null) {
                t = withMember.withMember(this._fields.value);
            }
        }
        return t;
    }

    protected <T> T fromMemberAnnotationsExcept(WithMember<T> withMember, T t) {
        T withMember2;
        T withMember3;
        T withMember4;
        T withMember5;
        T withMember6;
        T withMember7;
        T withMember8;
        T withMember9;
        if (this._annotationIntrospector == null) {
            return null;
        }
        if (this._forSerialization) {
            if (this._getters != null && (withMember9 = withMember.withMember(this._getters.value)) != null && withMember9 != t) {
                return withMember9;
            }
            if (this._fields != null && (withMember8 = withMember.withMember(this._fields.value)) != null && withMember8 != t) {
                return withMember8;
            }
            if (this._ctorParameters != null && (withMember7 = withMember.withMember(this._ctorParameters.value)) != null && withMember7 != t) {
                return withMember7;
            }
            if (this._setters == null || (withMember6 = withMember.withMember(this._setters.value)) == null || withMember6 == t) {
                return null;
            }
            return withMember6;
        }
        if (this._ctorParameters != null && (withMember5 = withMember.withMember(this._ctorParameters.value)) != null && withMember5 != t) {
            return withMember5;
        }
        if (this._setters != null && (withMember4 = withMember.withMember(this._setters.value)) != null && withMember4 != t) {
            return withMember4;
        }
        if (this._fields != null && (withMember3 = withMember.withMember(this._fields.value)) != null && withMember3 != t) {
            return withMember3;
        }
        if (this._getters == null || (withMember2 = withMember.withMember(this._getters.value)) == null || withMember2 == t) {
            return null;
        }
        return withMember2;
    }

    protected Class<?> _rawTypeOf(AnnotatedMember annotatedMember) {
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            if (annotatedMethod.getParameterCount() > 0) {
                return annotatedMethod.getParameterType(0).getRawClass();
            }
        }
        return annotatedMember.getType().getRawClass();
    }
}
