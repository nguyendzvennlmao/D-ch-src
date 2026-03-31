package com.kammoun.donutCore.shop.managers;

import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.shop.ShopPlugin;
import com.kammoun.donutCore.shop.utils.others.MainShopInventoryHolder;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ConfigManager {
    private final ShopPlugin plugin;
    private String mainTitle;
    private int mainSize;
    private KItem backPage;
    private KItem decline;
    private KItem accept;
    private KItem minus64;
    private KItem minus16;
    private KItem minus1;
    private KItem plus1;
    private KItem plus16;
    private KItem plus64;
    private final Map<String, MainCategoryItem> categoryItems;
    private List<String> priceLore;
    private String notEnoughBalance;
    private String Buying;
    private String notEnoughSpace;
    private static int JtE1T1Maq0 = 0;
    private transient int yCHtmEjfKV = 1349920058;
    private static String dklasziawn;
    private static String[] nothing_to_see_here = new String[15];

    public static class MainCategoryItem {
        private final KItem icon;
        private final String categoryFile;
        private static int ApxiMJ10tI = 0;
        private transient int EMpYH0QIA5 = 1801076323;
        private static byte[] jxwdlrnzco;
        private static String[] nothing_to_see_here = new String[19];

        public MainCategoryItem(KItem kItem, String str, int i) {
            int i2 = 564311311 ^ (184600359 ^ 427518778);
            int parseInt = 519907871 ^ (1305117561 ^ Integer.parseInt("1626255476"));
            this.EMpYH0QIA5 = 1801076323 ^ ApxiMJ10tI;
            this.icon = kItem;
            this.categoryFile = str;
            int i3 = 1336858617 ^ (1765072162 ^ (399149520 ^ (379860029 ^ parseInt)));
        }

        @Generated
        public KItem getIcon(int i) {
            int i2 = 2085087936 ^ (1702853708 ^ 1221917867);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1889316550) {
                int i3 = 1038352829 ^ i2;
                return this.icon;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1889316550 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1983395559 ^ i2)) {
                    int i4 = 1329404545 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1615027411 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (280542658 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1407701553 ^ i2;
            throw new RuntimeException();
        }

        @Generated
        public String getCategoryFile(int i) {
            int i2 = 1308791347 ^ (1997443471 ^ 1221917867);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1899497285) {
                int i3 = 1437057820 ^ i2;
                return this.categoryFile;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 603578457 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (678390924 ^ i2)) {
                    int i4 = 437678543 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1899497285 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (332289221 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 901266034 ^ i2;
            throw new IllegalAccessException();
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
            jxwdlrnzco = hphcosvopcwankz();
            ApxiMJ10tI = (-105930933) ^ new Random(8103675240370535613L).nextInt();
        }

        public static String vjibsnieui(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= bArr.length) {
                    return new String(bArr, StandardCharsets.UTF_16);
                }
                bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                bArr[i3] = (byte) (bArr[i3] ^ jxwdlrnzco[i3 % jxwdlrnzco.length]);
                i2 = i3 + 1;
            }
        }

        private static byte[] hphcosvopcwankz() {
            return new byte[]{113, 11, 36, 69, 123, 44, 43, 51, 118, 49, 91, 86, 11, 116, 117, 104, 110, 81, 15, 121, 109, 100, 113, 88, 84, 113, 57, 73, 64, 95, 48, 123, 22, 84, 92, 21, 82, 15, 40, 85, 96, 124, 96, 45, 39, 9, 106, 75, 12, 88, 119, 14, 2, 39, 100, 111, 67, 66, 28, 20, 110, 38, 40, 99, 50, 22, 2, 11, 118, 16, 121, 87, 98, 74, 80, 39, 85, 67, 90, 61, 70, 47, 117, 86, 78, 4, 119, 115, 98, 101, 119, 16, 6, 78, 47, 33, 89, 68, 39, 97, 26, 87, 110, 19, 107, 79, 21, 91, 112, 5, 118, 70, 58, 41, 43, 62, 26, 39, 43, 79};
        }
    }

    public ConfigManager(ShopPlugin shopPlugin, int i) {
        wrexlymhmevnlixp(1825291781 ^ 1302464763, 1115773941);
        int parseInt = 1747889878 ^ (1400306459 ^ Integer.parseInt("1487976646"));
        this.yCHtmEjfKV = 1349920058 ^ JtE1T1Maq0;
        this.categoryItems = new HashMap();
        this.plugin = shopPlugin;
        loadConfig(220994212);
        int i2 = 1228956397 ^ (546152203 ^ (511204767 ^ (692818497 ^ (872569519 ^ parseInt))));
    }

    public void loadConfig(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.shop.managers.ConfigManager.loadConfig(int):void");
    }

    public void openMainInventory(Player player, int i) {
        int i2 = 676568217 ^ (1097972704 ^ 1069152796);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1260459222) {
            i2 = 1838065742 ^ i2;
            MainShopInventoryHolder mainShopInventoryHolder = new MainShopInventoryHolder();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -659838631) {
                int i3 = 866037806 ^ i2;
                Inventory createInventory = Bukkit.createInventory(mainShopInventoryHolder, this.mainSize, this.mainTitle);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1147021352) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1147021352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (168786400 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 391792731 ^ i3;
                    throw new IllegalAccessException("double");
                }
                i2 = 975289780 ^ i3;
                mainShopInventoryHolder.setInventory(createInventory, 688619488);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1789672055) {
                    i2 = 203924486 ^ i2;
                    this.categoryItems.values().forEach(
                    throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.shop.managers.ConfigManager.openMainInventory(org.bukkit.entity.Player, int):void");
                }

                @Generated
                public ShopPlugin getPlugin() {
                    int i = 740322421 ^ (667739608 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1565811319) {
                        int i2 = 491366362 ^ i;
                        return this.plugin;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1565811319 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1386397624 ^ i)) {
                            int i3 = 103208104 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1223074649 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2138698697 ^ i)) {
                                break;
                            }
                        }
                    }
                    int i4 = 155752291 ^ i;
                    throw new RuntimeException();
                }

                @Generated
                public String getMainTitle() {
                    int i = 197376852 ^ (922595313 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 339703240) {
                        int i2 = 875628490 ^ i;
                        return this.mainTitle;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1246278759 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1218904317 ^ i)) {
                            int i3 = 1511739819 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 339703240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (395907041 ^ i)) {
                                break;
                            }
                        }
                    }
                    int i4 = 1050267584 ^ i;
                    throw new IllegalAccessException();
                }

                @Generated
                public int getMainSize() {
                    int i = 409874137 ^ (845212837 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1380334848) {
                        int i2 = 1585198237 ^ i;
                        return this.mainSize;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1380334848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1619102183 ^ i)) {
                            int i3 = 202812249 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1582852074 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1497870358 ^ i)) {
                                break;
                            }
                        }
                    }
                    int i4 = 143209412 ^ i;
                    throw new RuntimeException();
                }

                @Generated
                public KItem getBackPage(int i) {
                    int i2 = 643402139 ^ (1493731483 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 122149090) {
                        int i3 = 1215112276 ^ i2;
                        return this.backPage;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1143929408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1470556879 ^ i2)) {
                            int i4 = 1434498964 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 122149090 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1744887038 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 338709660 ^ i2;
                    throw new RuntimeException();
                }

                @Generated
                public KItem getDecline(int i) {
                    int i2 = 49956634 ^ (341699985 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1223853241) {
                        int i3 = 376053865 ^ i2;
                        return this.decline;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -73168911 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (597924791 ^ i2)) {
                            int i4 = 673385753 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1223853241 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (749529198 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 771931034 ^ i2;
                    throw new IOException();
                }

                @Generated
                public KItem getAccept(int i) {
                    int i2 = 355498544 ^ (1400404577 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -812658069) {
                        int i3 = 836325876 ^ i2;
                        return this.accept;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1095065034 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (361063566 ^ i2)) {
                            int i4 = 1798416558 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -812658069 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1080593388 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 41710045 ^ i2;
                    throw new RuntimeException();
                }

                @Generated
                public KItem getMinus64(int i) {
                    int i2 = 886812478 ^ (1060720390 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1562848991) {
                        int i3 = 1554813739 ^ i2;
                        return this.minus64;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1203521659 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1219398585 ^ i2)) {
                            int i4 = 570650596 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1562848991 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1327730885 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 291949909 ^ i2;
                    throw new RuntimeException();
                }

                @Generated
                public KItem getMinus16(int i) {
                    int i2 = 1944059540 ^ (640942649 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1385182603) {
                        int i3 = 234095794 ^ i2;
                        return this.minus16;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1385182603 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (721250806 ^ i2)) {
                            int i4 = 1377921574 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1026560027 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (231476898 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 1078378775 ^ i2;
                    throw new RuntimeException();
                }

                @Generated
                public KItem getMinus1(int i) {
                    int i2 = 165019507 ^ (847288096 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 660902520) {
                        int i3 = 1523395666 ^ i2;
                        return this.minus1;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 660902520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1252060708 ^ i2)) {
                            int i4 = 1098695892 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -250744598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1192721471 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 1751494278 ^ i2;
                    throw new IllegalAccessException();
                }

                @Generated
                public KItem getPlus1(int i) {
                    int i2 = 1192280637 ^ (1427648322 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1837677337) {
                        int i3 = 2070812722 ^ i2;
                        return this.plus1;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1837677337 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (15215279 ^ i2)) {
                            int i4 = 1826082107 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1225229686 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (443525411 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 276876651 ^ i2;
                    throw new IOException();
                }

                @Generated
                public KItem getPlus16(int i) {
                    int i2 = 609015073 ^ (779025401 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1394694623) {
                        int i3 = 808109500 ^ i2;
                        return this.plus16;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 763923392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1298768324 ^ i2)) {
                            int i4 = 288441066 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1394694623 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1565933680 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 249754750 ^ i2;
                    throw new RuntimeException();
                }

                @Generated
                public KItem getPlus64(int i) {
                    int i2 = 50842512 ^ (161425900 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1459043583) {
                        int i3 = 1684113394 ^ i2;
                        return this.plus64;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1459043583 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (966992558 ^ i2)) {
                            int i4 = 236244709 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1979384686 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (361464023 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 1461816467 ^ i2;
                    throw new IOException();
                }

                @Generated
                public Map getCategoryItems(int i) {
                    int i2 = 291423481 ^ (1320414033 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 44477859) {
                        int i3 = 1745330245 ^ i2;
                        return this.categoryItems;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1117499272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1233206392 ^ i2)) {
                            int i4 = 624853242 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 44477859 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1588552339 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 1939769698 ^ i2;
                    throw new RuntimeException();
                }

                @Generated
                public List getPriceLore(int i) {
                    int i2 = 1504914182 ^ (1889479181 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1263544136) {
                        int i3 = 495806556 ^ i2;
                        return this.priceLore;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1489279576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (291502583 ^ i2)) {
                            int i4 = 209004739 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1263544136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1738189547 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 1428429250 ^ i2;
                    throw new RuntimeException();
                }

                @Generated
                public String getNotEnoughBalance(int i) {
                    int i2 = 489363529 ^ (175719770 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1197291641) {
                        int i3 = 179743988 ^ i2;
                        return this.notEnoughBalance;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 317218777 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1298436048 ^ i2)) {
                            int i4 = 233849176 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1197291641 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1297113920 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 1088020312 ^ i2;
                    throw new IOException();
                }

                @Generated
                public String getBuying(int i) {
                    int i2 = 792973595 ^ (179476248 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -767172360) {
                        int i3 = 778286739 ^ i2;
                        return this.Buying;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1588046751 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (276313099 ^ i2)) {
                            int i4 = 2112319871 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -767172360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (635386278 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 1073197802 ^ i2;
                    throw new IOException();
                }

                @Generated
                public String getNotEnoughSpace(int i) {
                    int i2 = 1625832939 ^ (1350409137 ^ 1069152796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2036523568) {
                        int i3 = 1665907082 ^ i2;
                        return this.notEnoughSpace;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1665085027 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (219994227 ^ i2)) {
                            int i4 = 263521758 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2036523568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1638127163 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 1728455179 ^ i2;
                    throw new RuntimeException();
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
                    dklasziawn = ByteBuffer.wrap(gjktjvmddtcrvig()).asCharBuffer().toString();
                    JtE1T1Maq0 = 1938646777 ^ new Random(-6664170589156516664L).nextInt();
                }

                public static String gtmgsvcnav(byte[] bArr, int i) {
                    byte[] bytes = Integer.toString(i).getBytes();
                    int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
                    byte[] bytes2 = dklasziawn.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

                private static byte[] kxbddqevwvotwqm() {
                    return new byte[]{0, 0, 0, 5, 0, 0, 0, 0};
                }

                private static byte[] nzxwpofbtpleyjg() {
                    return new byte[]{0, 0, 0, 7, 0, 0, 0, 5};
                }

                private static byte[] qrwawaodpaiahmz() {
                    return new byte[]{0, 0, 0, 10, 0, 0, 0, 12};
                }

                private static byte[] ijmlybatbqijwrl() {
                    return new byte[]{0, 0, 0, 7, 0, 0, 0, 22};
                }

                private static byte[] ffyextkpxrssiuf() {
                    return new byte[]{0, 0, 0, 14, 0, 0, 0, 29};
                }

                private static byte[] nnwqvqzpgkxgphu() {
                    return new byte[]{0, 0, 0, 10, 0, 0, 0, 43};
                }

                private static byte[] dbdhxhfzztbyepl() {
                    return new byte[]{0, 0, 0, 6, 0, 0, 0, 53};
                }

                private static byte[] ifptqeliihnsbjq() {
                    return new byte[]{0, 0, 0, 7, 0, 0, 0, 59};
                }

                private static byte[] yasoekvquynsacz() {
                    return new byte[]{0, 0, 0, 18, 0, 0, 0, 66};
                }

                private static byte[] iczaepbssuxgrda() {
                    return new byte[]{0, 0, 0, 47, 0, 0, 0, 84};
                }

                private static byte[] gngecgfeuljldwd() {
                    return new byte[]{0, 0, 0, 22, 0, 0, 0, -125};
                }

                private static byte[] nszeajtvooidknr() {
                    return new byte[]{0, 0, 0, 8, 0, 0, 0, -103};
                }

                private static byte[] vndkgdowuakmpnj() {
                    return new byte[]{0, 0, 0, 18, 0, 0, 0, -95};
                }

                private static byte[] slaxajzfykfczpm() {
                    return new byte[]{0, 0, 0, 0, 0, 0, 0, -77};
                }

                private static byte[] mbdnajffaphcgfm() {
                    return new byte[]{0, 0, 0, 4, 0, 0, 0, -77};
                }

                private static byte[] urrurmtqpeodjtq() {
                    return new byte[]{0, 0, 0, 8, 0, 0, 0, -73};
                }

                private static byte[] qgtgocjjchoebnt() {
                    return new byte[]{0, 0, 0, 7, 0, 0, 0, -65};
                }

                private static byte[] zzkvbwgyekskyxt() {
                    return new byte[]{0, 0, 0, 8, 0, 0, 0, -58};
                }

                private static byte[] owaisvpnzyraaka() {
                    return new byte[]{0, 0, 0, 6, 0, 0, 0, -50};
                }

                private static byte[] qvaiozqtygiesku() {
                    return new byte[]{0, 0, 0, 0, 0, 0, 0, -44};
                }

                private static byte[] lkwfvxtxzfuvwcc() {
                    return new byte[]{0, 0, 0, 8, 0, 0, 0, -44};
                }

                private static byte[] fuqxckvhzlylpij() {
                    return new byte[]{0, 0, 0, 9, 0, 0, 0, -36};
                }

                private static byte[] gjafwnrdruhigrk() {
                    return new byte[]{0, 0, 0, 7, 0, 0, 0, -27};
                }

                private static byte[] yrzyxaebyfkaxqt() {
                    return new byte[]{0, 0, 0, 16, 0, 0, 0, -20};
                }

                private static byte[] hkrphioslbesdsw() {
                    return new byte[]{0, 0, 0, 0, 0, 0, 0, -4};
                }

                private static byte[] auorpldmfgckifh() {
                    return new byte[]{0, 0, 0, 6, 0, 0, 0, -4};
                }

                private static byte[] wnontnxqsrpcnsw() {
                    return new byte[]{0, 0, 0, 5, 0, 0, 1, 2};
                }

                private static byte[] keocnomgqcibexo() {
                    return new byte[]{0, 0, 0, 15, 0, 0, 1, 7};
                }

                private static byte[] gjktjvmddtcrvig() {
                    return new byte[]{54, 81, 50, 69, 50, 81, 50, 89, 50, 69, 54, 85, 48, 64, 56, 77, 48, 68, 54, 89, 55, 94, 53, 75, 49, 81, 55, 87, 48, 71, 56, 86, 51, 82, 49, 93, 55, 68, 48, 90, 56, 86, 51, 70, 49, 64, 51, 84, 49, 64, 50, 74, 50, 28, 48, 2, 56, 7, 56, 93, 53, 84, 55, 93, 51, 90, 56, 29, 53, 92, 55, 90, 51, 66, 56, 85, 53, 91, 55, 64, 51, 91, 56, 66, 53, 76, 49, 99, 54, 75, 51, 94, 53, 86, 51, 84, 51, 27, 57, Byte.MAX_VALUE, 55, 90, 53, 65, 49, 86, 49, 66, 55, 85, 57, 67, 49, 66, 52, 25, 49, 3, 49, 72, 53, 91, 49, 76, 55, 75, 50, 26, 49, 14, 53, 3, 49, 68, 52, 76, 51, 71, 49, 87, 54, 95, 49, 85, 52, 74, 51, 80, 49, 25, 54, 94, 49, 90, 52, 79, 51, 80, 49, 90, 54, 67, 49, 91, 52, 75, 51, 76, 49, 124, 53, 91, 49, 75, 57, 75, 57, 90, 49, 95, 53, 85, 49, 24, 57, 31, 57, 94, 49, 80, 53, 91, 49, 86, 57, 21, 57, 90, 49, 95, 53, 68, 49, 93, 57, 86, 57, 71, 49, 94, 53, 64, 49, 65, 57, 31, 57, 19, 49, 66, 53, 87, 49, 91, 57, 76, 57, 90, 49, 94, 53, 92, 49, 24, 57, 81, 57, 93, 49, 17, 53, 81, 49, 87, 57, 86, 57, 85, 49, 88, 53, 85, 49, 22, 57, 65, 57, 94, 49, 93, 53, 19, 49, 18, 51, 86, 54, 112, 55, 76, 55, 79, 49, 20, 51, 64, 54, 64, 55, 80, 55, 85, 49, 81, 51, 10, 54, 18, 55, 31, 55, 87, 49, 17, 51, 64, 54, 64, 55, 80, 55, 85, 49, 81, 51, 21, 49, 89, 49, 91, 49, 95, 50, 70, 51, 66, 49, 25, 49, 3, 49, 7, 49, 86, 55, 90, 56, 64, 51, 31, 48, 81, 49, 86, 55, 90, 56, 65, 51, 85, 48, 92, 49, 21, 55, 87, 56, 85, 51, 94, 48, 85, 49, 86, 55, 86, 56, 81, 54, 100, 56, 95, 56, 66, 51, 81, 49, 92, 49, 81, 48, 94, 51, 71, 52, 69, 49, 28, 49, 14, 48, 4, 49, 86, 53, 82, 53, 87, 56, 88, 52, 88, 49, 92, 53, 82, 49, 91, 53, 85, 48, 66, 52, 84, 49, 80, 49, 87, 53, 70, 48, 79, 49, 91, 50, 64, 49, 76, 49, 95, 56, 91, 49, 94, 49, 90, 51, 81, 56, 64, 55, 64, 50, 80, 49, 80, 51, 81, 56, 64, 49, 80, 52, 86, 49, 86, 48, 89, 57, 29, 49, 66, 52, 86, 49, 82, 48, 87, 56, 93, 51, 92, 54, 87, 53, 76, 48, 75, 48, 30, 53, 7, 51, 90, 54, 91, 54, 68, 55, 25, 49, 86, 52, 88, 52, 89, 48, 66, 52, 86, 51, 92, 54, 25, 54, 67, 55, 68, 49, 82, 52, 85, 52, 83, 49, 86, 50, 84, 51, 90, 50, 87, 49, 65, 49, 67, 49, 103, 49, 95, 55, 77, 54, 88, 57, 84, 49, 21, 49, 85, 55, 112, 54, 90, 57, 71, 51, 80, 54, 91, 57, 95, 52, 93, 49, 19, 49, 98, 55, 80, 54, 64, 57, 93, 51, 84};
                }

                private static int wrexlymhmevnlixp(int i, int i2) {
                    return i ^ i2;
                }
            }
