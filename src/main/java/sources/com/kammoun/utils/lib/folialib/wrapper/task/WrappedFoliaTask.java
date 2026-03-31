package com.kammoun.utils.lib.folialib.wrapper.task;

import io.papermc.paper.threadedregions.scheduler.ScheduledTask;
import org.bukkit.plugin.Plugin;

public class WrappedFoliaTask implements WrappedTask {
    private static final Class<? extends ScheduledTask> ASYNC_TASK_CLASS;
    private final ScheduledTask task;
    private final boolean async;

    public WrappedFoliaTask(ScheduledTask scheduledTask) {
        this.task = scheduledTask;
        if (ASYNC_TASK_CLASS == null) {
            this.async = false;
        } else {
            this.async = ASYNC_TASK_CLASS.isAssignableFrom(scheduledTask.getClass());
        }
    }

    @Override
    public void cancel() {
        this.task.cancel();
    }

    @Override
    public boolean isCancelled() {
        return this.task.isCancelled();
    }

    @Override
    public Plugin getOwningPlugin() {
        return this.task.getOwningPlugin();
    }

    @Override
    public boolean isAsync() {
        return this.async;
    }

    static {
        Class cls = null;
        try {
            cls = Class.forName("io.papermc.paper.threadedregions.scheduler.FoliaAsyncScheduler.AsyncScheduledTask");
        } catch (ClassNotFoundException e) {
        }
        ASYNC_TASK_CLASS = cls;
    }
}
