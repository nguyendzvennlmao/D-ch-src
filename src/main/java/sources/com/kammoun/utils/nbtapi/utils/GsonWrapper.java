package com.kammoun.utils.nbtapi.utils;

import com.google.gson.Gson;
import com.kammoun.utils.nbtapi.NbtApiException;

@Deprecated
public class GsonWrapper {
    private static Gson gson = new Gson();

    private GsonWrapper() {
    }

    public static String getString(Object obj) {
        return gson.toJson(obj);
    }

    public static void overwriteGsonInstance(Gson gson2) {
        gson = gson2;
    }

    public static <T> T deserializeJson(String str, Class<T> cls) {
        if (str == null) {
            return null;
        }
        try {
            return cls.cast(gson.fromJson(str, cls));
        } catch (Exception e) {
            throw new NbtApiException("Error while converting json to " + cls.getName(), e);
        }
    }
}
