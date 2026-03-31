package com.kammoun.utils.nbtapi.iface;

import javax.annotation.Nonnull;

public interface NBTHandler<T> {
    default boolean fuzzyMatch(Object obj) {
        return false;
    }

    void set(@Nonnull ReadWriteNBT readWriteNBT, @Nonnull String str, @Nonnull T t);

    T get(@Nonnull ReadableNBT readableNBT, @Nonnull String str);
}
