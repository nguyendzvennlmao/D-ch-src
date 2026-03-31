package com.kammoun.donutCore.fly.listener;

import com.kammoun.donutCore.fly.FlyPlugin;
import com.kammoun.donutCore.fly.manager.DatabaseManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventListener implements Listener {
    private final FlyPlugin plugin;
    private final DatabaseManager databaseManager;
    private static int MYiHgZuUDi = 0;
    private transient int l042NbkGt8 = 217426025;
    private static String gkpqeengtc;
    private static String[] nothing_to_see_here = new String[15];

    public EventListener(FlyPlugin flyPlugin, DatabaseManager databaseManager, int i) {
        int i2 = 640983784 ^ (1081345497 ^ 604261502);
        int parseInt = 427241898 ^ (235586550 ^ Integer.parseInt("1429805331"));
        this.l042NbkGt8 = 217426025 ^ MYiHgZuUDi;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 6669741:
                    parseInt = 238389808 ^ parseInt;
                    break;
                case 983977639:
                case 1526616800:
                    break;
                case 2047252505:
                default:
                    throw new RuntimeException();
            }
        }
        this.plugin = flyPlugin;
        this.databaseManager = databaseManager;
        int i3 = 815203478 ^ (323507884 ^ (2042438614 ^ parseInt));
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
    public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.fly.listener.EventListener.onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent):void");
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        int i = 686694171 ^ (1554637991 ^ 1933085218);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1006341360) {
            int i2 = 1746242774 ^ i;
            Player player = playerQuitEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 2069359171) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2069359171 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (378132784 ^ i2)) {
                        break;
                    }
                }
                int i3 = 1874659088 ^ i2;
                throw new RuntimeException("double");
            }
            i = 419428111 ^ i2;
            player.setAllowFlight((byte) (2006256199 ^ i));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1129819589) {
                i = 2030230230 ^ i;
                player.setFlying((byte) (244830353 ^ i));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1958642824) {
                    int i4 = 821764956 ^ i;
                    this.plugin.removeFlyPlayer(player.getUniqueId(), 1910510959);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -211313047) {
                        int i5 = 1842659832 ^ i4;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -211313047 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1079474801 ^ i4)) {
                            break;
                        }
                    }
                    int i6 = 2113347285 ^ i4;
                    throw new IllegalAccessException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1006341360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1331577584 ^ i)) {
                int i7 = 1151328713 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1129819589 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (176931530 ^ i)) {
                    int i8 = 2143931108 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1958642824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1957224701 ^ i)) {
                        int i9 = 1265871062 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1648258646 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1868995853 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i10 = 2008601809 ^ i;
        throw new IllegalAccessException();
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onGameModeChange(PlayerGameModeChangeEvent playerGameModeChangeEvent) {
        int i = 809654792 ^ (448187122 ^ 1933085218);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -832514366) {
            int i2 = 1893890119 ^ i;
            Player player = playerGameModeChangeEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1232278777) {
                i = 717929366 ^ i2;
                if (playerGameModeChangeEvent.getNewGameMode() == GameMode.CREATIVE) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 522635336) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 522635336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (895268693 ^ i)) {
                                break;
                            }
                        }
                        int i3 = 1924626693 ^ i;
                        throw new RuntimeException("double");
                    }
                    i2 = 1396358667 ^ i;
                    player.setAllowFlight((byte) (1356752643 ^ i2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2030880750) {
                        i2 = 2035772414 ^ i2;
                        player.setFlying((byte) (696847613 ^ i2));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1279813601) {
                            i2 = 1891603041 ^ i2;
                            this.plugin.removeFlyPlayer(player.getUniqueId(), 1910510959);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -910887702) {
                                int i4 = 1272133186 ^ i2;
                                return;
                            }
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                        case 61245596:
                            int i5 = 287029660 ^ i;
                            return;
                        case 1165949843:
                        case 1620029753:
                            return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -910887702 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (950002583 ^ i2)) {
                    int i6 = 617190599 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1758640392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1699767979 ^ i2)) {
                        int i7 = 1139077353 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1232278777 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1305042324 ^ i2)) {
                            int i8 = 276640883 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2030880750 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2095479586 ^ i2)) {
                                int i9 = 1333850189 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1279813601 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (106816041 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            int i10 = 1737244286 ^ i2;
            throw new IllegalAccessException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -832514366 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1062826831 ^ i)) {
                int i11 = 1758552843 ^ i;
                throw new RuntimeException("double");
            }
        }
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
    public void onWorldChange(org.bukkit.event.player.PlayerChangedWorldEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.fly.listener.EventListener.onWorldChange(org.bukkit.event.player.PlayerChangedWorldEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
    public void onPlayerDamage(org.bukkit.event.entity.EntityDamageEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.fly.listener.EventListener.onPlayerDamage(org.bukkit.event.entity.EntityDamageEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
    public void onPlayerCombat(org.bukkit.event.entity.EntityDamageByEntityEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.fly.listener.EventListener.onPlayerCombat(org.bukkit.event.entity.EntityDamageByEntityEvent):void");
    }

    static {
        nothing_to_see_here[0] = "⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆";
        nothing_to_see_here[5] = "⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿";
        nothing_to_see_here[6] = "⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀";
        nothing_to_see_here[7] = "⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[8] = "⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉              ";
        gkpqeengtc = ByteBuffer.wrap(yqdrroofjsnencn()).asCharBuffer().toString();
        MYiHgZuUDi = 748800914 ^ new Random(7670227306191840678L).nextInt();
    }

    public static String zajkpegvkf(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = gkpqeengtc.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] fkevkihdtjitioc() {
        return new byte[]{0, 0, 0, 32, 0, 0, 0, 0};
    }

    private static byte[] pchhmwmkhukmlgk() {
        return new byte[]{0, 0, 0, 54, 0, 0, 0, 32};
    }

    private static byte[] yqdrroofjsnencn() {
        return new byte[]{49, 20, 49, 80, 57, 114, 48, 94, 50, 94, 49, 85, 49, 91, 57, 64, 48, 18, 50, 83, 49, 91, 49, 64, 57, 85, 48, 80, 50, 91, 49, 87, 49, 87, 57, 20, 48, 86, 50, 66, 49, 87, 49, 19, 57, 64, 48, 93, 50, 23, 49, 86, 49, 82, 57, 89, 48, 83, 50, 80, 49, 87, 49, 18, 49, 22, 57, 84, 48, 117, 48, 85, 49, 91, 49, 87, 57, 95, 48, 71, 48, 25, 49, 86, 49, 89, 57, 68, 48, 82, 48, 91, 49, 94, 49, 85, 57, 83, 48, 19, 48, 93, 49, 71, 49, 85, 57, 23, 48, 71, 48, 86, 49, 18, 49, 83, 57, 88, 48, 94, 48, 23, 49, 89, 49, 81, 57, 90, 48, 94, 48, 86, 49, 71, 49, 94, 57, 25, 48, 87, 48, 86, 49, 92, 49, 69, 57, 67, 48, 112, 48, 86, 49, 64, 49, 85, 57, 25, 48, 80, 48, 86, 49, 95, 49, 82, 57, 86, 48, 71, 48, 24};
    }

    private static int sruedrvlbjefhntd(int i, int i2) {
        return i2 ^ i;
    }
}
