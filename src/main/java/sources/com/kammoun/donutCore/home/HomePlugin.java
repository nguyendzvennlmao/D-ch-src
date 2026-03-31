package com.kammoun.donutCore.home;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.home.commands.DelHomeCommand;
import com.kammoun.donutCore.home.commands.HomeCommand;
import com.kammoun.donutCore.home.commands.HomesCommand;
import com.kammoun.donutCore.home.commands.SetHomeCommand;
import com.kammoun.donutCore.home.data.DataBaseManager;
import com.kammoun.donutCore.home.gui.HomeMenu;
import com.kammoun.donutCore.home.listener.PlayerListener;
import com.kammoun.donutCore.home.managers.ConfigManager;
import com.kammoun.donutCore.home.managers.HomeCacheManager;
import com.kammoun.donutCore.home.managers.HomeManager;
import com.kammoun.donutCore.home.managers.MessagesManager;
import com.kammoun.donutCore.home.managers.TeleportManager;
import com.kammoun.donutCore.team.TeamPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;

public class HomePlugin extends DonutModule {
    private DataBaseManager dataBaseManager;
    private HomeCacheManager cacheManager;
    private ConfigManager configManager;
    private MessagesManager messagesManager;
    private TeleportManager teleportManager;
    private HomeManager homeManager;
    private HomeMenu homeMenu;
    private static HomePlugin instance;
    private final TeamPlugin teamPlugin;
    private static int WBy06o49AN = 0;
    private transient int VtaHhXGeNt = 1873591150;
    private static String gkmsqvfqjd;
    private static String[] nothing_to_see_here = new String[15];

    public HomePlugin(TeamPlugin teamPlugin, int i) {
        super("Home", 1095143273);
        wpmtvvwiqcqmdlcg(1937062113 ^ 613721482, 2127411254);
        int parseInt = 1137868792 ^ (2020425531 ^ Integer.parseInt("311649694"));
        this.VtaHhXGeNt = 1873591150 ^ WBy06o49AN;
        int wpmtvvwiqcqmdlcg = 1931096791 ^ wpmtvvwiqcqmdlcg(parseInt, 878279355);
        this.teamPlugin = teamPlugin;
        int i2 = 1793853636 ^ wpmtvvwiqcqmdlcg;
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 1785269186 ^ (1380557554 ^ 376702488);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1923447105) {
            int i3 = 44472662 ^ i2;
            instance = this;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1737602033) {
                int i4 = 884880073 ^ i3;
                this.configManager = new ConfigManager(this, 716273262);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1033886280) {
                    i2 = 1138033454 ^ i4;
                    this.messagesManager = new MessagesManager(this, 1574911019);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -590857014) {
                        i2 = 494673651 ^ i2;
                        this.dataBaseManager = new DataBaseManager(this, 267686524);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 925420370) {
                            int i5 = 149734848 ^ i2;
                            this.cacheManager = new HomeCacheManager(this.dataBaseManager, 1759356808);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1884218706) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1645747869 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (962647482 ^ i5)) {
                                        int i6 = 2108531914 ^ i5;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1884218706 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1855701335 ^ i5)) {
                                            break;
                                        }
                                    }
                                }
                                int i7 = 1271927162 ^ i5;
                                throw new RuntimeException("double");
                            }
                            int i8 = 507121538 ^ i5;
                            this.teleportManager = new TeleportManager(this, this.configManager, this.messagesManager, 1199681563);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -2120312510) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -2120312510 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1599740685 ^ i8)) {
                                        break;
                                    }
                                }
                                int i9 = 1131857827 ^ i8;
                                throw new RuntimeException("double");
                            }
                            i4 = 528433616 ^ i8;
                            this.homeManager = new HomeManager(this, this.cacheManager, this.configManager, this.teleportManager, 226698193);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2053412802) {
                                int i10 = 807140497 ^ i4;
                                this.homeMenu = new HomeMenu(getApi(2142241109), 1498422745);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != -88378549) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -88378549 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1690037925 ^ i10)) {
                                            break;
                                        }
                                    }
                                    int i11 = 1445511747 ^ i10;
                                    throw new IOException("double");
                                }
                                i3 = 1748718180 ^ i10;
                                this.configManager.loadConfig(135625813);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1151213464) {
                                    int i12 = 1387451922 ^ i3;
                                    this.messagesManager.loadMessages(1850956768);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != 787960058) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 787960058 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (208952042 ^ i12)) {
                                                break;
                                            }
                                        }
                                        int i13 = 368145670 ^ i12;
                                        throw new IOException("double");
                                    }
                                    int i14 = 1020857662 ^ i12;
                                    registerCommands(1951352027);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) != -935380725) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -935380725 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (123862625 ^ i14)) {
                                                break;
                                            }
                                        }
                                        int i15 = 163823909 ^ i14;
                                        throw new IllegalAccessException("double");
                                    }
                                    i3 = 428801442 ^ i14;
                                    registerListeners(323783315);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 71881755) {
                                        i3 = 1825754260 ^ i3;
                                        this.cacheManager.reloadOnlinePlayers(1915719946);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1658761400) {
                                            int i16 = 2145856059 ^ i3;
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2053412802 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1257495425 ^ i4)) {
                        int i17 = 1915010935 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1033886280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (662122467 ^ i4)) {
                            break;
                        }
                    }
                }
                int i18 = 169386444 ^ i4;
                throw new RuntimeException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1151213464 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1040756402 ^ i3)) {
                    int i19 = 1181548397 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1658761400 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (309681781 ^ i3)) {
                        int i20 = 1178325533 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 71881755 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (896466461 ^ i3)) {
                            int i21 = 1772013709 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1737602033 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1893534209 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i22 = 731286280 ^ i3;
            throw new RuntimeException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 925420370 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (87600628 ^ i2)) {
                int i23 = 1365203474 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1923447105 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1924622231 ^ i2)) {
                    int i24 = 597690431 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -590857014 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (205215797 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i25 = 1101442603 ^ i2;
        throw new IllegalAccessException("double");
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 225766046 ^ (1226015067 ^ 376702488);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1868861718) {
            i2 = 1965284089 ^ i2;
            if (this.teleportManager == null) {
                i2 = wpmtvvwiqcqmdlcg(i2, 450590492);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 965064993) {
                i2 = 1176749016 ^ i2;
                this.teleportManager.shutdown(1896067346);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 144418787) {
                    i2 = 1559803076 ^ i2;
                }
            }
            if (this.cacheManager != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -279051839) {
                    i2 = 181429314 ^ i2;
                    this.cacheManager.clearCache(2125855524);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1176689711) {
                        int i3 = 2061621002 ^ i2;
                        return;
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 133757319:
                        int i4 = 1882305352 ^ i2;
                        return;
                    case 1424595597:
                        return;
                    case 1736994720:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 965064993 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1552828550 ^ i2)) {
                int i5 = 1013761845 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1859361666 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1723036703 ^ i2)) {
                    int i6 = 1803488208 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1868861718 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (780729681 ^ i2)) {
                        int i7 = 362787744 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 144418787 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (945302144 ^ i2)) {
                            int i8 = 332295597 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1176689711 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (906580132 ^ i2)) {
                                int i9 = 735202902 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -279051839 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (562283755 ^ i2)) {
                                    int i10 = 2060724791 ^ i2;
                                    throw new RuntimeException();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void reload(int i) {
        int i2 = 2075291348 ^ (113189763 ^ 376702488);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1539988091) {
            i2 = 315427140 ^ i2;
            this.configManager.loadConfig(135625813);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -845016997) {
                i2 = 467495836 ^ i2;
                this.messagesManager.loadMessages(1850956768);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 323570875) {
                    i2 = 11145497 ^ i2;
                    this.cacheManager.reloadOnlinePlayers(1915719946);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 370787443) {
                        int i3 = 1085347501 ^ i2;
                        return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -845016997 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1245738849 ^ i2)) {
                int i4 = 1548921947 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 328298777 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (237144393 ^ i2)) {
                    int i5 = 339996380 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1539988091 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1208861865 ^ i2)) {
                        int i6 = 1208586278 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 323570875 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1022002350 ^ i2)) {
                            int i7 = 1301894465 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 370787443 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (890361046 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i8 = 1959952649 ^ i2;
        throw new IllegalAccessException();
    }

    private void registerCommands(int i) {
        int i2 = 789755732 ^ (1536836428 ^ 376702488);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 401051651) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 401051651 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1261870124 ^ i2)) {
                    break;
                }
            }
            int i3 = 83077361 ^ i2;
            throw new IOException("double");
        }
        int i4 = 238926852 ^ i2;
        registerCommand(new HomeCommand(this, this.homeManager, this.messagesManager, 60970915), xjqedpsuhd(imaeutzbtkcqlqv(), i4), 1506108676);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1711960099) {
            i4 = 1218728096 ^ i4;
            registerCommand(new SetHomeCommand(this, this.homeManager, this.messagesManager, 1924414434), xjqedpsuhd(juuzdcfjlfrhost(), i4), 1506108676);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 589886753) {
                int i5 = 1918114993 ^ i4;
                DelHomeCommand delHomeCommand = new DelHomeCommand(this, this.homeManager, this.messagesManager, 409815812);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1316482902) {
                    i5 = 787026949 ^ i5;
                    registerCommand(delHomeCommand, xjqedpsuhd(vvqswvmjohnqubg(), i5), 1506108676);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -960450429) {
                        i5 = 235873431 ^ i5;
                        getApi(2142241109).getCommand(xjqedpsuhd(cbxckukxmfwxbdh(), i5)).setTabCompleter(delHomeCommand);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1229351877) {
                            i5 = 1643816343 ^ i5;
                            registerCommand(new HomesCommand(this, this.homeManager, 59435123), xjqedpsuhd(hscszpcqcvpborr(), i5), 1506108676);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1184057216) {
                                int i6 = 543482390 ^ i5;
                                return;
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1184057216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1860553045 ^ i5)) {
                        int i7 = 360763410 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -960450429 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1366913241 ^ i5)) {
                            int i8 = 1780051351 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1229351877 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1330006537 ^ i5)) {
                                int i9 = 272844697 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1316482902 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1055899117 ^ i5)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                int i10 = 1874165259 ^ i5;
                throw new IOException();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1711960099 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2044942046 ^ i4)) {
                int i11 = 1808484999 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 589886753 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1011448843 ^ i4)) {
                    break;
                }
            }
        }
        int i12 = 1475384696 ^ i4;
        throw new RuntimeException("double");
    }

    private void registerListeners(int i) {
        int i2 = 425632910 ^ (727371391 ^ 376702488);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 595814217) {
            i2 = 964530273 ^ i2;
            registerEvent(new PlayerListener(this.cacheManager, 1815626733), 1095327048);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -395320256) {
                int i3 = 656263667 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -796808231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1695793758 ^ i2)) {
                int i4 = 286814344 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -395320256 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1076397793 ^ i2)) {
                    int i5 = 41247744 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 595814217 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (107755790 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1066233794 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public DataBaseManager getDataBaseManager() {
        int i = 344911340 ^ (676708226 ^ 376702488);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1434100657) {
            int i2 = 1067744264 ^ i;
            return this.dataBaseManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1470544912 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (678880232 ^ i)) {
                int i3 = 707255068 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1434100657 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (325641069 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2009360220 ^ i;
        throw new IOException();
    }

    @Generated
    public HomeCacheManager getCacheManager() {
        int i = 1000264814 ^ (586504905 ^ 376702488);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2029798904) {
            int i2 = 1347592163 ^ i;
            return this.cacheManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2029798904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (275797612 ^ i)) {
                int i3 = 457488035 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -93799710 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (648064313 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1361808988 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public ConfigManager getConfigManager() {
        int i = 1450534007 ^ (1412716297 ^ 376702488);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1582716112) {
            int i2 = 1032120056 ^ i;
            return this.configManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1301191921 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1375779693 ^ i)) {
                int i3 = 669751237 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1582716112 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1905101579 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 43419465 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public MessagesManager getMessagesManager(int i) {
        int i2 = 73986876 ^ (1164891353 ^ 376702488);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1148121110) {
            int i3 = 888719821 ^ i2;
            return this.messagesManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 475480451 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (605792203 ^ i2)) {
                int i4 = 1111048670 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1148121110 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1645161069 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 609050973 ^ i2;
        throw new IOException();
    }

    @Generated
    public TeleportManager getTeleportManager() {
        int i = 952804276 ^ (211489983 ^ 376702488);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 288196761) {
            int i2 = 521044466 ^ i;
            return this.teleportManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -380008695 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (442516028 ^ i)) {
                int i3 = 120735037 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 288196761 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1532426568 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 814353308 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public HomeManager getHomeManager(int i) {
        int i2 = 1387103984 ^ (323557322 ^ 376702488);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1132152558) {
            int i3 = 704750944 ^ i2;
            return this.homeManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -326528493 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1282673529 ^ i2)) {
                int i4 = 364010848 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1132152558 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (779506523 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 931757983 ^ i2;
        throw new IOException();
    }

    @Generated
    public HomeMenu getHomeMenu(int i) {
        int i2 = 828837090 ^ (1363723415 ^ 376702488);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1294044309) {
            int i3 = 845839486 ^ i2;
            return this.homeMenu;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 562925722 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1151401480 ^ i2)) {
                int i4 = 2057333786 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1294044309 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1632583398 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1701912737 ^ i2;
        throw new IOException();
    }

    @Generated
    public TeamPlugin getTeamPlugin(int i) {
        int i2 = 365263608 ^ (1200442838 ^ 376702488);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 568428978) {
            int i3 = 1140184048 ^ i2;
            return this.teamPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1045370416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (918282217 ^ i2)) {
                int i4 = 1072988866 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 568428978 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (285689452 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 760343752 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public static HomePlugin getInstance(int i) {
        int i2 = 665450660 ^ (1286155081 ^ (1121436439 ^ 2044247414));
        return instance;
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
        gkmsqvfqjd = ByteBuffer.wrap(wavpiovbkboqtnl()).asCharBuffer().toString();
        WBy06o49AN = (-598890863) ^ new Random(-3916593083875703679L).nextInt();
    }

    public static String xjqedpsuhd(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = gkmsqvfqjd.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] cbxckukxmfwxbdh() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 0};
    }

    private static byte[] vvqswvmjohnqubg() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 7};
    }

    private static byte[] juuzdcfjlfrhost() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 14};
    }

    private static byte[] imaeutzbtkcqlqv() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 21};
    }

    private static byte[] hscszpcqcvpborr() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 25};
    }

    private static byte[] wavpiovbkboqtnl() {
        return new byte[]{49, 93, 57, 86, 56, 93, 52, 94, 54, 92, 49, 84, 57, 86, 50, 84, 50, 82, 52, 94, 55, 91, 52, 91, 50, 93, 50, 82, 54, 66, 48, 83, 48, 66, 55, 93, 54, 89, 49, 93, 54, 85, 49, 80, 50, 91, 54, 93, 55, 82, 51, 80, 56, 87, 54, 94, 55, 83, 48, 64};
    }

    private static int wpmtvvwiqcqmdlcg(int i, int i2) {
        return i2 ^ i;
    }
}
