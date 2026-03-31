package com.kammoun.donutCore.mythictools.models.Tools;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public final class ToolsType {
    public static final ToolsType DRILL;
    public static final ToolsType MULTI_TOOL;
    public static final ToolsType TREE_CHOPPER;
    public static final ToolsType SELL_AXE;
    private static final ToolsType[] $VALUES;
    private static byte[] cfywlufiwm;

    public static ToolsType[] values() {
        int i = 823851434 ^ (1464784943 ^ (327070496 ^ 1547126162));
        return (ToolsType[]) $VALUES.clone();
    }

    public static ToolsType valueOf(String str) {
        int i = 1871356113 ^ (1326834503 ^ 1547126162);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -448778205) {
            int i2 = 1371551495 ^ i;
            return (ToolsType) Enum.valueOf(ToolsType.class, str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -448778205 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1021833047 ^ i)) {
                int i3 = 167631256 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1799456793 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (673967581 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1027168794 ^ i;
        throw new IOException();
    }

    private ToolsType(String str, int i) {
        int i2 = 584665537 ^ 1905842813;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 21978493:
                    int i3 = 528120784 ^ i2;
                    break;
                case 528585423:
                case 1219299022:
                    break;
                case 1397527318:
                default:
                    throw new IllegalAccessException();
            }
        }
        licooskpkeuijlnd(1919821597 ^ (464475965 ^ Integer.parseInt("637179980")), 1082934344);
    }

    private static ToolsType[] $values() {
        int i = 884247733 ^ (1389465102 ^ (1139336506 ^ 1547126162));
        ToolsType[] toolsTypeArr = new ToolsType[(byte) (2042274327 ^ i)];
        toolsTypeArr[(byte) (2042274323 ^ i)] = DRILL;
        toolsTypeArr[(byte) (2042274322 ^ i)] = MULTI_TOOL;
        toolsTypeArr[(byte) (2042274321 ^ i)] = TREE_CHOPPER;
        toolsTypeArr[(byte) (2042274320 ^ i)] = SELL_AXE;
        return toolsTypeArr;
    }

    static {
        int parseInt = 1198382611 ^ (1332554358 ^ Integer.parseInt("637179980"));
        cfywlufiwm = lsbbyotpmcgzvqw();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1876123977) {
            parseInt = 702175196 ^ parseInt;
            DRILL = new ToolsType(jgjdnzbhnm(jqmnhwwxjfpqwhb(), parseInt), (byte) (69221365 ^ parseInt));
            MULTI_TOOL = new ToolsType(jgjdnzbhnm(rljmoczikzzvito(), parseInt), (byte) (69221364 ^ parseInt));
            TREE_CHOPPER = new ToolsType(jgjdnzbhnm(fwcfucynljpoicy(), parseInt), (byte) (69221367 ^ parseInt));
            SELL_AXE = new ToolsType(jgjdnzbhnm(ttpmtybgbhinczt(), parseInt), (byte) (69221366 ^ parseInt));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 553770920) {
                int i = 218523205 ^ parseInt;
                $VALUES = $values();
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1228074368 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (817176126 ^ parseInt)) {
                int i2 = 2132174837 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1876123977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (2053860260 ^ parseInt)) {
                    int i3 = 171994679 ^ parseInt;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 553770920 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (571778583 ^ parseInt)) {
                        break;
                    }
                }
            }
        }
        int i4 = 2076650873 ^ parseInt;
        throw new IllegalAccessException();
    }

    public static String jgjdnzbhnm(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ cfywlufiwm[i3 % cfywlufiwm.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] lsbbyotpmcgzvqw() {
        return new byte[]{29, 78, 97, 21, 82, 114, 42, 92, 81, Byte.MAX_VALUE, 94, 115, 88, 97, 38, 93, 56, 3, 21, 7, 1, 76, 16, 84, 75, 57, 4, 98, 62, 59, 105, 97, 6, 90, 75, 30, 43, 86, 70, 40, 76, 86, 106, 1, 27, 25, 24, 34, 71, 119, 22, 86, 113, 65, 112, 106, 108, 104, 77, 62, 71, 47, 111, 98, 28, 5, 61, 70, 49, 124, 74, 80, 35, 82, 58, 50, 109, 73, 100, 79, 8, 47, 78, 23, 41, 22, 98, 58, 63, 75, 10, 8, 66, 72, 40, 109, 41, 36, 39, 29, 30, 59, 19, 90, 62, 41, 110, 41, 85};
    }

    private static byte[] jqmnhwwxjfpqwhb() {
        return new byte[]{-43, -120, 83, 99, 99, 19, 28, 32, 103, 10, 108, 13};
    }

    private static byte[] rljmoczikzzvito() {
        return new byte[]{-43, -120, 83, 106, 99, 20, 28, 37, 103, 18, 108, 8, 105, 13, 16, 60, 14, 117, 39, 122, 48, 51};
    }

    private static byte[] fwcfucynljpoicy() {
        return new byte[]{-43, -120, 83, 115, 99, 19, 28, 44, 103, 3, 108, 30, 105, 17, 16, 32, 14, 117, 39, 101, 48, 47, 38, 36, 125, 82};
    }

    private static byte[] ttpmtybgbhinczt() {
        return new byte[]{-43, -120, 83, 116, 99, 4, 28, 37, 103, 10, 108, 30, 105, 19, 16, 48, 14, Byte.MAX_VALUE};
    }

    private static int licooskpkeuijlnd(int i, int i2) {
        return i2 ^ i;
    }
}
