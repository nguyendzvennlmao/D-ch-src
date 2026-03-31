package com.kammoun.utils.nbtapi.iface;

import com.kammoun.utils.nbtapi.NBTType;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bukkit.inventory.ItemStack;

public interface ReadableNBT {
    String getString(String str);

    Integer getInteger(String str);

    Double getDouble(String str);

    Byte getByte(String str);

    Short getShort(String str);

    Long getLong(String str);

    Float getFloat(String str);

    @Nullable
    byte[] getByteArray(String str);

    @Nullable
    int[] getIntArray(String str);

    @Nullable
    long[] getLongArray(String str);

    Boolean getBoolean(String str);

    @Nullable
    ItemStack getItemStack(String str);

    @Nullable
    ItemStack[] getItemStackArray(String str);

    @Nullable
    UUID getUUID(String str);

    boolean hasTag(String str);

    default boolean hasTag(String str, NBTType nBTType) {
        return hasTag(str) && getType(str) == nBTType;
    }

    Set<String> getKeys();

    @Nullable
    ReadableNBT getCompound(String str);

    ReadableNBTList<String> getStringList(String str);

    ReadableNBTList<Integer> getIntegerList(String str);

    ReadableNBTList<int[]> getIntArrayList(String str);

    ReadableNBTList<UUID> getUUIDList(String str);

    ReadableNBTList<Float> getFloatList(String str);

    ReadableNBTList<Double> getDoubleList(String str);

    ReadableNBTList<Long> getLongList(String str);

    @Nullable
    NBTType getListType(String str);

    ReadableNBTList<ReadWriteNBT> getCompoundList(String str);

    <T> T getOrDefault(String str, T t);

    @Nullable
    <T> T getOrNull(String str, Class<?> cls);

    @Nullable
    <T> T resolveOrNull(String str, Class<?> cls);

    <T> T resolveOrDefault(String str, T t);

    @Nullable
    ReadableNBT resolveCompound(String str);

    <T> T get(String str, NBTHandler<T> nBTHandler);

    @Nullable
    <E extends Enum<E>> E getEnum(String str, Class<E> cls);

    NBTType getType(String str);

    void writeCompound(OutputStream outputStream);

    ReadWriteNBT extractDifference(ReadableNBT readableNBT);

    String toString();
}
