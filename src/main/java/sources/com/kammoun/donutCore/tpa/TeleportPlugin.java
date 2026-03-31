package com.kammoun.donutCore.tpa;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.tpa.commands.Toggle.TpaHereToggle;
import com.kammoun.donutCore.tpa.commands.Toggle.TpaToggle;
import com.kammoun.donutCore.tpa.commands.Toggle.Tpaauto;
import com.kammoun.donutCore.tpa.commands.Tpa;
import com.kammoun.donutCore.tpa.commands.TpaAccept;
import com.kammoun.donutCore.tpa.commands.TpaCancel;
import com.kammoun.donutCore.tpa.commands.TpaDeny;
import com.kammoun.donutCore.tpa.commands.TpaHere;
import com.kammoun.donutCore.tpa.config.TeleportConfig;
import com.kammoun.donutCore.tpa.data.TeleportDB;
import com.kammoun.donutCore.tpa.listener.PlayerConnectionListener;
import com.kammoun.donutCore.tpa.listener.TeleportMenuListener;
import com.kammoun.donutCore.tpa.listener.TpAutoAcceptListener;
import com.kammoun.donutCore.tpa.manager.TeleportManager;
import com.kammoun.donutCore.tpa.menu.accept.TpaAcceptMenu;
import com.kammoun.donutCore.tpa.menu.accept.TpaHereAcceptMenu;
import com.kammoun.donutCore.tpa.menu.request.TpaHereRequestMenu;
import com.kammoun.donutCore.tpa.menu.request.TpaRequestMenu;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;

public class TeleportPlugin extends DonutModule {
    private TeleportConfig teleportConfig;
    private TeleportDB database;
    private TeleportManager teleportManager;
    private TpaRequestMenu tpaRequestMenu;
    private TpaAcceptMenu tpaAcceptMenu;
    private TpaHereRequestMenu tpaHereRequestMenu;
    private TpaHereAcceptMenu tpaHereAcceptMenu;
    private static int j0nZolAVrU = 0;
    private transient int EynLqbw3nJ = 992691264;
    private static String vzumasadbk;
    private static String[] nothing_to_see_here = new String[18];

    public TeleportPlugin() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.TeleportPlugin.<init>():void");
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 970955958 ^ (2040276903 ^ 1033995085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -284048669) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -284048669 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (782122895 ^ i2)) {
                    break;
                }
            }
            int i3 = 1187828684 ^ i2;
            throw new IOException("double");
        }
        int i4 = 881019789 ^ i2;
        this.teleportConfig = new TeleportConfig(this, 1829940085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1259052682) {
            i4 = 568048603 ^ i4;
            this.database = new TeleportDB(this, 267686524);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1171669075) {
                int i5 = 1600356919 ^ i4;
                this.teleportManager = new TeleportManager(this, 1342520492);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1094037015) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1094037015 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1016618877 ^ i5)) {
                            break;
                        }
                    }
                    int i6 = 473361259 ^ i5;
                    throw new RuntimeException("double");
                }
                int i7 = 2051391047 ^ i5;
                initializeMenus(903233812);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 1827120082) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1827120082 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1142492008 ^ i7)) {
                            break;
                        }
                    }
                    int i8 = 15575441 ^ i7;
                    throw new RuntimeException("double");
                }
                int i9 = 854930932 ^ i7;
                registerListeners(87223791);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -78771085) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -78771085 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (2107126376 ^ i9)) {
                            break;
                        }
                    }
                    int i10 = 751034693 ^ i9;
                    throw new IllegalAccessException("double");
                }
                i4 = 1720362445 ^ i9;
                registerCommands(882363264);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -820305384) {
                    i4 = 765284467 ^ i4;
                    startCleanupTask(84904236);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1544445567) {
                        int i11 = 186367245 ^ i4;
                        return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1171669075 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1995810987 ^ i4)) {
                int i12 = 1958226525 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1259052682 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1563497065 ^ i4)) {
                    int i13 = 1082791686 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -80983575 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1026798940 ^ i4)) {
                        int i14 = 1976474254 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1544445567 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1024260642 ^ i4)) {
                            int i15 = 94219609 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -820305384 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2122359973 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i16 = 2063836984 ^ i4;
        throw new IOException();
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 604496445 ^ (1657144334 ^ 1033995085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -620549133) {
            i2 = 870801491 ^ i2;
            if (this.teleportManager == null) {
                i2 = 2022929418 ^ i2;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1144531306) {
                i2 = 61116734 ^ i2;
                this.teleportManager.saveAll(847511586);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1495048346) {
                    i2 = 2067260724 ^ i2;
                }
            }
            if (this.database != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2136766151) {
                    i2 = 1757104668 ^ i2;
                    this.database.closeConnection(1119968866);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -981870118) {
                        int i3 = 1642303362 ^ i2;
                        return;
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 220703535:
                        int i4 = 156812702 ^ i2;
                        return;
                    case 349464327:
                    case 362518367:
                        return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1495048346 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (981377725 ^ i2)) {
                int i5 = 1795340623 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2136766151 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (232648486 ^ i2)) {
                    int i6 = 1275891648 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -981870118 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (636590822 ^ i2)) {
                        int i7 = 1629558591 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -899308087 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1895512585 ^ i2)) {
                            int i8 = 1450523571 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1144531306 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2043188298 ^ i2)) {
                                int i9 = 1372099349 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -620549133 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1506629189 ^ i2)) {
                                    int i10 = 936730722 ^ i2;
                                    throw new IOException();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void reload(int i) {
        int i2 = 1694739688 ^ (761964246 ^ 1033995085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1371255909) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1371255909 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (896670511 ^ i2)) {
                    break;
                }
            }
            int i3 = 775322393 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 2075345374 ^ i2;
        this.teleportConfig.reload(38763871);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1943946600) {
            i4 = 1094988646 ^ i4;
            initializeMenus(903233812);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2046811738) {
                int i5 = 1907904161 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -197285039 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (433011298 ^ i4)) {
                int i6 = 1709875554 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1943946600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (763026202 ^ i4)) {
                    int i7 = 1301273744 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2046811738 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (102135204 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1477050835 ^ i4;
        throw new RuntimeException();
    }

    private void initializeMenus(int i) {
        int i2 = 481486160 ^ (1749010335 ^ 1033995085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1231358994) {
            i2 = 2025228644 ^ i2;
            this.tpaRequestMenu = new TpaRequestMenu(this, 979172651);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1932441807) {
                i2 = 1292457200 ^ i2;
                this.tpaAcceptMenu = new TpaAcceptMenu(this, 2059391264);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -459546445) {
                    i2 = 605616691 ^ i2;
                    this.tpaHereRequestMenu = new TpaHereRequestMenu(this, 1709464382);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1000591062) {
                        i2 = 2137380276 ^ i2;
                        this.tpaHereAcceptMenu = new TpaHereAcceptMenu(this, 1181407786);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1064475785) {
                            int i3 = 1055069372 ^ i2;
                            return;
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1000591062 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1167793152 ^ i2)) {
                int i4 = 1179706940 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1932441807 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1161842682 ^ i2)) {
                    int i5 = 1952962355 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1064475785 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (306601993 ^ i2)) {
                        int i6 = 816415236 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1231358994 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1226260513 ^ i2)) {
                            int i7 = 1276317711 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -459546445 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (41088943 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i8 = 1170650298 ^ i2;
        throw new RuntimeException();
    }

    private void registerListeners(int i) {
        int i2 = 1358486768 ^ (1828058512 ^ 1033995085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 224743784) {
            i2 = 197843863 ^ i2;
            registerEvent(new TeleportMenuListener(), 1095327048);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1395887568) {
                int i3 = 352200727 ^ i2;
                registerEvent(new PlayerConnectionListener(this, 1204835329), 1095327048);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -188560024) {
                    i3 = 2087455801 ^ i3;
                    registerEvent(new TpAutoAcceptListener(this, 346407580), 1095327048);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 396536995) {
                        int i4 = 381376981 ^ i3;
                        return;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -188560024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (165737862 ^ i3)) {
                        int i5 = 1191396015 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 396536995 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (194913232 ^ i3)) {
                            break;
                        }
                    }
                }
                int i6 = 1751405144 ^ i3;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 224743784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1284246197 ^ i2)) {
                int i7 = 272564138 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1395887568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1058414952 ^ i2)) {
                    break;
                }
            }
        }
        int i8 = 1442681732 ^ i2;
        throw new IOException();
    }

    private void registerCommands(int i) {
        int i2 = 439302190 ^ (461358732 ^ 1033995085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -410259591) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -410259591 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (444225987 ^ i2)) {
                    break;
                }
            }
            int i3 = 1106919691 ^ i2;
            throw new IOException("double");
        }
        int i4 = 292517588 ^ i2;
        registerCommand((KCommand) new Tpa(this, 2010197039), vvurjletfj(jumtnjyqawmrrwg(), i4), 800215123);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1827690969) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1827690969 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (851143312 ^ i4)) {
                    break;
                }
            }
            int i5 = 1563879889 ^ i4;
            throw new IOException("double");
        }
        int i6 = 1374167664 ^ i4;
        registerCommand((KCommand) new TpaHere(this, 630101216), vvurjletfj(hrzymeyuodrkrna(), i6), 800215123);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -474920357) {
            int i7 = 941605237 ^ i6;
            registerCommand((KCommand) new TpaAccept(this, 669872187), vvurjletfj(tztoshpsqbopahj(), i7), 800215123);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 592396786) {
                i7 = 1592836518 ^ i7;
                registerCommand((KCommand) new TpaDeny(this, 922831640), vvurjletfj(kbhyzltekbxneuj(), i7), 800215123);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -725005120) {
                    int i8 = 913820142 ^ i7;
                    registerCommand((KCommand) new TpaToggle(this, 1069055159), vvurjletfj(bhysqghvlonwjvf(), i8), 800215123);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1735852977) {
                        i8 = 1983675346 ^ i8;
                        registerCommand((KCommand) new TpaHereToggle(this, 245748285), vvurjletfj(qxywrxkpalpwfui(), i8), 800215123);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -694887134) {
                            i7 = 486716790 ^ i8;
                            registerCommand((KCommand) new TpaCancel(this, 1233184558), vvurjletfj(pzadxbgsyupxxvr(), i7), 800215123);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1048671890) {
                                i6 = 1880769252 ^ i7;
                                registerCommand((KCommand) new Tpaauto(this, 444766738), vvurjletfj(fqvyjukjsalwxrn(), i6), 800215123);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1101831759) {
                                    int i9 = 544524963 ^ i6;
                                    return;
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1735852977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (882515569 ^ i8)) {
                            int i10 = 146815878 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -694887134 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (654282340 ^ i8)) {
                                break;
                            }
                        }
                    }
                    int i11 = 980468463 ^ i8;
                    throw new RuntimeException("double");
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1048671890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (963706671 ^ i7)) {
                    int i12 = 117144285 ^ i7;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 592396786 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (193131517 ^ i7)) {
                        int i13 = 237684208 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -725005120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1352205782 ^ i7)) {
                            int i14 = 1550562861 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1108003672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (396939657 ^ i7)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i15 = 413622773 ^ i7;
            throw new RuntimeException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1101831759 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (610944792 ^ i6)) {
                int i16 = 1344560308 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -474920357 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (620474998 ^ i6)) {
                    break;
                }
            }
        }
        int i17 = 1828868919 ^ i6;
        throw new RuntimeException("double");
    }

    private void startCleanupTask(int i) {
        int i2 = 1208982050 ^ (1739845423 ^ 1033995085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1863339520) {
            i2 = 508552050 ^ i2;
            SchedulerUtil.runTimer(() -> {
                int i3 = 1237230533 ^ (1246116298 ^ 1033995085);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -221722095) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -221722095 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1602256204 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 908985789 ^ i3;
                    throw new IOException("double");
                }
                int i5 = 2127228915 ^ i3;
                if (this.teleportManager == null) {
                    zlittbagwkdbbhmk(i5, 629425114);
                    return;
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 77575562) {
                    i5 = 1072500916 ^ i5;
                    this.teleportManager.cleanup(667945339);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -67686357) {
                        int i6 = 443110254 ^ i5;
                        return;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -67686357 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1970331425 ^ i5)) {
                        int i7 = 357072981 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 77575562 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (583138629 ^ i5)) {
                            break;
                        }
                    }
                }
                int i8 = 1168478990 ^ i5;
                throw new IOException();
            }, 1200L, 1200L, 2041710047);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1653647760) {
                int i3 = 2143135940 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1653647760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1370785939 ^ i2)) {
                int i4 = 79930572 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1863339520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1587339022 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 552878865 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public TeleportConfig getTeleportConfig(int i) {
        int i2 = 1587702982 ^ (443690342 ^ 1033995085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -879880341) {
            int i3 = 1238763277 ^ i2;
            return this.teleportConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2059522303 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1175847148 ^ i2)) {
                int i4 = 63192896 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -879880341 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1983835033 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1220164621 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public TeleportDB getDatabase(int i) {
        int i2 = 1115372542 ^ (1298782874 ^ 1033995085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1784999607) {
            int i3 = 1968510905 ^ i2;
            return this.database;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1784999607 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (267606763 ^ i2)) {
                int i4 = 238122788 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1060351106 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1772030592 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1955448114 ^ i2;
        throw new IOException();
    }

    @Generated
    public TeleportManager getTeleportManager(int i) {
        int i2 = 2010212079 ^ (1696150784 ^ 1033995085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2068743441) {
            int i3 = 618920705 ^ i2;
            return this.teleportManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2068743441 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (519799483 ^ i2)) {
                int i4 = 1704035948 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1548836120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (549956927 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 803825939 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public TpaRequestMenu getTpaRequestMenu(int i) {
        int i2 = 1416085030 ^ (991554526 ^ 1033995085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1761692246) {
            int i3 = 489681535 ^ i2;
            return this.tpaRequestMenu;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1761692246 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (261832937 ^ i2)) {
                int i4 = 1780716706 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2139170386 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (374180538 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 142708159 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public TpaAcceptMenu getTpaAcceptMenu(int i) {
        int i2 = 1511054774 ^ (1230765982 ^ 1033995085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2002062121) {
            int i3 = 935481782 ^ i2;
            return this.tpaAcceptMenu;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -918059368 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2117610272 ^ i2)) {
                int i4 = 2038017564 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2002062121 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1167549094 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1171845545 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public TpaHereRequestMenu getTpaHereRequestMenu(int i) {
        int i2 = 2138154525 ^ (1670389646 ^ 1033995085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 167892721) {
            int i3 = 246224593 ^ i2;
            return this.tpaHereRequestMenu;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 167892721 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (670266994 ^ i2)) {
                int i4 = 2073886097 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2137612409 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1888625691 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 181809385 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public TpaHereAcceptMenu getTpaHereAcceptMenu(int i) {
        int i2 = 675411236 ^ (289778148 ^ 1033995085);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 623836264) {
            int i3 = 1226935332 ^ i2;
            return this.tpaHereAcceptMenu;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 623836264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1664070747 ^ i2)) {
                int i4 = 1101740717 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1814207818 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1381362035 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 406951812 ^ i2;
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
        vzumasadbk = ByteBuffer.wrap(wtnmiodwpsdzgfq()).asCharBuffer().toString();
        j0nZolAVrU = 87843205 ^ new Random(-1037853866104437868L).nextInt();
    }

    public static String vvurjletfj(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = vzumasadbk.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] kbhyzltekbxneuj() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 0};
    }

    private static byte[] hrzymeyuodrkrna() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 7};
    }

    private static byte[] tztoshpsqbopahj() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 14};
    }

    private static byte[] qxywrxkpalpwfui() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, 22};
    }

    private static byte[] pzadxbgsyupxxvr() {
        return new byte[]{0, 0, 0, 9, 0, 0, 0, 35};
    }

    private static byte[] jumtnjyqawmrrwg() {
        return new byte[]{0, 0, 0, 3, 0, 0, 0, 44};
    }

    private static byte[] bhysqghvlonwjvf() {
        return new byte[]{0, 0, 0, 9, 0, 0, 0, 47};
    }

    private static byte[] fqvyjukjsalwxrn() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 56};
    }

    private static byte[] wtnmiodwpsdzgfq() {
        return new byte[]{52, 64, 54, 66, 52, 84, 50, 83, 50, 81, 52, 88, 50, 77, 50, 68, 56, 72, 49, 80, 56, 94, 48, 86, 50, 66, 56, 93, 49, 69, 52, 71, 55, 88, 49, 87, 50, 81, 49, 84, 52, 71, 55, 77, 49, 65, 50, 67, 55, 84, 49, 80, 52, 81, 49, 71, 50, 86, 55, 65, 49, 87, 52, 83, 49, 82, 50, 95, 55, 80, 49, 70, 48, 68, 56, 83, 53, 91, 49, 81, 49, 92, 48, 87, 56, 87, 53, 84, 55, 66, 53, 67, 51, 83, 55, 65, 51, 72, 53, 83, 53, 71, 52, 88, 53, 84, 56, 82, 50, 89, 51, 81, 57, 71, 54, 64, 49, 83, 56, 64, 52, 77, 51, 89};
    }

    private static int zlittbagwkdbbhmk(int i, int i2) {
        return i ^ i2;
    }
}
