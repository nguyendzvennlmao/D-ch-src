package com.kammoun.utils.lib.folialib.impl;

import com.kammoun.utils.lib.folialib.enums.EntityTaskResult;
import com.kammoun.utils.lib.folialib.wrapper.task.WrappedTask;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
public interface ServerImplementation {
    boolean isOwnedByCurrentRegion(@NotNull Location location);

    boolean isOwnedByCurrentRegion(@NotNull Location location, int i);

    boolean isOwnedByCurrentRegion(@NotNull Block block);

    boolean isOwnedByCurrentRegion(@NotNull World world, int i, int i2);

    boolean isOwnedByCurrentRegion(@NotNull World world, int i, int i2, int i3);

    boolean isOwnedByCurrentRegion(@NotNull Entity entity);

    boolean isGlobalTickThread();

    @NotNull
    CompletableFuture<Void> runNextTick(@NotNull Consumer<WrappedTask> consumer);

    @NotNull
    CompletableFuture<Void> runAsync(@NotNull Consumer<WrappedTask> consumer);

    WrappedTask runLater(@NotNull Runnable runnable, long j);

    @NotNull
    CompletableFuture<Void> runLater(@NotNull Consumer<WrappedTask> consumer, long j);

    WrappedTask runLater(@NotNull Runnable runnable, long j, TimeUnit timeUnit);

    @NotNull
    CompletableFuture<Void> runLater(@NotNull Consumer<WrappedTask> consumer, long j, TimeUnit timeUnit);

    WrappedTask runLaterAsync(@NotNull Runnable runnable, long j);

    @NotNull
    CompletableFuture<Void> runLaterAsync(@NotNull Consumer<WrappedTask> consumer, long j);

    WrappedTask runLaterAsync(@NotNull Runnable runnable, long j, TimeUnit timeUnit);

    @NotNull
    CompletableFuture<Void> runLaterAsync(@NotNull Consumer<WrappedTask> consumer, long j, TimeUnit timeUnit);

    WrappedTask runTimer(@NotNull Runnable runnable, long j, long j2);

    void runTimer(@NotNull Consumer<WrappedTask> consumer, long j, long j2);

    WrappedTask runTimer(@NotNull Runnable runnable, long j, long j2, TimeUnit timeUnit);

    void runTimer(@NotNull Consumer<WrappedTask> consumer, long j, long j2, TimeUnit timeUnit);

    WrappedTask runTimerAsync(@NotNull Runnable runnable, long j, long j2);

    void runTimerAsync(@NotNull Consumer<WrappedTask> consumer, long j, long j2);

    WrappedTask runTimerAsync(@NotNull Runnable runnable, long j, long j2, TimeUnit timeUnit);

    void runTimerAsync(@NotNull Consumer<WrappedTask> consumer, long j, long j2, TimeUnit timeUnit);

    @NotNull
    CompletableFuture<Void> runAtLocation(Location location, @NotNull Consumer<WrappedTask> consumer);

    WrappedTask runAtLocationLater(Location location, @NotNull Runnable runnable, long j);

    @NotNull
    CompletableFuture<Void> runAtLocationLater(Location location, @NotNull Consumer<WrappedTask> consumer, long j);

    WrappedTask runAtLocationLater(Location location, @NotNull Runnable runnable, long j, TimeUnit timeUnit);

    @NotNull
    CompletableFuture<Void> runAtLocationLater(Location location, @NotNull Consumer<WrappedTask> consumer, long j, TimeUnit timeUnit);

    WrappedTask runAtLocationTimer(Location location, @NotNull Runnable runnable, long j, long j2);

    void runAtLocationTimer(Location location, @NotNull Consumer<WrappedTask> consumer, long j, long j2);

    WrappedTask runAtLocationTimer(Location location, @NotNull Runnable runnable, long j, long j2, TimeUnit timeUnit);

    void runAtLocationTimer(Location location, @NotNull Consumer<WrappedTask> consumer, long j, long j2, TimeUnit timeUnit);

    @NotNull
    CompletableFuture<EntityTaskResult> runAtEntity(Entity entity, @NotNull Consumer<WrappedTask> consumer);

    @NotNull
    CompletableFuture<EntityTaskResult> runAtEntityWithFallback(Entity entity, @NotNull Consumer<WrappedTask> consumer, @Nullable Runnable runnable);

    WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, long j);

    WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, @Nullable Runnable runnable2, long j);

    @NotNull
    CompletableFuture<Void> runAtEntityLater(Entity entity, @NotNull Consumer<WrappedTask> consumer, long j);

    @NotNull
    CompletableFuture<Void> runAtEntityLater(Entity entity, @NotNull Consumer<WrappedTask> consumer, Runnable runnable, long j);

    WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, long j, TimeUnit timeUnit);

    @NotNull
    CompletableFuture<Void> runAtEntityLater(Entity entity, @NotNull Consumer<WrappedTask> consumer, long j, TimeUnit timeUnit);

    WrappedTask runAtEntityTimer(Entity entity, @NotNull Runnable runnable, long j, long j2);

    WrappedTask runAtEntityTimer(Entity entity, @NotNull Runnable runnable, Runnable runnable2, long j, long j2);

    void runAtEntityTimer(Entity entity, @NotNull Consumer<WrappedTask> consumer, long j, long j2);

    void runAtEntityTimer(Entity entity, @NotNull Consumer<WrappedTask> consumer, Runnable runnable, long j, long j2);

    WrappedTask runAtEntityTimer(Entity entity, @NotNull Runnable runnable, long j, long j2, TimeUnit timeUnit);

    void runAtEntityTimer(Entity entity, @NotNull Consumer<WrappedTask> consumer, long j, long j2, TimeUnit timeUnit);

    void cancelTask(WrappedTask wrappedTask);

    void cancelAllTasks();

    List<WrappedTask> getAllTasks();

    List<WrappedTask> getAllServerTasks();

    Player getPlayer(String str);

    Player getPlayerExact(String str);

    Player getPlayer(UUID uuid);

    CompletableFuture<Boolean> teleportAsync(Entity entity, Location location);

    CompletableFuture<Boolean> teleportAsync(Entity entity, Location location, PlayerTeleportEvent.TeleportCause teleportCause);

    WrappedTask wrapTask(@NotNull Object obj);
}
