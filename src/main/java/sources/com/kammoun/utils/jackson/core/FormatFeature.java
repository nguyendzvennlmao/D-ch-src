package com.kammoun.utils.jackson.core;

import com.kammoun.utils.jackson.core.util.JacksonFeature;

public interface FormatFeature extends JacksonFeature {
    @Override
    boolean enabledByDefault();

    @Override
    int getMask();

    @Override
    boolean enabledIn(int i);
}
