package com.kammoun.donutCore.mythictools.manager;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.mythictools.MythicPlugin;
import com.kammoun.utils.nbtapi.NBTItem;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SelfDestructManager {
    private final MythicPlugin plugin;
    private final Map<UUID, Map<Integer, Long>> playerTimedItems;
    private SchedulerUtil.Task updateTask;
    private static final long UPDATE_INTERVAL_TICKS = 1200;
    private static int jCyMpm6IUq = 0;
    private transient int IiWZ7DllIu = 525029513;
    private static String[] nothing_to_see_here = new String[13];

    public SelfDestructManager(MythicPlugin mythicPlugin, int i) {
        xpokzbqqdiljayjn(924824399 ^ 981282069, 1924011442);
        int parseInt = 94849670 ^ (1939423766 ^ Integer.parseInt("166888312"));
        this.IiWZ7DllIu = 525029513 ^ jCyMpm6IUq;
        int xpokzbqqdiljayjn = 1180587757 ^ xpokzbqqdiljayjn(parseInt, 583685920);
        this.playerTimedItems = new ConcurrentHashMap();
        this.plugin = mythicPlugin;
        startUpdateTask(1188368379);
        int i2 = 1183020771 ^ (585426351 ^ (947021269 ^ xpokzbqqdiljayjn));
    }

    private void startUpdateTask(int i) {
        int i2 = 278872517 ^ (430886345 ^ 843423078);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -610235567) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1278034923 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1241768437 ^ i2)) {
                    int i3 = 1595308620 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -610235567 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1964098153 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 348602097 ^ i2;
            throw new IOException();
        }
        int i5 = 850437497 ^ i2;
        this.updateTask = SchedulerUtil.runTimer(() -> {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.manager.SelfDestructManager.lambda$startUpdateTask$0():void");
        }, 0L, UPDATE_INTERVAL_TICKS, 2041710047);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1311088792) {
            int i6 = 1614879854 ^ i5;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1311088792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (627915061 ^ i5)) {
                break;
            }
        }
        int i7 = 722213781 ^ i5;
        throw new RuntimeException("double");
    }

    public void startDelayedTimer(ItemStack itemStack, int i) {
        int i2 = 1497461159 ^ (1510388944 ^ 843423078);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2012036983) {
            int i3 = 1514884930 ^ i2;
            if (itemStack == null) {
                xpokzbqqdiljayjn(i3, 402451113);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1514715803) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1514715803 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1078863992 ^ i3)) {
                        break;
                    }
                }
                int i4 = 785114803 ^ i3;
                throw new RuntimeException("double");
            }
            int i5 = 1999047556 ^ i3;
            if (itemStack.getType() == Material.AIR) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -479140168) {
                    int i6 = 1625022765 ^ i5;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -479140168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1853710480 ^ i5)) {
                        break;
                    }
                }
                int i7 = 2104256304 ^ i5;
                throw new IllegalAccessException("double");
            }
            int xpokzbqqdiljayjn = xpokzbqqdiljayjn(i5, 1043781633);
            NBTItem nBTItem = new NBTItem(itemStack);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xpokzbqqdiljayjn) != 314975921) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xpokzbqqdiljayjn) == 314975921 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xpokzbqqdiljayjn) == (1124101639 ^ xpokzbqqdiljayjn)) {
                        break;
                    }
                }
                int i8 = 872932137 ^ xpokzbqqdiljayjn;
                throw new IllegalAccessException("double");
            }
            i2 = 812856849 ^ xpokzbqqdiljayjn;
            if (nBTItem.hasKey(iebmhzwohd(hphpecfuauxtoqv(), jahgcjybecndwat(), i2)).booleanValue() != (304870087 ^ i2)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1856006600) {
                    i2 = 20025288 ^ i2;
                    if (nBTItem.getBoolean(iebmhzwohd(ggmghcxysgjjuov(), jahgcjybecndwat(), i2)).booleanValue() != (320503055 ^ i2)) {
                        xpokzbqqdiljayjn(i2, 746438212);
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1730942856) {
                        int i9 = 657926260 ^ i2;
                        long longValue = nBTItem.getLong(iebmhzwohd(vhzhjvvixnqfagp(), jahgcjybecndwat(), i9)).longValue();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -1586844711) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1586844711 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1433810147 ^ i9)) {
                                    break;
                                }
                            }
                            int i10 = 1080947427 ^ i9;
                            throw new IllegalAccessException("double");
                        }
                        int i11 = 84638679 ^ i9;
                        long currentTimeMillis = System.currentTimeMillis() + longValue;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1993247391) {
                            i11 = 1827013688 ^ i11;
                            nBTItem.setLong(iebmhzwohd(bkmigvtwmumulqk(), jahgcjybecndwat(), i11), Long.valueOf(currentTimeMillis));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -301902686) {
                                int i12 = 1739028575 ^ i11;
                                nBTItem.setBoolean(iebmhzwohd(lhzmaftyvfqveig(), jahgcjybecndwat(), i12), Boolean.valueOf((boolean) ((byte) (979849930 ^ i12))));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != -751135143) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -751135143 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1890965566 ^ i12)) {
                                            break;
                                        }
                                    }
                                    int i13 = 696049766 ^ i12;
                                    throw new RuntimeException("double");
                                }
                                i2 = 494940187 ^ i12;
                                itemStack.setItemMeta(nBTItem.getItem().getItemMeta());
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1060836993) {
                                    int i14 = 411083163 ^ i2;
                                    return;
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1993247391 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1093351422 ^ i11)) {
                                int i15 = 2117619577 ^ i11;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -301902686 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (648461556 ^ i11)) {
                                    break;
                                }
                            }
                        }
                        int i16 = 1255472856 ^ i11;
                        throw new IOException("double");
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1730942856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (578007504 ^ i2)) {
                        int i17 = 1601538825 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1856006600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (136737446 ^ i2)) {
                            break;
                        }
                    }
                }
                int i18 = 954120976 ^ i2;
                throw new IllegalAccessException("double");
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 53818442:
                        int i19 = 759968140 ^ i2;
                        return;
                    case 100864086:
                        return;
                    case 1082711356:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2012036983 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (741302494 ^ i2)) {
                int i20 = 581786308 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -441454637 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (295519090 ^ i2)) {
                    int i21 = 352426808 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1060836993 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (339561830 ^ i2)) {
                        int i22 = 237557851 ^ i2;
                        throw new IllegalAccessException();
                    }
                }
            }
        }
    }

    public boolean isTimedItem(ItemStack itemStack) {
        int xpokzbqqdiljayjn;
        int i = 535851362 ^ (1853034889 ^ 843423078);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 506981482) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 506981482 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (621908510 ^ i)) {
                    break;
                }
            }
            int i2 = 279941527 ^ i;
            throw new IOException("double");
        }
        int i3 = 1065328378 ^ i;
        if (itemStack == null) {
            xpokzbqqdiljayjn = xpokzbqqdiljayjn(i3, 504700091);
        } else {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -439673925) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -439673925 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (98129053 ^ i3)) {
                        break;
                    }
                }
                int i4 = 729681964 ^ i3;
                throw new IOException("double");
            }
            int i5 = 47636712 ^ i3;
            if (itemStack.getType() != Material.AIR) {
                int xpokzbqqdiljayjn2 = xpokzbqqdiljayjn(i5, 951899133);
                NBTItem nBTItem = new NBTItem(itemStack);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xpokzbqqdiljayjn2) == 916095762) {
                    return nBTItem.hasKey(iebmhzwohd(xkzclbwodryevmw(), jahgcjybecndwat(), 991317836 ^ xpokzbqqdiljayjn2)).booleanValue();
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xpokzbqqdiljayjn2) == 916095762 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xpokzbqqdiljayjn2) == (1121219107 ^ xpokzbqqdiljayjn2)) {
                        break;
                    }
                }
                int i6 = 1643883800 ^ xpokzbqqdiljayjn2;
                throw new IOException("double");
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -209969925) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -209969925 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2019348639 ^ i5)) {
                        break;
                    }
                }
                int i7 = 1393388645 ^ i5;
                throw new RuntimeException("double");
            }
            xpokzbqqdiljayjn = 482606163 ^ i5;
        }
        return (byte) (1655472076 ^ xpokzbqqdiljayjn);
    }

    public void shutdown(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.manager.SelfDestructManager.shutdown(int):void");
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
        jCyMpm6IUq = 1593471783 ^ new Random(-1080725016724907786L).nextInt();
    }

    public static String iebmhzwohd(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] jahgcjybecndwat() {
        return new byte[]{Byte.MAX_VALUE, 23, 32, 53, 104, Byte.MAX_VALUE, 103, 57, 1, 52, 107, 62, 78, 70, 1, 53, 9, 112, 71, 83, 109, 1, 16, 34, 27, 12, 21, 112, 112, 90, 55, 9, 105, 104, 60, 39, 5, 21, 62, 30, 4, 19, 95, 116, 54, 126, 46, 46, 6, 26, 43, 121, 123, 87, 99, 39, 96, 98, 92, 19, 60, 18, 70, 114, 31, 82, 9, 63, 59, 26, 23, 40, 74, 33, 14, 116, 54, 104, 68, 64, 1, 105, 54, 28, 39, 61, 55, 6, 9, 63, 66, 120, 80, 89, 96};
    }

    private static byte[] flpyilduzbrxzjx() {
        return new byte[]{-80, -47, 25, 108, 81, 51, 84, 117, 55, 100, 90, 110, 119, 17, 56, 95, 58, 44, 113, 14, 92, 84, 41, 119, 34, 64, 38, 45, 70, 6, 6, 111, 80, 47, 5, 102, 54, 76, 8, 84, 53, 94};
    }

    private static byte[] kdihjlidbcjrscv() {
        return new byte[]{-80, -35, 23, 35, 91, 63, 81, 97, 57, 105, 90, 103, 121, 80};
    }

    private static byte[] yanrrheytklqxvl() {
        return new byte[]{-77, -39, 16, 96, 95, 48, 82, 116, 49, 105, 89, 102, 126, 29, 54, 92, 60, 44, 119, 30, 95, 64, 32, 115, 44, 72, 32, 48, 64, 48, 5, 76, 89, 57, 11, 124, 48, 73};
    }

    private static byte[] uhndvupszqorpxz() {
        return new byte[]{-80, -36, 19, 96, 94, 63, 85, 121, 49, 111, 90, 99, 125, 29, 55, 83, 59, 48, 119, 9, 92, 88, 35, Byte.MAX_VALUE, 45, 71, 39, 27, 64, 26, 6, 73, 90, 49, 10, 108, 55, 85, 14, 72, 53, 67};
    }

    private static byte[] ykeztbyayrdeamc() {
        return new byte[]{-77, -39, 16, 110, 89, 50, 83, 121, 56, 107, 89, 102, 126, 19, 48, 94, 61, 33, 126, 28, 95, 64, 32, 125, 42, 74, 33, 61, 73, 50, 5, 76, 89, 55, 13, 126, 49, 68};
    }

    private static byte[] hphpecfuauxtoqv() {
        return new byte[]{-78, -40, 20, 96, 95, 54, 87, 117, 54, 111, 91, 99, 118, 18, 49, 90, 49, 35, 116, 6, 89, 85, 39, 115, 43, 77, 34, 38, 64, 10, 15, 97, 89, 43, 4, 100, 54, 68, 10, 84, 51, 87};
    }

    private static byte[] lhzmaftyvfqveig() {
        return new byte[]{-72, -33, 25, 96, 92, 63, 94, 126, 48, 101, 92, 110, 118, 17, 56, 83, 58, 53, 126, 13, 84, 84, 36, 126, 34, 77, 36, 22, 71, 16, 15, 73, 80, 48, 15, 100, 60, 86, 7, 67, 48, 78};
    }

    private static byte[] ggmghcxysgjjuov() {
        return new byte[]{-78, -38, 16, 109, 88, 53, 87, 120, 52, 111, 89, 103, 123, 21, 50, 90, 60, 49, 116, 8, 93, 89, 32, 116, 43, 75, 32, 28, 66, 25, 2, 77, 90, 57, 9, 96, 54, 83, 14, 78, 52, 68};
    }

    private static byte[] bkmigvtwmumulqk() {
        return new byte[]{-80, -35, 23, 106, 80, 49, 83, 116, 49, 108, 90, 98, 121, 23, 57, 93, 61, 44, 119, 27, 92, 68, 39, 121, 35, 73, 33, 48, 64, 53, 6, 72, 94, 51, 4, 125, 49, 73};
    }

    private static byte[] vhzhjvvixnqfagp() {
        return new byte[]{-71, -33, 21, 107, 80, 48, 85, 126, 52, 100, 92, 98, 125, 29, 55, 88, 58, 32, Byte.MAX_VALUE, 28, 88, 66, 40, 125, 41, 77, 32, 49, 71, 48, 4, 69, 95, 51, 15, Byte.MAX_VALUE, 61, 71};
    }

    private static byte[] xkzclbwodryevmw() {
        return new byte[]{-77, -39, 17, 104, 88, 49, 87, 120, 54, 104, 89, 102, Byte.MAX_VALUE, 21, 49, 93, 57, 32, 112, 31, 95, 64, 33, 123, 43, 73, 37, 60, 71, 49, 5, 76, 88, 49, 12, 125, 53, 69};
    }

    private static int xpokzbqqdiljayjn(int i, int i2) {
        return i ^ i2;
    }
}
