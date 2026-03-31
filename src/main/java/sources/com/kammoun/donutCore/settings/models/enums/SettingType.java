package com.kammoun.donutCore.settings.models.enums;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import lombok.Generated;

public final class SettingType {
    public static final SettingType PUBLIC_CHAT;
    public static final SettingType PRIVATE_MESSAGES;
    public static final SettingType CHAT_SERVER_MESSAGES;
    public static final SettingType HOTBAR_SERVER_MESSAGES;
    public static final SettingType TEAM_CHAT;
    public static final SettingType PAY_ALERTS;
    public static final SettingType BOUNTY_ALERTS;
    public static final SettingType AUCTION_ALERTS;
    public static final SettingType SOUNDS_NOTIFICATIONS;
    public static final SettingType ORDER_NOTIFICATIONS;
    public static final SettingType FAST_CRYSTALS;
    public static final SettingType TOTEM_PARTICLES;
    public static final SettingType EXPLOSION_PARTICLES;
    public static final SettingType EXPLOSION_SOUNDS;
    public static final SettingType CHAINMAIL_ON_RESPAWN;
    public static final SettingType DUELS_REQUESTS;
    public static final SettingType TPA_REQUESTS;
    public static final SettingType TPA_HERE_REQUESTS;
    public static final SettingType TEAM_INVITES;
    public static final SettingType PAYMENTS;
    public static final SettingType TPA_CONFIRM_MENU;
    public static final SettingType PLAYER_VISIBILITY;
    public static final SettingType SCOREBOARD;
    public static final SettingType WORTH_DISPLAY;
    public static final SettingType QUICK_AUCTION_BUY;
    public static final SettingType AFTER_DUEL_SONGS;
    public static final SettingType DISABLE_MOB_SPAWNS;
    public static final SettingType EXAMPLE_1;
    public static final SettingType EXAMPLE_2;
    public static final SettingType EXAMPLE_3;
    public static final SettingType EXAMPLE_4;
    public static final SettingType EXAMPLE_5;
    public static final SettingType EXAMPLE_6;
    public static final SettingType EXAMPLE_7;
    public static final SettingType EXAMPLE_8;
    public static final SettingType EXAMPLE_9;
    public static final SettingType EXAMPLE_10;
    public static final SettingType EXAMPLE_11;
    public static final SettingType EXAMPLE_12;
    public static final SettingType EXAMPLE_13;
    public static final SettingType EXAMPLE_14;
    public static final SettingType EXAMPLE_15;
    public static final SettingType EXAMPLE_16;
    public static final SettingType EXAMPLE_17;
    public static final SettingType EXAMPLE_18;
    public static final SettingType EXAMPLE_19;
    public static final SettingType EXAMPLE_20;
    private final String key;
    private final SettingCategory category;
    private final boolean internallyHandled;
    private static final SettingType[] $VALUES;

    public static final class SettingCategory {
        public static final SettingCategory CHAT;
        public static final SettingCategory ALERTS;
        public static final SettingCategory COMBAT;
        public static final SettingCategory REQUESTS;
        public static final SettingCategory VISUAL;
        public static final SettingCategory GAMEPLAY;
        private static final SettingCategory[] $VALUES;

        public static SettingCategory[] values() {
            int i = 1624234879 ^ (1520576731 ^ (1559386338 ^ 822786559));
            return (SettingCategory[]) $VALUES.clone();
        }

        public static SettingCategory valueOf(String str) {
            int i = 907871678 ^ (1905863271 ^ 822786559);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1267420877) {
                int i2 = 1789490093 ^ i;
                return (SettingCategory) Enum.valueOf(SettingCategory.class, str);
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -515953576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (144964422 ^ i)) {
                    int i3 = 244699226 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1267420877 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (750207721 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1750383451 ^ i;
            throw new RuntimeException();
        }

        private SettingCategory(String str, int i) {
            int i2 = 1415564549 ^ (300291934 ^ 969276617);
            int parseInt = 1110043107 ^ (1002844699 ^ Integer.parseInt("93584746"));
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                    case 19986118:
                        int i3 = 476269935 ^ parseInt;
                        return;
                    case 330114141:
                    case 470466734:
                        return;
                    case 2132324656:
                    default:
                        throw new IOException();
                }
            }
        }

        private static SettingCategory[] $values() {
            int i = 1360670568 ^ (1139209556 ^ (1287793806 ^ 822786559));
            SettingCategory[] settingCategoryArr = new SettingCategory[(byte) (1865699147 ^ i)];
            settingCategoryArr[(byte) (1865699149 ^ i)] = CHAT;
            settingCategoryArr[(byte) (1865699148 ^ i)] = ALERTS;
            settingCategoryArr[(byte) (1865699151 ^ i)] = COMBAT;
            settingCategoryArr[(byte) (1865699150 ^ i)] = REQUESTS;
            settingCategoryArr[(byte) (1865699145 ^ i)] = VISUAL;
            settingCategoryArr[(byte) (1865699144 ^ i)] = GAMEPLAY;
            return settingCategoryArr;
        }

        static {
            int parseInt = 2141807853 ^ (1315932813 ^ (1990647979 ^ Integer.parseInt("93584746")));
            CHAT = new SettingCategory(cqigwukjzj(dphrdzlhhclgjlq(), dtwfuegxaixzznx(), parseInt), (byte) (1123283873 ^ parseInt));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) != 396336394) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 396336394 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1955860750 ^ parseInt)) {
                        break;
                    }
                }
                int i = 1229032637 ^ parseInt;
                throw new IllegalAccessException("double");
            }
            int i2 = 70899267 ^ parseInt;
            ALERTS = new SettingCategory(cqigwukjzj(jlrmvarwlqhanti(), dtwfuegxaixzznx(), i2), (byte) (1187653091 ^ i2));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 911290130) {
                i2 = 1710186565 ^ i2;
                COMBAT = new SettingCategory(cqigwukjzj(mfgkyivffroxssg(), dtwfuegxaixzznx(), i2), (byte) (589645221 ^ i2));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 422194489) {
                    int i3 = 791699173 ^ i2;
                    REQUESTS = new SettingCategory(cqigwukjzj(byjzuyikyoqbxqv(), dtwfuegxaixzznx(), i3), (byte) (202709825 ^ i3));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1621678608) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1621678608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (269040844 ^ i3)) {
                                break;
                            }
                        }
                        int i4 = 1297547337 ^ i3;
                        throw new RuntimeException("double");
                    }
                    int i5 = 377202861 ^ i3;
                    VISUAL = new SettingCategory(cqigwukjzj(aghwfwmilmmcdxp(), dtwfuegxaixzznx(), i5), (byte) (443462635 ^ i5));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -747266184) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -747266184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (95475928 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 464290598 ^ i5;
                        throw new RuntimeException("double");
                    }
                    i2 = 1775880075 ^ i5;
                    GAMEPLAY = new SettingCategory(cqigwukjzj(ntotxgegehnbpmf(), dtwfuegxaixzznx(), i2), (byte) (1941402721 ^ i2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1648647389) {
                        int i7 = 1151889882 ^ i2;
                        $VALUES = $values();
                        return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 422194489 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1001400090 ^ i2)) {
                    int i8 = 267126264 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1648647389 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1615360177 ^ i2)) {
                        int i9 = 778249800 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 911290130 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1656266772 ^ i2)) {
                            break;
                        }
                    }
                }
            }
            int i10 = 1627013259 ^ i2;
            throw new RuntimeException();
        }

        public static String cqigwukjzj(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] dtwfuegxaixzznx() {
            return new byte[]{36, 83, 103, 30, 91, 80, 73, 103, 64, 13, 31, 15, 62, 79, 39, 56, 108, 28, 109, 49, 23, 124, 35, 57, 90, 111, 23, 15, 27, 125, 20, 58, 43, 12, 73, 59, 42, 9, 54, 42, 101, 115, 60, 73, 121, 90, 17, 14, 53, 74, 11, 21, 85, 29, 49, 105, 40, 14, 52, 47, 55, 27, 57, 96, 15, 36, 35, 14, 16, 63};
        }

        private static byte[] jlrmvarwlqhanti() {
            return new byte[]{-21, -99, 95, 104, 109, 41, 122, 18, 121, 111, 46, 106, 6, 43};
        }

        private static byte[] ntotxgegehnbpmf() {
            return new byte[]{-21, -107, 83, 104, 111, 33, 123, 29, 114, 124, 46, 102, 10, 50, 19, 73, 94, 114};
        }

        private static byte[] mfgkyivffroxssg() {
            return new byte[]{-17, -108, 94, 107, 111, 42, 123, 24, 115, 122, 39, 119, 8, 47};
        }

        private static byte[] aghwfwmilmmcdxp() {
            return new byte[]{-18, -104, 84, 124, 109, 43, Byte.MAX_VALUE, 7, 121, 108, 43, 125, 10, 53};
        }

        private static byte[] dphrdzlhhclgjlq() {
            return new byte[]{-21, -99, 85, 110, 105, 32, 122, 30, 119, 106};
        }

        private static byte[] byjzuyikyoqbxqv() {
            return new byte[]{-24, -100, 85, 123, 107, 44, 113, 4, 118, 106, 47, 120, 9, 44, 30, 84, 94, 121};
        }
    }

    public static SettingType[] values() {
        int i = 1893036112 ^ (284925411 ^ (597116958 ^ 657057341));
        return (SettingType[]) $VALUES.clone();
    }

    public static SettingType valueOf(String str) {
        int i = 1526887081 ^ (809943217 ^ 657057341);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1667932458) {
            int i2 = 1595270749 ^ i;
            return (SettingType) Enum.valueOf(SettingType.class, str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1667932458 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1572078930 ^ i)) {
                int i3 = 143462798 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1681550400 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1226058167 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1333899168 ^ i;
        throw new RuntimeException();
    }

    private SettingType(String str, int i, String str2, SettingCategory settingCategory, boolean z) {
        fnurcvcivitbiepi(1755774395 ^ 704647647, 447541494);
        int parseInt = 894557227 ^ (2086275022 ^ (272356506 ^ (1855508299 ^ Integer.parseInt("648611651"))));
        this.key = str2;
        this.category = settingCategory;
        this.internallyHandled = z;
        int i2 = 1172864163 ^ (553989004 ^ (304440381 ^ parseInt));
    }

    public static SettingType fromKey(String str) {
        int i = 1279606991 ^ (1223422031 ^ 657057341);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 473609705) {
            i = 1438646856 ^ i;
            SettingType[] values = values();
            int length = values.length;
            int i2 = (byte) (1984386293 ^ i);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1304778837) {
                i = 1162623832 ^ i;
                while (i2 < length) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1738834583) {
                        i = 710910503 ^ i;
                        SettingType settingType = values[i2];
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -895062960) {
                            int i3 = 1259112392 ^ i;
                            if (settingType.key.equalsIgnoreCase(str) == (1381517890 ^ i3)) {
                                i = 1253860726 ^ i3;
                                i2 += 417607477 ^ i;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -954107488) {
                                }
                                while (true) {
                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                                        case 3802000:
                                            i = 1345993016 ^ i;
                                            break;
                                        case 750686877:
                                        case 1044389556:
                                            break;
                                    }
                                }
                                try {
                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i) != 221119081) {
                                        throw null;
                                    }
                                    throw new RuntimeException();
                                } catch (RuntimeException e) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                        case 1020868130:
                                            i = 926071197 ^ i;
                                            break;
                                        case 1190178914:
                                            i = fnurcvcivitbiepi(i, 947358037);
                                            break;
                                        default:
                                            throw new RuntimeException("Error in hash");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -2058552629) {
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                                            case 172545045:
                                                i = 1134751988 ^ i;
                                                break;
                                            case 584386719:
                                            case 1380958519:
                                                break;
                                        }
                                    }
                                }
                            } else {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1832758766) {
                                    int i4 = 1035823410 ^ i3;
                                    return settingType;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1190178914 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (31089647 ^ i3)) {
                                        int i5 = 1304366009 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1832758766 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (413707062 ^ i3)) {
                                            int i6 = 1006470133 ^ i3;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1738834583 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (769003400 ^ i)) {
                            int i7 = 1376112012 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 151617792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (888332394 ^ i)) {
                                int i8 = 722674726 ^ i;
                                throw new IOException("double");
                            }
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                        case 48634708:
                            int i9 = 841637773 ^ i;
                            break;
                        case 721682927:
                        case 1536426367:
                            break;
                    }
                }
                return null;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1304778837 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1093089696 ^ i)) {
                    int i10 = 551914542 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2133400451 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1418063633 ^ i)) {
                        int i11 = 1414116228 ^ i;
                        throw new IOException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -895062960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (14015194 ^ i)) {
                int i12 = 1096188094 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2058552629 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1635132245 ^ i)) {
                    int i13 = 1830391027 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -954107488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (605630687 ^ i)) {
                        int i14 = 1047281605 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1020868130 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (252817285 ^ i)) {
                            int i15 = 773185210 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 473609705 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (829537819 ^ i)) {
                                int i16 = 309955746 ^ i;
                                throw new IOException();
                            }
                        }
                    }
                }
            }
        }
    }

    @Generated
    public String getKey() {
        int i = 1801927057 ^ (162176197 ^ 196391699);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1271444027) {
            int i2 = 1711315760 ^ i;
            return this.key;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1271444027 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2084903943 ^ i)) {
                int i3 = 1877555636 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2076994488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (671005438 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 659506821 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public SettingCategory getCategory() {
        int i = 49491662 ^ (1942904935 ^ 196391699);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -732959277) {
            int i2 = 1802849335 ^ i;
            return this.category;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1880781720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1390917029 ^ i)) {
                int i3 = 1836155627 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -732959277 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1217832084 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 72847588 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public boolean isInternallyHandled() {
        int i = 2031338480 ^ (238906833 ^ 196391699);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -456070765) {
            int i2 = 1473117248 ^ i;
            return this.internallyHandled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -456070765 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1740258951 ^ i)) {
                int i3 = 547205564 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1522469777 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2130137095 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1444724999 ^ i;
        throw new IOException();
    }

    private static SettingType[] $values() {
        int i = 1874864624 ^ (736687793 ^ (1608392768 ^ 657057341));
        SettingType[] settingTypeArr = new SettingType[(byte) (1021253907 ^ i)];
        settingTypeArr[(byte) (1021253948 ^ i)] = PUBLIC_CHAT;
        settingTypeArr[(byte) (1021253949 ^ i)] = PRIVATE_MESSAGES;
        settingTypeArr[(byte) (1021253950 ^ i)] = CHAT_SERVER_MESSAGES;
        settingTypeArr[(byte) (1021253951 ^ i)] = HOTBAR_SERVER_MESSAGES;
        settingTypeArr[(byte) (1021253944 ^ i)] = TEAM_CHAT;
        settingTypeArr[(byte) (1021253945 ^ i)] = PAY_ALERTS;
        settingTypeArr[(byte) (1021253946 ^ i)] = BOUNTY_ALERTS;
        settingTypeArr[(byte) (1021253947 ^ i)] = AUCTION_ALERTS;
        settingTypeArr[(byte) (1021253940 ^ i)] = SOUNDS_NOTIFICATIONS;
        settingTypeArr[(byte) (1021253941 ^ i)] = ORDER_NOTIFICATIONS;
        settingTypeArr[(byte) (1021253942 ^ i)] = FAST_CRYSTALS;
        settingTypeArr[(byte) (1021253943 ^ i)] = TOTEM_PARTICLES;
        settingTypeArr[(byte) (1021253936 ^ i)] = EXPLOSION_PARTICLES;
        settingTypeArr[(byte) (1021253937 ^ i)] = EXPLOSION_SOUNDS;
        settingTypeArr[(byte) (1021253938 ^ i)] = CHAINMAIL_ON_RESPAWN;
        settingTypeArr[(byte) (1021253939 ^ i)] = DUELS_REQUESTS;
        settingTypeArr[(byte) (1021253932 ^ i)] = TPA_REQUESTS;
        settingTypeArr[(byte) (1021253933 ^ i)] = TPA_HERE_REQUESTS;
        settingTypeArr[(byte) (1021253934 ^ i)] = TEAM_INVITES;
        settingTypeArr[(byte) (1021253935 ^ i)] = PAYMENTS;
        settingTypeArr[(byte) (1021253928 ^ i)] = TPA_CONFIRM_MENU;
        settingTypeArr[(byte) (1021253929 ^ i)] = PLAYER_VISIBILITY;
        settingTypeArr[(byte) (1021253930 ^ i)] = SCOREBOARD;
        settingTypeArr[(byte) (1021253931 ^ i)] = WORTH_DISPLAY;
        settingTypeArr[(byte) (1021253924 ^ i)] = QUICK_AUCTION_BUY;
        settingTypeArr[(byte) (1021253925 ^ i)] = AFTER_DUEL_SONGS;
        settingTypeArr[(byte) (1021253926 ^ i)] = DISABLE_MOB_SPAWNS;
        settingTypeArr[(byte) (1021253927 ^ i)] = EXAMPLE_1;
        settingTypeArr[(byte) (1021253920 ^ i)] = EXAMPLE_2;
        settingTypeArr[(byte) (1021253921 ^ i)] = EXAMPLE_3;
        settingTypeArr[(byte) (1021253922 ^ i)] = EXAMPLE_4;
        settingTypeArr[(byte) (1021253923 ^ i)] = EXAMPLE_5;
        settingTypeArr[(byte) (1021253916 ^ i)] = EXAMPLE_6;
        settingTypeArr[(byte) (1021253917 ^ i)] = EXAMPLE_7;
        settingTypeArr[(byte) (1021253918 ^ i)] = EXAMPLE_8;
        settingTypeArr[(byte) (1021253919 ^ i)] = EXAMPLE_9;
        settingTypeArr[(byte) (1021253912 ^ i)] = EXAMPLE_10;
        settingTypeArr[(byte) (1021253913 ^ i)] = EXAMPLE_11;
        settingTypeArr[(byte) (1021253914 ^ i)] = EXAMPLE_12;
        settingTypeArr[(byte) (1021253915 ^ i)] = EXAMPLE_13;
        settingTypeArr[(byte) (1021253908 ^ i)] = EXAMPLE_14;
        settingTypeArr[(byte) (1021253909 ^ i)] = EXAMPLE_15;
        settingTypeArr[(byte) (1021253910 ^ i)] = EXAMPLE_16;
        settingTypeArr[(byte) (1021253911 ^ i)] = EXAMPLE_17;
        settingTypeArr[(byte) (1021253904 ^ i)] = EXAMPLE_18;
        settingTypeArr[(byte) (1021253905 ^ i)] = EXAMPLE_19;
        settingTypeArr[(byte) (1021253906 ^ i)] = EXAMPLE_20;
        return settingTypeArr;
    }

    static {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.models.enums.SettingType.m334clinit():void");
    }

    public static String zahiezwmqv(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] hbhzpfevpajvkkm() {
        return new byte[]{47, 37, 12, 1, 35, 39, 8, 88, 79, 6, 28, 57, 121, 75, 74, 67, 36, 3, 117, 24, 6, 108, 97, 61, 97, 88, 92, 24, 93, 2, 51, 22, 66, 29, 62, 31, 95, 9, 12, 31, 3, 34, 27, 3, 106, 116, 42, 60, 19, 60, 34, 67, 100, 39, 27, 80, 11, 118, 109, 113, 32, 22, 18, 97, 110, 81, 22, 103, 114, 55, 21, 104, 102, 23, 27, 53, 30, 81, 31, 1};
    }

    private static byte[] fmdojjuzvqnadxa() {
        return new byte[]{-25, -24, 57, 105, 21, 95, 62, 42, 126, 105, 46, 73, 65, 47, 126, 42, 23, 100, 67, 99, 51, 7, 87, 64, 87, 41, 109, 103, 111, 123, 11, 105, 118, Byte.MAX_VALUE, 13, 119};
    }

    private static byte[] hzmmytaqyeoucyw() {
        return new byte[]{-25, -24, 57, 73, 21, Byte.MAX_VALUE, 62, 10, 126, 73, 46, 105, 65, 15, 126, 42, 23, 68, 67, 67, 51, 39, 87, 96, 87, 9, 109, 71, 111, 91, 11, 73, 118, 95, 13, 87};
    }

    private static byte[] glyhjlmbnnjytgd() {
        return new byte[]{-29, -20, 57, 105, 19, 83, 62, 48, 121, 107, 42, 77, 65, 55, Byte.MAX_VALUE, 48, 21, 103, 71, 122, 51, 7};
    }

    private static byte[] ulxwoshoxnvugpr() {
        return new byte[]{-29, -20, 57, 73, 19, 115, 62, 16, 121, 107, 42, 109, 65, 23, Byte.MAX_VALUE, 16, 21, 71, 71, 90, 51, 39};
    }

    private static byte[] ihikubfhxfafqiy() {
        return new byte[]{-32, -24, 57, 100, 26, 85, 60, 44, 124, 122, 45, 84, 76, 57, 115, 60, 16, 119, 70, 125};
    }

    private static byte[] itkadxfsgspchdd() {
        return new byte[]{-32, -24, 57, 68, 26, 117, 60, 12, 124, 90, 45, 84, 76, 25, 115, 28, 16, 87, 70, 93};
    }

    private static byte[] ycjgwflabojibcn() {
        return new byte[]{-32, -19, 56, 103, 23, 83, 63, 36, 126, 101, 45, 75, 77, 60, 126, 59, 19, 113, 68, 123, 55, 31};
    }

    private static byte[] xlaaljqehywwbzl() {
        return new byte[]{-32, -19, 56, 71, 23, 115, 63, 4, 126, 69, 45, 107, 77, 28, 126, 27, 19, 81, 68, 91, 55, 63};
    }

    private static byte[] vwqaxofjnzhbzvy() {
        return new byte[]{-32, -21, 59, 101, 19, 89, 48, 57, 125, 125, 45, 76, 78, 47, 122, 45, 28, 121, 71, 98, 55, 9, 86, 67, 81, 47, 100, 101, 111, 116, 2, 102, 117, 126, 14, 103, 103, 114, 62, 100, 50, 64};
    }

    private static byte[] jisrtkioyjyhwwy() {
        return new byte[]{-32, -21, 59, 69, 19, 121, 48, 25, 125, 93, 45, 108, 78, 15, 122, 45, 28, 89, 71, 66, 55, 41, 86, 99, 81, 15, 100, 69, 111, 84, 2, 70, 117, 94, 14, 71, 103, 82, 62, 68, 50, 96};
    }

    private static byte[] kyadyaqysgqemgi() {
        return new byte[]{-25, -29, 61, 116, 22, 64, 58, 44, 125, 100, 37, 65, 77, 49, 120, 63, 19, 110, 67, 96, 55, 20, 84, 74, 83, 61, 110, 122, 100, 96};
    }

    private static byte[] txmcbzplhppbxyq() {
        return new byte[]{-25, -29, 61, 84, 22, 96, 58, 12, 125, 68, 37, 97, 77, 17, 120, 31, 19, 110, 67, 64, 55, 52, 84, 106, 83, 29, 110, 90, 100, 64};
    }

    private static byte[] eombvmbubwdyful() {
        return new byte[]{-24, -30, 59, 124, 19, 69, 56, 37, 126, 115, 36, 93, 64, 36, 125, 33, 28, 119, 76, 113, 49, 0, 81, 79, 81, 51, 109, 117, 101, 102};
    }

    private static byte[] lstoasxkvwexbwl() {
        return new byte[]{-24, -30, 59, 92, 19, 101, 56, 5, 126, 83, 36, 125, 64, 36, 125, 1, 28, 87, 76, 81, 49, 32, 81, 111, 81, 19, 109, 85, 101, 70};
    }

    private static byte[] kkbawmrukhibmjz() {
        return new byte[]{-32, -17, 58, 118, 23, 78, 58, 32, 126, 123, 45, 92, 79, 53, 126, 55, 22, 101, 68, 25, 55, 105};
    }

    private static byte[] awocvvimncdtayi() {
        return new byte[]{-32, -17, 58, 86, 23, 110, 58, 0, 126, 91, 45, 124, 79, 21, 126, 23, 22, 101, 68, 25, 55, 105};
    }

    private static byte[] xkmmbhafefnlhes() {
        return new byte[]{-28, -20, 61, 109, 18, 65, 60, 40, 118, 108, 42, 64, 65, 63, 124, 37, 21, Byte.MAX_VALUE, 64, 113, 55, 6, 80, 78, 85, 56, 101, 120, 107, 118, 11, 116, 116, 125, 15, 117};
    }

    private static byte[] qwcaftcasltrkmo() {
        return new byte[]{-28, -20, 61, 77, 18, 97, 60, 8, 118, 108, 42, 96, 65, 31, 124, 5, 21, 95, 64, 113, 55, 38, 80, 110, 85, 24, 101, 88, 107, 86, 11, 84, 116, 93, 15, 85};
    }

    private static byte[] ohutmvhiufzsfwp() {
        return new byte[]{-29, -30, 52, 116, 19, 94, 63, 42, 125, 96, 36, 94, 79, 40, 123, 49, 23, 99, 71, 118, 62, 31, 81, 94, 86, 52, 110, 103, 101, Byte.MAX_VALUE, 5, 117, 115, 121, 13, 108, 109, 118, 52, 108, 51, 64};
    }

    private static byte[] jchsqogsknzsgno() {
        return new byte[]{-29, -30, 52, 84, 19, 126, 63, 10, 125, 64, 36, 94, 79, 8, 123, 17, 23, 67, 71, 86, 62, 63, 81, 126, 86, 52, 110, 71, 101, 95, 5, 85, 115, 89, 13, 76, 109, 86, 52, 76, 51, 96};
    }

    private static byte[] clnsqjxxcaehcyt() {
        return new byte[]{-28, -18, 59, 96, 27, 76, 62, 33, 124, 101, 40, 79, 72, 39, 115, 48, 20, 111, 64, 97, 49, 24, 89, 87, 87, 59, 111, 108, 105, 114, 2, 107, 123, 120};
    }

    private static byte[] vhhhwjrxwjybquu() {
        return new byte[]{-28, -18, 59, 64, 27, 108, 62, 1, 124, 69, 40, 111, 72, 7, 115, 16, 20, 111, 64, 65, 49, 56, 89, 119, 87, 27, 111, 76, 105, 82, 2, 75, 123, 88};
    }

    private static byte[] wcqywihakoedcol() {
        return new byte[]{-30, -21, 52, 125, 22, 75, 58, 45, 118, 120, 45, 81, 64, 50, 126, 52, 16, 101, 70, 24, 62, 98};
    }

    private static byte[] adzdlefdiuomwpo() {
        return new byte[]{-30, -21, 52, 93, 22, 107, 58, 13, 118, 88, 45, 113, 64, 18, 126, 20, 16, 101, 70, 24, 62, 98};
    }

    private static byte[] dzuiywwgkuajekd() {
        return new byte[]{-32, -21, 59, 118, 22, 84, 49, 56, 125, 116, 45, 90, 78, 34, Byte.MAX_VALUE, 50, 29, 98, 71, 106, 55, 17, 86, 84, 84, 62, 101, 99, 111, 123, 2, 96, 117, 120};
    }

    private static byte[] zwlohdqinjlwdhc() {
        return new byte[]{-32, -21, 59, 86, 22, 116, 49, 24, 125, 84, 45, 122, 78, 34, Byte.MAX_VALUE, 18, 29, 66, 71, 74, 55, 49, 86, 84, 84, 30, 101, 67, 111, 91, 2, 64, 117, 88};
    }

    private static byte[] xdwgizcsaqbklfs() {
        return new byte[]{-32, -17, 57, 112, 21, 70, 48, 40, 118, 115, 45, 92, 76, 51, 124, 63, 28, 109, 76, 17, 55, 106};
    }

    private static byte[] qiudkwpyklktulh() {
        return new byte[]{-32, -17, 57, 80, 21, 102, 48, 8, 118, 83, 45, 124, 76, 19, 124, 31, 28, 109, 76, 17, 55, 106};
    }

    private static byte[] dngyfpqitvvibqm() {
        return new byte[]{-32, -17, 56, 118, 20, 86, 57, 43, 118, 126, 45, 66, 77, 50, 125, 59, 21, 120, 76, 101, 55, 6, 85, 70, 86, 47, 109, 117, 100, 97, 2, 102, 118, 122, 9, 118, 110, 122, 53, 121, 50, 89};
    }

    private static byte[] fohecokpqhawjkg() {
        return new byte[]{-32, -17, 56, 86, 20, 118, 57, 11, 118, 94, 45, 98, 77, 18, 125, 27, 21, 88, 76, 69, 55, 6, 85, 102, 86, 15, 109, 117, 100, 65, 2, 70, 118, 90, 9, 86, 110, 90, 53, 89, 50, 121};
    }

    private static byte[] ibfvwzrkeislryb() {
        return new byte[]{-25, -19, 57, 98, 16, 68, 48, 35, 123, 124, 43, 69, 74, 59, 124, 36, 29, 116, 67, 103, 51, 30, 82, 95};
    }

    private static byte[] khhpffonasqmmeh() {
        return new byte[]{-25, -19, 57, 66, 16, 100, 48, 3, 123, 92, 43, 101, 74, 27, 124, 36, 29, 84, 67, 71, 51, 62, 82, Byte.MAX_VALUE};
    }

    private static byte[] qtnbolgegcccluz() {
        return new byte[]{-24, -24, 62, 119, 17, 78, 61, 40, 122, 114, 46, 91, 74, 53, 123, 51, 21, 105, 76, 27};
    }

    private static byte[] gyicmqdqcymtvvt() {
        return new byte[]{-24, -24, 62, 87, 17, 110, 61, 8, 122, 82, 46, 123, 74, 21, 123, 19, 21, 105, 76, 27};
    }

    private static byte[] rnmynqdekfysgql() {
        return new byte[]{-24, -22, 52, 112, 20, 76, 60, 46, 118, 123, 36, 93, 78, 52, 126, 49, 29, 108, 77, 30};
    }

    private static byte[] xrowmonxehpgjdz() {
        return new byte[]{-24, -22, 52, 80, 20, 108, 60, 14, 118, 91, 36, 125, 78, 20, 126, 17, 29, 108, 77, 30};
    }

    private static byte[] eksjyrofptaxoud() {
        return new byte[]{-26, -23, 60, 104, 16, 83, 49, 48, 121, 124, 47, 76, 64, 54, Byte.MAX_VALUE, 46, 21, 102};
    }

    private static byte[] aucwxyahtnkgrzm() {
        return new byte[]{-26, -23, 60, 72, 16, 115, 49, 16, 121, 92, 47, 108, 64, 22, Byte.MAX_VALUE, 14, 21, 70};
    }

    private static byte[] auoceijygsyimny() {
        return new byte[]{-26, -19, 61, 109, 22, 71, 57, 41, 120, 110, 43, 75, 65, 49, 122, 60, 20, 114, 66, 102, 55, 6, 84, 64, 80, 55, 107, 98, 106, 118, 11, 109, 114, 121};
    }

    private static byte[] qazfmzrdrbzkvsx() {
        return new byte[]{-26, -19, 61, 77, 22, 103, 57, 9, 120, 110, 43, 107, 65, 17, 122, 28, 20, 82, 66, 70, 55, 38, 84, 96, 80, 55, 107, 66, 106, 86, 11, 77, 114, 89};
    }

    private static byte[] ugdqsxbmzlbxrvu() {
        return new byte[]{-32, -29, 56, 119, 21, 76, 61, 41, 124, Byte.MAX_VALUE, 45, 80, 77, 52, 124, 53, 17, 108, 70, 26};
    }

    private static byte[] gkjwigmxttcnein() {
        return new byte[]{-32, -29, 56, 87, 21, 108, 61, 9, 124, 95, 45, 112, 77, 20, 124, 21, 17, 108, 70, 26};
    }

    private static byte[] qsxemowceoauvpl() {
        return new byte[]{-32, -24, 62, 100, 26, 78, 57, 46, 118, 107, 45, 89, 75, 63, 115, 43, 21, 97, 76, 111, 55, 13, 83, 88, 88, 50};
    }

    private static byte[] wvsteqtbdpipaiw() {
        return new byte[]{-32, -24, 62, 68, 26, 110, 57, 14, 118, 107, 45, 121, 75, 31, 115, 11, 21, 65, 76, 79, 55, 45, 83, 120, 88, 18};
    }

    private static byte[] mtcglkprqcdffyh() {
        return new byte[]{-32, -23, 63, 100, 20, 86, 58, 45, Byte.MAX_VALUE, 126, 45, 85, 74, 51, 125, 57, 22, 97, 69, 100, 55, 11, 82, 73, 86, 63};
    }

    private static byte[] gcasnwfhbyfbrbi() {
        return new byte[]{-32, -23, 63, 68, 20, 118, 58, 13, Byte.MAX_VALUE, 94, 45, 85, 74, 19, 125, 25, 22, 65, 69, 68, 55, 43, 82, 105, 86, 31};
    }

    private static byte[] qjotckugfjrvfqm() {
        return new byte[]{-32, -21, 57, 115, 16, 71, 59, 43, 121, 114, 45, 88, 76, 48, 121, 62, 23, 110, 67, 16, 55, 111};
    }

    private static byte[] necyvzifjslmogl() {
        return new byte[]{-32, -21, 57, 83, 16, 103, 59, 11, 121, 82, 45, 120, 76, 16, 121, 30, 23, 110, 67, 16, 55, 111};
    }

    private static byte[] pqwdtqzwvusfbjv() {
        return new byte[]{-29, -21, 53, 124, 17, 70, 48, 46, 125, 113, 45, 82, 75, 38, 121, 53, 22, 126, 71, 125, 63, 23, 83, 72, 89, 35, 110, 105, 108, 122, 1, 112, 113, 108, 12, 98, 109, 118, 53, 126};
    }

    private static byte[] miillgockxhnngt() {
        return new byte[]{-29, -21, 53, 92, 17, 102, 48, 14, 125, 81, 45, 114, 75, 38, 121, 21, 22, 94, 71, 93, 63, 55, 83, 104, 89, 3, 110, 73, 108, 90, 1, 80, 113, 76, 12, 66, 109, 86, 53, 94};
    }

    private static byte[] lxgyylbeyjpdnxq() {
        return new byte[]{-26, -30, 53, 125, 27, 88, 49, 61, Byte.MAX_VALUE, 112, 36, 66, 65, 63, 124, 63, 18, 108, 66, 109, 63, 27, 89, 73, 88, 49, 108, 124, 101, 107, 11, 111, 116, 115, 8, 97, 104, 98};
    }

    private static byte[] fxyivhtczjpclqm() {
        return new byte[]{-26, -30, 53, 93, 27, 120, 49, 29, Byte.MAX_VALUE, 80, 36, 98, 65, 31, 124, 31, 18, 108, 66, 77, 63, 59, 89, 105, 88, 49, 108, 92, 101, 75, 11, 79, 116, 83, 8, 65, 104, 66};
    }

    private static byte[] dgpaxiyyycbkwwk() {
        return new byte[]{-32, -30, 56, 124, 27, 73, 61, 46, 121, Byte.MAX_VALUE, 45, 81, 77, 63, 114, 48, 17, 107, 67, 27};
    }

    private static byte[] lenjzcypothvgug() {
        return new byte[]{-32, -30, 56, 92, 27, 105, 61, 14, 121, 95, 45, 113, 77, 31, 114, 16, 17, 107, 67, 27};
    }

    private static byte[] estzzxokqtyicda() {
        return new byte[]{-32, -19, 57, 119, 26, 84, 61, 51, Byte.MAX_VALUE, 100, 45, 81, 76, 56, 115, 35, 17, 98, 69, 125, 55, 15, 84, 76, 88, 38, 105, 115};
    }

    private static byte[] bemgnbqqfeuqvxy() {
        return new byte[]{-32, -19, 57, 87, 26, 116, 61, 19, Byte.MAX_VALUE, 68, 45, 81, 76, 24, 115, 3, 17, 66, 69, 93, 55, 47, 84, 108, 88, 6, 105, 83};
    }

    private static byte[] tlldsxcccghykja() {
        return new byte[]{-26, -21, 57, 117, 18, 79, 59, 40, 120, 124, 45, 92, 72, 54, 122, 53, 21, 107, 66, 24, 51, 101};
    }

    private static byte[] jhxwvayznpxaxlk() {
        return new byte[]{-26, -21, 57, 85, 18, 111, 59, 8, 120, 92, 45, 124, 72, 22, 122, 21, 21, 107, 66, 24, 51, 101};
    }

    private static byte[] bgqweayewfreiru() {
        return new byte[]{-24, -19, 52, 124, 22, 78, 61, 43, 119, 114, 43, 81, 65, 50, 123, 51, 22, 100, 76, 28};
    }

    private static byte[] gkvhtaggwekupkf() {
        return new byte[]{-24, -19, 52, 92, 22, 110, 61, 11, 119, 82, 43, 113, 65, 18, 123, 19, 22, 100, 76, 28};
    }

    private static byte[] djisuydqhbveuwq() {
        return new byte[]{-32, -30, 53, 99, 17, 89, 59, 63, 122, 107, 45, 73, 64, 33, 120, 54, 23, Byte.MAX_VALUE, 64, 114, 55, 4, 88, 68, 83, 40, 111, 116};
    }

    private static byte[] cvovlxpfjtdfuxr() {
        return new byte[]{-32, -30, 53, 67, 17, 121, 59, 31, 122, 75, 45, 105, 64, 33, 120, 22, 23, 95, 64, 82, 55, 36, 88, 100, 83, 8, 111, 84};
    }

    private static byte[] ifuvqtqwroatdbl() {
        return new byte[]{-32, -18, 63, 118, 19, 79, 60, 45, 119, 115, 45, 93, 74, 53, 122, 54, 16, 104, 77, 17, 55, 108};
    }

    private static byte[] vzyzrivlezlbvkb() {
        return new byte[]{-32, -18, 63, 86, 19, 111, 60, 13, 119, 83, 45, 125, 74, 21, 122, 22, 16, 104, 77, 17, 55, 108};
    }

    private static byte[] zrjynbfwxfvzmne() {
        return new byte[]{-32, -23, 52, 117, 20, 76, 49, 47, Byte.MAX_VALUE, 114, 45, 90, 65, 54, 125, 53, 29, 106, 69, 20};
    }

    private static byte[] pwzkpygrxcmtzmz() {
        return new byte[]{-32, -23, 52, 85, 20, 108, 49, 15, Byte.MAX_VALUE, 82, 45, 122, 65, 22, 125, 21, 29, 106, 69, 20};
    }

    private static byte[] wjghsyeiuyhbviy() {
        return new byte[]{-29, -22, 53, 112, 27, 76, 61, 40, 123, 120, 46, 89, 64, 51, 114, 53, 17, 109, 65, 26, 52, 105};
    }

    private static byte[] reusvxfcrdljhxl() {
        return new byte[]{-29, -22, 53, 80, 27, 108, 61, 8, 123, 88, 46, 121, 64, 19, 114, 21, 17, 109, 65, 26, 52, 105};
    }

    private static byte[] yhbrlhhiqzjbshk() {
        return new byte[]{-27, -19, 62, 118, 27, 79, 48, 44, 123, Byte.MAX_VALUE, 43, 91, 75, 63, 122, 62, 17, 104, 65, 30, 52, 104};
    }

    private static byte[] xwxluygtandjkky() {
        return new byte[]{-27, -19, 62, 86, 27, 111, 48, 12, 123, 95, 43, 123, 75, 31, 122, 30, 17, 104, 65, 30, 52, 104};
    }

    private static byte[] qhsfuhbqooujewp() {
        return new byte[]{-32, -20, 52, 112, 22, 74, 60, 43, 123, 122, 45, 95, 65, 51, Byte.MAX_VALUE, 51, 16, 110, 65, 24, 55, 107};
    }

    private static byte[] ruihtfvuasyktas() {
        return new byte[]{-32, -20, 52, 80, 22, 106, 60, 11, 123, 90, 45, Byte.MAX_VALUE, 65, 19, Byte.MAX_VALUE, 19, 16, 110, 65, 24, 55, 107};
    }

    private static byte[] sgpppvdhvtfhyyh() {
        return new byte[]{-32, -22, 62, 114, 22, 70, 62, 40, 125, 121, 45, 89, 75, 49, Byte.MAX_VALUE, 63, 18, 109, 71, 30};
    }

    private static byte[] tekccexzejlsyqj() {
        return new byte[]{-32, -22, 62, 82, 22, 102, 62, 8, 125, 89, 45, 121, 75, 17, Byte.MAX_VALUE, 31, 18, 109, 71, 30};
    }

    private static byte[] vxpmlbkqvlkfmqf() {
        return new byte[]{-29, -21, 60, 115, 16, 78, 62, 42, 119, 122, 46, 88, 73, 48, 121, 55, 18, 111, 77, 24, 52, 100};
    }

    private static byte[] vmwsgeyjehbnhng() {
        return new byte[]{-29, -21, 60, 83, 16, 110, 62, 10, 119, 90, 46, 120, 73, 16, 121, 23, 18, 111, 77, 24, 52, 100};
    }

    private static byte[] zdjccvubavpevwk() {
        return new byte[]{-32, -22, 57, 102, 20, 64, 60, 35, 125, 114, 45, 66, 76, 34, 125, 48, 16, 100, 71, 108, 55, 8, 84, 66, 86, 37, 104, 100, 111, 106, 2, 100, 119, 126, 9, 116};
    }

    private static byte[] ygpjdnlkgqtmozc() {
        return new byte[]{-32, -22, 57, 70, 20, 96, 60, 3, 125, 82, 45, 98, 76, 34, 125, 16, 16, 68, 71, 76, 55, 40, 84, 98, 86, 5, 104, 68, 111, 106, 2, 68, 119, 94, 9, 84};
    }

    private static byte[] lqgcfjbdyyxsdiq() {
        return new byte[]{-32, -20, 58, 125, 17, 71, 58, 32, 124, 121, 45, 95, 79, 62, 120, 62, 22, 101, 70, 19};
    }

    private static byte[] sfjmpahepoyvzfk() {
        return new byte[]{-32, -20, 58, 93, 17, 103, 58, 0, 124, 89, 45, Byte.MAX_VALUE, 79, 30, 120, 30, 22, 101, 70, 19};
    }

    private static byte[] fzvqxjdhxmhfzos() {
        return new byte[]{-25, -20, 63, 118, 27, 79, 60, 62, 121, 124, 47, 68, 65, 40, 126, 60, 18, 122, 70, 100, 62, 3, 85, 91, 87, 47, 111, 120, 101, 102, 7, 105, 116, 104, 13, 97, 103, 124, 56, 122};
    }

    private static byte[] wardkfksovkkftb() {
        return new byte[]{-25, -20, 63, 86, 27, 111, 60, 30, 121, 92, 47, 100, 65, 8, 126, 28, 18, 90, 70, 68, 62, 3, 85, 123, 87, 15, 111, 88, 101, 70, 7, 73, 116, 72, 13, 65, 103, 92, 56, 90};
    }

    private static byte[] beqmfpecqyrsdez() {
        return new byte[]{-27, -24, 61, 117, 16, 75, 57, 63, 122, 126, 46, 71, 72, 43, 126, 59, 19, 121, 65, 100, 55, 2, 82, 90, 80, 32, 105, 121, 111, 125, 2, 97, 118, Byte.MAX_VALUE};
    }

    private static byte[] msxnuxgkvzahapz() {
        return new byte[]{-27, -24, 61, 85, 16, 107, 57, 31, 122, 94, 46, 103, 72, 11, 126, 27, 19, 89, 65, 68, 55, 2, 82, 122, 80, 0, 105, 89, 111, 93, 2, 65, 118, 95};
    }

    private static byte[] mnfxczadoskkmiw() {
        return new byte[]{-32, -19, 52, 115, 22, 75, 62, 42, 120, 114, 45, 94, 65, 48, Byte.MAX_VALUE, 50, 18, 111, 66, 25};
    }

    private static byte[] hlghjeivhkbcrln() {
        return new byte[]{-32, -19, 52, 83, 22, 107, 62, 10, 120, 82, 45, 126, 65, 16, Byte.MAX_VALUE, 18, 18, 111, 66, 25};
    }

    private static byte[] epjqkmgbmtqbxfd() {
        return new byte[]{-32, -20, 62, 118, 19, 77, 62, 46, 125, 122, 45, 95, 75, 53, 122, 52, 18, 107, 71, 27, 55, 106};
    }

    private static byte[] aqntwxmkfsythzs() {
        return new byte[]{-32, -20, 62, 86, 19, 109, 62, 14, 125, 90, 45, Byte.MAX_VALUE, 75, 21, 122, 20, 18, 107, 71, 27, 55, 106};
    }

    private static byte[] xcmtvbpzlwacwnk() {
        return new byte[]{-30, -29, 61, 126, 21, 94, 56, 60, 122, 119, 37, 73, 78, 47, 124, 44, 20, 101, 70, 100, 55, 9, 87, 93, 81, 45, 105, 121, 100, 108, 4, 109, 116, 104, 14, 121, 108, 99, 61, 105, 53, 83, 43, 118, 95, 20};
    }

    private static byte[] oenyyljovmsiemt() {
        return new byte[]{-30, -29, 61, 94, 21, 126, 56, 28, 122, 87, 37, 105, 78, 15, 124, 44, 20, 69, 70, 68, 55, 41, 87, 125, 81, 13, 105, 89, 100, 108, 4, 77, 116, 72, 14, 89, 108, 67, 61, 73, 53, 115, 43, 86, 95, 52};
    }

    private static byte[] jkdjkdmaayfjyha() {
        return new byte[]{-23, -21, 59, 100, 20, 81, 59, 63, 119, 114, 43, 69, 78, 45, 121, 32, 28, 115, 66, 123, 49, 1, 82, 71, 89, 42, 107, 101, 106, 126, 0, 118};
    }

    private static byte[] oskhwdmqxylgkov() {
        return new byte[]{-23, -21, 59, 68, 20, 113, 59, 31, 119, 82, 43, 101, 78, 45, 121, 0, 28, 83, 66, 91, 49, 33, 82, 103, 89, 10, 107, 69, 106, 94, 0, 86};
    }

    private static byte[] yigikcizxevzmjm() {
        return new byte[]{-32, -22, 61, 112, 22, 91, 49, 53, 124, 121, 44, 92, 74, 39, 121, 37, 28, 113, 68, 100, 55, 26, 84, 92, 88, 52, 111, 122};
    }

    private static byte[] hmktbzyblkheucj() {
        return new byte[]{-32, -22, 61, 80, 22, 123, 49, 21, 124, 89, 44, 124, 74, 7, 121, 37, 28, 81, 68, 68, 55, 58, 84, 124, 88, 20, 111, 90};
    }

    private static int fnurcvcivitbiepi(int i, int i2) {
        return i ^ i2;
    }
}
