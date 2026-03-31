package com.kammoun.donutCore.settings.manager;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.settings.SettingsPlugin;
import com.kammoun.donutCore.settings.data.SettingsDatabase;
import com.kammoun.donutCore.settings.models.PlayerSettings;
import com.kammoun.donutCore.settings.models.enums.SettingType;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class SettingsManager {
    private final SettingsPlugin plugin;
    private final SettingsDatabase database;
    private final Map<UUID, PlayerSettings> loadedSettings;
    private SchedulerUtil.Task autoSaveTask;
    private static int kkXCb98zA1 = 0;
    private transient int TLHb60M4tL = 604472501;
    private static String[] nothing_to_see_here = new String[13];

    public SettingsManager(SettingsPlugin settingsPlugin, int i) {
        int i2 = 238435448 ^ (1966458736 ^ 1846182200);
        int parseInt = 1130080022 ^ (21732301 ^ Integer.parseInt("1461274347"));
        this.TLHb60M4tL = 604472501 ^ kkXCb98zA1;
        this.plugin = settingsPlugin;
        this.database = new SettingsDatabase(settingsPlugin, 267686524);
        this.loadedSettings = new ConcurrentHashMap();
        startAutoSave(275047822);
        int i3 = 902769002 ^ (380499199 ^ (251397851 ^ (1524049344 ^ (1665781168 ^ (941518630 ^ parseInt)))));
    }

    public void loadPlayerSettings(Player player, int i) {
        int i2 = 1285597595 ^ (160276234 ^ 864425481);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1252457277) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1252457277 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1210229388 ^ i2)) {
                    break;
                }
            }
            int i3 = 335967905 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 614411262 ^ i2;
        UUID uniqueId = player.getUniqueId();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1851761870) {
            i4 = 810088362 ^ i4;
            SchedulerUtil.runAsync(() -> {
                int i5 = 611911791 ^ (1344048619 ^ 864425481);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1058839658) {
                    i5 = 942163662 ^ i5;
                    PlayerSettings loadSettings = this.database.loadSettings(uniqueId, 508638804);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -27350501) {
                        int i6 = 1539705301 ^ i5;
                        this.loadedSettings.put(uniqueId, loadSettings);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 544138417) {
                            int i7 = 656841181 ^ i6;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 544138417 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (67290823 ^ i6)) {
                                break;
                            }
                        }
                        int i8 = 1346577694 ^ i6;
                        throw new IllegalAccessException("double");
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 425339480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (14049453 ^ i5)) {
                        int i9 = 352016460 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1058839658 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2100901389 ^ i5)) {
                            int i10 = 531616947 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -27350501 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (941427120 ^ i5)) {
                                break;
                            }
                        }
                    }
                }
                int i11 = 1537725868 ^ i5;
                throw new IllegalAccessException();
            }, 1163669431);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 333964899) {
                int i5 = 1459828248 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1851761870 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2026541582 ^ i4)) {
                int i6 = 1181571636 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 333964899 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (329105285 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 1946490121 ^ i4;
        throw new IOException();
    }

    public void savePlayerSettings(Player player, boolean z, int i) {
        int i2 = 1348628896 ^ (591231977 ^ 864425481);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 113828354) {
            int i3 = 1931826862 ^ i2;
            UUID uniqueId = player.getUniqueId();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1612556431) {
                i2 = 10562403 ^ i3;
                PlayerSettings playerSettings = this.loadedSettings.get(uniqueId);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1695871895) {
                    i3 = 715042388 ^ i2;
                    if (playerSettings != null) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -836862264) {
                            int i4 = 1136009462 ^ i3;
                            if (z != (1517678383 ^ i4)) {
                                i2 = 1547694454 ^ i4;
                                SchedulerUtil.runAsync(() -> {
                                    int i5 = 882506282 ^ (106902706 ^ 864425481);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 168215688) {
                                        i5 = 16525866 ^ i5;
                                        this.database.saveSettings(playerSettings, 1068314739);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 233280984) {
                                            int i6 = 526531205 ^ i5;
                                            return;
                                        }
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 233280984 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1465923006 ^ i5)) {
                                            int i7 = 893921967 ^ i5;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -151633424 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1810433338 ^ i5)) {
                                                int i8 = 2032156628 ^ i5;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 168215688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1397797211 ^ i5)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    int i9 = 1732388163 ^ i5;
                                    throw new IOException();
                                }, 1163669431);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 844165832) {
                                    int i5 = 1773305919 ^ i2;
                                    return;
                                }
                            } else {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -743474822) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -743474822 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (131848413 ^ i4)) {
                                            break;
                                        }
                                    }
                                    int i6 = 2114424954 ^ i4;
                                    throw new IOException("double");
                                }
                                i3 = 1023457921 ^ i4;
                                this.database.saveSettings(playerSettings, 1068314739);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1001041267) {
                                    int i7 = 949926579 ^ i3;
                                    return;
                                }
                            }
                        }
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                            case 32209783:
                                int i8 = 1983599039 ^ i3;
                                return;
                            case 118881825:
                            default:
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2143613747 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (711528819 ^ i3)) {
                                        int i9 = 330365404 ^ i3;
                                        throw new RuntimeException("double");
                                    }
                                }
                                break;
                            case 1154446049:
                            case 1552475160:
                                return;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -836862264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1351241325 ^ i3)) {
                    int i10 = 1744883810 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1001041267 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1650373225 ^ i3)) {
                        int i11 = 1099836059 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1612556431 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (785432536 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i12 = 2041803524 ^ i3;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 844165832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1407259835 ^ i2)) {
                int i13 = 1061072420 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1695871895 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1630775325 ^ i2)) {
                    int i14 = 879428484 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -10520342 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (175055404 ^ i2)) {
                        int i15 = 208647057 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 113828354 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1518967490 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i16 = 973985053 ^ i2;
        throw new IllegalAccessException();
    }

    public void unloadPlayerSettings(Player player, int i) {
        int i2 = 371087321 ^ (1901839691 ^ 864425481);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1508104998) {
            int i3 = 1314538305 ^ i2;
            UUID uniqueId = player.getUniqueId();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -724681008) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -724681008 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (394845116 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1538232270 ^ i3;
                throw new IllegalAccessException("double");
            }
            i2 = 1513496935 ^ i3;
            savePlayerSettings(player, (byte) (1085269692 ^ i2), 514910302);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 92222954) {
                i2 = 2070251891 ^ i2;
                this.loadedSettings.remove(uniqueId);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -564953487) {
                    int i5 = 572981792 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1508104998 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (868867838 ^ i2)) {
                int i6 = 1431996701 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -564953487 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (623818848 ^ i2)) {
                    int i7 = 955094783 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 92222954 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (337479352 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 2051693801 ^ i2;
        throw new RuntimeException();
    }

    public PlayerSettings getSettings(UUID uuid, int i) {
        int i2 = 1872977771 ^ (1796398832 ^ 864425481);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1178813295) {
            int i3 = 859766156 ^ i2;
            return this.loadedSettings.computeIfAbsent(uuid, uuid2 -> {
                int i4 = 1538878447 ^ (968711579 ^ 864425481);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1945041942) {
                    int i5 = 1227607102 ^ i4;
                    return this.database.loadSettings(uuid, 508638804);
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -984653288 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1171764115 ^ i4)) {
                        int i6 = 1778703857 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1945041942 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (324525975 ^ i4)) {
                            break;
                        }
                    }
                }
                int i7 = 929591217 ^ i4;
                throw new IOException();
            });
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1178813295 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1860999667 ^ i2)) {
                int i4 = 1862682863 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 541806832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1317012105 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 481975820 ^ i2;
        throw new RuntimeException();
    }

    public boolean getSetting(UUID uuid, SettingType settingType, int i) {
        int i2 = 1540175495 ^ (1953723150 ^ 864425481);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -507339776) {
            i2 = 1291339559 ^ i2;
            PlayerSettings settings = getSettings(uuid, 1614555089);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2046778054) {
                int i3 = 1128609365 ^ i2;
                return settings.getSetting(settingType, 2064199254);
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -507339776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2046842527 ^ i2)) {
                int i4 = 458239196 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2046778054 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1364269093 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1332227401 ^ i2;
        throw new RuntimeException();
    }

    public boolean isSettingEnabled(UUID uuid, SettingType settingType, int i) {
        int i2 = 815291371 ^ (1057677356 ^ 864425481);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -526029199) {
            i2 = 957313964 ^ i2;
            PlayerSettings settings = getSettings(uuid, 1614555089);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 685699856) {
                int i3 = 198164093 ^ i2;
                return settings.getSetting(settingType, 2064199254);
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -526029199 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1525929557 ^ i2)) {
                int i4 = 606776580 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1990394104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1364880536 ^ i2)) {
                    int i5 = 2145629976 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 685699856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (435584669 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 463114258 ^ i2;
        throw new IllegalAccessException();
    }

    public void setSetting(UUID uuid, SettingType settingType, boolean z, int i) {
        int i2 = 44031992 ^ (66593391 ^ 864425481);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1760600847) {
            i2 = 198228141 ^ i2;
            PlayerSettings settings = getSettings(uuid, 1614555089);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -913663591) {
                i2 = 611318544 ^ i2;
                settings.setSetting(settingType.getKey(), z, 1243291933);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -353025768) {
                    int i3 = 146447903 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -913663591 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1033385840 ^ i2)) {
                int i4 = 2070419939 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1356746272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1920714049 ^ i2)) {
                    int i5 = 614437235 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -353025768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1755018219 ^ i2)) {
                        int i6 = 1535809450 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1760600847 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (662262807 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 1990234516 ^ i2;
        throw new RuntimeException();
    }

    public void saveAllSettings(int i) {
        int i2 = 1136854233 ^ (253430482 ^ 864425481);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -84885485) {
            i2 = 1703548533 ^ i2;
            Iterator it = Bukkit.getOnlinePlayers().iterator();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -694127688) {
                i2 = 881890207 ^ i2;
                while (true) {
                    if (it.hasNext() == (776248808 ^ i2)) {
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                case 161800117:
                                    int i3 = 668987921 ^ i2;
                                    return;
                                case 644133039:
                                    return;
                                case 1881425627:
                            }
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1915023169) {
                        i2 = 2133592203 ^ i2;
                        Player player = (Player) it.next();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1958434022) {
                            i2 = 1524186546 ^ i2;
                            savePlayerSettings(player, (byte) (196192465 ^ i2), 514910302);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1569539720) {
                                i2 = 1020558414 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1154571015) {
                                }
                                while (true) {
                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                        case 190151825:
                                            i2 = 412985135 ^ i2;
                                            break;
                                        case 1083932272:
                                        case 2066078815:
                                            break;
                                    }
                                }
                                try {
                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2) == 217141213) {
                                        throw new IllegalAccessException();
                                    }
                                    throw null;
                                } catch (IllegalAccessException e) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                        case -1850580031:
                                            i2 = mhrjgxbrkxtjxxhd(i2, 266905420);
                                            break;
                                        case 2143526273:
                                            i2 = 304519300 ^ i2;
                                            break;
                                        default:
                                            throw new IOException("Error in hash");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -285779551) {
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                            case 61228483:
                                                break;
                                            case 132110954:
                                                i2 = 328890076 ^ i2;
                                                break;
                                            case 1421875010:
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -285779551 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (201980785 ^ i2)) {
                        int i4 = 2075597414 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1958434022 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1888889902 ^ i2)) {
                            int i5 = 64191023 ^ i2;
                            throw new IOException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1850580031 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (483475200 ^ i2)) {
                int i6 = 199135817 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1915023169 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (677949804 ^ i2)) {
                    int i7 = 614692175 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -84885485 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2085734395 ^ i2)) {
                        int i8 = 538023229 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2143526273 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1335105853 ^ i2)) {
                            int i9 = 142108057 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1154571015 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1472696607 ^ i2)) {
                                int i10 = 2136055178 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1569539720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2145800420 ^ i2)) {
                                    int i11 = 334605165 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -694127688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1187177038 ^ i2)) {
                                        int i12 = 94416860 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1289453512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (540595004 ^ i2)) {
                                            int i13 = 1949615652 ^ i2;
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

    private void startAutoSave(int i) {
        int i2 = 2134868975 ^ (343691701 ^ 864425481);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -970055014) {
            i2 = 550753403 ^ i2;
            long j = this.plugin.getConfig(127597628).getLong(ncozgxsueq(kozqsbiivsejzfi(), ggxzcnsvusqnbrf(), i2), 6000L);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1062174397) {
                i2 = 1480196842 ^ i2;
                this.autoSaveTask = SchedulerUtil.runTimer(() -> {
                    int i3 = 1796901328 ^ (2146022565 ^ 864425481);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1000954849) {
                        int i4 = 110678924 ^ i3;
                        Iterator it = Bukkit.getOnlinePlayers().iterator();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 258983809) {
                            int i5 = 43516809 ^ i4;
                            while (true) {
                                i4 = i5;
                                if (it.hasNext() == (594934649 ^ i4)) {
                                    mhrjgxbrkxtjxxhd(i4, 1820354051);
                                    return;
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 464509897) {
                                    i3 = 1705504285 ^ i4;
                                    Player player = (Player) it.next();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 915450658) {
                                        int i6 = 1545355827 ^ i3;
                                        savePlayerSettings(player, (byte) (449730390 ^ i6), 514910302);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -697124168) {
                                            i3 = 1873309861 ^ i6;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1422835821) {
                                                int i7 = 2015964693 ^ i3;
                                                try {
                                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i7) == 164179552) {
                                                        throw new IllegalAccessException();
                                                    }
                                                    throw null;
                                                } catch (IllegalAccessException e) {
                                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                        case -498121759:
                                                            i3 = 704506244 ^ i7;
                                                            break;
                                                        case 1786269496:
                                                            i3 = 419104799 ^ i7;
                                                            break;
                                                        default:
                                                            throw new IllegalAccessException("Error in hash");
                                                    }
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1382019136) {
                                                        i5 = mhrjgxbrkxtjxxhd(i3, 918682241);
                                                    }
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2142038994 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (674310943 ^ i6)) {
                                                    int i8 = 664981891 ^ i6;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -697124168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (673121276 ^ i6)) {
                                                        int i9 = 253397467 ^ i6;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 258983809 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1166267530 ^ i4)) {
                                int i10 = 1098260280 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 464509897 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (725286191 ^ i4)) {
                                    int i11 = 1796440998 ^ i4;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 915450658 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (33433223 ^ i3)) {
                            int i12 = 1254405207 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1786269496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (404678239 ^ i3)) {
                                int i13 = 491436857 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1422835821 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (95872278 ^ i3)) {
                                    int i14 = 1902862119 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1382019136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (558522717 ^ i3)) {
                                        int i15 = 1845932947 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1000954849 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1336774590 ^ i3)) {
                                            int i16 = 21174030 ^ i3;
                                            throw new IOException();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }, j, j, 2041710047);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 23107089) {
                    int i3 = 75073303 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 23107089 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (906365439 ^ i2)) {
                int i4 = 1968683270 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1062174397 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (333705863 ^ i2)) {
                    int i5 = 1409483097 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -970055014 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1230671915 ^ i2)) {
                        int i6 = 1076921026 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 581742249 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1326747977 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 93270046 ^ i2;
        throw new IllegalAccessException();
    }

    public void stopAutoSave() {
        int i = 1684006484 ^ (2111230738 ^ 864425481);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1350113913) {
            i = 62151450 ^ i;
            if (this.autoSaveTask == null) {
                mhrjgxbrkxtjxxhd(i, 859256012);
                return;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1306247849) {
                i = 1103282893 ^ i;
                this.autoSaveTask.cancel(1520188267);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1137562819) {
                    int i2 = 1928721921 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1137562819 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1835265473 ^ i)) {
                int i3 = 521673471 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1306247849 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1368215972 ^ i)) {
                    int i4 = 350619766 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1350113913 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1647793861 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 200013395 ^ i;
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
        kkXCb98zA1 = (-1378280882) ^ new Random(3674232084379790740L).nextInt();
    }

    public static String ncozgxsueq(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] ggxzcnsvusqnbrf() {
        return new byte[]{42, 74, 95, 87, 102, 118, 43, 6, 18, 42, 112, 85, 86, 59, 63, 120, 109, 81, 125, 120, 22, 44, 25, 7, 116, 83, 123, 36, 71, 48, 115, 38, 4, 52, 104, 81, 94, 117, 110, 112, 53, 80, 110, 99, 49, 9, 55, 95, 105, 52, 41, 34, 103, 68, 18, 49, 33, 29, 24, 86, 98, 51, 122, 109, 1, 87, 34, 22, 109, 45, 52, 25, 13, 61, 101, 95, 35, 116, 118, 19, 123, 81, 116, 93, 5, 29, 68, 65, 9, 95, 66, 74, 66, 74, 5, 76, 114, 81, 80, 30, 98, 97, 91};
    }

    private static byte[] kozqsbiivsejzfi() {
        return new byte[]{-26, -123, 110, 2, 81, 50, 26, 74, 38, 125, 66, 72, 103, 124, 8, 40, 92, 31, 73, 37, 36, 49, 40, 90, 67, 12, 74, 104, 115, 109, 65, 100, 53, 118, 95, 1, 111, 33};
    }

    private static int mhrjgxbrkxtjxxhd(int i, int i2) {
        return i2 ^ i;
    }
}
