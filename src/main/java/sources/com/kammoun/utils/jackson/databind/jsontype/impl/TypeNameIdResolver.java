package com.kammoun.utils.jackson.databind.jsontype.impl;

import com.kammoun.utils.jackson.annotation.JsonTypeInfo;
import com.kammoun.utils.jackson.databind.DatabindContext;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.MapperFeature;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;
import com.kammoun.utils.jackson.databind.jsontype.NamedType;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class TypeNameIdResolver extends TypeIdResolverBase implements Serializable {
    private static final long serialVersionUID = 1;
    protected final MapperConfig<?> _config;
    protected final ConcurrentHashMap<String, String> _typeToId;
    protected final Map<String, JavaType> _idToType;
    protected final boolean _caseInsensitive;

    protected TypeNameIdResolver(MapperConfig<?> mapperConfig, JavaType javaType, ConcurrentHashMap<String, String> concurrentHashMap, HashMap<String, JavaType> hashMap) {
        super(javaType, mapperConfig.getTypeFactory());
        this._config = mapperConfig;
        this._typeToId = concurrentHashMap;
        this._idToType = hashMap;
        this._caseInsensitive = mapperConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    public static TypeNameIdResolver construct(MapperConfig<?> mapperConfig, JavaType javaType, Collection<NamedType> collection, boolean z, boolean z2) {
        HashMap hashMap;
        ConcurrentHashMap concurrentHashMap;
        if (z == z2) {
            throw new IllegalArgumentException();
        }
        if (z) {
            concurrentHashMap = new ConcurrentHashMap();
            hashMap = null;
        } else {
            hashMap = new HashMap();
            concurrentHashMap = new ConcurrentHashMap(4);
        }
        boolean isEnabled = mapperConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
        if (collection != null) {
            for (NamedType namedType : collection) {
                Class<?> type = namedType.getType();
                String name = namedType.hasName() ? namedType.getName() : _defaultTypeId(type);
                if (z) {
                    concurrentHashMap.put(type.getName(), name);
                }
                if (z2) {
                    if (isEnabled) {
                        name = name.toLowerCase();
                    }
                    JavaType javaType2 = (JavaType) hashMap.get(name);
                    if (javaType2 == null || !type.isAssignableFrom(javaType2.getRawClass())) {
                        hashMap.put(name, mapperConfig.constructType(type));
                    }
                }
            }
        }
        return new TypeNameIdResolver(mapperConfig, javaType, concurrentHashMap, hashMap);
    }

    @Override
    public JsonTypeInfo.Id getMechanism() {
        return JsonTypeInfo.Id.NAME;
    }

    @Override
    public String idFromValue(Object obj) {
        return idFromClass(obj.getClass());
    }

    protected String idFromClass(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        String str = this._typeToId.get(name);
        if (str == null) {
            Class<?> rawClass = this._typeFactory.constructType(cls).getRawClass();
            if (this._config.isAnnotationProcessingEnabled()) {
                str = this._config.getAnnotationIntrospector().findTypeName(this._config.introspectClassAnnotations(rawClass).getClassInfo());
            }
            if (str == null) {
                str = _defaultTypeId(rawClass);
            }
            this._typeToId.put(name, str);
        }
        return str;
    }

    @Override
    public String idFromValueAndType(Object obj, Class<?> cls) {
        return obj == null ? idFromClass(cls) : idFromValue(obj);
    }

    @Override
    public JavaType typeFromId(DatabindContext databindContext, String str) {
        return _typeFromId(str);
    }

    protected JavaType _typeFromId(String str) {
        if (this._caseInsensitive) {
            str = str.toLowerCase();
        }
        return this._idToType.get(str);
    }

    @Override
    public String getDescForKnownTypeIds() {
        TreeSet treeSet = new TreeSet();
        for (Map.Entry<String, JavaType> entry : this._idToType.entrySet()) {
            if (entry.getValue().isConcrete()) {
                treeSet.add(entry.getKey());
            }
        }
        return treeSet.toString();
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", getClass().getName(), this._idToType);
    }

    protected static String _defaultTypeId(Class<?> cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf < 0 ? name : name.substring(lastIndexOf + 1);
    }
}
