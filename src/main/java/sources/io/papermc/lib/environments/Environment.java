package io.papermc.lib.environments;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import io.papermc.lib.features.asyncchunks.AsyncChunks;
import io.papermc.lib.features.asyncteleport.AsyncTeleport;
import io.papermc.lib.features.bedspawnlocation.BedSpawnLocation;
import io.papermc.lib.features.blockstatesnapshot.BlockStateSnapshot;
import io.papermc.lib.features.blockstatesnapshot.BlockStateSnapshotResult;
import io.papermc.lib.features.chunkisgenerated.ChunkIsGenerated;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;

public abstract class Environment {
    private final int minecraftVersion;
    private final int minecraftPatchVersion;
    private final int minecraftPreReleaseVersion;
    protected AsyncChunks asyncChunksHandler;
    protected AsyncTeleport asyncTeleportHandler;
    protected ChunkIsGenerated isGeneratedHandler;
    protected BlockStateSnapshot blockStateSnapshotHandler;
    protected BedSpawnLocation bedSpawnLocationHandler;
    private static int EdMct4tWSA = 0;
    private transient int wUfaKDohLt = 1505286958;
    private static byte[] wphywvinsr;
    private static String[] nothing_to_see_here = new String[18];

    public Environment() {
        throw new UnsupportedOperationException("Method not decompiled: io.papermc.lib.environments.Environment.<init>():void");
    }

    public abstract String getName();

    public CompletableFuture<Chunk> getChunkAtAsync(World world, int i, int i2, boolean z) {
        int i3 = 1008080963 ^ (569510600 ^ 504195678);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 525059752) {
            return this.asyncChunksHandler.getChunkAtAsync(world, i, i2, z, (byte) (1484114367 ^ (1536995690 ^ i3)), 1004736626);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 525059752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1023291842 ^ i3)) {
                int i4 = 951569700 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1011986950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1538993730 ^ i3)) {
                    break;
                }
            }
        }
        int i5 = 108538988 ^ i3;
        throw new IOException();
    }

    public CompletableFuture getChunkAtAsync(World world, int i, int i2, boolean z, boolean z2, int i3) {
        int i4 = 1846108978 ^ (2031215927 ^ 504195678);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1219453656) {
            int i5 = 93377010 ^ i4;
            return this.asyncChunksHandler.getChunkAtAsync(world, i, i2, z, z2, 1004736626);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1219453656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1311345113 ^ i4)) {
                int i6 = 1431215579 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1680469320 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1394490954 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 1345784240 ^ i4;
        throw new IllegalAccessException();
    }

    public CompletableFuture<Chunk> getChunkAtAsyncUrgently(World world, int i, int i2, boolean z) {
        int i3 = 1553051968 ^ (12889755 ^ 504195678);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 314813482) {
            return this.asyncChunksHandler.getChunkAtAsync(world, i, i2, z, (byte) (309835505 ^ (1345307509 ^ i3)), 1004736626);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1816283264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (274585056 ^ i3)) {
                int i4 = 1071029098 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 314813482 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1022040036 ^ i3)) {
                    break;
                }
            }
        }
        int i5 = 851665689 ^ i3;
        throw new RuntimeException();
    }

    public CompletableFuture teleport(Entity entity, Location location, PlayerTeleportEvent.TeleportCause teleportCause, int i) {
        int i2 = 1300820451 ^ (92581872 ^ 504195678);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1341545878) {
            int i3 = 301896605 ^ i2;
            return this.asyncTeleportHandler.teleportAsync(entity, location, teleportCause, 830934977);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1073561218 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (486138527 ^ i2)) {
                int i4 = 494049785 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1341545878 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (949738926 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 49371497 ^ i2;
        throw new IOException();
    }

    public boolean isChunkGenerated(World world, int i, int i2, int i3) {
        int i4 = 633932043 ^ (1095382141 ^ 504195678);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -730678973) {
            int i5 = 693123736 ^ i4;
            return this.isGeneratedHandler.isChunkGenerated(world, i, i2, 656726207);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -730678973 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1281406108 ^ i4)) {
                int i6 = 1008801227 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1628213886 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1035813838 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 287932944 ^ i4;
        throw new RuntimeException();
    }

    public BlockStateSnapshotResult getBlockState(Block block, boolean z, int i) {
        int i2 = 2120815082 ^ (884356329 ^ 504195678);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1500349718) {
            int i3 = 521660558 ^ i2;
            return this.blockStateSnapshotHandler.getBlockState(block, z, 1854645699);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1580023450 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1919341867 ^ i2)) {
                int i4 = 80007622 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1500349718 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1232976180 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 792530379 ^ i2;
        throw new IllegalAccessException();
    }

    public CompletableFuture getBedSpawnLocationAsync(Player player, boolean z, int i) {
        int i2 = 1202619649 ^ (694960133 ^ 504195678);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2038596909) {
            int i3 = 960250553 ^ i2;
            return this.bedSpawnLocationHandler.getBedSpawnLocationAsync(player, z, 721737693);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2038596909 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (884156644 ^ i2)) {
                int i4 = 1987499627 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1335848730 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1495059168 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1716210683 ^ i2;
        throw new IllegalAccessException();
    }

    public boolean isVersion$310209513(int i, int i2) {
        int i3 = 1989876274 ^ (1238031156 ^ 504195678);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 182803137) {
            return isVersion(i, (byte) (643165244 ^ (118048612 ^ i3)), 123614333);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 182803137 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (230858910 ^ i3)) {
                int i4 = 555714348 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 850354657 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2002056419 ^ i3)) {
                    break;
                }
            }
        }
        int i5 = 1455360378 ^ i3;
        throw new RuntimeException();
    }

    public boolean isVersion(int r6, int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: io.papermc.lib.environments.Environment.isVersion(int, int, int):boolean");
    }

    public int getMinecraftVersion(int i) {
        int i2 = 407260065 ^ (1410778642 ^ 504195678);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1829814422) {
            int i3 = 293520612 ^ i2;
            return this.minecraftVersion;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 421075018 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (676511773 ^ i2)) {
                int i4 = 2009489068 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1829814422 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1312366887 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1316228082 ^ i2;
        throw new IllegalAccessException();
    }

    public int getMinecraftPatchVersion(int i) {
        int i2 = 1823292709 ^ (891629195 ^ 504195678);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1009504130) {
            int i3 = 520246229 ^ i2;
            return this.minecraftPatchVersion;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1009504130 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1965139003 ^ i2)) {
                int i4 = 2071411791 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1002876630 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (915260953 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1700720378 ^ i2;
        throw new IllegalAccessException();
    }

    public int getMinecraftPreReleaseVersion(int i) {
        int i2 = 1036663405 ^ (2007780044 ^ 504195678);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1554458630) {
            int i3 = 1530498584 ^ i2;
            return this.minecraftPreReleaseVersion;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1554458630 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1310487707 ^ i2)) {
                int i4 = 1043156301 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2056562488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (148070899 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2015529746 ^ i2;
        throw new IllegalAccessException();
    }

    public boolean isSpigot(int i) {
        int i2 = 410540788 ^ (778149004 ^ 504195678);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1084580145) {
            return (byte) (193752545 ^ (597213639 ^ i2));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1550020360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (387478546 ^ i2)) {
                int i3 = 1037672766 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1084580145 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1963898460 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 1654742222 ^ i2;
        throw new RuntimeException();
    }

    public boolean isPaper(int i) {
        int i2 = 1053920113 ^ (1809366874 ^ 504195678);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1478685610) {
            return (byte) (636070205 ^ (1861089096 ^ i2));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1478685610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2087233201 ^ i2)) {
                int i3 = 577342575 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 793594345 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (728379029 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 586311352 ^ i2;
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
        wphywvinsr = knygeivvwpuanst();
        EdMct4tWSA = 1833464642 ^ new Random(-420681490085859629L).nextInt();
    }

    public static String tbmcakejgy(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ wphywvinsr[i3 % wphywvinsr.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] knygeivvwpuanst() {
        return new byte[]{20, 55, 75, 19, 14, 20, 113, 115, 103, 8, 61, 102, 29, 90, 24, 8, 39, 24, 83, 33, 78, 34, 90, 16, 13, 43, 103, 91, 125, 94, 58, 52, 46, 6, 115, Byte.MAX_VALUE, 42, 29, 7, 30, 18, 120, 94, 85, 52, 13, 115, 125, 52, 81, 92, 109, 87, 97, 94, 108, 40, 48, 109, 34, 64, 118, 82, 17, 78, 109, 117, 74, 122, 38, 46, 105, 82, 80, 50, 5, 123, 99, 17, 54, 72, 100, 103, 116, 91, 96, 86, 93, 84, 114, 38, 125};
    }

    private static int qyadxihpamfpmtov(int i, int i2) {
        return i ^ i2;
    }
}
