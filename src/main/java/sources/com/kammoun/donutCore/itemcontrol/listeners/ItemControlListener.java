package com.kammoun.donutCore.itemcontrol.listeners;

import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.itemcontrol.ItemControl;
import com.kammoun.donutCore.itemcontrol.config.ItemControlConfig;
import com.kammoun.donutCore.itemcontrol.enums.BanType;
import com.kammoun.donutCore.itemcontrol.managers.CooldownManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.projectiles.ProjectileSource;

public class ItemControlListener implements Listener {
    private final ItemControl itemControl;
    private final ItemControlConfig config;
    private final CooldownManager cooldownManager;
    private final Map<UUID, Long> pickupMessageCooldown;
    private static final long MESSAGE_COOLDOWN_MS = 2000;
    private static int VUD8eh5iKn = 0;
    private transient int MDbRX3TrHD = 1078822951;
    private static String[] nothing_to_see_here = new String[15];

    public ItemControlListener(ItemControl itemControl, int i) {
        int i2 = 663197763 ^ (420476318 ^ 672716950);
        int parseInt = 426395210 ^ (811955014 ^ Integer.parseInt("1067417671"));
        this.MDbRX3TrHD = 1078822951 ^ VUD8eh5iKn;
        int letwtsktwlmzzjgu = 1727982016 ^ letwtsktwlmzzjgu(parseInt, 1258225131);
        this.pickupMessageCooldown = new ConcurrentHashMap();
        this.itemControl = itemControl;
        this.config = itemControl.getConfiguration(656909831);
        this.cooldownManager = itemControl.getCooldownManager(26260283);
        int i3 = 1005514022 ^ (1610173844 ^ (1481596363 ^ (1195460943 ^ letwtsktwlmzzjgu)));
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerInteract(org.bukkit.event.player.PlayerInteractEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.listeners.ItemControlListener.onPlayerInteract(org.bukkit.event.player.PlayerInteractEvent):void");
    }

    private void handleCooldown(Player player, Material material, PlayerInteractEvent playerInteractEvent, int i) {
        int i2 = 2036496669 ^ (1649168894 ^ 1240261466);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1776919094) {
            int i3 = 525570101 ^ i2;
            if (player.hasPermission(oefxphfzmw(vrlgysqnuqnxann(), jgzpdgyisgdzcrf(), i3)) == (1301371788 ^ i3)) {
                int i4 = 642732907 ^ i3;
                long cooldown = this.config.getCooldown(material, 2112734933);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1592805179) {
                    int i5 = 715439288 ^ i4;
                    if ((cooldown > 0L ? 1 : (cooldown == 0L ? 0 : -1)) > (1098560607 ^ i5)) {
                        int i6 = 954692254 ^ i5;
                        if (this.cooldownManager.hasCooldown(player.getUniqueId(), material, 2090588642) == (2040383169 ^ i6)) {
                            i6 = 828980437 ^ i6;
                            player.setCooldown(material, Math.toIntExact(cooldown / 1000) * ((byte) (1224014336 ^ i6)));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1202180258) {
                                i4 = 649820334 ^ i6;
                                this.cooldownManager.setCooldown(player.getUniqueId(), material, cooldown, 544592014);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1920734675) {
                                    int i7 = 189188095 ^ i4;
                                    return;
                                }
                            }
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -856803829) {
                            i3 = 810806450 ^ i6;
                            playerInteractEvent.setCancelled((byte) (1238248050 ^ i3));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1316049818) {
                                i5 = 1085733591 ^ i3;
                                long remainingCooldown = this.cooldownManager.getRemainingCooldown(player.getUniqueId(), material, 168947119);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1271301408) {
                                    int i8 = 759908183 ^ i5;
                                    String formatTime = formatTime(remainingCooldown, 1227961308);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 563920793) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 563920793 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (913846511 ^ i8)) {
                                                int i9 = 1797781715 ^ i8;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1673538552 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1711297191 ^ i8)) {
                                                    break;
                                                }
                                            }
                                        }
                                        int i10 = 9332254 ^ i8;
                                        throw new IOException("double");
                                    }
                                    i2 = 509257855 ^ i8;
                                    ItemControlConfig itemControlConfig = this.config;
                                    String oefxphfzmw = oefxphfzmw(szllojsvdapipiy(), jgzpdgyisgdzcrf(), i2);
                                    String[] strArr = new String[(byte) (979976078 ^ i2)];
                                    strArr[(byte) (979976076 ^ i2)] = oefxphfzmw(veftzpgfrwjpjff(), jgzpdgyisgdzcrf(), i2);
                                    strArr[(byte) (979976077 ^ i2)] = formatTime;
                                    sendMessage(player, itemControlConfig.getMessage(oefxphfzmw, strArr, 839197008), 1433598768);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -750125983) {
                                        int i11 = 655514736 ^ i2;
                                        return;
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1202180258 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (586140388 ^ i6)) {
                                int i12 = 1160678883 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -856803829 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (917273039 ^ i6)) {
                                    break;
                                }
                            }
                        }
                        int i13 = 1321205998 ^ i6;
                        throw new IOException("double");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 198550266) {
                        int i14 = 1392332510 ^ i5;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1271301408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (437862256 ^ i5)) {
                            int i15 = 1815634235 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 198550266 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1741955666 ^ i5)) {
                                break;
                            }
                        }
                    }
                    int i16 = 501202649 ^ i5;
                    throw new RuntimeException("double");
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1592805179 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1720467557 ^ i4)) {
                        int i17 = 2116237495 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1920734675 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (118904315 ^ i4)) {
                            break;
                        }
                    }
                }
                int i18 = 988226445 ^ i4;
                throw new IOException("double");
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1821039714) {
                int i19 = 1612258204 ^ i3;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1316049818 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (852741239 ^ i3)) {
                    int i20 = 287241494 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -337960992 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (873058168 ^ i3)) {
                        int i21 = 1354651897 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1821039714 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2454470 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i22 = 1947320451 ^ i3;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -750125983 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1673356658 ^ i2)) {
                int i23 = 1009213428 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1776919094 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (642142701 ^ i2)) {
                    int i24 = 378728028 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1816264833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2058823724 ^ i2)) {
                        int i25 = 1092220262 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 675949099 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1334326123 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i26 = 352820446 ^ i2;
        throw new IllegalAccessException();
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerItemHeld(PlayerItemHeldEvent playerItemHeldEvent) {
        int i = 2049243833 ^ (119617088 ^ 1240261466);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1488356071) {
            int i2 = 1387887590 ^ i;
            Player player = playerItemHeldEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 847421995) {
                int i3 = 587082038 ^ i2;
                ItemStack item = player.getInventory().getItem(playerItemHeldEvent.getNewSlot());
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 628353946) {
                    i3 = 23546428 ^ i3;
                    if (item != null) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 776583802) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 776583802 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (445342154 ^ i3)) {
                                    break;
                                }
                            }
                            int i4 = 701734832 ^ i3;
                            throw new IOException("double");
                        }
                        int i5 = 1338403714 ^ i3;
                        if (item.getType() != Material.AIR) {
                            int i6 = 249920877 ^ i5;
                            if (player.hasPermission(oefxphfzmw(doejastpuwsvqok(), jgzpdgyisgdzcrf(), i6)) == (82452896 ^ i6)) {
                                i2 = letwtsktwlmzzjgu(i6, 261324204);
                                Material type = item.getType();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1540022368) {
                                    i2 = 932824997 ^ i2;
                                    if (this.config.isGloballyBanned(type, BanType.HOLD, 1268737127) == (1021352873 ^ i2)) {
                                        i5 = letwtsktwlmzzjgu(i2, 825664022);
                                        String playerRegion = getPlayerRegion(player, 1875956173);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1857146360) {
                                            int i7 = 360160085 ^ i5;
                                            if (playerRegion != null) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -988997808) {
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -988997808 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1342354028 ^ i7)) {
                                                            int i8 = 1019990914 ^ i7;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 389032441 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (89275067 ^ i7)) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    int i9 = 694859790 ^ i7;
                                                    throw new IllegalAccessException("double");
                                                }
                                                i2 = 620409465 ^ i7;
                                                if (this.config.isRegionBanned(playerRegion, type, BanType.HOLD, 1900804524) != (1012600979 ^ i2)) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -489126759) {
                                                        i = 781991518 ^ i2;
                                                        playerItemHeldEvent.setCancelled((byte) (315043532 ^ i));
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1774619032) {
                                                            int i10 = 555573450 ^ i;
                                                            sendMessage(player, this.config.getMessage(oefxphfzmw(dbiaqaiubeeycol(), jgzpdgyisgdzcrf(), i10), 1112270736), 1433598768);
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1630375879) {
                                                                int i11 = 2008410770 ^ i10;
                                                                return;
                                                            }
                                                            while (true) {
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1630375879 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (130666358 ^ i10)) {
                                                                    break;
                                                                }
                                                            }
                                                            int i12 = 2040708657 ^ i10;
                                                            throw new IllegalAccessException("double");
                                                        }
                                                    }
                                                }
                                                while (true) {
                                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                                        case 82857031:
                                                            int i13 = 2016719878 ^ i2;
                                                            return;
                                                        case 97359841:
                                                            return;
                                                        case 1025554572:
                                                    }
                                                }
                                            }
                                            while (true) {
                                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i7)) {
                                                    case 263795460:
                                                        int i14 = 1557005951 ^ i7;
                                                        return;
                                                    case 1158173052:
                                                    case 2045565691:
                                                        return;
                                                    case 2087134201:
                                                    default:
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1705468568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1523407411 ^ i7)) {
                                                                int i15 = 1457224649 ^ i7;
                                                                throw new IllegalAccessException("double");
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -419111607) {
                                        i6 = 1889526974 ^ i2;
                                        playerItemHeldEvent.setCancelled((byte) (1283424022 ^ i6));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1677457594) {
                                            i = 590586618 ^ i6;
                                            sendMessage(player, this.config.getMessage(oefxphfzmw(wfzretebhfbspqu(), jgzpdgyisgdzcrf(), i), 1112270736), 1433598768);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2053566315) {
                                                int i16 = 2080886336 ^ i;
                                                return;
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -419111607 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1558822336 ^ i2)) {
                                        int i17 = 1685561227 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1540022368 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2096065318 ^ i2)) {
                                            int i18 = 893477651 ^ i2;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 659623168) {
                                int i19 = 638330015 ^ i6;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1677457594 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (30782018 ^ i6)) {
                                    int i20 = 360086246 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 659623168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (911113052 ^ i6)) {
                                        break;
                                    }
                                }
                            }
                            int i21 = 1128883913 ^ i6;
                            throw new IOException("double");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1350231656) {
                            int i22 = 554141814 ^ i5;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1350231656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (240878853 ^ i5)) {
                                int i23 = 430754309 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1857146360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (848591125 ^ i5)) {
                                    break;
                                }
                            }
                        }
                        int i24 = 2011141820 ^ i5;
                        throw new IOException("double");
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                            case 120954592:
                                int i25 = 1858200564 ^ i3;
                                return;
                            case 279692040:
                            case 1797416087:
                                return;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 628353946 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1739860391 ^ i3)) {
                        int i26 = 18602657 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 595403946 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1937652817 ^ i3)) {
                            int i27 = 472324562 ^ i3;
                            throw new RuntimeException("double");
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -489126759 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1588995309 ^ i2)) {
                    int i28 = 580271625 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 847421995 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1101048057 ^ i2)) {
                        break;
                    }
                }
            }
            int i29 = 2050989202 ^ i2;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1774619032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1806348650 ^ i)) {
                int i30 = 214913738 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1481024985 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (502129349 ^ i)) {
                    int i31 = 143618080 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2053566315 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1593828386 ^ i)) {
                        int i32 = 1473512933 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1488356071 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1815389439 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i33 = 974748491 ^ i;
        throw new IOException();
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerPickupItem(org.bukkit.event.entity.EntityPickupItemEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.listeners.ItemControlListener.onPlayerPickupItem(org.bukkit.event.entity.EntityPickupItemEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerDropItem(org.bukkit.event.player.PlayerDropItemEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.listeners.ItemControlListener.onPlayerDropItem(org.bukkit.event.player.PlayerDropItemEvent):void");
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onProjectileLaunch(ProjectileLaunchEvent projectileLaunchEvent) {
        int i = 1855338683 ^ (1782386357 ^ 1240261466);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 1782491810) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1782491810 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (74842003 ^ i)) {
                    int i2 = 187342892 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1229173336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1436025696 ^ i)) {
                        break;
                    }
                }
            }
            int i3 = 732379990 ^ i;
            throw new IOException("double");
        }
        int i4 = 1088625086 ^ i;
        ProjectileSource shooter = projectileLaunchEvent.getEntity().getShooter();
        if ((shooter instanceof Player) == (228904170 ^ i4)) {
            int i5 = 4508605 ^ i4;
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1831233360) {
            i4 = 307875779 ^ i4;
            Player player = (Player) shooter;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1566392) {
                i4 = 829829015 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1952015857) {
                    int i6 = 1772479981 ^ i4;
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6) == 166388030) {
                            throw new IllegalAccessException();
                        }
                        throw null;
                    } catch (IllegalAccessException e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case 964053658:
                                i4 = 1724851457 ^ i6;
                                break;
                            case 1229173336:
                                i4 = 684300825 ^ i6;
                                break;
                            default:
                                throw new IllegalAccessException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 252666513) {
                            i4 = 468263005 ^ i4;
                            Material materialFromEntity = getMaterialFromEntity(projectileLaunchEvent.getEntity(), 1649113173);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -800694151) {
                                i4 = 1367726452 ^ i4;
                                if (materialFromEntity != null) {
                                    i4 = letwtsktwlmzzjgu(i4, 1554053758);
                                    if (player.hasPermission(oefxphfzmw(upvvligpexmeimr(), jgzpdgyisgdzcrf(), i4)) == (925757189 ^ i4)) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1183877079) {
                                            int i7 = 1711846951 ^ i4;
                                            handleCooldown(player, materialFromEntity, projectileLaunchEvent, 1579104744);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1993684718) {
                                                int i8 = 1813622694 ^ i7;
                                                return;
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 964053658 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1302231901 ^ i7)) {
                                                    int i9 = 485598216 ^ i7;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -370691039 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (777512890 ^ i7)) {
                                                        int i10 = 1605323855 ^ i7;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 725785627 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (3879010 ^ i7)) {
                                                            int i11 = 247586838 ^ i7;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1993684718 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (887720633 ^ i7)) {
                                                                int i12 = 411112146 ^ i7;
                                                                throw new IOException("double");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                            case 183027764:
                                                int i13 = 168892801 ^ i4;
                                                return;
                                            case 676717757:
                                            case 735993356:
                                                return;
                                        }
                                    }
                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1550363611) {
                                    int i14 = 249906936 ^ i4;
                                    return;
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1952015857 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (526660248 ^ i4)) {
                        int i15 = 281925551 ^ i4;
                        throw new RuntimeException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 252666513 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (980051012 ^ i4)) {
                int i16 = 467997999 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1550363611 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1361300341 ^ i4)) {
                    int i17 = 136936553 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1566392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2090560500 ^ i4)) {
                        int i18 = 815435602 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1862286008 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1910544836 ^ i4)) {
                            int i19 = 974630386 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1831233360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (303081598 ^ i4)) {
                                int i20 = 2116522903 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1183877079 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1265424654 ^ i4)) {
                                    int i21 = 1903665662 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -800694151 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2070852468 ^ i4)) {
                                        int i22 = 1003496732 ^ i4;
                                        throw new IOException();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onBlockPlace(BlockPlaceEvent blockPlaceEvent) {
        int i = 90316378 ^ (1484591219 ^ 1240261466);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1482724456) {
            int i2 = 1621688634 ^ i;
            Player player = blockPlaceEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1562942901) {
                int i3 = 638326144 ^ i2;
                if (player.hasPermission(oefxphfzmw(wcyzcjbqozzstdl(), jgzpdgyisgdzcrf(), i3)) == (1381431753 ^ i3)) {
                    int i4 = 1555540380 ^ i3;
                    Material type = blockPlaceEvent.getBlock().getType();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1997177512) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1997177512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (872552720 ^ i4)) {
                                break;
                            }
                        }
                        int i5 = 617667253 ^ i4;
                        throw new IOException("double");
                    }
                    int i6 = 228989049 ^ i4;
                    if (this.config.isGloballyBanned(type, BanType.PLACE, 1268737127) == (55003180 ^ i6)) {
                        i6 = letwtsktwlmzzjgu(i6, 1667228255);
                        String playerRegion = getPlayerRegion(player, 1875956173);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 12931995) {
                            i2 = 1618945490 ^ i6;
                            if (playerRegion != null) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 54295816) {
                                    i = 1061262258 ^ i2;
                                    if (this.config.isRegionBanned(playerRegion, type, BanType.PLACE, 1900804524) != (1059462163 ^ i)) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -114237287) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -114237287 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1067476505 ^ i)) {
                                                    break;
                                                }
                                            }
                                            int i7 = 147560586 ^ i;
                                            throw new IllegalAccessException("double");
                                        }
                                        i2 = 1010683032 ^ i;
                                        blockPlaceEvent.setCancelled((byte) (52154506 ^ i2));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 417236056) {
                                            i = 1398315974 ^ i2;
                                            sendMessage(player, this.config.getMessage(oefxphfzmw(qfkzwfevgtqwqyn(), jgzpdgyisgdzcrf(), i), 1112270736), 1433598768);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2112202134) {
                                                int i8 = 1895159131 ^ i;
                                                return;
                                            }
                                        }
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                                            case 173664578:
                                                int i9 = 529564165 ^ i;
                                                return;
                                            case 934397748:
                                            case 1100830263:
                                                return;
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 417236056 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1123729713 ^ i2)) {
                                        int i10 = 2118729156 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 54295816 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1547980592 ^ i2)) {
                                            break;
                                        }
                                    }
                                }
                                int i11 = 1010720268 ^ i2;
                                throw new IllegalAccessException("double");
                            }
                            while (true) {
                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                    case 6362817:
                                        int i12 = 550572471 ^ i2;
                                        return;
                                    case 405471699:
                                    case 1063843467:
                                        return;
                                }
                            }
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 440025440) {
                        i3 = 1031279861 ^ i6;
                        blockPlaceEvent.setCancelled((byte) (1044339928 ^ i3));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -235215159) {
                            int i13 = 297137262 ^ i3;
                            sendMessage(player, this.config.getMessage(oefxphfzmw(fsokcgkxuwjfkat(), jgzpdgyisgdzcrf(), i13), 1112270736), 1433598768);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 2085963193) {
                                int i14 = 1363011554 ^ i13;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 2085963193 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1738331300 ^ i13)) {
                                    break;
                                }
                            }
                            int i15 = 1158569238 ^ i13;
                            throw new IOException("double");
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 12931995 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (453879119 ^ i6)) {
                            int i16 = 603395046 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 440025440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (287951673 ^ i6)) {
                                break;
                            }
                        }
                    }
                    int i17 = 1661838737 ^ i6;
                    throw new IllegalAccessException("double");
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1833447862) {
                    int i18 = 729947043 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1833447862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1393859626 ^ i3)) {
                        int i19 = 807788315 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -235215159 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1956606312 ^ i3)) {
                            break;
                        }
                    }
                }
                int i20 = 224267918 ^ i3;
                throw new IOException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1562942901 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1390466981 ^ i2)) {
                    int i21 = 727639707 ^ i2;
                    throw new IOException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2112202134 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1762511443 ^ i)) {
                int i22 = 715550113 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1482724456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (561808378 ^ i)) {
                    int i23 = 1910156175 ^ i;
                    throw new IOException();
                }
            }
        }
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST, ignoreCancelled = true)
    public void onBlockBreak(org.bukkit.event.block.BlockBreakEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.listeners.ItemControlListener.onBlockBreak(org.bukkit.event.block.BlockBreakEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST, ignoreCancelled = true)
    public void onCraftItem(org.bukkit.event.inventory.CraftItemEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.listeners.ItemControlListener.onCraftItem(org.bukkit.event.inventory.CraftItemEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerConsume(org.bukkit.event.player.PlayerItemConsumeEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.listeners.ItemControlListener.onPlayerConsume(org.bukkit.event.player.PlayerItemConsumeEvent):void");
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerArmorEquip(PlayerInteractEvent playerInteractEvent) {
        int i = 1226217028 ^ (1457508631 ^ 1240261466);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1322442678) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1322442678 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1280879456 ^ i)) {
                    break;
                }
            }
            int i2 = 1724895811 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 177794356 ^ i;
        Player player = playerInteractEvent.getPlayer();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -437630486) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -437630486 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (472261575 ^ i3)) {
                    break;
                }
            }
            int i4 = 1381603111 ^ i3;
            throw new RuntimeException("double");
        }
        int i5 = 608409069 ^ i3;
        ItemStack item = playerInteractEvent.getItem();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -940120445) {
            int i6 = 481329721 ^ i5;
            if (item == null) {
                int i7 = 1439576614 ^ i6;
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 577959755) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 577959755 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (458632909 ^ i6)) {
                        break;
                    }
                }
                int i8 = 1419641285 ^ i6;
                throw new IllegalAccessException("double");
            }
            int i9 = 219769903 ^ i6;
            if (item.getType() == Material.AIR) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1253676595) {
                    int i10 = 1490509321 ^ i9;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1253676595 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (515384560 ^ i9)) {
                        break;
                    }
                }
                int i11 = 985097946 ^ i9;
                throw new RuntimeException("double");
            }
            i5 = letwtsktwlmzzjgu(i9, 2110094601);
            if (isArmorPiece(item.getType(), 1694383758) != (345133007 ^ i5)) {
                int letwtsktwlmzzjgu = letwtsktwlmzzjgu(i5, 1629612806);
                if (player.hasPermission(oefxphfzmw(qvzglxqixwzghci(), jgzpdgyisgdzcrf(), letwtsktwlmzzjgu)) != (1974707401 ^ letwtsktwlmzzjgu)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu) == -1382209973) {
                        int i12 = 13354740 ^ letwtsktwlmzzjgu;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu) == -1382209973 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu) == (125051516 ^ letwtsktwlmzzjgu)) {
                            break;
                        }
                    }
                    int i13 = 1165790521 ^ letwtsktwlmzzjgu;
                    throw new IOException("double");
                }
                int letwtsktwlmzzjgu2 = letwtsktwlmzzjgu(letwtsktwlmzzjgu, 547237707);
                Material type = item.getType();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu2) != -1452516334) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu2) == -1452516334 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu2) == (1863359766 ^ letwtsktwlmzzjgu2)) {
                            break;
                        }
                    }
                    int i14 = 1114094079 ^ letwtsktwlmzzjgu2;
                    throw new RuntimeException("double");
                }
                int i15 = 899790020 ^ letwtsktwlmzzjgu2;
                if (this.config.isGloballyBanned(type, BanType.WEAR, 1268737127) == (1619803974 ^ i15)) {
                    int letwtsktwlmzzjgu3 = letwtsktwlmzzjgu(i15, 61683974);
                    String playerRegion = getPlayerRegion(player, 1875956173);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu3) != 419967491) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu3) == 419967491 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu3) == (1240848079 ^ letwtsktwlmzzjgu3)) {
                                break;
                            }
                        }
                        int i16 = 1507556008 ^ letwtsktwlmzzjgu3;
                        throw new IllegalAccessException("double");
                    }
                    int i17 = 1924070417 ^ letwtsktwlmzzjgu3;
                    if (playerRegion == null) {
                        int i18 = 2048557619 ^ i17;
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1937780088) {
                        i17 = 1676744645 ^ i17;
                        if (this.config.isRegionBanned(playerRegion, type, BanType.WEAR, 1900804524) == (1920920980 ^ i17)) {
                            letwtsktwlmzzjgu(i17, 434869750);
                            return;
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1812501341) {
                            int i19 = 1777095309 ^ i17;
                            playerInteractEvent.setCancelled((byte) (462602008 ^ i19));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) != -594151224) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -594151224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (608144995 ^ i19)) {
                                        break;
                                    }
                                }
                                int i20 = 1310831502 ^ i19;
                                throw new IOException("double");
                            }
                            i15 = 1482095802 ^ i19;
                            sendMessage(player, this.config.getMessage(oefxphfzmw(fezslldeuwdmvza(), jgzpdgyisgdzcrf(), i15), 1112270736), 1433598768);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 505552154) {
                                int i21 = 676412353 ^ i15;
                                return;
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1937780088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (624312683 ^ i17)) {
                            int i22 = 897402161 ^ i17;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1812501341 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (629682459 ^ i17)) {
                                break;
                            }
                        }
                    }
                    int i23 = 463145605 ^ i17;
                    throw new RuntimeException("double");
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 73529907) {
                    int i24 = 197620726 ^ i15;
                    playerInteractEvent.setCancelled((byte) (1800096945 ^ i24));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i24) != 1515873667) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i24) == 1515873667 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i24) == (1746724695 ^ i24)) {
                                break;
                            }
                        }
                        int i25 = 1723302820 ^ i24;
                        throw new RuntimeException("double");
                    }
                    int i26 = 192332871 ^ i24;
                    sendMessage(player, this.config.getMessage(oefxphfzmw(goqigmagnzbpzci(), jgzpdgyisgdzcrf(), i26), 1112270736), 1433598768);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i26) == 32262075) {
                        int i27 = 1751816953 ^ i26;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i26) == -1945934215 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i26) == (820055498 ^ i26)) {
                            int i28 = 203522574 ^ i26;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i26) == 1554760467 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i26) == (1564284026 ^ i26)) {
                                int i29 = 1934398043 ^ i26;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i26) == 1501181305 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i26) == (456733295 ^ i26)) {
                                    int i30 = 1443092259 ^ i26;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i26) == 32262075 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i26) == (1543497751 ^ i26)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    int i31 = 347131793 ^ i26;
                    throw new RuntimeException();
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 505552154 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (1193747979 ^ i15)) {
                        int i32 = 1516339447 ^ i15;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 73529907 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (135404093 ^ i15)) {
                            break;
                        }
                    }
                }
                int i33 = 486176454 ^ i15;
                throw new RuntimeException("double");
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1533903240) {
                int i34 = 1069353312 ^ i5;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -940120445 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1452192006 ^ i5)) {
                int i35 = 1974661679 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1533903240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1236461273 ^ i5)) {
                    break;
                }
            }
        }
        int i36 = 897213200 ^ i5;
        throw new IOException("double");
    }

    private void handleCooldown(org.bukkit.entity.Player r8, org.bukkit.Material r9, org.bukkit.event.entity.ProjectileLaunchEvent r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.listeners.ItemControlListener.handleCooldown(org.bukkit.entity.Player, org.bukkit.Material, org.bukkit.event.entity.ProjectileLaunchEvent, int):void");
    }

    private boolean isArmorPiece(org.bukkit.Material r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.listeners.ItemControlListener.isArmorPiece(org.bukkit.Material, int):boolean");
    }

    private org.bukkit.Material getMaterialFromEntity(org.bukkit.entity.Entity r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.listeners.ItemControlListener.getMaterialFromEntity(org.bukkit.entity.Entity, int):org.bukkit.Material");
    }

    private boolean isProjectile(org.bukkit.Material r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.listeners.ItemControlListener.isProjectile(org.bukkit.Material, int):boolean");
    }

    private String getPlayerRegion(Player player, int i) {
        int i2;
        int i3 = 2037193814 ^ (684951204 ^ 1240261466);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1030501056) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2125923555 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (751758184 ^ i3)) {
                    int i4 = 515093445 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1030501056 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2110978905 ^ i3)) {
                        break;
                    }
                }
            }
            int i5 = 306844693 ^ i3;
            throw new IOException();
        }
        int i6 = 820031330 ^ i3;
        int i7 = i6;
        try {
            Class.forName(oefxphfzmw(nyiooxgifunuxog(), jgzpdgyisgdzcrf(), i7));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 1167504977) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1167504977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1118018909 ^ i7)) {
                        break;
                    }
                }
                int i8 = 1582780468 ^ i7;
                throw new IllegalAccessException("double");
            }
            int i9 = 168282629 ^ i7;
            String region = this.itemControl.getRegionHelper(2074370363).getRegion(player, 681705944);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 363390585) {
                i7 = 377544425 ^ i9;
                return region;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 363390585 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (28087377 ^ i9)) {
                    break;
                }
            }
            int i10 = 1773062988 ^ i9;
            throw new IllegalAccessException("double");
        } catch (ClassNotFoundException e) {
            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                case 363390585:
                    i2 = 1875588664 ^ i7;
                    break;
                case 1167504977:
                    i2 = 1707932733 ^ i7;
                    break;
                default:
                    throw new IOException("Error in hash");
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1810978746) {
                int i11 = 581487211 ^ i2;
                return null;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1810978746 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2058323414 ^ i2)) {
                    int i12 = 1270841227 ^ i2;
                    throw new IOException("double");
                }
            }
        }
    }

    private void sendMessage(Player player, String str, int i) {
        int i2 = 867500643 ^ (646747760 ^ 1240261466);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -424953270) {
            i2 = 93591998 ^ i2;
            if (str == null) {
                letwtsktwlmzzjgu(i2, 340701363);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -905218118) {
                int i3 = 1157589027 ^ i2;
                if (str.isEmpty() == (498992852 ^ i3)) {
                    i3 = 1726963713 ^ i3;
                    player.sendMessage(ChatFormater.color(str));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -628410709) {
                        int i4 = 1423486011 ^ i3;
                        return;
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -303024480) {
                    int i5 = 1353832592 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -628410709 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (937019423 ^ i3)) {
                        int i6 = 1521130589 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -303024480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1072947632 ^ i3)) {
                            break;
                        }
                    }
                }
                int i7 = 1109135249 ^ i3;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1753149986 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1515743064 ^ i2)) {
                int i8 = 700654801 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -424953270 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1114735829 ^ i2)) {
                    int i9 = 356318733 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2085508977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (322115456 ^ i2)) {
                        int i10 = 1331906341 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -905218118 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1043765281 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i11 = 494261420 ^ i2;
        throw new IllegalAccessException();
    }

    private void sendPickupMessage(Player player, String str, int i) {
        int letwtsktwlmzzjgu;
        int i2 = 1526603679 ^ (1191582246 ^ 1240261466);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1599654118) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1599654118 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (43407759 ^ i2)) {
                    break;
                }
            }
            int i3 = 2141660683 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1623775860 ^ i2;
        if (str == null) {
            int i5 = 1605537681 ^ i4;
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1495145287) {
            int i6 = 1396900108 ^ i4;
            if (str.isEmpty() != (1738489243 ^ i6)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1023012059) {
                    int i7 = 217157277 ^ i6;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1023012059 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1372528582 ^ i6)) {
                        break;
                    }
                }
                int i8 = 13159795 ^ i6;
                throw new RuntimeException("double");
            }
            int i9 = 1403499156 ^ i6;
            long currentTimeMillis = System.currentTimeMillis();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -1580959623) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1580959623 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (176268199 ^ i9)) {
                        break;
                    }
                }
                int i10 = 2138840270 ^ i9;
                throw new RuntimeException("double");
            }
            int i11 = 21254658 ^ i9;
            Long l = this.pickupMessageCooldown.get(player.getUniqueId());
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != -1410930583) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1410930583 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (179242187 ^ i11)) {
                        break;
                    }
                }
                int i12 = 1576579776 ^ i11;
                throw new RuntimeException("double");
            }
            int i13 = 1064032081 ^ i11;
            if (l != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1354257120) {
                    i13 = 1445498038 ^ i13;
                    if (((currentTimeMillis - l.longValue()) > MESSAGE_COOLDOWN_MS ? 1 : ((currentTimeMillis - l.longValue()) == MESSAGE_COOLDOWN_MS ? 0 : -1)) >= (1547667178 ^ i13)) {
                        letwtsktwlmzzjgu = letwtsktwlmzzjgu(i13, 1813428101);
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -503564462) {
                        int i14 = 1164699337 ^ i13;
                        return;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1534433331 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (2049657019 ^ i13)) {
                        int i15 = 849762552 ^ i13;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -503564462 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1627898443 ^ i13)) {
                            int i16 = 456481119 ^ i13;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -435286911 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1358869458 ^ i13)) {
                                int i17 = 848227192 ^ i13;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1354257120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1044928514 ^ i13)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                int i18 = 1570349153 ^ i13;
                throw new IOException();
            }
            letwtsktwlmzzjgu = letwtsktwlmzzjgu(i13, 977156915);
            this.pickupMessageCooldown.put(player.getUniqueId(), Long.valueOf(currentTimeMillis));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu) != -2125886599) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu) == -2125886599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu) == (1471929235 ^ letwtsktwlmzzjgu)) {
                        break;
                    }
                }
                int i19 = 1221451545 ^ letwtsktwlmzzjgu;
                throw new IllegalAccessException("double");
            }
            i4 = 458627885 ^ letwtsktwlmzzjgu;
            player.sendMessage(ChatFormater.color(str));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1543066129) {
                int i20 = 398388178 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1543066129 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2029319624 ^ i4)) {
                int i21 = 983680088 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1495145287 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (801525985 ^ i4)) {
                    break;
                }
            }
        }
        int i22 = 233497776 ^ i4;
        throw new IllegalAccessException("double");
    }

    private String formatTime(long j, int i) {
        int i2;
        int i3 = 131029725 ^ (1699662590 ^ 1240261466);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1533778889) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1533778889 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1382462909 ^ i3)) {
                    break;
                }
            }
            int i4 = 2113652049 ^ i3;
            throw new IOException("double");
        }
        int i5 = 14520177 ^ i3;
        long j2 = j / 1000;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1569185857) {
            i5 = 1497390630 ^ i5;
            if ((j2 > 60L ? 1 : (j2 == 60L ? 0 : -1)) >= (1928372782 ^ i5)) {
                int letwtsktwlmzzjgu = letwtsktwlmzzjgu(i5, 1797635823);
                if ((j2 > 3600L ? 1 : (j2 == 3600L ? 0 : -1)) >= (433396929 ^ letwtsktwlmzzjgu)) {
                    i2 = 144127940 ^ letwtsktwlmzzjgu;
                    long j3 = j2 / 3600;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1978574808) {
                        int i6 = 1174346019 ^ i2;
                        long j4 = (j2 % 3600) / 60;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1511419598) {
                            int i7 = 1491656211 ^ i6;
                            return j3 + "h " + j3 + "m";
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1655660968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1461364031 ^ i6)) {
                                int i8 = 1015641570 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 174279536 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (104273392 ^ i6)) {
                                    int i9 = 836696573 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1511419598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1666300694 ^ i6)) {
                                        break;
                                    }
                                }
                            }
                        }
                        int i10 = 980835653 ^ i6;
                        throw new IllegalAccessException("double");
                    }
                } else {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu) != -827791864) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu) == -827791864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(letwtsktwlmzzjgu) == (342683884 ^ letwtsktwlmzzjgu)) {
                                break;
                            }
                        }
                        int i11 = 1493008694 ^ letwtsktwlmzzjgu;
                        throw new IOException("double");
                    }
                    i5 = 1178144038 ^ letwtsktwlmzzjgu;
                    long j5 = j2 / 60;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -10449094) {
                        i2 = 1491261634 ^ i5;
                        long j6 = j2 % 60;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 947276072) {
                            int i12 = 105029707 ^ i2;
                            return j5 + "m " + j5 + "s";
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 947276072 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (309103775 ^ i2)) {
                        int i13 = 1902492458 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1978574808 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (692171341 ^ i2)) {
                            break;
                        }
                    }
                }
                int i14 = 233371303 ^ i2;
                throw new IllegalAccessException("double");
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1752886925) {
                int i15 = 788155580 ^ i5;
                return j2 + "s";
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1752886925 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1306647505 ^ i5)) {
                int i16 = 469416819 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -10449094 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1263607231 ^ i5)) {
                    int i17 = 1023089683 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1569185857 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (159782495 ^ i5)) {
                        break;
                    }
                }
            }
        }
        int i18 = 1629148245 ^ i5;
        throw new RuntimeException();
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
        VUD8eh5iKn = (-58031141) ^ new Random(-3312090649366287741L).nextInt();
    }

    public static String oefxphfzmw(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] jgzpdgyisgdzcrf() {
        return new byte[]{63, 74, 4, 92, 54, 67, 15, 34, 22, 106, 23, 109, 105, 58, 6, 34, 49, 60, 44, 72, 125, 50, 99, 72, 57, 78, 49, 95, 61, 31, 91, 53, 123, 8, 106, 98, 29, 95, 124, 101, 109, 114, 86, 45, 24, 28, 42, 22, 108, 66, Byte.MAX_VALUE, 86, 75, 101, 10, 2, 98, 15, 46};
    }

    private static byte[] qyxmytlgugiytma() {
        return new byte[]{-14, -115, 52, 12, 3, 4, 63, 115, 35, 52, 47, 62, 80, 96, 53, 124, 5, 125, 31, 2, 77, 100, 86, 23, 9, 84, 4, 14, 5, 86, 98, 112, 72, 89, 94, 36, 46, 20, 76, 114, 88, 35, 102, 120, 45, 65};
    }

    private static byte[] muhjhlwqfnmcdag() {
        return new byte[]{-16, -123, 61, 5, 3, 15, 62, Byte.MAX_VALUE, 33, 55, 38, 112, 80, 104, 51, 123, 0, 106, 27, 22, 76, 103, 90, 28, 12, 91, 0, 21, 10, 74, 106, 98, 66, 81, 95, 53, 44, 9};
    }

    private static byte[] rzncjksaowhkggf() {
        return new byte[]{-11, -124, 52, 6, 5, 5, 56, 113, 47, 51, 38, 112, 90, 107, 52, 116, 7, 107, 24, 23, 77, 100, 80, 30};
    }

    private static byte[] vrlgysqnuqnxann() {
        return new byte[]{-16, -122, 52, 4, 5, 0, 62, 112, 46, 63, 38, 61, 89, 100, 53, 123, 0, Byte.MAX_VALUE, 20, 2, 76, 110, 83, 21, 10, 87, 0, 10, 5, 94, 106, 118, 75, 88, 89, 38, 44, 27, 68, 115, 92, 34, 102, 115, 43, 68, 27, 77, 84, 30, 78, 10, 123, 35, 57, 91};
    }

    private static byte[] szllojsvdapipiy() {
        return new byte[]{-8, -126, 61, 6, 1, 26, 63, 122, 32, 63, 32, 48, 80, 98, 48, 101, 6, 100, 21, 82, 68, 106, 84, 29, 9, 13, 7, 15, 10, 80, 98, 103};
    }

    private static byte[] veftzpgfrwjpjff() {
        return new byte[]{-8, -126, 61, 17, 1, 28, 63, 120, 32, 54};
    }

    private static byte[] wfzretebhfbspqu() {
        return new byte[]{-16, -115, 50, 2, 5, 7, 55, 114, 36, 50, 38, 120, 95, 111, 53, 115, 9, 103, 30, 19, 76, 111, 85, 27};
    }

    private static byte[] dbiaqaiubeeycol() {
        return new byte[]{-7, -125, 61, 12, 2, 3, 55, 116, 47, 63, 33, 121, 80, 108, 50, 123, 2, 107, 20, 16, 68, 110, 87, 24, 1, 80, 8, 21, 11, 67, 98, 102, 79, 89, 89, 52, 37, 7};
    }

    private static byte[] doejastpuwsvqok() {
        return new byte[]{-7, -121, 48, 0, 4, 15, 54, 113, 46, 53, 35, 59, 91, 109, 63, 122, 9, 122, 24, 15, 79, 101, 90, 18, 1, 82, 5, 8, 15, 94, 98, 115, 67, 91, 94, 36, 47, 20, 69, 125, 85, 34, 98, 121, 42, 74};
    }

    private static byte[] gixyhdrqxydueso() {
        return new byte[]{-16, -121, 61, 1, 0, 15, 63, Byte.MAX_VALUE, 38, 54, 38, 60, 80, 97, 48, 116, 1, 112, 28, 11, 76, 111, 90, 16, 15, 88, 1, 5, 13, 87, 106, 119, 66, 93, 92, 41, 45, 20, 76, 122, 92, 34, 111, 120, 46, 74};
    }

    private static byte[] gdzuredakkfdlld() {
        return new byte[]{-13, -116, 48, 13, 4, 0, 59, Byte.MAX_VALUE, 46, 53, 46, 116, 81, 106, 49, 119, 9, 106, 30, 31, 73, 111, 81, 27};
    }

    private static byte[] kaqiuxhnkgrfaut() {
        return new byte[]{-13, -123, 52, 7, 0, 6, 60, 117, 35, 55, 37, 112, 89, 106, 48, 114, 2, 96, 25, 22, 79, 103, 83, 30, 15, 82, 2, 31, 8, 74, 105, 98, 75, 83, 92, 60, 46, 3};
    }

    private static byte[] elmmomamhdervtn() {
        return new byte[]{-10, Byte.MIN_VALUE, 50, 0, 4, 6, 61, 113, 36, 48, 34, 118, 92, 106, 55, 113, 7, 96, 27, 19, 75, 98, 81, 29, 11, 85, 3, 26, 8, 76, 110, 96, 74, 83, 92, 63, 42, 4};
    }

    private static byte[] takrdfuupmtclns() {
        return new byte[]{-16, -122, 52, 5, 5, 15, 61, 126, 36, 54, 38, 61, 89, 101, 53, 116, 3, 113, 30, 11, 76, 110, 83, 20, 10, 88, 3, 4, 15, 87, 106, 118, 75, 89, 89, 41, 47, 21, 78, 122, 92, 35, 102, 124, 43, 74};
    }

    private static byte[] clunmrhxgkyylfu() {
        return new byte[]{-12, -124, 55, 2, 1, 14, 54, 114, 39, 52, 32, 119, 80, 97, 51, 114, 2, 101, 27, 31, 68, 98, 82, 31};
    }

    private static byte[] upvvligpexmeimr() {
        return new byte[]{-8, -121, 49, 2, 3, 0, 62, Byte.MAX_VALUE, 47, 62, 37, 59, 94, 96, 49, 125, 9, 113, 21, 8, 72, 106, 86, 19, 8, 88, 8, 4, 15, 83, 108, 112, 76, 88, 82, 40, 36, 30, 73, 124, 88, 38, 103, 122, 33, 74, 24, 79, 91, 19, 72, 8, 115, 43, 51, 94};
    }

    private static byte[] qfkzwfevgtqwqyn() {
        return new byte[]{-16, -122, 48, 3, 3, 15, 56, 115, 32, 62, 38, 115, 93, 110, 51, 123, 6, 102, 26, 31, 76, 100, 87, 26, 12, 91, 6, 25, 11, 67, 106, 97, 79, 87, 95, 53, 42, 5};
    }

    private static byte[] fsokcgkxuwjfkat() {
        return new byte[]{-10, -116, 51, 3, 7, 1, 60, 118, 39, 48, 46, 119, 95, 105, 48, 112, 0, 99, 27, 31, 74, 97, 82, 26};
    }

    private static byte[] wcyzcjbqozzstdl() {
        return new byte[]{-16, -122, 60, 4, 2, 4, 62, 112, 35, 52, 38, 61, 81, 100, 50, Byte.MAX_VALUE, 0, Byte.MAX_VALUE, 25, 9, 76, 110, 91, 21, 13, 83, 0, 10, 8, 85, 106, 118, 67, 88, 94, 34, 44, 27, 73, 120, 92, 35, 110, 125, 44, 65};
    }

    private static byte[] eblauxocurpezrg() {
        return new byte[]{-16, -125, 52, 3, 7, 7, 63, 113, 32, 49, 38, 118, 89, 110, 55, 115, 1, 100, 26, 16, 76, 97, 83, 26, 8, 83, 1, 27, 11, 76, 106, 100, 75, 87, 91, 61, 45, 7};
    }

    private static byte[] ezditounpvvtdvt() {
        return new byte[]{-13, -123, 50, 13, 2, 4, 60, 116, 37, 53, 39, 56, 81, 97, 53, Byte.MAX_VALUE, 2, 123, 30, 10, 75, 101, 87, 23, 10, 83, 2, 15, 13, 80, 99, 113, 72, 90, 89, 34, 47, 28, 74, 115, 89, 35, 101, Byte.MAX_VALUE, 43, 64};
    }

    private static byte[] lbqfwevldbbennx() {
        return new byte[]{-16, -116, 55, 3, 4, 5, 54, 113, 46, 50, 38, 121, 90, 110, 52, 113, 8, 100, 20, 19, 76, 110, 80, 26};
    }

    private static byte[] jytwxxeixgrdpmw() {
        return new byte[]{-8, -125, 53, 3, 1, 2, 55, Byte.MAX_VALUE, 39, 62, 33, 63, 95, 98, 51, 116, 9, 121, 21, 12, 76, 107, 84, 17, 1, 88, 0, 4, 11, 87, 109, 114, 78, 81, 82, 32, 36, 26, 77, 125, 90, 37, 110, 116, 41, 75};
    }

    private static byte[] gynyrtomewjtzbm() {
        return new byte[]{-16, -121, 55, 13, 4, 3, 61, 113, 33, 62, 38, 114, 90, 96, 52, 119, 3, 100, 27, 31, 76, 101, 80, 20};
    }

    private static byte[] jemutsbrcytktlb() {
        return new byte[]{-11, -123, 51, 0, 0, 3, 63, Byte.MAX_VALUE, 39, 51, 39, 119, 92, 110, 50, 115, 9, 99, 24, 22, 74, 98, 85, 24, 9, 91, 0, 25, 13, 77, 110, 100, 79, 81, 82, 60, 41, 1};
    }

    private static byte[] eradxxfvbebbdgw() {
        return new byte[]{-16, -127, 61, 2, 4, 15, 55, Byte.MAX_VALUE, 38, 54, 38, 116, 80, 111, 52, 123, 9, 106, 28, 23, 76, 99, 90, 27, 11, 91, 9, 21, 13, 75, 106, 102, 66, 86, 88, 53, 37, 9};
    }

    private static byte[] gtbaigmifcdrmju() {
        return new byte[]{-16, -122, 49, 12, 14, 15, 59, 115, 32, 54, 36, 59, 80, 109, 62, 120, 5, 126, 29, 9, 72, 100, 91, 28, 13, 84, 7, 12, 14, 83, 98, 125, 67, 93, 94, 39, 44, 31, 73, 114, 85, 40, 98, 120, 46, 67};
    }

    private static byte[] ikutymmutctoktr() {
        return new byte[]{-16, Byte.MIN_VALUE, 61, 4, 0, 1, 57, 112, 33, 48, 38, 117, 80, 105, 48, 117, 7, 101, 27, 17, 76, 98, 90, 29};
    }

    private static byte[] goqigmagnzbpzci() {
        return new byte[]{-16, -125, 53, 1, 0, 3, 58, 115, 47, 50, 38, 118, 88, 108, 48, 119, 4, 102, 21, 19, 76, 97, 82, 24};
    }

    private static byte[] qvzglxqixwzghci() {
        return new byte[]{-16, -116, 51, 1, 1, 7, 56, 115, 38, 54, 38, 55, 94, 97, 49, 124, 6, 124, 28, 11, 76, 100, 84, 16, 14, 80, 6, 9, 13, 87, 106, 124, 76, 93, 93, 33, 42, 24, 76, 122, 92, 41, 97, 120, 47, 66};
    }

    private static byte[] fezslldeuwdmvza() {
        return new byte[]{-16, -124, 55, 3, 15, 4, 58, Byte.MAX_VALUE, 34, 52, 38, 113, 90, 110, 63, 112, 4, 106, 24, 21, 76, 102, 80, 26, 0, 80, 4, 21, 9, 73, 106, 99, 72, 87, 83, 62, 40, 9};
    }

    private static byte[] hmuierqmejdaywh() {
        return new byte[]{-13, -123, 53, 10, 5, 27, 56, Byte.MAX_VALUE, 34, 54, 37, 57, 88, 96, 53, 98, 6, 96, 24, 85, 79, 99, 82, 30, 10, 13, 6, 4, 9, 89, 105, 96};
    }

    private static byte[] xaxzvcpwutvixcd() {
        return new byte[]{-13, -123, 53, 29, 5, 29, 56, 125, 34, 63};
    }

    private static byte[] bjggghiofuokwwj() {
        return new byte[]{-16, -126, 54, 7, 6, 2, 56, 126, 46, 48, 38, 57, 91, 103, 54, 121, 6, 113, 20, 13, 76, 106, 81, 22, 9, 85, 6, 4, 5, 81, 106, 114, 73, 91, 90, 36, 42, 21, 68, 124, 92, 38, 100, 112, 40, 70, 29, 67, 84, 17, 78, 14, 121, 32, 58, 89};
    }

    private static byte[] vmugsvnfjqzqtjk() {
        return new byte[]{-14, -121, 54, 48, 15, 56, 62, 91, 39, 22, 37, 11, 90, 80};
    }

    private static byte[] cftyszqlzwdqfpj() {
        return new byte[]{-14, -115, 51, 52, 2, 53, 62, 94, 37, 23, 32, 9, 93, 91, 55, 70, 2, 72, 27, 62, 73, 83, 82, 57};
    }

    private static byte[] seckrfbgjxojcse() {
        return new byte[]{-16, Byte.MIN_VALUE, 54, 54, 2, 59, 60, 86, 39, 17, 38, 21, 91, 74, 50, 70};
    }

    private static byte[] tboanapavwnlcth() {
        return new byte[]{-16, -121, 61, 59, 6, 54, 58, 85, 38, 21, 38, 24, 80, 75, 54, 85, 4, 73, 28, 35};
    }

    private static byte[] bdnqdzsxdpfusyd() {
        return new byte[]{-16, -121, 53, 41, 2, 57, 59, 66, 32, 15, 38, 13, 88, 75};
    }

    private static byte[] nyiooxgifunuxog() {
        return new byte[]{-9, -115, 54, 7, 6, 21, 63, 124, 34, 114, 47, 44, 81, 97, 63, 42, 2, 49, 26, 1, 79, 36, 83, 6, 9, 18, 5, 27, 5, 65, 99, 97, 66, 95, 89, 35, 43, 6, 78, 47, 93, 47, 102, 48, 44, 125, 18, 75, 84, 0, 70, 10, 120, 53, 60, 125, 80, 66, 30, 103, 122, 69, 104, 100};
    }

    private static int letwtsktwlmzzjgu(int i, int i2) {
        return i2 ^ i;
    }
}
