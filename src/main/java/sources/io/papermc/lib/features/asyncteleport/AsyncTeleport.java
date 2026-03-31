package io.papermc.lib.features.asyncteleport;

import java.util.concurrent.CompletableFuture;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.player.PlayerTeleportEvent;

public interface AsyncTeleport {
    CompletableFuture teleportAsync(Entity entity, Location location, PlayerTeleportEvent.TeleportCause teleportCause, int i);
}
