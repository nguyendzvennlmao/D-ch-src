package com.kammoun.utils.nbtapi.utils.nmsmappings;

import com.kammoun.utils.nbtapi.NBTReflectionUtil;
import com.kammoun.utils.nbtapi.NbtApiException;
import com.mojang.serialization.DataResult;
import java.util.Objects;
import java.util.Optional;

public class CodecHelper {
    public static Object convertItemStackToNbt(Object obj) {
        DataResult dataResult = null;
        try {
            dataResult = NBTReflectionUtil.itemstack_codec.encodeStart(NBTReflectionUtil.nbtRegistryOps, obj);
            Objects.requireNonNull(dataResult);
            return ((Optional) dataResult.getClass().getMethod("result", new Class[0]).invoke(dataResult, new Object[0])).get();
        } catch (Exception e) {
            throw new NbtApiException("Failed to convert ItemStack to NBT. " + dataResult + " " + obj, e);
        }
    }

    public static Object convertNbtToItemStack(Object obj) {
        DataResult dataResult = null;
        try {
            dataResult = NBTReflectionUtil.itemstack_codec.parse(NBTReflectionUtil.nbtRegistryOps, obj);
            Objects.requireNonNull(dataResult);
            return ((Optional) dataResult.getClass().getMethod("result", new Class[0]).invoke(dataResult, new Object[0])).get();
        } catch (Exception e) {
            throw new NbtApiException("Failed to convert NBT to ItemStack. " + dataResult + " " + obj, e);
        }
    }
}
