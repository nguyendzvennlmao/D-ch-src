package com.kammoun.donutCore.home.managers;

import com.kammoun.donutCore.home.HomePlugin;
import com.kammoun.donutCore.home.models.Home;
import com.kammoun.donutCore.home.models.HomePlayer;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class HomeManager {
    private final HomePlugin plugin;
    private final HomeCacheManager cacheManager;
    private final ConfigManager configManager;
    private final TeleportManager teleportManager;
    private final Map<UUID, PendingHomeAction> pendingActions;
    private static int dAa5TRZPcW = 0;
    private transient int P14sUEAd8g = 509636576;
    private static String tfyvcbfayw;
    private static String[] nothing_to_see_here = new String[13];

    public static final class HomeResult {
        public static final HomeResult SUCCESS;
        public static final HomeResult NOT_LOADED;
        public static final HomeResult NO_PERMISSION;
        public static final HomeResult MAX_HOMES_REACHED;
        public static final HomeResult BLOCKED_REGION;
        public static final HomeResult HOME_NOT_FOUND;
        public static final HomeResult TELEPORTING;
        private static final HomeResult[] $VALUES;

        public static HomeResult[] values() {
            int i = 1998299865 ^ (313856820 ^ (571826252 ^ 737237847));
            return (HomeResult[]) $VALUES.clone();
        }

        public static HomeResult valueOf(String str) {
            int i = 232038900 ^ (89419242 ^ 737237847);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 462207561) {
                int i2 = 1633611505 ^ i;
                return (HomeResult) Enum.valueOf(HomeResult.class, str);
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 462207561 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (61168580 ^ i)) {
                    int i3 = 1527957237 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 293326274 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1375689430 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 2137945910 ^ i;
            throw new IllegalAccessException();
        }

        private HomeResult(String str, int i) {
            ccxfujgjaxzgknau(277693969 ^ 493981870, 1084870212);
            ccxfujgjaxzgknau(1929435018 ^ (192221093 ^ Integer.parseInt("891338964")), 780118393);
        }

        private static HomeResult[] $values() {
            int i = 46142959 ^ (918656343 ^ (566603424 ^ 737237847));
            HomeResult[] homeResultArr = new HomeResult[(byte) (1043690824 ^ i)];
            homeResultArr[(byte) (1043690831 ^ i)] = SUCCESS;
            homeResultArr[(byte) (1043690830 ^ i)] = NOT_LOADED;
            homeResultArr[(byte) (1043690829 ^ i)] = NO_PERMISSION;
            homeResultArr[(byte) (1043690828 ^ i)] = MAX_HOMES_REACHED;
            homeResultArr[(byte) (1043690827 ^ i)] = BLOCKED_REGION;
            homeResultArr[(byte) (1043690826 ^ i)] = HOME_NOT_FOUND;
            homeResultArr[(byte) (1043690825 ^ i)] = TELEPORTING;
            return homeResultArr;
        }

        static {
            int parseInt = 1068583664 ^ (2010638793 ^ (171463202 ^ Integer.parseInt("891338964")));
            SUCCESS = new HomeResult(gmsvysqknh(gcjemrayvfmmzbe(), oeeojiaqllfmjel(), parseInt), (byte) (2004758991 ^ parseInt));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) != -1141797253) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1141797253 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (284948203 ^ parseInt)) {
                        int i = 1029760106 ^ parseInt;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 559098243 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1307157961 ^ parseInt)) {
                            break;
                        }
                    }
                }
                int i2 = 177413074 ^ parseInt;
                throw new IOException();
            }
            int i3 = 993182503 ^ parseInt;
            NOT_LOADED = new HomeResult(gmsvysqknh(tvqmnlthiumejvt(), oeeojiaqllfmjel(), i3), (byte) (1280111337 ^ i3));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1650956098) {
                int i4 = 1504959361 ^ i3;
                NO_PERMISSION = new HomeResult(gmsvysqknh(abgwjangzmehavz(), oeeojiaqllfmjel(), i4), (byte) (369043819 ^ i4));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1342616760) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1342616760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (496343665 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 235953870 ^ i4;
                    throw new RuntimeException("double");
                }
                int i6 = 1452214183 ^ i4;
                MAX_HOMES_REACHED = new HomeResult(gmsvysqknh(yhzwbvczgvuokyz(), oeeojiaqllfmjel(), i6), (byte) (1131425485 ^ i6));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 461469298) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 461469298 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (981294866 ^ i6)) {
                            break;
                        }
                    }
                    int i7 = 1372504631 ^ i6;
                    throw new RuntimeException("double");
                }
                i3 = 1690025368 ^ i6;
                BLOCKED_REGION = new HomeResult(gmsvysqknh(kerxjdniuwdlnjo(), oeeojiaqllfmjel(), i3), (byte) (667652946 ^ i3));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1046256305) {
                    int i8 = 516645818 ^ i3;
                    HOME_NOT_FOUND = new HomeResult(gmsvysqknh(ojlrfkfomzgdhbs(), oeeojiaqllfmjel(), i8), (byte) (956362985 ^ i8));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -939030687) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -939030687 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (570523210 ^ i8)) {
                                break;
                            }
                        }
                        int i9 = 62807167 ^ i8;
                        throw new RuntimeException("double");
                    }
                    int i10 = 1734765193 ^ i8;
                    TELEPORTING = new HomeResult(gmsvysqknh(eixpxreuxuqhnfz(), oeeojiaqllfmjel(), i10), (byte) (1583782499 ^ i10));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -214641878) {
                        int i11 = 978124629 ^ i10;
                        $VALUES = $values();
                        return;
                    } else {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -214641878 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (336856050 ^ i10)) {
                                break;
                            }
                        }
                        int i12 = 1212624598 ^ i10;
                        throw new RuntimeException("double");
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1046256305 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (696206364 ^ i3)) {
                    int i13 = 1419843941 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1650956098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (610387702 ^ i3)) {
                        break;
                    }
                }
            }
            int i14 = 1050732331 ^ i3;
            throw new RuntimeException("double");
        }

        public static String gmsvysqknh(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] oeeojiaqllfmjel() {
            return new byte[]{96, 57, 33, 102, 92, 10, 49, 80, 24, 53, 63, 13, 62, 74, 79, 66, 27, 117, 82, 69, 21, 36, 98, 23, 82, 124};
        }

        private static byte[] gcjemrayvfmmzbe() {
            return new byte[]{-84, -10, 17, 1, 107, 106, 9, 42, 33, 71, 13, 120, 14, 45, 120, 36};
        }

        private static byte[] tvqmnlthiumejvt() {
            return new byte[]{-81, -12, 25, 24, 109, 116, 0, 55, 43, 92, 14, 115, 6, 53, 126, 50, 42, 2, 97, 54, 36, 82};
        }

        private static byte[] eixpxreuxuqhnfz() {
            return new byte[]{-81, -13, 25, 1, 107, 119, 3, 41, 40, 65, 14, 104, 6, 54, 120, 40, 41, 20, 98, 61, 36, 95, 90, 99};
        }

        private static byte[] kerxjdniuwdlnjo() {
            return new byte[]{-88, -16, 22, 18, 105, 116, 8, 42, 40, 64, 9, 113, 8, 58, 125, 63, 46, 26, 100, 33, 34, 87, 87, 98, 107, 0, 80, 64, 23, 31};
        }

        private static byte[] abgwjangzmehavz() {
            return new byte[]{-83, -16, 24, 24, 104, 118, 9, 62, 47, 86, 9, 113, 14, 44, 124, 55, 42, 11, 97, 32, 44, 71, 86, 109, 106, 2, 87, 68};
        }

        private static byte[] ojlrfkfomzgdhbs() {
            return new byte[]{-89, -13, 23, 29, 106, 119, 8, 37, 32, 73, 10, 100, 13, 50, 125, 52, 35, 25, 107, 47, 35, 81, 84, 106, 107, 17, 88, 78, 20, 20};
        }

        private static byte[] yhzwbvczgvuokyz() {
            return new byte[]{-81, -9, 18, 26, 104, 121, 4, 60, 32, 92, 14, 116, 13, 52, 123, 61, 46, 4, 106, 32, 36, 74, 81, 116, 102, 11, 85, 76, 25, 19, 109, 115, 2, 36, 44, 67};
        }

        private static int ccxfujgjaxzgknau(int i, int i2) {
            return i2 ^ i;
        }
    }

    public static class PendingHomeAction {
        public final String homeName;
        public final ActionType type;
        public final long timestamp;

        private static int f650KR1hDVjUK = 0;
        private transient int oa1BA2LEGx = 1808514498;
        private static byte[] csuipakgiu;
        private static String[] nothing_to_see_here = new String[17];

        public static final class ActionType {
            public static final ActionType DELETE;
            private static final ActionType[] $VALUES;
            private static byte[] istjykbywy;

            public static ActionType[] values() {
                int i = 873059615 ^ (1396415511 ^ (433851941 ^ 926619893));
                return (ActionType[]) $VALUES.clone();
            }

            public static ActionType valueOf(String str) {
                int i = 1259596469 ^ (1061968426 ^ 926619893);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 455426898) {
                    int i2 = 1693311410 ^ i;
                    return (ActionType) Enum.valueOf(ActionType.class, str);
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 455426898 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (283230185 ^ i)) {
                        int i3 = 1194049782 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1011502785 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (748334441 ^ i)) {
                            break;
                        }
                    }
                }
                int i4 = 1240068069 ^ i;
                throw new IOException();
            }

            private ActionType(String str, int i) {
                int i2 = 769517806 ^ (73669568 ^ 354462717);
                int parseInt = 46962594 ^ (643828738 ^ Integer.parseInt("406176627"));
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                        case 90775681:
                            int i3 = 355238408 ^ parseInt;
                            return;
                        case 396602702:
                        case 1073513789:
                            return;
                        case 1556731044:
                        default:
                            throw new IOException();
                    }
                }
            }

            private static ActionType[] $values() {
                int i = 1571555436 ^ (1226190955 ^ (2084888630 ^ 926619893));
                ActionType[] actionTypeArr = new ActionType[(byte) (1606795461 ^ i)];
                actionTypeArr[(byte) (1606795460 ^ i)] = DELETE;
                return actionTypeArr;
            }

            static {
                int parseInt = 1752459849 ^ (1642280385 ^ Integer.parseInt("406176627"));
                istjykbywy = xrfjnfmifwvtplw();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1928009768) {
                    parseInt = 677496955 ^ parseInt;
                    DELETE = new ActionType(vusqauhwnk(borcjiszpartgas(), parseInt), (byte) (969102464 ^ parseInt));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -837114879) {
                        int i = 1707920847 ^ parseInt;
                        $VALUES = $values();
                        return;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -837114879 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1359234354 ^ parseInt)) {
                        int i2 = 430873419 ^ parseInt;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1928009768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1152897722 ^ parseInt)) {
                            break;
                        }
                    }
                }
                int i3 = 1437042633 ^ parseInt;
                throw new IOException();
            }

            public static String vusqauhwnk(byte[] bArr, int i) {
                byte[] bytes = Integer.toString(i).getBytes();
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= bArr.length) {
                        return new String(bArr, StandardCharsets.UTF_16);
                    }
                    bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                    bArr[i3] = (byte) (bArr[i3] ^ istjykbywy[i3 % istjykbywy.length]);
                    i2 = i3 + 1;
                }
            }

            private static byte[] xrfjnfmifwvtplw() {
                return new byte[]{111, 4, 110, 13, 75, 84, 81, 56, 2, 87, 41, 84, 55, 67, 25, 15, 11, 66, 80, 111, 117, 33, 99, 124, 104, 70, 85, 56, 23, 71, 42, 113, 25};
            }

            private static byte[] borcjiszpartgas() {
                return new byte[]{-88, -51, 87, 120, 123, 35, 101, 66, 54, 43, 31, 57, 6, 54};
            }
        }

        public PendingHomeAction(java.lang.String r5, com.kammoun.donutCore.home.managers.HomeManager.PendingHomeAction.ActionType r6, int r7) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.managers.HomeManager.PendingHomeAction.<init>(java.lang.String, com.kammoun.donutCore.home.managers.HomeManager$PendingHomeAction$ActionType, int):void");
        }

        public boolean isExpired(int i) {
            byte b;
            int i2 = 1335715576 ^ (1329971979 ^ 1438734432);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1462768486) {
                int i3 = 1682435582 ^ i2;
                if (((System.currentTimeMillis() - this.timestamp) > 5000L ? 1 : ((System.currentTimeMillis() - this.timestamp) == 5000L ? 0 : -1)) <= (828248173 ^ i3)) {
                    i2 = 486549888 ^ i3;
                    b = (byte) (744372717 ^ i2);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1660014441) {
                        int i4 = 481786802 ^ i2;
                        return b;
                    }
                } else {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1963949207) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1963949207 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (537008955 ^ i3)) {
                                int i5 = 420397042 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2025188615 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (170970872 ^ i3)) {
                                    break;
                                }
                            }
                        }
                        int i6 = 1673856775 ^ i3;
                        throw new IllegalAccessException("double");
                    }
                    int i7 = 2101764874 ^ i3;
                    b = (byte) (1276670822 ^ i7);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 1623431994) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -530161376 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (47130756 ^ i7)) {
                                int i8 = 1605064852 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -731743167 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1760959421 ^ i7)) {
                                    int i9 = 1463357288 ^ i7;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1623431994 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1770087539 ^ i7)) {
                                        break;
                                    }
                                }
                            }
                        }
                        int i10 = 2129747341 ^ i7;
                        throw new IllegalAccessException();
                    }
                    int pqtlrbagzhvydclf = pqtlrbagzhvydclf(i7, 1343536963);
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(pqtlrbagzhvydclf) != 106485641) {
                            throw null;
                        }
                        throw new IOException();
                    } catch (IOException e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case -731743167:
                                i2 = pqtlrbagzhvydclf(pqtlrbagzhvydclf, 336988349);
                                break;
                            case -530161376:
                                i2 = pqtlrbagzhvydclf(pqtlrbagzhvydclf, 848726801);
                                break;
                            default:
                                throw new IllegalAccessException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1959934377) {
                            int i11 = 510854506 ^ i2;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1660014441 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (961469991 ^ i2)) {
                    int i12 = 1860149458 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1959934377 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (882590516 ^ i2)) {
                        int i13 = 468060725 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1462768486 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (590955919 ^ i2)) {
                            int i14 = 1461905082 ^ i2;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }
        }

        static {
            nothing_to_see_here[0] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣠⣤⣶⣶⣶⣤⣄⣀⣀⠄⠄⠄⠄⠄";
            nothing_to_see_here[1] = "⠄⠄⠄⠄⠄⠄⠄⠄⣀⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣟⢿⣿⣿⣿⣶⣤⡀⠄";
            nothing_to_see_here[2] = "⠄⠄⠄⠄⠄⠄⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣜⠿⠿⣿⣿⣧⢓";
            nothing_to_see_here[3] = "⠄⠄⠄⠄⠄⡠⢛⣿⣿⣿⡟⣿⣿⣽⣋⠻⢻⣿⣿⣿⣿⡻⣧⡠⣭⣭⣿⡧";
            nothing_to_see_here[4] = "⠄⠄⠄⠄⠄⢠⣿⡟⣿⢻⠃⣻⣨⣻⠿⡀⣝⡿⣿⣿⣷⣜⣜⢿⣝⡿⡻⢔";
            nothing_to_see_here[5] = "⠄⠄⠄⠄⠄⢸⡟⣷⢿⢈⣚⣓⡡⣻⣿⣶⣬⣛⣓⣉⡻⢿⣎⠢⠻⣴⡾⠫";
            nothing_to_see_here[6] = "⠄⠄⠄⠄⠄⢸⠃⢹⡼⢸⣿⣿⣿⣦⣹⣿⣿⣿⠿⠿⠿⠷⣎⡼⠆⣿⠵⣫";
            nothing_to_see_here[7] = "⠄⠄⠄⠄⠄⠈⠄⠸⡟⡜⣩⡄⠄⣿⣿⣿⣿⣶⢀⢀⣿⣷⣿⣿⡐⡇⡄⣿";
            nothing_to_see_here[8] = "⠄⠄⠄⠄⠄⠄⠄⠄⠁⢶⢻⣧⣖⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⣇⡟⣇⣷⣿";
            nothing_to_see_here[9] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣆⣤⣽⣿⡿⠿⠿⣿⣿⣦⣴⡇⣿⢨⣾⣿⢹⢸";
            nothing_to_see_here[10] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⠊⡛⢿⣿⣿⣿⣿⡿⣫⢱⢺⡇⡏⣿⣿⣸⡼";
            nothing_to_see_here[11] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⡿⠄⣿⣷⣾⡍⣭⣶⣿⣿⡌⣼⣹⢱⠹⣿⣇⣧";
            nothing_to_see_here[12] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⣼⠁⣤⣭⣭⡌⢁⣼⣿⣿⣿⢹⡇⣭⣤⣶⣤⡝⡼";
            nothing_to_see_here[13] = "⠄⣀⠤⡀⠄⠄⠄⠄⠄⡏⣈⡻⡿⠃⢀⣾⣿⣿⣿⡿⡼⠁⣿⣿⣿⡿⢷⢸";
            nothing_to_see_here[14] = "⢰⣷⡧⡢⠄⠄⠄⠄⠠⢠⡛⠿⠄⠠⠬⠿⣿⠭⠭⢱⣇⣀⣭⡅⠶⣾⣷⣶";
            nothing_to_see_here[15] = "⠈⢿⣿⣧⠄⠄⠄⠄⢀⡛⠿⠄⠄⠄⠄⢠⠃⠄⠄⡜⠄⠄⣤⢀⣶⣮⡍⣴";
            nothing_to_see_here[16] = "⠄⠈⣿⣿⡀⠄⠄⠄⢩⣝⠃⠄⠄⢀⡄⡎⠄⠄⠄⠇⠄⠄⠅⣴⣶⣶⠄⣶";
            csuipakgiu = phzqfliidoxkeyo();
            f650KR1hDVjUK = (-1363233693) ^ new Random(7413043455278593508L).nextInt();
        }

        public static String zmcwlrrpzf(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= bArr.length) {
                    return new String(bArr, StandardCharsets.UTF_16);
                }
                bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                bArr[i3] = (byte) (bArr[i3] ^ csuipakgiu[i3 % csuipakgiu.length]);
                i2 = i3 + 1;
            }
        }

        private static byte[] phzqfliidoxkeyo() {
            return new byte[]{42, 43, 104, 41, 104, 3, 51, 64, 20, 8, 101, 1, 1, 34, 18, 16, 58, 66, 86, 61, 111, 98, 115, 26, 70, 62, 126, 18, 112, 46, 82, 67, 12, 107, 7, 33, 34, 46, 103, 120, 90, 34, 8, 100, 105, 113, 9, 72, 108, 31, 10, 53, 33, 99, 19, 12, 90, 87, 97, 30, 1, 126, 41, 68, 3, 126, 14, 64, 38, 79, 49, 115};
        }

        private static int pqtlrbagzhvydclf(int i, int i2) {
            return i2 ^ i;
        }
    }

    public HomeManager(HomePlugin homePlugin, HomeCacheManager homeCacheManager, ConfigManager configManager, TeleportManager teleportManager, int i) {
        int i2 = 1689358646 ^ (1001053779 ^ 708148208);
        int parseInt = 892081471 ^ (1191051051 ^ Integer.parseInt("117431937"));
        this.P14sUEAd8g = 509636576 ^ dAa5TRZPcW;
        int fbsdlpkooxrmngzg = 800817066 ^ fbsdlpkooxrmngzg(parseInt, 1615387155);
        this.pendingActions = new HashMap();
        this.plugin = homePlugin;
        this.cacheManager = homeCacheManager;
        this.configManager = configManager;
        this.teleportManager = teleportManager;
        int i3 = 84009532 ^ (246361634 ^ (517851802 ^ (25427739 ^ (1742952990 ^ fbsdlpkooxrmngzg))));
    }

    public int getMaxHomes(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.managers.HomeManager.getMaxHomes(org.bukkit.entity.Player, int):int");
    }

    public com.kammoun.donutCore.home.managers.HomeManager.HomeResult setHome(org.bukkit.entity.Player r9, java.lang.String r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.managers.HomeManager.setHome(org.bukkit.entity.Player, java.lang.String, int):com.kammoun.donutCore.home.managers.HomeManager$HomeResult");
    }

    public com.kammoun.donutCore.home.managers.HomeManager.HomeResult deleteHome(org.bukkit.entity.Player r6, java.lang.String r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.managers.HomeManager.deleteHome(org.bukkit.entity.Player, java.lang.String, int):com.kammoun.donutCore.home.managers.HomeManager$HomeResult");
    }

    public HomeResult teleportToHome(Player player, String str, int i) {
        int i2 = 390750722 ^ (690621606 ^ 1269701342);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1368153133) {
            int i3 = 1559071960 ^ i2;
            HomePlayer player2 = this.cacheManager.getPlayer(player.getUniqueId(), 1799612107);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1226818833) {
                int i4 = 1109350982 ^ i3;
                if (player2 == null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1508185891) {
                        int i5 = 936473357 ^ i4;
                        return HomeResult.NOT_LOADED;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1508185891 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (469786621 ^ i4)) {
                            break;
                        }
                    }
                    int i6 = 1827606921 ^ i4;
                    throw new RuntimeException("double");
                }
                i3 = 2059089893 ^ i4;
                Home home = player2.getHome(str, 349133016);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1942181880) {
                    int i7 = 2075771003 ^ i3;
                    if (home == null) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1374858195) {
                            int i8 = 1049225632 ^ i7;
                            return HomeResult.HOME_NOT_FOUND;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1374858195 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1273162596 ^ i7)) {
                                break;
                            }
                        }
                        int i9 = 1827820826 ^ i7;
                        throw new RuntimeException("double");
                    }
                    i3 = 1138406001 ^ i7;
                    int maxHomes = getMaxHomes(player, 1970986734);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1327970393) {
                        i3 = 792176127 ^ i3;
                        if (maxHomes != (114508532 ^ i3)) {
                            i3 = fbsdlpkooxrmngzg(i3, 2007830634);
                            ArrayList arrayList = new ArrayList(player2.getHomes(1804827425).keySet());
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1947036429) {
                                i2 = 86727028 ^ i3;
                                int indexOf = arrayList.indexOf(str.toLowerCase());
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1566023853) {
                                    i3 = 825274167 ^ i2;
                                    if (indexOf < maxHomes) {
                                        i3 = fbsdlpkooxrmngzg(i3, 1196208840);
                                        this.teleportManager.startTeleport(player, home.getLocation(1765191163), 50316431);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 289976488) {
                                            int i10 = 1705387720 ^ i3;
                                            return HomeResult.TELEPORTING;
                                        }
                                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 724379370) {
                                        int i11 = 1899245230 ^ i3;
                                        return HomeResult.NO_PERMISSION;
                                    }
                                }
                            }
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 916068256) {
                            int i12 = 855355915 ^ i3;
                            return HomeResult.NO_PERMISSION;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1942181880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1258664921 ^ i3)) {
                    int i13 = 986608976 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 916068256 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (30951928 ^ i3)) {
                        int i14 = 2142785788 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1947036429 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (285496263 ^ i3)) {
                            int i15 = 1588515417 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1226818833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1873577079 ^ i3)) {
                                int i16 = 1730208447 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 289976488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1089869726 ^ i3)) {
                                    int i17 = 1214201896 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 724379370 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (998457726 ^ i3)) {
                                        int i18 = 844445777 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1327970393 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (651026915 ^ i3)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i19 = 1291764174 ^ i3;
            throw new RuntimeException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1589147655 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2006230189 ^ i2)) {
                int i20 = 1309433421 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1368153133 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (957465023 ^ i2)) {
                    int i21 = 904623096 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1566023853 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (210617482 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i22 = 904746043 ^ i2;
        throw new RuntimeException("double");
    }

    public HomePlayer getHomePlayer(Player player, int i) {
        int i2 = 1804666423 ^ (474419328 ^ 1269701342);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -473930935) {
            int i3 = 64338211 ^ i2;
            return this.cacheManager.getPlayer(player.getUniqueId(), 1799612107);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -473930935 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1895060641 ^ i2)) {
                int i4 = 1618570069 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -43144623 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (72406569 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 6783409 ^ i2;
        throw new RuntimeException();
    }

    private boolean isLocationBlocked(Location location, int i) {
        int i2 = 1505141995 ^ (272477394 ^ 1269701342);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 287872824) {
            i2 = 924479248 ^ i2;
            String name = location.getWorld().getName();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1443106887) {
                int i3 = 1554011753 ^ i2;
                return this.configManager.getBlockedWorlds(1607021295).contains(name);
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 287872824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1301632030 ^ i2)) {
                int i4 = 1702847407 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1443106887 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (353146932 ^ i2)) {
                    int i5 = 1254840662 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1291410675 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (216423121 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 2124754545 ^ i2;
        throw new IllegalAccessException();
    }

    public void setPendingAction(UUID uuid, PendingHomeAction pendingHomeAction, int i) {
        int i2 = 564356915 ^ (1744482254 ^ 1269701342);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1874759960) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1896917486 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2129817505 ^ i2)) {
                    int i3 = 660118193 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1874759960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (146005301 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 221544650 ^ i2;
            throw new IOException();
        }
        int i5 = 1291574056 ^ i2;
        this.pendingActions.put(uuid, pendingHomeAction);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 140527706) {
            int i6 = 282190793 ^ i5;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 140527706 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1908760614 ^ i5)) {
                break;
            }
        }
        int i7 = 1157708344 ^ i5;
        throw new IllegalAccessException("double");
    }

    public PendingHomeAction getPendingAction(UUID uuid, int i) {
        int i2 = 2095318220 ^ (825450151 ^ 1269701342);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 868877736) {
            int i3 = 40703411 ^ i2;
            return this.pendingActions.remove(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 547530800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (145012004 ^ i2)) {
                int i4 = 611241672 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 868877736 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (332719291 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1154514466 ^ i2;
        throw new RuntimeException();
    }

    public boolean hasPendingAction(UUID uuid, int i) {
        int i2 = 661096388 ^ (1784154125 ^ 1269701342);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 881633464) {
            int i3 = 1503786355 ^ i2;
            return this.pendingActions.containsKey(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 881633464 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (440326095 ^ i2)) {
                int i4 = 1234559512 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -108854494 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1789236315 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1113941070 ^ i2;
        throw new IOException();
    }

    public void clearPlayerPendingAction(UUID uuid, int i) {
        int i2 = 1633737468 ^ (1879437465 ^ 1269701342);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -698776102) {
            i2 = 593743332 ^ i2;
            this.pendingActions.remove(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -850924805) {
                int i3 = 1062104533 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 926188626 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (212449578 ^ i2)) {
                int i4 = 1394111919 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -698776102 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (14228774 ^ i2)) {
                    int i5 = 610676514 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -850924805 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (78840573 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1298166980 ^ i2;
        throw new RuntimeException();
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
        tfyvcbfayw = ByteBuffer.wrap(ucgziudauchcezj()).asCharBuffer().toString();
        dAa5TRZPcW = 376877826 ^ new Random(9186953446631928867L).nextInt();
    }

    public static String wmlvldslgu(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = tfyvcbfayw.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] ucgziudauchcezj() {
        return new byte[0];
    }

    private static int fbsdlpkooxrmngzg(int i, int i2) {
        return i ^ i2;
    }
}
