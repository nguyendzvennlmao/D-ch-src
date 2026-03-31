package com.kammoun.donutCore.home.gui;

import com.kammoun.donutCore.api.utils.PlaceHolderHelper;
import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.api.utils.menu.KMenu;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public abstract class HomeConfirmMenu extends KMenu {
    private final KItem confirmItem;
    private final KItem denyItem;
    private static int iaTDez8uZO = 0;

    private transient int f645Q3nhqHZSD = 828757657;
    private static String[] nothing_to_see_here = new String[13];

    public static class DeleteHomeConfirmHolder implements InventoryHolder {
        private final String homeName;
        private static int lVEq08Qumc = 0;
        private transient int TtdJ82lw44 = 1131595205;
        private static String yvwmlwnqvy;
        private static String[] nothing_to_see_here = new String[17];

        public DeleteHomeConfirmHolder(java.lang.String r5, int r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeConfirmMenu.DeleteHomeConfirmHolder.<init>(java.lang.String, int):void");
        }

        @NotNull
        public Inventory getInventory() {
            int i = 554231941 ^ (467805124 ^ 1657194671);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1050665102) {
                int i2 = 1855304438 ^ i;
                return null;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1244821311 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1298187026 ^ i)) {
                    int i3 = 297154561 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1050665102 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (26083271 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 606772988 ^ i;
            throw new IOException();
        }

        @Generated
        public String getHomeName(int i) {
            int i2 = 1313388649 ^ (824545621 ^ 1657194671);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -312537960) {
                int i3 = 305179077 ^ i2;
                return this.homeName;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -312537960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2061088564 ^ i2)) {
                    int i4 = 2116859952 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2094678704 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1961849059 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 605052483 ^ i2;
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
            yvwmlwnqvy = ByteBuffer.wrap(eqersfnyrbrwjsa()).asCharBuffer().toString();
            lVEq08Qumc = (-1402380207) ^ new Random(-2917163489961956669L).nextInt();
        }

        public static String ifbryhzmam(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = yvwmlwnqvy.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

        private static byte[] eqersfnyrbrwjsa() {
            return new byte[0];
        }

        private static int xwoawvpvbmfzrzfs(int i, int i2) {
            return i2 ^ i;
        }
    }

    public HomeConfirmMenu(JavaPlugin javaPlugin, int i) {
        super(javaPlugin, "Home/Gui's/DeleteConfirmMenu.yml", 1546437752);
        int i2 = 1765981399 ^ (1629693953 ^ 1237021389);
        int parseInt = 1700467845 ^ (1862928412 ^ Integer.parseInt("1267464834"));
        this.f645Q3nhqHZSD = 828757657 ^ iaTDez8uZO;
        int dikrwpcvlukhsmrx = 2069207172 ^ dikrwpcvlukhsmrx(parseInt, 1221921913);
        this.confirmItem = KItem.fromConfig(getConfig(533900686).getConfigurationSection("Items.Confirm-Delete"), 2126963651);
        this.denyItem = KItem.fromConfig(getConfig(533900686).getConfigurationSection("Items.Cancel-Delete"), 2126963651);
        int i3 = 1897347208 ^ (1430089250 ^ dikrwpcvlukhsmrx);
    }

    public void openMenu(Player player, String str, int i) {
        int i2 = 173994359 ^ (1734306805 ^ 370587716);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -658958797) {
            int i3 = 1835233339 ^ i2;
            DeleteHomeConfirmHolder deleteHomeConfirmHolder = new DeleteHomeConfirmHolder(str, 582418801);
            String[] strArr = new String[(byte) (376722175 ^ i3)];
            strArr[(byte) (376722173 ^ i3)] = uqdfllqqar(gsinbuexmlaxwvu(), ubkbhexhenuoqpe(), i3);
            strArr[(byte) (376722172 ^ i3)] = str;
            loadInventory(deleteHomeConfirmHolder, strArr, 408434007);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1281189912) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1281189912 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (605171261 ^ i3)) {
                        break;
                    }
                }
                int i4 = 793250586 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 1294588124 ^ i3;
            KItem kItem = this.confirmItem;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -622046966) {
                int i5 = 1208734507 ^ i2;
                ItemStack itemStack = kItem.getItemStack(1475551979);
                String[] strArr2 = new String[(byte) (324425992 ^ i5)];
                strArr2[(byte) (324425994 ^ i5)] = uqdfllqqar(jboadpmcyxczodb(), ubkbhexhenuoqpe(), i5);
                strArr2[(byte) (324425995 ^ i5)] = str;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1699559344) {
                    int i6 = 1659381359 ^ i5;
                    ItemStack parsePlaceholders = PlaceHolderHelper.parsePlaceholders(itemStack, strArr2, 1409018373);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1913390293) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1913390293 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1783115900 ^ i6)) {
                                break;
                            }
                        }
                        int i7 = 449984874 ^ i6;
                        throw new RuntimeException("double");
                    }
                    int i8 = 1659955818 ^ i6;
                    KItem kItem2 = this.denyItem;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -1703630728) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1703630728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (868569116 ^ i8)) {
                                break;
                            }
                        }
                        int i9 = 50382272 ^ i8;
                        throw new RuntimeException("double");
                    }
                    i5 = 132357609 ^ i8;
                    ItemStack itemStack2 = kItem2.getItemStack(1475551979);
                    String[] strArr3 = new String[(byte) (346884324 ^ i5)];
                    strArr3[(byte) (346884326 ^ i5)] = uqdfllqqar(prpnioupjmnaktg(), ubkbhexhenuoqpe(), i5);
                    strArr3[(byte) (346884327 ^ i5)] = str;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1519892688) {
                        int i10 = 1300300798 ^ i5;
                        ItemStack parsePlaceholders2 = PlaceHolderHelper.parsePlaceholders(itemStack2, strArr3, 1409018373);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != -916432702) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -916432702 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (11691116 ^ i10)) {
                                    break;
                                }
                            }
                            int i11 = 2030561022 ^ i10;
                            throw new IOException("double");
                        }
                        int i12 = 452226771 ^ i10;
                        this.inventory.setItem(this.confirmItem.getSlot(1791774489).intValue(), parsePlaceholders);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != 516107866) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 516107866 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (748122333 ^ i12)) {
                                    break;
                                }
                            }
                            int i13 = 1277649355 ^ i12;
                            throw new IllegalAccessException("double");
                        }
                        i2 = 741231570 ^ i12;
                        this.inventory.setItem(this.denyItem.getSlot(1791774489).intValue(), parsePlaceholders2);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2142335179) {
                            i2 = 478555552 ^ i2;
                            player.openInventory(this.inventory);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1686102581) {
                                int i14 = 20049554 ^ i2;
                                return;
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1519892688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1036080062 ^ i5)) {
                        int i15 = 1207239424 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1699559344 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2133793006 ^ i5)) {
                            break;
                        }
                    }
                }
                int i16 = 10537810 ^ i5;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2142335179 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (558046303 ^ i2)) {
                int i17 = 1338119629 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -658958797 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1875120622 ^ i2)) {
                    int i18 = 237050018 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1686102581 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1816995051 ^ i2)) {
                        int i19 = 1270910095 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -622046966 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (712126249 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i20 = 2094232329 ^ i2;
        throw new IllegalAccessException();
    }

    public abstract void onConfirm(Player player, String str, int i);

    public abstract void onDeny(Player player, int i);

    @Override
    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeConfirmMenu.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    private boolean isSimilarIgnoringMeta(ItemStack itemStack, ItemStack itemStack2, int i) {
        int i2;
        byte b;
        int dikrwpcvlukhsmrx;
        int i3 = 1866405256 ^ (347060511 ^ 370587716);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1815127707) {
            int i4 = 453374828 ^ i3;
            if (itemStack == null) {
                i2 = 883158864 ^ i4;
            } else {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1273020933) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1273020933 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (930674742 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 913802746 ^ i4;
                    throw new IllegalAccessException("double");
                }
                int i6 = 260884687 ^ i4;
                if (itemStack2 != null) {
                    i3 = dikrwpcvlukhsmrx(i6, 771522846);
                    if (itemStack.getType() != itemStack2.getType()) {
                        i3 = 1297392086 ^ i3;
                        b = (byte) (430378936 ^ i3);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -851935808) {
                            int i7 = 612773043 ^ i3;
                            return b;
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1482853518) {
                        i3 = 716935808 ^ i3;
                        b = (byte) (2118663407 ^ i3);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -230561933) {
                            int i8 = 2092009277 ^ i3;
                            try {
                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i8) != 46801644) {
                                    throw null;
                                }
                                throw new RuntimeException();
                            } catch (RuntimeException e) {
                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                    case 399367832:
                                        dikrwpcvlukhsmrx = dikrwpcvlukhsmrx(i8, 1506415787);
                                        break;
                                    case 718535698:
                                        dikrwpcvlukhsmrx = dikrwpcvlukhsmrx(i8, 510251258);
                                        break;
                                    default:
                                        throw new IOException("Error in hash");
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dikrwpcvlukhsmrx) == -643990590) {
                                    int i9 = 1712491635 ^ dikrwpcvlukhsmrx;
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dikrwpcvlukhsmrx) == -643990590 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dikrwpcvlukhsmrx) == (672987991 ^ dikrwpcvlukhsmrx)) {
                                            int i10 = 603765633 ^ dikrwpcvlukhsmrx;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -931562621) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -931562621 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (25020639 ^ i6)) {
                                break;
                            }
                        }
                        int i11 = 1831037478 ^ i6;
                        throw new IllegalAccessException("double");
                    }
                    i2 = 992946079 ^ i6;
                }
            }
            return (byte) (1109395695 ^ i2);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -385279911 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (797221923 ^ i3)) {
                int i12 = 965443468 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 718535698 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (901641386 ^ i3)) {
                    int i13 = 1501137355 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1482853518 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1336777354 ^ i3)) {
                        int i14 = 516723479 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1815127707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1376109218 ^ i3)) {
                            int i15 = 1877859215 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -851935808 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (549899705 ^ i3)) {
                                int i16 = 691561974 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 399367832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2017022757 ^ i3)) {
                                    int i17 = 1169822972 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -230561933 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2072856419 ^ i3)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i18 = 161164360 ^ i3;
        throw new IOException();
    }

    @Override
    protected void setMenuItems(String[] strArr, int i) {
        int i2 = 855988471 ^ (1265264244 ^ 370587716);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1942763067) {
            int i3 = 1395460801 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1942763067 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1292603482 ^ i2)) {
                int i4 = 1830109499 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -358326223 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1847122886 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 56127848 ^ i2;
        throw new RuntimeException();
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
        iaTDez8uZO = 2007039541 ^ new Random(8315683435727606616L).nextInt();
    }

    public static String uqdfllqqar(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] ubkbhexhenuoqpe() {
        return new byte[]{71, 32, 98, 124, 109, 42, 28, 118, 119, 119, 35, 43, 104, 60, 58, 85, 45, 59, 29, 4, 109, 125, 65, 81, 117, 37, 31, 29, 125, 43, 100, 39};
    }

    private static byte[] gsinbuexmlaxwvu() {
        return new byte[]{-118, -24, 84, 110, 95, 112, 45, 46, 68, 41, 20, 120, 95, 81, 8, 10, 26, 105, 46, 94, 91, 47, 115, 70};
    }

    private static byte[] jboadpmcyxczodb() {
        return new byte[]{-118, -19, 86, 109, 95, 119, 37, 32, 67, 41, 17, 122, 92, 81, 15, 2, 20, 110, 46, 91, 89, 44, 115, 65};
    }

    private static byte[] prpnioupjmnaktg() {
        return new byte[]{-118, -21, 84, 97, 85, 118, 47, 43, 65, 41, 23, 120, 80, 91, 14, 8, 31, 108, 46, 93, 91, 32, 121, 64};
    }

    private static int dikrwpcvlukhsmrx(int i, int i2) {
        return i ^ i2;
    }
}
