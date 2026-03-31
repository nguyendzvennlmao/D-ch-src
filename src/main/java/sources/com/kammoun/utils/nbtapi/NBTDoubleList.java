package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.utils.nmsmappings.ClassWrapper;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NBTDoubleList extends NBTList<Double> {
    public NBTDoubleList(NBTCompound nBTCompound, String str, NBTType nBTType, Object obj) {
        super(nBTCompound, str, nBTType, obj);
    }

    @Override
    public Object asTag(Double d) {
        try {
            Constructor<?> declaredConstructor = ClassWrapper.NMS_NBTTAGDOUBLE.getClazz().getDeclaredConstructor(Double.TYPE);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(d);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new NbtApiException("Error while wrapping the Object " + d + " to it's NMS object!", e);
        }
    }

    @Override
    public Double get(int i) {
        try {
            return Double.valueOf(ReflectionMethod.LIST_GET.run(this.listObject, Integer.valueOf(i)).toString());
        } catch (NumberFormatException e) {
            return Double.valueOf(0.0d);
        } catch (Exception e2) {
            throw new NbtApiException(e2);
        }
    }
}
