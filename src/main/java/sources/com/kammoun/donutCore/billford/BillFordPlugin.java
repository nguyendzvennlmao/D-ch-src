package com.kammoun.donutCore.billford;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.billford.commands.BillfordCommand;
import com.kammoun.donutCore.billford.commands.BillfordPresetCommand;
import com.kammoun.donutCore.billford.config.BillfordConfig;
import com.kammoun.donutCore.billford.manager.BillfordManager;
import com.kammoun.donutCore.billford.manager.GuiManager;
import com.kammoun.donutCore.billford.task.PresetChangeTask;
import com.kammoun.donutCore.billford.utils.PlaceHolderHelper;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;

public class BillFordPlugin extends DonutModule {
    private BillfordConfig billfordConfig;
    private BillfordManager billfordManager;
    private GuiManager guiManager;
    private PresetChangeTask presetChangeTask;
    private PlaceHolderHelper placeHolderHelper;
    private static int fgGtVzXqIb = 0;
    private transient int EGWCCGp2An = 2048244616;
    private static String[] nothing_to_see_here = new String[15];

    public BillFordPlugin() {
        super("BillFord", 1095143273);
        int i = 1066408267 ^ (1807264925 ^ 1401058065);
        int parseInt = 703481540 ^ (200540054 ^ Integer.parseInt("632782741"));
        this.EGWCCGp2An = 2048244616 ^ fgGtVzXqIb;
        int i2 = 1513319352 ^ (618198297 ^ parseInt);
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 31011762 ^ (45862319 ^ 1183213893);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 790936258) {
            int i3 = 487343571 ^ i2;
            this.billfordConfig = new BillfordConfig(this, 506765984);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -951675814) {
                int i4 = 1998546363 ^ i3;
                this.billfordManager = new BillfordManager(this, this.billfordConfig, 2027917542);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 2143140225) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2143140225 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (427604924 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 1444926092 ^ i4;
                    throw new IOException("double");
                }
                i3 = 1985302387 ^ i4;
                this.guiManager = new GuiManager(this, this.billfordConfig, this.billfordManager, 901619557);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -854080998) {
                    i2 = 1414605620 ^ i3;
                    registerEvent(this.guiManager, 1095327048);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1872665528) {
                        int i6 = 56433298 ^ i2;
                        registerCommand((KCommand) new BillfordCommand(this, 136413976), egwhslqtua(hijpfculgaowoot(), nnnhhxljuakposr(), i6), 800215123);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1970687784) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1970687784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1144225932 ^ i6)) {
                                    break;
                                }
                            }
                            int i7 = 182877658 ^ i6;
                            throw new IOException("double");
                        }
                        int i8 = 711552845 ^ i6;
                        registerCommand((KCommand) new BillfordPresetCommand(this, 1468337184), egwhslqtua(yclniybmloolvje(), nnnhhxljuakposr(), i8), 800215123);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 641545537) {
                            i8 = 1530425233 ^ i8;
                            this.presetChangeTask = new PresetChangeTask(this, this.billfordManager, this.billfordConfig, 1643106520);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -112181) {
                                i3 = 1902089108 ^ i8;
                                this.presetChangeTask.start(1092501238);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1963119976) {
                                    i2 = 1447055185 ^ i3;
                                    this.placeHolderHelper = new PlaceHolderHelper(this, 2116900447);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -956256286) {
                                        int i9 = 446010107 ^ i2;
                                        return;
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 641545537 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (378301227 ^ i8)) {
                                int i10 = 45808479 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -112181 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (143267674 ^ i8)) {
                                    break;
                                }
                            }
                        }
                        int i11 = 1589021147 ^ i8;
                        throw new IOException("double");
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -951675814 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (754145377 ^ i3)) {
                    int i12 = 2061547960 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -854080998 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1537472077 ^ i3)) {
                        int i13 = 1925832932 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 330053690 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1074259252 ^ i3)) {
                            int i14 = 1554345038 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1963119976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1427520934 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i15 = 1401828395 ^ i3;
            throw new IOException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -956256286 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1872815241 ^ i2)) {
                int i16 = 735551672 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1872665528 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1170041664 ^ i2)) {
                    int i17 = 310575339 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 790936258 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (815576355 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i18 = 1556754570 ^ i2;
        throw new RuntimeException("double");
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 1999901153 ^ (434236934 ^ 1183213893);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1117566225) {
            int i3 = 797414837 ^ i2;
            if (this.presetChangeTask != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1050679480) {
                    i3 = 1784281624 ^ i3;
                    this.presetChangeTask.stop(1043355883);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1819265147) {
                        i2 = 650046039 ^ i3;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1819265147 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (875914124 ^ i3)) {
                        int i4 = 349095264 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1050679480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1538850352 ^ i3)) {
                            int i5 = 920880461 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1813785394 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (242274614 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
                int i6 = 307306785 ^ i3;
                throw new RuntimeException();
            }
            i2 = 1290211407 ^ i3;
            if (this.guiManager == null) {
                ynnnysuobtstjmbl(i2, 1497795872);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1503173314) {
                i3 = 112236094 ^ i2;
                this.guiManager.closeAllGuis(156706268);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1813785394) {
                    int i7 = 1609964318 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1819265147) {
                        int i42 = 349095264 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1050679480) {
                            int i52 = 920880461 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1813785394) {
                                break;
                                break;
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
                int i62 = 307306785 ^ i3;
                throw new RuntimeException();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1117566225 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (759814620 ^ i2)) {
                int i8 = 1229892217 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1503173314 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1771251184 ^ i2)) {
                    break;
                }
            }
        }
        int i9 = 1846710998 ^ i2;
        throw new RuntimeException("double");
    }

    @Override
    public void reload(int i) {
        int i2 = 817334898 ^ (1447906526 ^ 1183213893);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 65371977) {
            int i3 = 847388894 ^ i2;
            this.billfordConfig.reload(1955211744);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1745585736) {
                i3 = 70233185 ^ i3;
                this.billfordManager.reload(736968626);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1232528720) {
                    int i4 = 1267497492 ^ i3;
                    this.guiManager.reload(664808951);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -353711598) {
                        i2 = 1356193747 ^ i4;
                        if (this.presetChangeTask == null) {
                            ynnnysuobtstjmbl(i2, 1491472381);
                            return;
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1816409224) {
                            i2 = 1368187990 ^ i2;
                            this.presetChangeTask.stop(1043355883);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -534571462) {
                                i4 = 165974896 ^ i2;
                                this.presetChangeTask.start(1092501238);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1358459462) {
                                    int i5 = 9337051 ^ i4;
                                    return;
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -353711598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1610836035 ^ i4)) {
                            int i6 = 1401872310 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1358459462 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (608837913 ^ i4)) {
                                break;
                            }
                        }
                    }
                    int i7 = 1742848447 ^ i4;
                    throw new IllegalAccessException("double");
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1745585736 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (851661965 ^ i3)) {
                    int i8 = 1971096721 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1232528720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (768898262 ^ i3)) {
                        break;
                    }
                }
            }
            int i9 = 979450310 ^ i3;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1418441886 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1390800092 ^ i2)) {
                int i10 = 135293009 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 65371977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (897261755 ^ i2)) {
                    int i11 = 376318939 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -534571462 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (428418672 ^ i2)) {
                        int i12 = 690457230 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1816409224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1650689269 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i13 = 1521143672 ^ i2;
        throw new IOException();
    }

    @Generated
    public BillfordConfig getBillfordConfig() {
        int i = 1613000568 ^ (1803604798 ^ 1183213893);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1763092506) {
            int i2 = 1175357364 ^ i;
            return this.billfordConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1499633080 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1941053345 ^ i)) {
                int i3 = 1339742551 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1763092506 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (734333329 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1936854533 ^ i;
        throw new IOException();
    }

    @Generated
    public BillfordManager getBillfordManager(int i) {
        int i2 = 1600253835 ^ (1172877333 ^ 1183213893);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -528894246) {
            int i3 = 1727882807 ^ i2;
            return this.billfordManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -678262943 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1936364392 ^ i2)) {
                int i4 = 1154229225 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -528894246 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1211243858 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 563022268 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public GuiManager getGuiManager(int i) {
        int i2 = 1450317417 ^ (2044968808 ^ 1183213893);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1220411939) {
            int i3 = 1315038684 ^ i2;
            return this.guiManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1001467073 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (162698864 ^ i2)) {
                int i4 = 2128215056 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1220411939 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1415529154 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1636924364 ^ i2;
        throw new IOException();
    }

    @Generated
    public PresetChangeTask getPresetChangeTask() {
        int i = 1167523605 ^ (1797848708 ^ 1183213893);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1103316643) {
            int i2 = 2107164726 ^ i;
            return this.presetChangeTask;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1392179440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1428763141 ^ i)) {
                int i3 = 438784233 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1103316643 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1277132070 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 491944162 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public PlaceHolderHelper getPlaceHolderHelper(int i) {
        int i2 = 1263509680 ^ (826874992 ^ 1183213893);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -469324759) {
            int i3 = 288340433 ^ i2;
            return this.placeHolderHelper;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1836802721 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1376608442 ^ i2)) {
                int i4 = 1624436136 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -469324759 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1214798698 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1830914669 ^ i2;
        throw new RuntimeException();
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
        fgGtVzXqIb = 1553540031 ^ new Random(6144812161156415246L).nextInt();
    }

    public static String egwhslqtua(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] nnnhhxljuakposr() {
        return new byte[]{34, 121, 8, 68, 76, 5, 18, 99, 83, 93, 68, 93, 80, 86, 94, 69, 51, 96, 26, 97, 48, 20, 26, 31, 94, 117, 42, 93, 30, 105, 67, 57, 106, 73, 62, 24, 68, 99, 20, 107, 115, 62, 31, 34};
    }

    private static byte[] yclniybmloolvje() {
        return new byte[]{-22, -73, 63, 22, 122, 88, 35, 63, 103, 7, 117, 12, 96, 15, 106, 6, 3, 48, 44, 32, 7, 86, 44, 78, 111, 54, 30, 14, 47, 42};
    }

    private static byte[] hijpfculgaowoot() {
        return new byte[]{-18, -78, 62, 21, Byte.MAX_VALUE, 89, 43, 56, 96, 3, 112, 13, 99, 10, 107, 14, 4, 55};
    }

    private static int ynnnysuobtstjmbl(int i, int i2) {
        return i ^ i2;
    }
}
