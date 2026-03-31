package com.kammoun.donutCore.api.skin;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface SkinCache {
    @Nullable
    SkinData get(@NotNull UUID uuid, int i);

    void put(@NotNull SkinData skinData);

    boolean contains(@NotNull UUID uuid);

    void invalidate(@NotNull UUID uuid, int i);

    void clear(int i);

    int size(int i);
}
