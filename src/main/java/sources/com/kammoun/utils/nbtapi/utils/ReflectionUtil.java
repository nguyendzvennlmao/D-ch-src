package com.kammoun.utils.nbtapi.utils;

import com.kammoun.utils.nbtapi.NbtApiException;
import com.kammoun.utils.nbtapi.utils.nmsmappings.MojangToMapping;
import java.lang.reflect.Field;

public final class ReflectionUtil {
    public static Field getMappedField(Class<?> cls, String str) {
        try {
            return cls.getField(str.split("#")[1]);
        } catch (NoSuchFieldException | SecurityException e) {
            try {
                return cls.getDeclaredField(MojangToMapping.getMapping().get(str));
            } catch (Exception e2) {
                throw new NbtApiException("Unable to find field " + str + " in class " + cls.getName(), e2);
            }
        }
    }
}
