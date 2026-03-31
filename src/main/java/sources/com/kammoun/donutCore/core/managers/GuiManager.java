package com.kammoun.donutCore.core.managers;

import com.kammoun.donutCore.core.CorePlugin;
import com.kammoun.donutCore.core.gui.AbstractGui;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class GuiManager implements Listener {
    private final CorePlugin plugin;
    private final Map<UUID, AbstractGui> openGuis;
    private static int b0CWGFjk4J = 0;
    private transient int I4R4bW4DeY = 79598738;
    private static String wvuxeszilx;
    private static String[] nothing_to_see_here = new String[15];

    public GuiManager(CorePlugin corePlugin, int i) {
        int i2 = 1595471141 ^ (234975415 ^ 1056719092);
        int parseInt = 728904763 ^ (915287276 ^ Integer.parseInt("1914297777"));
        this.I4R4bW4DeY = 79598738 ^ b0CWGFjk4J;
        int zyqifvjgbbfstyba = 1247724255 ^ zyqifvjgbbfstyba(parseInt, 1280618216);
        this.openGuis = new ConcurrentHashMap();
        this.plugin = corePlugin;
        corePlugin.getApi(2142241109).getServer().getPluginManager().registerEvents(this, corePlugin.getApi(2142241109));
        int i3 = 1838439396 ^ (176989056 ^ (2117809742 ^ zyqifvjgbbfstyba));
    }

    public void openGui(Player player, AbstractGui abstractGui, Object[] objArr, int i) {
        int i2 = 1724471709 ^ (2033703501 ^ 1184745703);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -887465542) {
            int i3 = 521648200 ^ i2;
            this.openGuis.put(player.getUniqueId(), abstractGui);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 866622458) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 866622458 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (192766756 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1959124712 ^ i3;
                throw new IllegalAccessException("double");
            }
            i2 = 2140689379 ^ i3;
            abstractGui.open(player, objArr, 635014298);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -815463199) {
                int i5 = 730437068 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -815463199 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (297524085 ^ i2)) {
                int i6 = 847675245 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -887465542 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (746657743 ^ i2)) {
                    int i7 = 1199535403 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1825985920 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (20484477 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1212989856 ^ i2;
        throw new IllegalAccessException();
    }

    @Nullable
    public AbstractGui getOpenGui(Player player, int i) {
        int i2 = 230791272 ^ (723895347 ^ 1184745703);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 63743459) {
            int i3 = 611373824 ^ i2;
            return this.openGuis.get(player.getUniqueId());
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 63743459 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (844263433 ^ i2)) {
                int i4 = 1629558164 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 541736418 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1975400387 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 845106020 ^ i2;
        throw new RuntimeException();
    }

    @org.bukkit.event.EventHandler
    public void onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.managers.GuiManager.onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent):void");
    }

    @org.bukkit.event.EventHandler
    public void onInventoryClose(org.bukkit.event.inventory.InventoryCloseEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.managers.GuiManager.onInventoryClose(org.bukkit.event.inventory.InventoryCloseEvent):void");
    }

    @org.bukkit.event.EventHandler
    public void onPlayerQuit(org.bukkit.event.player.PlayerQuitEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.managers.GuiManager.onPlayerQuit(org.bukkit.event.player.PlayerQuitEvent):void");
    }

    public void cleanupPlayer(Player player) {
        int i = 964652705 ^ (932656568 ^ 1184745703);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1135386610) {
            int i2 = 1322336151 ^ i;
            AbstractGui remove = this.openGuis.remove(player.getUniqueId());
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 891642696) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 891642696 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (410898630 ^ i2)) {
                        break;
                    }
                }
                int i3 = 546530447 ^ i2;
                throw new IllegalAccessException("double");
            }
            i = 1034895441 ^ i2;
            if (remove == null) {
                zyqifvjgbbfstyba(i, 565611578);
                return;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -664837695) {
                i = 1408721542 ^ i;
                remove.remove(player, 1345620668);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1206154739) {
                    int i4 = 1916923580 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -706019312 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1777807385 ^ i)) {
                int i5 = 905631625 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1206154739 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (795393864 ^ i)) {
                    int i6 = 1081583975 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -664837695 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (227931281 ^ i)) {
                        int i7 = 1001543804 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1135386610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1931518012 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i8 = 1945803622 ^ i;
        throw new RuntimeException();
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
        wvuxeszilx = ByteBuffer.wrap(svmbypcihewprsl()).asCharBuffer().toString();
        b0CWGFjk4J = 1215698837 ^ new Random(1562239190521989709L).nextInt();
    }

    public static String pjllxymiwr(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = wvuxeszilx.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] svmbypcihewprsl() {
        return new byte[0];
    }

    private static int zyqifvjgbbfstyba(int i, int i2) {
        return i2 ^ i;
    }
}
