package com.kammoun.utils.jackson.databind.deser.impl;

import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import com.kammoun.utils.jackson.databind.util.Converter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class JavaUtilCollectionsDeserializers {
    private static final int TYPE_SINGLETON_SET = 1;
    private static final int TYPE_SINGLETON_LIST = 2;
    private static final int TYPE_SINGLETON_MAP = 3;
    private static final int TYPE_UNMODIFIABLE_SET = 4;
    private static final int TYPE_UNMODIFIABLE_LIST = 5;
    private static final int TYPE_UNMODIFIABLE_MAP = 6;
    private static final int TYPE_SYNC_SET = 7;
    private static final int TYPE_SYNC_COLLECTION = 8;
    private static final int TYPE_SYNC_LIST = 9;
    private static final int TYPE_SYNC_MAP = 10;
    public static final int TYPE_AS_LIST = 11;
    private static final String PREFIX_JAVA_UTIL_COLLECTIONS = "java.util.Collections$";
    private static final String PREFIX_JAVA_UTIL_ARRAYS = "java.util.Arrays$";
    private static final String PREFIX_JAVA_UTIL_IMMUTABLE_COLL = "java.util.ImmutableCollections$";

    public static class JavaUtilCollectionsConverter implements Converter<Object, Object> {
        private final JavaType _inputType;
        private final int _kind;

        JavaUtilCollectionsConverter(int i, JavaType javaType) {
            this._inputType = javaType;
            this._kind = i;
        }

        @Override
        public Object convert(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this._kind) {
                case 1:
                    Set set = (Set) obj;
                    _checkSingleton(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    _checkSingleton(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    _checkSingleton(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                case 7:
                    return Collections.synchronizedSet((Set) obj);
                case 8:
                    return Collections.synchronizedCollection((Collection) obj);
                case 9:
                    return Collections.synchronizedList((List) obj);
                case 10:
                    return Collections.synchronizedMap((Map) obj);
                case 11:
                default:
                    return obj;
            }
        }

        @Override
        public JavaType getInputType(TypeFactory typeFactory) {
            return this._inputType;
        }

        @Override
        public JavaType getOutputType(TypeFactory typeFactory) {
            return this._inputType;
        }

        private void _checkSingleton(int i) {
            if (i != 1) {
                throw new IllegalArgumentException("Can not deserialize Singleton container from " + i + " entries");
            }
        }
    }

    public static JsonDeserializer<?> findForCollection(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        String name = javaType.getRawClass().getName();
        if (!name.startsWith("java.util.")) {
            return null;
        }
        String _findUtilCollectionsTypeName = _findUtilCollectionsTypeName(name);
        if (_findUtilCollectionsTypeName == null) {
            String _findUtilArrayTypeName = _findUtilArrayTypeName(name);
            if (_findUtilArrayTypeName != null) {
                if (_findUtilArrayTypeName.contains("List")) {
                    return new StdDelegatingDeserializer(converter(11, javaType, List.class));
                }
                return null;
            }
            String _findUtilCollectionsImmutableTypeName = _findUtilCollectionsImmutableTypeName(name);
            if (_findUtilCollectionsImmutableTypeName == null) {
                return null;
            }
            if (_findUtilCollectionsImmutableTypeName.contains("List")) {
                return new StdDelegatingDeserializer(converter(11, javaType, List.class));
            }
            if (_findUtilCollectionsImmutableTypeName.contains("Set")) {
                return new StdDelegatingDeserializer(converter(4, javaType, Set.class));
            }
            return null;
        }
        JavaUtilCollectionsConverter javaUtilCollectionsConverter = null;
        String _findUnmodifiableTypeName = _findUnmodifiableTypeName(_findUtilCollectionsTypeName);
        if (_findUnmodifiableTypeName == null) {
            String _findSingletonTypeName = _findSingletonTypeName(_findUtilCollectionsTypeName);
            if (_findSingletonTypeName == null) {
                String _findSyncTypeName = _findSyncTypeName(_findUtilCollectionsTypeName);
                if (_findSyncTypeName != null) {
                    if (_findSyncTypeName.endsWith("Set")) {
                        javaUtilCollectionsConverter = converter(7, javaType, Set.class);
                    } else if (_findSyncTypeName.endsWith("List")) {
                        javaUtilCollectionsConverter = converter(9, javaType, List.class);
                    } else if (_findSyncTypeName.endsWith("Collection")) {
                        javaUtilCollectionsConverter = converter(8, javaType, Collection.class);
                    }
                }
            } else if (_findSingletonTypeName.endsWith("Set")) {
                javaUtilCollectionsConverter = converter(1, javaType, Set.class);
            } else if (_findSingletonTypeName.endsWith("List")) {
                javaUtilCollectionsConverter = converter(2, javaType, List.class);
            }
        } else if (_findUnmodifiableTypeName.endsWith("Set")) {
            javaUtilCollectionsConverter = converter(4, javaType, Set.class);
        } else if (_findUnmodifiableTypeName.endsWith("List")) {
            javaUtilCollectionsConverter = converter(5, javaType, List.class);
        }
        if (javaUtilCollectionsConverter == null) {
            return null;
        }
        return new StdDelegatingDeserializer(javaUtilCollectionsConverter);
    }

    public static JsonDeserializer<?> findForMap(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        String name = javaType.getRawClass().getName();
        JavaUtilCollectionsConverter javaUtilCollectionsConverter = null;
        String _findUtilCollectionsTypeName = _findUtilCollectionsTypeName(name);
        if (_findUtilCollectionsTypeName != null) {
            String _findUnmodifiableTypeName = _findUnmodifiableTypeName(_findUtilCollectionsTypeName);
            if (_findUnmodifiableTypeName == null) {
                String _findSingletonTypeName = _findSingletonTypeName(_findUtilCollectionsTypeName);
                if (_findSingletonTypeName == null) {
                    String _findSyncTypeName = _findSyncTypeName(_findUtilCollectionsTypeName);
                    if (_findSyncTypeName != null && _findSyncTypeName.contains("Map")) {
                        javaUtilCollectionsConverter = converter(10, javaType, Map.class);
                    }
                } else if (_findSingletonTypeName.contains("Map")) {
                    javaUtilCollectionsConverter = converter(3, javaType, Map.class);
                }
            } else if (_findUnmodifiableTypeName.contains("Map")) {
                javaUtilCollectionsConverter = converter(6, javaType, Map.class);
            }
        } else {
            String _findUtilCollectionsImmutableTypeName = _findUtilCollectionsImmutableTypeName(name);
            if (_findUtilCollectionsImmutableTypeName != null && _findUtilCollectionsImmutableTypeName.contains("Map")) {
                javaUtilCollectionsConverter = converter(6, javaType, Map.class);
            }
        }
        if (javaUtilCollectionsConverter == null) {
            return null;
        }
        return new StdDelegatingDeserializer(javaUtilCollectionsConverter);
    }

    static JavaUtilCollectionsConverter converter(int i, JavaType javaType, Class<?> cls) {
        return new JavaUtilCollectionsConverter(i, javaType.findSuperType(cls));
    }

    private static String _findUtilArrayTypeName(String str) {
        if (str.startsWith(PREFIX_JAVA_UTIL_ARRAYS)) {
            return str.substring(PREFIX_JAVA_UTIL_ARRAYS.length());
        }
        return null;
    }

    private static String _findUtilCollectionsTypeName(String str) {
        if (str.startsWith(PREFIX_JAVA_UTIL_COLLECTIONS)) {
            return str.substring(PREFIX_JAVA_UTIL_COLLECTIONS.length());
        }
        return null;
    }

    private static String _findUtilCollectionsImmutableTypeName(String str) {
        if (str.startsWith(PREFIX_JAVA_UTIL_IMMUTABLE_COLL)) {
            return str.substring(PREFIX_JAVA_UTIL_IMMUTABLE_COLL.length());
        }
        return null;
    }

    private static String _findSingletonTypeName(String str) {
        if (str.startsWith("Singleton")) {
            return str.substring(9);
        }
        return null;
    }

    private static String _findSyncTypeName(String str) {
        if (str.startsWith("Synchronized")) {
            return str.substring(12);
        }
        return null;
    }

    private static String _findUnmodifiableTypeName(String str) {
        if (str.startsWith("Unmodifiable")) {
            return str.substring(12);
        }
        return null;
    }
}
