package com.kammoun.utils.jackson.databind.cfg;

import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonSerializer;
import com.kammoun.utils.jackson.databind.SerializationConfig;
import com.kammoun.utils.jackson.databind.deser.DeserializerCache;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import com.kammoun.utils.jackson.databind.util.LRUMap;
import com.kammoun.utils.jackson.databind.util.LookupCache;
import com.kammoun.utils.jackson.databind.util.TypeKey;

public class DefaultCacheProvider implements CacheProvider {
    private static final long serialVersionUID = 1;
    private static final DefaultCacheProvider DEFAULT = new DefaultCacheProvider(DeserializerCache.DEFAULT_MAX_CACHE_SIZE, 4000, TypeFactory.DEFAULT_MAX_CACHE_SIZE);
    protected final int _maxDeserializerCacheSize;
    protected final int _maxSerializerCacheSize;
    protected final int _maxTypeFactoryCacheSize;

    public static class Builder {
        private int _maxDeserializerCacheSize;
        private int _maxSerializerCacheSize;
        private int _maxTypeFactoryCacheSize;

        Builder() {
        }

        public Builder maxDeserializerCacheSize(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Cannot set maxDeserializerCacheSize to a negative value");
            }
            this._maxDeserializerCacheSize = i;
            return this;
        }

        public Builder maxSerializerCacheSize(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Cannot set maxSerializerCacheSize to a negative value");
            }
            this._maxSerializerCacheSize = i;
            return this;
        }

        public Builder maxTypeFactoryCacheSize(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Cannot set maxTypeFactoryCacheSize to a negative value");
            }
            this._maxTypeFactoryCacheSize = i;
            return this;
        }

        public DefaultCacheProvider build() {
            return new DefaultCacheProvider(this._maxDeserializerCacheSize, this._maxSerializerCacheSize, this._maxTypeFactoryCacheSize);
        }
    }

    protected DefaultCacheProvider(int i, int i2, int i3) {
        this._maxDeserializerCacheSize = i;
        this._maxSerializerCacheSize = i2;
        this._maxTypeFactoryCacheSize = i3;
    }

    public static CacheProvider defaultInstance() {
        return DEFAULT;
    }

    @Override
    public LookupCache<JavaType, JsonDeserializer<Object>> forDeserializerCache(DeserializationConfig deserializationConfig) {
        return _buildCache(this._maxDeserializerCacheSize);
    }

    @Override
    public LookupCache<TypeKey, JsonSerializer<Object>> forSerializerCache(SerializationConfig serializationConfig) {
        return _buildCache(this._maxSerializerCacheSize);
    }

    @Override
    public LookupCache<Object, JavaType> forTypeFactory() {
        return _buildCache(this._maxTypeFactoryCacheSize);
    }

    protected <K, V> LookupCache<K, V> _buildCache(int i) {
        return new LRUMap(Math.min(64, i >> 2), i);
    }

    public static Builder builder() {
        return new Builder();
    }
}
