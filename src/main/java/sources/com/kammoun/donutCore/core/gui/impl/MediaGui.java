package com.kammoun.donutCore.core.gui.impl;

import com.kammoun.donutCore.core.CorePlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Set;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class MediaGui implements Listener {
    private final CorePlugin plugin;
    private final Set<Player> openedPlayers;
    private static int pjxp70FCbc = 0;
    private transient int dq35zUxZkN = 705493281;
    private static String djjlvfzzcx;
    private static String[] nothing_to_see_here = new String[15];

    public MediaGui(com.kammoun.donutCore.core.CorePlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.MediaGui.<init>(com.kammoun.donutCore.core.CorePlugin, int):void");
    }

    public void open(org.bukkit.entity.Player r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.MediaGui.open(org.bukkit.entity.Player, int):void");
    }

    private org.bukkit.inventory.Inventory generateInventory(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.MediaGui.generateInventory(org.bukkit.entity.Player, int):org.bukkit.inventory.Inventory");
    }

    @org.bukkit.event.EventHandler
    public void onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.MediaGui.onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent):void");
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent inventoryCloseEvent) {
        int i = 829138278 ^ (1307234981 ^ 578535708);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -136988934) {
            int i2 = 2120185941 ^ i;
            if ((inventoryCloseEvent.getPlayer() instanceof Player) == (547737226 ^ i2)) {
                int i3 = 1417960352 ^ i2;
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 86930513) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 86930513 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1692568454 ^ i2)) {
                        break;
                    }
                }
                int i4 = 681269370 ^ i2;
                throw new IllegalAccessException("double");
            }
            i = 1077679981 ^ i2;
            this.openedPlayers.remove(inventoryCloseEvent.getPlayer());
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 80662331) {
                int i5 = 347622605 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1593005741 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1837531714 ^ i)) {
                int i6 = 1941196929 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -136988934 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (576207241 ^ i)) {
                    int i7 = 920574699 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 80662331 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1017115760 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1891335886 ^ i;
        throw new IOException();
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        int i = 735382312 ^ (378947483 ^ 578535708);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -104567432) {
            i = 1161726802 ^ i;
            this.openedPlayers.remove(playerQuitEvent.getPlayer());
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -802146326) {
                int i2 = 320414786 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -104567432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1987390706 ^ i)) {
                int i3 = 1137176635 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -802146326 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (924112605 ^ i)) {
                    int i4 = 741867798 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1224283642 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (421717053 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 1409268995 ^ i;
        throw new RuntimeException();
    }

    public void remove(Player player, int i) {
        int i2 = 418815216 ^ (203913129 ^ 578535708);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1252961751) {
            i2 = 943551161 ^ i2;
            this.openedPlayers.remove(player);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1958397920) {
                int i3 = 65855544 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1252961751 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1435575760 ^ i2)) {
                int i4 = 343774013 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1958397920 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1309479575 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1428785757 ^ i2;
        throw new IOException();
    }

    public boolean isInGUI(Player player) {
        int i = 1263848521 ^ (345901209 ^ 578535708);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -309842333) {
            int i2 = 1573459115 ^ i;
            return this.openedPlayers.contains(player);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 62950201 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1233173313 ^ i)) {
                int i3 = 386961449 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -309842333 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (999762985 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 710625876 ^ i;
        throw new IllegalAccessException();
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
        djjlvfzzcx = ByteBuffer.wrap(rgjdcfwwmraoemv()).asCharBuffer().toString();
        pjxp70FCbc = 518485125 ^ new Random(5990315449162759070L).nextInt();
    }

    public static String homcquejsl(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = djjlvfzzcx.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] xbtpthevextyzya() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 0};
    }

    private static byte[] danmuqokyapqyyl() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 5};
    }

    private static byte[] fsiiujvvcryucmd() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 5};
    }

    private static byte[] rgjdcfwwmraoemv() {
        return new byte[]{52, 66, 51, 88, 50, 67, 49, 95, 56, 81, 49, 70, 52, 89, 56, 76, 55, 93};
    }

    private static int isbojwvdhnqypihr(int i, int i2) {
        return i ^ i2;
    }
}
