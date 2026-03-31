package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.utils.nmsmappings.ClassWrapper;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NBTIntegerList extends NBTList<Integer> {
    public NBTIntegerList(NBTCompound nBTCompound, String str, NBTType nBTType, Object obj) {
        super(nBTCompound, str, nBTType, obj);
    }

    @Override
    public Object asTag(Integer num) {
        try {
            Constructor<?> declaredConstructor = ClassWrapper.NMS_NBTTAGINT.getClazz().getDeclaredConstructor(Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(num);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new NbtApiException("Error while wrapping the Object " + num + " to it's NMS object!", e);
        }
    }

    @Override
    public Integer get(int i) {
        try {
            return Integer.valueOf(ReflectionMethod.LIST_GET.run(this.listObject, Integer.valueOf(i)).toString());
        } catch (NumberFormatException e) {
            return 0;
        } catch (Exception e2) {
            throw new NbtApiException(e2);
        }
    }
}
