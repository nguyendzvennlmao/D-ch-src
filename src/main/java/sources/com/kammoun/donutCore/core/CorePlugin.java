package com.kammoun.donutCore.core;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.core.listener.CommandAliasListener;
import com.kammoun.donutCore.core.listener.PlayerListener;
import com.kammoun.donutCore.core.managers.CommandAliasManager;
import com.kammoun.donutCore.core.managers.ConfigurationManager;
import com.kammoun.donutCore.core.managers.CoreSettings;
import com.kammoun.donutCore.core.managers.FeatureManager;
import com.kammoun.donutCore.core.managers.GuiManager;
import com.kammoun.donutCore.core.managers.ItemLoader;
import com.kammoun.donutCore.core.managers.spawn.AfkConfig;
import com.kammoun.donutCore.core.managers.spawn.SpawnConfig;
import com.kammoun.donutCore.core.teleport.TeleportCountdown;
import com.kammoun.donutCore.core.utils.ColorFormater;
import com.kammoun.donutCore.core.utils.MessageSender;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;

public final class CorePlugin extends DonutModule {
    private static CorePlugin instance;
    private CoreSettings coreSettings;
    private ConfigurationManager configurationManager;
    private FeatureManager featureManager;
    private ItemLoader itemLoader;
    private SpawnConfig spawnConfig;
    private AfkConfig afkConfig;
    private GuiManager guiManager;
    private MessageSender messageSender;
    private TeleportCountdown teleportCountdown;
    private CommandAliasManager commandAliasManager;
    public String currentPreset;
    private static int urz929YFy2 = 0;
    private transient int mTFdkkMgy1 = 2054035006;
    private static String tcfllvzbuv;
    private static String[] nothing_to_see_here = new String[13];

    public CorePlugin() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.CorePlugin.<init>():void");
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 240513454 ^ (631356928 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1396877858) {
            i2 = 1419918451 ^ i2;
            instance = this;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -162313800) {
                i2 = 1615947611 ^ i2;
                initializePlugin(1997753653);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -187141277) {
                    int i3 = 1711795169 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -991482776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (344974748 ^ i2)) {
                int i4 = 1980472699 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -187141277 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1959470181 ^ i2)) {
                    int i5 = 200983523 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1396877858 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (519762631 ^ i2)) {
                        int i6 = 959075299 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -162313800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (995331887 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 552963120 ^ i2;
        throw new RuntimeException();
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 1279678982 ^ (1056677289 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1727075800) {
            int i3 = 964586600 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1727075800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1896868431 ^ i2)) {
                int i4 = 1932956276 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1392347497 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (186781233 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 20580760 ^ i2;
        throw new IllegalAccessException();
    }

    private void initializePlugin(int i) {
        int i2 = 65515366 ^ (60120279 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 259476187) {
            int i3 = 2015103496 ^ i2;
            this.coreSettings = new CoreSettings(this.api, 1830531989);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -812180840) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -812180840 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (485645669 ^ i3)) {
                        break;
                    }
                }
                int i4 = 173028583 ^ i3;
                throw new IllegalAccessException("double");
            }
            int i5 = 1792618007 ^ i3;
            this.configurationManager = new ConfigurationManager(this.api, 895363132);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1721865693) {
                i2 = 139180224 ^ i5;
                initializeManagers(1911766580);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -620516317) {
                    i5 = 1618567851 ^ i2;
                    initializeFeatures(1850316898);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -657933960) {
                        i2 = 85334632 ^ i5;
                        registerListeners(554907992);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -260543944) {
                            int i6 = 134976434 ^ i2;
                            return;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -657933960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1956272398 ^ i5)) {
                    int i7 = 401415439 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1721865693 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (701586025 ^ i5)) {
                        break;
                    }
                }
            }
            int i8 = 306680934 ^ i5;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -620516317 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2146494721 ^ i2)) {
                int i9 = 562332744 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 259476187 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (617771922 ^ i2)) {
                    int i10 = 1444721216 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1339754584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1697666944 ^ i2)) {
                        int i11 = 196671766 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -260543944 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1445355070 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i12 = 1033029378 ^ i2;
        throw new RuntimeException();
    }

    private void initializeManagers(int i) {
        int i2 = 811500802 ^ (600734080 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1872284861) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1872284861 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1908362926 ^ i2)) {
                    break;
                }
            }
            int i3 = 287305009 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 795203913 ^ i2;
        this.featureManager = new FeatureManager(this, 901543676);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -347473654) {
            i4 = 1445005447 ^ i4;
            this.itemLoader = new ItemLoader(this, 570678559);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1514257712) {
                int i5 = 2010985554 ^ i4;
                this.spawnConfig = new SpawnConfig(this.api, 707538905);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -458743901) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -458743901 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1280397842 ^ i5)) {
                            break;
                        }
                    }
                    int i6 = 465044070 ^ i5;
                    throw new IllegalAccessException("double");
                }
                int i7 = 135685082 ^ i5;
                this.afkConfig = new AfkConfig(this.api, 1366857001);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1541734029) {
                    i4 = 601082923 ^ i7;
                    this.messageSender = new MessageSender(this, 2112265126);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1165664214) {
                        int i8 = 1284221131 ^ i4;
                        this.teleportCountdown = new TeleportCountdown(this, 41168557);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -556259728) {
                            i8 = 1788763312 ^ i8;
                            this.guiManager = new GuiManager(this, 121597433);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1976908813) {
                                i7 = 344527753 ^ i8;
                                this.commandAliasManager = new CommandAliasManager(this.api, 1127432748);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 778198971) {
                                    int i9 = 1496023886 ^ i7;
                                    return;
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -556259728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (29575799 ^ i8)) {
                                int i10 = 1914547829 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1976908813 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (454488325 ^ i8)) {
                                    break;
                                }
                            }
                        }
                        int i11 = 19710112 ^ i8;
                        throw new IllegalAccessException("double");
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 778198971 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1915014251 ^ i7)) {
                        int i12 = 2142802471 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1541734029 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (633382694 ^ i7)) {
                            break;
                        }
                    }
                }
                int i13 = 680315365 ^ i7;
                throw new RuntimeException();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -347473654 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1616817420 ^ i4)) {
                int i14 = 293544815 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1514257712 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1531323413 ^ i4)) {
                    int i15 = 800395337 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1165664214 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (689361646 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i16 = 556033636 ^ i4;
        throw new IllegalAccessException("double");
    }

    private void initializeFeatures(int i) {
        int i2 = 1881219893 ^ (1648829025 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1613701645) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1613701645 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (42521928 ^ i2)) {
                    int i3 = 784893240 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1293056681 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1194089874 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 1452095047 ^ i2;
            throw new IllegalAccessException();
        }
        int i5 = 174886251 ^ i2;
        this.featureManager.loadAllFeatures(102723722);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -860571989) {
            int i6 = 1345640832 ^ i5;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -860571989 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1027239705 ^ i5)) {
                break;
            }
        }
        int i7 = 1166918133 ^ i5;
        throw new IOException("double");
    }

    private void registerListeners(int i) {
        int i2 = 2076430246 ^ (1962373290 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1967468339) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1967468339 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (15858165 ^ i2)) {
                    break;
                }
            }
            int i3 = 69112787 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1660289283 ^ i2;
        this.api.getServer().getPluginManager().registerEvents(new PlayerListener(this, 720353346), this.api);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1660233512) {
            i4 = 1656657825 ^ i4;
            this.api.getServer().getPluginManager().registerEvents(new CommandAliasListener(this, 1856157655), this.api);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1996593699) {
                int i5 = 1891586607 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -218428584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1472379920 ^ i4)) {
                int i6 = 1296324467 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1996593699 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (486056775 ^ i4)) {
                    int i7 = 2092117585 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1660233512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2087843330 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i8 = 398920038 ^ i4;
        throw new RuntimeException();
    }

    public CommandMap getCommandMap(int i) {
        int pmhghnzegkwrrzfd;
        Field declaredField;
        int i2 = 647093692 ^ (732395546 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1700133475) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 88010057 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1406208138 ^ i2)) {
                    int i3 = 838173414 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1700133475 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1297151809 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 880424114 ^ i2;
            throw new IOException("double");
        }
        ?? r0 = 901974969 ^ i2;
        int i5 = r0;
        try {
            declaredField = this.api.getServer().getClass().getDeclaredField(uhwjeouazp(byoicsehxgseqdu(), i5));
        } catch (ReflectiveOperationException e) {
            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                case -2037520365:
                    pmhghnzegkwrrzfd = 93282859 ^ i5;
                    break;
                case -884103254:
                    pmhghnzegkwrrzfd = pmhghnzegkwrrzfd(i5, 741829596);
                    break;
                case 373230506:
                    pmhghnzegkwrrzfd = pmhghnzegkwrrzfd(i5, 932789852);
                    break;
                default:
                    throw new IOException("Error in hash");
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == -1426654901) {
                pmhghnzegkwrrzfd = 603402263 ^ pmhghnzegkwrrzfd;
                getLogger(583940502).severe("Failed to get command map: " + r0.getMessage());
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == -1253082638) {
                    int i6 = 1980641943 ^ pmhghnzegkwrrzfd;
                    return null;
                }
            }
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -884103254) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -884103254 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1714040770 ^ i5)) {
                    break;
                }
            }
            int i7 = 1495751788 ^ i5;
            throw new IOException("double");
        }
        pmhghnzegkwrrzfd = 464409984 ^ i5;
        declaredField.setAccessible((byte) (1120395636 ^ pmhghnzegkwrrzfd));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == 373230506) {
            int i8 = 840326263 ^ pmhghnzegkwrrzfd;
            CommandMap commandMap = (CommandMap) declaredField.get(this.api.getServer());
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -2037520365) {
                i5 = 758526009 ^ i8;
                return commandMap;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -2037520365 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1749601538 ^ i8)) {
                    break;
                }
            }
            int i9 = 1916240356 ^ i8;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == 373230506 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == (2069662810 ^ pmhghnzegkwrrzfd)) {
                int i10 = 1889930414 ^ pmhghnzegkwrrzfd;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == -281253414 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == (796641423 ^ pmhghnzegkwrrzfd)) {
                    int i11 = 887759640 ^ pmhghnzegkwrrzfd;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == -1426654901 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == (1793437191 ^ pmhghnzegkwrrzfd)) {
                        int i12 = 935886135 ^ pmhghnzegkwrrzfd;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == -1253082638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == (995668676 ^ pmhghnzegkwrrzfd)) {
                            int i13 = 1674428654 ^ pmhghnzegkwrrzfd;
                            throw new IOException();
                        }
                    }
                }
            }
        }
    }

    @Override
    public void reload(int i) {
        int i2;
        int pmhghnzegkwrrzfd;
        int i3 = 1714148287 ^ (1901543281 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1224232669) {
            ?? r0 = 898570214 ^ i3;
            i3 = r0;
            try {
                this.api.reloadConfig();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 461311506) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 461311506 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1322669172 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 76571583 ^ i3;
                    throw new RuntimeException("double");
                }
                int i5 = 859016754 ^ i3;
                this.coreSettings.reloadSettings(1302389661);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -2099019901) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2099019901 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (244074251 ^ i5)) {
                            break;
                        }
                    }
                    int i6 = 686931492 ^ i5;
                    throw new IllegalAccessException("double");
                }
                i3 = 426124006 ^ i5;
                this.configurationManager.loadConfigurations(1426911471);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1238526131) {
                    int i7 = 459557326 ^ i3;
                    clearItemConfigs(478747415);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -1829755197) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1829755197 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1288650737 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 191040445 ^ i7;
                        throw new IOException("double");
                    }
                    i3 = 1496790415 ^ i7;
                    reloadItemConfigs(1939455203);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1531546297) {
                        int i9 = 940078341 ^ i3;
                        reloadLocationConfigs(1863399594);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -1693834608) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1693834608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1589778369 ^ i9)) {
                                    break;
                                }
                            }
                            int i10 = 1419852133 ^ i9;
                            throw new IOException("double");
                        }
                        int i11 = 1511912990 ^ i9;
                        reloadFeatures(1520598860);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 1273336418) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1486178319 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1289324818 ^ i11)) {
                                    int i12 = 982173889 ^ i11;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1273336418 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (477389634 ^ i11)) {
                                        break;
                                    }
                                }
                            }
                            int i13 = 1516207461 ^ i11;
                            throw new IllegalAccessException("double");
                        }
                        i3 = 2047026129 ^ i11;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1677947671) {
                            int i14 = 684178102 ^ i3;
                            try {
                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i14) == 95733787) {
                                    throw new IOException();
                                }
                                throw null;
                            } catch (IOException e) {
                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                    case -1486178319:
                                        pmhghnzegkwrrzfd = pmhghnzegkwrrzfd(i14, 228012687);
                                        break;
                                    case -574531240:
                                        pmhghnzegkwrrzfd = 583159642 ^ i14;
                                        break;
                                    default:
                                        throw new IOException("Error in hash");
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == -875355255) {
                                    pmhghnzegkwrrzfd(pmhghnzegkwrrzfd, 142740999);
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == -875355255 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == (742959450 ^ pmhghnzegkwrrzfd)) {
                                        int i15 = 878177946 ^ pmhghnzegkwrrzfd;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == -574531240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == (334716404 ^ pmhghnzegkwrrzfd)) {
                                            int i16 = 757800087 ^ pmhghnzegkwrrzfd;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                    case -2099019901:
                        i2 = 827872824 ^ i3;
                        break;
                    case -1829755197:
                        i2 = pmhghnzegkwrrzfd(i3, 861551888);
                        break;
                    case -1693834608:
                        i2 = 1382383002 ^ i3;
                        break;
                    case 461311506:
                        i2 = pmhghnzegkwrrzfd(i3, 40622090);
                        break;
                    case 1238526131:
                        i2 = 675181790 ^ i3;
                        break;
                    case 1273336418:
                        i2 = 142117764 ^ i3;
                        break;
                    case 1531546297:
                        i2 = 1785530527 ^ i3;
                        break;
                    default:
                        throw new IllegalAccessException("Error in hash");
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 136433218) {
                    i3 = 820979380 ^ i2;
                    getLogger(583940502).severe("Error during reload: " + r0.getMessage());
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1889993757) {
                        int i17 = 444833777 ^ i3;
                        r0.printStackTrace();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == 1531184235) {
                            int i18 = 1519446779 ^ i17;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == 1531184235 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (658723103 ^ i17)) {
                                int i19 = 1132403969 ^ i17;
                                throw new IOException("double");
                            }
                        }
                    }
                } else {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 136433218 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (525912895 ^ i2)) {
                            int i20 = 1751498924 ^ i2;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1889993757 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1283072917 ^ i3)) {
                int i21 = 960613595 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1883024463 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1709694897 ^ i3)) {
                    int i22 = 1076093215 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1677947671 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1349790102 ^ i3)) {
                        int i23 = 422851068 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1238526131 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (519737271 ^ i3)) {
                            int i24 = 1802968513 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1531546297 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (477510179 ^ i3)) {
                                int i25 = 927435218 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1224232669 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (386313372 ^ i3)) {
                                    int i26 = 1649637443 ^ i3;
                                    throw new IllegalAccessException();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void clearItemConfigs(int i) {
        int i2 = 1095424933 ^ (189618753 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1557977201) {
            i2 = 2002868488 ^ i2;
            this.itemLoader.getHelpConfig(953906669).clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -405401550) {
                i2 = 1243852412 ^ i2;
                this.itemLoader.getMediaConfig(1875850761).clear();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1228184624) {
                    int i3 = 376186561 ^ i2;
                    this.itemLoader.getRulesConfig(1964538408).clear();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 95049176) {
                        int i4 = 1582060365 ^ i3;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 95049176 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (551298677 ^ i3)) {
                            break;
                        }
                    }
                    int i5 = 1418040336 ^ i3;
                    throw new IOException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1228184624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (701150498 ^ i2)) {
                int i6 = 428194084 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1557977201 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1412543390 ^ i2)) {
                    int i7 = 996907481 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -137834574 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (327911003 ^ i2)) {
                        int i8 = 788503314 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -405401550 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2002927200 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i9 = 1924522412 ^ i2;
        throw new IOException();
    }

    private void reloadItemConfigs(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.CorePlugin.reloadItemConfigs(int):void");
    }

    private void reloadLocationConfigs(int i) {
        int pmhghnzegkwrrzfd;
        int i2 = 1216633202 ^ (59252921 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1417877769) {
            i2 = 875783094 ^ i2;
            if (this.spawnConfig == null) {
                pmhghnzegkwrrzfd = pmhghnzegkwrrzfd(i2, 808753940);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -182975304) {
                i2 = 2082178245 ^ i2;
                this.spawnConfig.reloadConfig(1054056118);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 365175443) {
                    pmhghnzegkwrrzfd = 1278156753 ^ i2;
                }
            }
            if (this.afkConfig == null) {
                pmhghnzegkwrrzfd(pmhghnzegkwrrzfd, 1165923442);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) != 1958534169) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == 1958534169 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmhghnzegkwrrzfd) == (152094448 ^ pmhghnzegkwrrzfd)) {
                        break;
                    }
                }
                int i3 = 535331632 ^ pmhghnzegkwrrzfd;
                throw new RuntimeException("double");
            }
            int i4 = 369272654 ^ pmhghnzegkwrrzfd;
            this.afkConfig.reloadConfig(1054056118);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -995498391) {
                int i5 = 1400648508 ^ i4;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1598586763 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1936154333 ^ i4)) {
                    int i6 = 1446248498 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -995498391 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1384623345 ^ i4)) {
                        break;
                    }
                }
            }
            int i7 = 103585244 ^ i4;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1417877769 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1596398102 ^ i2)) {
                int i8 = 558742073 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -182975304 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (814559894 ^ i2)) {
                    int i9 = 2107382881 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 365175443 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (211593213 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i10 = 736634537 ^ i2;
        throw new RuntimeException();
    }

    private void reloadFeatures(int i) {
        int i2 = 1044106139 ^ (1724551431 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -882244687) {
            i2 = 227908566 ^ i2;
            this.featureManager.loadAllFeatures(102723722);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1480139519) {
                int i3 = 394591735 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 467743417 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (891314183 ^ i2)) {
                int i4 = 1306734074 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -882244687 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (309349278 ^ i2)) {
                    int i5 = 1934268037 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1480139519 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (372941113 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 385311411 ^ i2;
        throw new RuntimeException();
    }

    public void clean(org.bukkit.entity.Player r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.CorePlugin.clean(org.bukkit.entity.Player, int):void");
    }

    public static void Inform(String str, int i) {
        int i2 = 139431285 ^ (1043287154 ^ 468847828);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1821798041) {
            i2 = 1162268448 ^ i2;
            if (str != null) {
                i2 = pmhghnzegkwrrzfd(i2, 67695572);
                Bukkit.getConsoleSender().sendMessage(ColorFormater.hex(str));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1726449979) {
                    int i3 = 1665393117 ^ i2;
                    return;
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1184896923) {
                int i4 = 1496897512 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1889097511 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (940017144 ^ i2)) {
                int i5 = 546976049 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1184896923 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (236184895 ^ i2)) {
                    int i6 = 1262587384 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2096662480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (241027211 ^ i2)) {
                        int i7 = 779353214 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1821798041 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (615448675 ^ i2)) {
                            int i8 = 947872376 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1726449979 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (557421272 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i9 = 2092424536 ^ i2;
        throw new RuntimeException();
    }

    public void saveConfig() {
        int i = 975850855 ^ (1416614386 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2127311864) {
            int i2 = 647195945 ^ i;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1247238833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1331065370 ^ i)) {
                int i3 = 1957006122 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2127311864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1376007951 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2033526569 ^ i;
        throw new IOException();
    }

    @Generated
    public CoreSettings getCoreSettings(int i) {
        int i2 = 1179366541 ^ (1824468240 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1531190202) {
            int i3 = 405248494 ^ i2;
            return this.coreSettings;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1531190202 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1559312001 ^ i2)) {
                int i4 = 1480068489 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1703357238 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1944112037 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 341765815 ^ i2;
        throw new IOException();
    }

    @Generated
    public ConfigurationManager getConfigurationManager(int i) {
        int i2 = 144686733 ^ (1079820000 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1257821241) {
            int i3 = 117304863 ^ i2;
            return this.configurationManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2098701505 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1244461567 ^ i2)) {
                int i4 = 558974825 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1257821241 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1706885241 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1125284371 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public FeatureManager getFeatureManager(int i) {
        int i2 = 92890181 ^ (2046118754 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -285102488) {
            int i3 = 848852617 ^ i2;
            return this.featureManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2076318241 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1960224043 ^ i2)) {
                int i4 = 1556776430 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -285102488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (188414557 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 788575561 ^ i2;
        throw new IOException();
    }

    @Generated
    public ItemLoader getItemLoader(int i) {
        int i2 = 1976695500 ^ (241190011 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -781376792) {
            int i3 = 650374811 ^ i2;
            return this.itemLoader;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -781376792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (724855587 ^ i2)) {
                int i4 = 2141030362 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -411937231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (811229671 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 458084278 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public SpawnConfig getSpawnConfig(int i) {
        int i2 = 1361928832 ^ (210733702 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -503867551) {
            int i3 = 295755810 ^ i2;
            return this.spawnConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -503867551 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (475479044 ^ i2)) {
                int i4 = 1970347593 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1827706481 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (214752784 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 476251636 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public AfkConfig getAfkConfig(int i) {
        int i2 = 1526722209 ^ (181497159 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1919629215) {
            int i3 = 1305295556 ^ i2;
            return this.afkConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1919629215 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (344528007 ^ i2)) {
                int i4 = 616772431 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -469950909 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1935486732 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 604982470 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public GuiManager getGuiManager(int i) {
        int i2 = 957982468 ^ (2130832843 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1008894249) {
            int i3 = 1476687801 ^ i2;
            return this.guiManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -67027741 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1172388785 ^ i2)) {
                int i4 = 2013667558 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1008894249 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (361470321 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 614618522 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public MessageSender getMessageSender(int i) {
        int i2 = 1995276093 ^ (668231602 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2060971223) {
            int i3 = 1586013439 ^ i2;
            return this.messageSender;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1902982355 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1878699835 ^ i2)) {
                int i4 = 431301102 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2060971223 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1390925134 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1391004349 ^ i2;
        throw new IOException();
    }

    @Generated
    public TeleportCountdown getTeleportCountdown(int i) {
        int i2 = 1151851656 ^ (193157392 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1975843729) {
            int i3 = 854602582 ^ i2;
            return this.teleportCountdown;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1975843729 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1700070197 ^ i2)) {
                int i4 = 2083099574 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -498769632 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1803887736 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 848273929 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public CommandAliasManager getCommandAliasManager(int i) {
        int i2 = 1623688268 ^ (1676110562 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 367501859) {
            int i3 = 1491733038 ^ i2;
            return this.commandAliasManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 367501859 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (872007612 ^ i2)) {
                int i4 = 947213876 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -759696559 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2109424685 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 743415341 ^ i2;
        throw new IOException();
    }

    @Generated
    public static CorePlugin getInstance(int i) {
        int i2 = 1894289546 ^ (520746515 ^ (2138116004 ^ 468847828));
        return instance;
    }

    @Generated
    public void setCurrentPreset(String str) {
        int i = 609299293 ^ (413237840 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -345661638) {
            int i2 = 189168976 ^ i;
            this.currentPreset = str;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1319733830 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1791515411 ^ i)) {
                int i3 = 2037514071 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -345661638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (954280539 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 629809727 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public String getCurrentPreset() {
        int i = 2010746035 ^ (1344954555 ^ 1637620458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 864007954) {
            int i2 = 1255680354 ^ i;
            return this.currentPreset;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 864007954 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (857360176 ^ i)) {
                int i3 = 1711762093 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1707015168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (37322364 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1944534516 ^ i;
        throw new IOException();
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
        tcfllvzbuv = ByteBuffer.wrap(jbivopzjzsxjpgz()).asCharBuffer().toString();
        urz929YFy2 = 1638390175 ^ new Random(-6635028226459731414L).nextInt();
    }

    public static String uhwjeouazp(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = tcfllvzbuv.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] byoicsehxgseqdu() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 0};
    }

    private static byte[] jbivopzjzsxjpgz() {
        return new byte[]{49, 86, 48, 95, 48, 84, 57, 85, 50, 88, 49, 91, 48, 84, 48, 116, 57, 89, 50, 73};
    }

    private static int pmhghnzegkwrrzfd(int i, int i2) {
        return i ^ i2;
    }
}
