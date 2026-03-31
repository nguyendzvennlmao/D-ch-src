package com.kammoun.donutCore.api.skin;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Pattern;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MojangUtils {
    private static final String MOJANG_SESSION_URL = "https://sessionserver.mojang.com/session/minecraft/profile/";
    private static final Pattern TEXTURE_PATTERN;

    private static int f40zCpyoCL0U = 0;
    private transient int xgJ6slSv4M = 857145315;
    private static String peftcjokzk;
    private static String[] nothing_to_see_here = new String[17];

    private MojangUtils() {
        qfaolerisnvkqosz(1116102148 ^ 448135038, 630186556);
        int parseInt = 1408811845 ^ (862462811 ^ Integer.parseInt("489464664"));
        this.xgJ6slSv4M = 857145315 ^ f40zCpyoCL0U;
        int i = 772674777 ^ (1800975947 ^ parseInt);
    }

    @Nullable
    public static String getSkinBase64Paper(@NotNull Player player, int i) {
        int i2 = 168121612 ^ (1978754425 ^ 1570621836);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 323997641) {
            i2 = 234457965 ^ i2;
            PlayerProfile playerProfile = player.getPlayerProfile();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2088998049) {
                i2 = 2035212251 ^ i2;
                Set properties = playerProfile.getProperties();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1225430406) {
                    i2 = 184008539 ^ i2;
                    Iterator it = properties.iterator();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -515338078) {
                        int i3 = 378396734;
                        while (true) {
                            i2 = i3 ^ i2;
                            if (it.hasNext() == (1252323882 ^ i2)) {
                                int i4 = 1127033238 ^ i2;
                                return null;
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1428656466) {
                                i2 = 1566836178 ^ i2;
                                ProfileProperty profileProperty = (ProfileProperty) it.next();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1106788416) {
                                    i2 = 571021889 ^ i2;
                                    if (hsoyqbrgta(zdipnijokamzjpe(), i2).equals(profileProperty.getName()) != (902426041 ^ i2)) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1370526263) {
                                            int i5 = 157768679 ^ i2;
                                            return profileProperty.getValue();
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1370526263 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1331241540 ^ i2)) {
                                                int i6 = 184200857 ^ i2;
                                                throw new RuntimeException("double");
                                            }
                                        }
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                            case 137824607:
                                                i2 = 1213754914 ^ i2;
                                                break;
                                            case 426626694:
                                                break;
                                            case 1984428247:
                                        }
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -326361893) {
                                        int qfaolerisnvkqosz = qfaolerisnvkqosz(i2, 1637393489);
                                        try {
                                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(qfaolerisnvkqosz) != 106012958) {
                                                throw null;
                                            }
                                            throw new IOException();
                                        } catch (IOException e) {
                                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                case -1415755213:
                                                    i2 = 1673141549 ^ qfaolerisnvkqosz;
                                                    break;
                                                case -532070832:
                                                    i2 = qfaolerisnvkqosz(qfaolerisnvkqosz, 180392865);
                                                    break;
                                                default:
                                                    throw new IllegalAccessException("Error in hash");
                                            }
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1236425896) {
                                                i3 = 1550665281;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1415755213 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1940363958 ^ i2)) {
                            int i7 = 265126921 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -515338078 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (655028351 ^ i2)) {
                                int i8 = 972521486 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1106788416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (169351677 ^ i2)) {
                                    int i9 = 2066903478 ^ i2;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1428656466 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1240733187 ^ i2)) {
                        int i10 = 233634765 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1225430406 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (881131080 ^ i2)) {
                            int i11 = 1707936737 ^ i2;
                            throw new IOException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -445271311 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (742756098 ^ i2)) {
                int i12 = 552043104 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1236425896 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (639220459 ^ i2)) {
                    int i13 = 285503730 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -326361893 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1261876515 ^ i2)) {
                        int i14 = 735101479 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 323997641 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (354960960 ^ i2)) {
                            int i15 = 208039841 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2088998049 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (280183164 ^ i2)) {
                                int i16 = 885558411 ^ i2;
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            }
        }
    }

    @Nullable
    public static String getSignaturePaper(@NotNull Player player, int i) {
        int i2;
        int i3 = 1469268408 ^ (468285046 ^ 1570621836);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1891634672) {
            int i4 = 2025116146 ^ i3;
            PlayerProfile playerProfile = player.getPlayerProfile();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1251573123) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1458554472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (518661422 ^ i4)) {
                        int i5 = 1532856812 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1251573123 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (21564487 ^ i4)) {
                            break;
                        }
                    }
                }
                int i6 = 2003815031 ^ i4;
                throw new RuntimeException("double");
            }
            i3 = 1791589963 ^ i4;
            Set properties = playerProfile.getProperties();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 483561432) {
                i3 = 1596100162 ^ i3;
                Iterator it = properties.iterator();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -439943734) {
                    int i7 = 984764071 ^ i3;
                    while (true) {
                        i3 = i7;
                        if (it.hasNext() == (1711968542 ^ i3)) {
                            qfaolerisnvkqosz(i3, 628008611);
                            return null;
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 810846451) {
                            i3 = 371786975 ^ i3;
                            ProfileProperty profileProperty = (ProfileProperty) it.next();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2128826869) {
                                i3 = 1260916251 ^ i3;
                                if (hsoyqbrgta(kgwjcgihqivrmab(), i3).equals(profileProperty.getName()) == (990616538 ^ i3)) {
                                    int qfaolerisnvkqosz = qfaolerisnvkqosz(i3, 814332007);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qfaolerisnvkqosz) == 1544625640) {
                                        int qfaolerisnvkqosz2 = qfaolerisnvkqosz(qfaolerisnvkqosz, 1274654862);
                                        try {
                                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(qfaolerisnvkqosz2) != 217001289) {
                                                throw null;
                                            }
                                            throw new IOException();
                                        } catch (IOException e) {
                                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                case 64788890:
                                                    i2 = qfaolerisnvkqosz(qfaolerisnvkqosz2, 258546898);
                                                    break;
                                                case 274014315:
                                                    i2 = 756558828 ^ qfaolerisnvkqosz2;
                                                    break;
                                                default:
                                                    throw new RuntimeException("Error in hash");
                                            }
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2022997770) {
                                                i7 = qfaolerisnvkqosz(i2, 689446655);
                                            } else {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2022997770 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (172126819 ^ i2)) {
                                                        int i8 = 1261420492 ^ i2;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qfaolerisnvkqosz) == 1544625640 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qfaolerisnvkqosz) == (41737228 ^ qfaolerisnvkqosz)) {
                                                int i9 = 583972978 ^ qfaolerisnvkqosz;
                                                throw new RuntimeException("double");
                                            }
                                        }
                                    }
                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -665002287) {
                                    int i10 = 836133655 ^ i3;
                                    return profileProperty.getSignature();
                                }
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -665002287 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (852610877 ^ i3)) {
                int i11 = 857736029 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 274014315 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (391566216 ^ i3)) {
                    int i12 = 501210309 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -439943734 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1282029586 ^ i3)) {
                        int i13 = 1860633637 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2128826869 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1455568171 ^ i3)) {
                            int i14 = 1528253639 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 810846451 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (729607955 ^ i3)) {
                                int i15 = 266696485 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1891634672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (983613981 ^ i3)) {
                                    int i16 = 2042724228 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 483561432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1424508106 ^ i3)) {
                                        int i17 = 389684302 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 64788890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1820130340 ^ i3)) {
                                            int i18 = 581076916 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 455196138 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1714356661 ^ i3)) {
                                                int i19 = 1768120543 ^ i3;
                                                throw new IllegalAccessException();
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

    public static CompletableFuture getSkinRawValue(@NotNull String str, int i) {
        int i2 = 1900055153 ^ (799799928 ^ 1570621836);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 464899112) {
            int i3 = 220937973 ^ i2;
            return CompletableFuture.supplyAsync(() -> {
                int i4 = 1833779757 ^ (1690031467 ^ 1570621836);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1554319790) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2146806270 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (842518524 ^ i4)) {
                            int i5 = 2141412287 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1554319790 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1283046509 ^ i4)) {
                                break;
                            }
                        }
                    }
                    int i6 = 165491318 ^ i4;
                    throw new IOException("double");
                }
                int i7 = 560493558 ^ i4;
                int i8 = i7;
                try {
                    UUID fetchUUID = fetchUUID(str, 1318937073);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1474729501) {
                        int i9 = 555095141 ^ i8;
                        if (fetchUUID == null) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -1599485238) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1599485238 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (144213888 ^ i9)) {
                                        break;
                                    }
                                }
                                int i10 = 2093882001 ^ i9;
                                throw new IllegalAccessException("double");
                            }
                            i8 = 193196342 ^ i9;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -55164038) {
                                i8 = 261587631 ^ i8;
                                return null;
                            }
                        }
                        while (true) {
                            i7 = jnbwyqufydqqceyf.njpwuppmebnxznmg(i9);
                            switch (i7) {
                                case 48843529:
                                    i7 = 175268187 ^ i9;
                                    i9 = i7;
                                    break;
                                case 645357255:
                                case 1205378878:
                                    break;
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -214253550 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1786014921 ^ i9)) {
                                int i11 = 1655007163 ^ i9;
                                throw new RuntimeException("double");
                            }
                        }
                    }
                } catch (Exception e) {
                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                        case -1599485238:
                            i8 = 1219467069 ^ i8;
                            break;
                        case -1474729501:
                            i8 = 1773765464 ^ i8;
                            break;
                        case -55164038:
                            i8 = qfaolerisnvkqosz(i8, 1126983179);
                            break;
                        default:
                            throw new IOException("Error in hash");
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -438996192 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (188737864 ^ i8)) {
                        int i12 = 849652674 ^ i8;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -1474729501 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1412447764 ^ i8)) {
                            int i13 = 1975996913 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -2079204493 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2125189815 ^ i8)) {
                                int i14 = 1276881727 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -55164038 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (708847956 ^ i8)) {
                                    int i15 = 658759440 ^ i8;
                                    throw new IOException();
                                }
                            }
                        }
                    }
                }
            });
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 464899112 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1472034955 ^ i2)) {
                int i4 = 1540521648 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1928084352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (324651963 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 584572331 ^ i2;
        throw new IllegalAccessException();
    }

    public static CompletableFuture<String> getSkinRawValue(@NotNull UUID uuid) {
        int i = 765450494 ^ (967444209 ^ 1570621836);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1296088090) {
            int i2 = 1505492944 ^ i;
            return CompletableFuture.supplyAsync(() -> {
                int i3 = 2071885431 ^ (1725298369 ^ 1570621836);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 28461522) {
                    int i4 = 1747944235 ^ i3;
                    int i5 = i4;
                    try {
                        String fetchTextureValue = fetchTextureValue(uuid, 2059879712);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1087262857) {
                            i5 = 2029291669 ^ i5;
                            return fetchTextureValue;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1087262857 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2109188899 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 1144616876 ^ i5;
                        throw new RuntimeException("double");
                    } catch (Exception e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case 1087262857:
                                i3 = 818615873 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -963190144) {
                                    int i7 = 1150390298 ^ i3;
                                    return null;
                                }
                                break;
                            default:
                                throw new IllegalAccessException("Error in hash");
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -963190144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (6068415 ^ i3)) {
                        int i8 = 200701355 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 28461522 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1693026594 ^ i3)) {
                            int i9 = 616028163 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2023091166 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (285383698 ^ i3)) {
                                int i10 = 2121026253 ^ i3;
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            });
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2137046376 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (182522811 ^ i)) {
                int i3 = 2087859822 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1296088090 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (887501776 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1365550086 ^ i;
        throw new RuntimeException();
    }

    @org.jetbrains.annotations.Nullable
    private static java.util.UUID fetchUUID(@org.jetbrains.annotations.NotNull java.lang.String r5, int r6) throws java.lang.Exception {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.skin.MojangUtils.fetchUUID(java.lang.String, int):java.util.UUID");
    }

    @org.jetbrains.annotations.Nullable
    private static java.lang.String fetchTextureValue(@org.jetbrains.annotations.NotNull java.util.UUID r5, int r6) throws java.lang.Exception {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.skin.MojangUtils.fetchTextureValue(java.util.UUID, int):java.lang.String");
    }

    public static java.lang.String decodeTextureUrl(@org.jetbrains.annotations.NotNull java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.skin.MojangUtils.decodeTextureUrl(java.lang.String):java.lang.String");
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣠⣤⣶⣶⣶⣤⣄⣀⣀⠄⠄⠄⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⠄⠄⠄⠄⠄⣀⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣟⢿⣿⣿⣿⣶⣤⡀⠄";
        nothing_to_see_here[2] = "⠄⠄⠄⠄⠄⠄⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣜⠿⠿⣿⣿⣧⢓";
        nothing_to_see_here[3] = "⠄⠄⠄⠄⠄⡠⢛⣿⣿⣿⡟⣿⣿⣽⣋⠻⢻⣿⣿⣿⣿⡻⣧⡠⣭⣭⣿⡧";
        nothing_to_see_here[4] = "⠄⠄⠄⠄⠄⢠⣿⡟⣿⢻⠃⣻⣨⣻⠿⡀⣝⡿⣿⣿⣷⣜⣜⢿⣝⡿⡻⢔";
        nothing_to_see_here[5] = "⠄⠄⠄⠄⠄⢸⡟⣷⢿⢈⣚⣓⡡⣻⣿⣶⣬⣛⣓⣉⡻⢿⣎⠢⠻⣴⡾⠫";
        nothing_to_see_here[6] = "⠄⠄⠄⠄⠄⢸⠃⢹⡼⢸⣿⣿⣿⣦⣹⣿⣿⣿⠿⠿⠿⠷⣎⡼⠆⣿⠵⣫";
        nothing_to_see_here[7] = "⠄⠄⠄⠄⠄⠈⠄⠸⡟⡜⣩⡄⠄⣿⣿⣿⣿⣶⢀⢀⣿⣷⣿⣿⡐⡇⡄⣿";
        nothing_to_see_here[8] = "⠄⠄⠄⠄⠄⠄⠄⠄⠁⢶⢻⣧⣖⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⣇⡟⣇⣷⣿";
        nothing_to_see_here[9] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣆⣤⣽⣿⡿⠿⠿⣿⣿⣦⣴⡇⣿⢨⣾⣿⢹⢸";
        nothing_to_see_here[10] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⠊⡛⢿⣿⣿⣿⣿⡿⣫⢱⢺⡇⡏⣿⣿⣸⡼";
        nothing_to_see_here[11] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⡿⠄⣿⣷⣾⡍⣭⣶⣿⣿⡌⣼⣹⢱⠹⣿⣇⣧";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⣼⠁⣤⣭⣭⡌⢁⣼⣿⣿⣿⢹⡇⣭⣤⣶⣤⡝⡼";
        nothing_to_see_here[13] = "⠄⣀⠤⡀⠄⠄⠄⠄⠄⡏⣈⡻⡿⠃⢀⣾⣿⣿⣿⡿⡼⠁⣿⣿⣿⡿⢷⢸";
        nothing_to_see_here[14] = "⢰⣷⡧⡢⠄⠄⠄⠄⠠⢠⡛⠿⠄⠠⠬⠿⣿⠭⠭⢱⣇⣀⣭⡅⠶⣾⣷⣶";
        nothing_to_see_here[15] = "⠈⢿⣿⣧⠄⠄⠄⠄⢀⡛⠿⠄⠄⠄⠄⢠⠃⠄⠄⡜⠄⠄⣤⢀⣶⣮⡍⣴";
        nothing_to_see_here[16] = "⠄⠈⣿⣿⡀⠄⠄⠄⢩⣝⠃⠄⠄⢀⡄⡎⠄⠄⠄⠇⠄⠄⠅⣴⣶⣶⠄⣶";
        int parseInt = 1631152968 ^ (1086572688 ^ Integer.parseInt("489464664"));
        peftcjokzk = ByteBuffer.wrap(brnoygfxkttjoux()).asCharBuffer().toString();
        f40zCpyoCL0U = 871157749 ^ new Random(-3764612649727384437L).nextInt();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -424672255) {
            TEXTURE_PATTERN = Pattern.compile(hsoyqbrgta(bkhpyvxpmtawrab(), 1220285076 ^ parseInt));
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -424672255 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1203013749 ^ parseInt)) {
                int i = 766775777 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1555001181 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1069585534 ^ parseInt)) {
                    break;
                }
            }
        }
        int i2 = 175119672 ^ parseInt;
        throw new IllegalAccessException();
    }

    public static String hsoyqbrgta(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = peftcjokzk.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] bkhpyvxpmtawrab() {
        return new byte[]{0, 0, 0, 23, 0, 0, 0, 0};
    }

    private static byte[] zdipnijokamzjpe() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 23};
    }

    private static byte[] kgwjcgihqivrmab() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 31};
    }

    private static byte[] krfvfwxcdeaaevo() {
        return new byte[]{0, 0, 0, 36, 0, 0, 0, 39};
    }

    private static byte[] wiuqmxmbybxluam() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, 75};
    }

    private static byte[] tofhwylzvdhfkut() {
        return new byte[]{0, 0, 0, 20, 0, 0, 0, 89};
    }

    private static byte[] wpuybxvuvjeghpp() {
        return new byte[]{0, 0, 0, 3, 0, 0, 0, 109};
    }

    private static byte[] lujddwtvigholen() {
        return new byte[]{0, 0, 0, 3, 0, 0, 0, 112};
    }

    private static byte[] rosyoitirkavoma() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 115};
    }

    private static byte[] hoeprdxykvkdahx() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 116};
    }

    private static byte[] eyrwcrlyngumsmi() {
        return new byte[]{0, 0, 0, 21, 0, 0, 0, 116};
    }

    private static byte[] brnoygfxkttjoux() {
        return new byte[]{49, 27, 53, 69, 49, 81, 56, 89, 48, 69, 49, 92, 53, 17, 49, 108, 56, 70, 48, 26, 49, 3, 53, 111, 49, 67, 56, 31, 48, 18, 49, 17, 53, 104, 49, 110, 56, 23, 48, 109, 49, 18, 53, 26, 49, 18, 57, 68, 50, 81, 50, 78, 48, 64, 49, 76, 48, 64, 52, 87, 54, 67, 57, 77, 48, 83, 49, 78, 53, 71, 56, 76, 57, 66, 54, 84, 54, 70, 57, 30, 57, 107, 53, 78, 57, 73, 50, 1, 54, 68, 55, 28, 57, 17, 50, 110, 57, 65, 57, 76, 53, 13, 57, 79, 50, 16, 54, 17, 55, 105, 57, 78, 50, 73, 57, 2, 57, 74, 53, 16, 57, 26, 50, 101, 54, 78, 55, 78, 57, 13, 50, 79, 57, 31, 57, 31, 53, 101, 57, 69, 50, 66, 54, 8, 55, 7, 57, 68, 50, 27, 57, 18, 57, 6, 53, 20, 57, 22, 50, 11, 54, 20, 55, 17, 57, 10, 50, 31, 57, 18, 57, 3, 53, 20, 57, 22, 50, 12, 54, 27, 49, 89, 52, 85, 49, 17, 54, 101, 49, 67, 52, 27, 49, 9, 54, 101, 49, 67, 52, 27, 49, 17, 54, 17, 49, 107, 52, 111, 49, 17, 54, 100, 49, 27, 52, 24, 49, 17, 53, 126, 54, 115, 50, 109, 49, 126, 55, 117, 52, 100, 49, 21, 54, 16, 49, 76, 48, 74, 55, 92, 53, 20, 50, 109, 57, 67, 56, 29, 48, 15, 54, 110, 49, 74, 48, 18, 55, 18, 53, 30, 50, 106, 57, 110, 56, 21, 48, 104, 54, 25, 49, 16, 48, 26};
    }

    private static int qfaolerisnvkqosz(int i, int i2) {
        return i ^ i2;
    }
}
