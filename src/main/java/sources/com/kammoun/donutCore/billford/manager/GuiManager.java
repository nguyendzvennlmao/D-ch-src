package com.kammoun.donutCore.billford.manager;

import com.kammoun.donutCore.billford.BillFordPlugin;
import com.kammoun.donutCore.billford.config.BillfordConfig;
import com.kammoun.donutCore.billford.gui.BillfordGui;
import com.kammoun.donutCore.billford.gui.BillfordPresetEditorGui;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.InventoryHolder;

public class GuiManager implements Listener {
    private final BillFordPlugin plugin;
    private final BillfordConfig config;
    private final BillfordManager billfordManager;
    private BillfordGui mainGui;
    private final Map<UUID, BillfordPresetEditorGui> editorGuis;
    private static int gl6YRoCl1D = 0;
    private transient int gKhBLuTLiz = 685322353;
    private static String sfkdcvdakv;
    private static String[] nothing_to_see_here = new String[18];

    public GuiManager(BillFordPlugin billFordPlugin, BillfordConfig billfordConfig, BillfordManager billfordManager, int i) {
        int i2 = 1214774021 ^ (376792919 ^ 1141137540);
        int parseInt = 1863909682 ^ (1945733496 ^ Integer.parseInt("116815004"));
        this.gKhBLuTLiz = 685322353 ^ gl6YRoCl1D;
        int djfyqoaehzergjih = 1736287878 ^ djfyqoaehzergjih(parseInt, 1835689511);
        this.plugin = billFordPlugin;
        this.config = billfordConfig;
        this.billfordManager = billfordManager;
        this.editorGuis = new HashMap();
        initializeMainGui(1543236559);
        int i3 = 456156004 ^ (1436114412 ^ (1827580808 ^ (946959424 ^ (1515021460 ^ djfyqoaehzergjih))));
    }

    private void initializeMainGui(int i) {
        int i2 = 237880444 ^ (1793489474 ^ 50775624);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1047249843) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1047249843 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1865098557 ^ i2)) {
                    int i3 = 1601826029 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 411571688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (674467745 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 516912047 ^ i2;
            throw new IllegalAccessException();
        }
        int i5 = 1971043951 ^ i2;
        this.mainGui = new BillfordGui(this.plugin.getApi(2142241109), this.plugin, this.config, 607139477);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1783222072) {
            int i6 = 296207524 ^ i5;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1783222072 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1772489063 ^ i5)) {
                break;
            }
        }
        int i7 = 306661255 ^ i5;
        throw new IOException("double");
    }

    public void openMainGui(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.manager.GuiManager.openMainGui(org.bukkit.entity.Player, int):void");
    }

    public void openEditorGui(org.bukkit.entity.Player r6, java.lang.String r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.manager.GuiManager.openEditorGui(org.bukkit.entity.Player, java.lang.String, int):void");
    }

    public void openNewPresetEditor(org.bukkit.entity.Player r6, java.lang.String r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.manager.GuiManager.openNewPresetEditor(org.bukkit.entity.Player, java.lang.String, int):void");
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent inventoryClickEvent) {
        int i = 171518191 ^ (2114875794 ^ 50775624);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1181943381) {
            i = 230025151 ^ i;
            if ((inventoryClickEvent.getWhoClicked() instanceof Player) != (2055501962 ^ i)) {
                i = 1824863895 ^ i;
                InventoryHolder holder = inventoryClickEvent.getInventory().getHolder();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1307938584) {
                    i = 692616436 ^ i;
                    if ((holder instanceof BillfordGui) == (1057567465 ^ i)) {
                        int i2 = 635518541 ^ i;
                        if ((holder instanceof BillfordPresetEditorGui) == (451415204 ^ i2)) {
                            djfyqoaehzergjih(i2, 3450086);
                            return;
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -683645664) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -683645664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1415925852 ^ i2)) {
                                    break;
                                }
                            }
                            int i3 = 1382871997 ^ i2;
                            throw new IOException("double");
                        }
                        int i4 = 1973110928 ^ i2;
                        ((BillfordPresetEditorGui) holder).handleClick(inventoryClickEvent, 343644616);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2073698723) {
                            int i5 = 1681920097 ^ i4;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2073698723 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1061051023 ^ i4)) {
                                break;
                            }
                        }
                        int i6 = 299481033 ^ i4;
                        throw new IOException("double");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -129394871) {
                        i = 1944487338 ^ i;
                        ((BillfordGui) holder).handleClick(inventoryClickEvent, 743228312);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1736292890) {
                            int i7 = 472227716 ^ i;
                            return;
                        }
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -735853485) {
                int i8 = 916421241 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1181943381 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (60945669 ^ i)) {
                int i9 = 1647485082 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1503306408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2112807046 ^ i)) {
                    int i10 = 785804143 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1307938584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1374382408 ^ i)) {
                        int i11 = 286020896 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1736292890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (469236286 ^ i)) {
                            int i12 = 1258580786 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -129394871 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1049206057 ^ i)) {
                                int i13 = 883117756 ^ i;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -689618416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1798252266 ^ i)) {
                                    int i14 = 227604588 ^ i;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -735853485 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1081904154 ^ i)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i15 = 1826392456 ^ i;
        throw new RuntimeException();
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent inventoryCloseEvent) {
        int djfyqoaehzergjih;
        int i = 1598610789 ^ (1014868357 ^ 50775624);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 27104579) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 27104579 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (182245259 ^ i)) {
                    break;
                }
            }
            int i2 = 1408313568 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 997105158 ^ i;
        Player player = inventoryCloseEvent.getPlayer();
        if ((player instanceof Player) == (1532832942 ^ i3)) {
            djfyqoaehzergjih(i3, 438475799);
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -622238350) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -622238350 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1126359473 ^ i3)) {
                    break;
                }
            }
            int i4 = 1869791345 ^ i3;
            throw new IOException("double");
        }
        int i5 = 1497391542 ^ i3;
        Player player2 = player;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 283797696) {
            i5 = 1264677284 ^ i5;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1273095650) {
                int i6 = 1427372652 ^ i5;
                try {
                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6) == 119049564) {
                        throw new IOException();
                    }
                    throw null;
                } catch (IOException e) {
                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                        case -1388035560:
                            djfyqoaehzergjih = djfyqoaehzergjih(i6, 1230410755);
                            break;
                        case -478267776:
                            djfyqoaehzergjih = 1083300496 ^ i6;
                            break;
                        default:
                            throw new IOException("Error in hash");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih) == -403643902) {
                        int djfyqoaehzergjih2 = djfyqoaehzergjih(djfyqoaehzergjih, 1037912050);
                        InventoryHolder holder = inventoryCloseEvent.getInventory().getHolder();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih2) == 152755603) {
                            i5 = 2110824750 ^ djfyqoaehzergjih2;
                            if ((holder instanceof BillfordPresetEditorGui) == (485751452 ^ i5)) {
                                djfyqoaehzergjih(i5, 341837957);
                                return;
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -408955680) {
                                i5 = 871805055 ^ i5;
                                this.editorGuis.remove(player2.getUniqueId());
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2016040729) {
                                    int i7 = 664189178 ^ i5;
                                    return;
                                }
                            }
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih2) == 152755603 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih2) == (1818413808 ^ djfyqoaehzergjih2)) {
                                    int i8 = 1756133329 ^ djfyqoaehzergjih2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih2) == -1388035560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih2) == (798000501 ^ djfyqoaehzergjih2)) {
                                        int i9 = 1269009062 ^ djfyqoaehzergjih2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih2) == 201164234 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih2) == (1176647919 ^ djfyqoaehzergjih2)) {
                                            int i10 = 845402262 ^ djfyqoaehzergjih2;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih2) == -478267776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih2) == (1666624192 ^ djfyqoaehzergjih2)) {
                                                int i11 = 583418454 ^ djfyqoaehzergjih2;
                                                throw new RuntimeException();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih) == -403643902 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih) == (1071444523 ^ djfyqoaehzergjih)) {
                                int i12 = 1454610014 ^ djfyqoaehzergjih;
                                throw new IOException("double");
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2016040729 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1186561237 ^ i5)) {
                int i13 = 1260155987 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 283797696 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1545718402 ^ i5)) {
                    int i14 = 124124457 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -408955680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (255341362 ^ i5)) {
                        int i15 = 1987044817 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1273095650 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1089661105 ^ i5)) {
                            int i16 = 501499584 ^ i5;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        int i = 274073969 ^ (1937578173 ^ 50775624);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 24034339) {
            i = 1656325137 ^ i;
            this.editorGuis.remove(playerQuitEvent.getPlayer().getUniqueId());
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 346201256) {
                int i2 = 1332648781 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 24034339 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1943088052 ^ i)) {
                int i3 = 2082059334 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1876313794 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2111648072 ^ i)) {
                    int i4 = 300780772 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 346201256 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1209093954 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 1535737803 ^ i;
        throw new IllegalAccessException();
    }

    public void reload(int i) {
        int i2 = 176148283 ^ (828058190 ^ 50775624);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1055843863) {
            i2 = 2107255781 ^ i2;
            initializeMainGui(1543236559);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 767575746) {
                int i3 = 880443696 ^ i2;
                this.editorGuis.clear();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1911271613) {
                    int i4 = 1635696444 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1911271613 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (420463294 ^ i3)) {
                        break;
                    }
                }
                int i5 = 1939020307 ^ i3;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 767575746 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (476818209 ^ i2)) {
                int i6 = 1061997227 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1055843863 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1054186541 ^ i2)) {
                    int i7 = 1572600200 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2048805216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2053963011 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 205609007 ^ i2;
        throw new IllegalAccessException();
    }

    public void closeAllGuis(int i) {
        int i2 = 660164207 ^ (613650641 ^ 50775624);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 107005872) {
            int i3 = 810678117 ^ i2;
            this.plugin.getApi(2142241109).getServer().getOnlinePlayers().forEach(player -> {
                int djfyqoaehzergjih;
                int i4 = 840421348 ^ (586205609 ^ 736097849);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -641236063) {
                    i4 = 1732695884 ^ i4;
                    InventoryHolder holder = player.getOpenInventory().getTopInventory().getHolder();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -470730302) {
                        i4 = 1769171086 ^ i4;
                        if ((holder instanceof BillfordGui) != (890064822 ^ i4)) {
                            djfyqoaehzergjih = djfyqoaehzergjih(i4, 422996397);
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1469416015) {
                            i4 = 534234937 ^ i4;
                            if ((holder instanceof BillfordPresetEditorGui) != (718964879 ^ i4)) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1456751737) {
                                    djfyqoaehzergjih = 115453588 ^ i4;
                                }
                            }
                            while (true) {
                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                    case 50807375:
                                        int i5 = 891058825 ^ i4;
                                        return;
                                    case 1293683620:
                                        return;
                                    case 1380577568:
                                }
                            }
                        }
                        player.closeInventory();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih) == 1641623769) {
                            int i6 = 872272925 ^ djfyqoaehzergjih;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih) == 1641623769 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(djfyqoaehzergjih) == (1752730551 ^ djfyqoaehzergjih)) {
                                break;
                            }
                        }
                        int i7 = 1045999092 ^ djfyqoaehzergjih;
                        throw new RuntimeException("double");
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -470730302 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1985851231 ^ i4)) {
                            int i8 = 1493648305 ^ i4;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1469416015 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1212145529 ^ i4)) {
                        int i9 = 1824952297 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1456751737 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1179234272 ^ i4)) {
                            int i10 = 1207288212 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -641236063 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2147456728 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
                int i11 = 466268721 ^ i4;
                throw new RuntimeException();
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -2064679783) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2064679783 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (187843677 ^ i3)) {
                        break;
                    }
                }
                int i4 = 422142212 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 1661037939 ^ i3;
            this.editorGuis.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1662773502) {
                int i5 = 1294329159 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 107005872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1704674865 ^ i2)) {
                int i6 = 482883178 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1662773502 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (461963681 ^ i2)) {
                    int i7 = 1405097989 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -171229896 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2137952141 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1848496043 ^ i2;
        throw new IOException();
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
        sfkdcvdakv = ByteBuffer.wrap(twykejsnqedjgrk()).asCharBuffer().toString();
        gl6YRoCl1D = (-1779844990) ^ new Random(-7253490655254042756L).nextInt();
    }

    public static String qdafoqfhmt(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = sfkdcvdakv.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] bznxhbgzsbapwja() {
        return new byte[]{0, 0, 0, 30, 0, 0, 0, 0};
    }

    private static byte[] qibihlnpqwtegea() {
        return new byte[]{0, 0, 0, 26, 0, 0, 0, 30};
    }

    private static byte[] twykejsnqedjgrk() {
        return new byte[]{49, -109, 53, 85, 55, 122, 51, 93, 48, 22, 49, 85, 53, 85, 55, 64, 51, 91, 48, 64, 49, 81, 53, 22, 55, 68, 51, 64, 48, 83, 49, 71, 53, 83, 55, 64, 51, 18, 48, 85, 49, 91, 53, 88, 55, 82, 51, 91, 48, 81, 49, 65, 53, 68, 55, 81, 51, 86, 48, 23, 49, -109, 55, 86, 54, Byte.MAX_VALUE, 56, 89, 57, 90, 49, 88, 55, 80, 54, 93, 56, 24, 57, 71, 49, 91, 55, 21, 54, 90, 56, 74, 57, 86, 49, 85, 55, 65, 54, 92, 56, 24, 57, 67, 49, 70, 55, 80, 54, 74, 56, 93, 57, 71, 49, 21};
    }

    private static int djfyqoaehzergjih(int i, int i2) {
        return i2 ^ i;
    }
}
