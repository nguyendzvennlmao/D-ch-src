package com.kammoun.utils.jackson.databind.util;

import com.kammoun.utils.jackson.databind.util.internal.PrivateMaxEntriesMap;
import java.io.Serializable;
import java.util.Map;
import java.util.function.BiConsumer;

public class LRUMap<K, V> implements LookupCache<K, V>, Serializable {
    private static final long serialVersionUID = 2;
    protected final int _initialEntries;
    protected final int _maxEntries;
    protected final transient PrivateMaxEntriesMap<K, V> _map;

    public LRUMap(int i, int i2) {
        this._initialEntries = i;
        this._maxEntries = i2;
        this._map = new PrivateMaxEntriesMap.Builder().initialCapacity(i).maximumCapacity(i2).concurrencyLevel(4).build();
    }

    @Override
    public LookupCache<K, V> emptyCopy() {
        return new LRUMap(this._initialEntries, this._maxEntries);
    }

    @Override
    public V put(K k, V v) {
        return this._map.put(k, v);
    }

    @Override
    public V putIfAbsent(K k, V v) {
        return this._map.putIfAbsent(k, v);
    }

    @Override
    public V get(Object obj) {
        return this._map.get(obj);
    }

    @Override
    public void clear() {
        this._map.clear();
    }

    @Override
    public int size() {
        return this._map.size();
    }

    @Override
    public void contents(BiConsumer<K, V> biConsumer) {
        for (Map.Entry<K, V> entry : this._map.entrySet()) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }

    protected Object readResolve() {
        return new LRUMap(this._initialEntries, this._maxEntries);
    }
}
