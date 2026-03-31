package com.kammoun.donutCore.enderchest.manager;

import com.kammoun.donutCore.enderchest.CustomEnderChest;
import com.kammoun.utils.hikari.HikariConfig;
import com.kammoun.utils.hikari.HikariDataSource;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import lombok.Generated;
import org.bukkit.inventory.ItemStack;

public class DataManager {
    private final CustomEnderChest plugin;
    private HikariDataSource dataSource;
    private final ConcurrentHashMap<UUID, EnderChestData> cache;
    private final ConcurrentHashMap<UUID, ReentrantLock> playerLocks;
    private final ConcurrentHashMap<UUID, Boolean> savingPlayers;
    private static int d3HMOOy0E2 = 0;
    private transient int yIGdwcfsT9 = 1496226114;
    private static String foemrqjfur;
    private static String[] nothing_to_see_here = new String[13];

    public static class EnderChestData {
        private final UUID playerUuid;
        private final String playerName;
        private final ItemStack[] items;
        private final int size;
        private static int ystIqZ6WUN = 0;
        private transient int wjDQ08Waoo = 173601108;
        private static String wpgzdqholn;
        private static String[] nothing_to_see_here = new String[17];

        public EnderChestData(UUID uuid, String str, ItemStack[] itemStackArr, int i, int i2) {
            int i3 = 1025011635 ^ (117339448 ^ 916434297);
            int parseInt = 1752262584 ^ (2036045119 ^ Integer.parseInt("475219317"));
            this.wjDQ08Waoo = 173601108 ^ ystIqZ6WUN;
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                    case 169597213:
                        parseInt = 1631568156 ^ parseInt;
                        break;
                    case 485003183:
                    default:
                        throw new IOException();
                    case 1098824568:
                        break;
                    case 2116650554:
                }
            }
            this.playerUuid = uuid;
            this.playerName = str;
            this.items = itemStackArr;
            this.size = i;
            int i4 = 1813806462 ^ (1517677047 ^ (660517206 ^ (621379092 ^ (1635413947 ^ parseInt))));
        }

        public void setItem(int i, ItemStack itemStack) {
            int i2 = 1734914238 ^ (502867092 ^ 1813040565);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1274360584) {
                int i3 = 1860177358 ^ i2;
                if (i < (2019644497 ^ i3)) {
                    omezuwswjszhoduc(i3, 1339560895);
                    return;
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1022713205) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1022713205 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (795514086 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 1581868539 ^ i3;
                    throw new IllegalAccessException("double");
                }
                i2 = 1334149085 ^ i3;
                if (i < this.items.length) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1088332703) {
                        i2 = 1244519631 ^ i2;
                        this.items[i] = itemStack;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -296764901) {
                            int i5 = 1248899245 ^ i2;
                            return;
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                        case 47533648:
                        case 206185403:
                            int i6 = 6122594 ^ i2;
                            return;
                        case 579313890:
                            return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1274360584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (90839939 ^ i2)) {
                    int i7 = 1974167724 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -296764901 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (244593108 ^ i2)) {
                        int i8 = 828310748 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1088332703 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1982081956 ^ i2)) {
                            int i9 = 1187726643 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1110818959 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1051801061 ^ i2)) {
                                int i10 = 419310855 ^ i2;
                                throw new IllegalAccessException();
                            }
                        }
                    }
                }
            }
        }

        public org.bukkit.inventory.ItemStack[] cloneItems() {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.manager.DataManager.EnderChestData.cloneItems():org.bukkit.inventory.ItemStack[]");
        }

        @Generated
        public UUID getPlayerUuid(int i) {
            int i2 = 231551613 ^ (822846081 ^ 1813040565);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2035094966) {
                int i3 = 601305610 ^ i2;
                return this.playerUuid;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2035094966 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (43897453 ^ i2)) {
                    int i4 = 1686845366 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1744078309 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (573622879 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 836721594 ^ i2;
            throw new IllegalAccessException();
        }

        @Generated
        public String getPlayerName(int i) {
            int i2 = 705682641 ^ (1796313575 ^ 1813040565);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1752433689) {
                int i3 = 44289263 ^ i2;
                return this.playerName;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2104124257 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (53821135 ^ i2)) {
                    int i4 = 221334484 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1752433689 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (249921535 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1771918277 ^ i2;
            throw new IllegalAccessException();
        }

        @Generated
        public ItemStack[] getItems(int i) {
            int i2 = 306054602 ^ (1969587599 ^ 1813040565);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1515876224) {
                int i3 = 1128391064 ^ i2;
                return this.items;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1515876224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1407310181 ^ i2)) {
                    int i4 = 1840990034 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1079337794 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1080555659 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1083472066 ^ i2;
            throw new IOException();
        }

        @Generated
        public int getSize(int i) {
            int i2 = 553320799 ^ (1462525184 ^ 1813040565);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -566456496) {
                int i3 = 1849680593 ^ i2;
                return this.size;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -566456496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (47362251 ^ i2)) {
                    int i4 = 1094947499 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1346135589 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (56664000 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1937525339 ^ i2;
            throw new IOException();
        }

        static {
            nothing_to_see_here[0] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣠⣤⣶⣶⣶⣤⣄⣀⣀⠄⠄⠄⠄⠄";
            nothing_to_see_here[1] = "⠄⠄⠄⠄⠄⠄⠄⠄⣀⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣟⢿⣿⣿⣿⣶⣤⡀⠄";
            nothing_to_see_here[2] = "⠄⠄⠄⠄⠄⠄⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣜⠿⠿⣿⣿⣧⢓";
            nothing_to_see_here[3] = "⠄⠄⠄⠄⠄⡠⢛⣿⣿⣿⡟⣿⣿⣽⣋⠻⢻⣿⣿⣿⣿⡻⣧⡠⣭⣭⣿⡧";
            nothing_to_see_here[4] = "⠄⠄⠄⠄⠄⢠⣿⡟⣿⢻⠃⣻⣨⣻⠿⡀⣝⡿⣿⣿⣷⣜⣜⢿⣝⡿⡻⢔";
            nothing_to_see_here[5] = "⠄⠄⠄⠄⠄⢸⡟⣷⢿⢈⣚⣓⡡⣻⣿⣶⣬⣛⣓⣉⡻⢿⣎⠢⠻⣴⡾⠫";
            nothing_to_see_here[6] = "⠄⠄⠄⠄⠄⢸⠃⢹⡼⢸⣿⣿⣿⣦⣹⣿⣿⣿⠿⠿⠿⠷⣎⡼⠆⣿⠵⣫";
            nothing_to_see_here[7] = "⠄⠄⠄⠄⠄⠈⠄⠸⡟⡜⣩⡄⠄⣿⣿⣿⣿⣶⢀⢀⣿⣷⣿⣿⡐⡇⡄⣿";
            nothing_to_see_here[8] = "⠄⠄⠄⠄⠄⠄⠄⠄⠁⢶⢻⣧⣖⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⣇⡟⣇⣷⣿";
            nothing_to_see_here[9] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣆⣤⣽⣿⡿⠿⠿⣿⣿⣦⣴⡇⣿⢨⣾⣿⢹⢸";
            nothing_to_see_here[10] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⠊⡛⢿⣿⣿⣿⣿⡿⣫⢱⢺⡇⡏⣿⣿⣸⡼";
            nothing_to_see_here[11] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⡿⠄⣿⣷⣾⡍⣭⣶⣿⣿⡌⣼⣹⢱⠹⣿⣇⣧";
            nothing_to_see_here[12] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⣼⠁⣤⣭⣭⡌⢁⣼⣿⣿⣿⢹⡇⣭⣤⣶⣤⡝⡼";
            nothing_to_see_here[13] = "⠄⣀⠤⡀⠄⠄⠄⠄⠄⡏⣈⡻⡿⠃⢀⣾⣿⣿⣿⡿⡼⠁⣿⣿⣿⡿⢷⢸";
            nothing_to_see_here[14] = "⢰⣷⡧⡢⠄⠄⠄⠄⠠⢠⡛⠿⠄⠠⠬⠿⣿⠭⠭⢱⣇⣀⣭⡅⠶⣾⣷⣶";
            nothing_to_see_here[15] = "⠈⢿⣿⣧⠄⠄⠄⠄⢀⡛⠿⠄⠄⠄⠄⢠⠃⠄⠄⡜⠄⠄⣤⢀⣶⣮⡍⣴";
            nothing_to_see_here[16] = "⠄⠈⣿⣿⡀⠄⠄⠄⢩⣝⠃⠄⠄⢀⡄⡎⠄⠄⠄⠇⠄⠄⠅⣴⣶⣶⠄⣶";
            wpgzdqholn = ByteBuffer.wrap(itftivahsqnbblj()).asCharBuffer().toString();
            ystIqZ6WUN = (-1136836116) ^ new Random(-5696670512384650566L).nextInt();
        }

        public static String wyfklknqbr(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = wpgzdqholn.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= bytes2.length) {
                    return new String(bytes2, StandardCharsets.UTF_16BE);
                }
                bytes2[i5] = (byte) (bytes2[i5] ^ bytes[i5 % bytes.length]);
                i4 = i5 + 1;
            }
        }

        private static byte[] itftivahsqnbblj() {
            return new byte[0];
        }

        private static int omezuwswjszhoduc(int i, int i2) {
            return i ^ i2;
        }
    }

    public DataManager(CustomEnderChest customEnderChest, int i) {
        int i2 = 1133368342 ^ (1958929952 ^ 2121381412);
        int parseInt = 110667264 ^ (1355031145 ^ Integer.parseInt("526516347"));
        this.yIGdwcfsT9 = 1496226114 ^ d3HMOOy0E2;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 27278462:
                    break;
                case 233395932:
                    parseInt = 2022382024 ^ parseInt;
                    break;
                case 982440580:
                case 1491906512:
                default:
                    throw new IllegalAccessException();
            }
        }
        this.plugin = customEnderChest;
        this.cache = new ConcurrentHashMap<>();
        this.playerLocks = new ConcurrentHashMap<>();
        this.savingPlayers = new ConcurrentHashMap<>();
        int i3 = 1429292157 ^ (1121001195 ^ (1832302480 ^ (1617678546 ^ (1998476658 ^ parseInt))));
    }

    public void initialize(int i) {
        int i2;
        int i3 = 1607252675 ^ (1111400097 ^ 389582885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1448452664) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1448452664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1877216626 ^ i3)) {
                    break;
                }
            }
            int i4 = 1030095222 ^ i3;
            throw new RuntimeException("double");
        }
        int i5 = 1704388626 ^ i3;
        if (this.plugin.getDataFolder(44993446).exists() == (1868323925 ^ i5)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2061689515) {
                int i6 = 1484625433 ^ i5;
                this.plugin.getDataFolder(44993446).mkdirs();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1190243743) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1190243743 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (33880958 ^ i6)) {
                            break;
                        }
                    }
                    int i7 = 298819938 ^ i6;
                    throw new RuntimeException("double");
                }
                i2 = 80862160 ^ i6;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2061689515 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (951553870 ^ i5)) {
                    int i8 = 798609853 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1172760837 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (980153273 ^ i5)) {
                        int i9 = 232882176 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -756940543 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (367471711 ^ i5)) {
                            int i10 = 1142038271 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -198247071 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1096677811 ^ i5)) {
                                int i11 = 1289086441 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -873695677 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (280274907 ^ i5)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            int i12 = 93885041 ^ i5;
            throw new IOException();
        }
        i2 = 1554795977 ^ i5;
        File file = new File(this.plugin.getDataFolder(44993446), elrkeapkbn(bunudmdkomdidne(), i2));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1618965279) {
            int i13 = 97157643 ^ i2;
            String str = "jdbc:sqlite:" + file.getAbsolutePath();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1311466311) {
                int i14 = 1969373140 ^ i13;
                HikariConfig hikariConfig = new HikariConfig();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) != 449143322) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 449143322 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1570817770 ^ i14)) {
                            break;
                        }
                    }
                    int i15 = 434777057 ^ i14;
                    throw new IllegalAccessException("double");
                }
                int i16 = 1546470405 ^ i14;
                hikariConfig.setJdbcUrl(str);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -72400336) {
                    i5 = 1748421273 ^ i16;
                    hikariConfig.setMaximumPoolSize((byte) (2000888533 ^ i5));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1172760837) {
                        i13 = 1886424778 ^ i5;
                        hikariConfig.setMinimumIdle((byte) (120826903 ^ i13));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 966615208) {
                            i2 = 1614848013 ^ i13;
                            hikariConfig.setConnectionTimeout(30000L);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 999841987) {
                                i5 = 504267472 ^ i2;
                                hikariConfig.setIdleTimeout(600000L);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -873695677) {
                                    int i17 = 645659098 ^ i5;
                                    hikariConfig.setMaxLifetime(1800000L);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) != -130828142) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -130828142 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (1373662997 ^ i17)) {
                                                break;
                                            }
                                        }
                                        int i18 = 2140432294 ^ i17;
                                        throw new IOException("double");
                                    }
                                    int i19 = 631910796 ^ i17;
                                    hikariConfig.setLeakDetectionThreshold(60000L);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -714984205) {
                                        i5 = 1089472190 ^ i19;
                                        hikariConfig.addDataSourceProperty(elrkeapkbn(pxlxctiggrhzgro(), i5), elrkeapkbn(llsvdidhedrptng(), i5));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -756940543) {
                                            i16 = 1113844173 ^ i5;
                                            hikariConfig.addDataSourceProperty(elrkeapkbn(huxtifdtvwqoova(), i16), elrkeapkbn(gfbnlshhzxlszjl(), i16));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -1040363669) {
                                                int i20 = 2046331190 ^ i16;
                                                hikariConfig.addDataSourceProperty(elrkeapkbn(roijeyopfwtgayi(), i20), elrkeapkbn(zskgjcawkhkkwuf(), i20));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) != 238618328) {
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == 238618328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == (172872632 ^ i20)) {
                                                            break;
                                                        }
                                                    }
                                                    int i21 = 2055642598 ^ i20;
                                                    throw new IllegalAccessException("double");
                                                }
                                                i5 = 1061355383 ^ i20;
                                                hikariConfig.setConnectionTestQuery(elrkeapkbn(cbmymnxiqpeqxdx(), i5));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -198247071) {
                                                    int i22 = 631878859 ^ i5;
                                                    this.dataSource = new HikariDataSource(hikariConfig);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) != -647800008) {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == -647800008 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == (1125186505 ^ i22)) {
                                                                break;
                                                            }
                                                        }
                                                        int i23 = 1390054125 ^ i22;
                                                        throw new IOException("double");
                                                    }
                                                    i19 = 657449185 ^ i22;
                                                    createTable(137834125);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -535012303) {
                                                        int i24 = 108671016 ^ i19;
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -714984205 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (1466510911 ^ i19)) {
                                            int i25 = 827762635 ^ i19;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -535012303 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (1069630264 ^ i19)) {
                                                break;
                                            }
                                        }
                                    }
                                    int i26 = 2122035951 ^ i19;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2061689515) {
                            int i82 = 798609853 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1172760837) {
                                int i92 = 232882176 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -756940543) {
                                    int i102 = 1142038271 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -198247071) {
                                        int i112 = 1289086441 ^ i5;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -873695677) {
                                            break;
                                            break;
                                        }
                                        continue;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    int i122 = 93885041 ^ i5;
                    throw new IOException();
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -72400336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (1692216661 ^ i16)) {
                        int i27 = 990730990 ^ i16;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -1040363669 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (2136784242 ^ i16)) {
                            break;
                        }
                    }
                }
                int i28 = 110605602 ^ i16;
                throw new IOException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 966615208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (235555453 ^ i13)) {
                    int i29 = 426540018 ^ i13;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1311466311 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (631792900 ^ i13)) {
                        break;
                    }
                }
            }
            int i30 = 824925215 ^ i13;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1618965279 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (457820887 ^ i2)) {
                int i31 = 1499645027 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 999841987 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (538129698 ^ i2)) {
                    break;
                }
            }
        }
        int i32 = 827113472 ^ i2;
        throw new IllegalAccessException("double");
    }

    private void createTable(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.manager.DataManager.createTable(int):void");
    }

    public void shutdown(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.manager.DataManager.shutdown(int):void");
    }

    private ReentrantLock getLock(UUID uuid, int i) {
        int i2 = 1827873259 ^ (1575796074 ^ 389582885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 825779489) {
            int i3 = 310144244 ^ i2;
            return this.playerLocks.computeIfAbsent(uuid, uuid2 -> {
                int i4 = 353107941 ^ (1077342851 ^ 1310067047);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -648536056) {
                    int i5 = 711306422 ^ i4;
                    return new ReentrantLock();
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -648536056 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (231196599 ^ i4)) {
                        int i6 = 145058802 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1972025927 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1667478216 ^ i4)) {
                            break;
                        }
                    }
                }
                int i7 = 335883339 ^ i4;
                throw new IllegalAccessException();
            });
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1562705279 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (413397654 ^ i2)) {
                int i4 = 346377662 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 825779489 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (348933200 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 999903437 ^ i2;
        throw new RuntimeException();
    }

    public CompletableFuture loadData(UUID uuid, String str, int i) {
        int i2 = 226487790 ^ (7315701 ^ 389582885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -783881744) {
            int i3 = 1041678873 ^ i2;
            return CompletableFuture.supplyAsync(()
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.manager.DataManager.loadData(java.util.UUID, java.lang.String, int):java.util.concurrent.CompletableFuture");
        }

        public CompletableFuture saveData(UUID uuid, EnderChestData enderChestData, int i) {
            int i2 = 945930775 ^ (1728001800 ^ 389582885);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1295198674) {
                int i3 = 169870728 ^ i2;
                return CompletableFuture.runAsync(()
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.manager.DataManager.saveData(java.util.UUID, com.kammoun.donutCore.enderchest.manager.DataManager$EnderChestData, int):java.util.concurrent.CompletableFuture");
            }

            public void saveDataSync(java.util.UUID r6, com.kammoun.donutCore.enderchest.manager.DataManager.EnderChestData r7, int r8) {
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.manager.DataManager.saveDataSync(java.util.UUID, com.kammoun.donutCore.enderchest.manager.DataManager$EnderChestData, int):void");
            }

            public CompletableFuture deleteData(UUID uuid, int i) {
                int i2 = 1596303690 ^ (743995459 ^ 389582885);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 573180259) {
                    int i3 = 1613262044 ^ i2;
                    return CompletableFuture.runAsync(()
                    throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.manager.DataManager.deleteData(java.util.UUID, int):java.util.concurrent.CompletableFuture");
                }

                public boolean isSaving(UUID uuid, int i) {
                    int i2 = 1560357837 ^ (146015190 ^ 389582885);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 342737394) {
                        return this.savingPlayers.getOrDefault(uuid, Boolean.valueOf((boolean) ((byte) (2086702456 ^ (1055733062 ^ i2))))).booleanValue();
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -486249533 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (590565014 ^ i2)) {
                            int i3 = 1498820268 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 342737394 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1481505506 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i4 = 137873141 ^ i2;
                    throw new IOException();
                }

                public void removeCachedData(UUID uuid, int i) {
                    int i2 = 1582812826 ^ (1600967368 ^ 389582885);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1340316744) {
                        i2 = 545827471 ^ i2;
                        this.cache.remove(uuid);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1269221439) {
                            int i3 = 563033561 ^ i2;
                            return;
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1340316744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (563535504 ^ i2)) {
                            int i4 = 1002662243 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1269221439 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1694846790 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 897824547 ^ i2;
                    throw new IOException();
                }

                @Generated
                public CustomEnderChest getPlugin() {
                    int i = 1893567060 ^ (1418668221 ^ 389582885);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1689151903) {
                        int i2 = 698333339 ^ i;
                        return this.plugin;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1689151903 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1855980348 ^ i)) {
                            int i3 = 1353650602 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -676572488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1053851000 ^ i)) {
                                break;
                            }
                        }
                    }
                    int i4 = 713559611 ^ i;
                    throw new IOException();
                }

                @Generated
                public HikariDataSource getDataSource() {
                    int i = 1370890850 ^ (929659239 ^ 389582885);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1891739389) {
                        int i2 = 1185721864 ^ i;
                        return this.dataSource;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1891739389 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1676136885 ^ i)) {
                            int i3 = 742300826 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1168430783 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1943672312 ^ i)) {
                                break;
                            }
                        }
                    }
                    int i4 = 109201418 ^ i;
                    throw new RuntimeException();
                }

                @Generated
                public ConcurrentHashMap<UUID, EnderChestData> getCache() {
                    int i = 196052206 ^ (2040077675 ^ 389582885);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 678448387) {
                        int i2 = 1134587351 ^ i;
                        return this.cache;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 678448387 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (638743698 ^ i)) {
                            int i3 = 935451285 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 896738233 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1990896232 ^ i)) {
                                break;
                            }
                        }
                    }
                    int i4 = 397415174 ^ i;
                    throw new IllegalAccessException();
                }

                @Generated
                public ConcurrentHashMap<UUID, ReentrantLock> getPlayerLocks() {
                    int i = 499389258 ^ (1707345701 ^ 389582885);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2042896979) {
                        int i2 = 429433766 ^ i;
                        return this.playerLocks;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1258209437 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (381594801 ^ i)) {
                            int i3 = 1218646607 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2042896979 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1186045074 ^ i)) {
                                break;
                            }
                        }
                    }
                    int i4 = 625535381 ^ i;
                    throw new IOException();
                }

                @Generated
                public ConcurrentHashMap<UUID, Boolean> getSavingPlayers() {
                    int i = 1198483621 ^ (684473402 ^ 389582885);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -992074285) {
                        int i2 = 1650420696 ^ i;
                        return this.savingPlayers;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -992074285 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (454604718 ^ i)) {
                            int i3 = 742688189 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -702186736 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1553169847 ^ i)) {
                                break;
                            }
                        }
                    }
                    int i4 = 1072305489 ^ i;
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
                    foemrqjfur = ByteBuffer.wrap(loadnldscxbgaol()).asCharBuffer().toString();
                    d3HMOOy0E2 = (-219196451) ^ new Random(-2366215808612436274L).nextInt();
                }

                public static String elrkeapkbn(byte[] bArr, int i) {
                    byte[] bytes = Integer.toString(i).getBytes();
                    int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
                    byte[] bytes2 = foemrqjfur.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
                    int i4 = 0;
                    while (true) {
                        int i5 = i4;
                        if (i5 >= bytes2.length) {
                            return new String(bytes2, StandardCharsets.UTF_16BE);
                        }
                        bytes2[i5] = (byte) (bytes2[i5] ^ bytes[i5 % bytes.length]);
                        i4 = i5 + 1;
                    }
                }

                private static byte[] qrjrrkwtyenkvdo() {
                    return new byte[]{0, 0, 0, 52, 0, 0, 0, 0};
                }

                private static byte[] bbexzpkddfpwkzb() {
                    return new byte[]{0, 0, 0, 52, 0, 0, 0, 52};
                }

                private static byte[] mwguifydwcwekgq() {
                    return new byte[]{0, 0, 1, 57, 0, 0, 0, 104};
                }

                private static byte[] wmbznqcjlqdtjpy() {
                    return new byte[]{0, 0, 1, 57, 0, 0, 1, -95};
                }

                private static byte[] rjfwlpnibkeixck() {
                    return new byte[]{0, 0, 0, 73, 0, 0, 2, -38};
                }

                private static byte[] fovafzcvuvtlrzc() {
                    return new byte[]{0, 0, 0, 14, 0, 0, 3, 35};
                }

                private static byte[] dwfagjhgnukpoxf() {
                    return new byte[]{0, 0, 0, 73, 0, 0, 3, 49};
                }

                private static byte[] vidfkaijnjrbkws() {
                    return new byte[]{0, 0, 0, 4, 0, 0, 3, 122};
                }

                private static byte[] cbmymnxiqpeqxdx() {
                    return new byte[]{0, 0, 0, 8, 0, 0, 3, 126};
                }

                private static byte[] pxlxctiggrhzgro() {
                    return new byte[]{0, 0, 0, 14, 0, 0, 3, -122};
                }

                private static byte[] llsvdidhedrptng() {
                    return new byte[]{0, 0, 0, 4, 0, 0, 3, -108};
                }

                private static byte[] huxtifdtvwqoova() {
                    return new byte[]{0, 0, 0, 17, 0, 0, 3, -104};
                }

                private static byte[] gfbnlshhzxlszjl() {
                    return new byte[]{0, 0, 0, 3, 0, 0, 3, -87};
                }

                private static byte[] roijeyopfwtgayi() {
                    return new byte[]{0, 0, 0, 21, 0, 0, 3, -84};
                }

                private static byte[] zskgjcawkhkkwuf() {
                    return new byte[]{0, 0, 0, 4, 0, 0, 3, -63};
                }

                private static byte[] bunudmdkomdidne() {
                    return new byte[]{0, 0, 0, 14, 0, 0, 3, -59};
                }

                private static byte[] trkzgjmnqpwyczv() {
                    return new byte[]{0, 0, 0, 98, 0, 0, 3, -45};
                }

                private static byte[] pefjfzmafmweqly() {
                    return new byte[]{0, 0, 0, 32, 0, 0, 4, 53};
                }

                private static byte[] jefuenxtenkboui() {
                    return new byte[]{0, 0, 0, 96, 0, 0, 4, 85};
                }

                private static byte[] fpjvcesigniswpd() {
                    return new byte[]{0, 0, 0, -24, 0, 0, 4, -75};
                }

                private static byte[] ambcjguvkcnkrpx() {
                    return new byte[]{0, 0, 0, 98, 0, 0, 5, -99};
                }

                private static byte[] xpsrfkvpxyinbgq() {
                    return new byte[]{0, 0, 0, -24, 0, 0, 5, -1};
                }

                private static byte[] kmwmuvkzfmbojbp() {
                    return new byte[]{0, 0, 0, 96, 0, 0, 6, -25};
                }

                private static byte[] vqpvhwmsjhkgcng() {
                    return new byte[]{0, 0, 1, 57, 0, 0, 7, 71};
                }

                private static byte[] sjbppdpahyjuevd() {
                    return new byte[]{0, 0, 1, 57, 0, 0, 8, Byte.MIN_VALUE};
                }

                private static byte[] loadnldscxbgaol() {
                    return new byte[]{49, 118, 50, 115, 56, 117, 51, 112, 51, 101, 49, 119, 50, 22, 56, Byte.MAX_VALUE, 51, 103, 51, 126, 49, Byte.MAX_VALUE, 50, 22, 56, 73, 51, 89, 51, 80, 49, 75, 50, 83, 56, 75, 51, 106, 51, 84, 49, 92, 50, 82, 56, 92, 51, 71, 51, 82, 49, 90, 50, 83, 56, 74, 51, 65, 51, 66, 49, 18, 50, 97, 56, 113, 51, 112, 51, 99, 49, 119, 50, 22, 56, 73, 51, 89, 51, 80, 49, 75, 50, 83, 56, 75, 51, 106, 51, 68, 49, 71, 50, 95, 56, 93, 51, 21, 51, 12, 49, 18, 50, 9, 56, 116, 52, 115, 57, Byte.MAX_VALUE, 50, 116, 54, 108, 48, 113, 54, 25, 51, 116, 49, 100, 56, Byte.MAX_VALUE, 52, 123, 57, 19, 50, 65, 54, 84, 48, 85, 54, 64, 51, 87, 49, 68, 56, 111, 52, 83, 57, 93, 50, 85, 54, 93, 48, 70, 54, 90, 51, 90, 49, 83, 56, 67, 52, 66, 57, 64, 50, 17, 54, 111, 48, 124, 54, 124, 51, 96, 49, 115, 56, 16, 52, 70, 57, 95, 50, 80, 54, 65, 48, 81, 54, 75, 51, 109, 49, 67, 56, 69, 52, 95, 57, 87, 50, 17, 54, 5, 48, 20, 54, 6, 49, 113, 50, 123, 53, 107, 57, 115, 54, 102, 49, 108, 50, 21, 53, 113, 57, 120, 54, 96, 49, 119, 50, 21, 53, 72, 57, 90, 54, 85, 49, 65, 50, 80, 53, 74, 57, 105, 54, 81, 49, 86, 50, 81, 53, 93, 57, 68, 54, 87, 49, 80, 50, 80, 53, 75, 57, 66, 54, 71, 49, 24, 50, 29, 53, 72, 57, 90, 54, 85, 49, 65, 50, 80, 53, 74, 57, 105, 54, 65, 49, 77, 50, 92, 53, 92, 57, 26, 54, 20, 49, 72, 50, 89, 53, 89, 57, 79, 54, 81, 49, 74, 50, 106, 53, 86, 57, 87, 54, 89, 49, 93, 50, 25, 53, 24, 57, 95, 54, 90, 49, 78, 50, 80, 53, 86, 57, 66, 54, 91, 49, 74, 50, 76, 53, 103, 57, 82, 54, 85, 49, 76, 50, 84, 53, 20, 57, 22, 54, 71, 49, 81, 50, 79, 53, 93, 57, 26, 54, 20, 49, 84, 50, 84, 53, 75, 57, 66, 54, 107, 49, 77, 50, 69, 53, 92, 57, 87, 54, 64, 49, 93, 50, 81, 53, 17, 57, 22, 54, 98, 49, 121, 50, 121, 53, 109, 57, 115, 54, 103, 49, 24, 50, 29, 53, 7, 57, 26, 54, 20, 49, 7, 50, 25, 53, 24, 57, 9, 54, 24, 49, 24, 50, 10, 53, 20, 57, 22, 54, 71, 49, 76, 50, 71, 53, 94, 57, 66, 54, 93, 49, 85, 50, 80, 53, 16, 57, 17, 54, 17, 49, 75, 50, 18, 53, 20, 57, 22, 54, 19, 49, 86, 50, 90, 53, 79, 57, 17, 54, 29, 49, 17, 50, 21, 53, 119, 57, 120, 54, 20, 49, 123, 50, 122, 53, 118, 57, 112, 54, 120, 49, 113, 50, 118, 53, 108, 57, 22, 54, 28, 49, 72, 50, 89, 53, 89, 57, 79, 54, 81, 49, 74, 50, 106, 53, 77, 57, 67, 54, 93, 49, 92, 50, 28, 53, 24, 57, 114, 54, 123, 49, 24, 50, 96, 53, 104, 57, 114, 54, 117, 49, 108, 50, 112, 53, 24, 57, 101, 54, 113, 49, 108, 50, 21, 53, 72, 57, 90, 54, 85, 49, 65, 50, 80, 53, 74, 57, 105, 54, 90, 49, 89, 50, 88, 53, 93, 57, 22, 54, 9, 49, 24, 50, 80, 53, 64, 57, 85, 54, 88, 49, 77, 50, 81, 53, 93, 57, 82, 54, 26, 49, 72, 50, 89, 53, 89, 57, 79, 54, 81, 49, 74, 50, 106, 53, 86, 57, 87, 54, 89, 49, 93, 50, 25, 53, 24, 57, 95, 54, 90, 49, 78, 50, 80, 53, 86, 57, 66, 54, 91, 49, 74, 50, 76, 53, 103, 57, 82, 54, 85, 49, 76, 50, 84, 53, 24, 57, 11, 54, 20, 49, 93, 50, 77, 53, 91, 57, 90, 54, 65, 49, 92, 50, 80, 53, 92, 57, 24, 54, 93, 49, 86, 50, 67, 53, 93, 57, 88, 54, 64, 49, 87, 50, 71, 53, 65, 57, 105, 54, 80, 49, 89, 50, 65, 53, 89, 57, 26, 54, 20, 49, 75, 50, 92, 53, 66, 57, 83, 54, 20, 49, 5, 50, 21, 53, 93, 57, 78, 54, 87, 49, 84, 50, 64, 53, 92, 57, 83, 54, 80, 49, 22, 50, 70, 53, 81, 57, 76, 54, 81, 49, 20, 50, 21, 53, 84, 57, 87, 54, 71, 49, 76, 50, 106, 53, 77, 57, 70, 54, 80, 49, 89, 50, 65, 53, 93, 57, 82, 54, 20, 49, 5, 50, 21, 53, 75, 57, 66, 54, 70, 49, 94, 50, 65, 53, 81, 57, 91, 54, 81, 49, 16, 50, 18, 53, 29, 57, 69, 54, 19, 49, 20, 50, 21, 53, 31, 57, 88, 54, 91, 49, 79, 50, 18, 53, 17, 49, 113, 51, 123, 56, 97, 52, 118, 53, 96, 49, 108, 51, 21, 56, 123, 52, 125, 53, 102, 49, 119, 51, 21, 56, 66, 52, 95, 53, 83, 49, 65, 51, 80, 56, 64, 52, 108, 53, 87, 49, 86, 51, 81, 56, 87, 52, 65, 53, 81, 49, 80, 51, 80, 56, 65, 52, 71, 53, 65, 49, 24, 51, 29, 56, 66, 52, 95, 53, 83, 49, 65, 51, 80, 56, 64, 52, 108, 53, 71, 49, 77, 51, 92, 56, 86, 52, 31, 53, 18, 49, 72, 51, 89, 56, 83, 52, 74, 53, 87, 49, 74, 51, 106, 56, 92, 52, 82, 53, 95, 49, 93, 51, 25, 56, 18, 52, 90, 53, 92, 49, 78, 51, 80, 56, 92, 52, 71, 53, 93, 49, 74, 51, 76, 56, 109, 52, 87, 53, 83, 49, 76, 51, 84, 56, 30, 52, 19, 53, 65, 49, 81, 51, 79, 56, 87, 52, 31, 53, 18, 49, 84, 51, 84, 56, 65, 
                    52, 71, 53, 109, 49, 77, 51, 69, 56, 86, 52, 82, 53, 70, 49, 93, 51, 81, 56, 27, 52, 19, 53, 100, 49, 121, 51, 121, 56, 103, 52, 118, 53, 97, 49, 24, 51, 29, 56, 13, 52, 31, 53, 18, 49, 7, 51, 25, 56, 18, 52, 12, 53, 30, 49, 24, 51, 10, 56, 30, 52, 19, 53, 65, 49, 76, 51, 71, 56, 84, 52, 71, 53, 91, 49, 85, 51, 80, 56, 26, 52, 20, 53, 23, 49, 75, 51, 18, 56, 30, 52, 19, 53, 21, 49, 86, 51, 90, 56, 69, 52, 20, 53, 27, 49, 17, 51, 21, 56, 125, 52, 125, 53, 18, 49, 123, 51, 122, 56, 124, 52, 117, 53, 126, 49, 113, 51, 118, 56, 102, 52, 19, 53, 26, 49, 72, 51, 89, 56, 83, 52, 74, 53, 87, 49, 74, 51, 106, 56, 71, 52, 70, 53, 91, 49, 92, 51, 28, 56, 18, 52, 119, 53, 125, 49, 24, 51, 96, 56, 98, 52, 119, 53, 115, 49, 108, 51, 112, 56, 18, 52, 96, 53, 119, 49, 108, 51, 21, 56, 66, 52, 95, 53, 83, 49, 65, 51, 80, 56, 64, 52, 108, 53, 92, 49, 89, 51, 88, 56, 87, 52, 19, 53, 15, 49, 24, 51, 80, 56, 74, 52, 80, 53, 94, 49, 77, 51, 81, 56, 87, 52, 87, 53, 28, 49, 72, 51, 89, 56, 83, 52, 74, 53, 87, 49, 74, 51, 106, 56, 92, 52, 82, 53, 95, 49, 93, 51, 25, 56, 18, 52, 90, 53, 92, 49, 78, 51, 80, 56, 92, 52, 71, 53, 93, 49, 74, 51, 76, 56, 109, 52, 87, 53, 83, 49, 76, 51, 84, 56, 18, 52, 14, 53, 18, 49, 93, 51, 77, 56, 81, 52, 95, 53, 71, 49, 92, 51, 80, 56, 86, 52, 29, 53, 91, 49, 86, 51, 67, 56, 87, 52, 93, 53, 70, 49, 87, 51, 71, 56, 75, 52, 108, 53, 86, 49, 89, 51, 65, 56, 83, 52, 31, 53, 18, 49, 75, 51, 92, 56, 72, 52, 86, 53, 18, 49, 5, 51, 21, 56, 87, 52, 75, 53, 81, 49, 84, 51, 64, 56, 86, 52, 86, 53, 86, 49, 22, 51, 70, 56, 91, 52, 73, 53, 87, 49, 20, 51, 21, 56, 94, 52, 82, 53, 65, 49, 76, 51, 106, 56, 71, 52, 67, 53, 86, 49, 89, 51, 65, 56, 87, 52, 87, 53, 18, 49, 5, 51, 21, 56, 65, 52, 71, 53, 64, 49, 94, 51, 65, 56, 91, 52, 94, 53, 87, 49, 16, 51, 18, 56, 23, 52, 64, 53, 21, 49, 20, 51, 21, 56, 21, 52, 93, 53, 93, 49, 79, 51, 18, 56, 27, 50, 99, 49, 114, 52, 117, 52, 112, 49, 116, 50, 100, 49, 23, 52, 80, 52, 91, 49, 65, 50, 85, 49, 89, 52, 77, 52, 90, 49, 69, 50, 73, 49, 104, 52, 93, 52, 84, 49, 67, 50, 81, 49, 27, 52, 25, 52, 70, 49, 94, 50, 74, 49, 82, 52, 25, 52, 115, 49, 101, 50, Byte.MAX_VALUE, 49, 122, 52, 25, 52, 69, 49, 91, 50, 81, 49, 78, 52, 92, 52, 71, 49, 104, 50, 85, 49, 89, 52, 93, 52, 80, 49, 69, 50, 83, 49, 95, 52, 92, 52, 70, 49, 67, 50, 67, 49, 23, 52, 110, 52, 125, 49, 114, 50, 98, 49, 114, 52, 25, 52, 69, 49, 91, 50, 81, 49, 78, 52, 92, 52, 71, 49, 104, 50, 69, 49, 66, 52, 80, 52, 81, 49, 23, 50, 13, 49, 23, 52, 6, 50, 89, 53, 93, 57, 65, 48, 83, 52, 94, 50, 68, 53, 92, 57, 69, 48, 79, 52, 111, 50, 84, 53, 82, 57, 67, 48, 87, 49, 96, 50, 116, 48, 126, 48, 113, 50, 114, 49, 103, 50, 17, 48, 91, 48, 90, 50, 71, 49, 86, 50, 95, 48, 70, 48, 91, 50, 67, 49, 74, 50, 110, 48, 86, 48, 85, 50, 69, 49, 82, 50, 29, 48, 18, 48, 71, 50, 88, 49, 73, 50, 84, 48, 18, 48, 114, 50, 99, 49, 124, 50, 124, 48, 18, 48, 68, 50, 93, 49, 82, 50, 72, 48, 87, 48, 70, 50, 110, 49, 86, 50, 95, 48, 86, 48, 81, 50, 67, 49, 80, 50, 89, 48, 87, 48, 71, 50, 69, 49, 64, 50, 17, 48, 101, 48, 124, 50, 116, 49, 97, 50, 116, 48, 18, 48, 68, 50, 93, 49, 82, 50, 72, 48, 87, 48, 70, 50, 110, 49, 70, 50, 68, 48, 91, 48, 80, 50, 17, 49, 14, 50, 17, 48, 13, 54, 64, 52, 90, 50, 76, 51, 81, 49, 99, 52, 125, 57, 122, 48, 124, 52, 115, 49, 100, 52, 24, 57, 7, 57, 84, 57, 80, 50, 87, 50, 93, 54, 92, 55, 105, 49, 64, 52, 87, 53, 70, 57, 100, 57, 69, 50, 89, 50, 65, 54, 74, 57, 67, 57, 67, 50, 65, 50, 80, 50, 64, 49, 69, 52, 86, 56, 65, 56, 106, 50, 68, 49, 90, 52, 71, 56, 114, 56, 88, 50, 83, 49, 95, 52, 86, 56, 98, 56, 80, 50, 74, 49, 82, 50, 2, 49, 2, 52, 3, 50, 73, 56, 64, 55, 87, 57, 65, 50, 106, 56, 70, 55, 95, 57, 69, 50, 122, 56, 83, 55, 81, 57, 89, 50, 92, 56, 97, 55, 67, 57, 93, 50, 117, 56, 91, 55, 95, 57, 88, 50, 77, 50, 11, 56, 2, 55, 6, 57, 9, 56, 82, 49, 93, 55, 85, 49, 83, 52, 74, 55, 82, 51, 95, 49, 84, 54, 71, 56, 67, 49, 64, 55, 31, 49, 82, 52, 90, 55, 119, 54, 106, 57, 118, 57, 119, 57, 99, 52, 115, 56, 25, 51, 112, 54, 119, 55, 112, 54, 125, 57, 107, 57, 22, 57, 126, 52, 112, 56, 25, 51, 119, 54, 118, 55, 96, 54, 24, 57, 118, 
                    57, 110, 57, 126, 52, 101, 56, 109, 51, 106, 54, 25, 55, 93, 54, 92, 57, 75, 57, 105, 57, 71, 52, 90, 56, 88, 51, 64, 54, 92, 55, 70, 54, 103, 57, 86, 57, 88, 57, 83, 52, 83, 56, 75, 51, 90, 54, 81, 55, 81, 54, 75, 57, 71, 57, 69, 57, 104, 52, 90, 56, 88, 51, 74, 54, 77, 55, 107, 54, 77, 57, 67, 57, 82, 57, 86, 52, 66, 56, 92, 51, 93, 54, 25, 55, 123, 54, 118, 57, 19, 57, 70, 57, 91, 52, 87, 56, 64, 51, 92, 54, 75, 55, 107, 54, 93, 57, 93, 57, 82, 57, 82, 52, 68, 56, 90, 51, 81, 54, 92, 55, 71, 54, 76, 57, 64, 57, 30, 57, 91, 52, 87, 56, 74, 51, 77, 54, 102, 55, 65, 54, 72, 57, 87, 57, 87, 57, 67, 52, 83, 56, 93, 51, 16, 57, 117, 57, 83, 53, 81, 53, 90, 50, 92, 51, 93, 50, 21, 56, 65, 54, 93, 57, 19, 57, 81, 53, 74, 53, 83, 50, 88, 51, 77, 50, 80, 56, 21, 54, 86, 57, 82, 57, 70, 53, 89, 53, 84, 50, 88, 51, 74, 50, 80, 56, 21, 54, 70, 57, 82, 57, 80, 53, 84, 53, 83, 50, 24, 50, 114, 52, 103, 54, 124, 50, 116, 52, 98, 50, 116, 52, 21, 54, 112, 50, 123, 52, 114, 50, 116, 52, 109, 54, 25, 50, 124, 52, 112, 50, 17, 52, 123, 54, 118, 50, 97, 52, 22, 50, 116, 52, 109, 54, 112, 50, 102, 52, 98, 50, 98, 52, 21, 54, 80, 50, 81, 52, 78, 50, 110, 52, 69, 54, 85, 50, 84, 52, 79, 50, 84, 52, 71, 54, 102, 50, 80, 52, 88, 50, 85, 52, 80, 54, 75, 50, 86, 52, 94, 50, 84, 52, 70, 54, 77, 50, 70, 52, 105, 50, 65, 52, 89, 54, 88, 50, 76, 52, 83, 50, 67, 52, 106, 54, 87, 50, 84, 52, 91, 50, 84, 52, 21, 54, 118, 50, 123, 52, 22, 50, 65, 52, 89, 54, 88, 50, 76, 52, 83, 50, 67, 52, 106, 54, 92, 50, 91, 52, 82, 50, 84, 52, 71, 54, 90, 50, 93, 52, 83, 50, 66, 52, 65, 54, 74, 50, 29, 52, 70, 50, 93, 52, 84, 54, 64, 50, 80, 52, 68, 50, 110, 52, 91, 54, 88, 50, 88, 52, 83, 50, 24, 49, 119, 56, 97, 49, 112, 53, 117, 55, 103, 49, 113, 56, 19, 49, 97, 53, 117, 55, 113, 49, 120, 56, 118, 49, 21, 53, 125, 55, 117, 49, 20, 56, 125, 49, 122, 53, 96, 55, 19, 49, 113, 56, 107, 49, 124, 53, 103, 55, 103, 49, 103, 56, 19, 49, 69, 53, 88, 55, 82, 49, 77, 56, 86, 49, 71, 53, 107, 55, 86, 49, 90, 56, 87, 49, 80, 53, 70, 55, 80, 49, 92, 56, 86, 49, 70, 53, 64, 55, 64, 49, 20, 56, 27, 49, 69, 53, 88, 55, 82, 49, 77, 56, 86, 49, 71, 53, 107, 55, 70, 49, 65, 56, 90, 49, 81, 53, 20, 55, 103, 49, 113, 56, 107, 49, 97, 53, 20, 55, 99, 49, 102, 56, 122, 49, 120, 53, 117, 55, 97, 49, 109, 56, 19, 49, 126, 53, 113, 55, 106, 49, 24, 56, 19, 49, 69, 53, 88, 55, 82, 49, 77, 56, 86, 49, 71, 53, 107, 55, 93, 49, 85, 56, 94, 49, 80, 53, 20, 55, 103, 49, 113, 56, 107, 49, 97, 53, 20, 55, 125, 49, 123, 56, 103, 49, 21, 53, 122, 55, 102, 49, 120, 56, Byte.MAX_VALUE, 49, 25, 53, 20, 55, 90, 49, 90, 56, 69, 49, 80, 53, 90, 55, 71, 49, 91, 56, 65, 49, 76, 53, 107, 55, 87, 49, 85, 56, 71, 49, 84, 53, 20, 55, 103, 49, 113, 56, 107, 49, 97, 53, 20, 55, 125, 49, 123, 56, 103, 49, 21, 53, 122, 55, 102, 49, 120, 56, Byte.MAX_VALUE, 49, 21, 53, 112, 55, 118, 49, 114, 56, 114, 49, 96, 53, 120, 55, 103, 49, 20, 56, 20, 49, 18, 53, 24, 55, 19, 49, 71, 56, 90, 49, 79, 53, 81, 55, 19, 49, 125, 56, 125, 49, 97, 53, 113, 55, 116, 49, 113, 56, 97, 49, 21, 53, 122, 55, 124, 49, 96, 56, 19, 49, 123, 53, 97, 55, Byte.MAX_VALUE, 49, 120, 56, 19, 49, 113, 53, 113, 55, 117, 49, 117, 56, 102, 49, 121, 53, 96, 55, 19, 49, 6, 56, 4, 49, 25, 53, 20, 55, 95, 49, 85, 56, 64, 49, 65, 53, 107, 55, 70, 49, 68, 56, 87, 49, 84, 53, 64, 55, 86, 49, 80, 56, 19, 49, 124, 53, 122, 55, 103, 49, 113, 56, 116, 49, 112, 53, 102, 55, 19, 49, 112, 56, 118, 49, 115, 53, 117, 55, 102, 49, 120, 56, 103, 49, 21, 53, 28, 55, 64, 49, 64, 56, 65, 49, 83, 53, 64, 55, 90, 49, 89, 56, 86, 49, 29, 53, 19, 55, 22, 49, 71, 56, 20, 49, 25, 53, 20, 55, 20, 49, 90, 56, 92, 49, 66, 53, 19, 55, 26, 49, 29, 56, 26, 50, 115, 50, 102, 50, 116, 48, 116, 48, 108, 50, 117, 50, 20, 50, 120, 48, 123, 48, 124, 50, 117, 50, 108, 50, 17, 48, 124, 48, 126, 50, 16, 50, 122, 50, 126, 48, 97, 48, 24, 50, 117, 50, 108, 50, 120, 48, 102, 48, 108, 50, 99, 50, 20, 50, 88, 48, 81, 48, 64, 50, 111, 50, 68, 50, 93, 48, 84, 48, 65, 50, 85, 50, 70, 50, 110, 48, 80, 48, 86, 50, 84, 50, 81, 50, 67, 48, 86, 48, 80, 50, 85, 50, 71, 50, 69, 48, 70, 48, 103, 50, 92, 50, 85, 50, 66, 48, 65, 48, 103, 50, 69, 50, 68, 50, 85, 48, 84, 48, 76, 50, 85, 50, 80, 50, 17, 
                    48, 122, 48, 118, 50, 16, 50, 68, 50, 93, 48, 84, 48, 65, 50, 85, 50, 70, 50, 110, 48, 80, 48, 86, 50, 84, 50, 81, 50, 67, 48, 86, 48, 80, 50, 85, 50, 71, 50, 69, 48, 70, 48, 16, 50, 92, 50, 85, 50, 66, 48, 65, 48, 103, 50, 69, 50, 68, 50, 85, 48, 84, 48, 76, 50, 85, 50, 80, 50, 24, 49, 116, 53, 100, 51, 118, 50, 115, 49, 100, 49, 114, 53, 22, 51, 103, 50, 115, 49, 114, 49, 123, 53, 115, 51, 19, 50, 123, 49, 118, 49, 23, 53, 120, 51, 124, 50, 102, 49, 16, 49, 114, 53, 110, 51, 122, 50, 97, 49, 100, 49, 100, 53, 22, 51, 67, 50, 94, 49, 81, 49, 78, 53, 83, 51, 65, 50, 109, 49, 85, 49, 89, 53, 82, 51, 86, 50, 64, 49, 83, 49, 95, 53, 83, 51, 64, 50, 70, 49, 67, 49, 23, 53, 30, 51, 67, 50, 94, 49, 81, 49, 78, 53, 83, 51, 65, 50, 109, 49, 69, 49, 66, 53, 95, 51, 87, 50, 18, 49, 100, 49, 114, 53, 110, 51, 103, 50, 18, 49, 96, 49, 101, 53, Byte.MAX_VALUE, 51, 126, 50, 115, 49, 98, 49, 110, 53, 22, 51, 120, 50, 119, 49, 105, 49, 27, 53, 22, 51, 67, 50, 94, 49, 81, 49, 78, 53, 83, 51, 65, 50, 109, 49, 94, 49, 86, 53, 91, 51, 86, 50, 18, 49, 100, 49, 114, 53, 110, 51, 103, 50, 18, 49, 126, 49, 120, 53, 98, 51, 19, 50, 124, 49, 101, 49, 123, 53, 122, 51, 31, 50, 18, 49, 89, 49, 89, 53, 64, 51, 86, 50, 92, 49, 68, 49, 88, 53, 68, 51, 74, 50, 109, 49, 84, 49, 86, 53, 66, 51, 82, 50, 18, 49, 100, 49, 114, 53, 110, 51, 103, 50, 18, 49, 126, 49, 120, 53, 98, 51, 19, 50, 124, 49, 101, 49, 123, 53, 122, 51, 19, 50, 118, 49, 117, 49, 113, 53, 119, 51, 102, 50, 126, 49, 100, 49, 23, 53, 17, 51, 20, 50, 30, 49, 16, 49, 68, 53, 95, 51, 73, 50, 87, 49, 16, 49, 126, 53, 120, 51, 103, 50, 119, 49, 119, 49, 114, 53, 100, 51, 19, 50, 124, 49, Byte.MAX_VALUE, 49, 99, 53, 22, 51, 125, 50, 103, 49, 124, 49, 123, 53, 22, 51, 119, 50, 119, 49, 118, 49, 118, 53, 99, 51, Byte.MAX_VALUE, 50, 102, 49, 16, 49, 5, 53, 1, 51, 31, 50, 18, 49, 92, 49, 86, 53, 69, 51, 71, 50, 109, 49, 69, 49, 71, 53, 82, 51, 82, 50, 70, 49, 85, 49, 83, 53, 22, 51, 122, 50, 124, 49, 100, 49, 114, 53, 113, 51, 118, 50, 96, 49, 16, 49, 115, 53, 115, 51, 117, 50, 115, 49, 101, 49, 123, 53, 98, 51, 19, 50, 26, 49, 67, 49, 67, 53, 68, 51, 85, 50, 70, 49, 89, 49, 90, 53, 83, 51, 27, 50, 21, 49, 21, 49, 68, 53, 17, 51, 31, 50, 18, 49, 23, 49, 89, 53, 89, 51, 68, 50, 21, 49, 25, 49, 30, 53, 31, 49, 117, 54, 103, 55, 124, 56, 118, 53, 96, 49, 115, 54, 21, 55, 112, 56, 121, 53, 112, 49, 115, 54, 109, 55, 25, 56, 126, 53, 114, 49, 22, 54, 123, 55, 118, 56, 99, 53, 20, 49, 115, 54, 109, 55, 112, 56, 100, 53, 96, 49, 101, 54, 21, 55, 80, 56, 83, 53, 76, 49, 105, 54, 69, 55, 85, 56, 86, 53, 77, 49, 83, 54, 71, 55, 102, 56, 82, 53, 90, 49, 82, 54, 80, 55, 75, 56, 84, 53, 92, 49, 83, 54, 70, 55, 77, 56, 68, 53, 107, 49, 70, 54, 89, 55, 88, 56, 78, 53, 81, 49, 68, 54, 106, 55, 87, 56, 86, 53, 89, 49, 83, 54, 21, 55, 118, 56, 121, 53, 20, 49, 70, 54, 89, 55, 88, 56, 78, 53, 81, 49, 68, 54, 106, 55, 92, 56, 89, 53, 80, 49, 83, 54, 71, 55, 90, 56, 95, 53, 81, 49, 69, 54, 65, 55, 74, 56, 31, 53, 68, 49, 90, 54, 84, 55, 64, 56, 82, 53, 70, 49, 105, 54, 91, 55, 88, 56, 90, 53, 81, 49, 31, 51, 124, 53, 126, 52, 100, 53, 125, 52, 97, 53, 97, 48, 20, 55, 124, 56, 122, 51, 97, 53, Byte.MAX_VALUE, 52, 23, 53, 72, 52, 95, 53, 84, 48, 77, 55, 80, 56, 70, 51, 106, 53, 85, 52, 89, 53, 92, 52, 86, 53, 71, 48, 87, 55, 93, 56, 81, 51, 70, 53, 68, 52, 68, 53, 24, 52, 27, 53, 69, 48, 88, 55, 84, 56, 77, 51, 80, 53, 66, 52, 104, 53, 77, 52, 70, 53, 92, 48, 80, 55, 25, 56, 20, 51, 69, 53, 92, 52, 86, 53, 65, 52, 86, 53, 71, 48, 107, 55, 91, 56, 85, 51, 88, 53, 85, 52, 27, 53, 24, 52, 90, 53, 91, 48, 66, 55, 80, 56, 90, 51, 65, 53, 95, 52, 69, 53, 65, 52, 108, 53, 81, 48, 85, 55, 65, 56, 85, 51, 25, 53, 16, 52, 68, 53, 81, 52, 73, 53, 80, 48, 24, 55, 21, 56, 88, 51, 84, 53, 67, 52, 67, 53, 103, 52, 70, 53, 69, 48, 80, 55, 84, 56, 64, 51, 80, 53, 84, 52, 30, 53, 24, 52, 101, 53, 116, 48, 120, 55, 96, 56, 113, 51, 102, 53, 16, 52, 31, 53, 7, 52, 31, 53, 21, 48, 11, 55, 25, 56, 20, 51, 10, 53, 28, 52, 23, 53, 7, 52, 31, 53, 21, 48, 71, 55, 65, 56, 70, 51, 83, 53, 68, 52, 94, 53, 85, 52, 86, 53, 29, 48, 19, 55, 16, 56, 71, 51, 18, 53, 28, 52, 23, 53, 31, 52, 93, 53, 90, 48, 67, 55, 18, 56, 29, 51, 28, 53, 16, 
                    52, 120, 53, 118, 52, 19, 53, 118, 48, 123, 55, 123, 56, 114, 51, 121, 53, 121, 52, 116, 53, 108, 52, 19, 53, 29, 48, 68, 55, 89, 56, 85, 51, 76, 53, 85, 52, 69, 53, 103, 52, 70, 53, 64, 48, 93, 55, 81, 56, 29, 51, 21, 53, 116, 52, 120, 53, 24, 52, 102, 53, 101, 48, 112, 55, 116, 56, 96, 51, 112, 53, 16, 52, 100, 53, 125, 52, 103, 53, 21, 48, 68, 55, 89, 56, 85, 51, 76, 53, 85, 52, 69, 53, 103, 52, 93, 53, 84, 48, 89, 55, 80, 56, 20, 51, 8, 53, 16, 52, 82, 53, 64, 52, 80, 53, 89, 48, 65, 55, 81, 56, 81, 51, 81, 53, 30, 52, 71, 53, 84, 52, 82, 53, 76, 48, 81, 55, 71, 56, 107, 51, 91, 53, 81, 52, 90, 53, 93, 52, 31, 53, 21, 48, 93, 55, 91, 56, 66, 51, 80, 53, 94, 52, 67, 53, 87, 52, 65, 53, 76, 48, 107, 55, 81, 56, 85, 51, 65, 53, 81, 52, 23, 53, 5, 52, 19, 53, 80, 48, 76, 55, 86, 56, 88, 51, 64, 53, 84, 52, 82, 53, 92, 52, 29, 53, 92, 48, 90, 55, 67, 56, 81, 51, 91, 53, 68, 52, 88, 53, 74, 52, 74, 53, 106, 48, 80, 55, 84, 56, 64, 51, 84, 53, 28, 52, 23, 53, 75, 52, 90, 53, 79, 48, 81, 55, 21, 56, 9, 51, 21, 53, 85, 52, 79, 53, 91, 52, 95, 53, 64, 48, 80, 55, 80, 56, 80, 51, 27, 53, 67, 52, 94, 53, 66, 52, 86, 53, 25, 48, 20, 55, 89, 56, 85, 51, 70, 53, 68, 52, 104, 53, 77, 52, 67, 53, 81, 48, 85, 55, 65, 56, 81, 51, 81, 53, 16, 52, 10, 53, 24, 52, 64, 53, 65, 48, 70, 55, 83, 56, 64, 51, 92, 53, 93, 52, 82, 53, 16, 52, 20, 53, 16, 48, 71, 55, 18, 56, 24, 51, 21, 53, 23, 52, 89, 53, 87, 52, 68, 53, 18, 48, 29, 54, Byte.MAX_VALUE, 52, 125, 49, 102, 52, 113, 55, 100, 54, 96, 51, 17, 53, 125, 52, 121, 54, 98, 52, 124, 49, 21, 52, 68, 55, 90, 54, 85, 51, 72, 53, 81, 52, 69, 54, 105, 52, 86, 49, 91, 52, 80, 55, 83, 54, 70, 51, 82, 53, 92, 52, 82, 54, 69, 52, 71, 49, 70, 52, 20, 55, 30, 54, 68, 51, 93, 53, 85, 52, 78, 54, 83, 52, 65, 49, 106, 52, 65, 55, 67, 54, 93, 51, 85, 53, 24, 52, 23, 54, 70, 52, 95, 49, 84, 52, 77, 55, 83, 54, 70, 51, 110, 53, 90, 52, 86, 54, 91, 52, 86, 49, 25, 52, 20, 55, 95, 54, 90, 51, 71, 53, 81, 52, 89, 54, 66, 52, 92, 49, 71, 52, 77, 55, 105, 54, 80, 51, 80, 53, 64, 52, 86, 54, 26, 52, 19, 49, 70, 52, 93, 55, 76, 54, 81, 51, 29, 53, 20, 52, 91, 54, 87, 52, 64, 49, 65, 52, 107, 55, 67, 54, 68, 51, 85, 53, 85, 52, 67, 54, 83, 52, 87, 49, 28, 52, 20, 55, 96, 54, 117, 51, 125, 53, 97, 52, 114, 54, 101, 52, 19, 49, 29, 52, 11, 55, 26, 54, 20, 51, 14, 53, 24, 52, 23, 54, 9, 52, 31, 49, 21, 52, 11, 55, 26, 54, 20, 51, 66, 53, 64, 52, 69, 54, 80, 52, 71, 49, 92, 52, 89, 55, 83, 54, 28, 51, 22, 53, 17, 52, 68, 54, 17, 52, 31, 49, 21, 52, 19, 55, 88, 54, 91, 51, 70, 53, 19, 52, 30, 54, 31, 52, 19, 49, 122, 52, 122, 55, 22, 54, 119, 51, 126, 53, 122, 52, 113, 54, 122, 52, 122, 49, 118, 52, 96, 55, 22, 54, 28, 51, 65, 53, 88, 52, 86, 54, 79, 52, 86, 49, 71, 52, 107, 55, 67, 54, 65, 51, 88, 53, 80, 52, 30, 54, 22, 52, 119, 49, 122, 52, 20, 55, 99, 54, 100, 51, 117, 53, 117, 52, 99, 54, 115, 52, 19, 49, 102, 52, 113, 55, 98, 54, 20, 51, 65, 53, 88, 52, 86, 54, 79, 52, 86, 49, 71, 52, 107, 55, 88, 54, 85, 51, 92, 53, 81, 52, 23, 54, 11, 52, 19, 49, 80, 52, 76, 55, 85, 54, 88, 51, 68, 53, 80, 52, 82, 54, 82, 52, 29, 49, 69, 52, 88, 55, 87, 54, 77, 51, 84, 53, 70, 52, 104, 54, 88, 52, 82, 49, 88, 52, 81, 55, 26, 54, 20, 51, 88, 53, 90, 52, 65, 54, 83, 52, 93, 49, 65, 52, 91, 55, 68, 54, 77, 51, 110, 53, 80, 52, 86, 54, 66, 52, 82, 49, 21, 52, 9, 55, 22, 54, 81, 51, 73, 53, 87, 52, 91, 54, 67, 52, 87, 49, 80, 52, 80, 55, 24, 54, 93, 51, 95, 53, 66, 52, 82, 54, 88, 52, 71, 49, 90, 52, 70, 55, 79, 54, 107, 51, 85, 53, 85, 52, 67, 54, 87, 52, 31, 49, 21, 52, 71, 55, 95, 54, 78, 51, 84, 53, 20, 52, 10, 54, 22, 52, 86, 49, 77, 52, 87, 55, 90, 54, 65, 51, 85, 53, 81, 52, 83, 54, 24, 52, 64, 49, 92, 52, 78, 55, 83, 54, 24, 51, 17, 53, 88, 52, 86, 54, 69, 52, 71, 49, 106, 52, 65, 55, 70, 54, 80, 51, 80, 53, 64, 52, 82, 54, 82, 52, 19, 49, 8, 52, 20, 55, 69, 54, 64, 51, 67, 53, 82, 52, 67, 54, 95, 52, 94, 49, 80, 52, 28, 55, 17, 54, 17, 51, 66, 53, 19, 52, 27, 54, 22, 52, 20, 49, 91, 52, 91, 55, 65, 54, 19, 51, 24};
                }

                private static int snprijvetnnkpmgs(int i, int i2) {
                    return i2 ^ i;
                }
            }
