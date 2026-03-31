package com.kammoun.utils.nbtapi.iface;

import java.util.UUID;
import javax.annotation.Nullable;
import org.bukkit.inventory.ItemStack;

public interface ReadWriteNBT extends ReadableNBT {
    void mergeCompound(ReadableNBT readableNBT);

    void setString(String str, String str2);

    void setInteger(String str, Integer num);

    void setDouble(String str, Double d);

    void setByte(String str, Byte b);

    void setShort(String str, Short sh);

    void setLong(String str, Long l);

    void setFloat(String str, Float f);

    void setByteArray(String str, byte[] bArr);

    void setIntArray(String str, int[] iArr);

    void setLongArray(String str, long[] jArr);

    void setBoolean(String str, Boolean bool);

    void setItemStack(String str, ItemStack itemStack);

    void setItemStackArray(String str, ItemStack[] itemStackArr);

    void setUUID(String str, UUID uuid);

    void removeKey(String str);

    ReadWriteNBT getOrCreateCompound(String str);

    @Override
    @Nullable
    ReadWriteNBT getCompound(String str);

    ReadWriteNBT resolveOrCreateCompound(String str);

    <T> void set(String str, T t, NBTHandler<T> nBTHandler);

    <E extends Enum<?>> void setEnum(String str, E e);

    @Override
    ReadWriteNBTList<String> getStringList(String str);

    @Override
    ReadWriteNBTList<Integer> getIntegerList(String str);

    @Override
    ReadWriteNBTList<int[]> getIntArrayList(String str);

    @Override
    ReadWriteNBTList<UUID> getUUIDList(String str);

    @Override
    ReadWriteNBTList<Float> getFloatList(String str);

    @Override
    ReadWriteNBTList<Double> getDoubleList(String str);

    @Override
    ReadWriteNBTList<Long> getLongList(String str);

    @Override
    ReadWriteNBTCompoundList getCompoundList(String str);

    @Override
    @Nullable
    ReadWriteNBT resolveCompound(String str);

    void clearNBT();
}
