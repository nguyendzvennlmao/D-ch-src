package com.kammoun.donutCore.enderchest.listener;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.kammoun.donutCore.enderchest.CustomEnderChest;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class ChestListener implements Listener {
    private final CustomEnderChest plugin;
    private final ProtocolManager protocolManager;
    public static final Map<UUID, Location> openEnderChests;
    private static int I0HhDoBYWN = 0;
    private transient int Lifx4lVeA2 = 1543817172;
    private static byte[] wuqzjxypze;
    private static String[] nothing_to_see_here = new String[18];

    public ChestListener(CustomEnderChest customEnderChest, int i) {
        int i2 = 2015959648 ^ (640002586 ^ 1233681011);
        int parseInt = 1484935370 ^ (870187510 ^ Integer.parseInt("2094570293"));
        this.Lifx4lVeA2 = 1543817172 ^ I0HhDoBYWN;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 90691528:
                    break;
                case 227627253:
                    parseInt = 636321766 ^ parseInt;
                    break;
                case 648731620:
                case 1018420253:
                default:
                    throw new IllegalAccessException();
            }
        }
        this.plugin = customEnderChest;
        this.protocolManager = ProtocolLibrary.getProtocolManager();
        int i3 = 980503300 ^ (139200471 ^ (310585463 ^ parseInt));
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST)
    public void onEnderChestInteract(org.bukkit.event.player.PlayerInteractEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.listener.ChestListener.onEnderChestInteract(org.bukkit.event.player.PlayerInteractEvent):void");
    }

    @org.bukkit.event.EventHandler
    public void onInventoryClose(org.bukkit.event.inventory.InventoryCloseEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.listener.ChestListener.onInventoryClose(org.bukkit.event.inventory.InventoryCloseEvent):void");
    }

    private void sendBlockActionPacket(org.bukkit.Location r6, int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.listener.ChestListener.sendBlockActionPacket(org.bukkit.Location, int, int, int):void");
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent playerQuitEvent) {
        int i = 1055422867 ^ (171967498 ^ 637422801);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1968076224) {
            i = 997770177 ^ i;
            Location remove = openEnderChests.remove(playerQuitEvent.getPlayer().getUniqueId());
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1366791241) {
                i = 670227363 ^ i;
                sendBlockActionPacket(remove, (byte) (232532267 ^ i), (byte) (232532266 ^ i), 1780930957);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1860258128) {
                    int i2 = 86969858 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1968076224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1761400926 ^ i)) {
                int i3 = 555789553 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1860258128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2089173804 ^ i)) {
                    int i4 = 1076349269 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1201224000 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (992397686 ^ i)) {
                        int i5 = 2068474437 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1366791241 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (509876834 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i6 = 2080663328 ^ i;
        throw new IllegalAccessException();
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣶⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⠿⠟⠛⠻⣿⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣆⣀⣀⠀⣿⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠻⣿⣿⣿⠅⠛⠋⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[5] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢼⣿⣿⣿⣃⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[6] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣟⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[7] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣛⣛⣫⡄⠀⢸⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[8] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⡆⠸⣿⣿⣿⡷⠂⠨⣿⣿⣿⣿⣶⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣾⣿⣿⣿⣿⡇⢀⣿⡿⠋⠁⢀⡶⠪⣉⢸⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⡏⢸⣿⣷⣿⣿⣷⣦⡙⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣇⢸⣿⣿⣿⣿⣿⣷⣦⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[15] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[16] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[17] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣵⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        int parseInt = 2107720442 ^ (174274259 ^ Integer.parseInt("2094570293"));
        wuqzjxypze = klrevixtirbsucf();
        I0HhDoBYWN = (-1093452999) ^ new Random(-4060001822447077408L).nextInt();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1490516192) {
            int i = 2001849499 ^ parseInt;
            openEnderChests = new HashMap();
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -497476549 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1345289460 ^ parseInt)) {
                int i2 = 2113636682 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1490516192 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1545179997 ^ parseInt)) {
                    break;
                }
            }
        }
        int i3 = 1125503816 ^ parseInt;
        throw new RuntimeException();
    }

    public static String fkupzuvyfk(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ wuqzjxypze[i3 % wuqzjxypze.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] klrevixtirbsucf() {
        return new byte[]{82, 68, 122, 70, 125, 50, 60, 59, 8, 79, 107, 9, 43, 125, 28, 24, 111, 85, 83, 6, 32, 124, 82, 82, 103, 35, 33};
    }

    private static int rewmfygslhpkubbz(int i, int i2) {
        return i ^ i2;
    }
}
