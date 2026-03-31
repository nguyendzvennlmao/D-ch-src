package com.kammoun.donutCore.billford.gui;

import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.api.utils.menu.KMenu;
import com.kammoun.donutCore.billford.BillFordPlugin;
import com.kammoun.donutCore.billford.config.BillfordConfig;
import com.kammoun.donutCore.billford.models.BillfordPreset;
import com.kammoun.donutCore.billford.models.enums.Messages;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import org.bukkit.entity.Player;

public class BillfordGui extends KMenu {
    private final BillFordPlugin plugin;
    private final BillfordConfig billfordConfig;
    private BillfordPreset currentPreset;
    private KItem tradeConfirmItem;
    private KItem infoBookItem;
    private KItem fillerItem;
    private List<Integer> FillerSlot;
    private List<Integer> RequiredSlots;
    private static int OUoCp6NmiO = 0;
    private transient int xc24Qp0y6A = 1911928387;
    private static String bpklkgoqap;
    private static String[] nothing_to_see_here = new String[15];

    public BillfordGui(org.bukkit.plugin.java.JavaPlugin r6, com.kammoun.donutCore.billford.BillFordPlugin r7, com.kammoun.donutCore.billford.config.BillfordConfig r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.gui.BillfordGui.<init>(org.bukkit.plugin.java.JavaPlugin, com.kammoun.donutCore.billford.BillFordPlugin, com.kammoun.donutCore.billford.config.BillfordConfig, int):void");
    }

    private void loadGuiItems(int i) {
        int i2 = 829757345 ^ (710734369 ^ 2063290857);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 244687691) {
            i2 = 789806592 ^ i2;
            this.tradeConfirmItem = KItem.fromConfig(this.config.getConfigurationSection(pyfrwzlxss(iojmirvcpbwaxgo(), i2)), 2126963651);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1980650314) {
                i2 = 1063075974 ^ i2;
                this.infoBookItem = KItem.fromConfig(this.config.getConfigurationSection(pyfrwzlxss(oqzzsvnairkztgc(), i2)), 2126963651);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1931192453) {
                    int i3 = 788619410 ^ i2;
                    this.fillerItem = KItem.fromConfig(this.config.getConfigurationSection(pyfrwzlxss(szhuuyoluxnxlsh(), i3)), 2126963651);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -185642006) {
                        int i4 = 655602884 ^ i3;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -185642006 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (364663808 ^ i3)) {
                            break;
                        }
                    }
                    int i5 = 157998300 ^ i3;
                    throw new RuntimeException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1931192453 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1193977245 ^ i2)) {
                int i6 = 10105436 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 244687691 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (838454436 ^ i2)) {
                    int i7 = 1613409448 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -864881205 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (653844422 ^ i2)) {
                        int i8 = 1148112087 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1980650314 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (325785925 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i9 = 346660531 ^ i2;
        throw new RuntimeException();
    }

    @Override
    protected void setMenuItems(java.lang.String[] r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.gui.BillfordGui.setMenuItems(java.lang.String[], int):void");
    }

    private org.bukkit.inventory.ItemStack createInfoBook(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.gui.BillfordGui.createInfoBook(int):org.bukkit.inventory.ItemStack");
    }

    @Override
    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.gui.BillfordGui.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    private void handleTradeConfirm(org.bukkit.entity.Player r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.gui.BillfordGui.handleTradeConfirm(org.bukkit.entity.Player, int):void");
    }

    private boolean hasRequiredItems(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.gui.BillfordGui.hasRequiredItems(org.bukkit.entity.Player, int):boolean");
    }

    private boolean hasItem(org.bukkit.entity.Player r6, org.bukkit.inventory.ItemStack r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.gui.BillfordGui.hasItem(org.bukkit.entity.Player, org.bukkit.inventory.ItemStack, int):boolean");
    }

    private void removeItems(org.bukkit.entity.Player r6, org.bukkit.inventory.ItemStack r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.gui.BillfordGui.removeItems(org.bukkit.entity.Player, org.bukkit.inventory.ItemStack, int):void");
    }

    public void openWithPreset(Player player, BillfordPreset billfordPreset, int i) {
        int i2 = 904373940 ^ (278994447 ^ 2063290857);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -34649454) {
            i2 = 1865298720 ^ i2;
            this.currentPreset = billfordPreset;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2069965935) {
                int i3 = 1225337090 ^ i2;
                if (billfordPreset != null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -858285181) {
                        int i4 = 1095188144 ^ i3;
                        if (billfordPreset.isValid(1446107143) != (954060224 ^ i4)) {
                            i2 = 1576280493 ^ i4;
                            open(player, new String[(byte) (1697246317 ^ i2)], 2057159819);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 693068651) {
                                int i5 = 666901078 ^ i2;
                                return;
                            }
                        } else {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -957452799) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -957452799 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (636171387 ^ i4)) {
                                        int i6 = 1840086631 ^ i4;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 391098842 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (493608556 ^ i4)) {
                                            break;
                                        }
                                    }
                                }
                                int i7 = 1070569931 ^ i4;
                                throw new IllegalAccessException("double");
                            }
                            i3 = 517385615 ^ i4;
                            this.billfordConfig.sendMessage(player, Messages.NO_PRESET_CONFIGURED, 1788561083);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 811270777) {
                                int i8 = 1404793321 ^ i3;
                                return;
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 811270777 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1291111387 ^ i3)) {
                            int i9 = 544539189 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -858285181 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (280592112 ^ i3)) {
                                int i10 = 850793379 ^ i3;
                                throw new RuntimeException("double");
                            }
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                        case 194793011:
                            i3 = 1603375935 ^ i3;
                            break;
                        case 564629484:
                            break;
                        case 958705452:
                        case 2037495471:
                        default:
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1384084173 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1646768637 ^ i3)) {
                                    int i11 = 1968276423 ^ i3;
                                    throw new RuntimeException("double");
                                }
                            }
                            break;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 693068651 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (732815252 ^ i2)) {
                int i12 = 2041458377 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -34649454 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (542098590 ^ i2)) {
                    int i13 = 1082277477 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2069965935 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1496200634 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i14 = 96501572 ^ i2;
        throw new IllegalAccessException();
    }

    public void reload() {
        int i = 72683958 ^ (799245704 ^ 2063290857);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -2006044998) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2006044998 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1318738726 ^ i)) {
                    break;
                }
            }
            int i2 = 1075927717 ^ i;
            throw new RuntimeException("double");
        }
        int i3 = 254626938 ^ i;
        load(797630875);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -251376278) {
            i3 = 2026485967 ^ i3;
            this.FillerSlot = this.config.getIntegerList(pyfrwzlxss(cwnzfqocdswfqkw(), i3));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 927566609) {
                i3 = 473970117 ^ i3;
                loadGuiItems(1002328540);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -716692167) {
                    int i4 = 1044234574 ^ i3;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -716692167 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1949653040 ^ i3)) {
                int i5 = 1258535498 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -251376278 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (549856022 ^ i3)) {
                    int i6 = 1878223589 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 927566609 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1981554592 ^ i3)) {
                        break;
                    }
                }
            }
        }
        int i7 = 30484481 ^ i3;
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
        bpklkgoqap = ByteBuffer.wrap(vvwetpmkxabpoya()).asCharBuffer().toString();
        OUoCp6NmiO = 729874695 ^ new Random(-5385200167385182327L).nextInt();
    }

    public static String pyfrwzlxss(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = bpklkgoqap.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] iojmirvcpbwaxgo() {
        return new byte[]{0, 0, 0, 24, 0, 0, 0, 0};
    }

    private static byte[] szhuuyoluxnxlsh() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 24};
    }

    private static byte[] oqzzsvnairkztgc() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 39};
    }

    private static byte[] jistwgquoukcpfi() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 54};
    }

    private static byte[] dtkmxgazgewftnr() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 55};
    }

    private static byte[] qxtunoyzwdoppzg() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 70};
    }

    private static byte[] oyicsvqqcdbwsft() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 76};
    }

    private static byte[] kzbfgmiuhtwweum() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 80};
    }

    private static byte[] cwnzfqocdswfqkw() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, 86};
    }

    private static byte[] vvwetpmkxabpoya() {
        return new byte[]{49, 122, 50, 69, 51, 87, 51, 92, 49, 64, 49, 29, 50, 69, 51, 64, 51, 80, 49, 87, 49, 86, 50, 28, 51, 81, 51, 94, 49, 93, 49, 85, 50, 88, 51, 64, 51, 92, 49, 30, 49, 90, 50, 69, 51, 87, 51, 92, 49, 124, 56, 67, 52, 85, 55, 89, 56, 70, 49, 27, 56, 81, 52, 89, 55, 88, 56, 89, 49, 24, 56, 94, 52, 68, 55, 81, 56, 88, 49, 112, 48, 66, 48, 93, 52, 88, 57, 66, 49, 23, 48, 95, 48, 86, 52, 83, 57, 94, 49, 20, 48, 84, 48, 87, 52, 90, 57, 90, 49, 59, 50, 20, 49, 67, 55, 87, 52, 67, 48, 64, 50, 88, 49, 67, 55, 87, 52, 86, 48, 106, 50, 88, 49, 69, 55, 87, 52, 95, 48, 16, 50, 20, 49, 88, 55, 70, 52, 87, 48, 88, 50, 20, 49, 65, 48, 24, 51, 30, 56, 94, 54, 21, 51, 8, 24, 26, 53, 21, 50, 16, 51, 4, 54, 115, 50, 81, 49, 90, 55, 95, 56, Byte.MAX_VALUE, 53, 70, 56, 84, 54, 90, 51, 21, 54, 102, 50, 84, 49, 89, 55, 71};
    }

    private static int ywmgmvapnopntugg(int i, int i2) {
        return i2 ^ i;
    }
}
