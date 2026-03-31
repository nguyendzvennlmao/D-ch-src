package com.kammoun.donutCore.core.utils;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.Location;

public class DonutLocation {
    private Location location;
    private final String world;
    private final double x;
    private final double y;
    private final double z;
    private final double yaw;
    private final double pitch;
    private static int RfVxugmscv = 0;
    private transient int QcnjHQloW4 = 1153540212;
    private static String[] nothing_to_see_here = new String[15];

    public DonutLocation(String str, double d, double d2, double d3, double d4, double d5, int i) {
        mkunldhxdeokdgzu(1983173174 ^ 92285807, 1362429194);
        int parseInt = 1433612992 ^ (842004771 ^ Integer.parseInt("1172125616"));
        this.QcnjHQloW4 = 1153540212 ^ RfVxugmscv;
        this.world = str;
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.yaw = d4;
        this.pitch = d5;
        int i2 = 233722420 ^ (2045212940 ^ (2051244642 ^ (1400971140 ^ (1460972992 ^ (147875870 ^ (14243826 ^ (1167868995 ^ parseInt)))))));
    }

    public DonutLocation(org.bukkit.Location r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.utils.DonutLocation.<init>(org.bukkit.Location, int):void");
    }

    public Location getLocation(int i) {
        int i2 = 1255732764 ^ (798169094 ^ 2011995511);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1791255704) {
            i2 = 825622516 ^ i2;
            if (this.location != null) {
                int i3 = 341887529 ^ i2;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 479487177) {
                i2 = 606193486 ^ i2;
                this.location = new Location(Bukkit.getWorld(this.world), this.x, this.y, this.z, (float) this.yaw, (float) this.pitch);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1033526968) {
                    int i4 = 809569639 ^ i2;
                }
            }
            return this.location;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 479487177 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1375957122 ^ i2)) {
                int i5 = 16257528 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1033526968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (256176772 ^ i2)) {
                    int i6 = 1079859787 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1080937087 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1196063343 ^ i2)) {
                        int i7 = 975946930 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1791255704 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (680066150 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i8 = 1246251870 ^ i2;
        throw new IOException();
    }

    public String serialize() {
        int i = 1963694900 ^ (536684592 ^ 2011995511);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -388926568) {
            int i2 = 1671801323 ^ i;
            String str = this.world;
            double d = this.x;
            double d2 = this.y;
            double d3 = this.z;
            double d4 = this.yaw;
            double d5 = this.pitch;
            return str + ";" + d + ";" + str + ";" + d2 + ";" + str + ";" + d3;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -168018749 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1238739163 ^ i)) {
                int i3 = 2116959510 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -388926568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (530642043 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 693417228 ^ i;
        throw new IOException();
    }

    public static DonutLocation deserialize(String str) {
        int i = 942102663 ^ (831286824 ^ 858602755);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -735027871) {
            i = 101326504 ^ i;
            String[] split = str.split(kluobuavjh(chwwcjbbvfztnrc(), jjmlrpnetjhryts(), i));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -463427551) {
                int i2 = 362184611 ^ i;
                return new DonutLocation(split[(byte) (689597095 ^ i2)], Double.parseDouble(split[(byte) (689597094 ^ i2)]), Double.parseDouble(split[(byte) (689597093 ^ i2)]), Double.parseDouble(split[(byte) (689597092 ^ i2)]), Double.parseDouble(split[(byte) (689597091 ^ i2)]), Double.parseDouble(split[(byte) (689597090 ^ i2)]), 1646237842);
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -735027871 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (301178879 ^ i)) {
                int i3 = 697126278 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1221809465 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1231290976 ^ i)) {
                    int i4 = 420986828 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -463427551 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1578092289 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 807083752 ^ i;
        throw new IOException();
    }

    @Generated
    public String getWorld(int i) {
        int i2 = 995172433 ^ (1003674509 ^ 2011995511);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1149553317) {
            int i3 = 1541153849 ^ i2;
            return this.world;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1704596625 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1225058848 ^ i2)) {
                int i4 = 1729594606 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1149553317 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (770806482 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 830268276 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public double getX(int i) {
        int i2 = 13655462 ^ (1188104401 ^ 2011995511);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1888600063) {
            int i3 = 1720747446 ^ i2;
            return this.x;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1142264398 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (564686000 ^ i2)) {
                int i4 = 515962051 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1888600063 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (761713847 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 18374287 ^ i2;
        throw new IOException();
    }

    @Generated
    public double getY(int i) {
        int i2 = 1573538925 ^ (1600650426 ^ 2011995511);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1442222845) {
            int i3 = 1037208984 ^ i2;
            return this.y;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1151140290 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1833602709 ^ i2)) {
                int i4 = 934177145 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1442222845 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1329044846 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 438016791 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public double getZ(int i) {
        int i2 = 2032687743 ^ (493892240 ^ 2011995511);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1649955648) {
            int i3 = 474944728 ^ i2;
            return this.z;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1649955648 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (683262486 ^ i2)) {
                int i4 = 1994189061 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2145323520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (744053733 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 894386955 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public double getYaw(int i) {
        int i2 = 253650966 ^ (1758148402 ^ 2011995511);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2117201256) {
            int i3 = 2128441689 ^ i2;
            return this.yaw;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2117201256 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1026612301 ^ i2)) {
                int i4 = 562102211 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1998952531 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1818933292 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 257605275 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public double getPitch(int i) {
        int i2 = 1021287491 ^ (1900857918 ^ 2011995511);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -738305967) {
            int i3 = 232514321 ^ i2;
            return this.pitch;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1121894183 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1647078984 ^ i2)) {
                int i4 = 1116928430 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -738305967 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1179623185 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 48622106 ^ i2;
        throw new RuntimeException();
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⢰⣧⣼⣯⠄⣸⣠⣶⣶⣦⣾⠄⠄⠄⠄⡀⠄⢀⣿⣿⠄⠄⠄⢸⡇⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿⠄";
        nothing_to_see_here[2] = "⠄⠄⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿⠄";
        nothing_to_see_here[3] = "⠄⠄⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⠄";
        nothing_to_see_here[4] = "⠄⢀⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋⣰";
        nothing_to_see_here[5] = "⠄⣼⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀⣤";
        nothing_to_see_here[6] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿⡗";
        nothing_to_see_here[7] = "⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄";
        nothing_to_see_here[8] = "⢸⣿⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄";
        nothing_to_see_here[9] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃⠄";
        nothing_to_see_here[10] = "⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄⠄";
        nothing_to_see_here[11] = "⠄⠄⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄⠄";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠈⠛⢿⣿⣿⣿⠁⠞⢿⣿⣿⡄⢿⣿⡇⣸⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄";
        nothing_to_see_here[13] = "⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣾⣦⡙⠻⣷⣾⣿⠃⠿⠋⠁⠄⠄⠄⠄⠄⢀⣠⣴";
        nothing_to_see_here[14] = "⣿⣿⣿⣶⣶⣮⣥⣒⠲⢮⣝⡿⣿⣿⡆⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⣠⣴⣿⣿⣿";
        RfVxugmscv = (-1157297255) ^ new Random(6747689391706392482L).nextInt();
    }

    public static String kluobuavjh(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] jjmlrpnetjhryts() {
        return new byte[]{56, 36, 17, 21, 116, 1, 55};
    }

    private static byte[] chwwcjbbvfztnrc() {
        return new byte[]{-9, -21, 32, 27};
    }

    private static int mkunldhxdeokdgzu(int i, int i2) {
        return i ^ i2;
    }
}
