package com.kammoun.utils.lib.folialib.impl;

import com.kammoun.utils.lib.folialib.FoliaLib;
import com.kammoun.utils.lib.folialib.enums.EntityTaskResult;
import com.kammoun.utils.lib.folialib.util.FoliaLibOptions;
import com.kammoun.utils.lib.folialib.util.ImplementationTestsUtil;
import com.kammoun.utils.lib.folialib.util.TimeConverter;
import com.kammoun.utils.lib.folialib.wrapper.task.WrappedBukkitTask;
import com.kammoun.utils.lib.folialib.wrapper.task.WrappedLegacyBukkitTask;
import com.kammoun.utils.lib.folialib.wrapper.task.WrappedTask;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LegacySpigotImplementation implements PlatformScheduler {
    private final FoliaLib foliaLib;
    private final FoliaLibOptions options;
    private final Plugin plugin;

    @NotNull
    private final BukkitScheduler scheduler;

    public LegacySpigotImplementation(FoliaLib foliaLib) {
        this.foliaLib = foliaLib;
        this.options = foliaLib.getOptions();
        this.plugin = foliaLib.getPlugin();
        this.scheduler = this.plugin.getServer().getScheduler();
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Location location) {
        return this.plugin.getServer().isPrimaryThread();
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Location location, int i) {
        return this.plugin.getServer().isPrimaryThread();
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Block block) {
        return this.plugin.getServer().isPrimaryThread();
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull World world, int i, int i2) {
        return this.plugin.getServer().isPrimaryThread();
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull World world, int i, int i2, int i3) {
        return this.plugin.getServer().isPrimaryThread();
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Entity entity) {
        return this.plugin.getServer().isPrimaryThread();
    }

    @Override
    public boolean isGlobalTickThread() {
        return this.plugin.getServer().isPrimaryThread();
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runNextTick(@NotNull Consumer<WrappedTask> consumer) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        WrappedTask[] wrappedTaskArr = {wrapTask(this.scheduler.runTask(this.plugin, () -> {
            consumer.accept(wrappedTaskArr[0]);
            completableFuture.complete(null);
        }))};
        return completableFuture;
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAsync(@NotNull Consumer<WrappedTask> consumer) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        WrappedTask[] wrappedTaskArr = {wrapTask(this.scheduler.runTaskAsynchronously(this.plugin, () -> {
            consumer.accept(wrappedTaskArr[0]);
            completableFuture.complete(null);
        }))};
        return completableFuture;
    }

    @Override
    public WrappedTask runLater(@NotNull Runnable runnable, long j) {
        return wrapTask(this.scheduler.runTaskLater(this.plugin, runnable, j));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runLater(@NotNull Consumer<WrappedTask> consumer, long j) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        WrappedTask[] wrappedTaskArr = {wrapTask(this.scheduler.runTaskLater(this.plugin, () -> {
            consumer.accept(wrappedTaskArr[0]);
            completableFuture.complete(null);
        }, j))};
        return completableFuture;
    }

    @Override
    public WrappedTask runLater(@NotNull Runnable runnable, long j, TimeUnit timeUnit) {
        return runLater(runnable, TimeConverter.toTicks(j, timeUnit));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runLater(@NotNull Consumer<WrappedTask> consumer, long j, TimeUnit timeUnit) {
        return runLater(consumer, TimeConverter.toTicks(j, timeUnit));
    }

    @Override
    public WrappedTask runLaterAsync(@NotNull Runnable runnable, long j) {
        return wrapTask(this.scheduler.runTaskLaterAsynchronously(this.plugin, runnable, j));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runLaterAsync(@NotNull Consumer<WrappedTask> consumer, long j) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        WrappedTask[] wrappedTaskArr = {wrapTask(this.scheduler.runTaskLaterAsynchronously(this.plugin, () -> {
            consumer.accept(wrappedTaskArr[0]);
            completableFuture.complete(null);
        }, j))};
        return completableFuture;
    }

    @Override
    public WrappedTask runLaterAsync(@NotNull Runnable runnable, long j, TimeUnit timeUnit) {
        return runLaterAsync(runnable, TimeConverter.toTicks(j, timeUnit));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runLaterAsync(@NotNull Consumer<WrappedTask> consumer, long j, TimeUnit timeUnit) {
        return runLaterAsync(consumer, TimeConverter.toTicks(j, timeUnit));
    }

    @Override
    public WrappedTask runTimer(@NotNull Runnable runnable, long j, long j2) {
        return wrapTask(this.scheduler.runTaskTimer(this.plugin, runnable, j, j2));
    }

    @Override
    public void runTimer(@NotNull Consumer<WrappedTask> consumer, long j, long j2) {
        WrappedTask[] wrappedTaskArr = {wrapTask(this.scheduler.runTaskTimer(this.plugin, () -> {
            consumer.accept(wrappedTaskArr[0]);
        }, j, j2))};
    }

    @Override
    public WrappedTask runTimer(@NotNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return runTimer(runnable, TimeConverter.toTicks(j, timeUnit), TimeConverter.toTicks(j2, timeUnit));
    }

    @Override
    public void runTimer(@NotNull Consumer<WrappedTask> consumer, long j, long j2, TimeUnit timeUnit) {
        runTimer(consumer, TimeConverter.toTicks(j, timeUnit), TimeConverter.toTicks(j2, timeUnit));
    }

    @Override
    public WrappedTask runTimerAsync(@NotNull Runnable runnable, long j, long j2) {
        return wrapTask(this.scheduler.runTaskTimerAsynchronously(this.plugin, runnable, j, j2));
    }

    @Override
    public void runTimerAsync(@NotNull Consumer<WrappedTask> consumer, long j, long j2) {
        WrappedTask[] wrappedTaskArr = {wrapTask(this.scheduler.runTaskTimerAsynchronously(this.plugin, () -> {
            consumer.accept(wrappedTaskArr[0]);
        }, j, j2))};
    }

    @Override
    public WrappedTask runTimerAsync(@NotNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return runTimerAsync(runnable, TimeConverter.toTicks(j, timeUnit), TimeConverter.toTicks(j2, timeUnit));
    }

    @Override
    public void runTimerAsync(@NotNull Consumer<WrappedTask> consumer, long j, long j2, TimeUnit timeUnit) {
        runTimerAsync(consumer, TimeConverter.toTicks(j, timeUnit), TimeConverter.toTicks(j2, timeUnit));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtLocation(Location location, @NotNull Consumer<WrappedTask> consumer) {
        return runNextTick(consumer);
    }

    @Override
    public WrappedTask runAtLocationLater(Location location, @NotNull Runnable runnable, long j) {
        return wrapTask(this.scheduler.runTaskLater(this.plugin, runnable, j));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtLocationLater(Location location, @NotNull Consumer<WrappedTask> consumer, long j) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        WrappedTask[] wrappedTaskArr = {wrapTask(this.scheduler.runTaskLater(this.plugin, () -> {
            consumer.accept(wrappedTaskArr[0]);
            completableFuture.complete(null);
        }, j))};
        return completableFuture;
    }

    @Override
    public WrappedTask runAtLocationLater(Location location, @NotNull Runnable runnable, long j, TimeUnit timeUnit) {
        return runAtLocationLater(location, runnable, TimeConverter.toTicks(j, timeUnit));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtLocationLater(Location location, @NotNull Consumer<WrappedTask> consumer, long j, TimeUnit timeUnit) {
        return runAtLocationLater(location, consumer, TimeConverter.toTicks(j, timeUnit));
    }

    @Override
    public WrappedTask runAtLocationTimer(Location location, @NotNull Runnable runnable, long j, long j2) {
        return wrapTask(this.scheduler.runTaskTimer(this.plugin, runnable, j, j2));
    }

    @Override
    public void runAtLocationTimer(Location location, @NotNull Consumer<WrappedTask> consumer, long j, long j2) {
        WrappedTask[] wrappedTaskArr = {wrapTask(this.scheduler.runTaskTimer(this.plugin, () -> {
            consumer.accept(wrappedTaskArr[0]);
        }, j, j2))};
    }

    @Override
    public WrappedTask runAtLocationTimer(Location location, @NotNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return runAtLocationTimer(location, runnable, TimeConverter.toTicks(j, timeUnit), TimeConverter.toTicks(j2, timeUnit));
    }

    @Override
    public void runAtLocationTimer(Location location, @NotNull Consumer<WrappedTask> consumer, long j, long j2, TimeUnit timeUnit) {
        runAtLocationTimer(location, consumer, TimeConverter.toTicks(j, timeUnit), TimeConverter.toTicks(j2, timeUnit));
    }

    @Override
    @NotNull
    public CompletableFuture<EntityTaskResult> runAtEntity(Entity entity, @NotNull Consumer<WrappedTask> consumer) {
        CompletableFuture<EntityTaskResult> completableFuture = new CompletableFuture<>();
        WrappedTask[] wrappedTaskArr = {wrapTask(this.scheduler.runTask(this.plugin, () -> {
            consumer.accept(wrappedTaskArr[0]);
            completableFuture.complete(EntityTaskResult.SUCCESS);
        }))};
        return completableFuture;
    }

    @Override
    @NotNull
    public CompletableFuture<EntityTaskResult> runAtEntityWithFallback(Entity entity, @NotNull Consumer<WrappedTask> consumer, Runnable runnable) {
        CompletableFuture<EntityTaskResult> completableFuture = new CompletableFuture<>();
        WrappedTask[] wrappedTaskArr = {wrapTask(this.scheduler.runTask(this.plugin, () -> {
            if (isValid(entity)) {
                consumer.accept(wrappedTaskArr[0]);
                completableFuture.complete(EntityTaskResult.SUCCESS);
            } else {
                runnable.run();
                completableFuture.complete(EntityTaskResult.ENTITY_RETIRED);
            }
        }))};
        return completableFuture;
    }

    @Override
    public WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, long j) {
        return runAtEntityLater(entity, runnable, (Runnable) null, j);
    }

    @Override
    public WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, @Nullable Runnable runnable2, long j) {
        if (isValid(entity)) {
            return wrapTask(this.scheduler.runTaskLater(this.plugin, runnable, j));
        }
        if (runnable2 == null) {
            return null;
        }
        runnable2.run();
        return null;
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtEntityLater(Entity entity, @NotNull Consumer<WrappedTask> consumer, long j) {
        return runAtEntityLater(entity, consumer, (Runnable) null, j);
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtEntityLater(Entity entity, @NotNull Consumer<WrappedTask> consumer, Runnable runnable, long j) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        if (!isValid(entity) && runnable != null) {
            runnable.run();
            completableFuture.complete(null);
        }
        WrappedTask[] wrappedTaskArr = {wrapTask(this.scheduler.runTaskLater(this.plugin, () -> {
            consumer.accept(wrappedTaskArr[0]);
            completableFuture.complete(null);
        }, j))};
        return completableFuture;
    }

    @Override
    public WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, long j, TimeUnit timeUnit) {
        return runAtEntityLater(entity, runnable, TimeConverter.toTicks(j, timeUnit));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtEntityLater(Entity entity, @NotNull Consumer<WrappedTask> consumer, long j, TimeUnit timeUnit) {
        return runAtEntityLater(entity, consumer, TimeConverter.toTicks(j, timeUnit));
    }

    @Override
    public WrappedTask runAtEntityTimer(Entity entity, @NotNull Runnable runnable, long j, long j2) {
        return runAtEntityTimer(entity, runnable, (Runnable) null, j, j2);
    }

    @Override
    public WrappedTask runAtEntityTimer(Entity entity, @NotNull Runnable runnable, Runnable runnable2, long j, long j2) {
        if (isValid(entity)) {
            return wrapTask(this.scheduler.runTaskTimer(this.plugin, runnable, j, j2));
        }
        if (runnable2 == null) {
            return null;
        }
        runnable2.run();
        return null;
    }

    @Override
    public void runAtEntityTimer(Entity entity, @NotNull Consumer<WrappedTask> consumer, long j, long j2) {
        runAtEntityTimer(entity, consumer, (Runnable) null, j, j2);
    }

    @Override
    public void runAtEntityTimer(Entity entity, @NotNull Consumer<WrappedTask> consumer, Runnable runnable, long j, long j2) {
        if (!isValid(entity) && runnable != null) {
            runnable.run();
        }
        WrappedTask[] wrappedTaskArr = {wrapTask(this.scheduler.runTaskTimer(this.plugin, () -> {
            consumer.accept(wrappedTaskArr[0]);
        }, j, j2))};
    }

    @Override
    public WrappedTask runAtEntityTimer(Entity entity, @NotNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return runAtEntityTimer(entity, runnable, TimeConverter.toTicks(j, timeUnit), TimeConverter.toTicks(j2, timeUnit));
    }

    @Override
    public void runAtEntityTimer(Entity entity, @NotNull Consumer<WrappedTask> consumer, long j, long j2, TimeUnit timeUnit) {
        runAtEntityTimer(entity, consumer, TimeConverter.toTicks(j, timeUnit), TimeConverter.toTicks(j2, timeUnit));
    }

    @Override
    public void cancelTask(WrappedTask wrappedTask) {
        wrappedTask.cancel();
    }

    @Override
    public void cancelAllTasks() {
        this.scheduler.cancelTasks(this.plugin);
    }

    @Override
    public List<WrappedTask> getAllTasks() {
        return (List) this.scheduler.getPendingTasks().stream().filter(bukkitTask -> {
            return bukkitTask.getOwner().equals(this.plugin);
        }).map((v1) -> {
            return wrapTask(v1);
        }).collect(Collectors.toList());
    }

    @Override
    public List<WrappedTask> getAllServerTasks() {
        return (List) this.scheduler.getPendingTasks().stream().map((v1) -> {
            return wrapTask(v1);
        }).collect(Collectors.toList());
    }

    @Override
    public Player getPlayer(String str) {
        return getPlayerFromMainThread(() -> {
            return this.plugin.getServer().getPlayer(str);
        });
    }

    @Override
    public Player getPlayerExact(String str) {
        return getPlayerFromMainThread(() -> {
            return this.plugin.getServer().getPlayerExact(str);
        });
    }

    @Override
    public Player getPlayer(UUID uuid) {
        return getPlayerFromMainThread(() -> {
            return this.plugin.getServer().getPlayer(uuid);
        });
    }

    @Override
    public CompletableFuture<Boolean> teleportAsync(Entity entity, Location location) {
        return teleportAsync(entity, location, PlayerTeleportEvent.TeleportCause.PLUGIN);
    }

    @Override
    public CompletableFuture<Boolean> teleportAsync(Entity entity, Location location, PlayerTeleportEvent.TeleportCause teleportCause) {
        CompletableFuture<Boolean> completableFuture = new CompletableFuture<>();
        runAtEntity(entity, wrappedTask -> {
            if (isValid(entity)) {
                completableFuture.complete(Boolean.valueOf(entity.teleport(location)));
            } else {
                completableFuture.complete(false);
            }
        });
        return completableFuture;
    }

    @Override
    public WrappedTask wrapTask(@NotNull Object obj) {
        Objects.requireNonNull(obj, "nativeTask cannot be null");
        if (obj instanceof BukkitTask) {
            return ImplementationTestsUtil.isCancelledSupported() ? new WrappedBukkitTask((BukkitTask) obj) : new WrappedLegacyBukkitTask((BukkitTask) obj);
        }
        throw new IllegalArgumentException("The nativeTask provided must be a BukkitTask. Got: " + obj.getClass().getName() + " instead.");
    }

    private Player getPlayerFromMainThread(Supplier<Player> supplier) {
        if (this.plugin.getServer().isPrimaryThread()) {
            return supplier.get();
        }
        try {
            BukkitScheduler bukkitScheduler = this.scheduler;
            Plugin plugin = this.plugin;
            Objects.requireNonNull(supplier);
            return (Player) bukkitScheduler.callSyncMethod(plugin, supplier::get).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }

    private boolean isValid(Entity entity) {
        if (!this.options.useIsValidOnNonFolia()) {
            return true;
        }
        return entity.isValid() ? !(entity instanceof Player) || ((Player) entity).isOnline() : (entity instanceof Projectile) && !entity.isDead();
    }
}
