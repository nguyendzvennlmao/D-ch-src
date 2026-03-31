package com.kammoun.donutCore.spawner.database;

import com.kammoun.donutCore.api.database.SqliteHelper;
import com.kammoun.donutCore.spawner.manager.PlacedSpawnerManager;
import com.kammoun.donutCore.spawner.models.PlacedSpawner;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Random;
import org.bukkit.Location;

public class SpawnerDatabase extends SqliteHelper {

    private static int f1065uZ57ySVjC = 0;
    private transient int WC4DDYSk5t = 457652544;
    private static String dkugfeqlqq;
    private static String[] nothing_to_see_here = new String[15];

    public SpawnerDatabase(com.kammoun.donutCore.api.module.DonutModule r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.database.SpawnerDatabase.<init>(com.kammoun.donutCore.api.module.DonutModule, int):void");
    }

    @Override
    public void onCreate(java.sql.Connection r6, int r7) throws java.sql.SQLException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.database.SpawnerDatabase.onCreate(java.sql.Connection, int):void");
    }

    public void saveSpawner(com.kammoun.donutCore.spawner.models.PlacedSpawner r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.database.SpawnerDatabase.saveSpawner(com.kammoun.donutCore.spawner.models.PlacedSpawner, int):void");
    }

    private void saveStorageWithConnection(java.sql.Connection r6, int r7, java.util.Map r8, int r9) throws java.sql.SQLException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.database.SpawnerDatabase.saveStorageWithConnection(java.sql.Connection, int, java.util.Map, int):void");
    }

    public void loadSpawners(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.database.SpawnerDatabase.loadSpawners(int):void");
    }

    private java.util.Map loadStorageWithConnection(java.sql.Connection r6, int r7, int r8) throws java.sql.SQLException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.database.SpawnerDatabase.loadStorageWithConnection(java.sql.Connection, int, int):java.util.Map");
    }

    public void deleteSpawner(org.bukkit.Location r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.database.SpawnerDatabase.deleteSpawner(org.bukkit.Location, int):void");
    }

    private int getSpawnerIdFromConnection(java.sql.Connection r6, org.bukkit.Location r7, int r8) throws java.sql.SQLException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.database.SpawnerDatabase.getSpawnerIdFromConnection(java.sql.Connection, org.bukkit.Location, int):int");
    }

    private String locationToKey(Location location, int i) {
        int i2 = 1448393960 ^ (1427945964 ^ 1293691060);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1923181954) {
            int i3 = 875957445 ^ i2;
            String name = location.getWorld().getName();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -753857621) {
                int i4 = 937745800 ^ i3;
                int blockX = location.getBlockX();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1815603178) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1815603178 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1657925716 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 187554007 ^ i4;
                    throw new IOException("double");
                }
                i3 = 1539091663 ^ i4;
                int blockY = location.getBlockY();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1311604336) {
                    i2 = 1152527548 ^ i3;
                    String str = name + ":" + blockX + ":" + blockY + ":" + location.getBlockZ();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1807489934) {
                        int i6 = 1318400886 ^ i2;
                        return str;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1311604336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1097585530 ^ i3)) {
                    int i7 = 1489664490 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -753857621 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1027717936 ^ i3)) {
                        break;
                    }
                }
            }
            int i8 = 1047617286 ^ i3;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1923181954 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1226830547 ^ i2)) {
                int i9 = 1235352493 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -521502784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (250057056 ^ i2)) {
                    int i10 = 640894358 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1807489934 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1581662602 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i11 = 1559421883 ^ i2;
        throw new IllegalAccessException();
    }

    public void saveAll(int i) {
        int i2;
        int i3 = 1236767341 ^ (862575146 ^ 1293691060);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1106049127) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1106049127 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2094118811 ^ i3)) {
                    break;
                }
            }
            int i4 = 524571101 ^ i3;
            throw new IllegalAccessException("double");
        }
        int i5 = 1588405131 ^ i3;
        Iterator it = PlacedSpawnerManager.getInstance(1417101256).getAllSpawners(2004846093).iterator();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1266293699) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1266293699 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (967933753 ^ i5)) {
                    break;
                }
            }
            int i6 = 601275000 ^ i5;
            throw new IllegalAccessException("double");
        }
        int i7 = 1079938632;
        while (true) {
            int i8 = i7 ^ i5;
            if (it.hasNext() == (691129648 ^ i8)) {
                int i9 = 1729349323 ^ i8;
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1234069889) {
                i5 = 1322186637 ^ i8;
                PlacedSpawner placedSpawner = (PlacedSpawner) it.next();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1073337835) {
                    i2 = 2113500978 ^ i5;
                    saveSpawner(placedSpawner, 1371056896);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -802001800) {
                        i2 = 1069988609 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 772256881) {
                            int pnmkqdhdbxlancrk = pnmkqdhdbxlancrk(i2, 320733597);
                            try {
                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(pnmkqdhdbxlancrk) == 173000810) {
                                    throw new IllegalAccessException();
                                }
                                throw null;
                            } catch (IllegalAccessException e) {
                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                    case -1225279335:
                                        i5 = 941319294 ^ pnmkqdhdbxlancrk;
                                        break;
                                    case -158957231:
                                        i5 = 806699847 ^ pnmkqdhdbxlancrk;
                                        break;
                                    default:
                                        throw new IOException("Error in hash");
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1982634856) {
                                    i7 = 670326365;
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1225279335 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1091569139 ^ i5)) {
                                            int i10 = 1212357759 ^ i5;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1982634856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1858853377 ^ i5)) {
                                                int i11 = 585666113 ^ i5;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1073337835 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (167489595 ^ i5)) {
                                                    int i12 = 813839394 ^ i5;
                                                    throw new IllegalAccessException("double");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1234069889 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1057988978 ^ i8)) {
                        int i13 = 1420935745 ^ i8;
                        throw new IllegalAccessException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -802001800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (396141265 ^ i2)) {
                int i14 = 419854578 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -158957231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (590881215 ^ i2)) {
                    int i15 = 1454738795 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 772256881 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1904186143 ^ i2)) {
                        int i16 = 2035200123 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1896898522 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (798334131 ^ i2)) {
                            int i17 = 1284230453 ^ i2;
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
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
        dkugfeqlqq = ByteBuffer.wrap(lzkvdqpcakpalrf()).asCharBuffer().toString();
        f1065uZ57ySVjC = (-416946097) ^ new Random(-9689098070091561L).nextInt();
    }

    public static String ilfpnuncxc(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = dkugfeqlqq.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] epgtvqzqdgcozwy() {
        return new byte[]{0, 0, 0, -35, 0, 0, 0, 0};
    }

    private static byte[] ahmyhsdccxwmuxh() {
        return new byte[]{0, 0, 1, 86, 0, 0, 0, -35};
    }

    private static byte[] ohogdjonumekxhz() {
        return new byte[]{0, 0, 0, -86, 0, 0, 2, 51};
    }

    private static byte[] rlbsipbyjspjwhs() {
        return new byte[]{0, 0, 0, 48, 0, 0, 2, -35};
    }

    private static byte[] nbihfomkwggosov() {
        return new byte[]{0, 0, 0, 75, 0, 0, 3, 13};
    }

    private static byte[] cvtokgprxegwjuu() {
        return new byte[]{0, 0, 0, 2, 0, 0, 3, 88};
    }

    private static byte[] ueuwpimbpyfvpvp() {
        return new byte[]{0, 0, 0, 15, 0, 0, 3, 90};
    }

    private static byte[] arexiotqkxkkhaz() {
        return new byte[]{0, 0, 0, 10, 0, 0, 3, 105};
    }

    private static byte[] orjiidhxhkyhpsm() {
        return new byte[]{0, 0, 0, 5, 0, 0, 3, 115};
    }

    private static byte[] pqabxuxzbmigtoj() {
        return new byte[]{0, 0, 0, 1, 0, 0, 3, 120};
    }

    private static byte[] uubxvjubynflxmz() {
        return new byte[]{0, 0, 0, 12, 0, 0, 3, 121};
    }

    private static byte[] afnkgywwaojwefv() {
        return new byte[]{0, 0, 0, 1, 0, 0, 3, -123};
    }

    private static byte[] ozmuqykxhyfivke() {
        return new byte[]{0, 0, 0, 12, 0, 0, 3, -122};
    }

    private static byte[] mamdguycystwpfp() {
        return new byte[]{0, 0, 0, 10, 0, 0, 3, -110};
    }

    private static byte[] rqdptwtjoukvbcu() {
        return new byte[]{0, 0, 0, 22, 0, 0, 3, -100};
    }

    private static byte[] pyxljojqsqjuntj() {
        return new byte[]{0, 0, 0, 1, 0, 0, 3, -78};
    }

    private static byte[] ufouivieijmxtlp() {
        return new byte[]{0, 0, 0, 6, 0, 0, 3, -77};
    }

    private static byte[] pdjrpexciwzhkpv() {
        return new byte[]{0, 0, 0, 8, 0, 0, 3, -71};
    }

    private static byte[] zioljtptmjedlyc() {
        return new byte[]{0, 0, 0, 8, 0, 0, 3, -63};
    }

    private static byte[] kkantvrzdaawhky() {
        return new byte[]{0, 0, 0, 65, 0, 0, 3, -55};
    }

    private static byte[] lzonbjsbmnrjzdf() {
        return new byte[]{0, 0, 0, 33, 0, 0, 4, 10};
    }

    private static byte[] sikmhzyeunlhqpj() {
        return new byte[]{0, 0, 0, 2, 0, 0, 4, 43};
    }

    private static byte[] amcwaeynrdglfkz() {
        return new byte[]{0, 0, 0, 69, 0, 0, 4, 45};
    }

    private static byte[] lzkvdqpcakpalrf() {
        return new byte[]{50, 115, 53, 103, 56, 116, 48, 121, 55, 108, 50, 117, 53, 21, 56, 101, 48, 121, 55, 122, 50, 124, 53, 112, 56, 17, 48, 113, 55, 126, 50, 16, 53, 123, 56, 126, 48, 108, 55, 24, 50, 117, 53, 109, 56, 120, 48, 107, 55, 108, 50, 99, 53, 21, 56, 66, 48, 72, 55, 89, 50, 71, 53, 91, 56, 84, 48, 74, 55, 103, 50, 67, 53, 65, 56, 94, 48, 74, 55, 89, 50, 87, 53, 80, 56, 17, 48, 16, 55, 75, 50, 64, 53, 84, 56, 70, 48, 86, 55, 93, 50, 66, 53, 106, 56, 88, 48, 92, 55, 24, 50, 121, 53, 123, 56, 101, 48, 125, 55, Byte.MAX_VALUE, 50, 117, 53, 103, 56, 17, 48, 118, 55, 119, 50, 100, 53, 21, 56, Byte.MAX_VALUE, 48, 109, 55, 116, 50, 124, 53, 25, 56, 92, 48, 89, 55, 76, 50, 85, 53, 71, 56, 88, 48, 89, 55, 84, 50, 16, 53, 97, 56, 116, 48, 96, 55, 108, 50, 16, 53, 123, 56, 126, 48, 108, 55, 24, 50, 126, 53, 96, 56, 125, 48, 116, 55, 20, 50, 81, 53, 88, 56, 94, 48, 77, 55, 86, 50, 68, 53, 21, 56, 120, 48, 118, 55, 108, 50, 117, 53, 114, 56, 116, 48, 106, 55, 24, 50, 126, 53, 122, 56, 101, 48, 24, 55, 118, 50, 101, 53, 121, 56, 125, 48, 20, 55, 104, 50, 98, 53, 124, 56, 124, 48, 121, 55, 106, 50, 105, 53, 21, 56, 122, 48, 125, 55, 97, 50, 16, 53, 29, 56, 66, 48, 72, 55, 89, 50, 71, 53, 91, 56, 84, 48, 74, 55, 103, 50, 89, 53, 81, 56, 29, 48, 24, 55, 85, 50, 81, 53, 65, 56, 84, 48, 74, 55, 81, 50, 81, 53, 89, 56, 24, 48, 20, 55, 126, 50, Byte.MAX_VALUE, 53, 103, 56, 116, 48, 113, 55, Byte.MAX_VALUE, 50, 126, 53, 21, 56, 122, 48, 125, 55, 97, 50, 16, 53, 29, 56, 66, 48, 72, 55, 89, 50, 71, 53, 91, 56, 84, 48, 74, 55, 103, 50, 89, 53, 81, 56, 24, 48, 24, 55, 106, 50, 117, 53, 115, 56, 116, 48, 106, 55, 125, 50, 126, 53, 118, 56, 116, 48, 107, 55, 24, 50, 67, 53, 69, 56, 80, 48, 79, 55, 86, 50, 85, 53, 71, 56, 66, 48, 16, 55, 81, 50, 84, 53, 28, 56, 17, 48, 119, 55, 118, 50, 16, 53, 113, 56, 116, 48, 116, 55, 125, 50, 100, 53, 112, 56, 17, 48, 123, 55, 121, 50, 99, 53, 118, 56, 112, 48, 124, 55, 125, 50, 25, 49, 123, 53, 99, 56, 114, 54, 117, 49, 101, 56, 112, 49, 24, 55, 98, 52, 112, 49, 122, 53, 125, 56, 114, 54, 20, 49, 120, 56, 115, 49, 24, 55, 120, 52, 126, 49, 108, 53, 17, 56, 114, 54, 108, 49, 120, 56, 102, 49, 108, 55, 101, 52, 17, 49, 75, 53, 65, 56, 86, 54, 67, 49, 95, 56, 80, 49, 74, 55, 69, 52, 17, 49, 16, 53, 88, 56, 83, 54, 20, 49, 120, 56, 123, 49, 108, 55, 115, 52, 118, 49, 125, 53, 99, 56, 23, 54, 100, 49, 99, 56, 124, 49, 117, 55, 119, 52, 99, 49, 97, 53, 17, 56, 124, 54, 113, 49, 104, 56, 21, 49, 121, 55, 99, 52, 101, 49, 119, 53, 120, 56, 121, 54, 119, 49, 99, 56, 112, 49, 117, 55, 115, 52, Byte.MAX_VALUE, 49, 108, 53, 29, 56, 64, 54, 91, 49, 67, 56, 89, 49, 92, 55, 22, 52, 101, 49, 125, 53, 105, 56, 99, 54, 20, 49, Byte.MAX_VALUE, 56, 122, 49, 108, 55, 22, 52, Byte.MAX_VALUE, 49, 109, 53, 125, 56, 123, 54, 24, 49, 73, 56, 21, 49, 113, 55, 120, 52, 101, 49, 125, 53, 118, 56, 114, 54, 102, 49, 17, 56, 123, 49, 119, 55, 98, 52, 17, 49, 118, 53, 100, 56, 123, 54, 120, 49, 29, 56, 76, 49, 24, 55, Byte.MAX_VALUE, 52, Byte.MAX_VALUE, 49, 108, 53, 116, 56, 112, 54, 113, 49, 99, 56, 21, 49, 118, 55, 121, 52, 101, 49, 24, 53, Byte.MAX_VALUE, 56, 98, 54, 120, 49, 125, 56, 25, 49, 66, 55, 22, 52, 120, 49, 118, 53, 101, 56, 114, 54, 115, 49, 116, 56, 103, 49, 24, 55, 120, 52, 126, 49, 108, 53, 17, 56, 121, 54, 97, 49, 125, 56, 121, 49, 20, 55, 69, 52, 65, 49, 89, 53, 70, 56, 89, 54, 81, 49, 67, 56, 106, 49, 76, 55, 79, 52, 65, 49, 93, 53, 17, 56, 99, 54, 113, 49, 105, 56, 97, 49, 24, 55, 120, 52, 126, 49, 108, 53, 17, 56, 121, 54, 97, 49, 125, 56, 121, 49, 20, 55, 69, 52, 69, 49, 89, 53, 82, 56, 92, 54, 107, 49, 80, 56, 88, 49, 87, 55, 67, 52, 95, 49, 76, 53, 17, 56, 126, 54, 122, 49, 101, 56, 112, 49, Byte.MAX_VALUE, 55, 115, 52, 99, 49, 24, 53, 117, 56, 114, 54, 114, 49, 112, 56, 96, 49, 116, 55, 98, 52, 17, 49, 9, 53, 29, 56, 84, 54, 65, 49, 67, 56, 71, 49, 93, 55, 88, 52, 69, 49, 103, 53, 73, 56, 71, 54, 20, 49, 120, 56, 123, 49, 108, 55, 115, 52, 118, 49, 125, 53, 99, 56, 23, 54, 112, 49, 116, 56, 115, 49, 121, 55, 99, 52, 125, 49, 108, 53, 17, 56, 7, 54, 24, 49, 82, 56, 64, 49, 74, 55, 68, 52, 84, 49, 86, 53, 69, 56, 104, 54, 93, 49, 69, 56, 80, 49, 85, 55, 69, 52, 17, 49, 113, 53, Byte.MAX_VALUE, 56, 99, 54, 113, 49, 118, 56, 112, 49, 106, 55, 22, 52, 117, 49, 125, 53, 119, 56, 118, 54, 97, 49, 125, 56, 97, 49, 24, 55, 6, 52, 29, 49, 87, 53, 70, 56, 89, 54, 81, 49, 67, 56, 106, 49, 77, 55, 67, 52, 88, 
        49, 92, 53, 17, 56, 99, 54, 113, 49, 105, 56, 97, 49, 20, 55, 90, 52, 80, 49, 75, 53, 69, 56, 104, 54, 71, 49, 65, 56, 84, 49, 79, 55, 88, 52, 110, 49, 76, 53, 88, 56, 90, 54, 81, 49, 17, 56, 119, 49, 113, 55, 113, 52, 120, 49, 118, 53, 101, 56, 23, 54, 112, 49, 116, 56, 115, 49, 121, 55, 99, 52, 125, 49, 108, 53, 17, 56, 7, 54, 24, 49, 100, 56, 123, 49, 113, 55, 103, 52, 100, 49, 125, 53, 25, 56, 64, 54, 91, 49, 67, 56, 89, 49, 92, 55, 26, 52, 17, 49, 64, 53, 29, 56, 23, 54, 77, 49, 29, 56, 21, 49, 66, 55, 31, 52, 24, 52, 126, 51, 120, 51, 101, 48, 114, 50, 102, 55, 103, 54, 19, 54, Byte.MAX_VALUE, 55, 96, 52, 23, 51, 100, 51, 115, 48, 103, 50, 120, 55, 114, 54, 112, 54, 117, 55, 18, 52, 126, 51, 120, 51, 98, 48, 120, 50, 20, 55, 64, 54, 67, 54, 81, 55, 69, 52, 89, 51, 83, 51, 68, 48, 68, 50, 20, 55, 27, 54, 68, 54, 95, 55, 64, 52, 91, 51, 82, 51, 26, 48, 23, 50, 76, 55, 31, 54, 19, 54, 73, 55, 30, 52, 23, 51, 76, 51, 26, 48, 23, 50, 71, 55, 67, 54, 82, 54, 71, 55, 92, 52, 82, 51, 68, 51, 105, 48, 67, 50, 77, 55, 67, 54, 86, 54, 28, 55, 18, 52, 68, 51, 66, 51, 87, 48, 84, 50, 95, 55, 108, 54, 82, 54, 93, 55, 93, 52, 66, 51, 88, 51, 66, 48, 27, 50, 20, 55, 80, 54, 70, 54, 66, 55, 64, 52, 82, 51, 88, 51, 66, 48, 104, 50, 76, 55, 67, 54, 31, 54, 16, 55, 81, 52, 66, 51, 68, 51, 68, 48, 82, 50, 90, 55, 71, 54, 108, 54, 89, 55, 70, 52, 82, 51, 91, 51, 69, 48, 27, 50, 20, 55, 92, 54, 68, 54, 94, 55, 87, 52, 69, 51, 105, 51, 67, 48, 66, 50, 93, 55, 87, 54, 31, 54, 16, 55, 94, 52, 86, 51, 69, 51, 66, 48, 104, 50, 71, 55, 67, 54, 82, 54, 71, 55, 92, 52, 104, 51, 66, 51, 95, 48, 90, 50, 81, 55, 26, 54, 19, 54, 102, 55, 115, 52, 123, 51, 99, 51, 115, 48, 100, 50, 20, 55, 27, 54, 12, 54, 28, 55, 18, 52, 8, 51, 26, 51, 22, 48, 8, 50, 24, 55, 19, 54, 12, 54, 28, 55, 18, 52, 8, 51, 26, 51, 22, 48, 8, 50, 24, 55, 19, 54, 12, 54, 28, 55, 18, 52, 8, 51, 26, 51, 22, 48, 8, 50, 24, 55, 19, 54, 12, 54, 25, 51, 124, 54, 112, 52, 117, 49, 118, 57, 103, 56, 115, 53, 20, 57, 119, 51, 107, 51, 119, 54, 120, 52, 25, 49, 64, 57, 67, 56, 87, 53, 67, 57, 95, 51, 92, 51, 74, 54, 106, 52, 74, 49, 71, 57, 92, 56, 68, 53, 85, 57, 86, 51, 92, 51, 24, 54, 98, 52, 113, 49, 118, 57, 97, 56, 115, 53, 20, 57, 66, 51, 73, 51, 89, 54, 66, 52, 87, 49, 86, 57, 65, 56, 105, 53, 93, 57, 85, 51, 25, 51, 5, 54, 21, 52, 6, 49, Byte.MAX_VALUE, 50, 123, 48, 96, 55, 112, 55, 97, 49, 98, 50, 21, 48, 122, 55, 123, 55, 103, 49, 121, 50, 21, 48, 64, 55, 69, 55, 82, 49, 65, 50, 91, 48, 86, 55, 71, 55, 108, 49, 69, 50, 65, 48, 92, 55, 71, 55, 82, 49, 81, 50, 80, 48, 19, 55, 29, 55, 64, 49, 70, 50, 84, 48, 68, 55, 91, 55, 86, 49, 68, 50, 106, 48, 90, 55, 81, 55, 31, 49, 22, 50, 88, 48, 82, 55, 65, 55, 86, 49, 68, 50, 92, 48, 82, 55, 89, 55, 31, 49, 22, 50, 84, 48, 94, 55, 90, 55, 70, 49, 88, 50, 65, 48, 26, 55, 21, 55, 101, 49, 119, 50, 121, 48, 102, 55, 112, 55, 96, 49, 22, 50, 29, 48, 12, 55, 25, 55, 19, 49, 9, 50, 25, 48, 19, 55, 10, 55, 26, 57, 95, 49, 93, 49, 89, 51, 82, 57, 71, 52, 64, 57, 104, 49, 70, 51, 67, 57, 85, 52, 67, 57, 89, 49, 106, 51, 71, 57, 93, 52, 89, 57, 82, 49, 80, 51, 76, 57, 75, 54, 74, 49, 85, 49, 93, 51, 77, 57, 102, 54, 64, 49, 64, 49, 67, 56, 94, 50, 67, 49, 85, 53, 85, 53, 75, 52, 65, 54, 71, 54, 82, 53, 80, 48, 95, 50, 105, 51, 87, 51, 88, 51, 95, 52, 71, 54, 93, 54, 71, 49, 78, 55, 65, 52, 68, 49, 89, 50, 66, 56, 89, 50, 81, 52, 67, 56, 109, 53, 76, 55, 75, 52, 68, 49, 93, 56, 88, 48, 68, 56, 93, 50, 83, 50, 74, 55, 111, 51, 77, 51, 71, 54, 91, 56, 83, 53, 101, 52, 112, 50, 124, 49, 124, 55, 118, 54, 96, 53, 18, 48, 27, 57, 23, 53, 112, 52, 103, 50, Byte.MAX_VALUE, 49, 116, 55, 21, 54, 71, 53, 66, 48, 80, 57, 64, 53, 88, 52, 80, 50, 66, 49, 74, 49, 77, 49, 87, 52, 91, 55, 95, 50, 71, 55, 88, 49, 66, 55, 88, 55, 81, 49, 77, 48, 80, 51, 69, 53, 94, 48, 80, 57, 92, 49, 90, 53, 85, 51, 77, 54, 84, 49, 70, 49, 94, 53, 85, 51, 85, 57, 98, 50, 125, 54, 117, 56, 116, 55, 122, 49, 102, 56, 22, 57, 85, 49, 86, 57, 69, 50, 93, 54, 75, 56, 88, 55, 88, 49, 94, 56, 26, 57, 24, 49, 86, 57, 92, 50, 87, 54, 76, 56, 95, 55, 77, 49, 18, 56, 112, 57, 106, 49, 120, 57, 124, 50, 24, 54, 74, 56, 65, 
        55, 88, 49, 69, 56, 88, 57, 93, 49, 69, 57, 110, 50, 75, 54, 77, 56, 94, 55, 75, 49, 83, 56, 81, 57, 93, 49, 23, 57, 102, 50, 112, 54, 124, 56, 99, 55, 124, 49, 18, 56, 69, 57, 72, 49, 86, 57, 70, 50, 86, 54, 92, 56, 67, 55, 102, 49, 91, 56, 82, 57, 24, 49, 10, 57, 17, 50, 7, 55, 115, 50, 114, 52, 121, 53, 114, 52, 99, 55, 119, 55, 20, 53, 115, 55, 102, 55, 120, 50, 122, 52, 21, 53, 68, 52, 71, 55, 83, 55, 67, 53, 91, 55, 81, 55, 69, 50, 68, 52, 21, 53, 96, 52, Byte.MAX_VALUE, 55, 119, 55, 102, 53, 112, 55, 20, 55, 94, 50, 83, 52, 21, 53, 10, 52, 23, 55, 13, 49, 92, 49, 92, 54, 102, 56, 125, 53, 121, 50, 124, 56, 117, 53, 108, 56, 21, 53, 91, 57, 92, 54, 21, 56, 126, 53, 103, 50, 118, 56, 123, 53, 24, 56, 70, 53, 66, 57, 89, 54, 66, 56, 86, 53, 80, 50, 75, 56, 69, 53, 24, 56, 98, 53, 122, 57, 125, 54, 103, 56, 125, 53, 21, 50, 78, 56, 89, 53, 74, 56, 89, 53, 86, 57, 24, 54, 8, 56, 24, 53, 10, 50, 25, 56, 119, 53, 118, 56, 113, 53, 18, 57, 64, 54, 21, 56, 5, 53, 21, 50, 6, 56, 22, 53, 121, 56, 123, 53, 118, 57, 24, 54, 76, 56, 24, 53, 8, 50, 25, 56, 9, 53, 24, 56, 116, 53, 124, 57, 124, 54, 21, 56, 66, 53, 21, 50, 4, 56, 22, 53, 7};
    }

    private static int pnmkqdhdbxlancrk(int i, int i2) {
        return i ^ i2;
    }
}
