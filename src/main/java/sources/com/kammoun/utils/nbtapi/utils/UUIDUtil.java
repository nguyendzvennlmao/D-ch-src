package com.kammoun.utils.nbtapi.utils;

import java.util.UUID;

public class UUIDUtil {
    public static UUID uuidFromIntArray(int[] iArr) {
        return new UUID((iArr[0] << 32) | (iArr[1] & 4294967295L), (iArr[2] << 32) | (iArr[3] & 4294967295L));
    }

    public static int[] uuidToIntArray(UUID uuid) {
        return leastMostToIntArray(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    private static int[] leastMostToIntArray(long j, long j2) {
        return new int[]{(int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2};
    }
}
