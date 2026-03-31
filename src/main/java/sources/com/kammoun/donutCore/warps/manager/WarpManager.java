package com.kammoun.donutCore.warps.manager;

import com.kammoun.donutCore.api.utils.location.Klocation;
import com.kammoun.donutCore.warps.Warp;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

public class WarpManager {
    private final Warp plugin;
    private final HashMap<String, Klocation> warpLocations;
    private static int IU7FyB9VTu = 0;
    private transient int cDp66WU50N = 1063715910;
    private static String[] nothing_to_see_here = new String[18];

    public WarpManager(Warp warp, int i) {
        int i2 = 307369657 ^ 839556076;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 246133132:
                    int i3 = 2117486059 ^ i2;
                    break;
                case 680642761:
                default:
                    throw new RuntimeException();
                case 1253225670:
                case 1727199096:
                    break;
            }
        }
        int parseInt = 1561772683 ^ (241163449 ^ Integer.parseInt("220714636"));
        this.cDp66WU50N = 1063715910 ^ IU7FyB9VTu;
        int dwgnpmxxexyidlpu = 578764112 ^ dwgnpmxxexyidlpu(parseInt, 70127275);
        this.warpLocations = new HashMap<>();
        this.plugin = warp;
        loadWarpLocationsFromConfig(846220393);
        int i4 = 891972830 ^ (1974863750 ^ (175537190 ^ dwgnpmxxexyidlpu));
    }

    public void setWarpLocation(String str, Location location, int i) {
        int i2 = 1360403727 ^ (950125180 ^ 1560876668);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1510586247) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1510586247 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1788797775 ^ i2)) {
                    break;
                }
            }
            int i3 = 666329491 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1801195728 ^ i2;
        FileConfiguration warpDataConfig = this.plugin.getWarpDataConfig(23162897);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -15282438) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -15282438 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2076036483 ^ i4)) {
                    break;
                }
            }
            int i5 = 1427515513 ^ i4;
            throw new IOException("double");
        }
        int i6 = 1279961556 ^ i4;
        String str2 = "warps." + str;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1656520616) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1656520616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1838325752 ^ i6)) {
                    break;
                }
            }
            int i7 = 1451372834 ^ i6;
            throw new IllegalAccessException("double");
        }
        int i8 = 1606483434 ^ i6;
        warpDataConfig.set(str2 + ".world", location.getWorld().getName());
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1665429258) {
            int i9 = 326446033 ^ i8;
            warpDataConfig.set(str2 + ".x", Double.valueOf(location.getX()));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -118673022) {
                int i10 = 530921032 ^ i9;
                warpDataConfig.set(str2 + ".y", Double.valueOf(location.getY()));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 96764866) {
                    i10 = 570405832 ^ i10;
                    warpDataConfig.set(str2 + ".z", Double.valueOf(location.getZ()));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 171515267) {
                        i9 = 1053787556 ^ i10;
                        warpDataConfig.set(str2 + ".yaw", Float.valueOf(location.getYaw()));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -62574430) {
                            i8 = 694744925 ^ i9;
                            warpDataConfig.set(str2 + ".pitch", Float.valueOf(location.getPitch()));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1224570293) {
                                i10 = 835807476 ^ i8;
                                this.plugin.saveWarpDataConfig(563093086);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 965332458) {
                                    i10 = 1560669206 ^ i10;
                                    this.warpLocations.put(str, new Klocation(location, 1538334150));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -777605800) {
                                        int i11 = 956280201 ^ i10;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 171515267 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (979494341 ^ i10)) {
                        int i12 = 1529651596 ^ i10;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -777605800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1722115530 ^ i10)) {
                            int i13 = 823650921 ^ i10;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 375111953 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (45723268 ^ i10)) {
                                int i14 = 1581388596 ^ i10;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 965332458 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (465117302 ^ i10)) {
                                    int i15 = 294794214 ^ i10;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 96764866 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (215597659 ^ i10)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                int i16 = 1748613172 ^ i10;
                throw new RuntimeException();
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -118673022 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (351069479 ^ i9)) {
                    int i17 = 1287168356 ^ i9;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -62574430 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (763423796 ^ i9)) {
                        break;
                    }
                }
            }
            int i18 = 377569679 ^ i9;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1224570293 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (693555821 ^ i8)) {
                int i19 = 1531381929 ^ i8;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1665429258 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1976174509 ^ i8)) {
                    break;
                }
            }
        }
        int i20 = 66587478 ^ i8;
        throw new IOException("double");
    }

    public Location getWarpLocation(String str, int i) {
        int i2 = 594007425 ^ (1187748739 ^ 1560876668);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -987053071) {
            int i3 = 1533936297 ^ i2;
            if (this.warpLocations.containsKey(str) == (1674271447 ^ i3)) {
                int i4 = 1382183288 ^ i3;
                return null;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 509269691) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 509269691 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (651439685 ^ i3)) {
                        break;
                    }
                }
                int i5 = 2109045198 ^ i3;
                throw new IOException("double");
            }
            int i6 = 1038012528 ^ i3;
            Klocation klocation = this.warpLocations.get(str);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -257141446) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -257141446 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (241182232 ^ i6)) {
                        break;
                    }
                }
                int i7 = 2038702052 ^ i6;
                throw new RuntimeException("double");
            }
            int i8 = 1822071188 ^ i6;
            Location location = klocation.getLocation(791337258);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -1804035687) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1804035687 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (870307077 ^ i8)) {
                        break;
                    }
                }
                int i9 = 202616484 ^ i8;
                throw new IOException("double");
            }
            i2 = 256072205 ^ i8;
            if (location != null) {
                dwgnpmxxexyidlpu(i2, 1517152035);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -295548431) {
                i2 = 1431083537 ^ i2;
                this.plugin.getLogger(583940502).warning("Could not get location for warp '" + str + "' - world '" + klocation.getWorldName(1398379797) + "' not found");
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1141283195) {
                    int i10 = 253852978 ^ i2;
                }
            }
            return location;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1924571783 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (382420369 ^ i2)) {
                int i11 = 720555250 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -987053071 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1705204984 ^ i2)) {
                    int i12 = 146882240 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1141283195 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (128216116 ^ i2)) {
                        int i13 = 1228763886 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -295548431 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (192721425 ^ i2)) {
                            int i14 = 671641793 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1024291051 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1226391850 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i15 = 1784490941 ^ i2;
        throw new IOException();
    }

    public void loadWarpLocationsFromConfig(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.warps.manager.WarpManager.loadWarpLocationsFromConfig(int):void");
    }

    @Generated
    public HashMap getWarpLocations(int i) {
        int i2 = 1220820982 ^ (409410471 ^ 1560876668);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1834062184) {
            int i3 = 316172241 ^ i2;
            return this.warpLocations;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1834062184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1055891330 ^ i2)) {
                int i4 = 1562032397 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -74272800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1650886528 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1997383128 ^ i2;
        throw new RuntimeException();
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
        IU7FyB9VTu = (-1352940754) ^ new Random(-5903130258209475426L).nextInt();
    }

    public static String rporsvlgov(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] gdnfqrfdvcxsuxm() {
        return new byte[]{66, 107, 2, 74, 45, 90, 59, 62, 45, 55, 41, 11, 118, 89, 46, 87, 44, 110, 119, 93, 104, 109, 25, 67, 31, 53, 54, 39, 96, 77, 98, 81, 123, 96, 58, 26, 55, 32, 47, 2, 36, 71, 94, 119, 24, 110, 69, 87, 96, 85, 37, 16, 113, 31, 64, 31, 57, 46, Byte.MAX_VALUE, 47, 25, 118, 37, 99};
    }

    private static byte[] wjkfgczsgffhdhq() {
        return new byte[]{-113, -93, 55, 42, 26, 4, 9, 98, 26, 119, 30, 30, 66, 25, 24, 10, 25, 43, 68, 6, 93, 61, 46, 85, 45, 110, 1, 117, 87, 21, 86, 3, 77, 114, 15, 90, 4, 118, 26, 69, 19, 81, 108, 49, 47, 60, 114, 20, 84, 7, 19, 70, 68, 8, 115, 65, 12, 116, 72, 57, 43, 32, 18, 63, 117, 48, 54, 27, 27, 1, 14, 110, 30, 32, 28, 93, 65, 26, 28, 22, 27, 125, 64, 12, 92, 53, 47, 20, 42, 113, 5, 126, 85, 94, 85, 19, 73, 117, 13, 76, 0, 109, 27, 92, 18, 6, 107, 52, 43, 120};
    }

    private static byte[] ufkplyivlhdqntk() {
        return new byte[]{-113, -92, 54, 14, 29, 8, 12, 121, 28, 116, 25, 76};
    }

    private static byte[] xypdrjvfzgyakxe() {
        return new byte[]{-115, -94, 50, 9, 26, 12, 2, 117, 25, Byte.MAX_VALUE, 24, 78};
    }

    private static byte[] fkjvytrpkyaguam() {
        return new byte[]{-115, -92, 59, 14, 25, 11, 2, 126, 26, 118, 24, 72};
    }

    private static int dwgnpmxxexyidlpu(int i, int i2) {
        return i2 ^ i;
    }
}
