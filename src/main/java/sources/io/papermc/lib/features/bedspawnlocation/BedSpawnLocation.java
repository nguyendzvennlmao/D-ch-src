package io.papermc.lib.features.bedspawnlocation;

import java.util.concurrent.CompletableFuture;
import org.bukkit.entity.Player;

public interface BedSpawnLocation {
    CompletableFuture getBedSpawnLocationAsync(Player player, boolean z, int i);
}
