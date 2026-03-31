package com.kammoun.utils.jackson.databind.util;

import java.util.function.BiConsumer;

public interface LookupCache<K, V> {
    default void contents(BiConsumer<K, V> biConsumer) {
        throw new UnsupportedOperationException();
    }

    default LookupCache<K, V> emptyCopy() {
        throw new UnsupportedOperationException("LookupCache implementation " + getClass().getName() + " does not implement `emptyCopy()`");
    }

    int size();

    V get(Object obj);

    V put(K k, V v);

    V putIfAbsent(K k, V v);

    void clear();
}
