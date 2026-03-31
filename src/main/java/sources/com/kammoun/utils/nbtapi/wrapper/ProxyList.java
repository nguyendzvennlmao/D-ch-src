package com.kammoun.utils.nbtapi.wrapper;

import com.kammoun.utils.nbtapi.wrapper.NBTProxy;

public interface ProxyList<T extends NBTProxy> extends Iterable<T> {
    T addCompound();

    int size();

    boolean isEmpty();

    T get(int i);

    void remove(int i);
}
