package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.utils.nmsmappings.ClassWrapper;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NBTIntArrayList extends NBTList<int[]> {
    private final NBTContainer tmpContainer;

    public NBTIntArrayList(NBTCompound nBTCompound, String str, NBTType nBTType, Object obj) {
        super(nBTCompound, str, nBTType, obj);
        this.tmpContainer = new NBTContainer();
    }

    @Override
    public Object asTag(int[] iArr) {
        try {
            Constructor<?> declaredConstructor = ClassWrapper.NMS_NBTTAGINTARRAY.getClazz().getDeclaredConstructor(int[].class);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(iArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new NbtApiException("Error while wrapping the Object " + iArr + " to it's NMS object!", e);
        }
    }

    @Override
    public int[] get(int i) {
        try {
            ReflectionMethod.COMPOUND_SET.run(this.tmpContainer.getCompound(), "tmp", ReflectionMethod.LIST_GET.run(this.listObject, Integer.valueOf(i)));
            int[] intArray = this.tmpContainer.getIntArray("tmp");
            this.tmpContainer.removeKey("tmp");
            return intArray;
        } catch (NumberFormatException e) {
            return null;
        } catch (Exception e2) {
            throw new NbtApiException(e2);
        }
    }
}
