package com.kammoun.donutCore.tpa.listener;

import com.kammoun.donutCore.tpa.TeleportPlugin;
import com.kammoun.donutCore.tpa.config.TeleportConfig;
import com.kammoun.donutCore.tpa.events.TpRequestEvent;
import com.kammoun.donutCore.tpa.model.TeleportPlayer;
import com.kammoun.donutCore.tpa.model.TeleportRequest;
import com.kammoun.donutCore.tpa.service.Enums.Messages;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class TpAutoAcceptListener implements Listener {
    private final TeleportPlugin plugin;
    private static int FL1VRbICso = 0;
    private transient int k04Cc8Ys9k = 792241777;
    private static String ktuejuonla;
    private static String[] nothing_to_see_here = new String[15];

    public TpAutoAcceptListener(TeleportPlugin teleportPlugin, int i) {
        int i2 = 839149584 ^ (1954630720 ^ 898303120);
        int parseInt = 947376846 ^ (1479596748 ^ Integer.parseInt("323561666"));
        this.k04Cc8Ys9k = 792241777 ^ FL1VRbICso;
        int jaaruwdovzqmfljv = 1218997424 ^ jaaruwdovzqmfljv(parseInt, 1327543581);
        this.plugin = teleportPlugin;
        int i3 = 852010087 ^ jaaruwdovzqmfljv;
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onTpRequest(TpRequestEvent tpRequestEvent) {
        int i = 569856396 ^ (1088039612 ^ 1029455008);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -477479806) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -477479806 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1465513036 ^ i)) {
                    break;
                }
            }
            int i2 = 1890502808 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 1511798383 ^ i;
        if (tpRequestEvent.isCancelled() != (107835903 ^ i3)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 862687224) {
                int i4 = 2008698851 ^ i3;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 862687224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1774455440 ^ i3)) {
                    break;
                }
            }
            int i5 = 1078561726 ^ i3;
            throw new IllegalAccessException("double");
        }
        int jaaruwdovzqmfljv = jaaruwdovzqmfljv(i3, 1173997268);
        TeleportPlayer orLoadPlayer = this.plugin.getTeleportManager(325711881).getOrLoadPlayer(tpRequestEvent.getTarget(1868082245).getUniqueId(), 1947615711);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(jaaruwdovzqmfljv) != 480622938) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(jaaruwdovzqmfljv) == 480622938 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(jaaruwdovzqmfljv) == (61158882 ^ jaaruwdovzqmfljv)) {
                    break;
                }
            }
            int i6 = 1726222740 ^ jaaruwdovzqmfljv;
            throw new IllegalAccessException("double");
        }
        int i7 = 723901070 ^ jaaruwdovzqmfljv;
        if (orLoadPlayer.isTpaauto(215129600) == (1756458405 ^ i7)) {
            int i8 = 1970133842 ^ i7;
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1166765355) {
            int i9 = 282401693 ^ i7;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -1021070909) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1021070909 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (656798171 ^ i9)) {
                        break;
                    }
                }
                int i10 = 1074490764 ^ i9;
                throw new RuntimeException("double");
            }
            int i11 = 1027422461 ^ i9;
            UUID uniqueId = tpRequestEvent.getRequester(758144143).getUniqueId();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 717911594) {
                int i12 = 899270010 ^ i11;
                UUID uniqueId2 = tpRequestEvent.getTarget(1868082245).getUniqueId();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -2046534149) {
                    int i13 = 1712388413 ^ i12;
                    TeleportRequest teleportRequest = new TeleportRequest(uniqueId, uniqueId2, tpRequestEvent.getType(764202874), 1869167987);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) != -1232890864) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1232890864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1666793555 ^ i13)) {
                                break;
                            }
                        }
                        int i14 = 629192426 ^ i13;
                        throw new IOException("double");
                    }
                    int i15 = 2068717099 ^ i13;
                    TeleportConfig teleportConfig = this.plugin.getTeleportConfig(419749180);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != 1827890507) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 1827890507 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (1224125558 ^ i15)) {
                                break;
                            }
                        }
                        int i16 = 1070556796 ^ i15;
                        throw new IllegalAccessException("double");
                    }
                    i12 = 551061728 ^ i15;
                    Player requester = tpRequestEvent.getRequester(758144143);
                    Messages messages = Messages.SENT_REQUEST;
                    String[] strArr = new String[(byte) (1296491595 ^ i12)];
                    strArr[(byte) (1296491593 ^ i12)] = aazitsymba(yfcnululufmybvt(), i12);
                    byte b = (byte) (1296491592 ^ i12);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1781998154) {
                        int i17 = 1634418720 ^ i12;
                        strArr[b] = tpRequestEvent.getTarget(1868082245).getName();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) != 1634542409) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == 1634542409 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (1137647727 ^ i17)) {
                                    break;
                                }
                            }
                            int i18 = 240432317 ^ i17;
                            throw new RuntimeException("double");
                        }
                        int i19 = 177635082 ^ i17;
                        teleportConfig.sendMessage(requester, messages, strArr, 82432121);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) != 903797529) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == 903797529 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (1662875174 ^ i19)) {
                                    break;
                                }
                            }
                            int i20 = 1905451267 ^ i19;
                            throw new RuntimeException("double");
                        }
                        i7 = 25139594 ^ i19;
                        TeleportConfig teleportConfig2 = this.plugin.getTeleportConfig(419749180);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1042421577) {
                            int i21 = 530249654 ^ i7;
                            Player target = tpRequestEvent.getTarget(1868082245);
                            Messages messages2 = Messages.RECEIVE_REQUEST;
                            String[] strArr2 = new String[(byte) (945730909 ^ i21)];
                            strArr2[(byte) (945730911 ^ i21)] = aazitsymba(hwyphejrjxilloz(), i21);
                            byte b2 = (byte) (945730910 ^ i21);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) != -1024087303) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == -1024087303 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == (539031730 ^ i21)) {
                                        break;
                                    }
                                }
                                int i22 = 2137669575 ^ i21;
                                throw new IOException("double");
                            }
                            i11 = 1242798154 ^ i21;
                            strArr2[b2] = tpRequestEvent.getRequester(758144143).getName();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1838585685) {
                                i11 = 345939472 ^ i11;
                                teleportConfig2.sendTeleportMessage(target, messages2, strArr2, 1779939381);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 916297771) {
                                    int i23 = 1418156027 ^ i11;
                                    this.plugin.getTeleportManager(325711881).acceptRequest(teleportRequest, 1340264219);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) != -1834539023) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) == -1834539023 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) == (2133239963 ^ i23)) {
                                                break;
                                            }
                                        }
                                        int i24 = 1637985133 ^ i23;
                                        throw new IllegalAccessException("double");
                                    }
                                    i11 = 2007255818 ^ i23;
                                    tpRequestEvent.setCancelled((byte) (1173401589 ^ i11));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 797278114) {
                                        int i25 = 1479284995 ^ i11;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -2046534149 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (729142177 ^ i12)) {
                        int i26 = 442164922 ^ i12;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1781998154 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (2011003221 ^ i12)) {
                            break;
                        }
                    }
                }
                int i27 = 2039257373 ^ i12;
                throw new RuntimeException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 797278114 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (216193968 ^ i11)) {
                    int i28 = 2068693472 ^ i11;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1838585685 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1513905806 ^ i11)) {
                        int i29 = 753880576 ^ i11;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 717911594 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (123061952 ^ i11)) {
                            int i30 = 361556170 ^ i11;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 916297771 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (341760644 ^ i11)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i31 = 565815576 ^ i11;
            throw new IllegalAccessException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1042421577 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1316413622 ^ i7)) {
                int i32 = 678370515 ^ i7;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1166765355 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1116210782 ^ i7)) {
                    break;
                }
            }
        }
        int i33 = 1374533525 ^ i7;
        throw new IllegalAccessException("double");
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⢰⣧⣼⣯⠄⣸⣠⣶⣶⣦⣾⠄⠄⠄⠄⡀⠄⢀⣿⣿⠄⠄⠄⢸⡇⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿⠄";
        nothing_to_see_here[2] = "⠄⠄⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿⠄";
        nothing_to_see_here[3] = "⠄⠄⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⠄";
        nothing_to_see_here[4] = "⠄⢀⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋⣰";
        nothing_to_see_here[5] = "⠄⣼⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀⣤";
        nothing_to_see_here[6] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿⡗";
        nothing_to_see_here[7] = "⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄";
        nothing_to_see_here[8] = "⢸⣿⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄";
        nothing_to_see_here[9] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃⠄";
        nothing_to_see_here[10] = "⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄⠄";
        nothing_to_see_here[11] = "⠄⠄⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄⠄";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠈⠛⢿⣿⣿⣿⠁⠞⢿⣿⣿⡄⢿⣿⡇⣸⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄";
        nothing_to_see_here[13] = "⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣾⣦⡙⠻⣷⣾⣿⠃⠿⠋⠁⠄⠄⠄⠄⠄⢀⣠⣴";
        nothing_to_see_here[14] = "⣿⣿⣿⣶⣶⣮⣥⣒⠲⢮⣝⡿⣿⣿⡆⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⣠⣴⣿⣿⣿";
        ktuejuonla = ByteBuffer.wrap(agurscrcqkdggrm()).asCharBuffer().toString();
        FL1VRbICso = (-1318759785) ^ new Random(-813580341279197676L).nextInt();
    }

    public static String aazitsymba(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = ktuejuonla.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] yfcnululufmybvt() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 0};
    }

    private static byte[] hwyphejrjxilloz() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 8};
    }

    private static byte[] agurscrcqkdggrm() {
        return new byte[]{49, 23, 57, 70, 52, 85, 49, 84, 57, 74, 49, 87, 57, 68, 52, 28, 57, 17, 53, 71, 51, 92, 57, 80, 49, 64, 52, 80, 55, 65, 48, 28};
    }

    private static int jaaruwdovzqmfljv(int i, int i2) {
        return i2 ^ i;
    }
}
