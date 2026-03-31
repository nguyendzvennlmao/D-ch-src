package com.kammoun.donutCore.leaderboard3;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.api.utils.sounds.KSound;
import com.kammoun.donutCore.leaderboard3.commands.LeaderboardCommand;
import com.kammoun.donutCore.leaderboard3.config.LeaderboardMenuConfig;
import com.kammoun.donutCore.leaderboard3.config.LeaderboardPageConfig;
import com.kammoun.donutCore.leaderboard3.listener.LeaderboardListener;
import com.kammoun.donutCore.leaderboard3.manager.LeaderboardManager;
import com.kammoun.donutCore.leaderboard3.task.LeaderboardUpdateTask;
import com.kammoun.donutCore.stats.StatsPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Sound;

public class LeaderBoardPlugin3 extends DonutModule {
    private final StatsPlugin statsPlugin;
    private LeaderboardManager manager;
    private LeaderboardUpdateTask updateTask;
    private LeaderboardMenuConfig menuConfig;
    private LeaderboardPageConfig pageConfig;
    private KSound clickSound;
    private KSound successSound;
    private KSound errorSound;
    private static int ea7b6Nko1K = 0;
    private transient int yc5t8QOGZI = 1763584508;
    private static String rnrfesefvj;
    private static String[] nothing_to_see_here = new String[18];

    public LeaderBoardPlugin3(StatsPlugin statsPlugin, int i) {
        super("leaderboard3", 1095143273);
        pfxxpjxhwddihekr(416755407 ^ 991051358, 2067215059);
        int parseInt = 1750227180 ^ (619964918 ^ Integer.parseInt("341021528"));
        this.yc5t8QOGZI = 1763584508 ^ ea7b6Nko1K;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 206928557:
                    parseInt = 1368975521 ^ parseInt;
                    break;
                case 423384154:
                    break;
                case 1361336075:
                case 2141087525:
                default:
                    throw new IllegalAccessException();
            }
        }
        this.statsPlugin = statsPlugin;
        int i2 = 1134586876 ^ (340666158 ^ parseInt);
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 959920498 ^ (722441207 ^ 1865561885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -397087549) {
            int i3 = 908555874 ^ i2;
            if (this.statsPlugin != null) {
                int pfxxpjxhwddihekr = pfxxpjxhwddihekr(i3, 726521800);
                saveConfig(wzgokoxdgu(obubabezdrfpaqh(), pfxxpjxhwddihekr), 1620467835);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pfxxpjxhwddihekr) == 50454931) {
                    i3 = 1606387388 ^ pfxxpjxhwddihekr;
                    saveConfig(wzgokoxdgu(vjtujrniczprfst(), i3), 1620467835);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -16919439) {
                        int i4 = 1611536150 ^ i3;
                        saveConfig(wzgokoxdgu(dbgclaediphykin(), i4), 1620467835);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -24286014) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -24286014 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1244307102 ^ i4)) {
                                    break;
                                }
                            }
                            int i5 = 1763467189 ^ i4;
                            throw new RuntimeException("double");
                        }
                        pfxxpjxhwddihekr = 1405842811 ^ i4;
                        this.menuConfig = new LeaderboardMenuConfig(this, 468460656);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pfxxpjxhwddihekr) == 1624688408) {
                            pfxxpjxhwddihekr = 2051912644 ^ pfxxpjxhwddihekr;
                            this.pageConfig = new LeaderboardPageConfig(this, 579858178);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pfxxpjxhwddihekr) == -1296344773) {
                                pfxxpjxhwddihekr = 1935148523 ^ pfxxpjxhwddihekr;
                                loadSounds(234851010);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pfxxpjxhwddihekr) == 679179872) {
                                    i2 = 1957763491 ^ pfxxpjxhwddihekr;
                                    this.manager = new LeaderboardManager(this, 477603037);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1913406597) {
                                        int i6 = 2070651110 ^ i2;
                                        int i7 = getConfig(127597628).getInt(wzgokoxdgu(aaecnggfmukflvq(), i6), (short) (181786277 ^ i6));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1454292040) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1454292040 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (327418620 ^ i6)) {
                                                    break;
                                                }
                                            }
                                            int i8 = 1589670246 ^ i6;
                                            throw new IOException("double");
                                        }
                                        i3 = 1047295109 ^ i6;
                                        this.updateTask = new LeaderboardUpdateTask(this.manager, i7, 1134826444);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1513285535) {
                                            i3 = 1088584270 ^ i3;
                                            this.updateTask.start(949717974);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1562457581) {
                                                i3 = 583135277 ^ i3;
                                                registerCommand(new LeaderboardCommand(this, this.manager, 766868820), wzgokoxdgu(resqehvarfkjmsa(), i3), 1506108676);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1261352070) {
                                                    i3 = 805555577 ^ i3;
                                                    registerEvent(new LeaderboardListener(this, this.manager, 296119708), 1095327048);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 885989555) {
                                                        int i9 = 1417343149 ^ i3;
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pfxxpjxhwddihekr) == 679179872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pfxxpjxhwddihekr) == (1908598438 ^ pfxxpjxhwddihekr)) {
                        int i10 = 705132577 ^ pfxxpjxhwddihekr;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pfxxpjxhwddihekr) == 50454931 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pfxxpjxhwddihekr) == (951126788 ^ pfxxpjxhwddihekr)) {
                            int i11 = 264395700 ^ pfxxpjxhwddihekr;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pfxxpjxhwddihekr) == -1296344773 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pfxxpjxhwddihekr) == (1104969357 ^ pfxxpjxhwddihekr)) {
                                int i12 = 806378698 ^ pfxxpjxhwddihekr;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pfxxpjxhwddihekr) == 1624688408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pfxxpjxhwddihekr) == (1078674122 ^ pfxxpjxhwddihekr)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                int i13 = 1029868110 ^ pfxxpjxhwddihekr;
                throw new IllegalAccessException("double");
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1500471250) {
                i3 = 39418080 ^ i3;
                getLogger(583940502).severe(wzgokoxdgu(kocbxuouomhshai(), i3));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1269078226) {
                    int i14 = 1547942116 ^ i3;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1261352070 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (164621939 ^ i3)) {
                    int i15 = 61527533 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1500471250 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (25135866 ^ i3)) {
                        int i16 = 832969187 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1759992359 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1857486859 ^ i3)) {
                            int i17 = 807287082 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 885989555 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1596269163 ^ i3)) {
                                int i18 = 361983614 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -16919439 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1600920232 ^ i3)) {
                                    int i19 = 5133205 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1562457581 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1780023347 ^ i3)) {
                                        int i20 = 327873924 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1269078226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (66940240 ^ i3)) {
                                            int i21 = 669801954 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1513285535 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1106732567 ^ i3)) {
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
            int i22 = 1714944389 ^ i3;
            throw new IOException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1913406597 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (32169483 ^ i2)) {
                int i23 = 533426771 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -397087549 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1089730276 ^ i2)) {
                    break;
                }
            }
        }
        int i24 = 139807133 ^ i2;
        throw new IOException("double");
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 890363496 ^ (810922078 ^ 1865561885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1404225883) {
            i2 = 775129041 ^ i2;
            if (this.updateTask != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 573503442) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 309366707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1548606459 ^ i2)) {
                            int i3 = 1968502552 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 573503442 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (374405451 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i4 = 1058821717 ^ i2;
                    throw new RuntimeException();
                }
                int i5 = 1055625492 ^ i2;
                this.updateTask.stop(92239210);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -713916557) {
                    int i6 = 417357336 ^ i5;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -713916557 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1989077154 ^ i5)) {
                        break;
                    }
                }
                int i7 = 1752223545 ^ i5;
                throw new IOException("double");
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 71771201:
                        int i8 = 638308108 ^ i2;
                        return;
                    case 1192247581:
                        return;
                    case 1275863424:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1404225883 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1991324793 ^ i2)) {
                int i9 = 925609406 ^ i2;
                throw new RuntimeException("double");
            }
        }
    }

    @Override
    public void reload(int i) {
        int i2 = 1141932269 ^ (2147029638 ^ 1865561885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1495454798) {
            int i3 = 1395887464 ^ i2;
            loadConfig(392005859);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1061241072) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1061241072 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1145183090 ^ i3)) {
                        break;
                    }
                }
                int i4 = 110564691 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 648794077 ^ i3;
            if (this.menuConfig != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 169819673) {
                    i2 = 467309861 ^ i2;
                    this.menuConfig.reload(this, 1589958370);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -724854991) {
                        i2 = 1257314843 ^ i2;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -724854991 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (969743091 ^ i2)) {
                            int i5 = 665562784 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2092742677 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (926888827 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i6 = 273501777 ^ i2;
                    throw new IOException("double");
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 169819673 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1373614942 ^ i2)) {
                        int i7 = 1696972476 ^ i2;
                        throw new IllegalAccessException("double");
                    }
                }
            } else {
                i2 = pfxxpjxhwddihekr(i2, 1361809214);
            }
            if (this.pageConfig != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2092742677) {
                    int i8 = 1687770274 ^ i2;
                    this.pageConfig.reload(this, 276459095);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1484135688) {
                        i2 = 1034035186 ^ i8;
                        loadSounds(234851010);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1251548521) {
                            i2 = 858460816 ^ i2;
                            if (this.updateTask == null) {
                                i8 = 985175805 ^ i2;
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -742290968) {
                                i8 = 1328175537 ^ i2;
                                this.updateTask.stop(92239210);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1433189278) {
                                    i8 = 1972555596 ^ i8;
                                }
                            }
                            int i9 = getConfig(127597628).getInt(wzgokoxdgu(mfhnqipdmmzruwg(), i8), (short) (549496556 ^ i8));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 101006849) {
                                int i10 = 959667396 ^ i8;
                                this.updateTask = new LeaderboardUpdateTask(this.manager, i9, 1134826444);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -811608032) {
                                    i8 = 1965080293 ^ i10;
                                    this.updateTask.start(949717974);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1721380619) {
                                        int i11 = 401019902 ^ i8;
                                        return;
                                    }
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -811608032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (81721311 ^ i10)) {
                                            int i12 = 865855744 ^ i10;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 101006849 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2095372304 ^ i8)) {
                            int i13 = 6024996 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1721380619 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (977821462 ^ i8)) {
                                int i14 = 1556621603 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1433189278 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1231388701 ^ i8)) {
                                    int i15 = 1513828164 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1484135688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1399756987 ^ i8)) {
                                        int i16 = 1050142976 ^ i8;
                                        throw new IOException();
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -724854991) {
                        int i52 = 665562784 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2092742677) {
                            break;
                            break;
                        }
                        continue;
                    }
                }
                int i62 = 273501777 ^ i2;
                throw new IOException("double");
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 164248322:
                        i2 = 1497058128 ^ i2;
                        break;
                    case 709981279:
                        break;
                    case 862020872:
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 169819673) {
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -742290968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (364134648 ^ i2)) {
                int i17 = 1683314422 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1251548521 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1326983932 ^ i2)) {
                    int i18 = 375599616 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1495454798 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1797900296 ^ i2)) {
                        int i19 = 961282981 ^ i2;
                        throw new RuntimeException("double");
                    }
                }
            }
        }
    }

    private void loadSounds(int i) {
        int i2 = 1026278996 ^ (1079908111 ^ 1865561885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1841352144) {
            i2 = 1046362230 ^ i2;
            this.clickSound = parseSound(wzgokoxdgu(vubnudigiodoueb(), i2), Sound.UI_BUTTON_CLICK, 1458113407);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1624174977) {
                i2 = 472376687 ^ i2;
                this.successSound = parseSound(wzgokoxdgu(xyacislpyinccbq(), i2), Sound.ENTITY_PLAYER_LEVELUP, 1458113407);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2114856199) {
                    int i3 = 1249443798 ^ i2;
                    this.errorSound = parseSound(wzgokoxdgu(andpnnsmepqifrj(), i3), Sound.ENTITY_VILLAGER_NO, 1458113407);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -768203701) {
                        int i4 = 225506034 ^ i3;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -768203701 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1046031885 ^ i3)) {
                            break;
                        }
                    }
                    int i5 = 10824638 ^ i3;
                    throw new IllegalAccessException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2114856199 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (616776888 ^ i2)) {
                int i6 = 1082494984 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1624174977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1450448790 ^ i2)) {
                    int i7 = 786044791 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1841352144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (849247469 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 29643164 ^ i2;
        throw new RuntimeException();
    }

    private com.kammoun.donutCore.api.utils.sounds.KSound parseSound(java.lang.String r6, org.bukkit.Sound r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.leaderboard3.LeaderBoardPlugin3.parseSound(java.lang.String, org.bukkit.Sound, int):com.kammoun.donutCore.api.utils.sounds.KSound");
    }

    @Generated
    public StatsPlugin getStatsPlugin(int i) {
        int i2 = 1265107573 ^ (1416219926 ^ 1865561885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2120236045) {
            int i3 = 40463803 ^ i2;
            return this.statsPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1831555541 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1235918976 ^ i2)) {
                int i4 = 1624034769 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2120236045 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (700738410 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 590501702 ^ i2;
        throw new IOException();
    }

    @Generated
    public LeaderboardManager getManager(int i) {
        int i2 = 942648862 ^ (175473799 ^ 1865561885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -348066782) {
            int i3 = 1451930931 ^ i2;
            return this.manager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -348066782 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1431292874 ^ i2)) {
                int i4 = 62503574 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1595229624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (233222585 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1973802722 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public LeaderboardUpdateTask getUpdateTask() {
        int i = 1263224698 ^ (178752091 ^ 1865561885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1995952609) {
            int i2 = 1110903246 ^ i;
            return this.updateTask;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1995952609 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1731508881 ^ i)) {
                int i3 = 861701723 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1733271443 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (184315872 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2024193387 ^ i;
        throw new IOException();
    }

    @Generated
    public LeaderboardMenuConfig getMenuConfig(int i) {
        int i2 = 1385475215 ^ (679223079 ^ 1865561885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1361828440) {
            int i3 = 34633310 ^ i2;
            return this.menuConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1361828440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (868144732 ^ i2)) {
                int i4 = 733177235 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1101555880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1211462483 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2070473941 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public LeaderboardPageConfig getPageConfig(int i) {
        int i2 = 1782758855 ^ (310844393 ^ 1865561885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1078163048) {
            int i3 = 1806609581 ^ i2;
            return this.pageConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1078163048 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1180603895 ^ i2)) {
                int i4 = 1084713464 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -490083085 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2121750667 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 237272662 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public KSound getClickSound(int i) {
        int i2 = 1759714059 ^ (503256073 ^ 1865561885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -781074184) {
            int i3 = 1416847812 ^ i2;
            return this.clickSound;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -781074184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2061115124 ^ i2)) {
                int i4 = 1424151975 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1927991002 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1559469574 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 588026973 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public KSound getSuccessSound() {
        int i = 215063395 ^ (307434340 ^ 1865561885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1920599853) {
            int i2 = 1418783507 ^ i;
            return this.successSound;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 688037961 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (449472303 ^ i)) {
                int i3 = 1792866549 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1920599853 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1087064267 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1235992257 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public KSound getErrorSound(int i) {
        int i2 = 1542349530 ^ (558724115 ^ 1865561885);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1400303968) {
            int i3 = 754165772 ^ i2;
            return this.errorSound;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -887861567 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (908035174 ^ i2)) {
                int i4 = 1065874103 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1400303968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1670106659 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 270095678 ^ i2;
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
        rnrfesefvj = ByteBuffer.wrap(yxnlkbnrcpcjphq()).asCharBuffer().toString();
        ea7b6Nko1K = 434513571 ^ new Random(6286939973864801039L).nextInt();
    }

    public static String wzgokoxdgu(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = rnrfesefvj.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] kocbxuouomhshai() {
        return new byte[]{0, 0, 0, 48, 0, 0, 0, 0};
    }

    private static byte[] vjtujrniczprfst() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 48};
    }

    private static byte[] obubabezdrfpaqh() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 60};
    }

    private static byte[] dbgclaediphykin() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 70};
    }

    private static byte[] resqehvarfkjmsa() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, 82};
    }

    private static byte[] aaecnggfmukflvq() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 93};
    }

    private static byte[] mfhnqipdmmzruwg() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 105};
    }

    private static byte[] vubnudigiodoueb() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, 117};
    }

    private static byte[] andpnnsmepqifrj() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, -117};
    }

    private static byte[] xyacislpyinccbq() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, -105};
    }

    private static byte[] yxnlkbnrcpcjphq() {
        return new byte[]{49, 97, 51, 70, 51, 86, 54, 66, 48, 65, 49, 18, 51, 95, 51, 88, 54, 82, 48, 71, 49, 94, 51, 87, 51, 23, 54, 95, 48, 65, 49, 18, 51, 64, 51, 82, 54, 71, 48, 71, 49, 91, 51, 64, 51, 82, 54, 82, 48, 18, 49, 84, 51, 93, 51, 69, 54, 22, 48, 126, 49, 87, 51, 83, 51, 83, 54, 83, 48, 64, 49, 112, 51, 93, 51, 86, 54, 68, 48, 86, 49, 18, 51, 95, 51, 88, 54, 82, 48, 71, 49, 94, 51, 87, 51, 25, 49, 119, 55, 68, 54, 91, 54, 23, 57, 89, 49, 85, 55, 95, 54, 71, 54, 22, 57, 77, 49, 93, 55, 93, 49, 85, 49, 89, 57, 95, 57, 80, 48, 91, 49, 81, 49, 24, 57, 72, 57, 91, 48, 94, 49, 113, 48, 66, 53, 94, 54, 22, 56, 68, 49, 87, 48, 80, 53, 82, 54, 23, 56, 77, 49, 91, 48, 91, 49, 88, 53, 87, 57, 85, 51, 83, 50, 82, 49, 70, 53, 80, 57, 91, 51, 86, 50, 69, 49, 80, 49, 74, 49, 82, 56, 80, 53, 66, 53, 84, 56, 66, 55, 80, 54, 24, 48, 71, 49, 89, 49, 67, 56, 83, 53, 70, 57, 81, 57, 80, 55, 68, 56, 80, 52, 74, 52, 81, 54, 26, 54, 74, 53, 85, 57, 64, 57, 83, 55, 64, 57, 87, 57, 71, 55, 86, 52, 83, 51, 74, 56, 23, 50, 84, 56, 88, 55, 90, 57, 91, 57, 89, 55, 21, 52, 94, 51, 87, 56, 79, 50, 82, 56, 90, 55, 71, 57, 87, 57, 64, 55, 65, 50, 67, 53, 94, 52, 64, 56, 95, 56, 81, 50, 67, 53, 31, 52, 80, 56, 67, 56, 71, 50, 95, 53, 67, 56, 67, 57, 92, 56, 65, 55, 87, 57, 92, 48, 74, 51, 22, 52, 68, 57, 76, 56, 83, 57, 80, 56, 81, 55, 74, 57, 75};
    }

    private static int pfxxpjxhwddihekr(int i, int i2) {
        return i ^ i2;
    }
}
