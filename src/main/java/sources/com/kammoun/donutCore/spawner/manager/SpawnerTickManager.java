package com.kammoun.donutCore.spawner.manager;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.spawner.models.PlacedSpawner;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Random;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class SpawnerTickManager {
    private final SpawnerConfigManager configManager;
    private SchedulerUtil.Task task;
    private static int uVpPo3mTbF = 0;
    private transient int QMijSyNI52 = 266192481;
    private static byte[] oumysnrfsi;
    private static String[] nothing_to_see_here = new String[13];

    public SpawnerTickManager(SpawnerConfigManager spawnerConfigManager, int i) {
        int i2 = 2142772800 ^ (761301186 ^ 1831074056);
        int parseInt = 1986392947 ^ (1414706817 ^ Integer.parseInt("499919480"));
        this.QMijSyNI52 = 266192481 ^ uVpPo3mTbF;
        this.configManager = spawnerConfigManager;
        int i3 = 846717897 ^ (1209452382 ^ (1789451253 ^ parseInt));
    }

    public void start(int i) {
        int i2 = 2043072778 ^ (310578836 ^ 908082027);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -349231190) {
            i2 = 1940943501 ^ i2;
            this.task = SchedulerUtil.runTimer(() -> {
                int i3 = 251844260 ^ (224941576 ^ 908082027);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1571430855) {
                    int i4 = 2056556375 ^ i3;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1995547778) {
                        i3 = 520651002 ^ i4;
                        Iterator it = PlacedSpawnerManager.getInstance(1417101256).getAllSpawners(2004846093).iterator();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1900698798) {
                            i4 = 214086405 ^ i3;
                            while (it.hasNext() != (1561593711 ^ i4)) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -392152198) {
                                    i4 = 1036574274 ^ i4;
                                    PlacedSpawner placedSpawner = (PlacedSpawner) it.next();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 115788139) {
                                        int i5 = 2078600392 ^ i4;
                                        processSpawner(placedSpawner, currentTimeMillis, 1461241572);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -641618136) {
                                            i4 = 1395492999 ^ i5;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1085139730) {
                                                int i6 = 1482817236 ^ i4;
                                                try {
                                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6) == 266425156) {
                                                        throw new RuntimeException();
                                                    }
                                                    throw null;
                                                } catch (RuntimeException e) {
                                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                        case -2086527568:
                                                            i4 = 1718551164 ^ i6;
                                                            break;
                                                        case -1906690520:
                                                            i4 = 1741686543 ^ i6;
                                                            break;
                                                        default:
                                                            throw new IOException("Error in hash");
                                                    }
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1327886765) {
                                                    }
                                                    while (true) {
                                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                                            case 81049964:
                                                                i4 = 722421413 ^ i4;
                                                                break;
                                                            case 880231413:
                                                            case 1246543862:
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -641618136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (990572954 ^ i5)) {
                                                    int i7 = 2056116558 ^ i5;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1993913240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (15243646 ^ i5)) {
                                                        int i8 = 719626302 ^ i5;
                                                        throw new IllegalAccessException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1327886765 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (869372078 ^ i4)) {
                                        int i9 = 1588385205 ^ i4;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -392152198 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1618199043 ^ i4)) {
                                            int i10 = 333171343 ^ i4;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                }
                            }
                            int i11 = 1406079260 ^ i4;
                            return;
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1085139730 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1505674658 ^ i4)) {
                            int i12 = 174778789 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 115788139 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1473035775 ^ i4)) {
                                int i13 = 1110562652 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1995547778 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (478831422 ^ i4)) {
                                    int i14 = 205852395 ^ i4;
                                    throw new IllegalAccessException("double");
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1900698798 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1331469409 ^ i3)) {
                        int i15 = 1415374202 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2086527568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (961424921 ^ i3)) {
                            int i16 = 13105786 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1571430855 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (319393960 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
                int i17 = 1811027742 ^ i3;
                throw new RuntimeException();
            }, 20L, 20L, 2041710047);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1991029697) {
                int i3 = 230806630 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -349231190 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (671204478 ^ i2)) {
                int i4 = 216252350 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1991029697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (372779472 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1491000764 ^ i2;
        throw new IOException();
    }

    private void processSpawner(com.kammoun.donutCore.spawner.models.PlacedSpawner r6, long r7, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.manager.SpawnerTickManager.processSpawner(com.kammoun.donutCore.spawner.models.PlacedSpawner, long, int):void");
    }

    private boolean isPlayerNearby(Location location, int i, int i2) {
        int i3 = 515259772 ^ (1576447894 ^ 908082027);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1425716213) {
            i3 = 1520821327 ^ i3;
            if (location.getWorld() != null) {
                i3 = bapjixulitcwlnnk(i3, 984523548);
                double d = i * i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1419807088) {
                    i3 = 217290677 ^ i3;
                    Iterator it = location.getWorld().getPlayers().iterator();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -859583688) {
                        i3 = 481516695 ^ i3;
                        while (it.hasNext() != (86713840 ^ i3)) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 693710720) {
                                i3 = 689542400 ^ i3;
                                Player player = (Player) it.next();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1637189505) {
                                    i3 = 1807553297 ^ i3;
                                    if ((player.getLocation().distanceSquared(location) > d ? 1 : (player.getLocation().distanceSquared(location) == d ? 0 : -1)) > (1200595937 ^ i3)) {
                                        i3 = 939580154 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -58996517) {
                                            int i4 = 1420968393 ^ i3;
                                            try {
                                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4) != 63354155) {
                                                    throw null;
                                                }
                                                throw new IOException();
                                            } catch (IOException e) {
                                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                    case -710714719:
                                                        i3 = 668482760 ^ i4;
                                                        break;
                                                    case 1508492945:
                                                        i3 = 911306574 ^ i4;
                                                        break;
                                                    default:
                                                        throw new IOException("Error in hash");
                                                }
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -345850656) {
                                                }
                                                while (true) {
                                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                                        case 45145109:
                                                            break;
                                                        case 151123154:
                                                            i3 = 407335532 ^ i3;
                                                            break;
                                                        case 1278966449:
                                                    }
                                                }
                                            }
                                        }
                                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1014832906) {
                                        return (byte) (1974532346 ^ (843012890 ^ i3));
                                    }
                                }
                            }
                        }
                        return (byte) (111651372 ^ (59543516 ^ i3));
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1508492945 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1020758356 ^ i3)) {
                            int i5 = 1930090820 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -710714719 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (381390330 ^ i3)) {
                                int i6 = 285094183 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -859583688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1790867119 ^ i3)) {
                                    int i7 = 340444875 ^ i3;
                                    throw new IllegalAccessException("double");
                                }
                            }
                        }
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2116710001) {
                return (byte) (2083769513 ^ (1408663911 ^ i3));
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -509713077 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1245067293 ^ i3)) {
                int i8 = 1967169104 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2116710001 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1338224659 ^ i3)) {
                    int i9 = 1563654400 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1637189505 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1918234329 ^ i3)) {
                        int i10 = 79345416 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1383610405 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1605974216 ^ i3)) {
                            int i11 = 792603173 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -58996517 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (196827235 ^ i3)) {
                                int i12 = 7219264 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1014832906 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (600792780 ^ i3)) {
                                    int i13 = 1375948381 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 893210976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1857853588 ^ i3)) {
                                        int i14 = 270977835 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -345850656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1380451664 ^ i3)) {
                                            int i15 = 1601272824 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1425716213 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (324805842 ^ i3)) {
                                                int i16 = 1043687031 ^ i3;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 693710720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1543960243 ^ i3)) {
                                                    int i17 = 1999009656 ^ i3;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1419807088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1868954287 ^ i3)) {
                                                        int i18 = 284640550 ^ i3;
                                                        throw new RuntimeException();
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
            }
        }
    }

    private void updateHologram(com.kammoun.donutCore.spawner.models.PlacedSpawner r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.manager.SpawnerTickManager.updateHologram(com.kammoun.donutCore.spawner.models.PlacedSpawner, int):void");
    }

    public void stop(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.manager.SpawnerTickManager.stop(int):void");
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
        oumysnrfsi = iwmhehjgvuffmif();
        uVpPo3mTbF = (-890880690) ^ new Random(4200943455332293413L).nextInt();
    }

    public static String jnklqkoeyg(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ oumysnrfsi[i3 % oumysnrfsi.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] iwmhehjgvuffmif() {
        return new byte[]{54, 77, 75, 25, 90, 60, 101, 121, 57};
    }

    private static byte[] gilugfijoumrgmg() {
        return new byte[]{-15, -126, 123, 13, 108, 101, 84, 56, 15, 106, 125, 22, 40, 65, 12, 53, 76, 98, 15, 18, 123, 93, 108, 98, 84, 56, 15, 42};
    }

    private static byte[] bppymcgnyuorfmi() {
        return new byte[]{-7, -125, 123, 4, 106, 108, 85, 35, 1, 105, 124, 15, 41, 12, 12, 32, 73, 43};
    }

    private static byte[] basylrdgxuoyeos() {
        return new byte[]{-7, -124, 115, 11, 106, 114, 86, 61, 11, 34, 124, 28, 33, 0, 12, 60, 74, 120, 4, 26, 122, 91, 98, 46};
    }

    private static byte[] gdsyuttkhnfzphf() {
        return new byte[]{-2, -125, 115, 12, 104, 119, 84, 49, 15, 97, 124, 4, 41, 6, 4, 49, 65, 125, 0, 35, 115, 93, 104, 125, 84, 49, 15, 101, 124, 86};
    }

    private static int bapjixulitcwlnnk(int i, int i2) {
        return i ^ i2;
    }
}
