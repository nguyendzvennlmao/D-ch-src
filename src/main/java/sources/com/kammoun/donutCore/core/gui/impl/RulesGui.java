package com.kammoun.donutCore.core.gui.impl;

import com.kammoun.donutCore.core.CorePlugin;
import com.kammoun.donutCore.core.models.ItemConfig;
import com.kammoun.donutCore.core.utils.ColorFormater;
import com.kammoun.donutCore.core.utils.ItemBuilder;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class RulesGui implements Listener {
    private final CorePlugin plugin;
    private final Set<Player> openedPlayers;
    private static int zpBulsG62s = 0;
    private transient int oagotAygTn = 768684468;
    private static byte[] dibgckoiaz;
    private static String[] nothing_to_see_here = new String[18];

    public RulesGui(CorePlugin corePlugin, int i) {
        aymfvafpyocziokr(2112275000 ^ 740355578, 486040259);
        int parseInt = 2121511088 ^ (289214430 ^ Integer.parseInt("577827439"));
        this.oagotAygTn = 768684468 ^ zpBulsG62s;
        int aymfvafpyocziokr = 1133024168 ^ aymfvafpyocziokr(parseInt, 589780068);
        this.openedPlayers = new HashSet();
        this.plugin = corePlugin;
        corePlugin.getApi(2142241109).getServer().getPluginManager().registerEvents(this, corePlugin.getApi(2142241109));
        int i2 = 704215128 ^ (1678078759 ^ (1084433800 ^ aymfvafpyocziokr));
    }

    public void open(Player player, int i) {
        int i2 = 556329270 ^ (761598605 ^ 1339927233);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 478317522) {
            int i3 = 588025943 ^ i2;
            Inventory generateInventory = generateInventory(player, 642211155);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 82184555) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 82184555 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (727703278 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1813720612 ^ i3;
                throw new IllegalAccessException("double");
            }
            i2 = 322276307 ^ i3;
            if (generateInventory != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1656072205) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1656072205 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (602343718 ^ i2)) {
                            break;
                        }
                    }
                    int i5 = 2001453900 ^ i2;
                    throw new IOException("double");
                }
                i2 = 1272933128 ^ i2;
                player.openInventory(generateInventory);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1011806287) {
                    int i6 = 823800929 ^ i2;
                    this.openedPlayers.add(player);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1264626872) {
                        int i7 = 1264778073 ^ i6;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1264626872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2093138811 ^ i6)) {
                            break;
                        }
                    }
                    int i8 = 1458439545 ^ i6;
                    throw new IllegalAccessException("double");
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 1602277:
                        int i9 = 833070128 ^ i2;
                        return;
                    case 4506171:
                    case 1235583531:
                        return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 276264562 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (691419208 ^ i2)) {
                int i10 = 1039082308 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1011806287 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1357745482 ^ i2)) {
                    int i11 = 410307031 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 478317522 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1935108506 ^ i2)) {
                        int i12 = 449276334 ^ i2;
                        throw new IOException();
                    }
                }
            }
        }
    }

    private Inventory generateInventory(Player player, int i) {
        int i2;
        int i3 = 589066395 ^ (469976713 ^ 1339927233);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2045450597) {
            int i4 = 153260330 ^ i3;
            int i5 = this.plugin.getConfigurationManager(2125977720).getRulesGuiConfig(1467783229).getInt(joxszjaylb(bfeireyozfaujci(), i4));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -822054965) {
                int i6 = 210108542 ^ i4;
                String string = this.plugin.getConfigurationManager(2125977720).getRulesGuiConfig(1467783229).getString(joxszjaylb(rhmkboyytghvuxu(), i6), joxszjaylb(yyvzpgvnlfbwrru(), i6));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1422889925) {
                    int i7 = 1398014816 ^ i6;
                    Inventory createInventory = Bukkit.createInventory((InventoryHolder) null, i5, ColorFormater.hex(string));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 831551289) {
                        i7 = 1393017494 ^ i7;
                        Iterator it = this.plugin.getItemLoader(237901470).getRulesConfig(1964538408).values().iterator();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1448189045) {
                            int i8 = 2000180744;
                            while (true) {
                                i2 = i8 ^ i7;
                                if (it.hasNext() == (34445945 ^ i2)) {
                                    int i9 = 167408167 ^ i2;
                                    return createInventory;
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 275567560) {
                                    int i10 = 1630452857 ^ i2;
                                    ItemConfig itemConfig = (ItemConfig) it.next();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 421081091) {
                                        i4 = 342020405 ^ i10;
                                        ItemBuilder itemBuilder = new ItemBuilder(itemConfig.getMaterial(1618121505));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1173374549) {
                                            i6 = 1028078304 ^ i4;
                                            ItemBuilder name = itemBuilder.name(ColorFormater.hex(itemConfig.getDisplayName(1778234333)), 1646492606);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1345744554) {
                                                i6 = 1985049979 ^ i6;
                                                ItemBuilder defLore = name.defLore(ColorFormater.hex(itemConfig.getLore(1376752662), 185435491), 685184902);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -490879631) {
                                                    i3 = 375970390 ^ i6;
                                                    ItemStack build = defLore.build(891921829);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1375410113) {
                                                        i2 = 792429892 ^ i3;
                                                        createInventory.setItem(itemConfig.getSlot(125365052), build);
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 673660384) {
                                                            i3 = 1362220538 ^ i2;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1582722510) {
                                                                int aymfvafpyocziokr = aymfvafpyocziokr(i3, 377317180);
                                                                try {
                                                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(aymfvafpyocziokr) != 7104468) {
                                                                        throw null;
                                                                    }
                                                                    throw new RuntimeException();
                                                                } catch (RuntimeException e) {
                                                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                                        case -956595485:
                                                                            i7 = 968909374 ^ aymfvafpyocziokr;
                                                                            break;
                                                                        case 306359250:
                                                                            i7 = aymfvafpyocziokr(aymfvafpyocziokr, 56051480);
                                                                            break;
                                                                        default:
                                                                            throw new RuntimeException("Error in hash");
                                                                    }
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 150508306) {
                                                                        i8 = 1125287963;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 421081091 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1067854875 ^ i10)) {
                                                int i11 = 1690411878 ^ i10;
                                                throw new RuntimeException("double");
                                            }
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 673660384 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1465883500 ^ i2)) {
                                    int i12 = 1795962020 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 275567560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1811020979 ^ i2)) {
                                        int i13 = 606670981 ^ i2;
                                        throw new IOException("double");
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -956595485 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (268677583 ^ i7)) {
                            int i14 = 2058885522 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1606370032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1155298130 ^ i7)) {
                                int i15 = 1932829712 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 831551289 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (800517550 ^ i7)) {
                                    int i16 = 579714609 ^ i7;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 150508306 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (730127970 ^ i7)) {
                                        int i17 = 476577623 ^ i7;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1448189045 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1873370519 ^ i7)) {
                                            int i18 = 2083964772 ^ i7;
                                            throw new IOException();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -490879631 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (127163278 ^ i6)) {
                        int i19 = 634143415 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 306359250 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (986410719 ^ i6)) {
                            int i20 = 1209292694 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1422889925 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (716853851 ^ i6)) {
                                int i21 = 1654549101 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1345744554 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (85821217 ^ i6)) {
                                    int i22 = 632645112 ^ i6;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1173374549 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (376453172 ^ i4)) {
                    int i23 = 2080868117 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -822054965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1225001857 ^ i4)) {
                        int i24 = 508576164 ^ i4;
                        throw new IllegalAccessException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2045450597 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (824565408 ^ i3)) {
                int i25 = 1047839444 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1375410113 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (425127219 ^ i3)) {
                    int i26 = 1801715321 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1582722510 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (981218345 ^ i3)) {
                        int i27 = 400471915 ^ i3;
                        throw new IllegalAccessException("double");
                    }
                }
            }
        }
    }

    @org.bukkit.event.EventHandler
    public void onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.RulesGui.onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent):void");
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent inventoryCloseEvent) {
        int i = 84177206 ^ (1842154866 ^ 1339927233);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 950449193) {
            int i2 = 119907428 ^ i;
            if ((inventoryCloseEvent.getPlayer() instanceof Player) == (540111585 ^ i2)) {
                aymfvafpyocziokr(i2, 472789167);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 25925385) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 25925385 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1431451003 ^ i2)) {
                        break;
                    }
                }
                int i3 = 352140514 ^ i2;
                throw new IOException("double");
            }
            i = 1644991019 ^ i2;
            this.openedPlayers.remove(inventoryCloseEvent.getPlayer());
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 300877394) {
                int i4 = 2116199044 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 950449193 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1940154267 ^ i)) {
                int i5 = 1346256460 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 300877394 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1865707832 ^ i)) {
                    break;
                }
            }
        }
        int i6 = 1503490323 ^ i;
        throw new IllegalAccessException();
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        int i = 1206341457 ^ (1574706626 ^ 1339927233);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1355300206) {
            i = 271589572 ^ i;
            this.openedPlayers.remove(playerQuitEvent.getPlayer());
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 783729842) {
                int i2 = 1113876799 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 783729842 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2010918124 ^ i)) {
                int i3 = 1425165782 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1355300206 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1123591131 ^ i)) {
                    int i4 = 459641845 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1033211208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (84398350 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 1088790897 ^ i;
        throw new IllegalAccessException();
    }

    public void remove(Player player, int i) {
        int i2 = 1675851844 ^ (1593029793 ^ 1339927233);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1771359965) {
            i2 = 752677760 ^ i2;
            this.openedPlayers.remove(player);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -259216094) {
                int i3 = 1279401532 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1771359965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1883088264 ^ i2)) {
                int i4 = 1754337587 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -259216094 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (956606566 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 372737289 ^ i2;
        throw new IllegalAccessException();
    }

    public boolean isInGUI(Player player) {
        int i = 827603052 ^ (2045879841 ^ 1339927233);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1002546272) {
            int i2 = 804434150 ^ i;
            return this.openedPlayers.contains(player);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1002546272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (303233427 ^ i)) {
                int i3 = 1177048711 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1146364753 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (979391659 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1094611637 ^ i;
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
        dibgckoiaz = duiqzggasynsqhc();
        zpBulsG62s = 502245749 ^ new Random(-4744441027038693474L).nextInt();
    }

    public static String joxszjaylb(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ dibgckoiaz[i3 % dibgckoiaz.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] duiqzggasynsqhc() {
        return new byte[]{10, 57, 2, 125, 17, 63, 66, 91, 8, 75, Byte.MAX_VALUE, 42, 77, 60, 63, 42, 77, 20, 89, 35, 61, 59, 78, 57, 71, 109, 126, 2, 114, 32, 120, 42, 11, 45, 26, 90, 11, 8, 64, 79, 103, 114, 113, 14, 49, 104, Byte.MAX_VALUE, 103, 67, 38, 40, 91, 3, 110, 97, 50, 56, 36, 30, 61, 21, 5, 3, 68, 94, 3, 85, 34, 90, 84, 107, 16, 46, 23, 35, 2, 29, 45, 113, 3, 90, 81, 34, 32, 73, 124, 7, 22, 26, 67, 68, 44, 62, 61, 8, 71, 83, 123};
    }

    private static byte[] bfeireyozfaujci() {
        return new byte[]{-58, -10, 54, 58, 38, 100, 116, 22, 63, 25};
    }

    private static byte[] rhmkboyytghvuxu() {
        return new byte[]{-59, -1, 52, 48, 39, 100, 112, 27, 56, 16, 78, 118};
    }

    private static byte[] yyvzpgvnlfbwrru() {
        return new byte[0];
    }

    private static int aymfvafpyocziokr(int i, int i2) {
        return i ^ i2;
    }
}
