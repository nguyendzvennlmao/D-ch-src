package com.kammoun.donutCore.mythictools.manager;

import com.kammoun.donutCore.mythictools.MythicPlugin;
import com.kammoun.donutCore.mythictools.models.ATool;
import com.kammoun.donutCore.mythictools.models.Tools.ToolsType;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import lombok.Generated;

public class ConfigManager {
    private final MythicPlugin plugin;
    private final HashMap<ToolsType, ATool> toolsMap;
    private List<String> restrictedRegions;
    private boolean oldMultiTool;
    private static int N3wT73Na0L = 0;
    private transient int maD4tNKQCo = 1760184759;
    private static String hdvuneilub;
    private static String[] nothing_to_see_here = new String[17];

    public ConfigManager(MythicPlugin mythicPlugin, int i) {
        vbfkvnywexyfqjsq(2071150519 ^ 504902418, 1799839765);
        int parseInt = 754864745 ^ (1552293164 ^ Integer.parseInt("2119443445"));
        this.maD4tNKQCo = 1760184759 ^ N3wT73Na0L;
        int vbfkvnywexyfqjsq = 146543298 ^ vbfkvnywexyfqjsq(parseInt, 1083621439);
        this.toolsMap = new HashMap<>();
        this.plugin = mythicPlugin;
        loadToolsFromConfig(1061585161);
        int i2 = 528105310 ^ (1383894235 ^ (775289183 ^ vbfkvnywexyfqjsq));
    }

    private void loadToolsFromConfig(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.manager.ConfigManager.loadToolsFromConfig(int):void");
    }

    public void reload(int i) {
        int i2 = 694705762 ^ (632949448 ^ 1969406398);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -846944093) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -846944093 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1122994752 ^ i2)) {
                    break;
                }
            }
            int i3 = 1228930794 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1605623522 ^ i2;
        this.toolsMap.clear();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 807034801) {
            int i5 = 12568424 ^ i4;
            this.restrictedRegions.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 904160497) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 904160497 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1376246104 ^ i5)) {
                        int i6 = 1714234322 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1898105847 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (358415871 ^ i5)) {
                            break;
                        }
                    }
                }
                int i7 = 80293401 ^ i5;
                throw new IOException("double");
            }
            i4 = 1933118461 ^ i5;
            loadToolsFromConfig(1061585161);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1406387430) {
                int i8 = 1683890658 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 807034801 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (758760543 ^ i4)) {
                int i9 = 916147283 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1406387430 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (757589769 ^ i4)) {
                    break;
                }
            }
        }
        int i10 = 599695480 ^ i4;
        throw new RuntimeException();
    }

    public ATool getToolByType(ToolsType toolsType, int i) {
        int i2 = 638318362 ^ (1081606853 ^ 1969406398);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1735810296) {
            int i3 = 1166703969 ^ i2;
            return this.toolsMap.get(toolsType);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1260763134 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1464617212 ^ i2)) {
                int i4 = 1023857948 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1735810296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (294854113 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 701916689 ^ i2;
        throw new IllegalAccessException();
    }

    public HashMap<ToolsType, ATool> getAllTools() {
        int i = 59853069 ^ (2119949259 ^ 1969406398);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1161993152) {
            int i2 = 648217355 ^ i;
            return new HashMap<>(this.toolsMap);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1884980121 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (231155763 ^ i)) {
                int i3 = 601959147 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1161993152 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1239842890 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 950067742 ^ i;
        throw new IllegalAccessException();
    }

    public boolean isInRestrictedRegion(org.bukkit.entity.Player r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.manager.ConfigManager.isInRestrictedRegion(org.bukkit.entity.Player, int):boolean");
    }

    @Generated
    public MythicPlugin getPlugin() {
        int i = 1049412281 ^ (2082520344 ^ 1969406398);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1099566855) {
            int i2 = 1685652702 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1648503286 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1020195333 ^ i)) {
                int i3 = 971683016 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1099566855 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (67938595 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2105863108 ^ i;
        throw new IOException();
    }

    @Generated
    public HashMap<ToolsType, ATool> getToolsMap() {
        int i = 660856595 ^ (1045975631 ^ 1969406398);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1657431827) {
            int i2 = 108763957 ^ i;
            return this.toolsMap;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1657431827 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1938175694 ^ i)) {
                int i3 = 1272931504 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1360445115 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1863974706 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1230647979 ^ i;
        throw new IOException();
    }

    @Generated
    public List<String> getRestrictedRegions() {
        int i = 195042131 ^ (1299948975 ^ 1969406398);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1647576559) {
            int i2 = 97874479 ^ i;
            return this.restrictedRegions;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1647576559 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (50585589 ^ i)) {
                int i3 = 1558642422 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1285526679 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (567801125 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 15517310 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isOldMultiTool(int i) {
        int i2 = 1939275720 ^ (140062363 ^ 1969406398);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1969784680) {
            int i3 = 1587367080 ^ i2;
            return this.oldMultiTool;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1969784680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (105585853 ^ i2)) {
                int i4 = 348564427 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2122128854 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (20426649 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 415777709 ^ i2;
        throw new RuntimeException();
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
        hdvuneilub = ByteBuffer.wrap(ysokzxlenlwnlzi()).asCharBuffer().toString();
        N3wT73Na0L = (-271370771) ^ new Random(4685373977483749191L).nextInt();
    }

    public static String ljrhysaxgd(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = hdvuneilub.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] pxafizwbtpwwjge() {
        return new byte[]{0, 0, 0, 33, 0, 0, 0, 0};
    }

    private static byte[] ivdbgtedbfikvkt() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 33};
    }

    private static byte[] knqodllwppputzw() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, 38};
    }

    private static byte[] ynjfjztuosbtvld() {
        return new byte[]{0, 0, 0, 23, 0, 0, 0, 51};
    }

    private static byte[] wxmipnfctyzhmba() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, 74};
    }

    private static byte[] mfxyrgdljilblla() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 87};
    }

    private static byte[] ysokzxlenlwnlzi() {
        return new byte[]{52, 125, 50, 88, 53, 17, 54, 70, 50, 91, 51, 93, 55, 89, 49, 69, 50, 18, 52, 64, 50, 82, 53, 82, 54, 70, 50, 93, 51, 93, 55, 91, 49, 22, 50, 84, 52, 92, 50, 66, 53, 95, 54, 86, 50, 20, 51, 91, 55, 91, 49, 22, 50, 81, 52, 92, 50, 89, 53, 87, 54, 91, 50, 83, 51, 19, 49, 66, 56, 93, 50, 88, 51, 84, 54, 69, 49, 66, 50, 93, 54, 93, 55, 85, 56, 25, 49, 85, 50, 93, 54, 66, 55, 71, 56, 70, 49, 68, 50, 91, 54, 69, 54, 88, 54, 85, 50, 93, 55, 27, 56, 91, 55, 67, 57, 94, 57, 67, 54, 81, 54, 26, 54, 77, 50, 86, 55, 89, 56, 90, 55, 27, 57, 80, 57, 82, 54, 80, 54, 86, 54, 79, 50, 80, 55, 89, 56, 68, 49, 68, 53, 92, 52, 92, 51, 80, 51, 26, 49, 83, 53, 92, 52, 67, 51, 66, 51, 69, 49, 66, 53, 90, 52, 68, 49, 67, 53, 80, 55, 65, 56, 64, 55, 70, 49, 88, 53, 86, 55, 70, 56, 81, 55, 80, 49, 28, 53, 71, 55, 87, 56, 83, 55, 93, 49, 94, 53, 91, 55, 65};
    }

    private static int vbfkvnywexyfqjsq(int i, int i2) {
        return i ^ i2;
    }
}
