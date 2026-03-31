package com.kammoun.utils.nbtapi;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ClassWrapper;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

public class NBTStringList extends NBTList<String> {
    public NBTStringList(NBTCompound nBTCompound, String str, NBTType nBTType, Object obj) {
        super(nBTCompound, str, nBTType, obj);
    }

    @Override
    public String get(int i) {
        try {
            Object run = ReflectionMethod.LIST_GET_STRING.run(this.listObject, Integer.valueOf(i));
            return run instanceof Optional ? (String) ((Optional) run).orElse(JsonProperty.USE_DEFAULT_NAME) : (String) run;
        } catch (Exception e) {
            throw new NbtApiException(e);
        }
    }

    @Override
    public Object asTag(String str) {
        try {
            Constructor<?> declaredConstructor = ClassWrapper.NMS_NBTTAGSTRING.getClazz().getDeclaredConstructor(String.class);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(str);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new NbtApiException("Error while wrapping the Object " + str + " to it's NMS object!", e);
        }
    }
}
