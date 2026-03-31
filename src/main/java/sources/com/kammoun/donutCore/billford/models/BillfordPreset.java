package com.kammoun.donutCore.billford.models;

import com.kammoun.donutCore.api.utils.items.KItem;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import lombok.Generated;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;

public class BillfordPreset {
    private String name;
    private List<ItemStack> requiredItems;
    private ItemStack tradeItem;
    private boolean enabled;
    private static int LcdCbp2ygC = 0;
    private transient int CSksrr9Fm3 = 1118392482;
    private static byte[] loiyaoelcn;
    private static String[] nothing_to_see_here = new String[15];

    public BillfordPreset(String str, int i) {
        int i2 = 985533884 ^ (1151416056 ^ 1725693534);
        int parseInt = 1534051282 ^ (1684903609 ^ Integer.parseInt("667324529"));
        this.CSksrr9Fm3 = 1118392482 ^ LcdCbp2ygC;
        int wuwllvajbuhhvldm = 1839323273 ^ wuwllvajbuhhvldm(parseInt, 1865466657);
        this.name = str;
        this.requiredItems = new ArrayList();
        this.enabled = true;
        int i3 = 1493123557 ^ (1693914024 ^ (795668152 ^ wuwllvajbuhhvldm));
    }

    public static com.kammoun.donutCore.billford.models.BillfordPreset fromFile(java.io.File r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.models.BillfordPreset.fromFile(java.io.File, int):com.kammoun.donutCore.billford.models.BillfordPreset");
    }

    public void saveToFile(java.io.File r7, int r8) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.models.BillfordPreset.saveToFile(java.io.File, int):void");
    }

    private void saveItemStack(YamlConfiguration yamlConfiguration, String str, ItemStack itemStack, int i) {
        int i2 = 1971447350 ^ (268291324 ^ 822169185);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1542137178) {
            i2 = 1087501179 ^ i2;
            ConfigurationSection createSection = yamlConfiguration.createSection(str);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1566883456) {
                int i3 = 673905759 ^ i2;
                KItem.toConfig(itemStack, createSection, 524174492);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 473128057) {
                    int i4 = 909975981 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 473128057 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (495996186 ^ i3)) {
                        break;
                    }
                }
                int i5 = 132618646 ^ i3;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1542137178 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2132586692 ^ i2)) {
                int i6 = 964192709 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1566883456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2094341240 ^ i2)) {
                    break;
                }
            }
        }
        int i7 = 746241807 ^ i2;
        throw new IOException();
    }

    public boolean isValid(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.models.BillfordPreset.isValid(int):boolean");
    }

    public int getRequiredItemsCount(int i) {
        byte b;
        int i2 = 1086038321 ^ (1981722701 ^ 822169185);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1025702120) {
            i2 = 167183001 ^ i2;
            if (this.requiredItems != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1922755616) {
                    i2 = 85245190 ^ i2;
                    b = this.requiredItems.size();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1514079248) {
                        int wuwllvajbuhhvldm = wuwllvajbuhhvldm(i2, 1381989736);
                        try {
                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(wuwllvajbuhhvldm) != 211806445) {
                                throw null;
                            }
                            throw new RuntimeException();
                        } catch (RuntimeException e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case -2107825830:
                                    i2 = wuwllvajbuhhvldm(wuwllvajbuhhvldm, 1165246077);
                                    break;
                                case -926617774:
                                    i2 = 1277626300 ^ wuwllvajbuhhvldm;
                                    break;
                                default:
                                    throw new IOException("Error in hash");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1443048784) {
                                wuwllvajbuhhvldm(i2, 102676915);
                            }
                        }
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 197233532:
                        i2 = 1365192211 ^ i2;
                        break;
                    case 327980018:
                    default:
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2107825830 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (820263745 ^ i2)) {
                                int i3 = 173744977 ^ i2;
                                throw new RuntimeException("double");
                            }
                        }
                        break;
                    case 400101370:
                    case 954128133:
                        break;
                }
            }
            b = (byte) (1594651543 ^ i2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -127689542) {
                int i4 = 1278038130 ^ i2;
                return b;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -127689542 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1480275387 ^ i2)) {
                    int i5 = 305842250 ^ i2;
                    throw new RuntimeException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1025702120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1194918385 ^ i2)) {
                int i6 = 1279812132 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1727455448 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (976693918 ^ i2)) {
                    int i7 = 1736891220 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1443048784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1378156708 ^ i2)) {
                        int i8 = 649458482 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1514079248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1736438935 ^ i2)) {
                            int i9 = 15224684 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1922755616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (373454737 ^ i2)) {
                                int i10 = 609916687 ^ i2;
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            }
        }
    }

    @Generated
    public String getName(int i) {
        int i2 = 2048378959 ^ (1598060940 ^ 822169185);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1565000432) {
            int i3 = 191703456 ^ i2;
            return this.name;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1565000432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (524505505 ^ i2)) {
                int i4 = 855941035 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -102846448 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (646539643 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 222828923 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public List getRequiredItems(int i) {
        int i2 = 321383197 ^ (1746366221 ^ 822169185);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1368281994) {
            int i3 = 975085313 ^ i2;
            return this.requiredItems;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2122667133 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (969599347 ^ i2)) {
                int i4 = 32402150 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1368281994 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (248070097 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1096655129 ^ i2;
        throw new IOException();
    }

    @Generated
    public ItemStack getTradeItem(int i) {
        int i2 = 1623092382 ^ (2009683472 ^ 822169185);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 867411833) {
            int i3 = 417440552 ^ i2;
            return this.tradeItem;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 867411833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1456752296 ^ i2)) {
                int i4 = 1288797044 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -188826055 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1644168315 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 532796101 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isEnabled(int i) {
        int i2 = 1246542655 ^ (282290074 ^ 822169185);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1559533091) {
            int i3 = 890856581 ^ i2;
            return this.enabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1559533091 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1579480732 ^ i2)) {
                int i4 = 1457206603 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -197152246 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (816197870 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 773462951 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public void setName(String str) {
        int i = 1302604211 ^ (1403596605 ^ 822169185);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2019706745) {
            int i2 = 1797185582 ^ i;
            this.name = str;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2019706745 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (40812708 ^ i)) {
                int i3 = 2018478831 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 546653706 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (920300664 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 108973951 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public void setRequiredItems(List list, int i) {
        int i2 = 952519560 ^ (469153216 ^ 822169185);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1852997304) {
            int i3 = 561088966 ^ i2;
            this.requiredItems = list;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1711157383 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (810233257 ^ i2)) {
                int i4 = 1657358121 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1852997304 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1420924155 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 49727024 ^ i2;
        throw new IOException();
    }

    @Generated
    public void setTradeItem(ItemStack itemStack, int i) {
        int i2 = 736070266 ^ (1947933440 ^ 822169185);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1982789851) {
            int i3 = 671657718 ^ i2;
            this.tradeItem = itemStack;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1982789851 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (793428799 ^ i2)) {
                int i4 = 1179694639 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 913018730 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1799048637 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1380290984 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public void setEnabled(boolean z, int i) {
        int i2 = 1567637773 ^ (1522406408 ^ 822169185);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1233593567) {
            int i3 = 1172762008 ^ i2;
            this.enabled = z;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1722828829 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1429480765 ^ i2)) {
                int i4 = 1146455549 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1233593567 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (355939130 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 158408297 ^ i2;
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
        loiyaoelcn = njxefzjcspitwdh();
        LcdCbp2ygC = (-1708196200) ^ new Random(8575953705100234662L).nextInt();
    }

    public static String uugsmqxdcz(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ loiyaoelcn[i3 % loiyaoelcn.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] njxefzjcspitwdh() {
        return new byte[]{87, 108, 119, 80, 87, 29, 104};
    }

    private static byte[] mybtgubbaabdzge() {
        return new byte[]{-104, -94, 66, 29, 101, 88, 95, 5, 93, 36, 97, 3, 40, 124, 101, 50, 64, 23, 102, 79, 89, 11};
    }

    private static byte[] ynkpmhdqsaafqqt() {
        return new byte[]{-104, -95, 66, 17, 97, 79, 95, 31, 95, 51, 98, 11, 46, 44, 96, 62, 78, 7, 102, 2, 93, 13, 90, 52, 103, 11, 46, 52, 101, 42};
    }

    private static byte[] sjltqxieeorbnnq() {
        return new byte[]{-104, -85, 66, 76, 101, 93, 93, 9, 89, 43};
    }

    private static byte[] rqiitecldpshmbc() {
        return new byte[0];
    }

    private static byte[] bazadrrkrogoogc() {
        return new byte[]{-104, -96, 79, 12, 102, 65, 90, 3, 88, 33, 97, 8, 37, 52, 102, 58};
    }

    private static byte[] wfoyhibzwgcgxbw() {
        return new byte[]{-100, -92, 79, 6, 98, 69, 88, 6, 92, 32, 103, 3, 46, 56, 97, 56};
    }

    private static byte[] fazmsgzjnarmjfc() {
        return new byte[]{-97, -93, 68, 20, 100, 94, 92, 15, 95, 37, 96, 1, 45, 118, 102, 49, 78, 23, 97, 72, 91, 10};
    }

    private static int wuwllvajbuhhvldm(int i, int i2) {
        return i ^ i2;
    }
}
