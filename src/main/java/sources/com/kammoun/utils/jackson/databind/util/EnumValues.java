package com.kammoun.utils.jackson.databind.util;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.core.SerializableString;
import com.kammoun.utils.jackson.databind.AnnotationIntrospector;
import com.kammoun.utils.jackson.databind.EnumNamingStrategy;
import com.kammoun.utils.jackson.databind.SerializationConfig;
import com.kammoun.utils.jackson.databind.SerializationFeature;
import com.kammoun.utils.jackson.databind.cfg.EnumFeature;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedClass;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class EnumValues implements Serializable {
    private static final long serialVersionUID = 1;
    private final Class<Enum<?>> _enumClass;
    private final Enum<?>[] _values;
    private final SerializableString[] _textual;
    private transient EnumMap<?, SerializableString> _asMap;

    private EnumValues(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        this._enumClass = cls;
        this._values = cls.getEnumConstants();
        this._textual = serializableStringArr;
    }

    public static EnumValues construct(SerializationConfig serializationConfig, AnnotatedClass annotatedClass) {
        return serializationConfig.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING) ? constructFromToString(serializationConfig, annotatedClass) : constructFromName(serializationConfig, annotatedClass);
    }

    @Deprecated
    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> findEnumType = ClassUtil.findEnumType(cls);
        Enum<?>[] enumArr = (Enum[]) findEnumType.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
        }
        String[] findEnumValues = mapperConfig.getAnnotationIntrospector().findEnumValues(findEnumType, enumArr, new String[enumArr.length]);
        SerializableString[] serializableStringArr = new SerializableString[enumArr.length];
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            Enum<?> r0 = enumArr[i];
            String str = findEnumValues[i];
            if (str == null) {
                str = r0.name();
            }
            if (mapperConfig.isEnabled(EnumFeature.WRITE_ENUMS_TO_LOWERCASE)) {
                str = str.toLowerCase();
            }
            serializableStringArr[r0.ordinal()] = mapperConfig.compileString(str);
        }
        return construct(cls, serializableStringArr);
    }

    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        boolean isEnabled = mapperConfig.isEnabled(EnumFeature.WRITE_ENUMS_TO_LOWERCASE);
        Class<?> rawType = annotatedClass.getRawType();
        Class<Enum<?>> _enumClass = _enumClass(rawType);
        Enum<?>[] _enumConstants = _enumConstants(rawType);
        String[] findEnumValues = annotationIntrospector.findEnumValues(mapperConfig, annotatedClass, _enumConstants, new String[_enumConstants.length]);
        SerializableString[] serializableStringArr = new SerializableString[_enumConstants.length];
        int length = _enumConstants.length;
        for (int i = 0; i < length; i++) {
            Enum<?> r0 = _enumConstants[i];
            String str = findEnumValues[i];
            if (str == null) {
                str = r0.name();
            }
            if (isEnabled) {
                str = str.toLowerCase();
            }
            serializableStringArr[r0.ordinal()] = mapperConfig.compileString(str);
        }
        return construct(_enumClass, serializableStringArr);
    }

    public static EnumValues constructFromToString(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        boolean isEnabled = mapperConfig.isEnabled(EnumFeature.WRITE_ENUMS_TO_LOWERCASE);
        Class<?> rawType = annotatedClass.getRawType();
        Class<Enum<?>> _enumClass = _enumClass(rawType);
        Enum<?>[] _enumConstants = _enumConstants(rawType);
        String[] strArr = new String[_enumConstants.length];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumValues(mapperConfig, annotatedClass, _enumConstants, strArr);
        }
        SerializableString[] serializableStringArr = new SerializableString[_enumConstants.length];
        for (int i = 0; i < _enumConstants.length; i++) {
            String str = strArr[i];
            if (str == null) {
                str = _enumConstants[i].toString();
                if (str == null) {
                    str = JsonProperty.USE_DEFAULT_NAME;
                }
            }
            if (isEnabled) {
                str = str.toLowerCase();
            }
            serializableStringArr[i] = mapperConfig.compileString(str);
        }
        return construct(_enumClass, serializableStringArr);
    }

    @Deprecated
    public static EnumValues constructFromToString(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Enum[] enumArr = (Enum[]) ClassUtil.findEnumType(cls).getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
        }
        ArrayList arrayList = new ArrayList(enumArr.length);
        for (Enum r0 : enumArr) {
            arrayList.add(r0.toString());
        }
        return construct(mapperConfig, cls, arrayList);
    }

    public static EnumValues constructUsingEnumNamingStrategy(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, EnumNamingStrategy enumNamingStrategy) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        boolean isEnabled = mapperConfig.isEnabled(EnumFeature.WRITE_ENUMS_TO_LOWERCASE);
        Class<?> rawType = annotatedClass.getRawType();
        Class<Enum<?>> _enumClass = _enumClass(rawType);
        Enum<?>[] _enumConstants = _enumConstants(rawType);
        String[] strArr = new String[_enumConstants.length];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumValues(mapperConfig, annotatedClass, _enumConstants, strArr);
        }
        SerializableString[] serializableStringArr = new SerializableString[_enumConstants.length];
        int length = _enumConstants.length;
        for (int i = 0; i < length; i++) {
            Enum<?> r0 = _enumConstants[i];
            String str = strArr[i];
            if (str == null) {
                str = enumNamingStrategy.convertEnumToExternalName(r0.name());
            }
            if (isEnabled) {
                str = str.toLowerCase();
            }
            serializableStringArr[i] = mapperConfig.compileString(str);
        }
        return construct(_enumClass, serializableStringArr);
    }

    @Deprecated
    public static EnumValues constructUsingEnumNamingStrategy(MapperConfig<?> mapperConfig, Class<Enum<?>> cls, EnumNamingStrategy enumNamingStrategy) {
        Enum[] enumArr = (Enum[]) ClassUtil.findEnumType(cls).getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
        }
        ArrayList arrayList = new ArrayList(enumArr.length);
        for (Enum r0 : enumArr) {
            arrayList.add(enumNamingStrategy.convertEnumToExternalName(r0.name()));
        }
        return construct(mapperConfig, cls, arrayList);
    }

    public static EnumValues construct(MapperConfig<?> mapperConfig, Class<Enum<?>> cls, List<String> list) {
        int size = list.size();
        SerializableString[] serializableStringArr = new SerializableString[size];
        for (int i = 0; i < size; i++) {
            serializableStringArr[i] = mapperConfig.compileString(list.get(i));
        }
        return construct(cls, serializableStringArr);
    }

    public static EnumValues construct(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        return new EnumValues(cls, serializableStringArr);
    }

    protected static Class<Enum<?>> _enumClass(Class<?> cls) {
        return cls;
    }

    protected static Enum<?>[] _enumConstants(Class<?> cls) {
        Enum<?>[] enumArr = (Enum[]) ClassUtil.findEnumType(cls).getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("No enum constants for class " + cls.getName());
        }
        return enumArr;
    }

    public SerializableString serializedValueFor(Enum<?> r4) {
        return this._textual[r4.ordinal()];
    }

    public Collection<SerializableString> values() {
        return Arrays.asList(this._textual);
    }

    public List<Enum<?>> enums() {
        return Arrays.asList(this._values);
    }

    public EnumMap<?, SerializableString> internalMap() {
        EnumMap<?, SerializableString> enumMap = this._asMap;
        if (enumMap == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Enum<?> r0 : this._values) {
                linkedHashMap.put(r0, this._textual[r0.ordinal()]);
            }
            EnumMap<?, SerializableString> enumMap2 = new EnumMap<>(linkedHashMap);
            enumMap = enumMap2;
            this._asMap = enumMap2;
        }
        return enumMap;
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }
}
