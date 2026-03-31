package com.kammoun.donutCore.home.managers;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.api.utils.location.Klocation;
import com.kammoun.donutCore.home.HomePlugin;
import com.kammoun.donutCore.home.managers.MessagesManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class TeleportManager {
    private final HomePlugin plugin;
    private final ConfigManager configManager;
    private final MessagesManager messagesManager;
    private final Map<UUID, TeleportTask> activeTeleports;
    private static int MO7mTHzyvp = 0;

    private transient int f6601m7cAUNzZ = 1372788154;
    private static String[] nothing_to_see_here = new String[18];

    public class TeleportTask {
        private final Player player;
        private final Klocation destination;
        private final Location startLocation;
        private int timeRemaining;
        private SchedulerUtil.Task task;
        final TeleportManager this$0;
        private static int tMI2gGKO8I = 0;
        private transient int NqJfhhWokm = 100396037;
        private static byte[] mtldqeinls;
        private static String[] nothing_to_see_here = new String[19];

        public TeleportTask(TeleportManager teleportManager, Player player, Klocation klocation, Location location, int i, int i2) {
            int i3 = 1018559450 ^ 831864389;
            this.this$0 = teleportManager;
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                    case 158299076:
                        int i4 = 405481522 ^ i3;
                        break;
                    case 1130148851:
                        break;
                    case 1255633944:
                    case 1784933812:
                    default:
                        throw new RuntimeException();
                }
            }
            int parseInt = 998214894 ^ (120321022 ^ Integer.parseInt("694129341"));
            this.NqJfhhWokm = 100396037 ^ tMI2gGKO8I;
            this.player = player;
            this.destination = klocation;
            this.startLocation = location;
            this.timeRemaining = i;
            int i5 = 1658612955 ^ (829122286 ^ (1574886405 ^ (1341321303 ^ (157204491 ^ (2110667530 ^ parseInt)))));
        }

        public void start(int i) {
            int i2 = 767996346 ^ (1525204360 ^ 1112289005);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1424828679) {
                i2 = 1121224019 ^ i2;
                this.task = SchedulerUtil.runTimer(() -> {
                    int i3;
                    int i4 = 1613189266 ^ (317193114 ^ 1112289005);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2073809111) {
                        int i5 = 1617876998 ^ i4;
                        if (hasMoved(1691515984) != (1357012451 ^ i5)) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2028802278) {
                                i3 = 1163920249 ^ i5;
                                this.this$0.messagesManager.sendMessage(this.player, MessagesManager.MessageKey.MOVE_CANCEL_TELEPORT, new String[(byte) (360865434 ^ i3)], 553750940);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1408043824) {
                                    i5 = 78894410 ^ i3;
                                    cancel(2137305813);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1987289472) {
                                        int i6 = 403573166 ^ i5;
                                        this.this$0.activeTeleports.remove(this.player.getUniqueId());
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1241256944) {
                                            int i7 = 1320006423 ^ i6;
                                            return;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1241256944 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (866787137 ^ i6)) {
                                                break;
                                            }
                                        }
                                        int i8 = 338500689 ^ i6;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2122456998 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1550882022 ^ i5)) {
                                    int i9 = 1311699298 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2028802278 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (273044069 ^ i5)) {
                                        int i10 = 1039766260 ^ i5;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -707063718 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (975599303 ^ i5)) {
                                            int i11 = 1300683890 ^ i5;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1987289472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1897633909 ^ i5)) {
                                                int i12 = 606055796 ^ i5;
                                                throw new IllegalAccessException("double");
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            i4 = 1734336268 ^ i5;
                            if (this.timeRemaining <= (935166703 ^ i4)) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1108600967) {
                                    i4 = 742211146 ^ i4;
                                    this.this$0.teleportPlayer(this.player, this.destination, 2019299070);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -603593432) {
                                        i3 = 1178663902 ^ i4;
                                        cancel(2137305813);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -301843494) {
                                            i4 = 1469787523 ^ i3;
                                            this.this$0.activeTeleports.remove(this.player.getUniqueId());
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1108600967 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (169661624 ^ i4)) {
                                        int i13 = 725529742 ^ i4;
                                        throw new RuntimeException("double");
                                    }
                                }
                            } else {
                                i5 = cupmvikltefgqpba(i4, 1538103402);
                                MessagesManager messagesManager = this.this$0.messagesManager;
                                Player player = this.player;
                                MessagesManager.MessageKey messageKey = MessagesManager.MessageKey.TELEPORTING;
                                String[] strArr = new String[(byte) (1812994695 ^ i5)];
                                strArr[(byte) (1812994693 ^ i5)] = vlfisljknp(ffoimpiqioahooh(), i5);
                                byte b = (byte) (1812994692 ^ i5);
                                int i14 = this.timeRemaining;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1619055659) {
                                    i4 = 1198288320 ^ i5;
                                    strArr[b] = String.valueOf(i14);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1541650985) {
                                        i3 = 1951371836 ^ i4;
                                        messagesManager.sendActionBar(player, messageKey, strArr, 370822484);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -107009078) {
                                            i3 = 151520396 ^ i3;
                                            this.timeRemaining -= (byte) (1446765044 ^ i3);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1310781526) {
                                                int i15 = 101998078 ^ i3;
                                                return;
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1619055659 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (225622363 ^ i5)) {
                                        int i16 = 950966320 ^ i5;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -107009078 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (919897895 ^ i3)) {
                                int i17 = 1635586627 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -301843494 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1140465864 ^ i3)) {
                                    int i18 = 2137431294 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1016171338 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1791609433 ^ i3)) {
                                        int i19 = 1380604496 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1310781526 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1767417863 ^ i3)) {
                                            int i20 = 56718565 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1408043824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (804289508 ^ i3)) {
                                                int i21 = 425209969 ^ i3;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1997617992 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (103390291 ^ i3)) {
                                                    int i22 = 606578657 ^ i3;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1559418269 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (511988284 ^ i3)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int i23 = 1123430308 ^ i3;
                        throw new IllegalAccessException();
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -603593432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1004853418 ^ i4)) {
                            int i24 = 1274514110 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1390106560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (882720694 ^ i4)) {
                                int i25 = 1709173498 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1541650985 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1920359602 ^ i4)) {
                                    int i26 = 1026201672 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2073809111 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (141468250 ^ i4)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    int i27 = 138989764 ^ i4;
                    throw new IOException("double");
                }, 0L, 20L, 2041710047);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1112081309) {
                    int i3 = 1848303095 ^ i2;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1424828679 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1033641611 ^ i2)) {
                    int i4 = 614456613 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1112081309 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1425460559 ^ i2)) {
                        int i5 = 1561453754 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -857730088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (878469149 ^ i2)) {
                            break;
                        }
                    }
                }
            }
            int i6 = 1206215441 ^ i2;
            throw new RuntimeException();
        }

        public void cancel(int i) {
            int i2 = 1488526425 ^ (1300005032 ^ 1112289005);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1135767326) {
                i2 = 51712456 ^ i2;
                if (this.task != null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1528488286) {
                        i2 = 130124025 ^ i2;
                        this.task.cancel(1520188267);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1695983254) {
                            int i3 = 815215078 ^ i2;
                            return;
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                        case 66005494:
                            int i4 = 928430367 ^ i2;
                            return;
                        case 309684646:
                        case 1041995161:
                            return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1135767326 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1965451866 ^ i2)) {
                    int i5 = 81785242 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1695983254 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1105592514 ^ i2)) {
                        int i6 = 1741756208 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1528488286 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (409046776 ^ i2)) {
                            int i7 = 85454348 ^ i2;
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }

        private boolean hasMoved(int i) {
            boolean z;
            int i2 = 1275919761 ^ (1586793288 ^ 1112289005);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2036153950) {
                int i3 = 1035119683 ^ i2;
                Location location = this.player.getLocation();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1798808507) {
                    int i4 = 270975979 ^ i3;
                    if ((this.startLocation.getX() > location.getX() ? 1 : (this.startLocation.getX() == location.getX() ? 0 : -1)) == (2101360540 ^ i4)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -368984861) {
                            int i5 = 176800343 ^ i4;
                            Location location2 = this.startLocation;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1102074277) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1102074277 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (490931100 ^ i5)) {
                                        break;
                                    }
                                }
                                int i6 = 653630547 ^ i5;
                                throw new IllegalAccessException("double");
                            }
                            i3 = 1747212987 ^ i5;
                            if ((location2.getY() > location.getY() ? 1 : (location2.getY() == location.getY() ? 0 : -1)) != (535670640 ^ i3)) {
                                i4 = 1108997180 ^ i3;
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -9602176) {
                                i3 = 1333056162 ^ i3;
                                Location location3 = this.startLocation;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2067009902) {
                                    i2 = 355357655 ^ i3;
                                    if ((location3.getZ() > location.getZ() ? 1 : (location3.getZ() == location.getZ() ? 0 : -1)) == (1169632773 ^ i2)) {
                                        i3 = cupmvikltefgqpba(i2, 1373617479);
                                        z = (byte) (342397762 ^ i3);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1555785200) {
                                            int i7 = 2124647644 ^ i3;
                                            return z;
                                        }
                                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 767127594) {
                                        i4 = 407074121 ^ i2;
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -274539934 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (28406686 ^ i4)) {
                                int i8 = 1939137771 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -368984861 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (850172661 ^ i4)) {
                                    break;
                                }
                            }
                        }
                        int i9 = 634398802 ^ i4;
                        throw new RuntimeException("double");
                    }
                    i4 = 548695248 ^ i4;
                    z = (byte) (1576295245 ^ i4);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -274539934) {
                        int i10 = 1358610027 ^ i4;
                        try {
                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i10) != 156030709) {
                                throw null;
                            }
                            throw new IOException();
                        } catch (IOException e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case 1307829425:
                                    i3 = 1763255278 ^ i10;
                                    break;
                                case 1752639800:
                                    i3 = 1302968927 ^ i10;
                                    break;
                                default:
                                    throw new IOException("Error in hash");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 87751618) {
                                cupmvikltefgqpba(i3, 711737574);
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -274539934) {
                            int i82 = 1939137771 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -368984861) {
                                break;
                                break;
                            }
                            continue;
                        }
                    }
                    int i92 = 634398802 ^ i4;
                    throw new RuntimeException("double");
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 87751618 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1309793411 ^ i3)) {
                        int i11 = 2066598862 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1555785200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1710752792 ^ i3)) {
                            int i12 = 1634886735 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -9602176 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1309365842 ^ i3)) {
                                int i13 = 397328989 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1798808507 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (196474279 ^ i3)) {
                                    int i14 = 230436792 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2067009902 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (45244689 ^ i3)) {
                                        int i15 = 1812860477 ^ i3;
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2036153950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (758412367 ^ i2)) {
                    int i16 = 741929724 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 767127594 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1791741674 ^ i2)) {
                        break;
                    }
                }
            }
            int i17 = 579228166 ^ i2;
            throw new RuntimeException("double");
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
            mtldqeinls = kuclpudrpunkqnu();
            tMI2gGKO8I = 1126456015 ^ new Random(1061518572643698103L).nextInt();
        }

        public static String vlfisljknp(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= bArr.length) {
                    return new String(bArr, StandardCharsets.UTF_16);
                }
                bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                bArr[i3] = (byte) (bArr[i3] ^ mtldqeinls[i3 % mtldqeinls.length]);
                i2 = i3 + 1;
            }
        }

        private static byte[] kuclpudrpunkqnu() {
            return new byte[]{73, 64, 105, 4, 82, 99, 2, 99, 25, 19, 121, 66, 94, 40, 105, 103, 104, 45, 36, 46, 24, 80, 36, 95, 2, 45, 100, 118, 63, 93, 112, 91, 124, 79, 85, 56, 125, 114, 117, 92, 122, 94, 26, 79, 13, 98, 109};
        }

        private static byte[] ffoimpiqioahooh() {
            return new byte[]{-122, -121, 88, 19, 107, 41, 54, 48, 32, 67, 72, 21, 111, 116, 80, 58, 92, 104, 29, 56};
        }

        private static int cupmvikltefgqpba(int i, int i2) {
            return i2 ^ i;
        }
    }

    public TeleportManager(com.kammoun.donutCore.home.HomePlugin r5, com.kammoun.donutCore.home.managers.ConfigManager r6, com.kammoun.donutCore.home.managers.MessagesManager r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.managers.TeleportManager.<init>(com.kammoun.donutCore.home.HomePlugin, com.kammoun.donutCore.home.managers.ConfigManager, com.kammoun.donutCore.home.managers.MessagesManager, int):void");
    }

    public void startTeleport(Player player, Klocation klocation, int i) {
        int i2 = 1248144013 ^ (1005443501 ^ 830872933);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 7828010) {
            int i3 = 2003271861 ^ i2;
            cancelTeleport(player.getUniqueId(), 930738608);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1152682111) {
                i3 = 876158435 ^ i3;
                if (player.hasPermission(ctpirhvsaj(zjpaqbfimzvrrna(), ocdhxmlpvxdppzr(), i3)) != (55603987 ^ i3)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 444831896) {
                        i2 = 1142980062 ^ i3;
                        teleportPlayer(player, klocation, 2019299070);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 998274666) {
                            int i4 = 762776043 ^ i2;
                            return;
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 444831896 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (462852335 ^ i3)) {
                            int i5 = 118220111 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -868567503 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (929114292 ^ i3)) {
                                int i6 = 1055801583 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1722662480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (939065314 ^ i3)) {
                                    int i7 = 1316401883 ^ i3;
                                    throw new IllegalAccessException();
                                }
                            }
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                        case 52127921:
                            i3 = 276445989 ^ i3;
                            break;
                        case 405681700:
                        case 941840794:
                            break;
                    }
                }
                int homeTeleportDelay = this.configManager.getHomeTeleportDelay(255880667);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1722662480) {
                    int i8 = 1176997770 ^ i3;
                    Location location = player.getLocation();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1469170206) {
                        i3 = 1821020538 ^ i8;
                        TeleportTask teleportTask = new TeleportTask(this, player, klocation, location, homeTeleportDelay, 1228803281);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -868567503) {
                            int i9 = 643671075 ^ i3;
                            this.activeTeleports.put(player.getUniqueId(), teleportTask);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -19425496) {
                                int i10 = 1898507925 ^ i9;
                                teleportTask.start(1928282535);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 2005984131) {
                                    int i11 = 1362054568 ^ i10;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 2005984131 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (194500115 ^ i10)) {
                                        int i12 = 529919326 ^ i10;
                                        throw new IOException("double");
                                    }
                                }
                            } else {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -19425496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (975978454 ^ i9)) {
                                        int i13 = 671063814 ^ i9;
                                        throw new IOException("double");
                                    }
                                }
                            }
                        }
                    } else {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1469170206 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2014597952 ^ i8)) {
                                int i14 = 389991399 ^ i8;
                                throw new IOException("double");
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 444831896) {
                        int i52 = 118220111 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -868567503) {
                            continue;
                        } else {
                            int i62 = 1055801583 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1722662480) {
                                int i72 = 1316401883 ^ i3;
                                throw new IllegalAccessException();
                            }
                            continue;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1152682111 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1570490983 ^ i3)) {
                    int i15 = 2036592392 ^ i3;
                    throw new IOException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 998274666 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1283671766 ^ i2)) {
                int i16 = 71180898 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 7828010 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (426295896 ^ i2)) {
                    break;
                }
            }
        }
        int i17 = 674533423 ^ i2;
        throw new IOException("double");
    }

    public void cancelTeleport(UUID uuid, int i) {
        int i2 = 47164725 ^ (376646942 ^ 830872933);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 701819505) {
            i2 = 1230030420 ^ i2;
            TeleportTask remove = this.activeTeleports.remove(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1666373843) {
                i2 = 1258604081 ^ i2;
                if (remove == null) {
                    int i3 = 1242832429 ^ i2;
                    return;
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 997517657) {
                    i2 = 1873573814 ^ i2;
                    remove.cancel(2137305813);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1175934186) {
                        int i4 = 632842651 ^ i2;
                        return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1666373843 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1064660449 ^ i2)) {
                int i5 = 865327325 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1809061939 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (324526271 ^ i2)) {
                    int i6 = 303638667 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 701819505 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1657337303 ^ i2)) {
                        int i7 = 485106545 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 997517657 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (326125560 ^ i2)) {
                            int i8 = 825647436 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1175934186 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (959098330 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i9 = 1770066812 ^ i2;
        throw new IOException();
    }

    public boolean hasActiveTeleport(UUID uuid) {
        int i = 2000601638 ^ (267025625 ^ 830872933);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1251286226) {
            int i2 = 390361959 ^ i;
            return this.activeTeleports.containsKey(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -256473110 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1136620229 ^ i)) {
                int i3 = 1488791732 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1251286226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1854171001 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 126825226 ^ i;
        throw new IllegalAccessException();
    }

    private void teleportPlayer(org.bukkit.entity.Player r7, com.kammoun.donutCore.api.utils.location.Klocation r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.managers.TeleportManager.teleportPlayer(org.bukkit.entity.Player, com.kammoun.donutCore.api.utils.location.Klocation, int):void");
    }

    public void shutdown(int i) {
        int i2 = 829729749 ^ (1736783898 ^ 830872933);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1002206547) {
            i2 = 1431404457 ^ i2;
            Iterator<TeleportTask> it = this.activeTeleports.values().iterator();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1858631655) {
                int i3 = 664986574;
                while (true) {
                    int i4 = i3 ^ i2;
                    if (it.hasNext() == (360977101 ^ i4)) {
                        i2 = sldmuiobltvumaxi(i4, 1783554627);
                        this.activeTeleports.clear();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -27818893) {
                            int i5 = 1726681839 ^ i2;
                            return;
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1407150488) {
                        i2 = 1525920781 ^ i4;
                        TeleportTask next = it.next();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2075997698) {
                            i2 = 980634960 ^ i2;
                            next.cancel(2137305813);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1473815421) {
                                i2 = 2009275693 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 373274088) {
                                    int i6 = 551805535 ^ i2;
                                    try {
                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6) == 36031057) {
                                            throw new IllegalAccessException();
                                        }
                                        throw null;
                                    } catch (IllegalAccessException e) {
                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                            case -460291031:
                                                i2 = 815905997 ^ i6;
                                                break;
                                            case 287352593:
                                                i2 = sldmuiobltvumaxi(i6, 773306538);
                                                break;
                                            default:
                                                throw new IOException("Error in hash");
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1637704256) {
                                            i3 = 431472261;
                                        } else {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1637704256 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (951725756 ^ i2)) {
                                                    int i7 = 457012627 ^ i2;
                                                    throw new IllegalAccessException("double");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -921758968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (145159382 ^ i4)) {
                                int i8 = 1675313338 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1407150488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (454458645 ^ i4)) {
                                    int i9 = 1706872311 ^ i4;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -460291031 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1706022941 ^ i2)) {
                int i10 = 611301851 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 373274088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2130316711 ^ i2)) {
                    int i11 = 746171975 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1858631655 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (862035807 ^ i2)) {
                        int i12 = 1523978481 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -27818893 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1094063112 ^ i2)) {
                            int i13 = 1808801286 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1002206547 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1042863079 ^ i2)) {
                                int i14 = 1219716694 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2075997698 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1148471724 ^ i2)) {
                                    int i15 = 2002237057 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1473815421 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (351412709 ^ i2)) {
                                        int i16 = 2014435198 ^ i2;
                                        throw new IOException();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
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
        MO7mTHzyvp = 1619107867 ^ new Random(9078441410651895421L).nextInt();
    }

    public static String ctpirhvsaj(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] ocdhxmlpvxdppzr() {
        return new byte[]{10, 13, 65, 50, 26, 82, 94, 92, 104, 38, 118, 38, 1, 111, 69};
    }

    private static byte[] zjpaqbfimzvrrna() {
        return new byte[]{-63, -57, 119, 106, 41, 4, 102, 6, 93, 118, 64, 56, 50, 34, 125, 88, 56, 24, 4, 79, 97, 23, 100, 48, 19, 49, 16, 69, 92, 82, 50, 83, 116, 105, 44, 17, 109, 17, 80, 112, 67, 125, 55, 43};
    }

    private static int sldmuiobltvumaxi(int i, int i2) {
        return i2 ^ i;
    }
}
