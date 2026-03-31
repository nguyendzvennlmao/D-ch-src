package com.kammoun.utils.nbtapi.wrapper;

import com.kammoun.utils.nbtapi.iface.NBTHandler;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public interface NBTProxy {
    public static final Map<Class<?>, NBTHandler<Object>> handlers = new HashMap();

    default void init() {
    }

    default Casing getCasing() {
        return Casing.PascalCase;
    }

    default <T> NBTHandler<T> getHandler(Class<T> cls) {
        return (NBTHandler) handlers.get(cls);
    }

    default Collection<NBTHandler<Object>> getHandlers() {
        return handlers.values();
    }

    default <T> void registerHandler(Class<T> cls, NBTHandler<T> nBTHandler) {
        handlers.put(cls, nBTHandler);
    }
}
