package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.utils.UUIDUtil;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ClassWrapper;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class NBTUUIDList extends NBTList<UUID> {
    private final NBTContainer tmpContainer;

    public NBTUUIDList(NBTCompound nBTCompound, String str, NBTType nBTType, Object obj) {
        super(nBTCompound, str, nBTType, obj);
        this.tmpContainer = new NBTContainer();
    }

    @Override
    public Object asTag(UUID uuid) {
        try {
            Constructor<?> declaredConstructor = ClassWrapper.NMS_NBTTAGINTARRAY.getClazz().getDeclaredConstructor(int[].class);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(UUIDUtil.uuidToIntArray(uuid));
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new NbtApiException("Error while wrapping the Object " + uuid + " to it's NMS object!", e);
        }
    }

    @Override
    public UUID get(int i) {
        try {
            ReflectionMethod.COMPOUND_SET.run(this.tmpContainer.getCompound(), "tmp", ReflectionMethod.LIST_GET.run(this.listObject, Integer.valueOf(i)));
            int[] intArray = this.tmpContainer.getIntArray("tmp");
            this.tmpContainer.removeKey("tmp");
            return UUIDUtil.uuidFromIntArray(intArray);
        } catch (NumberFormatException e) {
            return null;
        } catch (Exception e2) {
            throw new NbtApiException(e2);
        }
    }
}
