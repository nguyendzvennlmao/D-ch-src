package com.kammoun.utils.nbtapi.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kammoun.utils.nbtapi.NBTItem;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import org.bukkit.configuration.file.YamlConfiguration;

public class VersionChecker {
    private static final String USER_AGENT = "nbt-api Version check";
    private static final String REQUEST_URL = "https://api.spiget.org/v2/resources/7939/versions?size=100";
    public static boolean hideOk = false;

    public static void checkForUpdates() throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(REQUEST_URL).openConnection();
        httpURLConnection.addRequestProperty("User-Agent", USER_AGENT);
        JsonArray parse = new JsonParser().parse(new InputStreamReader(httpURLConnection.getInputStream()));
        if (!parse.isJsonArray()) {
            MinecraftVersion.getLogger().log(Level.WARNING, "[NBTAPI] Error when looking for Updates! Got non Json Array: '" + parse.toString() + "'");
            return;
        }
        JsonArray jsonArray = parse;
        JsonObject jsonObject = jsonArray.get(jsonArray.size() - 1);
        int versionDifference = getVersionDifference(jsonObject.get("name").getAsString());
        if (versionDifference == -1) {
            MinecraftVersion.getLogger().log(Level.WARNING, "[NBTAPI] The NBT-API in '" + getPlugin() + "' seems to be outdated!");
            MinecraftVersion.getLogger().log(Level.WARNING, "[NBTAPI] Current Version: '2.15.5' Newest Version: " + jsonObject.get("name").getAsString() + "'");
            MinecraftVersion.getLogger().log(Level.WARNING, "[NBTAPI] Please update the NBTAPI or the plugin that contains the api(nag the mod author when the newest release has an old version, not the NBTAPI dev)!");
        } else if (versionDifference == 0) {
            if (hideOk) {
                return;
            }
            MinecraftVersion.getLogger().log(Level.INFO, "[NBTAPI] The NBT-API seems to be up-to-date!");
        } else if (versionDifference == 1) {
            MinecraftVersion.getLogger().log(Level.INFO, "[NBTAPI] The NBT-API in '" + getPlugin() + "' seems to be a future Version, not yet released on Spigot/CurseForge! This is not an error!");
            MinecraftVersion.getLogger().log(Level.INFO, "[NBTAPI] Current Version: '2.15.5' Newest Version: " + jsonObject.get("name").getAsString() + "'");
        }
    }

    private static int getVersionDifference(String str) {
        if ("2.15.5".equals(str)) {
            return 0;
        }
        if ("2.15.5".split("\\.").length != 3 || str.split("\\.").length != 3) {
            return -1;
        }
        int parseInt = Integer.parseInt("2.15.5".split("\\.")[0]);
        int parseInt2 = Integer.parseInt("2.15.5".split("\\.")[1]);
        String str2 = "2.15.5".split("\\.")[2];
        int parseInt3 = Integer.parseInt(str.split("\\.")[0]);
        int parseInt4 = Integer.parseInt(str.split("\\.")[1]);
        String str3 = str.split("\\.")[2];
        if (parseInt < parseInt3) {
            return -1;
        }
        if (parseInt > parseInt3) {
            return 1;
        }
        if (parseInt2 < parseInt4) {
            return -1;
        }
        if (parseInt2 > parseInt4) {
            return 1;
        }
        int parseInt5 = Integer.parseInt(str2.split("-")[0]);
        int parseInt6 = Integer.parseInt(str3.split("-")[0]);
        if (parseInt5 < parseInt6) {
            return -1;
        }
        if (parseInt5 > parseInt6) {
            return 1;
        }
        if (str3.contains("-") || !str2.contains("-")) {
            return (str3.contains("-") && str2.contains("-")) ? 0 : 1;
        }
        return -1;
    }

    public static String getPlugin() {
        InputStreamReader inputStreamReader;
        ClassLoader classLoader = VersionChecker.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("paper-plugin.yml");
        if (resourceAsStream != null) {
            try {
                inputStreamReader = new InputStreamReader(resourceAsStream);
                try {
                    String string = YamlConfiguration.loadConfiguration(inputStreamReader).getString("name");
                    inputStreamReader.close();
                    return string;
                } finally {
                }
            } catch (IOException e) {
            } catch (IllegalArgumentException e2) {
                MinecraftVersion.getLogger().log(Level.WARNING, "[NBTAPI] Error reading paper-plugin.yml: " + e2.getMessage());
            }
        }
        InputStream resourceAsStream2 = classLoader.getResourceAsStream("plugin.yml");
        if (resourceAsStream2 != null) {
            try {
                inputStreamReader = new InputStreamReader(resourceAsStream2);
                try {
                    String string2 = YamlConfiguration.loadConfiguration(inputStreamReader).getString("name");
                    inputStreamReader.close();
                    return string2;
                } finally {
                }
            } catch (IOException e3) {
            } catch (IllegalArgumentException e4) {
                MinecraftVersion.getLogger().log(Level.WARNING, "[NBTAPI] Error reading plugin.yml: " + e4.getMessage());
            }
        }
        return NBTItem.class.getPackage().getName();
    }

    public static String getPluginforBStats() {
        InputStreamReader inputStreamReader;
        ClassLoader classLoader = VersionChecker.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("paper-plugin.yml");
        if (resourceAsStream != null) {
            try {
                inputStreamReader = new InputStreamReader(resourceAsStream);
                try {
                    String string = YamlConfiguration.loadConfiguration(inputStreamReader).getString("name");
                    inputStreamReader.close();
                    return string;
                } finally {
                }
            } catch (IOException e) {
            } catch (IllegalArgumentException e2) {
                MinecraftVersion.getLogger().log(Level.WARNING, "[NBTAPI] Error reading paper-plugin.yml: " + e2.getMessage());
            }
        }
        InputStream resourceAsStream2 = classLoader.getResourceAsStream("plugin.yml");
        if (resourceAsStream2 == null) {
            return "UnknownPlugin";
        }
        try {
            inputStreamReader = new InputStreamReader(resourceAsStream2);
            try {
                String string2 = YamlConfiguration.loadConfiguration(inputStreamReader).getString("name");
                inputStreamReader.close();
                return string2;
            } finally {
            }
        } catch (IOException e3) {
            return "UnknownPlugin";
        } catch (IllegalArgumentException e4) {
            MinecraftVersion.getLogger().log(Level.WARNING, "[NBTAPI] Error reading plugin.yml: " + e4.getMessage());
            return "UnknownPlugin";
        }
    }

    public static String getPluginType() {
        ClassLoader classLoader = VersionChecker.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("paper-plugin.yml");
        if (resourceAsStream != null) {
            try {
                resourceAsStream.close();
                return "PaperPlugin";
            } catch (IOException e) {
                return "PaperPlugin";
            }
        }
        InputStream resourceAsStream2 = classLoader.getResourceAsStream("plugin.yml");
        if (resourceAsStream2 == null) {
            return "UnknownPlugin";
        }
        try {
            resourceAsStream2.close();
            return "SpigotPlugin";
        } catch (IOException e2) {
            return "SpigotPlugin";
        }
    }
}
