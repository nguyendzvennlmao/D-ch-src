package com.kammoun.utils.nbtapi.utils;

import com.kammoun.utils.nbtapi.NbtApiException;

public class CheckUtil {
    private CheckUtil() {
    }

    public static void assertAvailable(MinecraftVersion minecraftVersion) {
        if (!MinecraftVersion.isAtLeastVersion(minecraftVersion)) {
            throw new NbtApiException("This Method is only avaliable for the version " + minecraftVersion.name() + " and above!");
        }
    }
}
