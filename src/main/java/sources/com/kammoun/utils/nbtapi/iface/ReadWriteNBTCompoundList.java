package com.kammoun.utils.nbtapi.iface;

import java.util.function.Predicate;

public interface ReadWriteNBTCompoundList extends ReadableNBTList<ReadWriteNBT> {
    ReadWriteNBT addCompound();

    ReadWriteNBT addCompound(ReadableNBT readableNBT);

    ReadWriteNBT remove(int i);

    void clear();

    boolean removeIf(Predicate<? super ReadWriteNBT> predicate);
}
