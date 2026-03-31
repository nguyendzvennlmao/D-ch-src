package com.kammoun.donutCore.team.gui;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.api.skin.PlayerHeadUtil;
import com.kammoun.donutCore.api.skin.SkinCacheAPI;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.api.utils.menu.KMenu;
import com.kammoun.donutCore.team.models.Enums.TeamSort;
import com.kammoun.donutCore.team.models.Team;
import com.kammoun.donutCore.team.models.TeamMember;
import com.kammoun.donutCore.team.models.TeamMenuHolder;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class TeamMainMenu extends KMenu implements Listener {
    private KItem searchIcon;
    private KItem teamHomeIcon;
    private KItem pvpOnIcon;
    private KItem pvpOffIcon;
    private KItem sortIcon;
    private KItem teamIcon;
    private KItem invite;
    private final List<Integer> teammateSlots;
    private final TeamPermission teamPermission;
    private static int g4qKnWreQ7 = 0;
    private transient int fmhbg9Lffi = 1295606388;
    private static String[] nothing_to_see_here = new String[19];

    public TeamMainMenu(org.bukkit.plugin.java.JavaPlugin r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.TeamMainMenu.<init>(org.bukkit.plugin.java.JavaPlugin, int):void");
    }

    private void loadIcons(int i) {
        int i2 = 792654847 ^ (344078576 ^ 1105227616);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -756735109) {
            i2 = 1738139618 ^ i2;
            this.searchIcon = KItem.fromConfig(this.config.getConfigurationSection(xmxyjnhdrf(dutxbgggiufudex(), tajonllsyrukpwt(), i2)), 2126963651);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -299230104) {
                int i3 = 5689914 ^ i2;
                this.teamHomeIcon = KItem.fromConfig(this.config.getConfigurationSection(xmxyjnhdrf(cogvsvnsbtbvjwc(), tajonllsyrukpwt(), i3)), 2126963651);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -325284424) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -325284424 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (123729748 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 356910020 ^ i3;
                    throw new IllegalAccessException("double");
                }
                int i5 = 402784682 ^ i3;
                this.pvpOnIcon = KItem.fromConfig(this.config.getConfigurationSection(xmxyjnhdrf(ljqeyfypafiutyz(), tajonllsyrukpwt(), i5)), 2126963651);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 747405544) {
                    int i6 = 407721639 ^ i5;
                    this.pvpOffIcon = KItem.fromConfig(this.config.getConfigurationSection(xmxyjnhdrf(yrkyxbknocixsdh(), tajonllsyrukpwt(), i6)), 2126963651);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -286902832) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -286902832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1227037320 ^ i6)) {
                                break;
                            }
                        }
                        int i7 = 1486484599 ^ i6;
                        throw new IOException("double");
                    }
                    i5 = 1856859780 ^ i6;
                    this.sortIcon = KItem.fromConfig(this.config.getConfigurationSection(xmxyjnhdrf(nsnoxzmvbrywssz(), tajonllsyrukpwt(), i5)), 2126963651);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1685241357) {
                        int i8 = 1529487920 ^ i5;
                        this.teamIcon = KItem.fromConfig(this.config.getConfigurationSection(xmxyjnhdrf(kpotoyujvblbuql(), tajonllsyrukpwt(), i8)), 2126963651);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1121734769) {
                            i8 = 776169565 ^ i8;
                            this.invite = KItem.fromConfig(this.config.getConfigurationSection(xmxyjnhdrf(fkyennxaokwipmz(), tajonllsyrukpwt(), i8)), 2126963651);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 818352792) {
                                int i9 = 1073308267 ^ i8;
                                return;
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 818352792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1118340690 ^ i8)) {
                                int i10 = 1735910462 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -821296703 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (510518079 ^ i8)) {
                                    int i11 = 121281905 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1121734769 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (870124969 ^ i8)) {
                                        break;
                                    }
                                }
                            }
                        }
                        int i12 = 1070370724 ^ i8;
                        throw new RuntimeException("double");
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 747405544 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (652679140 ^ i5)) {
                        int i13 = 330541844 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1685241357 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (235611887 ^ i5)) {
                            break;
                        }
                    }
                }
                int i14 = 55224694 ^ i5;
                throw new RuntimeException();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -756735109 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (691657220 ^ i2)) {
                int i15 = 1170694760 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -299230104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (153505090 ^ i2)) {
                    break;
                }
            }
        }
        int i16 = 777539927 ^ i2;
        throw new RuntimeException("double");
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent inventoryClickEvent) {
        int i = 1598852377 ^ (1121572367 ^ 1105227616);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -475421774) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -475421774 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1300979618 ^ i)) {
                    break;
                }
            }
            int i2 = 769668015 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 1639150249 ^ i;
        if ((inventoryClickEvent.getInventory().getHolder() instanceof TeamMenuHolder) == (1036404447 ^ i3)) {
            int i4 = 1725330500 ^ i3;
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -298699015) {
            i3 = 1713712669 ^ i3;
            handleClick(inventoryClickEvent, 743228312);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -551860718) {
                int i5 = 15948377 ^ i3;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -551860718 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1642974915 ^ i3)) {
                int i6 = 1298940865 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -298699015 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1811861068 ^ i3)) {
                    break;
                }
            }
        }
        int i7 = 170850796 ^ i3;
        throw new IOException();
    }

    @Override
    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.TeamMainMenu.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    @Override
    protected void setMenuItems(String[] strArr, int i) {
        int i2 = 1521233670 ^ (480031056 ^ 1105227616);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1049070000) {
            int i3 = 1108124879 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1049070000 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (934185378 ^ i2)) {
                int i4 = 1643391975 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 786608074 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2106067822 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1712824267 ^ i2;
        throw new IOException();
    }

    public void openInventory(Player player, int i, Team team, int i2) {
        int i3 = 1850554100 ^ (1153874302 ^ 1105227616);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1532954451) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -5170509 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (380102857 ^ i3)) {
                    int i4 = 697468598 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1532954451 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1299002662 ^ i3)) {
                        break;
                    }
                }
            }
            int i5 = 1229418988 ^ i3;
            throw new RuntimeException();
        }
        int i6 = 2054879910 ^ i3;
        openInventory(player, i, team, TeamSort.JOIN_DATE, 248192086);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2004299168) {
            int i7 = 1860647194 ^ i6;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2004299168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (299532242 ^ i6)) {
                break;
            }
        }
        int i8 = 960801958 ^ i6;
        throw new RuntimeException("double");
    }

    public void openInventory(org.bukkit.entity.Player r7, int r8, com.kammoun.donutCore.team.models.Team r9, com.kammoun.donutCore.team.models.Enums.TeamSort r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.TeamMainMenu.openInventory(org.bukkit.entity.Player, int, com.kammoun.donutCore.team.models.Team, com.kammoun.donutCore.team.models.Enums.TeamSort, int):void");
    }

    private void loadTeammateHeadsAsync(Player player, List list, int i) {
        int i2 = 1968289066 ^ (377166924 ^ 1105227616);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 374747185) {
            int i3 = 1066842290 ^ i2;
            if (SkinCacheAPI.isInitialized(1157693229) == (492601012 ^ i3)) {
                ruqqkyjmgqkdbtnz(i3, 979205719);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -354159200) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -354159200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (664749306 ^ i3)) {
                        int i4 = 746775994 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1575485689 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2060342003 ^ i3)) {
                            int i5 = 987418114 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1409820918 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1074254370 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
                int i6 = 998406656 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 859643691 ^ i3;
            if (list.isEmpty() == (778133919 ^ i2)) {
                i2 = ruqqkyjmgqkdbtnz(i2, 117659970);
                ArrayList arrayList = new ArrayList();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1259456233) {
                    int i7 = 581677898 ^ i2;
                    Iterator it = list.iterator();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 1582062776) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1582062776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1840175042 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 1788733548 ^ i7;
                        throw new IOException("double");
                    }
                    int i9 = 987448037;
                    while (true) {
                        i2 = i9 ^ i7;
                        if (it.hasNext() == (823314802 ^ i2)) {
                            int ruqqkyjmgqkdbtnz = ruqqkyjmgqkdbtnz(i2, 2136920116);
                            CompletableFuture<Void> allOf = CompletableFuture.allOf((CompletableFuture[]) arrayList.toArray(new CompletableFuture[(byte) (1313610054 ^ ruqqkyjmgqkdbtnz)]));
                            Runnable runnable = () -> {
                                int i10;
                                int i11 = 1416418200 ^ (2008412966 ^ 1105227616);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 298483443) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 298483443 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (775382350 ^ i11)) {
                                            break;
                                        }
                                    }
                                    int i12 = 357316549 ^ i11;
                                    throw new IllegalAccessException("double");
                                }
                                int i13 = 1549157196 ^ i11;
                                ArrayList arrayList2 = new ArrayList();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -210213743) {
                                    int i14 = 129064392 ^ i13;
                                    Iterator it2 = arrayList.iterator();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -822965551) {
                                        int i15 = 1887519987;
                                        while (true) {
                                            i13 = i15 ^ i14;
                                            if (it2.hasNext() == (1230968233 ^ i13)) {
                                                int ruqqkyjmgqkdbtnz2 = ruqqkyjmgqkdbtnz(i13, 1043244134);
                                                SchedulerUtil.run(() -> {
                                                    int i16;
                                                    int i17;
                                                    int i18 = 1592691520 ^ (1933768700 ^ 1105227616);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) != 1650499299) {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 1650499299 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (1839829709 ^ i18)) {
                                                                break;
                                                            }
                                                        }
                                                        int i19 = 418301970 ^ i18;
                                                        throw new IllegalAccessException("double");
                                                    }
                                                    int i20 = 783710327 ^ i18;
                                                    if (player.getOpenInventory().getTopInventory().equals(this.inventory) == (1123707819 ^ i20)) {
                                                        ruqqkyjmgqkdbtnz(i20, 888685075);
                                                        return;
                                                    }
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) != 399727962) {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == 399727962 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == (539070651 ^ i20)) {
                                                                break;
                                                            }
                                                        }
                                                        int i21 = 2028866462 ^ i20;
                                                        throw new IOException("double");
                                                    }
                                                    int i22 = 590967240 ^ i20;
                                                    int i23 = (byte) (1640176227 ^ i22);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == 236507931) {
                                                        i22 = 706132678 ^ i22;
                                                        while (true) {
                                                            if (i23 >= arrayList2.size()) {
                                                                i16 = 1438632699 ^ i22;
                                                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == 1588397354) {
                                                                i22 = 1700680063 ^ i22;
                                                                if (i23 >= this.teammateSlots.size()) {
                                                                    i16 = 820091780 ^ i22;
                                                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == 1952419537) {
                                                                    i17 = 482215009 ^ i22;
                                                                    this.inventory.setItem(this.teammateSlots.get(i23).intValue(), (ItemStack) arrayList2.get(i23));
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1850757671) {
                                                                        i17 = 460251493 ^ i17;
                                                                        i23 += 693834975 ^ i17;
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == 1255712497) {
                                                                            int i24 = 1332187025 ^ i17;
                                                                            try {
                                                                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i24) == 102042325) {
                                                                                    throw new IllegalAccessException();
                                                                                }
                                                                                throw null;
                                                                            } catch (IllegalAccessException e) {
                                                                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                                                    case 837081723:
                                                                                        i22 = ruqqkyjmgqkdbtnz(i24, 1121594873);
                                                                                        break;
                                                                                    case 1089987064:
                                                                                        i22 = 754469513 ^ i24;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IOException("Error in hash");
                                                                                }
                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) != 657831345) {
                                                                                    while (true) {
                                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == 657831345 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == (950976461 ^ i22)) {
                                                                                            int i25 = 166691844 ^ i22;
                                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == 1952419537 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == (809900103 ^ i22)) {
                                                                                                int i26 = 775007668 ^ i22;
                                                                                                throw new RuntimeException("double");
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                while (true) {
                                                                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i22)) {
                                                                                        case 125773542:
                                                                                            i22 = 1865618963 ^ i22;
                                                                                            break;
                                                                                        case 197180904:
                                                                                        case 510447229:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                while (true) {
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == 1588397354 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == (55810532 ^ i22)) {
                                                                        int i27 = 181027615 ^ i22;
                                                                        throw new IOException("double");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == 1255712497 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (970890733 ^ i17)) {
                                                                int i28 = 1941416140 ^ i17;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1850757671 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (519890815 ^ i17)) {
                                                                    int i29 = 1906868960 ^ i17;
                                                                    throw new IllegalAccessException("double");
                                                                }
                                                            }
                                                        }
                                                    }
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == 1089987064 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == (334841974 ^ i22)) {
                                                            int i30 = 1656194024 ^ i22;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == 236507931 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == (971935456 ^ i22)) {
                                                                int i31 = 1193804551 ^ i22;
                                                                throw new IOException("double");
                                                            }
                                                        }
                                                    }
                                                }, 1403588420);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ruqqkyjmgqkdbtnz2) == -1148350853) {
                                                    int i16 = 1748664605 ^ ruqqkyjmgqkdbtnz2;
                                                    return;
                                                }
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ruqqkyjmgqkdbtnz2) == -1148350853 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ruqqkyjmgqkdbtnz2) == (1030060504 ^ ruqqkyjmgqkdbtnz2)) {
                                                        int i17 = 411420566 ^ ruqqkyjmgqkdbtnz2;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1257811274) {
                                                i13 = 678855397 ^ i13;
                                                CompletableFuture completableFuture = (CompletableFuture) it2.next();
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 156023395) {
                                                    int i18 = 646202498 ^ i13;
                                                    ItemStack itemStack = (ItemStack) completableFuture.join();
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 1030659698) {
                                                        i14 = 1687934137 ^ i18;
                                                        if (itemStack == null) {
                                                            i10 = 1086093618 ^ i14;
                                                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 430980025) {
                                                            i14 = 1965643588 ^ i14;
                                                            arrayList2.add(itemStack);
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1325760102) {
                                                                i10 = 898969206 ^ i14;
                                                            }
                                                        }
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 475263531) {
                                                            int i19 = 361120408 ^ i10;
                                                            try {
                                                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i19) == 79152096) {
                                                                    throw new RuntimeException();
                                                                }
                                                                throw null;
                                                            } catch (RuntimeException e) {
                                                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                                    case -1335761173:
                                                                        i14 = ruqqkyjmgqkdbtnz(i19, 2105253514);
                                                                        break;
                                                                    case 229615658:
                                                                        i14 = 1254250322 ^ i19;
                                                                        break;
                                                                    default:
                                                                        throw new RuntimeException("Error in hash");
                                                                }
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 1539117752) {
                                                                    i15 = 1109964798;
                                                                } else {
                                                                    while (true) {
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 1539117752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1940963389 ^ i14)) {
                                                                            int i20 = 1415812594 ^ i14;
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1325760102 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1598132462 ^ i14)) {
                                                                                int i21 = 240335792 ^ i14;
                                                                                throw new IOException("double");
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            while (true) {
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 475263531 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1200521486 ^ i10)) {
                                                                    int i22 = 1051245041 ^ i10;
                                                                    throw new RuntimeException("double");
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 1030659698 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (437086708 ^ i18)) {
                                                                int i23 = 1364447321 ^ i18;
                                                                throw new IllegalAccessException("double");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -822965551 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1203506193 ^ i14)) {
                                            int i24 = 1747239856 ^ i14;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 430980025 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (62661107 ^ i14)) {
                                                int i25 = 1282819722 ^ i14;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -94796144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1020762677 ^ i14)) {
                                                    int i26 = 1031536807 ^ i14;
                                                    throw new RuntimeException("double");
                                                }
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1257811274 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (655158197 ^ i13)) {
                                        int i27 = 548767459 ^ i13;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -210213743 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1097004386 ^ i13)) {
                                            int i28 = 355893250 ^ i13;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 156023395 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (84006305 ^ i13)) {
                                                int i29 = 910966961 ^ i13;
                                                throw new RuntimeException();
                                            }
                                        }
                                    }
                                }
                            };
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ruqqkyjmgqkdbtnz) == 1918945842) {
                                int i10 = 1669742442 ^ ruqqkyjmgqkdbtnz;
                                allOf.thenRun(runnable);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1850814817) {
                                    int i11 = 2025118925 ^ i10;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1850814817 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1052087290 ^ i10)) {
                                        int i12 = 1127731479 ^ i10;
                                        throw new IOException("double");
                                    }
                                }
                            } else {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ruqqkyjmgqkdbtnz) == 1918945842 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ruqqkyjmgqkdbtnz) == (2115820529 ^ ruqqkyjmgqkdbtnz)) {
                                        int i13 = 944183380 ^ ruqqkyjmgqkdbtnz;
                                        throw new IOException("double");
                                    }
                                }
                            }
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2003416175) {
                            i7 = 1098875533 ^ i2;
                            TeamMember teamMember = (TeamMember) it.next();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -2090180613) {
                                i2 = 651225189 ^ i7;
                                arrayList.add(buildTeammateHeadAsync(teamMember, 1242242743));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1242751790) {
                                    int i14 = 959506596 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 2087344627) {
                                        int ruqqkyjmgqkdbtnz2 = ruqqkyjmgqkdbtnz(i14, 726837251);
                                        try {
                                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(ruqqkyjmgqkdbtnz2) == 91327641) {
                                                throw new IOException();
                                            }
                                            throw null;
                                        } catch (IOException e) {
                                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                case 654252522:
                                                    i7 = 438408315 ^ ruqqkyjmgqkdbtnz2;
                                                    break;
                                                case 1575485689:
                                                    i7 = 1967355737 ^ ruqqkyjmgqkdbtnz2;
                                                    break;
                                                default:
                                                    throw new IOException("Error in hash");
                                            }
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -135022030) {
                                                i9 = 1877786164;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 2087344627 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1960299721 ^ i14)) {
                                                int i15 = 14721185 ^ i14;
                                                throw new IllegalAccessException("double");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -2090180613 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (977984492 ^ i7)) {
                            int i16 = 1742389514 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -135022030 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1658878320 ^ i7)) {
                                int i17 = 938183950 ^ i7;
                                throw new IOException("double");
                            }
                        }
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1930104057) {
                int i18 = 157311356 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1259456233 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1642754861 ^ i2)) {
                int i19 = 1300101593 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 940050201 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (358338798 ^ i2)) {
                    int i20 = 327629914 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1930104057 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (737804803 ^ i2)) {
                        int i21 = 714152871 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1242751790 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (667250993 ^ i2)) {
                            int i22 = 2120865318 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 374747185 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1773046537 ^ i2)) {
                                int i23 = 797297163 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2003416175 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1883535994 ^ i2)) {
                                    int i24 = 76788625 ^ i2;
                                    throw new IOException();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private CompletableFuture buildTeammateHeadAsync(TeamMember teamMember, int i) {
        int i2 = 1736273905 ^ (198647839 ^ 1105227616);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1783694449) {
            int i3 = 912783408 ^ i2;
            CompletableFuture createHeadAsync = PlayerHeadUtil.createHeadAsync(teamMember.getMemberID(629337533), 2141002607);
            Function function = itemStack -> {
                String xmxyjnhdrf;
                int i4 = 1526138993 ^ (415281999 ^ 215551252);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 2004201810) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2004201810 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1546391444 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 1215082867 ^ i4;
                    throw new IOException("double");
                }
                int i6 = 1094015742 ^ i4;
                OfflinePlayer offlinePlayer = teamMember.getOfflinePlayer(1528252123);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2128570016) {
                    int i7 = 835764074 ^ i6;
                    SkullMeta itemMeta = itemStack.getItemMeta();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -262496783) {
                        i7 = 1952959093 ^ i7;
                        if (itemMeta != null) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1399115354) {
                                i6 = 1435267080 ^ i7;
                                itemMeta.setOwningPlayer(offlinePlayer);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -16298472) {
                                    i7 = 2063035793 ^ i6;
                                    if (offlinePlayer.isOnline() != (1696040018 ^ i7)) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 683418259) {
                                            i7 = 1515487532 ^ i7;
                                            xmxyjnhdrf = xmxyjnhdrf(ectqwmaxjvxdjtg(), tajonllsyrukpwt(), i7);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -99079183) {
                                                int ruqqkyjmgqkdbtnz = ruqqkyjmgqkdbtnz(i7, 1485738372);
                                                try {
                                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(ruqqkyjmgqkdbtnz) != 152975209) {
                                                        throw null;
                                                    }
                                                    throw new IllegalAccessException();
                                                } catch (IllegalAccessException e) {
                                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                        case 553967848:
                                                            i7 = 156792244 ^ ruqqkyjmgqkdbtnz;
                                                            break;
                                                        case 1047308243:
                                                            i7 = 1790278995 ^ ruqqkyjmgqkdbtnz;
                                                            break;
                                                        default:
                                                            throw new RuntimeException("Error in hash");
                                                    }
                                                }
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -99079183 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (215710505 ^ i7)) {
                                                    int i8 = 698981866 ^ i7;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -20992184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1415443482 ^ i7)) {
                                                        int i9 = 85069720 ^ i7;
                                                        throw new IOException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i7)) {
                                            case 64877897:
                                                i7 = 1818189802 ^ i7;
                                                break;
                                            case 707372469:
                                            case 833435278:
                                                break;
                                        }
                                    }
                                    xmxyjnhdrf = xmxyjnhdrf(olyjqkgujwjfqmp(), tajonllsyrukpwt(), i7);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1246158272) {
                                        i7 = 1779404112 ^ i7;
                                        String str = xmxyjnhdrf;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 440055619) {
                                            i7 = 198678508 ^ i7;
                                            itemMeta.setDisplayName(ChatFormater.color(str + " &#00f986" + offlinePlayer.getName()));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1149634595) {
                                                int i10 = 1159330272 ^ i7;
                                                itemMeta.setLore(List.of(ChatFormater.color(xmxyjnhdrf(pnixlkizalynwlp(), tajonllsyrukpwt(), i10))));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1816774433) {
                                                    i10 = 1416507867 ^ i10;
                                                    itemStack.setItemMeta(itemMeta);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -818394629) {
                                                        int i11 = 1714486486 ^ i10;
                                                    }
                                                }
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -818394629 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1349115118 ^ i10)) {
                                                        int i12 = 635400834 ^ i10;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1816774433 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (591987029 ^ i10)) {
                                                            int i13 = 1432464287 ^ i10;
                                                            throw new IllegalAccessException("double");
                                                        }
                                                    }
                                                }
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1149634595 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (354381231 ^ i7)) {
                                                    int i14 = 1054094843 ^ i7;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1808223560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1794043601 ^ i7)) {
                                                        int i15 = 1829855593 ^ i7;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1399115354 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (712081526 ^ i7)) {
                                    int i16 = 1341076975 ^ i7;
                                    throw new IllegalAccessException("double");
                                }
                            }
                        } else {
                            int i17 = 1438346274 ^ i7;
                        }
                        return itemStack;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 440055619 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (610380871 ^ i7)) {
                            int i18 = 689362072 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -262496783 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1286746704 ^ i7)) {
                                int i19 = 425633770 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 683418259 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (2040612782 ^ i7)) {
                                    int i20 = 1198930974 ^ i7;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1246158272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1872760864 ^ i7)) {
                                        int i21 = 1968203037 ^ i7;
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -16298472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (189211042 ^ i6)) {
                        int i22 = 786424250 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2128570016 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (10357626 ^ i6)) {
                            break;
                        }
                    }
                }
                int i23 = 354430938 ^ i6;
                throw new IllegalAccessException("double");
            };
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -647051792) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -647051792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1217116730 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1777792730 ^ i3;
                throw new IllegalAccessException("double");
            }
            i2 = 838639292 ^ i3;
            CompletableFuture thenApply = createHeadAsync.thenApply(function);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1451896849) {
                int i5 = 2085805353 ^ i2;
                return thenApply;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1451896849 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1517845177 ^ i2)) {
                int i6 = 1056724541 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1783694449 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1429285894 ^ i2)) {
                    int i7 = 1183699158 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1273177766 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2069268457 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 644774968 ^ i2;
        throw new IOException();
    }

    private org.bukkit.inventory.ItemStack getTeammateIconPlaceholder(com.kammoun.donutCore.team.models.TeamMember r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.TeamMainMenu.getTeammateIconPlaceholder(com.kammoun.donutCore.team.models.TeamMember, int):org.bukkit.inventory.ItemStack");
    }

    private org.bukkit.inventory.ItemStack getSortedIcon(com.kammoun.donutCore.team.models.Enums.TeamSort r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.TeamMainMenu.getSortedIcon(com.kammoun.donutCore.team.models.Enums.TeamSort, int):org.bukkit.inventory.ItemStack");
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
        g4qKnWreQ7 = (-371849985) ^ new Random(2578368193253350083L).nextInt();
    }

    public static String xmxyjnhdrf(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] tajonllsyrukpwt() {
        return new byte[]{94, 101, 42, 78, 60, 42, 19, 19, 27, 24, 15, 46, 44, 57, 66, 35, 49, 63, 99, 49, 79, 37, 125, 79, 85, 53, 60, 64, 114, 59, 68, 96, 3, 45, 34, 2, 34, 3, 107, 98, 72, 73, 101, 41, 105, 51, 60, 76, 95, 69, 35, 106, 42, 95, 94, 125, 103, 119, 36, 76, 107, 7, 100, 81, 107, 121, 49, 17, 33, 14, 71, 47, 59, 23, 52, 119, 6, 80, 108, 55, 98, 50};
    }

    private static byte[] olyjqkgujwjfqmp() {
        return new byte[]{-111, -81, 31, 95, 10, 112, 1, -28};
    }

    private static byte[] pnixlkizalynwlp() {
        return new byte[]{-105, -84, 25, 81, 10, 123, 36, 97, 45, 67, 57, 116, 21, 108, 117, Byte.MAX_VALUE, 0, 41, 84, 115, 124, 115, 75, 88, 98, 105, 10, 22, 68, 102, 125, 55, 52, 125, 19, 81};
    }

    private static byte[] ectqwmaxjvxdjtg() {
        return new byte[]{-111, -86, 28, 89, 15, 126, 0, -27};
    }

    private static byte[] nsnoxzmvbrywssz() {
        return new byte[]{-111, -93, 25, 17, 4, 123, 43, 72, 44, 78, 62, 100, 31, 33, 122, 98, 9, 100, 84, 123, 126, 104};
    }

    private static byte[] ljqeyfypafiutyz() {
        return new byte[]{-103, -87, 30, 21, 9, Byte.MAX_VALUE, 42, 79, 34, 69, 59, 111, 25, 33, 123, 96, 8, 122, 87, 115, 122, 62, 68, 19, 108, 104};
    }

    private static byte[] kpotoyujvblbuql() {
        return new byte[]{-106, -83, 29, 23, 4, 126, 36, 73, 35, 64, 56, 106, 28, 47, 117, 96, 4, 98, 85, 103, 120, 120};
    }

    private static byte[] dutxbgggiufudex() {
        return new byte[]{-108, -93, 19, 19, 10, 126, 34, 72, 34, 66, 54, 100, 24, 33, 117, 97, 5, 99, 87, 105, 118, 99, 75, 27, 100, 105};
    }

    private static byte[] yrkyxbknocixsdh() {
        return new byte[]{-107, -86, 27, 23, 12, 113, 35, 73, 35, 67, 63, 108, 28, 39, 122, 99, 4, 113, 86, 113, 126, 56, 77, 24, 101, 102, 4, 19};
    }

    private static byte[] fkyennxaokwipmz() {
        return new byte[]{-111, -86, 24, 21, 5, 125, 35, 69, 34, 71, 63, 111, 30, 46, 118, 122, 8, 104, 82, 119, 125, 126, 68, 15, 101, 105};
    }

    private static byte[] cogvsvnsbtbvjwc() {
        return new byte[]{-108, -93, 28, 21, 13, 121, 32, 73, 34, 66, 54, 107, 30, 38, 114, 100, 4, 99, 87, 105, 121, 122, 76, 82, 102, 104, 5, 27, 75, 96, 118, 52};
    }

    private static byte[] fzayuyimqdbxogb() {
        return new byte[]{-111, -82, 27, 81, 10, 124, 33, 99, 41, 68, 62, 119, 29, 105, 116, 126, 3, 107, 81, 34, 126, 98, 76, 25, 99, 105, 14, 29, 64, 38, 117, 122, 50, 58};
    }

    private static byte[] yxvhdnzrybftajw() {
        return new byte[]{-111, -86, 29, 82, 12, 110, 43, 75, 43, 71, 62, 123, 27, 37};
    }

    private static byte[] djoiljamcoigizh() {
        return new byte[]{-106, -94, 31, 93, 4, 105, 34, 76, 45, 65, 58, 97, 20, 111, 115, 98, 7, 34};
    }

    private static byte[] hmpdskqrddkyzqz() {
        return new byte[]{-111, -87, 28, 90, 10, 102, 37, 66, 44, 65, 62, 112, 26, 87, 116, 117, 7, 106, 84, 100, 126, 115, 75, 91};
    }

    private static byte[] rbfwrezkbwfylxs() {
        return new byte[]{-111, -87, 30, 88, 11, 126, 35, 64, 44, 82, 62, 66, 24, 122, 117, 118, 1, 108, 84, 122, 126, 115, 73, 14, 98, Byte.MAX_VALUE, 12, 87};
    }

    private static byte[] ccoyndhqhgawcdg() {
        return new byte[]{-111, -86, 29, 82, 15, 107, 43, 69, 43, 79, 62, 115, 27, 95, 113, 120, 9, 109, 83, 106, 126, 112, 74, 83};
    }

    private static byte[] gubqmiiglyuqagv() {
        return new byte[]{-111, -83, 26, 89, 11, 123, 37, 104, 46, 68, 62, 112, 28, 107, 117, Byte.MAX_VALUE, 7, 39, 86, 117, 126, 125, 77, 94, 98, 111, 10, 25, 71, 101, 117, 54, 51, 123, 21, 80};
    }

    private static byte[] zxlfsqbmjheiehq() {
        return new byte[]{-111, -94, 30, 90, 4, 125, 14, -28};
    }

    private static byte[] srwlsavicvtksnl() {
        return new byte[]{-103, -87, 29, 80, 14, 122, 6, -19};
    }

    private static int ruqqkyjmgqkdbtnz(int i, int i2) {
        return i2 ^ i;
    }
}
