package com.kammoun.donutCore.sell.menus;

import com.kammoun.donutCore.api.utils.NumberUtils;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.api.utils.menu.KMenu;
import com.kammoun.donutCore.sell.SellPlugin;
import com.kammoun.donutCore.sell.model.holders.WorthMenuHolder;
import com.kammoun.donutCore.sell.service.Enums.FilterType;
import com.kammoun.donutCore.sell.service.Enums.SortType;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class WorthMenu extends KMenu implements Listener {
    private static final int ITEMS_PER_PAGE = 45;
    private static final Set<Material> INVALID_MATERIALS;
    private final KItem sort;
    private final KItem filter;
    private final KItem refresh;
    private final String worthLore;

    @NotNull
    private final List<String> adminLore;
    private final SellPlugin sellPlugin;
    private static int ulRajFGxys = 0;
    private transient int ahrk2BZYmD = 2132970425;
    private static String[] nothing_to_see_here = new String[15];

    public static class AnonymousClass1 {
        static final int[] $SwitchMap$com$kammoun$donutCore$sell$service$Enums$SortType;
        static final int[] $SwitchMap$com$kammoun$donutCore$sell$service$Enums$FilterType;
        private static int raEsLacXNk = 0;
        private transient int IOUV7ok305 = 1072204979;
        private static String djncaweigm;
        private static String[] nothing_to_see_here;

        static {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.WorthMenu.AnonymousClass1.m298clinit():void");
        }

        public static String pyhyaqwhml(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = djncaweigm.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

        private static byte[] mobyvoxhcjszroq() {
            return new byte[0];
        }

        private static int swkhyuvrmsmxozhr(int i, int i2) {
            return i ^ i2;
        }
    }

    public WorthMenu(JavaPlugin javaPlugin, SellPlugin sellPlugin, int i) {
        super(javaPlugin, "Sell/Gui's/Worth.yml", 1546437752);
        utvbjrtlkyzpxagd(182908216 ^ 1558181205, 1018563239);
        int parseInt = 1906653243 ^ (264668225 ^ Integer.parseInt("351057584"));
        this.ahrk2BZYmD = 2132970425 ^ ulRajFGxys;
        this.sellPlugin = sellPlugin;
        this.worthLore = this.config.getString("WorthLore", "&fDefault worth: &a%unit_price%");
        this.sort = KItem.fromConfig(this.config.getConfigurationSection("Items.Sort"), 2126963651);
        this.filter = KItem.fromConfig(this.config.getConfigurationSection("Items.Filter"), 2126963651);
        this.refresh = KItem.fromConfig(this.config.getConfigurationSection("Items.Refresh"), 2126963651);
        this.adminLore = this.config.getStringList("Admin-Lore");
        Bukkit.getPluginManager().registerEvents(this, javaPlugin);
        int i2 = 601658057 ^ (1428416504 ^ (1078752449 ^ (2033342323 ^ (1065135810 ^ (1681904885 ^ (231168746 ^ (995068312 ^ (862593691 ^ parseInt))))))));
    }

    public void openInventory(Player player, int i, SortType sortType, FilterType filterType, int i2) {
        int i3 = 1367193180 ^ (97892737 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1091993720) {
            int i4 = 2134936707 ^ i3;
            List pricedMaterials = getPricedMaterials(sortType, filterType, 724322963);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1156389779) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1156389779 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (82894490 ^ i4)) {
                        break;
                    }
                }
                int i5 = 1758644336 ^ i4;
                throw new RuntimeException("double");
            }
            int i6 = 620683514 ^ i4;
            int max = Math.max((int) ((byte) (1281573769 ^ i6)), (int) Math.ceil(pricedMaterials.size() / 45.0d));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1662655554) {
                i3 = 568544683 ^ i6;
                int max2 = Math.max((int) ((byte) (1837108770 ^ i3)), Math.min(i, max));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1811968283) {
                    i6 = 1287980968 ^ i3;
                    WorthMenuHolder worthMenuHolder = new WorthMenuHolder(max2, max, filterType, sortType, 1745609950);
                    String[] strArr = new String[(byte) (558172553 ^ i6)];
                    strArr[(byte) (558172555 ^ i6)] = awmprgpmwb(qugtdyhhswourjn(), tdkcepoxgopwojw(), i6);
                    byte b = (byte) (558172554 ^ i6);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 170413145) {
                        i3 = 136481455 ^ i6;
                        strArr[b] = String.valueOf(max2);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1262229793) {
                            int i7 = 1310128869 ^ i3;
                            loadInventory(player, worthMenuHolder, max2, max, strArr, 2097699217);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 999017995) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -787441200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (866580862 ^ i7)) {
                                        int i8 = 1196174726 ^ i7;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 999017995 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1824049533 ^ i7)) {
                                            break;
                                        }
                                    }
                                }
                                int i9 = 196068205 ^ i7;
                                throw new RuntimeException("double");
                            }
                            i6 = 1161486215 ^ i7;
                            addMaterialsToPage(pricedMaterials, max2, 1999691172);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 308097585) {
                                int i10 = 949918783 ^ i6;
                                setNavigationItems((byte) (450181756 ^ i10), 558887814 ^ i10, 721035695);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != -693513272) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -693513272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (642752291 ^ i10)) {
                                            break;
                                        }
                                    }
                                    int i11 = 2048347875 ^ i10;
                                    throw new IllegalAccessException("double");
                                }
                                i6 = 1514419368 ^ i10;
                                addControlItems(sortType, filterType, 699490039);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 76052106) {
                                    int i12 = 706392924 ^ i6;
                                    player.openInventory(this.inventory);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1415441515) {
                                        int i13 = 1890168503 ^ i12;
                                        return;
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1415441515 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1128227374 ^ i12)) {
                                            break;
                                        }
                                    }
                                    int i14 = 1465543517 ^ i12;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 76052106 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (502820319 ^ i6)) {
                    int i15 = 718222048 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 308097585 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1946012946 ^ i6)) {
                        int i16 = 2079455696 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 170413145 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1712512633 ^ i6)) {
                            int i17 = 1964854968 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1662655554 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1495187253 ^ i6)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i18 = 417860674 ^ i6;
            throw new RuntimeException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1811968283 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2122411418 ^ i3)) {
                int i19 = 1565231958 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1262229793 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1189142717 ^ i3)) {
                    int i20 = 495991548 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1091993720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1722910393 ^ i3)) {
                        break;
                    }
                }
            }
        }
        int i21 = 996783549 ^ i3;
        throw new IllegalAccessException("double");
    }

    @EventHandler
    public void onInvClick(InventoryClickEvent inventoryClickEvent) {
        int i = 1763650096 ^ (142686814 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 391741969) {
            i = 893982321 ^ i;
            handleClick(inventoryClickEvent, 743228312);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1122946664) {
                int i2 = 2127589044 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 391741969 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1907700276 ^ i)) {
                int i3 = 1698996606 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1122946664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (833802797 ^ i)) {
                    int i4 = 1918721381 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1267876923 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1571125878 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 28374930 ^ i;
        throw new IllegalAccessException();
    }

    @Override
    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.WorthMenu.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    private boolean isSimilarIgnoreLore(org.bukkit.inventory.ItemStack r6, org.bukkit.inventory.ItemStack r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.WorthMenu.isSimilarIgnoreLore(org.bukkit.inventory.ItemStack, org.bukkit.inventory.ItemStack, int):boolean");
    }

    @Override
    protected void setMenuItems(String[] strArr, int i) {
        int i2 = 1710450019 ^ (503971356 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -998384999) {
            int i3 = 287052374 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1285376041 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2004179329 ^ i2)) {
                int i4 = 927864521 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -998384999 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1375678062 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1634593523 ^ i2;
        throw new RuntimeException();
    }

    private void addControlItems(SortType sortType, FilterType filterType, int i) {
        int i2 = 1291452477 ^ (86266470 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1432064952) {
            i2 = 1447654701 ^ i2;
            if (this.sort != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -418366766) {
                    int i3 = 1959575734 ^ i2;
                    this.inventory.setItem(this.sort.getSlot(1791774489).intValue(), createHighlightedItem(this.sort, sortType, 855333100));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1098268513) {
                        i2 = 1180691066 ^ i3;
                        if (this.filter == null) {
                            i2 = utvbjrtlkyzpxagd(i2, 709735575);
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1938386099) {
                            i3 = 1923955044 ^ i2;
                            this.inventory.setItem(this.filter.getSlot(1791774489).intValue(), createHighlightedItem(this.filter, filterType, 372257370));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -421484656) {
                                i2 = 1491111411 ^ i3;
                            }
                        }
                        if (this.refresh != null) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 568641546) {
                                int i4 = 1757919181 ^ i2;
                                this.inventory.setItem(this.refresh.getSlot(1791774489).intValue(), this.refresh.getItemStack(1475551979));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1742304865) {
                                    int i5 = 315497799 ^ i4;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1742304865 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1026312743 ^ i4)) {
                                        int i6 = 61657783 ^ i4;
                                        throw new IOException("double");
                                    }
                                }
                            }
                        }
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                case 70593613:
                                    int i7 = 2047453834 ^ i2;
                                    return;
                                case 618568658:
                                case 809456849:
                                    return;
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1098268513 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (898956939 ^ i3)) {
                            int i8 = 1057778626 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -421484656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1174970615 ^ i3)) {
                                int i9 = 26529888 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -240542631 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (970079152 ^ i3)) {
                                    int i10 = 108978632 ^ i3;
                                    throw new IOException();
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1938386099 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1887730008 ^ i2)) {
                        int i11 = 1666934049 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 568641546 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1289148976 ^ i2)) {
                            int i12 = 1513119694 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -418366766 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1492141432 ^ i2)) {
                                int i13 = 687020803 ^ i2;
                                throw new IOException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 66433756:
                        i2 = 848505548 ^ i2;
                        break;
                    case 932857564:
                        break;
                    case 1301777201:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1432064952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (950329053 ^ i2)) {
                int i14 = 393509549 ^ i2;
                throw new RuntimeException("double");
            }
        }
    }

    private ItemStack createHighlightedItem(KItem kItem, SortType sortType, int i) {
        int i2 = 2094748448 ^ (1503249323 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 834503995) {
            i2 = 1525208659 ^ i2;
            ItemStack clone = kItem.getItemStack(1475551979).clone();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -419743839) {
                int i3 = 1250028896 ^ i2;
                ItemMeta itemMeta = clone.getItemMeta();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1292608349) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1292608349 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1290505256 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 1568805992 ^ i3;
                    throw new IllegalAccessException("double");
                }
                i2 = 1508009209 ^ i3;
                if (itemMeta != null) {
                    i2 = utvbjrtlkyzpxagd(i2, 916583413);
                    itemMeta.setLore(sortType.getLore().stream().map(ChatFormater::color).toList());
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -924261184) {
                        int i5 = 2049451262 ^ i2;
                        clone.setItemMeta(itemMeta);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 430555955) {
                            int i6 = 550709001 ^ i5;
                            return clone;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 523303802 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1772464156 ^ i5)) {
                                int i7 = 1206236808 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 430555955 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (450844382 ^ i5)) {
                                    break;
                                }
                            }
                        }
                        int i8 = 323518828 ^ i5;
                        throw new RuntimeException("double");
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2112322409) {
                    int i9 = 220080322 ^ i2;
                    return clone;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -924261184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1147997634 ^ i2)) {
                int i10 = 802580219 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -419743839 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (199017171 ^ i2)) {
                    int i11 = 1359210208 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 353779065 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (906498452 ^ i2)) {
                        int i12 = 679456569 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 834503995 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1861811346 ^ i2)) {
                            int i13 = 688160241 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2112322409 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (376679080 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i14 = 1017424192 ^ i2;
        throw new RuntimeException();
    }

    private org.bukkit.inventory.ItemStack createHighlightedItem(com.kammoun.donutCore.api.utils.items.KItem r5, com.kammoun.donutCore.sell.service.Enums.FilterType r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.WorthMenu.createHighlightedItem(com.kammoun.donutCore.api.utils.items.KItem, com.kammoun.donutCore.sell.service.Enums.FilterType, int):org.bukkit.inventory.ItemStack");
    }

    private void addMaterialsToPage(List list, int i, int i2) {
        int i3 = 1972225207 ^ (1568746230 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1540256619) {
            int i4 = 1393785815 ^ i3;
            int i5 = (i - ((byte) (946517435 ^ i4))) * ((byte) (946517399 ^ i4));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1017795119) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1017795119 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (129463208 ^ i4)) {
                        break;
                    }
                }
                int i6 = 1445118645 ^ i4;
                throw new IllegalAccessException("double");
            }
            i3 = 1867216526 ^ i4;
            int min = Math.min(i5 + ((byte) (1461830425 ^ i3)), list.size());
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1190258270) {
                int i7 = 692055824 ^ i3;
                int i8 = i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -252616413) {
                    int i9 = 1310085287 ^ i7;
                    int i10 = (byte) (805862531 ^ i9);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -2143034343) {
                        i3 = 948928967 ^ i9;
                        while (i8 < min) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1145039392) {
                                int i11 = 1480101337 ^ i3;
                                if (i10 >= getSize(2086170582) - ((byte) (1354723476 ^ i11))) {
                                    utvbjrtlkyzpxagd(i11, 2140071371);
                                    return;
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -2047114006) {
                                    i7 = 808974641 ^ i11;
                                    Material material = (Material) list.get(i8);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 71585123) {
                                        i9 = 1777161493 ^ i7;
                                        double price = getPrice(material);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1261364680) {
                                            int i12 = 1874464118 ^ i9;
                                            this.inventory.setItem(i10, createWorthItem(material, price, 763822048));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 922652283) {
                                                i11 = 1306863352 ^ i12;
                                                i8 += 725284662 ^ i11;
                                                i10 += 725284662 ^ i11;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1507310009) {
                                                    int utvbjrtlkyzpxagd = utvbjrtlkyzpxagd(i11, 2029248226);
                                                    try {
                                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(utvbjrtlkyzpxagd) == 39162565) {
                                                            throw new RuntimeException();
                                                        }
                                                        throw null;
                                                    } catch (RuntimeException e) {
                                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                            case -1639362902:
                                                                i3 = 1258604210 ^ utvbjrtlkyzpxagd;
                                                                break;
                                                            case -638204949:
                                                                i3 = 1676891930 ^ utvbjrtlkyzpxagd;
                                                                break;
                                                            default:
                                                                throw new RuntimeException("Error in hash");
                                                        }
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -965772488) {
                                                        }
                                                        while (true) {
                                                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                                                case 976666:
                                                                    i3 = 273289763 ^ i3;
                                                                    break;
                                                                case 594362443:
                                                                case 1587320986:
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 922652283 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1924022550 ^ i12)) {
                                                        int i13 = 2025484696 ^ i12;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -2047114006 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (739950890 ^ i11)) {
                                        int i14 = 2007898641 ^ i11;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1507310009 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1544876845 ^ i11)) {
                                            int i15 = 1574435364 ^ i11;
                                            throw new IllegalAccessException();
                                        }
                                    }
                                }
                            }
                        }
                        int i16 = 666265618 ^ i3;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -2143034343 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1338573795 ^ i9)) {
                            int i17 = 514180054 ^ i9;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1261364680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (2024711185 ^ i9)) {
                                int i18 = 656248635 ^ i9;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -638204949 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (608178126 ^ i9)) {
                                    int i19 = 161853481 ^ i9;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 71585123 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (142215106 ^ i7)) {
                        int i20 = 242048723 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -252616413 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1136003384 ^ i7)) {
                            int i21 = 883206053 ^ i7;
                            throw new IOException("double");
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1190258270 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1534871545 ^ i3)) {
                    int i22 = 84490423 ^ i3;
                    throw new RuntimeException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1145039392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (63407145 ^ i3)) {
                int i23 = 760901692 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1540256619 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1790549799 ^ i3)) {
                    int i24 = 1444554273 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -965772488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (332257588 ^ i3)) {
                        int i25 = 821095581 ^ i3;
                        throw new IllegalAccessException("double");
                    }
                }
            }
        }
    }

    private ItemStack createWorthItem(Material material, double d, int i) {
        int i2 = 1110398421 ^ (1631763537 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 12995907) {
            int i3 = 2136247254 ^ i2;
            ItemStack itemStack = new ItemStack(material);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -94235664) {
                int i4 = 593889578 ^ i3;
                ItemMeta itemMeta = itemStack.getItemMeta();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -514696543) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -514696543 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1168472568 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 1111203169 ^ i4;
                    throw new IOException("double");
                }
                int i6 = 1243311699 ^ i4;
                if (itemMeta == null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1316411333) {
                        int i7 = 747938924 ^ i6;
                        return itemStack;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1316411333 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (591134034 ^ i6)) {
                            break;
                        }
                    }
                    int i8 = 2145447617 ^ i6;
                    throw new IOException("double");
                }
                int utvbjrtlkyzpxagd = utvbjrtlkyzpxagd(i6, 1440965768);
                String str = this.worthLore;
                String awmprgpmwb = awmprgpmwb(qurlkkgkchvfpjm(), tdkcepoxgopwojw(), utvbjrtlkyzpxagd);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(utvbjrtlkyzpxagd) != 512887929) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(utvbjrtlkyzpxagd) == 512887929 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(utvbjrtlkyzpxagd) == (1073704779 ^ utvbjrtlkyzpxagd)) {
                            break;
                        }
                    }
                    int i9 = 311516321 ^ utvbjrtlkyzpxagd;
                    throw new IOException("double");
                }
                int i10 = 118125511 ^ utvbjrtlkyzpxagd;
                String replace = str.replace(awmprgpmwb, NumberUtils.formatDouble(d, 1827184238));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 650220097) {
                    i10 = 151631344 ^ i10;
                    String color = ChatFormater.color(replace);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1854684609) {
                        i3 = 1865750135 ^ i10;
                        itemMeta.setLore(Collections.singletonList(color));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 388271738) {
                            i2 = 118056059 ^ i3;
                            itemStack.setItemMeta(itemMeta);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 795848098) {
                                int i11 = 608573038 ^ i2;
                                return itemStack;
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1854684609 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1626609793 ^ i10)) {
                        int i12 = 1263888661 ^ i10;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 650220097 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1639760248 ^ i10)) {
                            int i13 = 1571554575 ^ i10;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -718533798 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (585300296 ^ i10)) {
                                break;
                            }
                        }
                    }
                }
                int i14 = 406777638 ^ i10;
                throw new IllegalAccessException();
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 388271738 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1944704100 ^ i3)) {
                    int i15 = 880405256 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -94235664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (175842193 ^ i3)) {
                        break;
                    }
                }
            }
            int i16 = 27524657 ^ i3;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 795848098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1832608104 ^ i2)) {
                int i17 = 1089272526 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 12995907 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1330389514 ^ i2)) {
                    break;
                }
            }
        }
        int i18 = 372820756 ^ i2;
        throw new IOException("double");
    }

    private double getPrice(Material material) {
        int i = 1726623087 ^ (1829306723 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1152409858) {
            int i2 = 429383038 ^ i;
            return this.sellPlugin.getConfigManager(1299309642).getCategoryConfigLoader(1765237940).getMaterialPrice(material, 1214441436);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2012312846 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (668790556 ^ i)) {
                int i3 = 436163113 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1152409858 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (343348858 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1483143352 ^ i;
        throw new RuntimeException();
    }

    private java.util.List getPricedMaterials(com.kammoun.donutCore.sell.service.Enums.SortType r6, com.kammoun.donutCore.sell.service.Enums.FilterType r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.WorthMenu.getPricedMaterials(com.kammoun.donutCore.sell.service.Enums.SortType, com.kammoun.donutCore.sell.service.Enums.FilterType, int):java.util.List");
    }

    private boolean matchesFilter(org.bukkit.Material r6, com.kammoun.donutCore.sell.service.Enums.FilterType r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.WorthMenu.matchesFilter(org.bukkit.Material, com.kammoun.donutCore.sell.service.Enums.FilterType, int):boolean");
    }

    private boolean isTool(org.bukkit.Material r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.WorthMenu.isTool(org.bukkit.Material, int):boolean");
    }

    private boolean isFood(org.bukkit.Material r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.WorthMenu.isFood(org.bukkit.Material, int):boolean");
    }

    private boolean isCombat(org.bukkit.Material r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.WorthMenu.isCombat(org.bukkit.Material, int):boolean");
    }

    private boolean isPotion(Material material, int i) {
        int utvbjrtlkyzpxagd;
        boolean z;
        int i2 = 127387734 ^ (1983637787 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1765274871) {
            int i3 = 1714079913 ^ i2;
            String name = material.name();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1482797502) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1482797502 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1514687770 ^ i3)) {
                        break;
                    }
                }
                int i4 = 516381798 ^ i3;
                throw new IOException("double");
            }
            i2 = 184301165 ^ i3;
            if (name.contains(awmprgpmwb(nvwueoiklepzxer(), tdkcepoxgopwojw(), i2)) != (1578106789 ^ i2)) {
                utvbjrtlkyzpxagd = utvbjrtlkyzpxagd(i2, 902995292);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -260047574) {
                i2 = 1668907502 ^ i2;
                if (name.equals(awmprgpmwb(yzultuddhyvmpmm(), tdkcepoxgopwojw(), i2)) != (1031175755 ^ i2)) {
                    utvbjrtlkyzpxagd = utvbjrtlkyzpxagd(i2, 1454054578);
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -340528551) {
                    int i5 = 1329868714 ^ i2;
                    String awmprgpmwb = awmprgpmwb(vwcpwfmzniungfh(), tdkcepoxgopwojw(), i5);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1852666101) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1852666101 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1849325044 ^ i5)) {
                                int i6 = 1956235540 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 779506875 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (175123797 ^ i5)) {
                                    break;
                                }
                            }
                        }
                        int i7 = 2132741410 ^ i5;
                        throw new RuntimeException("double");
                    }
                    int i8 = 2068864524 ^ i5;
                    if (name.equals(awmprgpmwb) != (157421549 ^ i8)) {
                        utvbjrtlkyzpxagd = 1656712468 ^ i8;
                    } else {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 1259372392) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1259372392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1400150140 ^ i8)) {
                                    break;
                                }
                            }
                            int i9 = 277495391 ^ i8;
                            throw new IOException("double");
                        }
                        i2 = 2039277430 ^ i8;
                        if (name.equals(awmprgpmwb(mtxvyfnkjfziuqs(), tdkcepoxgopwojw(), i2)) == (1894705307 ^ i2)) {
                            int utvbjrtlkyzpxagd2 = utvbjrtlkyzpxagd(i2, 1218970797);
                            z = (byte) (944172086 ^ utvbjrtlkyzpxagd2);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(utvbjrtlkyzpxagd2) == -1036557903) {
                                int i10 = 748262556 ^ utvbjrtlkyzpxagd2;
                                return z;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(utvbjrtlkyzpxagd2) == -1036557903 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(utvbjrtlkyzpxagd2) == (439915889 ^ utvbjrtlkyzpxagd2)) {
                                    break;
                                }
                            }
                            int i11 = 1827289982 ^ utvbjrtlkyzpxagd2;
                            throw new RuntimeException("double");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2022226725) {
                            utvbjrtlkyzpxagd = 456362594 ^ i2;
                        }
                    }
                }
            }
            z = (byte) (1809670904 ^ utvbjrtlkyzpxagd);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(utvbjrtlkyzpxagd) == 1592465355) {
                int i12 = 197769473 ^ utvbjrtlkyzpxagd;
                try {
                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i12) != 170396196) {
                        throw null;
                    }
                    throw new IllegalAccessException();
                } catch (IllegalAccessException e) {
                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                        case 10936259:
                            utvbjrtlkyzpxagd = utvbjrtlkyzpxagd(i12, 942415621);
                            break;
                        case 779506875:
                            utvbjrtlkyzpxagd = utvbjrtlkyzpxagd(i12, 1039535722);
                            break;
                        default:
                            throw new IOException("Error in hash");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(utvbjrtlkyzpxagd) != -1043978262) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(utvbjrtlkyzpxagd) == -1043978262 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(utvbjrtlkyzpxagd) == (521501279 ^ utvbjrtlkyzpxagd)) {
                                int i13 = 913101230 ^ utvbjrtlkyzpxagd;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(utvbjrtlkyzpxagd) == 10936259 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(utvbjrtlkyzpxagd) == (699301767 ^ utvbjrtlkyzpxagd)) {
                                    int i14 = 596060205 ^ utvbjrtlkyzpxagd;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(utvbjrtlkyzpxagd)) {
                            case 183346578:
                                int i15 = 1290255447 ^ utvbjrtlkyzpxagd;
                                break;
                            case 481592621:
                                break;
                            case 1651015887:
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(utvbjrtlkyzpxagd) == 1592465355 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(utvbjrtlkyzpxagd) == (1876092023 ^ utvbjrtlkyzpxagd)) {
                    int i16 = 722761635 ^ utvbjrtlkyzpxagd;
                    throw new IllegalAccessException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1493449392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (559216755 ^ i2)) {
                int i17 = 893005077 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -260047574 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1729522147 ^ i2)) {
                    int i18 = 632905931 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1765274871 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1906417779 ^ i2)) {
                        int i19 = 600626063 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2022226725 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (724659703 ^ i2)) {
                            int i20 = 1091945626 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -340528551 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1658372581 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i21 = 635710618 ^ i2;
        throw new RuntimeException();
    }

    private boolean isBook(org.bukkit.Material r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.WorthMenu.isBook(org.bukkit.Material, int):boolean");
    }

    private boolean isIngredient(Material material, int i) {
        boolean z;
        int i2 = 1393287180 ^ (994661934 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1505538161) {
            int i3 = 1500046059 ^ i2;
            String name = material.name();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1829001429) {
                int i4 = 1855018575 ^ i3;
                if (name.contains(awmprgpmwb(kbcebbamwwkssoa(), tdkcepoxgopwojw(), i4)) == (483271338 ^ i4)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -428796592) {
                        i4 = 1972318236 ^ i4;
                        if (name.contains(awmprgpmwb(gfktijyyfdzokqm(), tdkcepoxgopwojw(), i4)) == (1765872310 ^ i4)) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1242076595) {
                                i3 = 235204930 ^ i4;
                                if (name.contains(awmprgpmwb(vruamrkdmgbpfyv(), tdkcepoxgopwojw(), i3)) != (1732633588 ^ i3)) {
                                    i4 = utvbjrtlkyzpxagd(i3, 766656795);
                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 976166819) {
                                    i4 = 1066557688 ^ i3;
                                    String awmprgpmwb = awmprgpmwb(oztxqwpfrzkumte(), tdkcepoxgopwojw(), i4);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -960751518) {
                                        i4 = 652162500 ^ i4;
                                        if (name.contains(awmprgpmwb) == (2114500296 ^ i4)) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -263866813) {
                                                int i5 = 1251439676 ^ i4;
                                                if (name.contains(awmprgpmwb(xjdfgnmomojttur(), tdkcepoxgopwojw(), i5)) == (882885364 ^ i5)) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1526851679) {
                                                        i2 = 1906266631 ^ i5;
                                                        if (name.contains(awmprgpmwb(eazfenpyvapncfo(), tdkcepoxgopwojw(), i2)) != (1157665011 ^ i2)) {
                                                            i4 = utvbjrtlkyzpxagd(i2, 267858460);
                                                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 671385498) {
                                                            int i6 = 278624378 ^ i2;
                                                            String awmprgpmwb2 = awmprgpmwb(vqxpnqzckggejzt(), tdkcepoxgopwojw(), i6);
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1394654134) {
                                                                while (true) {
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1394654134 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1521556629 ^ i6)) {
                                                                        break;
                                                                    }
                                                                }
                                                                int i7 = 2025487350 ^ i6;
                                                                throw new RuntimeException("double");
                                                            }
                                                            i3 = 1464528672 ^ i6;
                                                            if (name.contains(awmprgpmwb2) != (47253417 ^ i3)) {
                                                                i4 = 1210492230 ^ i3;
                                                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 378027336) {
                                                                i4 = 910215118 ^ i3;
                                                                if (name.contains(awmprgpmwb(yhackptxfxlbths(), tdkcepoxgopwojw(), i4)) == (881967207 ^ i4)) {
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1534196935) {
                                                                        i4 = 2085253485 ^ i4;
                                                                        if (name.equals(awmprgpmwb(pjeoizuyqyilffw(), tdkcepoxgopwojw(), i4)) != (1222357258 ^ i4)) {
                                                                            i4 = 36443109 ^ i4;
                                                                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1188923474) {
                                                                            i2 = 1415969605 ^ i4;
                                                                            String awmprgpmwb3 = awmprgpmwb(uhanjsawvbohpxy(), tdkcepoxgopwojw(), i2);
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -437104008) {
                                                                                i4 = 1120230305 ^ i2;
                                                                                if (name.equals(awmprgpmwb3) != (1585123822 ^ i4)) {
                                                                                    i4 = utvbjrtlkyzpxagd(i4, 344765185);
                                                                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -203911310) {
                                                                                    i5 = 966893616 ^ i4;
                                                                                    if (name.equals(awmprgpmwb(obbmyyirefifqig(), tdkcepoxgopwojw(), i5)) != (1742385630 ^ i5)) {
                                                                                        i4 = utvbjrtlkyzpxagd(i5, 757928753);
                                                                                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1054183155) {
                                                                                        i4 = 1639436612 ^ i5;
                                                                                        if (name.contains(awmprgpmwb(fahsacyutgcfcrv(), tdkcepoxgopwojw(), i4)) == (107831450 ^ i4)) {
                                                                                            i4 = 560701241 ^ i4;
                                                                                            z = (byte) (654770083 ^ i4);
                                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 943193369) {
                                                                                                int i8 = 1902259521 ^ i4;
                                                                                                return z;
                                                                                            }
                                                                                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 862651600) {
                                                                                            i4 = 1285210741 ^ i4;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                while (true) {
                                                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                                                        case 98193494:
                                                                            i4 = 2120639112 ^ i4;
                                                                            break;
                                                                        case 1237089622:
                                                                            break;
                                                                        case 1997870171:
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1526851679 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1027907433 ^ i5)) {
                                                            int i9 = 1251573476 ^ i5;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1054183155 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1847205600 ^ i5)) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    int i10 = 1709140262 ^ i5;
                                                    throw new RuntimeException("double");
                                                }
                                                i4 = 2120769563 ^ i5;
                                            }
                                        }
                                        while (true) {
                                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                                case 70294571:
                                                    i4 = 889132071 ^ i4;
                                                    break;
                                                case 427385079:
                                                case 657624007:
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -263866813 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1376597520 ^ i4)) {
                                    int i11 = 69768187 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1289316590 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1031314333 ^ i4)) {
                                        int i12 = 60441074 ^ i4;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 489339112 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1613392161 ^ i4)) {
                                            int i13 = 463626409 ^ i4;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1242076595 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1713869804 ^ i4)) {
                                                int i14 = 862871422 ^ i4;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -960751518 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1472869433 ^ i4)) {
                                                    int i15 = 815392189 ^ i4;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 943193369 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2035026394 ^ i4)) {
                                                        int i16 = 1489704647 ^ i4;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -203911310 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1840024852 ^ i4)) {
                                                            int i17 = 1888812463 ^ i4;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1188923474 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1511406113 ^ i4)) {
                                                                int i18 = 427054370 ^ i4;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1534196935 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (290945665 ^ i4)) {
                                                                    int i19 = 720962305 ^ i4;
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
                            }
                        } else {
                            i4 = utvbjrtlkyzpxagd(i4, 599175257);
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 862651600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (934568758 ^ i4)) {
                            int i20 = 89280279 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -428796592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (222772317 ^ i4)) {
                                int i21 = 544777548 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1472010106 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (944924144 ^ i4)) {
                                    int i22 = 552919272 ^ i4;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                } else {
                    i4 = utvbjrtlkyzpxagd(i4, 1446608965);
                }
                z = (byte) (1257743086 ^ i4);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1472010106) {
                    int utvbjrtlkyzpxagd = utvbjrtlkyzpxagd(i4, 1512313897);
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(utvbjrtlkyzpxagd) != 10101452) {
                            throw null;
                        }
                        throw new IllegalAccessException();
                    } catch (IllegalAccessException e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case -2036484560:
                                i4 = utvbjrtlkyzpxagd(utvbjrtlkyzpxagd, 326558171);
                                break;
                            case 626278346:
                                i4 = 1192218852 ^ utvbjrtlkyzpxagd;
                                break;
                            default:
                                throw new IllegalAccessException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 489339112) {
                            int i23 = 1438746111 ^ i4;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 862651600) {
                        int i202 = 89280279 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -428796592) {
                            continue;
                        } else {
                            int i212 = 544777548 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1472010106) {
                                int i222 = 552919272 ^ i4;
                                throw new RuntimeException("double");
                            }
                            continue;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1829001429 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (271605580 ^ i3)) {
                    int i24 = 1104115656 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2036484560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (963986193 ^ i3)) {
                        int i25 = 314960596 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 976166819 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (214485774 ^ i3)) {
                            int i26 = 878615412 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 378027336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (990549964 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i27 = 321501344 ^ i3;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1505538161 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2093486070 ^ i2)) {
                int i28 = 1197012759 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 671385498 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1516133337 ^ i2)) {
                    int i29 = 1302534802 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -437104008 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (747376916 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i30 = 2146942958 ^ i2;
        throw new RuntimeException("double");
    }

    private boolean isUtility(org.bukkit.Material r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.WorthMenu.isUtility(org.bukkit.Material, int):boolean");
    }

    private boolean isValidItem(org.bukkit.Material r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.WorthMenu.isValidItem(org.bukkit.Material):boolean");
    }

    @Generated
    public KItem getSort() {
        int i = 1101069355 ^ (1908643092 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1733146469) {
            int i2 = 600207946 ^ i;
            return this.sort;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1733146469 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (62026763 ^ i)) {
                int i3 = 1917333030 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2038310198 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (883995012 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1109052236 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public KItem getFilter() {
        int i = 1055728599 ^ (230607762 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2127150261) {
            int i2 = 1748932905 ^ i;
            return this.filter;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2127150261 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (830512902 ^ i)) {
                int i3 = 403114337 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1060992512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (111168717 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2065414447 ^ i;
        throw new IOException();
    }

    @Generated
    public KItem getRefresh() {
        int i = 2119555064 ^ (2075169455 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 881011674) {
            int i2 = 1377370915 ^ i;
            return this.refresh;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1538575680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (595759433 ^ i)) {
                int i3 = 1410430333 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 881011674 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1105772428 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1663743109 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public String getWorthLore() {
        int i = 1464186096 ^ (1095741829 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1409733942) {
            int i2 = 1574146170 ^ i;
            return this.worthLore;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1409733942 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (928241008 ^ i)) {
                int i3 = 161132457 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1164290328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1169782929 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1598817589 ^ i;
        throw new IOException();
    }

    @Generated
    @NotNull
    public List<String> getAdminLore() {
        int i = 720258041 ^ (1087253469 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1252671553) {
            int i2 = 415010837 ^ i;
            return this.adminLore;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1252671553 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (427151414 ^ i)) {
                int i3 = 2088973181 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1890664215 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1008385244 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 719620675 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public SellPlugin getSellPlugin() {
        int i = 1117570292 ^ (2047312847 ^ 1131749420);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -546096965) {
            int i2 = 1556453056 ^ i;
            return this.sellPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 962563769 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1200149597 ^ i)) {
                int i3 = 754765733 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -546096965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (801634420 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1202609110 ^ i;
        throw new IllegalAccessException();
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
        int parseInt = 754536132 ^ (748200454 ^ Integer.parseInt("351057584"));
        ulRajFGxys = (-479718127) ^ new Random(4311956306862172377L).nextInt();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) != -1536502896) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1536502896 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (641133288 ^ parseInt)) {
                    int i = 511290306 ^ parseInt;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -351745128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (2141023855 ^ parseInt)) {
                        break;
                    }
                }
            }
            int i2 = 847826080 ^ parseInt;
            throw new IOException();
        }
        int i3 = 166478593 ^ parseInt;
        Material material = Material.AIR;
        Material[] materialArr = new Material[(byte) (492902737 ^ i3)];
        materialArr[(byte) (492902771 ^ i3)] = Material.CAVE_AIR;
        materialArr[(byte) (492902770 ^ i3)] = Material.VOID_AIR;
        materialArr[(byte) (492902769 ^ i3)] = Material.WATER;
        materialArr[(byte) (492902768 ^ i3)] = Material.LAVA;
        materialArr[(byte) (492902775 ^ i3)] = Material.END_PORTAL_FRAME;
        materialArr[(byte) (492902774 ^ i3)] = Material.FIRE;
        materialArr[(byte) (492902773 ^ i3)] = Material.NETHER_PORTAL;
        materialArr[(byte) (492902772 ^ i3)] = Material.END_PORTAL;
        materialArr[(byte) (492902779 ^ i3)] = Material.END_GATEWAY;
        materialArr[(byte) (492902778 ^ i3)] = Material.STRUCTURE_VOID;
        materialArr[(byte) (492902777 ^ i3)] = Material.STRUCTURE_BLOCK;
        materialArr[(byte) (492902776 ^ i3)] = Material.JIGSAW;
        materialArr[(byte) (492902783 ^ i3)] = Material.BARRIER;
        materialArr[(byte) (492902782 ^ i3)] = Material.BEDROCK;
        materialArr[(byte) (492902781 ^ i3)] = Material.MOVING_PISTON;
        materialArr[(byte) (492902780 ^ i3)] = Material.PISTON_HEAD;
        materialArr[(byte) (492902755 ^ i3)] = Material.FROSTED_ICE;
        materialArr[(byte) (492902754 ^ i3)] = Material.BUBBLE_COLUMN;
        materialArr[(byte) (492902753 ^ i3)] = Material.LIGHT;
        materialArr[(byte) (492902752 ^ i3)] = Material.FARMLAND;
        materialArr[(byte) (492902759 ^ i3)] = Material.DIRT_PATH;
        materialArr[(byte) (492902758 ^ i3)] = Material.KELP_PLANT;
        materialArr[(byte) (492902757 ^ i3)] = Material.BAMBOO_SAPLING;
        materialArr[(byte) (492902756 ^ i3)] = Material.SWEET_BERRY_BUSH;
        materialArr[(byte) (492902763 ^ i3)] = Material.CAVE_VINES_PLANT;
        materialArr[(byte) (492902762 ^ i3)] = Material.CAVE_VINES;
        materialArr[(byte) (492902761 ^ i3)] = Material.COCOA;
        materialArr[(byte) (492902760 ^ i3)] = Material.POWDER_SNOW_CAULDRON;
        materialArr[(byte) (492902767 ^ i3)] = Material.TRIPWIRE;
        materialArr[(byte) (492902766 ^ i3)] = Material.REDSTONE_WIRE;
        materialArr[(byte) (492902765 ^ i3)] = Material.MELON_STEM;
        materialArr[(byte) (492902764 ^ i3)] = Material.PUMPKIN_STEM;
        materialArr[(byte) (492902739 ^ i3)] = Material.ATTACHED_MELON_STEM;
        materialArr[(byte) (492902738 ^ i3)] = Material.ATTACHED_PUMPKIN_STEM;
        INVALID_MATERIALS = EnumSet.of(material, materialArr);
    }

    public static String awmprgpmwb(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] tdkcepoxgopwojw() {
        return new byte[]{90, 99, 97, 107, 1, 10, 9, 35, 88, 34, 33, 51, 115, 41, 22, 22, 33, 26, ITEMS_PER_PAGE, 101, 19, 53, 38, 11, 19, 27, 75, 84, 14, 83, 71, 85, 93, 70, 107, 53, 69, 69, 119, 120, 113, 96, 65, 88, 85, 10, 62, 86, 46, 31, 107, 106, 65, 77, 37, 96, 72, 32, 48, 80, 85, 79, 49, 68, 26, 97, 75, 124, 89, 53, 24, 122, 27, 50, 100, 73, 75, 100, 26, 60, 68, 123, 104, 63, 8, 75, 6, 51, 57, 24, 52, 34, 100, 37, 89, 68, 121, 38, 80, 2, 107, 100, 125, 24, 24, 101, 21, 68, 84, 81, 88, 102, 27, 90, 78, Byte.MAX_VALUE, 111, 58, 68, 76, 86, 87};
    }

    private static byte[] qugtdyhhswourjn() {
        return new byte[]{-111, -87, 89, Byte.MAX_VALUE, 54, 72, 60, 119, 109, 112, 20, 110, 66, 59};
    }

    private static byte[] qurlkkgkchvfpjm() {
        return new byte[]{-110, -84, 81, 119, 57, 78, 48, 125, 107, 125, 17, 119, 74, 78, 39, 95, 17, 91, 27, 60, 35, 111, 30, 95, 42, 14};
    }

    private static byte[] pkoykapxuagkjxp() {
        return new byte[]{-107, -84, 85, 12, 57, 112, 58, 85, 108, 83, 16, 81, 71, 78};
    }

    private static byte[] publxlwujmvxlid() {
        return new byte[]{-110, -85, 89, 3, 54, 110, 60, 77, 109, 91, 22, 89, 68, 90};
    }

    private static byte[] dfkbppfgxhewgkt() {
        return new byte[]{-107, -91, 89, 27, 56, 122, 48, 64, 111, 95, 16, 67, 75, 81, 47, 104, 24, 117, 26, 2, 34, 67, 30, 121};
    }

    private static byte[] lffmuyqshiretdo() {
        return new byte[]{-107, -92, 87, 20, 57, 116, 61, 92, 105, 84, 23, 94, 75, 68, 34, 97, 16, 108, 27, 24, 43, 88, 18, 110, 34, 119, 125, 40, 54, 36, 115, 47};
    }

    private static byte[] mxwapeoqzpovjlp() {
        return new byte[]{-100, -82, 87, 1, 50, 110, 59, 94, 106, 85, 19, 83, 70, 95, 33, 104};
    }

    private static byte[] raacomhdabggfyi() {
        return new byte[]{-106, -86, 81, 3, 57, 124, 48, 66, 111, 85};
    }

    private static byte[] yvqlqaziuohnqdn() {
        return new byte[]{-107, -82, 88, 30, 51, 111, 57, 89, 96, 64, 19, 89, 69, 89, 33, 105, 20, 117};
    }

    private static byte[] jgttioyvsvoiarn() {
        return new byte[]{-106, -86, 83, 27, 50, 115, 63, 69};
    }

    private static byte[] nfzuxaemtrgdsnd() {
        return new byte[]{-105, -85, 84, 7, 48, 96, 49, 68, 107, 84, 20, 68, 66, 85};
    }

    private static byte[] tulujnzrqpalgnd() {
        return new byte[]{-111, -82, 89, 1, 50, 118, 58, 85, 97, 82};
    }

    private static byte[] drwktoikmwciiur() {
        return new byte[]{-107, -84, 88, 2, 54, 108, 56, 83, 97, 82, 16, 72, 74, 94, 33, 120, 16, 102};
    }

    private static byte[] qevyrhsibkvzfog() {
        return new byte[]{-107, -91, 89, 8, 54, 109, 59, 94, 104, 87, 16, 79, 75, 80, 33, 119};
    }

    private static byte[] vrpjnoobxosdatz() {
        return new byte[]{-107, -87, 88, 10, 48, 103, 61, 95, 97, 68};
    }

    private static byte[] lpqcagnmhktamjw() {
        return new byte[]{-107, -81, 85, 25, 57, 119, 58, 85, 111, 85};
    }

    private static byte[] eqklweoykdhzwoj() {
        return new byte[]{-106, -83, 82, 13, 50, 115, 60, 65, 96, 64};
    }

    private static byte[] hdbjwonmyvwbqop() {
        return new byte[]{-107, -92, 82, 7, 55, 117, 48, 94, 105, 95, 16, 70, 64, 95, 32, 117};
    }

    private static byte[] ytcemgznybtwgyf() {
        return new byte[]{-105, -87, 89, 19, 56, 104, 63, 69, 107, 88, 25, 93};
    }

    private static byte[] knolibsitltqglm() {
        return new byte[]{-107, -84, 87, 24, 54, 124, 60, 68};
    }

    private static byte[] ljvlwkcfjhmntxr() {
        return new byte[]{-105, -84, 88, 15, 51, 112, 58, 94, 108, 84, 17, 70, 68, 95};
    }

    private static byte[] wxqgdskzulbxcnu() {
        return new byte[]{-107, -82, 80, 5, 56, 113, 60, 82, 111, 84, 16, 70, 66, 81, 47, 111, 20, 105, 26, 7};
    }

    private static byte[] hzanyeixrpqxwgr() {
        return new byte[]{-107, -86, 81, 10, 48, 111, 56, 93, 105, 86, 16, 64, 67, 82, 39, 117};
    }

    private static byte[] hktjcyyoqzyhdoh() {
        return new byte[]{-107, -87, 83, 7, 52, 113, 62, 93, 107, 86, 20, 82, 64, 72, 46, 113, 23, 101, 28, 17, 33, 82, 19, 118};
    }

    private static byte[] aqllnbcjyinocub() {
        return new byte[]{-107, -85, 89, 0, 51, 106, 57, 77, 109, 90, 16, 86, 75, 89};
    }

    private static byte[] mhfihoyibnlzfxs() {
        return new byte[]{-111, -84, 82, 30, 52, 110, 58, 88, 111, 68, 17, 83, 69, 94, 32, 106, 21, 122};
    }

    private static byte[] kbbswspfjpyluto() {
        return new byte[]{-99, -92, 82, 13, 54, 126, 49, 91, 109, 84, 25, 84, 74, 77};
    }

    private static byte[] yzultuddhyvmpmm() {
        return new byte[]{-107, -84, 82, 29, 48, 113, 60, 85, 109, 68, 16, 80, 64, 71, 39, 99, 20, 98, 24, 4, 34, 81, 21, 118, 34, 105};
    }

    private static byte[] mtxvyfnkjfziuqs() {
        return new byte[]{-107, -92, 88, 28, 54, 123, 60, 69, 104, 89, 16, 79, 74, 79, 33, 105, 20, 103};
    }

    private static byte[] nvwueoiklepzxer() {
        return new byte[]{-107, -87, 86, 3, 48, 117, 63, 64, 96, 82, 16, 73, 68, 95};
    }

    private static byte[] vwcpwfmzniungfh() {
        return new byte[]{-107, -91, 80, 28, 56, 104, 57, 85, 96, 64, 16, 67, 66, 82, 47, 97, 17, 118, 21, 3, 34, 88, 23, Byte.MAX_VALUE, 42, 101, 123, 35};
    }

    private static byte[] hsqfqwezjxpgrci() {
        return new byte[]{-106, -81, 87, 17, 52, 117, 59, 92, 108, 79, 18, 86, 64, 93, 39, 103};
    }

    private static byte[] zpmltvvcbwljjzn() {
        return new byte[]{-107, -91, 84, 21, 55, 122, 59, 86, 108, 70, 16, 66, 70, 84, 32, 113};
    }

    private static byte[] yopwmuarpbzdvla() {
        return new byte[]{-111, -84, 86, 28, 56, 113, 57, 84, 96, 95, 17, 69, 65, 94, 35, 114, 21, 103, 24, 17};
    }

    private static byte[] bqnnqymllnzmyzo() {
        return new byte[]{-107, -84, 84, 29, 53, 124, 58, 88, 96, 88};
    }

    private static byte[] osxqwnpcfbmixeg() {
        return new byte[]{-112, -83, 88, 14, 50, 124, 63, 66, 97, 83, 16, 88};
    }

    private static byte[] yhackptxfxlbths() {
        return new byte[]{-100, -92, 80, 28, 55, 104, 59, 84, 111, 93, 25, 71, 74, 75};
    }

    private static byte[] pjeoizuyqyilffw() {
        return new byte[]{-107, -82, 83, 10, 50, 107, 62, 88, 109, 89, 16, 74};
    }

    private static byte[] oztxqwpfrzkumte() {
        return new byte[]{-107, -88, 88, 30, 52, 104, 49, 71, 97, 81, 16, 73, 74, 90, 35, 98};
    }

    private static byte[] gfktijyyfdzokqm() {
        return new byte[]{-107, -85, 87, 26, 57, 104, 59, 67, 105, 70};
    }

    private static byte[] vruamrkdmgbpfyv() {
        return new byte[]{-107, -85, 82, 9, 55, 118, 58, 65, 96, 94, 16, 65, 64, 73};
    }

    private static byte[] uhanjsawvbohpxy() {
        return new byte[]{-112, -92, 83, 10, 50, 108, 48, 64, 105, 95, 25, 79, 65, 93};
    }

    private static byte[] eazfenpyvapncfo() {
        return new byte[]{-107, -83, 84, 27, 55, 121, 60, 94};
    }

    private static byte[] kbcebbamwwkssoa() {
        return new byte[]{-112, -92, 82, 29, 54, 98, 58, 85};
    }

    private static byte[] obbmyyirefifqig() {
        return new byte[]{-107, -85, 85, 21, 50, 119, 60, 84, 107, 70, 16, 76, 71, 94, 37, 124};
    }

    private static byte[] fahsacyutgcfcrv() {
        return new byte[]{-107, -84, 86, 4, 50, 116, 61, 89, 104, 95};
    }

    private static byte[] vqxpnqzckggejzt() {
        return new byte[]{-107, -88, 82, 20, 51, 124, 57, 93, 110, 84, 16, 83};
    }

    private static byte[] xjdfgnmomojttur() {
        return new byte[]{-100, -92, 83, 16, 57, 109, 58, 76, 108, 73, 25, 85, 75, 80, 35, 105};
    }

    private static byte[] jnslcxymfbcrsnl() {
        return new byte[]{-106, -83, 82, 1, 54, 119, 63, 94, 107, 65, 19, 86, 64, 94, 33, 96, 23, 102};
    }

    private static byte[] khkecpmqzdhjdxg() {
        return new byte[]{-107, -85, 85, 26, 53, 105, 60, 83, 104, 90, 16, 65, 71, 78};
    }

    private static byte[] qfrcdgfaifsosus() {
        return new byte[]{-107, -81, 82, 27, 49, 114, 56, 86, 104, 64, 16, 65, 64, 72, 38, 96, 16, 118, 29, 24, 34, 84};
    }

    private static byte[] nxtioamruljcduq() {
        return new byte[]{-107, -88, 82, 23, 54, 124, 59, 90, 109, 66, 16, 66, 64, 75, 33, 111};
    }

    private static byte[] dzrszvaruxflwtd() {
        return new byte[]{-107, -81, 82, 23, 48, 116, 58, 95, 97, 69};
    }

    private static byte[] njyfgfwewfibmsq() {
        return new byte[]{-107, -82, 81, 30, 53, 117, 58, 80, 106, 67, 16, 85};
    }

    private static byte[] ueycagxlxmelmfq() {
        return new byte[]{-107, -86, 84, 10, 52, 105, 56, 80, 108, 74, 16, 65, 70, 83, 35, 104, 16, 122};
    }

    private static byte[] gdmsgclocmfzbpf() {
        return new byte[]{-107, -84, 85, 8, 55, 113, 61, 71, 97, 87, 16, 75};
    }

    private static byte[] kzvjrlfwdwqfbnf() {
        return new byte[]{-107, -92, 81, 28, 56, 110, 63, 64, 110, 89, 16, 74, 67, 91, 47, 98};
    }

    private static byte[] xaqclvzsckvszjw() {
        return new byte[]{-107, -83, 87, 9, 51, 125, 60, 65, 106, 94, 16, 67, 69, 77, 36, 97, 20, 122};
    }

    private static byte[] bubpqqrijuvpaml() {
        return new byte[]{-105, -81, 86, 23, 52, 113, 59, 67, 104, 65, 18, 65, 75, 82, 36, 119, 18, 111, 30, 4};
    }

    private static byte[] izqfaowwwkmhfjt() {
        return new byte[]{-106, -83, 81, 30, 52, 126, 59, 69, 97, 81};
    }

    private static byte[] jyqkuzfmndfmuoi() {
        return new byte[]{-107, -85, 83, 10, 48, 122, 57, 90, 96, 89};
    }

    private static byte[] yeiocjxysomaqna() {
        return new byte[]{-105, -92, 86, 23, 50, 115, 61, 71, 108, 65, 25, 65, 71, 72};
    }

    private static byte[] lcdptjpyevdzxae() {
        return new byte[]{-106, -84, 81, 12, 55, 123, 59, 66, 107, 65, 19, 76, 67, 80};
    }

    private static byte[] fiomwwlavqoedma() {
        return new byte[]{-106, -83, 80, 23, 50, 118, 60, 84, 107, 82, 19, 65, 66, 89, 37, 113, 20, 119};
    }

    private static byte[] txqjqkucmdcqiek() {
        return new byte[]{-107, -86, 86, 25, 55, 106, 59, 88, 106, 69, 16, 85, 68, 90, 32, 118};
    }

    private static byte[] rvhbwikanybijcr() {
        return new byte[]{-107, -91, 88, 16, 53, 121, 57, 86, 97, 81, 16, 79, 74, 76};
    }

    private static byte[] moufbszomektgqp() {
        return new byte[]{-106, -86, 88, 24, 48, 121, 63, 87, 109, 69, 23, 77, 68, 71};
    }

    private static byte[] vrgmiohljlhbhpg() {
        return new byte[]{-107, -91, 85, 12, 53, 105, 56, 87, 110, 88, 16, 70, 71, 78, 34, 113, 16, 102, 27, 20, 34, 66};
    }

    private static byte[] dssspahxerqtoxq() {
        return new byte[]{-107, -91, 80, 8, 50, 125, 57, 71, 111, 64, 16, 79, 66, 94, 37, 113};
    }

    private static byte[] bkgnxmoofqkgfpn() {
        return new byte[]{-107, -85, 88, 17, 57, 121, 61, 78, 107, 86, 16, 64, 74, 66, 46, 107, 21, 108};
    }

    private static byte[] orxkappkfydpekb() {
        return new byte[]{-107, -85, 88, 17, 50, 114, 56, 65, 106, 89, 16, 64, 74, 66, 37, 96, 16, 99};
    }

    private static byte[] rksgeoojvjrysgh() {
        return new byte[]{-107, -91, 88, 6, 54, 84, 56, 113, 97, 99, 16, 107, 74, 119, 33, 82, 16, 74, 20, 52, 34, 96, 31, 86};
    }

    private static byte[] mrtdfefyjbvicbz() {
        return new byte[]{-99, -81, 86, 16, 54, 114, 58, 68, 97, 80, 22, 71};
    }

    private static byte[] ekyjzdyjvxxxsln() {
        return new byte[]{-106, -92, 87, 9, 50, Byte.MAX_VALUE, 63, 80, 104, 87, 25, 87, 66, 91, 38, 115, 19, 121};
    }

    private static byte[] pyexrkjtfhkjyet() {
        return new byte[]{-107, -88, 84, 20, 53, 106, 48, 84, 106, 69, 16, 84};
    }

    private static byte[] xemhmyxbqgwmsph() {
        return new byte[]{-107, -91, 89, 19, 52, 118, 62, 86, 107, 80, 16, 73, 75, 68, 35, 112};
    }

    private static byte[] stfcifkvborbxfp() {
        return new byte[]{-107, -84, 89, 15, 51, 126, 56, 94, 105, 95, 16, 92};
    }

    private static byte[] oqoivgvwzdllmjh() {
        return new byte[]{-109, -92, 82, 25, 57, 116, 62, 91, 111, 88, 25, 65, 66, 95, 39, 101};
    }

    private static byte[] vvtvyipbdsgjsgo() {
        return new byte[]{-106, -82, 80, 10, 50, 99, 59, 80, 105, 71, 19, 76, 65, 95, 47, 118};
    }

    private static byte[] jzmsmsnpwpezqjc() {
        return new byte[]{-106, -91, 88, 11, 52, 124, 61, 86, 106, 92, 24, 85};
    }

    private static byte[] kyuugihewuwxxzg() {
        return new byte[]{-109, -86, 81, 13, 57, Byte.MAX_VALUE, 57, 93, 109, 89, 23, 92};
    }

    private static int utvbjrtlkyzpxagd(int i, int i2) {
        return i ^ i2;
    }
}
