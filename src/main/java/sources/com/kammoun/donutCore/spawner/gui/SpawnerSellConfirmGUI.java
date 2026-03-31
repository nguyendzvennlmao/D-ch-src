package com.kammoun.donutCore.spawner.gui;

import com.kammoun.donutCore.api.utils.NumberUtils;
import com.kammoun.donutCore.api.utils.PlaceHolderHelper;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.api.utils.menu.KMenu;
import com.kammoun.donutCore.spawner.models.PlacedSpawner;
import com.kammoun.donutCore.spawner.models.holder.SpawnerSellConfirmHolder;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class SpawnerSellConfirmGUI extends KMenu implements Listener {
    private static SpawnerSellConfirmGUI instance;
    private PlacedSpawner currentSpawner;
    private double totalValue;
    private KItem declineItem;
    private KItem confirmItem;
    private int contentsSlot;
    private static int PtRUTZytxS = 0;
    private transient int SrPE6C3qut = 190591872;
    private static byte[] ehzlxusaxw;
    private static String[] nothing_to_see_here = new String[13];

    private SpawnerSellConfirmGUI(JavaPlugin javaPlugin, int i) {
        super(javaPlugin, "Spawner/Gui's/confirm.yml", 1546437752);
        qcdahyvirksjtbfp(1242715661 ^ 339387083, 1093292430);
        int parseInt = 1154797963 ^ (49743539 ^ Integer.parseInt("1495364208"));
        this.SrPE6C3qut = 190591872 ^ PtRUTZytxS;
        loadNavigationItems(766883415);
        Bukkit.getPluginManager().registerEvents(this, javaPlugin);
        int i2 = 1033700985 ^ (1834936572 ^ (570460820 ^ (1511521741 ^ parseInt)));
    }

    public static SpawnerSellConfirmGUI getInstance(JavaPlugin javaPlugin, int i) {
        int i2 = 623448005 ^ (268237851 ^ 993592270);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1889042304) {
            i2 = 1855122085 ^ i2;
            if (instance == null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -68102741) {
                    i2 = 33171223 ^ i2;
                    instance = new SpawnerSellConfirmGUI(javaPlugin, 1738881027);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -199103213) {
                        int i3 = 1153797337 ^ i2;
                        return instance;
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 117714112:
                        int i4 = 1161800654 ^ i2;
                        break;
                    case 1701852286:
                        break;
                    case 1962350811:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -199103213 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (870892712 ^ i2)) {
                int i5 = 984432366 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -68102741 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (957759335 ^ i2)) {
                    int i6 = 1803760188 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1889042304 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1787212705 ^ i2)) {
                        int i7 = 1404935151 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -770864167 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (308810933 ^ i2)) {
                            int i8 = 1770319708 ^ i2;
                            throw new IOException();
                        }
                    }
                }
            }
        }
    }

    private void loadNavigationItems(int i) {
        int i2 = 253759048 ^ (816279896 ^ 811937870);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2131917552) {
            int i3 = 1891624465 ^ i2;
            this.declineItem = KItem.fromConfig(this.config.getConfigurationSection(ngukbadktq(nhergvbtzgpmaiq(), i3)), 2126963651);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -85112197) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -85112197 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (591013247 ^ i3)) {
                        break;
                    }
                }
                int i4 = 86662616 ^ i3;
                throw new IOException("double");
            }
            i2 = 797783632 ^ i3;
            this.confirmItem = KItem.fromConfig(this.config.getConfigurationSection(ngukbadktq(evyvcvwcxkveeyx(), i2)), 2126963651);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2038105862) {
                i2 = 1070923338 ^ i2;
                this.contentsSlot = this.config.getInt(ngukbadktq(evbyidnorwhdtah(), i2), (byte) (1862558040 ^ i2));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2015562411) {
                    int i5 = 1280714924 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2131917552 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1769498 ^ i2)) {
                int i6 = 1305147318 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2015562411 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1172441559 ^ i2)) {
                    int i7 = 236520932 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2038105862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1248781211 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 938838097 ^ i2;
        throw new IOException();
    }

    public void open(Player player, PlacedSpawner placedSpawner, int i) {
        int qcdahyvirksjtbfp;
        int i2;
        int i3;
        int i4 = 588320219 ^ (718228267 ^ 811937870);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -841239055) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -841239055 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (521841099 ^ i4)) {
                    break;
                }
            }
            int i5 = 1810778565 ^ i4;
            throw new RuntimeException("double");
        }
        int i6 = 1245567727 ^ i4;
        if (player == null) {
            int i7 = 109838906 ^ i6;
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1674222965) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1674222965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1349483443 ^ i6)) {
                    break;
                }
            }
            int i8 = 1737410030 ^ i6;
            throw new IllegalAccessException("double");
        }
        int i9 = 1697058947 ^ i6;
        if (player.isOnline() == (379698386 ^ i9)) {
            qcdahyvirksjtbfp(i9, 1672155833);
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1257380208) {
            int i10 = 479522773 ^ i9;
            if (placedSpawner == null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1370134584) {
                    int i11 = 2134900076 ^ i10;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1370134584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (905408721 ^ i10)) {
                        break;
                    }
                }
                int i12 = 323333449 ^ i10;
                throw new IOException("double");
            }
            int qcdahyvirksjtbfp2 = qcdahyvirksjtbfp(i10, 522349273);
            this.currentSpawner = placedSpawner;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qcdahyvirksjtbfp2) != -1464217872) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qcdahyvirksjtbfp2) == -1464217872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qcdahyvirksjtbfp2) == (1418725373 ^ qcdahyvirksjtbfp2)) {
                        break;
                    }
                }
                int i13 = 1693810467 ^ qcdahyvirksjtbfp2;
                throw new IOException("double");
            }
            i9 = 854913017 ^ qcdahyvirksjtbfp2;
            this.totalValue = calculateTotalValue(placedSpawner, 541878526);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1058976057) {
                i9 = 1255794759 ^ i9;
                SpawnerSellConfirmHolder spawnerSellConfirmHolder = new SpawnerSellConfirmHolder(placedSpawner, 1654946866);
                int size = getSize(2086170582);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1775366915) {
                    int i14 = 2070327598 ^ i9;
                    String color = ChatFormater.color(PlaceHolderHelper.parsePlaceholders(getTitle(2013508243), new String[(byte) (375164750 ^ i14)], 887737915));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1293649296) {
                        int i15 = 1520578665 ^ i14;
                        this.inventory = Bukkit.createInventory(spawnerSellConfirmHolder, size, color);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != 1744173370) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 1744173370 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (1329900403 ^ i15)) {
                                    break;
                                }
                            }
                            int i16 = 2044903887 ^ i15;
                            throw new IllegalAccessException("double");
                        }
                        int i17 = 1608433568 ^ i15;
                        if (this.declineItem != null) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) != -1728052168) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1728052168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (1980900243 ^ i17)) {
                                        int i18 = 1465487405 ^ i17;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1470794917 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (1818965554 ^ i17)) {
                                            break;
                                        }
                                    }
                                }
                                int i19 = 1420717069 ^ i17;
                                throw new IOException("double");
                            }
                            i2 = 403075832 ^ i17;
                            this.inventory.setItem(this.declineItem.getSlot(1791774489).intValue(), this.declineItem.getItemStack(1475551979));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1496552440) {
                                qcdahyvirksjtbfp = 746345884 ^ i2;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2030482833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (93647324 ^ i2)) {
                                    int i20 = 604422476 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1496552440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1056137728 ^ i2)) {
                                        break;
                                    }
                                }
                            }
                            int i21 = 1337722336 ^ i2;
                            throw new IllegalAccessException("double");
                        }
                        qcdahyvirksjtbfp = qcdahyvirksjtbfp(i17, 880420708);
                        if (this.confirmItem == null) {
                            i2 = qcdahyvirksjtbfp(qcdahyvirksjtbfp, 142274897);
                        } else {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qcdahyvirksjtbfp) != 986791705) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qcdahyvirksjtbfp) == 986791705 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qcdahyvirksjtbfp) == (1262640918 ^ qcdahyvirksjtbfp)) {
                                        break;
                                    }
                                }
                                int i22 = 990249829 ^ qcdahyvirksjtbfp;
                                throw new RuntimeException("double");
                            }
                            int i23 = 1869582736 ^ qcdahyvirksjtbfp;
                            Inventory inventory = this.inventory;
                            int intValue = this.confirmItem.getSlot(1791774489).intValue();
                            ItemStack itemStack = this.confirmItem.getItemStack(1475551979);
                            String[] strArr = new String[(byte) (1211479665 ^ i23)];
                            strArr[(byte) (1211479667 ^ i23)] = ngukbadktq(bhziqiclazpkggl(), i23);
                            byte b = (byte) (1211479666 ^ i23);
                            double d = this.totalValue;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) != 1101902746) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) == 1101902746 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) == (2040342847 ^ i23)) {
                                        break;
                                    }
                                }
                                int i24 = 1767257388 ^ i23;
                                throw new IllegalAccessException("double");
                            }
                            i14 = 132723059 ^ i23;
                            strArr[b] = NumberUtils.formatDouble(d, 1827184238);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 2128885762) {
                                i3 = 1514851559 ^ i14;
                                inventory.setItem(intValue, PlaceHolderHelper.parsePlaceholders(itemStack, strArr, 1409018373));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1397596360) {
                                    i2 = 985046357 ^ i3;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1397596360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1351391375 ^ i3)) {
                                        int i25 = 800222646 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 454529746 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1499714213 ^ i3)) {
                                            break;
                                        }
                                    }
                                }
                                int i26 = 1233020752 ^ i3;
                                throw new IOException("double");
                            }
                        }
                        addContentsDisplay(placedSpawner, 1802433036);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2030482833) {
                            i3 = 1816274152 ^ i2;
                            player.openInventory(this.inventory);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 454529746) {
                                int i27 = 1209333760 ^ i3;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1397596360) {
                                    int i252 = 800222646 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 454529746) {
                                        break;
                                        break;
                                    }
                                    continue;
                                }
                            }
                            int i262 = 1233020752 ^ i3;
                            throw new IOException("double");
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2030482833) {
                                int i202 = 604422476 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1496552440) {
                                    break;
                                    break;
                                }
                                continue;
                            }
                        }
                        int i212 = 1337722336 ^ i2;
                        throw new IllegalAccessException("double");
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1293649296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1083935458 ^ i14)) {
                            int i28 = 651775921 ^ i14;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 2128885762 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (490886331 ^ i14)) {
                                break;
                            }
                        }
                    }
                    int i29 = 798233335 ^ i14;
                    throw new IOException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1058976057 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1019930984 ^ i9)) {
                int i30 = 631274178 ^ i9;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1257380208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1070888228 ^ i9)) {
                    int i31 = 288143887 ^ i9;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1775366915 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1845286822 ^ i9)) {
                        int i32 = 238318787 ^ i9;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1538282192 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1292896343 ^ i9)) {
                            break;
                        }
                    }
                }
            }
        }
        int i33 = 835991786 ^ i9;
        throw new IOException();
    }

    private void addContentsDisplay(com.kammoun.donutCore.spawner.models.PlacedSpawner r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.gui.SpawnerSellConfirmGUI.addContentsDisplay(com.kammoun.donutCore.spawner.models.PlacedSpawner, int):void");
    }

    private java.lang.String formatMaterialName(org.bukkit.Material r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.gui.SpawnerSellConfirmGUI.formatMaterialName(org.bukkit.Material, int):java.lang.String");
    }

    private double calculateTotalValue(com.kammoun.donutCore.spawner.models.PlacedSpawner r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.gui.SpawnerSellConfirmGUI.calculateTotalValue(com.kammoun.donutCore.spawner.models.PlacedSpawner, int):double");
    }

    private double fallBackCalculateTotalValue(com.kammoun.donutCore.spawner.models.PlacedSpawner r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.gui.SpawnerSellConfirmGUI.fallBackCalculateTotalValue(com.kammoun.donutCore.spawner.models.PlacedSpawner, int):double");
    }

    @Override
    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.gui.SpawnerSellConfirmGUI.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    @Override
    protected void setMenuItems(String[] strArr, int i) {
        int i2 = 560856101 ^ (1830415998 ^ 811937870);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -527888213) {
            int i3 = 1572565416 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 223518185 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (801994041 ^ i2)) {
                int i4 = 1868233306 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -527888213 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (523641416 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1448825449 ^ i2;
        throw new IOException();
    }

    private void sellAllItems(org.bukkit.entity.Player r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.gui.SpawnerSellConfirmGUI.sellAllItems(org.bukkit.entity.Player, int):void");
    }

    @EventHandler
    public void onConfirmMenuClick(InventoryClickEvent inventoryClickEvent) {
        int i = 425494576 ^ (1265322505 ^ 811937870);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 311923643) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 311923643 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2133657545 ^ i)) {
                    break;
                }
            }
            int i2 = 845168297 ^ i;
            throw new RuntimeException("double");
        }
        int i3 = 1951784700 ^ i;
        if ((inventoryClickEvent.getInventory().getHolder() instanceof SpawnerSellConfirmHolder) == (369568907 ^ i3)) {
            qcdahyvirksjtbfp(i3, 738802504);
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1338416040) {
            i3 = 531841702 ^ i3;
            handleClick(inventoryClickEvent, 743228312);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1302557032) {
                int i4 = 867858926 ^ i3;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1302557032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (725131162 ^ i3)) {
                int i5 = 1444223594 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1338416040 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (161504929 ^ i3)) {
                    int i6 = 1443920939 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -797917671 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (12010146 ^ i3)) {
                        break;
                    }
                }
            }
        }
        int i7 = 1465458894 ^ i3;
        throw new RuntimeException();
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
        ehzlxusaxw = zjpiybxaywiyjkz();
        PtRUTZytxS = 1008803536 ^ new Random(-968754823805698021L).nextInt();
    }

    public static String ngukbadktq(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ ehzlxusaxw[i3 % ehzlxusaxw.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] zjpiybxaywiyjkz() {
        return new byte[]{56, 82, 6, 17, 98, 12, 33, 32, 47, 48, 8, 87, 112, 72, 49, 101, 54, 114, 4, 101, 92, 73, 65, 72, 123, 122, 25, 68, 90, 125, 88, 46, 91, 78, 17, 93, 59, 126, 24, 76, 86, 9, 109, 25, 116, 70, 45, 99, 81, 57, 28, 57, 59, 9, 67, 93, 37, 106, 61, 29, 125, 93, 117, 97, 80, 31, 121, 73, 125, Byte.MAX_VALUE, 36, 71, 98, 25, 69, 48, 25, 15, 77, 83, 119, 9, Byte.MAX_VALUE, 66, 64, 52};
    }

    private static byte[] evyvcvwcxkveeyx() {
        return new byte[]{-9, -98, 51, 77, 90, 76, 24, 112, 31, 110, 57, 23, 69, 83, 9, 50, 15, 40, 52, 56, 109, 28, 116, 20, 67, 60, 32, 28};
    }

    private static byte[] evbyidnorwhdtah() {
        return new byte[]{-9, -107, 48, 74, 87, 77, 25, 117, 28, 106, 57, 28, 70, 84, 4, 51, 14, 45, 55, 60, 109, 5, 119, 31, 78, 33, 33, 0, 105, 57, 105, 56, 109, 15, 36, 4, 3, 33, 43, 15};
    }

    private static byte[] nhergvbtzgpmaiq() {
        return new byte[]{-12, -100, 53, 78, 90, 76, 21, 115, 29, 110, 58, 21, 67, 80, 9, 53, 2, 33, 54, 53, 110, 20, 114, 23, 67, 32, 45, 23};
    }

    private static byte[] bhziqiclazpkggl() {
        return new byte[]{-9, -97, 55, 5, 86, 82, 24, 98, 25, 98, 57, 8, 65, 10, 5, Byte.MAX_VALUE, 15, 50, 50, 51, 109, 23, 112, 12, 79, 40, 32, 87};
    }

    private static byte[] fzzgwydxglocqkb() {
        return new byte[]{-1, -107, 50, 4, 80, 88, 17, 124, 22, 103, 60, 18, 66, 19, 1, 32, 15, 111};
    }

    private static byte[] lyalicpskczhqtm() {
        return new byte[]{-9, -98, 52, 75, 87, 73, 16, 113, 23, 105, 57, 23, 66, 85, 4, 55, 7, 41, 60, 63, 109, 14, 115, 30, 78, 37, 40, 4, 98, 58, 105, 51, 105, 25, 36, 5, 10, 57, 32, 8, 103, 86, 95, 75, 65, 14, 28, 57, 105, 108, 45, 103, 9, 95};
    }

    private static byte[] jyekjmmixpezgng() {
        return new byte[]{-9, -98, 52, 4, 87, 30, 16, 39, 23, 48, 57, 1, 66, 30, 4, 108, 7, 118, 62, -50, 112, 117, 110, 116, 83, 80};
    }

    private static byte[] tmnkehptnleoutf() {
        return new byte[]{-9, -103, 52, 13, 87, 93, 19, 101, 25, 100, 60, 8, 73, 88};
    }

    private static byte[] xlrzrdymcplzuug() {
        return new byte[]{-14, -103, 52, 74, 85, 74, 23, 113, 22, 105, 60, 22, 66, 81, 3, 48, 2, 36, 48, 63, 110, 15, 118, 31, 77, 32, 32, 4, 110, 60, 106, 55, 105, 20, 37, 11, 15, 56, 42, 27, 97, 21, 91, 29};
    }

    private static byte[] heswuutwjlqftid() {
        return new byte[]{-14, -103, 52, 5, 85, 29, 23, 39, 22, 48, 60, 0, 66, 26, 3, 107, 2, 123, 48, 116, 110, 26, 118, 23, 77, 33, 32, 5, 110, 33, 106, 109, 105, 93, 37, 68, 15, 108, 42, 24, 97, 30, 91, 68, 77, 6, 25, 52, 99, 99, 46, 42};
    }

    private static byte[] yrraqyfhagdbnwl() {
        return new byte[]{-9, -97, 54, 9};
    }

    private static byte[] jqhrsqmumcosywc() {
        return new byte[]{-11, -107, 62, 119};
    }

    private static byte[] hvzqrbicmexmzkl() {
        return new byte[]{-11, -107, 62, 8};
    }

    private static byte[] fpbgrhugkwntezp() {
        return new byte[]{-12, -104, 55, 4};
    }

    private static byte[] zbmkzhjxmwywcrg() {
        return new byte[]{-9, -103, 48, 2, 80, 88, 18, 124, 26, 111, 57, 22, 70, 16, 3, 36, 5, 102};
    }

    private static byte[] xwvveqswcfmgymi() {
        return new byte[]{-2, -104, 52, 5, 91, 84, 19, 116, 23, 106, 58, 19, 73, 31, 3, 40, 14, 98};
    }

    private static int qcdahyvirksjtbfp(int i, int i2) {
        return i2 ^ i;
    }
}
