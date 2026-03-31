package com.kammoun.utils.nbtapi;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ClassWrapper;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NBTLongList extends NBTList<Long> {
    public NBTLongList(NBTCompound nBTCompound, String str, NBTType nBTType, Object obj) {
        super(nBTCompound, str, nBTType, obj);
    }

    @Override
    public Object asTag(Long l) {
        try {
            Constructor<?> declaredConstructor = ClassWrapper.NMS_NBTTAGLONG.getClazz().getDeclaredConstructor(Long.TYPE);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(l);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new NbtApiException("Error while wrapping the Object " + l + " to it's NMS object!", e);
        }
    }

    @Override
    public Long get(int i) {
        try {
            return Long.valueOf(ReflectionMethod.LIST_GET.run(this.listObject, Integer.valueOf(i)).toString().replace("L", JsonProperty.USE_DEFAULT_NAME));
        } catch (NumberFormatException e) {
            return 0L;
        } catch (Exception e2) {
            throw new NbtApiException(e2);
        }
    }
}
