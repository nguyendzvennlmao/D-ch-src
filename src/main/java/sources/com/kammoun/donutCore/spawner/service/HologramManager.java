package com.kammoun.donutCore.spawner.service;

import com.kammoun.donutCore.spawner.models.PlacedSpawner;
import de.oliver.fancyholograms.api.FancyHologramsPlugin;
import de.oliver.fancyholograms.api.data.TextHologramData;
import de.oliver.fancyholograms.api.hologram.Hologram;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import org.bukkit.Location;

public class HologramManager {
    private static int qPLKjl2Qnx = 0;
    private transient int Z5coWpTRTv = 1115407225;
    private static String rzoxvmvyce;
    private static String[] nothing_to_see_here = new String[15];

    public HologramManager() {
        int i = 762330624 ^ (1231211979 ^ 2101455864);
        int parseInt = 924309552 ^ (423429762 ^ Integer.parseInt("930711169"));
        this.Z5coWpTRTv = 1115407225 ^ qPLKjl2Qnx;
        earzvnkmfdievzco(parseInt, 706671981);
    }

    public static void createSpawnerHologram(PlacedSpawner placedSpawner, int i) {
        int i2 = 784787200 ^ (1090091888 ^ 25878540);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2108416995) {
            int i3 = 1305022131 ^ i2;
            Location location = placedSpawner.getLocation(389789417);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 333682297) {
                int i4 = 806180159 ^ i3;
                String name = location.getWorld().getName();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1819721856) {
                    i4 = 1617455094 ^ i4;
                    String str = "spawner_" + name + "_" + location.getBlockX() + "_" + location.getBlockY() + "_" + location.getBlockZ();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1865809869) {
                        i2 = 211743240 ^ i4;
                        removeHologram(str, 226019107);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -197291917) {
                            int i5 = 2127950848 ^ i2;
                            Location add = location.clone().add(0.5d, placedSpawner.getSpawnerType(1612695158).getHologramOffset(134151134), 0.5d);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 43135088) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 569349769 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1087187311 ^ i5)) {
                                        int i6 = 844894171 ^ i5;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 43135088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1720518029 ^ i5)) {
                                            break;
                                        }
                                    }
                                }
                                int i7 = 1513185435 ^ i5;
                                throw new IllegalAccessException("double");
                            }
                            int i8 = 1545300934 ^ i5;
                            ArrayList arrayList = new ArrayList(placedSpawner.getSpawnerType(1612695158).getHologram(1746543800));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -498504126) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -498504126 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (86781444 ^ i8)) {
                                        break;
                                    }
                                }
                                int i9 = 501446660 ^ i8;
                                throw new IllegalAccessException("double");
                            }
                            i3 = 1766819585 ^ i8;
                            TextHologramData textHologramData = new TextHologramData(str, add);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1472899511) {
                                int i10 = 92134264 ^ i3;
                                textHologramData.setPersistent((byte) (813396401 ^ i10));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -2082763383) {
                                    i10 = 1251777040 ^ i10;
                                    textHologramData.setText(arrayList);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -683713269) {
                                        int i11 = 236953347 ^ i10;
                                        textHologramData.setTextUpdateInterval((byte) (1962439862 ^ i11));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != -1480350445) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1480350445 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1627754014 ^ i11)) {
                                                    break;
                                                }
                                            }
                                            int i12 = 1090716749 ^ i11;
                                            throw new IllegalAccessException("double");
                                        }
                                        int i13 = 1937094580 ^ i11;
                                        de.oliver.fancyholograms.api.HologramManager hologramManager = FancyHologramsPlugin.get().getHologramManager();
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1013848240) {
                                            i13 = 721943540 ^ i13;
                                            Hologram create = hologramManager.create(textHologramData);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1683080977) {
                                                i10 = 828904839 ^ i13;
                                                hologramManager.addHologram(create);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -284071128) {
                                                    i4 = 985166321 ^ i10;
                                                    placedSpawner.setHologram(create, 497409280);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 986899617) {
                                                        int i14 = 57126469 ^ i4;
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1013848240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (614592832 ^ i13)) {
                                                int i15 = 1800790300 ^ i13;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1683080977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (662212149 ^ i13)) {
                                                    break;
                                                }
                                            }
                                        }
                                        int i16 = 1212404806 ^ i13;
                                        throw new RuntimeException("double");
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -683713269 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (169595660 ^ i10)) {
                                        int i17 = 1977084760 ^ i10;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -284071128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (2078027151 ^ i10)) {
                                            int i18 = 686601303 ^ i10;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -2082763383 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1671938286 ^ i10)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                int i19 = 508190355 ^ i10;
                                throw new IllegalAccessException();
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1865809869 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1827430377 ^ i4)) {
                        int i20 = 1230182489 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1819721856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1153474991 ^ i4)) {
                            int i21 = 771206067 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 986899617 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (853678150 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
                int i22 = 1166930201 ^ i4;
                throw new IllegalAccessException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 333682297 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1033908458 ^ i3)) {
                    int i23 = 1203325704 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1472899511 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1994685550 ^ i3)) {
                        break;
                    }
                }
            }
            int i24 = 23649327 ^ i3;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2108416995 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (644885103 ^ i2)) {
                int i25 = 690860272 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -197291917 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (649100724 ^ i2)) {
                    break;
                }
            }
        }
        int i26 = 1933271233 ^ i2;
        throw new IOException("double");
    }

    public static void removeHologram(String str, int i) {
        int i2 = 457735871 ^ (1983855030 ^ 25878540);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1743599659) {
            i2 = 394053609 ^ i2;
            de.oliver.fancyholograms.api.HologramManager hologramManager = FancyHologramsPlugin.get().getHologramManager();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -603256989) {
                i2 = 1878705288 ^ i2;
                Optional hologram = hologramManager.getHologram(str);
                Objects.requireNonNull(hologramManager);
                hologram.ifPresent(hologramManager::removeHologram);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1545788640) {
                    int i3 = 273652266 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1545788640 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1933276717 ^ i2)) {
                int i4 = 318991066 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -603256989 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (662919730 ^ i2)) {
                    int i5 = 1042780079 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 564261488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1698613199 ^ i2)) {
                        int i6 = 191366626 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1743599659 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (512781512 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 1502769828 ^ i2;
        throw new IllegalAccessException();
    }

    public static void removeHologram(PlacedSpawner placedSpawner) {
        int i = 184761045 ^ (990434726 ^ 25878540);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1945601031) {
            i = 45060417 ^ i;
            Location location = placedSpawner.getLocation(389789417);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1720389135) {
                i = 2068914615 ^ i;
                String name = location.getWorld().getName();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1140718666) {
                    i = 1979056402 ^ i;
                    String str = "spawner_" + name + "_" + location.getBlockX() + "_" + location.getBlockY() + "_" + location.getBlockZ();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -330435367) {
                        int i2 = 1955424244 ^ i;
                        removeHologram(str, 226019107);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1210502010) {
                            int i3 = 401949023 ^ i2;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1210502010 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (929330180 ^ i2)) {
                                break;
                            }
                        }
                        int i4 = 1901015299 ^ i2;
                        throw new RuntimeException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1945601031 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1612111668 ^ i)) {
                int i5 = 958186535 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1140718666 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (527230567 ^ i)) {
                    int i6 = 1327131065 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1720389135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (233997540 ^ i)) {
                        int i7 = 73863448 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -141770366 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1464290790 ^ i)) {
                            int i8 = 1562801825 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -330435367 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (699294781 ^ i)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i9 = 1840864509 ^ i;
        throw new IllegalAccessException();
    }

    public static void updateHologram(Hologram hologram, List list, int i) {
        int i2 = 1463111046 ^ (1043437990 ^ 25878540);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1148297571) {
            int i3 = 1144885200 ^ i2;
            if (hologram != null) {
                i2 = 1271234483 ^ i3;
                TextHologramData data = hologram.getData();
                if ((data instanceof TextHologramData) != (1735836751 ^ i2)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1001792123) {
                        i2 = 672932091 ^ i2;
                        TextHologramData textHologramData = data;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2069308834) {
                            i3 = 1689317552 ^ i2;
                            textHologramData.setText(list);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1590730785) {
                                int i4 = 485114489 ^ i3;
                                hologram.forceUpdate();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1182616599) {
                                    int i5 = 693914858 ^ i4;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1182616599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1957507272 ^ i4)) {
                                        int i6 = 1111618800 ^ i4;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -902904526 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (332448295 ^ i4)) {
                                            break;
                                        }
                                    }
                                }
                                int i7 = 970727160 ^ i4;
                                throw new RuntimeException("double");
                            }
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                        case 141982511:
                            int i8 = 2031804120 ^ i2;
                            return;
                        case 622683958:
                            return;
                        case 1069735867:
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1704845281) {
                int i9 = 1979081562 ^ i3;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1704845281 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (792997090 ^ i3)) {
                    int i10 = 419395965 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1590730785 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (623829648 ^ i3)) {
                        break;
                    }
                }
            }
            int i11 = 140512067 ^ i3;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1148297571 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1674175957 ^ i2)) {
                int i12 = 1128180600 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2069308834 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1014954745 ^ i2)) {
                    int i13 = 1527772566 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -211757896 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2003874134 ^ i2)) {
                        int i14 = 860428010 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1001792123 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1801690909 ^ i2)) {
                            int i15 = 1622562672 ^ i2;
                            throw new IllegalAccessException();
                        }
                    }
                }
            }
        }
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
        rzoxvmvyce = ByteBuffer.wrap(xhwtmmjxzqhqdoa()).asCharBuffer().toString();
        qPLKjl2Qnx = (-1582809697) ^ new Random(-2096362341902018040L).nextInt();
    }

    public static String kqehifychp(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = rzoxvmvyce.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] xhwtmmjxzqhqdoa() {
        return new byte[0];
    }

    private static int earzvnkmfdievzco(int i, int i2) {
        return i ^ i2;
    }
}
