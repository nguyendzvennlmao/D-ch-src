package com.kammoun.donutCore.core.managers.spawn;

import com.kammoun.donutCore.core.library.spawn.AbstractLocationConfig;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;

public class AfkConfig extends AbstractLocationConfig {
    private static final String CONFIG_DIRECTORY = "Locations";
    private static final String CONFIG_FILE_NAME = "afks.yml";
    private static final String CONFIG_SECTION_NAME = "afks";
    private static int aao7Wkp5yH = 0;
    private transient int c7bNfWveyX = 2078153912;
    private static String[] nothing_to_see_here = new String[15];

    public AfkConfig(org.bukkit.plugin.java.JavaPlugin r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.managers.spawn.AfkConfig.<init>(org.bukkit.plugin.java.JavaPlugin, int):void");
    }

    @Override
    protected String getConfigSectionName(int i) {
        int i2 = 1474972530 ^ (1890529852 ^ 1634577969);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 826719226) {
            return frdhhzjuzp(tvjovquakfhsufs(), ncsautsrptjzlxd(), 1972792821 ^ i2);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1644833711 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (127477853 ^ i2)) {
                int i3 = 827386770 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 826719226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2010373497 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 1634176171 ^ i2;
        throw new IllegalAccessException();
    }

    @Override
    protected String getResourcePath(int i) {
        int i2 = 861593266 ^ (1098904068 ^ 1634577969);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1706814408) {
            return frdhhzjuzp(gylhbzfssexoxas(), ncsautsrptjzlxd(), 1166352954 ^ i2);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1706814408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (37528074 ^ i2)) {
                int i3 = 30996654 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1234369046 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1813717317 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 399615441 ^ i2;
        throw new IllegalAccessException();
    }

    @Override
    protected String getConfigFileName(int i) {
        int i2 = 1947220179 ^ (1167402575 ^ 1634577969);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2025486998) {
            return frdhhzjuzp(vjtwdcwzznfpycl(), ncsautsrptjzlxd(), 182911163 ^ i2);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2025486998 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1873628531 ^ i2)) {
                int i3 = 784362228 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -797081422 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (480141898 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 1602986418 ^ i2;
        throw new IOException();
    }

    public Map getAfkDataMap(int i) {
        int i2 = 1553111792 ^ (899110336 ^ 1634577969);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1128466440) {
            int i3 = 227355359 ^ i2;
            return getDataMap(2034617879);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 791305968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (940574173 ^ i2)) {
                int i4 = 320148651 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1128466440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1908423562 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 120974423 ^ i2;
        throw new IOException();
    }

    static {
        nothing_to_see_here[0] = "⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆";
        nothing_to_see_here[5] = "⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿";
        nothing_to_see_here[6] = "⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀";
        nothing_to_see_here[7] = "⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[8] = "⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉              ";
        aao7Wkp5yH = (-1464283059) ^ new Random(-6412047566238286337L).nextInt();
    }

    public static String frdhhzjuzp(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] ncsautsrptjzlxd() {
        return new byte[]{33, 29, 38, 1, 96, 92, 106, 92, 37, 86, 34, 120, 112, 38, 125, 69, 2, 108, 124, 107, 90, 62, 29, 44, 15, 61, 42, 35, 60, 50, 36, 98, 8, 28, 12, 108, 41, 124, 25, 43, 22, 106, 5, 110, 69, 117, 14, 88, 39, 77, 91, 12, 93, 119, 96, 10, 6, 80, 20};
    }

    private static byte[] tvjovquakfhsufs() {
        return new byte[]{-25, -44, 30, 81, 83, 13, 92, 6, 21, 29};
    }

    private static byte[] gylhbzfssexoxas() {
        return new byte[]{-18, -42, 19, 123, 83, 2, 92, 9, 21, 2, 19, 56, 69, 121, 78, 27, 52, 52, 76, 45};
    }

    private static byte[] vjtwdcwzznfpycl() {
        return new byte[]{-18, -41, 23, 80, 89, 13, 93, 2, 16, 29, 19, 99, 65, 111, 68, 31, 53, 53};
    }
}
