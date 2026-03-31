package com.kammoun.donutCore.stats.menu;

import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.api.utils.menu.KMenu;
import com.kammoun.donutCore.stats.StatsPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class StatsMenu extends KMenu implements Listener {
    private final List<KItem> items;
    private final StatsPlugin statsPlugin;
    private static int zBBFB13BrG = 0;
    private transient int gXejPZYPLe = 1451979441;
    private static String fesagjnuzo;
    private static String[] nothing_to_see_here = new String[17];

    public StatsMenu(JavaPlugin javaPlugin, int i) {
        super(javaPlugin, "Stats/Gui's/StatsMenu.yml", 1546437752);
        tvbqbkjioyiwejjc(1127481198 ^ 326577603, 1515234788);
        int parseInt = 1398783475 ^ (1140485155 ^ Integer.parseInt("447850137"));
        this.gXejPZYPLe = 1451979441 ^ zBBFB13BrG;
        this.items = new ArrayList();
        this.statsPlugin = StatsPlugin.getInstance(1218110499);
        loadItems(1109486379);
        Bukkit.getPluginManager().registerEvents(this, javaPlugin);
        int i2 = 1965023716 ^ (81724163 ^ (753878908 ^ (908124645 ^ (1292703373 ^ (505536164 ^ parseInt)))));
    }

    private void loadItems(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.menu.StatsMenu.loadItems(int):void");
    }

    public void openInventory(Player player, int i) {
        int i2 = 991154307 ^ (1376923882 ^ 1479781319);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1986896527) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1986896527 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (388883986 ^ i2)) {
                    break;
                }
            }
            int i3 = 1303349116 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 118487861 ^ i2;
        openInventory(player, player, 1888311706);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1309834023) {
            int i5 = 1256908243 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1309834023 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2014934189 ^ i4)) {
                int i6 = 1904868725 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -423974333 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (914894413 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 1575204470 ^ i4;
        throw new IllegalAccessException();
    }

    public void openInventory(org.bukkit.entity.Player r6, org.bukkit.entity.Player r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.menu.StatsMenu.openInventory(org.bukkit.entity.Player, org.bukkit.entity.Player, int):void");
    }

    @org.bukkit.event.EventHandler
    public void onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.menu.StatsMenu.onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent):void");
    }

    @Override
    public void handleClick(InventoryClickEvent inventoryClickEvent, int i) {
        int i2 = 134529571 ^ (907488600 ^ 1479781319);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 822224355) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 822224355 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1444930591 ^ i2)) {
                    break;
                }
            }
            int i3 = 257350087 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1028123331 ^ i2;
        inventoryClickEvent.setCancelled((byte) (1533521534 ^ i4));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -616729606) {
            int i5 = 11693982 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -559018230 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (459343928 ^ i4)) {
                int i6 = 905633929 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -616729606 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (14010454 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 1879598100 ^ i4;
        throw new IOException();
    }

    @Override
    protected void setMenuItems(String[] strArr, int i) {
        int i2 = 238285159 ^ (89093623 ^ 1479781319);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1703314758) {
            int i3 = 439319767 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1258462210 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (763854536 ^ i2)) {
                int i4 = 320201861 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1703314758 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (384192092 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1672492225 ^ i2;
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
        fesagjnuzo = ByteBuffer.wrap(uoizyrxpepogdsm()).asCharBuffer().toString();
        zBBFB13BrG = 696447033 ^ new Random(5145438895303744232L).nextInt();
    }

    public static String weeryibesm(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = fesagjnuzo.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] cveusuitctbvfdy() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 0};
    }

    private static byte[] zyfzvmisbqcjxna() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 5};
    }

    private static byte[] ejbdfubonzwsyuo() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 17};
    }

    private static byte[] xhmlzwchasfmbkp() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 32};
    }

    private static byte[] pkkdlvvdnsdpodv() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 40};
    }

    private static byte[] pqqpqezabcrfjlf() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 48};
    }

    private static byte[] mbjjtwksweajdhm() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 56};
    }

    private static byte[] vmupvupknvwoqvc() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 63};
    }

    private static byte[] vrmoctvcqbjhhwf() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 70};
    }

    private static byte[] ammlhtjjkhhyjew() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, 85};
    }

    private static byte[] uoibabrpgrovbkk() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 96};
    }

    private static byte[] vbygntmzapfkbsq() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 111};
    }

    private static byte[] odyhacdqiirqprg() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 126};
    }

    private static byte[] gsrugakbnxjandm() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, -122};
    }

    private static byte[] wnbqcqjlsdohebt() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, -115};
    }

    private static byte[] ldwpxmvhfljzyww() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, -108};
    }

    private static byte[] irprnfxahclaeft() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, -95};
    }

    private static byte[] wirnwxjhvqdzqgz() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, -91};
    }

    private static byte[] crqclqmdnxojcmj() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, -87};
    }

    private static byte[] etwahkdanmenrlh() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, -83};
    }

    private static byte[] iaysrkcfdezodkf() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, -79};
    }

    private static byte[] yqngeewzieuezvo() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, -64};
    }

    private static byte[] pdhydvbjaqbbxec() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, -53};
    }

    private static byte[] flyxjkfegfzwzbx() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, -40};
    }

    private static byte[] snvnqdlnoinfxle() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, -33};
    }

    private static byte[] ygtdzvabhttcgxs() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, -22};
    }

    private static byte[] nukqxgjuwcdxeos() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, -11};
    }

    private static byte[] rlfpwmskxjnfqia() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, -3};
    }

    private static byte[] rfwanrsrmiwejrh() {
        return new byte[]{0, 0, 0, 7, 0, 0, 1, 12};
    }

    private static byte[] ssatdvfujfelstv() {
        return new byte[]{0, 0, 0, 12, 0, 0, 1, 19};
    }

    private static byte[] jgrgthowceabdns() {
        return new byte[]{0, 0, 0, 15, 0, 0, 1, 31};
    }

    private static byte[] busfqnhkopktnsy() {
        return new byte[]{0, 0, 0, 8, 0, 0, 1, 46};
    }

    private static byte[] ltbmwitilagpcrk() {
        return new byte[]{0, 0, 0, 15, 0, 0, 1, 54};
    }

    private static byte[] uoizyrxpepogdsm() {
        return new byte[]{54, 121, 54, 68, 52, 86, 50, 92, 53, 69, 54, 19, 49, 84, 55, 89, 49, 89, 56, 83, 54, 72, 57, 104, 54, 92, 55, 89, 54, 82, 49, 92, 55, 19, 55, 17, 51, 84, 54, 95, 48, 84, 54, 67, 52, 108, 55, 91, 55, 85, 53, 69, 55, 71, 51, 86, 54, 80, 48, 80, 54, 68, 52, 22, 53, 28, 48, 69, 50, 88, 51, 83, 53, 75, 48, 82, 50, 67, 51, 23, 56, 22, 54, 83, 53, 85, 49, 83, 49, 76, 51, 94, 55, 70, 48, 20, 55, 19, 55, 93, 51, 87, 53, 88, 51, 67, 54, 95, 57, 64, 50, 16, 49, 16, 57, 95, 53, 93, 48, 91, 48, 88, 49, 70, 57, 17, 50, 28, 54, 94, 52, 68, 52, 85, 51, 66, 57, 69, 52, 17, 53, 19, 55, 89, 52, 67, 51, 86, 55, 88, 54, 68, 48, 107, 55, 80, 51, 69, 53, 87, 55, 86, 52, 67, 51, 86, 55, 81, 54, 18, 49, 20, 57, 84, 57, 92, 55, 86, 56, 102, 49, 90, 57, 80, 57, 95, 55, 88, 56, 74, 49, 20, 49, 16, 48, 91, 52, 76, 56, 87, 53, 92, 53, 67, 50, 107, 56, 91, 50, 71, 49, 84, 48, 84, 52, 76, 56, 87, 53, 85, 53, 21, 50, 21, 51, 83, 56, 89, 55, 95, 55, 90, 50, 91, 51, 66, 56, 106, 55, 82, 55, 75, 50, 95, 51, 90, 56, 80, 55, 94, 55, 28, 49, 19, 56, 64, 55, 89, 48, 80, 48, 67, 54, 92, 51, 68, 49, 21, 49, 17, 56, 84, 53, 86, 55, 92, 57, 82, 49, 77, 56, 28, 50, 21, 52, 91, 55, 90, 49, 93, 57, 88, 50, 67, 52, 21, 49, 18, 57, 90, 48, 93, 53, 93, 51, 84, 49, 78, 57, 104, 48, 65, 53, 67, 51, 84, 49, 89, 57, 67, 48, 23, 49, 28, 56, 95, 54, 83, 49, 29, 49, 28, 56, 26, 54, 5, 49, 94, 49, 20, 52, 88, 52, 81, 52, 21, 49, 20, 52, 29, 52, 7, 52, 86, 52, 20, 56, 82, 48, 89, 53, 88, 51, 87, 49, 83, 48, 67, 53, 106, 55, 67, 52, 93, 56, 81, 48, 86, 53, 82, 51, 80, 49, 29, 49, 23, 52, 71, 55, 88, 54, 88, 49, 75, 52, 104, 55, 64, 54, 80, 49, 95, 52, 82, 55, 17, 49, 16, 48, 91, 53, 90, 49, 86, 50, 87, 49, 76, 48, 105, 53, 70, 49, 72, 50, 87, 49, 91, 48, 66, 53, 16, 50, 21, 53, 91, 55, 90, 50, 90, 50, 80, 50, 73, 53, 19, 49, 18, 50, 72, 51, 88, 55, 80, 55, 73, 49, 104, 50, 76, 51, 93, 55, 92, 55, 85, 49, 18, 49, 20, 53, 92, 54, 93, 55, 82, 56, 108, 49, 90, 53, 88, 54, 94, 55, 92, 56, 64, 49, 20, 52, 28, 56, 73, 57, 91, 57, 80, 48, 77, 57, 93, 57, 75, 55, 28, 51, 19, 49, 85, 57, 80, 49, 88, 57, 71, 54, 110, 54, 84, 56, 84, 57, 74, 51, 69, 49, 87, 57, 95, 49, 92, 57, 64, 54, 20, 49, 22, 52, 92, 56, 67, 49, 89, 51, 72, 49, 64, 52, 19, 49, 29, 57, 84, 57, 86, 52, 90, 48, 85, 49, 65, 57, 102, 57, 84, 52, 85, 48, 84, 49, 93, 57, 28, 56, 22, 55, 80, 54, 89, 54, 91, 55, 91, 51, 92, 50, 69, 53, 105, 52, 71, 56, 95, 55, 83, 54, 86, 54, 81, 55, 92, 51, 18, 56, 18, 49, 68, 53, 92, 56, 86, 54, 65, 55, 84, 52, 71, 48, 29, 49, 22, 54, 80, 51, 93, 56, 95, 55, 86, 49, 88, 54, 65, 51, 110, 56, 82, 55, 71, 49, 92, 54, 89, 51, 84, 56, 94, 55, 16};
    }

    private static int tvbqbkjioyiwejjc(int i, int i2) {
        return i ^ i2;
    }
}
