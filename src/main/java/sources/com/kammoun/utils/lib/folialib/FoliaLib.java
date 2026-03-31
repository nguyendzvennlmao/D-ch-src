package com.kammoun.utils.lib.folialib;

import com.kammoun.utils.lib.folialib.enums.ImplementationType;
import com.kammoun.utils.lib.folialib.impl.PlatformScheduler;
import com.kammoun.utils.lib.folialib.util.FoliaLibOptions;
import com.kammoun.utils.lib.folialib.util.InvalidTickDelayNotifier;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;
import org.bukkit.plugin.Plugin;

public class FoliaLib {
    private final Plugin plugin;
    private final ImplementationType implementationType;
    private final PlatformScheduler scheduler;
    private FoliaLibOptions options;
    private InvalidTickDelayNotifier invalidTickDelayNotifier;

    public FoliaLib(Plugin plugin) {
        this(plugin, new FoliaLibOptions());
    }

    public FoliaLib(Plugin plugin, FoliaLibOptions foliaLibOptions) {
        this.plugin = plugin;
        this.options = foliaLibOptions;
        this.invalidTickDelayNotifier = new InvalidTickDelayNotifier(plugin.getLogger(), this.options);
        ImplementationType implementationType = ImplementationType.UNKNOWN;
        ImplementationType[] values = ImplementationType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            ImplementationType implementationType2 = values[i];
            if (implementationType2.selfCheck()) {
                implementationType = implementationType2;
                break;
            }
            i++;
        }
        this.implementationType = implementationType;
        this.scheduler = createServerImpl(this.implementationType.getImplementationClassName());
        if (this.scheduler == null) {
            throw new IllegalStateException("Failed to create server implementation. Please report this to the FoliaLib GitHub issues page. Forks of server software may not all be supported. If you are using an unofficial fork, please report this to the fork's developers first.");
        }
        if (getClass().getName().startsWith("com,tcoded,folialib,".replace(",", "."))) {
            Logger logger = this.plugin.getLogger();
            logger.severe("****************************************************************");
            logger.severe("FoliaLib is not relocated correctly! This will cause conflicts");
            logger.severe("with other plugins using FoliaLib. Please contact the developers");
            logger.severe(String.format("of '%s' and inform them of this issue immediately!", this.plugin.getDescription().getName()));
            logger.severe("****************************************************************");
        }
    }

    public ImplementationType getImplType() {
        return this.implementationType;
    }

    @Deprecated
    public PlatformScheduler getImpl() {
        return getScheduler();
    }

    public PlatformScheduler getScheduler() {
        return this.scheduler;
    }

    public boolean isFolia() {
        return this.implementationType == ImplementationType.FOLIA;
    }

    public boolean isPaper() {
        return this.implementationType == ImplementationType.PAPER || this.implementationType == ImplementationType.LEGACY_PAPER;
    }

    public boolean isSpigot() {
        return this.implementationType == ImplementationType.SPIGOT || this.implementationType == ImplementationType.LEGACY_SPIGOT;
    }

    public boolean isUnsupported() {
        return this.implementationType == ImplementationType.UNKNOWN;
    }

    public Plugin getPlugin() {
        return this.plugin;
    }

    @Deprecated
    public void disableInvalidTickValueWarning() {
        getOptions().disableNotifications();
    }

    @Deprecated
    public void enableInvalidTickValueDebug() {
        getOptions().enableInvalidTickDebugMode();
    }

    public FoliaLibOptions getOptions() {
        return this.options;
    }

    @Deprecated
    public InvalidTickDelayNotifier getInvalidTickDelayNotifier() {
        return this.invalidTickDelayNotifier;
    }

    private PlatformScheduler createServerImpl(String str) {
        try {
            return (PlatformScheduler) Class.forName((getClass().getPackage().getName() + ".impl.") + str).getConstructor(getClass()).newInstance(this);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
