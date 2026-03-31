package com.kammoun.donutCore.rtp.service;

import com.kammoun.donutCore.rtp.config.ConfigManager;
import com.kammoun.donutCore.rtp.util.ChatUtil;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import org.bukkit.entity.Player;

public class QueueService {
    private final ConfigManager configManager;
    private final Queue<QueuedTeleport> queue;
    private boolean processing;
    private static int PAJ0SeZ9GZ = 0;
    private transient int OEtDid28Ba = 421983370;
    private static byte[] hccznbxdav;
    private static String[] nothing_to_see_here = new String[19];

    public static class QueuedTeleport {
        private final UUID playerUuid;
        private final String worldName;
        private final Runnable teleportAction;
        private static int d0AetyJ73v = 0;
        private transient int KvEJMl7pZh = 1084346075;
        private static String[] nothing_to_see_here = new String[15];

        public QueuedTeleport(UUID uuid, String str, Runnable runnable, int i) {
            int i2 = 512591265 ^ (1465212213 ^ 1998906923);
            int parseInt = 449235134 ^ (1532037319 ^ Integer.parseInt("2137784006"));
            this.KvEJMl7pZh = 1084346075 ^ d0AetyJ73v;
            this.playerUuid = uuid;
            this.worldName = str;
            this.teleportAction = runnable;
            int i3 = 744744478 ^ (689603472 ^ (980323833 ^ (331390092 ^ (267604728 ^ parseInt))));
        }

        public UUID getPlayerUuid(int i) {
            int i2 = 1773615214 ^ (1199337400 ^ 1193681405);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1332457819) {
                int i3 = 2109326102 ^ i2;
                return this.playerUuid;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1566201368 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1276663001 ^ i2)) {
                    int i4 = 711311748 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1332457819 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1389687045 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1377773536 ^ i2;
            throw new IllegalAccessException();
        }

        public String getWorldName() {
            int i = 1422768945 ^ (1670954531 ^ 1193681405);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2087114885) {
                int i2 = 839518771 ^ i;
                return this.worldName;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 331970274 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (887208845 ^ i)) {
                    int i3 = 61274588 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2087114885 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1587181634 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 848192887 ^ i;
            throw new IllegalAccessException();
        }

        public Runnable getTeleportAction(int i) {
            int i2 = 825037982 ^ (1780767561 ^ 1193681405);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -512003760) {
                int i3 = 1189772292 ^ i2;
                return this.teleportAction;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -701984398 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1362106331 ^ i2)) {
                    int i4 = 1415020392 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -512003760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (23288038 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1294881875 ^ i2;
            throw new IllegalAccessException();
        }

        static {
            nothing_to_see_here[0] = "⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[1] = "⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[2] = "⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[3] = "⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[4] = "⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆";
            nothing_to_see_here[5] = "⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿";
            nothing_to_see_here[6] = "⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀";
            nothing_to_see_here[7] = "⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[8] = "⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉              ";
            d0AetyJ73v = (-1207064290) ^ new Random(6875249668261874786L).nextInt();
        }

        public static String lifyncpoax(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] cappeajutekpgzl() {
            return new byte[]{4, 72, 85, 24, 111, 48, 100, 44, 101, 59, 47, 116, 99, 90, 16, 81, 71, 30, 6, 47, 44, 18, 56, 29, 41, 1, 85, 97, 125, 59, 63, 86, 62, 92, 81, 105, 44, 8, 79, 126, 70, 125, 126, 42, 69, 30, 85, 123, 13, 112, 49, 122, 33, 10, 87, 100, 23, 49, 17, 79, 56, 95, 19, 55, 31, 49, 58, 18, 43, 105, 84, 125, 49, 61, 67, 101, 75, 8, 111, 92, 59, 5, 8, 123, 96, 39, 65, 113, 40, 30, 108, 79, 17, 105, 66, 56, 28, 124, 33, 31, 49, 20, 90, 102, 86, 19, 126, 105, 119, 50, 34, 70, 52, 73, 96, 102, 90, 10, 55, 2, 96, 51, 90, 16, 42, 121, 79};
        }
    }

    public QueueService(com.kammoun.donutCore.rtp.config.ConfigManager r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.service.QueueService.<init>(com.kammoun.donutCore.rtp.config.ConfigManager, int):void");
    }

    public boolean addToQueue(Player player, String str, Runnable runnable, int i) {
        int i2;
        int i3;
        int i4 = 409043040 ^ (860011381 ^ 1011506249);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1152697632) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1152697632 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1545163955 ^ i4)) {
                    break;
                }
            }
            int i5 = 1789270542 ^ i4;
            throw new IllegalAccessException("double");
        }
        int i6 = 1452558782 ^ i4;
        if (this.configManager.isEnableQueue(1499823189) == (1107111650 ^ i6)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 266958610) {
                i2 = 1141617884 ^ i6;
                runnable.run();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 800379376) {
                    return (byte) (982322964 ^ (1065063723 ^ i2));
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2077333448 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1882824222 ^ i2)) {
                        int i7 = 319940415 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -307720989 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1963946783 ^ i2)) {
                            int i8 = 1167595620 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 800379376 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (235882530 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
                int i9 = 618142952 ^ i2;
                throw new IllegalAccessException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 113805689 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (464528275 ^ i6)) {
                    int i10 = 1803313561 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 266958610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1673014802 ^ i6)) {
                        int i11 = 1545869608 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1404350002 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1736120601 ^ i6)) {
                            break;
                        }
                    }
                }
            }
            int i12 = 1587646324 ^ i6;
            throw new IllegalAccessException("double");
        }
        int i13 = 1009643731 ^ i6;
        if (isInQueue(player.getUniqueId(), 733531019) == (2110840369 ^ i13)) {
            i6 = 1560923934 ^ i13;
            if (this.queue.size() >= this.configManager.getMaxQueueSize(991461302)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 113805689) {
                    i3 = 1358515306 ^ i6;
                    ChatUtil.sendMessage(player, reegqnolsv(shmrggouhqebxid(), i3), 431932631);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2130515413) {
                        return (byte) (1249285574 ^ (978765955 ^ i3));
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 113805689) {
                        int i102 = 1803313561 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 266958610) {
                            int i112 = 1545869608 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1404350002) {
                                break;
                                break;
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
                int i122 = 1587646324 ^ i6;
                throw new IllegalAccessException("double");
            }
            int qxowcuhwidnvmhxk = qxowcuhwidnvmhxk(i6, 667644389);
            QueuedTeleport queuedTeleport = new QueuedTeleport(player.getUniqueId(), str, runnable, 150904981);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qxowcuhwidnvmhxk) != 949159504) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qxowcuhwidnvmhxk) == 949159504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qxowcuhwidnvmhxk) == (874559997 ^ qxowcuhwidnvmhxk)) {
                        break;
                    }
                }
                int i14 = 40085338 ^ qxowcuhwidnvmhxk;
                throw new RuntimeException("double");
            }
            int i15 = 60952152 ^ qxowcuhwidnvmhxk;
            this.queue.offer(queuedTeleport);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != 629372048) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 629372048 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (582993085 ^ i15)) {
                        break;
                    }
                }
                int i16 = 738582392 ^ i15;
                throw new IOException("double");
            }
            int i17 = 1311593179 ^ i15;
            int queuePosition = getQueuePosition(player.getUniqueId(), 82945879);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) != 1424613962) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == 1424613962 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (1865683507 ^ i17)) {
                        break;
                    }
                }
                int i18 = 1945051547 ^ i17;
                throw new IllegalAccessException("double");
            }
            i2 = 1172770480 ^ i17;
            ConfigManager configManager = this.configManager;
            String reegqnolsv = reegqnolsv(plkdzhakqdhqzch(), i2);
            String[] strArr = new String[(byte) (259666683 ^ i2)];
            strArr[(byte) (259666681 ^ i2)] = reegqnolsv(ufjbdpestlhvrpm(), i2);
            strArr[(byte) (259666680 ^ i2)] = String.valueOf(queuePosition);
            String message = configManager.getMessage(reegqnolsv, strArr, 1815121614);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2077333448) {
                i3 = 883609322 ^ i2;
                ChatUtil.sendMessage(player, message, 431932631);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -561520487) {
                    int i19 = 1185372271 ^ i3;
                    processQueue(1149792881);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -339926045) {
                        return (byte) (321772116 ^ (1851424297 ^ i19));
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -339926045 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (1173047369 ^ i19)) {
                            break;
                        }
                    }
                    int i20 = 426807257 ^ i19;
                    throw new IllegalAccessException("double");
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -731350871 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (895115269 ^ i3)) {
                    int i21 = 1733446101 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -561520487 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (863180570 ^ i3)) {
                        int i22 = 1622907149 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1720790360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (595561788 ^ i3)) {
                            int i23 = 1330586226 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2130515413 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (865255069 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i24 = 1716442517 ^ i3;
            throw new IOException();
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) != -293146229) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -293146229 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1915869158 ^ i13)) {
                    break;
                }
            }
            int i25 = 1424391490 ^ i13;
            throw new IOException("double");
        }
        i2 = 6672301 ^ i13;
        ChatUtil.sendMessage(player, reegqnolsv(jcfidrhipbebtiu(), i2), 431932631);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -307720989) {
            return (byte) (1688440533 ^ (420912969 ^ i2));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2077333448) {
                int i72 = 319940415 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -307720989) {
                    int i82 = 1167595620 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 800379376) {
                        break;
                        break;
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        int i92 = 618142952 ^ i2;
        throw new IllegalAccessException("double");
    }

    public int getQueuePosition(UUID uuid, int i) {
        int i2 = 2008921900 ^ (1267464030 ^ 1011506249);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 65069528) {
            i2 = 958521040 ^ i2;
            int i3 = (byte) (962446058 ^ i2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -890366119) {
                int i4 = 1135681778 ^ i2;
                Iterator<QueuedTeleport> it = this.queue.iterator();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -681111349) {
                    int i5 = 926450632 ^ i4;
                    while (true) {
                        i4 = i5;
                        if (it.hasNext() == (1305764305 ^ i4)) {
                            return (byte) ((-1817368531) ^ (562476547 ^ i4));
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1856179850) {
                            i4 = 509826369 ^ i4;
                            QueuedTeleport next = it.next();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1648778110) {
                                i2 = 1677676846 ^ i4;
                                if (next.getPlayerUuid(1098246643).equals(uuid) != (810051006 ^ i2)) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2109526543) {
                                        int i6 = 67927605 ^ i2;
                                        return i3;
                                    }
                                }
                                while (true) {
                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                        case 227308904:
                                            i2 = 358981065 ^ i2;
                                            break;
                                        case 428761638:
                                        case 577794382:
                                        default:
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1574904743 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1004906184 ^ i2)) {
                                                    int i7 = 1223592506 ^ i2;
                                                    throw new IllegalAccessException("double");
                                                }
                                            }
                                            break;
                                        case 686252673:
                                            break;
                                    }
                                }
                                i3 += 623769718 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 695190457) {
                                    i4 = 152545468 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1641186905) {
                                        int qxowcuhwidnvmhxk = qxowcuhwidnvmhxk(i4, 930246631);
                                        try {
                                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(qxowcuhwidnvmhxk) != 81518893) {
                                                throw null;
                                            }
                                            throw new IllegalAccessException();
                                        } catch (IllegalAccessException e) {
                                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                case -633210528:
                                                    i2 = qxowcuhwidnvmhxk(qxowcuhwidnvmhxk, 1198584731);
                                                    break;
                                                case 1447853394:
                                                    i2 = qxowcuhwidnvmhxk(qxowcuhwidnvmhxk, 384910109);
                                                    break;
                                                default:
                                                    throw new IOException("Error in hash");
                                            }
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -507091526) {
                                                i5 = qxowcuhwidnvmhxk(i2, 300723558);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1641186905 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1543568525 ^ i4)) {
                        int i8 = 25300619 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1856179850 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (689397438 ^ i4)) {
                            int i9 = 1655083811 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -681111349 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1323620835 ^ i4)) {
                                int i10 = 1624241373 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1648778110 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (328616399 ^ i4)) {
                                    int i11 = 13418257 ^ i4;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -890366119 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2094056902 ^ i2)) {
                int i12 = 1270717388 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2109526543 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1781235043 ^ i2)) {
                    int i13 = 2031514110 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1654046355 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1703911454 ^ i2)) {
                        int i14 = 1271712448 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 65069528 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1333703808 ^ i2)) {
                            int i15 = 850142385 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1447853394 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (665295481 ^ i2)) {
                                int i16 = 774020804 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -507091526 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1658644445 ^ i2)) {
                                    int i17 = 2042279085 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 695190457 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (898730747 ^ i2)) {
                                        int i18 = 980443509 ^ i2;
                                        throw new RuntimeException();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void removeFromQueue(UUID uuid) {
        int i = 1974637809 ^ (2113546490 ^ 1011506249);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1609104879) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 565584481 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1038235874 ^ i)) {
                    int i2 = 1763206786 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1609104879 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1249381562 ^ i)) {
                        break;
                    }
                }
            }
            int i3 = 1929342099 ^ i;
            throw new IOException();
        }
        int i4 = 1978019258 ^ i;
        this.queue.removeIf(queuedTeleport -> {
            int i5 = 293714630 ^ (912651001 ^ 627878083);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 340199392) {
                int i6 = 479983729 ^ i5;
                return queuedTeleport.getPlayerUuid(1098246643).equals(uuid);
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -258423704 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (980353712 ^ i5)) {
                    int i7 = 1960701733 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 340199392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1801979044 ^ i5)) {
                        break;
                    }
                }
            }
            int i8 = 694009408 ^ i5;
            throw new IllegalAccessException();
        });
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 254177218) {
            int i5 = 1708263860 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 254177218 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1004006074 ^ i4)) {
                break;
            }
        }
        int i6 = 20269342 ^ i4;
        throw new RuntimeException("double");
    }

    public boolean isInQueue(UUID uuid, int i) {
        int i2 = 1263303955 ^ (1246314499 ^ 1011506249);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -361035063) {
            int i3 = 1655435409 ^ i2;
            return this.queue.stream().anyMatch(queuedTeleport -> {
                int i4 = 525415625 ^ (1390576104 ^ 627878083);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1190719251) {
                    int i5 = 566490911 ^ i4;
                    return queuedTeleport.getPlayerUuid(1098246643).equals(uuid);
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1223120874 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1104746375 ^ i4)) {
                        int i6 = 1447886156 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1190719251 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1291086779 ^ i4)) {
                            break;
                        }
                    }
                }
                int i7 = 52325014 ^ i4;
                throw new IOException();
            });
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -14381502 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1796042587 ^ i2)) {
                int i4 = 2086907809 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -361035063 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (607491592 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1071993067 ^ i2;
        throw new RuntimeException();
    }

    private void processQueue(int i) {
        int i2;
        int i3 = 942127776 ^ (374816946 ^ 1011506249);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1848298792) {
            int i4 = 756105065 ^ i3;
            if (this.processing != (1059821874 ^ i4)) {
                qxowcuhwidnvmhxk(i4, 1415834832);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -111359599) {
                int i5 = 1407051958 ^ i4;
                if (this.queue.isEmpty() != (1828090244 ^ i5)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1739820067) {
                        int i6 = 129893478 ^ i5;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1739820067 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1765629974 ^ i5)) {
                            break;
                        }
                    }
                    int i7 = 135157043 ^ i5;
                    throw new RuntimeException("double");
                }
                i4 = 1771661033 ^ i5;
                this.processing = (byte) (91166572 ^ i4);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 729332584) {
                    int i8 = 352294527 ^ i4;
                    QueuedTeleport poll = this.queue.poll();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -1937504112) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1737407759 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (464589554 ^ i8)) {
                                int i9 = 1403085405 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1937504112 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1959367068 ^ i8)) {
                                    int i10 = 1618547185 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1322242470 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (716251359 ^ i8)) {
                                        break;
                                    }
                                }
                            }
                        }
                        int i11 = 1288565318 ^ i8;
                        throw new IllegalAccessException("double");
                    }
                    i3 = 1766729173 ^ i8;
                    if (poll == null) {
                        i2 = 874761208 ^ i3;
                        this.processing = (byte) (1291677503 ^ i2);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1743485434) {
                            int i12 = 982543734 ^ i2;
                            return;
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -957012421) {
                        int i13 = 1065884380 ^ i3;
                        i2 = i13;
                        try {
                            poll.getTeleportAction(1119373252).run();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 985002202) {
                                i2 = 1484316968 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -109905512) {
                                    int i14 = 1644795007 ^ i2;
                                    try {
                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i14) == 41772228) {
                                            throw new IOException();
                                        }
                                        throw null;
                                    } catch (IOException e) {
                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                            case -1737407759:
                                                i2 = qxowcuhwidnvmhxk(i14, 17581780);
                                                break;
                                            case -381789597:
                                                i2 = 1327867334 ^ i14;
                                                break;
                                            default:
                                                throw new IOException("Error in hash");
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1877773231) {
                                            int i15 = 1148153027 ^ i2;
                                            return;
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -109905512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (766127927 ^ i2)) {
                                        int i16 = 429963944 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1877773231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1687616966 ^ i2)) {
                                            int i17 = 179074535 ^ i2;
                                            throw new IOException("double");
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                                case 985002202:
                                    int qxowcuhwidnvmhxk = qxowcuhwidnvmhxk(i2, 1601911558);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qxowcuhwidnvmhxk) == -1049876248) {
                                        i3 = 1064168420 ^ qxowcuhwidnvmhxk;
                                        markProcessingComplete();
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 973305801) {
                                            i4 = 1565595853 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -796151389) {
                                                int i18 = 741831679 ^ i4;
                                                try {
                                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i18) == 115997983) {
                                                        throw new RuntimeException();
                                                    }
                                                    throw null;
                                                } catch (RuntimeException e3) {
                                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e3)) {
                                                        case -1322242470:
                                                            i3 = qxowcuhwidnvmhxk(i18, 682072036);
                                                            break;
                                                        case -1303585064:
                                                            i3 = 1757940212 ^ i18;
                                                            break;
                                                        default:
                                                            throw new IllegalAccessException("Error in hash");
                                                    }
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -200502917) {
                                                        qxowcuhwidnvmhxk(i3, 149721190);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qxowcuhwidnvmhxk) == -1049876248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qxowcuhwidnvmhxk) == (1786720590 ^ qxowcuhwidnvmhxk)) {
                                                int i19 = 1412698379 ^ qxowcuhwidnvmhxk;
                                                throw new IOException("double");
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    throw new IOException("Error in hash");
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 985002202 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (478858697 ^ i2)) {
                            int i20 = 1287236461 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1743485434 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (314082067 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i21 = 974542482 ^ i2;
                    throw new IOException("double");
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 729332584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2097720254 ^ i4)) {
                    int i22 = 2049278471 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -796151389 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2142913809 ^ i4)) {
                        int i23 = 863322977 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1514385171 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2029181084 ^ i4)) {
                            int i24 = 2027456820 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -111359599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (659118356 ^ i4)) {
                                int i25 = 929007953 ^ i4;
                                throw new RuntimeException("double");
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -957012421 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (982954759 ^ i3)) {
                int i26 = 2031526499 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -381789597 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2143594518 ^ i3)) {
                    int i27 = 1395759459 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 973305801 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1485116430 ^ i3)) {
                        int i28 = 824659133 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -200502917 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1142005423 ^ i3)) {
                            int i29 = 585032402 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1848298792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1133207114 ^ i3)) {
                                int i30 = 613237145 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1285025205 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2044440254 ^ i3)) {
                                    int i31 = 756164208 ^ i3;
                                    throw new IllegalAccessException();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void markProcessingComplete() {
        int i = 592203882 ^ (411791774 ^ 1011506249);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1013706216) {
            i = 726393540 ^ i;
            this.processing = (byte) (751214457 ^ i);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1714748361) {
                i = 1846534223 ^ i;
                processQueue(1149792881);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 374077874) {
                    int i2 = 1682265251 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1013706216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1721742212 ^ i)) {
                int i3 = 1039237272 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1714748361 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (866652358 ^ i)) {
                    int i4 = 2130428501 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 374077874 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (807000038 ^ i)) {
                        int i5 = 606331996 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 878795945 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (254839982 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i6 = 1201751258 ^ i;
        throw new IOException();
    }

    public int getQueueSize() {
        int i = 89305939 ^ (754732641 ^ 1011506249);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1356526632) {
            int i2 = 670280538 ^ i;
            return this.queue.size();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1866968823 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1817868295 ^ i)) {
                int i3 = 395240184 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1356526632 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (866308699 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1160581031 ^ i;
        throw new IllegalAccessException();
    }

    public void clearAll(int i) {
        int i2 = 111628758 ^ (224900187 ^ 1011506249);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1135227359) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1135227359 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1382968664 ^ i2)) {
                    break;
                }
            }
            int i3 = 1358777481 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 532339821 ^ i2;
        this.queue.clear();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1099115849) {
            i4 = 330978368 ^ i4;
            this.processing = (byte) (998912489 ^ i4);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -598634679) {
                int i5 = 1237619325 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1837818717 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (486520831 ^ i4)) {
                int i6 = 1850820390 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -598634679 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2015926816 ^ i4)) {
                    int i7 = 1207949931 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1099115849 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (302681147 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1300697679 ^ i4;
        throw new IOException();
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
        hccznbxdav = drpvunljcvlfzon();
        PAJ0SeZ9GZ = (-624059370) ^ new Random(-6811484434750232109L).nextInt();
    }

    public static String reegqnolsv(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ hccznbxdav[i3 % hccznbxdav.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] drpvunljcvlfzon() {
        return new byte[]{65, 12, 96, 88, 116, 81, 50, 78, 5, 16, 70, 33, 116, 105, 9, 70, 17, 42, 97, 28, 65, 112, 64, 6, 59, 22, 114, 12, 43, 36, 71, 21, 108, 46, 2, 63, 63, 96, 118, 13, 42, 93, 26, 52, 59, 97, 84, 88, 43, 81, 37, 52, 79, 9, 121, 116, 30, 25, 99, 23, 105, 1, 24, 21, 109, 87, 3, 59, 93, 54, 112, 56, 101, 22, Byte.MAX_VALUE, 126, 71, 21, 111, 73, 23, 101, 87, 16, 33, 121, 31, 77, 6, 74, 2};
    }

    private static byte[] shmrggouhqebxid() {
        return new byte[]{-114, -53, 88, 79, 69, 4, 11, 40, 55, 73, 119, 124, 76, 120, 56, 4, 40, 125, 83, 65, 112, 45, 120, 71, 10, 79, 75, 76, 25, 97, 118, 13, 84, 110, 51, 124, 6, 55, 68, 73, 27, 0, 34, 37, 10, 62, 109, 25, 25, 64, 20, 106, 119, 77, 72, 46, 39, 71, 81, 7, 88, 25, 32, 116, 92, 13, 58, 108, 111, 102, 65, 115, 93, 66, 78, 104, 126, 83, 93, 10, 38, 36, 111, 1, 16, 46, 38, 24, 52, 26, 51, 16, 52, 63, 105, 98, 104, 108, 124, 85, 33, 10, 25, 32, 88, 77, Byte.MAX_VALUE, 13};
    }

    private static byte[] jcfidrhipbebtiu() {
        return new byte[]{-115, -62, 80, 71, 68, 3, 10, 34, 55, 75, 116, 101, 68, 112, 57, 22, 41, 109, 83, 77, 115, 97, 112, 94, 11, 75, 74, 75, 25, 117, 117, 69, 92, 115, 50, 119, 7, 117, 68, 80, 24, 2, 42, 45, 11, 36, 108, 5, 25, 0, 23, 37, Byte.MAX_VALUE, 68, 73, 32, 38, 64, 81, 70, 91, 64, 40, 67, 93, 20, 59, 122, 111, 34, 66, 120, 85, 90, 79, 42, Byte.MAX_VALUE, 85, 93, 24, 37, 117};
    }

    private static byte[] plkdzhakqdhqzch() {
        return new byte[]{-115, -58, 89, 31, 66, 18, 4, 19, 52, 87, 115, 125, 66, 114, 63, 17, 41, Byte.MAX_VALUE, 83, 77, 120, 35, 118, 84};
    }

    private static byte[] ufjbdpestlhvrpm() {
        return new byte[]{-115, -58, 89, 30, 66, 8, 4, 5, 52, 75, 115, 108, 66, 54, 63, 31, 41, 117};
    }

    private static int qxowcuhwidnvmhxk(int i, int i2) {
        return i2 ^ i;
    }
}
