package com.kammoun.donutCore.rtpzone.manager;

import com.kammoun.donutCore.rtpzone.RtpZone;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import org.bukkit.Bukkit;
import org.bukkit.World;

public class RTPTeleportManager {
    private final RtpZone plugin;
    private final com.kammoun.donutCore.rtpzone.config.RTPConfigManager configManager;
    private final RTPPlayerManager playerManager;
    private final RTPSoundManager soundManager;
    private final Random random;
    private static int sRTVNv20M0 = 0;
    private transient int vxwK5GuRiJ = 247158871;
    private static String[] nothing_to_see_here = new String[17];

    public RTPTeleportManager(RtpZone rtpZone, com.kammoun.donutCore.rtpzone.config.RTPConfigManager rTPConfigManager, RTPPlayerManager rTPPlayerManager, RTPSoundManager rTPSoundManager, int i) {
        syvvtxsyiisahuuk(1700889220 ^ 1228752415, 1746955617);
        int parseInt = 253979776 ^ (1334364687 ^ Integer.parseInt("81203061"));
        this.vxwK5GuRiJ = 247158871 ^ sRTVNv20M0;
        this.random = new Random();
        this.plugin = rtpZone;
        this.configManager = rTPConfigManager;
        this.playerManager = rTPPlayerManager;
        this.soundManager = rTPSoundManager;
        int i2 = 77374044 ^ (79039716 ^ (43627111 ^ (531841920 ^ (559806062 ^ (170146648 ^ (1498457436 ^ parseInt))))));
    }

    public void teleportPlayers(int i) {
        int syvvtxsyiisahuuk;
        int i2 = 1282153751 ^ (112548542 ^ 1090418584);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1362723208) {
            int i3 = 392840547 ^ i2;
            Set playersInRegion = this.playerManager.getPlayersInRegion(1093481189);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -362042736) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 544339465 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1503440022 ^ i3)) {
                        int i4 = 432019437 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -362042736 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1930523870 ^ i3)) {
                            int i5 = 479367751 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1255522659 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (214093619 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
                int i6 = 712869095 ^ i3;
                throw new RuntimeException();
            }
            i2 = 1041603170 ^ i3;
            if (playersInRegion.isEmpty() == (593030960 ^ i2)) {
                syvvtxsyiisahuuk = syvvtxsyiisahuuk(i2, 647956829);
                CompletableFuture<Void> thenAccept = findSafeLocationAsync(2062585052).thenAccept(
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtpzone.manager.RTPTeleportManager.teleportPlayers(int):void");
            }

            private CompletableFuture findSafeLocationAsync(int i) {
                int i2 = 296232956 ^ (1737809476 ^ 1090418584);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1240174335) {
                    int i3 = 1282120165 ^ i2;
                    CompletableFuture completableFuture = new CompletableFuture();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -716653013) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -716653013 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1551766296 ^ i3)) {
                                break;
                            }
                        }
                        int i4 = 1544605085 ^ i3;
                        throw new RuntimeException("double");
                    }
                    i2 = 335634946 ^ i3;
                    AtomicInteger atomicInteger = new AtomicInteger((byte) (1856533959 ^ i2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1967369787) {
                        int i5 = 1618013543 ^ i2;
                        World world = Bukkit.getWorld(this.configManager.getRTPWorld(1939631654));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1992606976) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1992606976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (467879452 ^ i5)) {
                                    break;
                                }
                            }
                            int i6 = 466648798 ^ i5;
                            throw new IOException("double");
                        }
                        i2 = 1585007349 ^ i5;
                        if (world != null) {
                            int i7 = 1526629688 ^ i2;
                            tryNextLocation(world, completableFuture, atomicInteger, 1449746998);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1392163688) {
                                int i8 = 1701912046 ^ i7;
                                return completableFuture;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1392163688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (997739238 ^ i7)) {
                                    break;
                                }
                            }
                            int i9 = 968639245 ^ i7;
                            throw new RuntimeException("double");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2062642518) {
                            int i10 = 1598328827 ^ i2;
                            this.plugin.getLogger(583940502).severe("RTP world '" + this.configManager.getRTPWorld(1939631654) + "' not found!");
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 2133519728) {
                                int i11 = 1372547572 ^ i10;
                                return CompletableFuture.completedFuture(null);
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 2133519728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1395974989 ^ i10)) {
                                    break;
                                }
                            }
                            int i12 = 1023008349 ^ i10;
                            throw new IOException("double");
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2062642518 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (447092033 ^ i2)) {
                        int i13 = 1874958511 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1967369787 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1033989483 ^ i2)) {
                            int i14 = 314651823 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1240174335 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1301570868 ^ i2)) {
                                int i15 = 40439621 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -246308142 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (604486564 ^ i2)) {
                                    int i16 = 295122511 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2037535771 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2005755173 ^ i2)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                int i17 = 150135777 ^ i2;
                throw new IOException();
            }

            private void tryNextLocation(org.bukkit.World r8, java.util.concurrent.CompletableFuture r9, java.util.concurrent.atomic.AtomicInteger r10, int r11) {
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtpzone.manager.RTPTeleportManager.tryNextLocation(org.bukkit.World, java.util.concurrent.CompletableFuture, java.util.concurrent.atomic.AtomicInteger, int):void");
            }

            private int findSafeY(org.bukkit.World r9, int r10, int r11, int r12) {
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtpzone.manager.RTPTeleportManager.findSafeY(org.bukkit.World, int, int, int):int");
            }

            private int scanTopDown(World world, int i, int i2, int i3, int i4, int i5) {
                int i6 = 440002652 ^ (1580175315 ^ 1090418584);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 658538680) {
                    i6 = 1269393320 ^ i6;
                    int i7 = i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2047589882) {
                        i6 = 518398058 ^ i6;
                        while (i7 >= i4) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1925529942) {
                                i6 = 1872947613 ^ i6;
                                if (isSafe(world, i, i7, i2, 435167093) != (1040563784 ^ i6)) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -265424319) {
                                        return i7 + ((byte) (698541380 ^ (396843789 ^ i6)));
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -265424319 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (616468571 ^ i6)) {
                                            int i8 = 399916400 ^ i6;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -193736680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1123923147 ^ i6)) {
                                                int i9 = 904660240 ^ i6;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1562254187 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (250785985 ^ i6)) {
                                                    int i10 = 2104386038 ^ i6;
                                                    throw new RuntimeException("double");
                                                }
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6)) {
                                        case 137043630:
                                            i6 = 546030667 ^ i6;
                                            break;
                                        case 1249693528:
                                        case 2098687992:
                                            break;
                                    }
                                }
                                i7 += (-512653828) ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -193736680) {
                                    int syvvtxsyiisahuuk = syvvtxsyiisahuuk(i6, 1965930862);
                                    try {
                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(syvvtxsyiisahuuk) != 9249024) {
                                            throw null;
                                        }
                                        throw new IllegalAccessException();
                                    } catch (IllegalAccessException e) {
                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                            case -880481053:
                                                i6 = 1979230034 ^ syvvtxsyiisahuuk;
                                                break;
                                            case 1562254187:
                                                i6 = 1730935203 ^ syvvtxsyiisahuuk;
                                                break;
                                            default:
                                                throw new RuntimeException("Error in hash");
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1682036336) {
                                        }
                                        while (true) {
                                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6)) {
                                                case 138935655:
                                                    i6 = 1563389211 ^ i6;
                                                    break;
                                                case 1116212859:
                                                case 1798853418:
                                                    break;
                                                case 1854238120:
                                                default:
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -880481053 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (978061688 ^ i6)) {
                                                            int i11 = 2060626633 ^ i6;
                                                            throw new IOException("double");
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -265424319) {
                                            int i82 = 399916400 ^ i6;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -193736680) {
                                                continue;
                                            } else {
                                                int i92 = 904660240 ^ i6;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1562254187) {
                                                    int i102 = 2104386038 ^ i6;
                                                    throw new RuntimeException("double");
                                                }
                                                continue;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return (byte) ((-1327192854) ^ syvvtxsyiisahuuk(i6, 515640512));
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1293363753 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2087868064 ^ i6)) {
                            int i12 = 1804716112 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2047589882 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1762958148 ^ i6)) {
                                int i13 = 1904281586 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1682036336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1730916279 ^ i6)) {
                                    int i14 = 2063493796 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2027608234 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1710495295 ^ i6)) {
                                        int i15 = 1570423637 ^ i6;
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 658538680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1976872357 ^ i6)) {
                        int i16 = 1885932503 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1925529942 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1611694489 ^ i6)) {
                            int i17 = 475584930 ^ i6;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }

            private int scanBottomUp(World world, int i, int i2, int i3, int i4, int i5) {
                int i6 = 503822457 ^ (1387945434 ^ 1090418584);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1646039512) {
                    i6 = 2040404809 ^ i6;
                    int i7 = i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1360245869) {
                        int i8 = 78361304;
                        while (true) {
                            i6 = i8 ^ i6;
                            if (i7 > i4) {
                                return (byte) ((-845149484) ^ syvvtxsyiisahuuk(i6, 1126813313));
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1951277741) {
                                i6 = 1964222038 ^ i6;
                                if (isSafe(world, i, i7, i2, 435167093) == (73768444 ^ i6)) {
                                    i6 = syvvtxsyiisahuuk(i6, 1329312678);
                                    i7 += 1264463451 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1525773010) {
                                        int syvvtxsyiisahuuk = syvvtxsyiisahuuk(i6, 1523278936);
                                        try {
                                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(syvvtxsyiisahuuk) != 34680566) {
                                                throw null;
                                            }
                                            throw new IllegalAccessException();
                                        } catch (IllegalAccessException e) {
                                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                case -1934995440:
                                                    i6 = 1025445390 ^ syvvtxsyiisahuuk;
                                                    break;
                                                case -689666701:
                                                    i6 = 1448531106 ^ syvvtxsyiisahuuk;
                                                    break;
                                                default:
                                                    throw new IllegalAccessException("Error in hash");
                                            }
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1683103841) {
                                                i8 = 1576828838;
                                            }
                                        }
                                    }
                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 590147552) {
                                    return i7 + ((byte) (1211014244 ^ (1279984025 ^ i6)));
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1360245869 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1279897024 ^ i6)) {
                        int i9 = 2013794881 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1828738727 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1471608584 ^ i6)) {
                            int i10 = 650232406 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1951277741 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (853626072 ^ i6)) {
                                int i11 = 69376459 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1525773010 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2121032468 ^ i6)) {
                                    int i12 = 892316437 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1098179370 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (789925984 ^ i6)) {
                                        int i13 = 1485274738 ^ i6;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1683103841 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (412900753 ^ i6)) {
                                            int i14 = 856838 ^ i6;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1646039512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1960688580 ^ i6)) {
                                                int i15 = 398473246 ^ i6;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -689666701 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (124834881 ^ i6)) {
                                                    int i16 = 631779302 ^ i6;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 590147552 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1236319784 ^ i6)) {
                                                        int i17 = 50921624 ^ i6;
                                                        throw new IOException();
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

            private boolean isSafe(org.bukkit.World r6, int r7, int r8, int r9, int r10) {
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtpzone.manager.RTPTeleportManager.isSafe(org.bukkit.World, int, int, int, int):boolean");
            }

            private void performTeleport(org.bukkit.entity.Player r6, org.bukkit.Location r7, int r8) {
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtpzone.manager.RTPTeleportManager.performTeleport(org.bukkit.entity.Player, org.bukkit.Location, int):void");
            }

            static {
                nothing_to_see_here[0] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣠⣤⣶⣶⣶⣤⣄⣀⣀⠄⠄⠄⠄⠄";
                nothing_to_see_here[1] = "⠄⠄⠄⠄⠄⠄⠄⠄⣀⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣟⢿⣿⣿⣿⣶⣤⡀⠄";
                nothing_to_see_here[2] = "⠄⠄⠄⠄⠄⠄⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣜⠿⠿⣿⣿⣧⢓";
                nothing_to_see_here[3] = "⠄⠄⠄⠄⠄⡠⢛⣿⣿⣿⡟⣿⣿⣽⣋⠻⢻⣿⣿⣿⣿⡻⣧⡠⣭⣭⣿⡧";
                nothing_to_see_here[4] = "⠄⠄⠄⠄⠄⢠⣿⡟⣿⢻⠃⣻⣨⣻⠿⡀⣝⡿⣿⣿⣷⣜⣜⢿⣝⡿⡻⢔";
                nothing_to_see_here[5] = "⠄⠄⠄⠄⠄⢸⡟⣷⢿⢈⣚⣓⡡⣻⣿⣶⣬⣛⣓⣉⡻⢿⣎⠢⠻⣴⡾⠫";
                nothing_to_see_here[6] = "⠄⠄⠄⠄⠄⢸⠃⢹⡼⢸⣿⣿⣿⣦⣹⣿⣿⣿⠿⠿⠿⠷⣎⡼⠆⣿⠵⣫";
                nothing_to_see_here[7] = "⠄⠄⠄⠄⠄⠈⠄⠸⡟⡜⣩⡄⠄⣿⣿⣿⣿⣶⢀⢀⣿⣷⣿⣿⡐⡇⡄⣿";
                nothing_to_see_here[8] = "⠄⠄⠄⠄⠄⠄⠄⠄⠁⢶⢻⣧⣖⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⣇⡟⣇⣷⣿";
                nothing_to_see_here[9] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣆⣤⣽⣿⡿⠿⠿⣿⣿⣦⣴⡇⣿⢨⣾⣿⢹⢸";
                nothing_to_see_here[10] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⠊⡛⢿⣿⣿⣿⣿⡿⣫⢱⢺⡇⡏⣿⣿⣸⡼";
                nothing_to_see_here[11] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⡿⠄⣿⣷⣾⡍⣭⣶⣿⣿⡌⣼⣹⢱⠹⣿⣇⣧";
                nothing_to_see_here[12] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⣼⠁⣤⣭⣭⡌⢁⣼⣿⣿⣿⢹⡇⣭⣤⣶⣤⡝⡼";
                nothing_to_see_here[13] = "⠄⣀⠤⡀⠄⠄⠄⠄⠄⡏⣈⡻⡿⠃⢀⣾⣿⣿⣿⡿⡼⠁⣿⣿⣿⡿⢷⢸";
                nothing_to_see_here[14] = "⢰⣷⡧⡢⠄⠄⠄⠄⠠⢠⡛⠿⠄⠠⠬⠿⣿⠭⠭⢱⣇⣀⣭⡅⠶⣾⣷⣶";
                nothing_to_see_here[15] = "⠈⢿⣿⣧⠄⠄⠄⠄⢀⡛⠿⠄⠄⠄⠄⢠⠃⠄⠄⡜⠄⠄⣤⢀⣶⣮⡍⣴";
                nothing_to_see_here[16] = "⠄⠈⣿⣿⡀⠄⠄⠄⢩⣝⠃⠄⠄⢀⡄⡎⠄⠄⠄⠇⠄⠄⠅⣴⣶⣶⠄⣶";
                sRTVNv20M0 = (-2086500797) ^ new Random(7818184593510403024L).nextInt();
            }

            public static String uqfuawmnze(byte[] bArr, byte[] bArr2, int i) {
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

            private static byte[] ddkzhlmgknkojcw() {
                return new byte[]{89, 82, 69, 13, 16, 57, 118, 45, 117, 86, 119, 35, 126, 31, 12, 89, 82, Byte.MAX_VALUE, Byte.MAX_VALUE, 25, 47, 87, 30, 95, 120, 116, 106, 110, 117, 2, 83, 81, 88, 74, 15, 88, 59, 3, 65, 6, 73, 58, 21, 93, 44, 92, 45, 32, 104, 95, 8, 68, 2, 57, 60, 51, 102, 92, 115, 106, 111, 22, 15, 34, 108, 18, 45, 67, 18, 85, 30, 123, 103, 8, 23, 35, 35, 40, 99, 40, 21};
            }

            private static byte[] hdhbbigtznbhmcw() {
                return new byte[]{-106, -101, 119, 18, 41, 110, 64, 91, 76, 3, 70, 124, 76, 74, 53, 8, 100, 43, 70, 13, 30, 21, 44, 9, 65, 96, 92, 56, 76, 95, 98, 9, 106, 23, 54, 76, 13, 82, 120, 18, 120, Byte.MAX_VALUE, 39, 17, 21, 1, 27, 100, 81, 10, 57, 16, 48, 108, 5, 98, 80, 76, 74, 50, 94, 79, 61, 120, 85, 71, 27, 7, 43, 8, 47, 34, 85, 95, 46, 55, 21, 126, 90, 115, 36, 29, 96, 92, 52, 118, 15, 18, 20, 17, 103, 97, 17, 29, 38, 87, 111, 12, 70, 46, 40, 57, 101, 83, 102, 41, 66, 54, 87, 36, 51, 21, 99, 14, 115, 73, 110, Byte.MAX_VALUE, 58, 84};
            }

            private static byte[] cpnhbkselslnpxf() {
                return new byte[]{-97, -103, 118, 109, 33, 100, 71, 117, 67, 13, 67, 117, 78, 70, 61, 7, 107, 37, 71, 73, 28, 2, 47, 28, 73, 12, 92, 6, 65, 120};
            }

            private static byte[] isungchbtosbhwv() {
                return new byte[]{-106, -97, 124, Byte.MAX_VALUE, 34, 106, 79, 115, 77, 12, 70, 116, 71, 79, 62, 75, 107, 60, 71, 64, 30, 69, 39, 13, 74, 47, 83, 55, 77, 80, 98, 67, 97, 31, 61, 74, 2, 66, 121, 81, 120, 100, 44, 0, 30, 10, 20, 55, 80, 29, 57, 19, 59, 97, 14, 100, 95, 27, 75, 51, 94, 86, 54, 98, 94, 0, 20, 24, 42, 12, 47, 42, 94, 93, 37, 101, 26, 118, 91, 113, 36, 5, 107, 81, 63, 68, 0, 46, 21, 49, 103, 101, 26, 24, 45, 106, 96, 53, 71, 105, 40, 71, 110, 69, 109, 36, 77, 56, 86, 109};
            }

            private static byte[] qkjbyjbppsdoylh() {
                return new byte[]{-106, -98, 125, 122, 38, 64, 66, 77, 67, 42};
            }

            private static byte[] ymtlumhylqgkkvf() {
                return new byte[]{-106, -108, 114, 119, 41, 72, 79, 66, 66, 38};
            }

            private static byte[] wnnzsyyqaajoexq() {
                return new byte[]{-108, -99, 113, 114, 41, 76, 70, 94, 76, 40, 71, 86};
            }

            private static byte[] hxpfbiesizosfge() {
                return new byte[]{-106, -100, 114, 122, 37, 78, 68, 90, 76, 52, 70, 93, 73, 105, 57, 32};
            }

            private static int syvvtxsyiisahuuk(int i, int i2) {
                return i2 ^ i;
            }
        }
