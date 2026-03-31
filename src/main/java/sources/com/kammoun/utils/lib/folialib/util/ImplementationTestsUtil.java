package com.kammoun.utils.lib.folialib.util;

import java.util.function.Consumer;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

public class ImplementationTestsUtil {
    private static final boolean IS_CANCELLED_SUPPORTED;
    private static final boolean IS_TASK_CONSUMERS_SUPPORTED;
    private static final boolean IS_ASYNC_TELEPORT_SUPPORTED;

    public static boolean isCancelledSupported() {
        return IS_CANCELLED_SUPPORTED;
    }

    public static boolean isTaskConsumersSupported() {
        return IS_TASK_CONSUMERS_SUPPORTED;
    }

    public static boolean isAsyncTeleportSupported() {
        return IS_ASYNC_TELEPORT_SUPPORTED;
    }

    static {
        boolean z = false;
        try {
            BukkitTask.class.getDeclaredMethod("isCancelled", new Class[0]);
            z = true;
        } catch (NoSuchMethodException e) {
        }
        IS_CANCELLED_SUPPORTED = z;
        boolean z2 = false;
        try {
            BukkitScheduler.class.getDeclaredMethod("runTask", Plugin.class, Consumer.class);
            z2 = true;
        } catch (NoSuchMethodException e2) {
        }
        IS_TASK_CONSUMERS_SUPPORTED = z2;
        boolean z3 = false;
        try {
            Entity.class.getDeclaredMethod("teleportAsync", Location.class, PlayerTeleportEvent.TeleportCause.class);
            z3 = true;
        } catch (NoSuchMethodException e3) {
        }
        IS_ASYNC_TELEPORT_SUPPORTED = z3;
    }
}
