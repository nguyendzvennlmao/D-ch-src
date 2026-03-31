package com.kammoun.utils.lib.folialib.util;

import java.util.concurrent.TimeUnit;

public class TimeConverter {
    public static long toTicks(long j, TimeUnit timeUnit) {
        return timeUnit.toMillis(j) / 50;
    }

    public static long toMillis(long j) {
        return j * 50;
    }
}
