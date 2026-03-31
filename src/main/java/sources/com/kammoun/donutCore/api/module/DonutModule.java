package com.kammoun.donutCore.api.module;

import com.kammoun.donutCore.DonutCore;
import com.kammoun.donutCore.api.commands.KCommand;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.logging.Logger;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.command.PluginCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;

public abstract class DonutModule implements Module {
    private final String moduleName;
    protected DonutCore api;
    protected File moduleDataFolder;
    private File configFile;
    private FileConfiguration config;
    private static int f4OvbRb19W = 0;
    private transient int rSH1g4XX1i = 1749474506;
    private static String[] nothing_to_see_here = new String[18];

    public DonutModule(java.lang.String r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.module.DonutModule.<init>(java.lang.String, int):void");
    }

    @Override
    public final void onEnable(DonutCore donutCore, int i) {
        int i2;
        int i3 = 292388262 ^ (1802112641 ^ 729511294);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1948241206) {
            i3 = 1146427765 ^ i3;
            this.api = donutCore;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1454835360) {
                i3 = 429230337 ^ i3;
                this.moduleDataFolder = new File(donutCore.getDataFolder(), this.moduleName);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1709486440) {
                    i3 = 285365213 ^ i3;
                    if (this.moduleDataFolder.exists() != (499041776 ^ i3)) {
                        i2 = 1846879970 ^ i3;
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -302633088) {
                        i3 = 1307084642 ^ i3;
                        this.moduleDataFolder.mkdirs();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2102258542) {
                            i2 = 603824512 ^ i3;
                        }
                    }
                    this.configFile = new File(this.moduleDataFolder, oxusxgpcpl(jphvdtibxpypsos(), ihamtpbwelazqbo(), i2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1654712173) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1654712173 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1064185099 ^ i2)) {
                                break;
                            }
                        }
                        int i4 = 222114555 ^ i2;
                        throw new IOException("double");
                    }
                    i3 = 221123703 ^ i2;
                    saveConfig(oxusxgpcpl(nzoclkgqgytokgt(), ihamtpbwelazqbo(), i3), 1620467835);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -198198485) {
                        i3 = 77548267 ^ i3;
                        loadConfig(392005859);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -791286669) {
                            i3 = 1959711452 ^ i3;
                            onModuleEnable(920219524);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1990425232) {
                                int i5 = 1082108548 ^ i3;
                                return;
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1454835360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (736861337 ^ i3)) {
                int i6 = 2057573609 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2102258542 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (609903525 ^ i3)) {
                    int i7 = 795031239 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1990425232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (272804377 ^ i3)) {
                        int i8 = 582537911 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1948241206 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2095243178 ^ i3)) {
                            int i9 = 1097665826 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -791286669 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (613137308 ^ i3)) {
                                int i10 = 2060087881 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1709486440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (397505829 ^ i3)) {
                                    int i11 = 157412804 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -302633088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (879708393 ^ i3)) {
                                        int i12 = 2132804819 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -198198485 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1269892940 ^ i3)) {
                                            int i13 = 1894014691 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1969106610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (927444218 ^ i3)) {
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
        int i14 = 1065562616 ^ i3;
        throw new RuntimeException();
    }

    @Override
    public final void onDisable(DonutCore donutCore, int i) {
        int i2 = 724527839 ^ (437886314 ^ 729511294);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -764668328) {
            i2 = 1695069061 ^ i2;
            onModuleDisable(509640274);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -97940877) {
                int i3 = 221560320 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -97940877 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1834108441 ^ i2)) {
                int i4 = 1408647274 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -764668328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (522607986 ^ i2)) {
                    int i5 = 366020749 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1819510157 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1568335279 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1121774215 ^ i2;
        throw new IllegalAccessException();
    }

    @Override
    public final String getName() {
        int i = 826602276 ^ (622016680 ^ 729511294);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -110757999) {
            int i2 = 2044719748 ^ i;
            return this.moduleName;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -110757999 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (815982247 ^ i)) {
                int i3 = 465153708 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 932864946 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1905811514 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1710712231 ^ i;
        throw new IOException();
    }

    public abstract void onModuleEnable(int i);

    public abstract void onModuleDisable(int i);

    public abstract void reload(int i);

    public Logger getLogger(int i) {
        int i2 = 946553908 ^ (239146841 ^ 729511294);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -360107880) {
            int i3 = 2143967837 ^ i2;
            return this.api.getLogger();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 349954675 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1699184727 ^ i2)) {
                int i4 = 253469024 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -360107880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (812896142 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 125003355 ^ i2;
        throw new RuntimeException();
    }

    public void saveConfig(String str, int i) {
        int i2 = 855889708 ^ (922035452 ^ 729511294);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1953248625) {
            i2 = 1240791969 ^ i2;
            File file = new File(this.moduleDataFolder, str);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1003219067) {
                i2 = 1502604470 ^ i2;
                if (file.exists() != (1056346553 ^ i2)) {
                    pnicrrwsaxtaaygr(i2, 1680917079);
                    return;
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -139162167) {
                    int i3 = 353019115 ^ i2;
                    this.api.saveResource(this.moduleName + "/" + str, (byte) (737949010 ^ i3));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1608624785) {
                        int i4 = 1899652796 ^ i3;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1608624785 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2035530077 ^ i3)) {
                            break;
                        }
                    }
                    int i5 = 517317418 ^ i3;
                    throw new RuntimeException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -139162167 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1071247640 ^ i2)) {
                int i6 = 1456809920 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1953248625 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (403334502 ^ i2)) {
                    int i7 = 193086300 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -701325454 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (209591840 ^ i2)) {
                        int i8 = 1017896346 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1003219067 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1985636840 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i9 = 293438133 ^ i2;
        throw new IllegalAccessException();
    }

    public void saveConfigToDisk(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.module.DonutModule.saveConfigToDisk(int):void");
    }

    public void loadConfig(int i) {
        int i2 = 941987147 ^ (85680311 ^ 729511294);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1305738224) {
            i2 = 1583728510 ^ i2;
            if (this.configFile != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1090666466) {
                    i2 = 650563285 ^ i2;
                    if (this.configFile.exists() == (1860602153 ^ i2)) {
                        pnicrrwsaxtaaygr(i2, 922473905);
                        return;
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1999915339) {
                        i2 = 1356112409 ^ i2;
                        this.config = YamlConfiguration.loadConfiguration(this.configFile);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -242132607) {
                            int i3 = 1714386856 ^ i2;
                            return;
                        }
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 197051224:
                        int i4 = 272440164 ^ i2;
                        return;
                    case 326255317:
                    case 1103500891:
                        return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1058347838 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (798893057 ^ i2)) {
                int i5 = 1947373670 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -242132607 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1389175972 ^ i2)) {
                    int i6 = 2114892879 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1090666466 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (20302431 ^ i2)) {
                        int i7 = 503427895 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1999915339 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (184558831 ^ i2)) {
                            int i8 = 889773719 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1305738224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (23777896 ^ i2)) {
                                int i9 = 606455578 ^ i2;
                                throw new IOException();
                            }
                        }
                    }
                }
            }
        }
    }

    public void registerCommand(org.bukkit.command.CommandExecutor r5, java.lang.String r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.module.DonutModule.registerCommand(org.bukkit.command.CommandExecutor, java.lang.String, int):void");
    }

    public void registerCommand(org.bukkit.command.CommandExecutor r6, java.lang.String[] r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.module.DonutModule.registerCommand(org.bukkit.command.CommandExecutor, java.lang.String[], int):void");
    }

    public void registerCommand(KCommand kCommand, String str, int i) {
        int i2 = 1935760250 ^ (454078903 ^ 729511294);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 408223130) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 106355409 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (87689478 ^ i2)) {
                    int i3 = 1458219459 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 408223130 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2017475304 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 1672787317 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i5 = 1058738808 ^ i2;
        if (str.isEmpty() != (2081525195 ^ i5)) {
            pnicrrwsaxtaaygr(i5, 1557878417);
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -527667621) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -527667621 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (488296969 ^ i5)) {
                    break;
                }
            }
            int i6 = 1874401095 ^ i5;
            throw new RuntimeException("double");
        }
        int i7 = 277541543 ^ i5;
        if (kCommand != null) {
            i7 = pnicrrwsaxtaaygr(i7, 975911526);
            PluginCommand command = this.api.getCommand(str);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1249761198) {
                int i8 = 948379649 ^ i7;
                if (command != null) {
                    i8 = pnicrrwsaxtaaygr(i8, 1610365021);
                    command.setExecutor(kCommand);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1906644303) {
                        i8 = 686769798 ^ i8;
                        command.setTabCompleter(kCommand);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -920592768) {
                            int i9 = 1297594224 ^ i8;
                            return;
                        }
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1908090971) {
                    int i10 = 795983925 ^ i8;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1906644303 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1343833097 ^ i8)) {
                        int i11 = 998779106 ^ i8;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1908090971 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (28959080 ^ i8)) {
                            int i12 = 1176358261 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -920592768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1861701730 ^ i8)) {
                                break;
                            }
                        }
                    }
                }
                int i13 = 195393444 ^ i8;
                throw new IllegalAccessException();
            }
        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1692138339) {
            int i14 = 1280418870 ^ i7;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1249761198 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (801477430 ^ i7)) {
                int i15 = 1531531598 ^ i7;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1692138339 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1982852939 ^ i7)) {
                    break;
                }
            }
        }
        int i16 = 1229125200 ^ i7;
        throw new IOException("double");
    }

    public void registerEvent(Listener listener, int i) {
        int i2 = 1422223830 ^ (272496301 ^ 729511294);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2082426923) {
            i2 = 349939999 ^ i2;
            Bukkit.getPluginManager().registerEvents(listener, this.api);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -624813869) {
                int i3 = 513873690 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -624813869 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (524729590 ^ i2)) {
                int i4 = 1746044590 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2082426923 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (199891618 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1822580420 ^ i2;
        throw new RuntimeException();
    }

    public File getDataFolder(int i) {
        int i2 = 223289398 ^ (10283928 ^ 729511294);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 893777537) {
            int i3 = 556041705 ^ i2;
            return this.moduleDataFolder;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 893777537 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2085131856 ^ i2)) {
                int i4 = 1634944171 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1013045704 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (265144816 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 509404176 ^ i2;
        throw new IOException();
    }

    public FileConfiguration getConfig(int i) {
        int i2 = 928532172 ^ (1443505925 ^ 729511294);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1363715514) {
            i2 = 1085319581 ^ i2;
            if (this.config != null) {
                pnicrrwsaxtaaygr(i2, 1058429132);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1422780752) {
                i2 = 2022654434 ^ i2;
                loadConfig(392005859);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1866996157) {
                    int i3 = 1201215790 ^ i2;
                }
            }
            return this.config;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1866996157 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1664184287 ^ i2)) {
                int i4 = 1436093055 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1422780752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1577524298 ^ i2)) {
                    int i5 = 1783318626 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1363715514 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1036874434 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 340972005 ^ i2;
        throw new IOException();
    }

    @Generated
    public String getModuleName(int i) {
        int i2 = 1466720675 ^ (1465108484 ^ 729511294);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1512498889) {
            int i3 = 466742363 ^ i2;
            return this.moduleName;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1512498889 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1099016660 ^ i2)) {
                int i4 = 282704341 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2069265391 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1224642159 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 953215112 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public DonutCore getApi(int i) {
        int i2 = 1706388272 ^ (1532655822 ^ 729511294);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1398590464) {
            int i3 = 96490338 ^ i2;
            return this.api;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2103333104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1214098272 ^ i2)) {
                int i4 = 998558016 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1398590464 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (859778877 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1541271893 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public File getModuleDataFolder(int i) {
        int i2 = 662491991 ^ (1183886370 ^ 729511294);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1421365338) {
            int i3 = 559442531 ^ i2;
            return this.moduleDataFolder;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1585120067 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1185489410 ^ i2)) {
                int i4 = 408193057 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1421365338 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (746260288 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 966143285 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public File getConfigFile() {
        int i = 1327231176 ^ (1364318562 ^ 729511294);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1450514783) {
            int i2 = 2032218135 ^ i;
            return this.configFile;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1619224090 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1180000141 ^ i)) {
                int i3 = 1335865405 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1450514783 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (294235019 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 301762037 ^ i;
        throw new IOException();
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
        f4OvbRb19W = 60417307 ^ new Random(5886306818914751095L).nextInt();
    }

    public static String oxusxgpcpl(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] ihamtpbwelazqbo() {
        return new byte[]{80, 100, 117, 81, 86, 27, 88, 106, 97, 52, 63, 41, 19, 4, 94, 58, 94, 42, 71, 102, 121, 100, 23, 99, 35, 108, 113, 27, 14, 14, 5, 14, 16, 36, 89, 13, 10, 54, 93, 122, 44, 48, 41, 87, 108, Byte.MAX_VALUE, 36, 52, 34, 33, 103, 66, 86, 63, 29, 38, 1, 73, 12, 66, 25, 106, 109, 96, 15, 65, 53, 24, 39, 25, 8, 124, 16, 31, 121, 16, 74, 112, 87, 85, 36, 79, 86, 23, 27, 22, 56, 82, 126, 115, 3, 42, 11, 87, 99, 24, 77, 49, 33, 39, 81, 15, 73, 23};
    }

    private static byte[] nzoclkgqgytokgt() {
        return new byte[]{-100, -86, 71, 0, 97, 68, 96, 60, 82, 101, 13, 113, 33, 81, 105, 36, 102, 107, 116, 60, 75, 57};
    }

    private static byte[] jphvdtibxpypsos() {
        return new byte[]{-97, -94, 65, 2, 96, 64, 108, 50, 83, 100, 14, 121, 39, 83, 104, 32, 106, 101, 117, 61, 72, 49};
    }

    private static int pnicrrwsaxtaaygr(int i, int i2) {
        return i ^ i2;
    }
}
