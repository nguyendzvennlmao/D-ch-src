package com.kammoun.utils.jackson.databind.cfg;

import com.kammoun.utils.jackson.annotation.JsonAutoDetect;
import com.kammoun.utils.jackson.annotation.JsonInclude;
import com.kammoun.utils.jackson.annotation.JsonSetter;
import com.kammoun.utils.jackson.annotation.JsonTypeInfo;
import com.kammoun.utils.jackson.annotation.PropertyAccessor;
import com.kammoun.utils.jackson.core.Base64Variant;
import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.PrettyPrinter;
import com.kammoun.utils.jackson.core.StreamReadFeature;
import com.kammoun.utils.jackson.core.StreamWriteFeature;
import com.kammoun.utils.jackson.core.TokenStreamFactory;
import com.kammoun.utils.jackson.databind.AnnotationIntrospector;
import com.kammoun.utils.jackson.databind.DeserializationFeature;
import com.kammoun.utils.jackson.databind.InjectableValues;
import com.kammoun.utils.jackson.databind.MapperFeature;
import com.kammoun.utils.jackson.databind.Module;
import com.kammoun.utils.jackson.databind.ObjectMapper;
import com.kammoun.utils.jackson.databind.PropertyNamingStrategy;
import com.kammoun.utils.jackson.databind.SerializationFeature;
import com.kammoun.utils.jackson.databind.cfg.MapperBuilder;
import com.kammoun.utils.jackson.databind.deser.DeserializationProblemHandler;
import com.kammoun.utils.jackson.databind.introspect.AccessorNamingStrategy;
import com.kammoun.utils.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.kammoun.utils.jackson.databind.introspect.VisibilityChecker;
import com.kammoun.utils.jackson.databind.jsontype.NamedType;
import com.kammoun.utils.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.kammoun.utils.jackson.databind.jsontype.SubtypeResolver;
import com.kammoun.utils.jackson.databind.jsontype.TypeResolverBuilder;
import com.kammoun.utils.jackson.databind.node.JsonNodeFactory;
import com.kammoun.utils.jackson.databind.ser.FilterProvider;
import com.kammoun.utils.jackson.databind.ser.SerializerFactory;
import com.kammoun.utils.jackson.databind.type.LogicalType;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.TimeZone;
import java.util.function.Consumer;

public abstract class MapperBuilder<M extends ObjectMapper, B extends MapperBuilder<M, B>> {
    protected final M _mapper;

    public MapperBuilder(M m) {
        this._mapper = m;
    }

    public M build() {
        return this._mapper;
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._mapper.isEnabled(mapperFeature);
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._mapper.isEnabled(deserializationFeature);
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._mapper.isEnabled(serializationFeature);
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._mapper.isEnabled(feature);
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._mapper.isEnabled(feature);
    }

    public TokenStreamFactory streamFactory() {
        return this._mapper.tokenStreamFactory();
    }

    public B enable(MapperFeature... mapperFeatureArr) {
        this._mapper.enable(mapperFeatureArr);
        return _this();
    }

    public B disable(MapperFeature... mapperFeatureArr) {
        this._mapper.disable(mapperFeatureArr);
        return _this();
    }

    public B configure(MapperFeature mapperFeature, boolean z) {
        this._mapper.configure(mapperFeature, z);
        return _this();
    }

    public B enable(SerializationFeature... serializationFeatureArr) {
        for (SerializationFeature serializationFeature : serializationFeatureArr) {
            this._mapper.enable(serializationFeature);
        }
        return _this();
    }

    public B disable(SerializationFeature... serializationFeatureArr) {
        for (SerializationFeature serializationFeature : serializationFeatureArr) {
            this._mapper.disable(serializationFeature);
        }
        return _this();
    }

    public B configure(SerializationFeature serializationFeature, boolean z) {
        this._mapper.configure(serializationFeature, z);
        return _this();
    }

    public B enable(DeserializationFeature... deserializationFeatureArr) {
        for (DeserializationFeature deserializationFeature : deserializationFeatureArr) {
            this._mapper.enable(deserializationFeature);
        }
        return _this();
    }

    public B disable(DeserializationFeature... deserializationFeatureArr) {
        for (DeserializationFeature deserializationFeature : deserializationFeatureArr) {
            this._mapper.disable(deserializationFeature);
        }
        return _this();
    }

    public B configure(DeserializationFeature deserializationFeature, boolean z) {
        this._mapper.configure(deserializationFeature, z);
        return _this();
    }

    public B enable(DatatypeFeature... datatypeFeatureArr) {
        for (DatatypeFeature datatypeFeature : datatypeFeatureArr) {
            this._mapper.configure(datatypeFeature, true);
        }
        return _this();
    }

    public B disable(DatatypeFeature... datatypeFeatureArr) {
        for (DatatypeFeature datatypeFeature : datatypeFeatureArr) {
            this._mapper.configure(datatypeFeature, false);
        }
        return _this();
    }

    public B configure(DatatypeFeature datatypeFeature, boolean z) {
        this._mapper.configure(datatypeFeature, z);
        return _this();
    }

    public B enable(JsonParser.Feature... featureArr) {
        this._mapper.enable(featureArr);
        return _this();
    }

    public B disable(JsonParser.Feature... featureArr) {
        this._mapper.disable(featureArr);
        return _this();
    }

    public B configure(JsonParser.Feature feature, boolean z) {
        this._mapper.configure(feature, z);
        return _this();
    }

    public B enable(JsonGenerator.Feature... featureArr) {
        this._mapper.enable(featureArr);
        return _this();
    }

    public B disable(JsonGenerator.Feature... featureArr) {
        this._mapper.disable(featureArr);
        return _this();
    }

    public B configure(JsonGenerator.Feature feature, boolean z) {
        this._mapper.configure(feature, z);
        return _this();
    }

    public B enable(StreamReadFeature... streamReadFeatureArr) {
        for (StreamReadFeature streamReadFeature : streamReadFeatureArr) {
            this._mapper.enable(streamReadFeature.mappedFeature());
        }
        return _this();
    }

    public B disable(StreamReadFeature... streamReadFeatureArr) {
        for (StreamReadFeature streamReadFeature : streamReadFeatureArr) {
            this._mapper.disable(streamReadFeature.mappedFeature());
        }
        return _this();
    }

    public B configure(StreamReadFeature streamReadFeature, boolean z) {
        this._mapper.configure(streamReadFeature.mappedFeature(), z);
        return _this();
    }

    public B enable(StreamWriteFeature... streamWriteFeatureArr) {
        for (StreamWriteFeature streamWriteFeature : streamWriteFeatureArr) {
            this._mapper.enable(streamWriteFeature.mappedFeature());
        }
        return _this();
    }

    public B disable(StreamWriteFeature... streamWriteFeatureArr) {
        for (StreamWriteFeature streamWriteFeature : streamWriteFeatureArr) {
            this._mapper.disable(streamWriteFeature.mappedFeature());
        }
        return _this();
    }

    public B configure(StreamWriteFeature streamWriteFeature, boolean z) {
        this._mapper.configure(streamWriteFeature.mappedFeature(), z);
        return _this();
    }

    public B withConfigOverride(Class<?> cls, Consumer<MutableConfigOverride> consumer) {
        consumer.accept(this._mapper.configOverride(cls));
        return _this();
    }

    public B withCoercionConfig(LogicalType logicalType, Consumer<MutableCoercionConfig> consumer) {
        consumer.accept(this._mapper.coercionConfigFor(logicalType));
        return _this();
    }

    public B withCoercionConfig(Class<?> cls, Consumer<MutableCoercionConfig> consumer) {
        consumer.accept(this._mapper.coercionConfigFor(cls));
        return _this();
    }

    public B withCoercionConfigDefaults(Consumer<MutableCoercionConfig> consumer) {
        consumer.accept(this._mapper.coercionConfigDefaults());
        return _this();
    }

    public B addModule(Module module) {
        this._mapper.registerModule(module);
        return _this();
    }

    public B addModules(Module... moduleArr) {
        for (Module module : moduleArr) {
            addModule(module);
        }
        return _this();
    }

    public B addModules(Iterable<? extends Module> iterable) {
        Iterator<? extends Module> it = iterable.iterator();
        while (it.hasNext()) {
            addModule(it.next());
        }
        return _this();
    }

    public static List<Module> findModules() {
        return findModules(null);
    }

    public static List<Module> findModules(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator it = secureGetServiceLoader(Module.class, classLoader).iterator();
        while (it.hasNext()) {
            arrayList.add((Module) it.next());
        }
        return arrayList;
    }

    private static <T> ServiceLoader<T> secureGetServiceLoader(final Class<T> cls, final ClassLoader classLoader) {
        return System.getSecurityManager() == null ? classLoader == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction<ServiceLoader<T>>() {
            @Override
            public ServiceLoader<T> run() {
                return classLoader == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader);
            }
        });
    }

    public B findAndAddModules() {
        return addModules(findModules());
    }

    public B annotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        this._mapper.setAnnotationIntrospector(annotationIntrospector);
        return _this();
    }

    public B defaultAttributes(ContextAttributes contextAttributes) {
        this._mapper.setDefaultAttributes(contextAttributes);
        return _this();
    }

    public B typeFactory(TypeFactory typeFactory) {
        this._mapper.setTypeFactory(typeFactory);
        return _this();
    }

    public B subtypeResolver(SubtypeResolver subtypeResolver) {
        this._mapper.setSubtypeResolver(subtypeResolver);
        return _this();
    }

    public B visibility(VisibilityChecker<?> visibilityChecker) {
        this._mapper.setVisibility(visibilityChecker);
        return _this();
    }

    public B visibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
        this._mapper.setVisibility(propertyAccessor, visibility);
        return _this();
    }

    public B handlerInstantiator(HandlerInstantiator handlerInstantiator) {
        this._mapper.setHandlerInstantiator(handlerInstantiator);
        return _this();
    }

    public B propertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._mapper.setPropertyNamingStrategy(propertyNamingStrategy);
        return _this();
    }

    public B accessorNaming(AccessorNamingStrategy.Provider provider) {
        if (provider == null) {
            provider = new DefaultAccessorNamingStrategy.Provider();
        }
        this._mapper.setAccessorNaming(provider);
        return _this();
    }

    public B serializerFactory(SerializerFactory serializerFactory) {
        this._mapper.setSerializerFactory(serializerFactory);
        return _this();
    }

    public B filterProvider(FilterProvider filterProvider) {
        this._mapper.setFilterProvider(filterProvider);
        return _this();
    }

    public B defaultPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._mapper.setDefaultPrettyPrinter(prettyPrinter);
        return _this();
    }

    public B injectableValues(InjectableValues injectableValues) {
        this._mapper.setInjectableValues(injectableValues);
        return _this();
    }

    public B nodeFactory(JsonNodeFactory jsonNodeFactory) {
        this._mapper.setNodeFactory(jsonNodeFactory);
        return _this();
    }

    public B constructorDetector(ConstructorDetector constructorDetector) {
        this._mapper.setConstructorDetector(constructorDetector);
        return _this();
    }

    public B cacheProvider(CacheProvider cacheProvider) {
        this._mapper.setCacheProvider(cacheProvider);
        return _this();
    }

    public B addHandler(DeserializationProblemHandler deserializationProblemHandler) {
        this._mapper.addHandler(deserializationProblemHandler);
        return _this();
    }

    public B clearProblemHandlers() {
        this._mapper.clearProblemHandlers();
        return _this();
    }

    public B defaultSetterInfo(JsonSetter.Value value) {
        this._mapper.setDefaultSetterInfo(value);
        return _this();
    }

    public B defaultMergeable(Boolean bool) {
        this._mapper.setDefaultMergeable(bool);
        return _this();
    }

    public B defaultLeniency(Boolean bool) {
        this._mapper.setDefaultLeniency(bool);
        return _this();
    }

    public B defaultDateFormat(DateFormat dateFormat) {
        this._mapper.setDateFormat(dateFormat);
        return _this();
    }

    public B defaultTimeZone(TimeZone timeZone) {
        this._mapper.setTimeZone(timeZone);
        return _this();
    }

    public B defaultLocale(Locale locale) {
        this._mapper.setLocale(locale);
        return _this();
    }

    public B defaultBase64Variant(Base64Variant base64Variant) {
        this._mapper.setBase64Variant(base64Variant);
        return _this();
    }

    public B serializationInclusion(JsonInclude.Include include) {
        this._mapper.setSerializationInclusion(include);
        return _this();
    }

    public B defaultPropertyInclusion(JsonInclude.Value value) {
        this._mapper.setDefaultPropertyInclusion(value);
        return _this();
    }

    public B addMixIn(Class<?> cls, Class<?> cls2) {
        this._mapper.addMixIn(cls, cls2);
        return _this();
    }

    public B removeMixIn(Class<?> cls) {
        this._mapper.addMixIn(cls, null);
        return _this();
    }

    public B registerSubtypes(Class<?>... clsArr) {
        this._mapper.registerSubtypes(clsArr);
        return _this();
    }

    public B registerSubtypes(NamedType... namedTypeArr) {
        this._mapper.registerSubtypes(namedTypeArr);
        return _this();
    }

    public B registerSubtypes(Collection<Class<?>> collection) {
        this._mapper.registerSubtypes(collection);
        return _this();
    }

    public B polymorphicTypeValidator(PolymorphicTypeValidator polymorphicTypeValidator) {
        this._mapper.setPolymorphicTypeValidator(polymorphicTypeValidator);
        return _this();
    }

    public B activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator) {
        this._mapper.activateDefaultTyping(polymorphicTypeValidator);
        return _this();
    }

    public B activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, ObjectMapper.DefaultTyping defaultTyping) {
        this._mapper.activateDefaultTyping(polymorphicTypeValidator, defaultTyping);
        return _this();
    }

    public B activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, ObjectMapper.DefaultTyping defaultTyping, JsonTypeInfo.As as) {
        this._mapper.activateDefaultTyping(polymorphicTypeValidator, defaultTyping, as);
        return _this();
    }

    public B activateDefaultTypingAsProperty(PolymorphicTypeValidator polymorphicTypeValidator, ObjectMapper.DefaultTyping defaultTyping, String str) {
        this._mapper.activateDefaultTypingAsProperty(polymorphicTypeValidator, defaultTyping, str);
        return _this();
    }

    public B deactivateDefaultTyping() {
        this._mapper.deactivateDefaultTyping();
        return _this();
    }

    public B setDefaultTyping(TypeResolverBuilder<?> typeResolverBuilder) {
        this._mapper.setDefaultTyping(typeResolverBuilder);
        return _this();
    }

    protected final B _this() {
        return this;
    }
}
