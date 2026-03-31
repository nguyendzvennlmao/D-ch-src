package com.kammoun.donutCore.clearlag;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.clearlag.managers.ConfigManager;
import com.kammoun.donutCore.clearlag.managers.MessageManager;
import com.kammoun.donutCore.clearlag.task.ClearTask;
import com.kammoun.donutCore.clearlag.task.ClearTaskFolia;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import io.papermc.paper.threadedregions.scheduler.ScheduledTask;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;

public class ClearLag extends DonutModule {
    private static ClearLag instance;
    private ConfigManager configManager;
    private MessageManager messageManager;
    private int countdown;
    private ScheduledTask foliaTimerTask;
    private BukkitTask bukkitTimerTask;
    private static int sVbvdFANPZ = 0;
    private transient int MzxA8xk1v3 = 1405550779;
    private static byte[] sbjhnezcow;
    private static String[] nothing_to_see_here = new String[15];

    public ClearLag() {
        super("ClearLag", 1095143273);
        int i = 1553436372 ^ (1591851636 ^ 1476441046);
        int parseInt = 1949435765 ^ (365414355 ^ Integer.parseInt("998459344"));
        this.MzxA8xk1v3 = 1405550779 ^ sVbvdFANPZ;
        int gsqkifyujjgqtmfr = 826534711 ^ gsqkifyujjgqtmfr(parseInt, 69506411);
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 1480695154 ^ (249166613 ^ 1256480767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -471741248) {
            i2 = 1405618103 ^ i2;
            instance = this;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2107765114) {
                int i3 = 1736693691 ^ i2;
                this.configManager = new ConfigManager(this, 1204220315);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1103056033) {
                    i2 = 3112645 ^ i3;
                    this.messageManager = new MessageManager(this, 1300832669);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1086634633) {
                        i2 = 655570217 ^ i2;
                        if (SchedulerUtil.isFolia(860867585) == (252420728 ^ i2)) {
                            i3 = 1565960832 ^ i2;
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2019365824) {
                            i3 = 1565960832 ^ i2;
                        }
                        scheduleMainTimer(470300152);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1830271038) {
                            int i4 = 493505015 ^ i3;
                            return;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1830271038 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1697249366 ^ i3)) {
                        int i5 = 27618331 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1103056033 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (719375766 ^ i3)) {
                            break;
                        }
                    }
                }
                int i6 = 1137483707 ^ i3;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -471741248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2081145680 ^ i2)) {
                int i7 = 643505348 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1086634633 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (768199166 ^ i2)) {
                    int i8 = 1182929380 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2019365824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1793457132 ^ i2)) {
                        int i9 = 1061669572 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2107765114 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (899230734 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i10 = 502544780 ^ i2;
        throw new IOException();
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 960277796 ^ (360962236 ^ 1256480767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 853103419) {
            int i3 = 1397910597 ^ i2;
            if (SchedulerUtil.isFolia(860867585) != (889800226 ^ i3)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1471532783) {
                    int i4 = 1778235931 ^ i3;
                    if (this.foliaTimerTask == null) {
                        i2 = gsqkifyujjgqtmfr(i4, 1052008095);
                    } else {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -408428086) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -408428086 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (363923276 ^ i4)) {
                                    break;
                                }
                            }
                            int i5 = 940857939 ^ i4;
                            throw new IOException("double");
                        }
                        i2 = 1623740538 ^ i4;
                        this.foliaTimerTask.cancel();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -505060839) {
                            i2 = 1585188581 ^ i2;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 826688546 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1917910413 ^ i3)) {
                        int i6 = 1523471752 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1471532783 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1523248338 ^ i3)) {
                            break;
                        }
                    }
                }
                int i7 = 529251114 ^ i3;
                throw new IllegalAccessException("double");
            }
            i2 = gsqkifyujjgqtmfr(i3, 1464460420);
            if (SchedulerUtil.isFolia(860867585) != (1648403110 ^ i2)) {
                gsqkifyujjgqtmfr(i2, 1767224302);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 302322995) {
                i2 = 209928863 ^ i2;
                if (this.bukkitTimerTask == null) {
                    gsqkifyujjgqtmfr(i2, 1708585329);
                    return;
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1981743563) {
                    i3 = 686500029 ^ i2;
                    this.bukkitTimerTask.cancel();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 826688546) {
                        int i8 = 1295899084 ^ i3;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 826688546) {
                            int i62 = 1523471752 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1471532783) {
                                break;
                                break;
                            }
                            continue;
                        }
                    }
                    int i72 = 529251114 ^ i3;
                    throw new IllegalAccessException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1981743563 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1928345158 ^ i2)) {
                int i9 = 264035676 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 302322995 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (318664958 ^ i2)) {
                    int i10 = 921044274 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -505060839 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2102211063 ^ i2)) {
                        int i11 = 492939306 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 853103419 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (77891579 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i12 = 1061085489 ^ i2;
        throw new RuntimeException();
    }

    @Override
    public void reload(int i) {
        int i2 = 1138603510 ^ (1513060964 ^ 1256480767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1733000342) {
            int i3 = 1551710488 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2069711784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (605753252 ^ i2)) {
                int i4 = 1745672129 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1733000342 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (127754141 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 511261731 ^ i2;
        throw new RuntimeException();
    }

    private void scheduleMainTimer(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.clearlag.ClearLag.scheduleMainTimer(int):void");
    }

    private void runClearTask(int i) {
        int gsqkifyujjgqtmfr;
        int i2 = 1979274103 ^ (1655005022 ^ 1256480767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -306012494) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -306012494 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (383078459 ^ i2)) {
                    break;
                }
            }
            int i3 = 850653090 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1630087357 ^ i2;
        if (SchedulerUtil.isFolia(860867585) != (1016167275 ^ i4)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -460596391) {
                gsqkifyujjgqtmfr = 1377590796 ^ i4;
                new ClearTaskFolia(this, 494827864).run();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gsqkifyujjgqtmfr) != 1953049403) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gsqkifyujjgqtmfr) == 1953049403 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gsqkifyujjgqtmfr) == (827599378 ^ gsqkifyujjgqtmfr)) {
                            break;
                        }
                    }
                    int i5 = 2042645001 ^ gsqkifyujjgqtmfr;
                    throw new RuntimeException("double");
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(gsqkifyujjgqtmfr)) {
                        case 103880442:
                            gsqkifyujjgqtmfr = 994222611 ^ gsqkifyujjgqtmfr;
                        case 101066630:
                            try {
                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(gsqkifyujjgqtmfr) == 105006015) {
                                    throw new IOException();
                                }
                                throw null;
                            } catch (IOException e) {
                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                    case -1367589982:
                                        i4 = gsqkifyujjgqtmfr(gsqkifyujjgqtmfr, 1884008474);
                                        break;
                                    case 213858729:
                                        i4 = 68407387 ^ gsqkifyujjgqtmfr;
                                        break;
                                    default:
                                        throw new IOException("Error in hash");
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 740408177) {
                                    int i6 = 1498983862 ^ i4;
                                    return;
                                }
                            }
                            break;
                        case 1478394006:
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 740408177 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1803814947 ^ i4)) {
                    int i7 = 1499559556 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -460596391 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1168845993 ^ i4)) {
                        int i8 = 1161012147 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1367589982 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1185884031 ^ i4)) {
                            int i9 = 1798532789 ^ i4;
                            throw new IOException("double");
                        }
                    }
                }
            }
        } else {
            gsqkifyujjgqtmfr = gsqkifyujjgqtmfr(i4, 1974646214);
            Bukkit.getScheduler().runTask(getApi(2142241109), new ClearTask(this, 1273709157));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gsqkifyujjgqtmfr) == 1226732906) {
                int i10 = 905925749 ^ gsqkifyujjgqtmfr;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gsqkifyujjgqtmfr) == 213858729 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gsqkifyujjgqtmfr) == (90628136 ^ gsqkifyujjgqtmfr)) {
                int i11 = 412311273 ^ gsqkifyujjgqtmfr;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gsqkifyujjgqtmfr) == -421210429 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gsqkifyujjgqtmfr) == (1618259456 ^ gsqkifyujjgqtmfr)) {
                    int i12 = 1215607594 ^ gsqkifyujjgqtmfr;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gsqkifyujjgqtmfr) == 1226732906 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gsqkifyujjgqtmfr) == (2013522039 ^ gsqkifyujjgqtmfr)) {
                        int i13 = 797175513 ^ gsqkifyujjgqtmfr;
                        throw new IllegalAccessException();
                    }
                }
            }
        }
    }

    @Generated
    public ConfigManager getConfigManager(int i) {
        int i2 = 63982607 ^ (590617163 ^ 1256480767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1342197211) {
            int i3 = 789738418 ^ i2;
            return this.configManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1342197211 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (348409048 ^ i2)) {
                int i4 = 1302080186 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 680775754 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1620775195 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 636116210 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public MessageManager getMessageManager(int i) {
        int i2 = 1017569555 ^ (168120240 ^ 1256480767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -499152157) {
            int i3 = 1192956936 ^ i2;
            return this.messageManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -499152157 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (478138733 ^ i2)) {
                int i4 = 243632126 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -622384479 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (622485772 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1766529061 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getCountdown() {
        int i = 1949663203 ^ (1842839268 ^ 1256480767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1741490238) {
            int i2 = 1841497526 ^ i;
            return this.countdown;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1741490238 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (816997050 ^ i)) {
                int i3 = 1863271884 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -164963727 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1582278133 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 816305371 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public ScheduledTask getFoliaTimerTask() {
        int i = 196796972 ^ (1032682296 ^ 1256480767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -425838757) {
            int i2 = 222033457 ^ i;
            return this.foliaTimerTask;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -425838757 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (370978202 ^ i)) {
                int i3 = 28027172 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1891531053 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1138107624 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 151595222 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public BukkitTask getBukkitTimerTask() {
        int i = 1153156541 ^ (1894332519 ^ 1256480767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -172682965) {
            int i2 = 1458548734 ^ i;
            return this.bukkitTimerTask;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1120431833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (490500448 ^ i)) {
                int i3 = 647924813 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -172682965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (772150555 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1192071802 ^ i;
        throw new IOException();
    }

    @Generated
    public static ClearLag getInstance() {
        int i = 356007259 ^ (1664902834 ^ (462566288 ^ 421748548));
        return instance;
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
        sbjhnezcow = muokswngynrefch();
        sVbvdFANPZ = (-873128726) ^ new Random(7753507853386500901L).nextInt();
    }

    public static String tlzhjsfyyq(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ sbjhnezcow[i3 % sbjhnezcow.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] muokswngynrefch() {
        return new byte[]{30, 68, 12, 10, 33, 118, 58, 122, 98, 68, 90, 33, 30, 124, 25, 105, 84, 4, 86, 106, 31, 76, 117, 116, 119, 93, 85, 43, Byte.MAX_VALUE, 70, 9, 126, 50, 6, 28, 88, 20, 102, 60, 79, 115, 56, 95, 69, 13, 84, 14, 94, 114, 75, 57, 23, 72, 86, 71, 116, 90, 94, 97, 122, 73, 64, 19, 88, 20, 16, 108, 9, 83, 32, 17, 99, 12, 121, 93, 112, 84, 13, 47, 72, 70, 5, 16, 74, 35, 5, 34, 69, 9, 39, 83, Byte.MAX_VALUE, 38, 4, 107, 75, 31, 40, 81, 36, 105, 14, 18, 71, 73, 9, 99, 104, 21, 95, 25, 6, 60, 65, 17, 30, 41, 21, 57, 43, 61, 30, 31, 115, 36, 68, 107};
    }

    private static int gsqkifyujjgqtmfr(int i, int i2) {
        return i2 ^ i;
    }
}
