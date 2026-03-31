package com.kammoun.donutCore.api.utils.items;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Random;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SkullHandler {
    private static final Gson GSON;
    private static int wp0wC8rHlA = 0;
    private transient int Cs71rwEHU3 = 222757046;
    private static String qeyxgrdvcn;
    private static String[] nothing_to_see_here = new String[15];

    public SkullHandler() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.SkullHandler.<init>():void");
    }

    @NotNull
    public static String getEncoded(@NotNull String str) {
        int i = 131329847 ^ (191423780 ^ 511059287);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1771472352) {
            int i2 = 854502544 ^ i;
            Base64.Encoder encoder = Base64.getEncoder();
            String neddyxqjsk = neddyxqjsk(gonnunvkmdvvuor(), i2);
            Object[] objArr = new Object[(byte) (539198421 ^ i2)];
            objArr[(byte) (539198420 ^ i2)] = "https://textures.minecraft.net/texture/" + str;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 18620065) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 18620065 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (243128335 ^ i2)) {
                        break;
                    }
                }
                int i3 = 1842582791 ^ i2;
                throw new IllegalAccessException("double");
            }
            int i4 = 1653015673 ^ i2;
            String format = String.format(neddyxqjsk, objArr);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 354696554) {
                i = 1468237714 ^ i4;
                byte[] bytes = format.getBytes();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1455947272) {
                    i4 = 1537434305 ^ i;
                    byte[] encode = encoder.encode(bytes);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1948456946) {
                        int i5 = 155045077 ^ i4;
                        return new String(encode);
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 354696554 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (912602014 ^ i4)) {
                    int i6 = 506527507 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1948456946 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (516527361 ^ i4)) {
                        break;
                    }
                }
            }
            int i7 = 2129459464 ^ i4;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1036874074 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (790973489 ^ i)) {
                int i8 = 722062442 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1455947272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2052013222 ^ i)) {
                    int i9 = 724011383 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1771472352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1134039990 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i10 = 1695983893 ^ i;
        throw new IllegalAccessException();
    }

    private static org.bukkit.inventory.ItemStack getHead(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.SkullHandler.getHead(int):org.bukkit.inventory.ItemStack");
    }

    @org.jetbrains.annotations.NotNull
    public static org.bukkit.inventory.ItemStack getSkullByBase64EncodedTextureUrl(@org.jetbrains.annotations.NotNull org.bukkit.plugin.java.JavaPlugin r5, @org.jetbrains.annotations.NotNull java.lang.String r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.SkullHandler.getSkullByBase64EncodedTextureUrl(org.bukkit.plugin.java.JavaPlugin, java.lang.String, int):org.bukkit.inventory.ItemStack");
    }

    public static java.lang.String getTextureFromSkull(org.bukkit.plugin.java.JavaPlugin r5, org.bukkit.inventory.ItemStack r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.SkullHandler.getTextureFromSkull(org.bukkit.plugin.java.JavaPlugin, org.bukkit.inventory.ItemStack):java.lang.String");
    }

    @org.jetbrains.annotations.NotNull
    public static org.bukkit.inventory.ItemStack getSkullByName(@org.jetbrains.annotations.NotNull java.lang.String r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.SkullHandler.getSkullByName(java.lang.String, int):org.bukkit.inventory.ItemStack");
    }

    public static java.lang.String getSkullOwner(org.bukkit.inventory.ItemStack r4) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.SkullHandler.getSkullOwner(org.bukkit.inventory.ItemStack):java.lang.String");
    }

    @NotNull
    private static GameProfile getGameProfile(@NotNull String str, int i) {
        int i2 = 1010628366 ^ (1653722550 ^ 511059287);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 114884474) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 114884474 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (410525860 ^ i2)) {
                    break;
                }
            }
            int i3 = 1206010581 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 349683086 ^ i2;
        GameProfile gameProfile = new GameProfile(UUID.randomUUID(), neddyxqjsk(bdohnjsirtdhlnd(), i4));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1603988726) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1603988726 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1380419873 ^ i4)) {
                    int i5 = 865278057 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 929540625 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (747283346 ^ i4)) {
                        break;
                    }
                }
            }
            int i6 = 1687170333 ^ i4;
            throw new IllegalAccessException();
        }
        int i7 = 705212875 ^ i4;
        gameProfile.getProperties().put(neddyxqjsk(wtwvowilnwpctfc(), i7), new Property(neddyxqjsk(ljquobgwcgtqlqc(), i7), str));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -266298029) {
            int i8 = 1491658472 ^ i7;
            return gameProfile;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -266298029 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1310155315 ^ i7)) {
                break;
            }
        }
        int i9 = 544609919 ^ i7;
        throw new IllegalAccessException("double");
    }

    @org.jetbrains.annotations.NotNull
    private static org.bukkit.profile.PlayerProfile getPlayerProfile(@org.jetbrains.annotations.NotNull org.bukkit.plugin.java.JavaPlugin r5, @org.jetbrains.annotations.NotNull java.lang.String r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.SkullHandler.getPlayerProfile(org.bukkit.plugin.java.JavaPlugin, java.lang.String, int):org.bukkit.profile.PlayerProfile");
    }

    @Nullable
    public static String decodeSkinUrl(@NotNull String str, int i) {
        String asString;
        int i2;
        int i3 = 1928071979 ^ (1777041260 ^ 511059287);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 730499200) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 730499200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (594158193 ^ i3)) {
                    break;
                }
            }
            int i4 = 1614621074 ^ i3;
            throw new RuntimeException("double");
        }
        int i5 = 1934523323 ^ i3;
        String str2 = new String(Base64.getDecoder().decode(str));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1309059749) {
            int i6 = 2076753900 ^ i5;
            JsonObject jsonObject = (JsonObject) GSON.fromJson(str2, JsonObject.class);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1874635320) {
                int i7 = 1520659706 ^ i6;
                JsonElement jsonElement = jsonObject.get(neddyxqjsk(qmexyadaowfonvw(), i7));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1163407894) {
                    int i8 = 877081164 ^ i7;
                    if (jsonElement == null) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 413032331) {
                            int i9 = 2118156135 ^ i8;
                            return null;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 413032331 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1183406944 ^ i8)) {
                                break;
                            }
                        }
                        int i10 = 1155675061 ^ i8;
                        throw new IllegalAccessException("double");
                    }
                    int i11 = 774869662 ^ i8;
                    JsonElement jsonElement2 = jsonElement.getAsJsonObject().get(neddyxqjsk(ftjavtznpengxga(), i11));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 1776470906) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1776470906 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1561002604 ^ i11)) {
                                break;
                            }
                        }
                        int i12 = 271761557 ^ i11;
                        throw new IOException("double");
                    }
                    i6 = 719760542 ^ i11;
                    if (jsonElement2 != null) {
                        i7 = vfbdgkzalpgmgkzw(i6, 1616057982);
                        JsonElement jsonElement3 = jsonElement2.getAsJsonObject().get(neddyxqjsk(pitfurgobjtvtmc(), i7));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1011817592) {
                            i5 = 1046658590 ^ i7;
                            if (jsonElement3 != null) {
                                int vfbdgkzalpgmgkzw = vfbdgkzalpgmgkzw(i5, 1166853542);
                                asString = jsonElement3.getAsString();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(vfbdgkzalpgmgkzw) != -482557509) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(vfbdgkzalpgmgkzw) == -482557509 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(vfbdgkzalpgmgkzw) == (1431816169 ^ vfbdgkzalpgmgkzw)) {
                                            break;
                                        }
                                    }
                                    int i13 = 1151490052 ^ vfbdgkzalpgmgkzw;
                                    throw new IOException("double");
                                }
                                int i14 = 1502532623 ^ vfbdgkzalpgmgkzw;
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -816124791) {
                                int i15 = 616860968 ^ i5;
                                asString = null;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != -377584184) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -377584184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (1050883475 ^ i15)) {
                                            break;
                                        }
                                    }
                                    int i16 = 389864430 ^ i15;
                                    throw new IOException("double");
                                }
                                int i17 = 764395049 ^ i15;
                                try {
                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i17) != 238478999) {
                                        throw null;
                                    }
                                    throw new IllegalAccessException();
                                } catch (IllegalAccessException e) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                        case -2063371135:
                                            i2 = 1782831634 ^ i17;
                                            break;
                                        case -1162094703:
                                            i2 = 1840565872 ^ i17;
                                            break;
                                        default:
                                            throw new RuntimeException("Error in hash");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -685923310) {
                                        int i18 = 2131425466 ^ i2;
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -685923310 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (778670096 ^ i2)) {
                                                int i19 = 486477657 ^ i2;
                                                throw new IOException("double");
                                            }
                                        }
                                    }
                                }
                            }
                            return asString;
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1054322571) {
                        int i20 = 5451056 ^ i6;
                        return null;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 793403841 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (433830196 ^ i7)) {
                        int i21 = 1202286949 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1163407894 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1615603140 ^ i7)) {
                            int i22 = 1470403378 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1011817592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1293128737 ^ i7)) {
                                break;
                            }
                        }
                    }
                }
                int i23 = 188836065 ^ i7;
                throw new IOException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1874635320 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (803273906 ^ i6)) {
                    int i24 = 1301207255 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1054322571 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1924484152 ^ i6)) {
                        break;
                    }
                }
            }
            int i25 = 20158035 ^ i6;
            throw new IllegalAccessException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -816124791 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1478852886 ^ i5)) {
                int i26 = 2116025985 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1309059749 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1033704244 ^ i5)) {
                    break;
                }
            }
        }
        int i27 = 810755525 ^ i5;
        throw new IllegalAccessException("double");
    }

    static {
        nothing_to_see_here[0] = "⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆";
        nothing_to_see_here[5] = "⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿";
        nothing_to_see_here[6] = "⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀";
        nothing_to_see_here[7] = "⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[8] = "⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉              ";
        int parseInt = 453031281 ^ (680577571 ^ Integer.parseInt("1629226382"));
        qeyxgrdvcn = ByteBuffer.wrap(htinjynekmpezln()).asCharBuffer().toString();
        wp0wC8rHlA = (-1287839944) ^ new Random(-2476547793423402464L).nextInt();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1805396254) {
            int i = 1653548476 ^ parseInt;
            GSON = new Gson();
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1805396254 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (2083742150 ^ parseInt)) {
                int i2 = 2137242418 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -2145715455 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1696984924 ^ parseInt)) {
                    break;
                }
            }
        }
        int i3 = 1491510411 ^ parseInt;
        throw new IllegalAccessException();
    }

    public static String neddyxqjsk(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = qeyxgrdvcn.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] gonnunvkmdvvuor() {
        return new byte[]{0, 0, 0, 28, 0, 0, 0, 0};
    }

    private static byte[] aoujvwqquzmkdxo() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 28};
    }

    private static byte[] bmibztmzqsnjqek() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 38};
    }

    private static byte[] rocpkdjdnrshasm() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 45};
    }

    private static byte[] jafslxtahamlzxt() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 52};
    }

    private static byte[] qojsjxfqexrezlg() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 60};
    }

    private static byte[] zhwyikplqgjeqyn() {
        return new byte[]{0, 0, 0, 39, 0, 0, 0, 68};
    }

    private static byte[] bdohnjsirtdhlnd() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 107};
    }

    private static byte[] wtwvowilnwpctfc() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 107};
    }

    private static byte[] ljquobgwcgtqlqc() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 115};
    }

    private static byte[] ftjavtznpengxga() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 123};
    }

    private static byte[] pitfurgobjtvtmc() {
        return new byte[]{0, 0, 0, 3, 0, 0, 0, Byte.MAX_VALUE};
    }

    private static byte[] qmexyadaowfonvw() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, -126};
    }

    private static byte[] htinjynekmpezln() {
        return new byte[]{53, 72, 57, 69, 57, 93, 52, 74, 48, 65, 51, 76, 49, 75, 56, 81, 50, 67, 53, 9, 57, 74, 57, 107, 52, 121, 48, 124, 51, 119, 49, 3, 56, 79, 50, 69, 53, 65, 57, 93, 57, 2, 52, 16, 48, 16, 51, 74, 49, 27, 56, 73, 50, 77, 53, 78, 50, 98, 49, 126, 54, 98, 54, 125, 49, 122, 50, 110, 49, 124, 54, 99, 54, 116, 49, 123, 49, 73, 49, 65, 55, 93, 53, 85, 51, 94, 49, 85, 49, 86, 49, 66, 50, 74, 56, 91, 55, 83, 54, 80, 49, 94, 50, 93, 50, 65, 57, 87, 53, 65, 49, 76, 54, 71, 53, 75, 50, 80, 57, 66, 49, 68, 50, 82, 50, 64, 51, 66, 55, 77, 49, 66, 50, 82, 50, 75, 54, 92, 54, 68, 50, 71, 53, 70, 48, 69, 52, 12, 48, 29, 51, 26, 54, 68, 54, 81, 54, 72, 50, 71, 53, 67, 48, 68, 52, 83, 48, 65, 51, 27, 54, 93, 54, 93, 54, 94, 50, 86, 53, 85, 48, 68, 52, 87, 48, 84, 51, 65, 54, 30, 54, 90, 54, 85, 50, 71, 53, 25, 48, 66, 52, 83, 48, 74, 51, 65, 54, 69, 54, 70, 54, 85, 50, 28, 50, 69, 49, 81, 49, 65, 54, 71, 57, 65, 50, 67, 49, 81, 49, 74, 50, 69, 49, 81, 49, 65, 54, 71, 57, 65, 50, 67, 49, 81, 49, 74, 49, 97, 57, 126, 56, 121, 48, 120, 49, 71, 54, 70, 55, 91, 49, 64, 54, 80, 49, 64, 54, 67, 52, 76, 49, 70, 54, 80, 49, 75};
    }

    private static int vfbdgkzalpgmgkzw(int i, int i2) {
        return i ^ i2;
    }
}
