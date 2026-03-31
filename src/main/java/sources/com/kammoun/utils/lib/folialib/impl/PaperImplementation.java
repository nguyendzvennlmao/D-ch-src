package com.kammoun.utils.lib.folialib.impl;

import com.kammoun.utils.lib.folialib.FoliaLib;
import com.kammoun.utils.lib.folialib.util.ImplementationTestsUtil;
import java.lang.reflect.Method;
import java.util.concurrent.CompletableFuture;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.player.PlayerTeleportEvent;

public class PaperImplementation extends SpigotImplementation {
    private final FoliaLib foliaLib;
    private Method teleportAsyncMethod;

    public PaperImplementation(FoliaLib foliaLib) {
        super(foliaLib);
        this.foliaLib = foliaLib;
        if (ImplementationTestsUtil.isAsyncTeleportSupported()) {
            try {
                this.teleportAsyncMethod = Entity.class.getMethod("teleportAsync", Location.class, PlayerTeleportEvent.TeleportCause.class);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Failed to initialize PaperImplementation", e);
            }
        }
    }

    @Override
    public CompletableFuture<Boolean> teleportAsync(Entity entity, Location location) {
        return teleportAsync(entity, location, PlayerTeleportEvent.TeleportCause.PLUGIN);
    }

    @Override
    public CompletableFuture<Boolean> teleportAsync(Entity entity, Location location, PlayerTeleportEvent.TeleportCause teleportCause) {
        if (!ImplementationTestsUtil.isAsyncTeleportSupported()) {
            return super.teleportAsync(entity, location, teleportCause);
        }
        try {
            return (CompletableFuture) this.teleportAsyncMethod.invoke(entity, location, teleportCause);
        } catch (Exception e) {
            e.printStackTrace();
            return super.teleportAsync(entity, location, teleportCause);
        }
    }
}
