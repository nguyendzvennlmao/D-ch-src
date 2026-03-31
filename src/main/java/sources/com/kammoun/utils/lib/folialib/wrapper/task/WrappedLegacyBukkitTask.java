package com.kammoun.utils.lib.folialib.wrapper.task;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

public class WrappedLegacyBukkitTask implements WrappedTask {
    private final BukkitTask task;

    public WrappedLegacyBukkitTask(BukkitTask bukkitTask) {
        this.task = bukkitTask;
    }

    @Override
    public void cancel() {
        this.task.cancel();
    }

    @Override
    public boolean isCancelled() {
        int taskId = this.task.getTaskId();
        BukkitScheduler scheduler = Bukkit.getScheduler();
        return (scheduler.isCurrentlyRunning(taskId) || scheduler.isQueued(taskId)) ? false : true;
    }

    @Override
    public Plugin getOwningPlugin() {
        return this.task.getOwner();
    }

    @Override
    public boolean isAsync() {
        return !this.task.isSync();
    }
}
