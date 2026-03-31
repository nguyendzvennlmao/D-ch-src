package com.kammoun.donutCore.crates.models;

import com.kammoun.donutCore.api.utils.items.KItem;
import de.oliver.fancyholograms.api.hologram.Hologram;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import lombok.Generated;

public class Crate {
    private final String id;
    private final String name;
    private final ArrayList<CrateItem> rewards;
    private final List<Hologram> holograms;
    private final KItem icon;
    private final String inventoryName;
    private final int inventorySize;
    private final KItem backgroundIcon;
    private final List<HologramConfig> hologramConfigs;

    private static int f4949oIQzoOkA = 0;

    private transient int f506A1gWQdoKF = 1179449682;
    private static String[] nothing_to_see_here = new String[19];

    public static class HologramConfig {
        private final List<String> lines;
        private final double height;

        private static int f515mCmlckAvC = 0;
        private transient int A5Kap5LrNw = 433382846;
        private static String vemqjxofvn;
        private static String[] nothing_to_see_here = new String[13];

        public HologramConfig(List list, List<String> list2, double d) {
            int i = 13304979 ^ 1785825670;
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                    case 99846198:
                    default:
                        throw new RuntimeException();
                    case 248060898:
                        int i2 = 1449704547 ^ i;
                        break;
                    case 319085099:
                        break;
                    case 343051835:
                }
            }
            int parseInt = 1803563867 ^ (1939444950 ^ Integer.parseInt("617322235"));
            this.A5Kap5LrNw = 433382846 ^ f515mCmlckAvC;
            this.lines = list;
            this.height = list2;
            int i3 = 1394900966 ^ (1198022024 ^ (1099271718 ^ (1717041295 ^ parseInt)));
        }

        @Generated
        public List getLines(int i) {
            int i2 = 911008331 ^ (522904995 ^ 555718109);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1137480104) {
                int i3 = 93077739 ^ i2;
                return this.lines;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1137480104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1180064903 ^ i2)) {
                    int i4 = 1337080872 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1873712880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1569433978 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 132141269 ^ i2;
            throw new RuntimeException();
        }

        @Generated
        public double getHeight(int i) {
            int i2 = 950882752 ^ (974423851 ^ 555718109);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 489822641) {
                int i3 = 1658696080 ^ i2;
                return this.height;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 199202098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (644757829 ^ i2)) {
                    int i4 = 1245986200 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 489822641 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1027821351 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1011817828 ^ i2;
            throw new IOException();
        }

        static {
            nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ";
            nothing_to_see_here[1] = "⠀⠀⠀⠀⣠⣶⡾⠏⠉⠙⠳⢦⡀⠀⠀⠀⢠⠞⠉⠙⠲⡀⠀    ";
            nothing_to_see_here[2] = "⠀⠀⠀⣴⠿⠏⠀⠀⠀⠀⠀⠀⢳⡀⠀⡏⠀⠀⠀⠀⠀⢷     ";
            nothing_to_see_here[3] = "⠀⠀⢠⣟⣋⡀⢀⣀⣀⡀⠀⣀⡀⣧⠀⢸⠀⠀⠀⠀⠀ ⡇    ";
            nothing_to_see_here[4] = "⠀⠀⢸⣯⡭⠁⠸⣛⣟⠆⡴⣻⡲⣿⠀⣸⠀⠀OK⠀ ⡇    ";
            nothing_to_see_here[5] = "⠀⠀⣟⣿⡭⠀⠀⠀⠀⠀⢱⠀⠀⣿⠀⢹⠀⠀⠀⠀⠀ ⡇    ";
            nothing_to_see_here[6] = "⠀⠀⠙⢿⣯⠄⠀⠀⠀⢀⡀⠀⠀⡿⠀⠀⡇⠀⠀⠀⠀⡼     ";
            nothing_to_see_here[7] = "⠀⠀⠀⠀⠹⣶⠆⠀⠀⠀⠀⠀⡴⠃⠀⠀⠘⠤⣄⣠⠞⠀     ";
            nothing_to_see_here[8] = "⠀⠀⠀⠀⠀⢸⣷⡦⢤⡤⢤⣞⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ";
            nothing_to_see_here[9] = "⠀⠀⢀⣤⣴⣿⣏⠁⠀⠀⠸⣏⢯⣷⣖⣦⡀⠀⠀⠀⠀⠀⠀    ";
            nothing_to_see_here[10] = "⢀⣾⣽⣿⣿⣿⣿⠛⢲⣶⣾⢉⡷⣿⣿⠵⣿⠀⠀⠀⠀⠀⠀    ";
            nothing_to_see_here[11] = "⣼⣿⠍⠉⣿⡭⠉⠙⢺⣇⣼⡏⠀⠀⠀⣄⢸⠀⠀⠀⠀⠀⠀    ";
            nothing_to_see_here[12] = "⣿⣿⣧⣀⣿.........⣀⣰⣏⣘⣆⣀⠀⠀       ";
            vemqjxofvn = ByteBuffer.wrap(eeqiuwnllatkuic()).asCharBuffer().toString();
            f515mCmlckAvC = (-772234596) ^ new Random(8694338071604405027L).nextInt();
        }

        public static String gllqtercqz(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = vemqjxofvn.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

        private static byte[] eeqiuwnllatkuic() {
            return new byte[0];
        }
    }

    public Crate(String str, String str2, String str3, ArrayList<CrateItem> arrayList, KItem kItem, String str4, int i, KItem kItem2, List<HologramConfig> list) {
        int i2 = 921401980 ^ (794936578 ^ 1046918124);
        int parseInt = 1240539891 ^ (1295768756 ^ Integer.parseInt("589755093"));
        this.f506A1gWQdoKF = 1179449682 ^ f4949oIQzoOkA;
        int paqopkinhaocgiwk = 486807291 ^ paqopkinhaocgiwk(parseInt, 2135110733);
        this.holograms = new ArrayList();
        this.id = str;
        this.name = str2;
        this.rewards = str3;
        this.icon = arrayList;
        this.inventoryName = kItem;
        this.inventorySize = str4;
        this.backgroundIcon = i;
        this.hologramConfigs = kItem2;
        int i3 = 1460549840 ^ (362364698 ^ (1031331606 ^ (1025120265 ^ (1700511623 ^ (990788234 ^ (918213246 ^ (1961679185 ^ (1852802737 ^ paqopkinhaocgiwk))))))));
    }

    public void addHologram(Hologram hologram, int i) {
        int i2 = 1843337978 ^ (1464644710 ^ 302155157);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1149851721) {
            i2 = 1017879837 ^ i2;
            this.holograms.add(hologram);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1579831136) {
                int i3 = 710365878 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -210819823 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (92523707 ^ i2)) {
                int i4 = 1828682882 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1579831136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1419897455 ^ i2)) {
                    int i5 = 1080686867 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1149851721 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1861756322 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 471193838 ^ i2;
        throw new IOException();
    }

    public void clearHolograms() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.models.Crate.clearHolograms():void");
    }

    public static com.kammoun.donutCore.crates.models.Crate loadCrate(java.io.File r11, com.kammoun.donutCore.api.module.DonutModule r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.models.Crate.loadCrate(java.io.File, com.kammoun.donutCore.api.module.DonutModule, int):com.kammoun.donutCore.crates.models.Crate");
    }

    @Generated
    public String getId() {
        int i = 453093522 ^ (1423979093 ^ 302155157);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -283575662) {
            int i2 = 1452978627 ^ i;
            return this.id;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1540191368 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1857318717 ^ i)) {
                int i3 = 1104282768 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -283575662 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (225960056 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1078682099 ^ i;
        throw new IOException();
    }

    @Generated
    public String getName(int i) {
        int i2 = 1838507937 ^ (1298496587 ^ 302155157);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1751845895) {
            int i3 = 614789983 ^ i2;
            return this.name;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1296865024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1363022865 ^ i2)) {
                int i4 = 2031388594 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1751845895 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1000238603 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1754817924 ^ i2;
        throw new IOException();
    }

    @Generated
    public ArrayList getRewards(int i) {
        int i2 = 2030313369 ^ (781284257 ^ 302155157);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 750734698) {
            int i3 = 1803508087 ^ i2;
            return this.rewards;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 750734698 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1060449653 ^ i2)) {
                int i4 = 315884785 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2001045201 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2051282036 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2142723334 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public List<Hologram> getHolograms() {
        int i = 2061486145 ^ (663033189 ^ 302155157);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2059584906) {
            int i2 = 98019484 ^ i;
            return this.holograms;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1417642346 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1710642310 ^ i)) {
                int i3 = 51324802 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2059584906 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (687817450 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 689326368 ^ i;
        throw new IOException();
    }

    @Generated
    public KItem getIcon(int i) {
        int i2 = 1044963287 ^ (548806754 ^ 302155157);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1742983424) {
            int i3 = 140144726 ^ i2;
            return this.icon;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 623924144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1700977057 ^ i2)) {
                int i4 = 466643965 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1742983424 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1164535191 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1419660311 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getInventoryName(int i) {
        int i2 = 1462396230 ^ (392301357 ^ 302155157);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1839767566) {
            int i3 = 1179428748 ^ i2;
            return this.inventoryName;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1839767566 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (317519795 ^ i2)) {
                int i4 = 1143860174 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1607310448 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (401701836 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 989336938 ^ i2;
        throw new IOException();
    }

    @Generated
    public int getInventorySize(int i) {
        int i2 = 1269563808 ^ (1555547223 ^ 302155157);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 684327696) {
            int i3 = 1011714904 ^ i2;
            return this.inventorySize;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 684327696 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (402182941 ^ i2)) {
                int i4 = 272801713 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -895067695 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1807685922 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1389188441 ^ i2;
        throw new IOException();
    }

    @Generated
    public KItem getBackgroundIcon(int i) {
        int i2 = 271661624 ^ (1006876001 ^ 302155157);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -243247519) {
            int i3 = 828702524 ^ i2;
            return this.backgroundIcon;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2057809792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (685044773 ^ i2)) {
                int i4 = 1366574702 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -243247519 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1706632811 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1405740754 ^ i2;
        throw new IOException();
    }

    @Generated
    public List getHologramConfigs(int i) {
        int i2 = 672390768 ^ (902286504 ^ 302155157);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2125773416) {
            int i3 = 1613723137 ^ i2;
            return this.hologramConfigs;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2144275043 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1220278557 ^ i2)) {
                int i4 = 126956957 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2125773416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (564157541 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1458582805 ^ i2;
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
        f4949oIQzoOkA = (-238101769) ^ new Random(1406771010378222428L).nextInt();
    }

    public static String kvzvuzkmhj(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] bwnmpepswjrvmgf() {
        return new byte[]{13, 3, 115, 26, 34, 126, 10, 118, 18, 24, 118, 100, 57, 1, 104, 9, 75, 71, 105, 107, 62, 85, 105, 106, 37, 67, 122, 73, Byte.MAX_VALUE, 51, 54, 49, 9, 63, 17, 65, 64, 19, 115, 107, 76, 58, 105, 110, 126, 76, 15, 56, 60, 19, 92, 26, 57, 108, 25, 111, 22, 49, 118, 23, 92, 26, 7, 36, 4, 28, 34, 82, 106, 74, 45, 84, 34, 78, 89, 95, 31, 64, 8, 123, 4, 75, 45, 45, 25, 93, 113, 49, 102, 81, 42, 93, 94, 28, 61, 4, 75, 26, 71, 77, 20, 20, 48, 23, 94, 87, 12, 107, 18};
    }

    private static byte[] xcqoweaatoiaobx() {
        return new byte[]{-62, -52, 70, 65, 16, 52, 61, 33, 37, 93, 70, 52, 1, 108, 80, 87, 125, 20};
    }

    private static byte[] shzmfxuwiwtlhfx() {
        return new byte[]{-54, -56, 69, 89, 16, 35, 50, 52, 38, 68};
    }

    private static byte[] bbnmndgsgbjkubp() {
        return new byte[]{-57, -52, 64, 70, 22, 38, 62, 43, 32, 67, 70, 48, 13, 71, 95, 92, 122, 24};
    }

    private static byte[] mldtdoesqvrvyfn() {
        return new byte[]{-62, -49, 66, 69, 22, 40, 61, 40, 32, 71};
    }

    private static byte[] vwielbxspoqzpox() {
        return new byte[]{-62, -52, 68, 68, 17, 36, 60, 53, 36, 76, 70, 126, 0, 91, 91, 92, 126, 30, 88, 53};
    }

    private static byte[] bxlmbsopbmxvwxz() {
        return new byte[]{-62, -56, 66, 16};
    }

    private static byte[] unciumnggtlaukx() {
        return new byte[]{-59, -51, 64, 66, 21, 44, 58, 59};
    }

    private static byte[] jojmygutdboqclq() {
        return new byte[]{-62, -55, 75, 75, 18, 60, 56, 35, 43, 88, 71, 52, 1, 108, 88, 80, 121, 23};
    }

    private static byte[] iwmqkdqulqsoduw() {
        return new byte[]{-62, -52, 68, 5, 21, 54, 62, 42, 43, 69};
    }

    private static byte[] ygervhzieyckvhw() {
        return new byte[0];
    }

    private static byte[] ywzfqzymfyumlmd() {
        return new byte[]{-62, -52, 65, 4, 17, 115, 50, 12, 39, 88, 71, 53, 11, 77, 91, 89};
    }

    private static byte[] dsvstsayeoehvtm() {
        return new byte[]{-62, -60, 75, 20};
    }

    private static byte[] fyssmdcrqxkbzxr() {
        return new byte[]{-54, -60, 68, 68, 20, 38, 57, 35, 35, 68};
    }

    private static byte[] fjgvdjcymxpklyd() {
        return new byte[]{-54, -60, 68, 12, 20, Byte.MAX_VALUE, 57, 13, 35, 83, 78, 50, 9, 67, 81, 95};
    }

    private static byte[] luildazdarhgucr() {
        return new byte[]{-58, -50, 66, 75, 16, 33, 50, 50, 32, 72, 68, 59, 1, 71, 89, 94, 121, 7, 92, 32};
    }

    private static byte[] qfdooaokbxkqceu() {
        return new byte[]{-63, -52, 66, 91, 20, 34, 51, 52, 36, 77, 68, 38, 8, 86, 94, 67};
    }

    private static byte[] kxhanneutyzzjew() {
        return new byte[]{-57, -56, 71, 66, 16, 59, 56, 39, 42, 65};
    }

    private static byte[] llepfakblekrvgy() {
        return new byte[]{-57, -52, 75, 67, 27, 47, 56, 38, 39, 75, 70, 52, 8, 76};
    }

    private static byte[] dqedftneklqbdzk() {
        return new byte[]{-62, -56, 71, 73, 19, 43, 57, 36, 38, 74, 71, 55, 13, 66, 89, 82, 120, 3, 93, 60, 15, 5, 93, 118, 20, 30, 73, 27, 75, 101, 7, 107};
    }

    private static byte[] pnrllmhmosphyjk() {
        return new byte[]{-62, -51, 65, 67, 23, 37, 58, 45, 38, 78, 71, 38};
    }

    private static int paqopkinhaocgiwk(int i, int i2) {
        return i2 ^ i;
    }
}
