package com.kammoun.donutCore.api.utils.location;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Klocation {
    private final Vector vector;
    private final String worldName;
    private float yaw;
    private float pitch;
    private static int OIdgsBXxnt = 0;
    private transient int ZB6f7efbjQ = 1328440331;
    private static byte[] wkrfizldwb;
    private static String[] nothing_to_see_here = new String[17];

    public Klocation(org.bukkit.util.Vector r5, java.lang.String r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.location.Klocation.<init>(org.bukkit.util.Vector, java.lang.String):void");
    }

    public Klocation(Vector vector, String str, float f, float f2, int i) {
        int i2 = 552690589 ^ 570960457;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 46774223:
                    int i3 = 1734994470 ^ i2;
                    break;
                case 155641955:
                case 848597160:
                default:
                    throw new IOException();
                case 1376387558:
                    break;
            }
        }
        int parseInt = 1032821772 ^ (1066684439 ^ Integer.parseInt("1737191401"));
        this.ZB6f7efbjQ = 1328440331 ^ OIdgsBXxnt;
        this.vector = vector;
        this.worldName = str;
        this.yaw = f;
        this.pitch = f2;
        int i4 = 1075517189 ^ (1629192307 ^ (2092394167 ^ (664008687 ^ (636524468 ^ (493690543 ^ parseInt)))));
    }

    public Klocation(Location location, int i) {
        int i2 = 885447798 ^ (724984617 ^ 409128053);
        int parseInt = 952071219 ^ (1487300848 ^ Integer.parseInt("1737191401"));
        this.ZB6f7efbjQ = 1328440331 ^ OIdgsBXxnt;
        int i3 = 393043532 ^ (185901096 ^ parseInt);
        if (location == null) {
            int i4 = 120540973 ^ i3;
            throw new IllegalArgumentException("Location cannot be null");
        }
        int i5 = 745012142 ^ i3;
        if (location.getWorld() == null) {
            int i6 = 1066208761 ^ i5;
            throw new IllegalArgumentException("Location world cannot be null");
        }
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i5)) {
                case 115604105:
                case 195039710:
                    i5 = 1761277295 ^ i5;
                    break;
                case 1319281735:
                    break;
                case 1368901859:
                default:
                    throw new RuntimeException();
            }
        }
        this.vector = new Vector(location.getX(), location.getY(), location.getZ());
        this.worldName = location.getWorld().getName();
        this.yaw = location.getYaw();
        this.pitch = location.getPitch();
        int i7 = 1678523124 ^ (1822760824 ^ (1493836605 ^ (443687623 ^ i5)));
    }

    public double getX(int i) {
        int i2 = 1621481061 ^ (1499467448 ^ 229026690);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1558471943) {
            int i3 = 1759117432 ^ i2;
            return this.vector.getX();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -439641798 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1774050709 ^ i2)) {
                int i4 = 983247342 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1558471943 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2021322845 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 483102831 ^ i2;
        throw new RuntimeException();
    }

    public double getY(int i) {
        int i2 = 1573073966 ^ (2034539624 ^ 229026690);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1225268769) {
            int i3 = 467194937 ^ i2;
            return this.vector.getY();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1748058135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (469956711 ^ i2)) {
                int i4 = 2129175814 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1225268769 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2049912659 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1302739943 ^ i2;
        throw new RuntimeException();
    }

    public double getZ(int i) {
        int i2 = 94240423 ^ (1722824575 ^ 229026690);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1952125651) {
            int i3 = 1952575470 ^ i2;
            return this.vector.getZ();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -682332768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (443554423 ^ i2)) {
                int i4 = 1386517992 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1952125651 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1386674645 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1320535079 ^ i2;
        throw new IOException();
    }

    @org.jetbrains.annotations.Nullable
    public org.bukkit.Location getLocation(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.location.Klocation.getLocation(int):org.bukkit.Location");
    }

    private java.lang.String getAvailableWorlds(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.location.Klocation.getAvailableWorlds(int):java.lang.String");
    }

    public static com.kammoun.donutCore.api.utils.location.Klocation fromString(java.lang.String r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.location.Klocation.fromString(java.lang.String, int):com.kammoun.donutCore.api.utils.location.Klocation");
    }

    public String toString() {
        int i = 1475997670 ^ (1552118894 ^ 229026690);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 920748112) {
            int i2 = 188994429 ^ i;
            String str = this.worldName;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1828658104) {
                int i3 = 1432059674 ^ i2;
                double x = getX(399861716);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -970661014) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -970661014 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (310030930 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 1901604600 ^ i3;
                    throw new IOException("double");
                }
                i2 = 1121714664 ^ i3;
                double y = getY(1975753800);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -792400856) {
                    int i5 = 1299334413 ^ i2;
                    double z = getZ(1858809803);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1151941566) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1151941566 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1559740781 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 81603697 ^ i5;
                        throw new IOException("double");
                    }
                    i = 1325538475 ^ i5;
                    getYaw(1230124394);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1018814184) {
                        int i7 = 1530626947 ^ i;
                        getPitch(562066967);
                        String str2 = str + "," + x + "," + str + "," + y + "," + str + "," + z;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 446315778) {
                            int i8 = 449866189 ^ i7;
                            return str2;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 446315778 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (865399176 ^ i7)) {
                                break;
                            }
                        }
                        int i9 = 1888728738 ^ i7;
                        throw new IOException("double");
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1828658104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1314121120 ^ i2)) {
                    int i10 = 1232212560 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -870747286 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (824410220 ^ i2)) {
                        int i11 = 1714739161 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -792400856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1340770037 ^ i2)) {
                            break;
                        }
                    }
                }
            }
            int i12 = 1223907437 ^ i2;
            throw new RuntimeException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1018814184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1290692971 ^ i)) {
                int i13 = 1980988011 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 920748112 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1932280547 ^ i)) {
                    break;
                }
            }
        }
        int i14 = 1255143409 ^ i;
        throw new IllegalAccessException("double");
    }

    @Nullable
    public static Klocation getLocationFromConfig(@NotNull ConfigurationSection configurationSection) {
        int i = 774402883 ^ (1540051503 ^ 1116262281);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1151371479) {
            int i2 = 782893861 ^ i;
            String string = configurationSection.getString(npequsawqe(paeqnrplrmkfraz(), i2), npequsawqe(qkafbwxicvgwacs(), i2));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -837849600) {
                i = 1815646104 ^ i2;
                if (Bukkit.getWorld(string) != null) {
                    int i3 = 1873486808 ^ i;
                    double d = configurationSection.getDouble(npequsawqe(rwdtleqsldhodme(), i3), 0.0d);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -762180608) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -762180608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1890162534 ^ i3)) {
                                break;
                            }
                        }
                        int i4 = 1508347817 ^ i3;
                        throw new RuntimeException("double");
                    }
                    int i5 = 222532626 ^ i3;
                    double d2 = configurationSection.getDouble(npequsawqe(rzlxpmjtdnoizmi(), i5), 0.0d);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1198609264) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1198609264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (367737127 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 477953864 ^ i5;
                        throw new IllegalAccessException("double");
                    }
                    int i7 = 2000317369 ^ i5;
                    double d3 = configurationSection.getDouble(npequsawqe(vmirnxvclbjgkqh(), i7), 0.0d);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 22933851) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 22933851 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (535751672 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 540492898 ^ i7;
                        throw new RuntimeException("double");
                    }
                    int i9 = 1134001487 ^ i7;
                    float f = (float) configurationSection.getDouble(npequsawqe(wzgbmtzrwcgrnsc(), i9));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 501619489) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 501619489 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1093101275 ^ i9)) {
                                break;
                            }
                        }
                        int i10 = 133995250 ^ i9;
                        throw new IllegalAccessException("double");
                    }
                    i2 = 800222762 ^ i9;
                    float f2 = (float) configurationSection.getDouble(npequsawqe(jylbwowsilyiaxv(), i2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1618307696) {
                        int i11 = 1487957603 ^ i2;
                        return new Klocation(new Vector(d, d2, d3), string, f, f2, 29665905);
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1345645885) {
                    i = 406934025 ^ i;
                    Bukkit.getLogger().warning("World '" + string + "' not found for location in config section: " + configurationSection.getCurrentPath());
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1841398411) {
                        int i12 = 465252770 ^ i;
                        Bukkit.getLogger().warning("Available worlds: " + ((String) Bukkit.getWorlds().stream().map((v0) -> {
                            return v0.getName();
                        }).reduce((str, str2) -> {
                            int i13 = 414941227 ^ (477240007 ^ 1116262281);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 839559978) {
                                int i14 = 190416572 ^ i13;
                                return str + ", " + str2;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1757847242 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (2056631956 ^ i13)) {
                                    int i15 = 1923233283 ^ i13;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 839559978 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (375977076 ^ i13)) {
                                        break;
                                    }
                                }
                            }
                            int i16 = 1577159797 ^ i13;
                            throw new IOException();
                        }).orElse(npequsawqe(uzqwhcxxtkaiwqn(), i12))));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1340600421) {
                            int i13 = 1663587190 ^ i12;
                            return null;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1340600421 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (388170608 ^ i12)) {
                                break;
                            }
                        }
                        int i14 = 2125238436 ^ i12;
                        throw new IOException("double");
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -837849600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1033562758 ^ i2)) {
                    int i15 = 1297130755 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1618307696 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1742904773 ^ i2)) {
                        break;
                    }
                }
            }
            int i16 = 1041035407 ^ i2;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1841398411 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2013457876 ^ i)) {
                int i17 = 828567591 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1151371479 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2102876517 ^ i)) {
                    int i18 = 735810462 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1345645885 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1189561043 ^ i)) {
                        int i19 = 1536528031 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1510598294 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1196327459 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i20 = 17807210 ^ i;
        throw new RuntimeException();
    }

    public Location toLocation(int i) {
        int i2 = 289202849 ^ (2104479711 ^ 229026690);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 262944739) {
            int i3 = 714919616 ^ i2;
            return getLocation(791337258);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1531593186 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1452768037 ^ i2)) {
                int i4 = 336564667 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 262944739 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (116654102 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 163327343 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public Vector getVector() {
        int i = 1366827790 ^ (1210901088 ^ 229026690);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1483516064) {
            int i2 = 1231376689 ^ i;
            return this.vector;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1483516064 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (485736035 ^ i)) {
                int i3 = 1827325636 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -323363094 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1715542795 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 751452751 ^ i;
        throw new IOException();
    }

    @Generated
    public String getWorldName(int i) {
        int i2 = 148881690 ^ (2066042987 ^ 229026690);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -220080229) {
            int i3 = 1477281294 ^ i2;
            return this.worldName;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 848160745 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (119718479 ^ i2)) {
                int i4 = 29235969 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -220080229 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1588049883 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 78907476 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public float getYaw(int i) {
        int i2 = 1906979002 ^ (1655034718 ^ 229026690);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -179682512) {
            int i3 = 1160774093 ^ i2;
            return this.yaw;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -179682512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1366906298 ^ i2)) {
                int i4 = 471040550 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -590721702 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (947650543 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 992470609 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public float getPitch(int i) {
        int i2 = 359411599 ^ (561157130 ^ 229026690);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -843022279) {
            int i3 = 1846045358 ^ i2;
            return this.pitch;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -843022279 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1653519041 ^ i2)) {
                int i4 = 1172966895 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1115433654 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1646459437 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1504337285 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public void setYaw(float f) {
        int i = 1437925766 ^ (569606187 ^ 229026690);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -821997189) {
            int i2 = 1107675007 ^ i;
            this.yaw = f;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -550540671 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (476904189 ^ i)) {
                int i3 = 393991101 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -821997189 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1227549680 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 52920583 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public void setPitch(float f) {
        int i = 2071390956 ^ (1429460632 ^ 229026690);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 521977777) {
            int i2 = 1980866082 ^ i;
            this.pitch = f;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1349497182 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (11432657 ^ i)) {
                int i3 = 1728105334 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 521977777 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (872297363 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 517822388 ^ i;
        throw new IOException();
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
        wkrfizldwb = anmqarkngpgneql();
        OIdgsBXxnt = (-228462889) ^ new Random(6948258553571868301L).nextInt();
    }

    public static String npequsawqe(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ wkrfizldwb[i3 % wkrfizldwb.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] anmqarkngpgneql() {
        return new byte[]{Byte.MAX_VALUE, 5, 100, 34, 108, 101, 23, 22, 66, 121, 42, 29, 81, 98, 50, 84, 79, 10, 56, 99, 75, 118, 124, 86};
    }

    private static byte[] slilmetjzclxatj() {
        return new byte[]{-72, -62, 87, 61};
    }

    private static byte[] rzlxpmjtdnoizmi() {
        return new byte[]{-78, -62, 83, 107};
    }

    private static byte[] vmirnxvclbjgkqh() {
        return new byte[]{-80, -52, 85, 107};
    }

    private static byte[] jylbwowsilyiaxv() {
        return new byte[]{-77, -54, 86, 96, 84, 52, 35, 84, 112, 40, 26, 71};
    }

    private static byte[] rwdtleqsldhodme() {
        return new byte[]{-75, -50, 85, 111};
    }

    private static byte[] wzgbmtzrwcgrnsc() {
        return new byte[]{-76, -61, 93, 110, 91, 55, 36, 85};
    }

    private static byte[] paeqnrplrmkfraz() {
        return new byte[]{-75, -55, 86, 100, 95, 51, 32, 85, 112, 33, 25, 75};
    }

    private static byte[] qkafbwxicvgwacs() {
        return new byte[]{-75, -55, 86, 100, 95, 51, 32, 85, 112, 33, 25, 75};
    }

    private static byte[] uzqwhcxxtkaiwqn() {
        return new byte[]{-80, -61, 83, 117, 85, 58, 47, 77, 123, 41};
    }

    private static byte[] cpgubfitymcpdqk() {
        return new byte[]{-80, -62, 80, 59, 84, 114};
    }

    private static int veqtsueahsbruxqz(int i, int i2) {
        return i2 ^ i;
    }
}
