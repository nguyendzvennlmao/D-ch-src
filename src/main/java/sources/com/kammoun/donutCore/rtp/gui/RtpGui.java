package com.kammoun.donutCore.rtp.gui;

import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.api.utils.menu.KMenu;
import com.kammoun.donutCore.rtp.service.TeleportService;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class RtpGui extends KMenu implements Listener {
    private RtpItem overWorld;
    private RtpItem netherWorld;
    private RtpItem endWorld;
    private TeleportService teleportService;
    private static int CsZqoZucHG = 0;
    private transient int mOqDsvchl7 = 1274781409;
    private static String mvwqvdcmnw;
    private static String[] nothing_to_see_here = new String[13];

    public static class RtpItem {
        private final String world;
        private final KItem item;
        private static int ccuGGoIxXf = 0;
        private transient int BUrkNQJXsj = 630871920;
        private static String njvsyugrjy;
        private static String[] nothing_to_see_here = new String[18];

        public RtpItem(String str, KItem kItem, int i) {
            zewehypqilnwrmgw(872369380 ^ 1160746215, 1183181380);
            int parseInt = 2076955073 ^ (470730855 ^ Integer.parseInt("1469066209"));
            this.BUrkNQJXsj = 630871920 ^ ccuGGoIxXf;
            int zewehypqilnwrmgw = 1449236079 ^ zewehypqilnwrmgw(parseInt, 221343062);
            this.world = str;
            this.item = kItem;
            int i2 = 1194826000 ^ (407700526 ^ zewehypqilnwrmgw);
        }

        public static RtpItem fromConfig(ConfigurationSection configurationSection, int i) {
            int i2 = 1597865178 ^ (113279196 ^ 284816985);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1210077946) {
                return new RtpItem(configurationSection.getString(chosvmhgoj(qccdljkhsguwtnp(), 1135582057 ^ i2)), KItem.fromConfig(configurationSection, 2126963651), 412343407);
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1210077946 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (60490588 ^ i2)) {
                    int i3 = 1614310150 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1432127920 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2008879048 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 1554729214 ^ i2;
            throw new IOException();
        }

        @Generated
        public String getWorld(int i) {
            int i2 = 1161299813 ^ (233974341 ^ 895721769);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -313761717) {
                int i3 = 868019727 ^ i2;
                return this.world;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1890258994 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1554662722 ^ i2)) {
                    int i4 = 1409984847 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -313761717 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1660074622 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1007801181 ^ i2;
            throw new RuntimeException();
        }

        @Generated
        public KItem getItem(int i) {
            int i2 = 886542945 ^ (496605906 ^ 895721769);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -512930608) {
                int i3 = 1096326106 ^ i2;
                return this.item;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -341208574 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1160820088 ^ i2)) {
                    int i4 = 1218995367 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -512930608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (427747794 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 572713227 ^ i2;
            throw new RuntimeException();
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
            njvsyugrjy = ByteBuffer.wrap(uealqlpjkdzaxjd()).asCharBuffer().toString();
            ccuGGoIxXf = 217262216 ^ new Random(-2852773433703010028L).nextInt();
        }

        public static String chosvmhgoj(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = njvsyugrjy.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

        private static byte[] qccdljkhsguwtnp() {
            return new byte[]{0, 0, 0, 5, 0, 0, 0, 0};
        }

        private static byte[] uealqlpjkdzaxjd() {
            return new byte[]{49, 64, 57, 95, 49, 71, 57, 85, 48, 85};
        }

        private static int zewehypqilnwrmgw(int i, int i2) {
            return i ^ i2;
        }
    }

    public RtpGui(JavaPlugin javaPlugin, int i) {
        super(javaPlugin, "Rtp/Gui/rtp.yml", 1546437752);
        doteidapmgqpxfmt(2108657078 ^ 644149650, 830794184);
        int parseInt = 1184192472 ^ (1115126205 ^ Integer.parseInt("1856879497"));
        this.mOqDsvchl7 = 1274781409 ^ CsZqoZucHG;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 234510390:
                    parseInt = 1720851276 ^ parseInt;
                    break;
                case 494734135:
                    break;
                case 1431707176:
                case 1878955217:
                default:
                    throw new RuntimeException();
            }
        }
        loadItems(571829196);
        Bukkit.getPluginManager().registerEvents(this, javaPlugin);
        int i2 = 819797994 ^ (355712506 ^ (419472353 ^ parseInt));
    }

    private void loadItems(int i) {
        int i2 = 143023954 ^ (672308151 ^ 1097483615);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 267652563) {
            i2 = 312793621 ^ i2;
            if (getConfig(533900686).getConfigurationSection(sbpzfwvpev(ljhyfdxxxzmbgrr(), i2)) == null) {
                i2 = 1190335499 ^ i2;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1697456773) {
                int i3 = 367434944 ^ i2;
                this.overWorld = RtpItem.fromConfig((ConfigurationSection) Objects.requireNonNull(getConfig(533900686).getConfigurationSection(sbpzfwvpev(tvpnbdjmnlnvrom(), i3))), 873047340);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 904280955) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 904280955 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1116273327 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 309111562 ^ i3;
                    throw new RuntimeException("double");
                }
                i2 = 1393920203 ^ i3;
            }
            if (getConfig(533900686).getConfigurationSection(sbpzfwvpev(xrdpiajzedzpyvq(), i2)) == null) {
                i2 = 892369118 ^ i2;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1387627231) {
                int i5 = 242492814 ^ i2;
                this.netherWorld = RtpItem.fromConfig((ConfigurationSection) Objects.requireNonNull(getConfig(533900686).getConfigurationSection(sbpzfwvpev(tuknqhbdbqrvfif(), i5))), 873047340);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -555003567) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -555003567 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1979613793 ^ i5)) {
                            break;
                        }
                    }
                    int i6 = 1465393483 ^ i5;
                    throw new IllegalAccessException("double");
                }
                i2 = 994336080 ^ i5;
            }
            if (getConfig(533900686).getConfigurationSection(sbpzfwvpev(uqtfsehozgztwkl(), i2)) == null) {
                doteidapmgqpxfmt(i2, 38372742);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 80329680) {
                int i7 = 1758782206 ^ i2;
                this.endWorld = RtpItem.fromConfig((ConfigurationSection) Objects.requireNonNull(getConfig(533900686).getConfigurationSection(sbpzfwvpev(xluvqqgbwlwtstm(), i7))), 873047340);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1114549283) {
                    int i8 = 1788700536 ^ i7;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1114549283 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1248946902 ^ i7)) {
                        break;
                    }
                }
                int i9 = 162414145 ^ i7;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 80329680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (717869208 ^ i2)) {
                int i10 = 1275720066 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 377853920 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1084706293 ^ i2)) {
                    int i11 = 1633310363 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1387627231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2088806854 ^ i2)) {
                        int i12 = 300871500 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1697456773 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1081347374 ^ i2)) {
                            int i13 = 470872816 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 267652563 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (868001874 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i14 = 1436939424 ^ i2;
        throw new IllegalAccessException();
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent inventoryClickEvent) {
        int i = 2068652480 ^ (39350029 ^ 1097483615);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1007133551) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1007133551 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (88223699 ^ i)) {
                    break;
                }
            }
            int i2 = 1570388533 ^ i;
            throw new IOException("double");
        }
        int i3 = 1225399995 ^ i;
        if (inventoryClickEvent.getInventory().getHolder() != this) {
            doteidapmgqpxfmt(i3, 1478690795);
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1951880885) {
            i3 = 1174204245 ^ i3;
            handleClick(inventoryClickEvent, 743228312);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1538272287) {
                i3 = 855008083 ^ i3;
                inventoryClickEvent.setCancelled((byte) (109025582 ^ i3));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 872204664) {
                    int i4 = 791251949 ^ i3;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1538272287 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (345280276 ^ i3)) {
                int i5 = 438580666 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1951880885 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2073532035 ^ i3)) {
                    int i6 = 212923187 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 872204664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1427680109 ^ i3)) {
                        break;
                    }
                }
            }
        }
        int i7 = 910157415 ^ i3;
        throw new IOException();
    }

    @Override
    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.gui.RtpGui.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    public void open(Player player, int i) {
        int i2 = 520191961 ^ (211084221 ^ 1097483615);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1744909862) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1744909862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (863816655 ^ i2)) {
                    break;
                }
            }
            int i3 = 2065822457 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1852076116 ^ i2;
        loadInventory(player, new String[(byte) (1016834415 ^ i4)], 1732930380);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -455259271) {
            int i5 = 1941040891 ^ i4;
            setMenuItems(new String[(byte) (1328170900 ^ i5)], 196413962);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 2035432610) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2035432610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (532995782 ^ i5)) {
                        break;
                    }
                }
                int i6 = 1608990895 ^ i5;
                throw new IllegalAccessException("double");
            }
            i4 = 1409330134 ^ i5;
            player.openInventory(this.inventory);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -648584688) {
                int i7 = 1559470040 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1053531346 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (300373899 ^ i4)) {
                int i8 = 1600766171 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -648584688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2011565719 ^ i4)) {
                    int i9 = 1013901586 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -455259271 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (813947738 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i10 = 136004510 ^ i4;
        throw new IllegalAccessException();
    }

    @Override
    protected void setMenuItems(String[] strArr, int i) {
        int doteidapmgqpxfmt;
        int i2 = 1440275762 ^ (471243631 ^ 1097483615);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1159731216) {
            i2 = 1899238745 ^ i2;
            if (this.overWorld == null) {
                i2 = 369411297 ^ i2;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -863980837) {
                int i3 = 295810161 ^ i2;
                if (this.overWorld.getItem(43965223) == null) {
                    i2 = doteidapmgqpxfmt(i3, 128282768);
                } else {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1099764051) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1099764051 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (158357567 ^ i3)) {
                                break;
                            }
                        }
                        int i4 = 1798745754 ^ i3;
                        throw new IOException("double");
                    }
                    i2 = 1076670640 ^ i3;
                    this.inventory.setItem(this.overWorld.getItem(43965223).getSlot(1791774489).intValue(), this.overWorld.getItem(43965223).getItemStack(1475551979));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1088984273) {
                        i2 = 1200209952 ^ i2;
                    }
                }
            }
            if (this.netherWorld == null) {
                doteidapmgqpxfmt = doteidapmgqpxfmt(i2, 191799783);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2091292115) {
                int i5 = 124465933 ^ i2;
                if (this.netherWorld.getItem(43965223) == null) {
                    doteidapmgqpxfmt = 201691882 ^ i5;
                } else {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1207897531) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1207897531 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (506963984 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 1148251814 ^ i5;
                        throw new IllegalAccessException("double");
                    }
                    int i7 = 1015693184 ^ i5;
                    this.inventory.setItem(this.netherWorld.getItem(43965223).getSlot(1791774489).intValue(), this.netherWorld.getItem(43965223).getItemStack(1475551979));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -1548815942) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1548815942 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (618695360 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 903193237 ^ i7;
                        throw new IllegalAccessException("double");
                    }
                    doteidapmgqpxfmt = 814722410 ^ i7;
                }
            }
            if (this.endWorld == null) {
                int i9 = 1193310676 ^ doteidapmgqpxfmt;
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(doteidapmgqpxfmt) != 668179179) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(doteidapmgqpxfmt) == 668179179 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(doteidapmgqpxfmt) == (1328150546 ^ doteidapmgqpxfmt)) {
                        break;
                    }
                }
                int i10 = 1838734257 ^ doteidapmgqpxfmt;
                throw new RuntimeException("double");
            }
            i2 = 1210808121 ^ doteidapmgqpxfmt;
            if (this.endWorld.getItem(43965223) == null) {
                int i11 = 252382957 ^ i2;
                return;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1720197921) {
                i2 = 886784045 ^ i2;
                this.inventory.setItem(this.endWorld.getItem(43965223).getSlot(1791774489).intValue(), this.endWorld.getItem(43965223).getItemStack(1475551979));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1068359096) {
                    int i12 = 1003507392 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2091292115 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (173957274 ^ i2)) {
                int i13 = 1965563458 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1720197921 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (882305310 ^ i2)) {
                    int i14 = 326411431 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -863980837 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1966568407 ^ i2)) {
                        int i15 = 122485510 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1159731216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (268615105 ^ i2)) {
                            int i16 = 670728550 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1068359096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (180928958 ^ i2)) {
                                int i17 = 1235569898 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1088984273 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1685779423 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i18 = 1623431282 ^ i2;
        throw new IOException();
    }

    @Generated
    public void setTeleportService(TeleportService teleportService, int i) {
        int i2 = 770951206 ^ (1040557988 ^ 1097483615);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1797171478) {
            int i3 = 677255624 ^ i2;
            this.teleportService = teleportService;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -703489877 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2012250254 ^ i2)) {
                int i4 = 288323680 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1797171478 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1385568917 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1456830063 ^ i2;
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
        mvwqvdcmnw = ByteBuffer.wrap(fgxqjbvyqcfbcta()).asCharBuffer().toString();
        CsZqoZucHG = (-1586625834) ^ new Random(2302948411325884198L).nextInt();
    }

    public static String sbpzfwvpev(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = mvwqvdcmnw.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] ljhyfdxxxzmbgrr() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 0};
    }

    private static byte[] xrdpiajzedzpyvq() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 15};
    }

    private static byte[] tuknqhbdbqrvfif() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 27};
    }

    private static byte[] uqtfsehozgztwkl() {
        return new byte[]{0, 0, 0, 9, 0, 0, 0, 39};
    }

    private static byte[] tvpnbdjmnlnvrom() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 48};
    }

    private static byte[] xluvqqgbwlwtstm() {
        return new byte[]{0, 0, 0, 9, 0, 0, 0, 63};
    }

    private static byte[] fgxqjbvyqcfbcta() {
        return new byte[]{49, 80, 51, 65, 51, 85, 49, 88, 53, 66, 49, 23, 51, 90, 51, 70, 49, 80, 53, 67, 49, 78, 51, 90, 51, 66, 49, 89, 53, 85, 57, 89, 48, 70, 56, 93, 52, 95, 48, 74, 48, 30, 50, 86, 56, 81, 50, 68, 57, 88, 48, 87, 56, 74, 49, 89, 48, 64, 51, 83, 54, 94, 55, 75, 49, 30, 48, 90, 51, 83, 54, 71, 55, 80, 49, 85, 48, 70, 49, 89, 48, 64, 49, 87, 49, 93, 49, 67, 48, 26, 49, 87, 49, 94, 49, 84, 49, 94, 50, 71, 54, 81, 55, 85, 53, 70, 49, 25, 50, 92, 54, 66, 55, 93, 53, 71, 49, 64, 50, 92, 54, 70, 55, 84, 53, 81, 49, 94, 52, 77, 57, 86, 49, 94, 57, 69, 49, 25, 52, 92, 57, 93, 49, 87};
    }

    private static int doteidapmgqpxfmt(int i, int i2) {
        return i ^ i2;
    }
}
