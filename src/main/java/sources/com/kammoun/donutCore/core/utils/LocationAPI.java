package com.kammoun.donutCore.core.utils;

import com.kammoun.donutCore.core.CorePlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;

public class LocationAPI {
    private static final File file;
    private static final YamlConfiguration config;
    private static int ME6b7OM9FF = 0;
    private transient int nbUIWEAKFe = 1358460813;
    private static String[] nothing_to_see_here = new String[19];

    public LocationAPI() {
        pdujnpjoxqbhamuc(692190880 ^ 323336562, 743332605);
        int parseInt = 940481836 ^ (1610981370 ^ Integer.parseInt("1312890873"));
        this.nbUIWEAKFe = 1358460813 ^ ME6b7OM9FF;
        int i = 1501854201 ^ parseInt;
    }

    public static Location getLocation(String str) {
        int i;
        int i2 = 1286958961 ^ (1870618323 ^ 1813385788);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2128682226) {
            int i3 = 1047527438 ^ i2;
            if (config.getConfigurationSection(str) != null) {
                int i4 = 1432296498 ^ i3;
                String string = config.getString(str + ".world");
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 664403217) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 664403217 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (928586078 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 1437902926 ^ i4;
                    throw new IllegalAccessException("double");
                }
                int i6 = 1813679581 ^ i4;
                double d = config.getDouble(str + ".x");
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1196266490) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1196266490 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1277816621 ^ i6)) {
                            break;
                        }
                    }
                    int i7 = 1331822240 ^ i6;
                    throw new IOException("double");
                }
                int i8 = 1975773405 ^ i6;
                double d2 = config.getDouble(str + ".y");
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -380447471) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -380447471 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1994953558 ^ i8)) {
                            break;
                        }
                    }
                    int i9 = 996983699 ^ i8;
                    throw new IOException("double");
                }
                i = 1050341113 ^ i8;
                double d3 = config.getDouble(str + ".z");
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 495297240) {
                    int i10 = 1066887876 ^ i;
                    double d4 = config.getDouble(str + ".yaw");
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != -515967751) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1995125787 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (54890822 ^ i10)) {
                                int i11 = 784675652 ^ i10;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -515967751 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1371861954 ^ i10)) {
                                    break;
                                }
                            }
                        }
                        int i12 = 361108673 ^ i10;
                        throw new IOException("double");
                    }
                    i2 = 2066593461 ^ i10;
                    double d5 = config.getDouble(str + ".pitch");
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 944980306) {
                        int i13 = 976515551 ^ i2;
                        if (Bukkit.getWorld(string) != null) {
                            i13 = pdujnpjoxqbhamuc(i13, 326123877);
                            Location location = new Location(Bukkit.getWorld(string), d, d2, d3);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1920124035) {
                                int i14 = 2018829109 ^ i13;
                                location.setYaw((float) d4);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) != -1328161496) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1328161496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1447202527 ^ i14)) {
                                            break;
                                        }
                                    }
                                    int i15 = 1393345845 ^ i14;
                                    throw new RuntimeException("double");
                                }
                                int i16 = 37832492 ^ i14;
                                location.setPitch((float) d5);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -1562385336) {
                                    int i17 = 572058467 ^ i16;
                                    return location;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -1562385336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (991252105 ^ i16)) {
                                        break;
                                    }
                                }
                                int i18 = 618443262 ^ i16;
                                throw new RuntimeException("double");
                            }
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -370094165) {
                            i = 856806040 ^ i13;
                            CorePlugin.Inform(string + " &cDoesn't exists !", 584419703);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1904106346) {
                                int i19 = 552775150 ^ i;
                                return null;
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1920124035 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1412143861 ^ i13)) {
                                int i20 = 199778954 ^ i13;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -370094165 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1616556047 ^ i13)) {
                                    break;
                                }
                            }
                        }
                        int i21 = 1759181109 ^ i13;
                        throw new RuntimeException("double");
                    }
                }
            } else {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1923015549) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1923015549 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1503700259 ^ i3)) {
                            break;
                        }
                    }
                    int i22 = 1337259963 ^ i3;
                    throw new IOException("double");
                }
                i = 1585378701 ^ i3;
                CorePlugin.Inform(str + " &cIs not set !", 584419703);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2123804905) {
                    int i23 = 1436353856 ^ i;
                    return null;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2123804905 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (123395159 ^ i)) {
                    int i24 = 1489263286 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1904106346 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1967198016 ^ i)) {
                        int i25 = 735634888 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 495297240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (840940191 ^ i)) {
                            break;
                        }
                    }
                }
            }
            int i26 = 48520088 ^ i;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1307001007 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (189147029 ^ i2)) {
                int i27 = 1795292177 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 944980306 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (844162008 ^ i2)) {
                    int i28 = 709111911 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -763454741 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1415915110 ^ i2)) {
                        int i29 = 1184705789 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2128682226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (790033553 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i30 = 815750522 ^ i2;
        throw new IllegalAccessException();
    }

    public static java.lang.String getWorldNameForLocation(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.utils.LocationAPI.getWorldNameForLocation(java.lang.String):java.lang.String");
    }

    public static void setLocation(Location location, String str) {
        int i = 854255380 ^ (494029220 ^ 1813385788);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 477488226) {
            i = 1565831559 ^ i;
            String name = location.getWorld().getName();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -154113960) {
                i = 363102855 ^ i;
                double x = location.getX();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1542749280) {
                    i = 314224032 ^ i;
                    double y = location.getY();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -836693664) {
                        int i2 = 1075173879 ^ i;
                        double z = location.getZ();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -829432102) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -829432102 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (195395367 ^ i2)) {
                                    break;
                                }
                            }
                            int i3 = 805535707 ^ i2;
                            throw new RuntimeException("double");
                        }
                        int i4 = 958525763 ^ i2;
                        double yaw = location.getYaw();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 125850819) {
                            int i5 = 640604693 ^ i4;
                            double pitch = location.getPitch();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 922125418) {
                                i4 = 1814057133 ^ i5;
                                config.set(str + ".world", name);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1475608833) {
                                    i4 = 1676515207 ^ i4;
                                    config.set(str + ".x", Double.valueOf(x));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1217969466) {
                                        int i6 = 144023769 ^ i4;
                                        config.set(str + ".y", Double.valueOf(y));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 204848114) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 204848114 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (930050507 ^ i6)) {
                                                    break;
                                                }
                                            }
                                            int i7 = 1548348588 ^ i6;
                                            throw new IOException("double");
                                        }
                                        int i8 = 319226838 ^ i6;
                                        config.set(str + ".z", Double.valueOf(z));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -1811045054) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1941071800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (735707689 ^ i8)) {
                                                    int i9 = 987966682 ^ i8;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1811045054 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2086732028 ^ i8)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            int i10 = 1847771360 ^ i8;
                                            throw new IllegalAccessException("double");
                                        }
                                        int i11 = 925075558 ^ i8;
                                        config.set(str + ".yaw", Double.valueOf(yaw));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 756147827) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 756147827 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (265186132 ^ i11)) {
                                                    break;
                                                }
                                            }
                                            int i12 = 602353896 ^ i11;
                                            throw new RuntimeException("double");
                                        }
                                        int i13 = 2059618343 ^ i11;
                                        config.set(str + ".pitch", Double.valueOf(pitch));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -83122360) {
                                            ?? r0 = 2010884559 ^ i13;
                                            i = r0;
                                            try {
                                                config.save(file);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 1171712307) {
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1171712307 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2090407556 ^ i)) {
                                                            break;
                                                        }
                                                    }
                                                    int i14 = 1926880556 ^ i;
                                                    throw new IOException("double");
                                                }
                                                i = 1451897940 ^ i;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -242791535) {
                                                    int i15 = 1629126320 ^ i;
                                                    try {
                                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i15) == 140695853) {
                                                            throw new IllegalAccessException();
                                                        }
                                                        throw null;
                                                    } catch (IllegalAccessException e) {
                                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                            case -614024806:
                                                                i4 = 947776262 ^ i15;
                                                                break;
                                                            case -111886830:
                                                                i4 = 1010543607 ^ i15;
                                                                break;
                                                            default:
                                                                throw new IOException("Error in hash");
                                                        }
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 411689387) {
                                                            while (true) {
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 411689387 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (847522980 ^ i4)) {
                                                                    int i16 = 74361872 ^ i4;
                                                                    throw new IllegalAccessException("double");
                                                                }
                                                            }
                                                        }
                                                        while (true) {
                                                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                                                case 267454391:
                                                                    int i17 = 1835495618 ^ i4;
                                                                    return;
                                                                case 806995359:
                                                                    return;
                                                                case 1645145097:
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (IOException e2) {
                                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                                                    case 1171712307:
                                                        i13 = 1537836617 ^ i;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1734681735) {
                                                            i5 = 1853362039 ^ i13;
                                                            r0.printStackTrace();
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -346382142) {
                                                                int i18 = 1394415855 ^ i5;
                                                                return;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        throw new RuntimeException("Error in hash");
                                                }
                                            }
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -83122360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1459351537 ^ i13)) {
                                                int i19 = 1618279028 ^ i13;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1734681735 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (2141116411 ^ i13)) {
                                                    int i20 = 1488413733 ^ i13;
                                                    throw new IllegalAccessException("double");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -346382142 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (994034112 ^ i5)) {
                                    int i21 = 1126188647 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -614024806 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (499320053 ^ i5)) {
                                        int i22 = 1864767997 ^ i5;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 922125418 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1467761347 ^ i5)) {
                                            int i23 = 1021657390 ^ i5;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1475608833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (313694552 ^ i4)) {
                                int i24 = 1504286029 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1217969466 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (424510603 ^ i4)) {
                                    int i25 = 666309754 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 125850819 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1819454295 ^ i4)) {
                                        int i26 = 1673047651 ^ i4;
                                        throw new IOException("double");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -242791535 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (451273943 ^ i)) {
                int i27 = 583602171 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1542749280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2049776004 ^ i)) {
                    int i28 = 405612580 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -154113960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (561350430 ^ i)) {
                        int i29 = 747493738 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -836693664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1544434741 ^ i)) {
                            int i30 = 1417777205 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 477488226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (908972709 ^ i)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i31 = 173752285 ^ i;
        throw new IOException();
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠛⠉⠙⠛⠛⠛⠛⠻⢿⣿⣷⣤⡀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠈⢻⣿⣿⡄⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⠀⠀⠀⣸⣿⡏⠀⠀⠀⣠⣶⣾⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣄⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⢰⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣷⡄⠀";
        nothing_to_see_here[5] = "⠀⠀⣀⣤⣴⣶⣶⣿⡟⠀⠀⠀⢸⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⠀";
        nothing_to_see_here[6] = "⠀⢰⣿⡟⠋⠉⣹⣿⡇⠀⠀⠀⠘⣿⣿⣿⣿⣷⣦⣤⣤⣤⣶⣶⣶⣶⣿⣿⣿⠀";
        nothing_to_see_here[7] = "⠀⢸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀";
        nothing_to_see_here[8] = "⠀⣸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠉⠻⠿⣿⣿⣿⣿⡿⠿⠿⠛⢻⣿⡇⠀⠀";
        nothing_to_see_here[9] = "⠀⣿⣿⠁⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⠀⠀";
        nothing_to_see_here[10] = "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀";
        nothing_to_see_here[11] = "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀";
        nothing_to_see_here[12] = "⠀⢿⣿⡆⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀";
        nothing_to_see_here[13] = "⠀⠸⣿⣧⡀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠛⢿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⣰⣿⣿⣷⣶⣶⣶⣶⠶⠀⢠⣿⣿⠀⠀⠀";
        nothing_to_see_here[15] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⣽⣿⡏⠁⠀⠀⢸⣿⡇⠀⠀⠀";
        nothing_to_see_here[16] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⢹⣿⡆⠀⠀⠀⣸⣿⠇⠀⠀⠀";
        nothing_to_see_here[17] = "⠀⠀⠀⠀⠀⠀⠀⢿⣿⣦⣄⣀⣠⣴⣿⣿⠁⠀⠈⠻⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀";
        nothing_to_see_here[18] = "⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⠿⠿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        int parseInt = 1641434366 ^ (1654859164 ^ Integer.parseInt("1312890873"));
        ME6b7OM9FF = (-75149994) ^ new Random(-7661241325380883721L).nextInt();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1772336346) {
            parseInt = 1040271391 ^ parseInt;
            file = new File(String.valueOf(CorePlugin.getInstance(1013922268).getDataFolder(44993446)) + "/Locations", ybfqljjtps(vabuxkicdfckxzr(), bngssevzdslylzf(), parseInt));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1716915165) {
                int i = 263153662 ^ parseInt;
                config = YamlConfiguration.loadConfiguration(file);
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1772336346 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (203575735 ^ parseInt)) {
                int i2 = 1401039057 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1716915165 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1663087558 ^ parseInt)) {
                    break;
                }
            }
        }
        int i3 = 83411832 ^ parseInt;
        throw new IOException();
    }

    public static String ybfqljjtps(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] bngssevzdslylzf() {
        return new byte[]{97, 38, 107, 40, 120, 116, 83, 50, 11, 104, 123, 105, 4, 77, 71, 110, 99, 30, 110, 110, 64, 8, 109, 19, 112, 99, 26, 60, 51, 117, 82, 120, 15, 47, 17, 75, 27, 10, 83, 76, 25, 59, 55, 60, 125, 33, 84, 91, 2, 53, 44, 40, 35, 30, 15, 50, 22, 88, 56, 73, 99, 60, 106, 94, 59, 115, 13, 23, 102, 100, 113, 42, 32, 121, 18, 97, 62, 54, 115, 117, 68, 62, 88, 93, 1, 114, 26, 78, 54, 101, 101, 25, 48, 118, 115, 37, 126, 28, 126, 22, 52, 26, 14, 11, 28, 53, 116, 19, 7, 10, 49, 76};
    }

    private static byte[] vabuxkicdfckxzr() {
        return new byte[]{-82, -32, 88, 86, 64, 45, 106, 99, 62, 59, 74, 36, 55, 22, Byte.MAX_VALUE, 55, 90, 66, 91, 47, 113, 31, 94, 88, 72, 56, 35, 98};
    }

    private static int pdujnpjoxqbhamuc(int i, int i2) {
        return i ^ i2;
    }
}
