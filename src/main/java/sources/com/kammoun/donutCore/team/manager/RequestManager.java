package com.kammoun.donutCore.team.manager;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.team.models.TeamRequest;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RequestManager {
    private final ConcurrentHashMap<UUID, List<TeamRequest>> pendingInvites;
    private final long REQUEST_EXPIRATION_TIME;
    private SchedulerUtil.Task cleanupTask;

    private static int f1175VhaJC77Nu = 0;
    private transient int UXrUkaDfWV = 1056882763;
    private static String[] nothing_to_see_here = new String[15];

    public RequestManager(com.kammoun.donutCore.team.TeamPlugin r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.manager.RequestManager.<init>(com.kammoun.donutCore.team.TeamPlugin, int):void");
    }

    public boolean sendInvite(UUID uuid, String str, UUID uuid2, UUID uuid3, int i) {
        int i2 = 410927305 ^ (1517151359 ^ 1450953103);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1555863096) {
            i2 = 735548082 ^ i2;
            if (hasInviteFrom(uuid3, uuid, 93177253) == (1069547403 ^ i2)) {
                int rrgvlfudpsxlzxsi = rrgvlfudpsxlzxsi(i2, 1420803977);
                TeamRequest teamRequest = new TeamRequest(uuid, uuid2, uuid3, str, 603056473);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rrgvlfudpsxlzxsi) != 1484914707) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rrgvlfudpsxlzxsi) == 1484914707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(rrgvlfudpsxlzxsi) == (1891550470 ^ rrgvlfudpsxlzxsi)) {
                            break;
                        }
                    }
                    int i3 = 77418383 ^ rrgvlfudpsxlzxsi;
                    throw new IOException("double");
                }
                i2 = 473343985 ^ rrgvlfudpsxlzxsi;
                this.pendingInvites.computeIfAbsent(uuid3, uuid4 -> {
                    int i4 = 2020119873 ^ (1722702975 ^ 1753549252);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1306654765) {
                        int i5 = 1189626768 ^ i4;
                        return new ArrayList();
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1306654765 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (69729722 ^ i4)) {
                            int i6 = 1483493760 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2057561263 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (357044574 ^ i4)) {
                                break;
                            }
                        }
                    }
                    int i7 = 1784835142 ^ i4;
                    throw new IOException();
                }).add(teamRequest);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1187561573) {
                    return (byte) (1019432639 ^ (1273342285 ^ i2));
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -33555367) {
                return (byte) (881363533 ^ (188184006 ^ i2));
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1187561573 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1788026905 ^ i2)) {
                int i4 = 120426892 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1555863096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (552406432 ^ i2)) {
                    int i5 = 1702728809 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1539026327 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (809944802 ^ i2)) {
                        int i6 = 105993478 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -33555367 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1015449316 ^ i2)) {
                            int i7 = 493620743 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -434473487 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (532735350 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i8 = 1153862579 ^ i2;
        throw new RuntimeException();
    }

    public Optional acceptInvite(UUID uuid, UUID uuid2, int i) {
        int i2 = 249037238 ^ (676102498 ^ 1450953103);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -2022028581) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2022028581 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (363120376 ^ i2)) {
                    break;
                }
            }
            int i3 = 1008225407 ^ i2;
            throw new IOException("double");
        }
        int i4 = 2007194907 ^ i2;
        List<TeamRequest> list = this.pendingInvites.get(uuid);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 979411456) {
            i4 = 1136279892 ^ i4;
            if (list != null) {
                i4 = 1784018005 ^ i4;
                Stream<TeamRequest> stream = list.stream();
                Predicate<? super TeamRequest> predicate = teamRequest -> {
                    int i5 = 3715403 ^ (953387254 ^ 1753549252);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2089712694) {
                        int i6 = 2127225517 ^ i5;
                        return teamRequest.getTeamId(347416235).equals(uuid2);
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1965463201 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (826004967 ^ i5)) {
                            int i7 = 551286433 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2089712694 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2072791660 ^ i5)) {
                                break;
                            }
                        }
                    }
                    int i8 = 1382000702 ^ i5;
                    throw new RuntimeException();
                };
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1964837385) {
                    int i5 = 721192955 ^ i4;
                    Stream<TeamRequest> filter = stream.filter(predicate);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 586757584) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 586757584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1085527477 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 1284250033 ^ i5;
                        throw new IOException("double");
                    }
                    i4 = 1975719430 ^ i5;
                    Optional<TeamRequest> findFirst = filter.findFirst();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1931377181) {
                        i4 = 326946498 ^ i4;
                        findFirst.ifPresent(teamRequest2 -> {
                            int i7 = 1082406801 ^ (1568348658 ^ 1450953103);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1546076002) {
                                i7 = 1459733333 ^ i7;
                                list.remove(teamRequest2);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -467065400) {
                                    i7 = 49534162 ^ i7;
                                    if (list.isEmpty() == (511111275 ^ i7)) {
                                        int i8 = 1260694544 ^ i7;
                                        return;
                                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -206077096) {
                                        i7 = 571361718 ^ i7;
                                        this.pendingInvites.remove(uuid);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -473575703) {
                                            int i9 = 1764418982 ^ i7;
                                            return;
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1433213990 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1144145555 ^ i7)) {
                                    int i10 = 2143680073 ^ i7;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -206077096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (371473444 ^ i7)) {
                                        int i11 = 850908910 ^ i7;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -473575703 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (727578255 ^ i7)) {
                                            int i12 = 1909611552 ^ i7;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -467065400 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (807756353 ^ i7)) {
                                                int i13 = 1640801486 ^ i7;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1546076002 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1457473758 ^ i7)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            int i14 = 1329497027 ^ i7;
                            throw new RuntimeException();
                        });
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 386397171) {
                            int i7 = 954594521 ^ i4;
                            return findFirst;
                        }
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 666020002) {
                int i8 = 1351398691 ^ i4;
                return Optional.empty();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1931377181 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (218560770 ^ i4)) {
                int i9 = 1591112373 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1964837385 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (74089936 ^ i4)) {
                    int i10 = 1753313946 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 386397171 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1990631954 ^ i4)) {
                        int i11 = 1383317690 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 666020002 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2031310303 ^ i4)) {
                            int i12 = 994998215 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 979411456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (792798611 ^ i4)) {
                                int i13 = 228324425 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1546190408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (949990399 ^ i4)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i14 = 240929385 ^ i4;
        throw new IOException();
    }

    public boolean denyInvite(UUID uuid, UUID uuid2, int i) {
        int i2 = 1243116128 ^ (637969394 ^ 1450953103);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -752303895) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -752303895 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (453507362 ^ i2)) {
                    break;
                }
            }
            int i3 = 2099619136 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 618445846 ^ i2;
        List<TeamRequest> list = this.pendingInvites.get(uuid);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -171106216) {
            int i5 = 1070049068 ^ i4;
            if (list == null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 200284473) {
                    return (byte) (2096569755 ^ (1569267388 ^ i5));
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 200284473 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1861311395 ^ i5)) {
                        break;
                    }
                }
                int i6 = 92345242 ^ i5;
                throw new RuntimeException("double");
            }
            i4 = 226102099 ^ i5;
            boolean removeIf = list.removeIf(teamRequest -> {
                int i7 = 360127988 ^ (388984225 ^ 1753549252);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1458293899) {
                    int i8 = 1093385774 ^ i7;
                    return teamRequest.getTeamId(347416235).equals(uuid2);
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1605778937 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (406067326 ^ i7)) {
                        int i9 = 1950698269 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1458293899 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1778587915 ^ i7)) {
                            break;
                        }
                    }
                }
                int i10 = 577407958 ^ i7;
                throw new IllegalAccessException();
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1612727201) {
                int i7 = 312292520 ^ i4;
                if (list.isEmpty() == (1050229980 ^ i7)) {
                    rrgvlfudpsxlzxsi(i7, 724174757);
                } else {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -188094751) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -188094751 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (894542356 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 2096534010 ^ i7;
                        throw new IllegalAccessException("double");
                    }
                    int i9 = 816619679 ^ i7;
                    this.pendingInvites.remove(uuid);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 1907155480) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1907155480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1869646421 ^ i9)) {
                                break;
                            }
                        }
                        int i10 = 1708612841 ^ i9;
                        throw new IllegalAccessException("double");
                    }
                    int i11 = 461809466 ^ i9;
                }
                return removeIf;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -407311141 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1212663485 ^ i4)) {
                int i12 = 1358765894 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1382425656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (11540363 ^ i4)) {
                    int i13 = 2056858120 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -171106216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1516501926 ^ i4)) {
                        int i14 = 286630278 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1612727201 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2072387365 ^ i4)) {
                            break;
                        }
                    }
                }
            }
        }
        int i15 = 645725642 ^ i4;
        throw new RuntimeException();
    }

    public java.util.List getInvites(java.util.UUID r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.manager.RequestManager.getInvites(java.util.UUID, int):java.util.List");
    }

    public boolean hasInviteFrom(UUID uuid, UUID uuid2, int i) {
        int i2 = 589313222 ^ (365455046 ^ 1450953103);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 77388923) {
            i2 = 107542518 ^ i2;
            List<TeamRequest> list = this.pendingInvites.get(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 937124811) {
                int i3 = 46347408 ^ i2;
                if (list != null) {
                    int i4 = 1318478268 ^ i3;
                    return list.stream().anyMatch(teamRequest -> {
                        int i5 = 1110315926 ^ (959849752 ^ 1753549252);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1662387632) {
                            int i6 = 571752315 ^ i5;
                            return teamRequest.getTeamId(347416235).equals(uuid2);
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1662387632 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1376147753 ^ i5)) {
                                int i7 = 461236124 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1941438071 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (722415009 ^ i5)) {
                                    break;
                                }
                            }
                        }
                        int i8 = 2069494953 ^ i5;
                        throw new IOException();
                    });
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 566413131) {
                    return (byte) (121570959 ^ (1661427302 ^ i3));
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 566413131 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1656091756 ^ i3)) {
                        break;
                    }
                }
                int i5 = 916634627 ^ i3;
                throw new IllegalAccessException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 77388923 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (522980223 ^ i2)) {
                int i6 = 1612752365 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 972567672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1583653415 ^ i2)) {
                    int i7 = 820525461 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 937124811 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1607482404 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1300508825 ^ i2;
        throw new IllegalAccessException();
    }

    public boolean hasPendingInvites(UUID uuid) {
        int i = 309195386 ^ (2031543050 ^ 1450953103);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -402208775) {
            int i2 = 192036174 ^ i;
            return this.pendingInvites.containsKey(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -402208775 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1535791657 ^ i)) {
                int i3 = 688056200 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1281938039 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1543563517 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1890549727 ^ i;
        throw new IOException();
    }

    public void clearPlayerInvites(UUID uuid, int i) {
        int i2 = 1992775682 ^ (1237510515 ^ 1450953103);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1274267635) {
            i2 = 1736651694 ^ i2;
            this.pendingInvites.remove(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2011847296) {
                int i3 = 1278867568 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 371562754 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (222329808 ^ i2)) {
                int i4 = 1157561397 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2011847296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (815905039 ^ i2)) {
                    int i5 = 749829156 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1274267635 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1775399459 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1932637162 ^ i2;
        throw new RuntimeException();
    }

    public void clearTeamInvites(UUID uuid) {
        int i = 1484661865 ^ (1259618595 ^ 1450953103);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 680355370) {
            i = 1635109990 ^ i;
            this.pendingInvites.values().forEach(list -> {
                int i2 = 1068789483 ^ (1494782729 ^ 1753549252);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1901044016) {
                    int i3 = 1382493429 ^ i2;
                    list.removeIf(teamRequest -> {
                        int i4 = 1753573458 ^ (762065761 ^ 1753549252);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1801623481) {
                            int i5 = 241055211 ^ i4;
                            return teamRequest.getTeamId(347416235).equals(uuid);
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 429078753 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1688622071 ^ i4)) {
                                int i6 = 73737051 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1801623481 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (626095476 ^ i4)) {
                                    break;
                                }
                            }
                        }
                        int i7 = 2077783696 ^ i4;
                        throw new IOException();
                    });
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -495532390 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (218187752 ^ i2)) {
                        int i4 = 1432283969 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1901044016 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1120491488 ^ i2)) {
                            break;
                        }
                    }
                }
                int i5 = 656331829 ^ i2;
                throw new IllegalAccessException();
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 589497625) {
                i = 1102918881 ^ i;
                this.pendingInvites.entrySet().removeIf(entry -> {
                    int i2 = 1722390507 ^ (1053628949 ^ 1753549252);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2029248047) {
                        int i3 = 1270101301 ^ i2;
                        return ((List) entry.getValue()).isEmpty();
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -626161541 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (842164099 ^ i2)) {
                            int i4 = 1840580380 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2029248047 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1520778300 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 1429347865 ^ i2;
                    throw new IllegalAccessException();
                });
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 785031699) {
                    int i2 = 1501839047 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 785031699 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (122366150 ^ i)) {
                int i3 = 688466382 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 680355370 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (192858361 ^ i)) {
                    int i4 = 719146644 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 589497625 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1625612856 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 1562790010 ^ i;
        throw new IllegalAccessException();
    }

    private void startCleanupTask(int i) {
        int i2 = 1081348540 ^ (893371725 ^ 1450953103);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 427879409) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 427879409 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1267194196 ^ i2)) {
                    break;
                }
            }
            int i3 = 260575687 ^ i2;
            throw new IOException("double");
        }
        int i4 = 1452040964 ^ i2;
        this.cleanupTask = SchedulerUtil.runTimer(() -> {
            int i5 = 1825285117 ^ (2048388191 ^ 1450953103);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 87830890) {
                i5 = 429698749 ^ i5;
                cleanupExpiredRequests(471543894);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -908508030) {
                    int i6 = 1326778632 ^ i5;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 87830890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (876754199 ^ i5)) {
                    int i7 = 675446059 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -908508030 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1962737072 ^ i5)) {
                        int i8 = 854030008 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1317991232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (905684370 ^ i5)) {
                            break;
                        }
                    }
                }
            }
            int i9 = 755751226 ^ i5;
            throw new IOException();
        }, 1200L, 1200L, 2041710047);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1377569837) {
            int i5 = 1852536399 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1377569837 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1297946192 ^ i4)) {
                int i6 = 1418983259 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -558349912 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1877157482 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 1712592522 ^ i4;
        throw new RuntimeException();
    }

    private void cleanupExpiredRequests(int i) {
        int i2 = 1518546671 ^ (1169848956 ^ 1450953103);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1242884322) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1242884322 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1410500225 ^ i2)) {
                    break;
                }
            }
            int i3 = 1214867519 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1904347296 ^ i2;
        this.pendingInvites.values().forEach(list -> {
            int i5 = 406030173 ^ (551895437 ^ 1450953103);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1969781499) {
                int i6 = 787592628 ^ i5;
                list.removeIf(teamRequest -> {
                    int i7 = 138063767 ^ (65645573 ^ 1450953103);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -314158870) {
                        int i8 = 2051249916 ^ i7;
                        return teamRequest.isExpired(this.REQUEST_EXPIRATION_TIME, 1290193583);
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1062921993 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (825382920 ^ i7)) {
                            int i9 = 333565159 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -314158870 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (781112883 ^ i7)) {
                                break;
                            }
                        }
                    }
                    int i10 = 898115701 ^ i7;
                    throw new IOException();
                });
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1969781499 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1523542510 ^ i5)) {
                    int i7 = 1912076059 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 48617306 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1381965716 ^ i5)) {
                        break;
                    }
                }
            }
            int i8 = 1163132689 ^ i5;
            throw new IllegalAccessException();
        });
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -972771871) {
            i4 = 1103835539 ^ i4;
            this.pendingInvites.entrySet().removeIf(entry -> {
                int i5 = 112772339 ^ (2043002074 ^ 1753549252);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1077702808) {
                    int i6 = 382586566 ^ i5;
                    return ((List) entry.getValue()).isEmpty();
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1077702808 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (198833734 ^ i5)) {
                        int i7 = 825188308 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 162396504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1452471849 ^ i5)) {
                            break;
                        }
                    }
                }
                int i8 = 961971004 ^ i5;
                throw new IllegalAccessException();
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -933420677) {
                int i5 = 2022256915 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -933420677 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1620780922 ^ i4)) {
                int i6 = 1945902565 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -972771871 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (986915554 ^ i4)) {
                    int i7 = 665323747 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 202680800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1226917152 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1957875324 ^ i4;
        throw new RuntimeException();
    }

    public void shutdown() {
        int i = 1356753115 ^ (1028309410 ^ 1450953103);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -545585231) {
            i = 859421851 ^ i;
            if (this.cleanupTask == null) {
                i = rrgvlfudpsxlzxsi(i, 1665839694);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1186390888) {
                i = 1596356169 ^ i;
                this.cleanupTask.cancel(1520188267);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1081781982) {
                    i = 1013761031 ^ i;
                }
            }
            this.pendingInvites.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1558409499) {
                int i2 = 2087487518 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1186390888 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (669782042 ^ i)) {
                int i3 = 452405046 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1081658904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1624233568 ^ i)) {
                    int i4 = 1131980054 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1081781982 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1506443041 ^ i)) {
                        int i5 = 373623030 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1558409499 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (419489046 ^ i)) {
                            int i6 = 2114866750 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -545585231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (31401894 ^ i)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i7 = 1737359561 ^ i;
        throw new RuntimeException();
    }

    public Map<String, Integer> getStatistics() {
        int i = 110220271 ^ (515083592 ^ 1450953103);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 1926019394) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1926019394 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1193745958 ^ i)) {
                    break;
                }
            }
            int i2 = 729866849 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 1725539332 ^ i;
        HashMap hashMap = new HashMap();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1140955489) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1140955489 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (649344160 ^ i3)) {
                    break;
                }
            }
            int i4 = 31377323 ^ i3;
            throw new RuntimeException("double");
        }
        int i5 = 454840614 ^ i3;
        Stream<List<TeamRequest>> stream = this.pendingInvites.values().stream();
        ToIntFunction<? super List<TeamRequest>> toIntFunction = (v0) -> {
            return v0.size();
        };
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1662840751) {
            int i6 = 1266289465 ^ i5;
            IntStream mapToInt = stream.mapToInt(toIntFunction);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -952940133) {
                int i7 = 1499476684 ^ i6;
                int sum = mapToInt.sum();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 204660729) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 204660729 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (867123039 ^ i7)) {
                            break;
                        }
                    }
                    int i8 = 58831121 ^ i7;
                    throw new IOException("double");
                }
                i6 = 1307417629 ^ i7;
                hashMap.put(zbtjswvqzt(aumnxakmnuqglhu(), nnpdjrucpzuvyub(), i6), Integer.valueOf(sum));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1667120915) {
                    i5 = 161154356 ^ i6;
                    hashMap.put(zbtjswvqzt(oahfsdodzcjcvta(), nnpdjrucpzuvyub(), i5), Integer.valueOf(this.pendingInvites.size()));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 797316787) {
                        int i9 = 385828256 ^ i5;
                        return hashMap;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -952940133 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (764136466 ^ i6)) {
                    int i10 = 1988442324 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1667120915 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (802798837 ^ i6)) {
                        break;
                    }
                }
            }
            int i11 = 2074882649 ^ i6;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 797316787 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (791369335 ^ i5)) {
                int i12 = 188311665 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1662840751 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (698146596 ^ i5)) {
                    break;
                }
            }
        }
        int i13 = 121372180 ^ i5;
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
        f1175VhaJC77Nu = (-853284045) ^ new Random(-4232004490143922631L).nextInt();
    }

    public static String zbtjswvqzt(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] nnpdjrucpzuvyub() {
        return new byte[]{45, 90, 89, 24, 38, 77, 57, 79, 21, 112, 124, 99, 35, 114, 19, 45, 30, 114, 114, 33, 117, 113, 84, 117, 30, 8, 125, 107, 41, 96, 50, 109, 2, 95, 53, 91, 69, 22, 58, 89, 15, 35, 26, 97, 17, 27, 10, 106, 99, 124, 38, 66, 63, 117, 8, 28, 83, 3, 51, 21, 120, 75, 67, 80, 40, 81, 117, 95, 65, 75, 51, 27, 35, 118, 114, 32, 52, 85, 78, 86, 109, 118, 31, 12, 111, 89, 115, 69, 69, 64, 86, 30, 37, 115, 90, 109, 39, 26, 92, 107, 77, 40, 107, 3, 101};
    }

    private static byte[] oahfsdodzcjcvta() {
        return new byte[]{-30, -110, 104, 88, 20, 22, 14, 29, 38, 61, 77, 49, 18, 48, 33, 105, 41, 30, 65, 98, 68, 47, 101, 49, 44, 87, 74, 7, 26, 61, 3, 52, 51, 25, 7, 5, 114, 81, 9, 8, 62, 103};
    }

    private static byte[] aumnxakmnuqglhu() {
        return new byte[]{-30, -99, 104, 85, 22, 18, 11, 3, 32, 33, 77, 55, 18, 20, 35, 116, 44, 36, 71, 103, 68, 32, 101, 56, 46, 93, 79, 32};
    }

    private static int rrgvlfudpsxlzxsi(int i, int i2) {
        return i2 ^ i;
    }
}
