package com.kammoun.donutCore.billford.task;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.billford.BillFordPlugin;
import com.kammoun.donutCore.billford.config.BillfordConfig;
import com.kammoun.donutCore.billford.manager.BillfordManager;
import com.kammoun.donutCore.billford.models.enums.Messages;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;

public class PresetChangeTask {
    private final BillFordPlugin plugin;
    private final BillfordManager billfordManager;
    private final BillfordConfig config;
    private final Random random;
    private SchedulerUtil.Task task;
    private boolean running;
    private static int tUiKX34g9G = 0;
    private transient int n4tRnGFlmH = 792849168;
    private static String[] nothing_to_see_here = new String[13];

    public PresetChangeTask(BillFordPlugin billFordPlugin, BillfordManager billfordManager, BillfordConfig billfordConfig, int i) {
        tnjxsezjlyepxevp(1737455807 ^ 1798815844, 1322445192);
        int parseInt = 287826618 ^ (999648628 ^ Integer.parseInt("1759043229"));
        this.n4tRnGFlmH = 792849168 ^ tUiKX34g9G;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 11386874:
                    parseInt = 14810039 ^ parseInt;
                    break;
                case 286917605:
                default:
                    throw new IOException();
                case 1335391116:
                case 1858621525:
                    break;
            }
        }
        this.plugin = billFordPlugin;
        this.billfordManager = billfordManager;
        this.config = billfordConfig;
        this.random = new Random();
        this.running = false;
        int i2 = 1059818591 ^ (968062014 ^ (1058971517 ^ (746477667 ^ (362816992 ^ (658830602 ^ parseInt)))));
    }

    public void start(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.task.PresetChangeTask.start(int):void");
    }

    public void stop(int i) {
        int i2 = 475170808 ^ (869887464 ^ 586375507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1808030232) {
            i2 = 1374732123 ^ i2;
            if (this.running == (1552430104 ^ i2)) {
                int i3 = 1170481580 ^ i2;
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -465461054) {
                i2 = 820546080 ^ i2;
                if (this.task == null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1661333955) {
                        int i4 = 1965861772 ^ i2;
                        return;
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                        case 33234156:
                            i2 = 2128092778 ^ i2;
                            break;
                        case 958253698:
                            break;
                        case 963736672:
                    }
                }
                this.task.cancel(1520188267);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1782250864) {
                    i2 = 411952275 ^ i2;
                    this.running = (byte) (171263169 ^ i2);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1370105352) {
                        int i5 = 1324981984 ^ i2;
                        return;
                    }
                } else {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1782250864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1541856956 ^ i2)) {
                            int i6 = 1970174850 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -899633760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1493945115 ^ i2)) {
                                int i7 = 457227033 ^ i2;
                                throw new IOException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1661333955 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1587691490 ^ i2)) {
                    int i8 = 1460990567 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 644272394 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1503571258 ^ i2)) {
                        int i9 = 727703461 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -465461054 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1653570159 ^ i2)) {
                            int i10 = 809959906 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1370105352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1764428995 ^ i2)) {
                                int i11 = 1164249043 ^ i2;
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1808030232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1956027649 ^ i2)) {
                int i12 = 1292241058 ^ i2;
                throw new IllegalAccessException("double");
            }
        }
    }

    private void checkAndChangePreset(int i) {
        int i2 = 121641206 ^ (2026247245 ^ 586375507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -341086398) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -341086398 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (233732708 ^ i2)) {
                    break;
                }
            }
            int i3 = 1890506871 ^ i2;
            throw new IOException("double");
        }
        int i4 = 728387536 ^ i2;
        long timeUntilNextChange = this.billfordManager.getTimeUntilNextChange(583374505);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1325854269) {
            i4 = 1925691848 ^ i4;
            if ((timeUntilNextChange > 0L ? 1 : (timeUntilNextChange == 0L ? 0 : -1)) <= (81304560 ^ i4)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 650436480) {
                    int i5 = 2033101081 ^ i4;
                    changeToRandomPreset(388202624);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -273574069) {
                        int i6 = 92770671 ^ i5;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -273574069 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1232400529 ^ i5)) {
                            break;
                        }
                    }
                    int i7 = 1737172312 ^ i5;
                    throw new IllegalAccessException("double");
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                    case 76224233:
                        int i8 = 2091464822 ^ i4;
                        return;
                    case 132066489:
                        return;
                    case 889852586:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 650436480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1378070921 ^ i4)) {
                int i9 = 1836424213 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1325854269 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (794954508 ^ i4)) {
                    int i10 = 746687689 ^ i4;
                    throw new IllegalAccessException();
                }
            }
        }
    }

    private void changeToRandomPreset(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.task.PresetChangeTask.changeToRandomPreset(int):void");
    }

    private void broadcastPresetChange(String str, int i) {
        int i2 = 174848249 ^ (1331342724 ^ 586375507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1041342835) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1041342835 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1160881077 ^ i2)) {
                    break;
                }
            }
            int i3 = 1754626302 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 556266944 ^ i2;
        String message = this.config.getMessage(Messages.PRESET_CHANGE, 1006245600);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 925765490) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 925765490 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1827771294 ^ i4)) {
                    break;
                }
            }
            int i5 = 1533048438 ^ i4;
            throw new IllegalAccessException("double");
        }
        int i6 = 232639698 ^ i4;
        if (message.isEmpty() == (1261964604 ^ i6)) {
            i6 = tnjxsezjlyepxevp(i6, 497862108);
            String replace = message.replace(lwhkpieysr(cmqmyhuklfolmbo(), ugxxhjeyzcapgry(), i6), str);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1264171262) {
                int i7 = 927639355 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 250838747) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 250838747 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1952591277 ^ i7)) {
                            break;
                        }
                    }
                    int i8 = 1896124586 ^ i7;
                    throw new IOException("double");
                }
                int i9 = 1727085258 ^ i7;
                this.plugin.getApi(2142241109).getServer().getOnlinePlayers().forEach(player -> {
                    int i10 = 862874458 ^ (959342412 ^ 229804611);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != 1066676904) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 597148139 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1510593854 ^ i10)) {
                                int i11 = 1013084483 ^ i10;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1066676904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (788251294 ^ i10)) {
                                    break;
                                }
                            }
                        }
                        int i12 = 1562059230 ^ i10;
                        throw new IOException();
                    }
                    int i13 = 2127808086 ^ i10;
                    player.sendMessage(ChatFormater.color(replace));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -922091493) {
                        int i14 = 492025918 ^ i13;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -922091493 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1509479480 ^ i13)) {
                            break;
                        }
                    }
                    int i15 = 659210406 ^ i13;
                    throw new IOException("double");
                });
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 964339848) {
                    int i10 = 926652678 ^ i9;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 964339848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1188576387 ^ i9)) {
                        break;
                    }
                }
                int i11 = 439346092 ^ i9;
                throw new IOException("double");
            }
        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1505782242) {
            int i12 = 160785827 ^ i6;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 359351546 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (400036917 ^ i6)) {
                int i13 = 995987213 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1264171262 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1842386781 ^ i6)) {
                    int i14 = 1715681268 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1505782242 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2053496794 ^ i6)) {
                        break;
                    }
                }
            }
        }
        int i15 = 2092109502 ^ i6;
        throw new RuntimeException();
    }

    public void forceChange() {
        int i = 516352855 ^ (46816132 ^ 586375507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -134312959) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 289357507 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2095774450 ^ i)) {
                    int i2 = 988086956 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -134312959 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1340600173 ^ i)) {
                        break;
                    }
                }
            }
            int i3 = 746762407 ^ i;
            throw new RuntimeException();
        }
        int i4 = 1790899162 ^ i;
        changeToRandomPreset(388202624);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1576463662) {
            int i5 = 912704898 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1576463662 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (52239911 ^ i4)) {
                break;
            }
        }
        int i6 = 1219976747 ^ i4;
        throw new RuntimeException("double");
    }

    @Generated
    public BillFordPlugin getPlugin() {
        int i = 2128003907 ^ (1520817122 ^ 586375507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 872648592) {
            int i2 = 187485222 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1835396768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (702865626 ^ i)) {
                int i3 = 1734278420 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 872648592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (868794252 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2065314495 ^ i;
        throw new IOException();
    }

    @Generated
    public BillfordManager getBillfordManager() {
        int i = 841389685 ^ (1700634817 ^ 586375507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1404911813) {
            int i2 = 1797582595 ^ i;
            return this.billfordManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -177879264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2086594978 ^ i)) {
                int i3 = 576772618 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1404911813 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (471664334 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1027489398 ^ i;
        throw new IOException();
    }

    @Generated
    public BillfordConfig getConfig() {
        int i = 1997792886 ^ (456515219 ^ 586375507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1990905266) {
            int i2 = 1146962232 ^ i;
            return this.config;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1413530736 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1237075060 ^ i)) {
                int i3 = 688126130 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1990905266 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1055880835 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 634230085 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public Random getRandom() {
        int i = 1391202600 ^ (1320665953 ^ 586375507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -179988271) {
            int i2 = 1250789451 ^ i;
            return this.random;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1591092597 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (111965483 ^ i)) {
                int i3 = 1002261422 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -179988271 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2102589635 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1624666501 ^ i;
        throw new IOException();
    }

    @Generated
    public SchedulerUtil.Task getTask() {
        int i = 825842174 ^ (674846526 ^ 586375507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -543458151) {
            int i2 = 1138101430 ^ i;
            return this.task;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -543458151 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1141746471 ^ i)) {
                int i3 = 1124049794 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1054140117 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1980034819 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1725899899 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public boolean isRunning() {
        int i = 950688249 ^ (1016466979 ^ 586375507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 913945673) {
            int i2 = 1106140233 ^ i;
            return this.running;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 957044227 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1211343224 ^ i)) {
                int i3 = 1184747189 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 913945673 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (692813424 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 503411777 ^ i;
        throw new IOException();
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
        tUiKX34g9G = 618556680 ^ new Random(-1086325798889608377L).nextInt();
    }

    public static String lwhkpieysr(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] ugxxhjeyzcapgry() {
        return new byte[]{114, 114, 9, 56, 120, 120, 75, 11, 15, 108, 126, 116, 83, 124, 54, 69, 113, 35, 84, 83, 77, 95, 121, 36, 116, 83, 75, 39, 55, 93, 91, 120, 103, 49, 32, 42, 34, 12, 120, 109, 14, 42, 34, 107, 101, 92, 112, 90, 15, 119, 95, 7};
    }

    private static byte[] iwbgpvqegbbibij() {
        return new byte[]{-70, -69, 56, 65, 74, 35, 114, 30, 60, 59, 72, 51, 100, 47, 2, 21, 68, 124, 98, 4, 124, 10, 75, 124, 77, 3, 120, 49, 1, 28, 108, 56, 83, 109, 21, 106, 20, 95, 73, 46, 60, 109, 27, 126, 86, 30, 70, 4, 56, 101, 107, 77, 71, 54, 63, 103, 73, 59, 121, 92, 54, 49, 77, 98, 101, 57, 1, 24, 69, 59};
    }

    private static byte[] rcmcnfoxpnjpkbh() {
        return new byte[]{-67, -75, 61, 71, 77, 34, 123, 25, 63, 45, 70, 50, 98, 44, 3, 6, 67, 118, 101, 31, 121, 29, 76, 49, 68, 0, 123, 96, 15, 8, 106, 36, 82, 109, 18, 123, 19, 86, 76, 48, 59, 122, 18, 121, 85, 11, 72, 1, 62, 48, 106, 23, 64, 35, 56, 117, 76, 61, 126, 81, 63, 51, 78, 36, 107, 60, 7, 25, 68, 112, 102, 67, 124, 20, 77, 98, 65, 15, 123, 97, 7, 15, 99, 36, 86, 109, 21, 116, 16, 91, 73, 116};
    }

    private static byte[] ghmseeemrgqwpmf() {
        return new byte[]{-67, -71, 57, 78, 78, 33, 122, 81, 61, 53, 79, 37, 99, 40, 0, 93, 64, 100, 102, 9, 124, 75, 73, 117, 66, 30, 122, 96, 5, 7, 106, 33, 87, 96, 22, 102, 19, 86, 74, 59, 63, Byte.MAX_VALUE, 18, 55, 83, 8, 65, 16, 61, 98, 110, 64, 66, 53, 63, 105, 73, 63, 121, 93, 62, 48, 78, 100, 101, 52, 7, 4, 67, 115, 101, 20, 125, 10, 79, 104, 69, 65};
    }

    private static byte[] cmqmyhuklfolmbo() {
        return new byte[]{-67, -71, 60, 47, 77, 49, 122, 74, 61, 49, 79, 51, 102, 43, 3, 8, 64, 53};
    }

    private static int tnjxsezjlyepxevp(int i, int i2) {
        return i ^ i2;
    }
}
