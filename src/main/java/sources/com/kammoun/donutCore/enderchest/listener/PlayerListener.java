package com.kammoun.donutCore.enderchest.listener;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.enderchest.CustomEnderChest;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {
    private final CustomEnderChest plugin;
    private static int tbj9A9Ictc = 0;
    private transient int muFjNEJvod = 605942219;
    private static byte[] cpgltzcast;
    private static String[] nothing_to_see_here = new String[19];

    public PlayerListener(CustomEnderChest customEnderChest, int i) {
        int i2 = 854121843 ^ (1324284667 ^ 1973401086);
        int parseInt = 1157470753 ^ (222201430 ^ Integer.parseInt("1079676417"));
        this.muFjNEJvod = 605942219 ^ tbj9A9Ictc;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 43614813:
                    parseInt = 1958573950 ^ parseInt;
                    break;
                case 593318608:
                case 1532518606:
                default:
                    throw new RuntimeException();
                case 2086969667:
                    break;
            }
        }
        this.plugin = customEnderChest;
        int i3 = 857778281 ^ (1597309009 ^ parseInt);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent) {
        int i = 137701835 ^ (69368512 ^ 1659964057);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 1999817875) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1999817875 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1471821322 ^ i)) {
                    break;
                }
            }
            int i2 = 389065745 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 1104601226 ^ i;
        Player player = playerJoinEvent.getPlayer();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2038810817) {
            i3 = 742014352 ^ i3;
            this.plugin.getDataManager(1988742499).loadData(player.getUniqueId(), player.getName(), 337487360);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 408167488) {
                int i4 = 598046998 ^ i3;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 92269809 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1842913589 ^ i3)) {
                int i5 = 82457146 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2038810817 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (871825245 ^ i3)) {
                    int i6 = 1928272303 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 408167488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (192042516 ^ i3)) {
                        break;
                    }
                }
            }
        }
        int i7 = 731903225 ^ i3;
        throw new RuntimeException();
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        int i = 698847901 ^ (573126700 ^ 1659964057);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1274872131) {
            int i2 = 1424574009 ^ i;
            Player player = playerQuitEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -323538807) {
                i = 1760627834 ^ i2;
                if (this.plugin.getEnderChestManager(1051175380).isEnderChestOpen(player.getUniqueId(), 451589471) != (1432873579 ^ i)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1421913254) {
                        i2 = 1509658279 ^ i;
                        this.plugin.getEnderChestManager(1051175380).closeEnderChest(player, (byte) (211576013 ^ i2), 1878071892);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1692608096) {
                            i = 105466479 ^ i2;
                            SchedulerUtil.runLater(() -> {
                                int i3 = 378858448 ^ (1059642096 ^ 1659964057);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1516887498) {
                                    i3 = 1340688385 ^ i3;
                                    if (player.isOnline() == (77886392 ^ i3)) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 623091136) {
                                            int i4 = 1696938631 ^ i3;
                                            this.plugin.getDataManager(1988742499).removeCachedData(player.getUniqueId(), 1781602935);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 202000891) {
                                                int i5 = 755189346 ^ i4;
                                                return;
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 202000891 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (950147327 ^ i4)) {
                                                    break;
                                                }
                                            }
                                            int i6 = 1579574410 ^ i4;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                            case 73017560:
                                                int i7 = 1210481893 ^ i3;
                                                return;
                                            case 766279183:
                                                return;
                                            case 1188944836:
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1678801642 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1865994633 ^ i3)) {
                                        int i8 = 2120413479 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 623091136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (465516282 ^ i3)) {
                                            int i9 = 424393428 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1516887498 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1212090682 ^ i3)) {
                                                int i10 = 300004778 ^ i3;
                                                throw new IOException();
                                            }
                                        }
                                    }
                                }
                            }, 100L, 1577269415);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1453946136) {
                                int i3 = 1392345230 ^ i;
                                return;
                            }
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                        case 91816776:
                            i = 1605551304 ^ i;
                            break;
                        case 632179416:
                            break;
                        case 1404740057:
                        case 1927174149:
                        default:
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1052413590 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1635942222 ^ i)) {
                                    int i4 = 951127918 ^ i;
                                    throw new IOException("double");
                                }
                            }
                            break;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -323538807 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2053977964 ^ i2)) {
                    int i5 = 1635565562 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1692608096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (355472995 ^ i2)) {
                        break;
                    }
                }
            }
            int i6 = 755469978 ^ i2;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1453946136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (675057375 ^ i)) {
                int i7 = 1059786480 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1421913254 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1817820594 ^ i)) {
                    int i8 = 906233174 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1274872131 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1579888510 ^ i)) {
                        int i9 = 968374412 ^ i;
                        throw new IllegalAccessException();
                    }
                }
            }
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerKick(PlayerKickEvent playerKickEvent) {
        int i = 1421191923 ^ (565467909 ^ 1659964057);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1081615496) {
            i = 369863837 ^ i;
            Player player = playerKickEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 265994128) {
                i = 1376946670 ^ i;
                if (this.plugin.getEnderChestManager(1051175380).isEnderChestOpen(player.getUniqueId(), 451589471) == (1407835676 ^ i)) {
                    xbovhfdpogdjzuwh(i, 1598263387);
                    return;
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1622216478) {
                    i = 1849684788 ^ i;
                    this.plugin.getEnderChestManager(1051175380).closeEnderChest(player, (byte) (1037446441 ^ i), 1878071892);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -290363071) {
                        int i2 = 830235503 ^ i;
                        return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 265994128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2045362336 ^ i)) {
                int i3 = 1733183863 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1081615496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (927646550 ^ i)) {
                    int i4 = 1443616369 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1622216478 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2009228033 ^ i)) {
                        int i5 = 1546470506 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -290363071 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (833317269 ^ i)) {
                            int i6 = 1966557193 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1699902008 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (769932894 ^ i)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i7 = 471789326 ^ i;
        throw new RuntimeException();
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠛⠉⠙⠛⠛⠛⠛⠻⢿⣿⣷⣤⡀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠈⢻⣿⣿⡄⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⠀⠀⠀⣸⣿⡏⠀⠀⠀⣠⣶⣾⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣄⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⢰⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣷⡄⠀";
        nothing_to_see_here[5] = "⠀⠀⣀⣤⣴⣶⣶⣿⡟⠀⠀⠀⢸⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⠀";
        nothing_to_see_here[6] = "⠀⢰⣿⡟⠋⠉⣹⣿⡇⠀⠀⠀⠘⣿⣿⣿⣿⣷⣦⣤⣤⣤⣶⣶⣶⣶⣿⣿⣿⠀";
        nothing_to_see_here[7] = "⠀⢸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀";
        nothing_to_see_here[8] = "⠀⣸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠉⠻⠿⣿⣿⣿⣿⡿⠿⠿⠛⢻⣿⡇⠀⠀";
        nothing_to_see_here[9] = "⠀⣿⣿⠁⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⠀⠀";
        nothing_to_see_here[10] = "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀";
        nothing_to_see_here[11] = "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀";
        nothing_to_see_here[12] = "⠀⢿⣿⡆⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀";
        nothing_to_see_here[13] = "⠀⠸⣿⣧⡀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠛⢿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⣰⣿⣿⣷⣶⣶⣶⣶⠶⠀⢠⣿⣿⠀⠀⠀";
        nothing_to_see_here[15] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⣽⣿⡏⠁⠀⠀⢸⣿⡇⠀⠀⠀";
        nothing_to_see_here[16] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⢹⣿⡆⠀⠀⠀⣸⣿⠇⠀⠀⠀";
        nothing_to_see_here[17] = "⠀⠀⠀⠀⠀⠀⠀⢿⣿⣦⣄⣀⣠⣴⣿⣿⠁⠀⠈⠻⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀";
        nothing_to_see_here[18] = "⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⠿⠿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        cpgltzcast = fiohuqvfzyhovvd();
        tbj9A9Ictc = 104560776 ^ new Random(-5337446693829120040L).nextInt();
    }

    public static String qifxehnwyn(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ cpgltzcast[i3 % cpgltzcast.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] fiohuqvfzyhovvd() {
        return new byte[]{64, 43, 126, 66, 116, 118, 20, 97, 10, 83, 4, 112, 112, 48, 77, 88, 119, 63, 123, 56, 27, 50, 94, 17, 84, 114, 7, 13, 93, 36, 32, 25, 68, 16, 18, 126, 46, 20, 27, 111, 32, 64, 44, 22, 97, 60, 31, 10, 7, 105, 90, 50, 17, 27, 122, 86, 63, 62, 25, 124, 104, 13, 36, Byte.MAX_VALUE, 102, 106, 28, Byte.MAX_VALUE, 75, 97, 34, 93, 4, 36, 62, 96, 19, 94, 103, 62, 90};
    }

    private static int xbovhfdpogdjzuwh(int i, int i2) {
        return i2 ^ i;
    }
}
