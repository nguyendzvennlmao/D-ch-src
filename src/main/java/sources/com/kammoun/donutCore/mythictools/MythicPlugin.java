package com.kammoun.donutCore.mythictools;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.mythictools.commands.MythicCommand;
import com.kammoun.donutCore.mythictools.listener.ToolListener;
import com.kammoun.donutCore.mythictools.manager.ConfigManager;
import com.kammoun.donutCore.mythictools.manager.MessagesManager;
import com.kammoun.donutCore.mythictools.manager.SelfDestructManager;
import com.kammoun.donutCore.sell.SellPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;

public class MythicPlugin extends DonutModule {
    private ConfigManager configManager;
    private SelfDestructManager selfDestructManager;
    private MessagesManager messagesManager;
    private ToolListener toolListener;
    private MythicCommand mythicCommand;
    private final SellPlugin sellPlugin;
    private static MythicPlugin instance;
    private static int akvTLyYhrz = 0;
    private transient int owEaE7pZMx = 1387094154;
    private static String mcbsjayjqa;
    private static String[] nothing_to_see_here = new String[15];

    public MythicPlugin(SellPlugin sellPlugin, int i) {
        super("MythicTools", 1095143273);
        int i2 = 1930606882 ^ (854547392 ^ 810717573);
        int parseInt = 1227314173 ^ (1384827444 ^ Integer.parseInt("1778576046"));
        this.owEaE7pZMx = 1387094154 ^ akvTLyYhrz;
        this.sellPlugin = sellPlugin;
        int i3 = 1401480878 ^ (29138709 ^ (1556514843 ^ parseInt));
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 1475750695 ^ (1432089768 ^ 291917890);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1638105496) {
            int i3 = 1939414934 ^ i2;
            instance = this;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 43287259) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 43287259 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (671195384 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1089902625 ^ i3;
                throw new IOException("double");
            }
            int i5 = 1472608768 ^ i3;
            this.messagesManager = new MessagesManager(this, 2146556532);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1130016039) {
                i5 = 1334065488 ^ i5;
                this.configManager = new ConfigManager(this, 890385742);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1065052069) {
                    i5 = 1029756794 ^ i5;
                    this.selfDestructManager = new SelfDestructManager(this, 2061463909);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 729949066) {
                        int i6 = 954029655 ^ i5;
                        this.toolListener = new ToolListener(this, 2083210212);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -311914189) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -311914189 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1331470742 ^ i6)) {
                                    break;
                                }
                            }
                            int i7 = 55029660 ^ i6;
                            throw new RuntimeException("double");
                        }
                        i2 = 335300790 ^ i6;
                        registerEvent(this.toolListener, 1095327048);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1921700995) {
                            i5 = 2120595337 ^ i2;
                            this.mythicCommand = new MythicCommand(this, 1148071354);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2119735096) {
                                int i8 = 1009281365 ^ i5;
                                registerCommand((KCommand) this.mythicCommand, rbjwnjdtnj(jpejbqllnjstrpw(), i8), 800215123);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1625563745) {
                                    int i9 = 32731947 ^ i8;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1870641977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1198722757 ^ i8)) {
                                        int i10 = 1358548704 ^ i8;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1625563745 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1139266250 ^ i8)) {
                                            break;
                                        }
                                    }
                                }
                                int i11 = 1828534317 ^ i8;
                                throw new RuntimeException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2119735096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1926499286 ^ i5)) {
                    int i12 = 423600560 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 729949066 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2110896860 ^ i5)) {
                        int i13 = 1762808371 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1130016039 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (696343138 ^ i5)) {
                            int i14 = 1428967403 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1065052069 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1921625600 ^ i5)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i15 = 243651171 ^ i5;
            throw new RuntimeException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1921700995 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (339172850 ^ i2)) {
                int i16 = 1585685584 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1638105496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (516912398 ^ i2)) {
                    break;
                }
            }
        }
        int i17 = 1329883790 ^ i2;
        throw new IllegalAccessException("double");
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 916368264 ^ (1308743425 ^ 291917890);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1338599003) {
            int i3 = 1809994451 ^ i2;
            if (this.selfDestructManager == null) {
                tiikgxmoqkqjcudz(i3, 1684006744);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 282849472) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 282849472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1259968587 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1071976157 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 935386059 ^ i3;
            this.selfDestructManager.shutdown(646811711);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1361236327) {
                int i5 = 1402944659 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 841271811 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (569264902 ^ i2)) {
                int i6 = 68510926 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1361236327 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (707943824 ^ i2)) {
                    int i7 = 1680306762 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1338599003 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1180214685 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1600709292 ^ i2;
        throw new IllegalAccessException();
    }

    @Override
    public void reload(int i) {
        int i2 = 1211992002 ^ (28145113 ^ 291917890);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -944434486) {
            i2 = 709939910 ^ i2;
            if (this.configManager == null) {
                i2 = 969250200 ^ i2;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1791785733) {
                i2 = 1609642227 ^ i2;
                this.configManager.reload(1320987478);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1790575457) {
                    i2 = 1714726251 ^ i2;
                }
            }
            if (this.messagesManager == null) {
                tiikgxmoqkqjcudz(i2, 2007876163);
                return;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1528768570) {
                i2 = 625607481 ^ i2;
                this.messagesManager.reload(203022162);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1901015539) {
                    int i3 = 1390920058 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1528768570 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (19198041 ^ i2)) {
                int i4 = 1717980523 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1790575457 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1338818145 ^ i2)) {
                    int i5 = 668900361 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -944434486 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1165701238 ^ i2)) {
                        int i6 = 1293397911 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -428787167 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1774561868 ^ i2)) {
                            int i7 = 74760421 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1791785733 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (774295485 ^ i2)) {
                                int i8 = 663950620 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1901015539 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1035656205 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i9 = 358198808 ^ i2;
        throw new IOException();
    }

    @Generated
    public ConfigManager getConfigManager(int i) {
        int i2 = 1937610179 ^ (964668285 ^ 291917890);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -618432542) {
            int i3 = 1619438461 ^ i2;
            return this.configManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -552195063 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1596141032 ^ i2)) {
                int i4 = 1289409400 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -618432542 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (76977170 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1586352776 ^ i2;
        throw new IOException();
    }

    @Generated
    public SelfDestructManager getSelfDestructManager(int i) {
        int i2 = 534093069 ^ (918645425 ^ 291917890);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1013628943) {
            int i3 = 1312320319 ^ i2;
            return this.selfDestructManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1302960629 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (341109919 ^ i2)) {
                int i4 = 2097226726 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1013628943 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1073564383 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 678448966 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public MessagesManager getMessagesManager(int i) {
        int i2 = 97847109 ^ (136463831 ^ 291917890);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -460810624) {
            int i3 = 1731393866 ^ i2;
            return this.messagesManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -460810624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1333419210 ^ i2)) {
                int i4 = 2138962024 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -585147181 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1583520601 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 594774005 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public ToolListener getToolListener() {
        int i = 196449768 ^ (258149246 ^ 291917890);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1383696736) {
            int i2 = 503546382 ^ i;
            return this.toolListener;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1570399952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (477125523 ^ i)) {
                int i3 = 1448769457 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1383696736 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2007847233 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1375441000 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public MythicCommand getMythicCommand() {
        int i = 736621899 ^ (67373049 ^ 291917890);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -198371455) {
            int i2 = 1352494638 ^ i;
            return this.mythicCommand;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1892050675 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1094137320 ^ i)) {
                int i3 = 1332062630 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -198371455 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (112562073 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1472281130 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public SellPlugin getSellPlugin(int i) {
        int i2 = 698193767 ^ (2053592830 ^ 291917890);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 350523098) {
            int i3 = 527529729 ^ i2;
            return this.sellPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 350523098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (840194946 ^ i2)) {
                int i4 = 1206821164 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -277924142 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1263337657 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2124368740 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public static MythicPlugin getInstance(int i) {
        int i2 = 994285798 ^ (188024920 ^ (262534923 ^ 1137389768));
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
        mcbsjayjqa = ByteBuffer.wrap(ubxaprkrbrcarwu()).asCharBuffer().toString();
        akvTLyYhrz = 1360975020 ^ new Random(-1250133125176582764L).nextInt();
    }

    public static String rbjwnjdtnj(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = mcbsjayjqa.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] jpejbqllnjstrpw() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, 0};
    }

    private static byte[] ubxaprkrbrcarwu() {
        return new byte[]{55, 89, 48, 73, 54, 66, 51, 80, 48, 94, 52, 83, 48, 66, 54, 92, 56, 95, 55, 88, 48, 67};
    }

    private static int tiikgxmoqkqjcudz(int i, int i2) {
        return i2 ^ i;
    }
}
