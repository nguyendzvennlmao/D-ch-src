package com.kammoun.donutCore.team.gui;

import com.kammoun.donutCore.api.utils.PlaceHolderHelper;
import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.api.utils.menu.KMenu;
import com.kammoun.donutCore.team.models.Enums.Permissions;
import com.kammoun.donutCore.team.models.Team;
import com.kammoun.donutCore.team.models.TeamPermissionHolder;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class TeamPermission extends KMenu implements Listener {
    private KItem back;
    private KItem editHome;
    private KItem manageMembers;
    private KItem togglePvP;
    private KItem teamChat;
    private KItem visitHome;
    private KItem kick;
    private static int Wa19BzMnt7 = 0;
    private transient int jH7fjLrM5P = 1415325617;
    private static byte[] iwavcimfvt;
    private static String[] nothing_to_see_here = new String[15];

    public TeamPermission(org.bukkit.plugin.java.JavaPlugin r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.TeamPermission.<init>(org.bukkit.plugin.java.JavaPlugin, int):void");
    }

    private void loadItems(int i) {
        int i2 = 936732798 ^ (840446216 ^ 1792724679);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 2025635211) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2025635211 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (895362735 ^ i2)) {
                    break;
                }
            }
            int i3 = 1184182486 ^ i2;
            throw new IOException("double");
        }
        int i4 = 1045323165 ^ i2;
        this.back = KItem.fromConfig(this.config.getConfigurationSection(dnoxdbkxry(ihkqghadhhzorex(), i4)), 2126963651);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1966190238) {
            i4 = 965012348 ^ i4;
            this.editHome = KItem.fromConfig(this.config.getConfigurationSection(dnoxdbkxry(ymzmmbuooibpkna(), i4)), 2126963651);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1189677699) {
                i4 = 1488955117 ^ i4;
                this.manageMembers = KItem.fromConfig(this.config.getConfigurationSection(dnoxdbkxry(hkqngpbxoieszho(), i4)), 2126963651);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2095825431) {
                    i4 = 1540920325 ^ i4;
                    this.togglePvP = KItem.fromConfig(this.config.getConfigurationSection(dnoxdbkxry(zicshkjkollmmfu(), i4)), 2126963651);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1573952963) {
                        int i5 = 1689169710 ^ i4;
                        this.teamChat = KItem.fromConfig(this.config.getConfigurationSection(dnoxdbkxry(tgypiilgsnustsw(), i5)), 2126963651);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 2024137904) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2024137904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1395813397 ^ i5)) {
                                    break;
                                }
                            }
                            int i6 = 167527311 ^ i5;
                            throw new IOException("double");
                        }
                        i4 = 764837620 ^ i5;
                        this.visitHome = KItem.fromConfig(this.config.getConfigurationSection(dnoxdbkxry(htklrefziubgyts(), i4)), 2126963651);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 336990993) {
                            i4 = 129833102 ^ i4;
                            this.kick = KItem.fromConfig(this.config.getConfigurationSection(dnoxdbkxry(wnuslzqgkvprcjy(), i4)), 2126963651);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 704567137) {
                                int i7 = 254974682 ^ i4;
                                return;
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2095825431 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (840878009 ^ i4)) {
                int i8 = 1874576851 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1349124529 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1033461683 ^ i4)) {
                    int i9 = 462538910 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1966190238 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1229399489 ^ i4)) {
                        int i10 = 2060447491 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 336990993 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2092174874 ^ i4)) {
                            int i11 = 1975194977 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1573952963 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1297542757 ^ i4)) {
                                int i12 = 260186409 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1189677699 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1336894673 ^ i4)) {
                                    int i13 = 1814330655 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 704567137 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (962658928 ^ i4)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i14 = 1593564776 ^ i4;
        throw new RuntimeException();
    }

    public void openInventory(Player player, Team team, UUID uuid, int i) {
        int i2 = 903634672 ^ (1599659692 ^ 1792724679);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 49444056) {
            int i3 = 456780757 ^ i2;
            Optional ofNullable = Optional.ofNullable(Bukkit.getOfflinePlayer(uuid).getName());
            String dnoxdbkxry = dnoxdbkxry(ewchgefhcdlccic(), i3);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -616748432) {
                int i4 = 1939629716 ^ i3;
                String str = (String) ofNullable.orElse(dnoxdbkxry);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1205739219) {
                    i2 = 2053594577 ^ i4;
                    TeamPermissionHolder teamPermissionHolder = new TeamPermissionHolder(team, uuid, 635738248);
                    String[] strArr = new String[(byte) (312253967 ^ i2)];
                    strArr[(byte) (312253963 ^ i2)] = dnoxdbkxry(rjhbbkrbslbolfb(), i2);
                    strArr[(byte) (312253962 ^ i2)] = str;
                    strArr[(byte) (312253961 ^ i2)] = dnoxdbkxry(cbbxdbonqqqpdcy(), i2);
                    byte b = (byte) (312253960 ^ i2);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1796935592) {
                        i3 = 1195150968 ^ i2;
                        strArr[b] = team.getTeamName();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1392475238) {
                            int i5 = 936758261 ^ i3;
                            loadInventory(teamPermissionHolder, strArr, 408434007);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 330226739) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 330226739 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (564133259 ^ i5)) {
                                        break;
                                    }
                                }
                                int i6 = 1712834790 ^ i5;
                                throw new IllegalAccessException("double");
                            }
                            i3 = 490105057 ^ i5;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -98723013) {
                                i4 = 1763916954 ^ i3;
                                linkedHashMap.put(this.editHome, Permissions.EDIT_HOME);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1291550744) {
                                    i4 = 1268482214 ^ i4;
                                    linkedHashMap.put(this.manageMembers, Permissions.MANAGE_MEMBERS);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -271025446) {
                                        int i7 = 109312834 ^ i4;
                                        linkedHashMap.put(this.togglePvP, Permissions.TOGGLE_PVP);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -607674166) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -710515957 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (138032839 ^ i7)) {
                                                    int i8 = 211370009 ^ i7;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -607674166 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1720490009 ^ i7)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            int i9 = 960939570 ^ i7;
                                            throw new RuntimeException("double");
                                        }
                                        int i10 = 126434825 ^ i7;
                                        linkedHashMap.put(this.teamChat, Permissions.USE_TEAM_CHAT);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -410103678) {
                                            int i11 = 690234496 ^ i10;
                                            linkedHashMap.put(this.visitHome, Permissions.VISIT_HOME);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1364233085) {
                                                int i12 = 960464341 ^ i11;
                                                linkedHashMap.forEach((kItem, permissions) -> {
                                                    int i13 = 1780570541 ^ (1071960705 ^ 1792724679);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) != -117821607) {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -117821607 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (730259412 ^ i13)) {
                                                                break;
                                                            }
                                                        }
                                                        int i14 = 247795973 ^ i13;
                                                        throw new IOException("double");
                                                    }
                                                    int i15 = 1314249118 ^ i13;
                                                    ItemStack buildPermissionIcon = buildPermissionIcon(kItem.getItemStack(1475551979), permissions, team, uuid, 655367252);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != -1974148181) {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -1974148181 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (1448793904 ^ i15)) {
                                                                break;
                                                            }
                                                        }
                                                        int i16 = 1739409541 ^ i15;
                                                        throw new IOException("double");
                                                    }
                                                    int i17 = 367716992 ^ i15;
                                                    Inventory inventory = this.inventory;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == 621000619) {
                                                        i17 = 1717606812 ^ i17;
                                                        int intValue = kItem.getSlot(1791774489).intValue();
                                                        String[] strArr2 = new String[(byte) (46198635 ^ i17)];
                                                        strArr2[(byte) (46198633 ^ i17)] = dnoxdbkxry(yoeuxxppsbvvono(), i17);
                                                        strArr2[(byte) (46198632 ^ i17)] = str;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == 369589064) {
                                                            int i18 = 610389720 ^ i17;
                                                            ItemStack parsePlaceholders = PlaceHolderHelper.parsePlaceholders(buildPermissionIcon, strArr2, 1409018373);
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 889785737) {
                                                                i18 = 1764355021 ^ i18;
                                                                inventory.setItem(intValue, parsePlaceholders);
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 2084983778) {
                                                                    int i19 = 1239984682 ^ i18;
                                                                    return;
                                                                }
                                                            }
                                                            while (true) {
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 855835312 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (589323131 ^ i18)) {
                                                                    int i20 = 114402480 ^ i18;
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 889785737 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (1121196038 ^ i18)) {
                                                                        int i21 = 2080750954 ^ i18;
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 2084983778 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (1223672789 ^ i18)) {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            int i22 = 618696780 ^ i18;
                                                            throw new IllegalAccessException();
                                                        }
                                                    }
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == 369589064 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (233605482 ^ i17)) {
                                                            int i23 = 2106769534 ^ i17;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == 621000619 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (388455267 ^ i17)) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    int i24 = 803229485 ^ i17;
                                                    throw new IllegalAccessException("double");
                                                });
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != 1733515818) {
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1733515818 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (968231804 ^ i12)) {
                                                            break;
                                                        }
                                                    }
                                                    int i13 = 1840760963 ^ i12;
                                                    throw new IllegalAccessException("double");
                                                }
                                                int i14 = 821772329 ^ i12;
                                                ItemStack itemStack = this.kick.getItemStack(1475551979);
                                                String[] strArr2 = new String[(byte) (2081500014 ^ i14)];
                                                strArr2[(byte) (2081500012 ^ i14)] = dnoxdbkxry(psbzbecjchcsavo(), i14);
                                                strArr2[(byte) (2081500013 ^ i14)] = str;
                                                ItemStack parsePlaceholders = PlaceHolderHelper.parsePlaceholders(itemStack, strArr2, 1409018373);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) != -527869085) {
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -527869085 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (265650379 ^ i14)) {
                                                            break;
                                                        }
                                                    }
                                                    int i15 = 2059314927 ^ i14;
                                                    throw new IllegalAccessException("double");
                                                }
                                                int i16 = 1730236922 ^ i14;
                                                this.inventory.setItem(this.kick.getSlot(1791774489).intValue(), parsePlaceholders);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) != -645671760) {
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -645671760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (186624697 ^ i16)) {
                                                            break;
                                                        }
                                                    }
                                                    int i17 = 1437744186 ^ i16;
                                                    throw new IOException("double");
                                                }
                                                i10 = 517233243 ^ i16;
                                                ItemStack itemStack2 = this.back.getItemStack(1475551979);
                                                String[] strArr3 = new String[(byte) (98836687 ^ i10)];
                                                strArr3[(byte) (98836685 ^ i10)] = dnoxdbkxry(nuxwboxghrnxsmv(), i10);
                                                strArr3[(byte) (98836684 ^ i10)] = str;
                                                ItemStack parsePlaceholders2 = PlaceHolderHelper.parsePlaceholders(itemStack2, strArr3, 1409018373);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 790693480) {
                                                    i11 = 1761181827 ^ i10;
                                                    this.inventory.setItem(this.back.getSlot(1791774489).intValue(), parsePlaceholders2);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1760363123) {
                                                        i11 = 789563299 ^ i11;
                                                        player.openInventory(this.inventory);
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 278085482) {
                                                            int i18 = 950446988 ^ i11;
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 278085482 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1784071711 ^ i11)) {
                                                    int i19 = 1299552705 ^ i11;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1760363123 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (192237159 ^ i11)) {
                                                        int i20 = 1989174142 ^ i11;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1364233085 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1657766849 ^ i11)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            int i21 = 1365357217 ^ i11;
                                            throw new IOException("double");
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -410103678 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (817589305 ^ i10)) {
                                                int i22 = 898795713 ^ i10;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 790693480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (293068517 ^ i10)) {
                                                    break;
                                                }
                                            }
                                        }
                                        int i23 = 475712914 ^ i10;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1205739219 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1181118150 ^ i4)) {
                        int i24 = 2078967868 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -271025446 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (708919084 ^ i4)) {
                            int i25 = 1341340617 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1291550744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1679072756 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
                int i26 = 355946010 ^ i4;
                throw new IOException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -616748432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (660010060 ^ i3)) {
                    int i27 = 1521769530 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -98723013 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1240702874 ^ i3)) {
                        int i28 = 2063501303 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1392475238 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (175610479 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i29 = 936046382 ^ i3;
            throw new IOException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1796935592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1869605588 ^ i2)) {
                int i30 = 1323762357 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 49444056 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (300977011 ^ i2)) {
                    break;
                }
            }
        }
        int i31 = 1026944871 ^ i2;
        throw new RuntimeException("double");
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent inventoryClickEvent) {
        int i = 706095141 ^ (1051741860 ^ 1792724679);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -203079117) {
            i = 2023230347 ^ i;
            if ((inventoryClickEvent.getInventory().getHolder() instanceof TeamPermissionHolder) == (115647437 ^ i)) {
                int i2 = 1576546161 ^ i;
                return;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 925179496) {
                i = 1821469212 ^ i;
                handleClick(inventoryClickEvent, 743228312);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1403932299) {
                    int i3 = 828982637 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -656120350 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (831699879 ^ i)) {
                int i4 = 96708156 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 925179496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1890102998 ^ i)) {
                    int i5 = 2013610333 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -203079117 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (483868941 ^ i)) {
                        int i6 = 1473941513 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1403932299 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1152030070 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 1308973867 ^ i;
        throw new IOException();
    }

    @Override
    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.TeamPermission.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    private void togglePermission(org.bukkit.entity.Player r8, com.kammoun.donutCore.team.models.Team r9, java.util.UUID r10, com.kammoun.donutCore.team.models.Enums.Permissions r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.TeamPermission.togglePermission(org.bukkit.entity.Player, com.kammoun.donutCore.team.models.Team, java.util.UUID, com.kammoun.donutCore.team.models.Enums.Permissions, int):void");
    }

    private boolean matchesIcon(org.bukkit.inventory.ItemStack r6, com.kammoun.donutCore.api.utils.items.KItem r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.TeamPermission.matchesIcon(org.bukkit.inventory.ItemStack, com.kammoun.donutCore.api.utils.items.KItem, int):boolean");
    }

    private boolean matchesPermissionIcon(org.bukkit.inventory.ItemStack r8, com.kammoun.donutCore.api.utils.items.KItem r9, com.kammoun.donutCore.team.models.Enums.Permissions r10, com.kammoun.donutCore.team.models.Team r11, java.util.UUID r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.TeamPermission.matchesPermissionIcon(org.bukkit.inventory.ItemStack, com.kammoun.donutCore.api.utils.items.KItem, com.kammoun.donutCore.team.models.Enums.Permissions, com.kammoun.donutCore.team.models.Team, java.util.UUID, int):boolean");
    }

    private boolean hasMatchingName(org.bukkit.inventory.ItemStack r6, org.bukkit.inventory.ItemStack r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.TeamPermission.hasMatchingName(org.bukkit.inventory.ItemStack, org.bukkit.inventory.ItemStack, int):boolean");
    }

    @Override
    protected void setMenuItems(String[] strArr, int i) {
        int i2 = 1003666979 ^ (933630199 ^ 1792724679);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 896729243) {
            int i3 = 746514090 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1451505098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1787834820 ^ i2)) {
                int i4 = 904680401 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 896729243 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1094455081 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 916121078 ^ i2;
        throw new IllegalAccessException();
    }

    private org.bukkit.inventory.ItemStack buildPermissionIcon(org.bukkit.inventory.ItemStack r6, com.kammoun.donutCore.team.models.Enums.Permissions r7, com.kammoun.donutCore.team.models.Team r8, java.util.UUID r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.TeamPermission.buildPermissionIcon(org.bukkit.inventory.ItemStack, com.kammoun.donutCore.team.models.Enums.Permissions, com.kammoun.donutCore.team.models.Team, java.util.UUID, int):org.bukkit.inventory.ItemStack");
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
        iwavcimfvt = hgpgdyzsspfsitu();
        Wa19BzMnt7 = (-1056435020) ^ new Random(-1674804235365553681L).nextInt();
    }

    public static String dnoxdbkxry(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ iwavcimfvt[i3 % iwavcimfvt.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] hgpgdyzsspfsitu() {
        return new byte[]{93, 112, 116, 30, 41, 105, 95, 116, 110, 123, 74, 91, 60, 111, 65, 87, 122, 69, 40, 81, 26, 91, 64, 78, 55, 9, 37, 57, 105, 26, 36, 82};
    }

    private static byte[] pypyzwfkgsqgoeg() {
        return new byte[]{-110, -74, 67, 10, 25, 61, 102, 37, 93, 38, 123, 17, 11, 60, 113, 2, 67, 28, 27, 0, 43, 6};
    }

    private static byte[] sufyxzfiddezpmp() {
        return new byte[]{-112, -65, 66, 14, 25, 62, 103, 41, 88, 38, 122, 12, 10, 61, 119, 3, 66, 22, 27, 5};
    }

    private static byte[] yoeuxxppsbvvono() {
        return new byte[]{-105, -71, 69, 2, 17, 47, 108, 43, 90, 44, 123, 27, 4, 60, 114, 22, 78, 86};
    }

    private static byte[] wnuslzqgkvprcjy() {
        return new byte[]{-107, -67, 64, 78, 29, 59, 103, 43, 90, 35, 120, 28, 5, 117, 112, 4, 74, 24, 30, 0, 46, 9};
    }

    private static byte[] ymzmmbuooibpkna() {
        return new byte[]{-110, -72, 65, 78, 26, 56, 109, 47, 90, 45, 123, 31, 9, 120, 114, 0, 72, 21, 28, 0, 43, 24, 117, 90, 4, 83, 23, 98, 93, 79, 21, 0};
    }

    private static byte[] zicshkjkollmmfu() {
        return new byte[]{-110, -73, 68, 64, 26, 63, 105, 35, 91, 35, 123, 16, 12, 118, 114, 22, 76, 18, 29, 0, 43, 4, 112, 21, 4, 89, 19, 44, 92, 92, 21, 28, 109, 55};
    }

    private static byte[] htklrefziubgyts() {
        return new byte[]{-106, -72, 76, 78, 16, 62, 104, 35, 88, 32, 125, 16, 5, 120, 117, 22, 66, 26, 29, 21, 34, 11, 121, 14, 0, 28, 19, 100, 94, 77, 29, 6, 105, 34};
    }

    private static byte[] ihkqghadhhzorex() {
        return new byte[]{-110, -68, 66, 67, 17, 57, 103, 34, 91, 35, 123, 27, 10, 117, 121, 6, 66, 29, 29, 4, 43, 3};
    }

    private static byte[] tgypiilgsnustsw() {
        return new byte[]{-111, -70, 71, 71, 24, 61, 109, 40, 86, 39, Byte.MAX_VALUE, 27, 12, 112, 118, 17, 73, 24, 26, 5, 41, 6, 113, 84, 5, 89, 29, 99, 92, 72, 20, 23};
    }

    private static byte[] hkqngpbxoieszho() {
        return new byte[]{-101, -66, 69, 64, 31, 57, 105, 47, 91, 45, 123, 25, 11, 119, 114, 12, 78, 17, 16, 14, 43, 13, 118, 26, 1, 88, 16, 44, 88, 70, 19, 1, 110, 43, 64, 73, 17, 61, 110, 49, 88, 59};
    }

    private static byte[] nuxwboxghrnxsmv() {
        return new byte[]{-102, -73, 76, 8, 31, 47, 103, 45, 87, 34, 114, 17, 10, 60, 121, 16, 67, 88};
    }

    private static byte[] ewchgefhcdlccic() {
        return new byte[]{-105, -70, 77, 124, 30, 48, 108, 42, 86, 33, Byte.MAX_VALUE, 13, 11, 47, 118, 10};
    }

    private static byte[] psbzbecjchcsavo() {
        return new byte[]{-111, -65, 76, 10, 28, 41, 111, 40, 95, 40, 120, 18, 4, 59, 116, 21, 74, 80};
    }

    private static byte[] rjhbbkrbslbolfb() {
        return new byte[]{-112, -66, 70, 9, 28, 42, 102, 46, 93, 41, 123, 16, 14, 63, 114, 28, 76, 83};
    }

    private static byte[] cbbxdbonqqqpdcy() {
        return new byte[]{-112, -66, 70, 9, 28, 46, 102, 39, 93, 41, 123, 4, 14, Byte.MAX_VALUE};
    }

    private static byte[] oyclfjgglguigsj() {
        return new byte[0];
    }

    private static byte[] xmsbhdvevxobdnk() {
        return new byte[0];
    }

    private static byte[] ljhrxzrpdctcyxv() {
        return new byte[]{-101, -73, 66, 8, 25, 59, 102, 98, 94, 47, 114, 34, 12, 25, 112, 40};
    }

    private static byte[] ijrodplecidseek() {
        return new byte[]{-112, -74, 65, 8, 31, 51, 105, 0, 92, 45, 115, 3, 12, 59, 120, 4, 67, 5, 27, 72, 47, 5, 118, 24, 1, 68, 23, 42, 80, 73, 20, 11, 100, 51, 77, 66, 26, 52};
    }

    private static byte[] yxdhmldggbslfof() {
        return new byte[]{-101, -65, 77, 8, 31, 56, 103, 100, 94, 47, 122, 45, 12, 23};
    }

    private static int yneiecapthwgddjl(int i, int i2) {
        return i2 ^ i;
    }
}
