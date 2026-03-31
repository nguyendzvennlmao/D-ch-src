package com.kammoun.donutCore.rtp.model;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Set;
import lombok.Generated;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;

public class TeleportRegion {
    private final World world;
    private final int minX;
    private final int maxX;
    private final int minZ;
    private final int maxZ;
    private final int minY;
    private final int maxY;
    private final Random random;
    private Set<Material> blacklistedBlocks;
    private Set<Biome> blacklistedBiomes;

    private static int f7650D3DaLi9X = 0;
    private transient int IKGzosl5Mj = 599072112;
    private static String[] nothing_to_see_here = new String[18];

    public TeleportRegion(org.bukkit.World r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.model.TeleportRegion.<init>(org.bukkit.World, int, int, int, int, int, int, int):void");
    }

    public int getRandomX(int i) {
        int i2 = 771377277 ^ (2053539169 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1570230960) {
            return this.minX + this.random.nextInt((this.maxX - this.minX) + ((byte) (1709656257 ^ (1851110038 ^ i2))));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1570230960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1733048866 ^ i2)) {
                int i3 = 1147343566 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 792348163 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1347468890 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 725638499 ^ i2;
        throw new IllegalAccessException();
    }

    public int getRandomZ(int i) {
        int i2 = 1814722462 ^ (1350240186 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 66730867) {
            return this.minZ + this.random.nextInt((this.maxZ - this.minZ) + ((byte) (441111053 ^ (2050332002 ^ i2))));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 66730867 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1038498001 ^ i2)) {
                int i3 = 855099848 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -766078880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (634801926 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 1970559388 ^ i2;
        throw new IllegalAccessException();
    }

    public boolean isSafeLocationCached(org.bukkit.Chunk r6, int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.model.TeleportRegion.isSafeLocationCached(org.bukkit.Chunk, int, int, int):boolean");
    }

    public boolean isBlacklistedBiome(org.bukkit.Location r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.model.TeleportRegion.isBlacklistedBiome(org.bukkit.Location, int):boolean");
    }

    @Deprecated
    public Location findSafeYAt(int i, int i2, int i3) {
        int i4 = 1141244451 ^ (1160878841 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -389186430) {
            int i5 = 1616654262 ^ i4;
            int safeY = getSafeY(i, i2, 1649466075);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -366214863) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1106186681 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (343365959 ^ i5)) {
                        int i6 = 1747036057 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1286845662 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (380958137 ^ i5)) {
                            int i7 = 1943159820 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -366214863 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1996368855 ^ i5)) {
                                break;
                            }
                        }
                    }
                }
                int i8 = 628421645 ^ i5;
                throw new RuntimeException("double");
            }
            int i9 = 784644551 ^ i5;
            if (safeY != ((byte) ((-327236066) ^ i9))) {
                i4 = nqzdpfuogujixvwz(i9, 1653114293);
                Location location = new Location(this.world, i + 0.5d, safeY, i2 + 0.5d);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2008161629) {
                    i4 = 126848038 ^ i4;
                    if (this.blacklistedBiomes == null) {
                        nqzdpfuogujixvwz(i4, 1589367365);
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1271823469) {
                        i9 = 1666758042 ^ i4;
                        if (this.blacklistedBiomes.isEmpty() != (366904808 ^ i9)) {
                            int i10 = 1038313439 ^ i9;
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1359728832) {
                            i4 = 1732153979 ^ i9;
                            Biome biome = this.world.getBiome(location);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1761559397) {
                                int i11 = 483449308 ^ i4;
                                if (this.blacklistedBiomes.contains(biome) != (1848692303 ^ i11)) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1904636539) {
                                        int i12 = 6919033 ^ i11;
                                        return null;
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1904636539 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (132128662 ^ i11)) {
                                            break;
                                        }
                                    }
                                    int i13 = 1695839152 ^ i11;
                                    throw new IOException("double");
                                }
                                nqzdpfuogujixvwz(i11, 1175268472);
                            }
                        }
                    }
                    return location;
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1677078776) {
                int i14 = 1172877445 ^ i9;
                return null;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1359728832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (6782379 ^ i9)) {
                    int i15 = 648822506 ^ i9;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1677078776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (679680774 ^ i9)) {
                        break;
                    }
                }
            }
            int i16 = 1347650246 ^ i9;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2008161629 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (642889647 ^ i4)) {
                int i17 = 538150643 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1271823469 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (356703900 ^ i4)) {
                    int i18 = 455136610 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -389186430 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1593174293 ^ i4)) {
                        int i19 = 1751488782 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1925900723 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2022271496 ^ i4)) {
                            int i20 = 1951709082 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1761559397 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (155357340 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i21 = 584020067 ^ i4;
        throw new RuntimeException();
    }

    @Deprecated
    public Location getRandomLocation() {
        int i = 995770217 ^ (816937495 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1104440926) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1104440926 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1784384472 ^ i)) {
                    break;
                }
            }
            int i2 = 534358341 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 1784609306 ^ i;
        int randomX = getRandomX(1214411961);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -321109647) {
            i3 = 1782715677 ^ i3;
            int randomZ = getRandomZ(1412801902);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1093867110) {
                int i4 = 392872694 ^ i3;
                return findSafeYAt(randomX, randomZ, 1883002711);
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1093867110 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (69057506 ^ i3)) {
                int i5 = 2143574739 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -321109647 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (582911261 ^ i3)) {
                    int i6 = 1098558489 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 94043690 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (945181913 ^ i3)) {
                        break;
                    }
                }
            }
        }
        int i7 = 531269898 ^ i3;
        throw new RuntimeException();
    }

    @java.lang.Deprecated
    private int getSafeY(int r6, int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.model.TeleportRegion.getSafeY(int, int, int):int");
    }

    @java.lang.Deprecated
    private int searchTopDown(int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.model.TeleportRegion.searchTopDown(int, int, int):int");
    }

    @Deprecated
    private int searchBottomUp(int i, int i2, int i3) {
        int i4 = 1668525833 ^ (1945702935 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1696879266) {
            int i5 = 1505386490 ^ i4;
            int max = Math.max(this.minY, this.world.getMinHeight());
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1460228752) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1460228752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (494488748 ^ i5)) {
                        break;
                    }
                }
                int i6 = 1007468928 ^ i5;
                throw new RuntimeException("double");
            }
            i4 = 811824717 ^ i5;
            int min = Math.min(this.maxY, this.world.getMaxHeight() - ((byte) (628990944 ^ i4)));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 736960281) {
                i4 = 1416818862 ^ i4;
                int i7 = max;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2005230997) {
                    i4 = 91110370 ^ i4;
                    while (i7 <= min) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1559542405) {
                            i4 = 1911939597 ^ i4;
                            if (isSafeLocation(i, i7, i2, 1035377658) == (93620898 ^ i4)) {
                                int i8 = 1563174561 ^ i4;
                                i7 += 1488497666 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -976920550) {
                                    int nqzdpfuogujixvwz = nqzdpfuogujixvwz(i8, 1556101617);
                                    try {
                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(nqzdpfuogujixvwz) != 70322410) {
                                            throw null;
                                        }
                                        throw new IllegalAccessException();
                                    } catch (IllegalAccessException e) {
                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                            case -96137870:
                                                i4 = nqzdpfuogujixvwz(nqzdpfuogujixvwz, 1723967092);
                                                break;
                                            case 600092560:
                                                i4 = nqzdpfuogujixvwz(nqzdpfuogujixvwz, 1039241768);
                                                break;
                                            default:
                                                throw new RuntimeException("Error in hash");
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -867680559) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 600092560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (450855663 ^ i4)) {
                                                    int i9 = 1795445290 ^ i4;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -867680559 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2051186040 ^ i4)) {
                                                        int i10 = 417205625 ^ i4;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1915154337 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1251355494 ^ i4)) {
                                                            int i11 = 2028819147 ^ i4;
                                                            throw new RuntimeException("double");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        while (true) {
                                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                                case 59654076:
                                                    break;
                                                case 83137410:
                                                case 259606207:
                                                    i4 = 1307078517 ^ i4;
                                                    break;
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -976920550 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1962150170 ^ i8)) {
                                            int i12 = 2073802783 ^ i8;
                                            throw new IOException("double");
                                        }
                                    }
                                }
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 748967184) {
                                return i7 + ((byte) (776265205 ^ (735074134 ^ i4)));
                            }
                        }
                    }
                    return (byte) ((-146425728) ^ nqzdpfuogujixvwz(i4, 2094739408));
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1696879266 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (582290658 ^ i4)) {
                int i13 = 1689898479 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 748967184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1559486773 ^ i4)) {
                    int i14 = 1701938237 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 736960281 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1669873226 ^ i4)) {
                        int i15 = 937988390 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2005230997 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1886353311 ^ i4)) {
                            int i16 = 606785313 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1171405816 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1156296328 ^ i4)) {
                                int i17 = 157231598 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1559542405 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (738006675 ^ i4)) {
                                    int i18 = 1290057890 ^ i4;
                                    throw new IOException();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @java.lang.Deprecated
    private boolean isSafeLocation(int r6, int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.model.TeleportRegion.isSafeLocation(int, int, int, int):boolean");
    }

    private boolean isBlockBlacklisted(org.bukkit.Material r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.model.TeleportRegion.isBlockBlacklisted(org.bukkit.Material, int):boolean");
    }

    public boolean contains(org.bukkit.Location r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.model.TeleportRegion.contains(org.bukkit.Location):boolean");
    }

    @Generated
    public World getWorld(int i) {
        int i2 = 277621336 ^ (1055343246 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1842676509) {
            int i3 = 1853092995 ^ i2;
            return this.world;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -508208904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (924619935 ^ i2)) {
                int i4 = 896773369 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1842676509 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (406513760 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 819540266 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getMinX() {
        int i = 1663242806 ^ (818197105 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2118957160) {
            int i2 = 1154254722 ^ i;
            return this.minX;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2118957160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (535594411 ^ i)) {
                int i3 = 1043976010 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1479050362 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1636550735 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1108636121 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public int getMaxX() {
        int i = 2056994438 ^ (1075071587 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 889855355) {
            int i2 = 630057921 ^ i;
            return this.maxX;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 889855355 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (297721049 ^ i)) {
                int i3 = 1803496464 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 426066802 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1666338009 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1272056479 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public int getMinZ() {
        int i = 1303785169 ^ (2077873894 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1376680939) {
            int i2 = 1163837089 ^ i;
            return this.minZ;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2029752033 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (117329780 ^ i)) {
                int i3 = 1395530719 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1376680939 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1722837972 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1646587410 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public int getMaxZ() {
        int i = 369997157 ^ (1673192843 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1288387873) {
            int i2 = 1161690198 ^ i;
            return this.maxZ;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1696915347 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1206559255 ^ i)) {
                int i3 = 1756563626 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1288387873 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1432535 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1473683433 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public int getMinY(int i) {
        int i2 = 2053163554 ^ (1106376024 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1039679875) {
            int i3 = 1867434909 ^ i2;
            return this.minY;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1200495976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (742239069 ^ i2)) {
                int i4 = 2110223073 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1039679875 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (480918072 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1479472861 ^ i2;
        throw new IOException();
    }

    @Generated
    public int getMaxY(int i) {
        int i2 = 1183924869 ^ (2113937357 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 637227027) {
            int i3 = 1855302701 ^ i2;
            return this.maxY;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 637227027 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (929338199 ^ i2)) {
                int i4 = 1380864566 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1364603256 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1961058493 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1698778147 ^ i2;
        throw new IOException();
    }

    @Generated
    public Random getRandom() {
        int i = 30674793 ^ (1789432198 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1164620503) {
            int i2 = 979622529 ^ i;
            return this.random;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1164620503 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (166213660 ^ i)) {
                int i3 = 1109910437 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1770756384 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1039135589 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 540897600 ^ i;
        throw new IOException();
    }

    @Generated
    public Set getBlacklistedBlocks(int i) {
        int i2 = 1403528685 ^ (373663319 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -836917376) {
            int i3 = 820803267 ^ i2;
            return this.blacklistedBlocks;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -836917376 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (376100514 ^ i2)) {
                int i4 = 1298101697 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1232998809 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (805739731 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 844124933 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public Set<Biome> getBlacklistedBiomes() {
        int i = 908593914 ^ (1627154335 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1473433976) {
            int i2 = 145213356 ^ i;
            return this.blacklistedBiomes;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 317516824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1198666397 ^ i)) {
                int i3 = 1987218782 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1473433976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (543511664 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 632835132 ^ i;
        throw new IOException();
    }

    @Generated
    public void setBlacklistedBlocks(Set set, int i) {
        int i2 = 2115559500 ^ (826618818 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1684068832) {
            int i3 = 466862145 ^ i2;
            this.blacklistedBlocks = set;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1684068832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1577285969 ^ i2)) {
                int i4 = 312359589 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1157702696 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1856743956 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 829895947 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public void setBlacklistedBiomes(Set set, int i) {
        int i2 = 1024778406 ^ (926156554 ^ 1546532682);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1334409422) {
            int i3 = 205680034 ^ i2;
            this.blacklistedBiomes = set;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1334409422 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1252186277 ^ i2)) {
                int i4 = 879432255 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -765072862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1790226326 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1594567742 ^ i2;
        throw new IllegalAccessException();
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
        f7650D3DaLi9X = (-1223025583) ^ new Random(1342089638552944084L).nextInt();
    }

    public static String zdakqbxggt(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] gzefbuwsehgmmdp() {
        return new byte[]{53, 15, 70, 20};
    }

    private static byte[] aillnercjkufsbm() {
        return new byte[]{-6, -59, 119, 105, 5, 118, 115, 112, 6, Byte.MAX_VALUE};
    }

    private static byte[] mznwxpgoyvdkbig() {
        return new byte[]{-13, -61, 117, 102, 12, 114, 117, 117, 0, 114};
    }

    private static byte[] tobiecizstiktoo() {
        return new byte[]{-6, -64, 114, 108, 13, Byte.MAX_VALUE, 118, 103, 0, 115, 119, 101};
    }

    private static byte[] jivujrozrapkkyn() {
        return new byte[]{-3, -57, 113, 99, 0, 119, 113, 126, 0, 124};
    }

    private static byte[] qordyxmkgtnsxxw() {
        return new byte[]{-7, -61, 118, 111, 5, 124, 116, 113, 12, 124};
    }

    private static byte[] jkybokfegzpillr() {
        return new byte[]{-7, -60, 112, 105, 6, 123, 116, 112, 1, 124};
    }

    private static byte[] fcmbaypsfwwjqli() {
        return new byte[]{-6, -60, 116, 99, 0, 114, 115, 114, 7, 125};
    }

    private static byte[] dgicmvxnknktabz() {
        return new byte[]{-6, -58, 118, 98, 1, 112, 126, 118, 6, 123};
    }

    private static byte[] gpjdjdifatcfzgv() {
        return new byte[]{-6, -59, 114, 111, 7, 120, 117, 123, 4, 125};
    }

    private static int nqzdpfuogujixvwz(int i, int i2) {
        return i2 ^ i;
    }
}
