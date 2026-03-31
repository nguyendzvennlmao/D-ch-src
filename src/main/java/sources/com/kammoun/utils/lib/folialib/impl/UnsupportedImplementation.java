package com.kammoun.utils.lib.folialib.impl;

import com.kammoun.utils.lib.folialib.FoliaLib;
import org.bukkit.plugin.Plugin;

public class UnsupportedImplementation extends LegacySpigotImplementation {
    public UnsupportedImplementation(FoliaLib foliaLib) {
        super(foliaLib);
        Plugin plugin = foliaLib.getPlugin();
        plugin.getLogger().warning(String.format("\n---------------------------------------------------------------------\nFoliaLib does not support this server software! (%s)\nFoliaLib will attempt to use the legacy spigot implementation.\n---------------------------------------------------------------------\n", plugin.getServer().getVersion()));
    }
}
