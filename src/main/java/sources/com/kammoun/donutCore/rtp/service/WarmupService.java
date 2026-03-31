package com.kammoun.donutCore.rtp.service;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.rtp.config.ConfigManager;
import com.kammoun.donutCore.rtp.util.ChatUtil;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class WarmupService {
    private final ConfigManager configManager;
    private final Map<UUID, WarmupTask> warmups;

    private static int f770BXmOWbQeT = 0;
    private transient int Avi2t2Dwul = 437872057;
    private static byte[] gycruhxyhp;
    private static String[] nothing_to_see_here = new String[18];

    public class WarmupTask {
        private final Player player;
        private final Location startLocation;
        private final Location targetLocation;
        private final long warmupTime;
        private final Runnable onComplete;
        private final Runnable onCancel;
        private SchedulerUtil.Task task;
        private long remainingTime;
        final WarmupService this$0;
        private static int AC9Kg8cSbs = 0;
        private transient int YL96SV2Zp9 = 106842626;
        private static byte[] cqbabggpak;
        private static String[] nothing_to_see_here = new String[19];

        public WarmupTask(WarmupService warmupService, Player player, Location location, Location location2, long j, Runnable runnable, Runnable runnable2, int i) {
            int i2 = 217406871 ^ 939270394;
            this.this$0 = warmupService;
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 39999498:
                        int i3 = 1872651615 ^ i2;
                        break;
                    case 1717343693:
                    case 1841081419:
                        break;
                    case 2033914238:
                    default:
                        throw new IllegalAccessException();
                }
            }
            int parseInt = 1015634846 ^ (1194887473 ^ Integer.parseInt("791071389"));
            this.YL96SV2Zp9 = 106842626 ^ AC9Kg8cSbs;
            int qkgjldzsnnwzkpdt = 159739630 ^ qkgjldzsnnwzkpdt(parseInt, 502344672);
            this.player = player;
            this.startLocation = location;
            this.targetLocation = location2;
            this.warmupTime = j;
            this.onComplete = runnable;
            this.onCancel = runnable2;
            this.remainingTime = j;
            int i4 = 226574156 ^ (453641183 ^ (1505986856 ^ (1197000770 ^ (2039753963 ^ (514227735 ^ (841358064 ^ qkgjldzsnnwzkpdt))))));
        }

        public void start(int i) {
            int i2 = 1162960297 ^ (354485274 ^ 74006247);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1597293918) {
                i2 = 729785865 ^ i2;
                this.task = SchedulerUtil.runTimer(() -> {
                    int i3;
                    int qkgjldzsnnwzkpdt;
                    int i4 = 199370644 ^ (1614868594 ^ 74006247);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2120173579) {
                        int i5 = 2139969398 ^ i4;
                        if (this.player.isOnline() != (273071735 ^ i5)) {
                            int qkgjldzsnnwzkpdt2 = qkgjldzsnnwzkpdt(i5, 1660434536);
                            if (this.this$0.shouldCancelOnMove(1917706593) != (1925088799 ^ qkgjldzsnnwzkpdt2)) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == -1779158789) {
                                    i4 = 1594972541 ^ qkgjldzsnnwzkpdt2;
                                    if (hasMoved(401157407) == (766500706 ^ i4)) {
                                        i3 = qkgjldzsnnwzkpdt(i4, 1319643231);
                                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1837038353) {
                                        int i6 = 2141880776 ^ i4;
                                        this.this$0.cancelWarmup(this.player, hrjifpezyu(kdedeofyrixhhhq(), i6), 1932742771);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1876232878) {
                                            int i7 = 1039416438 ^ i6;
                                            return;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2139821795 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1535136953 ^ i6)) {
                                                int i8 = 545538658 ^ i6;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1876232878 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (761987218 ^ i6)) {
                                                    break;
                                                }
                                            }
                                        }
                                        int i9 = 158062879 ^ i6;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == -2029963237 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == (781052001 ^ qkgjldzsnnwzkpdt2)) {
                                        int i10 = 841047349 ^ qkgjldzsnnwzkpdt2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == -1779158789 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == (620247821 ^ qkgjldzsnnwzkpdt2)) {
                                            int i11 = 371612724 ^ qkgjldzsnnwzkpdt2;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == -202436936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == (1845504999 ^ qkgjldzsnnwzkpdt2)) {
                                                int i12 = 836138987 ^ qkgjldzsnnwzkpdt2;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == -737771128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == (607292685 ^ qkgjldzsnnwzkpdt2)) {
                                                    int i13 = 1820945071 ^ qkgjldzsnnwzkpdt2;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == 1245544163 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == (833269341 ^ qkgjldzsnnwzkpdt2)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int i14 = 1182886084 ^ qkgjldzsnnwzkpdt2;
                                throw new IOException();
                            }
                            i3 = 297365794 ^ qkgjldzsnnwzkpdt2;
                            this.remainingTime--;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 406829547) {
                                int i15 = 1290478450 ^ i3;
                                if ((this.remainingTime > 0L ? 1 : (this.remainingTime == 0L ? 0 : -1)) > (804049999 ^ i15)) {
                                    int qkgjldzsnnwzkpdt3 = qkgjldzsnnwzkpdt(i15, 1972662871);
                                    ConfigManager configManager = this.this$0.configManager;
                                    String hrjifpezyu = hrjifpezyu(hwsainqwdtgckcp(), qkgjldzsnnwzkpdt3);
                                    String[] strArr = new String[(byte) (1517856282 ^ qkgjldzsnnwzkpdt3)];
                                    strArr[(byte) (1517856280 ^ qkgjldzsnnwzkpdt3)] = hrjifpezyu(pepvyfozrsrojnc(), qkgjldzsnnwzkpdt3);
                                    strArr[(byte) (1517856281 ^ qkgjldzsnnwzkpdt3)] = ChatUtil.formatTime(this.remainingTime, 1008664112);
                                    String message = configManager.getMessage(hrjifpezyu, strArr, 1815121614);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt3) == -742051646) {
                                        qkgjldzsnnwzkpdt2 = 714637595 ^ qkgjldzsnnwzkpdt3;
                                        ChatUtil.sendActionBar(this.player, message, 2066892028);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == -2029963237) {
                                            i4 = 1398367811 ^ qkgjldzsnnwzkpdt2;
                                            this.player.playSound(this.player, Sound.BLOCK_NOTE_BLOCK_HAT, 1.0f, 1.5f);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 499780097) {
                                                i5 = 1525630830 ^ i4;
                                                if ((this.remainingTime > 5L ? 1 : (this.remainingTime == 5L ? 0 : -1)) > (2035680814 ^ i5)) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -894422669) {
                                                        qkgjldzsnnwzkpdt3 = 80746176 ^ i5;
                                                        if (((this.remainingTime % 5) > 0L ? 1 : ((this.remainingTime % 5) == 0L ? 0 : -1)) != (2105938158 ^ qkgjldzsnnwzkpdt3)) {
                                                            int i16 = 1677455673 ^ qkgjldzsnnwzkpdt3;
                                                            return;
                                                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt3) == -332363917) {
                                                            qkgjldzsnnwzkpdt = 520813060 ^ qkgjldzsnnwzkpdt3;
                                                        }
                                                    }
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -894422669 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (767791190 ^ i5)) {
                                                            int i17 = 122105928 ^ i5;
                                                            throw new IllegalAccessException("double");
                                                        }
                                                    }
                                                } else {
                                                    qkgjldzsnnwzkpdt = qkgjldzsnnwzkpdt(i5, 467332292);
                                                }
                                                ConfigManager configManager2 = this.this$0.configManager;
                                                String hrjifpezyu2 = hrjifpezyu(fvqzyzshdotszek(), qkgjldzsnnwzkpdt);
                                                String[] strArr2 = new String[(byte) (1653402344 ^ qkgjldzsnnwzkpdt)];
                                                strArr2[(byte) (1653402346 ^ qkgjldzsnnwzkpdt)] = hrjifpezyu(vsdshoyhbootsbw(), qkgjldzsnnwzkpdt);
                                                strArr2[(byte) (1653402347 ^ qkgjldzsnnwzkpdt)] = ChatUtil.formatTime(this.remainingTime, 1008664112);
                                                String message2 = configManager2.getMessage(hrjifpezyu2, strArr2, 1815121614);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt) != 342316883) {
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt) == 342316883 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt) == (442943251 ^ qkgjldzsnnwzkpdt)) {
                                                            break;
                                                        }
                                                    }
                                                    int i18 = 1817688319 ^ qkgjldzsnnwzkpdt;
                                                    throw new IOException("double");
                                                }
                                                i3 = 176236288 ^ qkgjldzsnnwzkpdt;
                                                ChatUtil.sendMessage(this.player, message2, 431932631);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1080979283) {
                                                    int i19 = 1987062845 ^ i3;
                                                    return;
                                                }
                                            }
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == -2029963237) {
                                                int i102 = 841047349 ^ qkgjldzsnnwzkpdt2;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == -1779158789) {
                                                    int i112 = 371612724 ^ qkgjldzsnnwzkpdt2;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == -202436936) {
                                                        int i122 = 836138987 ^ qkgjldzsnnwzkpdt2;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == -737771128) {
                                                            int i132 = 1820945071 ^ qkgjldzsnnwzkpdt2;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt2) == 1245544163) {
                                                                break;
                                                                break;
                                                            }
                                                            continue;
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                        int i142 = 1182886084 ^ qkgjldzsnnwzkpdt2;
                                        throw new IOException();
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt3) == -332363917 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt3) == (831760532 ^ qkgjldzsnnwzkpdt3)) {
                                            int i20 = 984036661 ^ qkgjldzsnnwzkpdt3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt3) == -742051646 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qkgjldzsnnwzkpdt3) == (260235746 ^ qkgjldzsnnwzkpdt3)) {
                                                break;
                                            }
                                        }
                                    }
                                    int i21 = 1399421573 ^ qkgjldzsnnwzkpdt3;
                                    throw new IllegalAccessException("double");
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != 2137432697) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 2137432697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (1476626847 ^ i15)) {
                                            break;
                                        }
                                    }
                                    int i22 = 437769412 ^ i15;
                                    throw new IllegalAccessException("double");
                                }
                                int i23 = 1477731768 ^ i15;
                                cancel();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) != -1077571653) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) == -1077571653 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) == (1196923464 ^ i23)) {
                                            break;
                                        }
                                    }
                                    int i24 = 766579485 ^ i23;
                                    throw new IllegalAccessException("double");
                                }
                                i4 = 442439967 ^ i23;
                                this.this$0.warmups.remove(this.player.getUniqueId());
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1832732483) {
                                    i5 = 1179689629 ^ i4;
                                    this.onComplete.run();
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 406829547 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1996949996 ^ i3)) {
                                    int i25 = 1661171033 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1080979283 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1705444561 ^ i3)) {
                                        break;
                                    }
                                }
                            }
                            int i26 = 1502820317 ^ i3;
                            throw new IllegalAccessException("double");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2110393416) {
                            int i27 = 1521029572 ^ i5;
                            cancel();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i27) != 1467841946) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i27) == 1467841946 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i27) == (83545260 ^ i27)) {
                                        break;
                                    }
                                }
                                int i28 = 481354092 ^ i27;
                                throw new RuntimeException("double");
                            }
                            int i29 = 1139955718 ^ i27;
                            this.this$0.warmups.remove(this.player.getUniqueId());
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i29) != 1223671208) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i29) == 1223671208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i29) == (160619429 ^ i29)) {
                                        break;
                                    }
                                }
                                int i30 = 823548064 ^ i29;
                                throw new RuntimeException("double");
                            }
                            i5 = 23365217 ^ i29;
                            if (this.onCancel != null) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1137413792) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1137413792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (966110797 ^ i5)) {
                                            break;
                                        }
                                    }
                                    int i31 = 1386691503 ^ i5;
                                    throw new RuntimeException("double");
                                }
                                i4 = 713861240 ^ i5;
                                this.onCancel.run();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 397331809) {
                                    int i32 = 629971232 ^ i4;
                                    return;
                                }
                            }
                            while (true) {
                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i5)) {
                                    case 7030003:
                                        int i33 = 251670872 ^ i5;
                                        return;
                                    case 233929332:
                                        return;
                                    case 1607124220:
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1605915561 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1311402212 ^ i5)) {
                                int i34 = 1463937283 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2110393416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1872942963 ^ i5)) {
                                    int i35 = 1031602299 ^ i5;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 499780097 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1569880157 ^ i4)) {
                            int i36 = 544693606 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1832732483 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (452754865 ^ i4)) {
                                int i37 = 302592955 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 397331809 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2013986118 ^ i4)) {
                                    int i38 = 270652863 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1837038353 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1488718450 ^ i4)) {
                                        int i39 = 305986654 ^ i4;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2120173579 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1425666195 ^ i4)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i40 = 336457048 ^ i4;
                    throw new RuntimeException("double");
                }, 0L, 20L, 2041710047);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -80344341) {
                    int i3 = 1497354630 ^ i2;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 852002521 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (956053081 ^ i2)) {
                    int i4 = 1178924645 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1597293918 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1950223544 ^ i2)) {
                        int i5 = 1084830510 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -80344341 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2041987870 ^ i2)) {
                            break;
                        }
                    }
                }
            }
            int i6 = 758703505 ^ i2;
            throw new IllegalAccessException();
        }

        private boolean hasMoved(int r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.service.WarmupService.WarmupTask.hasMoved(int):boolean");
        }

        public void cancel() {
            int i = 664758104 ^ (966180776 ^ 74006247);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -754503496) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -754503496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (994507972 ^ i)) {
                        break;
                    }
                }
                int i2 = 1123005624 ^ i;
                throw new RuntimeException("double");
            }
            int i3 = 658070967 ^ i;
            if (this.task != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -355607295) {
                    i3 = 1207754886 ^ i3;
                    this.task.cancel(1520188267);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -718612173) {
                        int i4 = 762305396 ^ i3;
                        return;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -718612173 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1515103632 ^ i3)) {
                        int i5 = 765615304 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -355607295 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2089667374 ^ i3)) {
                            break;
                        }
                    }
                }
                int i6 = 1684637464 ^ i3;
                throw new IllegalAccessException();
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                    case 115205855:
                        int i7 = 1788034034 ^ i3;
                        return;
                    case 1606855756:
                        return;
                    case 1991645340:
                    default:
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1101790574 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1895164201 ^ i3)) {
                                int i8 = 989994726 ^ i3;
                                throw new IOException("double");
                            }
                        }
                        break;
                    case 2016517583:
                }
            }
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
            cqbabggpak = rldjgyrwknuxbfe();
            AC9Kg8cSbs = 1758928469 ^ new Random(-1886450013429037238L).nextInt();
        }

        public static String hrjifpezyu(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= bArr.length) {
                    return new String(bArr, StandardCharsets.UTF_16);
                }
                bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                bArr[i3] = (byte) (bArr[i3] ^ cqbabggpak[i3 % cqbabggpak.length]);
                i2 = i3 + 1;
            }
        }

        private static byte[] rldjgyrwknuxbfe() {
            return new byte[]{126, 51, 69, 24, 42, 37, 104, 77, 5, 111, 122, 2, 25, 60, 105, 94, 96, 62, 86, 1, 112, 73, 29, 42, 68, 13, 55, 41, 81, 27, 11, 97, 87, 57, 15, 64, 24, 5, 36, 17, 18, 70, 54, 24, 16, 17, 7, 61, 85, 22, 92, 9, 94, 61, 14, 50, 1, 45, 14, 104, 36, 115, 97, 94, 108, 24, 63, 107, 33, 21, 54, 108, 87, 16, 3, 66, 90, 77, 30, 23, 103, 123, 104, 6, 66, 104, 116, 49, 75, 42, 94, 99, 92, 5, 112, 2, 55, 67, 31, 62, 32, 96, 90, 23, 97, 28, 102, 74, 115, 36, 105, 24, 18, 111, 88, 65, 48, 66, 115};
        }

        private static byte[] kdedeofyrixhhhq() {
            return new byte[]{-79, -1, 114, 67, 26, 114, 91, 13, 55, 60, 75, 85};
        }

        private static byte[] hwsainqwdtgckcp() {
            return new byte[]{-79, -7, 116, 88, 18, 113, 94, 13, 61, 50, 75, 66, 40, 123, 81, 70, 86, Byte.MAX_VALUE, 110, 69, 65, 29, 44, 111, 124, 76, 1, 126, 105, 79, 58, 121, 102, 111, 55, 22, 46, 67, 28, 72, 35, 28, 7, 65, 40, 70, 49, 110, 109, 84};
        }

        private static byte[] pepvyfozrsrojnc() {
            return new byte[]{-79, -7, 116, 91, 18, 121, 94, 18, 61, 58};
        }

        private static byte[] fvqzyzshdotszek() {
            return new byte[]{-79, -6, 112, 92, 30, 116, 90, 12, 49, 52, 75, 65, 44, Byte.MAX_VALUE, 93, 67, 82, 126, 98, 67, 65, 30, 40, 107, 112, 73, 5, Byte.MAX_VALUE, 101, 73};
        }

        private static byte[] vsdshoyhbootsbw() {
            return new byte[]{-79, -6, 112, 95, 30, 124, 90, 19, 49, 60};
        }

        private static int qkgjldzsnnwzkpdt(int i, int i2) {
            return i ^ i2;
        }
    }

    public WarmupService(com.kammoun.donutCore.rtp.config.ConfigManager r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.service.WarmupService.<init>(com.kammoun.donutCore.rtp.config.ConfigManager, int):void");
    }

    public boolean hasWarmup(UUID uuid, int i) {
        int i2 = 865516244 ^ (712881758 ^ 1151017190);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -343841950) {
            int i3 = 1314694917 ^ i2;
            return this.warmups.containsKey(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1721476280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (718206327 ^ i2)) {
                int i4 = 1711575216 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -343841950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (749983285 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1199480555 ^ i2;
        throw new IOException();
    }

    public void startWarmup(Player player, Location location, Runnable runnable, Runnable runnable2, int i) {
        int i2 = 1956813448 ^ (1444743048 ^ 1151017190);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 824569651) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 824569651 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (489795141 ^ i2)) {
                    break;
                }
            }
            int i3 = 1053465155 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 543363548 ^ i2;
        if (this.configManager.isEnableWarmup(310470316) != (1179102266 ^ i4)) {
            i4 = 508200894 ^ i4;
            UUID uniqueId = player.getUniqueId();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1066836958) {
                int i5 = 1180718434 ^ i4;
                cancelWarmup(uniqueId, 1185135967);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -211028176) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -211028176 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1484545234 ^ i5)) {
                            break;
                        }
                    }
                    int i6 = 189656476 ^ i5;
                    throw new IllegalAccessException("double");
                }
                int i7 = 862411678 ^ i5;
                long warmupTime = this.configManager.getWarmupTime(359073699);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 1750150081) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1750150081 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (394878951 ^ i7)) {
                            break;
                        }
                    }
                    int i8 = 151134600 ^ i7;
                    throw new IllegalAccessException("double");
                }
                int i9 = 947967110 ^ i7;
                Location clone = player.getLocation().clone();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -1403547664) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1403547664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (410105935 ^ i9)) {
                            break;
                        }
                    }
                    int i10 = 707018758 ^ i9;
                    throw new IOException("double");
                }
                int i11 = 178439415 ^ i9;
                WarmupTask warmupTask = new WarmupTask(this, player, clone, location, warmupTime, runnable, runnable2, 1012597686);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != -113137592) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -113137592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (317576041 ^ i11)) {
                            break;
                        }
                    }
                    int i12 = 1299479692 ^ i11;
                    throw new IOException("double");
                }
                int i13 = 1919948659 ^ i11;
                this.warmups.put(uniqueId, warmupTask);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) != 1791038419) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1791038419 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (919731565 ^ i13)) {
                            break;
                        }
                    }
                    int i14 = 1088971104 ^ i13;
                    throw new IOException("double");
                }
                i4 = 494660964 ^ i13;
                warmupTask.start(314599783);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2128709389) {
                    int i15 = 221063623 ^ i4;
                    return;
                }
            }
        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 842883538) {
            int i16 = 1794475384 ^ i4;
            runnable.run();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == 1704020497) {
                int i17 = 359592791 ^ i16;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == 1704020497 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (1101020870 ^ i16)) {
                    break;
                }
            }
            int i18 = 493967787 ^ i16;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1066836958 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1448809095 ^ i4)) {
                int i19 = 1389550687 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2128709389 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1508916299 ^ i4)) {
                    int i20 = 1278244665 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -823734103 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1516526329 ^ i4)) {
                        int i21 = 1009382828 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -394840373 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1827401223 ^ i4)) {
                            int i22 = 1999263804 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 842883538 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1426242580 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i23 = 853601528 ^ i4;
        throw new RuntimeException();
    }

    public void cancelWarmup(UUID uuid, int i) {
        int i2 = 1468934178 ^ (539528882 ^ 1151017190);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1712573519) {
            i2 = 1720778838 ^ i2;
            WarmupTask remove = this.warmups.remove(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1385942782) {
                i2 = 1059758562 ^ i2;
                if (remove != null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1412513299) {
                        i2 = 1627742477 ^ i2;
                        remove.cancel();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1545221752) {
                            int i3 = 899930710 ^ i2;
                            return;
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                        case 241403777:
                            int i4 = 1420213083 ^ i2;
                            return;
                        case 715392094:
                        case 764144957:
                            return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1412513299 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (111769098 ^ i2)) {
                    int i5 = 188277478 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1385942782 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1250644133 ^ i2)) {
                        break;
                    }
                }
            }
            int i6 = 388350092 ^ i2;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1545221752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (877227619 ^ i2)) {
                int i7 = 153950975 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -251337527 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (25101548 ^ i2)) {
                    int i8 = 1528260333 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1712573519 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1926161776 ^ i2)) {
                        int i9 = 2133533635 ^ i2;
                        throw new RuntimeException();
                    }
                }
            }
        }
    }

    public void cancelWarmup(org.bukkit.entity.Player r5, java.lang.String r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.service.WarmupService.cancelWarmup(org.bukkit.entity.Player, java.lang.String, int):void");
    }

    public void clearAll(int i) {
        int i2 = 689455382 ^ (1176675038 ^ 1151017190);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1561205105) {
            i2 = 475013650 ^ i2;
            this.warmups.values().forEach((v0) -> {
                v0.cancel();
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1081144863) {
                int i3 = 1508784106 ^ i2;
                this.warmups.clear();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1895741107) {
                    int i4 = 511901599 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1895741107 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (343989632 ^ i3)) {
                        break;
                    }
                }
                int i5 = 692283286 ^ i3;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1561205105 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (444982865 ^ i2)) {
                int i6 = 1993391194 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1081144863 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (38007723 ^ i2)) {
                    break;
                }
            }
        }
        int i7 = 1498634364 ^ i2;
        throw new IOException();
    }

    public boolean shouldCancelOnMove(int i) {
        int i2 = 1622853762 ^ (1342327967 ^ 1151017190);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1591924773) {
            int i3 = 1389416218 ^ i2;
            return this.configManager.isCancelOnMove(1576913060);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1591924773 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1856414120 ^ i2)) {
                int i4 = 49982037 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 932929289 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1923945814 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1271065758 ^ i2;
        throw new RuntimeException();
    }

    public boolean shouldCancelOnDamage(int i) {
        int i2 = 2001584096 ^ (1986352752 ^ 1151017190);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 765348786) {
            int i3 = 458940423 ^ i2;
            return this.configManager.isCancelOnDamage(1430341405);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -146191478 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1409345411 ^ i2)) {
                int i4 = 1012213200 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 765348786 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (30538016 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2101343203 ^ i2;
        throw new IOException();
    }

    public boolean shouldCancelOnTeleport(int i) {
        int i2 = 1816582253 ^ (992263290 ^ 1151017190);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1614141560) {
            int i3 = 1531507530 ^ i2;
            return this.configManager.isCancelOnTeleport(1221835000);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1614141560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2073427271 ^ i2)) {
                int i4 = 1132980425 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1166917082 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (533630722 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2054204663 ^ i2;
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
        gycruhxyhp = lzuludmparqbzih();
        f770BXmOWbQeT = (-898792055) ^ new Random(2850726582918363271L).nextInt();
    }

    public static String txdedugorg(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ gycruhxyhp[i3 % gycruhxyhp.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] lzuludmparqbzih() {
        return new byte[]{109, 97, 64, 91, 124, 96, 34, 50, 81, 83, 58, 84, 16, 95, 63, 17, 82, 103, 11, 56, 39, 125, 51, 121, 18, 72, 105, 71, 95, 21, 95, 8, 43, 22, 113, 45, 21, 39, 68};
    }

    private static byte[] wliwvnxqxunplem() {
        return new byte[]{-94, -85, 121, 25, 78, 56, 19, 120, 104, 12, 11, 20, 41, 26, 13, 5, 99, 60, 50, 107, 22, 38, 10, 47, 32, 20, 88, 19, 102, 75, 110, 88, 18, 71};
    }

    private static int jzfqnevgznfpabtl(int i, int i2) {
        return i ^ i2;
    }
}
