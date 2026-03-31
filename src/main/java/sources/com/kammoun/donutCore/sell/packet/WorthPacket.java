package com.kammoun.donutCore.sell.packet;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;
import com.kammoun.donutCore.DonutCore;
import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.sell.SellPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.block.ShulkerBox;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

public class WorthPacket {
    private static final Set<UUID> playersWithItemsInCursor;
    private static int WWByJYc85F = 0;
    private transient int ZGPv4sXoJx = 1615566016;
    private static String[] nothing_to_see_here = new String[18];

    static class AnonymousClass1 {
        static final int[] $SwitchMap$org$bukkit$event$inventory$InventoryAction;

        private static int f872xUBOFSqVO = 0;
        private transient int gJwk5FHZAT = 836224830;
        private static String[] nothing_to_see_here;

        static {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.packet.WorthPacket.AnonymousClass1.m307clinit():void");
        }

        public static String wrlrxgpden(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] vwoeumxobmpmefv() {
            return new byte[]{29, 107, 45, 87, 90, 51, 59, 27, 81, 8, 25, 48, 84, 11, 79, 87, 110, 91, 13, 119, 63, 46, 80, 87, 58};
        }

        private static int ldcbxorzsjorzwvn(int i, int i2) {
            return i ^ i2;
        }
    }

    public static class WorthListener extends PacketAdapter implements Listener {
        private final SellPlugin sellPlugin;
        private static int FTGs6vLPbx = 0;

        private transient int f888zba8qkM3J = 1802160537;
        private static String[] nothing_to_see_here = new String[15];

        public WorthListener(DonutCore donutCore, SellPlugin sellPlugin, int i) {
            super(donutCore, ListenerPriority.NORMAL, new PacketType[]{PacketType.Play.Server.SET_SLOT, PacketType.Play.Server.WINDOW_ITEMS});
            int i2 = 506003409 ^ (351935208 ^ 2052999574);
            int parseInt = 1385698083 ^ (2072468639 ^ Integer.parseInt("1502864147"));
            this.f888zba8qkM3J = 1802160537 ^ FTGs6vLPbx;
            int vibwumvhpgqmjztn = 1136166337 ^ vibwumvhpgqmjztn(parseInt, 1770719189);
            this.plugin = donutCore;
            this.sellPlugin = sellPlugin;
            Bukkit.getPluginManager().registerEvents(this, donutCore);
            int i3 = 1507472700 ^ (1424987254 ^ (1497703405 ^ vibwumvhpgqmjztn));
        }

        public void onPacketSending(com.comphenix.protocol.events.PacketEvent r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.packet.WorthPacket.WorthListener.onPacketSending(com.comphenix.protocol.events.PacketEvent):void");
        }

        private boolean isRealInventory(Player player, int i) {
            int i2;
            InventoryView openInventory;
            int i3 = 123363909 ^ (43262599 ^ 1887876419);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1438143477) {
                int i4 = 142076204 ^ i3;
                i3 = i4;
                try {
                    openInventory = player.getOpenInventory();
                } catch (Exception e) {
                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                        case -1336899142:
                            i3 = vibwumvhpgqmjztn(i3, 498918789);
                            break;
                        case -1160803080:
                            i3 = 1559168301 ^ i3;
                            break;
                        case -969844448:
                            i3 = vibwumvhpgqmjztn(i3, 1399906198);
                            break;
                        case -793284054:
                            i3 = vibwumvhpgqmjztn(i3, 295705335);
                            break;
                        case -759712824:
                            i3 = 1373635275 ^ i3;
                            break;
                        case -369564309:
                            i3 = 915007519 ^ i3;
                            break;
                        case -103763125:
                            i3 = vibwumvhpgqmjztn(i3, 881648347);
                            break;
                        case 197711625:
                            i3 = vibwumvhpgqmjztn(i3, 1792011859);
                            break;
                        case 635752376:
                            i3 = 1326083397 ^ i3;
                            break;
                        case 2026467488:
                            i3 = 1152375462 ^ i3;
                            break;
                        default:
                            throw new IllegalAccessException("Error in hash");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1572316562) {
                        i2 = 1425643811 ^ i3;
                        return (byte) (525299088 ^ i2);
                    }
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -369564309) {
                    i3 = 33884868 ^ i3;
                    Inventory topInventory = openInventory.getTopInventory();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -103763125) {
                        i3 = 1881356413 ^ i3;
                        if (topInventory.getType() != InventoryType.CHEST) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2026467488) {
                                i3 = 1427095633 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -793284054) {
                                    i3 = 2070934692 ^ i3;
                                    if (topInventory.getType() != InventoryType.ENDER_CHEST) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 197711625) {
                                            i3 = 968831429 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -969844448) {
                                                i3 = 43048285 ^ i3;
                                                if (topInventory.getType() != InventoryType.BARREL) {
                                                    i3 = vibwumvhpgqmjztn(i3, 996250311);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 163259889) {
                                                        int i5 = 327122892 ^ i3;
                                                        try {
                                                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i5) != 23824228) {
                                                                throw null;
                                                            }
                                                            throw new IOException();
                                                        } catch (IOException e2) {
                                                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                                                                case -1841243247:
                                                                    i3 = 341367098 ^ i5;
                                                                    break;
                                                                case 847242891:
                                                                    i3 = vibwumvhpgqmjztn(i5, 1079983769);
                                                                    break;
                                                                default:
                                                                    throw new IOException("Error in hash");
                                                            }
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 814092865) {
                                                                i2 = 962572249 ^ i3;
                                                                return (byte) (525299088 ^ i2);
                                                            }
                                                        }
                                                    }
                                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -759712824) {
                                                    i3 = 219088870 ^ i3;
                                                }
                                            }
                                        }
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                            case 14321002:
                                                i3 = 908127102 ^ i3;
                                                break;
                                            case 620076751:
                                            case 1010523762:
                                                break;
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 847242891 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (205633022 ^ i3)) {
                                        int i6 = 2051899429 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -969844448 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (361403467 ^ i3)) {
                                            int i7 = 1045587598 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 875718418 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (889083033 ^ i3)) {
                                                int i8 = 1135868533 ^ i3;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 163259889 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2008314986 ^ i3)) {
                                                    int i9 = 810478790 ^ i3;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -793284054 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1170935050 ^ i3)) {
                                                        int i10 = 1265795834 ^ i3;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2026467488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (489736635 ^ i3)) {
                                    int i11 = 439910053 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1841243247 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (626328828 ^ i3)) {
                                        int i12 = 1282004991 ^ i3;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                        } else {
                            i3 = vibwumvhpgqmjztn(i3, 406904715);
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1160803080) {
                            i3 = 333801576 ^ i3;
                            if (topInventory.getLocation() == null) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 635752376) {
                                    i3 = 1387694272 ^ i3;
                                    ?? r0 = (byte) (1443500343 ^ i3);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1336899142) {
                                        i3 = 277634517 ^ i3;
                                        return r0;
                                    }
                                }
                            }
                            while (true) {
                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                    case 74503403:
                                        i3 = 629931337 ^ i3;
                                        break;
                                    case 1057361791:
                                    case 1117653543:
                                        break;
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1572316562 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1804618613 ^ i3)) {
                                    int i13 = 454516487 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 814092865 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (46352969 ^ i3)) {
                                        int i14 = 1619340265 ^ i3;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -759712824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2063800336 ^ i3)) {
                        int i15 = 2061141426 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1160803080 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (459760297 ^ i3)) {
                            int i16 = 1951497751 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -369564309 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1350130556 ^ i3)) {
                                int i17 = 636201493 ^ i3;
                                throw new IOException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1438143477 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1181103352 ^ i3)) {
                    int i18 = 2022680652 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 197711625 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1075937051 ^ i3)) {
                        int i19 = 1478050830 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 635752376 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1353791711 ^ i3)) {
                            int i20 = 1826289133 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1336899142 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (994815803 ^ i3)) {
                                int i21 = 218083993 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -103763125 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1810480828 ^ i3)) {
                                    int i22 = 1848657446 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -92574584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1750225036 ^ i3)) {
                                        int i23 = 400410601 ^ i3;
                                        throw new RuntimeException();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        @org.bukkit.event.EventHandler
        public void onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.packet.WorthPacket.WorthListener.onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent):void");
        }

        @org.bukkit.event.EventHandler
        public void onInventoryDrag(org.bukkit.event.inventory.InventoryDragEvent r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.packet.WorthPacket.WorthListener.onInventoryDrag(org.bukkit.event.inventory.InventoryDragEvent):void");
        }

        @EventHandler
        public void onPlayerDropItem(PlayerDropItemEvent playerDropItemEvent) {
            int i = 664293909 ^ (2039067121 ^ 1887876419);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1958393145) {
                i = 734798005 ^ i;
                Player player = playerDropItemEvent.getPlayer();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 719040656) {
                    int i2 = 766254633 ^ i;
                    WorthPacket.playersWithItemsInCursor.remove(player.getUniqueId());
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1203454425) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1203454425 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1912563757 ^ i2)) {
                                break;
                            }
                        }
                        int i3 = 741409588 ^ i2;
                        throw new RuntimeException("double");
                    }
                    i = 174909883 ^ i2;
                    Objects.requireNonNull(player);
                    SchedulerUtil.runLater(player::updateInventory, 1L, 1577269415);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 349965313) {
                        int i4 = 286888912 ^ i;
                        return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1958393145 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (879762046 ^ i)) {
                    int i5 = 2134468680 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 719040656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (709992032 ^ i)) {
                        int i6 = 372983084 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 349965313 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1606793647 ^ i)) {
                            break;
                        }
                    }
                }
            }
            int i7 = 1670805167 ^ i;
            throw new IOException();
        }

        @EventHandler
        public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
            int i = 373238475 ^ (1511501969 ^ 1887876419);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -445548343) {
                i = 1374549588 ^ i;
                WorthPacket.playersWithItemsInCursor.remove(playerQuitEvent.getPlayer().getUniqueId());
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1780402795) {
                    int i2 = 876911089 ^ i;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1780402795 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (793737345 ^ i)) {
                    int i3 = 661556976 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -445548343 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (930333040 ^ i)) {
                        int i4 = 735058726 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -935721502 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (154965352 ^ i)) {
                            break;
                        }
                    }
                }
            }
            int i5 = 587110151 ^ i;
            throw new RuntimeException();
        }

        @EventHandler
        public void onPlayerJoin(PlayerJoinEvent playerJoinEvent) {
            int i = 2136018996 ^ (828644497 ^ 1887876419);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -174207183) {
                i = 794854544 ^ i;
                SchedulerUtil.runLater(() -> {
                    int i2 = 739971470 ^ (729869055 ^ 468483290);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -474202792) {
                        i2 = 1160027450 ^ i2;
                        playerJoinEvent.getPlayer().updateInventory();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -895953782) {
                            int i3 = 1785509711 ^ i2;
                            return;
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -895953782 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2014133749 ^ i2)) {
                            int i4 = 1799708073 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1711444239 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1519900446 ^ i2)) {
                                int i5 = 304617199 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -474202792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (734729375 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                    int i6 = 792530514 ^ i2;
                    throw new IOException();
                }, 10L, 1577269415);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1902515280) {
                    int i2 = 1326969689 ^ i;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -174207183 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (600886428 ^ i)) {
                    int i3 = 1693960673 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1902515280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (983998231 ^ i)) {
                        int i4 = 286497244 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -165252742 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (633473108 ^ i)) {
                            break;
                        }
                    }
                }
            }
            int i5 = 1483835723 ^ i;
            throw new IOException();
        }

        @EventHandler
        public void onInventoryOpen(InventoryOpenEvent inventoryOpenEvent) {
            int i = 686227760 ^ (1970415771 ^ 1887876419);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1755113281) {
                i = 349126274 ^ i;
                Player player = inventoryOpenEvent.getPlayer();
                if ((player instanceof Player) != (970760810 ^ i)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -823848111) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -823848111 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1702714537 ^ i)) {
                                break;
                            }
                        }
                        int i2 = 1289652840 ^ i;
                        throw new IllegalAccessException("double");
                    }
                    i = 1435718734 ^ i;
                    Player player2 = player;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1652535587) {
                        i = 1467366943 ^ i;
                        player2.updateInventory();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -640794151) {
                            int i3 = 2067252266 ^ i;
                            return;
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                        case 1786737:
                            int i4 = 2043850363 ^ i;
                            return;
                        case 107533422:
                        case 897674954:
                            return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1755113281 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (347001115 ^ i)) {
                    int i5 = 1386070016 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1652535587 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1846935299 ^ i)) {
                        int i6 = 1905419354 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 7364746 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (485189491 ^ i)) {
                            int i7 = 688294612 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -640794151 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1369762257 ^ i)) {
                                int i8 = 1384314393 ^ i;
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            }
        }

        private static java.util.List getItemsFromPacket(com.comphenix.protocol.events.PacketEvent r5, int r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.packet.WorthPacket.WorthListener.getItemsFromPacket(com.comphenix.protocol.events.PacketEvent, int):java.util.List");
        }

        private static void writeItemsToPacket(PacketEvent packetEvent, List list, int i) {
            int i2;
            int vibwumvhpgqmjztn;
            int i3;
            int i4 = 578867628 ^ (228837083 ^ 468483290);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1501864599) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1501864599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1875341907 ^ i4)) {
                        break;
                    }
                }
                int i5 = 245446173 ^ i4;
                throw new IllegalAccessException("double");
            }
            ?? r0 = 1983122579 ^ i4;
            int i6 = r0;
            try {
            } catch (Exception e) {
                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                    case -661492864:
                        i6 = 192555964 ^ i6;
                        break;
                    case 249340435:
                        i6 = 1907618446 ^ i6;
                        break;
                    case 400243186:
                        i6 = 1385366002 ^ i6;
                        break;
                    case 831315594:
                        i6 = 1448738077 ^ i6;
                        break;
                    default:
                        throw new IllegalAccessException("Error in hash");
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2092747168) {
                    i2 = 1303953763 ^ i6;
                    r0.printStackTrace();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -293257862) {
                        int i7 = 1817244735 ^ i2;
                        return;
                    }
                }
            }
            if (packetEvent.getPacket().getType() == PacketType.Play.Server.WINDOW_ITEMS) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 400243186) {
                    int i8 = 1508452942 ^ i6;
                    packetEvent.getPacket().getItemListModifier().write((byte) (454184304 ^ i8), list);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -661492864) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -661492864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1774489724 ^ i8)) {
                                int i9 = 1743759245 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -189396311 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (699036864 ^ i8)) {
                                    break;
                                }
                            }
                        }
                        int i10 = 982556386 ^ i8;
                        throw new RuntimeException("double");
                    }
                    int i11 = 1778321581 ^ i8;
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i11) == 246138289) {
                            throw new IOException();
                        }
                        throw null;
                    } catch (IOException e2) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                            case -1754648853:
                                i3 = 1137584899 ^ i11;
                                break;
                            case -379835168:
                                i3 = 738782018 ^ i11;
                                break;
                            default:
                                throw new IllegalAccessException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1994688783) {
                            i2 = vibwumvhpgqmjztn(i3, 29434821);
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1946169578 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1947864657 ^ i3)) {
                                    int i12 = 110808692 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1945985919 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1152586582 ^ i3)) {
                                        int i13 = 1009214552 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1994688783 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (874374151 ^ i3)) {
                                            int i14 = 653348894 ^ i3;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -379835168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (776669330 ^ i6)) {
                        int i15 = 1977034722 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 400243186 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1009836584 ^ i6)) {
                            int i16 = 1824670587 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 831315594 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (117171317 ^ i6)) {
                                int i17 = 477007573 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2092747168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (991335901 ^ i6)) {
                                    int i18 = 62364127 ^ i6;
                                    throw new RuntimeException();
                                }
                            }
                        }
                    }
                }
            } else {
                int i19 = 589362044 ^ i6;
                if (list.isEmpty() != (1641780290 ^ i19)) {
                    i2 = 1362745689 ^ i19;
                } else {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) != 249340435) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == 249340435 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (2052888215 ^ i19)) {
                                break;
                            }
                        }
                        int i20 = 1969026582 ^ i19;
                        throw new IllegalAccessException("double");
                    }
                    i6 = 669650835 ^ i19;
                    packetEvent.getPacket().getItemModifier().write((byte) (1177656273 ^ i6), (ItemStack) list.getFirst());
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 831315594) {
                        i2 = 1993594570 ^ i6;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -379835168) {
                            int i152 = 1977034722 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 400243186) {
                                continue;
                            } else {
                                int i162 = 1824670587 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 831315594) {
                                    continue;
                                } else {
                                    int i172 = 477007573 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2092747168) {
                                        int i182 = 62364127 ^ i6;
                                        throw new RuntimeException();
                                    }
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2028836647) {
                    int vibwumvhpgqmjztn2 = vibwumvhpgqmjztn(i2, 242519118);
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(vibwumvhpgqmjztn2) == 155461634) {
                            throw new RuntimeException();
                        }
                        throw null;
                    } catch (RuntimeException e3) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e3)) {
                            case -189396311:
                                vibwumvhpgqmjztn = vibwumvhpgqmjztn(vibwumvhpgqmjztn2, 631980317);
                                break;
                            case 1946169578:
                                vibwumvhpgqmjztn = vibwumvhpgqmjztn(vibwumvhpgqmjztn2, 1438484053);
                                break;
                            default:
                                throw new IllegalAccessException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(vibwumvhpgqmjztn) == -638844352) {
                            int i21 = 717083608 ^ vibwumvhpgqmjztn;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(vibwumvhpgqmjztn) == -638844352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(vibwumvhpgqmjztn) == (1916184835 ^ vibwumvhpgqmjztn)) {
                                int i22 = 1972294646 ^ vibwumvhpgqmjztn;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2028836647 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1437973355 ^ i2)) {
                        int i23 = 1077491153 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -293257862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (176652575 ^ i2)) {
                            int i24 = 1187814285 ^ i2;
                            throw new RuntimeException("double");
                        }
                    }
                }
            }
        }

        private org.bukkit.inventory.ItemStack processItem(org.bukkit.inventory.ItemStack r8, java.lang.String r9, int r10) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.packet.WorthPacket.WorthListener.processItem(org.bukkit.inventory.ItemStack, java.lang.String, int):org.bukkit.inventory.ItemStack");
        }

        private double calculateItemWorth(ItemStack itemStack, int i) {
            int i2 = 2060290082 ^ (1266187124 ^ 1887876419);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 161099946) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 161099946 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (368738059 ^ i2)) {
                        int i3 = 1538322326 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -91561221 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (250581639 ^ i2)) {
                            break;
                        }
                    }
                }
                int i4 = 327460555 ^ i2;
                throw new IOException("double");
            }
            int i5 = 701003288 ^ i2;
            double price = getPrice(itemStack, this.sellPlugin, 34318289);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1205436523) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1205436523 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1639743580 ^ i5)) {
                        break;
                    }
                }
                int i6 = 603300350 ^ i5;
                throw new IOException("double");
            }
            int i7 = 547030449 ^ i5;
            ShulkerBox shulkerBox = getShulkerBox(itemStack, 465700045);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 1124183522) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1124183522 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (435481736 ^ i7)) {
                        break;
                    }
                }
                int i8 = 1920741314 ^ i7;
                throw new IOException("double");
            }
            int i9 = 758753516 ^ i7;
            if (shulkerBox != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 718072451) {
                    i9 = 1380703738 ^ i9;
                    price += calculateShulkerContentsWorth(shulkerBox, 1473689121);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1198389935) {
                        int i10 = 1212357877 ^ i9;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1198389935 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (2085617528 ^ i9)) {
                        int i11 = 806922258 ^ i9;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 718072451 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1160871781 ^ i9)) {
                            break;
                        }
                    }
                }
                int i12 = 647316845 ^ i9;
                throw new RuntimeException();
            }
            vibwumvhpgqmjztn(i9, 436781327);
            return price;
        }

        private org.bukkit.block.ShulkerBox getShulkerBox(org.bukkit.inventory.ItemStack r6, int r7) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.packet.WorthPacket.WorthListener.getShulkerBox(org.bukkit.inventory.ItemStack, int):org.bukkit.block.ShulkerBox");
        }

        private double calculateShulkerContentsWorth(org.bukkit.block.ShulkerBox r6, int r7) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.packet.WorthPacket.WorthListener.calculateShulkerContentsWorth(org.bukkit.block.ShulkerBox, int):double");
        }

        private org.bukkit.inventory.ItemStack addWorthLore(org.bukkit.inventory.ItemStack r6, java.lang.String r7, double r8, int r10) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.packet.WorthPacket.WorthListener.addWorthLore(org.bukkit.inventory.ItemStack, java.lang.String, double, int):org.bukkit.inventory.ItemStack");
        }

        private double getPrice(org.bukkit.inventory.ItemStack r6, com.kammoun.donutCore.sell.SellPlugin r7, int r8) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.packet.WorthPacket.WorthListener.getPrice(org.bukkit.inventory.ItemStack, com.kammoun.donutCore.sell.SellPlugin, int):double");
        }

        static {
            nothing_to_see_here[0] = "⠄⠄⠄⢰⣧⣼⣯⠄⣸⣠⣶⣶⣦⣾⠄⠄⠄⠄⡀⠄⢀⣿⣿⠄⠄⠄⢸⡇⠄⠄";
            nothing_to_see_here[1] = "⠄⠄⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿⠄";
            nothing_to_see_here[2] = "⠄⠄⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿⠄";
            nothing_to_see_here[3] = "⠄⠄⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⠄";
            nothing_to_see_here[4] = "⠄⢀⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋⣰";
            nothing_to_see_here[5] = "⠄⣼⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀⣤";
            nothing_to_see_here[6] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿⡗";
            nothing_to_see_here[7] = "⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄";
            nothing_to_see_here[8] = "⢸⣿⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄";
            nothing_to_see_here[9] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃⠄";
            nothing_to_see_here[10] = "⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄⠄";
            nothing_to_see_here[11] = "⠄⠄⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄⠄";
            nothing_to_see_here[12] = "⠄⠄⠄⠄⠈⠛⢿⣿⣿⣿⠁⠞⢿⣿⣿⡄⢿⣿⡇⣸⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄";
            nothing_to_see_here[13] = "⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣾⣦⡙⠻⣷⣾⣿⠃⠿⠋⠁⠄⠄⠄⠄⠄⢀⣠⣴";
            nothing_to_see_here[14] = "⣿⣿⣿⣶⣶⣮⣥⣒⠲⢮⣝⡿⣿⣿⡆⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⣠⣴⣿⣿⣿";
            FTGs6vLPbx = (-1072348756) ^ new Random(-2491753341513781788L).nextInt();
        }

        public static String qsvokdwfxs(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] lhnvdrkqgwwkjuv() {
            return new byte[]{27, 20, 55, 113, 37, 39, 111, 32, 45, 45, 59, 61, 115, 56, 62, 33, 103, 4, 111, 113, 75, 2, 45, 111, 97, 88, 75, 83, 97, 93, 32, 107, 6, 30, 30, 52, 33, 93, 25, 104, 33, 19, 48, 111, 91, 46, 100, 118, 87, 36, 22, 120, 68, 8, 8, 41, 124, 28, 43, 86, 76};
        }

        private static byte[] lbrxwtjxpspyuwb() {
            return new byte[]{-44, -40, 4, 101, 21, 99, 87, 123, 27, 106, 10, 122, 64, 97, 14, 55};
        }

        private static byte[] znsnrjlnwdznjvn() {
            return new byte[]{-47, -45, 5, 121};
        }

        private static int vibwumvhpgqmjztn(int i, int i2) {
            return i2 ^ i;
        }
    }

    public WorthPacket() {
        int i = 1087393118 ^ (458399221 ^ 3639192);
        int parseInt = 1978783536 ^ (1931921390 ^ Integer.parseInt("1566722029"));
        this.ZGPv4sXoJx = 1615566016 ^ WWByJYc85F;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 28246855:
                    int i2 = 1965822188 ^ parseInt;
                    return;
                case 489266709:
                case 925247707:
                    return;
                case 1192132095:
                default:
                    throw new IllegalAccessException();
            }
        }
    }

    public void register(DonutCore donutCore, SellPlugin sellPlugin, int i) {
        int i2 = 1517342812 ^ (34798105 ^ 1619956059);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -949626639) {
            i2 = 583799403 ^ i2;
            ProtocolLibrary.getProtocolManager().addPacketListener(new WorthListener(donutCore, sellPlugin, 1686458096));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -788182104) {
                int i3 = 1099765933 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -788182104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1148426734 ^ i2)) {
                int i4 = 1617843591 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -949626639 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1822077889 ^ i2)) {
                    int i5 = 318462722 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -580022590 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (929102708 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 2135606538 ^ i2;
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
        int parseInt = 695955369 ^ (990210620 ^ Integer.parseInt("1566722029"));
        WWByJYc85F = (-1785623880) ^ new Random(6834780011861745467L).nextInt();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 2028082114) {
            int i = 451489126 ^ parseInt;
            playersWithItemsInCursor = new HashSet();
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1347716878 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1260892849 ^ parseInt)) {
                int i2 = 1657979979 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 2028082114 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (402378190 ^ parseInt)) {
                    break;
                }
            }
        }
        int i3 = 431537270 ^ parseInt;
        throw new IllegalAccessException();
    }

    public static String gcgogjiybq(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] xazuvkactvhmxpk() {
        return new byte[]{7, 74, 90, 119, 74, 83, 46, 28};
    }
}
