package com.kammoun.utils.jackson.databind.util;

import com.kammoun.utils.jackson.databind.AnnotationIntrospector;
import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.EnumNamingStrategy;
import com.kammoun.utils.jackson.databind.MapperFeature;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedClass;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnumResolver implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<Enum<?>> _enumClass;
    protected final Enum<?>[] _enums;
    protected final HashMap<String, Enum<?>> _enumsById;
    protected final Enum<?> _defaultValue;
    protected final boolean _isIgnoreCase;
    protected final boolean _isFromIntValue;

    protected EnumResolver(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> hashMap, Enum<?> r7, boolean z, boolean z2) {
        this._enumClass = cls;
        this._enums = enumArr;
        this._enumsById = hashMap;
        this._defaultValue = r7;
        this._isIgnoreCase = z;
        this._isFromIntValue = z2;
    }

    public static EnumResolver constructFor(DeserializationConfig deserializationConfig, AnnotatedClass annotatedClass) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean isEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = annotatedClass.getRawType();
        Class<Enum<?>> _enumClass = _enumClass(rawType);
        Enum<?>[] _enumConstants = _enumConstants(rawType);
        String[] findEnumValues = annotationIntrospector.findEnumValues(deserializationConfig, annotatedClass, _enumConstants, new String[_enumConstants.length]);
        ?? r0 = new String[findEnumValues.length];
        annotationIntrospector.findEnumAliases(deserializationConfig, annotatedClass, _enumConstants, r0);
        HashMap hashMap = new HashMap();
        int length = _enumConstants.length;
        for (int i = 0; i < length; i++) {
            Enum<?> r02 = _enumConstants[i];
            String str = findEnumValues[i];
            if (str == null) {
                str = r02.name();
            }
            hashMap.put(str, r02);
            Object[] objArr = r0[i];
            if (objArr != 0) {
                for (Object[] objArr2 : objArr) {
                    hashMap.putIfAbsent(objArr2, r02);
                }
            }
        }
        return new EnumResolver(_enumClass, _enumConstants, hashMap, _enumDefault(annotationIntrospector, annotatedClass, _enumConstants), isEnabled, false);
    }

    @Deprecated
    public static EnumResolver constructFor(DeserializationConfig deserializationConfig, Class<?> cls) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean isEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<Enum<?>> _enumClass = _enumClass(cls);
        Enum<?>[] _enumConstants = _enumConstants(cls);
        String[] findEnumValues = annotationIntrospector.findEnumValues(_enumClass, _enumConstants, new String[_enumConstants.length]);
        ?? r0 = new String[findEnumValues.length];
        annotationIntrospector.findEnumAliases(_enumClass, _enumConstants, r0);
        HashMap hashMap = new HashMap();
        int length = _enumConstants.length;
        for (int i = 0; i < length; i++) {
            Enum<?> r02 = _enumConstants[i];
            String str = findEnumValues[i];
            if (str == null) {
                str = r02.name();
            }
            hashMap.put(str, r02);
            Object[] objArr = r0[i];
            if (objArr != 0) {
                for (Object[] objArr2 : objArr) {
                    hashMap.putIfAbsent(objArr2, r02);
                }
            }
        }
        return new EnumResolver(_enumClass, _enumConstants, hashMap, _enumDefault(annotationIntrospector, _enumClass), isEnabled, false);
    }

    public static EnumResolver constructUsingToString(DeserializationConfig deserializationConfig, AnnotatedClass annotatedClass) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean isEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = annotatedClass.getRawType();
        Class<Enum<?>> _enumClass = _enumClass(rawType);
        Enum<?>[] _enumConstants = _enumConstants(rawType);
        String[] strArr = new String[_enumConstants.length];
        ?? r0 = new String[_enumConstants.length];
        if (annotationIntrospector != 0) {
            annotationIntrospector.findEnumValues(deserializationConfig, annotatedClass, _enumConstants, strArr);
            annotationIntrospector.findEnumAliases(deserializationConfig, annotatedClass, _enumConstants, r0);
        }
        HashMap hashMap = new HashMap();
        int length = _enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(_enumClass, _enumConstants, hashMap, _enumDefault(annotationIntrospector, annotatedClass, _enumConstants), isEnabled, false);
            }
            Enum<?> r02 = _enumConstants[length];
            String str = strArr[length];
            if (str == null) {
                str = r02.toString();
            }
            hashMap.put(str, r02);
            Object[] objArr = r0[length];
            if (objArr != 0) {
                for (Object[] objArr2 : objArr) {
                    hashMap.putIfAbsent(objArr2, r02);
                }
            }
        }
    }

    @Deprecated
    public static EnumResolver constructUsingToString(DeserializationConfig deserializationConfig, Class<?> cls) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean isEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<Enum<?>> _enumClass = _enumClass(cls);
        Enum<?>[] _enumConstants = _enumConstants(cls);
        HashMap hashMap = new HashMap();
        ?? r0 = new String[_enumConstants.length];
        if (annotationIntrospector != 0) {
            annotationIntrospector.findEnumAliases(_enumClass, _enumConstants, r0);
        }
        int length = _enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(_enumClass, _enumConstants, hashMap, _enumDefault(annotationIntrospector, _enumClass), isEnabled, false);
            }
            Enum<?> r02 = _enumConstants[length];
            hashMap.put(r02.toString(), r02);
            Object[] objArr = r0[length];
            if (objArr != 0) {
                for (Object[] objArr2 : objArr) {
                    hashMap.putIfAbsent(objArr2, r02);
                }
            }
        }
    }

    public static EnumResolver constructUsingIndex(DeserializationConfig deserializationConfig, AnnotatedClass annotatedClass) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean isEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = annotatedClass.getRawType();
        Class<Enum<?>> _enumClass = _enumClass(rawType);
        Enum<?>[] _enumConstants = _enumConstants(rawType);
        HashMap hashMap = new HashMap();
        int length = _enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(_enumClass, _enumConstants, hashMap, _enumDefault(annotationIntrospector, annotatedClass, _enumConstants), isEnabled, false);
            }
            hashMap.put(String.valueOf(length), _enumConstants[length]);
        }
    }

    @Deprecated
    public static EnumResolver constructUsingIndex(DeserializationConfig deserializationConfig, Class<Enum<?>> cls) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean isEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<Enum<?>> _enumClass = _enumClass(cls);
        Enum<?>[] _enumConstants = _enumConstants(cls);
        HashMap hashMap = new HashMap();
        int length = _enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(_enumClass, _enumConstants, hashMap, _enumDefault(annotationIntrospector, _enumClass), isEnabled, false);
            }
            hashMap.put(String.valueOf(length), _enumConstants[length]);
        }
    }

    @Deprecated
    public static EnumResolver constructUsingEnumNamingStrategy(DeserializationConfig deserializationConfig, Class<?> cls, EnumNamingStrategy enumNamingStrategy) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean isEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<Enum<?>> _enumClass = _enumClass(cls);
        Enum<?>[] _enumConstants = _enumConstants(cls);
        HashMap hashMap = new HashMap();
        String[] strArr = new String[_enumConstants.length];
        ?? r0 = new String[_enumConstants.length];
        if (annotationIntrospector != 0) {
            annotationIntrospector.findEnumValues(_enumClass, _enumConstants, strArr);
            annotationIntrospector.findEnumAliases(_enumClass, _enumConstants, r0);
        }
        int length = _enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(_enumClass, _enumConstants, hashMap, _enumDefault(annotationIntrospector, _enumClass), isEnabled, false);
            }
            Enum<?> r02 = _enumConstants[length];
            String str = strArr[length];
            if (str == null) {
                str = enumNamingStrategy.convertEnumToExternalName(r02.name());
            }
            hashMap.put(str, r02);
            Object[] objArr = r0[length];
            if (objArr != 0) {
                for (Object[] objArr2 : objArr) {
                    hashMap.putIfAbsent(objArr2, r02);
                }
            }
        }
    }

    public static EnumResolver constructUsingEnumNamingStrategy(DeserializationConfig deserializationConfig, AnnotatedClass annotatedClass, EnumNamingStrategy enumNamingStrategy) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean isEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = annotatedClass.getRawType();
        Class<Enum<?>> _enumClass = _enumClass(rawType);
        Enum<?>[] _enumConstants = _enumConstants(rawType);
        String[] strArr = new String[_enumConstants.length];
        ?? r0 = new String[_enumConstants.length];
        if (annotationIntrospector != 0) {
            annotationIntrospector.findEnumValues(deserializationConfig, annotatedClass, _enumConstants, strArr);
            annotationIntrospector.findEnumAliases(deserializationConfig, annotatedClass, _enumConstants, r0);
        }
        HashMap hashMap = new HashMap();
        int length = _enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(_enumClass, _enumConstants, hashMap, _enumDefault(annotationIntrospector, annotatedClass, _enumConstants), isEnabled, false);
            }
            Enum<?> r02 = _enumConstants[length];
            String str = strArr[length];
            if (str == null) {
                str = enumNamingStrategy.convertEnumToExternalName(r02.name());
            }
            hashMap.put(str, r02);
            Object[] objArr = r0[length];
            if (objArr != 0) {
                for (Object[] objArr2 : objArr) {
                    hashMap.putIfAbsent(objArr2, r02);
                }
            }
        }
    }

    @Deprecated
    public static EnumResolver constructUsingMethod(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMember annotatedMember) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean isEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<Enum<?>> _enumClass = _enumClass(cls);
        Enum<?>[] _enumConstants = _enumConstants(cls);
        HashMap hashMap = new HashMap();
        int length = _enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(_enumClass, _enumConstants, hashMap, _enumDefault(annotationIntrospector, _enumClass), isEnabled, _isIntType(annotatedMember.getRawType()));
            }
            Enum<?> r0 = _enumConstants[length];
            try {
                Object value = annotatedMember.getValue(r0);
                if (value != null) {
                    hashMap.put(value.toString(), r0);
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + r0 + ": " + e.getMessage());
            }
        }
    }

    public static EnumResolver constructUsingMethod(DeserializationConfig deserializationConfig, AnnotatedClass annotatedClass, AnnotatedMember annotatedMember) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean isEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = annotatedClass.getRawType();
        Class<Enum<?>> _enumClass = _enumClass(rawType);
        Enum<?>[] _enumConstants = _enumConstants(rawType);
        HashMap hashMap = new HashMap();
        int length = _enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(_enumClass, _enumConstants, hashMap, _enumDefault(annotationIntrospector, annotatedClass, _enumConstants), isEnabled, _isIntType(annotatedMember.getRawType()));
            }
            Enum<?> r0 = _enumConstants[length];
            try {
                Object value = annotatedMember.getValue(r0);
                if (value != null) {
                    hashMap.put(value.toString(), r0);
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + r0 + ": " + e.getMessage());
            }
        }
    }

    public CompactStringObjectMap constructLookup() {
        return CompactStringObjectMap.construct(this._enumsById);
    }

    protected static Class<Enum<?>> _enumClass(Class<?> cls) {
        return cls;
    }

    protected static Enum<?>[] _enumConstants(Class<?> cls) {
        Enum<?>[] enumConstants = _enumClass(cls).getEnumConstants();
        if (enumConstants == null) {
            throw new IllegalArgumentException("No enum constants for class " + cls.getName());
        }
        return enumConstants;
    }

    protected static Enum<?> _enumDefault(AnnotationIntrospector annotationIntrospector, AnnotatedClass annotatedClass, Enum<?>[] enumArr) {
        if (annotationIntrospector != null) {
            return annotationIntrospector.findDefaultEnumValue(annotatedClass, enumArr);
        }
        return null;
    }

    @Deprecated
    protected static Enum<?> _enumDefault(AnnotationIntrospector annotationIntrospector, Class<?> cls) {
        if (annotationIntrospector != null) {
            return annotationIntrospector.findDefaultEnumValue(_enumClass(cls));
        }
        return null;
    }

    protected static boolean _isIntType(Class<?> cls) {
        if (cls.isPrimitive()) {
            cls = ClassUtil.wrapperType(cls);
        }
        return cls == Long.class || cls == Integer.class || cls == Short.class || cls == Byte.class;
    }

    public Enum<?> findEnum(String str) {
        Enum<?> r0 = this._enumsById.get(str);
        return (r0 == null && this._isIgnoreCase) ? _findEnumCaseInsensitive(str) : r0;
    }

    protected Enum<?> _findEnumCaseInsensitive(String str) {
        for (Map.Entry<String, Enum<?>> entry : this._enumsById.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public Enum<?> getEnum(int i) {
        if (i < 0 || i >= this._enums.length) {
            return null;
        }
        return this._enums[i];
    }

    public Enum<?> getDefaultValue() {
        return this._defaultValue;
    }

    public Enum<?>[] getRawEnums() {
        return this._enums;
    }

    public List<Enum<?>> getEnums() {
        ArrayList arrayList = new ArrayList(this._enums.length);
        for (Enum<?> r0 : this._enums) {
            arrayList.add(r0);
        }
        return arrayList;
    }

    public Collection<String> getEnumIds() {
        return this._enumsById.keySet();
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public int lastValidIndex() {
        return this._enums.length - 1;
    }

    public boolean isFromIntValue() {
        return this._isFromIntValue;
    }
}
