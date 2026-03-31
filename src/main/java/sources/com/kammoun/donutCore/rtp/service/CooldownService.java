package com.kammoun.donutCore.rtp.service;

import com.kammoun.donutCore.rtp.config.ConfigManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class CooldownService {
    private final ConfigManager configManager;
    private final Map<UUID, Long> cooldowns;
    private static int GEODgJZ2ru = 0;
    private transient int MW4EfHmpH9 = 105267617;
    private static byte[] dovpnvwrif;
    private static String[] nothing_to_see_here = new String[13];

    public CooldownService(com.kammoun.donutCore.rtp.config.ConfigManager r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.service.CooldownService.<init>(com.kammoun.donutCore.rtp.config.ConfigManager, int):void");
    }

    public boolean hasCooldown(java.util.UUID r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.service.CooldownService.hasCooldown(java.util.UUID, int):boolean");
    }

    public long getRemainingCooldown(UUID uuid, int i) {
        int i2 = 587112017 ^ (1263640061 ^ 1403082958);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -797779183) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -797779183 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1385462151 ^ i2)) {
                    break;
                }
            }
            int i3 = 299551835 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1373619432 ^ i2;
        if (this.cooldowns.containsKey(uuid) == (1808899978 ^ i4)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1586297939) {
                int i5 = 1229304606 ^ i4;
                return 0L;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1586297939 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2062565694 ^ i4)) {
                    int i6 = 271796753 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 346121377 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1052214337 ^ i4)) {
                        break;
                    }
                }
            }
            int i7 = 504574530 ^ i4;
            throw new IllegalAccessException();
        }
        int i8 = 1198377712 ^ i4;
        long longValue = this.cooldowns.get(uuid).longValue();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 1709353937) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1709353937 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (114536315 ^ i8)) {
                    break;
                }
            }
            int i9 = 2098884064 ^ i8;
            throw new RuntimeException("double");
        }
        int i10 = 262466375 ^ i8;
        long currentTimeMillis = (longValue - System.currentTimeMillis()) / 1000;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 415625705) {
            int i11 = 1968089566 ^ i10;
            return Math.max(0L, currentTimeMillis);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 415625705 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (258690334 ^ i10)) {
                break;
            }
        }
        int i12 = 880457264 ^ i10;
        throw new RuntimeException("double");
    }

    public void setCooldown(UUID uuid, int i) {
        int i2 = 2126525036 ^ (93573029 ^ 1403082958);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1200957497) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1200957497 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1660523796 ^ i2)) {
                    break;
                }
            }
            int i3 = 1269501022 ^ i2;
            throw new IOException("double");
        }
        int i4 = 540621393 ^ i2;
        if (this.configManager.isEnableCooldown(180108111) == (147562326 ^ i4)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1180498608) {
                int i5 = 988135553 ^ i4;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1180498608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (216321777 ^ i4)) {
                    break;
                }
            }
            int i6 = 565512763 ^ i4;
            throw new IOException("double");
        }
        int i7 = 530469246 ^ i4;
        long cooldownTime = this.configManager.getCooldownTime(974897697) * 1000;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1162972864) {
            i7 = 501554053 ^ i7;
            this.cooldowns.put(uuid, Long.valueOf(System.currentTimeMillis() + cooldownTime));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1434889576) {
                int i8 = 433558008 ^ i7;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1162972864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (619703303 ^ i7)) {
                int i9 = 1572301735 ^ i7;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1854734663 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (2016889230 ^ i7)) {
                    int i10 = 139002593 ^ i7;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1690688856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1055724314 ^ i7)) {
                        int i11 = 1996782140 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1434889576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1012741414 ^ i7)) {
                            break;
                        }
                    }
                }
            }
        }
        int i12 = 534668436 ^ i7;
        throw new IllegalAccessException();
    }

    public void removeCooldown(UUID uuid) {
        int i = 1663197782 ^ (1998212065 ^ 1403082958);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1019972554) {
            i = 1375151433 ^ i;
            this.cooldowns.remove(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1284333184) {
                int i2 = 36739987 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1284333184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (550756384 ^ i)) {
                int i3 = 1258021383 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1560904424 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1650721747 ^ i)) {
                    int i4 = 251599542 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1019972554 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1780177630 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 143895508 ^ i;
        throw new RuntimeException();
    }

    public void clearAll(int i) {
        int i2 = 1948939527 ^ (1997964982 ^ 1403082958);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2064819206) {
            i2 = 1226753064 ^ i2;
            this.cooldowns.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -870614344) {
                int i3 = 644368687 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2064819206 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (537052479 ^ i2)) {
                int i4 = 1338440413 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -10931263 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1777377041 ^ i2)) {
                    int i5 = 640345983 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -870614344 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (267759674 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1300409636 ^ i2;
        throw new IllegalAccessException();
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
        dovpnvwrif = wpkxadjcgjsundv();
        GEODgJZ2ru = 453111072 ^ new Random(-245176620336826528L).nextInt();
    }

    public static String gjekssxgzt(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ dovpnvwrif[i3 % dovpnvwrif.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] wpkxadjcgjsundv() {
        return new byte[]{36, 72, 91, 58};
    }

    private static int drsograzokjksmuf(int i, int i2) {
        return i2 ^ i;
    }
}
