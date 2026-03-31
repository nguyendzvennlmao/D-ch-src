package com.kammoun.donutCore.settings.models;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import lombok.Generated;

public class PlayerSettings {
    private final UUID playerUUID;
    private final Map<String, Boolean> settings;
    private static int edPTvkNgED = 0;
    private transient int q5pCCmJwiS = 1334764344;
    private static byte[] lbzrtomrey;
    private static String[] nothing_to_see_here = new String[19];

    static class AnonymousClass1 {
        static final int[] $SwitchMap$com$kammoun$donutCore$settings$models$enums$SettingType;
        private static int SjJZ3h6wu5 = 0;
        private transient int PnFtrFw2UD = 459530662;
        private static byte[] ftcfwobjum;
        private static String[] nothing_to_see_here;

        static {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.models.PlayerSettings.AnonymousClass1.m332clinit():void");
        }

        public static String qubogoffxd(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= bArr.length) {
                    return new String(bArr, StandardCharsets.UTF_16);
                }
                bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                bArr[i3] = (byte) (bArr[i3] ^ ftcfwobjum[i3 % ftcfwobjum.length]);
                i2 = i3 + 1;
            }
        }

        private static byte[] wbnfbmimqhtnkmc() {
            return new byte[]{43, 15, 32, 108, 116, 7, 49, 18, 123, 10, 51, Byte.MAX_VALUE, 46, 101, 125, 96, 96, 120, 103, 54, 26, 10, 112, 15, 42, 34, 70, 124, 120, 76, 110, 102, 4, 17, 33, 109, 1, 13, 6, 2, 96, 102, 77, Byte.MAX_VALUE, 113, 96, 6, 58, 41, 9, 28, 101, 31, 122, 15, 81};
        }

        private static int okkdxkdlaedxjebx(int i, int i2) {
            return i ^ i2;
        }
    }

    public PlayerSettings(UUID uuid, int i) {
        int i2 = 711584437 ^ (1627032098 ^ 644931834);
        int parseInt = 481618499 ^ (953254435 ^ Integer.parseInt("1216800781"));
        this.q5pCCmJwiS = 1334764344 ^ edPTvkNgED;
        int zjkzxfahedafolcr = 1837775389 ^ zjkzxfahedafolcr(parseInt, 881396296);
        this.playerUUID = uuid;
        this.settings = new HashMap();
        int i3 = 1287051019 ^ (408316744 ^ zjkzxfahedafolcr);
    }

    public PlayerSettings(UUID uuid, UUID uuid2, Map<String, Boolean> map) {
        int i = 764733507 ^ (917095322 ^ 1247667467);
        int parseInt = 1487136900 ^ (1095093851 ^ Integer.parseInt("1216800781"));
        this.q5pCCmJwiS = 1334764344 ^ edPTvkNgED;
        int zjkzxfahedafolcr = 563432528 ^ zjkzxfahedafolcr(parseInt, 685184066);
        this.playerUUID = uuid;
        this.settings = uuid2;
        int i2 = 979955820 ^ (253187393 ^ zjkzxfahedafolcr);
    }

    public boolean getSetting(com.kammoun.donutCore.settings.models.enums.SettingType r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.models.PlayerSettings.getSetting(com.kammoun.donutCore.settings.models.enums.SettingType, int):boolean");
    }

    private boolean getDefaultValue(com.kammoun.donutCore.settings.models.enums.SettingType r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.models.PlayerSettings.getDefaultValue(com.kammoun.donutCore.settings.models.enums.SettingType, int):boolean");
    }

    public void setSetting(String str, boolean z, int i) {
        int i2 = 1274170751 ^ (143531968 ^ 704603499);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1410973347) {
            i2 = 1968300367 ^ i2;
            this.settings.put(str, Boolean.valueOf(z));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -23677736) {
                int i3 = 1070383299 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 15774401 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1668758924 ^ i2)) {
                int i4 = 1527165518 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1410973347 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1499454618 ^ i2)) {
                    int i5 = 987319564 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -23677736 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1236723401 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 2045198704 ^ i2;
        throw new RuntimeException();
    }

    public Map getAllSettings(int i) {
        int i2 = 1713208910 ^ (1067143759 ^ 704603499);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2083894445) {
            int i3 = 1335675378 ^ i2;
            return new HashMap(this.settings);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2083894445 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (197217913 ^ i2)) {
                int i4 = 425132015 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -13892415 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1158441206 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1645696635 ^ i2;
        throw new IOException();
    }

    public void updateSetting(String str, boolean z) {
        int i = 942306030 ^ (617497149 ^ 704603499);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1462063679) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1462063679 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2022251208 ^ i)) {
                    break;
                }
            }
            int i2 = 1320908854 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 1949927236 ^ i;
        this.settings.put(str, Boolean.valueOf(z));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 152475618) {
            int i4 = 543147782 ^ i3;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 199798739 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2010158941 ^ i3)) {
                int i5 = 1798796734 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 152475618 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (904615433 ^ i3)) {
                    break;
                }
            }
        }
        int i6 = 1536881080 ^ i3;
        throw new RuntimeException();
    }

    public boolean hasSetting(String str) {
        int i = 1472676287 ^ (1529028459 ^ 704603499);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 685366777) {
            int i2 = 861296677 ^ i;
            return this.settings.containsKey(str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1301603120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1500927239 ^ i)) {
                int i3 = 1161206832 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 685366777 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1201282240 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 372033656 ^ i;
        throw new IOException();
    }

    @Generated
    public UUID getPlayerUUID(int i) {
        int i2 = 986880339 ^ (1187052797 ^ 704603499);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1352137174) {
            int i3 = 1314852320 ^ i2;
            return this.playerUUID;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1352137174 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1313711617 ^ i2)) {
                int i4 = 938229931 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -577738456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (381708631 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 118972412 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public Map<String, Boolean> getSettings() {
        int i = 103302880 ^ (1375818166 ^ 704603499);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -290221589) {
            int i2 = 2128624396 ^ i;
            return this.settings;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 431114632 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1741640944 ^ i)) {
                int i3 = 2116668428 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -290221589 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1119970725 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1713585975 ^ i;
        throw new IOException();
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠛⠉⠙⠛⠛⠛⠛⠻⢿⣿⣷⣤⡀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠈⢻⣿⣿⡄⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⠀⠀⠀⣸⣿⡏⠀⠀⠀⣠⣶⣾⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣄⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⢰⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣷⡄⠀";
        nothing_to_see_here[5] = "⠀⠀⣀⣤⣴⣶⣶⣿⡟⠀⠀⠀⢸⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⠀";
        nothing_to_see_here[6] = "⠀⢰⣿⡟⠋⠉⣹⣿⡇⠀⠀⠀⠘⣿⣿⣿⣿⣷⣦⣤⣤⣤⣶⣶⣶⣶⣿⣿⣿⠀";
        nothing_to_see_here[7] = "⠀⢸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀";
        nothing_to_see_here[8] = "⠀⣸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠉⠻⠿⣿⣿⣿⣿⡿⠿⠿⠛⢻⣿⡇⠀⠀";
        nothing_to_see_here[9] = "⠀⣿⣿⠁⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⠀⠀";
        nothing_to_see_here[10] = "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀";
        nothing_to_see_here[11] = "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀";
        nothing_to_see_here[12] = "⠀⢿⣿⡆⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀";
        nothing_to_see_here[13] = "⠀⠸⣿⣧⡀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠛⢿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⣰⣿⣿⣷⣶⣶⣶⣶⠶⠀⢠⣿⣿⠀⠀⠀";
        nothing_to_see_here[15] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⣽⣿⡏⠁⠀⠀⢸⣿⡇⠀⠀⠀";
        nothing_to_see_here[16] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⢹⣿⡆⠀⠀⠀⣸⣿⠇⠀⠀⠀";
        nothing_to_see_here[17] = "⠀⠀⠀⠀⠀⠀⠀⢿⣿⣦⣄⣀⣠⣴⣿⣿⠁⠀⠈⠻⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀";
        nothing_to_see_here[18] = "⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⠿⠿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        lbzrtomrey = quncieihwfgdqhh();
        edPTvkNgED = 959984580 ^ new Random(2675195901822157184L).nextInt();
    }

    public static String axgvrfzpdj(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ lbzrtomrey[i3 % lbzrtomrey.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] quncieihwfgdqhh() {
        return new byte[]{7, 89, 109, 30, 85, 58, 26, 104, 65, 14, 74, 3, 57, 113, 73, 40, 85, 21, 101, 35, 112, 8, 116, 76, 11, 81, 22, Byte.MAX_VALUE, 2, 100, 125, 105, 39, 115, 114, 99, 79, 61, 64, 102, 39, 73, 31, 125, 92, 48, 86, 37, 79, 28, 24, 108, 107, 42, 13, 28, 105, 16, 1, 8, 113, 21, 39, 97, 37, 125, 54, 28, 77, 37, 96, 9, Byte.MAX_VALUE, 32, 59, 103, 60, 109, 4, 89, 122, 76, 109, 121, 32, 110, 58, 2, 2, 115, 59, 58, 44};
    }

    private static int zjkzxfahedafolcr(int i, int i2) {
        return i ^ i2;
    }
}
