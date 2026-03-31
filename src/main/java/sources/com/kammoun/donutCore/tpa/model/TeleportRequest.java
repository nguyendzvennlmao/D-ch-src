package com.kammoun.donutCore.tpa.model;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;
import lombok.Generated;

public class TeleportRequest {
    private final UUID requesterId;
    private final UUID targetId;
    private final TeleportType type;
    private final long createdAt;
    private boolean expired;
    private static int ZSHjLo0Lkq = 0;

    private transient int f1283e0w9A4QwS = 2115162425;
    private static String[] nothing_to_see_here = new String[19];

    public static final class TeleportType {
        public static final TeleportType TPA;
        public static final TeleportType TPA_HERE;
        private static final TeleportType[] $VALUES;
        private static byte[] xmosuhbmxx;

        public static TeleportType[] values() {
            int i = 2012691464 ^ (1971862988 ^ (1452026067 ^ 40083798));
            return (TeleportType[]) $VALUES.clone();
        }

        public static TeleportType valueOf(String str) {
            int i = 416514704 ^ (1507148260 ^ 40083798);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 455807250) {
                int i2 = 1986836466 ^ i;
                return (TeleportType) Enum.valueOf(TeleportType.class, str);
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 455807250 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1402631789 ^ i)) {
                    int i3 = 990226542 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1471238527 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (347918301 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 132428911 ^ i;
            throw new RuntimeException();
        }

        private TeleportType(String str, int i) {
            int i2 = 684753767 ^ (194362679 ^ 1714140441);
            int parseInt = 1820965332 ^ (2067481656 ^ (1983312273 ^ Integer.parseInt("1214463712")));
        }

        private static TeleportType[] $values() {
            int i = 975549292 ^ (163035863 ^ (1563824037 ^ 40083798));
            TeleportType[] teleportTypeArr = new TeleportType[(byte) (1825023818 ^ i)];
            teleportTypeArr[(byte) (1825023816 ^ i)] = TPA;
            teleportTypeArr[(byte) (1825023817 ^ i)] = TPA_HERE;
            return teleportTypeArr;
        }

        static {
            int parseInt = 1452872387 ^ (1874617241 ^ Integer.parseInt("1214463712"));
            xmosuhbmxx = dznkwcmahrvmory();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1976402477) {
                parseInt = 1493584746 ^ parseInt;
                TPA = new TeleportType(gwpmapcrvw(xbvlszsepxaaufe(), parseInt), (byte) (675284176 ^ parseInt));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1107306113) {
                    parseInt = 1518872243 ^ parseInt;
                    TPA_HERE = new TeleportType(gwpmapcrvw(gmobkjecttobvrv(), parseInt), (byte) (1925718626 ^ parseInt));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1774120165) {
                        int i = 131533636 ^ parseInt;
                        $VALUES = $values();
                        return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1774120165 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (283442355 ^ parseInt)) {
                    int i2 = 203918684 ^ parseInt;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1107306113 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (251404263 ^ parseInt)) {
                        int i3 = 282793554 ^ parseInt;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1976402477 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (952340591 ^ parseInt)) {
                            break;
                        }
                    }
                }
            }
            int i4 = 2125052533 ^ parseInt;
            throw new IOException();
        }

        public static String gwpmapcrvw(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= bArr.length) {
                    return new String(bArr, StandardCharsets.UTF_16);
                }
                bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                bArr[i3] = (byte) (bArr[i3] ^ xmosuhbmxx[i3 % xmosuhbmxx.length]);
                i2 = i3 + 1;
            }
        }

        private static byte[] dznkwcmahrvmory() {
            return new byte[]{24, 5, 109, 78, 118, 8, 80, 120, 91, 44, 98, 69, 33, 46, 58, 50, 72, 87, 37, 58, 44, 111, 40, 32, 49, 31, 24, 18, 89, 53, 121, 124, 17, 62, 29, 28, 59, 109, 40, 81, 110, 114, 124, 117, 43, 38, 82, 124, 19, 88, 85, 80, 26, 70, 116, 52, 96, 116, 41, 80, 87, 14, 21, 62, 117, 32, 41, 53, 18, 75, 91, 38, 96, 78, 44, 72, 12, 94};
        }

        private static byte[] xbvlszsepxaaufe() {
            return new byte[]{-48, -51, 88, 40, 78, 108, 97, 14};
        }

        private static byte[] gmobkjecttobvrv() {
            return new byte[]{-41, -61, 95, 47, 65, 105, 104, 15, 105, 68, 83, 52, 19, 94, 13, 81, 112, 36};
        }
    }

    public TeleportRequest(UUID uuid, UUID uuid2, TeleportType teleportType, int i) {
        eummofnmxfcheknz(1043040530 ^ 1958733429, 1329698305);
        int parseInt = 225064613 ^ (284063893 ^ Integer.parseInt("408008534"));
        this.f1283e0w9A4QwS = 2115162425 ^ ZSHjLo0Lkq;
        this.requesterId = uuid;
        this.targetId = uuid2;
        this.type = teleportType;
        this.createdAt = System.currentTimeMillis();
        this.expired = false;
        int i2 = 620364279 ^ (833687639 ^ (1373680914 ^ (1464473347 ^ (370716880 ^ (365220633 ^ (985553974 ^ parseInt))))));
    }

    public boolean isExpired(long r6, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.model.TeleportRequest.isExpired(long, int):boolean");
    }

    @Generated
    public UUID getRequesterId(int i) {
        int i2 = 369716362 ^ (322677049 ^ 426809334);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -502099416) {
            int i3 = 1513968694 ^ i2;
            return this.requesterId;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -502099416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (977320525 ^ i2)) {
                int i4 = 2128330247 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 871904154 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (28421999 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1266870315 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public UUID getTargetId(int i) {
        int i2 = 1446401281 ^ (1156285086 ^ 426809334);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1567228744) {
            int i3 = 1292661136 ^ i2;
            return this.targetId;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 889819082 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1347952855 ^ i2)) {
                int i4 = 529670507 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1567228744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1782047792 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1921689713 ^ i2;
        throw new IOException();
    }

    @Generated
    public TeleportType getType(int i) {
        int i2 = 219284633 ^ (119547535 ^ 426809334);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1709854976) {
            int i3 = 221731417 ^ i2;
            return this.type;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -206602808 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1853119947 ^ i2)) {
                int i4 = 830098279 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1709854976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (327062612 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 765888062 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public long getCreatedAt() {
        int i = 1203092195 ^ (1063926178 ^ 426809334);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 226010555) {
            int i2 = 667884139 ^ i;
            return this.createdAt;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 855668450 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1414692418 ^ i)) {
                int i3 = 1657890399 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 226010555 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1718141326 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 537572638 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public boolean isExpired() {
        int i = 417961212 ^ (1156980819 ^ 426809334);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 729357002) {
            int i2 = 123295158 ^ i;
            return this.expired;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 729357002 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (513357951 ^ i)) {
                int i3 = 1397435436 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 296990586 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2125285906 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1374491668 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public void setExpired(boolean z) {
        int i = 835192927 ^ (1130317265 ^ 426809334);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1597952963) {
            int i2 = 1912904875 ^ i;
            this.expired = z;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -820365672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1374282396 ^ i)) {
                int i3 = 533172143 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1597952963 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1509077939 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1300235766 ^ i;
        throw new IOException();
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠛⠉⠙⠛⠛⠛⠛⠻⢿⣿⣷⣤⡀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠈⢻⣿⣿⡄⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⠀⠀⠀⣸⣿⡏⠀⠀⠀⣠⣶⣾⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣄⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⢰⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣷⡄⠀";
        nothing_to_see_here[5] = "⠀⠀⣀⣤⣴⣶⣶⣿⡟⠀⠀⠀⢸⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⠀";
        nothing_to_see_here[6] = "⠀⢰⣿⡟⠋⠉⣹⣿⡇⠀⠀⠀⠘⣿⣿⣿⣿⣷⣦⣤⣤⣤⣶⣶⣶⣶⣿⣿⣿⠀";
        nothing_to_see_here[7] = "⠀⢸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀";
        nothing_to_see_here[8] = "⠀⣸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠉⠻⠿⣿⣿⣿⣿⡿⠿⠿⠛⢻⣿⡇⠀⠀";
        nothing_to_see_here[9] = "⠀⣿⣿⠁⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⠀⠀";
        nothing_to_see_here[10] = "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀";
        nothing_to_see_here[11] = "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀";
        nothing_to_see_here[12] = "⠀⢿⣿⡆⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀";
        nothing_to_see_here[13] = "⠀⠸⣿⣧⡀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠛⢿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⣰⣿⣿⣷⣶⣶⣶⣶⠶⠀⢠⣿⣿⠀⠀⠀";
        nothing_to_see_here[15] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⣽⣿⡏⠁⠀⠀⢸⣿⡇⠀⠀⠀";
        nothing_to_see_here[16] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⢹⣿⡆⠀⠀⠀⣸⣿⠇⠀⠀⠀";
        nothing_to_see_here[17] = "⠀⠀⠀⠀⠀⠀⠀⢿⣿⣦⣄⣀⣠⣴⣿⣿⠁⠀⠈⠻⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀";
        nothing_to_see_here[18] = "⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⠿⠿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        ZSHjLo0Lkq = (-906118696) ^ new Random(-3876676262525277396L).nextInt();
    }

    public static String zsbbepzfpa(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] szfmruhxgbqxstp() {
        return new byte[]{93, 76, 67, 34, 31, 79, 103, 52, 56, 84, 70, 59, 55, 63, 114, 68, 111, 118, 75, Byte.MAX_VALUE, 19, 77, 70, 43, 73, 26, 45, 46, 97, 47, 80, 41, 95, 41, 64, 71, 106, 41, 32, 49, 68, 112, 15, 17, 108, 1, 23, 35, 106, 52, 4, 90, 93, 57, 90, 38, 122, 31, 82, 72, 30, 68, 79, 90, 92, 33, 27, 71, 36, 30, 17, 89, 41, 84, 57, 7, 110, 98, 118, 117, 81};
    }

    private static int eummofnmxfcheknz(int i, int i2) {
        return i ^ i2;
    }
}
