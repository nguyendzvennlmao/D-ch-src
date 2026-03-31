package com.kammoun.utils.nbtapi.utils.metrics.bukkit;

import com.kammoun.utils.nbtapi.utils.metrics.MetricsBase;
import com.kammoun.utils.nbtapi.utils.metrics.charts.CustomChart;
import com.kammoun.utils.nbtapi.utils.metrics.json.JsonObjectBuilder;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.logging.Level;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Metrics {
    private final Plugin plugin;
    private final MetricsBase metricsBase;

    public Metrics(Plugin plugin, int i) {
        this.plugin = plugin;
        File file = new File(new File(plugin.getDataFolder().getParentFile(), "bStats"), "config.yml");
        YamlConfiguration loadConfiguration = YamlConfiguration.loadConfiguration(file);
        if (!loadConfiguration.isSet("serverUuid")) {
            loadConfiguration.addDefault("enabled", true);
            loadConfiguration.addDefault("serverUuid", UUID.randomUUID().toString());
            loadConfiguration.addDefault("logFailedRequests", false);
            loadConfiguration.addDefault("logSentData", false);
            loadConfiguration.addDefault("logResponseStatusText", false);
            loadConfiguration.options().header("bStats (https://bStats.org) collects some basic information for plugin authors, like how\nmany people use their plugin and their total player count. It's recommended to keep bStats\nenabled, but if you're not comfortable with this, you can turn this setting off. There is no\nperformance penalty associated with having metrics enabled, and data sent to bStats is fully\nanonymous.").copyDefaults(true);
            try {
                loadConfiguration.save(file);
            } catch (IOException e) {
            }
        }
        boolean z = loadConfiguration.getBoolean("enabled", true);
        String string = loadConfiguration.getString("serverUuid");
        boolean z2 = loadConfiguration.getBoolean("logFailedRequests", false);
        boolean z3 = loadConfiguration.getBoolean("logSentData", false);
        boolean z4 = loadConfiguration.getBoolean("logResponseStatusText", false);
        boolean z5 = false;
        try {
            z5 = Class.forName("io.papermc.paper.threadedregions.RegionizedServer") != null;
        } catch (Exception e2) {
        }
        Consumer consumer = this::appendPlatformData;
        Consumer consumer2 = this::appendServiceData;
        Consumer consumer3 = z5 ? null : runnable -> {
            Bukkit.getScheduler().runTask(plugin, runnable);
        };
        Objects.requireNonNull(plugin);
        this.metricsBase = new MetricsBase("bukkit", string, i, z, consumer, consumer2, consumer3, plugin::isEnabled, (str, th) -> {
            this.plugin.getLogger().log(Level.WARNING, str, th);
        }, str2 -> {
            this.plugin.getLogger().log(Level.INFO, str2);
        }, z2, z3, z4, false);
    }

    public void shutdown() {
        this.metricsBase.shutdown();
    }

    public void addCustomChart(CustomChart customChart) {
        this.metricsBase.addCustomChart(customChart);
    }

    private void appendPlatformData(JsonObjectBuilder jsonObjectBuilder) {
        jsonObjectBuilder.appendField("playerAmount", getPlayerAmount());
        jsonObjectBuilder.appendField("onlineMode", Bukkit.getOnlineMode() ? 1 : 0);
        jsonObjectBuilder.appendField("bukkitVersion", Bukkit.getVersion());
        jsonObjectBuilder.appendField("bukkitName", Bukkit.getName());
        jsonObjectBuilder.appendField("javaVersion", System.getProperty("java.version"));
        jsonObjectBuilder.appendField("osName", System.getProperty("os.name"));
        jsonObjectBuilder.appendField("osArch", System.getProperty("os.arch"));
        jsonObjectBuilder.appendField("osVersion", System.getProperty("os.version"));
        jsonObjectBuilder.appendField("coreCount", Runtime.getRuntime().availableProcessors());
    }

    private void appendServiceData(JsonObjectBuilder jsonObjectBuilder) {
        jsonObjectBuilder.appendField("pluginVersion", this.plugin.getDescription().getVersion());
    }

    private int getPlayerAmount() {
        try {
            Method method = Class.forName("org.bukkit.Server").getMethod("getOnlinePlayers", new Class[0]);
            return method.getReturnType().equals(Collection.class) ? ((Collection) method.invoke(Bukkit.getServer(), new Object[0])).size() : ((Player[]) method.invoke(Bukkit.getServer(), new Object[0])).length;
        } catch (Exception e) {
            return Bukkit.getOnlinePlayers().size();
        }
    }
}
