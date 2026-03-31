package com.kammoun.donutCore.rtp.config;

import com.kammoun.donutCore.rtp.model.TeleportRegion;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import lombok.Generated;
import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffectType;

public class ConfigManager {
    private final JavaPlugin plugin;
    private final File configFile;
    private FileConfiguration config;
    private long cooldownTime;
    private long warmupTime;
    private int maxAttempts;
    private int maxQueueSize;
    private boolean cancelOnMove;
    private boolean cancelOnDamage;
    private boolean cancelOnTeleport;
    private boolean enableQueue;
    private boolean enableCooldown;
    private boolean enableWarmup;
    private final Map<String, TeleportRegion> regions;
    private final Map<String, String> messages;
    private final Set<Material> blacklistedBlocks;
    private final Set<Biome> blacklistedBiomes;
    private final List<TeleportEffect> teleportEffects;
    private static int Skk6ArfSO8 = 0;
    private transient int sFsWUdvWQV = 695020922;
    private static byte[] ipqhzkmndg;
    private static String[] nothing_to_see_here = new String[19];

    public static class TeleportEffect {
        private final PotionEffectType type;
        private final int level;
        private final int seconds;
        private static int E7htTbHRqj = 0;
        private transient int S1So5938pH = 1232279507;
        private static byte[] rfrthctfds;
        private static String[] nothing_to_see_here = new String[18];

        public TeleportEffect(PotionEffectType potionEffectType, int i, int i2, int i3) {
            int i4 = 1670977491 ^ (1529641954 ^ 2086479676);
            int parseInt = 943247810 ^ (571721658 ^ Integer.parseInt("1589861749"));
            this.S1So5938pH = 1232279507 ^ E7htTbHRqj;
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                    case 92427649:
                        parseInt = 1353870348 ^ parseInt;
                        break;
                    case 168229051:
                    case 212842556:
                    default:
                        throw new RuntimeException();
                    case 1739767204:
                        break;
                }
            }
            this.type = potionEffectType;
            this.level = i;
            this.seconds = i2;
            int i5 = 609696370 ^ (775552472 ^ (144938253 ^ (783608290 ^ parseInt)));
        }

        @Generated
        public PotionEffectType getType(int i) {
            int i2 = 521190956 ^ (1243506217 ^ 229187767);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -985676398) {
                int i3 = 681543136 ^ i2;
                return this.type;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -985676398 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (468919054 ^ i2)) {
                    int i4 = 1696501542 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2117866861 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2129472504 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 30050301 ^ i2;
            throw new IOException();
        }

        @Generated
        public int getLevel(int i) {
            int i2 = 1948066992 ^ (568687943 ^ 229187767);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1031026174) {
                int i3 = 171069142 ^ i2;
                return this.level;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1827029838 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1736609875 ^ i2)) {
                    int i4 = 2048265643 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1031026174 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (324271692 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1515743246 ^ i2;
            throw new IllegalAccessException();
        }

        @Generated
        public int getSeconds(int i) {
            int i2 = 887305099 ^ (2002515661 ^ 229187767);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1888432010) {
                int i3 = 1598122616 ^ i2;
                return this.seconds;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1888432010 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (78297651 ^ i2)) {
                    int i4 = 923682286 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1971028920 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (421308315 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 698980972 ^ i2;
            throw new RuntimeException();
        }

        static {
            nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[1] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣶⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[2] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⠿⠟⠛⠻⣿⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[3] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣆⣀⣀⠀⣿⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[4] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠻⣿⣿⣿⠅⠛⠋⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[5] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢼⣿⣿⣿⣃⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[6] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣟⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[7] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣛⣛⣫⡄⠀⢸⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[8] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⡆⠸⣿⣿⣿⡷⠂⠨⣿⣿⣿⣿⣶⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣾⣿⣿⣿⣿⡇⢀⣿⡿⠋⠁⢀⡶⠪⣉⢸⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⡏⢸⣿⣷⣿⣿⣷⣦⡙⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣇⢸⣿⣿⣿⣿⣿⣷⣦⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[15] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[16] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[17] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣵⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            rfrthctfds = zcmhveetpsqgszn();
            E7htTbHRqj = 677037455 ^ new Random(-9078223521921697369L).nextInt();
        }

        public static String nlmfpardcv(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= bArr.length) {
                    return new String(bArr, StandardCharsets.UTF_16);
                }
                bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                bArr[i3] = (byte) (bArr[i3] ^ rfrthctfds[i3 % rfrthctfds.length]);
                i2 = i3 + 1;
            }
        }

        private static byte[] zcmhveetpsqgszn() {
            return new byte[]{69, 11, 117, 96, 53, 24, 51, 62, 38, 101, 109, 31, 7, Byte.MAX_VALUE, 95, 41, 6, 47};
        }
    }

    public ConfigManager(org.bukkit.plugin.java.JavaPlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.config.ConfigManager.<init>(org.bukkit.plugin.java.JavaPlugin, int):void");
    }

    public void loadConfig(int i) {
        int i2;
        int i3 = 955714511 ^ (725943492 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -93340192) {
            int i4 = 1180572800 ^ i3;
            if (this.configFile.exists() == (1494477628 ^ i4)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -929080862) {
                    i3 = 2048644900 ^ i4;
                    this.configFile.getParentFile().mkdirs();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 406970561) {
                        i2 = 1372142884 ^ i3;
                        this.plugin.saveResource(eemelnjcqi(uxcvcqzpatxdcwd(), i2), (byte) (1925251388 ^ i2));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1777858077) {
                            i4 = 1467889464 ^ i2;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1553601757 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (136017067 ^ i2)) {
                                int i5 = 727437439 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1777858077 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1642076135 ^ i2)) {
                                    break;
                                }
                            }
                        }
                        int i6 = 321858311 ^ i2;
                        throw new RuntimeException("double");
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 771338273 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (880519429 ^ i4)) {
                        int i7 = 1344074346 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 946292472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1031242786 ^ i4)) {
                            int i8 = 2011816820 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -929080862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1080378785 ^ i4)) {
                                int i9 = 2044110774 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2069890707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (990542505 ^ i4)) {
                                    int i10 = 685822430 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -245464510 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1627544567 ^ i4)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                int i11 = 1219063095 ^ i4;
                throw new IllegalAccessException("double");
            }
            i4 = laaqlswfvfjfbbng(i4, 2091703608);
            this.config = YamlConfiguration.loadConfiguration(this.configFile);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 771338273) {
                i3 = 1280523341 ^ i4;
                this.cooldownTime = this.config.getLong(eemelnjcqi(ytujdexcoywzhsv(), i3), 300L);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1331712587) {
                    i3 = 1371260703 ^ i3;
                    this.warmupTime = this.config.getLong(eemelnjcqi(ssadoqhncdfebsx(), i3), 5L);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1027708239) {
                        i4 = 1719409950 ^ i3;
                        this.maxAttempts = this.config.getInt(eemelnjcqi(kcvtddbudlufrgl(), i4), (byte) (1579929666 ^ i4));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -245464510) {
                            i2 = 709324076 ^ i4;
                            this.maxQueueSize = this.config.getInt(eemelnjcqi(tefcdbczycrdihn(), i2), (byte) (1953283414 ^ i2));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1553601757) {
                                i4 = 453033398 ^ i2;
                                this.cancelOnMove = this.config.getBoolean(eemelnjcqi(ssqamxzoukzbtif(), i4), (byte) (1869349075 ^ i4));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2069890707) {
                                    int i12 = 27634611 ^ i4;
                                    this.cancelOnDamage = this.config.getBoolean(eemelnjcqi(cxdcoxyvkttyojz(), i12), (byte) (1858710368 ^ i12));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != 1984781067) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1984781067 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1620890653 ^ i12)) {
                                                break;
                                            }
                                        }
                                        int i13 = 757637388 ^ i12;
                                        throw new IllegalAccessException("double");
                                    }
                                    i3 = 837753882 ^ i12;
                                    this.cancelOnTeleport = this.config.getBoolean(eemelnjcqi(ppxqswhnjrsthzq(), i3), (byte) (1596372858 ^ i3));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -113919014) {
                                        int i14 = 708297660 ^ i3;
                                        this.enableQueue = this.config.getBoolean(eemelnjcqi(fwocxbmjznmyuta(), i14), (byte) (1964078278 ^ i14));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1467242949) {
                                            i3 = 1441800825 ^ i14;
                                            this.enableCooldown = this.config.getBoolean(eemelnjcqi(lttuivdgcducank(), i3), (byte) (551638719 ^ i3));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 118142449) {
                                                i3 = 717199826 ^ i3;
                                                this.enableWarmup = this.config.getBoolean(eemelnjcqi(yysrhengoolqqyr(), i3), (byte) (173985645 ^ i3));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1391885152) {
                                                    int i15 = 1059159590 ^ i3;
                                                    loadBlacklistedBlocks(1115310757);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != -1409447343) {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -1409447343 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (431270515 ^ i15)) {
                                                                break;
                                                            }
                                                        }
                                                        int i16 = 57258242 ^ i15;
                                                        throw new RuntimeException("double");
                                                    }
                                                    i3 = 939342619 ^ i15;
                                                    loadBlacklistedBiomes(447133517);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 336876168) {
                                                        i14 = 555263138 ^ i3;
                                                        loadTeleportEffects(1637519376);
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 483489689) {
                                                            i3 = 219019305 ^ i14;
                                                            loadRegions(1057340110);
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1958655697) {
                                                                i4 = 698039813 ^ i3;
                                                                loadMessages(1146973873);
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 946292472) {
                                                                    int i17 = 923921646 ^ i4;
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -2132270711 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1302880078 ^ i14)) {
                                                int i18 = 58781508 ^ i14;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 483489689 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (662911885 ^ i14)) {
                                                    int i19 = 763273045 ^ i14;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1467242949 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (598752972 ^ i14)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        int i20 = 623182235 ^ i14;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1553601757) {
                                    int i52 = 727437439 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1777858077) {
                                        break;
                                        break;
                                    }
                                    continue;
                                }
                            }
                            int i62 = 321858311 ^ i2;
                            throw new RuntimeException("double");
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 771338273) {
                    int i72 = 1344074346 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 946292472) {
                        int i82 = 2011816820 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -929080862) {
                            int i92 = 2044110774 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2069890707) {
                                int i102 = 685822430 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -245464510) {
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
            int i112 = 1219063095 ^ i4;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 336876168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (928219711 ^ i3)) {
                int i21 = 2090318085 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 118142449 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (395223258 ^ i3)) {
                    int i22 = 2143183786 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1391885152 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1728844110 ^ i3)) {
                        int i23 = 1895298673 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1027708239 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1093142076 ^ i3)) {
                            int i24 = 1418360164 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1331712587 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (968914196 ^ i3)) {
                                int i25 = 1522832831 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -93340192 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1714624609 ^ i3)) {
                                    int i26 = 1844872132 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -113919014 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1651288521 ^ i3)) {
                                        int i27 = 1619544533 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1958655697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (443655363 ^ i3)) {
                                            int i28 = 571700572 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 406970561 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (880435942 ^ i3)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i29 = 1717717341 ^ i3;
        throw new IOException();
    }

    private void loadRegions(int r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.config.ConfigManager.loadRegions(int):void");
    }

    private void loadMessages(int i) {
        int i2;
        int i3;
        int laaqlswfvfjfbbng;
        int i4 = 1912170794 ^ (693632933 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1567919678) {
            int i5 = 1466737217 ^ i4;
            this.messages.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 435053512) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 435053512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2131446026 ^ i5)) {
                        int i6 = 1933533966 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1089814122 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (455152185 ^ i5)) {
                            break;
                        }
                    }
                }
                int i7 = 1610842368 ^ i5;
                throw new IllegalAccessException("double");
            }
            int i8 = 1282595064 ^ i5;
            ConfigurationSection configurationSection = this.config.getConfigurationSection(eemelnjcqi(iyvizclsinxjcqz(), i8));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 2054726666) {
                int i9 = 1387497060 ^ i8;
                if (configurationSection == null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -270231768) {
                        i2 = 1577172549 ^ i9;
                        this.messages.put(eemelnjcqi(jxnsnfluarivcil(), i2), eemelnjcqi(qvjerciadcrugpe(), i2));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 535389442) {
                            i4 = 198427667 ^ i2;
                            this.messages.put(eemelnjcqi(ugwxwwonncljuby(), i4), eemelnjcqi(jdifuckykcplldv(), i4));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1098335642) {
                                i9 = 1651162327 ^ i4;
                                this.messages.put(eemelnjcqi(ddkyuuwgcqjiweb(), i9), eemelnjcqi(nizxzlqubbpfzik(), i9));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1378001697) {
                                    i9 = 1249478654 ^ i9;
                                    this.messages.put(eemelnjcqi(ehfgcxnwbbzdqgp(), i9), eemelnjcqi(lfjybarcenmtvrr(), i9));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 32414931) {
                                        i3 = 159147791 ^ i9;
                                        this.messages.put(eemelnjcqi(xynzpqszouqrwas(), i3), eemelnjcqi(qhmfpcbukualjrj(), i3));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1242408107) {
                                            i8 = 69296824 ^ i3;
                                            this.messages.put(eemelnjcqi(dvhwvvhylgomqqu(), i8), eemelnjcqi(jmxdalqxiuumfgw(), i8));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1795600747) {
                                                int i10 = 1268691934 ^ i8;
                                                this.messages.put(eemelnjcqi(rbxyeuzmcdzohii(), i10), eemelnjcqi(jsmgcfydljkywqe(), i10));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != 938684313) {
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 938684313 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (841660856 ^ i10)) {
                                                            break;
                                                        }
                                                    }
                                                    int i11 = 1878373931 ^ i10;
                                                    throw new IOException("double");
                                                }
                                                i4 = 1669844573 ^ i10;
                                                this.messages.put(eemelnjcqi(rwvgynxzxcuzpxc(), i4), eemelnjcqi(kpwebopwhuhvyck(), i4));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 734879090) {
                                                    int i12 = 224857187 ^ i4;
                                                    return;
                                                }
                                            }
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -735235936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1878676473 ^ i3)) {
                                                int i13 = 68502633 ^ i3;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -32290479 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (10992087 ^ i3)) {
                                                    int i14 = 2066651845 ^ i3;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1242408107 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (642615388 ^ i3)) {
                                                        int i15 = 1532606496 ^ i3;
                                                        throw new IOException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 535389442 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (230253461 ^ i2)) {
                                int i16 = 260091481 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1180383671 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2055195505 ^ i2)) {
                                    int i17 = 875498913 ^ i2;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1378001697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (740049847 ^ i9)) {
                            int i18 = 1119241022 ^ i9;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 32414931 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1888101946 ^ i9)) {
                                int i19 = 1540285768 ^ i9;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -270231768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1453623816 ^ i9)) {
                                    break;
                                }
                            }
                        }
                    }
                    int i20 = 1423816376 ^ i9;
                    throw new RuntimeException("double");
                }
                int i21 = 548546635 ^ i9;
                Iterator it = configurationSection.getKeys((byte) (1028569774 ^ i21)).iterator();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) != -361376399) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == -361376399 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == (1085447512 ^ i21)) {
                            int i22 = 2041503691 ^ i21;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == 1985452249 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == (1657537177 ^ i21)) {
                                break;
                            }
                        }
                    }
                    int i23 = 1359765149 ^ i21;
                    throw new IOException("double");
                }
                int i24 = 175776359 ^ i21;
                while (true) {
                    i2 = i24;
                    if (it.hasNext() == (926193865 ^ i2)) {
                        laaqlswfvfjfbbng(i2, 436104146);
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1180383671) {
                        int i25 = 1326203956 ^ i2;
                        String str = (String) it.next();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i25) == -1043929109) {
                            i3 = 1656584937 ^ i25;
                            this.messages.put(str, configurationSection.getString(str));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -735235936) {
                                i3 = 625463102 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -32290479) {
                                    int i26 = 1420571639 ^ i3;
                                    try {
                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i26) == 2472802) {
                                            throw new RuntimeException();
                                        }
                                        throw null;
                                    } catch (RuntimeException e) {
                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                            case 582507594:
                                                laaqlswfvfjfbbng = laaqlswfvfjfbbng(i26, 476020799);
                                                break;
                                            case 1534252779:
                                                laaqlswfvfjfbbng = 862376299 ^ i26;
                                                break;
                                            default:
                                                throw new IllegalAccessException("Error in hash");
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(laaqlswfvfjfbbng) == -1069261390) {
                                            i24 = laaqlswfvfjfbbng(laaqlswfvfjfbbng, 1866208127);
                                        } else {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(laaqlswfvfjfbbng) == 1534252779 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(laaqlswfvfjfbbng) == (1501650127 ^ laaqlswfvfjfbbng)) {
                                                    int i27 = 1338978810 ^ laaqlswfvfjfbbng;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(laaqlswfvfjfbbng) == -1069261390 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(laaqlswfvfjfbbng) == (341067500 ^ laaqlswfvfjfbbng)) {
                                                        int i28 = 1524063354 ^ laaqlswfvfjfbbng;
                                                        throw new IllegalAccessException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -735235936) {
                                    int i132 = 68502633 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -32290479) {
                                        continue;
                                    } else {
                                        int i142 = 2066651845 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1242408107) {
                                            int i152 = 1532606496 ^ i3;
                                            throw new IOException("double");
                                        }
                                        continue;
                                    }
                                }
                            }
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i25) == -1043929109 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i25) == (62673516 ^ i25)) {
                                    int i29 = 890873568 ^ i25;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 535389442) {
                            int i162 = 260091481 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1180383671) {
                                int i172 = 875498913 ^ i2;
                                throw new IOException("double");
                            }
                            continue;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1795600747 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1346988635 ^ i8)) {
                    int i30 = 1357752840 ^ i8;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 2054726666 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1253845450 ^ i8)) {
                        break;
                    }
                }
            }
            int i31 = 1933243250 ^ i8;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 582507594 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1541615845 ^ i4)) {
                int i32 = 902405277 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 734879090 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (934149452 ^ i4)) {
                    int i33 = 889391015 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1567919678 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (222994802 ^ i4)) {
                        int i34 = 35589407 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1098335642 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1365959312 ^ i4)) {
                            break;
                        }
                    }
                }
            }
        }
        int i35 = 220694478 ^ i4;
        throw new RuntimeException();
    }

    public String getMessage(String str, int i) {
        int i2 = 120307581 ^ (850868768 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -887361711) {
            int i3 = 814076340 ^ i2;
            return this.messages.getOrDefault(str, "&cMessage not found: " + str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -887361711 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (578752771 ^ i2)) {
                int i4 = 726125998 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1328898800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (508040847 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 583345547 ^ i2;
        throw new RuntimeException();
    }

    public java.lang.String getMessage(java.lang.String r6, java.lang.String[] r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.config.ConfigManager.getMessage(java.lang.String, java.lang.String[], int):java.lang.String");
    }

    public TeleportRegion getRegion(String str, int i) {
        int i2 = 826596842 ^ (846199791 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2124871056) {
            int i3 = 2066050161 ^ i2;
            return this.regions.get(str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2124871056 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1545232323 ^ i2)) {
                int i4 = 1115089295 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1483893221 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2130253393 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 586897077 ^ i2;
        throw new IOException();
    }

    public boolean hasRegion(String str, int i) {
        int i2 = 320463672 ^ (1829259725 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1754099181) {
            int i3 = 2023578627 ^ i2;
            return this.regions.containsKey(str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1754099181 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1956901775 ^ i2)) {
                int i4 = 1803313344 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1402499592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1733859646 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1477986358 ^ i2;
        throw new IOException();
    }

    public void saveConfig() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.config.ConfigManager.saveConfig():void");
    }

    public void reload(int i) {
        int i2 = 237924217 ^ (1367283326 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1653338750) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1653338750 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1178564264 ^ i2)) {
                    break;
                }
            }
            int i3 = 365866112 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1405081076 ^ i2;
        loadConfig(520695724);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 9085472) {
            int i5 = 1363397273 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 9085472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2100890146 ^ i4)) {
                int i6 = 1849715650 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1969948950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (234784318 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 1880303812 ^ i4;
        throw new RuntimeException();
    }

    private void loadBlacklistedBlocks(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.config.ConfigManager.loadBlacklistedBlocks(int):void");
    }

    private void loadBlacklistedBiomes(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.config.ConfigManager.loadBlacklistedBiomes(int):void");
    }

    private void loadTeleportEffects(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.config.ConfigManager.loadTeleportEffects(int):void");
    }

    @Generated
    public JavaPlugin getPlugin(int i) {
        int i2 = 1135096540 ^ (1920933000 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -381241575) {
            int i3 = 1918323465 ^ i2;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -381241575 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2100032565 ^ i2)) {
                int i4 = 1788950377 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2080173906 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (12710318 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 981641865 ^ i2;
        throw new IOException();
    }

    @Generated
    public File getConfigFile() {
        int i = 84109563 ^ (2117525753 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1101822549) {
            int i2 = 1537411383 ^ i;
            return this.configFile;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1101822549 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (764386025 ^ i)) {
                int i3 = 1446223290 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1665911825 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2136430663 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 896187130 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public FileConfiguration getConfig() {
        int i = 1968234908 ^ (1269860855 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1862498591) {
            int i2 = 1183197250 ^ i;
            return this.config;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1530018573 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (92641299 ^ i)) {
                int i3 = 2146028328 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1862498591 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (604373355 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1332240544 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public long getCooldownTime(int i) {
        int i2 = 1328688016 ^ (2063127413 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -911736175) {
            int i3 = 1464148734 ^ i2;
            return this.cooldownTime;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -911736175 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (53130476 ^ i2)) {
                int i4 = 748664072 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1937839459 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (495962229 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1193536616 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public long getWarmupTime(int i) {
        int i2 = 1386233151 ^ (335686256 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1391427522) {
            int i3 = 730127799 ^ i2;
            return this.warmupTime;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 248091259 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (778236258 ^ i2)) {
                int i4 = 376987771 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1391427522 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1342545497 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 804803425 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getMaxAttempts(int i) {
        int i2 = 1029015079 ^ (633428951 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1554437576) {
            int i3 = 507184542 ^ i2;
            return this.maxAttempts;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1554437576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1721853582 ^ i2)) {
                int i4 = 890504021 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1384187592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2025739008 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1816565398 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getMaxQueueSize(int i) {
        int i2 = 2123174304 ^ (2123702564 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1732133272) {
            int i3 = 533671068 ^ i2;
            return this.maxQueueSize;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1723390600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1038675243 ^ i2)) {
                int i4 = 145622993 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1732133272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (478594721 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1440593370 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isCancelOnMove(int i) {
        int i2 = 109730926 ^ (313561347 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -970346800) {
            int i3 = 1430023580 ^ i2;
            return this.cancelOnMove;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1875558962 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (110627604 ^ i2)) {
                int i4 = 1853704173 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -970346800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (483064344 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 86445148 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isCancelOnDamage(int i) {
        int i2 = 2145738719 ^ (1093017249 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1847210423) {
            int i3 = 757630805 ^ i2;
            return this.cancelOnDamage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -123603744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (84778753 ^ i2)) {
                int i4 = 1445855389 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1847210423 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (151957303 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1301169205 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isCancelOnTeleport(int i) {
        int i2 = 301173138 ^ (629064051 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1013611855) {
            int i3 = 1977827158 ^ i2;
            return this.cancelOnTeleport;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1013611855 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (510678170 ^ i2)) {
                int i4 = 1662244808 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1821145090 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (586824793 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 62546733 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isEnableQueue(int i) {
        int i2 = 438694196 ^ (357320676 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 481456952) {
            int i3 = 813692936 ^ i2;
            return this.enableQueue;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1622297735 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (454036041 ^ i2)) {
                int i4 = 1246670116 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 481456952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (128109878 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 572826207 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isEnableCooldown(int i) {
        int i2 = 1522226442 ^ (1631546750 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1143077351) {
            int i3 = 264500093 ^ i2;
            return this.enableCooldown;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -977166863 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1519091713 ^ i2)) {
                int i4 = 868292703 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1143077351 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1259476135 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 324285628 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isEnableWarmup(int i) {
        int i2 = 985540204 ^ (1159023957 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1700488077) {
            int i3 = 500251274 ^ i2;
            return this.enableWarmup;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1700488077 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (566416155 ^ i2)) {
                int i4 = 617197480 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1949124643 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (370850457 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 798743784 ^ i2;
        throw new IOException();
    }

    @Generated
    public Map<String, TeleportRegion> getRegions() {
        int i = 2015933065 ^ (2083573325 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1195123608) {
            int i2 = 298683256 ^ i;
            return this.regions;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1195123608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1213617926 ^ i)) {
                int i3 = 143169376 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -917473192 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (94417224 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 610314971 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public Map<String, String> getMessages() {
        int i = 2090778623 ^ (369708454 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 859854707) {
            int i2 = 1413322324 ^ i;
            return this.messages;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 859854707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1208749284 ^ i)) {
                int i3 = 1818372961 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1834162735 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (290046516 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1676520408 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public Set<Material> getBlacklistedBlocks() {
        int i = 115614505 ^ (1324191796 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 666000722) {
            int i2 = 1256378074 ^ i;
            return this.blacklistedBlocks;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1889807232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1510738573 ^ i)) {
                int i3 = 894224918 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 666000722 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1374477202 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1520635244 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public Set<Biome> getBlacklistedBiomes() {
        int i = 469192126 ^ (1111096466 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1450554150) {
            int i2 = 1322237006 ^ i;
            return this.blacklistedBiomes;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -537416024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (863313050 ^ i)) {
                int i3 = 1478645283 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1450554150 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1399484186 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1211402647 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public List getTeleportEffects(int i) {
        int i2 = 1344179195 ^ (1298212642 ^ 218101943);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1945984144) {
            int i3 = 221179 ^ i2;
            return this.teleportEffects;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1945984144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1777345065 ^ i2)) {
                int i4 = 1632579891 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1944560472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2023966322 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 669017568 ^ i2;
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
        ipqhzkmndg = fkznkdvbaoraobz();
        Skk6ArfSO8 = (-560219637) ^ new Random(5876762397041645865L).nextInt();
    }

    public static String eemelnjcqi(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ ipqhzkmndg[i3 % ipqhzkmndg.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] fkznkdvbaoraobz() {
        return new byte[]{56, 52, 41, 98, 20, 111, 74, 71, 47, 99, 122, 13, 41, 9, 31, 101, 26, 121, 40, 74, Byte.MAX_VALUE, 20, 76, 46, 74, 106, 8, 51, 55, 124, 70, 81, 84, 3, 39, 82, 40, 77, 33, 18, 79, 1, 85, 58, 102, 66, 66, 108, 85, 30, 109, 73, 52, 85, 39, 68, 54, 67, 117, 111, 34, 59, 63, 54, 105, 63, 57, 101, 108, 96, 47, 32, 122, 69, 63, 12, 89, 6, 27, 29, 68, 77, 34};
    }

    private static byte[] ppxqswhnjrsthzq() {
        return new byte[]{-9, -2, 16, 39, 39, 61, 120, 11, 26, 46, 75, 81, 16, 81, 44, 53, 40, 50, 29, 93, 78, 66, 117, 121, 121, 51, 58, 104, 2, 32, 119, 8, 109, 24, 20, 10, 26, 27, 20, 6, 126, 64, 108, 105, 85, 25, 112, 49, 96, 87, 92, 19, 13, 17, 20, 7};
    }

    private static byte[] kcvtddbudlufrgl() {
        return new byte[]{-9, -2, 30, 40, 45, 56, 115, 5, 24, 37, 75, 81, 30, 94, 38, 48, 35, 60, 31, 86, 78, 76, 123, 118, 115, 32, 49, 40, 0, 47, 119, 16, 99, 78, 30, 5, 17, 22, 22, 80, 126, 64, 98, 112};
    }

    private static byte[] ytujdexcoywzhsv() {
        return new byte[]{-9, -4, 30, 38, 36, 61, 124, 11, 31, 46, 75, 83, 30, 80, 47, 53, 44, 50, 24, 93, 78, 64, 123, 118, 122, 50, 62, 103, 7, 33, 119, 9, 99, 67, 23, 11};
    }

    private static byte[] ssqamxzoukzbtif() {
        return new byte[]{-9, -13, 31, 40, 39, 62, 115, 3, 24, 35, 75, 92, 31, 94, 44, 54, 35, 58, 31, 80, 78, 79, 122, 118, 121, 48, 49, 96, 0, 45, 119, 5, 98, 23, 20, 9, 17, 19, 22, 11, 126, 84, 99, 108, 85, 0, 123, 57};
    }

    private static byte[] ssadoqhncdfebsx() {
        return new byte[]{-1, -1, 28, 35, 35, 50, 120, 10, 27, 46, 78, 81, 27, 80, 39, 48, 35, 62, 17, 80, 74, 81, 123, 119, 120, 33, 60, 103, 3, 60, 116, 22};
    }

    private static byte[] yysrhengoolqqyr() {
        return new byte[]{-9, -4, 26, 40, 44, 63, 124, 7, 27, 38, 77, 87, 16, 95, 42, 52, 46, 62, 25, 83, 76, 72, 116, 117, 124, 63, 60, 96, 0, 35, Byte.MAX_VALUE, 12, 97, 24, 19, 17, 25, 27, 18, 89, 119, 89, 99, 123, 82, 3};
    }

    private static byte[] fwocxbmjznmyuta() {
        return new byte[]{-9, -14, 31, 37, 36, 61, 114, 1, 24, 46, 75, 93, 31, 83, 47, 53, 34, 56, 31, 93, 78, 72, 122, 116, 122, 60, 48, 99, 0, 41, 119, 13, 98, 26, 23, 20, 16, 10, 22, 78, 126, 77, 99, 107};
    }

    private static byte[] uxcvcqzpatxdcwd() {
        return new byte[]{-9, -14, 27, 5, 38, 46, 123, 4, 23, 116, 75, 87, 27, 83, 45, 62, 43, 44, 16, 27, 78, 74, 126, 53, 120, 38, 57, 109, 15, 40};
    }

    private static byte[] lttuivdgcducank() {
        return new byte[]{-13, -2, 24, 39, 39, 50, 125, 2, 23, 34, 79, 85, 31, 84, 39, 53, 43, 50, 29, 81, 78, 71, Byte.MAX_VALUE, 120, 125, 58, 48, 100, 2, 33, 112, 7, 108, 25, 22, 9, 29, 23, 16, 75, 124, 85, 98, 111, 94, 24, 119, 42, 99, 67};
    }

    private static byte[] tefcdbczycrdihn() {
        return new byte[]{-9, -14, 28, 34, 38, 50, 121, 7, 29, 47, 75, 93, 28, 84, 45, 58, 41, 62, 26, 92, 78, 64, 121, 124, 120, 42, 59, 42, 5, 53, 119, 29, 97, 85, 21, 31, 27, 28, 19, 7, 126, 75, 96, 96, 84, 0, 113, 61};
    }

    private static byte[] cxdcoxyvkttyojz() {
        return new byte[]{-9, -13, 28, 41, 35, 59, 122, 0, 25, 46, 75, 92, 28, 95, 40, 51, 42, 57, 30, 93, 78, 79, 121, 119, 125, 53, 56, 99, 1, 32, 119, 5, 97, 22, 16, 12, 24, 16, 23, 6, 126, 93, 96, 99, 81, 30, 114, 62, 99, 64, 92, 20};
    }

    private static byte[] ineuyxqgevisgjb() {
        return new byte[]{-15, -8, 29, 56, 38, 48, 120, 30, 24, 121, 73, 64};
    }

    private static byte[] vkauhjuxllonicp() {
        return new byte[]{-1, -5, 29, 63, 44, 60, 121, 12, 26, 119, 74, 65};
    }

    private static byte[] budfzfvmkiiiaqu() {
        return new byte[]{-12, -14, 25, 60, 37, 55, 120, 9, 23, 124, 67, 71};
    }

    private static byte[] kvipwjxxwbaqsrg() {
        return new byte[]{-14, -8, 27, 54, 44, 60, 122, 6, 31, 122, 73, 70};
    }

    private static byte[] fsqubfvjpycfkce() {
        return new byte[]{-9, -8, 30, 59, 35, 53, 123, 27, 27, 126, 75, 68};
    }

    private static byte[] sloirtbyhxieyig() {
        return new byte[]{-2, -4, 26, 37, 45, 57, 125, 17, 25, 50, 77, 81, 28, 94, 44, 33};
    }

    private static byte[] uermvduxwhacqhj() {
        return new byte[]{-12, -6, 24, 56, 35, 52, 121, 30, 23, 126, 72, 68};
    }

    private static byte[] ugwxwwonncljuby() {
        return new byte[]{-9, -7, 24, 39, 36, 57, 121, 28, 24, 63, 75, 79, 24, 87, 47, 36, 41, 58, 31, 94, 78, 64, 125, 126, 122, 48, 59, 104, 0, 32, 119, 7};
    }

    private static byte[] jdifuckykcplldv() {
        return new byte[]{-9, -7, 24, 117, 36, 63, 121, 54, 24, 59, 75, 86, 24, 84, 47, 51, 41, 42, 31, 83, 78, 82, 125, 112, 122, 121, 59, 98, 0, 44, 119, 13, 101, 86, 23, 65, 27, 27, 22, 11, 126, 64, 100, 106, 86, 23, 113, 62, 98, 7, 92, 23, 5, 11, 23, 20, 5, 21, 66, 34, 19, 96, 14, 104, 89, 98, 10, 115};
    }

    private static byte[] ehfgcxnwbbzdqgp() {
        return new byte[]{-9, -3, 24, 33, 34, 56, 126, 3, 31, 60, 75, 78, 24, 77, 41, 126, 46, 60, 24, 12, 78, 67, 125, 104, 124, 40, 60, 96, 7, 42};
    }

    private static byte[] lfjybarcenmtvrr() {
        return new byte[]{-9, -3, 24, 112, 34, 56, 126, 37, 31, 52, 75, 87, 24, 88, 41, 35, 46, 32, 24, 10, 78, 86, 125, 115, 124, 50, 60, 98, 7, 110, 119, 14, 101, 89, 17, 68, 28, 0, 17, 84, 126, 94, 100, 99, 80, 17, 118, 39, 101, 2, 92, 81, 5, 79, 17, 82, 2, 49, 69, 50, 19, 99, 14, 37, 95, 125, 13, 115, 92, 63, 30, 121, 75, 7, 9, 95, 109, 17};
    }

    private static byte[] xynzpqszouqrwas() {
        return new byte[]{-9, -4, 31, 32, 45, 63, 121, 2, 27, 55, 75, 79, 31, 76, 38, 121, 41, 45, 28, 18, 78, 77, 122, 120, 115, 62, 59, 104, 3, 41, 119, 3, 98, 82};
    }

    private static byte[] qhmfpcbukualjrj() {
        return new byte[]{-9, -4, 31, 113, 45, 61, 121, 36, 27, 63, 75, 86, 31, 89, 38, 36, 41, 33, 28, 1, 78, 87, 122, 122, 115, 47, 59, 109, 3, 42, 119, 8, 98, 22, 30, 0, 27, 27, 21, 69, 126, 85, 99, 106, 95, 31, 113, 55, 97, 66, 92, 26, 2, 65};
    }

    private static byte[] rwvgynxzxcuzpxc() {
        return new byte[]{-9, -6, 31, 32, 34, 62, 123, 2, 30, 62, 75, 73, 31, 76, 41, 120, 43, 61, 25, 14, 78, 68, 122, 105, 124, 46, 57, 97, 6, 40, 119, 77, 98, 87, 17, 1, 25, 14, 16, 75, 126, 95, 99, 97, 80, 16, 115, 58, 100, 92};
    }

    private static byte[] kpwebopwhuhvyck() {
        return new byte[]{-9, -6, 31, 113, 34, 104, 123, 36, 30, 54, 75, 80, 31, 89, 41, 37, 43, 33, 25, 8, 78, 81, 122, 114, 124, 52, 57, 99, 6, 108, 119, 9, 98, 88, 17, 66, 25, 1, 16, 86, 126, 89, 99, 98, 80, 23, 115, 38, 100, 0, 92, 86, 2, 78};
    }

    private static byte[] iyvizclsinxjcqz() {
        return new byte[]{-9, -8, 26, 63, 33, 50, 120, 2, 26, 39, 75, 95, 26, 94, 42, 56, 40, 60};
    }

    private static byte[] ddkyuuwgcqjiweb() {
        return new byte[]{-15, -5, 16, 48, 38, 49, 123, 26, 27, 56, 74, 80, 24, 84, 46, 35, 40, 35, 31, 87, 70, 68, 126, 124, 123, 44, 60, 109, 7, 51, 119, 6};
    }

    private static byte[] nizxzlqubbpfzik() {
        return new byte[]{-15, -5, 16, 117, 38, 61, 123, 44, 27, 59, 74, 65, 24, 27, 46, 57, 40, 56, 31, 9, 70, 81, 126, 63, 123, 47, 60, 101, 7, 44, 119, 23, 101, 18, 21, 29, 31, 9, 24, 74, 125, 93, 100, 109, 82, 8, 114, 117, 100, 78, 92, 29, 6, 7, 16, 27, 15, 0, 71, 59, 19, 41, 11, 116, 89, 117, 8, 62, 93, 63, 29, 115, 77, 85, 6, 111, 107, 99, 42, Byte.MAX_VALUE, 112, 90, 18, 96, 5, 124, 83, 68, 93, 23, 112, 113, 90, 106};
    }

    private static byte[] rbxyeuzmcdzohii() {
        return new byte[]{-16, -2, 29, 62, 36, 54, 126, 95, 30, 37, 79, 92, 27, 75, 41, 60, 47, 33, 30, 12, 75, 85, 124, 113, 126, 48, 57, 107};
    }

    private static byte[] jsmgcfydljkywqe() {
        return new byte[]{-16, -2, 29, 118, 36, 58, 126, 60, 30, 58, 79, 25, 27, 73, 41, 52, 47, 58, 30, 18, 75, 79, 124, 107, 126, 44, 57, 108, 2, 39, 116, 15, 98, 23, 18, 23, 30, 23, 21, 0, Byte.MAX_VALUE, 66, 97, 124, 87, 17, 119, 120, 103, 124, 91, 41, 1, 52, 17, 95};
    }

    private static byte[] jxnsnfluarivcil() {
        return new byte[]{-9, -6, 29, 38, 34, 60, Byte.MAX_VALUE, 30, 31, 50, 75, 76, 29, 86, 41, 33, 47, 56, 24, 83, 78, 86, 120, 107, 124, 63, 61, 101, 7, 45, 119, 19, 96, 64};
    }

    private static byte[] qvjerciadcrugpe() {
        return new byte[]{-9, -6, 29, 116, 34, 56, Byte.MAX_VALUE, 38, 31, 50, 75, 80, 29, 92, 41, 35, 47, 35, 24, 12, 78, 81, 120, 123, 124, 56, 61, 38, 7, 59, 119, 21, 96, 80, 17, 7, 29, 29, 17, 85, 126, 67, 97, 108, 80, 1, 119, 53, 101, 70, 92, 1, 0, 68};
    }

    private static byte[] dvhwvvhylgomqqu() {
        return new byte[]{-9, -13, 26, 38, 36, 44, 120, 26, 29, 47, 75, 80, 26, 17, 47, 50, 40, 37, 26, 23, 78, 73, Byte.MAX_VALUE, Byte.MAX_VALUE};
    }

    private static byte[] jmxdalqxiuumfgw() {
        return new byte[]{-9, -13, 26, 113, 36, 56, 120, 62, 29, 62, 75, 81, 26, 89, 47, 55, 40, 97, 26, 7, 78, 67, Byte.MAX_VALUE, 59, 122, 45, 58, 126, 5, 32, 119, 28, 103, 83, 23, 74, 26, 85, 19, 123, 126, 86, 102, 124, 86, 29, 112, 32, 103, 78, 92, 30, 7, 14, 23, 72, 4, 91, 71, 45, 19, 115, 12, 108, 89, 122, 11, 52, 94, 45, 30, 113, 73, 31, 15, 84, 107, 67};
    }

    private static byte[] citxndbjwwjsrqg() {
        return new byte[]{-16, -6, 27, 49, 33, 49, 126, 31, 30, 54, 75, 84, 24, 80, 45, 56, 35, 59, 30, 15, 77, 64, 121, 120, 126, 126, 57, 103, 6, 34, 119, 11, 102, 84, 30, 8, 30, 15};
    }

    private static byte[] bnthkielmqhcuka() {
        return new byte[]{-9, -2, 25, 52, 45, 54, 115, 20, 23, 51, 75, 83, 25, 81, 38, 57, 35, 56, 16, 13, 78, 68, 124, 126, 115, 114, 49, 99, 15, 38, 119, 11, 100, 90, 30, 2, 17, 12};
    }

    private static byte[] qqsztlctqyenvfs() {
        return new byte[]{-9, -4, 16, 51, 38, 59, 126, 17, 31, 54, 75, 89, 16, 73, 45, 36, 46, 100, 24, 21, 78, 77, 117, 55, 120, 42, 60, 98, 7, 34, 119, 2, 109, 88, 21, 13, 28, 80, 17, 86, 126, 83, 108, 98, 84, 21, 118, 44, 101, 65, 92, 12, 13, 21};
    }

    private static byte[] dxmplvexjxvfnzp() {
        return new byte[]{-9, -1, 27, 39, 32, 33, 124, 15, 24, 48};
    }

    private static byte[] whsvirqwwflsfrv() {
        return new byte[]{-9, -8, 26, 57, 45, 57, 120, 6, 28, 62, 75, 82};
    }

    private static byte[] qacfwbaauhhopab() {
        return new byte[]{-1, -6, 26, 40, 39, 51, 121, 17, 28, 53, 75, 80, 16, 94, 38, 37};
    }

    private static int laaqlswfvfjfbbng(int i, int i2) {
        return i2 ^ i;
    }
}
