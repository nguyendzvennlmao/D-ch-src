package com.kammoun.utils.jackson.databind.cfg;

public interface ConfigFeature {
    boolean enabledByDefault();

    int getMask();

    boolean enabledIn(int i);
}
