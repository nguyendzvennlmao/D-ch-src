package com.kammoun.utils.lib.folialib.impl;

import com.kammoun.utils.lib.folialib.FoliaLib;
import com.kammoun.utils.lib.folialib.enums.EntityTaskResult;
import com.kammoun.utils.lib.folialib.util.InvalidTickDelayNotifier;
import com.kammoun.utils.lib.folialib.util.TimeConverter;
import com.kammoun.utils.lib.folialib.wrapper.task.WrappedFoliaTask;
import com.kammoun.utils.lib.folialib.wrapper.task.WrappedTask;
import io.papermc.paper.threadedregions.scheduler.AsyncScheduler;
import io.papermc.paper.threadedregions.scheduler.GlobalRegionScheduler;
import io.papermc.paper.threadedregions.scheduler.RegionScheduler;
import io.papermc.paper.threadedregions.scheduler.ScheduledTask;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public class FoliaImplementation implements PlatformScheduler {
    private final FoliaLib foliaLib;
    private final Plugin plugin;
    private final GlobalRegionScheduler globalRegionScheduler;
    private final RegionScheduler regionScheduler;
    private final AsyncScheduler asyncScheduler;
    private final InvalidTickDelayNotifier tickNotifier;

    public FoliaImplementation(FoliaLib foliaLib) {
        this.foliaLib = foliaLib;
        this.plugin = foliaLib.getPlugin();
        this.globalRegionScheduler = this.plugin.getServer().getGlobalRegionScheduler();
        this.regionScheduler = this.plugin.getServer().getRegionScheduler();
        this.asyncScheduler = this.plugin.getServer().getAsyncScheduler();
        this.tickNotifier = this.foliaLib.getInvalidTickDelayNotifier();
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Location location) {
        return this.plugin.getServer().isOwnedByCurrentRegion(location);
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Location location, int i) {
        return this.plugin.getServer().isOwnedByCurrentRegion(location, i);
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Block block) {
        return this.plugin.getServer().isOwnedByCurrentRegion(block);
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull World world, int i, int i2) {
        return this.plugin.getServer().isOwnedByCurrentRegion(world, i, i2);
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull World world, int i, int i2, int i3) {
        return this.plugin.getServer().isOwnedByCurrentRegion(world, i, i2, i3);
    }

    @Override
    public boolean isOwnedByCurrentRegion(@NotNull Entity entity) {
        return this.plugin.getServer().isOwnedByCurrentRegion(entity);
    }

    @Override
    public boolean isGlobalTickThread() {
        return this.plugin.getServer().isGlobalTickThread();
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runNextTick(@NotNull Consumer<WrappedTask> consumer) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        this.globalRegionScheduler.run(this.plugin, scheduledTask -> {
            consumer.accept(wrapTask(scheduledTask));
            completableFuture.complete(null);
        });
        return completableFuture;
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAsync(@NotNull Consumer<WrappedTask> consumer) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        this.asyncScheduler.runNow(this.plugin, scheduledTask -> {
            consumer.accept(wrapTask(scheduledTask));
            completableFuture.complete(null);
        });
        return completableFuture;
    }

    @Override
    public WrappedTask runLater(@NotNull Runnable runnable, long j) {
        return wrapTask(this.globalRegionScheduler.runDelayed(this.plugin, scheduledTask -> {
            runnable.run();
        }, ensureValidDuration(j)));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runLater(@NotNull Consumer<WrappedTask> consumer, long j) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        this.globalRegionScheduler.runDelayed(this.plugin, scheduledTask -> {
            consumer.accept(wrapTask(scheduledTask));
            completableFuture.complete(null);
        }, ensureValidDuration(j));
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
        return runLaterAsync(runnable, TimeConverter.toMillis(j), TimeUnit.MILLISECONDS);
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runLaterAsync(@NotNull Consumer<WrappedTask> consumer, long j) {
        return runLaterAsync(consumer, TimeConverter.toMillis(j), TimeUnit.MILLISECONDS);
    }

    @Override
    public WrappedTask runLaterAsync(@NotNull Runnable runnable, long j, TimeUnit timeUnit) {
        return wrapTask(this.asyncScheduler.runDelayed(this.plugin, scheduledTask -> {
            runnable.run();
        }, j, timeUnit));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runLaterAsync(@NotNull Consumer<WrappedTask> consumer, long j, TimeUnit timeUnit) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        this.asyncScheduler.runDelayed(this.plugin, scheduledTask -> {
            consumer.accept(wrapTask(scheduledTask));
            completableFuture.complete(null);
        }, j, timeUnit);
        return completableFuture;
    }

    @Override
    public WrappedTask runTimer(@NotNull Runnable runnable, long j, long j2) {
        return wrapTask(this.globalRegionScheduler.runAtFixedRate(this.plugin, scheduledTask -> {
            runnable.run();
        }, ensureValidDuration(j), ensureValidDuration(j2)));
    }

    @Override
    public void runTimer(@NotNull Consumer<WrappedTask> consumer, long j, long j2) {
        this.globalRegionScheduler.runAtFixedRate(this.plugin, scheduledTask -> {
            consumer.accept(wrapTask(scheduledTask));
        }, ensureValidDuration(j), ensureValidDuration(j2));
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
        return runTimerAsync(runnable, TimeConverter.toMillis(j), TimeConverter.toMillis(j2), TimeUnit.MILLISECONDS);
    }

    @Override
    public void runTimerAsync(@NotNull Consumer<WrappedTask> consumer, long j, long j2) {
        runTimerAsync(consumer, TimeConverter.toMillis(j), TimeConverter.toMillis(j2), TimeUnit.MILLISECONDS);
    }

    @Override
    public WrappedTask runTimerAsync(@NotNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return wrapTask(this.asyncScheduler.runAtFixedRate(this.plugin, scheduledTask -> {
            runnable.run();
        }, j, j2, timeUnit));
    }

    @Override
    public void runTimerAsync(@NotNull Consumer<WrappedTask> consumer, long j, long j2, TimeUnit timeUnit) {
        this.asyncScheduler.runAtFixedRate(this.plugin, scheduledTask -> {
            consumer.accept(wrapTask(scheduledTask));
        }, j, j2, timeUnit);
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtLocation(Location location, @NotNull Consumer<WrappedTask> consumer) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        this.regionScheduler.run(this.plugin, location, scheduledTask -> {
            consumer.accept(wrapTask(scheduledTask));
            completableFuture.complete(null);
        });
        return completableFuture;
    }

    @Override
    public WrappedTask runAtLocationLater(Location location, @NotNull Runnable runnable, long j) {
        return wrapTask(this.regionScheduler.runDelayed(this.plugin, location, scheduledTask -> {
            runnable.run();
        }, ensureValidDuration(j)));
    }

    @Override
    @NotNull
    public CompletableFuture<Void> runAtLocationLater(Location location, @NotNull Consumer<WrappedTask> consumer, long j) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        this.regionScheduler.runDelayed(this.plugin, location, scheduledTask -> {
            consumer.accept(wrapTask(scheduledTask));
            completableFuture.complete(null);
        }, ensureValidDuration(j));
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
        return wrapTask(this.regionScheduler.runAtFixedRate(this.plugin, location, scheduledTask -> {
            runnable.run();
        }, ensureValidDuration(j), ensureValidDuration(j2)));
    }

    @Override
    public void runAtLocationTimer(Location location, @NotNull Consumer<WrappedTask> consumer, long j, long j2) {
        this.regionScheduler.runAtFixedRate(this.plugin, location, scheduledTask -> {
            consumer.accept(wrapTask(scheduledTask));
        }, ensureValidDuration(j), ensureValidDuration(j2));
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
        if (entity.getScheduler().run(this.plugin, scheduledTask -> {
            consumer.accept(wrapTask(scheduledTask));
            completableFuture.complete(EntityTaskResult.SUCCESS);
        }, (Runnable) null) == null) {
            completableFuture.complete(EntityTaskResult.SCHEDULER_RETIRED);
        }
        return completableFuture;
    }

    @Override
    @NotNull
    public CompletableFuture<EntityTaskResult> runAtEntityWithFallback(Entity entity, @NotNull Consumer<WrappedTask> consumer, Runnable runnable) {
        CompletableFuture<EntityTaskResult> completableFuture = new CompletableFuture<>();
        if (entity.getScheduler().run(this.plugin, scheduledTask -> {
            consumer.accept(wrapTask(scheduledTask));
            completableFuture.complete(EntityTaskResult.SUCCESS);
        }, () -> {
            runnable.run();
            completableFuture.complete(EntityTaskResult.ENTITY_RETIRED);
        }) == null) {
            completableFuture.complete(EntityTaskResult.SCHEDULER_RETIRED);
        }
        return completableFuture;
    }

    @Override
    public WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, long j) {
        return runAtEntityLater(entity, runnable, (Runnable) null, j);
    }

    @Override
    public WrappedTask runAtEntityLater(Entity entity, @NotNull Runnable runnable, Runnable runnable2, long j) {
        return wrapTask(entity.getScheduler().runDelayed(this.plugin, scheduledTask -> {
            runnable.run();
        }, runnable2, ensureValidDuration(j)));
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
        if (runnable != null) {
            runnable = () -> {
                runnable.run();
                completableFuture.complete(null);
            };
        }
        entity.getScheduler().runDelayed(this.plugin, scheduledTask -> {
            consumer.accept(wrapTask(scheduledTask));
            completableFuture.complete(null);
        }, runnable, ensureValidDuration(j));
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
        return wrapTask(entity.getScheduler().runAtFixedRate(this.plugin, scheduledTask -> {
            runnable.run();
        }, runnable2, ensureValidDuration(j), ensureValidDuration(j2)));
    }

    @Override
    public void runAtEntityTimer(Entity entity, @NotNull Consumer<WrappedTask> consumer, long j, long j2) {
        runAtEntityTimer(entity, consumer, (Runnable) null, j, j2);
    }

    @Override
    public void runAtEntityTimer(Entity entity, @NotNull Consumer<WrappedTask> consumer, Runnable runnable, long j, long j2) {
        entity.getScheduler().runAtFixedRate(this.plugin, scheduledTask -> {
            consumer.accept(wrapTask(scheduledTask));
        }, runnable, ensureValidDuration(j), ensureValidDuration(j2));
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
        this.globalRegionScheduler.cancelTasks(this.plugin);
        this.asyncScheduler.cancelTasks(this.plugin);
    }

    @Override
    public List<WrappedTask> getAllTasks() {
        try {
            return (List) getAllScheduledTasks().stream().filter(scheduledTask -> {
                return scheduledTask.getOwningPlugin().equals(this.plugin);
            }).map((v1) -> {
                return wrapTask(v1);
            }).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<WrappedTask> getAllServerTasks() {
        try {
            return (List) getAllScheduledTasks().stream().map((v1) -> {
                return wrapTask(v1);
            }).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @NotNull
    private List<ScheduledTask> getAllScheduledTasks() throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = this.globalRegionScheduler.getClass().getDeclaredField("tasksByDeadline");
        boolean isAccessible = declaredField.isAccessible();
        declaredField.setAccessible(true);
        Long2ObjectOpenHashMap long2ObjectOpenHashMap = (Long2ObjectOpenHashMap) declaredField.get(this.globalRegionScheduler);
        declaredField.setAccessible(isAccessible);
        Field declaredField2 = this.asyncScheduler.getClass().getDeclaredField("tasks");
        boolean isAccessible2 = declaredField2.isAccessible();
        declaredField2.setAccessible(true);
        Set set = (Set) declaredField2.get(this.asyncScheduler);
        declaredField2.setAccessible(isAccessible2);
        ArrayList arrayList = new ArrayList();
        ObjectIterator it = long2ObjectOpenHashMap.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll((List) it.next());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() + set.size());
        arrayList2.addAll(arrayList);
        arrayList2.addAll(set);
        return arrayList2;
    }

    @Override
    public Player getPlayer(String str) {
        return this.plugin.getServer().getPlayer(str);
    }

    @Override
    public Player getPlayerExact(String str) {
        return this.plugin.getServer().getPlayerExact(str);
    }

    @Override
    public Player getPlayer(UUID uuid) {
        return this.plugin.getServer().getPlayer(uuid);
    }

    @Override
    public CompletableFuture<Boolean> teleportAsync(Entity entity, Location location) {
        return entity.teleportAsync(location);
    }

    @Override
    public CompletableFuture<Boolean> teleportAsync(Entity entity, Location location, PlayerTeleportEvent.TeleportCause teleportCause) {
        return entity.teleportAsync(location, teleportCause);
    }

    @Override
    public WrappedTask wrapTask(@NotNull Object obj) {
        Objects.requireNonNull(obj, "nativeTask");
        if (obj instanceof ScheduledTask) {
            return new WrappedFoliaTask((ScheduledTask) obj);
        }
        throw new IllegalArgumentException("The nativeTask provided must be a ScheduledTask. Got: " + obj.getClass().getName() + " instead.");
    }

    private long ensureValidDuration(long j) {
        if (j > 0) {
            return j;
        }
        this.tickNotifier.notifyOnce(j);
        return 1L;
    }
}
