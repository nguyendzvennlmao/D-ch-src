package com.kammoun.donutCore.spawn.service;

import com.kammoun.donutCore.api.utils.location.SafeLocationFinder;
import com.kammoun.donutCore.spawn.model.RandomRespawnConfig;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;

public class RandomRespawnService {
    private final SafeLocationFinder locationFinder;
    private RandomRespawnConfig config;
    private static int cRXLxXICHM = 0;
    private transient int XxLdwvFKza = 42600739;
    private static String eyetgppzfc;
    private static String[] nothing_to_see_here = new String[15];

    public RandomRespawnService(Plugin plugin, RandomRespawnConfig randomRespawnConfig, int i) {
        int i2 = 695209181 ^ (986935735 ^ 912821150);
        int parseInt = 2006319082 ^ (655357748 ^ Integer.parseInt("1968307754"));
        this.XxLdwvFKza = 42600739 ^ cRXLxXICHM;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 154864563:
                    parseInt = 1042794912 ^ parseInt;
                    break;
                case 1123232402:
                case 1863375858:
                    break;
                case 2129437747:
                default:
                    throw new IOException();
            }
        }
        this.config = randomRespawnConfig;
        this.locationFinder = new SafeLocationFinder(plugin, randomRespawnConfig.getMaxAttempts(744578810), 53446966);
        int i3 = 694909523 ^ (2035426084 ^ (1138000075 ^ parseInt));
    }

    public void updateConfig(RandomRespawnConfig randomRespawnConfig, int i) {
        int i2 = 742948265 ^ (1736576826 ^ 724047419);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 118695235) {
            i2 = 1089903658 ^ i2;
            this.config = randomRespawnConfig;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 10994705) {
                int i3 = 676528124 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 10994705 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1094913182 ^ i2)) {
                int i4 = 214152187 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 118695235 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1468201059 ^ i2)) {
                    int i5 = 2025240384 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1110457328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (749012619 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 297524570 ^ i2;
        throw new RuntimeException();
    }

    public CompletableFuture findRespawnLocation(int i) {
        int i2 = 287002942 ^ (566807562 ^ 724047419);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -539207560) {
            i2 = 1102798449 ^ i2;
            SafeLocationFinder safeLocationFinder = this.locationFinder;
            RandomRespawnConfig randomRespawnConfig = this.config;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -771314702) {
                i2 = 828374736 ^ i2;
                World world = randomRespawnConfig.getWorld(195575363);
                RandomRespawnConfig randomRespawnConfig2 = this.config;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1492737395) {
                    i2 = 1637010720 ^ i2;
                    int minX = randomRespawnConfig2.getMinX(1643730960);
                    RandomRespawnConfig randomRespawnConfig3 = this.config;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1416574064) {
                        int i3 = 858519432 ^ i2;
                        int maxX = randomRespawnConfig3.getMaxX(1612078782);
                        RandomRespawnConfig randomRespawnConfig4 = this.config;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -852457423) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -852457423 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (602116716 ^ i3)) {
                                    break;
                                }
                            }
                            int i4 = 1829167738 ^ i3;
                            throw new IOException("double");
                        }
                        int i5 = 1860084275 ^ i3;
                        int minZ = randomRespawnConfig4.getMinZ(98049014);
                        RandomRespawnConfig randomRespawnConfig5 = this.config;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1144677974) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1144677974 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1806620469 ^ i5)) {
                                    break;
                                }
                            }
                            int i6 = 505332519 ^ i5;
                            throw new IOException("double");
                        }
                        int i7 = 1069003138 ^ i5;
                        int maxZ = randomRespawnConfig5.getMaxZ(1857598436);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1182275003) {
                            int i8 = 603893432 ^ i7;
                            return safeLocationFinder.findAsync(world, minX, maxX, minZ, maxZ, 489816567);
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1182275003 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1011150037 ^ i7)) {
                                int i9 = 479957871 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1502437498 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (533333762 ^ i7)) {
                                    break;
                                }
                            }
                        }
                        int i10 = 1567631206 ^ i7;
                        throw new IllegalAccessException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1492737395 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1185330471 ^ i2)) {
                int i11 = 732332902 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -539207560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (531714750 ^ i2)) {
                    int i12 = 1023761892 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1416574064 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (745152718 ^ i2)) {
                        int i13 = 1887531641 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -771314702 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1678058570 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i14 = 1819715832 ^ i2;
        throw new RuntimeException();
    }

    public CompletableFuture<Location> findRespawnLocation(World world) {
        int i = 113099132 ^ (505963731 ^ 724047419);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1645372255) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1645372255 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (879681346 ^ i)) {
                    break;
                }
            }
            int i2 = 266486176 ^ i;
            throw new IOException("double");
        }
        int i3 = 2144133484 ^ i;
        SafeLocationFinder safeLocationFinder = this.locationFinder;
        RandomRespawnConfig randomRespawnConfig = this.config;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1670027202) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1670027202 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1118193130 ^ i3)) {
                    break;
                }
            }
            int i4 = 907202594 ^ i3;
            throw new IOException("double");
        }
        int i5 = 256135061 ^ i3;
        int minX = randomRespawnConfig.getMinX(1643730960);
        RandomRespawnConfig randomRespawnConfig2 = this.config;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 430500714) {
            i5 = 278777206 ^ i5;
            int maxX = randomRespawnConfig2.getMaxX(1612078782);
            RandomRespawnConfig randomRespawnConfig3 = this.config;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1656323878) {
                int i6 = 1334528369 ^ i5;
                int minZ = randomRespawnConfig3.getMinZ(98049014);
                RandomRespawnConfig randomRespawnConfig4 = this.config;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -518206640) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -518206640 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1084846912 ^ i6)) {
                            break;
                        }
                    }
                    int i7 = 1372542349 ^ i6;
                    throw new IOException("double");
                }
                int i8 = 1018907460 ^ i6;
                int maxZ = randomRespawnConfig4.getMaxZ(1857598436);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 80122225) {
                    int i9 = 1736091805 ^ i8;
                    return safeLocationFinder.findAsync(world, minX, maxX, minZ, maxZ, 489816567);
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 80122225 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (138112701 ^ i8)) {
                        break;
                    }
                }
                int i10 = 489923693 ^ i8;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1656323878 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1020550500 ^ i5)) {
                int i11 = 1177707301 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 430500714 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1332859932 ^ i5)) {
                    int i12 = 1785181845 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1058264474 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1230685110 ^ i5)) {
                        break;
                    }
                }
            }
        }
        int i13 = 691424788 ^ i5;
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
        eyetgppzfc = ByteBuffer.wrap(hazygfwalcqcsvh()).asCharBuffer().toString();
        cRXLxXICHM = (-1786554489) ^ new Random(2492020017178650705L).nextInt();
    }

    public static String pxubvrhhle(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = eyetgppzfc.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] hazygfwalcqcsvh() {
        return new byte[0];
    }
}
