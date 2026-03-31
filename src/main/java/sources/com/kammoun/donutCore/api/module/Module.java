package com.kammoun.donutCore.api.module;

import com.kammoun.donutCore.DonutCore;

public interface Module {
    void onEnable(DonutCore donutCore, int i);

    void onDisable(DonutCore donutCore, int i);

    String getName();
}
