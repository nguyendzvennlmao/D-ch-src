package com.kammoun.donutCore.itemcontrol;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.itemcontrol.api.ItemControlAPI;
import com.kammoun.donutCore.itemcontrol.commands.ItemControlCommand;
import com.kammoun.donutCore.itemcontrol.config.ItemControlConfig;
import com.kammoun.donutCore.itemcontrol.listeners.ItemControlListener;
import com.kammoun.donutCore.itemcontrol.managers.CooldownManager;
import com.kammoun.donutCore.itemcontrol.managers.RegionHelper;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.command.PluginCommand;

public class ItemControl extends DonutModule {
    private ItemControlConfig configuration;
    private CooldownManager cooldownManager;
    private RegionHelper regionHelper;
    private ItemControlListener listener;
    private SchedulerUtil.Task cleanupTask;
    private static int AKQlxkF42k = 0;
    private transient int xkZ7tA760j = 516252283;
    private static String[] nothing_to_see_here = new String[18];

    public ItemControl() {
        super("ItemControl", 1095143273);
        int i = 1876643889 ^ (438680431 ^ 1805807471);
        int parseInt = 806880306 ^ (728222851 ^ Integer.parseInt("86199424"));
        this.xkZ7tA760j = 516252283 ^ AKQlxkF42k;
        int upuymlkbjjdrmtzs = 1954767748 ^ upuymlkbjjdrmtzs(parseInt, 791524030);
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 791570560 ^ (413991105 ^ 1552983083);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1486775123) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1486775123 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1743136630 ^ i2)) {
                    break;
                }
            }
            int i3 = 1974318898 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 142559983 ^ i2;
        this.configuration = new ItemControlConfig(this.api, 1696438839);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 459551787) {
            int i5 = 1252232470 ^ i4;
            this.cooldownManager = new CooldownManager();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1316510873) {
                int i6 = 1162381713 ^ i5;
                this.regionHelper = new RegionHelper();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1681657875) {
                    int i7 = 14040071 ^ i6;
                    ItemControlAPI.setInstance(this, 1575483109);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 1653469227) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1653469227 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (426615741 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 1754196893 ^ i7;
                        throw new IOException("double");
                    }
                    i4 = 1635463709 ^ i7;
                    this.listener = new ItemControlListener(this, 1386915791);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1767137472) {
                        i4 = 2028169822 ^ i4;
                        Bukkit.getPluginManager().registerEvents(this.listener, this.api);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1370541517) {
                            i4 = 208864657 ^ i4;
                            ItemControlCommand itemControlCommand = new ItemControlCommand(this, 887661750);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -841539909) {
                                int i9 = 1809457967 ^ i4;
                                PluginCommand command = this.api.getCommand(xldwqcpovu(elldkxfbihnrbwi(), ipnjjcfqyopigod(), i9));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -1828321344) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1828321344 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1597696122 ^ i9)) {
                                            break;
                                        }
                                    }
                                    int i10 = 666702819 ^ i9;
                                    throw new IllegalAccessException("double");
                                }
                                i6 = 1068837333 ^ i9;
                                if (command == null) {
                                    i5 = upuymlkbjjdrmtzs(i6, 509047860);
                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1856981353) {
                                    int i11 = 1721148017 ^ i6;
                                    command.setExecutor(itemControlCommand);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 1511676642) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1511676642 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1862052607 ^ i11)) {
                                                break;
                                            }
                                        }
                                        int i12 = 1709083429 ^ i11;
                                        throw new IllegalAccessException("double");
                                    }
                                    i4 = 347823830 ^ i11;
                                    command.setTabCompleter(itemControlCommand);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -4150190) {
                                        i5 = 1819969683 ^ i4;
                                    }
                                }
                                startCleanupTask(216650074);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1676351287) {
                                    int i13 = 1963583879 ^ i5;
                                    return;
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1856981353 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1980540050 ^ i6)) {
                        int i14 = 894034900 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1681657875 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1001264207 ^ i6)) {
                            break;
                        }
                    }
                }
                int i15 = 1831348645 ^ i6;
                throw new RuntimeException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1676351287 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (602756475 ^ i5)) {
                    int i16 = 1265923290 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1316510873 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1704135050 ^ i5)) {
                        break;
                    }
                }
            }
            int i17 = 1858096964 ^ i5;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1767137472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1753506447 ^ i4)) {
                int i18 = 749875245 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -841539909 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1947868080 ^ i4)) {
                    int i19 = 1309727481 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 459551787 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (561397513 ^ i4)) {
                        int i20 = 2077309329 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1370541517 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (437822683 ^ i4)) {
                            int i21 = 1298354245 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -4150190 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1165034749 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i22 = 197595556 ^ i4;
        throw new IOException();
    }

    @Override
    public void onModuleDisable(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.ItemControl.onModuleDisable(int):void");
    }

    @Override
    public void reload(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.ItemControl.reload(int):void");
    }

    private void startCleanupTask(int i) {
        int i2 = 2093516263 ^ (551872706 ^ 1552983083);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 98977904) {
            i2 = 1032891115 ^ i2;
            this.cleanupTask = SchedulerUtil.runTimer(() -> {
                int i3 = 1504979496 ^ (1237504799 ^ 1552983083);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1731389666) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1731389666 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (374650310 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 1359463087 ^ i3;
                    throw new IOException("double");
                }
                int i5 = 778255970 ^ i3;
                if (this.cooldownManager == null) {
                    upuymlkbjjdrmtzs(i5, 1507351353);
                    return;
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 338369523) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -622214599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (56958773 ^ i5)) {
                            int i6 = 1715627298 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 338369523 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1256202164 ^ i5)) {
                                break;
                            }
                        }
                    }
                    int i7 = 1702789232 ^ i5;
                    throw new IllegalAccessException();
                }
                int i8 = 1069842807 ^ i5;
                this.cooldownManager.cleanup(1239701253);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -368111542) {
                    int i9 = 1713166926 ^ i8;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -368111542 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (548282096 ^ i8)) {
                        break;
                    }
                }
                int i10 = 1543916832 ^ i8;
                throw new RuntimeException("double");
            }, 6000L, 6000L, 2041710047);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -379379927) {
                int i3 = 1767456771 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1549197518 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1678981481 ^ i2)) {
                int i4 = 1057877 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -379379927 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1304001365 ^ i2)) {
                    int i5 = 1670025374 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 98977904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (378078389 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 559834009 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public ItemControlConfig getConfiguration(int i) {
        int i2 = 108594738 ^ (1687276541 ^ 1552983083);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -205304031) {
            int i3 = 1893718549 ^ i2;
            return this.configuration;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -205304031 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1039962181 ^ i2)) {
                int i4 = 219325563 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1966972810 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1234412610 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1828838586 ^ i2;
        throw new IOException();
    }

    @Generated
    public CooldownManager getCooldownManager(int i) {
        int i2 = 896835127 ^ (2043398716 ^ 1552983083);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2122350336) {
            int i3 = 424015146 ^ i2;
            return this.cooldownManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1263544400 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (306052484 ^ i2)) {
                int i4 = 652509784 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2122350336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (78411023 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1534125026 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public RegionHelper getRegionHelper(int i) {
        int i2 = 1693366495 ^ (942901642 ^ 1552983083);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 40676336) {
            int i3 = 184783936 ^ i2;
            return this.regionHelper;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 40676336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1704609865 ^ i2)) {
                int i4 = 1638675320 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1517292016 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2052161215 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1865353656 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public ItemControlListener getListener() {
        int i = 201020468 ^ (1819914884 ^ 1552983083);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -661515047) {
            int i2 = 901060560 ^ i;
            return this.listener;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1966778968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1636148878 ^ i)) {
                int i3 = 390048340 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -661515047 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (912522321 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1936220172 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public SchedulerUtil.Task getCleanupTask() {
        int i = 914275220 ^ (921813235 ^ 1552983083);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -520160670) {
            int i2 = 1411653726 ^ i;
            return this.cleanupTask;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1105197200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2132525078 ^ i)) {
                int i3 = 1155626979 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -520160670 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1409230471 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1546129410 ^ i;
        throw new IOException();
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
        AKQlxkF42k = (-1524334285) ^ new Random(9115939934401421592L).nextInt();
    }

    public static String xldwqcpovu(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] ipnjjcfqyopigod() {
        return new byte[]{30, 91, 50, 24, 96, 88, 38, 25, 59, 125, 108, 75, 4, 89, 31, 75, 11, 55, 100, 77, 65, 39, 62, 80, 6, 63, 111, 3, 51, 104};
    }

    private static byte[] elldkxfbihnrbwi() {
        return new byte[]{-45, -108, 10, 66, 83, 28, 17, 72, 15, 35, 92, 16, 55, 5, 47, 18, 63, 119, 87, 15, 121, 123, 13, 12};
    }

    private static int upuymlkbjjdrmtzs(int i, int i2) {
        return i2 ^ i;
    }
}
