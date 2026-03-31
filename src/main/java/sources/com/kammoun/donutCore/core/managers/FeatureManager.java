package com.kammoun.donutCore.core.managers;

import com.kammoun.donutCore.core.CorePlugin;
import com.kammoun.donutCore.core.commands.Admin.Reload;
import com.kammoun.donutCore.core.commands.DiscordCommand;
import com.kammoun.donutCore.core.commands.HelpCommand;
import com.kammoun.donutCore.core.commands.NightVisionCommand;
import com.kammoun.donutCore.core.commands.RulesCommand;
import com.kammoun.donutCore.core.commands.StoreCommand;
import com.kammoun.donutCore.core.gui.impl.AfkGui;
import com.kammoun.donutCore.core.gui.impl.HelpGui;
import com.kammoun.donutCore.core.gui.impl.MediaGui;
import com.kammoun.donutCore.core.gui.impl.RulesGui;
import com.kammoun.donutCore.core.gui.impl.SpawnGui;
import com.kammoun.donutCore.core.message.MessageManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.command.CommandMap;
import org.jetbrains.annotations.NotNull;

public class FeatureManager {

    @NotNull
    private final CorePlugin plugin;
    private final CommandMap commandMap;
    private SpawnGui spawnGui;
    private AfkGui afkGui;
    private HelpGui helpGui;
    private RulesGui rulesGui;
    private MediaGui mediaGui;
    private MessageManager messageManager;
    private static int qHJDqenSJo = 0;
    private transient int dxXWPve0nX = 1412064147;
    private static String hnpjgcumdl;
    private static String[] nothing_to_see_here = new String[18];

    public FeatureManager(@NotNull CorePlugin corePlugin, int i) {
        int i2 = 611759213 ^ (677042125 ^ 1614373332);
        int parseInt = 1730496415 ^ (568730806 ^ Integer.parseInt("718692701"));
        this.dxXWPve0nX = 1412064147 ^ qHJDqenSJo;
        this.plugin = corePlugin;
        this.commandMap = corePlugin.getCommandMap(917005172);
        int i3 = 590545832 ^ (2083158561 ^ (1092472864 ^ (2120949544 ^ parseInt)));
    }

    public void loadAllFeatures(int i) {
        int i2 = 239139321 ^ (523358094 ^ 1827122101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -323686893) {
            int i3 = 1018685989 ^ i2;
            loadSpawnFeature(1833274172);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 151764794) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 151764794 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2039071047 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1513978515 ^ i3;
                throw new IllegalAccessException("double");
            }
            int i5 = 1413481664 ^ i3;
            loadAfkFeature(151653867);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1425303240) {
                i5 = 1360242575 ^ i5;
                loadHelpFeature(770177417);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 597075266) {
                    i5 = 780466274 ^ i5;
                    loadMediaFeature(927468595);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1471243859) {
                        i5 = 1732763870 ^ i5;
                        loadRulesFeature(1072480121);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1838047392) {
                            int i6 = 616765136 ^ i5;
                            loadChatFeature(1833333155);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1268176417) {
                                i6 = 1941351661 ^ i6;
                                loadNightVisionFeature(1578147350);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -702303926) {
                                    int i7 = 1228074561 ^ i6;
                                    loadDiscordFeature(785304243);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -1615543488) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1615543488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (31051768 ^ i7)) {
                                                break;
                                            }
                                        }
                                        int i8 = 1183418998 ^ i7;
                                        throw new IOException("double");
                                    }
                                    int i9 = 1168371272 ^ i7;
                                    loadStoreFeature(858371903);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -1297370878) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1297370878 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (80651916 ^ i9)) {
                                                break;
                                            }
                                        }
                                        int i10 = 1714443014 ^ i9;
                                        throw new IllegalAccessException("double");
                                    }
                                    i2 = 2040144990 ^ i9;
                                    this.commandMap.getKnownCommands().remove(nuocidfkmd(ipzxzyyqzfhplwl(), i2));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2121962481) {
                                        i5 = 1650806012 ^ i2;
                                        this.commandMap.register(nuocidfkmd(iwugdmjcjwdspbe(), i5), new Reload(this.plugin, nuocidfkmd(mbbzjcdarjndrxl(), i5), 1810017282));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1834021906) {
                                            int i11 = 1854517967 ^ i5;
                                            return;
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1268176417 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1310104767 ^ i6)) {
                                    int i12 = 1902228216 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -702303926 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (860535502 ^ i6)) {
                                        break;
                                    }
                                }
                            }
                            int i13 = 405751586 ^ i6;
                            throw new RuntimeException("double");
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1471243859 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1097022832 ^ i5)) {
                    int i14 = 1434484287 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 597075266 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (955910067 ^ i5)) {
                        int i15 = 466201654 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1838047392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (104499332 ^ i5)) {
                            int i16 = 857907330 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1425303240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (718784620 ^ i5)) {
                                int i17 = 818652902 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1834021906 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (777405860 ^ i5)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            int i18 = 2070561196 ^ i5;
            throw new IOException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -323686893 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (985931848 ^ i2)) {
                int i19 = 989216783 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 421356137 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1637314853 ^ i2)) {
                    int i20 = 1466689116 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2121962481 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1752296644 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i21 = 62891461 ^ i2;
        throw new RuntimeException("double");
    }

    public void loadSpawnFeature(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.managers.FeatureManager.loadSpawnFeature(int):void");
    }

    public void loadAfkFeature(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.managers.FeatureManager.loadAfkFeature(int):void");
    }

    public void loadHelpFeature(int i) {
        int i2 = 1124399611 ^ (1989881242 ^ 1827122101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -876347742) {
            int i3 = 653413061 ^ i2;
            if (this.plugin.getConfig(127597628).getBoolean(nuocidfkmd(begvdrvjupntpcy(), i3)) == (2139763985 ^ i3)) {
                int i4 = 1624519887 ^ i3;
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -61757301) {
                i3 = 1668877295 ^ i3;
                this.helpGui = new HelpGui(this.plugin, 1190388738);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -409339920) {
                    int i5 = 1688331496 ^ i3;
                    this.plugin.getItemLoader(237901470).loadHelpItems(1217389812);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1030303565) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1030303565 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1867193903 ^ i5)) {
                                int i6 = 2043133548 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -84930832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (390341394 ^ i5)) {
                                    break;
                                }
                            }
                        }
                        int i7 = 979478234 ^ i5;
                        throw new IOException("double");
                    }
                    i3 = 1320529548 ^ i5;
                    this.commandMap.getKnownCommands().remove(nuocidfkmd(mrxncrigxgmlnir(), i3));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1220827951) {
                        i2 = 29768192 ^ i3;
                        this.commandMap.getKnownCommands().remove(nuocidfkmd(fumfmeailqyqhxn(), i2));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1190497071) {
                            i3 = 780930783 ^ i2;
                            this.commandMap.getKnownCommands().remove(nuocidfkmd(cutjvliydrmysny(), i3));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -848690648) {
                                i2 = 226820529 ^ i3;
                                this.commandMap.register(nuocidfkmd(cculzbgcxonasqg(), i2), new HelpCommand(this.plugin, nuocidfkmd(kagtuwtpvmdcmuc(), i2), 1810017282));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1589506144) {
                                    i2 = 1183860615 ^ i2;
                                    this.commandMap.register(nuocidfkmd(ktgwwuqkhbkaacg(), i2), new HelpCommand(this.plugin, nuocidfkmd(dcadfjmrbncfcia(), i2), 1810017282));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1782565990) {
                                        int i8 = 1306920877 ^ i2;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -409339920 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (202945824 ^ i3)) {
                    int i9 = 2114430968 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1220827951 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1762352690 ^ i3)) {
                        int i10 = 1437239017 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -61757301 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1215303292 ^ i3)) {
                            int i11 = 1522475777 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -848690648 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (168326818 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i12 = 782169215 ^ i3;
            throw new IOException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1190497071 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (168486712 ^ i2)) {
                int i13 = 1800052169 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -876347742 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1542413125 ^ i2)) {
                    int i14 = 1040228094 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1589506144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1784020131 ^ i2)) {
                        int i15 = 183784414 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1782565990 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1815137622 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i16 = 2059828532 ^ i2;
        throw new IOException("double");
    }

    public void loadRulesFeature(int i) {
        int i2 = 1216620385 ^ (2079150847 ^ 1827122101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -59313830) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -59313830 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1226099241 ^ i2)) {
                    break;
                }
            }
            int i3 = 1347086480 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 2064983769 ^ i2;
        if (this.plugin.getConfig(127597628).getBoolean(nuocidfkmd(rbastnrhkwxbytx(), i4)) == (614201586 ^ i4)) {
            wchhdjxxtsklsbjp(i4, 301792956);
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 618645393) {
            int i5 = 1540714431 ^ i4;
            this.rulesGui = new RulesGui(this.plugin, 1156391002);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -93013397) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -93013397 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (129605428 ^ i5)) {
                        break;
                    }
                }
                int i6 = 1338652911 ^ i5;
                throw new RuntimeException("double");
            }
            i4 = 377075803 ^ i5;
            this.plugin.getItemLoader(237901470).loadRulesItems(453865824);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1236891827) {
                i4 = 91594243 ^ i4;
                this.commandMap.getKnownCommands().remove(nuocidfkmd(sqxngfmzgavdjia(), i4));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1645578411) {
                    i4 = 1780139216 ^ i4;
                    this.commandMap.register(nuocidfkmd(pmfutcccbylhaea(), i4), new RulesCommand(this.plugin, nuocidfkmd(udbzgzgcazrkqra(), i4), 1810017282));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 851684904) {
                        int i7 = 859796363 ^ i4;
                        return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1236891827 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (902633165 ^ i4)) {
                int i8 = 1375007174 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1645578411 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1487658187 ^ i4)) {
                    int i9 = 1033978682 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1422380431 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (935037683 ^ i4)) {
                        int i10 = 22840911 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 618645393 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1174664374 ^ i4)) {
                            int i11 = 1190755340 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 851684904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1202048155 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i12 = 712761335 ^ i4;
        throw new IOException();
    }

    public void loadMediaFeature(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.managers.FeatureManager.loadMediaFeature(int):void");
    }

    public void loadChatFeature(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.managers.FeatureManager.loadChatFeature(int):void");
    }

    public void loadDiscordFeature(int i) {
        int i2 = 1148507197 ^ (1027695404 ^ 1827122101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1366235872) {
            i2 = 1979122391 ^ i2;
            if (this.plugin.getConfig(127597628).getBoolean(nuocidfkmd(hjpgyjradzdrvfk(), i2)) != (1613045363 ^ i2)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 19461019) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 19461019 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2091359503 ^ i2)) {
                            break;
                        }
                    }
                    int i3 = 1532134581 ^ i2;
                    throw new RuntimeException("double");
                }
                i2 = 443749407 ^ i2;
                this.commandMap.getKnownCommands().remove(nuocidfkmd(xvqijasdkdzyass(), i2));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -760196253) {
                    int i4 = 1394014858 ^ i2;
                    this.commandMap.register(nuocidfkmd(hpsfxlqjzcnjluj(), i4), new DiscordCommand(this.plugin, nuocidfkmd(iihvotlvbyhzavy(), i4), 1810017282));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1242007345) {
                        int i5 = 1271384904 ^ i4;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1242007345 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1442829075 ^ i4)) {
                            break;
                        }
                    }
                    int i6 = 654649488 ^ i4;
                    throw new RuntimeException("double");
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 172460763:
                        int i7 = 44180957 ^ i2;
                        return;
                    case 485649390:
                        return;
                    case 1299926041:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1366235872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (709533077 ^ i2)) {
                int i8 = 1391492063 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -760196253 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1175444080 ^ i2)) {
                    int i9 = 1032187999 ^ i2;
                    throw new IOException();
                }
            }
        }
    }

    public void loadStoreFeature(int i) {
        int i2 = 724129972 ^ (285560424 ^ 1827122101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1235358902) {
            i2 = 2023149024 ^ i2;
            if (this.plugin.getConfig(127597628).getBoolean(nuocidfkmd(dettairhxpkhqov(), i2)) != (777875593 ^ i2)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1928037449) {
                    int i3 = 133446741 ^ i2;
                    this.commandMap.getKnownCommands().remove(nuocidfkmd(rffrnrfpytnzxjc(), i3));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1296721633) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1296721633 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1075529688 ^ i3)) {
                                break;
                            }
                        }
                        int i4 = 2122554122 ^ i3;
                        throw new IOException("double");
                    }
                    int i5 = 232722544 ^ i3;
                    this.commandMap.register(nuocidfkmd(ggeczbqbtiljnwd(), i5), new StoreCommand(this.plugin, nuocidfkmd(rvwcamxblunnuij(), i5), 1810017282));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 598926689) {
                        int i6 = 821465622 ^ i5;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 598926689 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2037168245 ^ i5)) {
                            int i7 = 557216569 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1543080496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (93689061 ^ i5)) {
                                break;
                            }
                        }
                    }
                    int i8 = 1847545199 ^ i5;
                    throw new IllegalAccessException("double");
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 164963412:
                        int i9 = 987610675 ^ i2;
                        return;
                    case 1625649132:
                        return;
                    case 1657474276:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1928037449 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (777744184 ^ i2)) {
                int i10 = 536784002 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1235358902 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (570749913 ^ i2)) {
                    int i11 = 849304815 ^ i2;
                    throw new IllegalAccessException();
                }
            }
        }
    }

    public void loadNightVisionFeature(int i) {
        int i2 = 1583621759 ^ (1006426718 ^ 1827122101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1274723488) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1274723488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (548540399 ^ i2)) {
                    int i3 = 751155956 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 800364633 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1461707376 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 2031614418 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i5 = 1702730056 ^ i2;
        if (this.plugin.getConfig(127597628).getBoolean(nuocidfkmd(cjoceuypbneeigc(), i5)) == (1812123356 ^ i5)) {
            int i6 = 1240751575 ^ i5;
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1612084963) {
            int i7 = 366107249 ^ i5;
            this.commandMap.getKnownCommands().remove(nuocidfkmd(izatbwhtljdpxol(), i7));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -830167701) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -830167701 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1716176709 ^ i7)) {
                        break;
                    }
                }
                int i8 = 1072528391 ^ i7;
                throw new RuntimeException("double");
            }
            i5 = 1367960864 ^ i7;
            this.commandMap.getKnownCommands().remove(nuocidfkmd(towymjolgujgifo(), i5));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1120914537) {
                i5 = 214303983 ^ i5;
                this.commandMap.register(nuocidfkmd(mzinivdhxxtiwxc(), i5), new NightVisionCommand(this.plugin, nuocidfkmd(axnlcbkkkrymivm(), i5), 1810017282));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 620751633) {
                    int i9 = 359035073 ^ i5;
                    this.commandMap.register(nuocidfkmd(izatssselvkrsaa(), i9), new NightVisionCommand(this.plugin, nuocidfkmd(pilhliivjvpqdhi(), i9), 1810017282));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1882428135) {
                        int i10 = 336535208 ^ i9;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1882428135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (813690321 ^ i9)) {
                            break;
                        }
                    }
                    int i11 = 1811236239 ^ i9;
                    throw new IllegalAccessException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 620751633 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1923222860 ^ i5)) {
                int i12 = 2134761387 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1612084963 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1708670825 ^ i5)) {
                    int i13 = 429906999 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1120914537 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (284578584 ^ i5)) {
                        break;
                    }
                }
            }
        }
        int i14 = 667239079 ^ i5;
        throw new RuntimeException();
    }

    @Generated
    @NotNull
    public CorePlugin getPlugin() {
        int i = 125806191 ^ (1647338814 ^ 1827122101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1296254752) {
            int i2 = 361190244 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1296254752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (190489445 ^ i)) {
                int i3 = 598219941 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -512107520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1952158033 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2055505383 ^ i;
        throw new IOException();
    }

    @Generated
    public CommandMap getCommandMap() {
        int i = 337276402 ^ (953386186 ^ 1827122101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 24253546) {
            int i2 = 1714912243 ^ i;
            return this.commandMap;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 24253546 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1358124820 ^ i)) {
                int i3 = 905914605 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 818531313 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (154874298 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 179353962 ^ i;
        throw new IOException();
    }

    @Generated
    public SpawnGui getSpawnGui(int i) {
        int i2 = 1463615163 ^ (1424947581 ^ 1827122101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2041406363) {
            int i3 = 2060449256 ^ i2;
            return this.spawnGui;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1345139496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1405525601 ^ i2)) {
                int i4 = 713321531 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2041406363 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (437528563 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 183165070 ^ i2;
        throw new IOException();
    }

    @Generated
    public AfkGui getAfkGui(int i) {
        int i2 = 154087062 ^ (1635808438 ^ 1827122101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 575114408) {
            int i3 = 622882072 ^ i2;
            return this.afkGui;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 189064297 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1767341318 ^ i2)) {
                int i4 = 1539659460 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 575114408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (603219441 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1449068552 ^ i2;
        throw new IOException();
    }

    @Generated
    public HelpGui getHelpGui(int i) {
        int i2 = 1091321425 ^ (2095611241 ^ 1827122101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2011216790) {
            int i3 = 21531782 ^ i2;
            return this.helpGui;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2011216790 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (463982347 ^ i2)) {
                int i4 = 486022679 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2107957158 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1261149586 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2093638133 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public RulesGui getRulesGui(int i) {
        int i2 = 1580247940 ^ (707297319 ^ 1827122101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -939786064) {
            int i3 = 117379127 ^ i2;
            return this.rulesGui;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -939786064 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1826540317 ^ i2)) {
                int i4 = 1861435191 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -268140280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1599288829 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 397082409 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public MediaGui getMediaGui(int i) {
        int i2 = 995601017 ^ (1777660756 ^ 1827122101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -232287039) {
            int i3 = 816469554 ^ i2;
            return this.mediaGui;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2004165968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2074462802 ^ i2)) {
                int i4 = 1814204114 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -232287039 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (493307502 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1844086632 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public MessageManager getMessageManager(int i) {
        int i2 = 1719500359 ^ (1284540978 ^ 1827122101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 810745346) {
            int i3 = 1058850521 ^ i2;
            return this.messageManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 810745346 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1894248309 ^ i2)) {
                int i4 = 1273010281 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -927676213 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1070833750 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 45258905 ^ i2;
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
        hnpjgcumdl = ByteBuffer.wrap(nvhnmagvdstobaj()).asCharBuffer().toString();
        qHJDqenSJo = (-1171354046) ^ new Random(-7320177665599115526L).nextInt();
    }

    public static String nuocidfkmd(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = hnpjgcumdl.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] iwugdmjcjwdspbe() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 0};
    }

    private static byte[] mbbzjcdarjndrxl() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 6};
    }

    private static byte[] ipzxzyyqzfhplwl() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 12};
    }

    private static byte[] fxgwhcdfmmbcucv() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 18};
    }

    private static byte[] gbpvwikagjbeptq() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 23};
    }

    private static byte[] chtseyluqhqyfdb() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 28};
    }

    private static byte[] wzbtxdhztvkarvh() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, 36};
    }

    private static byte[] njidgmtejghikph() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 58};
    }

    private static byte[] kjbyzjothewqasr() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 63};
    }

    private static byte[] wfktwernsiqbixe() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 71};
    }

    private static byte[] kugwfubeywykjtq() {
        return new byte[]{0, 0, 0, 3, 0, 0, 0, 79};
    }

    private static byte[] shaovftqdyigogh() {
        return new byte[]{0, 0, 0, 3, 0, 0, 0, 82};
    }

    private static byte[] yhmpefmtcwwiweb() {
        return new byte[]{0, 0, 0, 3, 0, 0, 0, 85};
    }

    private static byte[] gusuzzbdcxkysze() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 88};
    }

    private static byte[] ojymnylixlabxmy() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 94};
    }

    private static byte[] vaprnljpemtgejp() {
        return new byte[]{0, 0, 0, 20, 0, 0, 0, 100};
    }

    private static byte[] qitpaihdcvqexfu() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 120};
    }

    private static byte[] cutjvliydrmysny() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 126};
    }

    private static byte[] begvdrvjupntpcy() {
        return new byte[]{0, 0, 0, 21, 0, 0, 0, -125};
    }

    private static byte[] ktgwwuqkhbkaacg() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, -104};
    }

    private static byte[] dcadfjmrbncfcia() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, -99};
    }

    private static byte[] mrxncrigxgmlnir() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, -94};
    }

    private static byte[] cculzbgcxonasqg() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, -90};
    }

    private static byte[] kagtuwtpvmdcmuc() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, -86};
    }

    private static byte[] fumfmeailqyqhxn() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, -82};
    }

    private static byte[] pmfutcccbylhaea() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, -68};
    }

    private static byte[] udbzgzgcazrkqra() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, -63};
    }

    private static byte[] rbastnrhkwxbytx() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, -58};
    }

    private static byte[] sqxngfmzgavdjia() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, -36};
    }

    private static byte[] fhfdjkblwmmnufd() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, -31};
    }

    private static byte[] uanmgwrguamjjpx() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, -26};
    }

    private static byte[] eabsqnbuwsnntel() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, -21};
    }

    private static byte[] ayojjuiinfkymvv() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, -16};
    }

    private static byte[] hxydzrfrotetklp() {
        return new byte[]{0, 0, 0, 3, 0, 0, 1, 6};
    }

    private static byte[] piauojaupxkptbu() {
        return new byte[]{0, 0, 0, 9, 0, 0, 1, 9};
    }

    private static byte[] cojsfvdmipeckml() {
        return new byte[]{0, 0, 0, 11, 0, 0, 1, 18};
    }

    private static byte[] sqhgjtjlnnmxsfj() {
        return new byte[]{0, 0, 0, 5, 0, 0, 1, 29};
    }

    private static byte[] smndkodielxseqf() {
        return new byte[]{0, 0, 0, 5, 0, 0, 1, 34};
    }

    private static byte[] ulqlkiyjqxhzveo() {
        return new byte[]{0, 0, 0, 21, 0, 0, 1, 39};
    }

    private static byte[] xnbpcyrpofrbxgo() {
        return new byte[]{0, 0, 0, 4, 0, 0, 1, 60};
    }

    private static byte[] fijxgfxeuxalhck() {
        return new byte[]{0, 0, 0, 5, 0, 0, 1, 64};
    }

    private static byte[] pxyikvjwypxcnhb() {
        return new byte[]{0, 0, 0, 1, 0, 0, 1, 69};
    }

    private static byte[] ruhbgcdktxlbzgx() {
        return new byte[]{0, 0, 0, 14, 0, 0, 1, 70};
    }

    private static byte[] ozvdenwlooiglxq() {
        return new byte[]{0, 0, 0, 13, 0, 0, 1, 84};
    }

    private static byte[] ryziweyfiwtvbsx() {
        return new byte[]{0, 0, 0, 3, 0, 0, 1, 97};
    }

    private static byte[] mpsrnytyecajewy() {
        return new byte[]{0, 0, 0, 9, 0, 0, 1, 100};
    }

    private static byte[] bxkmiwowwjzsvwf() {
        return new byte[]{0, 0, 0, 3, 0, 0, 1, 109};
    }

    private static byte[] xyynudwwpeextfa() {
        return new byte[]{0, 0, 0, 1, 0, 0, 1, 112};
    }

    private static byte[] xvqijasdkdzyass() {
        return new byte[]{0, 0, 0, 7, 0, 0, 1, 113};
    }

    private static byte[] hpsfxlqjzcnjluj() {
        return new byte[]{0, 0, 0, 7, 0, 0, 1, 120};
    }

    private static byte[] iihvotlvbyhzavy() {
        return new byte[]{0, 0, 0, 7, 0, 0, 1, Byte.MAX_VALUE};
    }

    private static byte[] hjpgyjradzdrvfk() {
        return new byte[]{0, 0, 0, 24, 0, 0, 1, -122};
    }

    private static byte[] dettairhxpkhqov() {
        return new byte[]{0, 0, 0, 22, 0, 0, 1, -98};
    }

    private static byte[] rffrnrfpytnzxjc() {
        return new byte[]{0, 0, 0, 5, 0, 0, 1, -76};
    }

    private static byte[] ggeczbqbtiljnwd() {
        return new byte[]{0, 0, 0, 5, 0, 0, 1, -71};
    }

    private static byte[] rvwcamxblunnuij() {
        return new byte[]{0, 0, 0, 5, 0, 0, 1, -66};
    }

    private static byte[] towymjolgujgifo() {
        return new byte[]{0, 0, 0, 2, 0, 0, 1, -61};
    }

    private static byte[] cjoceuypbneeigc() {
        return new byte[]{0, 0, 0, 28, 0, 0, 1, -59};
    }

    private static byte[] mzinivdhxxtiwxc() {
        return new byte[]{0, 0, 0, 11, 0, 0, 1, -31};
    }

    private static byte[] axnlcbkkkrymivm() {
        return new byte[]{0, 0, 0, 11, 0, 0, 1, -20};
    }

    private static byte[] izatbwhtljdpxol() {
        return new byte[]{0, 0, 0, 11, 0, 0, 1, -9};
    }

    private static byte[] izatssselvkrsaa() {
        return new byte[]{0, 0, 0, 2, 0, 0, 2, 2};
    }

    private static byte[] pilhliivjvpqdhi() {
        return new byte[]{0, 0, 0, 2, 0, 0, 2, 4};
    }

    private static byte[] nvhnmagvdstobaj() {
        return new byte[]{49, 65, 48, 87, 57, 85, 52, 90, 54, 83, 49, 87, 49, 65, 48, 87, 57, 85, 52, 90, 54, 83, 49, 87, 56, 66, 50, 84, 49, 90, 50, 93, 50, 89, 48, 86, 49, 69, 52, 66, 49, 87, 52, 69, 49, 95, 49, 69, 52, 66, 49, 87, 52, 69, 49, 95, 52, 67, 48, 83, 53, 69, 50, 70, 49, 68, 48, 81, 54, 66, 49, 92, 55, 86, 51, 84, 53, 85, 49, 77, 53, 66, 48, 65, 49, 80, 52, 66, 57, 27, 55, 67, 51, 65, 53, 85, 49, 78, 53, 89, 48, 29, 49, 80, 52, 95, 57, 84, 55, 82, 51, 93, 53, 81, 49, 93, 55, 64, 57, 70, 51, 89, 48, 68, 52, 89, 49, 69, 53, 92, 56, 77, 48, 67, 54, 71, 49, 87, 53, 78, 56, 87, 49, 69, 53, 92, 56, 77, 48, 67, 54, 71, 49, 87, 53, 78, 56, 87, 56, 84, 50, 83, 48, 89, 55, 89, 49, 80, 55, 91, 55, 89, 49, 80, 55, 91, 50, 68, 53, 86, 53, 68, 52, 84, 57, 84, 55, 94, 50, 68, 53, 86, 53, 68, 52, 84, 57, 84, 55, 94, 49, 81, 54, 81, 54, 88, 51, 66, 51, 66, 49, 69, 54, 81, 54, 74, 51, 24, 51, 86, 49, 81, 54, 95, 54, 23, 51, 83, 51, 89, 49, 86, 54, 86, 54, 85, 51, 83, 51, 83, 49, 65, 57, 82, 52, 76, 50, 84, 49, 84, 49, 89, 52, 84, 48, 66, 56, 93, 53, 92, 49, 81, 50, 87, 51, 92, 55, 87, 51, 77, 56, 64, 50, 67, 51, 92, 55, 69, 51, 23, 56, 93, 50, 84, 51, 85, 55, 70, 51, 23, 56, 80, 50, 95, 51, 88, 55, 84, 51, 85, 56, 80, 50, 85, 49, 84, 56, 66, 55, 80, 49, 93, 56, 82, 49, 84, 56, 66, 55, 80, 49, 93, 56, 82, 57, 90, 49, 84, 51, 84, 51, 67, 51, 91, 56, 84, 56, 94, 54, 68, 51, 91, 56, 84, 56, 94, 54, 68, 57, 95, 52, 80, 50, 87, 54, 92, 48, 90, 50, 70, 57, 83, 57, 80, 57, 68, 57, 8, 52, 81, 50, 92, 54, 85, 48, 73, 49, 66, 54, 65, 54, 92, 54, 84, 51, 66, 49, 66, 54, 65, 54, 92, 54, 84, 51, 66, 54, 87, 52, 87, 48, 80, 53, 76, 54, 67, 49, 70, 50, 85, 49, 70, 56, 24, 54, 67, 52, 71, 48, 93, 53, 93, 54, 69, 49, 26, 50, 85, 49, 91, 56, 87, 54, 83, 52, 94, 48, 84, 53, 92, 49, 74, 49, 67, 51, 93, 48, 85, 51, 68, 53, 88, 51, 82, 53, 84, 48, 91, 48, 84, 53, 88, 51, 82, 53, 84, 48, 91, 48, 84, 54, 95, 54, 81, 55, 86, 50, 94, 48, 87, 49, 82, 52, 81, 57, 85, 54, 69, 51, 66, 49, 70, 52, 81, 57, 71, 54, 31, 51, 90, 49, 81, 52, 80, 57, 93, 54, 80, 51, 25, 49, 81, 52, 90, 57, 85, 54, 83, 51, 91, 49, 81, 52, 80, 49, 94, 55, 69, 57, 82, 57, 93, 57, 67, 52, 84, 56, 64, 50, 86, 48, 94, 48, 83, 51, 84, 52, 87, 49, 92, 49, 81, 54, 90, 48, 81, 56, 81, 49, 67, 49, 89, 54, 82, 48, 64, 56, 8, 49, 70, 50, 67, 51, 84, 56, 64, 54, 89, 55, 75, 50, 67, 51, 84, 56, 64, 54, 89, 55, 75, 49, 87, 57, 92, 54, 84, 48, 76, 56, 65, 49, 67, 57, 92, 54, 70, 48, 22, 56, 87, 49, 89, 57, 88, 54, 65, 48, 22, 56, 81, 49, 95, 57, 88, 54, 87, 48, 84, 56, 81, 49, 85, 53, 68, 48, 86, 52, 90, 50, 90, 49, 66, 57, 92, 48, 64, 55, 93, 51, 76, 54, 69, 49, 91, 50, 94, 50, 86, 57, 83, 52, 87, 49, 68, 50, 86, 50, 94, 57, 66, 52, 14, 49, 66, 50, 82, 50, 84, 57, 90, 53, 88, 48, 92, 52, 89, 53, 84, 55, 86, 53, 66, 53, 85, 55, 83, 49, 67, 53, 15, 48, 88, 52, 68, 53, 86, 49, 91, 48, 74, 49, 80, 49, 82, 48, 86, 49, 89, 53, 70, 49, 70, 49, 85, 48, 86, 49, 69, 53, 86, 49, 91, 48, 74, 49, 80, 51, 70, 50, 84, 53, 91, 52, 70, 57, 82, 49, 89, 50, 66, 53, 86, 54, 93, 50, 88, 50, 66, 56, 80, 48, 89, 57, 64, 49, 86, 54, 93, 50, 88, 50, 66, 56, 80, 48, 89, 57, 64, 49, 86, 49, 80, 49, 86, 48, 85, 53, 71, 54, 70, 49, 68, 49, 86, 48, 71, 53, 29, 54, 87, 49, 95, 49, 64, 48, 87, 53, 92, 54, 65, 49, 82, 49, 29, 48, 81, 53, 93, 54, 82, 49, 84, 49, 95, 48, 81, 53, 87, 55, 81, 55, 93, 55, 84, 53, 77, 51, 66, 55, 69, 56, 82, 53, 70, 57, 29, 55, 68, 55, 76, 55, 90, 53, 75, 51, 82, 55, 25, 56, 82, 53, 91, 57, 82, 55, 85, 55, 84, 55, 80, 53, 93, 54, 74, 56, 77, 54, 94, 49, 67, 54, 83, 54, 66, 49, 67, 51, 89, 55, 70, 56, 83, 54, 66, 49, 67, 51, 89, 55, 70, 56, 83, 54, 89, 54, 79, 49, 94, 49, 87, 49, 83, 51, 71, 53, 67, 49, 74, 49, 87, 49, 65, 51, 29, 53, 88, 49, 81, 49, 85, 49, 90, 51, 71, 53, 64, 49, 81, 49, 65, 49, 91, 51, 92, 53, 88, 49, 22, 49, 87, 49, 92, 51, 82, 53, 84, 49, 84, 49, 87, 49, 86, 54, 95, 52, 93, 54, 83, 56, 94, 54, 66, 49, 66, 52, 95, 52, 75, 54, 95, 54, 94, 52, 90, 54, 95, 52, 93, 54, 83, 56, 94, 54, 66, 49, 66, 52, 95, 52, 75, 
        54, 95, 54, 94, 52, 90, 50, 94, 52, 90, 55, 86, 50, 94, 56, 65, 50, 70, 52, 90, 55, 66, 50, 95, 56, 90, 50, 94, 56, 93, 56, 66, 56, 93, 56, 66};
    }

    private static int wchhdjxxtsklsbjp(int i, int i2) {
        return i2 ^ i;
    }
}
