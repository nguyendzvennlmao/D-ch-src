package com.kammoun.utils.jackson.databind.introspect;

import com.kammoun.utils.jackson.databind.EnumNamingStrategy;
import com.kammoun.utils.jackson.databind.util.ClassUtil;

public class EnumNamingStrategyFactory {
    private EnumNamingStrategyFactory() {
    }

    public static EnumNamingStrategy createEnumNamingStrategyInstance(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof EnumNamingStrategy) {
            return (EnumNamingStrategy) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException(String.format("AnnotationIntrospector returned EnumNamingStrategy definition of type %s; expected type `Class<EnumNamingStrategy>` instead", ClassUtil.classNameOf(obj)));
        }
        Class cls = (Class) obj;
        if (cls == EnumNamingStrategy.class) {
            return null;
        }
        if (EnumNamingStrategy.class.isAssignableFrom(cls)) {
            return (EnumNamingStrategy) ClassUtil.createInstance(cls, z);
        }
        throw new IllegalArgumentException(String.format("Problem with AnnotationIntrospector returned Class %s; expected `Class<EnumNamingStrategy>`", ClassUtil.classNameOf(cls)));
    }
}
