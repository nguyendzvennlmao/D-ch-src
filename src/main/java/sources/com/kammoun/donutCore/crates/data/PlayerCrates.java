package com.kammoun.donutCore.crates.data;

import com.kammoun.donutCore.crates.models.CratePlayer;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import lombok.Generated;

public class PlayerCrates {
    private static PlayerCrates instance;
    private final Map<UUID, CratePlayer> cache;
    private static int btsgqXKDfJ = 0;
    private transient int lJd1z4ZyfT = 162219457;
    private static byte[] iurfatdxra;
    private static String[] nothing_to_see_here = new String[15];

    public PlayerCrates() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.data.PlayerCrates.<init>():void");
    }

    public CratePlayer getPlayer(UUID uuid, int i) {
        int i2 = 1967492712 ^ (1906429023 ^ 306500642);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1257983832) {
            int i3 = 183908048 ^ i2;
            return this.cache.computeIfAbsent(uuid, CratePlayer::new);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1257983832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1525488925 ^ i2)) {
                int i4 = 831411490 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -491452888 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1251046925 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 112698667 ^ i2;
        throw new IllegalAccessException();
    }

    public void addPlayer(CratePlayer cratePlayer, int i) {
        int i2 = 2135517112 ^ (13026039 ^ 306500642);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1851493227) {
            i2 = 1647990920 ^ i2;
            this.cache.put(cratePlayer.getUuid(829966208), cratePlayer);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2139705128) {
                int i3 = 1774604723 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2139705128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1360164152 ^ i2)) {
                int i4 = 914270403 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1851493227 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1460702096 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1623942500 ^ i2;
        throw new IllegalAccessException();
    }

    public void removePlayer(UUID uuid, int i) {
        int i2 = 624467589 ^ (33057865 ^ 306500642);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1272891535) {
            i2 = 291657822 ^ i2;
            this.cache.remove(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1060369793) {
                int i3 = 637961915 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1272891535 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1454912429 ^ i2)) {
                int i4 = 1818758565 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 252166232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1174532604 ^ i2)) {
                    int i5 = 1278356877 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1060369793 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (723056549 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1658518101 ^ i2;
        throw new IllegalAccessException();
    }

    public boolean hasPlayer(UUID uuid) {
        int i = 611761661 ^ (74408910 ^ 306500642);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1830268791) {
            int i2 = 1558988616 ^ i;
            return this.cache.containsKey(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1972005579 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (372000420 ^ i)) {
                int i3 = 203159932 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1830268791 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (121993069 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 256272233 ^ i;
        throw new IllegalAccessException();
    }

    public void clear() {
        int i = 596895267 ^ (540188998 ^ 306500642);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1892902344) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1892902344 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (698580806 ^ i)) {
                    int i2 = 804194905 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1245058046 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1198399295 ^ i)) {
                        break;
                    }
                }
            }
            int i3 = 1120493385 ^ i;
            throw new IllegalAccessException();
        }
        int i4 = 1949938830 ^ i;
        this.cache.clear();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 786513483) {
            int i5 = 862263881 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 786513483 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (390326147 ^ i4)) {
                break;
            }
        }
        int i6 = 1574302753 ^ i4;
        throw new RuntimeException("double");
    }

    @Generated
    public static PlayerCrates getInstance() {
        int i = 1398440065 ^ (381843253 ^ (1853692751 ^ 468685283));
        return instance;
    }

    @Generated
    public Map getCache(int i) {
        int i2 = 936729164 ^ (1530711654 ^ 306500642);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -177602493) {
            int i3 = 1557821092 ^ i2;
            return this.cache;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 330937697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2011344315 ^ i2)) {
                int i4 = 6717139 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -177602493 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (726034949 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1086304017 ^ i2;
        throw new RuntimeException();
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
        iurfatdxra = rcmchkfdkiwjgfs();
        btsgqXKDfJ = 1172448626 ^ new Random(-5614096183954825432L).nextInt();
    }

    public static String flrqkijwzu(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ iurfatdxra[i3 % iurfatdxra.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] rcmchkfdkiwjgfs() {
        return new byte[]{75, 111, 67, 115, 35, 67, 54, 62, 25, 55, 53, 123, 98, 31, 63, 54, 80, 18, 44, 94, 124, 92, 102, 112, 20, 103, 45, 51, 84, 77, 51, 34, 41, 76, 24, 123, 110, 84, 95, 13, 56, 46, 31, 114, 57, 108, 19, 68, 81, 114, 84, 68, 18, 112, 125, 36, 87, 72, 29, 3, 4, 125, 103, 55, 11, 75, 82, 3, 123, 123, 52, 54, 42, 57, 17, 37, 122, 29, 109, 123, 8, 21, 38, 106, 93, 119, 60, 28, 101, 42, 44, 15, 78, 10, 63, 102, 42, 96, 40, 80, 15, 75, 31, 33, 4, 43, 93, 81, 50, 85, 9, 106, 7, 119, 37, 81, 54, 69, 55, 11, 31, 34, 13, 9, 43, 50};
    }

    private static int nxcxjxogtqfpjzpq(int i, int i2) {
        return i2 ^ i;
    }
}
