package com.kammoun.donutCore.warps;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.warps.commands.DeleteWarp;
import com.kammoun.donutCore.warps.commands.ReloadWarp;
import com.kammoun.donutCore.warps.commands.SetWarp;
import com.kammoun.donutCore.warps.commands.WarpCMD;
import com.kammoun.donutCore.warps.manager.WarpManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Random;
import lombok.Generated;
import org.bukkit.command.PluginCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Warp extends DonutModule {
    private WarpManager warpManager;
    private File warpsFile;
    private FileConfiguration warpsConfig;
    private static int mkafxbvkWZ = 0;

    private transient int f1290DfbQqGLEW = 1586427946;
    private static byte[] hagfkfkwdf;
    private static String[] nothing_to_see_here = new String[15];

    public Warp() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.warps.Warp.<init>():void");
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 1414413848 ^ (47052413 ^ 1190154903);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2086873200) {
            int i3 = 426153902 ^ i2;
            saveConfig(osjxufhqqo(ezjwmvobxdklabd(), i3), 1620467835);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1218996960) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1218996960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (348006301 ^ i3)) {
                        break;
                    }
                }
                int i4 = 292353386 ^ i3;
                throw new IOException("double");
            }
            i2 = 667864993 ^ i3;
            this.warpsFile = new File(getDataFolder(44993446), osjxufhqqo(jjetqlbaaxrpsuj(), i2));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1994266601) {
                int i5 = 1801695456 ^ i2;
                this.warpsConfig = YamlConfiguration.loadConfiguration(this.warpsFile);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 767791338) {
                    int i6 = 296274012 ^ i5;
                    this.warpManager = new WarpManager(this, 451990533);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1601842678) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1601842678 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (517556228 ^ i6)) {
                                break;
                            }
                        }
                        int i7 = 25235580 ^ i6;
                        throw new IOException("double");
                    }
                    int i8 = 1830754504 ^ i6;
                    WarpCMD warpCMD = new WarpCMD(this, 2096001589);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -931326903) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -931326903 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1690466390 ^ i8)) {
                                break;
                            }
                        }
                        int i9 = 616883642 ^ i8;
                        throw new IOException("double");
                    }
                    int i10 = 505575157 ^ i8;
                    ((PluginCommand) Objects.requireNonNull(this.api.getCommand(osjxufhqqo(jeoabdapouidtal(), i10)))).setExecutor(warpCMD);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != 963552225) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 963552225 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (814062879 ^ i10)) {
                                break;
                            }
                        }
                        int i11 = 1882719180 ^ i10;
                        throw new IOException("double");
                    }
                    i5 = 1140678468 ^ i10;
                    ((PluginCommand) Objects.requireNonNull(this.api.getCommand(osjxufhqqo(lxzkntnlpopgrwn(), i5)))).setTabCompleter(warpCMD);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 646207939) {
                        int i12 = 1550867084 ^ i5;
                        registerCommand((KCommand) new SetWarp(this, 415138757), osjxufhqqo(dcnwkobhsbnrlqi(), i12), 800215123);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -989426271) {
                            int i13 = 268793612 ^ i12;
                            registerCommand((KCommand) new DeleteWarp(this, 415909203), osjxufhqqo(yztqwtmowqiyqkh(), i13), 800215123);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) != 1160590785) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1160590785 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1945551001 ^ i13)) {
                                        break;
                                    }
                                }
                                int i14 = 813542366 ^ i13;
                                throw new IllegalAccessException("double");
                            }
                            i12 = 1717678486 ^ i13;
                            registerCommand((KCommand) new ReloadWarp(this, 1652624062), osjxufhqqo(aszxpjefhuejegq(), i12), 800215123);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1981856114) {
                                int i15 = 1363311388 ^ i12;
                                return;
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1981856114 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1779111732 ^ i12)) {
                                int i16 = 978778405 ^ i12;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -989426271 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1273146646 ^ i12)) {
                                    break;
                                }
                            }
                        }
                        int i17 = 2053998450 ^ i12;
                        throw new IOException("double");
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 767791338 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (23776512 ^ i5)) {
                        int i18 = 1743698462 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -63741552 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (612797580 ^ i5)) {
                            int i19 = 1500542928 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 646207939 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (673429787 ^ i5)) {
                                break;
                            }
                        }
                    }
                }
                int i20 = 1348068152 ^ i5;
                throw new RuntimeException();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2086873200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1044083090 ^ i2)) {
                int i21 = 2056815940 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1994266601 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1888787265 ^ i2)) {
                    break;
                }
            }
        }
        int i22 = 3361557 ^ i2;
        throw new IOException("double");
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 575953581 ^ (429381076 ^ 1190154903);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -375459981) {
            int i3 = 1819359099 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1978182488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1643093915 ^ i2)) {
                int i4 = 1265633868 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -375459981 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (909050872 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1700002915 ^ i2;
        throw new RuntimeException();
    }

    @Override
    public void reload(int i) {
        int i2 = 587009764 ^ (1446737676 ^ 1190154903);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1850647559) {
            i2 = 1362993274 ^ i2;
            this.warpsConfig = YamlConfiguration.loadConfiguration(this.warpsFile);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 408705067) {
                i2 = 1749422928 ^ i2;
                this.warpManager.loadWarpLocationsFromConfig(846220393);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1517077160) {
                    int i3 = 1109310416 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1850647559 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1697494830 ^ i2)) {
                int i4 = 1948984580 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1251548202 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1799370317 ^ i2)) {
                    int i5 = 360468025 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 408705067 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (973836786 ^ i2)) {
                        int i6 = 1286347453 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1517077160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1489122021 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 1193092883 ^ i2;
        throw new IOException();
    }

    public FileConfiguration getWarpDataConfig(int i) {
        int i2 = 1094956752 ^ (644425268 ^ 1190154903);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 248910745) {
            int i3 = 121503727 ^ i2;
            return this.warpsConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 248910745 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (601580047 ^ i2)) {
                int i4 = 575541588 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 926543073 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1549938665 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 837092431 ^ i2;
        throw new IllegalAccessException();
    }

    public void saveWarpDataConfig(int i) {
        int i2 = 918539958 ^ (2049807062 ^ 1190154903);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1393588152) {
            ?? r0 = 751405055 ^ i2;
            int i3 = r0;
            try {
                this.warpsConfig.save(this.warpsFile);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 895240257) {
                    i3 = 609539225 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 402320520) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1004154721 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1593410892 ^ i3)) {
                                int i4 = 142904103 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 402320520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (648801903 ^ i3)) {
                                    int i5 = 1798156501 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1221760032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1013929710 ^ i3)) {
                                        int i6 = 757584225 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1708813306 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (866528724 ^ i3)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        int i7 = 1425345845 ^ i3;
                        throw new IllegalAccessException();
                    }
                    int i8 = 629414013 ^ i3;
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i8) == 209645570) {
                            throw new IllegalAccessException();
                        }
                        throw null;
                    } catch (IllegalAccessException e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case 1004154721:
                                i2 = 1769412992 ^ i8;
                                break;
                            case 1708813306:
                                i2 = 45551891 ^ i8;
                                break;
                            default:
                                throw new RuntimeException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1885528930) {
                            int i9 = 1491726608 ^ i2;
                            return;
                        }
                    }
                }
            } catch (IOException e2) {
                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                    case 895240257:
                        int slvzlxmsbhtgowsa = slvzlxmsbhtgowsa(i3, 1643658146);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(slvzlxmsbhtgowsa) == 983405906) {
                            int i10 = 740640569 ^ slvzlxmsbhtgowsa;
                            getApi(2142241109).getLogger().severe(osjxufhqqo(mnuvocthubppfek(), i10));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1538763931) {
                                i3 = 1838108755 ^ i10;
                                r0.printStackTrace();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 936193536) {
                                    int i11 = 270272700 ^ i3;
                                    return;
                                }
                            } else {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1538763931 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (998060346 ^ i10)) {
                                        int i12 = 1413679945 ^ i10;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(slvzlxmsbhtgowsa) == 983405906 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(slvzlxmsbhtgowsa) == (337454690 ^ slvzlxmsbhtgowsa)) {
                                    int i13 = 1736611602 ^ slvzlxmsbhtgowsa;
                                    throw new IOException("double");
                                }
                            }
                        }
                        break;
                    default:
                        throw new IllegalAccessException("Error in hash");
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 936193536 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (640010867 ^ i3)) {
                    int i14 = 410895140 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 895240257 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (269085559 ^ i3)) {
                        int i15 = 1139704499 ^ i3;
                        throw new RuntimeException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1885528930 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1169009745 ^ i2)) {
                int i16 = 1451008296 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1393588152 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1896236810 ^ i2)) {
                    int i17 = 1826948002 ^ i2;
                    throw new IllegalAccessException("double");
                }
            }
        }
    }

    @Generated
    public WarpManager getWarpManager(int i) {
        int i2 = 1259470085 ^ (2134011747 ^ 1190154903);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1768028277) {
            int i3 = 792772517 ^ i2;
            return this.warpManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1768028277 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2027210523 ^ i2)) {
                int i4 = 1796243691 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -325322078 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (177518398 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1568222275 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public File getWarpsFile() {
        int i = 1239367881 ^ (488403168 ^ 1190154903);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1852107280) {
            int i2 = 1206714155 ^ i;
            return this.warpsFile;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1852107280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1023005107 ^ i)) {
                int i3 = 1022585171 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1359156054 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (878240192 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 754162908 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public FileConfiguration getWarpsConfig() {
        int i = 1930904669 ^ (408739562 ^ 1190154903);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1843282177) {
            int i2 = 1040217960 ^ i;
            return this.warpsConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1646396864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1471144355 ^ i)) {
                int i3 = 485854119 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1843282177 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1540541075 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1178585312 ^ i;
        throw new RuntimeException();
    }

    static {
        nothing_to_see_here[0] = " ⠁⡼⠋⠀⣆⠀⠀⣰⣿⣫⣾⢿⣿⣿⠍⢠⠠⠀⠀⢀⠰⢾⣺⣻⣿⣿⣿⣷⡀⠀";
        nothing_to_see_here[1] = "⣥⠀⠀⠀⠁⠀⠠⢻⢬⠁⣠⣾⠛⠁⠀⠀⠀⠀⠀⠀⠀⠐⠱⠏⡉⠙⣿⣿⡇⠀";
        nothing_to_see_here[2] = "⢳⠀⢰⡖⠀⠀⠈⠀⣺⢰⣿⢻⣾⣶⣿⣿⣶⣶⣤⣤⣴⣾⣿⣷⣼⡆⢸⣿⣧⠀";
        nothing_to_see_here[3] = "⠈⠀⠜⠈⣀⣔⣦⢨⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣅⣼⠛⢹⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⢋⡿⡿⣯⣭⡟⣟⣿⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⡘⠀";
        nothing_to_see_here[5] = "⡀⠐⠀⠀⠀⣿⣯⡿⣿⣿⣿⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣉⢽⣿⡆⠀⠀";
        nothing_to_see_here[6] = "⢳⠀⠄⠀⢀⣿⣿⣿⣿⣿⣿⣿⠙⠉⠉⠉⠛⣻⢛⣿⠛⠃⠀⠐⠛⠻⣿⡇⠀⠀";
        nothing_to_see_here[7] = "⣾⠄⠀⠀⢸⣿⣿⡿⠟⠛⠁⢀⠀⢀⡄⣀⣠⣾⣿⣿⡠⣴⣎⣀⣠⣠⣿⡇⠀⠀";
        nothing_to_see_here[8] = "⣧⠀⣴⣄⣽⣿⣿⣿⣶⣶⣖⣶⣬⣾⣿⣾⣿⣿⣿⣿⣽⣿⣿⣿⣿⣿⣿⡇⠀⠀";
        nothing_to_see_here[9] = "⣿⣶⣈⡯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣹⢧⣿⣿⣿⣄⠙⢿⣿⣿⣿⠇⠀⠀";
        nothing_to_see_here[10] = "⠹⣿⣿⣧⢌⢽⣻⢿⣯⣿⣿⣿⣿⠟⣠⡘⠿⠟⠛⠛⠟⠛⣧⡈⠻⣾⣿⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠈⠉⣷⡿⣽⠶⡾⢿⣿⣿⣿⢃⣤⣿⣷⣤⣤⣄⣄⣠⣼⡿⢷⢀⣿⡏⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⢀⣿⣷⠌⣈⣏⣝⠽⡿⣷⣾⣏⣀⣉⣉⣀⣀⣀⣠⣠⣄⡸⣾⣿⠃⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⣰⡿⣿⣧⡐⠄⠱⣿⣺⣽⢟⣿⣿⢿⣿⣍⠉⢀⣀⣐⣼⣯⡗⠟⡏⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⣰⣿⠀⣿⣿⣴⡀⠂⠘⢹⣭⡂⡚⠿⢿⣿⣿⣿⡿⢿⢿⡿⠿⢁⣴⣿⣷⣶⣦⣤";
        hagfkfkwdf = ucuvrrlzirssymn();
        mkafxbvkWZ = (-876795811) ^ new Random(3761625407851930373L).nextInt();
    }

    public static String osjxufhqqo(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ hagfkfkwdf[i3 % hagfkfkwdf.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] ucuvrrlzirssymn() {
        return new byte[]{21, 1, 63, 102, 18, 101, 98, 13, 26, 105, 107, 64, 31, 4, 104, 116, 2, 124, 16, 90, 33, 84, 28, 29, 104, 32, 62, 53, 37, 39, 4, 86, 50, 36, 83, 111, 82, 69, 122, 105, 121, 42, 22, 36, 91, 31, 94, 67, 123, 51, 9, 19};
    }

    private static byte[] lxzkntnlpopgrwn() {
        return new byte[]{-38, -56, 6, 32, 33, 60, 90, 72, 40, 33};
    }

    private static byte[] dcnwkobhsbnrlqi() {
        return new byte[]{-46, -53, 15, 37, 36, 51, 87, 77, 42, 39, 94, 17, 47, 64, 91, 49};
    }

    private static byte[] jjetqlbaaxrpsuj() {
        return new byte[]{-36, -58, 9, 32, 39, 48, 80, 76, 45, 46, 83, 5, 46, 31, 92, 63, 49, 38, 39, 14};
    }

    private static byte[] jeoabdapouidtal() {
        return new byte[]{-35, -53, 8, 34, 35, 48, 91, 75, 42, 47};
    }

    private static byte[] yztqwtmowqiyqkh() {
        return new byte[]{-35, -58, 14, 59, 38, 52, 85, 87, 42, 58, 83, 5, 38, 85, 92, 52, 52, 45, 38, 16, 16, 29};
    }

    private static byte[] ezjwmvobxdklabd() {
        return new byte[]{-38, -53, 13, 34, 37, 48, 84, 77, 42, 40, 94, 1, 44, 29, 92, 59, 48, 33, 33, 3};
    }

    private static byte[] aszxpjefhuejegq() {
        return new byte[]{-38, -51, 13, 37, 38, 55, 81, 89, 41, 62, 90, 18, 45, 81, 92, 52, 49, 37, 35, 16, 16, 23};
    }

    private static byte[] mnuvocthubppfek() {
        return new byte[]{-38, -58, 15, 23, 43, 63, 90, 74, 40, 50, 90, 28, 47, 22, 81, 47, 58, 33, 34, 25, 16, 76, 44, 92, 81, 116, 6, 113, 23, 117, 53, 78, 2, 97, 106, 59, 106, 5, 72, 46, 72, 97, 38, 56, 98, 83, 102, 28, 73, 104, 56, 10};
    }

    private static int slvzlxmsbhtgowsa(int i, int i2) {
        return i2 ^ i;
    }
}
