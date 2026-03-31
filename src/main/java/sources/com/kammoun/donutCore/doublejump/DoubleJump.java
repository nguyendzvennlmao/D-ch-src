package com.kammoun.donutCore.doublejump;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.combat.utils.WorldGuardUtil;
import com.kammoun.donutCore.doublejump.cmd.ReloadCommand;
import com.kammoun.donutCore.doublejump.listener.DoubleJumpListener;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;

public class DoubleJump extends DonutModule {
    private Sound jumpSound;
    private List<String> allowedWorlds;
    private List<String> worldGuardRegions;
    private double jumpPower;
    private static DoubleJump instance;
    private WorldGuardUtil worldGuardUtil;
    private static int HyWOz3UzIm = 0;

    private transient int f546vbm3pMugk = 142441600;
    private static byte[] ubiinirtmc;
    private static String[] nothing_to_see_here = new String[15];

    public DoubleJump() {
        super("DoubleJump", 1095143273);
        int i = 883582965 ^ 278901756;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                case 103313124:
                    int i2 = 281684395 ^ i;
                    break;
                case 185499874:
                case 1798495131:
                    break;
                case 1969938917:
                default:
                    throw new IOException();
            }
        }
        int parseInt = 448495009 ^ (942346777 ^ Integer.parseInt("376410650"));
        this.f546vbm3pMugk = 142441600 ^ HyWOz3UzIm;
        int iyhtwbfmtnvplryl = 1561819163 ^ iyhtwbfmtnvplryl(parseInt, 1870005253);
    }

    public static DoubleJump getInstance(int i) {
        int i2 = 11157745 ^ (1998778431 ^ (668516070 ^ 101040792));
        if (instance == null) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1297193598) {
                i2 = 1128224169 ^ i2;
                instance = new DoubleJump();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1420506936) {
                    int i3 = 1324818478 ^ i2;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -588396102 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (555648669 ^ i2)) {
                    int i4 = 452592935 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1297193598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (191915013 ^ i2)) {
                        int i5 = 2025532340 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1420506936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1275634485 ^ i2)) {
                            break;
                        }
                    }
                }
            }
            int i6 = 1992870373 ^ i2;
            throw new IOException();
        }
        iyhtwbfmtnvplryl(i2, 231241095);
        return instance;
    }

    public static void log(String str) {
        int i = 1135972126 ^ (661605460 ^ 101040792);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 385355411) {
            int i2 = 430989369 ^ i;
            Bukkit.getConsoleSender().sendMessage(str);
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 385355411 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (281706232 ^ i)) {
                int i3 = 605781576 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -612692133 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2101807577 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1122879029 ^ i;
        throw new IllegalAccessException();
    }

    public void loadConfigValues(int i) {
        int i2 = 855783389 ^ (945814182 ^ 242794008);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 690723608) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 690723608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (530951780 ^ i2)) {
                    break;
                }
            }
            int i3 = 1151657313 ^ i2;
            throw new IOException("double");
        }
        int i4 = 911482323 ^ i2;
        FileConfiguration config = getConfig(127597628);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1685359231) {
            i4 = 1634415891 ^ i4;
            this.jumpSound = Sound.valueOf(((String) Objects.requireNonNull(config.getString(jdchsixluu(mismzoazrvftssd(), i4)))).toUpperCase());
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1865229030) {
                i4 = 71618324 ^ i4;
                this.allowedWorlds = config.getStringList(jdchsixluu(opeujihcpaxqcwb(), i4));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1292589638) {
                    i4 = 1331805536 ^ i4;
                    this.jumpPower = config.getDouble(jdchsixluu(pzakkixjwpritez(), i4));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -906408264) {
                        int i5 = 618455685 ^ i4;
                        this.worldGuardRegions = config.getStringList(jdchsixluu(mkkpzfgsexvmlvt(), i5));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -283223407) {
                            int i6 = 1623160334 ^ i5;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -283223407 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (454568038 ^ i5)) {
                                break;
                            }
                        }
                        int i7 = 615485335 ^ i5;
                        throw new IOException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1685359231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (69213647 ^ i4)) {
                int i8 = 137342262 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -906408264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (29728970 ^ i4)) {
                    int i9 = 1619280206 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1865229030 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2088280372 ^ i4)) {
                        int i10 = 720297107 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -354030878 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (82137618 ^ i4)) {
                            int i11 = 60890854 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1292589638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1872857523 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i12 = 1645005612 ^ i4;
        throw new IllegalAccessException();
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 1262127724 ^ (1246042866 ^ 242794008);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2017031216) {
            int i3 = 1272535515 ^ i2;
            instance = this;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 653507306) {
                i2 = 1369550087 ^ i3;
                this.api.saveDefaultConfig();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1409363248) {
                    i3 = 73993924 ^ i2;
                    loadConfigValues(1943490305);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2001296144) {
                        i2 = 1998521492 ^ i3;
                        this.worldGuardUtil = new WorldGuardUtil();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 810451027) {
                            i3 = 176704740 ^ i2;
                            this.api.getServer().getPluginManager().registerEvents(new DoubleJumpListener(), this.api);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1678567283) {
                                i2 = 1355249575 ^ i3;
                                this.api.getCommand(jdchsixluu(jpuqadmknyhcihf(), i2)).setExecutor(new ReloadCommand());
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -499688887) {
                                    int i4 = 40544621 ^ i2;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 653507306 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1278208136 ^ i3)) {
                    int i5 = 1396491850 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1678567283 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1831907164 ^ i3)) {
                        int i6 = 1653014081 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2001296144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (24394411 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i7 = 1641934413 ^ i3;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2017031216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (116347468 ^ i2)) {
                int i8 = 1657242847 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -245231327 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (207205158 ^ i2)) {
                    int i9 = 410051607 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -499688887 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (237564148 ^ i2)) {
                        int i10 = 604692119 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 810451027 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1673540645 ^ i2)) {
                            int i11 = 1446730066 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1409363248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1612111735 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i12 = 1240550792 ^ i2;
        throw new IOException();
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 461529259 ^ (1361000795 ^ 242794008);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 657407810) {
            int i3 = 1847996411 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1444823193 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (312153774 ^ i2)) {
                int i4 = 1140264904 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 657407810 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1617634154 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 827242209 ^ i2;
        throw new IOException();
    }

    @Override
    public void reload(int i) {
        int i2 = 664498005 ^ (515087235 ^ 242794008);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1165863311) {
            int i3 = 1148365741 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1165863311 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (271125281 ^ i2)) {
                int i4 = 570020259 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1726543077 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (763390198 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 674669259 ^ i2;
        throw new IOException();
    }

    public boolean isInAllowedRegion(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.doublejump.DoubleJump.isInAllowedRegion(org.bukkit.entity.Player, int):boolean");
    }

    @Generated
    public Sound getJumpSound(int i) {
        int i2 = 25408015 ^ (1728896163 ^ 242794008);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1203668387) {
            int i3 = 1975902936 ^ i2;
            return this.jumpSound;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1203668387 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (137582224 ^ i2)) {
                int i4 = 1803551199 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -376335520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (391610556 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1537572686 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public List getAllowedWorlds(int i) {
        int i2 = 332927427 ^ (1302504522 ^ 242794008);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2146411382) {
            int i3 = 632009890 ^ i2;
            return this.allowedWorlds;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1387398757 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1759161302 ^ i2)) {
                int i4 = 2111289423 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2146411382 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1679585455 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 554935495 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public List<String> getWorldGuardRegions() {
        int i = 945899037 ^ (1251809737 ^ 242794008);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -467202461) {
            int i2 = 100300763 ^ i;
            return this.worldGuardRegions;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -873156421 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (746266600 ^ i)) {
                int i3 = 868986241 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -467202461 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1708935062 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1778772239 ^ i;
        throw new IOException();
    }

    @Generated
    public double getJumpPower(int i) {
        int i2 = 1538848827 ^ (162069602 ^ 242794008);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -481963510) {
            int i3 = 239980964 ^ i2;
            return this.jumpPower;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -481963510 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1868677534 ^ i2)) {
                int i4 = 2113659386 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1859428566 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1478080623 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 194545161 ^ i2;
        throw new IOException();
    }

    @Generated
    public WorldGuardUtil getWorldGuardUtil() {
        int i = 1965924363 ^ (166976164 ^ 242794008);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1791613509) {
            int i2 = 1169671466 ^ i;
            return this.worldGuardUtil;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1199043351 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2106981152 ^ i)) {
                int i3 = 164826354 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1791613509 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1232680097 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1633173934 ^ i;
        throw new IOException();
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
        ubiinirtmc = zokavzkuzfoazel();
        HyWOz3UzIm = 248505023 ^ new Random(-1715950051543350657L).nextInt();
    }

    public static String jdchsixluu(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ ubiinirtmc[i3 % ubiinirtmc.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] zokavzkuzfoazel() {
        return new byte[]{92, 101, 35, 99, 28, 78, 111, 52, 65, 79, 89, 69, 49, 20, 75, 87, 80, 92, 55, 75, 8, 14, 40, 4, 107, 33, 31, 25, 120, 39, 110, 7, 77, 72, 105, 104, 84, 51, 36, 67, 13, 76, 99, 59, 22, 28, 61, 16, 91, 59, 69, 101, 52, 81, 84, 26, 47, 110, 51, 112, 83, 50, 32, 7, 40, Byte.MAX_VALUE, 122, 73, 27, 106, 27, 21, 37, 40, 68, 122, 99, 37, 34, 72, 29, 13, 22};
    }

    private static byte[] opeujihcpaxqcwb() {
        return new byte[]{-109, -82, 23, 45, 44, 18, 86, 118, 114, 18, 104, 21};
    }

    private static byte[] mismzoazrvftssd() {
        return new byte[]{-109, -87, 20, 39, 40, 20, 86, 112, 113, 22, 104, 18};
    }

    private static byte[] pzakkixjwpritez() {
        return new byte[]{-106, -88, 16, 60, 42, 2, 87, 110, 120, 11, 107, 91, 4, 82, 114, 0, 103, 18, 3, 28, 59, 73};
    }

    private static byte[] mkkpzfgsexvmlvt() {
        return new byte[]{-109, -86, 16, 12, 47, 18, 87, 126, 120, 27, 104, 17, 2, 107, 120, 17, 104, 5, 14, 1, 57, 90, 27, 17, 88, 64, 39, 68, 65, 120, 95, 94, 126, 31, 90, 53, 108, 120};
    }

    private static byte[] jpuqadmknyhcihf() {
        return new byte[]{-109, -86, 18, 54, 46, 25, 95, 118, 112, 30, 104, 25, 0, 64, 121, 5, 96, 30, 6, 21, 57, 78};
    }

    private static int iyhtwbfmtnvplryl(int i, int i2) {
        return i ^ i2;
    }
}
