package com.kammoun.donutCore.stats.data;

import com.kammoun.donutCore.api.database.SqliteHelper;
import com.kammoun.donutCore.api.module.DonutModule;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.Random;
import java.util.UUID;
import lombok.Generated;

public class StatsDatabase extends SqliteHelper {
    private static int O1NIvAhMZM = 0;
    private transient int qWkoajCu37 = 1215466266;
    private static String cihmvkadkv;
    private static String[] nothing_to_see_here = new String[15];

    public static class LeaderboardEntry {
        public final int rank;
        public final UUID playerUUID;
        public final String name;
        public final double value;
        private static int e21Qdhy4if = 0;
        private transient int c4xVWLqjRw = 1007745986;
        private static String[] nothing_to_see_here = new String[15];

        public LeaderboardEntry(int r5, java.util.UUID r6, java.lang.String r7, double r8, int r10) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.data.StatsDatabase.LeaderboardEntry.<init>(int, java.util.UUID, java.lang.String, double, int):void");
        }

        @Generated
        public int getRank(int i) {
            int i2 = 1515953860 ^ (1472830958 ^ 170998062);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1025101856) {
                int i3 = 527883489 ^ i2;
                return this.rank;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1025101856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (658913094 ^ i2)) {
                    int i4 = 1760332953 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -961595608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (278627718 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 10114832 ^ i2;
            throw new IllegalAccessException();
        }

        @Generated
        public UUID getPlayerUUID(int i) {
            int i2 = 1377430967 ^ (813131512 ^ 170998062);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1123914507) {
                int i3 = 1399055341 ^ i2;
                return this.playerUUID;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1123914507 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (470990518 ^ i2)) {
                    int i4 = 1807591654 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -639464351 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (454439478 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 340844985 ^ i2;
            throw new RuntimeException();
        }

        @Generated
        public String getName(int i) {
            int i2 = 1473246305 ^ (1507111700 ^ 170998062);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 559149784) {
                int i3 = 593147648 ^ i2;
                return this.name;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 998656729 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1365879599 ^ i2)) {
                    int i4 = 345585140 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 559149784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (391160138 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1939262112 ^ i2;
            throw new RuntimeException();
        }

        @Generated
        public double getValue(int i) {
            int i2 = 122181858 ^ (517167009 ^ 170998062);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1655590040) {
                int i3 = 302499865 ^ i2;
                return this.value;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1655590040 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (930508286 ^ i2)) {
                    int i4 = 1336547949 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 225440672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1059710999 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 268855515 ^ i2;
            throw new IOException();
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
            e21Qdhy4if = 220382141 ^ new Random(1056690037049034774L).nextInt();
        }

        public static String mokjtsqimh(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] tkqgmxwqownnwmm() {
            return new byte[]{9, 100, 119, 87, 75, 43, 100, 107, 77, 88, 6, 47, 79, 25, 54, 108, 105, 10, 125, 111, 76, 30, 30, 28, 25, 12, 79, 102, 90, 41, 54, 112, 115, 87, 33, 126, 36, 96, 71, 97, 8, 18, 60, 68, 59, 80, 21, 7, 121, 6, 2, 44, 63, 126, 57, 41, 28, 12, 72, 101, 47, 78, 100, 13, 33, 88, 13, 57, 41, 84, 113, 111, 126, 18, 40, 66, 124, 48, 43, 123, 48, 29, 111, 105, 126, 32, 14, 88, 117, 104, 49, 74, 38, 48, 102, 91, 84, 6, 24, 82, 77, 87, 107, 117, 42, 120, 82, 59, 23, 120, 67, 95, 46, 40, 44};
        }
    }

    public StatsDatabase(DonutModule donutModule, int i) {
        super(donutModule, 267686524);
        int mwfwudfwfbchwwwd;
        mwfwudfwfbchwwwd(975170217 ^ 1313393640, 1774623064);
        int parseInt = 521442242 ^ (970120262 ^ Integer.parseInt("995620765"));
        this.qWkoajCu37 = 1215466266 ^ O1NIvAhMZM;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 155863329:
                    parseInt = 1921986735 ^ parseInt;
                    break;
                case 242373534:
                default:
                    throw new RuntimeException();
                case 427294340:
                    break;
                case 1014389010:
            }
        }
        int i2 = 576219347 ^ parseInt;
        int i3 = i2;
        try {
            connectDataBase(1631272013);
            migrateAddPlayerName(251792994);
            i2 = 1465747618 ^ (1029018088 ^ i3);
            i3 = i2;
            mwfwudfwfbchwwwd(i3, 131276802);
        } catch (SQLException e) {
            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                case -2137289621:
                    mwfwudfwfbchwwwd = 1881928317 ^ i3;
                    donutModule.getLogger(583940502).severe("Failed to connect to stats database: " + i2.getMessage());
                    int i4 = 447069901 ^ (973136912 ^ mwfwudfwfbchwwwd);
                    return;
                case 1781990186:
                    mwfwudfwfbchwwwd = mwfwudfwfbchwwwd(i3, 1300128661);
                    donutModule.getLogger(583940502).severe("Failed to connect to stats database: " + i2.getMessage());
                    int i42 = 447069901 ^ (973136912 ^ mwfwudfwfbchwwwd);
                    return;
                default:
                    throw new RuntimeException("Error in hash");
            }
        }
    }

    @Override
    public void onCreate(java.sql.Connection r6, int r7) throws java.sql.SQLException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.data.StatsDatabase.onCreate(java.sql.Connection, int):void");
    }

    private void migrateAddPlayerName(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.data.StatsDatabase.migrateAddPlayerName(int):void");
    }

    public void savePlayerName(java.util.UUID r6, java.lang.String r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.data.StatsDatabase.savePlayerName(java.util.UUID, java.lang.String, int):void");
    }

    public void saveStats(com.kammoun.donutCore.stats.models.StatsHolder r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.data.StatsDatabase.saveStats(com.kammoun.donutCore.stats.models.StatsHolder, int):void");
    }

    public com.kammoun.donutCore.stats.models.StatsHolder loadStats(java.util.UUID r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.data.StatsDatabase.loadStats(java.util.UUID, int):com.kammoun.donutCore.stats.models.StatsHolder");
    }

    public void deleteStats(java.util.UUID r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.data.StatsDatabase.deleteStats(java.util.UUID, int):void");
    }

    public java.util.List getTopPlayersByStat(java.lang.String r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.data.StatsDatabase.getTopPlayersByStat(java.lang.String, int, int, int):java.util.List");
    }

    public int getPlayerRank(java.util.UUID r6, java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.data.StatsDatabase.getPlayerRank(java.util.UUID, java.lang.String):int");
    }

    public double getPlayerStatValue(java.util.UUID r6, java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.data.StatsDatabase.getPlayerStatValue(java.util.UUID, java.lang.String):double");
    }

    static {
        nothing_to_see_here[0] = "⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆";
        nothing_to_see_here[5] = "⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿";
        nothing_to_see_here[6] = "⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀";
        nothing_to_see_here[7] = "⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[8] = "⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉              ";
        cihmvkadkv = ByteBuffer.wrap(yvskgtprphrcqjr()).asCharBuffer().toString();
        O1NIvAhMZM = 380871817 ^ new Random(368177070439430297L).nextInt();
    }

    public static String npwyaojnnl(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = cihmvkadkv.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] pmrmngdmlvdmujr() {
        return new byte[]{0, 0, 1, -6, 0, 0, 0, 0};
    }

    private static byte[] twpvyjiqrsvsbjg() {
        return new byte[]{0, 0, 0, 70, 0, 0, 1, -6};
    }

    private static byte[] chqudebhtjzxmyj() {
        return new byte[]{0, 0, 0, 54, 0, 0, 2, 64};
    }

    private static byte[] tgvlewzpuatqizj() {
        return new byte[]{0, 0, 1, 86, 0, 0, 2, 118};
    }

    private static byte[] wszfvgknbaqnmcs() {
        return new byte[]{0, 0, 0, 13, 0, 0, 3, -52};
    }

    private static byte[] kknsnhrhscbgizi() {
        return new byte[]{0, 0, 0, 6, 0, 0, 3, -39};
    }

    private static byte[] poaibhycgddgiff() {
        return new byte[]{0, 0, 0, 12, 0, 0, 3, -33};
    }

    private static byte[] htbsxjggluutokt() {
        return new byte[]{0, 0, 0, 13, 0, 0, 3, -21};
    }

    private static byte[] acigxpbavqdyilw() {
        return new byte[]{0, 0, 0, 9, 0, 0, 3, -8};
    }

    private static byte[] akmyyiblgkiqflz() {
        return new byte[]{0, 0, 0, 6, 0, 0, 4, 1};
    }

    private static byte[] vkdbrlaghctjcaa() {
        return new byte[]{0, 0, 0, 11, 0, 0, 4, 7};
    }

    private static byte[] lmxmumvnjqfplvp() {
        return new byte[]{0, 0, 0, 41, 0, 0, 4, 18};
    }

    private static byte[] tvrppjfjcvsfvow() {
        return new byte[]{0, 0, 0, 13, 0, 0, 4, 59};
    }

    private static byte[] lvouoacxqyipcyq() {
        return new byte[]{0, 0, 0, 5, 0, 0, 4, 72};
    }

    private static byte[] okpqaxegfhbpklp() {
        return new byte[]{0, 0, 0, 9, 0, 0, 4, 77};
    }

    private static byte[] qdiamzhydkrcrse() {
        return new byte[]{0, 0, 0, 10, 0, 0, 4, 86};
    }

    private static byte[] gmxzheqpzrvxgtv() {
        return new byte[]{0, 0, 0, 13, 0, 0, 4, 96};
    }

    private static byte[] wjqmybdymxgpcwt() {
        return new byte[]{0, 0, 0, 5, 0, 0, 4, 109};
    }

    private static byte[] jexhmbqatuyksyx() {
        return new byte[]{0, 0, 0, 5, 0, 0, 4, 114};
    }

    private static byte[] snbnqkjkvvayend() {
        return new byte[]{0, 0, 0, 39, 0, 0, 4, 119};
    }

    private static byte[] pecevevmtietrcj() {
        return new byte[]{0, 0, 0, 11, 0, 0, 4, -98};
    }

    private static byte[] eghddiclstavgjb() {
        return new byte[]{0, 0, 0, 5, 0, 0, 4, -87};
    }

    private static byte[] njwdmohwacbzkhi() {
        return new byte[]{0, 0, 0, 4, 0, 0, 4, -82};
    }

    private static byte[] akicajzkfxrcnje() {
        return new byte[]{0, 0, 0, 4, 0, 0, 4, -78};
    }

    private static byte[] yvskgtprphrcqjr() {
        return new byte[]{49, 122, 48, 100, 48, 125, 51, 112, 52, 103, 49, 124, 48, 22, 48, 108, 51, 112, 52, 113, 49, 117, 48, 115, 48, 24, 51, 120, 52, 117, 49, 25, 48, 120, 48, 119, 51, 101, 52, 19, 49, 124, 48, 110, 48, 113, 51, 98, 52, 103, 49, 106, 48, 22, 48, 104, 51, 125, 52, 114, 49, 96, 48, 115, 48, 106, 51, 110, 52, 96, 49, 109, 48, 119, 48, 108, 51, 98, 52, 19, 49, 17, 48, 67, 48, 77, 51, 88, 52, 87, 49, 25, 48, 98, 48, 125, 51, 105, 52, 103, 49, 25, 48, 102, 48, 106, 51, 120, 52, 126, 49, 120, 48, 100, 48, 97, 51, 17, 52, 120, 49, 124, 48, 111, 48, 24, 51, Byte.MAX_VALUE, 52, 124, 49, 109, 48, 22, 48, 118, 51, 100, 52, Byte.MAX_VALUE, 49, 117, 48, 26, 48, 24, 51, 65, 52, 95, 49, 88, 48, 79, 48, 93, 51, 67, 52, 108, 49, 87, 48, 87, 48, 85, 51, 84, 52, 19, 49, 109, 48, 115, 48, 96, 51, 101, 52, 19, 49, 125, 48, 115, 48, 126, 51, 112, 52, 102, 49, 117, 48, 98, 48, 24, 51, 22, 52, 102, 49, 87, 48, 93, 48, 86, 51, 94, 52, 68, 49, 87, 48, 17, 48, 20, 51, 17, 52, 88, 49, 80, 48, 90, 48, 84, 51, 66, 52, 19, 49, 112, 48, 120, 48, 108, 51, 116, 52, 116, 49, 124, 48, 100, 48, 24, 51, 117, 52, 118, 49, Byte.MAX_VALUE, 48, 119, 48, 109, 51, 125, 52, 103, 49, 25, 48, 6, 48, 20, 51, 17, 52, 81, 49, 85, 48, 89, 48, 91, 51, 90, 52, 64, 49, 102, 48, 84, 48, 74, 51, 94, 52, 88, 49, 92, 48, 88, 48, 24, 51, 120, 52, 125, 49, 109, 48, 115, 48, Byte.MAX_VALUE, 51, 116, 52, 97, 49, 25, 48, 114, 48, 125, 51, 119, 52, 114, 49, 108, 48, 122, 48, 108, 51, 17, 52, 3, 49, 21, 48, 22, 48, 90, 51, 93, 52, 92, 49, 90, 48, 93, 48, 75, 51, 110, 52, 67, 49, 85, 48, 87, 48, 91, 51, 84, 52, 87, 49, 25, 48, Byte.MAX_VALUE, 48, 118, 51, 101, 52, 118, 49, 126, 48, 115, 48, 106, 51, 17, 52, 119, 49, 124, 48, 112, 48, 121, 51, 100, 52, Byte.MAX_VALUE, 49, 109, 48, 22, 48, 8, 51, 29, 52, 19, 49, 93, 48, 83, 48, 89, 51, 69, 52, 91, 49, 74, 48, 22, 48, 113, 51, Byte.MAX_VALUE, 52, 103, 49, 124, 48, 113, 48, 125, 51, 99, 52, 19, 49, 125, 48, 115, 48, 126, 51, 112, 52, 102, 49, 117, 48, 98, 48, 24, 51, 1, 52, 31, 49, 25, 48, 91, 48, 87, 51, 83, 52, 108, 49, 82, 48, 95, 48, 84, 51, 93, 52, 64, 49, 25, 48, Byte.MAX_VALUE, 48, 118, 51, 101, 52, 118, 49, 126, 48, 115, 48, 106, 51, 17, 52, 119, 49, 124, 48, 112, 48, 121, 51, 100, 52, Byte.MAX_VALUE, 49, 109, 48, 22, 48, 8, 51, 29, 52, 19, 49, 73, 48, 90, 48, 89, 51, 72, 52, 108, 49, 77, 48, 95, 48, 85, 51, 84, 52, 19, 49, 112, 48, 120, 48, 108, 51, 116, 52, 116, 49, 124, 48, 100, 48, 24, 51, 117, 52, 118, 49, Byte.MAX_VALUE, 48, 119, 48, 109, 51, 125, 52, 103, 49, 25, 48, 6, 48, 20, 51, 17, 52, 90, 49, 77, 48, 83, 48, 85, 51, 66, 52, 108, 49, 90, 48, 68, 48, 89, 51, 87, 52, 71, 49, 92, 48, 82, 48, 24, 51, 120, 52, 125, 49, 109, 48, 115, 48, Byte.MAX_VALUE, 51, 116, 52, 97, 49, 25, 48, 114, 48, 125, 51, 119, 52, 114, 49, 108, 48, 122, 48, 108, 51, 17, 52, 3, 49, 21, 48, 22, 48, 82, 51, 68, 52, 94, 49, 73, 48, 69, 48, 24, 51, 120, 52, 125, 49, 109, 48, 115, 48, Byte.MAX_VALUE, 51, 116, 52, 97, 49, 25, 48, 114, 48, 125, 51, 119, 52, 114, 49, 108, 48, 122, 48, 108, 51, 17, 52, 3, 49, 21, 48, 22, 48, 91, 51, 89, 52, 82, 49, 77, 48, 105, 48, 85, 51, 84, 52, 64, 49, 74, 48, 87, 48, 95, 51, 84, 52, 64, 49, 25, 48, Byte.MAX_VALUE, 48, 118, 51, 101, 52, 118, 49, 126, 48, 115, 48, 106, 51, 17, 52, 119, 49, 124, 48, 112, 48, 121, 51, 100, 52, Byte.MAX_VALUE, 49, 109, 48, 22, 48, 8, 51, 29, 52, 19, 49, 84, 48, 89, 48, 86, 51, 84, 52, 74, 49, 25, 48, 100, 48, 125, 51, 112, 52, Byte.MAX_VALUE, 49, 25, 48, 114, 48, 125, 51, 119, 52, 114, 49, 108, 48, 122, 48, 108, 51, 17, 52, 3, 49, 21, 48, 22, 48, 75, 51, 89, 52, 82, 49, 75, 48, 82, 48, 75, 51, 17, 52, 97, 49, 124, 48, 119, 48, 116, 51, 17, 52, 119, 49, 124, 48, 112, 48, 121, 51, 100, 52, Byte.MAX_VALUE, 49, 109, 48, 22, 48, 8, 51, 29, 52, 19, 49, 84, 48, 89, 48, 86, 51, 84, 52, 74, 49, 102, 48, 69, 48, 72, 51, 84, 52, 93, 49, 77, 48, 22, 48, 106, 51, 116, 52, 114, 49, 117, 48, 22, 48, 124, 51, 116, 52, 117, 49, 120, 48, 99, 48, 116, 51, 101, 52, 19, 49, 9, 48, 26, 48, 24, 51, 92, 52, 92, 49, 87, 48, 83, 48, 65, 51, 110, 52, 94, 49, 88, 48, 82, 48, 93, 51, 17, 52, 97, 49, 124, 48, 119, 48, 116, 51, 17, 52, 119, 49, 124, 48, 112, 48, 121, 51, 100, 52, Byte.MAX_VALUE, 49, 109, 48, 22, 48, 8, 51, 29, 52, 19, 49, 85, 48, 87, 48, 75, 51, 69, 52, 108, 49, 76, 48, 70, 48, 92, 51, 80, 52, 71, 49, 92, 48, 82, 48, 24, 51, 120, 52, 125, 49, 109, 48, 115, 48, Byte.MAX_VALUE, 51, 116, 52, 97, 49, 25, 48, 114, 48, 125, 51, 119, 52, 114, 
        49, 108, 48, 122, 48, 108, 51, 17, 52, 3, 49, 16, 53, 119, 57, 120, 48, 96, 50, 117, 52, 103, 54, 25, 52, 100, 52, 115, 48, 118, 53, 122, 57, 113, 48, 20, 50, 96, 52, 121, 54, 120, 52, 105, 52, 119, 48, 102, 53, 105, 57, 103, 48, 96, 50, 113, 52, 97, 54, 106, 52, 16, 52, 115, 48, 112, 53, 114, 57, 20, 48, 119, 50, Byte.MAX_VALUE, 52, 121, 54, 108, 52, 125, 52, 124, 48, 20, 53, 70, 57, 88, 48, 85, 50, 73, 52, 80, 54, 75, 52, 111, 52, 92, 48, 85, 53, 91, 57, 81, 48, 20, 50, 100, 52, 112, 54, 97, 52, 100, 52, 18, 48, 112, 53, 115, 57, 114, 48, 117, 50, 101, 52, 121, 54, 109, 52, 16, 52, 21, 48, 97, 53, 88, 57, 95, 48, 90, 50, 95, 52, 66, 54, 87, 52, 23, 52, 102, 55, 99, 53, 124, 51, 116, 56, 96, 51, 114, 51, 21, 56, 99, 53, 116, 52, 114, 55, 106, 53, 125, 51, 103, 56, 107, 51, 100, 51, 97, 56, 114, 53, 108, 52, 96, 55, 19, 53, 107, 51, 112, 56, 96, 51, 23, 51, 69, 56, 95, 53, 89, 52, 74, 55, 86, 53, 74, 51, 106, 56, 90, 51, 86, 51, 88, 56, 86, 53, 24, 52, 14, 55, 19, 53, 7, 51, 21, 56, 99, 51, Byte.MAX_VALUE, 51, 112, 56, 97, 53, 125, 52, 19, 55, 70, 53, 77, 51, 92, 56, 80, 51, 23, 51, 8, 56, 19, 53, 7, 49, 120, 56, 125, 57, 99, 57, 117, 54, 98, 49, 101, 56, 19, 57, Byte.MAX_VALUE, 57, 98, 54, 16, 49, 99, 56, 118, 57, 96, 57, 124, 54, 113, 49, 114, 56, 118, 57, 16, 57, 121, 54, 126, 49, 101, 56, 124, 57, 16, 57, 96, 54, 124, 49, 112, 56, 106, 57, 117, 57, 98, 54, 111, 49, 98, 56, 103, 57, 113, 57, 100, 54, 99, 49, 17, 56, 27, 57, 69, 57, 69, 54, 89, 49, 85, 56, 31, 57, 16, 57, 64, 54, 92, 49, 80, 56, 74, 57, 85, 57, 66, 54, 111, 49, 95, 56, 82, 57, 93, 57, 85, 54, 28, 49, 17, 56, 88, 57, 89, 57, 92, 54, 92, 49, 66, 56, 31, 57, 16, 57, 82, 54, 92, 49, 94, 56, 80, 57, 91, 57, 67, 54, 111, 49, 83, 56, 65, 57, 95, 57, 91, 54, 85, 49, 95, 56, 31, 57, 16, 57, 82, 54, 92, 49, 94, 56, 80, 57, 91, 57, 67, 54, 111, 49, 65, 56, 95, 57, 81, 57, 83, 54, 85, 49, 85, 56, 31, 57, 16, 57, 84, 54, 85, 49, 80, 56, 71, 57, 88, 57, 67, 54, 28, 49, 17, 56, 94, 57, 95, 57, 82, 54, 111, 49, 90, 56, 90, 57, 92, 57, 92, 54, 67, 49, 29, 56, 19, 57, 64, 57, 92, 54, 81, 49, 72, 56, 108, 57, 68, 57, 89, 54, 93, 49, 84, 56, 31, 57, 16, 57, 89, 54, 68, 49, 84, 56, 94, 57, 67, 57, 111, 54, 83, 49, 67, 56, 82, 57, 86, 57, 68, 54, 85, 49, 85, 56, 31, 57, 16, 57, 90, 54, 69, 49, 92, 56, 67, 57, 67, 57, 28, 54, 16, 49, 82, 56, 91, 57, 81, 57, 68, 54, 111, 49, 92, 56, 86, 57, 67, 57, 67, 54, 81, 49, 86, 56, 86, 57, 67, 57, 28, 54, 16, 49, 92, 56, 92, 57, 94, 57, 85, 54, 73, 49, 29, 56, 19, 57, 67, 57, 88, 54, 81, 49, 67, 56, 87, 57, 67, 57, 28, 54, 16, 49, 92, 56, 92, 57, 94, 57, 85, 54, 73, 49, 110, 56, 64, 57, 64, 57, 85, 54, 94, 49, 69, 56, 31, 57, 16, 57, 93, 54, 95, 49, 95, 56, 86, 57, 73, 57, 111, 54, 93, 49, 80, 56, 87, 57, 85, 57, 28, 54, 16, 49, 93, 56, 82, 57, 67, 57, 68, 54, 111, 49, 68, 56, 67, 57, 84, 57, 81, 54, 68, 49, 84, 56, 87, 57, 25, 57, 16, 54, 102, 49, 112, 56, Byte.MAX_VALUE, 57, 101, 57, 117, 54, 99, 49, 17, 56, 27, 57, 15, 57, 28, 54, 16, 49, 114, 56, 124, 57, 113, 57, 124, 54, 117, 49, 98, 56, 112, 57, 117, 57, 24, 54, 24, 49, 98, 56, 118, 57, 124, 57, 117, 54, 115, 49, 101, 56, 19, 57, 64, 57, 92, 54, 81, 49, 72, 56, 86, 57, 66, 57, 111, 54, 94, 49, 80, 56, 94, 57, 85, 57, 16, 54, 118, 49, 99, 56, 124, 57, 125, 57, 16, 54, 96, 49, 125, 56, 114, 57, 105, 57, 117, 54, 98, 49, 110, 56, 96, 57, 100, 57, 113, 54, 100, 49, 98, 56, 19, 57, 103, 57, 120, 54, 117, 49, 99, 56, 118, 57, 16, 57, 69, 54, 69, 49, 88, 56, 87, 57, 16, 57, 13, 54, 16, 49, 14, 56, 26, 57, 28, 57, 16, 54, 23, 49, 100, 56, 93, 57, 91, 57, 94, 54, 95, 49, 70, 56, 93, 57, 23, 57, 25, 54, 28, 49, 17, 56, 12, 57, 28, 57, 16, 54, 15, 49, 29, 56, 19, 57, 15, 57, 28, 54, 16, 49, 14, 56, 31, 57, 16, 57, 15, 54, 28, 49, 17, 56, 12, 57, 28, 57, 16, 54, 15, 49, 29, 56, 19, 57, 15, 57, 28, 54, 16, 49, 14, 56, 31, 57, 16, 57, 15, 54, 28, 49, 17, 56, 12, 57, 28, 57, 16, 54, 15, 49, 29, 56, 19, 57, 15, 57, 28, 54, 16, 49, 14, 56, 26, 51, 91, 52, 89, 56, 90, 55, 82, 56, 88, 57, 71, 53, 103, 53, 71, 49, 84, 51, 88, 52, 86, 56, 80, 55, 85, 51, 81, 54, 81, 50, 82, 57, 76, 51, 93, 54, 71, 56, 85, 49, 80, 49, 66, 50, 76, 49, 103, 57, 68, 49, 65, 49, 86, 56, 80, 
        56, 77, 49, 84, 49, 85, 49, 94, 53, 70, 48, 83, 48, 89, 50, 75, 49, 104, 53, 81, 48, 68, 48, 85, 50, 94, 49, 67, 53, 87, 48, 82, 49, 64, 51, 94, 53, 86, 48, 75, 56, 108, 49, 68, 51, 91, 53, 90, 48, 87, 49, 67, 53, 80, 57, 84, 50, 64, 51, 81, 49, 67, 57, 84, 52, 89, 51, 95, 53, 83, 48, 64, 57, 107, 54, 64, 49, 69, 54, 85, 57, 87, 52, 66, 49, 101, 57, 112, 56, 121, 57, 116, 54, 123, 49, 98, 57, 21, 56, 31, 57, 17, 54, 126, 49, 100, 57, 122, 56, 120, 57, 17, 54, 104, 49, 122, 57, 116, 56, 108, 57, 116, 54, 106, 49, 105, 57, 102, 56, 97, 57, 112, 54, 108, 49, 101, 57, 21, 56, 98, 57, 121, 54, 125, 49, 100, 57, 112, 56, 21, 57, 68, 54, 77, 49, 95, 57, 81, 56, 21, 57, 12, 54, 24, 49, 9, 49, 80, 51, 95, 49, 92, 48, 91, 54, 89, 49, 65, 51, 108, 49, 81, 48, 74, 54, 93, 49, 89, 51, 86, 49, 93, 49, 91, 53, 71, 50, 88, 51, 64, 55, 67, 49, 92, 51, 89, 49, 91, 49, 102, 51, 95, 49, 88, 51, 90, 49, 85, 49, 74, 49, 93, 54, 88, 57, 94, 50, 93, 55, 77, 49, 111, 54, 90, 57, 81, 50, 92, 55, 81, 50, 82, 49, 91, 57, 83, 49, 70, 52, 105, 50, 92, 49, 86, 57, 65, 49, 65, 52, 87, 50, 86, 49, 86, 57, 65, 49, 90, 51, 91, 56, 88, 57, 94, 53, 69, 49, 92, 54, 88, 48, 93, 50, 83, 50, 79, 57, 125, 50, 118, 56, 124, 57, 115, 57, 109, 57, 119, 51, 24, 48, Byte.MAX_VALUE, 54, 107, 57, 118, 50, 126, 56, 16, 57, 102, 57, 117, 57, 115, 51, 97, 48, 124, 54, 107, 57, 102, 50, 96, 56, 100, 57, 119, 57, 109, 57, 97, 51, 24, 48, 110, 54, 113, 57, 124, 50, 97, 56, 117, 57, 22, 57, 76, 57, 71, 51, 81, 48, 93, 54, 25, 57, 4, 50, 19, 56, 15, 49, 72, 57, 85, 51, 86, 49, 77, 49, 92, 49, 74, 57, 102, 51, 89, 49, 85, 49, 84, 49, 93, 49, 64, 53, 81, 54, 95, 48, 71, 50, 82, 50, 68, 50, 68, 53, 81, 49, 84, 49, 67, 52, 83, 56, 90, 52, 89};
    }

    private static int mwfwudfwfbchwwwd(int i, int i2) {
        return i ^ i2;
    }
}
