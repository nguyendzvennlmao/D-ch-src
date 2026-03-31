package com.kammoun.donutCore.team.gui;

import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public abstract class ConfirmationMenu {
    private final String title;
    private final String confirmText;
    private final String declineText;
    private final String[] confirmLore;
    private final String[] declineLore;
    private static int fbhPcYJk4j = 0;

    private transient int f115334cn5JMBD = 888484864;
    private static String fnkphpnhew;
    private static String[] nothing_to_see_here = new String[15];

    public static class ConfirmationMenuHolder implements InventoryHolder {
        private static int XaloZWs2V1 = 0;
        private transient int g89NtEkYqb = 1103795200;
        private static byte[] glvpywgbjh;
        private static String[] nothing_to_see_here = new String[19];

        public ConfirmationMenuHolder() {
            ppyjlpbqncudbyen(719032672 ^ 1694599028, 1630142261);
            int parseInt = 12020002 ^ (459904782 ^ Integer.parseInt("892147469"));
            this.g89NtEkYqb = 1103795200 ^ XaloZWs2V1;
            ppyjlpbqncudbyen(parseInt, 1815275055);
        }

        @NotNull
        public Inventory getInventory() {
            int i = 1437596818 ^ (998557383 ^ 1117793708);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1683537865) {
                int i2 = 428919123 ^ i;
                return null;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1683537865 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (25164007 ^ i)) {
                    int i3 = 2023126359 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1461783215 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (94311507 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1580635254 ^ i;
            throw new RuntimeException();
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
            glvpywgbjh = dukrahbjkxtnunv();
            XaloZWs2V1 = (-383485108) ^ new Random(-8485128309282641999L).nextInt();
        }

        public static String tzjcklnchg(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= bArr.length) {
                    return new String(bArr, StandardCharsets.UTF_16);
                }
                bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                bArr[i3] = (byte) (bArr[i3] ^ glvpywgbjh[i3 % glvpywgbjh.length]);
                i2 = i3 + 1;
            }
        }

        private static byte[] dukrahbjkxtnunv() {
            return new byte[]{123, 88, 70, 37, 81, Byte.MAX_VALUE, 81, 83, 84, 114, 125, 114, 27, 85, 47, 10, 40, 87, 51, 68, 103, 92, 124, 108, 34, 55, 31, 50, 77, 32, 33, 9, 82, 27, 43, 35, 4, 10, 117, 112, 119, 126, 123, 26, 34, 86, 122, 75, 63, 122, 86, 76, 85, 3, 82, 58, 79, 86, 24, 114};
        }

        private static int ppyjlpbqncudbyen(int i, int i2) {
            return i ^ i2;
        }
    }

    public ConfirmationMenu(String str) {
        this(str, "&aConfirm", "&cDecline", null, null, 1166003717);
        int i = 102316325 ^ 1593474666;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                case 182523457:
                default:
                    throw new IllegalAccessException();
                case 204997322:
                    int i2 = 2105137478 ^ i;
                    break;
                case 1843518559:
                case 1891011319:
                    break;
            }
        }
        int parseInt = 1016744204 ^ (1645055515 ^ Integer.parseInt("2064472350"));
        this.f115334cn5JMBD = 888484864 ^ fbhPcYJk4j;
        int gvetxqieuqkfvcbj = 286054974 ^ gvetxqieuqkfvcbj(parseInt, 839517196);
    }

    public ConfirmationMenu(String str, String str2, String str3, String[] strArr, String[] strArr2, int i) {
        gvetxqieuqkfvcbj(70308736 ^ 8652065, 1932632596);
        int parseInt = 925559296 ^ (1000523691 ^ Integer.parseInt("2064472350"));
        this.f115334cn5JMBD = 888484864 ^ fbhPcYJk4j;
        this.title = str;
        this.confirmText = str2;
        this.declineText = str3;
        this.confirmLore = strArr;
        this.declineLore = strArr2;
        int i2 = 207050970 ^ (1223049077 ^ (355740547 ^ (1853491587 ^ (875154024 ^ (951603722 ^ (1472209966 ^ parseInt))))));
    }

    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.ConfirmationMenu.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    public abstract void onConfirm(Player player, int i);

    public void onDecline(Player player, int i) {
        int i2 = 198745537 ^ (370756285 ^ 1860072150);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1728238253) {
            int i3 = 704197528 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1728238253 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1505130414 ^ i2)) {
                int i4 = 563030314 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -684412526 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (563335876 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 998439298 ^ i2;
        throw new IllegalAccessException();
    }

    public void openInventory(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.ConfirmationMenu.openInventory(org.bukkit.entity.Player, int):void");
    }

    private ItemStack confirmationItem(int i) {
        int i2 = 1670026395 ^ (411806795 ^ 1860072150);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1359327184) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1359327184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (431369192 ^ i2)) {
                    break;
                }
            }
            int i3 = 1917399151 ^ i2;
            throw new IOException("double");
        }
        int i4 = 467270440 ^ i2;
        ItemStack itemStack = new ItemStack(Material.LIME_CONCRETE);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1882556784) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1882556784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1898749924 ^ i4)) {
                    break;
                }
            }
            int i5 = 2126407427 ^ i4;
            throw new IOException("double");
        }
        int i6 = 2003545106 ^ i4;
        ItemMeta itemMeta = itemStack.getItemMeta();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -882316829) {
            int i7 = 996376264 ^ i6;
            itemMeta.setDisplayName(ChatFormater.color(this.confirmText));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 275980194) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 275980194 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (2023971153 ^ i7)) {
                        break;
                    }
                }
                int i8 = 1003679480 ^ i7;
                throw new IllegalAccessException("double");
            }
            i6 = 1126713637 ^ i7;
            if (this.confirmLore != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 154228360) {
                    i6 = 289337597 ^ i6;
                    if (this.confirmLore.length > (270064172 ^ i6)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2134453920) {
                            int i9 = 290310561 ^ i6;
                            Stream stream = Arrays.stream(this.confirmLore);
                            Function function = ChatFormater::color;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 178822248) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 178822248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (2103739695 ^ i9)) {
                                        break;
                                    }
                                }
                                int i10 = 769594100 ^ i9;
                                throw new RuntimeException("double");
                            }
                            int i11 = 250820102 ^ i9;
                            Stream map = stream.map(function);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 2100374616) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 2100374616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (679548680 ^ i11)) {
                                        break;
                                    }
                                }
                                int i12 = 270429741 ^ i11;
                                throw new IOException("double");
                            }
                            i6 = 816241841 ^ i11;
                            List list = map.toList();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -133707311) {
                                int i13 = 713743070 ^ i6;
                                itemMeta.setLore(list);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) != -1403969760) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1403969760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (229060880 ^ i13)) {
                                            break;
                                        }
                                    }
                                    int i14 = 721339320 ^ i13;
                                    throw new RuntimeException("double");
                                }
                                i6 = 1319167300 ^ i13;
                            }
                        }
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6)) {
                            case 254817965:
                                i6 = 1261575308 ^ i6;
                                break;
                            case 759669467:
                                break;
                            case 1280630188:
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 154228360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1429909058 ^ i6)) {
                        int i15 = 696543194 ^ i6;
                        throw new IllegalAccessException("double");
                    }
                }
            } else {
                i6 = gvetxqieuqkfvcbj(i6, 1510796401);
            }
            itemStack.setItemMeta(itemMeta);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -648661758) {
                int i16 = 408044094 ^ i6;
                return itemStack;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -648661758 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (114374767 ^ i6)) {
                int i17 = 1311306821 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -133707311 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1220442804 ^ i6)) {
                    int i18 = 1638132736 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -882316829 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (803805025 ^ i6)) {
                        int i19 = 1694722705 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 465839346 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1250313963 ^ i6)) {
                            int i20 = 486484782 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2134453920 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (900903144 ^ i6)) {
                                int i21 = 698170808 ^ i6;
                                throw new IllegalAccessException();
                            }
                        }
                    }
                }
            }
        }
    }

    private ItemStack declineItem(int i) {
        int i2 = 1527065308 ^ (1598468982 ^ 1860072150);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1424972771) {
            i2 = 1646312293 ^ i2;
            ItemStack itemStack = new ItemStack(Material.RED_CONCRETE);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1172996296) {
                i2 = 1822412051 ^ i2;
                ItemMeta itemMeta = itemStack.getItemMeta();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 555018323) {
                    i2 = 1140267585 ^ i2;
                    itemMeta.setDisplayName(ChatFormater.color(this.declineText));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1051474521) {
                        i2 = 1289582722 ^ i2;
                        if (this.declineLore != null) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1481113163) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1481113163 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (340509020 ^ i2)) {
                                        break;
                                    }
                                }
                                int i3 = 445524610 ^ i2;
                                throw new IOException("double");
                            }
                            i2 = 552383537 ^ i2;
                            if (this.declineLore.length > (1273252856 ^ i2)) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1596088258) {
                                    int i4 = 1283624035 ^ i2;
                                    Stream stream = Arrays.stream(this.declineLore);
                                    Function function = ChatFormater::color;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 993410264) {
                                        i2 = 1480434038 ^ i4;
                                        Stream map = stream.map(function);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -86296726) {
                                            i4 = 2081231589 ^ i2;
                                            List list = map.toList();
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 447979585) {
                                                i4 = 2116386980 ^ i4;
                                                itemMeta.setLore(list);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -341858974) {
                                                    i2 = 2093122970 ^ i4;
                                                    itemStack.setItemMeta(itemMeta);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 227248561) {
                                                        int i5 = 718758183 ^ i2;
                                                        return itemStack;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 447979585 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1904654155 ^ i4)) {
                                            int i6 = 557633234 ^ i4;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -341858974 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1716057217 ^ i4)) {
                                                int i7 = 1295397204 ^ i4;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 993410264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (501692734 ^ i4)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    int i8 = 388303876 ^ i4;
                                    throw new IllegalAccessException("double");
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 227248561 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2014641139 ^ i2)) {
                                        int i9 = 1188326205 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -86296726 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2082264430 ^ i2)) {
                                            int i10 = 938105256 ^ i2;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1596088258 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1052656587 ^ i2)) {
                                                int i11 = 1580185065 ^ i2;
                                                throw new RuntimeException("double");
                                            }
                                        }
                                    }
                                }
                            }
                            while (true) {
                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                    case 50993364:
                                        i2 = 1783970510 ^ i2;
                                        break;
                                    case 1811630480:
                                        break;
                                    case 2098963713:
                                }
                            }
                        }
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                case 258016413:
                                    i2 = 1253674751 ^ i2;
                                    break;
                                case 1426232893:
                                case 1519327642:
                                    break;
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1172996296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1084860191 ^ i2)) {
                    int i12 = 1523647529 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1529905288 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (97330841 ^ i2)) {
                        int i13 = 677576401 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1051474521 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1863206005 ^ i2)) {
                            int i14 = 1544045779 ^ i2;
                            throw new IllegalAccessException();
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 555018323 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1789465716 ^ i2)) {
                int i15 = 1688040762 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1424972771 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1899151702 ^ i2)) {
                    int i16 = 1810829329 ^ i2;
                    throw new IllegalAccessException("double");
                }
            }
        }
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⢰⣧⣼⣯⠄⣸⣠⣶⣶⣦⣾⠄⠄⠄⠄⡀⠄⢀⣿⣿⠄⠄⠄⢸⡇⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿⠄";
        nothing_to_see_here[2] = "⠄⠄⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿⠄";
        nothing_to_see_here[3] = "⠄⠄⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⠄";
        nothing_to_see_here[4] = "⠄⢀⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋⣰";
        nothing_to_see_here[5] = "⠄⣼⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀⣤";
        nothing_to_see_here[6] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿⡗";
        nothing_to_see_here[7] = "⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄";
        nothing_to_see_here[8] = "⢸⣿⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄";
        nothing_to_see_here[9] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃⠄";
        nothing_to_see_here[10] = "⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄⠄";
        nothing_to_see_here[11] = "⠄⠄⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄⠄";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠈⠛⢿⣿⣿⣿⠁⠞⢿⣿⣿⡄⢿⣿⡇⣸⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄";
        nothing_to_see_here[13] = "⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣾⣦⡙⠻⣷⣾⣿⠃⠿⠋⠁⠄⠄⠄⠄⠄⢀⣠⣴";
        nothing_to_see_here[14] = "⣿⣿⣿⣶⣶⣮⣥⣒⠲⢮⣝⡿⣿⣿⡆⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⣠⣴⣿⣿⣿";
        fnkphpnhew = ByteBuffer.wrap(suxarnsbixbetzj()).asCharBuffer().toString();
        fbhPcYJk4j = 1472407548 ^ new Random(2155583841406840835L).nextInt();
    }

    public static String obwtglxise(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = fnkphpnhew.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] hdzuphijwvooojm() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 0};
    }

    private static byte[] suxarnsbixbetzj() {
        return new byte[]{50, 18};
    }

    private static int gvetxqieuqkfvcbj(int i, int i2) {
        return i ^ i2;
    }
}
