package com.kammoun.donutCore.crates.tasks;

import com.kammoun.donutCore.crates.managers.KeyManager;
import com.kammoun.donutCore.crates.managers.SettingsManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;

public class AutoKeyTask implements Runnable {
    private final KeyManager keyManager;
    private final SettingsManager settingsManager;
    private final int intervalSeconds;
    private long nextExecutionTime;
    private static int rT222zisGv = 0;

    private transient int f520ylVygND9L = 57521482;
    private static String[] nothing_to_see_here = new String[13];

    public AutoKeyTask(KeyManager keyManager, SettingsManager settingsManager, int i, int i2) {
        int i3 = 1837728819 ^ (137470433 ^ 1632261890);
        int parseInt = 1748275210 ^ (249696353 ^ Integer.parseInt("1646588603"));
        this.f520ylVygND9L = 57521482 ^ rT222zisGv;
        int rwuyykwsskrszyvg = 1545594440 ^ rwuyykwsskrszyvg(parseInt, 106449268);
        this.keyManager = keyManager;
        this.settingsManager = settingsManager;
        this.intervalSeconds = i;
        this.nextExecutionTime = System.currentTimeMillis() + (i * 1000);
        int i4 = 1692745752 ^ (1759572595 ^ (1047631129 ^ (2115546895 ^ rwuyykwsskrszyvg)));
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.tasks.AutoKeyTask.run():void");
    }

    public long getRemainingSeconds(int i) {
        int i2 = 806710364 ^ (859375411 ^ 818913567);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1625402495) {
            i2 = 641627683 ^ i2;
            long currentTimeMillis = (this.nextExecutionTime - System.currentTimeMillis()) / 1000;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1360141672) {
                int i3 = 2095459163 ^ i2;
                return Math.max(0L, currentTimeMillis);
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1239201859 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2057850832 ^ i2)) {
                int i4 = 242428291 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1360141672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (591907583 ^ i2)) {
                    int i5 = 88259800 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1625402495 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1064904607 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1820331855 ^ i2;
        throw new RuntimeException();
    }

    public java.lang.String getFormattedRemainingTime(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.tasks.AutoKeyTask.getFormattedRemainingTime(int):java.lang.String");
    }

    private void sendAlert(org.bukkit.entity.Player r7, java.util.Map r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.tasks.AutoKeyTask.sendAlert(org.bukkit.entity.Player, java.util.Map, int):void");
    }

    @Generated
    public long getNextExecutionTime() {
        int i = 176230710 ^ (1537489599 ^ 818913567);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 257184947) {
            int i2 = 1933219445 ^ i;
            return this.nextExecutionTime;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1769937128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1533567893 ^ i)) {
                int i3 = 1348539878 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 257184947 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1658242622 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2064328293 ^ i;
        throw new RuntimeException();
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⣠⣶⡾⠏⠉⠙⠳⢦⡀⠀⠀⠀⢠⠞⠉⠙⠲⡀⠀    ";
        nothing_to_see_here[2] = "⠀⠀⠀⣴⠿⠏⠀⠀⠀⠀⠀⠀⢳⡀⠀⡏⠀⠀⠀⠀⠀⢷     ";
        nothing_to_see_here[3] = "⠀⠀⢠⣟⣋⡀⢀⣀⣀⡀⠀⣀⡀⣧⠀⢸⠀⠀⠀⠀⠀ ⡇    ";
        nothing_to_see_here[4] = "⠀⠀⢸⣯⡭⠁⠸⣛⣟⠆⡴⣻⡲⣿⠀⣸⠀⠀OK⠀ ⡇    ";
        nothing_to_see_here[5] = "⠀⠀⣟⣿⡭⠀⠀⠀⠀⠀⢱⠀⠀⣿⠀⢹⠀⠀⠀⠀⠀ ⡇    ";
        nothing_to_see_here[6] = "⠀⠀⠙⢿⣯⠄⠀⠀⠀⢀⡀⠀⠀⡿⠀⠀⡇⠀⠀⠀⠀⡼     ";
        nothing_to_see_here[7] = "⠀⠀⠀⠀⠹⣶⠆⠀⠀⠀⠀⠀⡴⠃⠀⠀⠘⠤⣄⣠⠞⠀     ";
        nothing_to_see_here[8] = "⠀⠀⠀⠀⠀⢸⣷⡦⢤⡤⢤⣞⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[9] = "⠀⠀⢀⣤⣴⣿⣏⠁⠀⠀⠸⣏⢯⣷⣖⣦⡀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[10] = "⢀⣾⣽⣿⣿⣿⣿⠛⢲⣶⣾⢉⡷⣿⣿⠵⣿⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[11] = "⣼⣿⠍⠉⣿⡭⠉⠙⢺⣇⣼⡏⠀⠀⠀⣄⢸⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[12] = "⣿⣿⣧⣀⣿.........⣀⣰⣏⣘⣆⣀⠀⠀       ";
        rT222zisGv = (-528003693) ^ new Random(-967638870630340374L).nextInt();
    }

    public static String iumnrcdwws(byte[] bArr, byte[] bArr2, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3 % bArr2.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] thcoiujiydxvnql() {
        return new byte[]{96, 111, 3, 103, 32, 41, 40, 61, 60, 116, 14, 37, 66, 31, 23, 21, 75, 51, 76, 43, 75, 35, 36, 22, 19, 77, 5, 41, 89, 97, 107, 31, 71, 101, 22, 20, 68, 102, 5, 67, 11, 38, 121, 115, 122, 23, 94};
    }

    private static byte[] sxtzyyijbyhsoou() {
        return new byte[]{-81, -92, 48, 114, 16, 122, 31, 98, 5, 101, 63, 52, 113, 75, 39, 81};
    }

    private static byte[] kxihxycjfubjqds() {
        return new byte[]{-84, -96, 58, 113, 23, 117, 17, 118};
    }

    private static byte[] pjgadzfbwnqyluk() {
        return new byte[]{-89, -93, 54, 117, 25, 120, 27, 99, 12, 109, 61, 53, 117, 66, 34, 75, 125, 35, 117, 61, 126, 112, 29, 80};
    }

    private static byte[] czbdwubackbefxp() {
        return new byte[]{-87, -91, 52, 12, 18, Byte.MAX_VALUE, 29, 99, 13, 45};
    }

    private static byte[] zfauxbnhrqlvxbf() {
        return new byte[]{-88, -87, 50, 124, 17, 58};
    }

    private static byte[] tbwqqhuuptmskwm() {
        return new byte[]{-84, -95, 49, 117, 24, 125, 27, 121, 13, 37, 60, 96, 112, 77, 47, 7};
    }

    private static byte[] wvayjievtjzwrhq() {
        return new byte[]{-88, -90, 52, 123, 20, 124, 16, 103, 10, 45, 56, 103, 123, 69, 35, 89, 124, 32};
    }

    private static int rwuyykwsskrszyvg(int i, int i2) {
        return i ^ i2;
    }
}
