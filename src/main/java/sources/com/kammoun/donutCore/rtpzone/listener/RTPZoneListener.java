package com.kammoun.donutCore.rtpzone.listener;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.rtpzone.RtpZone;
import com.kammoun.donutCore.rtpzone.manager.RTPPlayerManager;
import com.kammoun.donutCore.rtpzone.manager.RTPSoundManager;
import com.kammoun.donutCore.rtpzone.service.RTPWorldGuardHelper;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class RTPZoneListener implements Listener {
    private final RtpZone plugin;
    private final RTPWorldGuardHelper worldGuardHelper;
    private final RTPPlayerManager playerManager;
    private final RTPSoundManager soundManager;
    private static int ny0NHa1En2 = 0;
    private transient int Ke0cu0Jiyq = 2020647954;
    private static String[] nothing_to_see_here = new String[15];

    public RTPZoneListener(RtpZone rtpZone, RTPWorldGuardHelper rTPWorldGuardHelper, RTPPlayerManager rTPPlayerManager, RTPSoundManager rTPSoundManager, int i) {
        nnlarhvbotlinsek(1758237077 ^ 1069377848, 2095328455);
        int parseInt = 821075483 ^ (1872651839 ^ Integer.parseInt("1962617934"));
        this.Ke0cu0Jiyq = 2020647954 ^ ny0NHa1En2;
        int nnlarhvbotlinsek = 568533673 ^ nnlarhvbotlinsek(parseInt, 804262831);
        this.plugin = rtpZone;
        this.worldGuardHelper = rTPWorldGuardHelper;
        this.playerManager = rTPPlayerManager;
        this.soundManager = rTPSoundManager;
        int i2 = 432400840 ^ (737112078 ^ (840876524 ^ (507931669 ^ nnlarhvbotlinsek)));
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent) {
        int i = 2129838954 ^ (1312053395 ^ 1711150669);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1446744670) {
            i = 1463728369 ^ i;
            SchedulerUtil.runLater(()
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtpzone.listener.RTPZoneListener.onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent):void");
        }

        @EventHandler
        public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
            int i = 1774210046 ^ (2110090140 ^ 1711150669);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1881558661) {
                i = 218893312 ^ i;
                if (this.playerManager.isInRegion(playerQuitEvent.getPlayer(), 1100627743) == (2096577071 ^ i)) {
                    nnlarhvbotlinsek(i, 2128709059);
                    return;
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -407252613) {
                    i = 1051527451 ^ i;
                    this.playerManager.removePlayer(playerQuitEvent.getPlayer(), 1695314045);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 315726242) {
                        int i2 = 1078758616 ^ i;
                        return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 315726242 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (59851108 ^ i)) {
                    int i3 = 1162397847 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 280362848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (717518693 ^ i)) {
                        int i4 = 570777281 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1881558661 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1333974994 ^ i)) {
                            int i5 = 526857546 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -407252613 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1833393885 ^ i)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i6 = 1674658036 ^ i;
            throw new IOException();
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
            ny0NHa1En2 = (-538645590) ^ new Random(-1433039772926787425L).nextInt();
        }

        public static String mxvgaxcfvu(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] qiofwisynuvowbl() {
            return new byte[]{88, 17, 106, 13, 64};
        }

        private static int nnlarhvbotlinsek(int i, int i2) {
            return i ^ i2;
        }
    }
