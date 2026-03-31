package com.kammoun.donutCore.tpa.events;

import com.kammoun.donutCore.tpa.model.TeleportRequest;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class TpRequestEvent extends Event implements Cancellable {
    private static final HandlerList HANDLERS;
    private final Player requester;
    private final Player target;
    private final TeleportRequest.TeleportType type;
    private boolean cancelled;
    private static int lJFGhrJLIC = 0;
    private transient int I4onlzV66E = 1447930505;
    private static byte[] ujekffkjzu;
    private static String[] nothing_to_see_here = new String[13];

    public TpRequestEvent(Player player, Player player2, TeleportRequest.TeleportType teleportType, int i) {
        eioetwwtbzowritr(879021942 ^ 1250680823, 1630461578);
        int parseInt = 870971657 ^ (942021833 ^ Integer.parseInt("336473035"));
        this.I4onlzV66E = 1447930505 ^ lJFGhrJLIC;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 226975988:
                    parseInt = 253401358 ^ parseInt;
                    break;
                case 818272325:
                case 1187982475:
                    break;
                case 1406991161:
                default:
                    throw new IOException();
            }
        }
        this.requester = player;
        this.target = player2;
        this.type = teleportType;
        this.cancelled = false;
        int i2 = 336925765 ^ (352425579 ^ (2030256672 ^ (911348535 ^ (1784531664 ^ parseInt))));
    }

    public boolean isCancelled() {
        int i = 1572026782 ^ (1804768114 ^ 20431485);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1196211063) {
            int i2 = 1564544968 ^ i;
            return this.cancelled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1388001995 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (232199848 ^ i)) {
                int i3 = 783938316 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1196211063 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (26808652 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 147109630 ^ i;
        throw new IOException();
    }

    public void setCancelled(boolean z) {
        int i = 1181852687 ^ (257705353 ^ 20431485);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 1087447002) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -461904575 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (989404893 ^ i)) {
                    int i2 = 621998065 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1087447002 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1719849602 ^ i)) {
                        break;
                    }
                }
            }
            int i3 = 215535807 ^ i;
            throw new IOException();
        }
        int i4 = 1538097311 ^ i;
        this.cancelled = z;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1648551136) {
            int i5 = 792289228 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1648551136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1545356327 ^ i4)) {
                break;
            }
        }
        int i6 = 347122426 ^ i4;
        throw new RuntimeException("double");
    }

    @NotNull
    public HandlerList getHandlers() {
        int i = 2084769607 ^ (1536693213 ^ 20431485);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 929494841) {
            int i2 = 1383857996 ^ i;
            return HANDLERS;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1531376293 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (606183914 ^ i)) {
                int i3 = 110662608 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 929494841 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1694115931 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 288120193 ^ i;
        throw new IllegalAccessException();
    }

    public static HandlerList getHandlerList() {
        int i = 937078772 ^ (676432661 ^ (1629873246 ^ 1467640052));
        return HANDLERS;
    }

    @Generated
    public Player getRequester(int i) {
        int i2 = 440444462 ^ (648727589 ^ 20431485);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -286440527) {
            int i3 = 1208983635 ^ i2;
            return this.requester;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -286440527 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1079767758 ^ i2)) {
                int i4 = 2019548442 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1366277845 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1871040138 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 98535037 ^ i2;
        throw new IOException();
    }

    @Generated
    public Player getTarget(int i) {
        int i2 = 43605662 ^ (1501703213 ^ 20431485);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -781875598) {
            int i3 = 344047077 ^ i2;
            return this.target;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -781875598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1621942788 ^ i2)) {
                int i4 = 369360495 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1969776986 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1360116734 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1346016924 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public TeleportRequest.TeleportType getType(int i) {
        int i2 = 1102084287 ^ (1446697861 ^ 20431485);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1242887624) {
            int i3 = 2056673207 ^ i2;
            return this.type;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1242887624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1966571577 ^ i2)) {
                int i4 = 102951977 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1633269635 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (110884708 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1607441623 ^ i2;
        throw new IOException();
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
        int parseInt = 1041822130 ^ (1469304373 ^ Integer.parseInt("336473035"));
        ujekffkjzu = krxcqgyxsqddyyz();
        lJFGhrJLIC = 1543061135 ^ new Random(-7016058820172597261L).nextInt();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -332881309) {
            int i = 1298936663 ^ parseInt;
            HANDLERS = new HandlerList();
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -2025244455 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1929930767 ^ parseInt)) {
                int i2 = 541416402 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -332881309 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (924825218 ^ parseInt)) {
                    break;
                }
            }
        }
        int i3 = 951497159 ^ parseInt;
        throw new IOException();
    }

    public static String fdblidottc(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ ujekffkjzu[i3 % ujekffkjzu.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] krxcqgyxsqddyyz() {
        return new byte[]{115, 39, 54, 39, 22, 118, 123, 57, 33, 122, 53, 126, 16, 96, 112, 37, 59, 40, 50, 6, 77, 114, 62, 8, 18, 99, 31, 63, 63, 32, 34, 75, 30, 43, 26, 13, 21, 12};
    }

    private static int eioetwwtbzowritr(int i, int i2) {
        return i ^ i2;
    }
}
