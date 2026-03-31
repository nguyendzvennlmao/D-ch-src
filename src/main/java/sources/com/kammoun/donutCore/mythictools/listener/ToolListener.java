package com.kammoun.donutCore.mythictools.listener;

import com.kammoun.donutCore.mythictools.MythicPlugin;
import com.kammoun.donutCore.mythictools.abilities.ToolAbilities;
import com.kammoun.donutCore.mythictools.models.Tools.ToolsType;
import com.kammoun.donutCore.mythictools.utils.ToolsHelper;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ItemStack;

public class ToolListener implements Listener {
    private final MythicPlugin plugin;
    private final ToolAbilities abilities;
    private static int WhnwVEGV0g = 0;
    private transient int sybfZZWuzB = 413391207;
    private static String[] nothing_to_see_here = new String[18];

    public ToolListener(MythicPlugin mythicPlugin, int i) {
        ozakxkwacfhlwcxs(98213831 ^ 934304121, 323824632);
        int parseInt = 275396919 ^ (506436360 ^ Integer.parseInt("794972025"));
        this.sybfZZWuzB = 413391207 ^ WhnwVEGV0g;
        this.plugin = mythicPlugin;
        this.abilities = new ToolAbilities(mythicPlugin, 1357286170);
        int i2 = 139121115 ^ (216874628 ^ (1513593372 ^ (800510298 ^ parseInt)));
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreak(BlockBreakEvent blockBreakEvent) {
        int i = 1040116742 ^ (45549786 ^ 2117362107);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 200026938) {
            int i2 = 1113286975 ^ i;
            if (blockBreakEvent.isCancelled() != (52882520 ^ i2)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 423060160) {
                    int i3 = 190015710 ^ i2;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -560952093 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1371000139 ^ i2)) {
                        int i4 = 949506515 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 423060160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1833586892 ^ i2)) {
                            break;
                        }
                    }
                }
                int i5 = 433418813 ^ i2;
                throw new IOException("double");
            }
            i = ozakxkwacfhlwcxs(i2, 2133829611);
            if (this.plugin.getConfigManager(219179752).isInRestrictedRegion(blockBreakEvent.getPlayer(), 1155503527) == (2080983987 ^ i)) {
                i = 127353655 ^ i;
                ItemStack itemInMainHand = blockBreakEvent.getPlayer().getInventory().getItemInMainHand();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -588233693) {
                    i = 475854733 ^ i;
                    ToolsType toolType = ToolsHelper.getToolType(itemInMainHand, 1757076261);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1041758283) {
                        i = 268714512 ^ i;
                        if (toolType != null) {
                            i = ozakxkwacfhlwcxs(i, 859547263);
                            this.plugin.getSelfDestructManager(456925710).startDelayedTimer(itemInMainHand, 244314278);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 669571890) {
                                int i6 = 292139174 ^ i;
                                handleToolAbility(blockBreakEvent.getPlayer(), toolType, blockBreakEvent.getBlock(), 1953547147);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1398448638) {
                                    int i7 = 2080203868 ^ i6;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1398448638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (735491688 ^ i6)) {
                                        int i8 = 1332261697 ^ i6;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -964977119 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1204756247 ^ i6)) {
                                            break;
                                        }
                                    }
                                }
                                int i9 = 1697875597 ^ i6;
                                throw new IOException("double");
                            }
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1103763253) {
                            int i10 = 1326042845 ^ i;
                            return;
                        }
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -531997285) {
                int i11 = 131815983 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1041758283 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1553064127 ^ i)) {
                int i12 = 372059110 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 669571890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (474937831 ^ i)) {
                    int i13 = 761529827 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -588233693 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2099499676 ^ i)) {
                        int i14 = 198543882 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -531997285 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (825622643 ^ i)) {
                            int i15 = 1639090416 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 200026938 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1128844456 ^ i)) {
                                int i16 = 2084006790 ^ i;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1934523617 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (703771729 ^ i)) {
                                    int i17 = 1792490134 ^ i;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1135354928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1145717712 ^ i)) {
                                        int i18 = 1571916259 ^ i;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1103763253 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (945352477 ^ i)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i19 = 1820373754 ^ i;
        throw new IOException();
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onMultiToolMaterialSwitch(PlayerInteractEvent playerInteractEvent) {
        int i = 881998464 ^ (1956960831 ^ 2117362107);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -267122655) {
            i = 1615000989 ^ i;
            if (playerInteractEvent.getAction() == Action.LEFT_CLICK_BLOCK) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -234642230) {
                    int i2 = 1045543729 ^ i;
                    if (playerInteractEvent.getClickedBlock() != null) {
                        int ozakxkwacfhlwcxs = ozakxkwacfhlwcxs(i2, 846181358);
                        ItemStack itemInMainHand = playerInteractEvent.getPlayer().getInventory().getItemInMainHand();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ozakxkwacfhlwcxs) != -1812733390) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ozakxkwacfhlwcxs) == -1812733390 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ozakxkwacfhlwcxs) == (520730653 ^ ozakxkwacfhlwcxs)) {
                                    break;
                                }
                            }
                            int i3 = 18126798 ^ ozakxkwacfhlwcxs;
                            throw new RuntimeException("double");
                        }
                        int i4 = 1516082808 ^ ozakxkwacfhlwcxs;
                        if (ToolsHelper.getToolType(itemInMainHand, 1757076261) != ToolsType.MULTI_TOOL) {
                            int i5 = 182767417 ^ i4;
                            return;
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1092571632) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1092571632 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1693167556 ^ i4)) {
                                    break;
                                }
                            }
                            int i6 = 2053832392 ^ i4;
                            throw new IllegalAccessException("double");
                        }
                        int i7 = 1319270921 ^ i4;
                        Player player = playerInteractEvent.getPlayer();
                        ToolAbilities toolAbilities = this.abilities;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 873234874) {
                            i2 = 15725020 ^ i7;
                            Material appropriateToolMaterial = toolAbilities.getAppropriateToolMaterial(playerInteractEvent.getClickedBlock(), 818209377);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 863178586) {
                                i7 = 58081573 ^ i2;
                                ToolsHelper.updateItemMaterialInMainHand(player, appropriateToolMaterial, 1341381960);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 683738738) {
                                    int i8 = 1205798345 ^ i7;
                                    return;
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 873234874 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1913467297 ^ i7)) {
                                int i9 = 1839973428 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 257151073 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1695636169 ^ i7)) {
                                    int i10 = 19071759 ^ i7;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 683738738 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (900344767 ^ i7)) {
                                        break;
                                    }
                                }
                            }
                        }
                        int i11 = 949429684 ^ i7;
                        throw new RuntimeException("double");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 9338179) {
                        int i12 = 1107015076 ^ i2;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 863178586 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1090461669 ^ i2)) {
                            int i13 = 879604948 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 9338179 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (877058731 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i14 = 1345763018 ^ i2;
                    throw new IOException();
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                    case 110935976:
                        int i15 = 2141851285 ^ i;
                        return;
                    case 1214700277:
                        return;
                    case 1398694713:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -267122655 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1452173326 ^ i)) {
                int i16 = 1115347558 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -234642230 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1229044260 ^ i)) {
                    int i17 = 1548387139 ^ i;
                    throw new RuntimeException("double");
                }
            }
        }
    }

    @org.bukkit.event.EventHandler
    public void onSellAxeInteract(org.bukkit.event.player.PlayerInteractEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.listener.ToolListener.onSellAxeInteract(org.bukkit.event.player.PlayerInteractEvent):void");
    }

    @EventHandler
    public void onItemDamage(PlayerItemDamageEvent playerItemDamageEvent) {
        int i = 1021546935 ^ (1246303253 ^ 2117362107);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 1157046472) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1157046472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1257306352 ^ i)) {
                    break;
                }
            }
            int i2 = 1221897336 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 546422984 ^ i;
        if (ToolsHelper.getToolType(playerItemDamageEvent.getItem(), 1757076261) == null) {
            int i4 = 1613836851 ^ i3;
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1081681545) {
            i3 = 1677461613 ^ i3;
            playerItemDamageEvent.setCancelled((byte) (1274227901 ^ i3));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1603888610) {
                int i5 = 63781470 ^ i3;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1081681545 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1135017757 ^ i3)) {
                int i6 = 1356320500 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1603888610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1403067878 ^ i3)) {
                    break;
                }
            }
        }
        int i7 = 297447663 ^ i3;
        throw new IllegalAccessException();
    }

    private void handleToolAbility(org.bukkit.entity.Player r6, com.kammoun.donutCore.mythictools.models.Tools.ToolsType r7, org.bukkit.block.Block r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.listener.ToolListener.handleToolAbility(org.bukkit.entity.Player, com.kammoun.donutCore.mythictools.models.Tools.ToolsType, org.bukkit.block.Block, int):void");
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
        WhnwVEGV0g = 2066139909 ^ new Random(8346027902843053634L).nextInt();
    }

    public static String bxlqddmraz(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] jynssfivrnwbrdc() {
        return new byte[]{43, 19, 32, 78, 7, 55, 51, 69, 3, 17};
    }

    private static byte[] matsgaecgzlucoj() {
        return new byte[]{-28, -33, 20, 56, 50, 71, 10, 56, 53, 119, 26, 116};
    }

    private static int ozakxkwacfhlwcxs(int i, int i2) {
        return i ^ i2;
    }
}
