package com.kammoun.donutCore.home.managers;

import com.kammoun.donutCore.home.data.DataBaseManager;
import com.kammoun.donutCore.home.models.Home;
import com.kammoun.donutCore.home.models.HomePlayer;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class HomeCacheManager {
    private final DataBaseManager dataBaseManager;
    private final Map<UUID, HomePlayer> cache;
    private static int srL24N1DSX = 0;
    private transient int ytoQBYx83u = 1833095391;
    private static String[] nothing_to_see_here = new String[19];

    public HomeCacheManager(com.kammoun.donutCore.home.data.DataBaseManager r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.managers.HomeCacheManager.<init>(com.kammoun.donutCore.home.data.DataBaseManager, int):void");
    }

    public CompletableFuture loadPlayerAsync(UUID uuid, int i) {
        int i2 = 849481919 ^ (106437570 ^ 1856972013);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -760644478) {
            int i3 = 184419164 ^ i2;
            return CompletableFuture.supplyAsync(() -> {
                int i4 = 1835764548 ^ (1527204056 ^ 1856972013);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -971031670) {
                    i4 = 1799265356 ^ i4;
                    HomePlayer homePlayer = this.dataBaseManager.getHomePlayer(uuid, 1183630265);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1611933207) {
                        i4 = 1297136788 ^ i4;
                        this.cache.put(uuid, homePlayer);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -177324725) {
                            int i5 = 1639537399 ^ i4;
                            return homePlayer;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -177324725 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (860905761 ^ i4)) {
                        int i6 = 488241672 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -971031670 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (609716478 ^ i4)) {
                            int i7 = 734752281 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1611933207 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (827794312 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
                int i8 = 2136492335 ^ i4;
                throw new IllegalAccessException();
            });
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2057738654 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1783948895 ^ i2)) {
                int i4 = 674313987 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -760644478 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2143857264 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 389096850 ^ i2;
        throw new IllegalAccessException();
    }

    public HomePlayer getPlayer(UUID uuid, int i) {
        int i2 = 237854792 ^ (1956594769 ^ 1856972013);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1595406432) {
            int i3 = 68664167 ^ i2;
            return this.cache.get(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1595406432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (38248901 ^ i2)) {
                int i4 = 360946029 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2141856616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (384253048 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2133436589 ^ i2;
        throw new IOException();
    }

    public CompletableFuture addHome(UUID uuid, Home home, int i) {
        int i2 = 1577532012 ^ (711634139 ^ 1856972013);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -703229232) {
            int i3 = 1928801195 ^ i2;
            return CompletableFuture.runAsync(() -> {
                int i4 = 137320707 ^ (1296448999 ^ 1856972013);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1580335177) {
                    int i5 = 1392224967 ^ i4;
                    HomePlayer homePlayer = this.cache.get(uuid);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -907061645) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -907061645 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (298799201 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 1127364118 ^ i5;
                        throw new IOException("double");
                    }
                    int i7 = 1663010994 ^ i5;
                    if (homePlayer == null) {
                        i4 = 1457161354 ^ i7;
                    } else {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -787278880) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -787278880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1307421149 ^ i7)) {
                                    break;
                                }
                            }
                            int i8 = 1195334987 ^ i7;
                            throw new IllegalAccessException("double");
                        }
                        i4 = 551133038 ^ i7;
                        homePlayer.addHome(home, 150807932);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -673191791) {
                            i4 = 1979915236 ^ i4;
                        }
                    }
                    this.dataBaseManager.addHome(uuid, home, 111604560);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1741109170) {
                        int i9 = 1648992085 ^ i4;
                        return;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1741109170 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (580809188 ^ i4)) {
                        int i10 = 12192628 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1972096281 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1105958569 ^ i4)) {
                            int i11 = 611325728 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -673191791 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1969574675 ^ i4)) {
                                int i12 = 88877861 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1580335177 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (173350066 ^ i4)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                int i13 = 1662853028 ^ i4;
                throw new IllegalAccessException();
            });
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -703229232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1615063403 ^ i2)) {
                int i4 = 894094767 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1101844363 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (975346093 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2091503703 ^ i2;
        throw new IOException();
    }

    public CompletableFuture removeHome(UUID uuid, String str, int i) {
        int i2 = 1693114383 ^ (1230730449 ^ 1856972013);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 418742682) {
            int i3 = 1046488469 ^ i2;
            return CompletableFuture.runAsync(()
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.managers.HomeCacheManager.removeHome(java.util.UUID, java.lang.String, int):java.util.concurrent.CompletableFuture");
        }

        public CompletableFuture unloadPlayer(UUID uuid, int i) {
            int i2 = 411490571 ^ (168702471 ^ 1856972013);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -515997941) {
                int i3 = 658891862 ^ i2;
                return CompletableFuture.runAsync(() -> {
                    int i4 = 1029202914 ^ (1350465801 ^ 1856972013);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 474607664) {
                        i4 = 295472196 ^ i4;
                        this.cache.remove(uuid);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1867673072) {
                            int i5 = 1112173977 ^ i4;
                            return;
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2097217830 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1114125882 ^ i4)) {
                            int i6 = 1033353212 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 474607664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (768107594 ^ i4)) {
                                int i7 = 1854659262 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1867673072 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1073703538 ^ i4)) {
                                    break;
                                }
                            }
                        }
                    }
                    int i8 = 642103428 ^ i4;
                    throw new RuntimeException();
                });
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -515997941 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1624953892 ^ i2)) {
                    int i4 = 768370390 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -619618886 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1920328392 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1466955679 ^ i2;
            throw new IOException();
        }

        public boolean isPlayerLoaded(UUID uuid) {
            int i = 1994654464 ^ (2032059424 ^ 1856972013);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 179248747) {
                int i2 = 61175802 ^ i;
                return this.cache.containsKey(uuid);
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 179248747 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (335074093 ^ i)) {
                    int i3 = 1604491721 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 394568123 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1051480685 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 68962663 ^ i;
            throw new IOException();
        }

        public void clearCache(int i) {
            int i2 = 1727791141 ^ (1428889125 ^ 1856972013);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -339617942) {
                i2 = 1586195199 ^ i2;
                this.cache.clear();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 530219152) {
                    int i3 = 1475187321 ^ i2;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 530219152 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (436003414 ^ i2)) {
                    int i4 = 846942544 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -339617942 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1168525244 ^ i2)) {
                        int i5 = 1593293511 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1594485926 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (955802036 ^ i2)) {
                            break;
                        }
                    }
                }
            }
            int i6 = 1817076077 ^ i2;
            throw new IOException();
        }

        public void reloadOnlinePlayers(int r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.managers.HomeCacheManager.reloadOnlinePlayers(int):void");
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
            srL24N1DSX = (-1673771623) ^ new Random(6004018988754582078L).nextInt();
        }

        public static String mzkbphinlk(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] iqpdqsnernzrxqp() {
            return new byte[]{90, 28, 22, 121, 70, 96, 67, 111, 85, 70, 119, 46, 112, 41, 79, 107, 24, 9, 93, 69, 91, 13, 86, 18, 33, 59, 68, 33, 39};
        }

        private static int eteprfxnvydrddot(int i, int i2) {
            return i2 ^ i;
        }
    }
