package com.kammoun.donutCore.crates.managers;

import com.kammoun.donutCore.crates.data.PlayerCrates;
import com.kammoun.donutCore.crates.models.CratePlayer;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import lombok.Generated;

public class KeyManager {
    private final DataManager dataManager;
    private final PlayerCrates playerCrates;
    private static int l9hPA0dVW0 = 0;
    private transient int Lw1FVwoW39 = 242828827;
    private static String[] nothing_to_see_here = new String[17];

    public KeyManager(com.kammoun.donutCore.crates.managers.DataManager r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.managers.KeyManager.<init>(com.kammoun.donutCore.crates.managers.DataManager, int):void");
    }

    public CompletableFuture loadPlayerKeys(UUID uuid, int i) {
        int i2 = 1551196014 ^ (1140888371 ^ 114217068);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -170335864) {
            int i3 = 857318827 ^ i2;
            return CompletableFuture.runAsync(()
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.managers.KeyManager.loadPlayerKeys(java.util.UUID, int):java.util.concurrent.CompletableFuture");
        }

        public CompletableFuture savePlayerKeys(UUID uuid, int i) {
            int i2 = 1095222340 ^ (439371433 ^ 114217068);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -305490934) {
                int i3 = 1983181081 ^ i2;
                return CompletableFuture.runAsync(()
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.managers.KeyManager.savePlayerKeys(java.util.UUID, int):java.util.concurrent.CompletableFuture");
            }

            public synchronized boolean consumeKey(UUID uuid, String str, int i) {
                int i2 = 1789471016 ^ (1556957582 ^ 114217068);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2057992623) {
                    i2 = 632152278 ^ i2;
                    CratePlayer player = this.playerCrates.getPlayer(uuid, 720811432);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1472560928) {
                        int i3 = 490305959 ^ i2;
                        if (player.hasKeys(str, (byte) (138291642 ^ i3), 126075169) != (138291643 ^ i3)) {
                            i3 = 1952430990 ^ i3;
                            player.removeKeys(str, (byte) (2086769204 ^ i3), 1844547746);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -485715541) {
                                i3 = 278811108 ^ i3;
                                savePlayerKeys(uuid, 1794484861);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1744707211) {
                                    return (byte) (939143593 ^ (1527116409 ^ i3));
                                }
                            }
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1106333144) {
                            return (byte) (1771783364 ^ (1638231423 ^ i3));
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1106333144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (269328222 ^ i3)) {
                                int i4 = 1347825472 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1289365027 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (555789444 ^ i3)) {
                                    int i5 = 1716950918 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1744707211 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1889956303 ^ i3)) {
                                        int i6 = 1181339462 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -485715541 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1122934683 ^ i3)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        int i7 = 316822428 ^ i3;
                        throw new IllegalAccessException();
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1472560928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1257138531 ^ i2)) {
                        int i8 = 765879251 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2057992623 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1045863255 ^ i2)) {
                            break;
                        }
                    }
                }
                int i9 = 988737309 ^ i2;
                throw new IllegalAccessException("double");
            }

            public void addKeys(UUID uuid, String str, int i, int i2) {
                int i3 = 139558819 ^ (1143630116 ^ 114217068);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1437480794) {
                    int i4 = 1294861495 ^ i3;
                    CratePlayer player = this.playerCrates.getPlayer(uuid, 720811432);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1021186784) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1021186784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (4666672 ^ i4)) {
                                break;
                            }
                        }
                        int i5 = 1186816792 ^ i4;
                        throw new RuntimeException("double");
                    }
                    i3 = 560561250 ^ i4;
                    player.addKeys(str, i, 1611141908);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 932573681) {
                        i3 = 97801437 ^ i3;
                        savePlayerKeys(uuid, 1794484861);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 423057177) {
                            int i6 = 85528924 ^ i3;
                            return;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 423057177 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1860649459 ^ i3)) {
                        int i7 = 2125883109 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 932573681 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1088378569 ^ i3)) {
                            int i8 = 844313554 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1437480794 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1761066001 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
                int i9 = 346475115 ^ i3;
                throw new IllegalAccessException();
            }

            public void setKeys(UUID uuid, String str, int i, int i2) {
                int i3 = 1727821335 ^ (1420876209 ^ 114217068);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1542193583) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1542193583 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1672856592 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 220245592 ^ i3;
                    throw new RuntimeException("double");
                }
                int i5 = 1240423790 ^ i3;
                CratePlayer player = this.playerCrates.getPlayer(uuid, 720811432);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -345434845) {
                    i5 = 1865795825 ^ i5;
                    player.setKeys(str, i, 1557590349);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1832430936) {
                        i5 = 875743636 ^ i5;
                        savePlayerKeys(uuid, 1794484861);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 860954121) {
                            int i6 = 1435407968 ^ i5;
                            return;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -345434845 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1260098739 ^ i5)) {
                        int i7 = 962999035 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1832430936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2047304334 ^ i5)) {
                            int i8 = 488796840 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 860954121 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1653731892 ^ i5)) {
                                break;
                            }
                        }
                    }
                }
                int i9 = 1677847606 ^ i5;
                throw new RuntimeException();
            }

            public int getKeys(UUID uuid, String str, int i) {
                int i2 = 563035484 ^ (192381381 ^ 114217068);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1639147433) {
                    i2 = 2134207407 ^ i2;
                    CratePlayer player = this.playerCrates.getPlayer(uuid, 720811432);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1743242542) {
                        int i3 = 294481476 ^ i2;
                        return player.getKeys(str, 350863605);
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1743242542 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (810136028 ^ i2)) {
                        int i4 = 672037861 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1639147433 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1190463530 ^ i2)) {
                            int i5 = 349260813 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 343099634 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (76350468 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
                int i6 = 1951593446 ^ i2;
                throw new IllegalAccessException();
            }

            public boolean hasKeys(UUID uuid, String str, int i, int i2) {
                int i3 = 934961841 ^ (1462851878 ^ 114217068);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 841965531) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 841965531 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1283013989 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 1256733193 ^ i3;
                    throw new IOException("double");
                }
                int i5 = 705477070 ^ i3;
                CratePlayer player = this.playerCrates.getPlayer(uuid, 720811432);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1649054122) {
                    int i6 = 951117865 ^ i5;
                    return player.hasKeys(str, i, 126075169);
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1479683869 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (98536896 ^ i5)) {
                        int i7 = 612880765 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1649054122 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1357284023 ^ i5)) {
                            break;
                        }
                    }
                }
                int i8 = 2013274719 ^ i5;
                throw new IllegalAccessException();
            }

            public void unloadPlayer(UUID uuid, int i) {
                int i2 = 1115716247 ^ (585968082 ^ 114217068);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 891033931) {
                    i2 = 1920880714 ^ i2;
                    savePlayerKeys(uuid, 1794484861).join();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1494312168) {
                        int i3 = 517140425 ^ i2;
                        this.playerCrates.removePlayer(uuid, 806816820);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1350165840) {
                            int i4 = 262243709 ^ i3;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1350165840 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (921980967 ^ i3)) {
                                break;
                            }
                        }
                        int i5 = 1569165971 ^ i3;
                        throw new IllegalAccessException("double");
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1494312168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1043084837 ^ i2)) {
                        int i6 = 2131763865 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 891033931 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1029990905 ^ i2)) {
                            break;
                        }
                    }
                }
                int i7 = 371378893 ^ i2;
                throw new IllegalAccessException();
            }

            public void saveAll(int r6) {
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.managers.KeyManager.saveAll(int):void");
            }

            @Generated
            public DataManager getDataManager() {
                int i = 171542077 ^ (1602458363 ^ 114217068);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1683610286) {
                    int i2 = 959783651 ^ i;
                    return this.dataManager;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1683610286 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1151603337 ^ i)) {
                        int i3 = 912389268 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1376727627 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (434729214 ^ i)) {
                            break;
                        }
                    }
                }
                int i4 = 452385438 ^ i;
                throw new RuntimeException();
            }

            @Generated
            public PlayerCrates getPlayerCrates() {
                int i = 107017635 ^ (1388557743 ^ 114217068);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1821605118) {
                    int i2 = 37270445 ^ i;
                    return this.playerCrates;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1821605118 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1489497119 ^ i)) {
                        int i3 = 1873102007 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2102845846 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (822827650 ^ i)) {
                            break;
                        }
                    }
                }
                int i4 = 1927583713 ^ i;
                throw new RuntimeException();
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
                l9hPA0dVW0 = (-1082301144) ^ new Random(-8057065485627003921L).nextInt();
            }

            public static String jwvjzsxhxb(byte[] bArr, byte[] bArr2, int i) {
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

            private static byte[] zxrlktwwekbheut() {
                return new byte[]{111, 71, 123, 71, 57, 108, 84, 3, 36, 92, 16, 97, 55, 118, 9, 26, 87, 78, 52, 77, 51, 36, 118, 116, 12, 61, 114, 26, 116, 22, 49, 112, 118, 123, 91, 30, 76, 16, 97};
            }

            private static byte[] psedopuoataknxh() {
                return new byte[]{-96, -117, 72, 58, 0, 27, 102, 125, 18, 45, 33, 6, 4, 10, 48, 8, 101, 58, 2, 43, 2, 88, 69, 0, 53, 47, 64, 88, 66, 78, 0, 34, 69, 59, 98, 73, 126, 80, 87, 4, 118, 35, 116, 101, 85, 31, 49, 101, 106, 4, 80, 83, 69, 120, 35, 32, 124, 84, 123, 66, 21, 101, 71, 64, 4, 53, 40, 47, 32, 97, 65, 101, 72, 95, 39, 94, 34, 108, 89, 83, 74, 53, 10, 27, 109, 117, 22, 78, 38, 62, 6, 32, 58, 90, 110, 35, 6, 28, 5, Byte.MAX_VALUE, 71, 50, 63, 106, 75, 92, 70, 4, 7, 120, 71, 117, 104, 7, 117, 18};
            }

            private static byte[] vhhxbuumsxarkwh() {
                return new byte[]{-96, Byte.MIN_VALUE, 78, 54, 15, 26, 108, 121, 29, 46, 33, 13, 2, 6, 63, 9, 111, 62, 13, 40, 2, 83, 67, 12, 58, 46, 74, 92, 77, 77, 0, 41, 67, 55, 109, 72, 116, 84, 88, 7, 118, 40, 114, 105, 90, 30, 59, 97, 101, 7, 80, 88, 67, 116, 44, 33, 118, 80, 116, 65, 21, 110, 65, 76, 11, 52, 34, 43, 47, 98, 65, 110, 78, 83, 40, 95, 40, 104, 86, 80, 74, 62, 12, 23, 98, 116, 28, 74, 41, 61, 6, 43, 60, 86, 97, 34, 12, 24, 10, 124, 71, 57, 57, 102, 68, 93, 76, 0, 8, 123, 71, 126, 110, 11, 122, 19};
            }

            private static byte[] cedjwmilrfxohhb() {
                return new byte[]{-96, -113, 72, 63, 14, 18, 97, 100, 29, 43, 33, 4, 4, 19, 62, 10, 98, 53, 13, 45, 2, 51, 69, 23, 59, 72, 71, 126, 77, 104, 0, 6, 69, 9, 108, 107, 121, 4, 88, 20, 118, 2, 116, 92, 91, 43, 54, 48, 101, 82, 80, 108, 69, 89, 45, 30, 123, 101, 116, 115, 21, 30, 71, 86, 10, 39, 47, 57, 47, 112, 65, 97, 72, 66, 41, 9, 37, 32, 86, 28, 74, 20, 10, 113, 99, 19, 17, 11, 41, 33, 6, 32, 58, 95, 96, 27, 1, 38, 10, Byte.MAX_VALUE, 71, 39, 63, 32, 69, 10, 65, 73, 8, 39, 71, 53, 104, 112, 123, 67, 84, 52, 126, 60, 118, 96, 95, 17, 52, 61, 105, 4, 88, 83, 71, Byte.MAX_VALUE, 41, 42, 121, 81, 120, 66, 29, 23, 69, 27, 14, 107, 45, 123, 35, 41, 73, 100, 74, 83, 45, 81, 39, 113, 90, 76, 66, 92};
            }

            private static byte[] mjctxssjsegjyir() {
                return new byte[]{-89, Byte.MIN_VALUE, 67, 57, 8, 27, 103, 96, 29, 47, 40, 11, 0, 19, 48, 9, 103, 56, 2, 39, 11, 51, 71, 31, 63, 72, 75, 124, 76, 98, 6, 0, 79, 11, 107, 98, 122, 8, 89, 17, 118, 12, 116, 93, 85, 45, 59, 60, 107, 81, 88, 104, 70, 81, 44, 22, 118, 102, 124, 120, 23, 25, 77, 81, 5, 47, 45, 60, 47, 113, 64, 111, 77, 75, 38, 14, 33, 45, 92, 30, 66, 21, 1, 120, 99, 18, 29, 12, 32, 42, 1, 47, 49, 89, 102, 18, 7, 34, 10, 123, 78, 40, 59, 32, 75, 9, 68, 68, 7, 45, 78, 53, 106, 120, Byte.MAX_VALUE, 67, 88, 54, Byte.MAX_VALUE, 54, 112, 102, 85, 19, 51, 52, 106, 8, 89, 86, 71, 113, 41, 43, 119, 87, 117, 78, 19, 20, 77, 31, 13, 99, 44, 115, 46, 42, 65, 111, 72, 84, 39, 86, 40, 121, 88, 73, 66, 93};
            }

            private static byte[] ybeqzksvldbtdbu() {
                return new byte[]{-88, -114, 66, 20, 9, 58, 102, 67, 28, 58, 38, 59, 15, 41, 58, 93, 110, 24, 13, 15};
            }

            private static byte[] raanpyhlxxhwgla() {
                return new byte[]{-96, -114, 75, 33, 0, 24, 97, 122, 17, 32, 33, 20, 7, 23, 48, 11, 98, 24, 1, 6, 2, 115, 70, 53, 53, 105, 71, 112, 65, 70, 0, 34, 70, 98, 98, 15, 121, 78, 84, 51, 118, 52, 119, 83, 85, 6, 54, 126, 105, 92, 80, 111, 70, 72, 35, 70, 123, 71, 120, 88, 21, 15, 68, 116, 4, 99, 47, 49, 35, 100, 65, 33, 75, 23, 39, 24, 37, 38, 90, 33, 74, 26, 9, 60, 109, 75, 17, 26, 37, 120, 6, 23, 57, 103, 110, 58, 1, 42, 6, 88, 71, 98, 60, 125, 75, 94, 65, 74, 4, 45, 71, 109, 107, 22, 117, 1, 84, 101};
            }

            private static byte[] mhpzftlmvnzlvzi() {
                return new byte[]{-92, -115, 75, 23, 9, 41, 99, 84, 23, 29, 37, 52, 4, 25, 62, 68, 97, 25};
            }

            private static byte[] oycwuxmyedkcbln() {
                return new byte[]{-87, -120, 72, 33, 9, 24, 109, 119, 29, 33, 32, 17, 2, 18, 56, 3, 111, 20, 12, 15, 0, 112, 70, 49, 53, 96, 75, 125, 68, 76, 4, 36, 71, 110, 99, 7, 116, 75, 82, 63, 119, 51, 126, 94, 85, 15, 51, 120, 105, 85, 80, 96, 78, 68, 34, 71, 125, 71, 125, 80, 29, 1, 77, 121, 13, 97, 47, 52, 39, 100, 72, 46, 67, 18, 45, 28, 32, 34, 86, 32, 66, 20, 9, 58, 97, 74, 21, 22, 40, 120, 15, 17, 58, 103, 103, 58, 13, 39, 10, 89, 70, 103, 57, 120, 67, 86, 76, 70, 9, 36, 69, 110, 107, 18, 117, 8, 88, 104};
            }

            private static int qorqeaeyzxgrakjd(int i, int i2) {
                return i2 ^ i;
            }
        }
