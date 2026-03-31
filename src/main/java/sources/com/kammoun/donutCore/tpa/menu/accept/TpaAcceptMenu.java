package com.kammoun.donutCore.tpa.menu.accept;

import com.kammoun.donutCore.tpa.menu.AbstractTpaMenu;
import com.kammoun.donutCore.tpa.model.TeleportRequest;
import com.kammoun.donutCore.tpa.model.TpRequestMenuHolder;
import com.kammoun.donutCore.tpa.service.Enums.Messages;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class TpaAcceptMenu extends AbstractTpaMenu {

    private static int f1264s5wGES3vt = 0;
    private transient int ytraujKQ2J = 75953017;
    private static String lpjvyxhymf;
    private static String[] nothing_to_see_here = new String[15];

    public TpaAcceptMenu(com.kammoun.donutCore.tpa.TeleportPlugin r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.menu.accept.TpaAcceptMenu.<init>(com.kammoun.donutCore.tpa.TeleportPlugin, int):void");
    }

    public void openAcceptMenu(Player player, Player player2, int i) {
        int i2 = 130690001 ^ (866959309 ^ 383857764);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 339542977) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1880350741 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1450572494 ^ i2)) {
                    int i3 = 1183959128 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 339542977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1717275501 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 1297254992 ^ i2;
            throw new IOException();
        }
        int i5 = 441473582 ^ i2;
        super.openMenu(player, player2, 1908552328);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -960507215) {
            int i6 = 1227520427 ^ i5;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -960507215 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2077168656 ^ i5)) {
                break;
            }
        }
        int i7 = 557249129 ^ i5;
        throw new RuntimeException("double");
    }

    @Override
    protected void onConfirmClick(InventoryClickEvent inventoryClickEvent, TpRequestMenuHolder tpRequestMenuHolder, Player player, int i) {
        int i2 = 2135513650 ^ (1314701938 ^ 383857764);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1067802913) {
            int i3 = 96753487 ^ i2;
            Player receiver = tpRequestMenuHolder.getReceiver(1687959576);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 294116185) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 294116185 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (924912004 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1535049346 ^ i3;
                throw new IOException("double");
            }
            int i5 = 1941077087 ^ i3;
            if (receiver != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1944831582) {
                    i5 = 12888011 ^ i5;
                    if (receiver.isOnline() != (1363550463 ^ i5)) {
                        int hmakzogldmevmnwk = hmakzogldmevmnwk(i5, 260373425);
                        TeleportRequest teleportRequest = (TeleportRequest) this.plugin.getTeleportManager(325711881).getRequestsFor(player.getUniqueId(), 111102479).get(receiver.getUniqueId());
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hmakzogldmevmnwk) == -166274446) {
                            int i6 = 996500641 ^ hmakzogldmevmnwk;
                            if (teleportRequest == null) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 759037819) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 759037819 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (669959001 ^ i6)) {
                                            break;
                                        }
                                    }
                                    int i7 = 995211990 ^ i6;
                                    throw new IOException("double");
                                }
                                int i8 = 294534813 ^ i6;
                                this.plugin.getTeleportConfig(419749180).sendMessage(player, Messages.NON_VALID_REQUEST, new String[(byte) (1948877170 ^ i8)], 82432121);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -1588851821) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1588851821 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (657309241 ^ i8)) {
                                            break;
                                        }
                                    }
                                    int i9 = 1770284796 ^ i8;
                                    throw new IOException("double");
                                }
                                int i10 = 148357958 ^ i8;
                                this.plugin.getTeleportConfig(419749180).playSound(player, rggdwghxwy(zzwzkumufkiyzgt(), i10), 1571899765);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != -403566173) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -403566173 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1625915578 ^ i10)) {
                                            break;
                                        }
                                    }
                                    int i11 = 2007632506 ^ i10;
                                    throw new IOException("double");
                                }
                                int i12 = 782029018 ^ i10;
                                player.closeInventory();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1827367054) {
                                    int i13 = 2008896282 ^ i12;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1827367054 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1287035062 ^ i12)) {
                                        break;
                                    }
                                }
                                int i14 = 1596628232 ^ i12;
                                throw new IllegalAccessException("double");
                            }
                            int i15 = 593841459 ^ i6;
                            if (teleportRequest.isExpired(this.plugin.getTeleportConfig(419749180).getClearTime(1230524885), 278749404) == (1187181276 ^ i15)) {
                                i5 = hmakzogldmevmnwk(i15, 510164035);
                                this.plugin.getTeleportManager(325711881).acceptRequest(teleportRequest, 1340264219);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -984320774) {
                                    i15 = 1796325639 ^ i5;
                                    player.closeInventory();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -1646625599) {
                                        int i16 = 973318272 ^ i15;
                                        return;
                                    }
                                }
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 907515618) {
                                int i17 = 1964459120 ^ i15;
                                this.plugin.getTeleportConfig(419749180).sendMessage(player, Messages.NON_VALID_REQUEST, new String[(byte) (869643948 ^ i17)], 82432121);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) != -1632783007) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1632783007 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (2010194074 ^ i17)) {
                                            break;
                                        }
                                    }
                                    int i18 = 306792417 ^ i17;
                                    throw new IOException("double");
                                }
                                hmakzogldmevmnwk = 1067053157 ^ i17;
                                this.plugin.getTeleportConfig(419749180).playSound(player, rggdwghxwy(wsiwmhipijznyhu(), hmakzogldmevmnwk), 1571899765);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hmakzogldmevmnwk) == 1650603592) {
                                    i2 = 1982520847 ^ hmakzogldmevmnwk;
                                    this.plugin.getTeleportManager(325711881).removeRequest(player.getUniqueId(), receiver.getUniqueId(), 1453967827);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -751516109) {
                                        int i19 = 1165315262 ^ i2;
                                        player.closeInventory();
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -123821119) {
                                            int i20 = 1872009779 ^ i19;
                                            return;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == 1304901824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (302155007 ^ i19)) {
                                                int i21 = 1007236355 ^ i19;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -123821119 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (272300446 ^ i19)) {
                                                    break;
                                                }
                                            }
                                        }
                                        int i22 = 1017173256 ^ i19;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -1646625599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (925837721 ^ i15)) {
                                    int i23 = 1068097245 ^ i15;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 907515618 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (300388610 ^ i15)) {
                                        break;
                                    }
                                }
                            }
                            int i24 = 466545204 ^ i15;
                            throw new IllegalAccessException("double");
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hmakzogldmevmnwk) == -166274446 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hmakzogldmevmnwk) == (165095832 ^ hmakzogldmevmnwk)) {
                                int i25 = 1036613878 ^ hmakzogldmevmnwk;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hmakzogldmevmnwk) == 1650603592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hmakzogldmevmnwk) == (145654642 ^ hmakzogldmevmnwk)) {
                                    break;
                                }
                            }
                        }
                        int i26 = 1582361974 ^ hmakzogldmevmnwk;
                        throw new IllegalAccessException("double");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1976498182) {
                        i5 = 642145980 ^ i5;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1976498182 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (592891425 ^ i5)) {
                        int i27 = 1232433604 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -984320774 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1901643189 ^ i5)) {
                            int i28 = 466856752 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1944831582 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1332485352 ^ i5)) {
                                int i29 = 274920596 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1207700965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (278329926 ^ i5)) {
                                    int i30 = 637916085 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 788402081 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (613529016 ^ i5)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                int i31 = 882452827 ^ i5;
                throw new IOException();
            }
            i5 = 646117751 ^ i5;
            this.plugin.getTeleportConfig(419749180).sendMessage(player, Messages.NON_VALID_REQUEST, new String[(byte) (1996521027 ^ i5)], 82432121);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1207700965) {
                int i32 = 445201422 ^ i5;
                this.plugin.getTeleportConfig(419749180).playSound(player, rggdwghxwy(zbbkigvzdyszvxa(), i32), 1571899765);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i32) != 1816793707) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i32) == 1816793707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i32) == (1044369302 ^ i32)) {
                            break;
                        }
                    }
                    int i33 = 1314917939 ^ i32;
                    throw new IOException("double");
                }
                int i34 = 1261550502 ^ i32;
                player.closeInventory();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i34) == 902287193) {
                    int i35 = 283884955 ^ i34;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i34) == 902287193 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i34) == (172669367 ^ i34)) {
                        break;
                    }
                }
                int i36 = 296141312 ^ i34;
                throw new IllegalAccessException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1976498182) {
                    int i272 = 1232433604 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -984320774) {
                        int i282 = 466856752 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1944831582) {
                            int i292 = 274920596 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1207700965) {
                                int i302 = 637916085 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 788402081) {
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
            int i312 = 882452827 ^ i5;
            throw new IOException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -751516109 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (910860784 ^ i2)) {
                int i37 = 2144037398 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2076544422 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (406273891 ^ i2)) {
                    int i38 = 851170412 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1067802913 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1447141646 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i39 = 673432251 ^ i2;
        throw new RuntimeException("double");
    }

    static {
        nothing_to_see_here[0] = " ⠁⡼⠋⠀⣆⠀⠀⣰⣿⣫⣾⢿⣿⣿⠍⢠⠠⠀⠀⢀⠰⢾⣺⣻⣿⣿⣿⣷⡀⠀";
        nothing_to_see_here[1] = "⣥⠀⠀⠀⠁⠀⠠⢻⢬⠁⣠⣾⠛⠁⠀⠀⠀⠀⠀⠀⠀⠐⠱⠏⡉⠙⣿⣿⡇⠀";
        nothing_to_see_here[2] = "⢳⠀⢰⡖⠀⠀⠈⠀⣺⢰⣿⢻⣾⣶⣿⣿⣶⣶⣤⣤⣴⣾⣿⣷⣼⡆⢸⣿⣧⠀";
        nothing_to_see_here[3] = "⠈⠀⠜⠈⣀⣔⣦⢨⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣅⣼⠛⢹⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⢋⡿⡿⣯⣭⡟⣟⣿⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⡘⠀";
        nothing_to_see_here[5] = "⡀⠐⠀⠀⠀⣿⣯⡿⣿⣿⣿⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣉⢽⣿⡆⠀⠀";
        nothing_to_see_here[6] = "⢳⠀⠄⠀⢀⣿⣿⣿⣿⣿⣿⣿⠙⠉⠉⠉⠛⣻⢛⣿⠛⠃⠀⠐⠛⠻⣿⡇⠀⠀";
        nothing_to_see_here[7] = "⣾⠄⠀⠀⢸⣿⣿⡿⠟⠛⠁⢀⠀⢀⡄⣀⣠⣾⣿⣿⡠⣴⣎⣀⣠⣠⣿⡇⠀⠀";
        nothing_to_see_here[8] = "⣧⠀⣴⣄⣽⣿⣿⣿⣶⣶⣖⣶⣬⣾⣿⣾⣿⣿⣿⣿⣽⣿⣿⣿⣿⣿⣿⡇⠀⠀";
        nothing_to_see_here[9] = "⣿⣶⣈⡯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣹⢧⣿⣿⣿⣄⠙⢿⣿⣿⣿⠇⠀⠀";
        nothing_to_see_here[10] = "⠹⣿⣿⣧⢌⢽⣻⢿⣯⣿⣿⣿⣿⠟⣠⡘⠿⠟⠛⠛⠟⠛⣧⡈⠻⣾⣿⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠈⠉⣷⡿⣽⠶⡾⢿⣿⣿⣿⢃⣤⣿⣷⣤⣤⣄⣄⣠⣼⡿⢷⢀⣿⡏⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⢀⣿⣷⠌⣈⣏⣝⠽⡿⣷⣾⣏⣀⣉⣉⣀⣀⣀⣠⣠⣄⡸⣾⣿⠃⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⣰⡿⣿⣧⡐⠄⠱⣿⣺⣽⢟⣿⣿⢿⣿⣍⠉⢀⣀⣐⣼⣯⡗⠟⡏⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⣰⣿⠀⣿⣿⣴⡀⠂⠘⢹⣭⡂⡚⠿⢿⣿⣿⣿⡿⢿⢿⡿⠿⢁⣴⣿⣷⣶⣦⣤";
        lpjvyxhymf = ByteBuffer.wrap(wrsndsvgejhdlwg()).asCharBuffer().toString();
        f1264s5wGES3vt = 842946993 ^ new Random(-9173062153250067739L).nextInt();
    }

    public static String rggdwghxwy(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = lpjvyxhymf.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] wsiwmhipijznyhu() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 0};
    }

    private static byte[] zzwzkumufkiyzgt() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 5};
    }

    private static byte[] zbbkigvzdyszvxa() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 10};
    }

    private static byte[] wrsndsvgejhdlwg() {
        return new byte[]{50, 85, 54, 65, 50, 71, 52, 91, 57, 64, 50, 85, 57, 69, 48, 65, 55, 87, 55, 68, 49, 93, 51, 69, 55, 67, 49, 86, 52, 75};
    }

    private static int hmakzogldmevmnwk(int i, int i2) {
        return i ^ i2;
    }
}
