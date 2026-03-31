package com.kammoun.donutCore.mythictools.manager;

import com.kammoun.donutCore.api.configuration.KConfigModule;
import com.kammoun.donutCore.mythictools.MythicPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MessagesManager extends KConfigModule {
    private final Map<Messages, String> messageCache;
    private static int BxXRc6vUds = 0;
    private transient int Wmlt73jYCs = 534990167;
    private static String[] nothing_to_see_here = new String[15];

    public MessagesManager(MythicPlugin mythicPlugin, int i) {
        super(mythicPlugin, "lang.yml", 1884314383);
        jhhnpnmauqsybdrt(619462891 ^ 264531240, 718084711);
        int parseInt = 635826067 ^ (1418346894 ^ Integer.parseInt("1888131513"));
        this.Wmlt73jYCs = 534990167 ^ BxXRc6vUds;
        this.messageCache = new HashMap();
        loadMessages(894505138);
        int i2 = 929813942 ^ (474489767 ^ (590619694 ^ (1524356920 ^ parseInt)));
    }

    private void loadMessages(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.manager.MessagesManager.loadMessages(int):void");
    }

    public void reload(int i) {
        int i2 = 326327154 ^ (1952470741 ^ 1576615355);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -682524447) {
            i2 = 50755480 ^ i2;
            load(985210593);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -815645663) {
                i2 = 2052708924 ^ i2;
                loadMessages(894505138);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 497872322) {
                    int i3 = 1620733433 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 497872322 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1660190522 ^ i2)) {
                int i4 = 25216041 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -815645663 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2020198168 ^ i2)) {
                    int i5 = 1904610339 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -682524447 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2075204001 ^ i2)) {
                        int i6 = 1493290859 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 427786761 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1966384648 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 1669668264 ^ i2;
        throw new RuntimeException();
    }

    public String getMessage(Messages messages, String[] strArr, int i) {
        int i2 = 178451641 ^ (915659057 ^ 1576615355);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 239108507) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 239108507 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1340856517 ^ i2)) {
                    int i3 = 284387964 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1166702299 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2024812258 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 425772435 ^ i2;
            throw new IOException("double");
        }
        int i5 = 1698654012 ^ i2;
        String orDefault = this.messageCache.getOrDefault(messages, messages.getDefaultMessage());
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 666613880) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 666613880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (834408789 ^ i5)) {
                    break;
                }
            }
            int i6 = 2093756133 ^ i5;
            throw new IllegalAccessException("double");
        }
        int i7 = 940219835 ^ i5;
        if (strArr == null) {
            int i8 = 1285564919 ^ i7;
        } else {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -403745375) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -403745375 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (861048322 ^ i7)) {
                        break;
                    }
                }
                int i9 = 1204563398 ^ i7;
                throw new IllegalAccessException("double");
            }
            int i10 = 2081313008 ^ i7;
            if (strArr.length > (1089714756 ^ i10)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 127783458) {
                    int i11 = 1011321424 ^ i10;
                    if (strArr.length % ((byte) (2092183574 ^ i11)) != (2092183572 ^ i11)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != -442400605) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -442400605 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (960340836 ^ i11)) {
                                    break;
                                }
                            }
                            int i12 = 57144063 ^ i11;
                            throw new RuntimeException("double");
                        }
                        int i13 = 2015498920 ^ i11;
                        this.plugin.getLogger(583940502).warning("Invalid placeholders count for message: " + messages.name());
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 615585248) {
                            int i14 = 792972804 ^ i13;
                            return orDefault;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1588553153 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1397616235 ^ i13)) {
                                int i15 = 950777231 ^ i13;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 615585248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1565814295 ^ i13)) {
                                    break;
                                }
                            }
                        }
                        int i16 = 1110640361 ^ i13;
                        throw new IOException("double");
                    }
                    i10 = 5059615 ^ i11;
                    int i17 = (byte) (2096694283 ^ i10);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -406314917) {
                        int i18 = 644826103 ^ i10;
                        while (true) {
                            i10 = i18;
                            if (i17 >= strArr.length) {
                                while (true) {
                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i10)) {
                                        case 260272622:
                                            int i19 = 717980863 ^ i10;
                                            break;
                                        case 344172291:
                                            break;
                                        case 650431367:
                                    }
                                }
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -726515742) {
                                int i20 = 537014539 ^ i10;
                                orDefault = orDefault.replace(strArr[i17], strArr[i17 + ((byte) (2056550134 ^ i20))]);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == -727468101) {
                                    int i21 = 350526026 ^ i20;
                                    i17 += 1852894399 ^ i21;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == 1938253291) {
                                        int i22 = 683640870 ^ i21;
                                        try {
                                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i22) != 154244131) {
                                                throw null;
                                            }
                                            throw new IllegalAccessException();
                                        } catch (IllegalAccessException e) {
                                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                case 914040026:
                                                    i10 = 1618863318 ^ i22;
                                                    break;
                                                case 1166702299:
                                                    i10 = jhhnpnmauqsybdrt(i22, 1308872342);
                                                    break;
                                                default:
                                                    throw new IOException("Error in hash");
                                            }
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 898892393) {
                                                i18 = jhhnpnmauqsybdrt(i10, 2082785201);
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == 1938253291 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == (243051590 ^ i21)) {
                                                int i23 = 1482841063 ^ i21;
                                                throw new IOException("double");
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == -727468101 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == (1720456489 ^ i20)) {
                                            int i24 = 868008028 ^ i20;
                                            throw new IOException("double");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -406314917 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (188412494 ^ i10)) {
                            int i25 = 1014475345 ^ i10;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 898892393 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (572359530 ^ i10)) {
                                int i26 = 770290712 ^ i10;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 914040026 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (996780999 ^ i10)) {
                                    int i27 = 1586134729 ^ i10;
                                    throw new RuntimeException();
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -726515742 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1770658141 ^ i10)) {
                        int i28 = 418547101 ^ i10;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 127783458 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1873871310 ^ i10)) {
                            int i29 = 1427900493 ^ i10;
                            throw new IOException("double");
                        }
                    }
                }
            } else {
                int i30 = 816740615 ^ i10;
            }
        }
        return orDefault;
    }

    public void send(Player player, Messages messages, String[] strArr, int i) {
        int i2 = 647188091 ^ (735820588 ^ 1576615355);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2054273182) {
            i2 = 97664275 ^ i2;
            player.sendMessage(getMessage(messages, strArr, 1465335628));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1423986694) {
                int i3 = 555750554 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1423986694 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (9532252 ^ i2)) {
                int i4 = 791049877 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2054273182 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (366407355 ^ i2)) {
                    int i5 = 1648929388 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1575023829 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (557835266 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 2063569044 ^ i2;
        throw new RuntimeException();
    }

    public void send(CommandSender commandSender, Messages messages, String[] strArr, int i) {
        int i2 = 559745610 ^ (1544298911 ^ 1576615355);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 88126321) {
            i2 = 417515122 ^ i2;
            commandSender.sendMessage(getMessage(messages, strArr, 1465335628));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1034518303) {
                int i3 = 24257804 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 88126321 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1619655901 ^ i2)) {
                int i4 = 1336292855 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1034518303 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1946835948 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 320488003 ^ i2;
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
        BxXRc6vUds = 1661777005 ^ new Random(-2167149049672851028L).nextInt();
    }

    public static String uknnkgbaga(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] pxmeyjxtlvqpzru() {
        return new byte[]{87, 81, 111, 18, 37, 55, 96, 86, 117, 39, 71, 108, 107, 64, 36, 116, 89, 102, 1, 67, 62, 88, 74, 115, 39, 55, 17, 60, 60, 88, 9, 19, 49, 46, 4, 124, 79, 21, 103, 113, 59, 48, 16, 25, 2, 60, 17, 53, 118, 23, 123, 27, 78, 45, 25, 76, 84, 114, 107, 23, 72, 21, 42, 96, 27, 36, 1, 12, 116, 66, 58, 71, 113, 40, 8, 48, 70, 51, 104, 30, 99, 21, 87, 115, 28, 51, 36, 92, Byte.MAX_VALUE, 87, 95, 69, 105, 42, 61, 121, 48, 120, 83, 78, 121, 10, 30, 126, 15, 6, 55, 11, 56, 125, 101, 82, 34, 125, 68, 124, 62, 31, 48, 83, 86, 124, 95, 50, 77, 46};
    }

    private static int jhhnpnmauqsybdrt(int i, int i2) {
        return i2 ^ i;
    }
}
