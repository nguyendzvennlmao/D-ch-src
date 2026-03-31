package com.kammoun.donutCore.tpa.manager;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.tpa.TeleportPlugin;
import com.kammoun.donutCore.tpa.model.TeleportPlayer;
import com.kammoun.donutCore.tpa.model.TeleportRequest;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class TeleportManager implements Listener {
    private final TeleportPlugin plugin;
    private final Map<UUID, TeleportPlayer> playerCache;
    private final Map<UUID, Map<UUID, TeleportRequest>> activeRequests;
    private final HashMap<UUID, SchedulerUtil.Task> tasks;
    private static int gdVkdWtgtJ = 0;
    private transient int ZNEVTUcpL2 = 1905297511;
    private static byte[] tnzdljzsts;
    private static String[] nothing_to_see_here = new String[19];

    public TeleportManager(TeleportPlugin teleportPlugin, int i) {
        int i2 = 1010798609 ^ (1266802335 ^ 722543652);
        int parseInt = 762474876 ^ (616445420 ^ Integer.parseInt("1432563258"));
        this.ZNEVTUcpL2 = 1905297511 ^ gdVkdWtgtJ;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 59998726:
                    parseInt = 1133688347 ^ parseInt;
                    break;
                case 367466123:
                default:
                    throw new RuntimeException();
                case 1266723254:
                case 1843624003:
                    break;
            }
        }
        this.tasks = new HashMap<>();
        this.plugin = teleportPlugin;
        this.playerCache = new ConcurrentHashMap();
        this.activeRequests = new ConcurrentHashMap();
        Bukkit.getPluginManager().registerEvents(this, teleportPlugin.getApi(2142241109));
        int i3 = 763675206 ^ (1743126826 ^ (2094672753 ^ (1147377043 ^ (518077629 ^ (381276057 ^ parseInt)))));
    }

    public TeleportPlayer getOrLoadPlayer(UUID uuid, int i) {
        int i2 = 664127275 ^ (327811424 ^ 2031328531);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1751308994) {
            int i3 = 1939799241 ^ i2;
            return this.playerCache.computeIfAbsent(uuid, uuid2 -> {
                int i4 = 116071178 ^ (1043960354 ^ 2031328531);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 235446746) {
                    int i5 = 1460679010 ^ i4;
                    return this.plugin.getDatabase(989988253).load(uuid2, 1872113373);
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 235446746 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (194033690 ^ i4)) {
                        int i6 = 422777124 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1232524600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1507243570 ^ i4)) {
                            break;
                        }
                    }
                }
                int i7 = 565148562 ^ i4;
                throw new IllegalAccessException();
            });
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1751308994 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1413391353 ^ i2)) {
                int i4 = 2023417606 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -191546231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1644521299 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1659400262 ^ i2;
        throw new RuntimeException();
    }

    public void savePlayer(UUID uuid, int i) {
        int i2 = 162386821 ^ (136110348 ^ 2031328531);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -988447533) {
            i2 = 1723126570 ^ i2;
            TeleportPlayer teleportPlayer = this.playerCache.get(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -256645760) {
                i2 = 1415228192 ^ i2;
                if (teleportPlayer == null) {
                    int i3 = 314097879 ^ i2;
                    return;
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1382464642) {
                    int i4 = 1358363202 ^ i2;
                    this.plugin.getDatabase(989988253).savePlayer(teleportPlayer, 487365622);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -707694960) {
                        int i5 = 1112423061 ^ i4;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -707694960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1534534154 ^ i4)) {
                            break;
                        }
                    }
                    int i6 = 1994377155 ^ i4;
                    throw new IOException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -988447533 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1648852204 ^ i2)) {
                int i7 = 1590592567 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -945767878 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (246296541 ^ i2)) {
                    int i8 = 1468440100 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -256645760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (107049547 ^ i2)) {
                        int i9 = 872182397 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1382464642 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1602824769 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i10 = 1449676981 ^ i2;
        throw new RuntimeException();
    }

    public void unloadPlayer(UUID uuid, int i) {
        int i2 = 1521928466 ^ (366367740 ^ 2031328531);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1281867799) {
            int i3 = 669193391 ^ i2;
            savePlayer(uuid, 1829680960);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1937728880) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1666672240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1605998985 ^ i3)) {
                        int i4 = 771289456 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1937728880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2022597929 ^ i3)) {
                            break;
                        }
                    }
                }
                int i5 = 80949217 ^ i3;
                throw new IOException("double");
            }
            i2 = 201654305 ^ i3;
            this.playerCache.remove(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -324494440) {
                i2 = 2854352 ^ i2;
                this.activeRequests.remove(uuid);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -302713576) {
                    i2 = 1034430720 ^ i2;
                    cancelTeleport(uuid, 81661279);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 11910425) {
                        int i6 = 864265361 ^ i2;
                        return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -302713576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1373438345 ^ i2)) {
                int i7 = 831174572 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 11910425 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1119322949 ^ i2)) {
                    int i8 = 665590879 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -324494440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (520408355 ^ i2)) {
                        int i9 = 162063945 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1281867799 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2027055812 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i10 = 656889072 ^ i2;
        throw new RuntimeException();
    }

    public void addRequest(UUID uuid, UUID uuid2, TeleportRequest.TeleportType teleportType, int i) {
        int i2 = 864142290 ^ (539996356 ^ 2031328531);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1441755179) {
            int i3 = 50216276 ^ i2;
            TeleportRequest teleportRequest = new TeleportRequest(uuid, uuid2, teleportType, 1869167987);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1109301899) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1109301899 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1863689289 ^ i3)) {
                        break;
                    }
                }
                int i4 = 2137330790 ^ i3;
                throw new RuntimeException("double");
            }
            int i5 = 303104787 ^ i3;
            Map<UUID, TeleportRequest> computeIfAbsent = this.activeRequests.computeIfAbsent(uuid2, uuid3 -> {
                int i6 = 1414819204 ^ (68015623 ^ 142808436);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -959088710) {
                    int i7 = 1086727604 ^ i6;
                    return new ConcurrentHashMap();
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -959088710 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (936389732 ^ i6)) {
                        int i8 = 825622005 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1058776552 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (158028850 ^ i6)) {
                            break;
                        }
                    }
                }
                int i9 = 951748010 ^ i6;
                throw new IOException();
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -761888237) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -761888237 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1157678863 ^ i5)) {
                        break;
                    }
                }
                int i6 = 1544929360 ^ i5;
                throw new IllegalAccessException("double");
            }
            i2 = 1378199248 ^ i5;
            computeIfAbsent.put(uuid, teleportRequest);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1136374929) {
                int i7 = 324139597 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -650877191 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1726558734 ^ i2)) {
                int i8 = 97496821 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1136374929 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1096918680 ^ i2)) {
                    int i9 = 503148380 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1441755179 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1514059510 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i10 = 1060972819 ^ i2;
        throw new IOException();
    }

    public Optional getRequest(UUID uuid, UUID uuid2, int i) {
        int i2 = 1722069207 ^ (509518404 ^ 2031328531);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 256670720) {
            i2 = 914576086 ^ i2;
            Map requestsFor = getRequestsFor(uuid, 111102479);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1151931727) {
                int i3 = 1212403776 ^ i2;
                TeleportRequest teleportRequest = (TeleportRequest) requestsFor.get(uuid2);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -112695117) {
                    int i4 = 1616385641 ^ i3;
                    return Optional.ofNullable(teleportRequest);
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -112695117 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1070768656 ^ i3)) {
                        break;
                    }
                }
                int i5 = 168022938 ^ i3;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 256670720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1849595092 ^ i2)) {
                int i6 = 708761118 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -74916872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1279393364 ^ i2)) {
                    int i7 = 2066663496 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1151931727 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2120181378 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 685322411 ^ i2;
        throw new RuntimeException();
    }

    public void removeRequest(java.util.UUID r5, java.util.UUID r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.manager.TeleportManager.removeRequest(java.util.UUID, java.util.UUID, int):void");
    }

    public boolean hasPendingRequest(UUID uuid, UUID uuid2, int i) {
        int i2 = 1964169410 ^ (1937384812 ^ 2031328531);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -69532181) {
            int i3 = 1282328299 ^ i2;
            return getRequest(uuid, uuid2, 1023825796).isPresent();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1733479759 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1425131798 ^ i2)) {
                int i4 = 2037901442 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -69532181 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (396564493 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1583129452 ^ i2;
        throw new IllegalAccessException();
    }

    public void clearAllRequestsFrom(UUID uuid, int i) {
        int i2 = 1066266154 ^ (194868660 ^ 2031328531);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1746416746) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1746416746 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2084980348 ^ i2)) {
                    break;
                }
            }
            int i3 = 975558125 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 395246069 ^ i2;
        this.activeRequests.values().forEach(map -> {
            int i5 = 241565607 ^ (1279852366 ^ 142808436);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1433447658) {
                int i6 = 633418800 ^ i5;
                map.remove(uuid);
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1433447658 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (682126405 ^ i5)) {
                    int i7 = 669873792 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2071530859 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1717433951 ^ i5)) {
                        break;
                    }
                }
            }
            int i8 = 2051171790 ^ i5;
            throw new IOException();
        });
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -730858558) {
            int i5 = 563362267 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -730858558 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1840679094 ^ i4)) {
                int i6 = 1153651479 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -657574629 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (991930350 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 1586563358 ^ i4;
        throw new RuntimeException();
    }

    public Map getRequestsFor(UUID uuid, int i) {
        int i2 = 315507684 ^ (1925066150 ^ 2031328531);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -887121272) {
            int i3 = 1175750528 ^ i2;
            return this.activeRequests.getOrDefault(uuid, new ConcurrentHashMap());
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -887121272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1590326869 ^ i2)) {
                int i4 = 861685792 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -71588214 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (456509712 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1481505976 ^ i2;
        throw new RuntimeException();
    }

    public void cleanup(int i) {
        int i2 = 1377327408 ^ (317801165 ^ 2031328531);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -808175759) {
            int i3 = 2063526761 ^ i2;
            long clearTime = this.plugin.getTeleportConfig(419749180).getClearTime(1230524885);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 404974650) {
                i2 = 358960552 ^ i3;
                this.activeRequests.values().forEach(map -> {
                    int i4 = 515296351 ^ (886854651 ^ 142808436);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 390878849) {
                        int i5 = 2114121572 ^ i4;
                        map.entrySet().removeIf(entry -> {
                            int i6 = 1591880979 ^ (988885547 ^ 142808436);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1686131299) {
                                int i7 = 1993435991 ^ i6;
                                return ((TeleportRequest) entry.getValue()).isExpired(clearTime, 278749404);
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -771028776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1724825208 ^ i6)) {
                                    int i8 = 1487074863 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1686131299 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1480667132 ^ i6)) {
                                        break;
                                    }
                                }
                            }
                            int i9 = 601050940 ^ i6;
                            throw new IOException();
                        });
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -413454942 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (66021875 ^ i4)) {
                            int i6 = 425858460 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 390878849 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1687451281 ^ i4)) {
                                break;
                            }
                        }
                    }
                    int i7 = 98581252 ^ i4;
                    throw new RuntimeException();
                });
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1291255430) {
                    i3 = 1981691840 ^ i2;
                    this.activeRequests.entrySet().removeIf(entry -> {
                        int i4 = 1582988300 ^ (998369247 ^ 142808436);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1791259963) {
                            int i5 = 79153244 ^ i4;
                            return ((Map) entry.getValue()).isEmpty();
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1333409755 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1818608824 ^ i4)) {
                                int i6 = 22577202 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1791259963 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (348360776 ^ i4)) {
                                    break;
                                }
                            }
                        }
                        int i7 = 2078767678 ^ i4;
                        throw new IOException();
                    });
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 66633593) {
                        int i4 = 171247467 ^ i3;
                        return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 66633593 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (693069329 ^ i3)) {
                    int i5 = 2146163533 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1381008417 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (593689082 ^ i3)) {
                        int i6 = 961429809 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 404974650 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1900874255 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i7 = 397108074 ^ i3;
            throw new IOException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -808175759 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2120686926 ^ i2)) {
                int i8 = 1459397869 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1291255430 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1422713856 ^ i2)) {
                    break;
                }
            }
        }
        int i9 = 416163848 ^ i2;
        throw new IOException("double");
    }

    public void saveAll(int i) {
        int i2 = 848658863 ^ (1756921122 ^ 2031328531);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 435358961) {
            i2 = 1636173637 ^ i2;
            this.plugin.getDatabase(989988253).saveAll(this.playerCache.values(), 1865999913);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 365115098) {
                int i3 = 751008909 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 435358961 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (814094676 ^ i2)) {
                int i4 = 1713747132 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1943589555 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (932017968 ^ i2)) {
                    int i5 = 1875744014 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 365115098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (995544621 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 654194500 ^ i2;
        throw new IOException();
    }

    public void cancelTeleport(UUID uuid, int i) {
        int i2 = 1588538902 ^ (1060683468 ^ 2031328531);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1004507576) {
            i2 = 1896050512 ^ i2;
            SchedulerUtil.Task remove = this.tasks.remove(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1278940363) {
                i2 = 1373880604 ^ i2;
                if (remove != null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1020978135) {
                        i2 = 684581080 ^ i2;
                        remove.cancel(1520188267);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2058741016) {
                            int i3 = 1219296191 ^ i2;
                            return;
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                        case 197785545:
                        case 222479541:
                            int i4 = 1616976743 ^ i2;
                            return;
                        case 985380362:
                        default:
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1070741742 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (423235684 ^ i2)) {
                                    int i5 = 1479532389 ^ i2;
                                    throw new RuntimeException("double");
                                }
                            }
                            break;
                        case 1678119205:
                            return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1004507576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1541607269 ^ i2)) {
                int i6 = 680720449 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1020978135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1414960788 ^ i2)) {
                    int i7 = 1129778017 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1278940363 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1025432311 ^ i2)) {
                        int i8 = 533776728 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2058741016 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1072236012 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i9 = 1882347537 ^ i2;
        throw new IllegalAccessException();
    }

    public void acceptRequest(com.kammoun.donutCore.tpa.model.TeleportRequest r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.manager.TeleportManager.acceptRequest(com.kammoun.donutCore.tpa.model.TeleportRequest, int):void");
    }

    private void teleportWithCountdown(Player player, Location location, int i) {
        int i2 = 517649026 ^ (987362730 ^ 2031328531);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -393817638) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -393817638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1448904469 ^ i2)) {
                    break;
                }
            }
            int i3 = 1985598708 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 230444531 ^ i2;
        UUID uniqueId = player.getUniqueId();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2056995262) {
            i4 = 1912459951 ^ i4;
            cancelTeleport(uniqueId, 81661279);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 176827193) {
                int i5 = 1145738462 ^ i4;
                int[] iArr = new int[(byte) (1696321976 ^ i5)];
                iArr[(byte) (1696321977 ^ i5)] = (byte) (1696321980 ^ i5);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 685673931) {
                    int i6 = 2100257067 ^ i5;
                    SchedulerUtil.Task[] taskArr = new SchedulerUtil.Task[(byte) (406106259 ^ i6)];
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1046117232) {
                        i4 = 77857480 ^ i6;
                        Runnable runnable = ()
                        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.manager.TeleportManager.teleportWithCountdown(org.bukkit.entity.Player, org.bukkit.Location, int):void");
                    }

                    @org.bukkit.event.EventHandler
                    public void onPlayerMove(org.bukkit.event.player.PlayerMoveEvent r7) {
                        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.manager.TeleportManager.onPlayerMove(org.bukkit.event.player.PlayerMoveEvent):void");
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
                        tnzdljzsts = fzsdvnzkvfpyzyp();
                        gdVkdWtgtJ = (-1346240860) ^ new Random(-2165030066054457490L).nextInt();
                    }

                    public static String tvyewbxipx(byte[] bArr, int i) {
                        byte[] bytes = Integer.toString(i).getBytes();
                        int i2 = 0;
                        while (true) {
                            int i3 = i2;
                            if (i3 >= bArr.length) {
                                return new String(bArr, StandardCharsets.UTF_16);
                            }
                            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                            bArr[i3] = (byte) (bArr[i3] ^ tnzdljzsts[i3 % tnzdljzsts.length]);
                            i2 = i3 + 1;
                        }
                    }

                    private static byte[] fzsdvnzkvfpyzyp() {
                        return new byte[]{64, 14, 72, 14, 80, 1, 114, 26, 93};
                    }

                    private static byte[] ohimiqwqetqtapf() {
                        return new byte[]{-113, -62, 125, 24, 101, 71, 68, 74, 101, 28, 61, 24, 61, 64};
                    }

                    private static byte[] dvasbvqfpbdpzns() {
                        return new byte[]{-122, -59, 120, 89, 103, 80, 67, 64, 106, 29, 58, 8, 56, 19, 51, 110, 35, 30, 120, 95, 120, 84, 103, 86, 67, 83, 106, 23, 58, 10, 56, 19};
                    }

                    private static byte[] qebpngtavvgacnn() {
                        return new byte[]{-117, -64, 112, 84, 98, 86, 74, 89, 108, 27, 63, 4, 55, 79, 57, 46, 44, 3, 117, 72, 112, 89};
                    }

                    private static byte[] gsvwfduqxjmrrze() {
                        return new byte[]{-113, -60, Byte.MAX_VALUE, 27, 102, 66, 74, 75, 105, 26, 63, 24, 57, 69};
                    }

                    private static byte[] dehuovhwqhvfcph() {
                        return new byte[]{-113, -60, 125, 19, 102, 72, 66, 70, 108, 22, 63, 4, 59, 13, 55, 57, 42, 72};
                    }

                    private static byte[] mkzbmgqopagfwsh() {
                        return new byte[]{-116, -55, 125, 29, 98, 67, 74, 69, 107, 19, 54, 4, 56, 7, 51, 56, 41, 78};
                    }

                    private static int onodvalvsyywcyuj(int i, int i2) {
                        return i2 ^ i;
                    }
                }
