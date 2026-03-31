package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.utils.nmsmappings.ClassWrapper;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NBTFloatList extends NBTList<Float> {
    public NBTFloatList(NBTCompound nBTCompound, String str, NBTType nBTType, Object obj) {
        super(nBTCompound, str, nBTType, obj);
    }

    @Override
    public Object asTag(Float f) {
        try {
            Constructor<?> declaredConstructor = ClassWrapper.NMS_NBTTAGFLOAT.getClazz().getDeclaredConstructor(Float.TYPE);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(f);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new NbtApiException("Error while wrapping the Object " + f + " to it's NMS object!", e);
        }
    }

    @Override
    public Float get(int i) {
        try {
            return Float.valueOf(ReflectionMethod.LIST_GET.run(this.listObject, Integer.valueOf(i)).toString());
        } catch (NumberFormatException e) {
            return Float.valueOf(0.0f);
        } catch (Exception e2) {
            throw new NbtApiException(e2);
        }
    }
}
