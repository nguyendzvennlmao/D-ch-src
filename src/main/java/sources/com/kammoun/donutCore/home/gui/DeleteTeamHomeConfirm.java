package com.kammoun.donutCore.home.gui;

import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.api.utils.menu.KMenu;
import com.kammoun.donutCore.home.HomePlugin;
import com.kammoun.donutCore.team.TeamPlugin;
import com.kammoun.donutCore.team.data.TeamTable;
import com.kammoun.donutCore.team.models.Enums.Messages;
import com.kammoun.donutCore.team.models.Enums.Permissions;
import com.kammoun.donutCore.team.models.Team;
import com.kammoun.donutCore.team.models.TeamMember;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class DeleteTeamHomeConfirm extends KMenu implements Listener {
    private final KItem confirmItem;
    private final KItem denyItem;

    private static int f6347jukvkNnc = 0;
    private transient int ESl1IVxTal = 755298494;
    private static String wgwwpxvmbm;
    private static String[] nothing_to_see_here = new String[17];

    public DeleteTeamHomeConfirm(JavaPlugin javaPlugin, int i) {
        super(javaPlugin, "Home/Gui's/DeleteTeamHomeConfirmMenu.yml", 1546437752);
        myxjjhqhhbkqvsmv(996975068 ^ 91623776, 1658312486);
        int parseInt = 1265750837 ^ (2101651118 ^ Integer.parseInt("1794642433"));
        this.ESl1IVxTal = 755298494 ^ f6347jukvkNnc;
        this.confirmItem = KItem.fromConfig(getConfig(533900686).getConfigurationSection("Items.Confirm-Delete"), 2126963651);
        this.denyItem = KItem.fromConfig(getConfig(533900686).getConfigurationSection("Items.Cancel-Delete"), 2126963651);
        Bukkit.getPluginManager().registerEvents(this, javaPlugin);
        int i2 = 1209357447 ^ (1911767544 ^ (2107550577 ^ (831215163 ^ (2058619748 ^ parseInt))));
    }

    public void openMenu(Player player, int i) {
        int i2 = 768368180 ^ (1581658105 ^ 610704540);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1083741558) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1083741558 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1194183029 ^ i2)) {
                    break;
                }
            }
            int i3 = 249531291 ^ i2;
            throw new IOException("double");
        }
        int i4 = 75825666 ^ i2;
        loadInventory(player, new String[(byte) (1399451475 ^ i4)], 1732930380);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1689290086) {
            i4 = 801551796 ^ i4;
            this.inventory.setItem(this.confirmItem.getSlot(1791774489).intValue(), this.confirmItem.getItemStack(1475551979));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -444934341) {
                i4 = 991196746 ^ i4;
                this.inventory.setItem(this.denyItem.getSlot(1791774489).intValue(), this.denyItem.getItemStack(1475551979));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1037657450) {
                    i4 = 932397177 ^ i4;
                    player.openInventory(this.inventory);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2126289245) {
                        int i5 = 278348206 ^ i4;
                        return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1037657450 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (263237771 ^ i4)) {
                int i6 = 472738857 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2126289245 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (461268035 ^ i4)) {
                    int i7 = 215697176 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 100232147 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1618437500 ^ i4)) {
                        int i8 = 1446020447 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -444934341 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (114788277 ^ i4)) {
                            int i9 = 645540493 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1689290086 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (777853155 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i10 = 1432623161 ^ i4;
        throw new IOException();
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent inventoryClickEvent) {
        int i = 688663077 ^ (1996170213 ^ 610704540);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -594760989) {
            i = 488424550 ^ i;
            if (inventoryClickEvent.getInventory().equals(getInventory()) == (1720537402 ^ i)) {
                myxjjhqhhbkqvsmv(i, 50932920);
                return;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 879397331) {
                i = 1494485615 ^ i;
                handleClick(inventoryClickEvent, 743228312);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -53814615) {
                    int i2 = 1511859927 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 879397331 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (809059606 ^ i)) {
                int i3 = 326727829 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -594760989 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (87160816 ^ i)) {
                    int i4 = 1273266987 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -53814615 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (973269974 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 2143291753 ^ i;
        throw new IllegalAccessException();
    }

    @Override
    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.DeleteTeamHomeConfirm.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    private void onConfirm(Player player, int i) {
        int i2;
        int i3 = 1439484525 ^ (1831708421 ^ 610704540);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -465596512) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -465596512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (472814366 ^ i3)) {
                    int i4 = 1877173206 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1013717141 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (441230718 ^ i3)) {
                        break;
                    }
                }
            }
            int i5 = 222985709 ^ i3;
            throw new IllegalAccessException("double");
        }
        int i6 = 1854830318 ^ i3;
        player.closeInventory();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1874052909) {
            int i7 = 2126530359 ^ i6;
            TeamPlugin teamPlugin = TeamPlugin.getInstance(1863066547);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1716388200) {
                int i8 = 52068207 ^ i7;
                TeamTable teamTable = teamPlugin.getTeamTable(261175650);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 2124282384) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 2124282384 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1932865259 ^ i8)) {
                            break;
                        }
                    }
                    int i9 = 576357369 ^ i8;
                    throw new RuntimeException("double");
                }
                int i10 = 475395198 ^ i8;
                Optional teamByMemberSync = teamTable.getTeamByMemberSync(player.getUniqueId(), 2118511223);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1674421792) {
                    int i11 = 633465316 ^ i10;
                    if (teamByMemberSync.isEmpty() != (910664408 ^ i11)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != -1304619327) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1304619327 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (58514585 ^ i11)) {
                                    break;
                                }
                            }
                            int i12 = 2095694143 ^ i11;
                            throw new RuntimeException("double");
                        }
                        int i13 = 3546318 ^ i11;
                        TeamPlugin.getInstance(1863066547).getConfigManager(152482212).sendMessage(player, Messages.noTeam, new String[(byte) (913423894 ^ i13)], 570565429);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1282543439) {
                            int i14 = 1826793600 ^ i13;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1282543439 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (269490590 ^ i13)) {
                                break;
                            }
                        }
                        int i15 = 1059262488 ^ i13;
                        throw new IOException("double");
                    }
                    int i16 = 358475910 ^ i11;
                    Team team = (Team) teamByMemberSync.get();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == 416436977) {
                        int i17 = 1980761574 ^ i16;
                        boolean isLeader = team.isLeader(player.getUniqueId(), 1680523716);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) != -1470988862) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1470988862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (1319796261 ^ i17)) {
                                    break;
                                }
                            }
                            int i18 = 777602925 ^ i17;
                            throw new IllegalAccessException("double");
                        }
                        int i19 = 313340533 ^ i17;
                        Optional member = team.getMember(player.getUniqueId(), 1918692774);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) != 1027337834) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == 1027337834 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (452922552 ^ i19)) {
                                    break;
                                }
                            }
                            int i20 = 1364972025 ^ i19;
                            throw new IllegalAccessException("double");
                        }
                        i16 = 1030438190 ^ i19;
                        if (member.isEmpty() == (2060206307 ^ i16)) {
                            i10 = myxjjhqhhbkqvsmv(i16, 897161903);
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -698218725) {
                            i10 = 59057098 ^ i16;
                            if (isLeader == (2034852649 ^ i10)) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != -901047989) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -728189774 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1699944231 ^ i10)) {
                                            int i21 = 1841579187 ^ i10;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -901047989 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (610076439 ^ i10)) {
                                                break;
                                            }
                                        }
                                    }
                                    int i22 = 1650529510 ^ i10;
                                    throw new IllegalAccessException("double");
                                }
                                i6 = 1031679572 ^ i10;
                                TeamPlugin.getInstance(1863066547).getConfigManager(152482212).sendMessage(player, Messages.noPermissionCommand, new String[(byte) (1144475005 ^ i6)], 570565429);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 565865450) {
                                    int i23 = 391132553 ^ i6;
                                    return;
                                }
                            }
                            while (true) {
                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i10)) {
                                    case 184437078:
                                        i10 = 922532197 ^ i10;
                                        break;
                                    case 1721606242:
                                        break;
                                    case 1758259521:
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != 675489274 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1388343973 ^ i10)) {
                                    int i24 = 1662896953 ^ i10;
                                    throw new IllegalAccessException("double");
                                }
                            }
                        }
                        TeamMember teamMember = (TeamMember) member.orElse(null);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 2108609122) {
                            i7 = 999386603 ^ i10;
                            if (isLeader != (1948563367 ^ i7)) {
                                i10 = 804427698 ^ i7;
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1591362245) {
                                i6 = 746489200 ^ i7;
                                if (teamMember == null) {
                                    i2 = 2083086959 ^ i6;
                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1026451782) {
                                    i10 = 491935336 ^ i6;
                                    if (teamMember.hasPermission(Permissions.EDIT_HOME, 1929852220) == (1158177983 ^ i10)) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 675489274) {
                                            i2 = 1635464199 ^ i10;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != 675489274) {
                                            }
                                        }
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i10)) {
                                            case 96470586:
                                                i10 = 517883050 ^ i10;
                                                break;
                                            case 2085463312:
                                            case 2099273648:
                                                break;
                                        }
                                    }
                                }
                                TeamPlugin.getInstance(1863066547).getConfigManager(152482212).sendMessage(player, Messages.noPermissionCommand, new String[(byte) (611537080 ^ i2)], 570565429);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 597329345) {
                                    int i25 = 463881753 ^ i2;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 597329345 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (154687261 ^ i2)) {
                                        int i26 = 169069533 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -22498039 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (154470578 ^ i2)) {
                                            int i27 = 621094283 ^ i2;
                                            throw new IOException("double");
                                        }
                                    }
                                }
                            }
                            team.setHomeLocation(null, 1255269160);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -558825302) {
                                i10 = 1197067997 ^ i10;
                                TeamPlugin.getInstance(1863066547).getTeamsManager(995299140).setHomeLocation(player.getUniqueId(), null, 1069595489);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -461408704) {
                                    int i28 = 1472892944 ^ i10;
                                    TeamPlugin.getInstance(1863066547).getConfigManager(152482212).sendMessage(player, Messages.teamHomeDeleted, new String[(byte) (1262845656 ^ i28)], 570565429);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i28) == 1512830658) {
                                        i6 = 522949343 ^ i28;
                                        player.playSound(player.getLocation(), Sound.ENTITY_ITEM_BREAK, 1.0f, 1.0f);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1552457670) {
                                            int i29 = 740069610 ^ i6;
                                            return;
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i28) == 1512830658 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i28) == (1871826427 ^ i28)) {
                                                int i30 = 1455970164 ^ i28;
                                                throw new RuntimeException("double");
                                            }
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -558825302 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (369482299 ^ i10)) {
                                    int i31 = 2003836498 ^ i10;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -461408704 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (671539746 ^ i10)) {
                                        int i32 = 2029092333 ^ i10;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1690581086 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1957573654 ^ i10)) {
                                            int i33 = 1273785643 ^ i10;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                }
                            }
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 2108609122 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1508315500 ^ i10)) {
                                    int i34 = 943037267 ^ i10;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -698218725 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (2108987221 ^ i16)) {
                            int i35 = 982190828 ^ i16;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == 416436977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (204645526 ^ i16)) {
                                break;
                            }
                        }
                    }
                    int i36 = 974423516 ^ i16;
                    throw new IOException("double");
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1674421792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1728765530 ^ i10)) {
                        int i37 = 195482238 ^ i10;
                        throw new IOException("double");
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1716388200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1625502468 ^ i7)) {
                    int i38 = 1976446867 ^ i7;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1591362245 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1912219034 ^ i7)) {
                        int i39 = 723300108 ^ i7;
                        throw new IllegalAccessException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1026451782 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1087291394 ^ i6)) {
                int i40 = 1737383408 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1874052909 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1677623849 ^ i6)) {
                    int i41 = 1565043502 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1552457670 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1780524025 ^ i6)) {
                        int i42 = 1007692391 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 565865450 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (816384970 ^ i6)) {
                            int i43 = 983232124 ^ i6;
                            throw new IOException();
                        }
                    }
                }
            }
        }
    }

    private void onDeny(Player player, int i) {
        int i2 = 475655188 ^ (9568480 ^ 610704540);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -982809791) {
            int i3 = 1405329406 ^ i2;
            player.closeInventory();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1534557363) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1534557363 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (542844026 ^ i3)) {
                        break;
                    }
                }
                int i4 = 483009942 ^ i3;
                throw new IOException("double");
            }
            i2 = 952857071 ^ i3;
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0f, 1.0f);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1657998390) {
                int i5 = 765697193 ^ i2;
                HomePlugin.getInstance(1471891934).getHomeMenu(674394495).openMenu(player, 182985434);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -265283965) {
                    int i6 = 1722626589 ^ i5;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -265283965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1079545070 ^ i5)) {
                        break;
                    }
                }
                int i7 = 1433737499 ^ i5;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1657998390 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (501673202 ^ i2)) {
                int i8 = 115126377 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -982809791 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (55243892 ^ i2)) {
                    break;
                }
            }
        }
        int i9 = 1287057351 ^ i2;
        throw new IllegalAccessException();
    }

    private boolean isSimilarIgnoringMeta(ItemStack itemStack, ItemStack itemStack2, int i) {
        byte b;
        int i2;
        int i3 = 1595146428 ^ (1090878770 ^ 610704540);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -742455151) {
            i3 = 341924455 ^ i3;
            if (itemStack != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1890966441) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1890966441 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (551254635 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 885984733 ^ i3;
                    throw new IllegalAccessException("double");
                }
                int i5 = 1490105538 ^ i3;
                if (itemStack2 == null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1237549637) {
                        i3 = 430888774 ^ i5;
                        return (byte) (1869175025 ^ i3);
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1237549637 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (836175130 ^ i5)) {
                            break;
                        }
                    }
                    int i6 = 1026352758 ^ i5;
                    throw new IOException("double");
                }
                int myxjjhqhhbkqvsmv = myxjjhqhhbkqvsmv(i5, 2132404562);
                if (itemStack.getType() != itemStack2.getType()) {
                    myxjjhqhhbkqvsmv = myxjjhqhhbkqvsmv(myxjjhqhhbkqvsmv, 1666161058);
                    b = (byte) (1787952967 ^ myxjjhqhhbkqvsmv);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(myxjjhqhhbkqvsmv) == 1418721851) {
                        int i7 = 627727404 ^ myxjjhqhhbkqvsmv;
                        return b;
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(myxjjhqhhbkqvsmv) == 1324562216) {
                    int i8 = 933791115 ^ myxjjhqhhbkqvsmv;
                    b = (byte) (1047978863 ^ i8);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -206103695) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 2068498315 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (198868820 ^ i8)) {
                                int i9 = 308820470 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 2145196890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (722432326 ^ i8)) {
                                    int i10 = 2007512186 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1947180616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2002545194 ^ i8)) {
                                        int i11 = 1247830260 ^ i8;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1019924009 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1359479978 ^ i8)) {
                                            int i12 = 1542306252 ^ i8;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -206103695 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (396262006 ^ i8)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int i13 = 178109182 ^ i8;
                        throw new IOException();
                    }
                    int myxjjhqhhbkqvsmv2 = myxjjhqhhbkqvsmv(i8, 435141291);
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(myxjjhqhhbkqvsmv2) != 213465716) {
                            throw null;
                        }
                        throw new IOException();
                    } catch (IOException e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case -1947180616:
                                i2 = 854212980 ^ myxjjhqhhbkqvsmv2;
                                break;
                            case 1019924009:
                                i2 = myxjjhqhhbkqvsmv(myxjjhqhhbkqvsmv2, 67966086);
                                break;
                            default:
                                throw new IllegalAccessException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 480406041) {
                            myxjjhqhhbkqvsmv(i2, 1819274792);
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 480406041 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (811816349 ^ i2)) {
                                    int i14 = 98570447 ^ i2;
                                    throw new IllegalAccessException("double");
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(myxjjhqhhbkqvsmv) == 1418721851 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(myxjjhqhhbkqvsmv) == (2015076756 ^ myxjjhqhhbkqvsmv)) {
                        int i15 = 864521012 ^ myxjjhqhhbkqvsmv;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(myxjjhqhhbkqvsmv) == 1324562216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(myxjjhqhhbkqvsmv) == (1485945422 ^ myxjjhqhhbkqvsmv)) {
                            break;
                        }
                    }
                }
                int i16 = 252220043 ^ myxjjhqhhbkqvsmv;
                throw new IllegalAccessException("double");
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                    case 155985188:
                        i3 = 1098900356 ^ i3;
                        break;
                    case 1086275234:
                    case 1505096800:
                        break;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -742455151 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (186903795 ^ i3)) {
                int i17 = 1299209579 ^ i3;
                throw new RuntimeException("double");
            }
        }
    }

    @Override
    protected void setMenuItems(String[] strArr, int i) {
        int i2 = 593672940 ^ (2031764140 ^ 610704540);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -252500253) {
            int i3 = 959353723 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 965197114 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1393265167 ^ i2)) {
                int i4 = 1264882376 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -252500253 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (665136596 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 709075219 ^ i2;
        throw new IllegalAccessException();
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
        wgwwpxvmbm = ByteBuffer.wrap(tczismtjuzfcsur()).asCharBuffer().toString();
        f6347jukvkNnc = 601710559 ^ new Random(-282484900134932569L).nextInt();
    }

    public static String mciaaoiqdw(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = wgwwpxvmbm.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] tczismtjuzfcsur() {
        return new byte[0];
    }

    private static int myxjjhqhhbkqvsmv(int i, int i2) {
        return i ^ i2;
    }
}
