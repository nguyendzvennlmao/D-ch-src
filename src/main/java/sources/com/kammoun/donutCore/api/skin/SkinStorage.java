package com.kammoun.donutCore.api.skin;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;

public interface SkinStorage {
    CompletableFuture initialize(int i);

    CompletableFuture load(@NotNull UUID uuid, int i);

    CompletableFuture save(@NotNull SkinData skinData, int i);

    CompletableFuture<Void> delete(@NotNull UUID uuid);

    CompletableFuture<Boolean> exists(@NotNull UUID uuid);

    CompletableFuture shutdown(int i);
}
