package com.kammoun.donutCore.economy.config;

import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.economy.EconomyPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class EconomyConfigManager {
    private final EconomyPlugin plugin;
    private FileConfiguration config;
    private String balanceMessage;
    private String balanceOtherMessage;
    private String paymentSentMessage;
    private String paymentReceivedMessage;
    private String playerNotFoundMessage;
    private String invalidAmountMessage;
    private String notEnoughMoneyMessage;
    private String cannotPaySelfMessage;
    private String paymentDisabledMessage;
    private static int d4CZpB1GIj = 0;
    private transient int Dj55APrqI6 = 1428919148;
    private static String fqozsknweg;
    private static String[] nothing_to_see_here = new String[13];

    public EconomyConfigManager(com.kammoun.donutCore.economy.EconomyPlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.economy.config.EconomyConfigManager.<init>(com.kammoun.donutCore.economy.EconomyPlugin, int):void");
    }

    public void reload(int i) {
        int i2 = 417933373 ^ (1495421357 ^ 994421032);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -730430013) {
            int i3 = 1197972516 ^ i2;
            this.plugin.saveConfig(ruuotzltoy(ijdhrtfzcnaxsia(), i3), 1620467835);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -280337183) {
                int i4 = 1361450188 ^ i3;
                this.config = this.plugin.getConfig(127597628);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1719321219) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1719321219 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1907642655 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 1361744697 ^ i4;
                    throw new IllegalAccessException("double");
                }
                int i6 = 1175256597 ^ i4;
                this.balanceMessage = this.config.getString(ruuotzltoy(ehwzaykxxxsjazy(), i6), ruuotzltoy(sayiwnfgmvmjesh(), i6));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1444753961) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1444753961 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1982767610 ^ i6)) {
                            break;
                        }
                    }
                    int i7 = 1592671188 ^ i6;
                    throw new IOException("double");
                }
                int i8 = 1235656541 ^ i6;
                this.balanceOtherMessage = this.config.getString(ruuotzltoy(kkaubkwzqjehlrj(), i8), ruuotzltoy(mgbifzlabagcpjw(), i8));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 455723203) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 455723203 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (421278099 ^ i8)) {
                            break;
                        }
                    }
                    int i9 = 377747015 ^ i8;
                    throw new RuntimeException("double");
                }
                int i10 = 557188369 ^ i8;
                this.paymentSentMessage = this.config.getString(ruuotzltoy(cngaeasurvlrzut(), i10), ruuotzltoy(zmuwioadjonleyd(), i10));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != 312074314) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 312074314 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1725657560 ^ i10)) {
                            int i11 = 301695078 ^ i10;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1012205294 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (33440768 ^ i10)) {
                                break;
                            }
                        }
                    }
                    int i12 = 524104140 ^ i10;
                    throw new RuntimeException("double");
                }
                int i13 = 1112154231 ^ i10;
                this.paymentReceivedMessage = this.config.getString(ruuotzltoy(agjxmbvcoulkfvx(), i13), ruuotzltoy(itxbwhypubqydiy(), i13));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 13165552) {
                    i3 = 1695677364 ^ i13;
                    this.playerNotFoundMessage = this.config.getString(ruuotzltoy(bgqddeqqkljwmjo(), i3), ruuotzltoy(gwrtnnkjejexvml(), i3));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 675757651) {
                        i13 = 721215534 ^ i3;
                        this.invalidAmountMessage = this.config.getString(ruuotzltoy(ykzamlswdjpxvem(), i13), ruuotzltoy(ekriqozattqtmxs(), i13));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 2141208354) {
                            i2 = 2023390293 ^ i13;
                            this.notEnoughMoneyMessage = this.config.getString(ruuotzltoy(rlmhvytkaeootbs(), i2), ruuotzltoy(wnbayhnrtqqdmdz(), i2));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1150034551) {
                                i3 = 939174475 ^ i2;
                                this.cannotPaySelfMessage = this.config.getString(ruuotzltoy(zyfifawnblhknyn(), i3), ruuotzltoy(dwhlejfrobtdxdi(), i3));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 78024656) {
                                    int i14 = 1545468026 ^ i3;
                                    this.paymentDisabledMessage = this.config.getString(ruuotzltoy(xwdtvquwtqtkzia(), i14), ruuotzltoy(ekvxcqdvalhjegg(), i14));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -464958462) {
                                        int i15 = 83654306 ^ i14;
                                        return;
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -464958462 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1896065910 ^ i14)) {
                                            break;
                                        }
                                    }
                                    int i16 = 497935188 ^ i14;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 2141208354 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1106346100 ^ i13)) {
                        int i17 = 388529080 ^ i13;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 13165552 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1317586964 ^ i13)) {
                            break;
                        }
                    }
                }
                int i18 = 531212489 ^ i13;
                throw new IllegalAccessException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -280337183 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (575514296 ^ i3)) {
                    int i19 = 1676140636 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 78024656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1508954394 ^ i3)) {
                        int i20 = 1820054036 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 675757651 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (360158492 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i21 = 1158039314 ^ i3;
            throw new IOException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1150034551 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (105000019 ^ i2)) {
                int i22 = 2107365742 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -730430013 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2090070596 ^ i2)) {
                    break;
                }
            }
        }
        int i23 = 574328463 ^ i2;
        throw new IllegalAccessException("double");
    }

    public void sendMessage(Player player, String str, int i) {
        int i2 = 1136493632 ^ (735880056 ^ 994421032);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1725665150) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1725665150 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1502397141 ^ i2)) {
                    break;
                }
            }
            int i3 = 1092193629 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1228463952 ^ i2;
        player.sendMessage(ChatFormater.color(str));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -790459904) {
            int i5 = 1306426863 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1106156166 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1627660590 ^ i4)) {
                int i6 = 1562503422 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -790459904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1273205465 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 77491749 ^ i4;
        throw new IOException();
    }

    @Generated
    public EconomyPlugin getPlugin() {
        int i = 1390213206 ^ (687512336 ^ 994421032);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 186536818) {
            int i2 = 1967758608 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 186536818 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2087453391 ^ i)) {
                int i3 = 1159135429 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1588413455 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2142269616 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1157556197 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public FileConfiguration getConfig() {
        int i = 1387056731 ^ (1173786752 ^ 994421032);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1627373465) {
            int i2 = 1920397216 ^ i;
            return this.config;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1627373465 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1216882274 ^ i)) {
                int i3 = 1796574558 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -213335398 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1738190659 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1624248840 ^ i;
        throw new IOException();
    }

    @Generated
    public String getBalanceMessage(int i) {
        int i2 = 695643809 ^ (2038632958 ^ 994421032);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1568715707) {
            int i3 = 674048237 ^ i2;
            return this.balanceMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1568715707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (206170221 ^ i2)) {
                int i4 = 998133039 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 485094610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1709675347 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 662422357 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public String getBalanceOtherMessage(int i) {
        int i2 = 1678262965 ^ (1405197096 ^ 994421032);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1684243880) {
            int i3 = 1280979728 ^ i2;
            return this.balanceOtherMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 112336170 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1649956704 ^ i2)) {
                int i4 = 30543889 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1684243880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1887231682 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1720655354 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getPaymentSentMessage(int i) {
        int i2 = 1740679963 ^ (1292847951 ^ 994421032);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1940763680) {
            int i3 = 453883507 ^ i2;
            return this.paymentSentMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1940763680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (514882254 ^ i2)) {
                int i4 = 1229575432 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1413478520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1905120895 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 183741363 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public String getPaymentReceivedMessage(int i) {
        int i2 = 1873975836 ^ (357853804 ^ 994421032);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 219859650) {
            int i3 = 1070134269 ^ i2;
            return this.paymentReceivedMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -211987157 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1732288139 ^ i2)) {
                int i4 = 129131832 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 219859650 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (717758847 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1971502946 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getPlayerNotFoundMessage(int i) {
        int i2 = 132567803 ^ (1614774826 ^ 994421032);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -454570038) {
            int i3 = 421491272 ^ i2;
            return this.playerNotFoundMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -454570038 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1964910246 ^ i2)) {
                int i4 = 1680677433 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 740056458 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (504389731 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 663076792 ^ i2;
        throw new IOException();
    }

    @Generated
    public String getInvalidAmountMessage(int i) {
        int i2 = 1366925396 ^ (1127995140 ^ 994421032);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1212085185) {
            int i3 = 1605684388 ^ i2;
            return this.invalidAmountMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1212085185 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1323244924 ^ i2)) {
                int i4 = 1122482644 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1248291101 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1453409558 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2056353939 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getNotEnoughMoneyMessage(int i) {
        int i2 = 99490168 ^ (1923762268 ^ 994421032);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1611645026) {
            int i3 = 199397168 ^ i2;
            return this.notEnoughMoneyMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1058781666 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1742808227 ^ i2)) {
                int i4 = 2048924313 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1611645026 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (773486030 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1667996109 ^ i2;
        throw new IOException();
    }

    @Generated
    public String getCannotPaySelfMessage(int i) {
        int i2 = 1818149922 ^ (299095117 ^ 994421032);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 910543418) {
            int i3 = 1170664005 ^ i2;
            return this.cannotPaySelfMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 910543418 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1073946709 ^ i2)) {
                int i4 = 561040500 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 410163216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1155411641 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1409899499 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getPaymentDisabledMessage(int i) {
        int i2 = 811049922 ^ (933609899 ^ 994421032);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -440509943) {
            int i3 = 396666109 ^ i2;
            return this.paymentDisabledMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1486585313 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (363238632 ^ i2)) {
                int i4 = 1200270330 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -440509943 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (883675494 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1319073254 ^ i2;
        throw new IllegalAccessException();
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
        fqozsknweg = ByteBuffer.wrap(tqlidkkcktwcpho()).asCharBuffer().toString();
        d4CZpB1GIj = (-1469714026) ^ new Random(-6310522644476790094L).nextInt();
    }

    public static String ruuotzltoy(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = fqozsknweg.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] bgqddeqqkljwmjo() {
        return new byte[]{0, 0, 0, 25, 0, 0, 0, 0};
    }

    private static byte[] gwrtnnkjejexvml() {
        return new byte[]{0, 0, 0, 19, 0, 0, 0, 25};
    }

    private static byte[] zyfifawnblhknyn() {
        return new byte[]{0, 0, 0, 24, 0, 0, 0, 44};
    }

    private static byte[] dwhlejfrobtdxdi() {
        return new byte[]{0, 0, 0, 26, 0, 0, 0, 68};
    }

    private static byte[] ijdhrtfzcnaxsia() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 94};
    }

    private static byte[] agjxmbvcoulkfvx() {
        return new byte[]{0, 0, 0, 25, 0, 0, 0, 104};
    }

    private static byte[] itxbwhypubqydiy() {
        return new byte[]{0, 0, 0, 43, 0, 0, 0, -127};
    }

    private static byte[] kkaubkwzqjehlrj() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, -84};
    }

    private static byte[] mgbifzlabagcpjw() {
        return new byte[]{0, 0, 0, 32, 0, 0, 0, -62};
    }

    private static byte[] ykzamlswdjpxvem() {
        return new byte[]{0, 0, 0, 23, 0, 0, 0, -30};
    }

    private static byte[] ekriqozattqtmxs() {
        return new byte[]{0, 0, 0, 17, 0, 0, 0, -7};
    }

    private static byte[] rlmhvytkaeootbs() {
        return new byte[]{0, 0, 0, 25, 0, 0, 1, 10};
    }

    private static byte[] wnbayhnrtqqdmdz() {
        return new byte[]{0, 0, 0, 30, 0, 0, 1, 35};
    }

    private static byte[] ehwzaykxxxsjazy() {
        return new byte[]{0, 0, 0, 16, 0, 0, 1, 65};
    }

    private static byte[] sayiwnfgmvmjesh() {
        return new byte[]{0, 0, 0, 26, 0, 0, 1, 81};
    }

    private static byte[] cngaeasurvlrzut() {
        return new byte[]{0, 0, 0, 21, 0, 0, 1, 107};
    }

    private static byte[] zmuwioadjonleyd() {
        return new byte[]{0, 0, 0, 37, 0, 0, 1, Byte.MIN_VALUE};
    }

    private static byte[] xwdtvquwtqtkzia() {
        return new byte[]{0, 0, 0, 25, 0, 0, 1, -91};
    }

    private static byte[] ekvxcqdvalhjegg() {
        return new byte[]{0, 0, 0, 33, 0, 0, 1, -66};
    }

    private static byte[] tqlidkkcktwcpho() {
        return new byte[]{49, 91, 57, 80, 48, 75, 50, 71, 52, 83, 49, 81, 57, 80, 48, 75, 50, 26, 52, 66, 49, 90, 57, 84, 48, 65, 50, 81, 52, 64, 49, 27, 57, 91, 48, 87, 50, 64, 52, 31, 49, 80, 57, 90, 48, 77, 50, 90, 52, 86, 49, 16, 57, 86, 48, 104, 50, 88, 52, 83, 49, 79, 57, 80, 48, 74, 50, 20, 52, 92, 49, 89, 57, 65, 48, 24, 50, 82, 52, 93, 49, 67, 57, 91, 48, 92, 50, 21, 57, 90, 53, 86, 48, 75, 50, 74, 55, 84, 51, 87, 56, 87, 57, 68, 53, 29, 48, 91, 50, 88, 55, 91, 51, 94, 56, 93, 57, 67, 53, 30, 48, 72, 50, 88, 55, 76, 51, 29, 56, 65, 57, 82, 53, 95, 48, 94, 57, 17, 53, 80, 48, 97, 50, 86, 55, 64, 51, 16, 56, 81, 57, 86, 53, 93, 48, 86, 50, 86, 55, 65, 51, 16, 56, 66, 57, 86, 53, 74, 48, 24, 50, 64, 55, 90, 51, 69, 56, 64, 57, 68, 53, 86, 48, 84, 50, 95, 55, 20, 49, 83, 51, 87, 54, 87, 57, 80, 55, 95, 49, 87, 51, 22, 54, 64, 57, 91, 55, 90, 49, 91, 52, 80, 54, 74, 52, 66, 54, 85, 53, 81, 57, 81, 49, 69, 52, 27, 54, 73, 52, 80, 54, 77, 53, 91, 57, 81, 49, 88, 52, 65, 54, 20, 52, 67, 54, 81, 53, 85, 57, 81, 49, 95, 52, 67, 54, 92, 52, 85, 49, 16, 52, 84, 54, 96, 52, 94, 54, 65, 53, 22, 57, 70, 49, 83, 52, 86, 54, 92, 52, 88, 54, 66, 53, 83, 57, 80, 49, 22, 52, 19, 54, 95, 52, 20, 54, 85, 53, 91, 57, 91, 49, 67, 52, 91, 54, 77, 52, 20, 54, 20, 53, 16, 57, 85, 49, 80, 52, 71, 54, 86, 52, 92, 54, 20, 53, 16, 57, 82, 49, 19, 52, 69, 54, 85, 52, 80, 54, 77, 53, 83, 57, 70, 49, 19, 49, 91, 54, 82, 53, 68, 56, 66, 51, 87, 49, 81, 54, 82, 53, 68, 56, 31, 51, 84, 49, 87, 54, 91, 53, 86, 56, 95, 51, 85, 49, 83, 54, 26, 53, 88, 56, 69, 51, 94, 49, 83, 54, 69, 49, 16, 54, 86, 53, 18, 56, 65, 51, 90, 49, 87, 54, 78, 53, 82, 56, 67, 51, 19, 49, 17, 54, 68, 53, 23, 56, 83, 51, 87, 49, 90, 54, 86, 53, 89, 56, 82, 51, 83, 49, 12, 54, 23, 53, 17, 56, 87, 51, 19, 49, 87, 54, 90, 53, 88, 56, 68, 51, 88, 49, 66, 54, 18, 49, 94, 52, 84, 51, 74, 50, 75, 54, 89, 49, 84, 52, 84, 51, 74, 50, 22, 54, 81, 49, 93, 52, 71, 51, 88, 50, 84, 54, 81, 49, 87, 52, 28, 51, 88, 50, 85, 54, 87, 49, 70, 52, 95, 51, 77, 49, 21, 52, 82, 51, 112, 50, 86, 54, 78, 49, 82, 52, 93, 51, 80, 50, 92, 54, 24, 49, 82, 52, 92, 51, 86, 50, 77, 54, 86, 49, 71, 52, 16, 57, 95, 57, 92, 56, 68, 53, 67, 53, 88, 50, 94, 57, 93, 55, 70, 48, 27, 57, 92, 57, 86, 56, 67, 53, 29, 53, 92, 50, 87, 57, 87, 55, 64, 48, 82, 57, 90, 57, 20, 56, 90, 53, 95, 53, 87, 50, 92, 57, 65, 57, 20, 57, 90, 56, 110, 53, 95, 53, 76, 50, 25, 57, 92, 55, 90, 48, 91, 57, 21, 57, 77, 56, 23, 53, 88, 53, 88, 50, 79, 57, 93, 55, 21, 48, 80, 57, 92, 57, 86, 56, 66, 53, 87, 53, 81, 50, 25, 57, 85, 55, 90, 48, 91, 57, 87, 57, 64, 56, 22, 55, 92, 55, 81, 54, 70, 49, 70, 55, 86, 49, 80, 52, 83, 53, 66, 53, 25, 55, 83, 55, 85, 54, 89, 49, 84, 55, 89, 49, 84, 52, 83, 55, 23, 55, 85, 54, 108, 49, 90, 55, 66, 49, 69, 52, 22, 53, 83, 53, 86, 55, 93, 55, 85, 54, 91, 49, 86, 55, 82, 49, 13, 52, 22, 53, 23, 53, 81, 55, 20, 55, 85, 54, 88, 49, 90, 55, 66, 49, 89, 52, 66, 53, 20, 49, 92, 49, 87, 55, 70, 49, 66, 49, 82, 49, 86, 49, 87, 55, 70, 49, 31, 49, 67, 49, 80, 49, 75, 55, 88, 49, 84, 49, 93, 49, 69, 49, 31, 55, 70, 49, 84, 49, 93, 49, 69, 49, 23, 49, 83, 55, 108, 49, 94, 49, 70, 49, 17, 49, 65, 55, 80, 49, 95, 49, 71, 49, 17, 49, 20, 55, 83, 49, 20, 49, 82, 49, 92, 49, 93, 55, 64, 49, 95, 49, 71, 49, 20, 49, 18, 55, 19, 49, 80, 49, 71, 49, 94, 49, 18, 55, 19, 49, 87, 49, 22, 49, 65, 49, 94, 55, 84, 49, 72, 49, 86, 49, 67, 49, 23, 49, 88, 53, 87, 52, 74, 50, 74, 50, 89, 49, 82, 53, 87, 52, 74, 50, 23, 50, 72, 49, 84, 53, 75, 52, 84, 50, 92, 50, 86, 49, 65, 53, 31, 52, 93, 50, 80, 50, 75, 49, 84, 53, 80, 52, 85, 50, 92, 50, 92, 49, 19, 53, 81, 52, 28, 50, 73, 50, 84, 49, 84, 53, 75, 52, 92, 50, 75, 50, 29, 49, 21, 53, 90, 52, 88, 50, 74, 50, 24, 49, 69, 53, 83, 52, 64, 50, 84, 50, 93, 49, 91, 53, 70, 52, 74, 50, 25, 50, 92, 49, 92, 53, 65, 52, 88, 50, 91, 50, 84, 49, 80, 53, 86, 52, 24};
    }
}
