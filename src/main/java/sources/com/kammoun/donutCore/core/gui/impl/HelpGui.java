package com.kammoun.donutCore.core.gui.impl;

import com.kammoun.donutCore.core.CorePlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class HelpGui implements Listener {
    private final CorePlugin plugin;
    private final Set<Player> openedPlayers;
    private final String inventoryTitle;
    private static int eivQPiIFUl = 0;
    private transient int Fv4zRfGrBD = 59130934;
    private static String[] nothing_to_see_here = new String[13];

    public HelpGui(CorePlugin corePlugin, int i) {
        int i2 = 2047998541 ^ (167820434 ^ 605484132);
        int parseInt = 715674544 ^ (1058967930 ^ Integer.parseInt("1102147697"));
        this.Fv4zRfGrBD = 59130934 ^ eivQPiIFUl;
        int kdhrlthjnctxubxe = 1682112432 ^ kdhrlthjnctxubxe(parseInt, 1416482375);
        this.openedPlayers = new HashSet();
        this.plugin = corePlugin;
        this.inventoryTitle = corePlugin.getConfigurationManager(2125977720).getHelpGuiConfig(1912967603).getString("title", "Help");
        Bukkit.getPluginManager().registerEvents(this, corePlugin.getApi(2142241109));
        int i3 = 1258310662 ^ (1493572892 ^ (1745092689 ^ (595353798 ^ kdhrlthjnctxubxe)));
    }

    public void openGui(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.HelpGui.openGui(org.bukkit.entity.Player, int):void");
    }

    @org.bukkit.event.EventHandler
    public void onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.HelpGui.onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent):void");
    }

    @org.bukkit.event.EventHandler
    public void onInventoryClose(org.bukkit.event.inventory.InventoryCloseEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.HelpGui.onInventoryClose(org.bukkit.event.inventory.InventoryCloseEvent):void");
    }

    public void remove(Player player, int i) {
        int i2 = 877383662 ^ (1795115707 ^ 915499490);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1093625275) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1070796214 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1950264002 ^ i2)) {
                    int i3 = 282090981 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1093625275 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (180702444 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 2090914177 ^ i2;
            throw new RuntimeException();
        }
        int i5 = 1139289916 ^ i2;
        this.openedPlayers.remove(player);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1584274521) {
            int i6 = 1942511042 ^ i5;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1584274521 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (9291510 ^ i5)) {
                break;
            }
        }
        int i7 = 1886234543 ^ i5;
        throw new IOException("double");
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
        eivQPiIFUl = (-1167084853) ^ new Random(2500309977517911313L).nextInt();
    }

    public static String ghlwcqykrw(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] gmzqaaukuhqeaji() {
        return new byte[]{46, 40, 94, 108, 71, 39, 4, 37, 67, 17, 117, 5, 123, 14, 4, 13, 56, 9, 69, 96, 23, 105, 17, 52, 5, 28, 45, 44, 61, 32, 72, 54, 108, 35, 63, 98, 109, 80, 90, 39, 52, 34, 107, 124, 27, 64, 56, 103, 113, 98, 102, 59, 68, 66, 118, 38, 34, 29, 41, 28, 30, Byte.MAX_VALUE, 31, 12, 77, 76, 55, 65, 100, 48, 109, 79, 106, 9, 6, 4, 61, 21, 52, 66, 117, 126, 125, 119, 16, 121, 9, 122, 59, 42, 30, 124, 3, 26, 10, 33, 123, 16, 36, 58, 81, 90, 29, 105, 30, 103, 72, 63, 2, 33, 44, 49, 76};
    }

    private static byte[] atspczvglqiqnfg() {
        return new byte[]{-31, -32, 106, 41, 112, 120, 48, 103, 122, 64};
    }

    private static int kdhrlthjnctxubxe(int i, int i2) {
        return i2 ^ i;
    }
}
