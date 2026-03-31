package com.kammoun.donutCore.spawner.models;

import de.oliver.fancyholograms.api.hologram.Hologram;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import lombok.Generated;
import org.bukkit.Location;
import org.bukkit.Material;

public class PlacedSpawner {
    private final Location location;
    private final Spawner spawnerType;
    private UUID ownerUUID;
    private int currentXp;
    private int currentItems;
    private final Map<Material, Integer> storedItems;
    private long lastSpawnTime;
    private Hologram hologram;
    private int stackAmount;
    private UUID playerInStorage;
    private static int XNDTFT6uLY = 0;
    private transient int NdBF2CYa8h = 1356085924;
    private static String[] nothing_to_see_here = new String[15];

    public PlacedSpawner(org.bukkit.Location r5, org.bukkit.Location r6, com.kammoun.donutCore.spawner.models.Spawner r7, java.util.Map<org.bukkit.Material, java.lang.Integer> r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.models.PlacedSpawner.<init>(org.bukkit.Location, com.kammoun.donutCore.spawner.models.Spawner, java.util.Map, int, int):void");
    }

    public void addItems(Material material, int i, int i2) {
        int i3 = 676281725 ^ (454152069 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -422254720) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -422254720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (869453500 ^ i3)) {
                    break;
                }
            }
            int i4 = 156551992 ^ i3;
            throw new RuntimeException("double");
        }
        int i5 = 832151348 ^ i3;
        this.storedItems.merge(material, Integer.valueOf(i), (v0, v1) -> {
            return Integer.sum(v0, v1);
        });
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1779965473) {
            i5 = 1877089845 ^ i5;
            this.currentItems += i;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 352907146) {
                int i6 = 1038032772 ^ i5;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -68152405 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1512441685 ^ i5)) {
                int i7 = 730480169 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 352907146 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (701936331 ^ i5)) {
                    int i8 = 1507128592 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1779965473 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1791475988 ^ i5)) {
                        break;
                    }
                }
            }
        }
        int i9 = 1244305022 ^ i5;
        throw new IOException();
    }

    public void removeItems(Material material, int i, int i2) {
        int i3 = 489559583 ^ (1994476179 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 576295970) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 576295970 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2128799703 ^ i3)) {
                    break;
                }
            }
            int i4 = 2025489834 ^ i3;
            throw new RuntimeException("double");
        }
        int i5 = 1499076470 ^ i3;
        int intValue = this.storedItems.getOrDefault(material, Integer.valueOf((byte) (487663090 ^ i5))).intValue();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -393662576) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -393662576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1984609020 ^ i5)) {
                    break;
                }
            }
            int i6 = 1012091193 ^ i5;
            throw new IOException("double");
        }
        int i7 = 1740446489 ^ i5;
        int min = Math.min(intValue, i);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -714999973) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -714999973 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1363412866 ^ i7)) {
                    break;
                }
            }
            int i8 = 1934461757 ^ i7;
            throw new IllegalAccessException("double");
        }
        int i9 = 1697005567 ^ i7;
        if (min <= (529137940 ^ i9)) {
            cojfmxfjouctuqzd(i9, 1062211775);
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -61863776) {
            int i10 = 1164501068 ^ i9;
            int i11 = intValue - min;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -686355774) {
                i9 = 314927022 ^ i10;
                if (i11 != (1210550006 ^ i9)) {
                    int cojfmxfjouctuqzd = cojfmxfjouctuqzd(i9, 2088547509);
                    this.storedItems.put(material, Integer.valueOf(i11));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cojfmxfjouctuqzd) != -1562799591) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cojfmxfjouctuqzd) == -1562799591 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cojfmxfjouctuqzd) == (870650849 ^ cojfmxfjouctuqzd)) {
                                int i12 = 1574570647 ^ cojfmxfjouctuqzd;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cojfmxfjouctuqzd) == 114330969 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cojfmxfjouctuqzd) == (1772804866 ^ cojfmxfjouctuqzd)) {
                                    break;
                                }
                            }
                        }
                        int i13 = 1486208401 ^ cojfmxfjouctuqzd;
                        throw new IllegalAccessException("double");
                    }
                    i9 = 85161288 ^ cojfmxfjouctuqzd;
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1094465458) {
                    i10 = 333369599 ^ i9;
                    this.storedItems.remove(material);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -540364726) {
                        int cojfmxfjouctuqzd2 = cojfmxfjouctuqzd(i10, 611188759);
                        try {
                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(cojfmxfjouctuqzd2) == 120932685) {
                                throw new RuntimeException();
                            }
                            throw null;
                        } catch (RuntimeException e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case -502874109:
                                    i10 = cojfmxfjouctuqzd(cojfmxfjouctuqzd2, 1376029680);
                                    break;
                                case -54873869:
                                    i10 = 1372784110 ^ cojfmxfjouctuqzd2;
                                    break;
                                default:
                                    throw new IllegalAccessException("Error in hash");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1914871681) {
                                i9 = cojfmxfjouctuqzd(i10, 520885499);
                            }
                        }
                    }
                }
                this.currentItems = Math.max((int) ((byte) (826820363 ^ i9)), this.currentItems - min);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1975371687) {
                    int i14 = 294803104 ^ i9;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -540364726 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1419863494 ^ i10)) {
                    int i15 = 1558638894 ^ i10;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1914871681 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (680114116 ^ i10)) {
                        int i16 = 470087118 ^ i10;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -686355774 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (2072735280 ^ i10)) {
                            int i17 = 602955619 ^ i10;
                            throw new IOException();
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1975371687 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1275581486 ^ i9)) {
                int i18 = 574480685 ^ i9;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1094465458 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1690069454 ^ i9)) {
                    int i19 = 548619074 ^ i9;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -61863776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (558156638 ^ i9)) {
                        int i20 = 2117755569 ^ i9;
                        throw new IOException("double");
                    }
                }
            }
        }
    }

    public void addXp(int i, int i2) {
        int i3 = 585893378 ^ (276349281 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -393917608) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -393917608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1393790787 ^ i3)) {
                    break;
                }
            }
            int i4 = 933825269 ^ i3;
            throw new RuntimeException("double");
        }
        int i5 = 707626289 ^ i3;
        this.currentXp += i;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1175887151) {
            int i6 = 642271644 ^ i5;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1951715792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1507268154 ^ i5)) {
                int i7 = 231996520 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1175887151 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (128151457 ^ i5)) {
                    break;
                }
            }
        }
        int i8 = 1156152962 ^ i5;
        throw new IOException();
    }

    public int getItemAmount(Material material, int i) {
        int i2 = 2066717787 ^ (887884184 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 37740123) {
            return this.storedItems.getOrDefault(material, Integer.valueOf((byte) (652011788 ^ (1184568007 ^ i2)))).intValue();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 37740123 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1537016393 ^ i2)) {
                int i3 = 1385604510 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 921127009 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1273251503 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 506747090 ^ i2;
        throw new IOException();
    }

    public boolean canSpawn(int i) {
        byte b;
        int i2;
        int i3 = 494236540 ^ (501540640 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2024788641) {
            int i4 = 686381701 ^ i3;
            int maxItems = getSpawnerType(1612695158).getMaxItems(2145318236);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1071974024) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1071974024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (61953424 ^ i4)) {
                        break;
                    }
                }
                int i5 = 1921215064 ^ i4;
                throw new RuntimeException("double");
            }
            int i6 = 273652961 ^ i4;
            if (this.currentItems >= maxItems) {
                i3 = 2136384588 ^ i6;
                b = (byte) (1759877244 ^ i3);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1194116067) {
                    int i7 = 1843152395 ^ i3;
                    return b;
                }
            } else {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1113988736) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1113988736 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (455740550 ^ i6)) {
                            break;
                        }
                    }
                    int i8 = 1049187305 ^ i6;
                    throw new IllegalAccessException("double");
                }
                i3 = 1421957323 ^ i6;
                b = (byte) (1131570426 ^ i3);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 462628826) {
                    int i9 = 949714458 ^ i3;
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i9) != 1302522) {
                            throw null;
                        }
                        throw new IllegalAccessException();
                    } catch (IllegalAccessException e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case -548874485:
                                i2 = cojfmxfjouctuqzd(i9, 672541797);
                                break;
                            case 1188309211:
                                i2 = 992326559 ^ i9;
                                break;
                            default:
                                throw new IOException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1611025374) {
                            int i10 = 1455876339 ^ i2;
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1611025374 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1614066182 ^ i2)) {
                                    int i11 = 342506310 ^ i2;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -548874485 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (482712517 ^ i3)) {
                int i12 = 1169284785 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1194116067 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (64284751 ^ i3)) {
                    int i13 = 651371904 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2024788641 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (574797604 ^ i3)) {
                        int i14 = 316928438 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 462628826 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1779938800 ^ i3)) {
                            break;
                        }
                    }
                }
            }
        }
        int i15 = 1242481855 ^ i3;
        throw new RuntimeException();
    }

    public void clearStorage(int i) {
        int i2 = 75769757 ^ (1570877339 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1257295757) {
            i2 = 300328797 ^ i2;
            this.storedItems.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 976882331) {
                i2 = 282030565 ^ i2;
                this.currentItems = (byte) (2005414070 ^ i2);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1136556621) {
                    int i3 = 1456434279 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1136556621 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2098553132 ^ i2)) {
                int i4 = 777661106 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 976882331 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1356858203 ^ i2)) {
                    int i5 = 948826906 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1257295757 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (990311380 ^ i2)) {
                        int i6 = 98407935 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 171632265 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2041834190 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 1594967670 ^ i2;
        throw new IOException();
    }

    public void recalculateCurrentItems(int i) {
        int i2 = 1606336559 ^ (261410245 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -42787053) {
            i2 = 1465960318 ^ i2;
            this.currentItems = this.storedItems.values().stream().mapToInt((v0) -> {
                return v0.intValue();
            }).sum();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1182082273) {
                int i3 = 911278026 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1182082273 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (546260159 ^ i2)) {
                int i4 = 2060040811 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -185410896 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1647325074 ^ i2)) {
                    int i5 = 1757041942 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -42787053 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1170347117 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 164305664 ^ i2;
        throw new IOException();
    }

    public int getStorageFullnessPercentage(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.models.PlacedSpawner.getStorageFullnessPercentage(int):int");
    }

    public boolean playerInStorage(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.models.PlacedSpawner.playerInStorage(int):boolean");
    }

    public void removePlayerInStorage(int i) {
        int i2 = 817668088 ^ (2005648901 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1167703979) {
            i2 = 956230296 ^ i2;
            this.playerInStorage = null;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2106659990) {
                int i3 = 706982846 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2106659990 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (517358153 ^ i2)) {
                int i4 = 1407856878 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1167703979 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (64789739 ^ i2)) {
                    int i5 = 1206257589 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -747407717 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1751503595 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 94149251 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public Location getLocation(int i) {
        int i2 = 1078231399 ^ (1052931058 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2011896598) {
            int i3 = 1583186229 ^ i2;
            return this.location;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2011896598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1655206254 ^ i2)) {
                int i4 = 1447385531 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2063134016 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1563953960 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1870989852 ^ i2;
        throw new IOException();
    }

    @Generated
    public Spawner getSpawnerType(int i) {
        int i2 = 508684018 ^ (26252118 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2111251103) {
            int i3 = 989506846 ^ i2;
            return this.spawnerType;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1442690448 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (70375318 ^ i2)) {
                int i4 = 401272726 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2111251103 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1721664532 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1644550121 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public UUID getOwnerUUID(int i) {
        int i2 = 1553102494 ^ (1700298723 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1301070936) {
            int i3 = 2058636797 ^ i2;
            return this.ownerUUID;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1301070936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1971070005 ^ i2)) {
                int i4 = 1753887784 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1741771843 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1581450880 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1912694209 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getCurrentXp(int i) {
        int i2 = 608473162 ^ (357769788 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -190913552) {
            int i3 = 1345265755 ^ i2;
            return this.currentXp;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1978130730 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (489900670 ^ i2)) {
                int i4 = 748222429 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -190913552 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (289304428 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 785760450 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getCurrentItems(int i) {
        int i2 = 757732345 ^ (968571429 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -659931487) {
            int i3 = 1099657414 ^ i2;
            return this.currentItems;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -659931487 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2050445499 ^ i2)) {
                int i4 = 1507680730 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -722356077 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (345095939 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1626185569 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public Map getStoredItems(int i) {
        int i2 = 627801209 ^ (1252588889 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 37714242) {
            int i3 = 452044951 ^ i2;
            return this.storedItems;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -709739014 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (77978807 ^ i2)) {
                int i4 = 27135644 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 37714242 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1382729357 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1140419458 ^ i2;
        throw new IOException();
    }

    @Generated
    public long getLastSpawnTime(int i) {
        int i2 = 1738792785 ^ (421384255 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1982657742) {
            int i3 = 1590678383 ^ i2;
            return this.lastSpawnTime;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2142081096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1384635889 ^ i2)) {
                int i4 = 1176549615 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1982657742 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (622550074 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1997074846 ^ i2;
        throw new IOException();
    }

    @Generated
    public Hologram getHologram(int i) {
        int i2 = 1397688606 ^ (2113418665 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 161125880) {
            int i3 = 1566420511 ^ i2;
            return this.hologram;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 161125880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (963306317 ^ i2)) {
                int i4 = 534037856 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -478681854 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1904247614 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 797719052 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getStackAmount(int i) {
        int i2 = 2119946772 ^ (435950603 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1092436154) {
            int i3 = 40636153 ^ i2;
            return this.stackAmount;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1383937906 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (969184076 ^ i2)) {
                int i4 = 636552522 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1092436154 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (781545862 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2072460318 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public UUID getPlayerInStorage() {
        int i = 2118018306 ^ (700388023 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1071067669) {
            int i2 = 1579996718 ^ i;
            return this.playerInStorage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1071067669 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1720894900 ^ i)) {
                int i3 = 1196246068 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 827227289 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (824755884 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 413630581 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public void setOwnerUUID(UUID uuid, int i) {
        int i2 = 2006847280 ^ (1594104450 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 955506128) {
            int i3 = 1864399601 ^ i2;
            this.ownerUUID = uuid;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1106250331 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (844847111 ^ i2)) {
                int i4 = 1483793650 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 955506128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (591993716 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1006866169 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public void setCurrentXp(int i, int i2) {
        int i3 = 901129468 ^ (2027050757 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 385937291) {
            int i4 = 656520259 ^ i3;
            this.currentXp = i;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 385937291 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1894619841 ^ i3)) {
                int i5 = 1349077092 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 772623762 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (181289207 ^ i3)) {
                    break;
                }
            }
        }
        int i6 = 1525403557 ^ i3;
        throw new RuntimeException();
    }

    @Generated
    public void setCurrentItems(int i, int i2) {
        int i3 = 1121597554 ^ (1121549675 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2084133001) {
            int i4 = 1064510693 ^ i3;
            this.currentItems = i;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2084133001 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1285968865 ^ i3)) {
                int i5 = 258330172 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2019524704 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (619554235 ^ i3)) {
                    break;
                }
            }
        }
        int i6 = 1224033647 ^ i3;
        throw new IllegalAccessException();
    }

    @Generated
    public void setLastSpawnTime(long j, int i) {
        int i2 = 1704977815 ^ (66230551 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1330156610) {
            int i3 = 1827599722 ^ i2;
            this.lastSpawnTime = j;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1330156610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1608004568 ^ i2)) {
                int i4 = 628701282 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 675233553 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1686216746 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 610256538 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public void setHologram(Hologram hologram, int i) {
        int i2 = 1074817997 ^ (75151497 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1601563235) {
            int i3 = 1670594341 ^ i2;
            this.hologram = hologram;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1601563235 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1712119164 ^ i2)) {
                int i4 = 487352059 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1139544904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (343566936 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1249398966 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public void setStackAmount(int i, int i2) {
        int i3 = 1260857084 ^ (1421678507 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2131559687) {
            int i4 = 710209602 ^ i3;
            this.stackAmount = i;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -766150424 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1047240058 ^ i3)) {
                int i5 = 248615504 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2131559687 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1009791957 ^ i3)) {
                    break;
                }
            }
        }
        int i6 = 1114012784 ^ i3;
        throw new IllegalAccessException();
    }

    @Generated
    public void setPlayerInStorage(UUID uuid, int i) {
        int i2 = 1069663720 ^ (793231579 ^ 797208072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -132949543) {
            int i3 = 2139098008 ^ i2;
            this.playerInStorage = uuid;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -132949543 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1846816484 ^ i2)) {
                int i4 = 338290843 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 68355354 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (955170747 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 945285454 ^ i2;
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
        XNDTFT6uLY = 686383677 ^ new Random(-2731199348111776717L).nextInt();
    }

    public static String ijgzebmxej(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] gsooosqtggnhumx() {
        return new byte[]{20, 15, 22, 98, 2, 14, 103, 95, 43, 108, 20, 99, 86, 26, 125, 108, 19, 102, 92, 100, 4, 103, 107, 23, 84, 36, 85, 46, 15, 43, 36, 65, 38, 86, 3, 18, 73, 62, 25, 116, 69, 64, 116, 5, 4, 56, 85, 87, 103, 54, 4, 52, 24, 31, 18, 22, 48, 58, 8};
    }

    private static int cojfmxfjouctuqzd(int i, int i2) {
        return i2 ^ i;
    }
}
