package com.kammoun.donutCore.api.skin;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;

public final class SQLiteSkinStorage implements SkinStorage {
    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS player_skins (\n    uuid TEXT PRIMARY KEY,\n    texture_value TEXT NOT NULL,\n    signature TEXT,\n    last_seen INTEGER NOT NULL\n)\n";
    private static final String SELECT_BY_UUID = "SELECT * FROM player_skins WHERE uuid = ?";
    private static final String UPSERT = "INSERT INTO player_skins (uuid, texture_value, signature, last_seen)\nVALUES (?, ?, ?, ?)\nON CONFLICT(uuid) DO UPDATE SET\n    texture_value = excluded.texture_value,\n    signature = excluded.signature,\n    last_seen = excluded.last_seen\n";
    private static final String DELETE_BY_UUID = "DELETE FROM player_skins WHERE uuid = ?";
    private static final String EXISTS_BY_UUID = "SELECT 1 FROM player_skins WHERE uuid = ? LIMIT 1";
    private final File databaseFile;
    private final Logger logger;
    private final ExecutorService executor;
    private Connection connection;
    private static int DEsya8I1zr = 0;

    private transient int f62zzOirGfoB = 1389962616;
    private static byte[] myqkjsjphx;
    private static String[] nothing_to_see_here = new String[15];

    public SQLiteSkinStorage(@org.jetbrains.annotations.NotNull java.io.File r5, @org.jetbrains.annotations.NotNull java.util.logging.Logger r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.skin.SQLiteSkinStorage.<init>(java.io.File, java.util.logging.Logger, int):void");
    }

    @Override
    public CompletableFuture initialize(int i) {
        int i2 = 1098307431 ^ (952255138 ^ 613408168);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -371571862) {
            int i3 = 1340729808 ^ i2;
            return CompletableFuture.runAsync(() -> {
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.skin.SQLiteSkinStorage.lambda$initialize$1():void");
            }, this.executor);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -371571862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (398838144 ^ i2)) {
                int i4 = 376267879 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1768616472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1313727772 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1604627724 ^ i2;
        throw new IllegalAccessException();
    }

    @Override
    public CompletableFuture load(@NotNull UUID uuid, int i) {
        int i2 = 876893328 ^ (586970181 ^ 613408168);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1849693207) {
            int i3 = 1034031793 ^ i2;
            return CompletableFuture.supplyAsync(()
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.skin.SQLiteSkinStorage.load(java.util.UUID, int):java.util.concurrent.CompletableFuture");
        }

        @Override
        public CompletableFuture save(@NotNull SkinData skinData, int i) {
            int i2 = 2132795267 ^ (710272237 ^ 613408168);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1909508557) {
                int i3 = 1279920967 ^ i2;
                return CompletableFuture.runAsync(()
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.skin.SQLiteSkinStorage.save(com.kammoun.donutCore.api.skin.SkinData, int):java.util.concurrent.CompletableFuture");
            }

            @Override
            public CompletableFuture<Void> delete(@NotNull UUID uuid) {
                int i = 1406201526 ^ (1802350053 ^ 613408168);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -510330920) {
                    int i2 = 135671735 ^ i;
                    return CompletableFuture.runAsync(()
                    throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.skin.SQLiteSkinStorage.delete(java.util.UUID):java.util.concurrent.CompletableFuture");
                }

                @Override
                public CompletableFuture<Boolean> exists(@NotNull UUID uuid) {
                    int i = 1213483721 ^ (760944103 ^ 613408168);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 201593906) {
                        int i2 = 1440465880 ^ i;
                        return CompletableFuture.supplyAsync(()
                        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.skin.SQLiteSkinStorage.exists(java.util.UUID):java.util.concurrent.CompletableFuture");
                    }

                    @Override
                    public CompletableFuture shutdown(int i) {
                        int i2 = 18940071 ^ (590052420 ^ 613408168);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 875367000) {
                            int i3 = 1510947352 ^ i2;
                            return CompletableFuture.runAsync(() -> {
                                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.skin.SQLiteSkinStorage.lambda$shutdown$6():void");
                            });
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 875367000 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1996372421 ^ i2)) {
                                int i4 = 1542941467 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -464201062 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (210854726 ^ i2)) {
                                    break;
                                }
                            }
                        }
                        int i5 = 1079041798 ^ i2;
                        throw new RuntimeException();
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
                        myqkjsjphx = huzkkhkyawnoene();
                        DEsya8I1zr = 1525484716 ^ new Random(-5714383899700831353L).nextInt();
                    }

                    public static String wpnanuymkw(byte[] bArr, int i) {
                        byte[] bytes = Integer.toString(i).getBytes();
                        int i2 = 0;
                        while (true) {
                            int i3 = i2;
                            if (i3 >= bArr.length) {
                                return new String(bArr, StandardCharsets.UTF_16);
                            }
                            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                            bArr[i3] = (byte) (bArr[i3] ^ myqkjsjphx[i3 % myqkjsjphx.length]);
                            i2 = i3 + 1;
                        }
                    }

                    private static byte[] huzkkhkyawnoene() {
                        return new byte[]{75, 81, 118, 110, 14, 98, 57, 118, 110, 116, 36, Byte.MAX_VALUE, 37, 99, 98, 114, 83, 62, 65, 40, 123, 90, 68, 75, 95, 88, 47, 107, 82, 42, 1, 50, 64, 49, 87, 63, 124, 53, 51, 87, 79, 85, 67, 75, 21, 95, 123, 46, 23, 33, 10, 76, 80, 4, 34, 27, 51, 28, 47, 62, 38, 23, 74, 23, 123, 93, 112, 97, 85, 82, 125, 10, 78, 25, 35, 31, 70, 47, 29, 93, 64, 31, 71, 118, 100, 45, 27, 69, 39, 116, 87};
                    }

                    private static byte[] fzzjlajnbvkstqm() {
                        return new byte[]{-124, -106, 78, 14, 58, 58, 11, 42, 95, 35, 21, 4, 29, 49, 86, 34, 97, 99, 112, 116, 74, 79, 124, 60, 107, 10, 29, 42, 99, 114, 48, 104, 120, 99, 99, Byte.MAX_VALUE, 78, 101};
                    }

                    private static byte[] untyishhlonpmdy() {
                        return new byte[]{-124, -102, 64, 15, 55, 0, 10, 14, 88, 43, 21, 63, 19, 52, 91, 97, 96, 121, 119, 117, 74, 7, 114, 23, 102, 75, 28, 44, 100, 104, 48, 105, 118, 113, 110, 109, 79, 102, 5, 4, 126, 65, 117, 10, 44, 4, 72, 111, 33, 99, 59, 88, 102, 82, 27, 71, 0, 95, 25, 102, 23, 3, 124, 66, 66, 28, 67, 52, 99, 7, 76, 91, 120, 77, 26, 89, 117, 119, 43, 7, 113, 82};
                    }

                    private static byte[] twrbbkegpupuold() {
                        return new byte[]{-124, -106, 64, 10, 54, 20, 10, 10, 95, 0, 21, 4, 19, 0, 90, 97, 96, 63, 112, 57, 74, 36, 114, 46, 103, 36, 28, 22, 99, 59, 48, 122, 118, 106, 111, 109, 79, 124, 2, 3, 126, 31, 117, 35, 45, 31, 72, 117, 38, 121, 59, 26, 102, 64, 26, 8, 0, 123, 30, 71, 23, 106, 124, 114, 67, 43, 67, 113, 100, 22, 76, 71, 120, 71, 27, 72, 117, 63, 44, 81, 113, 7, 113, 126, 92, 62, 40, 57, 22, 12, 102, 62, 103, 8, 86, 105, 81, 41, 71, 110};
                    }

                    private static byte[] dbdkwnhfvfhcnfy() {
                        return new byte[]{-116, -99, 64, 29, 63, 30, 1, 2, 86, 8, 23, 29, 18, 23, 91, 106, 107, 64, 120, 73, 77, 34, 117, 63, 103, 64, 23, 34, 97, 112, 54, 98, 121, 112, 111, 98, 69, 116, 5, 63, 126, 31, 123, 24, 45, 15, 72, 118, 32, 99, 51, 84, 104, 107, 27, 96, 5, 110, 30, 85, 30, 106, 114, 14, 72, 30, 71, 37, 108, 3, 69, 86, 119, 10, 21, 21, 119, 54, 37, 90};
                    }

                    private static byte[] kymgoesigixtztc() {
                        return new byte[]{-124, -100, 64, 18, 61, 21, 12, 21, 93, 3, 21, 31, 19, 2, 81, 107, 102, 71, 114, 84, 74, 60, 114, 49, 108, 65, 26, 43, 97, 116, 48, 97, 118, 125, 100, 99, 73, 119, 0, 58, 126, 20, 117, 21, 38, 15, 78, 112, 36, 96, 59, 94, 102, 25, 17, 87, 6, 89, 28, 101, 23, 65, 124, 14, 72, 68, 69, 37, 102, 5, 76, 64, 120, 88, 16, 83, 115, 109, 46, 10, 113, 114, 113, 53, 87, 117, 46, 25, 20, 51, 102, 28, 103, 111, 93, 23, 87, 122, 69, 53, 69, 113, 73, 126, 80, 58, 71, 23, 13, 6, 25, 59, 108, 20, 120, 74, 109, 63, 88, 12, 27, 82, 4, 6, 2, 26, 10, 19, 6, 114, 102, 24, 99, 19, 120, 66, 106, 98, 29, 47, 16, 110, 122, 36, 55, 87, 46, 86, 47, 88, 15, 71, 33, 95, 36, 106, 104, Byte.MAX_VALUE, 82, 75, 99, 111, 60, 68, 42, 54, 42, 86, 28, 16, 108, 94, 41, 82, 69, 98, 24, 2, 118, 31, 69, 42, 125, 42, 69, 119, 59, 17, 10, 11, 95, 8, 18, 12, 22, 22, 87, 11, 96, 79, 112, 78, 77, 71, 119, 7, 106, 29, 28, 48, 99, 124, 55, 46, 115, 40, 98, 75, 79, 72, 2, 69, 121, 53, 112, 34, 32, 43, 72, 93, 38, 71, 60, 60, 99, 29, 23, 120, 0, 107, 30, 88, 16, 40, 121, 14, 78, 77, 67, 115, 100, 64, 75, 75, 125, 69, 22, 87, 117, 105, 44, 26, 118, 88, 116, 42, 81, 66, 40, 1, 22, 39, 97, 18, 98, 58, 91, 91, 81, 43, 71, 97, 66, 49, 76, 121, 86, 42, 65, 2, 15, 31, 30, 59, 105, 25, 126, 10, 107, 121, 90, 78, 28, 64, 1, 28, 4, 31, 12, 58, 4, 116, 97, 8, 102, 31, 126, 122, 108, 63, 31, 68, 23, 83, Byte.MAX_VALUE, 28, 49, 119, 40, 45, 45, 23, 8, 51, 36, 83, 34, 107, 110, 98, 80, 20, 100, 33, 57, 16, 44, 125, 44, 21, 30, 91, 107, 0, 44, 12, 67, 49, 30, 9, 116, 40, 66, 66, 120, 13, 67, 38, 61, 51, 8, 40, 88, 52, 23, 34, 16, 54, 81, 36, 98, 34, 119, 110, 72, 10, 113, 28, 108, 4, 30, 56, 100, 107, 50, 126, 117, 115, 100, 104, 77, 43, 5, 104, 124, 76, 118, 91, 38, 77, 74, 60, 33, 120, 57, 20, 101, 71, 17, 93, 2, 113, 25, 120, 21, 75, Byte.MAX_VALUE, 66, 72, 1, 65, 115, 99, 90, 78, 19, 123, 76, 16, 85, 119, 126, 43, 4, 115, 83, 114, 34, 87, 122, 42, 19, 17, 111, 100, 30, 100, 39, 93, 79, 83, Byte.MAX_VALUE, 64, 4, 71, 110, 74, 112, 80, 53, 67, 15, 8, 126};
                    }

                    private static byte[] cgqnfceqxvthjcs() {
                        return new byte[]{-121, -98, 67, 40, 59, 34, 0, 42, 94, 37};
                    }

                    private static byte[] rukntbtdjtijfbh() {
                        return new byte[]{-121, -100, 65, 40, 54, 51, 11, 56, 92, 50, 22, 61, 23, 41, 86, 37, 101, 83, 115, 108, 76, 9, 124, 19, 109, 27, 29, 60};
                    }

                    private static byte[] wtjbgpoaomyxzuc() {
                        return new byte[]{-124, -102, 68, 9, 56, 17, 12, 10, 89, 2, 21, 8, 23, 3, 84, 100, 102, 36, 118, 59, 74, 40, 118, 45, 105, 33, 26, 22, 101, 57, 48, 118, 114, 105, 97, 104, 73, 124, 4, 1, 126, 19, 113, 32, 35, 26, 78, 117, 32, 123, 59, 22, 98, 67, 20, 13, 6, 123, 24, 69, 23, 102, 120, 113, 77, 46, 69, 113, 98, 20, 76, 75, 124, 68, 21, 77, 115, 63, 42, 83, 113, 11, 117, 125};
                    }

                    private static byte[] fqrgvukysnysvjq() {
                        return new byte[]{Byte.MIN_VALUE, -101, 78, 43, 57, 51, 15, 41, 95, 47, 17, 38, 19, 32, 90, 49, 107, 125, 116, 120};
                    }

                    private static byte[] dbywiimdsyvxbcl() {
                        return new byte[]{-116, -98, 71, 58, 59, 54, 15, 48, 88, 57, 20, 17, 29, 37, 87, 33, 102, 109, 120, 118};
                    }

                    private static byte[] ejzuwcuazbbkwgk() {
                        return new byte[]{-115, -101, 66, 10, 54, 0, 8, 1, 93, 11, 17, 6, 17, 26, 82, 99, 101, 103, 121, 114, 79, 27, 124, 9, 110, 0, 28, 50, 103, 114, 53, 85, 112, 109, 97, 99, 68, 100, 7, 6, 119, 88, 114, 42, 38, 38, 78, 86};
                    }

                    private static byte[] guhrkzkhtrbupzg() {
                        return new byte[]{-121, -97, 68, 20, 59, 4, 1, 1, 88, 4, 22, 26, 23, 31, 87, 102, 107, 88, 119, 88, 73, 41, 118, 62, 106, 41, 23, 121, 100, 82, 51, 69, 114, 40, 98, 69, 68, 72, 5, 50, 125, 68, 113, 55, 32, 51, 67, 85, 33, 67, 56, 41, 98, 110, 23, 15, 11, 94, 25, 99, 20, 71, 120, 87, 78, 12, 72, 33, 99, 60, 79, 72, 124, 75, 22, 66, 126, 115, 43, 31, 114, 14, 117, 103, 81, 19, 35, 87, 17, 101, 101, 90, 99, 111, 91, 79, 90, 126, 64, 54, 70, 113, 77, 60, 86, 2, 74, 36, 8, 40, 26, 30, 104, 93, 126, 59, 96, 79, 93, 42, 24, 125, 0, 56, 4, 49, 7, 23, 3, 34, 101, 53, 103, 63, 126, 120, 103, 101, 24, 44, 19, 27, 126, 73, 49, 54, 35, 33, 42, 106, 12, 114, 37, 11, 34, 59, 101, 55, 87, 22, 96, 41, 56, 40, 44, 97, 39, 21, 25, 64, 111, 4, 45, 27, 67, 112, 21, 125, 115, 83, 70, 62, 121, 60, 67, 122, 54, 30, 15, 8, 92, 17, 22, 102, 16, 25, 90, 21, 101, 67, 115, 85, 73, 79, 113, 117, 103, 74, 25, 122, 96, 59, 51, 43, 117, 118, 111, 100, 74, 99, 1, 8, 125, 13, 118, 11, 45, 24, 77, 109, 37, 117, 56, 85, 101, 100, 26, 108, 5, 117, 29, 91, 20, 2, Byte.MAX_VALUE, 41, 67, 79, 70, 112, 103, 67, 79, 19, 123, 65, 27, 76, 112, 109, 47, 24, 114, 121, 114, 49, 92, 122, 45, 17, 21, 43, 101, 82, 100, 11, 86, 114, 84, 92, 68, 26, 70, 90, 74, 84, 91, 2, 68, 66, 12, 62, 26, 13, 111, 36, 115, 77, 110, 80, 89, 54, 24, 116, 7, 56, 9, 111, 9, 100, 7, 8};
                    }

                    private static byte[] qygbwmkydybkhqz() {
                        return new byte[]{-122, -98, 64, 12, 54, 5, 8, 6, 88, 0, 20, 4, 23, 26, 87, 99, 98, 123, 114, 97, 77, 6, 124, 29, 110, 1, 25, 42, 98, 115, 51, 100, 117, 111, 102, 124, 79, 118, 5, 88, 119, 46, 114, 53, 35, 62, 75, 85, 37, 88, 63, 49};
                    }

                    private static byte[] ckjjlnyldjjirng() {
                        return new byte[]{-125, -102, 70, 12, 62, 0, 11, 4, 92, 5, 16, 2, 23, 18, 82, 96, 96, 111, 119, 125, 75, 11, 116, 19, 109, 14, 29, 2, 102, 105, 51, 107, 112, 121, 100, 104, 74, 60, 3, 84, Byte.MAX_VALUE, 85, 113, 72, 39, 89};
                    }

                    private static byte[] qvgetyseaxhfbpl() {
                        return new byte[]{-124, -106, 66, 24, 57, 52, 11, 39, 95, 40, 21, 34, 17, 55, 85, 101, 97, 114, 112, 119, 74, 66, 112, 18, 104, 1, 29, 58, 99, 110, 48, 99, 116, 96, 96, 100, 78, 100, 2, 29, 126, 8, 119, 91, 34, 59, 73, 71, 38, 93, 59, 29, 100, 64, 21, 73, 1, 4, 30, 125, 23, 91, 126, 72, 76, 24, 66, 56, 100, 5, 76, 87};
                    }

                    private static int rrrjhiummmvgkqhm(int i, int i2) {
                        return i ^ i2;
                    }
                }
