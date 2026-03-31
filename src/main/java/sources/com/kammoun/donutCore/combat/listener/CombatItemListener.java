package com.kammoun.donutCore.combat.listener;

import com.kammoun.donutCore.combat.CombatPlugin;
import com.kammoun.donutCore.combat.config.CombatConfig;
import com.kammoun.donutCore.combat.manager.CombatManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

public class CombatItemListener implements Listener {
    private final CombatPlugin plugin;
    private final CombatManager combatManager;
    private final CombatConfig config;

    private static int f19837g5Vor9U = 0;
    private transient int UR7OLex2XD = 956537662;
    private static String lmfzhhvoym;
    private static String[] nothing_to_see_here = new String[18];

    public CombatItemListener(CombatPlugin combatPlugin, int i) {
        int i2 = 364331173 ^ 97909186;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 264197973:
                    int i3 = 426037614 ^ i2;
                    break;
                case 319610290:
                default:
                    throw new RuntimeException();
                case 654701437:
                    break;
                case 807160322:
            }
        }
        int parseInt = 491419340 ^ (99587095 ^ Integer.parseInt("295930578"));
        this.UR7OLex2XD = 956537662 ^ f19837g5Vor9U;
        int twmirviqtslwwnrl = 1689424973 ^ twmirviqtslwwnrl(parseInt, 901120867);
        this.plugin = combatPlugin;
        this.combatManager = combatPlugin.getCombatManager(1742848135);
        this.config = combatPlugin.getCombatConfig(1983292249);
        int i4 = 2037056145 ^ (1585590613 ^ (1535977277 ^ twmirviqtslwwnrl));
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH, ignoreCancelled = true)
    public void onPlayerInteract(org.bukkit.event.player.PlayerInteractEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.listener.CombatItemListener.onPlayerInteract(org.bukkit.event.player.PlayerInteractEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH, ignoreCancelled = true)
    public void onProjectileLaunch(org.bukkit.event.entity.ProjectileLaunchEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.listener.CombatItemListener.onProjectileLaunch(org.bukkit.event.entity.ProjectileLaunchEvent):void");
    }

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onPlayerTeleport(PlayerTeleportEvent playerTeleportEvent) {
        int i = 2075713372 ^ (1304849032 ^ 327185712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 804652833) {
            int i2 = 1608079287 ^ i;
            if (playerTeleportEvent.getCause() != PlayerTeleportEvent.TeleportCause.ENDER_PEARL) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -784549221) {
                    int i3 = 130438136 ^ i2;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -784549221 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1253123634 ^ i2)) {
                        int i4 = 1500046948 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -284285605 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2082807824 ^ i2)) {
                            break;
                        }
                    }
                }
                int i5 = 1303453674 ^ i2;
                throw new IllegalAccessException("double");
            }
            int twmirviqtslwwnrl = twmirviqtslwwnrl(i2, 356495845);
            if (this.config.isDisableEnderPearls(401502872) != (1863853750 ^ twmirviqtslwwnrl)) {
                i = 396856280 ^ twmirviqtslwwnrl;
                Player player = playerTeleportEvent.getPlayer();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -973247629) {
                    int i6 = 140817203 ^ i;
                    if (this.combatManager.isInCombat(player, 452342611) == (1893408349 ^ i6)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2032602389) {
                            int i7 = 1707760380 ^ i6;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2032602389 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1393529867 ^ i6)) {
                                break;
                            }
                        }
                        int i8 = 650025864 ^ i6;
                        throw new IOException("double");
                    }
                    twmirviqtslwwnrl = 483232652 ^ i6;
                    playerTeleportEvent.setCancelled((byte) (1813419472 ^ twmirviqtslwwnrl));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(twmirviqtslwwnrl) == 1622453899) {
                        i = 1060450617 ^ twmirviqtslwwnrl;
                        this.config.sendMessage(player, this.config.getEnderPearlBlockedMessage(1447093630), 888239100);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1726142654) {
                            int i9 = 1320900987 ^ i;
                            return;
                        }
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(twmirviqtslwwnrl) == 2025928115) {
                int i10 = 2090838122 ^ twmirviqtslwwnrl;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(twmirviqtslwwnrl) == 2025928115 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(twmirviqtslwwnrl) == (1426409270 ^ twmirviqtslwwnrl)) {
                    int i11 = 1379642276 ^ twmirviqtslwwnrl;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(twmirviqtslwwnrl) == 1622453899 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(twmirviqtslwwnrl) == (1929601306 ^ twmirviqtslwwnrl)) {
                        break;
                    }
                }
            }
            int i12 = 1325878202 ^ twmirviqtslwwnrl;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -973247629 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (640306646 ^ i)) {
                int i13 = 644504360 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1726142654 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1566179533 ^ i)) {
                    int i14 = 1943820048 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 804652833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (48439649 ^ i)) {
                        int i15 = 70940391 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1467341560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1301677193 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i16 = 1201726176 ^ i;
        throw new IOException();
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
        lmfzhhvoym = ByteBuffer.wrap(dvaimxzownrmdxu()).asCharBuffer().toString();
        f19837g5Vor9U = 47610785 ^ new Random(-7013358153378309037L).nextInt();
    }

    public static String kmakcgzqvn(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = lmfzhhvoym.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] dvaimxzownrmdxu() {
        return new byte[0];
    }

    private static int twmirviqtslwwnrl(int i, int i2) {
        return i ^ i2;
    }
}
