package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.utils.MinecraftVersion;

public class NbtApiException extends RuntimeException {
    private static final long serialVersionUID = -993309714559452334L;
    public static Boolean confirmedBroken = null;

    public NbtApiException() {
    }

    public NbtApiException(String str, Throwable th) {
        super(generateMessage(str), th);
    }

    public NbtApiException(String str) {
        super(generateMessage(str));
    }

    public NbtApiException(Throwable th) {
        super(generateMessage(th == null ? null : th.toString()), th);
    }

    private static String generateMessage(String str) {
        if (str == null) {
            return null;
        }
        return confirmedBroken == null ? "[?][" + MinecraftVersion.getNBTAPIVersion() + "]" + str : !confirmedBroken.booleanValue() ? "[Selfchecked][" + MinecraftVersion.getNBTAPIVersion() + "]" + str : "[" + MinecraftVersion.getVersion() + "][" + MinecraftVersion.getNBTAPIVersion() + "]There were errors detected during the server self-check! Please, make sure that NBT-API is up to date. Error message: " + str;
    }
}
