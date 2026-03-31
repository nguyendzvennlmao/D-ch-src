package com.kammoun.donutCore.billford.gui;

import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.billford.BillFordPlugin;
import com.kammoun.donutCore.billford.models.BillfordPreset;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class BillfordPresetEditorGui implements InventoryHolder {
    private final BillFordPlugin plugin;
    private Inventory inventory;
    private BillfordPreset preset;
    private static final List<Integer> REQUIRED_ITEMS_SLOTS;
    private static final int TRADE_ITEM_SLOT = 25;
    private static final int SAVE_BUTTON_SLOT = 49;
    private static final int INFO_SLOT = 4;
    private static int sRuCfozUYa = 0;
    private transient int H92SlEJTrH = 1480016265;
    private static String[] nothing_to_see_here = new String[13];

    public BillfordPresetEditorGui(BillFordPlugin billFordPlugin, BillfordPreset billfordPreset, int i) {
        mhinqkathwtrmgpp(719839614 ^ 985028687, 1841982815);
        int parseInt = 734966184 ^ (1065615427 ^ Integer.parseInt("1775330693"));
        this.H92SlEJTrH = 1480016265 ^ sRuCfozUYa;
        this.plugin = billFordPlugin;
        this.preset = billfordPreset;
        int i2 = 1035254378 ^ (367613194 ^ (1710095983 ^ (1418708539 ^ parseInt)));
    }

    public void open(Player player, int i) {
        int i2 = 1567012109 ^ (458484974 ^ 592773409);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 721602067) {
            int i3 = 335502494 ^ i2;
            String color = ChatFormater.color("&8ᴄᴜʀʀᴇɴᴛʟʏ ᴇᴅɪᴛɪɴɢ: &e" + this.preset.getName(318298212));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1258806557) {
                i2 = 205233266 ^ i3;
                this.inventory = Bukkit.createInventory(this, (byte) (2057607192 ^ i2), color);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -719011469) {
                    i3 = 26086845 ^ i2;
                    setupGui(438371640);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -648762213) {
                        i3 = 1820372887 ^ i3;
                        player.openInventory(this.inventory);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1118711776) {
                            int i4 = 395366812 ^ i3;
                            return;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1258806557 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1431997331 ^ i3)) {
                    int i5 = 1545662023 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -648762213 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1227185811 ^ i3)) {
                        int i6 = 1893142024 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1118711776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1095801254 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i7 = 1663125869 ^ i3;
            throw new IllegalAccessException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -719011469 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1244731313 ^ i2)) {
                int i8 = 2075093332 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 721602067 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1959162438 ^ i2)) {
                    break;
                }
            }
        }
        int i9 = 1848422843 ^ i2;
        throw new IllegalAccessException("double");
    }

    private void setupGui(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.gui.BillfordPresetEditorGui.setupGui(int):void");
    }

    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.gui.BillfordPresetEditorGui.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    private void handleItemSlot(InventoryClickEvent inventoryClickEvent, int i, int i2) {
        int i3 = 1242946537 ^ (690985737 ^ 592773409);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 58330634) {
            i3 = 1316295994 ^ i3;
            ItemStack currentItem = inventoryClickEvent.getCurrentItem();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1892853720) {
                i3 = 1539180604 ^ i3;
                ItemStack cursor = inventoryClickEvent.getCursor();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1390221766) {
                    i3 = 1536625855 ^ i3;
                    if (currentItem == null) {
                        mhinqkathwtrmgpp(i3, 1374235768);
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1905951680) {
                        i3 = 1260243321 ^ i3;
                        if (currentItem.getType() != Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 695519242) {
                                i3 = 1924018853 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1140499167) {
                                    i3 = 2081861575 ^ i3;
                                    if (currentItem.getType() == Material.YELLOW_STAINED_GLASS_PANE) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1555047194) {
                                            i3 = 1769043143 ^ i3;
                                            if (cursor == null) {
                                                int i4 = 1877259757 ^ i3;
                                                return;
                                            }
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 389776673) {
                                                i3 = 1288013197 ^ i3;
                                                if (cursor.getType() == Material.AIR) {
                                                    mhinqkathwtrmgpp(i3, 589377632);
                                                    return;
                                                }
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1897376075) {
                                                    i3 = 699071969 ^ i3;
                                                    inventoryClickEvent.setCancelled((byte) (1200097481 ^ i3));
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1010845250) {
                                                        i3 = 922509910 ^ i3;
                                                        this.inventory.setItem(i, cursor.clone());
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1952230157) {
                                                            i3 = 1247165110 ^ i3;
                                                            inventoryClickEvent.getWhoClicked().setItemOnCursor((ItemStack) null);
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -653098687) {
                                                                int i5 = 1981912417 ^ i3;
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                            case 41083881:
                                                int i6 = 340555875 ^ i3;
                                                return;
                                            case 165039982:
                                                return;
                                            case 555564409:
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 695519242 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1747798257 ^ i3)) {
                                    int i7 = 1216036871 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1140499167 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1715700412 ^ i3)) {
                                        int i8 = 1292983782 ^ i3;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                        }
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                case 101322079:
                                    i3 = 1741285797 ^ i3;
                                    break;
                                case 130421908:
                                case 1005656996:
                                    break;
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 389776673 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (363258678 ^ i3)) {
                    int i9 = 494933267 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1905951680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1559746354 ^ i3)) {
                        int i10 = 1268491245 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1892853720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (255115040 ^ i3)) {
                            int i11 = 956124 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1952230157 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1274199883 ^ i3)) {
                                int i12 = 573840092 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1897376075 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1896735437 ^ i3)) {
                                    int i13 = 1223724055 ^ i3;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1746807370 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (758381406 ^ i3)) {
                int i14 = 756256979 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -19668990 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1691786542 ^ i3)) {
                    int i15 = 1434211542 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1555047194 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2114508243 ^ i3)) {
                        int i16 = 526676541 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 58330634 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (858075314 ^ i3)) {
                            int i17 = 1289974796 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1010845250 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2133899209 ^ i3)) {
                                int i18 = 1190881418 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -653098687 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (795762573 ^ i3)) {
                                    int i19 = 647606902 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1390221766 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1006491080 ^ i3)) {
                                        int i20 = 281676106 ^ i3;
                                        throw new RuntimeException();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void savePreset(org.bukkit.entity.Player r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.gui.BillfordPresetEditorGui.savePreset(org.bukkit.entity.Player, int):void");
    }

    @NotNull
    public Inventory getInventory() {
        int i = 1866630454 ^ (1517414986 ^ 592773409);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1288473880) {
            int i2 = 501997593 ^ i;
            return this.inventory;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1288473880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1163163714 ^ i)) {
                int i3 = 1330865860 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1550610976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1979692801 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1752513885 ^ i;
        throw new IllegalAccessException();
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
        int parseInt = 2009524094 ^ (218283621 ^ Integer.parseInt("1775330693"));
        sRuCfozUYa = (-69210326) ^ new Random(-3061045788498389758L).nextInt();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) != -1733696272) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1582023114 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (16399151 ^ parseInt)) {
                    int i = 362462846 ^ parseInt;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1733696272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (769829406 ^ parseInt)) {
                        break;
                    }
                }
            }
            int i2 = 1884133862 ^ parseInt;
            throw new RuntimeException();
        }
        int i3 = 1490830503 ^ parseInt;
        Integer[] numArr = new Integer[(byte) (1271494704 ^ i3)];
        numArr[(byte) (1271494713 ^ i3)] = Integer.valueOf((byte) (1271494707 ^ i3));
        numArr[(byte) (1271494712 ^ i3)] = Integer.valueOf((byte) (1271494706 ^ i3));
        numArr[(byte) (1271494715 ^ i3)] = Integer.valueOf((byte) (1271494709 ^ i3));
        numArr[(byte) (1271494714 ^ i3)] = Integer.valueOf((byte) (1271494698 ^ i3));
        numArr[(byte) (1271494717 ^ i3)] = Integer.valueOf((byte) (1271494701 ^ i3));
        numArr[(byte) (1271494716 ^ i3)] = Integer.valueOf((byte) (1271494700 ^ i3));
        numArr[(byte) (1271494719 ^ i3)] = Integer.valueOf((byte) (1271494693 ^ i3));
        numArr[(byte) (1271494718 ^ i3)] = Integer.valueOf((byte) (1271494692 ^ i3));
        numArr[(byte) (1271494705 ^ i3)] = Integer.valueOf((byte) (1271494695 ^ i3));
        REQUIRED_ITEMS_SLOTS = Arrays.asList(numArr);
    }

    public static String khtiulfmal(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] bbybmyjshaittpa() {
        return new byte[]{29, 67, 66, 117, 14, 76, 33, 46, 89, 36, 48, 93, 42, 93, 73, 13, 94, 14, 39, 31, 44, 106, 113, 61, 6, 123, 59, 62, 89, 66, 56, Byte.MAX_VALUE, Byte.MAX_VALUE, 110, 85, 82, 120, 1, 123, 72, 76, 106, 84, 13, 32, 13, 113, 118, 115, 91, 95, 52, 93, 44, 8, 79, 101, 8, 3, 109, 76, 82, 71, 33, 45, 11, 54, 80, 43, 34, 36, 2, 62, 41, 67, 58, 14, 19, 115, 126, 45, 97, 99, 91, 14, 28, 56, 96, 85, 19, 11, 15, 123, 46, 116, 38, 68, 26, 95, 52};
    }

    private static byte[] mxmfdlqsbvtgver() {
        return new byte[]{-42, -114, 119, 101, 56, 78, 21, 76, 111, 116, 2, TRADE_ITEM_SLOT, 28, 30, 124, 80, 110, 74, 18, 72, TRADE_ITEM_SLOT, 56, 71, 40, 50, 2, 13, Byte.MAX_VALUE, 107, 18, 14, 36, 74, 122, 101, 55, 77, 95, 78, 17, 122, 43};
    }

    private static byte[] umyexbckgumvjwv() {
        return new byte[]{-46, -118, 112, 98};
    }

    private static byte[] zkyshwbucmshdmo() {
        return new byte[]{-47, -114, 112, 107, 58, 64, 21, 77, 110, 122, 2, 14, 18, 10, 125, 92, 109, TRADE_ITEM_SLOT, 21, 89, 30, 58, 69, 108, 50, 104, 12, 126, 107, 21, 0, 60, 75, 59, 102, 23, 74, 87, 73, 80, 120, 55, 96, 74, 23, 90, 67, 41, 75, 79, 107, 104, 110, 126, 58, 15, 87, 85};
    }

    private static byte[] alpjumlihvwjqrr() {
        return new byte[]{-46, -119, 114, 99, 61, 75, 21, 73, 111, 120, 1, 9, 26, 14, 122, 88, 106, TRADE_ITEM_SLOT, 17, 70, 29, 43, 65, 104, 53, 38, 15, 122, 111, 82, 9, 35, 79, 48, 102, 66, 76, 66, 77, 16, 125, 58};
    }

    private static byte[] kkwtwefzooilnao() {
        return new byte[]{-46, -119, 114, 99, 61, 75, 21, 63, 111, 120, 1, 4, 26, 8, 122, 91, 106, 77, 17, 15, 29, 44, 65, 104, 53, 40, 15, 125, 111, 27, 9, 37, 79, 48, 102, 66, 76, 16, 77, 79, 125, 57, 100, 82, 19, 79, 69, 97, 69, TRADE_ITEM_SLOT, 110, 100, 109, 109, 59, 10, 81, 86, 53, 47, 125, 2, 119, 117, 30, 27, 2, 14, 29, 102, 21, 82, 14, 116, 112, 121};
    }

    private static byte[] vwwdyuqoztymvwr() {
        return new byte[0];
    }

    private static byte[] zptqjqcpbfzoswy() {
        return new byte[]{-46, -119, 114, 99, 61, 75, 21, 73, 111, 120, 1, 9, 26, 14, 122, 88, 106, TRADE_ITEM_SLOT, 17, 91, 29, 55, 65, 104, 53, 107, 15, 123, 111, 23, 9, 61, 79, 63, 102, 16, 76, 82, 77, 88, 125, 54, 100, 73, 19, 88, 69, 44};
    }

    private static byte[] bzekmjerizsxxam() {
        return new byte[]{-46, -119, 114, 99, 61, 75, 21, 112, 111, 122, 1, 72, 26, TRADE_ITEM_SLOT, 122, 85, 106, 92, 17, 15, 29, 121, 65, 104, 53, 109, 15, 101, 111, 0, 9, 35, 79, 57, 102, 10, 76, 66, 77, 88, 125, 44, 100, 81, 19, 82, 69, 53};
    }

    private static byte[] xrojxjdsquqngzw() {
        return new byte[0];
    }

    private static byte[] sfvfkjkvghbtelv() {
        return new byte[]{-46, -119, 114, 99, 61, 75, 21, 90, 111, 120, 1, 1, 26, 14, 122, 86, 106, TRADE_ITEM_SLOT, 17, 9, 29, 62, 65, 43, 53, 39, 15, 90, 111, 51, 9, 28, 79, 27, 102, 66, 76, 16, 77, 79, 125, 40, 100, 85, 19, 88, 69, 47, 69, 75, 110, 101, 109, 115, 59, 17, 81, 90, 53, 124};
    }

    private static byte[] icpitirpoptnjqx() {
        return new byte[]{-43, -123, 112, 102, 60, TRADE_ITEM_SLOT, 18, 58, 111, 113, 2, 59, 24, 40, 122, 105, 104, 114, 21, 10, 30, 14, 66, 93, 48, 7, 9, 88, 107, 51, 11, TRADE_ITEM_SLOT};
    }

    private static byte[] xbcqisnlveobfyh() {
        return new byte[]{-46, -119, 122, 106, 62, 30, 23, 68, 110, 112, 1, 31, 18, 5, 121, 72, 104, 82, 16, 14, 29, 22, 73, 112, 54, 41, 13, 107, 110, 83, 9, TRADE_ITEM_SLOT, 71, 59, 101, 10, 78, 77};
    }

    private static byte[] wbnuwwcfwhnmhnd() {
        return new byte[]{-37, -120, 118, 102, 60, 65, TRADE_ITEM_SLOT, 70, 97, 124, 4, 9, 24, 11, 113, 80, 102, 26, 19, 75, 30, SAVE_BUTTON_SLOT, 73, 37, 62, 38, 15, Byte.MAX_VALUE, 107, 18, 0, 42, 71, 122, 97, 15, 74, 81, 67, 2, 116, 59};
    }

    private static byte[] cfeksfgdqimlplr() {
        return new byte[]{-46, -117, 113, 98, 58, 72, TRADE_ITEM_SLOT, 88, 105, 112, 1, 3, TRADE_ITEM_SLOT, 15, 125, 85, 102, 27, 23, 83, 29, 50, 66, 44, 50, 59, 3, 106, 105, 12, 9, 45, 76, Byte.MAX_VALUE, 97, 0, 64, 88, 75, 28, 125, 125, 103, 95, 20, 86, 73, 34, 67, 13, 110, 100, 110, 120, 60, 15};
    }

    private static byte[] zjtykvkmdrnphhg() {
        return new byte[]{-46, -117, 113, 98, 58, 72, TRADE_ITEM_SLOT, 111, 105, 115, 1, 74, TRADE_ITEM_SLOT, 24, 125, 86, 102, 82, 23, 84, 29, 125, 66, 124, 50, 58, 3, 110, 105, 9, 9, 45, 76, 43};
    }

    private static byte[] ujzdkddzdugcodo() {
        return new byte[0];
    }

    private static byte[] bkkuookrthajrxk() {
        return new byte[]{-46, -113, 118, 106, 55, 75, 21, 56, 104, 113, 1, 62, 30, 22, 112, 89, 106, 77, 22, 67, 29, 45, 69, 36, 63, 15, 15, 106, 104, 18, 9, 56, 75, 56, 108, 17};
    }

    private static byte[] rqldcpuorqvqzff() {
        return new byte[]{-46, -116, 115, 106, 59, 24, 22, 75, 106, 110, 1, 8, 27, 23, 124, 93, 105, 79, 20, 7, 29, 41, 64, 101, 51, 56, 12, 110, 106, 30, 9, 111, 78, 36, 96, 18, 79, 87, 72, 19, 125, 63, 101, 71, 21, 75, 70, 37, 64, 22, 110, 104, 108, 121, 61, 3, 82, 28};
    }

    private static byte[] dpfgbpaapiwegbq() {
        return new byte[]{-46, -116, 123, 100, 57, 26, 21, 70, 105, 115, 1, 24, 19, 74, 126, 85, 106, 74, 23, 84, 29, 46, 72, 42, SAVE_BUTTON_SLOT, 61, 15, 106, 105, 14, 9, 111, 70, 56, 98, 71, 76, 66, 75, 21, 125, 45, 109, 91, 23, 74, 69, 35, 67, 67, 110, 109, 100, 111, 63, 31, 81, 84, 51, 116};
    }

    private static byte[] rpmtzddrykixehd() {
        return new byte[]{-46, -118, 122, 103, 56, 24, 21, 67, 96, 115, 1, 30, 18, 73, Byte.MAX_VALUE, 87, 106, 79, 30, 84, 29, 40, 73, 41, 48, 45, 15, 110, 96, 30, 9, 105, 71, 59, 99, 17, 76, 21, 66, 28, 125, 57, 108, 88, 22, 73, 69, 54, 74, 67, 110, 109, 101, 118, 62, 29, 81, 28, 58, 39, 125, 1, Byte.MAX_VALUE, 100, 27, 73, 2, 13, 18, 104, 21, 81, 6, 121, 117, 45, 58, 78, 74, 50, 28, 50, 91, 2, 56, 10};
    }

    private static int mhinqkathwtrmgpp(int i, int i2) {
        return i2 ^ i;
    }
}
