package com.kammoun.donutCore.combat.utils;

import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.util.Location;
import com.sk89q.worldguard.LocalPlayer;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import com.sk89q.worldguard.protection.flags.Flags;
import com.sk89q.worldguard.protection.flags.StateFlag;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import com.sk89q.worldguard.protection.regions.RegionQuery;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.entity.Player;

public class WorldGuardUtil {
    private final boolean worldGuardEnabled;
    private static int AXx7DXxy0c = 0;

    private transient int f228Eo4fTsNhb = 1745713260;
    private static String[] nothing_to_see_here = new String[13];

    public WorldGuardUtil() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.utils.WorldGuardUtil.<init>():void");
    }

    public boolean isWorldGuardEnabled(int i) {
        int i2 = 23216524 ^ (1399257545 ^ 611127129);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1286752029) {
            int i3 = 2087652682 ^ i2;
            return this.worldGuardEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1345704624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1311650668 ^ i2)) {
                int i4 = 1777592732 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1286752029 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (206593028 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1855227962 ^ i2;
        throw new IOException();
    }

    public boolean isInProtectedRegion(org.bukkit.Location r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.utils.WorldGuardUtil.isInProtectedRegion(org.bukkit.Location, int):boolean");
    }

    public boolean canPvP(Player player) {
        int ktcpobosbkhejxun;
        int i = 314374294 ^ (1505220550 ^ 611127129);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2066808907) {
            int i2 = 476055704 ^ i;
            if (this.worldGuardEnabled != (1929783441 ^ i2)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1741601653) {
                    int i3 = 135133525 ^ i2;
                    if (player != null) {
                        int i4 = 507052004 ^ i3;
                        int i5 = i4;
                        try {
                            RegionContainer regionContainer = WorldGuard.getInstance().getPlatform().getRegionContainer();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 697921795) {
                                i2 = 1166623747 ^ i5;
                                RegionQuery createQuery = regionContainer.createQuery();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 97734937) {
                                    i5 = 391083080 ^ i2;
                                    Location adapt = BukkitAdapter.adapt(player.getLocation());
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1079446695) {
                                        i = 1145593952 ^ i5;
                                        LocalPlayer wrapPlayer = WorldGuardPlugin.inst().wrapPlayer(player);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1645481893) {
                                            int i6 = 1439045109 ^ i;
                                            StateFlag[] stateFlagArr = new StateFlag[(byte) (645622783 ^ i6)];
                                            stateFlagArr[(byte) (645622782 ^ i6)] = Flags.PVP;
                                            boolean testState = createQuery.testState(adapt, wrapPlayer, stateFlagArr);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 870014961) {
                                                i5 = 677248773 ^ i6;
                                                return testState;
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 870014961 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1939244647 ^ i6)) {
                                                    break;
                                                }
                                            }
                                            int i7 = 684454154 ^ i6;
                                            throw new IOException("double");
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 697921795 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1586665366 ^ i5)) {
                                    int i8 = 1248800946 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1079446695 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1869911607 ^ i5)) {
                                        break;
                                    }
                                }
                            }
                            int i9 = 511092070 ^ i5;
                            throw new IOException("double");
                        } catch (Exception e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case -1645481893:
                                    i2 = 2023127303 ^ i5;
                                    break;
                                case -1079446695:
                                    i2 = 1021188455 ^ i5;
                                    break;
                                case 97734937:
                                    i2 = 730950959 ^ i5;
                                    break;
                                case 697921795:
                                    i2 = 1847077164 ^ i5;
                                    break;
                                case 870014961:
                                    i2 = ktcpobosbkhejxun(i5, 760245490);
                                    break;
                                default:
                                    throw new IllegalAccessException("Error in hash");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1498953824) {
                                return (byte) (655334559 ^ (740596626 ^ i2));
                            }
                        }
                    } else {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -664891869) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -664891869 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (336953928 ^ i3)) {
                                    break;
                                }
                            }
                            int i10 = 643402290 ^ i3;
                            throw new IOException("double");
                        }
                        ktcpobosbkhejxun = 1759084987 ^ i3;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 97734937 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (3171518 ^ i2)) {
                        int i11 = 761173439 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1741601653 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (699046124 ^ i2)) {
                            int i12 = 1302699097 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1498953824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (420656721 ^ i2)) {
                                int i13 = 287860396 ^ i2;
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            } else {
                ktcpobosbkhejxun = ktcpobosbkhejxun(i2, 1624537326);
            }
            return (byte) (332550270 ^ ktcpobosbkhejxun);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2066808907 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (652862364 ^ i)) {
                int i14 = 1301098151 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1645481893 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (673791941 ^ i)) {
                    break;
                }
            }
        }
        int i15 = 1461669817 ^ i;
        throw new IllegalAccessException("double");
    }

    public boolean isInAnyRegion(org.bukkit.Location r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.utils.WorldGuardUtil.isInAnyRegion(org.bukkit.Location):boolean");
    }

    public boolean isInRegion(Player player, String str, int i) {
        int i2 = 1328448477 ^ (725136251 ^ 611127129);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 64618490) {
            int i3 = 685732543 ^ i2;
            return isInRegion(player.getLocation(), str, 304147294);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1159883267 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (910317295 ^ i2)) {
                int i4 = 174532978 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 64618490 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (827142291 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 684686960 ^ i2;
        throw new IOException();
    }

    public boolean isInRegion(org.bukkit.Location r6, java.lang.String r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.utils.WorldGuardUtil.isInRegion(org.bukkit.Location, java.lang.String, int):boolean");
    }

    public java.lang.String getRegionName(org.bukkit.Location r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.utils.WorldGuardUtil.getRegionName(org.bukkit.Location):java.lang.String");
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
        AXx7DXxy0c = 354859806 ^ new Random(-2327038818662170750L).nextInt();
    }

    public static String nmzpodivxq(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] sznudtdyytucjoj() {
        return new byte[]{48, 4, 82, 28, 44, 85, 73, 35, 15, 87, 109, 98, 92, 126, 72, 89, 111, 56, 79, 25, 76, 107, 53, 68, 125, 101, 61, 57, 72, 93, 37, 56, 114, 13, 6, 51, 71, 15, 116, 50, 82, 95, 71, 3, 52, 91, 45, 71, 44, 122, 54, 84, 121, 30, 112, 37, 14, 17, 4, 48, 84, 121, 101, 105, 40, 100, 76, 67, 81, 86, 35, 31, 115};
    }

    private static int ktcpobosbkhejxun(int i, int i2) {
        return i ^ i2;
    }
}
