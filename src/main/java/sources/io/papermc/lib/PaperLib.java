package io.papermc.lib;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import io.papermc.lib.environments.CraftBukkitEnvironment;
import io.papermc.lib.environments.Environment;
import io.papermc.lib.environments.PaperEnvironment;
import io.papermc.lib.environments.SpigotEnvironment;
import io.papermc.lib.features.blockstatesnapshot.BlockStateSnapshotResult;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import javax.annotation.Nonnull;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.Plugin;

public class PaperLib {
    private static Environment ENVIRONMENT;
    private static int NOZwzGje49 = 0;

    private transient int f1314lmV0vGV5x = 369172099;
    private static byte[] cmosqalmbc;
    private static String[] nothing_to_see_here = new String[15];

    private PaperLib() {
        wwhswiwsovcibycp(707762674 ^ 1302186979, 1938280173);
        int parseInt = 980491519 ^ (879993944 ^ Integer.parseInt("439821403"));
        this.f1314lmV0vGV5x = 369172099 ^ NOZwzGje49;
        int wwhswiwsovcibycp = 1974511583 ^ wwhswiwsovcibycp(parseInt, 500555643);
    }

    private static Environment initialize(int i) {
        int i2 = 1800629126 ^ (260020359 ^ (2029536684 ^ 2066153206));
        int i3 = i2;
        try {
            Class.forName(qfocgkfxyd(mgcguyncnvrflxi(), i3));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1066549979) {
                int i4 = 1033915803 ^ i3;
                PaperEnvironment paperEnvironment = new PaperEnvironment();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -762302974) {
                    i3 = 1925963220 ^ i4;
                    return paperEnvironment;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -762302974 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (758268336 ^ i4)) {
                        break;
                    }
                }
                int i5 = 1310427192 ^ i4;
                throw new IOException("double");
            }
        } catch (ClassNotFoundException e) {
            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                case -762302974:
                    i3 = wwhswiwsovcibycp(i3, 1047876427);
                    break;
                case 1066549979:
                    i3 = wwhswiwsovcibycp(i3, 64298704);
                    break;
                default:
                    throw new RuntimeException("Error in hash");
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 557495387) {
                int i6 = 507709532 ^ i3;
                i3 = i6;
                try {
                    Class.forName(qfocgkfxyd(tjtutftgrkscuqg(), i3));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -752683333) {
                        int i7 = 596041002 ^ i3;
                        SpigotEnvironment spigotEnvironment = new SpigotEnvironment();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -820764694) {
                            i3 = 1780977561 ^ i7;
                            return spigotEnvironment;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1154400417 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1405182343 ^ i7)) {
                                int i8 = 954152018 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1641520351 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (645588408 ^ i7)) {
                                    int i9 = 1291680815 ^ i7;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -820764694 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (692591525 ^ i7)) {
                                        int i10 = 319818600 ^ i7;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
                    }
                } catch (ClassNotFoundException e2) {
                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                        case -820764694:
                            i3 = 2004002320 ^ i3;
                            break;
                        case -752683333:
                            i3 = wwhswiwsovcibycp(i3, 1425308474);
                            break;
                        default:
                            throw new IOException("Error in hash");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1954623337) {
                        int i11 = 240587934 ^ i3;
                        return new CraftBukkitEnvironment();
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1954623337 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1499454607 ^ i3)) {
                int i12 = 905162264 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -752683333 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1680275852 ^ i3)) {
                    int i13 = 2044324474 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 557495387 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2112764663 ^ i3)) {
                        int i14 = 2025358048 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1066549979 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (904111517 ^ i3)) {
                            int i15 = 789554892 ^ i3;
                            throw new IllegalAccessException();
                        }
                    }
                }
            }
        }
    }

    @Nonnull
    public static Environment getEnvironment() {
        int i = 1297016502 ^ (908212337 ^ (93149808 ^ 2066153206));
        return ENVIRONMENT;
    }

    public static void setCustomEnvironment(@Nonnull Environment environment) {
        int i = 959747489 ^ (170069024 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1099643834) {
            i = 2107685519 ^ i;
            ENVIRONMENT = environment;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1399918655) {
                int i2 = 1106740790 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1556947341 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (985762328 ^ i)) {
                int i3 = 815285746 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1399918655 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1753378152 ^ i)) {
                    int i4 = 1678970862 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1099643834 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1874117027 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 1243236624 ^ i;
        throw new IllegalAccessException();
    }

    @Nonnull
    public static CompletableFuture teleportAsync(@Nonnull Entity entity, @Nonnull Location location, int i) {
        int i2 = 1249057226 ^ (1614117183 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1962610662) {
            int i3 = 1791774722 ^ i2;
            return ENVIRONMENT.teleport(entity, location, PlayerTeleportEvent.TeleportCause.PLUGIN, 448047068);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -580489207 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (469614453 ^ i2)) {
                int i4 = 1175508799 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1962610662 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (977809694 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1792917177 ^ i2;
        throw new RuntimeException();
    }

    @Nonnull
    public static CompletableFuture teleportAsync(@Nonnull Entity entity, @Nonnull Location location, PlayerTeleportEvent.TeleportCause teleportCause, int i) {
        int i2 = 1863076253 ^ (1107800812 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1318572998) {
            int i3 = 1826054908 ^ i2;
            return ENVIRONMENT.teleport(entity, location, teleportCause, 448047068);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1318572998 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1625354400 ^ i2)) {
                int i4 = 1971884821 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -674022439 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (122029452 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1107481858 ^ i2;
        throw new IllegalAccessException();
    }

    @Nonnull
    public static CompletableFuture<Chunk> getChunkAtAsync(@Nonnull Location location) {
        int i = 619167153 ^ (33997608 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -298056838) {
            int i2 = 1339094504 ^ i;
            return getChunkAtAsync(location.getWorld(), location.getBlockX() >> ((byte) (303527299 ^ i2)), location.getBlockZ() >> ((byte) (303527299 ^ i2)), (byte) (303527302 ^ i2), 1146275792);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1866748872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1769088660 ^ i)) {
                int i3 = 1021852706 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -298056838 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (150587090 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 689257001 ^ i;
        throw new IllegalAccessException();
    }

    @Nonnull
    public static CompletableFuture<Chunk> getChunkAtAsync(@Nonnull Location location, boolean z) {
        int i = 181137227 ^ (1046662699 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2088697010) {
            int i2 = 1141941751 ^ i;
            return getChunkAtAsync(location.getWorld(), location.getBlockX() >> ((byte) (195000933 ^ i2)), location.getBlockZ() >> ((byte) (195000933 ^ i2)), z, 1146275792);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2088697010 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1208051327 ^ i)) {
                int i3 = 644413578 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1560007432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (129521139 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 852348699 ^ i;
        throw new IOException();
    }

    @Nonnull
    public static CompletableFuture<Chunk> getChunkAtAsync(@Nonnull World world, int i, int i2) {
        int i3 = 1043494736 ^ (1389180083 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1093801816) {
            return getChunkAtAsync(world, i, i2, (byte) (1773960261 ^ (2120597841 ^ i3)), 1146275792);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1093801816 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (272169606 ^ i3)) {
                int i4 = 340893498 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1306780195 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1947877127 ^ i3)) {
                    break;
                }
            }
        }
        int i5 = 1972040748 ^ i3;
        throw new RuntimeException();
    }

    @Nonnull
    public static CompletableFuture getChunkAtAsync(@Nonnull World world, int i, int i2, boolean z, int i3) {
        int i4 = 1191272596 ^ (159399729 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1388508519) {
            return ENVIRONMENT.getChunkAtAsync(world, i, i2, z, (byte) (1530511031 ^ (1855856612 ^ i4)), 148300805);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1388508519 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1231774180 ^ i4)) {
                int i5 = 1897815394 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -640813638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (589914946 ^ i4)) {
                    break;
                }
            }
        }
        int i6 = 1999291598 ^ i4;
        throw new RuntimeException();
    }

    @Nonnull
    public static CompletableFuture getChunkAtAsync(@Nonnull World world, int i, int i2, boolean z, boolean z2, int i3) {
        int i4 = 1958385490 ^ (1133539090 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1616917938) {
            int i5 = 1877762481 ^ i4;
            return ENVIRONMENT.getChunkAtAsync(world, i, i2, z, z2, 148300805);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1616917938 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1416652551 ^ i4)) {
                int i6 = 536242926 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 520304697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1203348815 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 120454483 ^ i4;
        throw new IOException();
    }

    @Nonnull
    public static CompletableFuture getChunkAtAsyncUrgently(@Nonnull World world, int i, int i2, boolean z, int i3) {
        int i4 = 1458792106 ^ (2065316203 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1233319494) {
            return ENVIRONMENT.getChunkAtAsync(world, i, i2, z, (byte) (1913914081 ^ (618374103 ^ i4)), 148300805);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1868556541 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (252500273 ^ i4)) {
                int i5 = 849226019 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1233319494 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (406123485 ^ i4)) {
                    break;
                }
            }
        }
        int i6 = 1585279310 ^ i4;
        throw new IllegalAccessException();
    }

    public static boolean isChunkGenerated(@Nonnull Location location) {
        int i = 2000507786 ^ (1028344714 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1970849871) {
            int i2 = 1669935654 ^ i;
            return isChunkGenerated(location.getWorld(), location.getBlockX() >> ((byte) (1390007508 ^ i2)), location.getBlockZ() >> ((byte) (1390007508 ^ i2)), 1479564906);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1970849871 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1256655978 ^ i)) {
                int i3 = 249732250 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1764841854 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (340604295 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1244689015 ^ i;
        throw new RuntimeException();
    }

    public static boolean isChunkGenerated(@Nonnull World world, int i, int i2, int i3) {
        int i4 = 1103003975 ^ (1663120076 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -842372118) {
            int i5 = 550169375 ^ i4;
            return ENVIRONMENT.isChunkGenerated(world, i, i2, 1306049646);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -842372118 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2079735799 ^ i4)) {
                int i6 = 405220836 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -878890221 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1698601772 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 1013255383 ^ i4;
        throw new IOException();
    }

    @Nonnull
    public static BlockStateSnapshotResult getBlockState(@Nonnull Block block, boolean z) {
        int i = 546369075 ^ (944544155 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 534006515) {
            int i2 = 1560519465 ^ i;
            return ENVIRONMENT.getBlockState(block, z, 993848092);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -137800775 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (826166305 ^ i)) {
                int i3 = 882115205 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 534006515 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (501633716 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 343647614 ^ i;
        throw new IOException();
    }

    public static CompletableFuture<Location> getBedSpawnLocationAsync(@Nonnull Player player, boolean z) {
        int i = 1249162771 ^ (93324317 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1508743231) {
            int i2 = 1251457847 ^ i;
            return ENVIRONMENT.getBedSpawnLocationAsync(player, z, 702091917);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -223363461 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1389219031 ^ i)) {
                int i3 = 643080175 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1508743231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (650172097 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2024124650 ^ i;
        throw new IOException();
    }

    public static boolean isVersion(int i) {
        int i2 = 1313878184 ^ (1701877636 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2144153902) {
            int i3 = 272781277 ^ i2;
            return ENVIRONMENT.isVersion$310209513(i, 390532047);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 35696698 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1106686643 ^ i2)) {
                int i4 = 1790517533 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2144153902 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (252884487 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 678665538 ^ i2;
        throw new IllegalAccessException();
    }

    public static boolean isVersion(int i, int i2) {
        int i3 = 1044806704 ^ (1678829574 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 193156609) {
            int i4 = 53030571 ^ i3;
            return ENVIRONMENT.isVersion(i, i2, 123614333);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 315237209 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (400095965 ^ i3)) {
                int i5 = 692431202 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 193156609 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (412895878 ^ i3)) {
                    break;
                }
            }
        }
        int i6 = 206573414 ^ i3;
        throw new IllegalAccessException();
    }

    public static int getMinecraftVersion(int i) {
        int i2 = 1692635097 ^ (874594667 ^ (928748058 ^ 2066153206));
        return ENVIRONMENT.getMinecraftVersion(25435699);
    }

    public static int getMinecraftPatchVersion() {
        int i = 1866381053 ^ (489251491 ^ (847029252 ^ 2066153206));
        return ENVIRONMENT.getMinecraftPatchVersion(819491934);
    }

    public static int getMinecraftPreReleaseVersion() {
        int i = 562578763 ^ (1674603848 ^ (623292767 ^ 2066153206));
        return ENVIRONMENT.getMinecraftPreReleaseVersion(3078429);
    }

    public static boolean isSpigot() {
        int i = 1782631336 ^ (1424372637 ^ (1552682856 ^ 2066153206));
        return ENVIRONMENT.isSpigot(161377068);
    }

    public static boolean isPaper(int i) {
        int i2 = 1068179491 ^ (736440638 ^ (391341639 ^ 2066153206));
        return ENVIRONMENT.isPaper(1358662166);
    }

    public static void suggestPaper(@Nonnull Plugin plugin) {
        int i = 1689919886 ^ (2115606892 ^ 2066153206);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 204091555) {
            i = 1560544906 ^ i;
            suggestPaper(plugin, Level.INFO, 566392816);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -469105423) {
                int i2 = 1750114340 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -469105423 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1067190419 ^ i)) {
                int i3 = 1052143180 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 204091555 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (972236789 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1197313237 ^ i;
        throw new IOException();
    }

    public static void suggestPaper(@javax.annotation.Nonnull org.bukkit.plugin.Plugin r4, @javax.annotation.Nonnull java.util.logging.Level r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: io.papermc.lib.PaperLib.suggestPaper(org.bukkit.plugin.Plugin, java.util.logging.Level, int):void");
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
        int parseInt = 479464517 ^ (1676548654 ^ Integer.parseInt("439821403"));
        cmosqalmbc = orlvdzeubdzxqnt();
        NOZwzGje49 = (-2084569313) ^ new Random(3338814862508513441L).nextInt();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 711561603) {
            int i = 1722332132 ^ parseInt;
            ENVIRONMENT = initialize(2121500275);
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 711561603 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (2091768232 ^ parseInt)) {
                int i2 = 2051424319 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 522981024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1245669302 ^ parseInt)) {
                    break;
                }
            }
        }
        int i3 = 150493244 ^ parseInt;
        throw new IOException();
    }

    public static String qfocgkfxyd(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ cmosqalmbc[i3 % cmosqalmbc.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] orlvdzeubdzxqnt() {
        return new byte[]{74, 96, 2, 35, 76, 115, 63, 49, 74, 115, 76, 74, 88, 71, 5, 13, 104, 88, 23, 48, 98, 46, 79, 19, 102, 68, 40, 106, 112, 54, 101, 52, 102, 5, 67, 64, 85, 113, 63, 66, 77, 110, 54, 116, 62, 107, 85, 74, 101, 34, 92, 104, 57, 57, 12, 53, 53, 59, 106, 100, 26, 12, 30, 17, Byte.MAX_VALUE, 5, 18, 125, 35, 104, 119, 85, 28, 43, 104, 55, 80, 118, 24, 100, 42};
    }

    private static byte[] mgcguyncnvrflxi() {
        return new byte[]{-123, -88, 54, 115, 117, 47, 14, 104, 114, 110, 125, 25, 108, 17, 60, 77, 89, 24, 47, 113, 83, 118, 123, 89, 95, 4, 25, 42, 72, 106, 84, 104, 82, 79, 122, 28, 100, 107, 7, 1, 124, 56, 2, 55, 7, 61, 100, 12, 93, 63, 109, 15, 13, 107, 53, 118, 4, 106, 82, 37, 43, 120, 42, 77, 70, 88, 35, 47, 27, 50, 70, 5};
    }

    private static byte[] tjtutftgrkscuqg() {
        return new byte[]{-122, -81, 55, Byte.MAX_VALUE, Byte.MAX_VALUE, 56, 7, 100, 121, 108, 126, 9, 109, 4, 54, 93, 80, 13, 36, 110, 80, 106, 122, 77, 85, 30, 16, 118, 67, 84, 87, 116, 83, 95, 112, 30, 109, 44, 12, 7, Byte.MAX_VALUE, 29, 3, 40, 13, 60, 109, 30, 86, 122, 110, 63};
    }

    private static byte[] vjbsupctvkiwrjs() {
        return new byte[]{-123, -86, 53, 53, 117, 4, 14, 104, 123, 46, 125, 95, 111, 30, 60, 93, 89, 77, 38, 120, 83, 116, 120, 80, 95, 0, 25, Byte.MAX_VALUE, 65, 119, 84, 109, 81, 70, 122, 17, 100, 45, 14, 29, 124, 40, 1, 98, 7, 46, 100, 23, 84, 124, 109, 40, 14, 99, 53, 103, 4, 46, 91, 38, 43, 77, 41, 78, 70, 95, 35, 36, 18, 121, 70, 23, 43, 114, 81, 115, 97, 40, 41, 121, 27, 95, 87, 85, 26, 20, 66, 110, 0, 91, 66, 13, 125, 6, 126, 86};
    }

    private static byte[] wtozsutwaripxzj() {
        return new byte[]{-123, -81, 52, 54, 120, 21, 9, 98, 120, 48, 125, 31, 110, 0, 49, 27, 94, 9, 37, 108, 83, 115, 121, 75, 82, 7, 30, 54, 66, 108, 84, 112, 80, 73, 119, 86, 99, 52, 13, 24, 124, 50, 0, 45, 10, 125, 99, 31, 87, 125, 109, 57, 15, 104, 56, 111, 3, 112, 88, 119, 43, 84, 40, 65, 75, 95, 36, 63, 17, 123, 70, 28, 42, 113, 92, 116, 102, 100, 42, 49, 27, 19, 86, 79, 23, 90, 69, 108, 3, 23, 66, 5, 124, 77, 115, 90, 59, 41, 106, 87, 1, 39, 24, 31, 39, 35, 114, 52};
    }

    private static byte[] eayhghabrmuvxny() {
        return new byte[]{-123, -82, 51, 50, 126, 32, 13, 116, 121, 32, 125, 91, 105, 16, 55, 85, 90, 16, 36, 97, 83, 108, 126, 14, 84, 85, 26, 41, 67, 103, 84, 102, 87, 65, 113, 3, 103, 40, 12, 2, 124, 38, 7, 101, 12, 63, 103, 20, 86, 126, 109, 56, 8, 102, 62, 103, 7, 110, 89, 61, 43, 88, 47, 78, 77, 64, 32, 62, 16, 124, 70, 5, 45, 116, 90, 98, 98, 102, 43, 63, 27, 11, 81, 71, 17, 20, 65, 96, 2, 16, 66, 28, 123, 5};
    }

    private static byte[] blnvqdfwgiyvwvm() {
        return new byte[]{-125, -82, 49, 50, 122, 98};
    }

    private static byte[] qqjllgdpjycrsze() {
        return new byte[]{-123, -84, 55, 99, 124, 39, 9, 112, 121, 34, 125, 11, 109, 27, 53, 81, 94, 11, 36, 42, 83, 110, 122, 75, 86, 30, 30, 44, 67, 108, 84, 42, 83, 87, 115, 16, 99, 46, 12, 19, 124, 59, 3, 45, 14, 42, 99, 8};
    }

    private static byte[] fhoqxboijkvfwuo() {
        return new byte[]{-123, -87, 58, 50, 121, 42, 14, 115, 123, 101, 116, 2, 109, 16, 52, 73, 89, 28, 47, 33, 87, 101, 126, 71, 87, 0, 16, 45, 69, 107, 84, 119, 87, 19, 123, 2, 96, 38, 14, 21, 124, 44, 14, 50, 11, 50, 100, 9, 84, 113, 100, 119, 12, 33};
    }

    private static byte[] lpjdbqriyrjsknm() {
        return new byte[]{Byte.MIN_VALUE, -85, 49, 58, 124, 96};
    }

    private static byte[] ecndumgvtaowsfa() {
        return new byte[]{-123, -89, 50, 101, 121, 35, 9, 113, 122, 34, 125, 0, 104, 29, 48, 85, 94, 10, 39, 42, 83, 101, Byte.MAX_VALUE, 77, 83, 26, 30, 45, 64, 108, 84, 33, 86, 81, 118, 20, 99, 47, 15, 19, 124, 48, 6, 43, 11, 46, 99, 9};
    }

    private static byte[] mjznmebmymowksp() {
        return new byte[]{-123, -89, 50, 36};
    }

    private static byte[] kyjkbfwjxbtduvn() {
        return new byte[]{-123, -83, 58, 44, 125, 119, 9, 63, Byte.MAX_VALUE, 121, 125, 69, 96, 72, 52, 9, 94, 86, 34, 58, 83, 33, 119, 28, 87, 64, 30, 100, 69, 60, 84, 59, 94, 10, 114, 68, 99, Byte.MAX_VALUE, 10, 72, 124, 97, 14, 123, 15, 111, 99, 68, 80, 40, 109, 103, 1, 54, 61, 49, 3, 53, 95, 110, 43, 3, 38, 30, 78, 1, 36, 115, 22, 98, 70, 90, 36, 36, 89, 51, 102, 120, 45, 110, 27, 69, 88, 13, 18, 72, 69, 49, 4, 64, 66, 67, 114, 87, 118, 1, 59, 102, 109, 29, 1, 109, 22, 64, 34, 98};
    }

    private static byte[] cmvlyplfdayrfjj() {
        return new byte[]{-123, -86, 58, 54, 124, 1, 13, 103, 120, 44, 125, 17, 96, 82, 53, 65, 90, 9, 37, 99, 83, 59, 119, 118, 86, 29, 26, 35, 66, 101, 84, 115, 94, 16, 115, 59, 103, 39, 13, 25, 124, 54, 14, 52, 14, 61, 103, 26, 87, 96, 109, 36, 1, 44, 60, 77, 7, 34, 88, 58, 43, 77, 38, 80, 79, 77, 32, 55, 17, 100, 70, 79, 36, 49, 88, Byte.MAX_VALUE, 98, 46, 42, 34, 27, 26, 88, 69, 19, 25, 65, 101, 3, 82, 66, 16, 114, 2};
    }

    private static byte[] olzgkglkzgvedjq() {
        return new byte[]{-123, -82, 53, 53, Byte.MAX_VALUE, 27, 11, 105, 115, 58, 125, 30, 111, 3, 54, 21, 92, 14, 46, 111, 83, 121, 120, 64, 85, 14, 28, 32, 73, 47, 84, 118, 81, 90, 112, 31, 97, 38, 6, 18, 124, 57, 1, 43, 13, 48, 97, 18, 92, 117, 109, 45, 14, 47, 63, 125, 1, 103, 83, 47, 43, 91, 41, 72, 76, 79, 38, 41, 26, 48, 70, 10, 43, 126, 91, 106, 100, 111, 33, 52, 27, 22, 87, 68, 16, 6, 71, 105, 8, 5, 66, 24, 125, 3, 116, 88, 57, 63, 97, 90, 1, 32, 25, 85};
    }

    private static byte[] estdcxunyuuricu() {
        return new byte[]{-122, -82, 49, 51, 123, 38, 7, 99, 124, 63, 126, 15, 107, 18, 50, 72, 80, 79, 33, 105, 80, 107, 124, 3, 81, 23, 16, 52, 70, 111, 87, 98, 85, 91, 116, 24, 109, 53, 9, 19, Byte.MAX_VALUE, 49, 5, 35, 9, 124, 109, 17, 83, 123, 110, 62, 10, 41, 59, 114, 13, 126, 92, 51, 40, 95, 45, 77, 72, 87, 42, 39, 21, 35, 69, 68, 47, 116, 95, 118, 104, 36, 46, 46, 24, 91, 83, 68, 20, 74, 75, 38};
    }

    private static byte[] pnfofieuhuzkdll() {
        return new byte[]{-123, -84, 59, 51, 120, 100};
    }

    private static byte[] qpcompsyvizwvcg() {
        return new byte[]{-123, -88, 58, 58, 117, 22, 6, 97, 120, 54, 125, 24, 96, 12, 60, 24, 81, 0, 37, 107, 83, 122, 119, 70, 95, 4, 17, 63, 66, 102, 84, 112, 94, 28, 122, 33, 108, 41, 13, 26, 124, 48, 14, 35, 7, 57, 108, 8, 87, 55, 109, 41, 1, 50, 53, 44, 12, 42, 88, 38, 43, 83, 38, 65, 70, 83, 43, 36, 17, 125, 70, 11, 36, 97, 81, 34, 105, 52, 42, 56, 27, 26, 88, 85, 26, 16, 74, 104, 3, 22, 66, 24, 114, 0, 126, 94, 52, 45, 106, 78, 1, 44};
    }

    private static byte[] tabyldtxhtakrxu() {
        return new byte[]{-123, -85, 59, 53};
    }

    private static byte[] ozxplzsauwirnea() {
        return new byte[]{-123, -85, 59, 53, 126, 54, 13, 108, 124, 48, 120, 24, 110, 6, 55, 31, 90, 12, 38, 97, 91, 108, 125, 85, 84, 19, 30, 41, 68, 47, 83, 111, 84, 81, 113, 86, 100, 60, 6, 27, Byte.MAX_VALUE, 41, 4, 102, 8, 47, 97, 0, 83, 117, 110, 122, 11, 95, 61, 96, 12, 125, 88, 51, 40, 76, 40, 0};
    }

    private static byte[] vseqrbtggkxglfy() {
        return new byte[]{-123, -90, 52, 48, 122, 100};
    }

    private static byte[] hwxwwkhohyitzqt() {
        return new byte[]{Byte.MIN_VALUE, -83, 53, 45, Byte.MAX_VALUE, 121, 15, 62, Byte.MAX_VALUE, 122, 126, 64, 107, 73, 50, 0, 90, 80, 35, 63, 85, 32, 124, 25, 86, 75, 29, 99, 66, 60, 86, 58, 81, 8, 113, 72, 97, 126, 8, 76, 126, 100, 6, 123, 11, 98, 103, 64, 86, 44, 107, 101, 11, 49, 56, 58, 2, 53, 89, 110, 42, 3, 43, 24, 77, 15, 33, 115, 20, 101, 69, 93, 40, 36, 95, 57, 99, 124, 40, 107, 31, 67, 82, 8, 16, 66, 68, 50, 3, 66, 71, 67, 125, 86, 116, 15, 61, 103, 109, 30, 2, 104, 29, 65, 36, 107};
    }

    private static byte[] dizhqdcldkwqpvm() {
        return new byte[]{-122, -81, 49, 51, 122, 39, 12, 100, 125, 32, 124, 13, 104, 4, 55, 76, 88, 10, 37, 115, 81, 62, 121, 71, 85, 27, 31, 42, 64, 37, 85, 113, 84, 83, 115, 5, 103, 55, 12, 23, 123, 46, 5, 100, 9, 54, 101, 14, 85, 122, 110, 62, 9, 124, 62, 118, 6, 43, 92, 34, 41, 83, 41, 3, 79, 83, 34, 37, 17, 51, 71, 3, 46, 117, 91, 100, 102, 33, 43, 116, 29, 12, 80, 89, 19, 31, 65, 101, 1, 15, 65, 92, 121, 27, 113, 82, 62, 42, 111, 83, 0, 52, 30, 11, 33, 123};
    }

    private static byte[] mprandneibouake() {
        return new byte[]{-123, -84, 59, 96, 126, 39, 14, 112, 114, 38, 125, 11, 97, 24, 55, 81, 89, 11, 47, 46, 83, 110, 118, 72, 84, 30, 25, 44, 72, 104, 84, 42, 95, 84, 113, 16, 100, 46, 7, 23, 124, 59, 15, 46, 12, 42, 100, 8};
    }

    private static int wwhswiwsovcibycp(int i, int i2) {
        return i2 ^ i;
    }
}
