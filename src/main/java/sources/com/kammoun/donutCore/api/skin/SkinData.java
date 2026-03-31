package com.kammoun.donutCore.api.skin;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Random;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SkinData extends Record {

    @NotNull
    private final UUID uuid;

    @NotNull
    private final String textureValue;

    @Nullable
    private final String signature;
    private final long lastSeen;
    public static final String DEFAULT_TEXTURE = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDM0ZTA2M2NhZmI0NjdhNWM4ZGU0M2VjNzg2MTkzOTlmMzY5ZjRhNTI0MzRkYTgwMTdhOTgzY2RkOTI1MTZhMCJ9fX0=";

    private static int f84zvv8wklnd = 0;
    private transient int awjBO3D2xM = 2015557433;
    private static String uryorykpcz;
    private static String[] nothing_to_see_here = new String[15];

    public SkinData(@NotNull UUID uuid, @NotNull String str, @Nullable String str2, long j, int i) {
        int i2 = 1528742797 ^ (1485682016 ^ 1969803565);
        int parseInt = 265273843 ^ (1948453185 ^ Integer.parseInt("219639666"));
        this.awjBO3D2xM = 2015557433 ^ f84zvv8wklnd;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 109569023:
                    int i3 = 1440135270 ^ parseInt;
                    break;
                case 754598512:
                default:
                    throw new RuntimeException();
                case 863775433:
                case 1005637238:
                    break;
            }
        }
        this.uuid = uuid;
        this.textureValue = str;
        this.signature = str2;
        this.lastSeen = j;
    }

    public static SkinData createDefault(@NotNull UUID uuid, int i) {
        int i2 = 1401329034 ^ (1776808735 ^ 940870056);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 330267112) {
            return new SkinData(uuid, uklooyivpn(uvkoigquezeedxc(), 456078562 ^ i2), null, System.currentTimeMillis(), 805317916);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -891887880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (661773943 ^ i2)) {
                int i3 = 900919891 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 330267112 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2041045907 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 899057301 ^ i2;
        throw new RuntimeException();
    }

    public static SkinData of(@NotNull UUID uuid, @NotNull String str) {
        int i = 1434704063 ^ (852393386 ^ 940870056);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -87464470) {
            int i2 = 1242964025 ^ i;
            return new SkinData(uuid, str, null, System.currentTimeMillis(), 805317916);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -87464470 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1622088385 ^ i)) {
                int i3 = 1876319919 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1434950624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (625031908 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1406954429 ^ i;
        throw new IOException();
    }

    public static SkinData of(@NotNull UUID uuid, @NotNull String str, @Nullable String str2, int i) {
        int i2 = 1493742419 ^ (200486854 ^ 940870056);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1467525611) {
            int i3 = 2061062483 ^ i2;
            return new SkinData(uuid, str, str2, System.currentTimeMillis(), 805317916);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2119031952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (494202977 ^ i2)) {
                int i4 = 1405579271 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1467525611 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (765895413 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 185772205 ^ i2;
        throw new RuntimeException();
    }

    public boolean isDefault(int i) {
        int i2 = 357489011 ^ (1837651409 ^ 1077313169);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -947416679) {
            return uklooyivpn(eviskztwgvqngwu(), 1912907867 ^ i2).equals(this.textureValue);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -947416679 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1538101881 ^ i2)) {
                int i3 = 845656899 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1470288706 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1562703875 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 1336679670 ^ i2;
        throw new IllegalAccessException();
    }

    public String getTextureUrl() {
        int i = 423170832 ^ (1817293922 ^ 1077313169);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1426665703) {
            int i2 = 679374307 ^ i;
            return "https://textures.minecraft.net/texture/" + extractTextureId(1166418344);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -385507328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1725248357 ^ i)) {
                int i3 = 2042127181 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1426665703 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2010442385 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1679805920 ^ i;
        throw new RuntimeException();
    }

    private String extractTextureId(int i) {
        int lynwmvdjkavplkmm;
        String str;
        int i2;
        int lynwmvdjkavplkmm2;
        int lynwmvdjkavplkmm3;
        int i3;
        int i4 = 1169690161 ^ (77025926 ^ 1077313169);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 147394864) {
            int i5 = 324761702 ^ i4;
            int i6 = i5;
            try {
                str = new String(Base64.getDecoder().decode(this.textureValue));
            } catch (Exception e) {
                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                    case -1844260352:
                        lynwmvdjkavplkmm = 1269373846 ^ i6;
                        break;
                    case -1352075198:
                        lynwmvdjkavplkmm = 201744094 ^ i6;
                        break;
                    case -505677173:
                        lynwmvdjkavplkmm = 634404487 ^ i6;
                        break;
                    case -431445159:
                        lynwmvdjkavplkmm = 1696748733 ^ i6;
                        break;
                    case -368094838:
                        lynwmvdjkavplkmm = 78293991 ^ i6;
                        break;
                    case 174255985:
                        lynwmvdjkavplkmm = 2024217656 ^ i6;
                        break;
                    case 446705352:
                        lynwmvdjkavplkmm = lynwmvdjkavplkmm(i6, 1522484239);
                        break;
                    case 761836672:
                        lynwmvdjkavplkmm = lynwmvdjkavplkmm(i6, 1548113734);
                        break;
                    case 826543242:
                        lynwmvdjkavplkmm = 532922439 ^ i6;
                        break;
                    case 918518122:
                        lynwmvdjkavplkmm = lynwmvdjkavplkmm(i6, 524070651);
                        break;
                    case 2090245506:
                        lynwmvdjkavplkmm = lynwmvdjkavplkmm(i6, 377066086);
                        break;
                    default:
                        throw new RuntimeException("Error in hash");
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm) == -816181582) {
                    int i7 = 817784760 ^ lynwmvdjkavplkmm;
                    return this.textureValue;
                }
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1844260352) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1844260352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (36457017 ^ i6)) {
                        break;
                    }
                }
                int i8 = 997539693 ^ i6;
                throw new IllegalAccessException("double");
            }
            lynwmvdjkavplkmm = 1573947888 ^ i6;
            int indexOf = str.indexOf(uklooyivpn(kwnecmmikthhfcq(), lynwmvdjkavplkmm));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm) == 2090245506) {
                int i9 = 155532445 ^ lynwmvdjkavplkmm;
                if (indexOf == ((byte) ((-1188556590) ^ i9))) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 918518122) {
                        i2 = 2048850502 ^ i9;
                        indexOf = str.indexOf(uklooyivpn(ucbwqlaljglgzpd(), i2));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -431445159) {
                            i4 = 1636368218 ^ i2;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -431445159 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1171561629 ^ i2)) {
                                int i10 = 860523832 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1352075198 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1193280893 ^ i2)) {
                                    break;
                                }
                            }
                        }
                        int i11 = 1554645318 ^ i2;
                        throw new IOException("double");
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 918518122 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1029653975 ^ i9)) {
                            int i12 = 1807440125 ^ i9;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 761836672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1043929166 ^ i9)) {
                                break;
                            }
                        }
                    }
                    int i13 = 566705756 ^ i9;
                    throw new RuntimeException("double");
                }
                i4 = 462816540 ^ i9;
                if (indexOf == ((byte) ((-1564600882) ^ i4))) {
                    lynwmvdjkavplkmm2 = lynwmvdjkavplkmm(i4, 543455672);
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -368094838) {
                    i9 = 1491926177 ^ i4;
                    int length = indexOf + uklooyivpn(empiicseuolejik(), i9).length();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 761836672) {
                        i4 = 2039900609 ^ i9;
                        if (str.charAt(indexOf + ((byte) (2084274005 ^ i4))) != ((byte) (2084273954 ^ i4))) {
                            i3 = 2138012296 ^ i4;
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -505677173) {
                            i2 = 701915225 ^ i4;
                            length = indexOf + uklooyivpn(mxidtgdckyrmhnq(), i2).length();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1352075198) {
                                i3 = 1454971601 ^ i2;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -431445159) {
                                    int i102 = 860523832 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1352075198) {
                                        break;
                                        break;
                                    }
                                    continue;
                                }
                            }
                            int i112 = 1554645318 ^ i2;
                            throw new IOException("double");
                        }
                        int indexOf2 = str.indexOf((byte) (55838203 ^ i3), length);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 446705352) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 446705352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (704935406 ^ i3)) {
                                    break;
                                }
                            }
                            int i14 = 1320654025 ^ i3;
                            throw new IllegalAccessException("double");
                        }
                        i4 = 572020791 ^ i3;
                        if (indexOf2 == ((byte) ((-558652911) ^ i4))) {
                            lynwmvdjkavplkmm2 = 1550437991 ^ i4;
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 174255985) {
                            lynwmvdjkavplkmm = 1734663295 ^ i4;
                            String substring = str.substring(length, indexOf2);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm) == 826543242) {
                                i6 = 455805495 ^ lynwmvdjkavplkmm;
                                return substring;
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 918518122) {
                            int i122 = 1807440125 ^ i9;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 761836672) {
                                break;
                                break;
                            }
                            continue;
                        }
                    }
                    int i132 = 566705756 ^ i9;
                    throw new RuntimeException("double");
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm2) != -382952373) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm2) == -382952373 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm2) == (751353065 ^ lynwmvdjkavplkmm2)) {
                            break;
                        }
                    }
                    int i15 = 429081041 ^ lynwmvdjkavplkmm2;
                    throw new IllegalAccessException("double");
                }
                int i16 = 61142432 ^ lynwmvdjkavplkmm2;
                try {
                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i16) != 85642094) {
                        throw null;
                    }
                    throw new IllegalAccessException();
                } catch (IllegalAccessException e2) {
                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                        case -1332140949:
                            lynwmvdjkavplkmm3 = lynwmvdjkavplkmm(i16, 725176936);
                            break;
                        case -200593077:
                            lynwmvdjkavplkmm3 = 598413516 ^ i16;
                            break;
                        default:
                            throw new RuntimeException("Error in hash");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm3) == -380389590) {
                        int i17 = 880758923 ^ lynwmvdjkavplkmm3;
                        return this.textureValue;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm3) == -1332140949 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm3) == (1485309098 ^ lynwmvdjkavplkmm3)) {
                            int i18 = 1991468259 ^ lynwmvdjkavplkmm3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm3) == -380389590 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm3) == (1674298051 ^ lynwmvdjkavplkmm3)) {
                                int i19 = 738038954 ^ lynwmvdjkavplkmm3;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm) == 826543242 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm) == (1667562762 ^ lynwmvdjkavplkmm)) {
                    int i20 = 2019559404 ^ lynwmvdjkavplkmm;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm) == 2090245506 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm) == (422135609 ^ lynwmvdjkavplkmm)) {
                        int i21 = 1357391371 ^ lynwmvdjkavplkmm;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm) == -816181582 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lynwmvdjkavplkmm) == (1567646505 ^ lynwmvdjkavplkmm)) {
                            int i22 = 487802844 ^ lynwmvdjkavplkmm;
                            throw new RuntimeException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 174255985 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (602083557 ^ i4)) {
                int i23 = 1327473295 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -505677173 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1997680218 ^ i4)) {
                    int i24 = 699949299 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 147394864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1412971671 ^ i4)) {
                        int i25 = 310399260 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -368094838 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1230064715 ^ i4)) {
                            break;
                        }
                    }
                }
            }
        }
        int i26 = 2122489614 ^ i4;
        throw new IOException();
    }

    @Override
    public final String toString() {
        int i = 819967011 ^ (286499197 ^ 1077313169);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 265510523) {
            int i2 = 755917181 ^ i;
            return (String) ObjectMethods.bootstrap(MethodHandles.lookup(), "toString", MethodType.methodType(String.class, SkinData.class), SkinData.class, "uuid;textureValue;signature;lastSeen", "FIELD:Lcom/kammoun/donutCore/api/skin/SkinData;->uuid:Ljava/util/UUID;", "FIELD:Lcom/kammoun/donutCore/api/skin/SkinData;->textureValue:Ljava/lang/String;", "FIELD:Lcom/kammoun/donutCore/api/skin/SkinData;->signature:Ljava/lang/String;", "FIELD:Lcom/kammoun/donutCore/api/skin/SkinData;->lastSeen:J").dynamicInvoker().invoke(this) /* invoke-custom */;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 265510523 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1145752949 ^ i)) {
                int i3 = 4351446 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1738560914 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (908476210 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 775684080 ^ i;
        throw new IOException();
    }

    @Override
    public final int hashCode() {
        int i = 1938034621 ^ (464101352 ^ 1077313169);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1088386593) {
            int i2 = 613297734 ^ i;
            return (int) ObjectMethods.bootstrap(MethodHandles.lookup(), "hashCode", MethodType.methodType(Integer.TYPE, SkinData.class), SkinData.class, "uuid;textureValue;signature;lastSeen", "FIELD:Lcom/kammoun/donutCore/api/skin/SkinData;->uuid:Ljava/util/UUID;", "FIELD:Lcom/kammoun/donutCore/api/skin/SkinData;->textureValue:Ljava/lang/String;", "FIELD:Lcom/kammoun/donutCore/api/skin/SkinData;->signature:Ljava/lang/String;", "FIELD:Lcom/kammoun/donutCore/api/skin/SkinData;->lastSeen:J").dynamicInvoker().invoke(this) /* invoke-custom */;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1689125904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1358267940 ^ i)) {
                int i3 = 808786552 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1088386593 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (736831052 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 279123010 ^ i;
        throw new IllegalAccessException();
    }

    @Override
    public final boolean equals(Object obj) {
        int i = 956563837 ^ (997817866 ^ 1077313169);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 307760946) {
            int i2 = 985466715 ^ i;
            return (boolean) ObjectMethods.bootstrap(MethodHandles.lookup(), "equals", MethodType.methodType(Boolean.TYPE, SkinData.class, Object.class), SkinData.class, "uuid;textureValue;signature;lastSeen", "FIELD:Lcom/kammoun/donutCore/api/skin/SkinData;->uuid:Ljava/util/UUID;", "FIELD:Lcom/kammoun/donutCore/api/skin/SkinData;->textureValue:Ljava/lang/String;", "FIELD:Lcom/kammoun/donutCore/api/skin/SkinData;->signature:Ljava/lang/String;", "FIELD:Lcom/kammoun/donutCore/api/skin/SkinData;->lastSeen:J").dynamicInvoker().invoke(this, obj) /* invoke-custom */;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 307760946 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1373038746 ^ i)) {
                int i3 = 950258605 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -944753173 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2110866287 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1328321240 ^ i;
        throw new IllegalAccessException();
    }

    @NotNull
    public UUID uuid(int i) {
        int i2 = 541745776 ^ (941681545 ^ 1077313169);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1025000638) {
            int i3 = 1176466220 ^ i2;
            return this.uuid;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -233037280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2027808589 ^ i2)) {
                int i4 = 1124842252 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1025000638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2123886610 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 230493067 ^ i2;
        throw new IOException();
    }

    @NotNull
    public String textureValue() {
        int i = 1348157622 ^ (1822678428 ^ 1077313169);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -428401189) {
            int i2 = 755847599 ^ i;
            return this.textureValue;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -428401189 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1699047938 ^ i)) {
                int i3 = 906010579 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1910665054 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1154745779 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1569567454 ^ i;
        throw new RuntimeException();
    }

    @Nullable
    public String signature(int i) {
        int i2 = 667784529 ^ (1951247920 ^ 1077313169);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1649266816) {
            int i3 = 222288808 ^ i2;
            return this.signature;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1649266816 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (16430203 ^ i2)) {
                int i4 = 1021505392 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -196283712 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (162383027 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 945792397 ^ i2;
        throw new IllegalAccessException();
    }

    public long lastSeen(int i) {
        int i2 = 683063354 ^ (1495882939 ^ 1077313169);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1924345727) {
            int i3 = 456890023 ^ i2;
            return this.lastSeen;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1924345727 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1496905848 ^ i2)) {
                int i4 = 1315918376 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1418749369 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1982002802 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 281935582 ^ i2;
        throw new RuntimeException();
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
        uryorykpcz = ByteBuffer.wrap(kmgaqiwampjmpnc()).asCharBuffer().toString();
        f84zvv8wklnd = 487603240 ^ new Random(-8974859640447436559L).nextInt();
    }

    public static String uklooyivpn(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = uryorykpcz.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] uvkoigquezeedxc() {
        return new byte[]{0, 0, 0, -76, 0, 0, 0, 0};
    }

    private static byte[] eviskztwgvqngwu() {
        return new byte[]{0, 0, 0, -76, 0, 0, 0, -76};
    }

    private static byte[] empiicseuolejik() {
        return new byte[]{0, 0, 0, 38, 0, 0, 1, 104};
    }

    private static byte[] mxidtgdckyrmhnq() {
        return new byte[]{0, 0, 0, 39, 0, 0, 1, -114};
    }

    private static byte[] ucbwqlaljglgzpd() {
        return new byte[]{0, 0, 0, 39, 0, 0, 1, -75};
    }

    private static byte[] kwnecmmikthhfcq() {
        return new byte[]{0, 0, 0, 38, 0, 0, 1, -36};
    }

    private static byte[] kmgaqiwampjmpnc() {
        return new byte[]{52, 87, 53, 74, 56, 126, 57, 2, 55, 110, 50, 109, 51, 80, 52, 9, 50, 83, 52, 106, 53, 121, 56, 88, 57, 81, 55, 77, 50, 124, 51, 14, 52, 92, 50, 78, 52, 120, 53, 103, 56, 103, 57, 2, 55, 88, 50, 122, 51, 113, 52, 83, 50, 71, 52, 5, 53, 122, 56, 90, 57, 100, 55, 77, 50, 87, 51, 123, 52, 112, 50, 1, 52, 123, 53, 94, 56, 92, 57, 2, 55, 80, 50, 125, 51, 121, 52, 15, 50, 123, 52, 75, 53, 10, 56, 4, 57, 104, 55, 108, 50, 93, 51, 8, 52, 93, 50, 111, 52, 120, 53, 95, 56, 87, 57, 75, 55, 1, 50, 65, 51, 89, 52, 110, 50, 2, 52, 94, 53, 106, 56, 7, 57, 120, 55, 92, 50, 111, 51, 86, 52, 104, 50, 66, 52, 80, 53, 94, 56, 98, 57, 2, 55, 120, 50, 6, 51, 106, 52, 85, 50, 82, 52, 122, 53, 97, 56, 5, 57, 81, 55, 89, 50, 96, 51, 78, 52, 99, 50, 115, 52, Byte.MAX_VALUE, 53, 3, 56, 110, 57, 102, 55, 117, 50, 7, 51, 117, 52, 11, 50, 121, 52, 90, 53, 105, 56, 89, 57, 123, 55, 4, 50, 123, 51, 82, 52, 93, 50, 95, 52, 124, 53, 100, 56, 121, 57, 6, 55, 110, 50, 114, 51, 109, 52, 9, 50, 122, 52, 0, 53, 101, 56, 94, 57, 124, 55, 78, 50, 82, 51, 10, 52, 116, 50, 99, 52, 89, 53, 73, 56, 123, 57, 102, 55, 88, 50, 88, 51, 117, 52, 67, 50, 110, 52, 7, 53, 105, 56, 94, 57, 96, 55, 92, 50, 123, 51, 108, 52, 112, 50, 7, 52, Byte.MAX_VALUE, 53, 73, 56, 102, 57, 89, 55, 109, 50, 97, 51, 95, 52, 78, 50, 122, 52, 102, 53, 87, 56, 92, 57, 125, 55, 96, 50, 82, 51, 66, 52, 96, 50, 5, 52, 96, 53, 88, 56, 123, 57, 102, 55, 125, 50, 4, 51, 117, 52, 109, 50, 109, 52, 90, 53, 126, 56, 119, 57, 120, 55, 13, 50, 83, 51, 96, 52, 9, 50, 10, 49, 87, 53, 78, 53, 120, 55, 9, 49, 104, 49, 106, 53, 95, 53, 2, 55, 93, 49, 106, 49, 120, 53, 91, 53, 81, 55, 64, 49, 123, 49, 4, 53, 82, 53, 75, 55, 115, 49, 102, 49, 97, 53, 7, 53, 94, 55, 118, 49, 123, 49, 88, 53, 71, 53, 5, 55, 112, 49, 92, 49, 100, 53, 78, 53, 80, 55, 122, 49, 123, 49, 4, 53, 126, 53, 95, 55, 81, 49, 2, 49, 86, 53, Byte.MAX_VALUE, 53, 115, 55, 15, 49, 126, 49, 75, 53, 14, 53, 2, 55, 99, 49, 106, 49, 90, 53, 7, 53, 86, 55, 97, 49, 120, 49, 94, 53, 84, 53, 75, 55, 12, 49, 70, 49, 83, 53, 96, 53, 7, 55, 85, 49, 107, 49, 1, 53, 125, 53, 90, 55, 99, 49, 92, 49, 99, 53, 66, 53, 80, 55, 84, 49, 100, 49, 2, 53, 123, 53, 1, 55, 107, 49, 94, 49, 87, 53, Byte.MAX_VALUE, 53, 96, 55, 8, 49, 81, 49, 95, 53, 98, 53, 68, 55, 99, 49, 118, 49, Byte.MAX_VALUE, 53, 7, 53, 104, 55, 109, 49, 115, 49, 0, 53, 122, 53, 0, 55, 119, 49, 90, 49, 104, 53, 90, 53, 123, 55, 9, 49, 124, 49, 88, 53, 83, 53, 90, 55, 119, 49, 101, 49, Byte.MAX_VALUE, 53, 3, 53, 104, 55, 126, 49, 103, 49, 2, 53, 122, 53, 0, 55, 111, 49, 88, 49, 124, 53, 77, 53, 85, 55, 11, 49, Byte.MAX_VALUE, 49, 102, 53, 92, 53, 72, 55, 118, 49, 102, 49, 94, 53, 90, 53, Byte.MAX_VALUE, 55, 67, 49, 107, 49, 7, 53, 109, 53, 88, 55, 107, 49, 90, 49, 124, 53, 99, 53, 123, 55, 9, 49, Byte.MAX_VALUE, 49, 72, 53, 101, 53, 89, 55, 96, 49, 102, 49, 85, 53, 64, 53, Byte.MAX_VALUE, 55, 109, 49, 86, 49, 90, 53, 120, 53, 102, 55, 94, 49, 72, 49, 107, 53, 5, 53, 96, 55, 82, 49, 125, 49, 102, 53, 126, 53, 3, 55, 116, 49, 102, 49, 104, 53, 95, 53, Byte.MAX_VALUE, 55, 122, 49, 120, 49, 11, 53, 81, 53, 106, 55, 9, 49, 15, 57, 93, 50, 70, 57, 65, 56, 68, 57, 15, 50, 29, 57, 26, 56, 64, 57, 80, 50, 74, 57, 65, 56, 65, 57, 71, 50, 87, 57, 70, 56, 26, 57, 88, 50, 91, 57, 91, 56, 81, 57, 86, 50, 64, 57, 84, 56, 82, 57, 65, 50, 28, 57, 91, 56, 81, 57, 65, 50, 29, 57, 65, 56, 81, 57, 77, 50, 70, 57, 64, 56, 70, 57, 80, 50, 29, 49, 92, 52, 69, 54, 68, 51, 67, 51, 69, 49, 14, 52, 30, 54, 31, 51, 71, 51, 83, 49, 76, 52, 69, 54, 69, 51, 65, 51, 83, 49, 71, 52, 31, 54, 93, 51, 90, 51, 88, 49, 81, 52, 82, 54, 66, 51, 82, 51, 80, 49, 64, 52, 31, 54, 94, 51, 86, 51, 66, 49, 27, 52, 69, 54, 85, 51, 75, 51, 66, 49, 65, 52, 67, 54, 85, 51, 28, 49, 88, 49, 77, 56, 69, 49, 65, 55, 74, 49, 10, 49, 22, 56, 30, 49, 69, 55, 92, 49, 72, 49, 77, 56, 68, 49, 67, 55, 92, 49, 67, 49, 23, 56, 92, 49, 88, 55, 87, 49, 85, 49, 90, 56, 67, 49, 80, 55, 95, 49, 68, 49, 23, 56, 95, 49, 84, 55, 77, 49, 31, 49, 77, 56, 84, 49, 73, 55, 77, 49, 69, 49, 75, 56, 84, 49, 30, 49, 91, 51, 65, 48, 70, 50, 69, 49, 8, 49, 28, 51, 26, 48, 70, 50, 80, 49, 74, 49, 71, 51, 64, 48, 64, 50, 80, 49, 65, 49, 29, 51, 88, 48, 91, 50, 91, 49, 87, 49, 80, 51, 71, 48, 83, 50, 83, 
        49, 70, 49, 29, 51, 91, 48, 87, 50, 65, 49, 29, 49, 71, 51, 80, 48, 74, 50, 65, 49, 71, 49, 65, 51, 80, 48, 29};
    }

    private static int lynwmvdjkavplkmm(int i, int i2) {
        return i ^ i2;
    }
}
