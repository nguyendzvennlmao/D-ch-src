package com.kammoun.donutCore.settings.gui;

import com.kammoun.donutCore.api.utils.menu.KMenu;
import com.kammoun.donutCore.settings.SettingsPlugin;
import com.kammoun.donutCore.settings.models.SettingItem;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class SettingsGUI extends KMenu implements Listener {
    private final Map<Integer, SettingItem> settingItems;
    private final SettingsPlugin settingsPlugin;
    private final Set<UUID> processingClicks;
    private static int cfCUEaonlb = 0;
    private transient int uQVrn2wArN = 947681185;
    private static String ruiwkunhan;
    private static String[] nothing_to_see_here = new String[15];

    static class AnonymousClass1 {
        static final int[] $SwitchMap$com$kammoun$donutCore$settings$models$enums$SettingType;
        private static int QdhJOA1gmP = 0;

        private transient int f908jqqd0ZoTi = 1274729084;
        private static String jszibvcupc;
        private static String[] nothing_to_see_here = new String[19];

        static {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.gui.SettingsGUI.AnonymousClass1.m320clinit():void");
        }

        public static String foexdxvtay(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = jszibvcupc.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

        private static byte[] dvhvgnvgdcrjqsq() {
            return new byte[0];
        }

        private static int prvwkmukaresnost(int i, int i2) {
            return i ^ i2;
        }
    }

    public SettingsGUI(JavaPlugin javaPlugin, int i) {
        super(javaPlugin, "Settings/Gui/settings.yml", 1546437752);
        int i2 = 1943167982 ^ (631520875 ^ 810027479);
        int parseInt = 381396482 ^ (1057209277 ^ Integer.parseInt("1334200813"));
        this.uQVrn2wArN = 947681185 ^ cfCUEaonlb;
        int moxphinwvzsmlgst = 1106493504 ^ moxphinwvzsmlgst(parseInt, 330264890);
        this.settingItems = new HashMap();
        this.processingClicks = new HashSet();
        this.settingsPlugin = SettingsPlugin.getInstance(1091849428);
        loadSettingItems(39966767);
        Bukkit.getPluginManager().registerEvents(this, javaPlugin);
        int i3 = 1887264645 ^ (854372678 ^ (307607071 ^ (2117155019 ^ (303616372 ^ moxphinwvzsmlgst))));
    }

    private void loadSettingItems(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.gui.SettingsGUI.loadSettingItems(int):void");
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent inventoryClickEvent) {
        int i = 406412777 ^ (1674781858 ^ 122171302);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -451758229) {
            i = 789902808 ^ i;
            if (inventoryClickEvent.getInventory().getHolder() == this) {
                i = moxphinwvzsmlgst(i, 1104767794);
                handleClick(inventoryClickEvent, 743228312);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1820442568) {
                    int i2 = 1250616833 ^ i;
                    return;
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1649075798) {
                int i3 = 1250403701 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1820442568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (252006849 ^ i)) {
                int i4 = 1340589181 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -451758229 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (102805047 ^ i)) {
                    int i5 = 496777629 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -953585614 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (610820304 ^ i)) {
                        int i6 = 1319383283 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1649075798 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1522755647 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 493966062 ^ i;
        throw new IllegalAccessException();
    }

    @Override
    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.gui.SettingsGUI.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    private void updateSettingItem(Player player, int i, SettingItem settingItem, boolean z, int i2) {
        int i3 = 403337494 ^ (659527809 ^ 122171302);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1066520183) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1066520183 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1421927347 ^ i3)) {
                    int i4 = 1153330977 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1820877505 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1074708191 ^ i3)) {
                        break;
                    }
                }
            }
            int i5 = 1203651157 ^ i3;
            throw new IOException("double");
        }
        int i6 = 1992806500 ^ i3;
        SettingsPlugin settingsPlugin = this.settingsPlugin;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1985000106) {
            i6 = 1491681119 ^ i6;
            String statusOn = settingsPlugin.getConfigManager(1800349040).getStatusOn(1495778118);
            SettingsPlugin settingsPlugin2 = this.settingsPlugin;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1323743152) {
                int i7 = 1786936413 ^ i6;
                String statusOff = settingsPlugin2.getConfigManager(1800349040).getStatusOff(7539109);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -452285765) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -452285765 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1864480098 ^ i7)) {
                            break;
                        }
                    }
                    int i8 = 39119499 ^ i7;
                    throw new RuntimeException("double");
                }
                int i9 = 45726647 ^ i7;
                ItemStack buildSettingItem = buildSettingItem(settingItem, z, statusOn, statusOff, 1317178314);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -255363325) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -255363325 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1407622942 ^ i9)) {
                            break;
                        }
                    }
                    int i10 = 1698528047 ^ i9;
                    throw new IOException("double");
                }
                int i11 = 368578904 ^ i9;
                this.inventory.setItem(i, buildSettingItem);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 1594359235) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1594359235 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1796620365 ^ i11)) {
                            break;
                        }
                    }
                    int i12 = 1884134381 ^ i11;
                    throw new IOException("double");
                }
                i6 = 1374823647 ^ i11;
                player.updateInventory();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -795419847) {
                    int i13 = 394516287 ^ i6;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1323743152 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (370406677 ^ i6)) {
                int i14 = 219879613 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1985000106 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1544509352 ^ i6)) {
                    int i15 = 757174772 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -795419847 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2007527910 ^ i6)) {
                        break;
                    }
                }
            }
        }
        int i16 = 1361900233 ^ i6;
        throw new RuntimeException();
    }

    private void handleSettingToggle(org.bukkit.entity.Player r6, com.kammoun.donutCore.settings.models.enums.SettingType r7, boolean r8, com.kammoun.donutCore.settings.models.SettingItem r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.gui.SettingsGUI.handleSettingToggle(org.bukkit.entity.Player, com.kammoun.donutCore.settings.models.enums.SettingType, boolean, com.kammoun.donutCore.settings.models.SettingItem, int):void");
    }

    @Override
    protected void setMenuItems(String[] strArr, int i) {
        int i2 = 627290795 ^ (1513419158 ^ 122171302);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1057266469) {
            int i3 = 310690006 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1057266469 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1943878599 ^ i2)) {
                int i4 = 521925901 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1423794795 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (224182046 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 285442882 ^ i2;
        throw new IOException();
    }

    public void openInventory(Player player, int i) {
        int i2 = 1440435524 ^ (768970285 ^ 122171302);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -97032581) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -97032581 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1665021811 ^ i2)) {
                    break;
                }
            }
            int i3 = 1634812 ^ i2;
            throw new IOException("double");
        }
        int i4 = 791928003 ^ i2;
        String[] strArr = new String[(byte) (1349857294 ^ i4)];
        strArr[(byte) (1349857292 ^ i4)] = tdxkvgspbd(xzbxuadepsipppv(), i4);
        strArr[(byte) (1349857293 ^ i4)] = player.getName();
        loadInventory(player, strArr, 1732930380);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2086043550) {
            int i5 = 1965946019 ^ i4;
            Iterator<Map.Entry<Integer, SettingItem>> it = this.settingItems.entrySet().iterator();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 717628793) {
                int i6 = 386356516 ^ i5;
                while (it.hasNext() != (845123979 ^ i6)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1828942759) {
                        int i7 = 660447269 ^ i6;
                        Map.Entry<Integer, SettingItem> next = it.next();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1475244688) {
                            int i8 = 2013669601 ^ i7;
                            SettingItem value = next.getValue();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1746979451) {
                                int i9 = 124038087 ^ i8;
                                boolean setting = this.settingsPlugin.getSettingsManager(115064052).getSetting(player.getUniqueId(), value.getKey(1637621346), 1934918589);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1392874563) {
                                    i6 = 1946998276 ^ i9;
                                    SettingsPlugin settingsPlugin = this.settingsPlugin;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -211606432) {
                                        i5 = 2000728324 ^ i6;
                                        String statusOn = settingsPlugin.getConfigManager(1800349040).getStatusOn(1495778118);
                                        SettingsPlugin settingsPlugin2 = this.settingsPlugin;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1231465539) {
                                            int i10 = 829796191 ^ i5;
                                            String statusOff = settingsPlugin2.getConfigManager(1800349040).getStatusOff(7539109);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1026828614) {
                                                i7 = 187790806 ^ i10;
                                                ItemStack buildSettingItem = buildSettingItem(value, setting, statusOn, statusOff, 1317178314);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1690273782) {
                                                    int i11 = 675764212 ^ i7;
                                                    this.inventory.setItem(value.getSlot(570966833), buildSettingItem);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -646264917) {
                                                        i6 = 1032550840 ^ i11;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 891357802) {
                                                            while (true) {
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 891357802 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (684694614 ^ i6)) {
                                                                    int i12 = 928877345 ^ i6;
                                                                    throw new IllegalAccessException("double");
                                                                }
                                                            }
                                                        }
                                                        while (true) {
                                                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6)) {
                                                                case 148784673:
                                                                    i6 = 584100500 ^ i6;
                                                                    break;
                                                                case 563246435:
                                                                case 648974122:
                                                                    break;
                                                            }
                                                        }
                                                        try {
                                                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6) == 44149376) {
                                                                throw new IllegalAccessException();
                                                            }
                                                            throw null;
                                                        } catch (IllegalAccessException e) {
                                                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                                case 597974731:
                                                                    i6 = 573841143 ^ i6;
                                                                    break;
                                                                case 606880504:
                                                                    i6 = 1120214385 ^ i6;
                                                                    break;
                                                                default:
                                                                    throw new RuntimeException("Error in hash");
                                                            }
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 839166322) {
                                                            }
                                                            while (true) {
                                                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6)) {
                                                                    case 136144713:
                                                                        i6 = 1948189861 ^ i6;
                                                                        break;
                                                                    case 850155531:
                                                                    case 1330898648:
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 606880504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1092642854 ^ i11)) {
                                                                int i13 = 469284216 ^ i11;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -646264917 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (641416977 ^ i11)) {
                                                                    int i14 = 1223513569 ^ i11;
                                                                    throw new RuntimeException("double");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1026828614 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1932411561 ^ i10)) {
                                                        int i15 = 1099807197 ^ i10;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 839166322 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1039638735 ^ i6)) {
                                            int i16 = 846352639 ^ i6;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 583934384 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (654102132 ^ i6)) {
                                                int i17 = 652405578 ^ i6;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 597974731 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1915477021 ^ i6)) {
                                                    int i18 = 1707761670 ^ i6;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -211606432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1982341312 ^ i6)) {
                                                        int i19 = 1338633627 ^ i6;
                                                        throw new IllegalAccessException();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1392874563 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (874556409 ^ i9)) {
                                            int i20 = 669230980 ^ i9;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                            } else {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1746979451 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1691811932 ^ i8)) {
                                        int i21 = 1973797449 ^ i8;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1690273782 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (861058059 ^ i7)) {
                                int i22 = 2041702048 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1475244688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1080860810 ^ i7)) {
                                    int i23 = 1872673868 ^ i7;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1828942759 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1555019050 ^ i6)) {
                            int i24 = 895792675 ^ i6;
                            throw new IOException("double");
                        }
                    }
                }
                i4 = 507245519 ^ i6;
                player.openInventory(this.inventory);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1663242785) {
                    int i25 = 675128946 ^ i4;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1231465539 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1578480043 ^ i5)) {
                    int i26 = 1369108196 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 717628793 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1146425341 ^ i5)) {
                        int i27 = 1594962092 ^ i5;
                        throw new IllegalAccessException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2086043550 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1240101300 ^ i4)) {
                int i28 = 454264419 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1663242785 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1224265848 ^ i4)) {
                    int i29 = 1060095556 ^ i4;
                    throw new RuntimeException("double");
                }
            }
        }
    }

    private org.bukkit.inventory.ItemStack buildSettingItem(com.kammoun.donutCore.settings.models.SettingItem r6, boolean r7, java.lang.String r8, java.lang.String r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.gui.SettingsGUI.buildSettingItem(com.kammoun.donutCore.settings.models.SettingItem, boolean, java.lang.String, java.lang.String, int):org.bukkit.inventory.ItemStack");
    }

    @Generated
    public Map getSettingItems(int i) {
        int i2 = 1321153911 ^ (1776466368 ^ 122171302);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 11344009) {
            int i3 = 690739858 ^ i2;
            return this.settingItems;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1240714264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (984956934 ^ i2)) {
                int i4 = 1158935657 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 11344009 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1619015743 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 434788253 ^ i2;
        throw new IOException();
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
        ruiwkunhan = ByteBuffer.wrap(pdnrzbylojsceht()).asCharBuffer().toString();
        cfCUEaonlb = (-717021611) ^ new Random(-2429460990919355467L).nextInt();
    }

    public static String tdxkvgspbd(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = ruiwkunhan.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] rkdvxtficcxnpoy() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 0};
    }

    private static byte[] tnsgirwtruicvdz() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 5};
    }

    private static byte[] ubudakuqmmdadfb() {
        return new byte[]{0, 0, 0, 20, 0, 0, 0, 13};
    }

    private static byte[] sdkrnrhgabwbdcs() {
        return new byte[]{0, 0, 0, 3, 0, 0, 0, 33};
    }

    private static byte[] qlfcblgakrmtjxg() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 36};
    }

    private static byte[] ldmcnecwiwklcdh() {
        return new byte[]{0, 0, 0, 2, 0, 0, 0, 44};
    }

    private static byte[] xzbxuadepsipppv() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 46};
    }

    private static byte[] cafavisgezmpdek() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 54};
    }

    private static byte[] pdnrzbylojsceht() {
        return new byte[]{49, 90, 56, 70, 48, 93, 53, 90, 49, 70, 55, 29, 57, 67, 48, 89, 53, 88, 57, 78, 56, 92, 51, 66, 53, 16, 50, 100, 51, 88, 56, 95, 56, 93, 49, 92, 50, 70, 51, 88, 56, 20, 56, 64, 49, 86, 50, 69, 51, 66, 56, 93, 56, 93, 49, 84, 50, 17, 51, 66, 56, 77, 56, 67, 49, 86, 51, 86, 50, 86, 55, 94, 52, 28, 57, 67, 56, 76, 52, 86, 55, 64, 57, 76, 48, 75, 56, 17, 49, 95, 51, 94, 49, 22, 52, 73, 56, 89, 55, 83, 57, 75, 49, 86, 52, 75, 56, 16, 49, 23, 51, 68, 55, 65, 49, 88, 50, 68, 49, 71, 51, 68, 55, 16};
    }

    private static int moxphinwvzsmlgst(int i, int i2) {
        return i2 ^ i;
    }
}
