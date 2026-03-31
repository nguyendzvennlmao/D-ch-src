package com.kammoun.utils.nbtapi.utils.nmsmappings;

import com.kammoun.utils.jackson.annotation.JsonProperty;

public enum PackageWrapper {
    NMS("net.minecraft.server"),
    CRAFTBUKKIT("org.bukkit.craftbukkit"),
    NONE(JsonProperty.USE_DEFAULT_NAME);

    private final String uri;

    PackageWrapper(String str) {
        this.uri = str;
    }

    public String getUri() {
        return this.uri;
    }
}
