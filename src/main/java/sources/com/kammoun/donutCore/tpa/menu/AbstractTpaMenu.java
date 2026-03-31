package com.kammoun.donutCore.tpa.menu;

import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.api.utils.menu.KMenu;
import com.kammoun.donutCore.tpa.TeleportPlugin;
import com.kammoun.donutCore.tpa.model.TpRequestMenuHolder;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public abstract class AbstractTpaMenu extends KMenu {
    protected final TeleportPlugin plugin;
    protected KItem cancelIcon;
    protected KItem locationIcon;
    protected KItem playerIcon;
    protected KItem confirmIcon;
    protected KItem flyIcon;
    private static int FWkvHGDjDu = 0;

    private transient int f1252h3KDdRon3 = 1337059741;
    private static String knvcdnpzsf;
    private static String[] nothing_to_see_here = new String[15];

    public AbstractTpaMenu(TeleportPlugin teleportPlugin, String str, int i) {
        super(teleportPlugin.getApi(2142241109), str, 1546437752);
        int i2 = 479011738 ^ (864305681 ^ 313316202);
        int parseInt = 344566822 ^ (98599965 ^ Integer.parseInt("751606490"));
        this.f1252h3KDdRon3 = 1337059741 ^ FWkvHGDjDu;
        int gqeuizguomptvnxl = 2011029266 ^ gqeuizguomptvnxl(parseInt, 2009349048);
        this.plugin = teleportPlugin;
        loadIcons(1532356115);
        int i3 = 2072216280 ^ (703099594 ^ gqeuizguomptvnxl);
    }

    private void loadIcons(int i) {
        int i2 = 166224625 ^ (1980706856 ^ 87147428);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -692810773) {
            int i3 = 1523545661 ^ i2;
            this.cancelIcon = KItem.fromConfig(this.config.getConfigurationSection(tomrpncfmb(iwqfvxxvoknfzlo(), i3)), 2126963651);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 13580801) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 13580801 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (849437277 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1455417900 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 1430526656 ^ i3;
            this.locationIcon = KItem.fromConfig(this.config.getConfigurationSection(tomrpncfmb(zcnrmnhbmtkvqne(), i2)), 2126963651);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1427117053) {
                i2 = 1229734311 ^ i2;
                this.playerIcon = KItem.fromConfig(this.config.getConfigurationSection(tomrpncfmb(dzapparphytdlxt(), i2)), 2126963651);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -527572679) {
                    int i5 = 434004246 ^ i2;
                    this.confirmIcon = KItem.fromConfig(this.config.getConfigurationSection(tomrpncfmb(mbjlzhxwwgtoqpl(), i5)), 2126963651);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 780069257) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 780069257 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1746739056 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 1830399419 ^ i5;
                        throw new RuntimeException("double");
                    }
                    int i7 = 482689211 ^ i5;
                    this.flyIcon = KItem.fromConfig(this.config.getConfigurationSection(tomrpncfmb(rfxtgswxhvsjexj(), i7)), 2126963651);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -933958575) {
                        int i8 = 555486479 ^ i7;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -933958575 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (31399255 ^ i7)) {
                            break;
                        }
                    }
                    int i9 = 1729193084 ^ i7;
                    throw new RuntimeException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1427117053 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1543923438 ^ i2)) {
                int i10 = 459787252 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -527572679 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1898518907 ^ i2)) {
                    int i11 = 292462590 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -692810773 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (618238678 ^ i2)) {
                        int i12 = 834401573 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1061911512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (313673406 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i13 = 2075299910 ^ i2;
        throw new IOException();
    }

    @Override
    protected void setMenuItems(java.lang.String[] r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.menu.AbstractTpaMenu.setMenuItems(java.lang.String[], int):void");
    }

    @Override
    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.menu.AbstractTpaMenu.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    protected abstract void onConfirmClick(InventoryClickEvent inventoryClickEvent, TpRequestMenuHolder tpRequestMenuHolder, Player player, int i);

    public void openMenu(Player player, Player player2, int i) {
        String str;
        int i2;
        int i3;
        int i4 = 1573481421 ^ (177652304 ^ 87147428);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1821158966) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1821158966 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (306047280 ^ i4)) {
                    break;
                }
            }
            int i5 = 80262322 ^ i4;
            throw new RuntimeException("double");
        }
        int i6 = 237545754 ^ i4;
        String worldNickname = this.plugin.getTeleportConfig(419749180).getWorldNickname(player2.getWorld().getName(), 896307484);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -499771110) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -499771110 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (749236010 ^ i6)) {
                    int i7 = 1431516918 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 399838113 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (559515033 ^ i6)) {
                        int i8 = 1804793339 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1129742217 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1100011083 ^ i6)) {
                            break;
                        }
                    }
                }
            }
            int i9 = 1418248443 ^ i6;
            throw new IllegalAccessException();
        }
        int i10 = 571172786 ^ i6;
        if (player2.isFlying() == (2119017617 ^ i10)) {
            int i11 = 41505039 ^ i10;
            str = tomrpncfmb(ctduqaxfesohtls(), i11);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != -509104909) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -509104909 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (996445656 ^ i11)) {
                        break;
                    }
                }
                int i12 = 220210843 ^ i11;
                throw new RuntimeException("double");
            }
            i2 = 41634813 ^ i11;
        } else {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != -227728245) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1590783928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (986466717 ^ i10)) {
                        int i13 = 505520837 ^ i10;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -227728245 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1906760545 ^ i10)) {
                            break;
                        }
                    }
                }
                int i14 = 1428413037 ^ i10;
                throw new IOException("double");
            }
            int i15 = 1628559014 ^ i10;
            str = tomrpncfmb(lrbkmewbtquorkr(), i15);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != -85749320) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -85749320 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (1647258710 ^ i15)) {
                        break;
                    }
                }
                int i16 = 630380337 ^ i15;
                throw new IllegalAccessException("double");
            }
            int gqeuizguomptvnxl = gqeuizguomptvnxl(i15, 344350656);
            try {
                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(gqeuizguomptvnxl) == 116830932) {
                    throw new RuntimeException();
                }
                throw null;
            } catch (RuntimeException e) {
                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                    case 1129742217:
                        i3 = gqeuizguomptvnxl(gqeuizguomptvnxl, 616098997);
                        break;
                    case 1590783928:
                        i3 = 117968563 ^ gqeuizguomptvnxl;
                        break;
                    default:
                        throw new IOException("Error in hash");
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1720785440) {
                    i2 = 1922932007 ^ i3;
                } else {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1720785440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (872062196 ^ i3)) {
                            int i17 = 1565785828 ^ i3;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }
        }
        String str2 = str;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -226626789) {
            i2 = 2093829477 ^ i2;
            TpRequestMenuHolder tpRequestMenuHolder = new TpRequestMenuHolder(player, player2, this, 539672634);
            String[] strArr = new String[(byte) (42136320 ^ i2)];
            strArr[(byte) (42136326 ^ i2)] = tomrpncfmb(xrxclbraowayzvl(), i2);
            byte b = (byte) (42136327 ^ i2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 337090608) {
                int i18 = 311915783 ^ i2;
                strArr[b] = player2.getName();
                strArr[(byte) (269846019 ^ i18)] = tomrpncfmb(ihzixlzmopbqcmk(), i18);
                strArr[(byte) (269846018 ^ i18)] = worldNickname;
                strArr[(byte) (269846021 ^ i18)] = tomrpncfmb(mbacknyatqefmfw(), i18);
                strArr[(byte) (269846020 ^ i18)] = str2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == -2136199160) {
                    int i19 = 1498655229 ^ i18;
                    loadInventory(tpRequestMenuHolder, strArr, 408434007);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == 1244757986) {
                        int i20 = 1539519357 ^ i19;
                        player.openInventory(this.inventory);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == -1809259512) {
                            int i21 = 813678069 ^ i20;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == -1809259512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == (1528068122 ^ i20)) {
                                int i22 = 202220959 ^ i20;
                                throw new RuntimeException("double");
                            }
                        }
                    } else {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == 1244757986 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (882764755 ^ i19)) {
                                int i23 = 559849452 ^ i19;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                } else {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == -2136199160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (146157074 ^ i18)) {
                            int i24 = 1104684884 ^ i18;
                            throw new RuntimeException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -226626789 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1614767720 ^ i2)) {
                int i25 = 719760520 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 337090608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1330654255 ^ i2)) {
                    int i26 = 2082616440 ^ i2;
                    throw new IllegalAccessException("double");
                }
            }
        }
    }

    @Generated
    public TeleportPlugin getPlugin() {
        int i = 1559197501 ^ (2016938275 ^ 87147428);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 255192529) {
            int i2 = 198344368 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 255192529 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (703295019 ^ i)) {
                int i3 = 876600941 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1369839697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1964364477 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1755658981 ^ i;
        throw new IOException();
    }

    @Generated
    public KItem getCancelIcon() {
        int i = 1776077822 ^ (1544114242 ^ 87147428);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2027765567) {
            int i2 = 1970843697 ^ i;
            return this.cancelIcon;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 753353034 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2132902636 ^ i)) {
                int i3 = 607195743 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2027765567 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (665353570 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 874795999 ^ i;
        throw new IOException();
    }

    @Generated
    public KItem getLocationIcon() {
        int i = 1956547272 ^ (273800390 ^ 87147428);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 267693395) {
            int i2 = 1537033568 ^ i;
            return this.locationIcon;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 267693395 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (338227076 ^ i)) {
                int i3 = 757094071 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -752974255 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1951839926 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1218176461 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public KItem getPlayerIcon() {
        int i = 1433320117 ^ (1306627307 ^ 87147428);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -302534704) {
            int i2 = 356755089 ^ i;
            return this.playerIcon;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1206557528 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1813081739 ^ i)) {
                int i3 = 772898258 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -302534704 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1248614423 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 515899629 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public KItem getConfirmIcon() {
        int i = 1100156569 ^ (199734797 ^ 87147428);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2049694082) {
            int i2 = 1399755295 ^ i;
            return this.confirmIcon;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -513848968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1258162114 ^ i)) {
                int i3 = 1474358563 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2049694082 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (638089444 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1024111846 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public KItem getFlyIcon() {
        int i = 666585864 ^ (798244311 ^ 87147428);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1760930776) {
            int i2 = 1986795021 ^ i;
            return this.flyIcon;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1760930776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1931426648 ^ i)) {
                int i3 = 1596914062 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -610985037 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1036557928 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1277184028 ^ i;
        throw new RuntimeException();
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
        knvcdnpzsf = ByteBuffer.wrap(kzueeelylibnmpa()).asCharBuffer().toString();
        FWkvHGDjDu = (-1816793626) ^ new Random(7365183458499366311L).nextInt();
    }

    public static String tomrpncfmb(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = knvcdnpzsf.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] rfxtgswxhvsjexj() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, 0};
    }

    private static byte[] dzapparphytdlxt() {
        return new byte[]{0, 0, 0, 17, 0, 0, 0, 14};
    }

    private static byte[] iwqfvxxvoknfzlo() {
        return new byte[]{0, 0, 0, 17, 0, 0, 0, 31};
    }

    private static byte[] zcnrmnhbmtkvqne() {
        return new byte[]{0, 0, 0, 19, 0, 0, 0, 48};
    }

    private static byte[] mbjlzhxwwgtoqpl() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 67};
    }

    private static byte[] lrbkmewbtquorkr() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 85};
    }

    private static byte[] xrxclbraowayzvl() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 90};
    }

    private static byte[] ihzixlzmopbqcmk() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 98};
    }

    private static byte[] mbacknyatqefmfw() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, 105};
    }

    private static byte[] ctduqaxfesohtls() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 116};
    }

    private static byte[] kzueeelylibnmpa() {
        return new byte[]{57, 92, 54, 90, 57, 88, 48, 94, 50, 74, 53, 24, 57, 95, 55, 92, 48, 75, 57, 24, 54, 80, 57, 84, 48, 95, 50, 87, 49, 89, 48, 84, 55, 86, 53, 92, 51, 74, 49, 30, 48, 71, 55, 85, 53, 83, 51, 64, 49, 85, 48, 69, 55, 20, 53, 91, 51, 90, 49, 95, 48, 89, 53, 90, 56, 86, 54, 87, 53, 95, 50, 70, 51, 22, 53, 85, 56, 84, 49, 92, 53, 80, 56, 80, 54, 84, 53, 28, 50, 92, 51, 91, 53, 89, 56, 91, 49, 80, 54, 90, 48, 86, 52, 94, 49, 69, 49, 23, 54, 85, 48, 86, 52, 83, 49, 87, 49, 77, 54, 80, 48, 86, 52, 94, 49, 27, 49, 80, 54, 90, 48, 86, 52, 94, 54, 90, 52, 80, 55, 86, 53, 88, 57, 69, 51, 26, 51, 84, 57, 90, 54, 87, 54, 85, 52, 90, 55, 75, 53, 91, 57, 27, 51, 93, 51, 84, 57, 90, 54, 87, 53, -107, 54, 80, 53, 107, 50, 81, 55, 70, 52, 23, 49, 67, 54, 95, 50, 87, 52, 75, 49, 86, 54, 65, 50, 19, 50, 19, 57, 79, 52, 89, 48, 67, 55, 94, 54, 93, 56, 17, 50, 19, 57, 81, 52, 69, 48, 110, 55, 84, 54, 85, 56, 77, 54, 89, 49, 89, 50, 81, 57, 29, 50, -105, 56, 80, 56, 122, 53, 90};
    }

    private static int gqeuizguomptvnxl(int i, int i2) {
        return i ^ i2;
    }
}
