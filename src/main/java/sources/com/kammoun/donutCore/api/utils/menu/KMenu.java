package com.kammoun.donutCore.api.utils.menu;

import com.kammoun.donutCore.api.configuration.KConfigLoader;
import com.kammoun.donutCore.api.utils.PlaceHolderHelper;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.api.utils.items.KItem;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class KMenu extends KConfigLoader implements InventoryHolder {
    protected Inventory inventory;
    private final String title;
    private final int size;
    private KItem goBack;
    private KItem nextPage;
    private KItem prevPage;
    private KItem closePage;
    private KItem fillerItem;
    private static int OLqYQ9ODXt = 0;
    private transient int L0H0PTmXYw = 1348870307;
    private static String gibdoqemfg;
    private static String[] nothing_to_see_here = new String[18];

    public KMenu(JavaPlugin javaPlugin, String str, int i) {
        super(javaPlugin, str, 1546437752);
        miqbarvnxaqmpisd(442125741 ^ 62114100, 541303472);
        int parseInt = 1502339930 ^ (1405716159 ^ Integer.parseInt("870859724"));
        this.L0H0PTmXYw = 1348870307 ^ OLqYQ9ODXt;
        int miqbarvnxaqmpisd = 376624562 ^ miqbarvnxaqmpisd(parseInt, 359588499);
        this.title = this.config.getString("Title", "Default title");
        this.size = this.config.getInt("Size", 9);
        loadDefaultItems(this.config, 1098556665);
        int i2 = 1252386989 ^ (1511191044 ^ (1327108456 ^ miqbarvnxaqmpisd));
    }

    private void loadDefaultItems(@NotNull FileConfiguration fileConfiguration, int i) {
        int i2 = 683532955 ^ (1254822235 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -223778512) {
            i2 = 16163286 ^ i2;
            this.goBack = KItem.fromConfig(fileConfiguration.getConfigurationSection(jrwexwnbmw(sqasbmnuufiquqd(), i2)), 2126963651);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -182687872) {
                i2 = 1187020057 ^ i2;
                this.nextPage = KItem.fromConfig(fileConfiguration.getConfigurationSection(jrwexwnbmw(fxgmatsirfzgroo(), i2)), 2126963651);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1021341878) {
                    i2 = 1605001377 ^ i2;
                    this.prevPage = KItem.fromConfig(fileConfiguration.getConfigurationSection(jrwexwnbmw(ensccrxwqmsjatd(), i2)), 2126963651);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1045203520) {
                        int i3 = 2028991067 ^ i2;
                        this.closePage = KItem.fromConfig(fileConfiguration.getConfigurationSection(jrwexwnbmw(pikfzhumxbprftd(), i3)), 2126963651);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -114091877) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -114091877 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (447192324 ^ i3)) {
                                    break;
                                }
                            }
                            int i4 = 983086666 ^ i3;
                            throw new IllegalAccessException("double");
                        }
                        i2 = 1356115785 ^ i3;
                        this.fillerItem = KItem.fromConfig(fileConfiguration.getConfigurationSection(jrwexwnbmw(gwfdoigffpeimno(), i2)), 2126963651);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2140562129) {
                            int i5 = 527341997 ^ i2;
                            return;
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1021341878 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1673120870 ^ i2)) {
                int i6 = 572250921 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -223778512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (210999834 ^ i2)) {
                    int i7 = 258678645 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -182687872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1339757315 ^ i2)) {
                        int i8 = 1753733401 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2140562129 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (642063097 ^ i2)) {
                            int i9 = 525302935 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1045203520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (867986529 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i10 = 991839933 ^ i2;
        throw new IllegalAccessException();
    }

    public abstract void handleClick(InventoryClickEvent inventoryClickEvent, int i);

    protected abstract void setMenuItems(String[] strArr, int i);

    public void open(Player player, String[] strArr, int i) {
        int i2 = 1434839072 ^ (1681455718 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1828087042) {
            i2 = 969006014 ^ i2;
            open(player, (byte) (1952388895 ^ i2), (byte) (1952388895 ^ i2), strArr, 2105097920);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1560758029) {
                int i3 = 1451943640 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1828087042 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1540931500 ^ i2)) {
                int i4 = 59098792 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 380603953 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (376909359 ^ i2)) {
                    int i5 = 2124306412 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1560758029 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (619871908 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 493979347 ^ i2;
        throw new RuntimeException();
    }

    public void loadInventory(Player player, int i, int i2, String... strArr) {
        int i3 = 312924752 ^ (513260141 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2137655589) {
            int i4 = 1960774729 ^ i3;
            String color = ChatFormater.color(PlaceHolderHelper.parsePlaceholders(this.title, strArr, 887737915));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 644715664) {
                i3 = 2019945330 ^ i4;
                this.inventory = Bukkit.createInventory(this, this.size, color);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -448606461) {
                    int i5 = 831520511 ^ i3;
                    setNavigationItems(i, i2, 721035695);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1765619962) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1765619962 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1441619911 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 952098167 ^ i5;
                        throw new IllegalAccessException("double");
                    }
                    i4 = 2111586486 ^ i5;
                    setMenuItems(strArr, 196413962);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2015412919) {
                        i4 = 1027843556 ^ i4;
                        addFillerItem(217615484);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1841435240) {
                            int i7 = 1343293914 ^ i4;
                            return;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -313893702 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (217474899 ^ i4)) {
                    int i8 = 1910384585 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1841435240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (753273812 ^ i4)) {
                        int i9 = 764498879 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2015412919 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (639846101 ^ i4)) {
                            int i10 = 1500083493 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 644715664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1733466945 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i11 = 38414253 ^ i4;
            throw new IllegalAccessException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2137655589 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (780833213 ^ i3)) {
                int i12 = 115574248 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -448606461 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1203956772 ^ i3)) {
                    break;
                }
            }
        }
        int i13 = 2005788528 ^ i3;
        throw new IOException("double");
    }

    public void loadInventory(Player player, InventoryHolder inventoryHolder, int i, int i2, String[] strArr, int i3) {
        int i4 = 410554819 ^ (961102139 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -393187086) {
            i4 = 1716023881 ^ i4;
            String color = ChatFormater.color(PlaceHolderHelper.parsePlaceholders(this.title, strArr, 887737915));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -623648071) {
                int i5 = 708339355 ^ i4;
                this.inventory = Bukkit.createInventory(inventoryHolder, this.size, color);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1961830816) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1961830816 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1416289233 ^ i5)) {
                            break;
                        }
                    }
                    int i6 = 1815403544 ^ i5;
                    throw new IllegalAccessException("double");
                }
                int i7 = 678167416 ^ i5;
                setNavigationItems(i, i2, 721035695);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -932131423) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -932131423 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1469594975 ^ i7)) {
                            break;
                        }
                    }
                    int i8 = 2024704624 ^ i7;
                    throw new RuntimeException("double");
                }
                i4 = 1081853809 ^ i7;
                setMenuItems(strArr, 196413962);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -877726165) {
                    i4 = 885752786 ^ i4;
                    addFillerItem(217615484);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1844635834) {
                        int i9 = 1785550821 ^ i4;
                        return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -877726165 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1177073408 ^ i4)) {
                int i10 = 1143094791 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1844635834 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1743931670 ^ i4)) {
                    int i11 = 803430399 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -623648071 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (615996181 ^ i4)) {
                        int i12 = 140812693 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -393187086 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2099977511 ^ i4)) {
                            break;
                        }
                    }
                }
            }
        }
        int i13 = 1221030725 ^ i4;
        throw new IllegalAccessException();
    }

    public void loadInventory(Player player, InventoryHolder inventoryHolder, int i, int i2, boolean z, String... strArr) {
        int i3;
        int i4 = 1643095935 ^ (1125135518 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -152934342) {
            int i5 = 2060136241 ^ i4;
            String color = ChatFormater.color(PlaceHolderHelper.parsePlaceholders(this.title, strArr, 887737915));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 549130673) {
                i4 = 212247017 ^ i5;
                this.inventory = Bukkit.createInventory(inventoryHolder, this.size, color);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1166941945) {
                    i5 = 687897548 ^ i4;
                    if (z == (28424211 ^ i5)) {
                        i3 = 1431578269 ^ i5;
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 227393688) {
                        i4 = 2088487240 ^ i5;
                        setNavigationItems(i, i2, 721035695);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -296514853) {
                            i3 = 691007445 ^ i4;
                        }
                    }
                    setMenuItems(strArr, 196413962);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1490226062) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1490226062 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1792299978 ^ i3)) {
                                break;
                            }
                        }
                        int i6 = 646787148 ^ i3;
                        throw new IllegalAccessException("double");
                    }
                    i4 = 1682362421 ^ i3;
                    addFillerItem(217615484);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2061863463) {
                        int i7 = 74910168 ^ i4;
                        return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 549130673 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1205609236 ^ i5)) {
                    int i8 = 1787960213 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 227393688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (898166588 ^ i5)) {
                        break;
                    }
                }
            }
            int i9 = 1008357789 ^ i5;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2061863463 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (155866335 ^ i4)) {
                int i10 = 1214132457 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -296514853 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1190830589 ^ i4)) {
                    int i11 = 1001687692 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -152934342 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1907130260 ^ i4)) {
                        int i12 = 2136676338 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1166941945 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1258060854 ^ i4)) {
                            break;
                        }
                    }
                }
            }
        }
        int i13 = 1905946278 ^ i4;
        throw new IOException();
    }

    public void loadInventory(Player player, String[] strArr, int i) {
        int i2 = 1698559827 ^ (1046130573 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 975450561) {
            int i3 = 1634113752 ^ i2;
            String color = ChatFormater.color(PlaceHolderHelper.parsePlaceholders(this.title, strArr, 887737915));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 823195394) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 823195394 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (775304263 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1629052376 ^ i3;
                throw new IllegalAccessException("double");
            }
            i2 = 1186735276 ^ i3;
            this.inventory = Bukkit.createInventory(this, this.size, color);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 82956896) {
                i2 = 820579719 ^ i2;
                setNavigationItems((byte) (813119435 ^ i2), (byte) (813119435 ^ i2), 721035695);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2084979111) {
                    int i5 = 1278661542 ^ i2;
                    setMenuItems(strArr, 196413962);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -502324373) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -502324373 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2028949370 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 1286018855 ^ i5;
                        throw new IOException("double");
                    }
                    i2 = 1145491422 ^ i5;
                    addFillerItem(217615484);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1069982311) {
                        int i7 = 299832090 ^ i2;
                        return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2084979111 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (810683957 ^ i2)) {
                int i8 = 961693360 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1069982311 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (872075305 ^ i2)) {
                    int i9 = 1916069730 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 82956896 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1329485724 ^ i2)) {
                        int i10 = 2055685952 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 975450561 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (207418117 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i11 = 2064836791 ^ i2;
        throw new IOException();
    }

    public void loadInventory(InventoryHolder inventoryHolder, String[] strArr, int i) {
        int i2 = 1144781135 ^ (2018015898 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 42133914) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 42133914 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (152100119 ^ i2)) {
                    break;
                }
            }
            int i3 = 1235005091 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1780803683 ^ i2;
        String color = ChatFormater.color(PlaceHolderHelper.parsePlaceholders(this.title, strArr, 887737915));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1403366017) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1403366017 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1949320233 ^ i4)) {
                    break;
                }
            }
            int i5 = 1855966869 ^ i4;
            throw new IOException("double");
        }
        int i6 = 476216134 ^ i4;
        this.inventory = Bukkit.createInventory(inventoryHolder, this.size, color);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1330220879) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1330220879 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (317747600 ^ i6)) {
                    break;
                }
            }
            int i7 = 58666132 ^ i6;
            throw new RuntimeException("double");
        }
        int i8 = 328780504 ^ i6;
        setNavigationItems((byte) (630064331 ^ i8), 544990257 ^ i8, 721035695);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 745547377) {
            i8 = 1524976203 ^ i8;
            setMenuItems(strArr, 196413962);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -77958101) {
                i8 = 342895986 ^ i8;
                addFillerItem(217615484);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1490755515) {
                    int i9 = 1319644766 ^ i8;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 745547377 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (939327767 ^ i8)) {
                int i10 = 758238590 ^ i8;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1490755515 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (810710834 ^ i8)) {
                    int i11 = 1830700418 ^ i8;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -77958101 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (496599295 ^ i8)) {
                        break;
                    }
                }
            }
        }
        int i12 = 1617209054 ^ i8;
        throw new IOException();
    }

    public void open(Player player, int i, int i2, String[] strArr, int i3) {
        int i4 = 141870015 ^ (573726890 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1288966246) {
            i4 = 187766145 ^ i4;
            String color = ChatFormater.color(PlaceHolderHelper.parsePlaceholders(this.title, strArr, 887737915));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -358399086) {
                i4 = 281597275 ^ i4;
                this.inventory = Bukkit.createInventory(this, this.size, color);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1827006794) {
                    i4 = 1371481656 ^ i4;
                    setNavigationItems(i, i2, 721035695);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -518203256) {
                        i4 = 1794542692 ^ i4;
                        setMenuItems(strArr, 196413962);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1230455893) {
                            int i5 = 125872935 ^ i4;
                            addFillerItem(217615484);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1968315757) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1968315757 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2042175983 ^ i5)) {
                                        break;
                                    }
                                }
                                int i6 = 1708052531 ^ i5;
                                throw new IOException("double");
                            }
                            int i7 = 471746896 ^ i5;
                            player.openInventory(this.inventory);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1784653843) {
                                int i8 = 450737831 ^ i7;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1784653843 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (448300854 ^ i7)) {
                                    break;
                                }
                            }
                            int i9 = 1414006895 ^ i7;
                            throw new RuntimeException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1230455893 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1126678895 ^ i4)) {
                int i10 = 955806013 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -518203256 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1905920632 ^ i4)) {
                    int i11 = 952119789 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1288966246 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1070742441 ^ i4)) {
                        int i12 = 2077307239 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -358399086 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1133639956 ^ i4)) {
                            int i13 = 1824493094 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1827006794 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (256048163 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i14 = 328781220 ^ i4;
        throw new IllegalAccessException();
    }

    public void setNavigationItems(int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.menu.KMenu.setNavigationItems(int, int, int):void");
    }

    protected void addFillerItem(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.menu.KMenu.addFillerItem(int):void");
    }

    public boolean isPreviousPage(@Nullable ItemStack itemStack, int i) {
        int miqbarvnxaqmpisd;
        byte b;
        int i2 = 833303828 ^ (493346030 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2022065950) {
            int i3 = 625142744 ^ i2;
            if (itemStack == null) {
                miqbarvnxaqmpisd = miqbarvnxaqmpisd(i3, 1527177352);
            } else {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1385241053) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1483251136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1782320143 ^ i3)) {
                            int i4 = 1873845007 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1385241053 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1560758793 ^ i3)) {
                                break;
                            }
                        }
                    }
                    int i5 = 1400022459 ^ i3;
                    throw new IOException("double");
                }
                int i6 = 1726621408 ^ i3;
                if (getPrevPage(351679938) == null) {
                    miqbarvnxaqmpisd = 1038927464 ^ i6;
                } else {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1707093728) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1707093728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1907557879 ^ i6)) {
                                break;
                            }
                        }
                        int i7 = 2134073788 ^ i6;
                        throw new IOException("double");
                    }
                    int i8 = 868249711 ^ i6;
                    if (itemStack.isSimilar(getPrevPage(351679938).getItemStack(1475551979)) == (545753675 ^ i8)) {
                        miqbarvnxaqmpisd = miqbarvnxaqmpisd(i8, 237811207);
                    } else {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 71062105) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 71062105 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (397051288 ^ i8)) {
                                    break;
                                }
                            }
                            int i9 = 1894145844 ^ i8;
                            throw new RuntimeException("double");
                        }
                        i2 = 138488955 ^ i8;
                        b = (byte) (684107313 ^ i2);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1177891201) {
                            int miqbarvnxaqmpisd2 = miqbarvnxaqmpisd(i2, 1309565405);
                            try {
                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(miqbarvnxaqmpisd2) != 119891347) {
                                    throw null;
                                }
                                throw new IOException();
                            } catch (IOException e) {
                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                    case -384683607:
                                        miqbarvnxaqmpisd = miqbarvnxaqmpisd(miqbarvnxaqmpisd2, 1151478827);
                                        break;
                                    case 910573419:
                                        miqbarvnxaqmpisd = 524856819 ^ miqbarvnxaqmpisd2;
                                        break;
                                    default:
                                        throw new RuntimeException("Error in hash");
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(miqbarvnxaqmpisd) == -872197901) {
                                    int i10 = 1836222038 ^ miqbarvnxaqmpisd;
                                }
                            }
                        }
                    }
                }
            }
            b = (byte) (782974028 ^ miqbarvnxaqmpisd);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(miqbarvnxaqmpisd) == 1968824929) {
                int i11 = 978964484 ^ miqbarvnxaqmpisd;
                return b;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(miqbarvnxaqmpisd) == -384683607 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(miqbarvnxaqmpisd) == (2068167094 ^ miqbarvnxaqmpisd)) {
                    int i12 = 1791383219 ^ miqbarvnxaqmpisd;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(miqbarvnxaqmpisd) == -872197901 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(miqbarvnxaqmpisd) == (10650282 ^ miqbarvnxaqmpisd)) {
                        int i13 = 744277068 ^ miqbarvnxaqmpisd;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(miqbarvnxaqmpisd) == 1968824929 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(miqbarvnxaqmpisd) == (1260959715 ^ miqbarvnxaqmpisd)) {
                            int i14 = 2098469656 ^ miqbarvnxaqmpisd;
                            throw new IOException();
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2022065950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1278392756 ^ i2)) {
                int i15 = 1276671242 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1177891201 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (264196355 ^ i2)) {
                    break;
                }
            }
        }
        int i16 = 1875650027 ^ i2;
        throw new IOException("double");
    }

    public boolean isNextPage(@org.jetbrains.annotations.Nullable org.bukkit.inventory.ItemStack r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.menu.KMenu.isNextPage(org.bukkit.inventory.ItemStack, int):boolean");
    }

    @NotNull
    public Inventory getInventory() {
        int i = 1079248264 ^ (84358541 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -880314599) {
            int i2 = 766814323 ^ i;
            return this.inventory;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1507707776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (986906820 ^ i)) {
                int i3 = 271430775 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -880314599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1662818615 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1870776510 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public String getTitle(int i) {
        int i2 = 422054942 ^ (1407351966 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1219661007) {
            int i3 = 1526312052 ^ i2;
            return this.title;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1619005587 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (371000346 ^ i2)) {
                int i4 = 459930440 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1219661007 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (896940432 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1760790462 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getSize(int i) {
        int i2 = 1446214123 ^ (1158960199 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2015861331) {
            int i3 = 1919004051 ^ i2;
            return this.size;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2015861331 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1832602887 ^ i2)) {
                int i4 = 877006720 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -349505848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1526824032 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 766767359 ^ i2;
        throw new IOException();
    }

    @Generated
    public KItem getGoBack() {
        int i = 51552363 ^ (1655868763 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -333472080) {
            int i2 = 650259144 ^ i;
            return this.goBack;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -636565263 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1221671854 ^ i)) {
                int i3 = 2111949768 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -333472080 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1338114125 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1994597007 ^ i;
        throw new IOException();
    }

    @Generated
    public KItem getNextPage(int i) {
        int i2 = 421066188 ^ (1525677564 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -22628687) {
            int i3 = 163762965 ^ i2;
            return this.nextPage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -22628687 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1909389549 ^ i2)) {
                int i4 = 1835750933 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1330631143 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (195908781 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 931456546 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public KItem getPrevPage(int i) {
        int i2 = 1535254437 ^ (315184543 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1421564191) {
            int i3 = 1677951362 ^ i2;
            return this.prevPage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1421564191 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1043965046 ^ i2)) {
                int i4 = 469937501 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1957123342 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (791133578 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 74148547 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public KItem getClosePage(int i) {
        int i2 = 655093001 ^ (1845356273 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1230067471) {
            int i3 = 552588717 ^ i2;
            return this.closePage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1311767144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1948433762 ^ i2)) {
                int i4 = 287775389 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1230067471 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (382630349 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1185749718 ^ i2;
        throw new IOException();
    }

    @Generated
    public KItem getFillerItem() {
        int i = 195054953 ^ (1017666452 ^ 2082725606);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1499349210) {
            int i2 = 1311677594 ^ i;
            return this.fillerItem;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 673883144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (31931517 ^ i)) {
                int i3 = 605362497 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1499349210 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1229960183 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1432457529 ^ i;
        throw new RuntimeException();
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣶⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⠿⠟⠛⠻⣿⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣆⣀⣀⠀⣿⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠻⣿⣿⣿⠅⠛⠋⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[5] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢼⣿⣿⣿⣃⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[6] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣟⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[7] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣛⣛⣫⡄⠀⢸⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[8] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⡆⠸⣿⣿⣿⡷⠂⠨⣿⣿⣿⣿⣶⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣾⣿⣿⣿⣿⡇⢀⣿⡿⠋⠁⢀⡶⠪⣉⢸⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⡏⢸⣿⣷⣿⣿⣷⣦⡙⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣇⢸⣿⣿⣿⣿⣿⣷⣦⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[15] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[16] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[17] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣵⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        gibdoqemfg = ByteBuffer.wrap(tyldbygnlotyefj()).asCharBuffer().toString();
        OLqYQ9ODXt = (-790458870) ^ new Random(316413490183675046L).nextInt();
    }

    public static String jrwexwnbmw(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = gibdoqemfg.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] ensccrxwqmsjatd() {
        return new byte[]{0, 0, 0, 20, 0, 0, 0, 0};
    }

    private static byte[] gwfdoigffpeimno() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, 20};
    }

    private static byte[] sqasbmnuufiquqd() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 42};
    }

    private static byte[] pikfzhumxbprftd() {
        return new byte[]{0, 0, 0, 21, 0, 0, 0, 60};
    }

    private static byte[] fxgmatsirfzgroo() {
        return new byte[]{0, 0, 0, 20, 0, 0, 0, 81};
    }

    private static byte[] tyldbygnlotyefj() {
        return new byte[]{49, 125, 48, 87, 53, 70, 52, 93, 48, 86, 51, 81, 54, 65, 48, 93, 52, 95, 49, 93, 48, 24, 53, 96, 52, 70, 48, 84, 51, 70, 54, 24, 48, 100, 52, 81, 49, 84, 48, 83, 56, 126, 52, 85, 52, 71, 49, 94, 56, 95, 48, 85, 52, 64, 49, 88, 55, 87, 56, 94, 52, 26, 52, 119, 49, 94, 56, 84, 48, 88, 52, 81, 49, 67, 55, 21, 56, 121, 52, 64, 52, 84, 49, 90, 53, Byte.MAX_VALUE, 52, 81, 51, 66, 57, 91, 56, 82, 49, 85, 48, 71, 52, 80, 50, 87, 53, 95, 52, 30, 51, 115, 57, 93, 56, 24, 49, 118, 48, 82, 52, 90, 50, 83, 50, Byte.MAX_VALUE, 51, 82, 50, 68, 50, 88, 54, 84, 50, 80, 51, 71, 50, 91, 50, 94, 54, 93, 50, 31, 51, 112, 50, 94, 50, 94, 54, 64, 50, 84, 51, 30, 50, 98, 50, 80, 54, 84, 50, 84, 49, 122, 56, 83, 57, 66, 53, 89, 48, 86, 49, 85, 56, 70, 57, 93, 53, 95, 48, 95, 49, 26, 56, 124, 57, 81, 53, 72, 48, 69, 49, 25, 56, 98, 57, 85, 53, 87, 48, 84};
    }

    private static int miqbarvnxaqmpisd(int i, int i2) {
        return i2 ^ i;
    }
}
