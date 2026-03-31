package com.kammoun.utils.jackson.core.util;

public interface JacksonFeature {
    boolean enabledByDefault();

    int getMask();

    boolean enabledIn(int i);
}
