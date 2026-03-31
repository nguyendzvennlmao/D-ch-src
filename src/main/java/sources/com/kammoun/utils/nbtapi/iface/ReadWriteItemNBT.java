package com.kammoun.utils.nbtapi.iface;

import java.util.function.BiConsumer;
import org.bukkit.inventory.meta.ItemMeta;

public interface ReadWriteItemNBT extends ReadWriteNBT, ReadableItemNBT {
    boolean hasCustomNbtData();

    void clearCustomNBT();

    void modifyMeta(BiConsumer<ReadableNBT, ItemMeta> biConsumer);

    <T extends ItemMeta> void modifyMeta(Class<T> cls, BiConsumer<ReadableNBT, T> biConsumer);
}
