package com.kammoun.utils.lib.folialib.impl;

import com.kammoun.utils.lib.folialib.FoliaLib;
import com.kammoun.utils.lib.folialib.enums.EntityTaskResult;
import com.kammoun.utils.lib.folialib.type.Ref;
import com.kammoun.utils.lib.folialib.util.FoliaLibOptions;
import com.kammoun.utils.lib.folialib.util.TimeConverter;
import com.kammoun.utils.lib.folialib.wrapper.task.WrappedBukkitTask;
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

public class SpigotImplementation implements PlatformScheduler {
    private final FoliaLib foliaLib;
    private final FoliaLibOptions options;
    private final Plugin plugin;

    @NotNull
    private final BukkitScheduler scheduler;

    public SpigotImplementation(FoliaLib foliaLib) {
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
        this.scheduler.runTask(this.plugin, bukkitTask -> {
            consumer.accept(wrapTask(bukkitTask));
            completableFuture.complete(null);
        });
        return completableFuture;
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAsync(@NotNull Consumer<WrappedTask> consumer) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        this.scheduler.runTaskAsynchronously(this.plugin, bukkitTask -> {
            consumer.accept(wrapTask(bukkitTask));
            completableFuture.complete(null);
        });
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
        this.scheduler.runTaskLater(this.plugin, bukkitTask -> {
            consumer.accept(wrapTask(bukkitTask));
            completableFuture.complete(null);
        }, j);
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
        this.scheduler.runTaskLaterAsynchronously(this.plugin, bukkitTask -> {
            consumer.accept(wrapTask(bukkitTask));
            completableFuture.complete(null);
        }, j);
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
        this.scheduler.runTaskTimer(this.plugin, bukkitTask -> {
            consumer.accept(wrapTask(bukkitTask));
        }, j, j2);
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
        this.scheduler.runTaskTimerAsynchronously(this.plugin, bukkitTask -> {
            consumer.accept(wrapTask(bukkitTask));
        }, j, j2);
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
        return runLater(runnable, j);
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtLocationLater(Location location, @NotNull Consumer<WrappedTask> consumer, long j) {
        return runLater(consumer, j);
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
        return runTimer(runnable, j, j2);
    }

    @Override
    public void runAtLocationTimer(Location location, @NotNull Consumer<WrappedTask> consumer, long j, long j2) {
        runTimer(consumer, j, j2);
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
        runNextTick(wrappedTask -> {
            consumer.accept(wrappedTask);
            completableFuture.complete(EntityTaskResult.SUCCESS);
        });
        return completableFuture;
    }

    @Override
    @NotNull
    public CompletableFuture<EntityTaskResult> runAtEntityWithFallback(Entity entity, @NotNull Consumer<WrappedTask> consumer, Runnable runnable) {
        CompletableFuture<EntityTaskResult> completableFuture = new CompletableFuture<>();
        runNextTick(wrappedTask -> {
            if (isValid(entity)) {
                consumer.accept(wrappedTask);
                completableFuture.complete(EntityTaskResult.SUCCESS);
            } else {
                runnable.run();
                completableFuture.complete(EntityTaskResult.ENTITY_RETIRED);
            }
        });
        return completableFuture;
    }

    @Override
    public WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, long j) {
        return runAtEntityLater(entity, runnable, (Runnable) null, j);
    }

    @Override
    public WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, Runnable runnable2, long j) {
        if (isValid(entity)) {
            return runLater(runnable, j);
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
    public CompletableFuture<Void> runAtEntityLater(Entity entity, @NotNull Consumer<WrappedTask> consumer, @Nullable Runnable runnable, long j) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        if (isValid(entity)) {
            runLater(wrappedTask -> {
                if (isValid(entity)) {
                    consumer.accept(wrappedTask);
                    completableFuture.complete(null);
                } else {
                    if (runnable != null) {
                        runnable.run();
                    }
                    completableFuture.complete(null);
                }
            }, j);
            return completableFuture;
        }
        completableFuture.complete(null);
        if (runnable != null) {
            runnable.run();
        }
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
    public WrappedTask runAtEntityTimer(Entity entity, @NotNull Runnable runnable, @Nullable Runnable runnable2, long j, long j2) {
        if (isValid(entity)) {
            Ref ref = new Ref();
            WrappedTask runTimer = runTimer(() -> {
                WrappedTask wrappedTask = (WrappedTask) ref.get();
                if (wrappedTask == null || isValid(entity)) {
                    runnable.run();
                    return;
                }
                wrappedTask.cancel();
                if (runnable2 != null) {
                    runnable2.run();
                }
            }, j, j2);
            ref.set(runTimer);
            return runTimer;
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
        if (isValid(entity)) {
            runTimer(wrappedTask -> {
                if (isValid(entity)) {
                    consumer.accept(wrappedTask);
                } else if (runnable != null) {
                    runnable.run();
                }
            }, j, j2);
        } else if (runnable != null) {
            runnable.run();
        }
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
            return new WrappedBukkitTask((BukkitTask) obj);
        }
        throw new IllegalArgumentException("The nativeTask provided must be a BukkitTask. Got: " + obj.getClass().getName() + " instead.");
    }

    private boolean isValid(Entity entity) {
        if (!this.options.useIsValidOnNonFolia()) {
            return true;
        }
        return entity.isValid() ? !(entity instanceof Player) || ((Player) entity).isOnline() : (entity instanceof Projectile) && !entity.isDead();
    }
}
