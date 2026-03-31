package com.kammoun.donutCore.spawn.listener;

import com.kammoun.donutCore.spawn.SpawnPlugin;
import com.kammoun.donutCore.spawn.commands.BuildCommand;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

public class SpawnProtectionListener implements Listener {
    private final SpawnPlugin plugin;
    private static int wmrsL2Dfvo = 0;
    private transient int XgtD3SaWYz = 1989718739;
    private static byte[] ttkuurcyov;
    private static String[] nothing_to_see_here = new String[15];

    public SpawnProtectionListener(SpawnPlugin spawnPlugin, int i) {
        hkpoxvnhgcmyykmd(1828262334 ^ 564824900, 278140822);
        int parseInt = 1518983294 ^ (958554626 ^ Integer.parseInt("1047279376"));
        this.XgtD3SaWYz = 1989718739 ^ wmrsL2Dfvo;
        this.plugin = spawnPlugin;
        int i2 = 1205226031 ^ (623196515 ^ (832389205 ^ parseInt));
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onBlockBreak(BlockBreakEvent blockBreakEvent) {
        int i = 1786634841 ^ (1937680967 ^ 456536818);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 296474464) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 296474464 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1014952224 ^ i)) {
                    break;
                }
            }
            int i2 = 1571625147 ^ i;
            throw new RuntimeException("double");
        }
        int i3 = 970295896 ^ i;
        if (this.plugin.isBlockBreakProtection(169326617) == (1004597428 ^ i3)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -553155167) {
                int i4 = 1328834008 ^ i3;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -553155167 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2000289529 ^ i3)) {
                    break;
                }
            }
            int i5 = 1333635751 ^ i3;
            throw new IllegalAccessException("double");
        }
        int i6 = 1253072935 ^ i3;
        Player player = blockBreakEvent.getPlayer();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1971026789) {
            int i7 = 103478171 ^ i6;
            if (BuildCommand.builders.contains(player.getUniqueId()) == (2004509448 ^ i7)) {
                i6 = hkpoxvnhgcmyykmd(i7, 1444576264);
                if (this.plugin.hasProtectionBypass(player, 680933645) == (559947520 ^ i6)) {
                    i7 = 536248919 ^ i6;
                    if (this.plugin.isInSpawnRadius(blockBreakEvent.getBlock().getLocation(), 915841467) == (1050058071 ^ i7)) {
                        int i8 = 555519548 ^ i7;
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -189470023) {
                        int i9 = 641783476 ^ i7;
                        blockBreakEvent.setCancelled((byte) (416697314 ^ i9));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -961388776) {
                            int i10 = 123492488 ^ i9;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -961388776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1863436203 ^ i9)) {
                                break;
                            }
                        }
                        int i11 = 157309575 ^ i9;
                        throw new RuntimeException("double");
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 184612865) {
                    int i12 = 2028577320 ^ i6;
                    return;
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1143793597) {
                int i13 = 2108856201 ^ i7;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1143793597 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1009079305 ^ i7)) {
                    int i14 = 2020961824 ^ i7;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -189470023 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1358708626 ^ i7)) {
                        break;
                    }
                }
            }
            int i15 = 1521018541 ^ i7;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1499157661 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1039706647 ^ i6)) {
                int i16 = 1397604453 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -867309246 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (871828610 ^ i6)) {
                    int i17 = 932968685 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1971026789 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1125037675 ^ i6)) {
                        int i18 = 1547045326 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 184612865 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (564604629 ^ i6)) {
                            break;
                        }
                    }
                }
            }
        }
        int i19 = 1742131820 ^ i6;
        throw new IOException();
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH)
    public void onBlockPlace(org.bukkit.event.block.BlockPlaceEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.listener.SpawnProtectionListener.onBlockPlace(org.bukkit.event.block.BlockPlaceEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST)
    public void onPvP(org.bukkit.event.entity.EntityDamageByEntityEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.listener.SpawnProtectionListener.onPvP(org.bukkit.event.entity.EntityDamageByEntityEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH)
    public void onFallDamage(org.bukkit.event.entity.EntityDamageEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.listener.SpawnProtectionListener.onFallDamage(org.bukkit.event.entity.EntityDamageEvent):void");
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onVoidDamage(EntityDamageEvent entityDamageEvent) {
        int i = 1888354921 ^ (1180910857 ^ 456536818);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 1859890321) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1859890321 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1090826227 ^ i)) {
                    break;
                }
            }
            int i2 = 161741988 ^ i;
            throw new RuntimeException("double");
        }
        int i3 = 184372985 ^ i;
        if (this.plugin.isFallDamageProtection(1698184032) == (656817003 ^ i3)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 959568729) {
                int i4 = 1129310674 ^ i3;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1777248736 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1396137918 ^ i3)) {
                    int i5 = 11193603 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 959568729 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (64874557 ^ i3)) {
                        int i6 = 285474359 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1557904208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (254678794 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i7 = 1629329677 ^ i3;
            throw new RuntimeException("double");
        }
        int hkpoxvnhgcmyykmd = hkpoxvnhgcmyykmd(i3, 1488568287);
        Player entity = entityDamageEvent.getEntity();
        if ((entity instanceof Player) == (2141160628 ^ hkpoxvnhgcmyykmd)) {
            int i8 = 220257039 ^ hkpoxvnhgcmyykmd;
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == -50584157) {
            hkpoxvnhgcmyykmd = 1908820457 ^ hkpoxvnhgcmyykmd;
            Player player = entity;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == 1926130408) {
                int i9 = 1113413912 ^ hkpoxvnhgcmyykmd;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1613013546) {
                    int i10 = 1413484553 ^ i9;
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i10) == 251975703) {
                            throw new RuntimeException();
                        }
                        throw null;
                    } catch (RuntimeException e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case -1037819296:
                                hkpoxvnhgcmyykmd = 1905224689 ^ i10;
                                break;
                            case 1777248736:
                                hkpoxvnhgcmyykmd = 1693858433 ^ i10;
                                break;
                            default:
                                throw new IllegalAccessException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == 1314881003) {
                            i9 = 1687642630 ^ hkpoxvnhgcmyykmd;
                            if (entityDamageEvent.getCause() == EntityDamageEvent.DamageCause.VOID) {
                                i9 = 1727616963 ^ i9;
                                if (this.plugin.isInSpawnRadius(player.getLocation(), 915841467) == (1806031480 ^ i9)) {
                                    hkpoxvnhgcmyykmd(i9, 402223794);
                                    return;
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1563349955) {
                                    int i11 = 28722647 ^ i9;
                                    entityDamageEvent.setCancelled((byte) (1779670958 ^ i11));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1352465787) {
                                        hkpoxvnhgcmyykmd = 808270040 ^ i11;
                                        if (this.plugin.getMainSpawn(927603613) == null) {
                                            int i12 = 643960765 ^ hkpoxvnhgcmyykmd;
                                            return;
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == -772457542) {
                                            hkpoxvnhgcmyykmd = 1484904508 ^ hkpoxvnhgcmyykmd;
                                            if (this.plugin.getMainSpawn(927603613).getLocation(791337258) != null) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == 368835160) {
                                                    hkpoxvnhgcmyykmd = 1637713499 ^ hkpoxvnhgcmyykmd;
                                                    player.teleport(this.plugin.getMainSpawn(927603613).getLocation(791337258));
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == 420989059) {
                                                        int i13 = 528372186 ^ hkpoxvnhgcmyykmd;
                                                        return;
                                                    }
                                                }
                                            }
                                            while (true) {
                                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(hkpoxvnhgcmyykmd)) {
                                                    case 43222505:
                                                        int i14 = 2128861057 ^ hkpoxvnhgcmyykmd;
                                                        return;
                                                    case 1328528858:
                                                        return;
                                                    case 1622106801:
                                                }
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1352465787 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (2059515559 ^ i11)) {
                                                int i15 = 510985411 ^ i11;
                                                throw new IOException("double");
                                            }
                                        }
                                    }
                                }
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1793355224) {
                                int i16 = 423101741 ^ i9;
                                return;
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1613013546 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1172824612 ^ i9)) {
                        int i17 = 1464240781 ^ i9;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1793355224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (770412848 ^ i9)) {
                            int i18 = 1237982178 ^ i9;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1563349955 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1467860384 ^ i9)) {
                                int i19 = 2093239642 ^ i9;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == 420989059 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == (358237453 ^ hkpoxvnhgcmyykmd)) {
                int i20 = 517893318 ^ hkpoxvnhgcmyykmd;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == -50584157 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == (569575201 ^ hkpoxvnhgcmyykmd)) {
                    int i21 = 44675584 ^ hkpoxvnhgcmyykmd;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == 1314881003 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == (351011812 ^ hkpoxvnhgcmyykmd)) {
                        int i22 = 784482598 ^ hkpoxvnhgcmyykmd;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == 1926130408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == (134026957 ^ hkpoxvnhgcmyykmd)) {
                            int i23 = 725328487 ^ hkpoxvnhgcmyykmd;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == -772457542 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == (1611854483 ^ hkpoxvnhgcmyykmd)) {
                                int i24 = 1457055533 ^ hkpoxvnhgcmyykmd;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == -488290733 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == (72620314 ^ hkpoxvnhgcmyykmd)) {
                                    int i25 = 1280237799 ^ hkpoxvnhgcmyykmd;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == 368835160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == (1428176598 ^ hkpoxvnhgcmyykmd)) {
                                        int i26 = 1139547308 ^ hkpoxvnhgcmyykmd;
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

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH)
    public void onFireDamage(org.bukkit.event.entity.EntityDamageEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.listener.SpawnProtectionListener.onFireDamage(org.bukkit.event.entity.EntityDamageEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH)
    public void onHungerLoss(org.bukkit.event.entity.FoodLevelChangeEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.listener.SpawnProtectionListener.onHungerLoss(org.bukkit.event.entity.FoodLevelChangeEvent):void");
    }

    @EventHandler
    public void onItemDrop(PlayerDropItemEvent playerDropItemEvent) {
        int i = 2080999542 ^ (1609252721 ^ 456536818);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -962318423) {
            i = 1180240746 ^ i;
            if (this.plugin.isDropProtection(405676950) != (2123206303 ^ i)) {
                int hkpoxvnhgcmyykmd = hkpoxvnhgcmyykmd(i, 1307095399);
                Player player = playerDropItemEvent.getPlayer();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) != -1691746367) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == -1691746367 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == (2042150385 ^ hkpoxvnhgcmyykmd)) {
                            int i2 = 453654781 ^ hkpoxvnhgcmyykmd;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == -1331317935 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hkpoxvnhgcmyykmd) == (639460654 ^ hkpoxvnhgcmyykmd)) {
                                break;
                            }
                        }
                    }
                    int i3 = 990555317 ^ hkpoxvnhgcmyykmd;
                    throw new IllegalAccessException("double");
                }
                int i4 = 1709439740 ^ hkpoxvnhgcmyykmd;
                if (this.plugin.hasProtectionBypass(player, 680933645) != (1451672836 ^ i4)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1271519198) {
                        int i5 = 2031918840 ^ i4;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1271519198 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1861468916 ^ i4)) {
                            int i6 = 1910888357 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 322532291 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1121804837 ^ i4)) {
                                break;
                            }
                        }
                    }
                    int i7 = 1565994910 ^ i4;
                    throw new IOException("double");
                }
                i = hkpoxvnhgcmyykmd(i4, 248970245);
                if (this.plugin.isInSpawnRadius(player.getLocation(), 915841467) == (1481652481 ^ i)) {
                    int i8 = 976689017 ^ i;
                    return;
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1031682038) {
                    i = 835544407 ^ i;
                    playerDropItemEvent.setCancelled((byte) (1771920471 ^ i));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1290461875) {
                        int i9 = 200962606 ^ i;
                        return;
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -194218757) {
                int i10 = 1218001141 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -194218757 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1230540437 ^ i)) {
                int i11 = 1151603480 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1031682038 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1546245658 ^ i)) {
                    int i12 = 1045705529 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1290461875 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (610235887 ^ i)) {
                        int i13 = 1903280834 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -962318423 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (9979549 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i14 = 1557265767 ^ i;
        throw new IOException();
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerDeath(PlayerDeathEvent playerDeathEvent) {
        int i = 177131915 ^ (1839796760 ^ 456536818);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -527463669) {
            i = 96981698 ^ i;
            if (this.plugin.isDropProtection(405676950) != (2044076963 ^ i)) {
                int i2 = 1114423782 ^ i;
                Player entity = playerDeathEvent.getEntity();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -573107671) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -573107671 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (455693506 ^ i2)) {
                            break;
                        }
                    }
                    int i3 = 633428891 ^ i2;
                    throw new IllegalAccessException("double");
                }
                int i4 = 880638803 ^ i2;
                if (this.plugin.hasProtectionBypass(entity, 680933645) == (264739094 ^ i4)) {
                    i = 1186263388 ^ i4;
                    if (this.plugin.isInSpawnRadius(entity.getLocation(), 915841467) != (1232300106 ^ i)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 1268466258) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1268466258 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1982085463 ^ i)) {
                                    break;
                                }
                            }
                            int i5 = 413056291 ^ i;
                            throw new IOException("double");
                        }
                        i4 = 749160975 ^ i;
                        playerDeathEvent.getDrops().clear();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 782307883) {
                            i = 1141547998 ^ i4;
                            playerDeathEvent.setDroppedExp((byte) (568230299 ^ i));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 250875097) {
                                int i6 = 147944866 ^ i;
                                return;
                            }
                        }
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                            case 240112508:
                                int i7 = 1618779251 ^ i;
                                return;
                            case 1135951365:
                                return;
                            case 2005740276:
                        }
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2117912752) {
                    int i8 = 1505703437 ^ i4;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2117912752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (381129101 ^ i4)) {
                        int i9 = 2065280906 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 782307883 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1749085262 ^ i4)) {
                            break;
                        }
                    }
                }
                int i10 = 983318648 ^ i4;
                throw new RuntimeException("double");
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -827253477) {
                int i11 = 282843124 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1278904102 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1501918248 ^ i)) {
                int i12 = 1646771552 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -827253477 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1727749183 ^ i)) {
                    int i13 = 1067976706 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1215275707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (830957276 ^ i)) {
                        int i14 = 36317844 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 250875097 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1619962106 ^ i)) {
                            int i15 = 244999669 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -527463669 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1471200572 ^ i)) {
                                int i16 = 2009685842 ^ i;
                                throw new IOException();
                            }
                        }
                    }
                }
            }
        }
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH)
    public void onMobSpawn(org.bukkit.event.entity.CreatureSpawnEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.listener.SpawnProtectionListener.onMobSpawn(org.bukkit.event.entity.CreatureSpawnEvent):void");
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onExplosion(EntityExplodeEvent entityExplodeEvent) {
        int i = 15150295 ^ (1078749594 ^ 456536818);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -588530182) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -588530182 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1871204722 ^ i)) {
                    break;
                }
            }
            int i2 = 1426771534 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 493526393 ^ i;
        if (this.plugin.isExplosionProtection(371996204) == (1190652614 ^ i3)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 935286322) {
                int i4 = 1979628863 ^ i3;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 935286322 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1552572695 ^ i3)) {
                    break;
                }
            }
            int i5 = 404981937 ^ i3;
            throw new IllegalAccessException("double");
        }
        int i6 = 732986787 ^ i3;
        if (this.plugin.isInSpawnRadius(entityExplodeEvent.getLocation(), 915841467) == (1833408357 ^ i6)) {
            hkpoxvnhgcmyykmd(i6, 379741863);
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1782364971) {
            i6 = 43151969 ^ i6;
            entityExplodeEvent.setCancelled((byte) (1876288773 ^ i6));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2125408291) {
                int i7 = 338695366 ^ i6;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1739931703 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1044555077 ^ i6)) {
                int i8 = 1643120084 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1782364971 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1075634994 ^ i6)) {
                    int i9 = 741955107 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -550531565 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1669098617 ^ i6)) {
                        int i10 = 92861650 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2125408291 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1238875953 ^ i6)) {
                            break;
                        }
                    }
                }
            }
        }
        int i11 = 627413856 ^ i6;
        throw new RuntimeException();
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onWeatherChange(WeatherChangeEvent weatherChangeEvent) {
        int i = 947250716 ^ (1982525075 ^ 456536818);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1421224982) {
            i = 1904923583 ^ i;
            if (this.plugin.isWeatherChangeProtection(258043836) != (618916290 ^ i)) {
                int i2 = 2141301108 ^ i;
                if (weatherChangeEvent.toWeatherState() == (1531068598 ^ i2)) {
                    hkpoxvnhgcmyykmd(i2, 597356988);
                    return;
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -636353102) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -636353102 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1305965164 ^ i2)) {
                            break;
                        }
                    }
                    int i3 = 2029795539 ^ i2;
                    throw new IOException("double");
                }
                i = 1030913485 ^ i2;
                Stream stream = this.plugin.getSpawns(871924923).values().stream();
                Function function = klocation -> {
                    int i4 = 1683125177 ^ (187881054 ^ 1840152609);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 376516144) {
                        int i5 = 1653444404 ^ i4;
                        return klocation.getLocation(791337258);
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 376516144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2097122185 ^ i4)) {
                            int i6 = 2052797261 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 35477395 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (558099070 ^ i4)) {
                                break;
                            }
                        }
                    }
                    int i7 = 1573715067 ^ i4;
                    throw new IOException();
                };
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 830598107) {
                    int i4 = 816379856 ^ i;
                    Stream map = stream.map(function);
                    Predicate predicate = location -> {
                        byte b;
                        int i5 = 1209687219 ^ (104920034 ^ 1840152609);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 530676609) {
                            i5 = 447402096 ^ i5;
                            if (location != null) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -889718783) {
                                    int i6 = 1595694497 ^ i5;
                                    if (location.getWorld().equals(weatherChangeEvent.getWorld()) != (1715643041 ^ i6)) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 840242443) {
                                            i5 = 1002940145 ^ i6;
                                            b = (byte) (1568998481 ^ i5);
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1509313149 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1699814894 ^ i6)) {
                                                int i7 = 454225336 ^ i6;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 840242443 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (419328036 ^ i6)) {
                                                    int i8 = 1789210498 ^ i6;
                                                    throw new IllegalAccessException("double");
                                                }
                                            }
                                        }
                                    } else {
                                        i5 = 530266317 ^ i6;
                                        b = (byte) (2044303980 ^ i5);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -825437341) {
                                            int i9 = 1924217634 ^ i5;
                                            return b;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -825437341 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (156277585 ^ i5)) {
                                                int i10 = 1302612054 ^ i5;
                                                throw new IllegalAccessException("double");
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -629391327 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (647115064 ^ i5)) {
                                        int i11 = 606521200 ^ i5;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -889718783 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1253660659 ^ i5)) {
                                            int i12 = 424241136 ^ i5;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                }
                            }
                            while (true) {
                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i5)) {
                                    case 219082185:
                                    case 254293838:
                                        i5 = 1082615148 ^ i5;
                                        break;
                                    case 791241485:
                                        break;
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 530676609 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (59843462 ^ i5)) {
                                int i13 = 528198304 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1531251312 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (663003825 ^ i5)) {
                                    int i14 = 958878820 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 18480841 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (494347142 ^ i5)) {
                                        int i15 = 1535292894 ^ i5;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -332914046 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2077940568 ^ i5)) {
                                            int i16 = 444263964 ^ i5;
                                            throw new RuntimeException();
                                        }
                                    }
                                }
                            }
                        }
                    };
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1262070438) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1262070438 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2116366042 ^ i4)) {
                                break;
                            }
                        }
                        int i5 = 1659939659 ^ i4;
                        throw new IOException("double");
                    }
                    i = 2091956667 ^ i4;
                    Stream filter = map.filter(predicate);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1363384449) {
                        int i6 = 1282129244 ^ i;
                        List list = filter.toList();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 840856163) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 840856163 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (186899351 ^ i6)) {
                                    break;
                                }
                            }
                            int i7 = 241708627 ^ i6;
                            throw new RuntimeException("double");
                        }
                        i = 493418807 ^ i6;
                        Iterator it = list.iterator();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -648430629) {
                            i = 69924881 ^ i;
                            if (it.hasNext() == (2130825066 ^ i)) {
                                int i8 = 131694176 ^ i;
                                return;
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -133268653) {
                                i = 1319280833 ^ i;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1927578279) {
                                    int i9 = 881720907 ^ i;
                                    weatherChangeEvent.setCancelled((byte) (86938081 ^ i9));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 695504640) {
                                        int i10 = 1802309148 ^ i9;
                                        return;
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 695504640 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (3751482 ^ i9)) {
                                            break;
                                        }
                                    }
                                    int i11 = 289327459 ^ i9;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 656363025) {
                int i12 = 2125961879 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 656363025 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (234368533 ^ i)) {
                int i13 = 305295505 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1927578279 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (242982683 ^ i)) {
                    int i14 = 1868265803 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -648430629 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (737063194 ^ i)) {
                        int i15 = 1172116850 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 830598107 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (752679926 ^ i)) {
                            int i16 = 524724442 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1421224982 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (324948581 ^ i)) {
                                int i17 = 951875538 ^ i;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1363384449 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (943698089 ^ i)) {
                                    int i18 = 580625891 ^ i;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -133268653 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (532490506 ^ i)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i19 = 446229088 ^ i;
        throw new RuntimeException();
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH)
    public void onTimeSkip(org.bukkit.event.world.TimeSkipEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.listener.SpawnProtectionListener.onTimeSkip(org.bukkit.event.world.TimeSkipEvent):void");
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
        ttkuurcyov = cjipmeyneufpxjx();
        wmrsL2Dfvo = (-1229359444) ^ new Random(7629083750396132518L).nextInt();
    }

    public static String dzybcdfyjw(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ ttkuurcyov[i3 % ttkuurcyov.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] cjipmeyneufpxjx() {
        return new byte[]{111, 13, 11, 84, 8, 15, 25, 77, 95, 74, 66, 3, 110, 77, 5, 75, 90, 61, 120, 30, 16, 68, 36, 95, 86, 102, 113, 42, 37, 17, 1, 42, 5};
    }

    private static int hkpoxvnhgcmyykmd(int i, int i2) {
        return i ^ i2;
    }
}
