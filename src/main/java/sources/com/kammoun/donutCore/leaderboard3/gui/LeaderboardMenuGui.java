package com.kammoun.donutCore.leaderboard3.gui;

import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.leaderboard3.LeaderBoardPlugin3;
import com.kammoun.donutCore.leaderboard3.config.LeaderboardMenuConfig;
import com.kammoun.donutCore.leaderboard3.model.LeaderboardType;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class LeaderboardMenuGui implements InventoryHolder {
    private final LeaderBoardPlugin3 plugin;
    private Inventory inventory;
    private static int gh916AWwyY = 0;
    private transient int GHn27nO1Sj = 1182135841;
    private static String wkhjdlqyuj;
    private static String[] nothing_to_see_here = new String[15];

    public LeaderboardMenuGui(LeaderBoardPlugin3 leaderBoardPlugin3, int i) {
        int i2 = 2102659672 ^ 692316175;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 49156767:
                    int i3 = 1787997749 ^ i2;
                    break;
                case 161687290:
                    break;
                case 982459329:
                default:
                    throw new IOException();
                case 1053168627:
            }
        }
        int parseInt = 1846507661 ^ (86441065 ^ Integer.parseInt("1437386886"));
        this.GHn27nO1Sj = 1182135841 ^ gh916AWwyY;
        int ihclgzqyhyixcxrp = 1978858617 ^ ihclgzqyhyixcxrp(parseInt, 492021948);
        this.plugin = leaderBoardPlugin3;
        int i4 = 98803138 ^ ihclgzqyhyixcxrp;
    }

    public void open(Player player, int i) {
        int i2 = 775599914 ^ (602809457 ^ 2037440457);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1524472685) {
            i2 = 1312225939 ^ i2;
            LeaderboardMenuConfig menuConfig = this.plugin.getMenuConfig(264324269);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -728387575) {
                int i3 = 1113356827 ^ i2;
                this.inventory = Bukkit.createInventory(this, menuConfig.getSize(90424969), ChatFormater.color(menuConfig.getTitle(357639802)));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -965320493) {
                    i3 = 1622681094 ^ i3;
                    menuConfig.getItems(503768931).forEach((num, itemStack) -> {
                        int i4 = 2128765573 ^ (19504575 ^ 2037440457);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 903415704) {
                            int i5 = 2020240151 ^ i4;
                            this.inventory.setItem(num.intValue(), itemStack.clone());
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -158703837 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (359020114 ^ i4)) {
                                int i6 = 570932969 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 903415704 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1196902903 ^ i4)) {
                                    break;
                                }
                            }
                        }
                        int i7 = 323623358 ^ i4;
                        throw new IOException();
                    });
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1011396384) {
                        int i4 = 1701651658 ^ i3;
                        player.openInventory(this.inventory);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -388073805) {
                            int i5 = 255881022 ^ i4;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -388073805 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (550107119 ^ i4)) {
                                break;
                            }
                        }
                        int i6 = 1351356552 ^ i4;
                        throw new IOException("double");
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1011396384 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1188542763 ^ i3)) {
                        int i7 = 1154679339 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -965320493 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1349444825 ^ i3)) {
                            break;
                        }
                    }
                }
                int i8 = 1620577737 ^ i3;
                throw new IOException();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -728387575 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (983852416 ^ i2)) {
                int i9 = 1606428120 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1524472685 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (114217122 ^ i2)) {
                    break;
                }
            }
        }
        int i10 = 1062537240 ^ i2;
        throw new IllegalAccessException("double");
    }

    public LeaderboardType getTypeAtSlot(int i, int i2) {
        int i3 = 364399809 ^ (433709089 ^ 2037440457);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1467246261) {
            int i4 = 1590083193 ^ i3;
            return (LeaderboardType) this.plugin.getMenuConfig(264324269).getSlotTypeMap(2020146458).get(Integer.valueOf(i));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1467246261 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1282696318 ^ i3)) {
                int i5 = 1817516929 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1589537409 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (735720742 ^ i3)) {
                    break;
                }
            }
        }
        int i6 = 642008869 ^ i3;
        throw new IOException();
    }

    @NotNull
    public Inventory getInventory() {
        int i = 558702668 ^ (5518498 ^ 2037440457);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1018275526) {
            int i2 = 1852069453 ^ i;
            return this.inventory;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1018275526 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1303475164 ^ i)) {
                int i3 = 1194869906 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1335039151 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1645213380 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1243455828 ^ i;
        throw new RuntimeException();
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
        wkhjdlqyuj = ByteBuffer.wrap(vkunqenhxfmvfjv()).asCharBuffer().toString();
        gh916AWwyY = (-2000933393) ^ new Random(-6672849684135928235L).nextInt();
    }

    public static String dagenotibg(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = wkhjdlqyuj.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] vkunqenhxfmvfjv() {
        return new byte[0];
    }

    private static int ihclgzqyhyixcxrp(int i, int i2) {
        return i2 ^ i;
    }
}
