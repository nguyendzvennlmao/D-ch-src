package com.kammoun.utils.jackson.databind.introspect;

import com.kammoun.utils.jackson.annotation.JsonCreator;
import com.kammoun.utils.jackson.annotation.JsonFormat;
import com.kammoun.utils.jackson.annotation.JsonInclude;
import com.kammoun.utils.jackson.databind.AnnotationIntrospector;
import com.kammoun.utils.jackson.databind.BeanDescription;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonNode;
import com.kammoun.utils.jackson.databind.MapperFeature;
import com.kammoun.utils.jackson.databind.PropertyName;
import com.kammoun.utils.jackson.databind.annotation.JsonPOJOBuilder;
import com.kammoun.utils.jackson.databind.cfg.HandlerInstantiator;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;
import com.kammoun.utils.jackson.databind.type.TypeBindings;
import com.kammoun.utils.jackson.databind.util.Annotations;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import com.kammoun.utils.jackson.databind.util.Converter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BasicBeanDescription extends BeanDescription {
    private static final Class<?>[] NO_VIEWS = new Class[0];
    protected final POJOPropertiesCollector _propCollector;
    protected final MapperConfig<?> _config;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final AnnotatedClass _classInfo;
    protected Class<?>[] _defaultViews;
    protected boolean _defaultViewsResolved;
    protected List<BeanPropertyDefinition> _properties;
    protected ObjectIdInfo _objectIdInfo;

    protected BasicBeanDescription(POJOPropertiesCollector pOJOPropertiesCollector, JavaType javaType, AnnotatedClass annotatedClass) {
        super(javaType);
        this._propCollector = pOJOPropertiesCollector;
        this._config = pOJOPropertiesCollector.getConfig();
        if (this._config == null) {
            this._annotationIntrospector = null;
        } else {
            this._annotationIntrospector = this._config.getAnnotationIntrospector();
        }
        this._classInfo = annotatedClass;
    }

    protected BasicBeanDescription(MapperConfig<?> mapperConfig, JavaType javaType, AnnotatedClass annotatedClass, List<BeanPropertyDefinition> list) {
        super(javaType);
        this._propCollector = null;
        this._config = mapperConfig;
        if (this._config == null) {
            this._annotationIntrospector = null;
        } else {
            this._annotationIntrospector = this._config.getAnnotationIntrospector();
        }
        this._classInfo = annotatedClass;
        this._properties = list;
    }

    protected BasicBeanDescription(POJOPropertiesCollector pOJOPropertiesCollector) {
        this(pOJOPropertiesCollector, pOJOPropertiesCollector.getType(), pOJOPropertiesCollector.getClassDef());
        this._objectIdInfo = pOJOPropertiesCollector.getObjectIdInfo();
    }

    public static BasicBeanDescription forDeserialization(POJOPropertiesCollector pOJOPropertiesCollector) {
        return new BasicBeanDescription(pOJOPropertiesCollector);
    }

    public static BasicBeanDescription forSerialization(POJOPropertiesCollector pOJOPropertiesCollector) {
        return new BasicBeanDescription(pOJOPropertiesCollector);
    }

    public static BasicBeanDescription forOtherUse(MapperConfig<?> mapperConfig, JavaType javaType, AnnotatedClass annotatedClass) {
        return new BasicBeanDescription(mapperConfig, javaType, annotatedClass, Collections.emptyList());
    }

    protected List<BeanPropertyDefinition> _properties() {
        if (this._properties == null) {
            this._properties = this._propCollector.getProperties();
        }
        return this._properties;
    }

    public boolean removeProperty(String str) {
        Iterator<BeanPropertyDefinition> it = _properties().iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean addProperty(BeanPropertyDefinition beanPropertyDefinition) {
        if (hasProperty(beanPropertyDefinition.getFullName())) {
            return false;
        }
        _properties().add(beanPropertyDefinition);
        return true;
    }

    public boolean hasProperty(PropertyName propertyName) {
        return findProperty(propertyName) != null;
    }

    public BeanPropertyDefinition findProperty(PropertyName propertyName) {
        for (BeanPropertyDefinition beanPropertyDefinition : _properties()) {
            if (beanPropertyDefinition.hasName(propertyName)) {
                return beanPropertyDefinition;
            }
        }
        return null;
    }

    @Override
    public AnnotatedClass getClassInfo() {
        return this._classInfo;
    }

    @Override
    public ObjectIdInfo getObjectIdInfo() {
        return this._objectIdInfo;
    }

    @Override
    public List<BeanPropertyDefinition> findProperties() {
        return _properties();
    }

    @Override
    public AnnotatedMember findJsonKeyAccessor() {
        if (this._propCollector == null) {
            return null;
        }
        return this._propCollector.getJsonKeyAccessor();
    }

    @Override
    @Deprecated
    public AnnotatedMethod findJsonValueMethod() {
        if (this._propCollector == null) {
            return null;
        }
        return this._propCollector.getJsonValueMethod();
    }

    @Override
    public AnnotatedMember findJsonValueAccessor() {
        if (this._propCollector == null) {
            return null;
        }
        return this._propCollector.getJsonValueAccessor();
    }

    @Override
    public Set<String> getIgnoredPropertyNames() {
        Set<String> ignoredPropertyNames = this._propCollector == null ? null : this._propCollector.getIgnoredPropertyNames();
        return ignoredPropertyNames == null ? Collections.emptySet() : ignoredPropertyNames;
    }

    @Override
    public boolean hasKnownClassAnnotations() {
        return this._classInfo.hasAnnotations();
    }

    @Override
    public Annotations getClassAnnotations() {
        return this._classInfo.getAnnotations();
    }

    @Override
    @Deprecated
    public TypeBindings bindingsForBeanType() {
        return this._type.getBindings();
    }

    @Override
    @Deprecated
    public JavaType resolveType(Type type) {
        return this._config.getTypeFactory().resolveMemberType(type, this._type.getBindings());
    }

    @Override
    public AnnotatedConstructor findDefaultConstructor() {
        return this._classInfo.getDefaultConstructor();
    }

    @Override
    public AnnotatedMember findAnySetterAccessor() throws IllegalArgumentException {
        if (this._propCollector == null) {
            return null;
        }
        AnnotatedMethod anySetterMethod = this._propCollector.getAnySetterMethod();
        if (anySetterMethod != null) {
            Class<?> rawParameterType = anySetterMethod.getRawParameterType(0);
            if (rawParameterType == String.class || rawParameterType == Object.class) {
                return anySetterMethod;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", anySetterMethod.getName(), rawParameterType.getName()));
        }
        AnnotatedMember anySetterField = this._propCollector.getAnySetterField();
        if (anySetterField == null) {
            return null;
        }
        Class<?> rawType = anySetterField.getRawType();
        if (Map.class.isAssignableFrom(rawType) || JsonNode.class.isAssignableFrom(rawType)) {
            return anySetterField;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of `java.util.Map` or `JsonNode`", anySetterField.getName()));
    }

    @Override
    public Map<Object, AnnotatedMember> findInjectables() {
        return this._propCollector != null ? this._propCollector.getInjectables() : Collections.emptyMap();
    }

    @Override
    public List<AnnotatedConstructor> getConstructors() {
        return this._classInfo.getConstructors();
    }

    @Override
    public List<AnnotatedAndMetadata<AnnotatedConstructor, JsonCreator.Mode>> getConstructorsWithMode() {
        List<AnnotatedConstructor> constructors = this._classInfo.getConstructors();
        if (constructors.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (AnnotatedConstructor annotatedConstructor : constructors) {
            JsonCreator.Mode findCreatorAnnotation = this._annotationIntrospector.findCreatorAnnotation(this._config, annotatedConstructor);
            if (findCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                arrayList.add(AnnotatedAndMetadata.of(annotatedConstructor, findCreatorAnnotation));
            }
        }
        return arrayList;
    }

    @Override
    public Object instantiateBean(boolean z) {
        Throwable th;
        AnnotatedConstructor defaultConstructor = this._classInfo.getDefaultConstructor();
        if (defaultConstructor == null) {
            return null;
        }
        if (z) {
            defaultConstructor.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return defaultConstructor.call();
        } catch (Exception e) {
            Throwable th2 = e;
            while (true) {
                th = th2;
                if (th.getCause() == null) {
                    break;
                }
                th2 = th.getCause();
            }
            ClassUtil.throwIfError(th);
            ClassUtil.throwIfRTE(th);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + this._classInfo.getAnnotated().getName() + ": (" + th.getClass().getName() + ") " + ClassUtil.exceptionMessage(th), th);
        }
    }

    @Override
    public AnnotatedMethod findMethod(String str, Class<?>[] clsArr) {
        return this._classInfo.findMethod(str, clsArr);
    }

    @Override
    public JsonFormat.Value findExpectedFormat() {
        return this._propCollector == null ? JsonFormat.Value.empty() : this._propCollector.getFormatOverrides();
    }

    @Override
    public Class<?>[] findDefaultViews() {
        if (!this._defaultViewsResolved) {
            this._defaultViewsResolved = true;
            Class<?>[] findViews = this._annotationIntrospector == null ? null : this._annotationIntrospector.findViews(this._classInfo);
            if (findViews == null && !this._config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                findViews = NO_VIEWS;
            }
            this._defaultViews = findViews;
        }
        return this._defaultViews;
    }

    @Override
    public Converter<Object, Object> findSerializationConverter() {
        if (this._annotationIntrospector == null) {
            return null;
        }
        return _createConverter(this._annotationIntrospector.findSerializationConverter(this._classInfo));
    }

    @Override
    public JsonInclude.Value findPropertyInclusion(JsonInclude.Value value) {
        JsonInclude.Value findPropertyInclusion;
        return (this._annotationIntrospector == null || (findPropertyInclusion = this._annotationIntrospector.findPropertyInclusion(this._classInfo)) == null) ? value : value == null ? findPropertyInclusion : value.withOverrides(findPropertyInclusion);
    }

    @Override
    public AnnotatedMember findAnyGetter() throws IllegalArgumentException {
        if (this._propCollector == null) {
            return null;
        }
        AnnotatedMember anyGetterMethod = this._propCollector.getAnyGetterMethod();
        if (anyGetterMethod != null) {
            if (Map.class.isAssignableFrom(anyGetterMethod.getRawType())) {
                return anyGetterMethod;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on method %s(): return type is not instance of java.util.Map", anyGetterMethod.getName()));
        }
        AnnotatedMember anyGetterField = this._propCollector.getAnyGetterField();
        if (anyGetterField == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(anyGetterField.getRawType())) {
            return anyGetterField;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on field '%s': type is not instance of java.util.Map", anyGetterField.getName()));
    }

    @Override
    public List<BeanPropertyDefinition> findBackReferences() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (BeanPropertyDefinition beanPropertyDefinition : _properties()) {
            AnnotationIntrospector.ReferenceProperty findReferenceType = beanPropertyDefinition.findReferenceType();
            if (findReferenceType != null && findReferenceType.isBackReference()) {
                String name = findReferenceType.getName();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(name);
                } else if (!hashSet.add(name)) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name " + ClassUtil.name(name));
                }
                arrayList.add(beanPropertyDefinition);
            }
        }
        return arrayList;
    }

    @Override
    @Deprecated
    public Map<String, AnnotatedMember> findBackReferenceProperties() {
        List<BeanPropertyDefinition> findBackReferences = findBackReferences();
        if (findBackReferences == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (BeanPropertyDefinition beanPropertyDefinition : findBackReferences) {
            hashMap.put(beanPropertyDefinition.getName(), beanPropertyDefinition.getMutator());
        }
        return hashMap;
    }

    @Override
    public List<AnnotatedMethod> getFactoryMethods() {
        List<AnnotatedMethod> factoryMethods = this._classInfo.getFactoryMethods();
        if (factoryMethods.isEmpty()) {
            return factoryMethods;
        }
        ArrayList arrayList = null;
        for (AnnotatedMethod annotatedMethod : factoryMethods) {
            if (isFactoryMethod(annotatedMethod)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(annotatedMethod);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    @Override
    public List<AnnotatedAndMetadata<AnnotatedMethod, JsonCreator.Mode>> getFactoryMethodsWithMode() {
        List<AnnotatedMethod> factoryMethods = this._classInfo.getFactoryMethods();
        if (factoryMethods.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        Iterator<AnnotatedMethod> it = factoryMethods.iterator();
        while (it.hasNext()) {
            AnnotatedAndMetadata<AnnotatedMethod, JsonCreator.Mode> findFactoryMethodMetadata = findFactoryMethodMetadata(it.next());
            if (findFactoryMethodMetadata != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(findFactoryMethodMetadata);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    @Override
    @Deprecated
    public Constructor<?> findSingleArgConstructor(Class<?>... clsArr) {
        for (AnnotatedConstructor annotatedConstructor : this._classInfo.getConstructors()) {
            if (annotatedConstructor.getParameterCount() == 1) {
                Class<?> rawParameterType = annotatedConstructor.getRawParameterType(0);
                for (Class<?> cls : clsArr) {
                    if (cls == rawParameterType) {
                        return annotatedConstructor.getAnnotated();
                    }
                }
            }
        }
        return null;
    }

    @Override
    @Deprecated
    public Method findFactoryMethod(Class<?>... clsArr) {
        for (AnnotatedMethod annotatedMethod : this._classInfo.getFactoryMethods()) {
            if (isFactoryMethod(annotatedMethod) && annotatedMethod.getParameterCount() == 1) {
                Class<?> rawParameterType = annotatedMethod.getRawParameterType(0);
                for (Class<?> cls : clsArr) {
                    if (rawParameterType.isAssignableFrom(cls)) {
                        return annotatedMethod.getAnnotated();
                    }
                }
            }
        }
        return null;
    }

    protected boolean isFactoryMethod(AnnotatedMethod annotatedMethod) {
        if (!getBeanClass().isAssignableFrom(annotatedMethod.getRawReturnType())) {
            return false;
        }
        JsonCreator.Mode findCreatorAnnotation = this._annotationIntrospector.findCreatorAnnotation(this._config, annotatedMethod);
        if (findCreatorAnnotation != null && findCreatorAnnotation != JsonCreator.Mode.DISABLED) {
            return true;
        }
        String name = annotatedMethod.getName();
        if ("valueOf".equals(name) && annotatedMethod.getParameterCount() == 1) {
            return true;
        }
        if (!"fromString".equals(name) || annotatedMethod.getParameterCount() != 1) {
            return false;
        }
        Class<?> rawParameterType = annotatedMethod.getRawParameterType(0);
        return rawParameterType == String.class || CharSequence.class.isAssignableFrom(rawParameterType);
    }

    protected AnnotatedAndMetadata<AnnotatedMethod, JsonCreator.Mode> findFactoryMethodMetadata(AnnotatedMethod annotatedMethod) {
        if (!getBeanClass().isAssignableFrom(annotatedMethod.getRawReturnType())) {
            return null;
        }
        JsonCreator.Mode findCreatorAnnotation = this._annotationIntrospector.findCreatorAnnotation(this._config, annotatedMethod);
        if (findCreatorAnnotation != null) {
            if (findCreatorAnnotation == JsonCreator.Mode.DISABLED) {
                return null;
            }
            return AnnotatedAndMetadata.of(annotatedMethod, findCreatorAnnotation);
        }
        String name = annotatedMethod.getName();
        if ("valueOf".equals(name) && annotatedMethod.getParameterCount() == 1) {
            return AnnotatedAndMetadata.of(annotatedMethod, findCreatorAnnotation);
        }
        if (!"fromString".equals(name) || annotatedMethod.getParameterCount() != 1) {
            return null;
        }
        Class<?> rawParameterType = annotatedMethod.getRawParameterType(0);
        if (rawParameterType == String.class || CharSequence.class.isAssignableFrom(rawParameterType)) {
            return AnnotatedAndMetadata.of(annotatedMethod, findCreatorAnnotation);
        }
        return null;
    }

    @Deprecated
    protected PropertyName _findCreatorPropertyName(AnnotatedParameter annotatedParameter) {
        String findImplicitPropertyName;
        PropertyName findNameForDeserialization = this._annotationIntrospector.findNameForDeserialization(annotatedParameter);
        if ((findNameForDeserialization == null || findNameForDeserialization.isEmpty()) && (findImplicitPropertyName = this._annotationIntrospector.findImplicitPropertyName(annotatedParameter)) != null && !findImplicitPropertyName.isEmpty()) {
            findNameForDeserialization = PropertyName.construct(findImplicitPropertyName);
        }
        return findNameForDeserialization;
    }

    @Override
    public Class<?> findPOJOBuilder() {
        if (this._annotationIntrospector == null) {
            return null;
        }
        return this._annotationIntrospector.findPOJOBuilder(this._classInfo);
    }

    @Override
    public JsonPOJOBuilder.Value findPOJOBuilderConfig() {
        if (this._annotationIntrospector == null) {
            return null;
        }
        return this._annotationIntrospector.findPOJOBuilderConfig(this._classInfo);
    }

    @Override
    public Converter<Object, Object> findDeserializationConverter() {
        if (this._annotationIntrospector == null) {
            return null;
        }
        return _createConverter(this._annotationIntrospector.findDeserializationConverter(this._classInfo));
    }

    @Override
    public String findClassDescription() {
        if (this._annotationIntrospector == null) {
            return null;
        }
        return this._annotationIntrospector.findClassDescription(this._classInfo);
    }

    @Deprecated
    public LinkedHashMap<String, AnnotatedField> _findPropertyFields(Collection<String> collection, boolean z) {
        LinkedHashMap<String, AnnotatedField> linkedHashMap = new LinkedHashMap<>();
        for (BeanPropertyDefinition beanPropertyDefinition : _properties()) {
            AnnotatedField field = beanPropertyDefinition.getField();
            if (field != null) {
                String name = beanPropertyDefinition.getName();
                if (collection == null || !collection.contains(name)) {
                    linkedHashMap.put(name, field);
                }
            }
        }
        return linkedHashMap;
    }

    protected Converter<Object, Object> _createConverter(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class<?> cls = (Class) obj;
        if (cls == Converter.None.class || ClassUtil.isBogusClass(cls)) {
            return null;
        }
        if (!Converter.class.isAssignableFrom(cls)) {
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
        }
        HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
        Converter<?, ?> converterInstance = handlerInstantiator == null ? null : handlerInstantiator.converterInstance(this._config, this._classInfo, cls);
        if (converterInstance == null) {
            converterInstance = (Converter) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers());
        }
        return converterInstance;
    }
}
