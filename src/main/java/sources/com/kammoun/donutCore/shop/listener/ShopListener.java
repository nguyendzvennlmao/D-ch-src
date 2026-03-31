package com.kammoun.donutCore.shop.listener;

import com.kammoun.donutCore.shop.ShopPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.event.Listener;

public class ShopListener implements Listener {
    private final ShopPlugin plugin;
    private static int fyy4rW5DRS = 0;
    private transient int ceNqNbAqcg = 95681731;
    private static byte[] fstehywaek;
    private static String[] nothing_to_see_here = new String[15];

    public ShopListener(ShopPlugin shopPlugin, int i) {
        int i2 = 1325828850 ^ 271213800;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 140989054:
                    int i3 = 231324355 ^ i2;
                    break;
                case 871732197:
                case 1108116442:
                    break;
                case 1912528732:
                default:
                    throw new IOException();
            }
        }
        int parseInt = 1504791748 ^ (183039265 ^ Integer.parseInt("29158716"));
        this.ceNqNbAqcg = 95681731 ^ fyy4rW5DRS;
        int eibpzcugcmarhdws = 210751623 ^ eibpzcugcmarhdws(parseInt, 553596833);
        this.plugin = shopPlugin;
        int i4 = 1242757870 ^ eibpzcugcmarhdws;
    }

    @org.bukkit.event.EventHandler
    public void onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.shop.listener.ShopListener.onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent):void");
    }

    private static int getNewAmount(org.bukkit.event.inventory.InventoryClickEvent r5, com.kammoun.donutCore.shop.utils.others.PurchaseInventoryHolder r6, int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.shop.listener.ShopListener.getNewAmount(org.bukkit.event.inventory.InventoryClickEvent, com.kammoun.donutCore.shop.utils.others.PurchaseInventoryHolder, int, int):int");
    }

    private void purchaseLogic(org.bukkit.entity.Player r7, com.kammoun.donutCore.shop.utils.others.PurchaseInventoryHolder r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.shop.listener.ShopListener.purchaseLogic(org.bukkit.entity.Player, com.kammoun.donutCore.shop.utils.others.PurchaseInventoryHolder, int):void");
    }

    public boolean hasAvailableSlot(org.bukkit.entity.Player r6, org.bukkit.inventory.ItemStack r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.shop.listener.ShopListener.hasAvailableSlot(org.bukkit.entity.Player, org.bukkit.inventory.ItemStack, int):boolean");
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
        fstehywaek = frdynczvsmfurti();
        fyy4rW5DRS = (-135886885) ^ new Random(-1010538793342703187L).nextInt();
    }

    public static String xfihaljghm(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ fstehywaek[i3 % fstehywaek.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] frdynczvsmfurti() {
        return new byte[]{28, 36, 54, 105, 99, 49, 86, 30, 121, 28, 35, 123, 74, 67, 104, 25, 37, 30, 106, 28, 13, 110, 71, 32, 30, 2, 33, 82, 118, 98, 4, 13, 58, 41, 121, 108, 42, 85, 26, 68, 44, 8, 23, 9, 117, 21, 42, 100, 48, 48, 107, 1, 73, 47};
    }

    private static byte[] wdiglycpdlrbahk() {
        return new byte[]{-44, -18, 15, 121, 85, 102, 110, 67, 78, 69, 22, 55, Byte.MAX_VALUE, 27, 94, 85, 21, 12};
    }

    private static byte[] wmubotdgwrapxbo() {
        return new byte[]{-45, -22, 6, 120, 85, 96, 97, 94, 75, 77, 18, 39, 122, 90, 94, 79, 18, 75, 88, 69, 60, 58, 119, 49};
    }

    private static int eibpzcugcmarhdws(int i, int i2) {
        return i ^ i2;
    }
}
