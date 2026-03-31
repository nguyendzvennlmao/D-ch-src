package com.kammoun.donutCore.sell.config;

import com.kammoun.donutCore.api.configuration.KConfigLoader;
import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.sell.service.Enums.MultiplierStatus;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Material;

public class ConfigManager extends KConfigLoader {
    private String soldTotalMessage;
    private String MultiplierGuiTitle;
    private String itemWorthLore;
    private int MultiplierGuiSize;
    private final Map<MultiplierStatus, KItem> multiplierItems;
    private KItem backButton;
    private KItem nextPageButton;
    private CategoryConfigLoader categoryConfigLoader;
    private List<Long> levelPrices;
    private static int cK5Rb20VAZ = 0;
    private transient int NWxnip2zle = 1996508800;
    private static byte[] ntyxojpjdt;
    private static String[] nothing_to_see_here = new String[13];

    public ConfigManager(org.bukkit.plugin.java.JavaPlugin r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.config.ConfigManager.<init>(org.bukkit.plugin.java.JavaPlugin, int):void");
    }

    public void loadConfig(int i) {
        int i2 = 2013123017 ^ (1709164935 ^ 934105241);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 746211001) {
            int i3 = 1743851819 ^ i2;
            getConfig(533900686);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 334680034) {
                int i4 = 1158854211 ^ i3;
                loadMessages(1709326650);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 996638200) {
                    int i5 = 1519253222 ^ i4;
                    this.categoryConfigLoader = new CategoryConfigLoader(this.plugin, 516087972);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -284636470) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -284636470 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (153930379 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 1981816618 ^ i5;
                        throw new IllegalAccessException("double");
                    }
                    int i7 = 1291422181 ^ i5;
                    ArrayList arrayList = new ArrayList(this.config.getLongList(bkzxcrydts(wvilwuudgnmozou(), i7)));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -2000386592) {
                        int i8 = 2051771646 ^ i7;
                        Collections.sort(arrayList);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1519968787) {
                            i2 = 1175461195 ^ i8;
                            this.levelPrices = arrayList;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1779959881) {
                                i8 = 2123914 ^ i2;
                                this.itemWorthLore = this.config.getString(bkzxcrydts(ihplcdhadbzsffu(), i8), bkzxcrydts(qaycrrjjzylfrtg(), i8));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1796951065) {
                                    i2 = 214413138 ^ i8;
                                    this.MultiplierGuiTitle = this.config.getString(bkzxcrydts(gfbttsifrnljqfh(), i2), bkzxcrydts(iieowuswtblmgwy(), i2));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 220608137) {
                                        int i9 = 110820273 ^ i2;
                                        this.backButton = KItem.fromConfig(this.config.getConfigurationSection(bkzxcrydts(shlagvkdydjuxoz(), i9)), 2126963651);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 972155649) {
                                            i8 = 1718994437 ^ i9;
                                            this.nextPageButton = KItem.fromConfig(this.config.getConfigurationSection(bkzxcrydts(avfrigyhyrlrxac(), i8)), 2126963651);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 174054186) {
                                                i8 = 1900672695 ^ i8;
                                                this.MultiplierGuiSize = this.config.getInt(bkzxcrydts(zmpifpduelaebeu(), i8), (byte) (805440996 ^ i8));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -2146406767) {
                                                    i7 = 1720115675 ^ i8;
                                                    MultiplierStatus[] values = MultiplierStatus.values();
                                                    int length = values.length;
                                                    int i10 = (byte) (1451551753 ^ i7);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1272487862) {
                                                        int i11 = 73331479 ^ i7;
                                                        while (true) {
                                                            int i12 = i11;
                                                            if (i10 >= length) {
                                                                ateokcgorguktqiv(i12, 1433965594);
                                                                return;
                                                            }
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1764689678) {
                                                                i3 = 656214793 ^ i12;
                                                                MultiplierStatus multiplierStatus = values[i10];
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1372020549) {
                                                                    i9 = 153276656 ^ i3;
                                                                    String str = "progress-items." + multiplierStatus.name();
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -416405701) {
                                                                        int i13 = 1360916772 ^ i9;
                                                                        KItem fromConfig = KItem.fromConfig(this.config.getConfigurationSection(str), 2126963651);
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1874963993) {
                                                                            i4 = 1959444924 ^ i13;
                                                                            this.multiplierItems.put(multiplierStatus, fromConfig);
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -912808966) {
                                                                                int i14 = 1159282343 ^ i4;
                                                                                i10 += 472632025 ^ i14;
                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -513911104) {
                                                                                    int ateokcgorguktqiv = ateokcgorguktqiv(i14, 1245500647);
                                                                                    try {
                                                                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(ateokcgorguktqiv) == 114072717) {
                                                                                            throw new RuntimeException();
                                                                                        }
                                                                                        throw null;
                                                                                    } catch (RuntimeException e) {
                                                                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                                                            case -1330056710:
                                                                                                i3 = 1823427849 ^ ateokcgorguktqiv;
                                                                                                break;
                                                                                            case 1560238930:
                                                                                                i3 = 1898428508 ^ ateokcgorguktqiv;
                                                                                                break;
                                                                                            default:
                                                                                                throw new RuntimeException("Error in hash");
                                                                                        }
                                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -708666959) {
                                                                                            i11 = ateokcgorguktqiv(i3, 1751272488);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    while (true) {
                                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -513911104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (2068111241 ^ i14)) {
                                                                                            int i15 = 2040975324 ^ i14;
                                                                                            throw new IllegalAccessException("double");
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            while (true) {
                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1874963993 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (527780743 ^ i13)) {
                                                                                    int i16 = 1308500403 ^ i13;
                                                                                    throw new RuntimeException("double");
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                while (true) {
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1764689678 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (548681362 ^ i12)) {
                                                                        int i17 = 1305153570 ^ i12;
                                                                        throw new RuntimeException("double");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 972155649 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (952412488 ^ i9)) {
                                                int i18 = 794077529 ^ i9;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -416405701 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (671280682 ^ i9)) {
                                                    int i19 = 1581576268 ^ i9;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1560238930 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (523110465 ^ i9)) {
                                                        int i20 = 1948170241 ^ i9;
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
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -2146406767 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (735736989 ^ i8)) {
                                int i21 = 1715968479 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1796951065 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (136274619 ^ i8)) {
                                    int i22 = 106468487 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1519968787 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2113166489 ^ i8)) {
                                        int i23 = 219713425 ^ i8;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 174054186 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2043220129 ^ i8)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        int i24 = 1939093284 ^ i8;
                        throw new IllegalAccessException("double");
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -2000386592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (631575105 ^ i7)) {
                            int i25 = 247289506 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1272487862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1122437152 ^ i7)) {
                                int i26 = 1594812626 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1330056710 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (121257792 ^ i7)) {
                                    int i27 = 1991404032 ^ i7;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1024743456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (23252864 ^ i7)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    int i28 = 290335731 ^ i7;
                    throw new RuntimeException();
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -912808966 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2130019569 ^ i4)) {
                        int i29 = 770289623 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 996638200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1422286831 ^ i4)) {
                            int i30 = 1870361016 ^ i4;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1372020549 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1348738120 ^ i3)) {
                    int i31 = 531755169 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -708666959 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1145456279 ^ i3)) {
                        int i32 = 751757201 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 334680034 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1364945113 ^ i3)) {
                            int i33 = 594591824 ^ i3;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 746211001 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1574670669 ^ i2)) {
                int i34 = 620998634 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1779959881 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (619340246 ^ i2)) {
                    int i35 = 432003191 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 220608137 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (213765644 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i36 = 910704966 ^ i2;
        throw new RuntimeException("double");
    }

    private void loadMessages(int i) {
        int i2 = 1021992327 ^ (393720194 ^ 934105241);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -511318816) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -511318816 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (857100610 ^ i2)) {
                    break;
                }
            }
            int i3 = 1998959945 ^ i2;
            throw new IOException("double");
        }
        int i4 = 627069174 ^ i2;
        this.soldTotalMessage = this.config.getString(bkzxcrydts(pdeeonrcfunlqgn(), i4), bkzxcrydts(odkytdrhnkdcyxn(), i4));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -897096879) {
            int i5 = 1010957849 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 680039320 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2100931688 ^ i4)) {
                int i6 = 1130679058 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -897096879 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1411357264 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 1533161122 ^ i4;
        throw new RuntimeException();
    }

    public KItem getMultiplierItem(MultiplierStatus multiplierStatus, int i) {
        int i2 = 972660422 ^ (1985232819 ^ 934105241);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1073246365) {
            int i3 = 1620899949 ^ i2;
            return this.multiplierItems.getOrDefault(multiplierStatus, new KItem(Material.BARRIER, 1181456562));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -991933432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1068108558 ^ i2)) {
                int i4 = 1690250702 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1073246365 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (489752349 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 231946109 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public String getSoldTotalMessage(int i) {
        int i2 = 204001267 ^ (771282328 ^ 934105241);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1276487792) {
            int i3 = 952657986 ^ i2;
            return this.soldTotalMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1276487792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1687130138 ^ i2)) {
                int i4 = 171050866 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1974015361 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1302523470 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1841342435 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public String getMultiplierGuiTitle(int i) {
        int i2 = 1927161340 ^ (351719170 ^ 934105241);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1943153862) {
            int i3 = 1682188185 ^ i2;
            return this.MultiplierGuiTitle;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1374883855 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (328642537 ^ i2)) {
                int i4 = 714484975 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1943153862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2013684960 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 840647893 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getItemWorthLore(int i) {
        int i2 = 472881070 ^ (1221969589 ^ 934105241);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 448269331) {
            int i3 = 952762595 ^ i2;
            return this.itemWorthLore;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -588772598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (439853189 ^ i2)) {
                int i4 = 417273489 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 448269331 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1812192396 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1325084174 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getMultiplierGuiSize(int i) {
        int i2 = 1393016380 ^ (664051426 ^ 934105241);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 435388986) {
            int i3 = 685750767 ^ i2;
            return this.MultiplierGuiSize;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1594772803 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1508516243 ^ i2)) {
                int i4 = 1489884111 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 435388986 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1523804072 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 879860247 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public Map<MultiplierStatus, KItem> getMultiplierItems() {
        int i = 1007577065 ^ (1334304787 ^ 934105241);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 556186394) {
            int i2 = 1228215833 ^ i;
            return this.multiplierItems;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 556186394 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (994398169 ^ i)) {
                int i3 = 606552052 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1754139600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (934678161 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 82166941 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public KItem getBackButton(int i) {
        int i2 = 779910068 ^ (942510843 ^ 934105241);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 266718897) {
            int i3 = 852936554 ^ i2;
            return this.backButton;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1722550816 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (659262227 ^ i2)) {
                int i4 = 659132261 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 266718897 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (484838092 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 903413115 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public KItem getNextPageButton(int i) {
        int i2 = 739805138 ^ (1335596744 ^ 934105241);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1586361318) {
            int i3 = 1757126625 ^ i2;
            return this.nextPageButton;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -458296559 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1855195014 ^ i2)) {
                int i4 = 1410628218 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1586361318 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (783164159 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 551265915 ^ i2;
        throw new IOException();
    }

    @Generated
    public CategoryConfigLoader getCategoryConfigLoader(int i) {
        int i2 = 649962729 ^ (1389751257 ^ 934105241);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 506002762) {
            int i3 = 757474024 ^ i2;
            return this.categoryConfigLoader;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1998187019 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (673440209 ^ i2)) {
                int i4 = 1227076330 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 506002762 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1422319363 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 196813192 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public List getLevelPrices(int i) {
        int i2 = 907023825 ^ (1340893776 ^ 934105241);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1921611970) {
            int i3 = 523900279 ^ i2;
            return this.levelPrices;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1921611970 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (625859419 ^ i2)) {
                int i4 = 759228283 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1957047430 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1933017946 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1881469363 ^ i2;
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
        ntyxojpjdt = ihzlyswrilxzlfk();
        cK5Rb20VAZ = (-1526001218) ^ new Random(5299981491535345593L).nextInt();
    }

    public static String bkzxcrydts(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ ntyxojpjdt[i3 % ntyxojpjdt.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] ihzlyswrilxzlfk() {
        return new byte[]{19, 78, 59, 50, 19, 18, 82, 3, 71, 51, 101, 63, 52, 19, 113, 89, 110, 39, 61, 5, 123, 60, 106, 31, 8, 72, 39, 42, 66, 38, 108, 83, 111, 93, 41, 24, 40, 100, 10, 111, 32, 40, 86};
    }

    private static byte[] avfrigyhyrlrxac() {
        return new byte[]{-36, -127, 2, 119, 39, 89, 106, 89, 126, 99, 84, 125, 13, 67, 69, 19, 86, 97, 4, 31, 74, 101, 83, 94, 60, 20, 31, 114, 123, 98, 93, 77, 86, 38, 29, 68, 16, 41, 51, 44, 17, 53, 111, 118, 122, 99, 10, 65, 43, 0};
    }

    private static byte[] gfbttsifrnljqfh() {
        return new byte[]{-40, -121, 15, 75, 39, 81, 107, 93, 126, 114, 83, 98, 0, 87, 71, 12, 92, 119, 8, 86, 79, 122, 94, 4, 49, 55, 30, 122, 116, 124, 88, 18, 89, 74, 27, 117, 29, 59, 62, 47, 20, 114, 111, 68};
    }

    private static byte[] iieowuswtblmgwy() {
        return new byte[]{-40, -121, 15, 32, 39, 18, 107, 23, 126, 106, 83, 88, 0, 66, 71, 12, 92, 114, 8, 19, 79, 69, 94, 92, 49, 22, 30, 107, 116, 123, 88, 23, 89, 8, 27, 72, 29, 55, 62, 41};
    }

    private static byte[] ihplcdhadbzsffu() {
        return new byte[]{-38, -121, 10, 111, 43, 95, 101, 95, 114, 105, 83, 35, 0, 92, 72, 1, 87, 96, 10, 71, 74, 96, 82, 11, 63, 29, 18, 114, 116, 101, 88, 14};
    }

    private static byte[] qaycrrjjzylfrtg() {
        return new byte[]{-38, -121, 10, 32, 43, 28, 101, 109, 114, 107, 83, 124, 0, 95, 72, 6, 87, 40, 10, 19, 74, 46, 82, 5, 63, 65, 18, 45, 116, 113, 88, 82, 86, 90, 16, 29, 31, 118, 59, 126, 24, 102, 97, 69, 123, 126, 4, 86, 38, 2, 58, 85};
    }

    private static byte[] wvilwuudgnmozou() {
        return new byte[]{-33, -119, 13, 102, 33, 69, 103, 77, Byte.MAX_VALUE, 100, 93, 101, 12, 12, 67, 28, 86, 109, 15, 84, 77, 103, 88, 72, 61, 3};
    }

    private static byte[] zmpifpduelaebeu() {
        return new byte[]{-43, -127, 14, 75, 39, 87, 107, 88, Byte.MAX_VALUE, Byte.MAX_VALUE, 85, 99, 0, 87, 65, 12, 89, 118, 5, 80, 78, 122, 94, 2, 49, 50, 31, 119, 114, 125, 88, 18, 95, 74, 30, 115, 16, 61, 63, 33, 20, 125};
    }

    private static byte[] shlagvkdydjuxoz() {
        return new byte[]{-37, -124, 3, 113, 42, 80, 97, 90, Byte.MAX_VALUE, 98, 80, 117, 7, 79, 65, 25, 88, 108, 11, 29, 67, 102, 83, 91, 59, 27, 31, 113, 119, 109, 95, 68, 95, 44, 31, 65, 30, 50, 50, 55, 25, 53, 101, 103, 118, 120, 7, 95, 33, 31, 51, 27, 5, 51};
    }

    private static byte[] pdeeonrcfunlqgn() {
        return new byte[]{-44, -121, 10, 105, 35, 67, 101, 65, 115, 121, 83, 111, 2, 68, 69, 11, 95, 96, 4, 29, 74, 121, 90, 68, 63, 21, 19, 119, 116, 58, 90, 23, 91, 5, 24, 88, 17, 51, 59, 53};
    }

    private static byte[] odkytdrhnkdcyxn() {
        return new byte[]{-44, -121, 10, 34, 35, 5, 101, 2, 115, 58, 83, 104, 2, 26, 69, 94, 95, 35, 4, 24, 74, 46, 90, 14, 63, 24, 19, 126, 116, 120, 90, 22, 91, 4, 24, 88, 17, 119};
    }

    private static int ateokcgorguktqiv(int i, int i2) {
        return i2 ^ i;
    }
}
