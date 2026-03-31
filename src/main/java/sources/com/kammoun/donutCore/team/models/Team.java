package com.kammoun.donutCore.team.models;

import com.kammoun.donutCore.api.utils.location.Klocation;
import com.kammoun.donutCore.team.models.Enums.Permissions;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;
import lombok.Generated;
import org.bukkit.Location;

public class Team {
    private final UUID teamID;
    private final String teamName;
    private final UUID leaderID;
    private Klocation homeLocation;
    private boolean pvpEnabled;
    private final CopyOnWriteArrayList<TeamMember> members;

    private static int f11945wg3mLgEM = 0;
    private transient int OaMn5q3cxh = 1127859055;
    private static byte[] mdohragyqb;
    private static String[] nothing_to_see_here = new String[15];

    static class AnonymousClass1 {
        static final int[] $SwitchMap$com$kammoun$donutCore$team$models$Enums$TeamSort;
        private static int lkddZqIAKb = 0;
        private transient int b7F70CjkAy = 1737396634;
        private static byte[] zsrlvdexqu;
        private static String[] nothing_to_see_here;

        static {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.models.Team.AnonymousClass1.m417clinit():void");
        }

        public static String hmzbnvyseo(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= bArr.length) {
                    return new String(bArr, StandardCharsets.UTF_16);
                }
                bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                bArr[i3] = (byte) (bArr[i3] ^ zsrlvdexqu[i3 % zsrlvdexqu.length]);
                i2 = i3 + 1;
            }
        }

        private static byte[] anuyghddudourbl() {
            return new byte[]{103, Byte.MAX_VALUE, 33, 42, 64, 38, 45, 54, 76, 79, 113, 115, 35, 54, 100, 86, 26, 16, 108, 88, 25, 63, 14, 32, 125, 80, 81, 88, 122, 29, 55, 42, 23, 73, 14, 47, 50, 120, 42, 32, 118, 2, 18, 39, 45, 6, 91, 27, 117, 44, 97, 24, 116, 67, 10, 17, 76, 54, 68, 119, 47, 56, 101, 79, 22, 79, 86, 88, 31, 30, 69, 72, 9, 80, 60, 116, 110, 61, 117, 85, 62, 5, 33, 5, 44, 123, 23, 38, 86, 8, 72, 8, 7, 77, 80, 34, 75, 3, 115, 22, 93, 6, 114, 93, 105, 17, 94, 67, 79};
        }

        private static int pdenavqbscwogans(int i, int i2) {
            return i ^ i2;
        }
    }

    public Team(java.util.UUID r5, java.lang.String r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.models.Team.<init>(java.util.UUID, java.lang.String, int):void");
    }

    private void addLeaderAsMember(int i) {
        int i2 = 43576613 ^ (1529415823 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 578799275) {
            i2 = 961277530 ^ i2;
            HashMap hashMap = new HashMap();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -400509830) {
                int i3 = 220248452 ^ i2;
                Permissions[] values = Permissions.values();
                int length = values.length;
                int i4 = (byte) (1344581387 ^ i3);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2128250790) {
                    int i5 = 1960088898;
                    while (true) {
                        i3 = i5 ^ i3;
                        if (i4 >= length) {
                            int i6 = 539926814 ^ i3;
                            TeamMember teamMember = new TeamMember(this.leaderID, hashMap, new Timestamp(0L), 1956684137);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 653580984) {
                                int i7 = 1035414890 ^ i6;
                                this.members.add(teamMember);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -884100631) {
                                    int i8 = 164600061 ^ i7;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -884100631 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (169916108 ^ i7)) {
                                        int i9 = 1154398942 ^ i7;
                                        throw new RuntimeException("double");
                                    }
                                }
                            } else {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 653580984 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2072615952 ^ i6)) {
                                        int i10 = 1792568247 ^ i6;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2060356095 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (914162749 ^ i6)) {
                                            int i11 = 297393701 ^ i6;
                                            throw new IOException("double");
                                        }
                                    }
                                }
                            }
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 662819401) {
                            i3 = 744872655 ^ i3;
                            Permissions permissions = values[i4];
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1152320560) {
                                i3 = 784928199 ^ i3;
                                hashMap.put(permissions, Boolean.valueOf((boolean) ((byte) (643624256 ^ i3))));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 854026761) {
                                    int i12 = 362994667 ^ i3;
                                    i4 += 872298155 ^ i12;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1611549359) {
                                        int rzeacqmbxwapxeoj = rzeacqmbxwapxeoj(i12, 258282822);
                                        try {
                                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(rzeacqmbxwapxeoj) == 91007234) {
                                                throw new RuntimeException();
                                            }
                                            throw null;
                                        } catch (RuntimeException e) {
                                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                case -455532703:
                                                    i3 = 893925804 ^ rzeacqmbxwapxeoj;
                                                    break;
                                                case 216105192:
                                                    i3 = rzeacqmbxwapxeoj(rzeacqmbxwapxeoj, 139405917);
                                                    break;
                                                default:
                                                    throw new RuntimeException("Error in hash");
                                            }
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1318638080) {
                                                i5 = 757276681;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1611549359 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1459376574 ^ i12)) {
                                                int i13 = 2048163425 ^ i12;
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
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1152320560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1326295632 ^ i3)) {
                        int i14 = 851168827 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 662819401 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1589172557 ^ i3)) {
                            int i15 = 1298885824 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1318638080 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (425176739 ^ i3)) {
                                int i16 = 260047370 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 854026761 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1659941466 ^ i3)) {
                                    int i17 = 262196054 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2128250790 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (468116962 ^ i3)) {
                                        int i18 = 666322202 ^ i3;
                                        throw new RuntimeException();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 216105192 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (137468163 ^ i2)) {
                int i19 = 436829505 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 578799275 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (275242135 ^ i2)) {
                    int i20 = 1560330875 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -400509830 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (379999013 ^ i2)) {
                        int i21 = 182115932 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -455532703 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (680248074 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i22 = 426166503 ^ i2;
        throw new RuntimeException("double");
    }

    public void addMember(TeamMember teamMember, int i) {
        int i2 = 1960505450 ^ (1477294038 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1991584232) {
            i2 = 1066272036 ^ i2;
            this.members.add(teamMember);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1966800697) {
                int i3 = 979231447 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1991584232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (188078730 ^ i2)) {
                int i4 = 607942617 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1966800697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2100478861 ^ i2)) {
                    int i5 = 2127779270 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1479153280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (408542571 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1050099664 ^ i2;
        throw new RuntimeException();
    }

    public boolean isHomeLocationSet(int i) {
        byte b;
        int i2 = 2041888890 ^ (2027840646 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -458896359) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -458896359 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1278501045 ^ i2)) {
                    break;
                }
            }
            int i3 = 886413724 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 433139085 ^ i2;
        if (this.homeLocation != null) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 707567729) {
                int i5 = 1746027481 ^ i4;
                b = (byte) (1297602518 ^ i5);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1790885562) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1790885562 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1396566061 ^ i5)) {
                            int i6 = 53084411 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -934402320 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (930692231 ^ i5)) {
                                break;
                            }
                        }
                    }
                    int i7 = 277402827 ^ i5;
                    throw new IllegalAccessException("double");
                }
                int rzeacqmbxwapxeoj = rzeacqmbxwapxeoj(i5, 1415451401);
                try {
                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(rzeacqmbxwapxeoj) != 8582247) {
                        throw null;
                    }
                    throw new IOException();
                } catch (IOException e) {
                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                        case -934402320:
                            i4 = 846828187 ^ rzeacqmbxwapxeoj;
                            break;
                        case -427715877:
                            i4 = rzeacqmbxwapxeoj(rzeacqmbxwapxeoj, 1470129182);
                            break;
                        default:
                            throw new IllegalAccessException("Error in hash");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1535291945) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1535291945 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (8467295 ^ i4)) {
                                int i8 = 1686473789 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2142707593 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (496731188 ^ i4)) {
                                    int i9 = 1605522971 ^ i4;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                            case 69831765:
                                int i10 = 75937204 ^ i4;
                                break;
                            case 1794225599:
                            case 1876367191:
                                break;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 707567729 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1754443978 ^ i4)) {
                    int i11 = 1209310850 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -427715877 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1113505419 ^ i4)) {
                        int i12 = 121860810 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1392568496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1190745526 ^ i4)) {
                            int i13 = 475106725 ^ i4;
                            throw new IllegalAccessException();
                        }
                    }
                }
            }
        } else {
            i4 = rzeacqmbxwapxeoj(i4, 819623652);
            b = (byte) (362799850 ^ i4);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1392568496) {
                int i14 = 979960091 ^ i4;
                return b;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 707567729) {
                    int i112 = 1209310850 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -427715877) {
                        continue;
                    } else {
                        int i122 = 121860810 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1392568496) {
                            int i132 = 475106725 ^ i4;
                            throw new IllegalAccessException();
                        }
                        continue;
                    }
                }
            }
        }
    }

    public void setHomeLocation(Location location, int i) {
        int rzeacqmbxwapxeoj;
        int i2 = 1605871308 ^ (43351250 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 115751691) {
            i2 = 2133844504 ^ i2;
            if (location != null) {
                rzeacqmbxwapxeoj = rzeacqmbxwapxeoj(i2, 261081877);
                this.homeLocation = new Klocation(location, 1538334150);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rzeacqmbxwapxeoj) == -2081983648) {
                    int i3 = 592551881 ^ rzeacqmbxwapxeoj;
                    return;
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -6739000) {
                rzeacqmbxwapxeoj = 1409490814 ^ i2;
                this.homeLocation = null;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rzeacqmbxwapxeoj) == 1602342970) {
                    int i4 = 1209262294 ^ rzeacqmbxwapxeoj;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rzeacqmbxwapxeoj) == -1721004759 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rzeacqmbxwapxeoj) == (528318238 ^ rzeacqmbxwapxeoj)) {
                    int i5 = 420163586 ^ rzeacqmbxwapxeoj;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rzeacqmbxwapxeoj) == 1602342970 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rzeacqmbxwapxeoj) == (737406358 ^ rzeacqmbxwapxeoj)) {
                        int i6 = 1539784061 ^ rzeacqmbxwapxeoj;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rzeacqmbxwapxeoj) == -2081983648 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rzeacqmbxwapxeoj) == (1041339371 ^ rzeacqmbxwapxeoj)) {
                            break;
                        }
                    }
                }
            }
            int i7 = 467115320 ^ rzeacqmbxwapxeoj;
            throw new RuntimeException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 115751691 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1959107146 ^ i2)) {
                int i8 = 294150767 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -6739000 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (988245972 ^ i2)) {
                    break;
                }
            }
        }
        int i9 = 1118199477 ^ i2;
        throw new RuntimeException("double");
    }

    public void changePvPState(int i) {
        byte b;
        int i2 = 551678472 ^ (611107788 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -879139367) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -879139367 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1247774903 ^ i2)) {
                    break;
                }
            }
            int i3 = 730655913 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 899535157 ^ i2;
        if (this.pvpEnabled == (216989070 ^ i4)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1735912560) {
                i4 = 1877178102 ^ i4;
                b = (byte) (1661832057 ^ i4);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 409754563) {
                    int rzeacqmbxwapxeoj = rzeacqmbxwapxeoj(i4, 1280094588);
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(rzeacqmbxwapxeoj) == 193875750) {
                            throw new IllegalAccessException();
                        }
                        throw null;
                    } catch (IllegalAccessException e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case 2047463457:
                                i4 = rzeacqmbxwapxeoj(rzeacqmbxwapxeoj, 500424748);
                                break;
                            case 2102940523:
                                i4 = 1564069957 ^ rzeacqmbxwapxeoj;
                                break;
                            default:
                                throw new RuntimeException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1802055359) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1802055359 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1447879845 ^ i4)) {
                                    int i5 = 26902896 ^ i4;
                                    throw new IllegalAccessException("double");
                                }
                            }
                        }
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                case 33338431:
                                    i4 = 860637810 ^ i4;
                                    break;
                                case 553503628:
                                case 845268421:
                                    break;
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 250905296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1756634013 ^ i4)) {
                    int i6 = 1152808342 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 409754563 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1337995622 ^ i4)) {
                        int i7 = 1375320208 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1735912560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1615122970 ^ i4)) {
                            int i8 = 587643100 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1936857910 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1854391939 ^ i4)) {
                                int i9 = 1229785795 ^ i4;
                                throw new IllegalAccessException();
                            }
                        }
                    }
                }
            }
        } else {
            int rzeacqmbxwapxeoj2 = rzeacqmbxwapxeoj(i4, 857382821);
            b = (byte) (1072980523 ^ rzeacqmbxwapxeoj2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rzeacqmbxwapxeoj2) != -6090407) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rzeacqmbxwapxeoj2) == -6090407 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rzeacqmbxwapxeoj2) == (116064473 ^ rzeacqmbxwapxeoj2)) {
                        int i10 = 2112311662 ^ rzeacqmbxwapxeoj2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rzeacqmbxwapxeoj2) == 2047463457 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rzeacqmbxwapxeoj2) == (817421752 ^ rzeacqmbxwapxeoj2)) {
                            break;
                        }
                    }
                }
                int i11 = 295806462 ^ rzeacqmbxwapxeoj2;
                throw new IllegalAccessException("double");
            }
            i4 = 1043001969 ^ rzeacqmbxwapxeoj2;
        }
        this.pvpEnabled = b;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 250905296) {
            int i12 = 1347366083 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 250905296) {
                int i62 = 1152808342 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 409754563) {
                    continue;
                } else {
                    int i72 = 1375320208 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1735912560) {
                        continue;
                    } else {
                        int i82 = 587643100 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1936857910) {
                            int i92 = 1229785795 ^ i4;
                            throw new IllegalAccessException();
                        }
                        continue;
                    }
                }
            }
        }
    }

    public boolean isLeader(UUID uuid, int i) {
        int i2 = 1606892924 ^ (855210276 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2046637766) {
            int i3 = 1164281694 ^ i2;
            return this.leaderID.equals(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1389431864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (380504293 ^ i2)) {
                int i4 = 665841968 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2046637766 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (640329132 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2055568092 ^ i2;
        throw new IOException();
    }

    public Optional getMember(UUID uuid, int i) {
        int i2 = 1190267683 ^ (807795210 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1498374834) {
            i2 = 301185386 ^ i2;
            Stream stream = this.members.stream();
            Predicate predicate = teamMember -> {
                int i3 = 210321118 ^ (714712368 ^ 2127027728);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -960876558) {
                    int i4 = 1170335851 ^ i3;
                    return teamMember.getMemberID(629337533).equals(uuid);
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -960876558 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1650515999 ^ i3)) {
                        int i5 = 1642079657 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -390763352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (337251455 ^ i3)) {
                            break;
                        }
                    }
                }
                int i6 = 728113047 ^ i3;
                throw new IllegalAccessException();
            };
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -690837022) {
                i2 = 1747145211 ^ i2;
                Stream filter = stream.filter(predicate);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1748490695) {
                    int i3 = 769982780 ^ i2;
                    Optional findFirst = filter.findFirst();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -119525416) {
                        int i4 = 688366706 ^ i3;
                        return findFirst;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -119525416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (60297824 ^ i3)) {
                            break;
                        }
                    }
                    int i5 = 56079869 ^ i3;
                    throw new RuntimeException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1327690679 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1900758879 ^ i2)) {
                int i6 = 1920537544 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1748490695 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2143925571 ^ i2)) {
                    int i7 = 411918772 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -690837022 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1729562440 ^ i2)) {
                        int i8 = 1666800488 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1498374834 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (359120298 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i9 = 329235272 ^ i2;
        throw new RuntimeException();
    }

    public boolean kickMember(java.util.UUID r5, java.util.UUID r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.models.Team.kickMember(java.util.UUID, java.util.UUID, int):boolean");
    }

    public void chat(org.bukkit.entity.Player r6, java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.models.Team.chat(org.bukkit.entity.Player, java.lang.String):void");
    }

    private boolean removeMember(UUID uuid, int i) {
        int i2 = 988566575 ^ (729584099 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1668728217) {
            int i3 = 1670165314 ^ i2;
            return this.members.removeIf(teamMember -> {
                int i4 = 1985932588 ^ (2091825566 ^ 2127027728);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1581492973) {
                    int i5 = 2116447198 ^ i4;
                    return teamMember.getMemberID(629337533).equals(uuid);
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1351551968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (980488304 ^ i4)) {
                        int i6 = 2111367260 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1581492973 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2090925541 ^ i4)) {
                            break;
                        }
                    }
                }
                int i7 = 433874342 ^ i4;
                throw new IllegalAccessException();
            });
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1668728217 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1017626808 ^ i2)) {
                int i4 = 1249554712 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2131976074 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (728890993 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 359066734 ^ i2;
        throw new RuntimeException();
    }

    public boolean updateMemberPermissions(java.util.UUID r6, java.util.UUID r7, com.kammoun.donutCore.team.models.Enums.Permissions r8, boolean r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.models.Team.updateMemberPermissions(java.util.UUID, java.util.UUID, com.kammoun.donutCore.team.models.Enums.Permissions, boolean, int):boolean");
    }

    public void leaveTeam(UUID uuid, int i) {
        int i2 = 899007843 ^ (1301165844 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 791640130) {
            i2 = 1693346480 ^ i2;
            removeMember(uuid, 328208668);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 140258753) {
                int i3 = 1846328155 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 791640130 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2007411598 ^ i2)) {
                int i4 = 1909673463 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2017064730 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (602421447 ^ i2)) {
                    int i5 = 1905312243 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 140258753 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (771701152 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1832705526 ^ i2;
        throw new IllegalAccessException();
    }

    public java.util.concurrent.CopyOnWriteArrayList getMembers(com.kammoun.donutCore.team.models.Enums.TeamSort r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.models.Team.getMembers(com.kammoun.donutCore.team.models.Enums.TeamSort, int):java.util.concurrent.CopyOnWriteArrayList");
    }

    public boolean isMember(UUID uuid, int i) {
        int i2 = 1947649472 ^ (87155236 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1724503258) {
            i2 = 210656236 ^ i2;
            if (isLeader(uuid, 1680523716) == (1079468407 ^ i2)) {
                int i3 = 1496274748 ^ i2;
                return this.members.stream().anyMatch(teamMember -> {
                    int i4 = 432131833 ^ (1456990464 ^ 2127027728);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1903177911) {
                        int i5 = 1240815424 ^ i4;
                        return teamMember.getMemberID(629337533).equals(uuid);
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1054509749 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1475489644 ^ i4)) {
                            int i6 = 1633266345 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1903177911 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1197684748 ^ i4)) {
                                break;
                            }
                        }
                    }
                    int i7 = 1191426479 ^ i4;
                    throw new IllegalAccessException();
                });
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 45812666) {
                return (byte) (379947473 ^ (1458759847 ^ i2));
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 45812666 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1816118980 ^ i2)) {
                int i4 = 811306198 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1724503258 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (766559810 ^ i2)) {
                    int i5 = 784769481 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -876498344 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (571748856 ^ i2)) {
                        int i6 = 1658876851 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1255387520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1391163019 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 812336051 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public UUID getTeamID(int i) {
        int i2 = 201519757 ^ (763090244 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -465971792) {
            int i3 = 33776552 ^ i2;
            return this.teamID;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -199046928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1147260498 ^ i2)) {
                int i4 = 281850436 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -465971792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (93870372 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1903482231 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public String getTeamName() {
        int i = 292772297 ^ (425286102 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1365185791) {
            int i2 = 1287817038 ^ i;
            return this.teamName;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -927673997 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1452656018 ^ i)) {
                int i3 = 1787227056 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1365185791 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (577344120 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 747646252 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public UUID getLeaderID(int i) {
        int i2 = 270150749 ^ (1415880508 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -872058637) {
            int i3 = 529187460 ^ i2;
            return this.leaderID;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -872058637 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (171817721 ^ i2)) {
                int i4 = 1608166030 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 810771667 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1582097239 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1652687671 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public Klocation getHomeLocation(int i) {
        int i2 = 998724580 ^ (906067012 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2084464903) {
            int i3 = 1137124586 ^ i2;
            return this.homeLocation;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2084464903 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (523429126 ^ i2)) {
                int i4 = 1449293400 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1644645973 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1943779460 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 287950512 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isPvpEnabled(int i) {
        int i2 = 1577307324 ^ (2121450946 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -327639032) {
            int i3 = 1920635800 ^ i2;
            return this.pvpEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2141994187 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1824383195 ^ i2)) {
                int i4 = 457722643 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -327639032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2138957456 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1544237440 ^ i2;
        throw new IOException();
    }

    @Generated
    public CopyOnWriteArrayList getMembers(int i) {
        int i2 = 1816531136 ^ (321564020 ^ 1040063871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 345310810) {
            int i3 = 1899126862 ^ i2;
            return this.members;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1660550103 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (289499992 ^ i2)) {
                int i4 = 793299388 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 345310810 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (367697755 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 132594052 ^ i2;
        throw new IllegalAccessException();
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
        mdohragyqb = wwpgdrgzrnnxinq();
        f11945wg3mLgEM = 860959620 ^ new Random(-1611403870302757842L).nextInt();
    }

    public static String wodcgxyznu(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ mdohragyqb[i3 % mdohragyqb.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] wwpgdrgzrnnxinq() {
        return new byte[]{95, 71, 34, 125, 69, 102, 20, 84, 1, 85, 60, 35, 79, 118, Byte.MAX_VALUE, 120, 116, Byte.MAX_VALUE, 109, 66, 38, 49, 16, 70, 88, Byte.MAX_VALUE, 122, 110, 95, 116, 21, 114, 26, 109, 87, 28, 44, 87, 54, 36, 53, 125, 101, 8, 72, 66, 69, 34, 22, 12, 77, 26, 7, 7, 24, 42, 124, 7, 6, 64, 17, 91, 3, 23, 70, 126, 34, 65, 43, 76, 64, 2, 50, 1, 8, 80, 101, 60, 54, 56, 103, 34, 69, 40, 14, 43, 45, 97, 93, 43, 43};
    }

    private static int rzeacqmbxwapxeoj(int i, int i2) {
        return i ^ i2;
    }
}
