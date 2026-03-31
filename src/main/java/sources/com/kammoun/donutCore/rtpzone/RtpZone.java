package com.kammoun.donutCore.rtpzone;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.rtpzone.command.ReloadRTPZoneCommand;
import com.kammoun.donutCore.rtpzone.config.RTPConfigManager;
import com.kammoun.donutCore.rtpzone.listener.RTPZoneListener;
import com.kammoun.donutCore.rtpzone.manager.RTPPlayerManager;
import com.kammoun.donutCore.rtpzone.manager.RTPSoundManager;
import com.kammoun.donutCore.rtpzone.manager.RTPTeleportManager;
import com.kammoun.donutCore.rtpzone.papi.RTPPlaceholderExpansion;
import com.kammoun.donutCore.rtpzone.service.RTPWorldGuardHelper;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Random;
import lombok.Generated;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class RtpZone extends DonutModule {
    private int countdownTime;
    private RTPSoundManager soundManager;
    private RTPPlayerManager playerManager;
    private RTPTeleportManager teleportManager;
    private RTPConfigManager configManager;
    private RTPWorldGuardHelper worldGuardHelper;
    private RTPPlaceholderExpansion placeholderExpansion;
    private int currentTime;
    private SchedulerUtil.Task activeTimerTask;
    private static int lkk560lTY9 = 0;
    private transient int l78Zqm9GfA = 1826048457;
    private static String hzmwqbwzkx;
    private static String[] nothing_to_see_here = new String[13];

    public RtpZone() {
        super("RtpZone", 1095143273);
        int i = 923284811 ^ (1094331569 ^ 328016730);
        int parseInt = 1274788515 ^ (541620842 ^ Integer.parseInt("235731561"));
        this.l78Zqm9GfA = 1826048457 ^ lkk560lTY9;
        this.activeTimerTask = null;
        int i2 = 1447036908 ^ (1026894541 ^ (334091864 ^ parseInt));
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 36218437 ^ (335703354 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 816321914) {
            int i3 = 456732959 ^ i2;
            saveConfig(ouondmlfop(fsqiykaxauxmdgm(), i3), 1620467835);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -379478654) {
                i2 = 1553077842 ^ i3;
                this.configManager = new RTPConfigManager(getConfig(127597628), 615628047);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 233910032) {
                    i2 = 2141172368 ^ i2;
                    this.soundManager = new RTPSoundManager(this.configManager, 1528512622);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -250823789) {
                        i2 = 1786964073 ^ i2;
                        this.playerManager = new RTPPlayerManager();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1524893480) {
                            int i4 = 1700261363 ^ i2;
                            this.worldGuardHelper = new RTPWorldGuardHelper(this.configManager, 698832962);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1885038781) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1885038781 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1809252177 ^ i4)) {
                                        break;
                                    }
                                }
                                int i5 = 23246999 ^ i4;
                                throw new IOException("double");
                            }
                            i2 = 1730629905 ^ i4;
                            this.teleportManager = new RTPTeleportManager(this, this.configManager, this.playerManager, this.soundManager, 889865465);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1231151160) {
                                i2 = 1349170100 ^ i2;
                                this.countdownTime = this.configManager.getCountdownTime(1081424050);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 902529642) {
                                    i2 = 1432208814 ^ i2;
                                    this.currentTime = this.countdownTime;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1624920296) {
                                        int i6 = 391354323 ^ i2;
                                        registerEvent(new RTPZoneListener(this, this.worldGuardHelper, this.playerManager, this.soundManager, 242362559), 1095327048);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 632885632) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 632885632 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (829649954 ^ i6)) {
                                                    break;
                                                }
                                            }
                                            int i7 = 842401724 ^ i6;
                                            throw new RuntimeException("double");
                                        }
                                        i2 = 1470799317 ^ i6;
                                        registerCommand(new ReloadRTPZoneCommand(this, 898657337), ouondmlfop(tovsnmqaydkbaex(), i2), 1506108676);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1729233110) {
                                            i2 = 864917080 ^ i2;
                                            if (Bukkit.getPluginManager().isPluginEnabled(ouondmlfop(gkpijkibuiyizvn(), i2)) != (1620060605 ^ i2)) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 75582955) {
                                                    int i8 = 1397078086 ^ i2;
                                                    this.placeholderExpansion = new RTPPlaceholderExpansion(this, 1195081402);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -1632858151) {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1632858151 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2037039858 ^ i8)) {
                                                                break;
                                                            }
                                                        }
                                                        int i9 = 1041349099 ^ i8;
                                                        throw new IOException("double");
                                                    }
                                                    i3 = 1646128963 ^ i8;
                                                    this.placeholderExpansion.register();
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1908148798) {
                                                        i2 = 1982726663 ^ i3;
                                                        startPlayerCheckTask(66983228);
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1060365817) {
                                                            int i10 = 1540215703 ^ i2;
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                            while (true) {
                                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                                    case 154411975:
                                                        break;
                                                    case 186069070:
                                                        i2 = 1198937346 ^ i2;
                                                        break;
                                                    case 1591710184:
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1231151160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (344907616 ^ i2)) {
                                    int i11 = 1965522312 ^ i2;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 902529642 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1588067079 ^ i2)) {
                        int i12 = 509762105 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1060365817 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2129070827 ^ i2)) {
                            int i13 = 145073908 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 233910032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (641356083 ^ i2)) {
                                int i14 = 1581158976 ^ i2;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -379478654 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1506154364 ^ i3)) {
                    int i15 = 2100287996 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1908148798 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1745196435 ^ i3)) {
                        break;
                    }
                }
            }
            int i16 = 1115275504 ^ i3;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1729233110 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (72643438 ^ i2)) {
                int i17 = 46462128 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -250823789 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (542497799 ^ i2)) {
                    int i18 = 586997896 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1524893480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1542019806 ^ i2)) {
                        int i19 = 320347494 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -513967805 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (37207303 ^ i2)) {
                            int i20 = 241776676 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 75582955 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1981806835 ^ i2)) {
                                int i21 = 63158243 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1624920296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (810173076 ^ i2)) {
                                    int i22 = 331273942 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 816321914 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (487238795 ^ i2)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i23 = 1737130225 ^ i2;
        throw new IOException();
    }

    @Override
    public void onModuleDisable(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtpzone.RtpZone.onModuleDisable(int):void");
    }

    @Override
    public void reload(int i) {
        int i2 = 304188418 ^ (1089793099 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 391466184) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 391466184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1586369485 ^ i2)) {
                    break;
                }
            }
            int i3 = 995005627 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1861568242 ^ i2;
        stopCountdown(1322867031);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1627355995) {
            i4 = 1876565666 ^ i4;
            this.configManager = new RTPConfigManager(getConfig(127597628), 615628047);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 506433096) {
                i4 = 1726181885 ^ i4;
                this.soundManager = new RTPSoundManager(this.configManager, 1528512622);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 691274147) {
                    int i5 = 551901694 ^ i4;
                    this.countdownTime = this.configManager.getCountdownTime(1081424050);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 773770834) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 138288059 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1072217555 ^ i5)) {
                                int i6 = 1843002012 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 773770834 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1902645451 ^ i5)) {
                                    break;
                                }
                            }
                        }
                        int i7 = 1642774182 ^ i5;
                        throw new IOException("double");
                    }
                    int i8 = 1945069145 ^ i5;
                    this.currentTime = this.countdownTime;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1318716263) {
                        int i9 = 1462467812 ^ i8;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1318716263 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1289667810 ^ i8)) {
                            break;
                        }
                    }
                    int i10 = 1076889595 ^ i8;
                    throw new IOException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 506433096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1270143949 ^ i4)) {
                int i11 = 1939357988 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 691274147 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2032490988 ^ i4)) {
                    int i12 = 1303286438 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1627355995 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (842188651 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i13 = 1331577717 ^ i4;
        throw new IllegalAccessException();
    }

    public void startCountdown(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtpzone.RtpZone.startCountdown(int):void");
    }

    public void stopCountdown(int i) {
        int i2 = 1301049725 ^ (1788355633 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1185094429) {
            i2 = 1888996365 ^ i2;
            if (this.activeTimerTask != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1038255240) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1038255240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1836627007 ^ i2)) {
                            break;
                        }
                    }
                    int i3 = 651622075 ^ i2;
                    throw new RuntimeException("double");
                }
                int i4 = 1104579292 ^ i2;
                SchedulerUtil.cancel(this.activeTimerTask, 2112758150);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 861327978) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 861327978 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1409229324 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 190954702 ^ i4;
                    throw new IllegalAccessException("double");
                }
                i2 = 594476809 ^ i4;
                this.activeTimerTask = null;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 673262115) {
                    i2 = 214696401 ^ i2;
                    this.currentTime = this.countdownTime;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1312892075) {
                        int i6 = 2019026546 ^ i2;
                        return;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 673262115 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1408662681 ^ i2)) {
                        int i7 = 1850467503 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1312892075 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2080679369 ^ i2)) {
                            int i8 = 1150752789 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1929504968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1669421967 ^ i2)) {
                                int i9 = 2070636267 ^ i2;
                                throw new IOException();
                            }
                        }
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 121670715:
                        i2 = 1853125636 ^ i2;
                        break;
                    case 829700123:
                    case 1647211795:
                        break;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1185094429 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1651854206 ^ i2)) {
                int i10 = 838462202 ^ i2;
                throw new IOException("double");
            }
        }
    }

    private void updatePlayersWithCountdown(int i) {
        int i2 = 70615721 ^ (1895953222 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 677233145) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 677233145 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (742592730 ^ i2)) {
                    break;
                }
            }
            int i3 = 1002952333 ^ i2;
            throw new IOException("double");
        }
        int i4 = 867067617 ^ i2;
        String prefix = this.configManager.getPrefix(1412940115);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1255213328) {
            i4 = 1654992479 ^ i4;
            String timerMessage = this.configManager.getTimerMessage(2117712431);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1610120181) {
                int i5 = 2128326234 ^ i4;
                Iterator it = this.playerManager.getPlayersInRegion(1093481189).iterator();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1457190616) {
                    i4 = 764960906 ^ i5;
                    while (it.hasNext() != (658718289 ^ i4)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 974779017) {
                            i4 = 1767519788 ^ i4;
                            Player player = (Player) it.next();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1892172778) {
                                i5 = 672343248 ^ i4;
                                SchedulerUtil.runAtEntity(player, () -> {
                                    int burgnkxepqtgduec;
                                    int i6 = 941017477 ^ (1086579158 ^ 1346357712);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1196887065) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 593520505 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1440775681 ^ i6)) {
                                                int i7 = 1270369416 ^ i6;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1196887065 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (226050206 ^ i6)) {
                                                    break;
                                                }
                                            }
                                        }
                                        int i8 = 1596085726 ^ i6;
                                        throw new IllegalAccessException("double");
                                    }
                                    int i9 = 554728513 ^ i6;
                                    String replace = timerMessage.replace(ouondmlfop(ybsckdkncgufzdp(), i9), String.valueOf(this.currentTime));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 1339354640) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1339354640 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1147705720 ^ i9)) {
                                                break;
                                            }
                                        }
                                        int i10 = 1235166290 ^ i9;
                                        throw new IOException("double");
                                    }
                                    int i11 = 456460451 ^ i9;
                                    String str = prefix;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != -1770214648) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1770214648 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1273610133 ^ i11)) {
                                                break;
                                            }
                                        }
                                        int i12 = 429945963 ^ i11;
                                        throw new IllegalAccessException("double");
                                    }
                                    int i13 = 198189550 ^ i11;
                                    if (Bukkit.getPluginManager().isPluginEnabled(ouondmlfop(wpnrgjqpszrgfqj(), i13)) != (421508239 ^ i13)) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) != -922901384) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -922901384 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1605497685 ^ i13)) {
                                                    break;
                                                }
                                            }
                                            int i14 = 81500543 ^ i13;
                                            throw new RuntimeException("double");
                                        }
                                        burgnkxepqtgduec = 390188847 ^ i13;
                                        replace = PlaceholderAPI.setPlaceholders(player, replace);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(burgnkxepqtgduec) == 1928584448) {
                                            burgnkxepqtgduec = 1981529678 ^ burgnkxepqtgduec;
                                            str = PlaceholderAPI.setPlaceholders(player, str);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(burgnkxepqtgduec) == -1037160589) {
                                                burgnkxepqtgduec = 349742778 ^ burgnkxepqtgduec;
                                            }
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(burgnkxepqtgduec) == -1037160589 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(burgnkxepqtgduec) == (517357599 ^ burgnkxepqtgduec)) {
                                                int i15 = 65822007 ^ burgnkxepqtgduec;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(burgnkxepqtgduec) == 1693129379 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(burgnkxepqtgduec) == (382747185 ^ burgnkxepqtgduec)) {
                                                    int i16 = 1489278394 ^ burgnkxepqtgduec;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(burgnkxepqtgduec) == 1928584448 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(burgnkxepqtgduec) == (373496771 ^ burgnkxepqtgduec)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        int i17 = 1880868430 ^ burgnkxepqtgduec;
                                        throw new IOException();
                                    }
                                    burgnkxepqtgduec = burgnkxepqtgduec(i13, 1971509211);
                                    player.sendTitle(ChatFormater.color(str), ChatFormater.color(replace), (byte) (1822253908 ^ burgnkxepqtgduec), (byte) (1822253901 ^ burgnkxepqtgduec), (byte) (1822253905 ^ burgnkxepqtgduec));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(burgnkxepqtgduec) == 1693129379) {
                                        int i18 = 874036413 ^ burgnkxepqtgduec;
                                        this.soundManager.playCountdownSound(player, 1741706139);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == -1003552950) {
                                            int i19 = 2095698694 ^ i18;
                                            return;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == -1003552950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (812544450 ^ i18)) {
                                                break;
                                            }
                                        }
                                        int i20 = 1319275960 ^ i18;
                                        throw new IllegalAccessException("double");
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(burgnkxepqtgduec) == -1037160589) {
                                            int i152 = 65822007 ^ burgnkxepqtgduec;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(burgnkxepqtgduec) == 1693129379) {
                                                int i162 = 1489278394 ^ burgnkxepqtgduec;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(burgnkxepqtgduec) == 1928584448) {
                                                    break;
                                                    break;
                                                }
                                                continue;
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    int i172 = 1880868430 ^ burgnkxepqtgduec;
                                    throw new IOException();
                                }, 1442337497);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 810640747) {
                                    i4 = 1730586521 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 157571488) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 157571488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (176589521 ^ i4)) {
                                                int i6 = 30285694 ^ i4;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 708247170 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1049944817 ^ i4)) {
                                                    int i7 = 1983431651 ^ i4;
                                                    throw new IOException("double");
                                                }
                                            }
                                        }
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                            case 18465708:
                                                i4 = 1553376661 ^ i4;
                                                break;
                                            case 95824390:
                                            default:
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -305040118 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1760225039 ^ i4)) {
                                                        int i8 = 1097103087 ^ i4;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                                break;
                                            case 2009259889:
                                                break;
                                            case 2021332808:
                                        }
                                    }
                                    try {
                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4) == 93906925) {
                                            throw new IllegalAccessException();
                                        }
                                        throw null;
                                    } catch (IllegalAccessException e) {
                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                            case -1689248104:
                                                i4 = 1445780483 ^ i4;
                                                break;
                                            case -305040118:
                                                i4 = 419230065 ^ i4;
                                                break;
                                            default:
                                                throw new IllegalAccessException("Error in hash");
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 708247170) {
                                        }
                                        while (true) {
                                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                                case 104404197:
                                                    i4 = 1644552577 ^ i4;
                                                    break;
                                                case 871637906:
                                                    break;
                                                case 1330365715:
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i9 = 276468978 ^ i4;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1457190616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (18461346 ^ i5)) {
                        int i10 = 1501356518 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 810640747 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1259003158 ^ i5)) {
                            int i11 = 1142725987 ^ i5;
                            throw new IOException("double");
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1892172778 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (547765993 ^ i4)) {
                    int i12 = 809434676 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1610120181 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1288472814 ^ i4)) {
                        int i13 = 1177596156 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 974779017 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (246465158 ^ i4)) {
                            int i14 = 48448043 ^ i4;
                            throw new IOException();
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1255213328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1868405157 ^ i4)) {
                int i15 = 1131768189 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1689248104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2090411575 ^ i4)) {
                    int i16 = 63261143 ^ i4;
                    throw new IOException("double");
                }
            }
        }
    }

    private void startPlayerCheckTask(int i) {
        int i2 = 1279892705 ^ (436865124 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 870509224) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 870509224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1991087495 ^ i2)) {
                    break;
                }
            }
            int i3 = 2052688981 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 679512671 ^ i2;
        SchedulerUtil.runTimer(() -> {
            int i5 = 1999135312 ^ (847152599 ^ 1346357712);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1421249864) {
                i5 = 1633197767 ^ i5;
                this.worldGuardHelper.checkPlayersInRegions(this, this.playerManager, this.soundManager, 2052894419);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1584561021) {
                    int i6 = 557881302 ^ i5;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1417070030 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (711038454 ^ i5)) {
                    int i7 = 1987345985 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1421249864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (9230888 ^ i5)) {
                        int i8 = 640514035 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1584561021 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (648202323 ^ i5)) {
                            break;
                        }
                    }
                }
            }
            int i9 = 1384142552 ^ i5;
            throw new IllegalAccessException();
        }, 0L, 20L, 2041710047);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2011609169) {
            int i5 = 895838710 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2011609169 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1081178068 ^ i4)) {
                int i6 = 1170752381 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -590481440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1219694199 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 1533908321 ^ i4;
        throw new IllegalAccessException();
    }

    @Generated
    public int getCountdownTime(int i) {
        int i2 = 1305133757 ^ (762593640 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2079698903) {
            int i3 = 1612941667 ^ i2;
            return this.countdownTime;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2062148814 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1758551266 ^ i2)) {
                int i4 = 1914101489 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2079698903 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1929939657 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1972618704 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public RTPSoundManager getSoundManager() {
        int i = 1751379246 ^ (135136906 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2104421471) {
            int i2 = 1359117319 ^ i;
            return this.soundManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2104421471 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1442445558 ^ i)) {
                int i3 = 564101660 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 176354203 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1361158632 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1561885063 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public RTPPlayerManager getPlayerManager() {
        int i = 1663311002 ^ (1004747601 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1204252888) {
            int i2 = 913149153 ^ i;
            return this.playerManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1204252888 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (844028974 ^ i)) {
                int i3 = 552917484 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -190113839 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1593903681 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 134744323 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public RTPTeleportManager getTeleportManager() {
        int i = 374417181 ^ (1729629542 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 196549977) {
            int i2 = 70930304 ^ i;
            return this.teleportManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 711287129 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (289383489 ^ i)) {
                int i3 = 182495636 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 196549977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (851583479 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 984140492 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public RTPConfigManager getConfigManager() {
        int i = 2117523734 ^ (841070918 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -515552256) {
            int i2 = 535313409 ^ i;
            return this.configManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -515552256 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1086649451 ^ i)) {
                int i3 = 633023016 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 503622664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (388479724 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2335151 ^ i;
        throw new IOException();
    }

    @Generated
    public RTPWorldGuardHelper getWorldGuardHelper() {
        int i = 2138323306 ^ (395581702 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -956346911) {
            int i2 = 1420565351 ^ i;
            return this.worldGuardHelper;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -956346911 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1422829763 ^ i)) {
                int i3 = 536617510 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1671403227 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1978804349 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 56919861 ^ i;
        throw new IOException();
    }

    @Generated
    public RTPPlaceholderExpansion getPlaceholderExpansion() {
        int i = 928557552 ^ (2119134300 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -918527008) {
            int i2 = 1214670446 ^ i;
            return this.placeholderExpansion;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -918527008 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1332393981 ^ i)) {
                int i3 = 1091813120 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1972154222 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (172910660 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1140253124 ^ i;
        throw new IOException();
    }

    @Generated
    public SchedulerUtil.Task getActiveTimerTask() {
        int i = 842209238 ^ (1881472601 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1858010376) {
            int i2 = 344027511 ^ i;
            return this.activeTimerTask;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1858010376 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (138214823 ^ i)) {
                int i3 = 1757594884 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 894077248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1785022845 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 59902025 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public int getCurrentTime(int i) {
        int i2 = 2098222465 ^ (450285850 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1077253543) {
            int i3 = 159859014 ^ i2;
            return this.currentTime;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -202350487 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1645369699 ^ i2)) {
                int i4 = 2032934175 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1077253543 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1077292147 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1708236643 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public void setCurrentTime(int i, int i2) {
        int i3 = 133173209 ^ (684977439 ^ 1346357712);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -119449421) {
            int i4 = 2024172342 ^ i3;
            this.currentTime = i;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -119449421 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (580785202 ^ i3)) {
                int i5 = 1160333435 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1037172992 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1194206248 ^ i3)) {
                    break;
                }
            }
        }
        int i6 = 1952872821 ^ i3;
        throw new IllegalAccessException();
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
        hzmwqbwzkx = ByteBuffer.wrap(dwzglrsoybbkywj()).asCharBuffer().toString();
        lkk560lTY9 = 2070382883 ^ new Random(6336445253478177486L).nextInt();
    }

    public static String ouondmlfop(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = hzmwqbwzkx.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] ybsckdkncgufzdp() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 0};
    }

    private static byte[] wpnrgjqpszrgfqj() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, 15};
    }

    private static byte[] gkpijkibuiyizvn() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, 29};
    }

    private static byte[] tovsnmqaydkbaex() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, 43};
    }

    private static byte[] fsqiykaxauxmdgm() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 56};
    }

    private static byte[] dwzglrsoybbkywj() {
        return new byte[]{49, 19, 55, 80, 49, 86, 51, 93, 48, 68, 54, 67, 52, 67, 57, 71, 51, 64, 49, 105, 55, 78, 49, 86, 51, 93, 48, 84, 54, 18, 52, 98, 49, 89, 48, 89, 50, 80, 57, 81, 50, 89, 53, 95, 56, 94, 51, 93, 52, 87, 49, 71, 48, 121, 50, 99, 57, 125, 49, 102, 50, 92, 48, 87, 48, 85, 48, 80, 49, 94, 50, 95, 48, 90, 48, 82, 48, 80, 49, 68, 50, 113, 48, 102, 48, Byte.MAX_VALUE, 49, 65, 57, 64, 52, 69, 56, 79, 57, 88, 49, 93, 57, 81, 52, 71, 56, 80, 57, 91, 49, 92, 57, 85, 52, 81, 49, 86, 54, 92, 49, 89, 55, 95, 48, 93, 49, 82, 54, 29, 49, 78, 55, 84, 48, 88};
    }

    private static int burgnkxepqtgduec(int i, int i2) {
        return i ^ i2;
    }
}
