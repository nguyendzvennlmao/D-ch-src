package com.kammoun.donutCore.api.skin;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ConcurrentSkinCache implements SkinCache {
    private final Map<UUID, SkinData> cache;
    private static int jbDg6J6R8F = 0;

    private transient int f35hbUHpLRdN = 585573914;
    private static String[] nothing_to_see_here = new String[15];

    public ConcurrentSkinCache() {
        irinxqtvnzrizlgl(731577335 ^ 1395255322, 36968801);
        int parseInt = 1422101135 ^ (2108685973 ^ Integer.parseInt("1407942294"));
        this.f35hbUHpLRdN = 585573914 ^ jbDg6J6R8F;
        int i = 2084761101 ^ (38847607 ^ parseInt);
        this.cache = new ConcurrentHashMap();
    }

    @Override
    @Nullable
    public SkinData get(@NotNull UUID uuid, int i) {
        int i2 = 2032715581 ^ (1450844014 ^ 803290720);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 94319000) {
            int i3 = 109419616 ^ i2;
            return this.cache.get(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 833868440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1627955167 ^ i2)) {
                int i4 = 328810172 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 94319000 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (395856758 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1845955769 ^ i2;
        throw new RuntimeException();
    }

    @Override
    public void put(@NotNull SkinData skinData) {
        int i = 648335870 ^ (924863573 ^ 803290720);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -215146919) {
            i = 1799553472 ^ i;
            this.cache.put(skinData.uuid(139544848), skinData);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1456140198) {
                int i2 = 998127573 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -215146919 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (587393580 ^ i)) {
                int i3 = 811085700 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1925492467 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1223843006 ^ i)) {
                    int i4 = 855322935 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1456140198 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1289844825 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 1976785486 ^ i;
        throw new IllegalAccessException();
    }

    @Override
    public boolean contains(@NotNull UUID uuid) {
        int i = 2140681190 ^ (478546438 ^ 803290720);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1744321538) {
            int i2 = 541874192 ^ i;
            return this.cache.containsKey(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1704656003 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (959970131 ^ i)) {
                int i3 = 481356653 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1744321538 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (433686295 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 584668159 ^ i;
        throw new IOException();
    }

    @Override
    public void invalidate(@NotNull UUID uuid, int i) {
        int i2 = 708956873 ^ (2144113169 ^ 803290720);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -748423741) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -748423741 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1129322022 ^ i2)) {
                    break;
                }
            }
            int i3 = 723435883 ^ i2;
            throw new IOException("double");
        }
        int i4 = 124737887 ^ i2;
        this.cache.remove(uuid);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -400998597) {
            int i5 = 2022765206 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 748596104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1040243805 ^ i4)) {
                int i6 = 816347104 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -400998597 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (56679607 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 180401634 ^ i4;
        throw new IllegalAccessException();
    }

    @Override
    public void clear(int i) {
        int i2 = 565702717 ^ (82501854 ^ 803290720);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1440838680) {
            i2 = 591243657 ^ i2;
            this.cache.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1275869265) {
                int i3 = 1102452732 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1102874547 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (869727303 ^ i2)) {
                int i4 = 1557384477 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1275869265 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1222852239 ^ i2)) {
                    int i5 = 1736962296 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1440838680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (33757663 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 662466935 ^ i2;
        throw new RuntimeException();
    }

    @Override
    public int size(int i) {
        int i2 = 1128337741 ^ (1891641654 ^ 803290720);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -486526760) {
            int i3 = 706479412 ^ i2;
            return this.cache.size();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1277159047 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (889076105 ^ i2)) {
                int i4 = 1598964865 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -486526760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (513969270 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 242187211 ^ i2;
        throw new IllegalAccessException();
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⢰⣧⣼⣯⠄⣸⣠⣶⣶⣦⣾⠄⠄⠄⠄⡀⠄⢀⣿⣿⠄⠄⠄⢸⡇⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿⠄";
        nothing_to_see_here[2] = "⠄⠄⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿⠄";
        nothing_to_see_here[3] = "⠄⠄⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⠄";
        nothing_to_see_here[4] = "⠄⢀⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋⣰";
        nothing_to_see_here[5] = "⠄⣼⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀⣤";
        nothing_to_see_here[6] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿⡗";
        nothing_to_see_here[7] = "⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄";
        nothing_to_see_here[8] = "⢸⣿⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄";
        nothing_to_see_here[9] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃⠄";
        nothing_to_see_here[10] = "⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄⠄";
        nothing_to_see_here[11] = "⠄⠄⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄⠄";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠈⠛⢿⣿⣿⣿⠁⠞⢿⣿⣿⡄⢿⣿⡇⣸⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄";
        nothing_to_see_here[13] = "⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣾⣦⡙⠻⣷⣾⣿⠃⠿⠋⠁⠄⠄⠄⠄⠄⢀⣠⣴";
        nothing_to_see_here[14] = "⣿⣿⣿⣶⣶⣮⣥⣒⠲⢮⣝⡿⣿⣿⡆⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⣠⣴⣿⣿⣿";
        jbDg6J6R8F = 551314993 ^ new Random(-7092518686578780865L).nextInt();
    }

    public static String auqmgjqpet(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] zkkbdeidcgggdwu() {
        return new byte[]{5, 27, 49, 50, 32, 97, 89, 43, 69, 26, 57, 125, 87, 109, 90, 18, 31, 72, 45, 114, 76, 81, 14, 112, 99, 116, 8, 13, 106, 30, 122, 87, 17, 89, 22, 106, 23, 113, 15, 124, 49, 39, 87, 84, 62, 2, 124, 68, 68, 65, 39, 89, 80, Byte.MAX_VALUE, 75, 6, 32, 4, 14, 52, 113, 82, 13, 7, 59, 73, 42, 48, 31, 115, 78, 41, 83, 15, 76, 99, 103, 63, 88, 4, 91, 42, 4, 83, 26, 101, 84, 50, 109, 61, 101, 99, 75};
    }

    private static int irinxqtvnzrizlgl(int i, int i2) {
        return i ^ i2;
    }
}
