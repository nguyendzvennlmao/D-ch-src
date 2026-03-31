package com.kammoun.donutCore.spawner.gui;

import com.kammoun.donutCore.api.utils.PlaceHolderHelper;
import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.api.utils.menu.KMenu;
import com.kammoun.donutCore.spawner.SpawnerPlugin;
import com.kammoun.donutCore.spawner.manager.SpawnerConfigManager;
import com.kammoun.donutCore.spawner.models.PlacedSpawner;
import com.kammoun.donutCore.spawner.models.holder.SpawnerStorageHolder;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

public class SpawnerStorageGUI extends KMenu implements Listener {
    private static SpawnerStorageGUI instance;
    private static final int ITEMS_PER_PAGE = 45;
    private int spawnerIconSlot;
    private KItem dropAllItem;
    private KItem sellAllItem;
    private static int DNEjX5Sc18 = 0;

    private transient int f1097lOdBiHFOc = 1413057407;
    private static String rdkyrhpmbb;
    private static String[] nothing_to_see_here = new String[15];

    private SpawnerStorageGUI(JavaPlugin javaPlugin, int i) {
        super(javaPlugin, "Spawner/Gui's/storage.yml", 1546437752);
        brggpzexganngrjj(1859837743 ^ 894103683, 215546477);
        int parseInt = 1532095107 ^ (1071888044 ^ Integer.parseInt("872057326"));
        this.f1097lOdBiHFOc = 1413057407 ^ DNEjX5Sc18;
        loadNavigationItems(1821202301);
        Bukkit.getPluginManager().registerEvents(this, javaPlugin);
        int i2 = 870335388 ^ (942075621 ^ (1820395617 ^ (1893367104 ^ parseInt)));
    }

    public static SpawnerStorageGUI getInstance(JavaPlugin javaPlugin, int i) {
        int i2 = 1923205444 ^ (417825060 ^ 1654446349);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1188334440) {
            i2 = 529125337 ^ i2;
            if (instance == null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1164249696) {
                    i2 = 1991732741 ^ i2;
                    instance = new SpawnerStorageGUI(javaPlugin, 1325243367);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 253855115) {
                        int i3 = 307593995 ^ i2;
                        return instance;
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 221351983:
                        int i4 = 1692593422 ^ i2;
                        break;
                    case 1277550423:
                        break;
                    case 1681422913:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1188334440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1217322474 ^ i2)) {
                int i5 = 1144427329 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 253855115 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1575614612 ^ i2)) {
                    int i6 = 259191121 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1164249696 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2086103436 ^ i2)) {
                        int i7 = 1977228571 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1651663405 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (219290928 ^ i2)) {
                            int i8 = 261476623 ^ i2;
                            throw new IllegalAccessException();
                        }
                    }
                }
            }
        }
    }

    private void loadNavigationItems(int i) {
        int i2 = 1536187000 ^ (1416281857 ^ 916804210);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -889341863) {
            int i3 = 39836311 ^ i2;
            this.spawnerIconSlot = this.config.getInt(faspjabefl(byupxjzwojiokgr(), i3), (byte) (989883821 ^ i3));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -670864159) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -670864159 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (987432240 ^ i3)) {
                        break;
                    }
                }
                int i4 = 130289530 ^ i3;
                throw new IOException("double");
            }
            i2 = 1140155938 ^ i3;
            this.dropAllItem = KItem.fromConfig(this.config.getConfigurationSection(faspjabefl(jqrjziogralbidy(), i2)), 2126963651);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -945267213) {
                int i5 = 1640562006 ^ i2;
                this.sellAllItem = KItem.fromConfig(this.config.getConfigurationSection(faspjabefl(kqeemcrgfnyidao(), i5)), 2126963651);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -907036864) {
                    int i6 = 844731878 ^ i5;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -907036864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (113459185 ^ i5)) {
                        break;
                    }
                }
                int i7 = 1952798733 ^ i5;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -945267213 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (289047647 ^ i2)) {
                int i8 = 167968326 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1529026673 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1262134784 ^ i2)) {
                    int i9 = 543136129 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -889341863 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (298700772 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i10 = 1618272254 ^ i2;
        throw new IllegalAccessException();
    }

    public void open$689827922(Player player, PlacedSpawner placedSpawner, int i) {
        int i2 = 827505141 ^ (760183135 ^ 916804210);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1438947009) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1438947009 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1746761768 ^ i2)) {
                    int i3 = 74911839 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -844557872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1413502291 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 1135946544 ^ i2;
            throw new IOException();
        }
        int i5 = 927312052 ^ i2;
        open(player, placedSpawner, (byte) (503134829 ^ i5), 1607594458);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -269888672) {
            int i6 = 71833686 ^ i5;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -269888672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (514405575 ^ i5)) {
                break;
            }
        }
        int i7 = 104039059 ^ i5;
        throw new IOException("double");
    }

    public void open(org.bukkit.entity.Player r7, com.kammoun.donutCore.spawner.models.PlacedSpawner r8, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.gui.SpawnerStorageGUI.open(org.bukkit.entity.Player, com.kammoun.donutCore.spawner.models.PlacedSpawner, int, int):void");
    }

    private void displayItemsInLayout(PlacedSpawner placedSpawner, int i, int i2) {
        int i3 = 1470578651 ^ (1654653971 ^ 916804210);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 487804368) {
            int i4 = 878638562 ^ i3;
            List buildAllDisplayItems = buildAllDisplayItems(placedSpawner, 899214977);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1075518783) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1075518783 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1282198369 ^ i4)) {
                        break;
                    }
                }
                int i5 = 365727776 ^ i4;
                throw new IllegalAccessException("double");
            }
            int i6 = 910885790 ^ i4;
            int i7 = (i - ((byte) (28811207 ^ i6))) * ((byte) (28811243 ^ i6));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 230489648) {
                i6 = 885194984 ^ i6;
                int min = Math.min(i7 + ((byte) (896835331 ^ i6)), buildAllDisplayItems.size());
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1415251599) {
                    int i8 = 85803868 ^ i6;
                    int i9 = (byte) (812244082 ^ i8);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -2091981935) {
                        i6 = 1003435528 ^ i8;
                        int i10 = i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1563907024) {
                            int i11 = 1590640238;
                            while (true) {
                                i8 = i11 ^ i6;
                                if (i10 >= min) {
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i8)) {
                                            case 92102543:
                                                int i12 = 1881561942 ^ i8;
                                                return;
                                            case 749964253:
                                                return;
                                            case 1764764409:
                                        }
                                    }
                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1420910430) {
                                    i8 = 2006916209 ^ i8;
                                    this.inventory.setItem(i9, (ItemStack) buildAllDisplayItems.get(i10));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 397820713) {
                                        i3 = 56762672 ^ i8;
                                        i9 += 563407188 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 212290217) {
                                            i8 = 1773908784 ^ i3;
                                            i10 += 1211062884 ^ i8;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1098568490) {
                                                int brggpzexganngrjj = brggpzexganngrjj(i8, 852521064);
                                                try {
                                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(brggpzexganngrjj) == 239999878) {
                                                        throw new RuntimeException();
                                                    }
                                                    throw null;
                                                } catch (RuntimeException e) {
                                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                        case -671526805:
                                                            i6 = 1582199230 ^ brggpzexganngrjj;
                                                            break;
                                                        case 1192431219:
                                                            i6 = 1280522877 ^ brggpzexganngrjj;
                                                            break;
                                                        default:
                                                            throw new IOException("Error in hash");
                                                    }
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 629857689) {
                                                        i11 = 1910017959;
                                                    } else {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 629857689 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (239183977 ^ i6)) {
                                                                int i13 = 180441257 ^ i6;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 712800785 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (482578736 ^ i6)) {
                                                                    int i14 = 266589532 ^ i6;
                                                                    throw new IllegalAccessException("double");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 397820713 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (336071065 ^ i8)) {
                            int i15 = 1566679886 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1420910430 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (690285504 ^ i8)) {
                                int i16 = 1395299979 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -2091981935 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1654735740 ^ i8)) {
                                    int i17 = 8116722 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1098568490 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (507955604 ^ i8)) {
                                        int i18 = 721195347 ^ i8;
                                        throw new IOException();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1415251599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1964634096 ^ i6)) {
                    int i19 = 551976759 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 230489648 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (500667984 ^ i6)) {
                        int i20 = 457851975 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1563907024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2069286300 ^ i6)) {
                            break;
                        }
                    }
                }
            }
            int i21 = 1574946270 ^ i6;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 487804368 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (836043518 ^ i3)) {
                int i22 = 1736043980 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 212290217 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (176240877 ^ i3)) {
                    int i23 = 1344578919 ^ i3;
                    throw new IllegalAccessException("double");
                }
            }
        }
    }

    private java.util.List buildAllDisplayItems(com.kammoun.donutCore.spawner.models.PlacedSpawner r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.gui.SpawnerStorageGUI.buildAllDisplayItems(com.kammoun.donutCore.spawner.models.PlacedSpawner, int):java.util.List");
    }

    @Override
    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.gui.SpawnerStorageGUI.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    @Override
    protected void setMenuItems(String[] strArr, int i) {
        int i2 = 536770596 ^ (1809419330 ^ 916804210);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 336933026) {
            int i3 = 534564444 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 336933026 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1953311474 ^ i2)) {
                int i4 = 464562969 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -353156542 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (940845366 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 358243205 ^ i2;
        throw new IllegalAccessException();
    }

    private void collectItem(Player player, PlacedSpawner placedSpawner, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 97962452 ^ (1947952863 ^ 916804210);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 994569162) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 994569162 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1067820032 ^ i6)) {
                    break;
                }
            }
            int i7 = 1872378870 ^ i6;
            throw new RuntimeException("double");
        }
        int i8 = 100983298 ^ i6;
        ItemStack item = this.inventory.getItem(i2);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 190905306) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 190905306 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2050178145 ^ i8)) {
                    break;
                }
            }
            int i9 = 176512766 ^ i8;
            throw new IOException("double");
        }
        int i10 = 298259550 ^ i8;
        if (item != null) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != -2057807574) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -2057807574 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (355333048 ^ i10)) {
                        break;
                    }
                }
                int i11 = 112872725 ^ i10;
                throw new RuntimeException("double");
            }
            int i12 = 974396593 ^ i10;
            if (item.getType() == Material.AIR) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1442364579) {
                    int i13 = 1343754253 ^ i12;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1442364579 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1917498498 ^ i12)) {
                        break;
                    }
                }
                int i14 = 1940156899 ^ i12;
                throw new RuntimeException("double");
            }
            int brggpzexganngrjj = brggpzexganngrjj(i12, 1825499076);
            Material type = item.getType();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(brggpzexganngrjj) == 865043072) {
                int i15 = 998792988 ^ brggpzexganngrjj;
                int amount = item.getAmount();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -271746463) {
                    int i16 = 926894899 ^ i15;
                    int itemAmount = placedSpawner.getItemAmount(type, 1417287038);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) != 1446454264) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == 1446454264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (2052463337 ^ i16)) {
                                break;
                            }
                        }
                        int i17 = 1193385196 ^ i16;
                        throw new IOException("double");
                    }
                    int i18 = 177665530 ^ i16;
                    if (itemAmount <= (5247365 ^ i18)) {
                        int i19 = 510952692 ^ i18;
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 41978920) {
                        i15 = 1549864281 ^ i18;
                        int min = Math.min(amount, itemAmount);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -511121694) {
                            i15 = 1911374703 ^ i15;
                            ItemStack itemStack = new ItemStack(type, min);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 1860369817) {
                                brggpzexganngrjj = 297431143 ^ i15;
                                PlayerInventory inventory = player.getInventory();
                                ItemStack[] itemStackArr = new ItemStack[(byte) (1013329877 ^ brggpzexganngrjj)];
                                itemStackArr[(byte) (1013329876 ^ brggpzexganngrjj)] = itemStack;
                                HashMap addItem = inventory.addItem(itemStackArr);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(brggpzexganngrjj) == -483295583) {
                                    i15 = 1921500626 ^ brggpzexganngrjj;
                                    if (addItem.isEmpty() == (1323428358 ^ i15)) {
                                        i4 = 1364159342 ^ i15;
                                        int sum = addItem.values().stream().mapToInt((v0) -> {
                                            return v0.getAmount();
                                        }).sum();
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -42726592) {
                                            i18 = 1605686077 ^ i4;
                                            int i20 = min - sum;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 13800106) {
                                                i15 = 1378940105 ^ i18;
                                                if (i20 > (304785052 ^ i15)) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -1856686880) {
                                                        i15 = 147238382 ^ i15;
                                                        placedSpawner.removeItems(type, i20, 466521766);
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -681550960) {
                                                            int i21 = 1009222653 ^ i15;
                                                            open(player, placedSpawner, i, 1607594458);
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) != 912016505) {
                                                                while (true) {
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == 912016505 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == (44414573 ^ i21)) {
                                                                        break;
                                                                    }
                                                                }
                                                                int i22 = 467283617 ^ i21;
                                                                throw new IOException("double");
                                                            }
                                                            i15 = 2014004915 ^ i21;
                                                            SpawnerPlugin.getInstance(1135862724).getSpawnerConfigManager(579818845).sendMessage(player, SpawnerConfigManager.Messages.INVENTORY_FULL, new String[(byte) (1589694012 ^ i15)], 1620111602);
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -167349790) {
                                                                int i23 = 1502464398 ^ i15;
                                                                SpawnerPlugin.getInstance(1135862724).getSpawnerConfigManager(579818845).playSound(player, SpawnerConfigManager.SpawnerSounds.INVENTORY_FULL, 2143179499);
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) == 979910032) {
                                                                    int i24 = 426349251 ^ i23;
                                                                    return;
                                                                }
                                                                while (true) {
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) == 979910032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) == (835291231 ^ i23)) {
                                                                        int i25 = 1780536976 ^ i23;
                                                                        throw new RuntimeException("double");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                while (true) {
                                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i15)) {
                                                        case 53653732:
                                                            i15 = 1290430624 ^ i15;
                                                            break;
                                                        case 511551571:
                                                        case 644982226:
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -42726592) {
                                                int i26 = 2040879347 ^ i4;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 47143856) {
                                                    int i27 = 1453285294 ^ i4;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -249255032) {
                                                        break;
                                                        break;
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                        int i28 = 1031550929 ^ i4;
                                        throw new RuntimeException("double");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 1997492274) {
                                        int i29 = 1440618267 ^ i15;
                                        placedSpawner.removeItems(type, min, 466521766);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i29) != -637540120) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i29) == -637540120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i29) == (1380119778 ^ i29)) {
                                                    int i30 = 250474818 ^ i29;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i29) == 1565266768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i29) == (221664683 ^ i29)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            int i31 = 1745608715 ^ i29;
                                            throw new IllegalAccessException("double");
                                        }
                                        i4 = 459675243 ^ i29;
                                        SpawnerPlugin.getInstance(1135862724).getSpawnerConfigManager(579818845).playSound(player, SpawnerConfigManager.SpawnerSounds.BUTTON_CLICK, 2143179499);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 47143856) {
                                            int i32 = 2009761606 ^ i4;
                                            open(player, placedSpawner, i, 1607594458);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i32) != -1130667645) {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i32) == -1130667645 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i32) == (212415319 ^ i32)) {
                                                        break;
                                                    }
                                                }
                                                int i33 = 656674567 ^ i32;
                                                throw new RuntimeException("double");
                                            }
                                            int i34 = 684610055 ^ i32;
                                            try {
                                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i34) == 147126231) {
                                                    throw new IllegalAccessException();
                                                }
                                                throw null;
                                            } catch (IllegalAccessException e) {
                                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                    case -85331526:
                                                        i5 = brggpzexganngrjj(i34, 657322327);
                                                        break;
                                                    case 1565266768:
                                                        i5 = 1943620874 ^ i34;
                                                        break;
                                                    default:
                                                        throw new IllegalAccessException("Error in hash");
                                                }
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1014596861) {
                                                    brggpzexganngrjj(i5, 1716804113);
                                                    return;
                                                }
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1014596861 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (94506496 ^ i5)) {
                                                        int i35 = 1361481932 ^ i5;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                            }
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -42726592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (956199287 ^ i4)) {
                                                int i262 = 2040879347 ^ i4;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 47143856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1636428519 ^ i4)) {
                                                    int i272 = 1453285294 ^ i4;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -249255032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (925218730 ^ i4)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        int i282 = 1031550929 ^ i4;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 1997492274 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (161122266 ^ i15)) {
                                int i36 = 895914165 ^ i15;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -511121694 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (979160665 ^ i15)) {
                                    int i37 = 788554462 ^ i15;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 13800106 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (666928551 ^ i18)) {
                            int i38 = 1513729211 ^ i18;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 41978920 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (1011043742 ^ i18)) {
                                break;
                            }
                        }
                    }
                    int i39 = 1249909341 ^ i18;
                    throw new RuntimeException("double");
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 1860369817 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (861179936 ^ i15)) {
                        int i40 = 1860894522 ^ i15;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -1856686880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (617011334 ^ i15)) {
                            int i41 = 200393211 ^ i15;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -167349790 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (1576698400 ^ i15)) {
                                int i42 = 66770795 ^ i15;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -681550960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (1865193376 ^ i15)) {
                                    int i43 = 2087515272 ^ i15;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -271746463 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (726442500 ^ i15)) {
                                        int i44 = 1340289833 ^ i15;
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(brggpzexganngrjj) == -483295583 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(brggpzexganngrjj) == (788059667 ^ brggpzexganngrjj)) {
                    int i45 = 470674428 ^ brggpzexganngrjj;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(brggpzexganngrjj) == 865043072 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(brggpzexganngrjj) == (333272756 ^ brggpzexganngrjj)) {
                        break;
                    }
                }
            }
            int i46 = 1983485439 ^ brggpzexganngrjj;
            throw new IllegalAccessException("double");
        }
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i10)) {
                case 179552652:
                default:
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -717734711 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1271944358 ^ i10)) {
                            int i47 = 647864982 ^ i10;
                            throw new RuntimeException("double");
                        }
                    }
                    break;
                case 206255420:
                    int i48 = 1779174588 ^ i10;
                    return;
                case 1440909099:
                    return;
                case 1702026463:
            }
        }
    }

    private void dropAllItems(org.bukkit.entity.Player r6, com.kammoun.donutCore.spawner.models.PlacedSpawner r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.gui.SpawnerStorageGUI.dropAllItems(org.bukkit.entity.Player, com.kammoun.donutCore.spawner.models.PlacedSpawner, int, int):void");
    }

    private ItemStack replacePlaceholders(ItemStack itemStack, PlacedSpawner placedSpawner, int i) {
        int i2 = 1760836658 ^ (1398901878 ^ 916804210);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1770459568) {
            i2 = 588682476 ^ i2;
            String[] strArr = new String[(byte) (774272732 ^ i2)];
            strArr[(byte) (774272730 ^ i2)] = faspjabefl(gxauooydacgioce(), i2);
            byte b = (byte) (774272731 ^ i2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1899214545) {
                i2 = 681187354 ^ i2;
                strArr[b] = placedSpawner.getSpawnerType(1612695158).getName();
                strArr[(byte) (113012418 ^ i2)] = faspjabefl(qeeruzzkhgucfyv(), i2);
                byte b2 = (byte) (113012419 ^ i2);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 904099328) {
                    i2 = 1138217319 ^ i2;
                    strArr[b2] = String.valueOf(placedSpawner.getStackAmount(1448150925));
                    strArr[(byte) (1164689315 ^ i2)] = faspjabefl(lyturszfbtfvxqc(), i2);
                    byte b3 = (byte) (1164689314 ^ i2);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 727579962) {
                        int i3 = 1912776011 ^ i2;
                        strArr[b3] = String.valueOf(placedSpawner.getStorageFullnessPercentage(1583982881));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1152854175) {
                            int i4 = 708456556 ^ i3;
                            return PlaceHolderHelper.parsePlaceholders(itemStack, strArr, 1409018373);
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1152854175 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (516954639 ^ i3)) {
                                break;
                            }
                        }
                        int i5 = 264689638 ^ i3;
                        throw new IllegalAccessException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 727579962 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (481501115 ^ i2)) {
                int i6 = 1461552769 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 904099328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (56600238 ^ i2)) {
                    int i7 = 1652992846 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1770459568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2053435210 ^ i2)) {
                        int i8 = 1445624173 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1899214545 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2050440646 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i9 = 486801431 ^ i2;
        throw new IllegalAccessException();
    }

    @EventHandler
    public void onStorageMenuClick(InventoryClickEvent inventoryClickEvent) {
        int i = 1908633671 ^ (880862084 ^ 916804210);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1623847541) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1623847541 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1603935634 ^ i)) {
                    break;
                }
            }
            int i2 = 638815660 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 213178132 ^ i;
        if ((inventoryClickEvent.getInventory().getHolder() instanceof SpawnerStorageHolder) == (2136086181 ^ i3)) {
            brggpzexganngrjj(i3, 1327042570);
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -91179733) {
            i3 = 1510127996 ^ i3;
            handleClick(inventoryClickEvent, 743228312);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 713391817) {
                int i4 = 354134390 ^ i3;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -91179733 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (248660353 ^ i3)) {
                int i5 = 940503293 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 713391817 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (23171815 ^ i3)) {
                    break;
                }
            }
        }
        int i6 = 402066746 ^ i3;
        throw new RuntimeException();
    }

    @org.bukkit.event.EventHandler
    public void onInventoryClose(org.bukkit.event.inventory.InventoryCloseEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.gui.SpawnerStorageGUI.onInventoryClose(org.bukkit.event.inventory.InventoryCloseEvent):void");
    }

    private int getMaxPages(PlacedSpawner placedSpawner, int i) {
        int i2 = 584258442 ^ (627682460 ^ 916804210);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1996526815) {
            int i3 = 2046289618 ^ i2;
            List buildAllDisplayItems = buildAllDisplayItems(placedSpawner, 899214977);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1195400626) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1195400626 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (765859768 ^ i3)) {
                        int i4 = 1230128981 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2142775226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (86661366 ^ i3)) {
                            break;
                        }
                    }
                }
                int i5 = 1680160538 ^ i3;
                throw new IOException("double");
            }
            i2 = 1398249876 ^ i3;
            if (buildAllDisplayItems.isEmpty() == (465539618 ^ i2)) {
                brggpzexganngrjj(i2, 745108567);
                return (int) Math.ceil(buildAllDisplayItems.size() / 45.0d);
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -570650352) {
                return (byte) (1341588726 ^ (1414043349 ^ i2));
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -570650352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1565379615 ^ i2)) {
                int i6 = 1894928383 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1996526815 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2098021181 ^ i2)) {
                    int i7 = 2094211080 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1095289943 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2131336154 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1763219098 ^ i2;
        throw new IOException();
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
        rdkyrhpmbb = ByteBuffer.wrap(uubhlsagwhuynqb()).asCharBuffer().toString();
        DNEjX5Sc18 = 973995564 ^ new Random(-7956839276792454107L).nextInt();
    }

    public static String faspjabefl(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = rdkyrhpmbb.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] jqrjziogralbidy() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, 0};
    }

    private static byte[] kqeemcrgfnyidao() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, 14};
    }

    private static byte[] byupxjzwojiokgr() {
        return new byte[]{0, 0, 0, 23, 0, 0, 0, 28};
    }

    private static byte[] syxzsijmtzxcebl() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 51};
    }

    private static byte[] ezsfeudbftrwmso() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, 59};
    }

    private static byte[] smbyggxkbokwcnj() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 73};
    }

    private static byte[] tpnvafxzdgxfbtr() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, 79};
    }

    private static byte[] fucqqonjwlcxsdw() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 90};
    }

    private static byte[] gxauooydacgioce() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, 108};
    }

    private static byte[] qeeruzzkhgucfyv() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 122};
    }

    private static byte[] lyturszfbtfvxqc() {
        return new byte[]{0, 0, 0, 17, 0, 0, 0, -126};
    }

    private static byte[] uubhlsagwhuynqb() {
        return new byte[]{50, 89, 50, 77, 51, 87, 53, 95, 52, 69, 50, 30, 50, 93, 51, 64, 53, 93, 52, 70, 50, 29, 50, 88, 51, 94, 53, 94, 52, 91, 51, 64, 57, 84, 51, 93, 52, 71, 50, 29, 52, 74, 49, 86, 48, 88, 52, 94, 51, 25, 57, 80, 51, 92, 52, 88, 57, 81, 57, 76, 56, 86, 56, 93, 52, 74, 56, 23, 56, 75, 51, 72, 48, 85, 57, 79, 57, 86, 56, 86, 56, 66, 52, 20, 56, 80, 56, 91, 51, 87, 48, 90, 57, 22, 57, 75, 56, 95, 56, 95, 52, 77, 56, 28, 50, 83, 57, 89, 51, 93, 56, 76, 50, 92, 57, 64, 51, 23, 56, 18, 50, 64, 56, 64, 48, 88, 49, 79, 55, 92, 51, 93, 48, 66, 57, 110, 56, 67, 50, 74, 56, 64, 48, 92, 49, 29, 54, 21, 49, 71, 54, 87, 54, 84, 54, 85, 49, 18, 49, 28, 49, 89, 53, 85, 56, 74, 56, 106, 49, 73, 49, 85, 53, 83, 56, 87, 56, 70, 49, 28, 50, -105, 52, 0, 48, 123, 54, 95, 55, 93, 50, 83, 52, 92, 48, 24, 54, 71, 55, 91, 50, 16, 52, 84, 48, 87, 54, 95, 55, 88, 50, 85, 52, 84, 48, 76, 55, 18, 52, 65, 55, 66, 55, 82, 48, 64, 55, 90, 50, 82, 50, 69, 51, 111, 55, 67, 52, 75, 55, 66, 55, 86, 48, 18, 49, 20, 51, 81, 49, 95, 52, 94, 54, 68, 49, 93, 48, 69, 50, 17, 49, 20, 54, 82, 54, 81, 57, 95, 49, 85, 49, 28, 54, 68, 54, 93, 57, 65, 49, 90, 49, 84, 54, 90, 54, 76, 57, 82, 49, 94, 49, 84, 54, 17};
    }

    private static int brggpzexganngrjj(int i, int i2) {
        return i2 ^ i;
    }
}
