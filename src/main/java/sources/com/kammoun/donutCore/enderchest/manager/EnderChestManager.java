package com.kammoun.donutCore.enderchest.manager;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.enderchest.CustomEnderChest;
import com.kammoun.donutCore.enderchest.manager.DataManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class EnderChestManager {
    private final CustomEnderChest plugin;
    private final ConcurrentHashMap<UUID, Inventory> openInventories;
    private final ConcurrentHashMap<UUID, UUID> viewingOthers;
    private static int pMxxTdlV2d = 0;
    private transient int JmSeIKjtWE = 1485252484;
    private static byte[] kjxanmfvqa;
    private static String[] nothing_to_see_here = new String[13];

    public EnderChestManager(com.kammoun.donutCore.enderchest.CustomEnderChest r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.manager.EnderChestManager.<init>(com.kammoun.donutCore.enderchest.CustomEnderChest, int):void");
    }

    public int getPlayerEnderChestSize(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.manager.EnderChestManager.getPlayerEnderChestSize(org.bukkit.entity.Player, int):int");
    }

    public void openEnderChest(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.manager.EnderChestManager.openEnderChest(org.bukkit.entity.Player, int):void");
    }

    public void openEnderChestForAdmin(Player player, UUID uuid, String str, int i) {
        int i2 = 202816292 ^ (899993603 ^ 2022433299);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 164383138) {
            int i3 = 1893748880 ^ i2;
            if (this.plugin.getDataManager(1988742499).isSaving(uuid, 458948791) != (836360612 ^ i3)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1899049695) {
                    int i4 = 1238159563 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1899049695 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1186959312 ^ i3)) {
                        break;
                    }
                }
                int i5 = 336764212 ^ i3;
                throw new IllegalAccessException("double");
            }
            i2 = uyfooderqqblgrvj(i3, 1090323726);
            this.plugin.getDataManager(1988742499).loadData(uuid, str, 337487360).thenAccept(enderChestData -> {
                int i6 = 868706416 ^ (1111143266 ^ 2022433299);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1269942280) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1269942280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (564619660 ^ i6)) {
                            int i7 = 1857271011 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1134806774 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2043467580 ^ i6)) {
                                break;
                            }
                        }
                    }
                    int i8 = 26257555 ^ i6;
                    throw new IOException();
                }
                int i9 = 1411393373 ^ i6;
                SchedulerUtil.run(() -> {
                    int i10 = 1728343578 ^ (139837127 ^ 2022433299);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1093560720) {
                        int i11 = 564829256 ^ i10;
                        if (player.isOnline() == (913354374 ^ i11)) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1283099599) {
                                int i12 = 603309729 ^ i11;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1283099599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1233760979 ^ i11)) {
                                    break;
                                }
                            }
                            int i13 = 753218556 ^ i11;
                            throw new IOException("double");
                        }
                        i10 = 1535188037 ^ i11;
                        openEnderChestInventory(player, enderChestData, uuid, 307556020);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1871549979) {
                            int i14 = 1440485628 ^ i10;
                            this.viewingOthers.put(player.getUniqueId(), uuid);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1049816583) {
                                int i15 = 337797811 ^ i14;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1049816583 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1229666595 ^ i14)) {
                                    break;
                                }
                            }
                            int i16 = 916161604 ^ i14;
                            throw new RuntimeException("double");
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1406451400 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (2138669645 ^ i10)) {
                            int i17 = 245327496 ^ i10;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1871549979 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (368569225 ^ i10)) {
                                int i18 = 103545954 ^ i10;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1093560720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1510853160 ^ i10)) {
                                    break;
                                }
                            }
                        }
                    }
                    int i19 = 1376732212 ^ i10;
                    throw new RuntimeException();
                }, 1403588420);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -357502238) {
                    int i10 = 182294909 ^ i9;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -357502238 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (347892083 ^ i9)) {
                        break;
                    }
                }
                int i11 = 944781663 ^ i9;
                throw new RuntimeException("double");
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1993939629) {
                int i6 = 1088412829 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1062712453 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2122538830 ^ i2)) {
                int i7 = 500949016 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1993939629 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (31383616 ^ i2)) {
                    int i8 = 113386808 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 164383138 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1861953388 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i9 = 2133451559 ^ i2;
        throw new RuntimeException();
    }

    private void openEnderChestInventory(org.bukkit.entity.Player r6, com.kammoun.donutCore.enderchest.manager.DataManager.EnderChestData r7, java.util.UUID r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.manager.EnderChestManager.openEnderChestInventory(org.bukkit.entity.Player, com.kammoun.donutCore.enderchest.manager.DataManager$EnderChestData, java.util.UUID, int):void");
    }

    private DataManager.EnderChestData resizeEnderChest(DataManager.EnderChestData enderChestData, int i, int i2) {
        int i3 = 1215927317 ^ (1283782988 ^ 2022433299);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -474711469) {
            int i4 = 1466865102 ^ i3;
            ItemStack[] itemStackArr = new ItemStack[i];
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1489032225) {
                i3 = 1078327115 ^ i4;
                int min = Math.min(enderChestData.getItems(1848399915).length, i);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1525640827) {
                    i4 = 1442635592 ^ i3;
                    System.arraycopy(enderChestData.getItems(1848399915), (byte) (1050751623 ^ i4), itemStackArr, (byte) (1050751623 ^ i4), min);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -183921607) {
                        int i5 = 337026732 ^ i4;
                        return new DataManager.EnderChestData(enderChestData.getPlayerUuid(1646410055), enderChestData.getPlayerName(2134399939), itemStackArr, i, 155611005);
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -183921607 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (696626551 ^ i4)) {
                    int i6 = 497877580 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1438474585 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1880144630 ^ i4)) {
                        int i7 = 1480529912 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1489032225 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1152328011 ^ i4)) {
                            break;
                        }
                    }
                }
            }
            int i8 = 1015218030 ^ i4;
            throw new IOException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -474711469 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1733906635 ^ i3)) {
                int i9 = 1926422078 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1525640827 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1169011128 ^ i3)) {
                    break;
                }
            }
        }
        int i10 = 1779365099 ^ i3;
        throw new IllegalAccessException("double");
    }

    public void closeEnderChest(org.bukkit.entity.Player r8, boolean r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.manager.EnderChestManager.closeEnderChest(org.bukkit.entity.Player, boolean, int):void");
    }

    public void closeAllEnderChests(boolean r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.manager.EnderChestManager.closeAllEnderChests(boolean, int):void");
    }

    public boolean isEnderChestOpen(UUID uuid, int i) {
        int i2 = 1830090088 ^ (357448790 ^ 2022433299);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 109664616) {
            int i3 = 528976356 ^ i2;
            return this.openInventories.containsKey(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -88795576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1506602433 ^ i2)) {
                int i4 = 46539979 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 109664616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1268456736 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 475478361 ^ i2;
        throw new IOException();
    }

    public boolean isEnderChestInventory(Inventory inventory, int i) {
        int i2 = 2058504268 ^ (1041475659 ^ 2022433299);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -514846559) {
            int i3 = 173769102 ^ i2;
            return this.openInventories.containsValue(inventory);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -514846559 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (976318286 ^ i2)) {
                int i4 = 810954416 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1282663215 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (612443485 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1067351554 ^ i2;
        throw new IllegalAccessException();
    }

    public void shutdown(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.manager.EnderChestManager.shutdown(int):void");
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
        kjxanmfvqa = nmjvzogxeqaijkb();
        pMxxTdlV2d = (-1787566709) ^ new Random(-1792896032348551419L).nextInt();
    }

    public static String tbajzcrefm(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ kjxanmfvqa[i3 % kjxanmfvqa.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] nmjvzogxeqaijkb() {
        return new byte[]{14, 49, 107, 10, 98, 50, 28, 49, 35, 76, 65, 79, 52, 70, 4, 19, 51, 85, 40, 61, 52, 91, 3, 54, 22, 21, 73, 3, 46, 67, 13, 14, 21, 9, 89, 100, 20, 73, 85, 98, 19, 31, 123, 82, 10, 85, 113, 109, 73, 14, 120, 6, 83, 28, 42, 113, 103, 84, 36, 102, 40, 2, 108, 61, 84, 67, 20, 63, 68, 69, 3, 94, 10, 78, 54, 95, 77, 77, 78, 11, 61, 126, 31, 28, 109, 93, 52, 43, 125, 63, 41, 52, 62, 48, 84, 109, 120, 19, 44, 49, 125, 41, 110, 101, 98, 32, Byte.MAX_VALUE, 24, 42, 10, 125, 13, 77, 52, 20, 34, 58, 110, 52};
    }

    private static byte[] bpkuqstcwvazvko() {
        return new byte[]{-59, -2, 93, 72, 84, 123, 41, 104, 21, 24, 113, 0, 13, 21, 61, 84, 6, 30};
    }

    private static int uyfooderqqblgrvj(int i, int i2) {
        return i ^ i2;
    }
}
