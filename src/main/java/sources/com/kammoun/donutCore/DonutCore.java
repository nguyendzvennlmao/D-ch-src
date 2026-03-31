package com.kammoun.donutCore;

import com.kammoun.donutCore.billford.BillFordPlugin;
import com.kammoun.donutCore.clearlag.ClearLag;
import com.kammoun.donutCore.combat.CombatPlugin;
import com.kammoun.donutCore.core.CorePlugin;
import com.kammoun.donutCore.crates.Crates;
import com.kammoun.donutCore.disablephantom.Phantom;
import com.kammoun.donutCore.doublejump.DoubleJump;
import com.kammoun.donutCore.economy.EconomyPlugin;
import com.kammoun.donutCore.enderchest.CustomEnderChest;
import com.kammoun.donutCore.fly.FlyPlugin;
import com.kammoun.donutCore.home.HomePlugin;
import com.kammoun.donutCore.itemcontrol.ItemControl;
import com.kammoun.donutCore.leaderboard3.LeaderBoardPlugin3;
import com.kammoun.donutCore.mythictools.MythicPlugin;
import com.kammoun.donutCore.playertracker.PlayerTrackerPlugin;
import com.kammoun.donutCore.portals.PortalPlugin;
import com.kammoun.donutCore.rtp.Rtp;
import com.kammoun.donutCore.rtpzone.RtpZone;
import com.kammoun.donutCore.sell.SellPlugin;
import com.kammoun.donutCore.settings.SettingsPlugin;
import com.kammoun.donutCore.shop.ShopPlugin;
import com.kammoun.donutCore.spawn.SpawnPlugin;
import com.kammoun.donutCore.spawner.SpawnerPlugin;
import com.kammoun.donutCore.stats.StatsPlugin;
import com.kammoun.donutCore.team.TeamPlugin;
import com.kammoun.donutCore.tpa.TeleportPlugin;
import com.kammoun.donutCore.warps.Warp;
import com.kammoun.utils.lib.folialib.FoliaLib;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import lombok.Generated;
import org.bukkit.plugin.java.JavaPlugin;

public final class DonutCore extends JavaPlugin {
    private static DonutCore instance;
    private FoliaLib foliaLib;
    private final List<String> enabledModules;
    private final List<String> failedModules;
    private long startTime;
    private Crates cratesModule;
    private DoubleJump doubleJump;
    private Phantom phantom;
    private Warp warp;
    private Rtp rtp;
    private RtpZone rtpZone;
    private ClearLag clearLag;
    private ShopPlugin shopPlugin;
    private SellPlugin sellPlugin;
    private ItemControl itemControl;
    private CorePlugin corePlugin;
    private CombatPlugin combatPlugin;
    private StatsPlugin statsPlugin;
    private LeaderBoardPlugin3 leaderBoardPlugin;
    private TeleportPlugin teleportPlugin;
    private TeamPlugin teamPlugin;
    private HomePlugin homePlugin;
    private SpawnerPlugin spawnerPlugin;
    private MythicPlugin mythicPlugin;
    private CustomEnderChest customEnderChest;
    private PortalPlugin portalPlugin;
    private SpawnPlugin spawnPlugin;
    private SettingsPlugin settingsPlugin;
    private BillFordPlugin billFordPlugin;
    private PlayerTrackerPlugin playerTrackerPlugin;
    private FlyPlugin flyPlugin;
    private EconomyPlugin economyPlugin;
    private static int uarlVRkHH1 = 0;
    private transient int NXV0eaI7uc = 1579504883;
    private static byte[] wjnalwddhn;
    private static String[] nothing_to_see_here = new String[18];

    public DonutCore() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.DonutCore.<init>():void");
    }

    public void onEnable() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.DonutCore.onEnable():void");
    }

    private boolean isModuleEnabled(String str, int i) {
        int i2 = 1707299598 ^ (1708545086 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1085899736) {
            i2 = 2077277171 ^ i2;
            String str2 = "Modules." + str + ".enabled";
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1640211379) {
                return getConfig().getBoolean(str2, (byte) (2077795679 ^ (400609576 ^ i2)));
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1640211379 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (219269556 ^ i2)) {
                int i3 = 1429814003 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -557503757 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1593237222 ^ i2)) {
                    int i4 = 72439463 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1085899736 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (646362813 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i5 = 457325062 ^ i2;
        throw new RuntimeException();
    }

    public void onDisable() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.DonutCore.onDisable():void");
    }

    private void printHeader(int i) {
        int i2 = 625319805 ^ (1466106314 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 786083859) {
            int i3 = 997396702 ^ i2;
            CorePlugin.Inform(ykijifssff(djfwxpvefotqsti(), i3), 584419703);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -180209950) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -180209950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1580237133 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1374267250 ^ i3;
                throw new IllegalAccessException("double");
            }
            i2 = 2332174 ^ i3;
            CorePlugin.Inform(ykijifssff(jxdrpaaccwwmfap(), i2), 584419703);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -195131758) {
                int i5 = 1103973382 ^ i2;
                CorePlugin.Inform(ykijifssff(usyvwtvtifkyvko(), i5), 584419703);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -97196384) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -97196384 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1290700298 ^ i5)) {
                            break;
                        }
                    }
                    int i6 = 49867372 ^ i5;
                    throw new IOException("double");
                }
                int i7 = 1754167714 ^ i5;
                CorePlugin.Inform(ykijifssff(kshzennpkozuupk(), i7), 584419703);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -1102632013) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1102632013 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1222927346 ^ i7)) {
                            break;
                        }
                    }
                    int i8 = 787351304 ^ i7;
                    throw new IOException("double");
                }
                int i9 = 68788766 ^ i7;
                CorePlugin.Inform("&b&l  ║  &7Version: &f" + getDescription().getVersion() + padRight(ykijifssff(zshdlctiadrwdia(), i9), ((byte) (1943095104 ^ i9)) - getDescription().getVersion().length(), 968637992) + "   &b&l║", 584419703);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -1635108029) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1635108029 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1070359004 ^ i9)) {
                            break;
                        }
                    }
                    int i10 = 994786361 ^ i9;
                    throw new IOException("double");
                }
                i2 = 178878888 ^ i9;
                CorePlugin.Inform(ykijifssff(njowwewcwrjcvbu(), i2), 584419703);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -876481021) {
                    int i11 = 1176879707 ^ i2;
                    CorePlugin.Inform(ykijifssff(dxwcuhcrifzwdhc(), i11), 584419703);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -84941607) {
                        i11 = 1313448545 ^ i11;
                        CorePlugin.Inform(ykijifssff(rhiztofiyrokiob(), i11), 584419703);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -2002585645) {
                            int i12 = 674525871 ^ i11;
                            return;
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -2002585645 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1044049400 ^ i11)) {
                            int i13 = 582655909 ^ i11;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -84941607 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (797919237 ^ i11)) {
                                break;
                            }
                        }
                    }
                    int i14 = 1715961658 ^ i11;
                    throw new RuntimeException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -195131758 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1815151982 ^ i2)) {
                int i15 = 953484713 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -876481021 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1270256464 ^ i2)) {
                    int i16 = 1884382904 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 786083859 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (681050332 ^ i2)) {
                        int i17 = 794987517 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -922656086 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2082492505 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i18 = 230158646 ^ i2;
        throw new IllegalAccessException();
    }

    private void printStartupSummary(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.DonutCore.printStartupSummary(int):void");
    }

    private String padRight(String str, int i, int i2) {
        int i3 = 1197510599 ^ (697114371 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -930954357) {
            int i4 = 1169159961 ^ i3;
            Object[] objArr = new Object[(byte) (1019195241 ^ i4)];
            objArr[(byte) (1019195240 ^ i4)] = str;
            return String.format("%-" + i + "s", objArr);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -436372671 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (555886330 ^ i3)) {
                int i5 = 929949265 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -930954357 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (285144162 ^ i3)) {
                    break;
                }
            }
        }
        int i6 = 1226079972 ^ i3;
        throw new IOException();
    }

    private void enableModule(com.kammoun.donutCore.api.module.DonutModule r6, java.lang.String r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.DonutCore.enableModule(com.kammoun.donutCore.api.module.DonutModule, java.lang.String, int):void");
    }

    private boolean isStudio(boolean r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.DonutCore.isStudio(boolean, int):boolean");
    }

    @Generated
    public List<String> getEnabledModules() {
        int i = 663904514 ^ (1934645534 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 436176202) {
            int i2 = 1115061365 ^ i;
            return this.enabledModules;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 436176202 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2120674897 ^ i)) {
                int i3 = 169609682 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 172779232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1616465942 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1733962248 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public List<String> getFailedModules() {
        int i = 300725827 ^ (1322666510 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1178183618) {
            int i2 = 997970495 ^ i;
            return this.failedModules;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1645791685 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (510884339 ^ i)) {
                int i3 = 550150921 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1178183618 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1064358776 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1530307871 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public long getStartTime() {
        int i = 1241523865 ^ (1320339760 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1703331616) {
            int i2 = 1806439978 ^ i;
            return this.startTime;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -954627661 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (899024798 ^ i)) {
                int i3 = 1947649333 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1703331616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1928606838 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 176133370 ^ i;
        throw new IOException();
    }

    @Generated
    public Crates getCratesModule(int i) {
        int i2 = 1262435374 ^ (1397293689 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2086647568) {
            int i3 = 127364603 ^ i2;
            return this.cratesModule;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1088739528 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (399662259 ^ i2)) {
                int i4 = 1852790754 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2086647568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (764827203 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2120447174 ^ i2;
        throw new IOException();
    }

    @Generated
    public DoubleJump getDoubleJump() {
        int i = 226529404 ^ (1842729067 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1119599341) {
            int i2 = 82188847 ^ i;
            return this.doubleJump;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1119599341 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1574081699 ^ i)) {
                int i3 = 1013942509 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1703635861 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (275228315 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 456077155 ^ i;
        throw new IOException();
    }

    @Generated
    public Phantom getPhantom() {
        int i = 87056789 ^ (1618874912 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1784817661) {
            int i2 = 2118997020 ^ i;
            return this.phantom;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1784817661 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (960485453 ^ i)) {
                int i3 = 2042995146 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1744271584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1201579083 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1274045221 ^ i;
        throw new IOException();
    }

    @Generated
    public Warp getWarp() {
        int i = 593385935 ^ (1376491697 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 893406811) {
            int i2 = 299667730 ^ i;
            return this.warp;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 893406811 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (652887034 ^ i)) {
                int i3 = 1588547990 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1146829109 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (766125794 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1892309327 ^ i;
        throw new IOException();
    }

    @Generated
    public Rtp getRtp() {
        int i = 1170775063 ^ (1010116239 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1879282027) {
            int i2 = 1912210497 ^ i;
            return this.rtp;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1879282027 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1253403571 ^ i)) {
                int i3 = 1145245943 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2903200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1883047186 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1051684118 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public RtpZone getRtpZone() {
        int i = 1934869655 ^ (1461535241 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1650822823) {
            int i2 = 264215704 ^ i;
            return this.rtpZone;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1650822823 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (667138931 ^ i)) {
                int i3 = 184615459 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -530147943 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (956867884 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 376667144 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public ClearLag getClearLag() {
        int i = 2027821060 ^ (942808046 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1198630150) {
            int i2 = 806928683 ^ i;
            return this.clearLag;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 944264099 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1568848130 ^ i)) {
                int i3 = 1630571467 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1198630150 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (488899203 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 27301918 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public ShopPlugin getShopPlugin() {
        int i = 1056675069 ^ (1382727928 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -614144637) {
            int i2 = 497361637 ^ i;
            return this.shopPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 911078059 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (595318433 ^ i)) {
                int i3 = 1487106313 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -614144637 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (550475344 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 920515554 ^ i;
        throw new IOException();
    }

    @Generated
    public SellPlugin getSellPlugin() {
        int i = 1414076530 ^ (231202008 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1939366138) {
            int i2 = 716446460 ^ i;
            return this.sellPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1939366138 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1727831594 ^ i)) {
                int i3 = 922231064 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 641251099 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (310192065 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1335419586 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public ItemControl getItemControl() {
        int i = 492369070 ^ (1952238092 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -137383749) {
            int i2 = 939934245 ^ i;
            return this.itemControl;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -137383749 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (203909953 ^ i)) {
                int i3 = 1818559469 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 939368850 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (779770440 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1040641115 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public CorePlugin getCorePlugin() {
        int i = 1572268256 ^ (1295053042 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1004438840) {
            int i2 = 1743188748 ^ i;
            return this.corePlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 82386267 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (310705458 ^ i)) {
                int i3 = 341566076 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1004438840 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1432846743 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 36938892 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public CombatPlugin getCombatPlugin() {
        int i = 238432295 ^ (483526578 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 684718336) {
            int i2 = 1475719117 ^ i;
            return this.combatPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1755150486 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (451603781 ^ i)) {
                int i3 = 2075107847 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 684718336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1466260360 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 353022096 ^ i;
        throw new IOException();
    }

    @Generated
    public StatsPlugin getStatsPlugin(int i) {
        int i2 = 2140776751 ^ (770965260 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 750580914) {
            int i3 = 1882066965 ^ i2;
            return this.statsPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 750580914 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1500609930 ^ i2)) {
                int i4 = 183038273 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1379109863 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (625461753 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 418931739 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public LeaderBoardPlugin3 getLeaderBoardPlugin(int i) {
        int i2 = 1394385723 ^ (1825028110 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1094097921) {
            int i3 = 749232594 ^ i2;
            return this.leaderBoardPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1094097921 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (576927539 ^ i2)) {
                int i4 = 179255971 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 611685008 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (662503541 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 824730718 ^ i2;
        throw new IOException();
    }

    @Generated
    public TeleportPlugin getTeleportPlugin(int i) {
        int i2 = 1638948669 ^ (518956002 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1159308115) {
            int i3 = 1672890049 ^ i2;
            return this.teleportPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1159308115 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2132013961 ^ i2)) {
                int i4 = 2077568680 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1487639896 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (553109546 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 569518696 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public TeamPlugin getTeamPlugin(int i) {
        int i2 = 1159720659 ^ (895253213 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1039328731) {
            int i3 = 804795556 ^ i2;
            return this.teamPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1110655226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1150986633 ^ i2)) {
                int i4 = 1488070517 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1039328731 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (437198849 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1447119472 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public HomePlugin getHomePlugin() {
        int i = 1391106697 ^ (1458936806 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1625927984) {
            int i2 = 191847411 ^ i;
            return this.homePlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1625927984 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1632119070 ^ i)) {
                int i3 = 96292692 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -999517880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1373745907 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1159207743 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public SpawnerPlugin getSpawnerPlugin() {
        int i = 1840835892 ^ (406207977 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 328778563) {
            int i2 = 616390208 ^ i;
            return this.spawnerPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 913453378 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1449398399 ^ i)) {
                int i3 = 617344825 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 328778563 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1505409110 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2013791027 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public MythicPlugin getMythicPlugin() {
        int i = 1155525359 ^ (2098164541 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1902807865) {
            int i2 = 2092443359 ^ i;
            return this.mythicPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1902807865 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (510172044 ^ i)) {
                int i3 = 1547743710 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1800684094 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (82219109 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 265449397 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public CustomEnderChest getCustomEnderChest() {
        int i = 1747535069 ^ (190104268 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1543342813) {
            int i2 = 1366321458 ^ i;
            return this.customEnderChest;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 796998833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (145514374 ^ i)) {
                int i3 = 1649984230 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1543342813 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2069931420 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1000657634 ^ i;
        throw new IOException();
    }

    @Generated
    public PortalPlugin getPortalPlugin() {
        int i = 258103816 ^ (1568871718 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 686046426) {
            int i2 = 251443519 ^ i;
            return this.portalPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 686046426 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1455460276 ^ i)) {
                int i3 = 1682498401 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1593963810 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1875044526 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1064587924 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public SpawnPlugin getSpawnPlugin() {
        int i = 2104354748 ^ (1031556758 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1084027654) {
            int i2 = 748341876 ^ i;
            return this.spawnPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -608870565 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (716792280 ^ i)) {
                int i3 = 417434375 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1084027654 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1566936159 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1838236436 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public SettingsPlugin getSettingsPlugin(int i) {
        int i2 = 727944463 ^ (904760233 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1268674712) {
            int i3 = 1098989194 ^ i2;
            return this.settingsPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1201112266 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (619830589 ^ i2)) {
                int i4 = 1751329976 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1268674712 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2131206570 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 848691559 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public BillFordPlugin getBillFordPlugin(int i) {
        int i2 = 1337628023 ^ (1636297184 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -838491887) {
            int i3 = 1694861507 ^ i2;
            return this.billFordPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -433461494 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1776502627 ^ i2)) {
                int i4 = 429158522 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -838491887 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (84402848 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1436859227 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public PlayerTrackerPlugin getPlayerTrackerPlugin() {
        int i = 1416604823 ^ (450003590 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -905497310) {
            int i2 = 676577256 ^ i;
            return this.playerTrackerPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2003121565 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (66422700 ^ i)) {
                int i3 = 1986865363 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -905497310 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (28833527 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1183304112 ^ i;
        throw new IOException();
    }

    @Generated
    public FlyPlugin getFlyPlugin() {
        int i = 960393003 ^ (328667515 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -358238423) {
            int i2 = 397461893 ^ i;
            return this.flyPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1461975809 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (656754385 ^ i)) {
                int i3 = 1963871171 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -358238423 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1946504573 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1192100769 ^ i;
        throw new IOException();
    }

    @Generated
    public EconomyPlugin getEconomyPlugin() {
        int i = 875484670 ^ (1664779616 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 122470746) {
            int i2 = 1865300700 ^ i;
            return this.economyPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 122470746 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (870985333 ^ i)) {
                int i3 = 1112663778 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2117932985 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1932564583 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1845724268 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public static DonutCore getInstance(int i) {
        int i2 = 1968388523 ^ (740175868 ^ (459947820 ^ 1238932550));
        return instance;
    }

    @Generated
    public FoliaLib getFoliaLib(int i) {
        int i2 = 1545015017 ^ (727342136 ^ 402507957);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 92590883) {
            int i3 = 391870725 ^ i2;
            return this.foliaLib;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 92590883 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1373980881 ^ i2)) {
                int i4 = 1410079728 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1084286197 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1483927350 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1823069407 ^ i2;
        throw new IllegalAccessException();
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
        wjnalwddhn = bmkxrvyajszxgrt();
        uarlVRkHH1 = 1625727892 ^ new Random(-6713825760080861360L).nextInt();
    }

    public static String ykijifssff(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ wjnalwddhn[i3 % wjnalwddhn.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] bmkxrvyajszxgrt() {
        return new byte[]{72, 11, 97, 110, 97, 56, 84, 4, 51, 60, 121, 92, Byte.MAX_VALUE, 96, 125, 33, 21, 91, 80, 32, 65, 107, 13, 92, 47, 25, 70, 43, 89, 113, 18, 2, 59, 92, 37, 40, 126, 71, 115, 63, 11, 93, 72, 16, 13, 50, 52, 45, 78, 67, 57, 102, 8, 21, 70, 10, 41, 81, 102, 54, 3, 87, 108, 35, 113, 55, 31, 50};
    }

    private static byte[] fbvchtqcoeabdla() {
        return new byte[]{-113, -51, 87, 14, 85, 109, 99, 68, 1, 117};
    }

    private static byte[] qouaapudfmzkqwo() {
        return new byte[]{-126, -64, 82, 41, 84, 120, 96, 86, 6, 124, 77, 28};
    }

    private static byte[] iycvglnbymcopdi() {
        return new byte[]{-121, -51, 85, 42, 88, 125, 97, 82, 5, 126, 72, 11};
    }

    private static byte[] btjhqgxezjbshda() {
        return new byte[]{-121, -60, 86, 13, 88, 116, 102, 83, 0, 123, 72, 31};
    }

    private static byte[] uxdzvkbguuriway() {
        return new byte[]{-121, -62, 81, 49, 81, 117, 96, 88, 4, 96, 72, 9, 79, 57, 77, 118, 33, 22, 103, 99, 112, 50, 61, 6};
    }

    private static byte[] fmtvxenmudiwfav() {
        return new byte[]{-123, -64, 89, 60, 89, 103, 97, 68};
    }

    private static byte[] kogyejdqrwiztzb() {
        return new byte[]{-121, -61, 87, 46, 86, 107, 100, 65, 10, 126};
    }

    private static byte[] jlupfijmuztchga() {
        return new byte[]{-121, -57, 89, 56, 88, 98, 98, 70, 2, 109, 65, 2, 70, 48, 75, 124, 36, 29, 104, Byte.MAX_VALUE, 120, 46};
    }

    private static byte[] jtazherccokpcgh() {
        return new byte[]{-121, -63, 80, 41, 82, 104, 97, 89, 2, 121};
    }

    private static byte[] tbqxrzujymloliv() {
        return new byte[]{-114, -51, 84, 58, 87, 113, 101, 72, 0, 108, 64, 0, 70, 53, 77, 100, 45, 7, 104, 118, 116, 62, 59, 31};
    }

    private static byte[] ebomymveqatxkou() {
        return new byte[]{-121, -61, 85, 18, 83, 114, 98, 73, 3, 101, 72, 2, 75, 50, 79, 70, 35, 13, 96, 126, 112, 48, 57, 30};
    }

    private static byte[] givzepilhorbcfh() {
        return new byte[]{-124, -52, 82, 51, 81, 110, 98, 88, 3, 107, 65, 29, 71, 51, 69, Byte.MAX_VALUE, 45, 14, 98, 107, 114, 39};
    }

    private static byte[] tcqddqdevgtdoys() {
        return new byte[]{-121, -60, 81, 14, 85, 108, 97, 88, 0, 104};
    }

    private static byte[] xgapwjgjqfyxpst() {
        return new byte[]{-126, -61, 86, 31, 85, 101, 97, 64, 5, 109};
    }

    private static byte[] vuunvzrbcmxnqnl() {
        return new byte[]{-113, -57, 82, 34, 85, 105, 109, 87, 6, 104};
    }

    private static byte[] hpqfapkkauuamnh() {
        return new byte[]{-121, -62, 86, 27, 85, 99, 103, 80, 6, 107, 72, 24, 72, 26, 73, 119, 38, 13};
    }

    private static byte[] avzyqivfbmvubwb() {
        return new byte[]{-114, -57, 80, 14, 85, 120, 98, 86, 2, 115, 74, 3};
    }

    private static byte[] nfnosmwomfvhynf() {
        return new byte[]{-121, -61, 84, 6, 84, 101, 102, 87, 4, 124, 72, 14, 74, 42, 72, 68, 39, 27, 103, 120, 112, 63, 56, 15, 26, 77, 116, 107};
    }

    private static byte[] pmdybkkgtnioegj() {
        return new byte[]{-121, -52, 83, 18, 80, 109, 109, 86, 4, 110, 72, 1, 77, 34, 76, 83, 44, 7, 103, 119, 112, 33, 63, 8};
    }

    private static byte[] mybxlaiabincsvo() {
        return new byte[]{-121, -52, 87, 42, 88, Byte.MAX_VALUE, 96, 71, 1, 116, 72, 11, 73, 56, 68, 119};
    }

    private static byte[] qjlponlmgrqhhzz() {
        return new byte[]{-121, -61, 88, 30, 87, 100, 109, 88, 4, 104, 78, 23, 74, 21, 79, 112, 45, 9, 97, 100, 120, 42};
    }

    private static byte[] ndvurtabirmhohj() {
        return new byte[]{-121, -61, 81, 34, 89, 108, 98, 90, 5, 111, 72, 27, 79, 55, 69, 98, 35, 29};
    }

    private static byte[] ospwkukmfqzaowo() {
        return new byte[]{-113, -52, 83, 17, 85, 109, 103, 79};
    }

    private static byte[] dqiwzwomgwcveuw() {
        return new byte[]{Byte.MIN_VALUE, -62, 85, 52, 89, 103, 100, 84, 10, 107, 79, 26, 70, 52, 78, 112, 32, 5};
    }

    private static byte[] abdnhuznnlunvit() {
        return new byte[]{-121, -63, 86, 38, 88, 100, 99, 79, 7, 126, 72, 8, 72, 52, 68, 97};
    }

    private static byte[] hvkutbfbxtljuem() {
        return new byte[]{-121, -64, 88, 44, 82, 99, 102, 93, 5, 102, 72, 28, 70, 61, 78, Byte.MAX_VALUE};
    }

    private static byte[] lsyidwqcnpveyrg() {
        return new byte[]{-121, -52, 83, 18, 85, 96, 98, 95, 4, 110};
    }

    private static byte[] hlpjtruvsfgmeoy() {
        return new byte[]{-125, -59, 83, 11, 80, 105, 108, 90, 0, 108, 72, 30, 78, 62, 73, 107, 39, 28};
    }

    private static byte[] ufzmqvjxkklrhbw() {
        return new byte[]{-121, -57, 85, 50, 85, 106, 101, 83, 2, 97, 72, 10, 75, 34, 73, 116, 36, 2, 97, 120, 112, 42, 57, 8};
    }

    private static byte[] aalvbarnjoxomaw() {
        return new byte[]{-121, -52, 87, 15, 80, 111, 103, 84, 5, 96};
    }

    private static byte[] smupllqdzjvfyzd() {
        return new byte[]{-124, -60, 85, 45, 88, 100, 101, 80, 4, 115, 75, 9, 75, 33, 68, 101, 36, 28, 103, 119, 115, 56, 57, 4, 22, 76, 119, 108};
    }

    private static byte[] yxdutycrhqagmey() {
        return new byte[]{-121, -60, 86, 21, 88, 123, 96, 87, 0, 102, 72, 47, 72, 61, 68, 120, 33, 25, 99, 101, 112, 52, 58, 2};
    }

    private static byte[] eifvbritfgdtxdi() {
        return new byte[]{-121, -51, 88, 11, 86, 94, 103, 102};
    }

    private static byte[] gieghqbmclmgjlp() {
        return new byte[]{-121, -58, 84, 42, 83, Byte.MAX_VALUE, 98, 77};
    }

    private static byte[] tnvionyznxlmukm() {
        return new byte[]{-113, -61, 88, 43, 87, 108, 97, 93, 4, 105};
    }

    private static byte[] sosgnmapxnldkve() {
        return new byte[]{-114, -60, 87, 26, 83, 104, 109, 95, 1, 106, 73, 5, 78, 63, 78, 97};
    }

    private static byte[] qxknwfeswpnyghl() {
        return new byte[]{-121, -62, 87, 14, 86, 101, 108, 94, 10, 123};
    }

    private static byte[] dkdwntxuydvbjxx() {
        return new byte[]{-114, -58, 89, 12, 85, 109, 103, 67, 10, 112, 75, 13, 78, 58, 77, 117, 38, 17};
    }

    private static byte[] ytmbuzybfiwmohp() {
        return new byte[]{-121, -60, 85, 9, 88, 91, 100, 98, 5, 95, 72, 3, 75, 59, 68, 115};
    }

    private static byte[] wuwgjxlcqnlonnz() {
        return new byte[]{-121, -58, 80, 52, 80, 97, 102, 89, 3, 111, 72, 15, 78, 45};
    }

    private static byte[] unmkdligzumfgjz() {
        return new byte[]{-121, -59, 81, 124, 89, 52, 96, 20, 5, 46, 109, 109, 106, 84, 96, 21, 4, 107, 67, 18, 85, 90, 24, 104, 50, 45, 87, 27, 74, 67, 6, 51, 46, 104, 56, 28, 111, 119, 96, 13, 31, 108, 93, 36, 16, 6, 37, 29, 93, 113, 45, 87, 29, 33, 91, 62, 56, 97, 117, 4, 23, 102, 121, 23, 108, 3, 14, 2, 91, 57, 117, 95, 116, 12, 73, 48, 34, 12, 106, 110, 107, 81, 104, 21};
    }

    private static byte[] mxvnrnekjtmprqv() {
        return new byte[]{-121, -64, 89, 10, 81, 104, 100, 84, 11, 98, 72, 28, 71, 59, 77, 116};
    }

    private static byte[] bizaheqwljxbzre() {
        return new byte[]{-121, -59, 80, 58, 82, 97, 96, 81, 2, 97, 72, 11, 78, 57, 78, 99, 33, 6};
    }

    private static byte[] jschpglgchvuvtx() {
        return new byte[]{-113, -58, 82, 63, 88, 115, 109, 93, 0, 113, 75, 10, 77, 42};
    }

    private static byte[] mxlltaqycrrqlim() {
        return new byte[]{Byte.MIN_VALUE, -59, 82, 11, 88, 101, 98, 68, 5, 126, 72, 14, 74, 53, 79, 100};
    }

    private static byte[] brvnronxitftqir() {
        return new byte[]{-121, -64, 80, 122, 82, 107, 108, 21, 7, 99, 72, 72, 78, 114, 78, 92, 45, 35, 100, 82, 112, 27, 60, 39, 28, 102, 126, 91, 109, 98, 35, 123, 10, 33, 22, 93, 70, 37, 71, 64, 58, 44, 121, 113};
    }

    private static byte[] jwufiatyozwkaju() {
        return new byte[]{-121, -59, 89, 12, 80, Byte.MAX_VALUE, 98, 93, 1, 115, 72, 3, 71, 52, 76, 100};
    }

    private static byte[] douhaugumbmyqau() {
        return new byte[]{-113, -62, 83, 30, 83, 101, 101, 81, 1, 105, 79, 40, 77, 61, 73, 98, 44, 13};
    }

    private static byte[] bdxncpnhiewrlsk() {
        return new byte[]{-121, -61, 80, 62, 88, 99, 108, 64, 7, 105};
    }

    private static byte[] oudegfhlxqemhyb() {
        return new byte[0];
    }

    private static byte[] cptvwhdsimuymgl() {
        return new byte[]{-121, -59, 81, 45, 82, 110, 100, 64, 5, 112, 72, 4, 79, 62, 78, 117, 37, 24};
    }

    private static byte[] eqitqgzpamffnvw() {
        return new byte[]{-124, -60, 89, 42, 89, 113, 97, 83, 2, 114, 75, 2, 71, 50, 69, 106};
    }

    private static byte[] iqhnsbolyieoqpm() {
        return new byte[]{-114, -59, 82, 58, 81, 99, 98, 83, 2, 106, 72, 0, 78, 61, 69, 110};
    }

    private static byte[] nktfsumfkxvhooo() {
        return new byte[]{-121, -62, 85, Byte.MAX_VALUE, 81, 109, 103, 103, 2, 77, 72, 56, 75, 5, 77, 88, 38, 49, 97, 73, 112, 125, 57, 77, 31, 73, 117, 69, 104, 36, 35, 65, 15, 7, 21, 106, 77, 95, 66, 111, 58, 14, 124, 87, 61, 97, 7, 123, Byte.MAX_VALUE, 19, 8, 53, 60, 76, 118, 95, 26, 16, 87, 34, 50, 15, 88, 123, 65, 117, 44, 42, 121, 89, 80, 55, 85, 122, 100, 92, 0, 96, 72, 73, 78, 118, 73, 82, 37, 4, 99, 107, 112, 62, 60, 8, 27, 66, 118, 116, 106, 39, 35, 81, 10, 74, 17, 91, 78, 30, 64, 105, 58, 28, 121, 82, 57, 70, 4, 116, 125, 9, 8, 55, 57, 13, 114, 19, 25, 73};
    }

    private static byte[] kmasbewzveebtth() {
        return new byte[]{-124, -60, 82, 20, 83, 111, 108, 92, 3, 108, 75, 13, 76, 45};
    }

    private static byte[] crukvqcfvfdfcje() {
        return new byte[]{-126, -58, 84, Byte.MAX_VALUE, 82, 54, 99, 105, 2, 46, 75, 8, 111, 64, 75, 48, 35, 82, 100, 79, 116, 124, 62, 76, 24, 73, 119, 73, 107, 37, 37, 68, 13, 7, 19, 109, 74, 85, 70, 109, 56, 8, Byte.MAX_VALUE, 73, 60, 104, 6, 119, 121, 29, 15, 40, 62, 4, 114, 80, 28, 9, 85, 111, 52, 10, 93, 114, 67, 102, 40, 33, 126, 79, 87, 42, 85, 105, 97, 80, 0, 111, 78, 25, 78, 39, 79, 114, 34, 29, 102, 123, 119, 54, 57, 23};
    }

    private static byte[] ezjaplirnztyhnk() {
        return new byte[]{-125, -61, 81, 55, 89, 101, 97, 93, 2, 108};
    }

    private static byte[] eprmflqkauvllps() {
        return new byte[]{-124, -57, 85, 31, 84, 123, 98, 85, 2, 122, 74, 13, 77, 38};
    }

    private static byte[] ihkzlxkwwlicgoa() {
        return new byte[]{-124, -60, 81, 26, 82, 101, 97, 66, 2, 107, 75, 0, 79, 53, 78, 89, 32, 29, 97, 120, 115, 43};
    }

    private static byte[] stptqxmrfvaxosr() {
        return new byte[0];
    }

    private static byte[] dhevamhebeglvbi() {
        return new byte[]{-121, -60, 88, 123, 84, 111, 101, 27, 11, 100, 72, 76, 70, 115, 109, 69, 1, 50, 77, 68, 85, 11, 17, 63, 63, 125, 82, 66, 68, 21, 6, 98, 39, 63, 53, 76, 106, 46, 110, 91, 31, 61, 84, 115, 29, 86, 32, 68, 83, 39, 45, 6, 20, 118, 86, 110, 61, 56, 123, 82, 23, 55, 112, 64, 97, 83, 11, 91, 85, 111, 117, 14, 125, 91, 68, 96, 39, 85, 100, 56, 107, 0, 97, 66, 5, 63, 68, 73, 92, 15, 25, 60, 51, 122, 86, 79, 77, 24, 15, 102, 47, 60, 57, 75, 110, 35, 103, 86, 22, 57, 92, 112, 17, 81, 36, 73, 90, 42, 36, 2, 28, 117};
    }

    private static byte[] mymxccdisjlhruw() {
        return new byte[0];
    }

    private static byte[] phqekclbyiyfhgd() {
        return new byte[0];
    }

    private static byte[] jfhvhlljdiidleq() {
        return new byte[]{-121, -63, 88, 120, 84, 98, 102, 16, 3, 97, 72, 73, 70, 112, 72, 75, 39, 33, 96, 68, 112, 10, 52, 56, 26, 105, 116, 87, 105, 7, 35, 23, 2, 40, 16, 94, 76, 34, 67, 64, 58, 72, 113, 100, 56, 68, 6, 81, 126, 39, 8, 7, 49, 102, 115, 124, 27, 49, 86, 66};
    }

    private static byte[] mmcilbponksduyh() {
        return new byte[0];
    }

    private static byte[] nglwuzguqjwciaw() {
        return new byte[]{-121, -51, 88, 120, 82, 54, 96, 18, 7, 36, 72, 49, 70, 56, 78, 121, 33, 3, 100, 115, 112, 114, 52, 21, 28, 79, 114, 104, 109, 105, 35, 93, 2, 3, 22, 99, 74, 81, 71, 114, 58, 23, 113, 73, 62, 101, 0, 124, 122, 91, 8, 121, 49, 71, 117, 21, 29, 11, 82, 74, 50, 1, 85, 125, 66, 123, 43, 112, 124, 112, 80, 56, 88, 122, 103, 88, 7, 44, 77, 83, 78, 120};
    }

    private static byte[] amajomcnessifvp() {
        return new byte[]{-121, -52, 80, Byte.MAX_VALUE, 81, 48, 97, 20, 2, 37, 109, 100, 107, 87, 104, 17, 5, 107, 68, 25, 85, 83, 25, 107, 58, 41, 86, 27, 77, 72, 6, 58, 47, 107, 48, 24, 110, 119, 103, 6, 31, 101, 92, 39, 24, 2, 36, 29, 90, 122, 45, 94, 28, 34, 83, 58, 57, 97, 114, 15, 23, 111, 120, 20, 100, 7, 15, 2, 92, 50, 117, 86, 117, 15, 65, 52, 35, 12, 109, 101, 107, 88, 105, 22};
    }

    private static byte[] njowwewcwrjcvbu() {
        return new byte[]{-124, -60, 82, Byte.MAX_VALUE, 88, 104, 103, 23, 1, 96, 75, 76, 76, 119, 97, 66, 38, 78, 98, 48, 115, 125, 62, 92, 22, 106, 117, 107, 107, 53, 32, 90, 8, 4, 28, 104, 77, 72, 65, 47, 57, 75, 123, 65, 52, 75, 7, 121, 124, 30, 11, 59, 59, 77, Byte.MAX_VALUE, 77, 26, 10, 84, 38, 49, 71, 95, 52, 72, 37, 44, 39, 122, 27, 83, 126, 82, 47, 109, 22, 0, 41, 75, 76, 77, 112, 78, 54, 44, 73, 99, 53, 115, 123, 63, 76, 28, 14, Byte.MAX_VALUE, 57, 106, 100, 32, 18, 9, 76, 22, 63, 71, 85, 64, 42, 57, 77, 122, 0, 62, 37, 13, 63, 125, 86, 11, 118, 58, 5, 117, 29, 16, 67, 85, 35, 49, 71, 94, 51, 66, 38, 38, 98, 123, 24, 83, 50, 118, 89};
    }

    private static byte[] jxdrpaaccwwmfap() {
        return new byte[0];
    }

    private static byte[] dxwcuhcrifzwdhc() {
        return new byte[]{-121, -60, 87, 123, 80, 104, 96, 19, 1, 99, 72, 76, 73, 115, 105, 73, 4, 58, 71, 67, 85, 11, 30, 63, 59, 123, 87, 74, 78, 18, 6, 98, 40, 63, 49, 74, 111, 38, 100, 92, 31, 61, 91, 115, 25, 80, 37, 76, 89, 32, 45, 6, 27, 118, 82, 104, 56, 48, 113, 85, 23, 55, Byte.MAX_VALUE, 64, 101, 85, 14, 83, 95, 104, 117, 14, 114, 91, 64, 102, 34, 93, 110, 63, 107, 0, 110, 66, 1, 57, 65, 65, 86, 8, 25, 60, 60, 122, 82, 73, 72, 16, 5, 97, 47, 60, 54, 75, 106, 37, 98, 94, 28, 62, 92, 112, 30, 81, 32, 79, 95, 34, 46, 5, 28, 117, 85, 105, 61, 62};
    }

    private static byte[] djfwxpvefotqsti() {
        return new byte[]{-121, -63, 89, 112, 81, 98, 98, 22, 10, 98, 72, 73, 71, 120, 104, 73, 6, 63, 76, 66, 85, 14, 16, 52, 58, 113, 85, 79, 69, 19, 6, 103, 38, 52, 48, 64, 109, 35, 111, 93, 31, 56, 85, 120, 24, 90, 39, 73, 82, 33, 45, 3, 21, 125, 83, 98, 58, 53, 122, 84, 23, 50, 113, 75, 100, 95, 12, 86, 84, 105, 117, 11, 124, 80, 65, 108, 32, 88, 101, 62, 107, 5, 96, 73, 0, 51, 67, 68, 93, 9, 25, 57, 50, 113, 83, 67, 74, 21, 14, 96, 47, 57, 56, 64, 107, 47, 96, 91, 23, 63, 92, 117, 16, 90, 33, 69, 93, 39, 37, 4, 28, 112};
    }

    private static byte[] kshzennpkozuupk() {
        return new byte[]{-124, -60, 81, 113, 87, 111, 96, 20, 7, 102, 75, 76, 79, 121, 110, 69, 33, 77, 100, 54, 115, 125, 61, 3, 25, 10, 114, 113, 109, 3, 32, 125, 11, 43, 19, 72, 74, 37, 71, 47, 57, 15, 120, 15, 59, 107, 0, 88, 122, 58, 11, 4, 56, 105, 112, 31, 29, 71, 82, 32, 49, 71, 92, 58, 71, 34, 43, 36, 124, 29, 83, 126, 81, 33, 98, 17, 7, 42, 77, 74, 77, 112, 77, 56, 35, 78, 100, 54, 117, 125, 63, 76, 31, 0, 112, 62, 109, 103, 38, 20, 9, 76, 21, 49, 72, 82, 71, 41, 63, 75, 122, 0, 61, 43, 2, 56, 122, 85, 13, 112, 58, 5, 118, 19, 31, 68, 82, 32, 55, 65, 94, 51, 65, 46, 41, 39, 124, 29, 85, 120, 83, 46, 100, 95, 5, 47, 77, 6, 110, 7};
    }

    private static byte[] zshdlctiadrwdia() {
        return new byte[0];
    }

    private static byte[] usyvwtvtifkyvko() {
        return new byte[]{-125, -58, 85, Byte.MAX_VALUE, 83, 107, 103, 20, 7, 101, 75, 72, 72, 114, 105, 70, 6, 63, 64, 66, 80, 12, 26, 61, 57, Byte.MAX_VALUE, 87, 78, 78, 21, 0, 96, 47, 63, 54, 76, 110, 37, 98, 88, 28, 60, 94, 118, 28, 87, 35, 73, 92, 33, 45, 5, 27, 113, 86, 104, 56, 54, 113, 87, 21, 49, 125, 70, 102, 83, 13, 80, 92, 104, 114, 10, 113, 90, 69, 99, 36, 93, 111, 58, 110, 5, 106, 69, 7, 57, 68, 67, 82, 15, 29, 62, 62, 126, 81, 74, 79, 23, 3, 103, 44, 56, 55, 74, 106, 36, 96, 91, 27, 63, 89, 119, 26, 83, 34, 75, 95, 38, 46, 2, 26, 119, 82, 105, 58, 50};
    }

    private static byte[] rhiztofiyrokiob() {
        return new byte[0];
    }

    private static byte[] npfobrguyiprecd() {
        return new byte[0];
    }

    private static byte[] tbjwgxluhjullef() {
        return new byte[]{-121, -51, 81, 113, 88, 55, 103, 106};
    }

    private static byte[] wvoucuyqmzzclre() {
        return new byte[0];
    }

    private static byte[] eygsfwwjcgvmwoc() {
        return new byte[]{-127, -52, 80, 122, 87, 48, 103, 24, 5, 43, 65, 75, 77, 53};
    }

    private static byte[] liqwlzgouqxgloy() {
        return new byte[0];
    }

    private static byte[] dnlylccnfungojv() {
        return new byte[0];
    }

    private static byte[] ggfkkdjducnflbn() {
        return new byte[]{Byte.MIN_VALUE, -52, 87, 123, 86, 33, 108, 27, 11, 50, 65, 49, 74, 113, 68, 122};
    }

    private static byte[] meuopiosapzckmr() {
        return new byte[0];
    }

    private static byte[] qjdwkqlgsinkgia() {
        return new byte[]{-121, -60, 80, 125, 87, 54, 109, 23, 6, 45, 109, 108, 107, 85, 110, 23, 9, 104, 64, 17, 85, 91, 25, 105, 60, 47, 90, 24, 73, 64, 6, 50, 47, 105, 54, 30, 98, 116, 99, 14, 31, 109, 92, 37, 30, 4, 40, 30, 94, 114, 45, 86, 28, 32, 85, 60, 53, 98, 118, 7, 23, 103, 120, 22, 98, 1, 3, 1, 88, 58, 117, 94, 117, 13, 71, 50, 47, 15, 105, 109, 107, 80, 105, 20};
    }

    private static byte[] qmpsqdpzljjotvh() {
        return new byte[0];
    }

    private static byte[] tyfgwxmuthmaqhw() {
        return new byte[]{-127, -63, 82, 126, 84, 99, 100, 26, 10, 103, 76, 79, 73, 117, 97, 65, 8, 50, 66, 69, 87, 13, 29, 53, 58, 113, 90, 76, 73, 18, 1, 103, 39, 60, 56, 65, 108, 34, 101, 89, 27, 52, 93, 120, 17, 85, 36, 78, 93, 38, 37, 6, 21, 124, 84, 111, 63, 55, 118, 95, 22, 63, 112, 68, 97, 84, 12, 87, 84, 107, 124, 7, 115, 93, 66, 98, 35, 85, 108, 52, 99, 7, 109, 66, 6, 62, 76, 64, 92, 2, 31, 57, 57, Byte.MAX_VALUE, 86, 66, 76, 25, 14, 101, 43, 63, 54, 77, 98, 39, 110, 86, 25, 56, 94, 118, 29, 91, 33, 69, 82, 36, 41, 5, 27, 112};
    }

    private static byte[] jfbryzqnplbyksj() {
        return new byte[]{-121, -57, 87, Byte.MAX_VALUE, 82, 55, 102, 31, 10, 45, 74, 76, 72, 100};
    }

    private static byte[] fcncvbfoxattwpi() {
        return new byte[]{-121, -60, 89, 112, 82, 56, 109, 106};
    }

    private static byte[] anxcarapsufyshi() {
        return new byte[0];
    }

    private static byte[] krhucmftwccbzzm() {
        return new byte[]{-121, -62, 88, Byte.MAX_VALUE, 89, 46, 109, 23, 7, 49, 72, 49, 70, 119, 69, 32};
    }

    private static byte[] mjwrxpjluiiawip() {
        return new byte[]{-127, -51, 82, 120, 82, 106, 99, 22, 2, 103, 64, 79, 79, 115, 77, 69, 33, 62, 103, 88, 114, 9, 62, 56, 24, 120, 119, 76, 96, 98, 34, 114, 11, 36, 17, 84, 73, 46, 64, 67, 56, 40, Byte.MAX_VALUE, 112, 60, 64};
    }

    private static byte[] fxwvccxryuvfxvo() {
        return new byte[]{-124, -60, 87, Byte.MAX_VALUE, 81, 105, 102, 120, 4, 65, 75, 56, 73, 31, 77, 86, 39, 48, 103, 52, 115, 2, 59, 36, 31, 126, 116, 64, 110, 101, 32, 121, 13, 46, 21, 67, 76, 94, 68, 66, 57, 62, 126, 7, 61, 73, 6, 90, 121, 33, 11, 23, 62, 110, 118, 113, 27, 44, 81, 34, 49, 40, 90, 70, 65, 37, 45, 82, Byte.MAX_VALUE, 112, 83, 11, 87, 93, 100, 22, 1, 76, 78, 56, 77, 112, 75, 87, 37, 45, 98, 93, 118, 13, 63, 41, 25, 125, 118, 74, 107, 104, 37, Byte.MAX_VALUE, 9, 63, 19, 63, 78, 59, 65, 73, 60, 61, 122, 0, 59, 68, 4, 79, 124, 42, 14, 0, 58, 106, 112, 107, 25, 38, 84, 75};
    }

    private static byte[] nvytxwumlbjufel() {
        return new byte[]{-121, -61, 86, 121};
    }

    private static byte[] jmvrrxrxfjkaszz() {
        return new byte[]{-121, -58, 85, 48, 83, 103, 103, 86, 3, 107, 72, 0, 75, 33, 79, 114, 38, 71, 96, 121, 112, 60, 57, 23};
    }

    private static byte[] zraktdgnpwvptle() {
        return new byte[0];
    }

    private static byte[] iuvoglcldcfxcwi() {
        return new byte[]{Byte.MIN_VALUE, -61, 81, 120, 80, 96, 99, 28, 6, 39, 78, 65, 79, 124, 68, 59, 32, 67, 102, 58, 113, 118, 60, 72, 24, 1, 115, 48, 110, 108, 34, 30, 2, 70, 16, 48, 72, 93, 67, 34, 58, 73, Byte.MAX_VALUE, 8};
    }

    private static byte[] ayuwssveyzgdrsx() {
        return new byte[]{Byte.MIN_VALUE, -63, 81, 19, 86, 100, 99, 86, 3, 111, 76, 2, 78, 36, 72, 115, 36, 75, 102, 99, 113, 63, 58, 27, 24, 65, 118, 123, 108, 40, 35, 86, 14, 10, 20, 108, 72, 27, 67, 97, 60, 6, Byte.MAX_VALUE, 1, 61, 98, 1, 124, Byte.MAX_VALUE, 29, 12, 61, 57, 64, 112, 91, 25, 65};
    }

    private static byte[] swiucbonztkwqve() {
        return new byte[]{-121, -60, 86, 112, 86, 106, 103, 28, 10, 32, 72, 65, 72, 117, 74, 61, 38, 67, 105, 60, 112, 118, 58, 73, 24, 5, 117, 51, 96, 109, 35, 31, 12, 73, 18, 52, 77, 95, 74, 35, 58, 64};
    }

    private static byte[] upegssinyipxkds() {
        return new byte[]{-121, -62, 84, 116, 86, 44};
    }

    private static byte[] jdtpsvjjbyjcfxa() {
        return new byte[]{-124, -64, 81, Byte.MAX_VALUE, 88, 96, 98, 25, 1, 37, 73, 70, 70, 116, 75, 60, 39, 66, 96, 58, 120, Byte.MAX_VALUE, 59, 65, 29, 0, 118, 49, 96, 101, 36, 31, 9, 69, 21, 50, 71, 83, 69, 34, 57, 68, 120, 10};
    }

    private static byte[] eexckctfrajfgkn() {
        return new byte[]{-114, -61, 86, 123, 89, 109, 109, 104, 11, 75, 78, 75, 76, 31, 75, 93, 45, 55, 104, 55, 118, 1, 53, 37, 22, 116, 126, 65, 110, 102, 33, 126, 13, 42, 29, 94, 70, 37, 68, 88, 51, 40, 113, 103, 53, 88, 3, 95, 125, 91, 15, 19, 48, 100, 126, 126, 30, 39, 94, 78, 58, 60, 84, 94, 70, 32, 44, 65, 126, 119, 89, 15, 89, 33};
    }

    private static byte[] zjrknviodxhecsr() {
        return new byte[]{-121, -57, 80, 121, 85, 108, 98, 27, 1, 36, 72, 66, 78, 124, 73, 59, 35, 68, 98, 56, 112, 117, 60, 64, 27, 3, 112, 52, 107, 105, 35, 28, 10, 64, 17, 50, 72, 88, 65, 39, 58, 67};
    }

    private static byte[] ulilatskklcugyw() {
        return new byte[]{-114, -59, 80, 121, 86, 98, 99, 102, 6, 72, 72, 40, 78, 22, 68, 69, 39, 43, 104, 49, 112, 25, 58, 42, 24, 101, 115, 71, 104, 1, 35, 118, 2, 63, 23, 61, 70, 34, 66, 70, 60, 33, Byte.MAX_VALUE, 2, 56, 75, 5, 73, Byte.MAX_VALUE, 32, 0, 25, 58, 111, 126, 105, 24, 64, 81, 64, 52, 43, 89, 59, 64, 66, 46, 76, 113, 111, 83, 24, 89, 70, 101, 103, 4, 65};
    }

    private static int gumcfhxopoqumjkx(int i, int i2) {
        return i ^ i2;
    }
}
