package com.kammoun.donutCore.tpa.commands;

import com.kammoun.donutCore.tpa.commands.model.TpaRequest;
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
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class TpaHere extends TpaRequest {
    private static int nNb8XM8rNc = 0;
    private transient int p8ri9MUjcE = 943944678;
    private static String jnmcxtpqmw;
    private static String[] nothing_to_see_here = new String[18];

    public TpaHere(com.kammoun.donutCore.tpa.TeleportPlugin r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.commands.TpaHere.<init>(com.kammoun.donutCore.tpa.TeleportPlugin, int):void");
    }

    @Override
    protected void openMenu(Player player, Player player2, int i) {
        int i2 = 832298210 ^ (2075598561 ^ 772369739);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 556628547) {
            i2 = 821014056 ^ i2;
            this.plugin.getTpaHereRequestMenu(116634675).openRequestMenu(player, player2, 232629502);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1504703742) {
                int i3 = 1499408534 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1823035312 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1137698829 ^ i2)) {
                int i4 = 712856045 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 556628547 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1783380375 ^ i2)) {
                    int i5 = 1314194334 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1504703742 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1901105574 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 711155430 ^ i2;
        throw new IllegalAccessException();
    }

    @Override
    protected void sendRequestDirectly(Player player, Player player2, int i) {
        int dhrafvzpfhsfqzmp;
        int i2 = 345509055 ^ (435823605 ^ 772369739);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 458887177) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 458887177 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (728117447 ^ i2)) {
                    break;
                }
            }
            int i3 = 978228225 ^ i2;
            throw new IOException("double");
        }
        int i4 = 41071271 ^ i2;
        TeleportPlayer orLoadPlayer = this.plugin.getTeleportManager(325711881).getOrLoadPlayer(player2.getUniqueId(), 1947615711);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 147817777) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 147817777 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (963335921 ^ i4)) {
                    break;
                }
            }
            int i5 = 972859743 ^ i4;
            throw new RuntimeException("double");
        }
        int i6 = 963273233 ^ i4;
        if (orLoadPlayer.isTpaHereRequests(583967468) != (410227383 ^ i6)) {
            int i7 = 1385071641 ^ i6;
            if (this.plugin.getTeleportManager(325711881).hasPendingRequest(player2.getUniqueId(), player.getUniqueId(), 1198300553) == (1258100398 ^ i7)) {
                dhrafvzpfhsfqzmp = dhrafvzpfhsfqzmp(i7, 936964678);
                TpRequestEvent tpRequestEvent = new TpRequestEvent(player, player2, TeleportRequest.TeleportType.TPA_HERE, 846017005);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == -382785725) {
                    dhrafvzpfhsfqzmp = 787999528 ^ dhrafvzpfhsfqzmp;
                    Bukkit.getPluginManager().callEvent(tpRequestEvent);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == -1634697726) {
                        int i8 = 1203447337 ^ dhrafvzpfhsfqzmp;
                        if (tpRequestEvent.isCancelled() != (342436329 ^ i8)) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1555476664) {
                                int i9 = 1966837301 ^ i8;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1555476664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (786637707 ^ i8)) {
                                    break;
                                }
                            }
                            int i10 = 1159560020 ^ i8;
                            throw new IllegalAccessException("double");
                        }
                        i7 = dhrafvzpfhsfqzmp(i8, 575411764);
                        this.plugin.getTeleportManager(325711881).addRequest(player.getUniqueId(), player2.getUniqueId(), TeleportRequest.TeleportType.TPA_HERE, 636544014);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1322647831) {
                            dhrafvzpfhsfqzmp = 33069088 ^ i7;
                            TeleportConfig teleportConfig = this.plugin.getTeleportConfig(419749180);
                            Messages messages = Messages.TPA_HERE_REQUEST_SENDER_ACTIONBAR;
                            String[] strArr = new String[(byte) (937273343 ^ dhrafvzpfhsfqzmp)];
                            strArr[(byte) (937273341 ^ dhrafvzpfhsfqzmp)] = utvdgnpvvu(ufyutjeidsxmctt(), dhrafvzpfhsfqzmp);
                            strArr[(byte) (937273340 ^ dhrafvzpfhsfqzmp)] = player2.getName();
                            teleportConfig.sendActionBar(player, messages, strArr, 2143847181);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == -1091747863) {
                                int i11 = 1607903802 ^ dhrafvzpfhsfqzmp;
                                TeleportConfig teleportConfig2 = this.plugin.getTeleportConfig(419749180);
                                Messages messages2 = Messages.TPA_HERE_REQUEST_REQUESTER_ACTIONBAR;
                                String[] strArr2 = new String[(byte) (1745554885 ^ i11)];
                                strArr2[(byte) (1745554887 ^ i11)] = utvdgnpvvu(blpprqeovapdmnf(), i11);
                                strArr2[(byte) (1745554886 ^ i11)] = player.getName();
                                teleportConfig2.sendActionBar(player2, messages2, strArr2, 2143847181);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 1079537211) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1079537211 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1672168254 ^ i11)) {
                                            break;
                                        }
                                    }
                                    int i12 = 353068127 ^ i11;
                                    throw new IOException("double");
                                }
                                dhrafvzpfhsfqzmp = 710809977 ^ i11;
                                TeleportConfig teleportConfig3 = this.plugin.getTeleportConfig(419749180);
                                Messages messages3 = Messages.RECEIVE_HERE_REQUEST;
                                String[] strArr3 = new String[(byte) (1112872124 ^ dhrafvzpfhsfqzmp)];
                                strArr3[(byte) (1112872126 ^ dhrafvzpfhsfqzmp)] = utvdgnpvvu(yuhysucgxihhwve(), dhrafvzpfhsfqzmp);
                                strArr3[(byte) (1112872127 ^ dhrafvzpfhsfqzmp)] = player.getName();
                                teleportConfig3.sendTeleportMessage(player2, messages3, strArr3, 1779939381);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == 313042418) {
                                    dhrafvzpfhsfqzmp = 1898370003 ^ dhrafvzpfhsfqzmp;
                                    TeleportConfig teleportConfig4 = this.plugin.getTeleportConfig(419749180);
                                    Messages messages4 = Messages.SENT_HERE_REQUEST;
                                    String[] strArr4 = new String[(byte) (863225711 ^ dhrafvzpfhsfqzmp)];
                                    strArr4[(byte) (863225709 ^ dhrafvzpfhsfqzmp)] = utvdgnpvvu(klrntnsbieuwtnr(), dhrafvzpfhsfqzmp);
                                    strArr4[(byte) (863225708 ^ dhrafvzpfhsfqzmp)] = player2.getName();
                                    teleportConfig4.sendMessage(player, messages4, strArr4, 82432121);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == -1684128919) {
                                        int i13 = 1057739016 ^ dhrafvzpfhsfqzmp;
                                        this.plugin.getTeleportConfig(419749180).playSound(player, utvdgnpvvu(mavzqfzbdmgfcdj(), i13), 1571899765);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1673573160) {
                                            int i14 = 1138290163 ^ i13;
                                            return;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1673573160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (638023608 ^ i13)) {
                                                break;
                                            }
                                        }
                                        int i15 = 93025802 ^ i13;
                                        throw new IOException("double");
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1474868594) {
                int i16 = 158837601 ^ i7;
                TeleportConfig teleportConfig5 = this.plugin.getTeleportConfig(419749180);
                Messages messages5 = Messages.REQUEST_COOLDOWN;
                String[] strArr5 = new String[(byte) (1133166029 ^ i16)];
                strArr5[(byte) (1133166031 ^ i16)] = utvdgnpvvu(qwuephrjqdiexuv(), i16);
                strArr5[(byte) (1133166030 ^ i16)] = player2.getName();
                teleportConfig5.sendMessage(player, messages5, strArr5, 82432121);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) != 475393658) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == 475393658 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (535725718 ^ i16)) {
                            break;
                        }
                    }
                    int i17 = 1635255518 ^ i16;
                    throw new IllegalAccessException("double");
                }
                int i18 = 404939709 ^ i16;
                this.plugin.getTeleportConfig(419749180).playSound(player, utvdgnpvvu(mwctzvzgeqfgbdi(), i18), 1571899765);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == -582814830) {
                    int i19 = 123581873 ^ i18;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == -582814830 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (900915442 ^ i18)) {
                        break;
                    }
                }
                int i20 = 411852983 ^ i18;
                throw new RuntimeException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1474868594 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (305760568 ^ i7)) {
                    int i21 = 462640927 ^ i7;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1322647831 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1853161855 ^ i7)) {
                        int i22 = 437518898 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -759035464 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (76205704 ^ i7)) {
                            break;
                        }
                    }
                }
            }
            int i23 = 966043927 ^ i7;
            throw new IOException("double");
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1013148232) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1013148232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (968581569 ^ i6)) {
                    break;
                }
            }
            int i24 = 1600305840 ^ i6;
            throw new IllegalAccessException("double");
        }
        dhrafvzpfhsfqzmp = 1399725555 ^ i6;
        this.plugin.getTeleportConfig(419749180).sendMessage(player, Messages.BLOCK_TPHERE_REQUEST, new String[(byte) (1260228420 ^ dhrafvzpfhsfqzmp)], 82432121);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == 1491892770) {
            dhrafvzpfhsfqzmp = 422554082 ^ dhrafvzpfhsfqzmp;
            this.plugin.getTeleportConfig(419749180).playSound(player, utvdgnpvvu(vzmxijkdaesxwsa(), dhrafvzpfhsfqzmp), 1571899765);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == -1852754638) {
                int i25 = 1214932881 ^ dhrafvzpfhsfqzmp;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == -1091747863 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == (415230587 ^ dhrafvzpfhsfqzmp)) {
                int i26 = 173474209 ^ dhrafvzpfhsfqzmp;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == -407937510 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == (343371944 ^ dhrafvzpfhsfqzmp)) {
                    int i27 = 1735511591 ^ dhrafvzpfhsfqzmp;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == -1684128919 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == (1501606432 ^ dhrafvzpfhsfqzmp)) {
                        int i28 = 1656334216 ^ dhrafvzpfhsfqzmp;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == -1634697726 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == (646844029 ^ dhrafvzpfhsfqzmp)) {
                            int i29 = 301079466 ^ dhrafvzpfhsfqzmp;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == -382785725 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == (963830328 ^ dhrafvzpfhsfqzmp)) {
                                int i30 = 460839009 ^ dhrafvzpfhsfqzmp;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == 1491892770 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == (780738756 ^ dhrafvzpfhsfqzmp)) {
                                    int i31 = 1165610618 ^ dhrafvzpfhsfqzmp;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == 177553123 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == (725277422 ^ dhrafvzpfhsfqzmp)) {
                                        int i32 = 290035327 ^ dhrafvzpfhsfqzmp;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == -1852754638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == (1118415655 ^ dhrafvzpfhsfqzmp)) {
                                            int i33 = 1567112375 ^ dhrafvzpfhsfqzmp;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == 313042418 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == (525364125 ^ dhrafvzpfhsfqzmp)) {
                                                int i34 = 1858103560 ^ dhrafvzpfhsfqzmp;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == 2097667250 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dhrafvzpfhsfqzmp) == (1735307429 ^ dhrafvzpfhsfqzmp)) {
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
            }
        }
        int i35 = 758632284 ^ dhrafvzpfhsfqzmp;
        throw new IllegalAccessException();
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
        jnmcxtpqmw = ByteBuffer.wrap(nhddjcunihghafm()).asCharBuffer().toString();
        nNb8XM8rNc = (-1164136295) ^ new Random(429304080858256714L).nextInt();
    }

    public static String utvdgnpvvu(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = jnmcxtpqmw.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] yuhysucgxihhwve() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 0};
    }

    private static byte[] vzmxijkdaesxwsa() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 8};
    }

    private static byte[] klrntnsbieuwtnr() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 13};
    }

    private static byte[] mavzqfzbdmgfcdj() {
        return new byte[]{0, 0, 0, 17, 0, 0, 0, 21};
    }

    private static byte[] ufyutjeidsxmctt() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 38};
    }

    private static byte[] blpprqeovapdmnf() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 46};
    }

    private static byte[] mwctzvzgeqfgbdi() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 54};
    }

    private static byte[] qwuephrjqdiexuv() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 59};
    }

    private static byte[] nhddjcunihghafm() {
        return new byte[]{49, 20, 49, 66, 56, 91, 50, 80, 50, 79, 49, 84, 49, 64, 56, 18, 49, 86, 55, 75, 48, 67, 56, 91, 48, 68, 56, 19, 51, 66, 50, 89, 55, 81, 57, 65, 54, 86, 50, 64, 53, 18, 50, 89, 57, 95, 57, 80, 54, 91, 53, 64, 48, 84, 49, 88, 54, 66, 52, 92, 50, 95, 57, 95, 57, 27, 54, 87, 53, 94, 48, 80, 49, 90, 54, 93, 57, 22, 55, 66, 55, 95, 51, 85, 49, 64, 51, 82, 50, 69, 51, 22, 49, 18, 52, 69, 53, 89, 52, 89, 56, 78, 49, 82, 52, 71, 53, 16, 49, 80, 51, 69, 55, 68, 48, 87, 56, 64, 49, 20, 51, 67, 49, 90, 54, 81, 51, 72, 49, 84, 51, 65, 49, 19};
    }

    private static int dhrafvzpfhsfqzmp(int i, int i2) {
        return i ^ i2;
    }
}
