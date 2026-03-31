package com.kammoun.donutCore.billford.config;

import com.kammoun.donutCore.api.configuration.KConfigModule;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.billford.BillFordPlugin;
import com.kammoun.donutCore.billford.models.enums.Messages;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import lombok.Generated;
import org.bukkit.entity.Player;

public class BillfordConfig extends KConfigModule {
    private String currentPreset;
    private String presetChangeInterval;
    private long lastPresetChange;
    private List<String> presets;
    private String guiTitle;
    private int guiSize;
    private List<Integer> requiredItemsSlots;
    private List<Integer> fillItemSlots;
    private String editorTitle;
    private int editorSize;
    private HashMap<Messages, String> messages;

    private static int f167255RWXuds = 0;
    private transient int KBeXN8jU4i = 1542449972;
    private static String[] nothing_to_see_here = new String[19];

    public BillfordConfig(BillFordPlugin billFordPlugin, int i) {
        super(billFordPlugin, "config.yml", 1884314383);
        lcdyudzkmtsytxkf(356918344 ^ 603779498, 444162115);
        int parseInt = 1459152313 ^ (1324346289 ^ Integer.parseInt("886356905"));
        this.KBeXN8jU4i = 1542449972 ^ f167255RWXuds;
        int lcdyudzkmtsytxkf = 151810687 ^ lcdyudzkmtsytxkf(parseInt, 1840579205);
        this.messages = new HashMap<>();
        loadSettings(2029651231);
        loadMessages(602784207);
        int i2 = 158596824 ^ (1743538849 ^ (1330387797 ^ lcdyudzkmtsytxkf));
    }

    private void loadMessages(int i) {
        int i2 = 2072644300 ^ (1255684325 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -958903174) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -958903174 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (818789360 ^ i2)) {
                    break;
                }
            }
            int i3 = 187952452 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1144465548 ^ i2;
        this.messages.clear();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -413071336) {
            int i5 = 1554136623 ^ i4;
            Messages[] values = Messages.values();
            int length = values.length;
            int i6 = (byte) (1078861612 ^ i5);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 40958306) {
                int i7 = 1927649845;
                while (true) {
                    i5 = i7 ^ i5;
                    if (i6 >= length) {
                        lcdyudzkmtsytxkf(i5, 202723174);
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1789122359) {
                        int i8 = 825525510 ^ i5;
                        Messages messages = values[i6];
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 486015224) {
                            i5 = 2010177796 ^ i8;
                            this.messages.put(messages, messages.getMessage(this.config.getConfigurationSection(tlrtjohzdx(cacwkdlsswufzby(), tdzymamzjydelof(), i5))));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1568732965) {
                                i4 = 1847802187 ^ i5;
                                i6 += 443340881 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -748240256) {
                                    int i9 = 1246977494 ^ i4;
                                    try {
                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i9) == 192627340) {
                                            throw new RuntimeException();
                                        }
                                        throw null;
                                    } catch (RuntimeException e) {
                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                            case -2114180046:
                                                i5 = lcdyudzkmtsytxkf(i9, 1912339403);
                                                break;
                                            case -1583773405:
                                                i5 = lcdyudzkmtsytxkf(i9, 1442271081);
                                                break;
                                            default:
                                                throw new IllegalAccessException("Error in hash");
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 237236841) {
                                            i7 = 326105940;
                                        } else {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1789122359 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (153332896 ^ i5)) {
                                                    int i10 = 720720524 ^ i5;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 237236841 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (606311291 ^ i5)) {
                                                        int i11 = 805845167 ^ i5;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -168406023 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (923752416 ^ i5)) {
                                                            int i12 = 571974867 ^ i5;
                                                            throw new IllegalAccessException();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 486015224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1205614321 ^ i8)) {
                                    int i13 = 1410134488 ^ i8;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1583773405 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1849918207 ^ i5)) {
                    int i14 = 1882679050 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 40958306 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (876144043 ^ i5)) {
                        int i15 = 327004863 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1568732965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1786834306 ^ i5)) {
                            int i16 = 1183051466 ^ i5;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -748240256 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1058734882 ^ i4)) {
                int i17 = 703679842 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -413071336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1389411437 ^ i4)) {
                    int i18 = 1906341865 ^ i4;
                    throw new RuntimeException("double");
                }
            }
        }
    }

    private void loadSettings(int i) {
        int i2 = 976769268 ^ (2063156461 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1245806073) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1245806073 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1974960180 ^ i2)) {
                    break;
                }
            }
            int i3 = 410516068 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 88114485 ^ i2;
        this.currentPreset = this.config.getString(tlrtjohzdx(hubagsgcryfyvuw(), tdzymamzjydelof(), i4), tlrtjohzdx(hnskzrbgtqynycn(), tdzymamzjydelof(), i4));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1615156305) {
            int i5 = 1391518518 ^ i4;
            this.presetChangeInterval = this.config.getString(tlrtjohzdx(hqixemxvaeuljqg(), tdzymamzjydelof(), i5), tlrtjohzdx(zywixhtyvmwrwwl(), tdzymamzjydelof(), i5));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -138261021) {
                int i6 = 1413207341 ^ i5;
                this.lastPresetChange = this.config.getLong(tlrtjohzdx(omynrbnawptaoer(), tdzymamzjydelof(), i6), 0L);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1444734089) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1444734089 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1143519715 ^ i6)) {
                            break;
                        }
                    }
                    int i7 = 1282294286 ^ i6;
                    throw new RuntimeException("double");
                }
                int i8 = 405392496 ^ i6;
                this.presets = this.config.getStringList(tlrtjohzdx(ikokjxzvfqiaylh(), tdzymamzjydelof(), i8));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1756199159) {
                    i8 = 1451212342 ^ i8;
                    this.guiTitle = this.config.getString(tlrtjohzdx(xbdprryjvoxtxiu(), tdzymamzjydelof(), i8), tlrtjohzdx(kahmzkttpgsuels(), tdzymamzjydelof(), i8));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 615478971) {
                        int i9 = 1556641889 ^ i8;
                        this.guiSize = this.config.getInt(tlrtjohzdx(hqdzrsqjrftytqf(), tdzymamzjydelof(), i9), (byte) (945657472 ^ i9));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -1024674383) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1024674383 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1005616257 ^ i9)) {
                                    break;
                                }
                            }
                            int i10 = 794806348 ^ i9;
                            throw new RuntimeException("double");
                        }
                        i8 = 1629254084 ^ i9;
                        this.requiredItemsSlots = this.config.getIntegerList(tlrtjohzdx(yppbwlvqajsprdx(), tdzymamzjydelof(), i8));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -904971374) {
                            i5 = 142497080 ^ i8;
                            this.fillItemSlots = this.config.getIntegerList(tlrtjohzdx(cxaycgbvcvdlhwu(), tdzymamzjydelof(), i5));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1979870638) {
                                i4 = 8862145 ^ i5;
                                this.editorTitle = this.config.getString(tlrtjohzdx(bqniffpwjzgatvx(), tdzymamzjydelof(), i4), tlrtjohzdx(iomttibjhbobjkp(), tdzymamzjydelof(), i4));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1916511142) {
                                    i4 = 1281301969 ^ i4;
                                    this.editorSize = this.config.getInt(tlrtjohzdx(uprzrnwjrrcvusq(), tdzymamzjydelof(), i4), (byte) (501716588 ^ i4));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -281234736) {
                                        int i11 = 1567095175 ^ i4;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -904971374 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (683191550 ^ i8)) {
                        int i12 = 1655231252 ^ i8;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1756199159 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (235281767 ^ i8)) {
                            int i13 = 600839330 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 615478971 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (877710912 ^ i8)) {
                                break;
                            }
                        }
                    }
                }
                int i14 = 1494883167 ^ i8;
                throw new IllegalAccessException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -138261021 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (361461622 ^ i5)) {
                    int i15 = 363400990 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1979870638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1940241928 ^ i5)) {
                        break;
                    }
                }
            }
            int i16 = 186098520 ^ i5;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 67337962 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1641805398 ^ i4)) {
                int i17 = 807708871 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1916511142 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (789169249 ^ i4)) {
                    int i18 = 1291428967 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1615156305 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2129479129 ^ i4)) {
                        int i19 = 793511588 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -281234736 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (597794448 ^ i4)) {
                            break;
                        }
                    }
                }
            }
        }
        int i20 = 596923075 ^ i4;
        throw new RuntimeException();
    }

    public void reload(int i) {
        int i2 = 185096993 ^ (1691665888 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 850209592) {
            i2 = 1472264761 ^ i2;
            load(985210593);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1934951694) {
                int i3 = 1102783553 ^ i2;
                loadSettings(2029651231);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2123114248) {
                    i3 = 180408905 ^ i3;
                    loadMessages(602784207);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -680179024) {
                        int i4 = 374584860 ^ i3;
                        return;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2123114248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (667822533 ^ i3)) {
                        int i5 = 1846317075 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -680179024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (51182649 ^ i3)) {
                            int i6 = 844945637 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1709767248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1265461705 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
                int i7 = 1805867921 ^ i3;
                throw new RuntimeException();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 850209592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (552097889 ^ i2)) {
                int i8 = 1815686002 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1934951694 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (70021168 ^ i2)) {
                    break;
                }
            }
        }
        int i9 = 257889589 ^ i2;
        throw new IOException("double");
    }

    public void setCurrentPreset(String str, int i) {
        int i2 = 1629045049 ^ (563806141 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1213475089) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1213475089 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (23089925 ^ i2)) {
                    break;
                }
            }
            int i3 = 1011197433 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1431976898 ^ i2;
        this.currentPreset = str;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -494536957) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -494536957 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1839646838 ^ i4)) {
                    break;
                }
            }
            int i5 = 39785230 ^ i4;
            throw new IllegalAccessException("double");
        }
        int i6 = 1149808579 ^ i4;
        this.config.set(tlrtjohzdx(tycludxohfnrehx(), tdzymamzjydelof(), i6), str);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -960460519) {
            i6 = 1128106304 ^ i6;
            save(521556227);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -550714597) {
                int i7 = 1404959694 ^ i6;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -550714597 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1122507237 ^ i6)) {
                int i8 = 1734067601 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1120083305 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (213968463 ^ i6)) {
                    int i9 = 1065583005 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -960460519 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1261815319 ^ i6)) {
                        break;
                    }
                }
            }
        }
        int i10 = 775388538 ^ i6;
        throw new RuntimeException();
    }

    public void setLastPresetChange(long j, int i) {
        int i2 = 833808941 ^ (1869477820 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1162792519) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1162792519 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1319829445 ^ i2)) {
                    break;
                }
            }
            int i3 = 1543994392 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1292173406 ^ i2;
        this.lastPresetChange = j;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -761711797) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -552809397 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (28956205 ^ i4)) {
                    int i5 = 712955352 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -761711797 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (153546188 ^ i4)) {
                        break;
                    }
                }
            }
            int i6 = 584900970 ^ i4;
            throw new IOException();
        }
        int i7 = 29791482 ^ i4;
        this.config.set(tlrtjohzdx(elnrumodhukdqvh(), tdzymamzjydelof(), i7), Long.valueOf(j));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -592604005) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -592604005 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (452455635 ^ i7)) {
                    break;
                }
            }
            int i8 = 1180573831 ^ i7;
            throw new IOException("double");
        }
        int i9 = 757487926 ^ i7;
        save(521556227);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1247847126) {
            int i10 = 760377900 ^ i9;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1247847126 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (585036353 ^ i9)) {
                break;
            }
        }
        int i11 = 1990444628 ^ i9;
        throw new IOException("double");
    }

    public void addPreset(String str, int i) {
        int i2 = 1646477653 ^ (1857158315 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 685519555) {
            i2 = 696865634 ^ i2;
            if (this.presets.contains(str) != (1284691258 ^ i2)) {
                lcdyudzkmtsytxkf(i2, 1807492218);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1687595474) {
                i2 = 1625109092 ^ i2;
                this.presets.add(str);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1652505329) {
                    i2 = 363257876 ^ i2;
                    this.config.set(tlrtjohzdx(xsnjniujflwalmh(), tdzymamzjydelof(), i2), this.presets);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -817350063) {
                        i2 = 936189530 ^ i2;
                        save(521556227);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1897973888) {
                            int i3 = 688580688 ^ i2;
                            return;
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 964135425 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (158782638 ^ i2)) {
                int i4 = 599412921 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1652505329 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (553079442 ^ i2)) {
                    int i5 = 156129461 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1897973888 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (925701152 ^ i2)) {
                        int i6 = 113970755 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -817350063 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1986320962 ^ i2)) {
                            int i7 = 2084463483 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1687595474 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (366081711 ^ i2)) {
                                int i8 = 1156004597 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 685519555 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1239653057 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i9 = 1281765172 ^ i2;
        throw new IllegalAccessException();
    }

    public void removePreset(String str, int i) {
        int i2 = 384292900 ^ (466023867 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 624996811) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 624996811 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1702929397 ^ i2)) {
                    break;
                }
            }
            int i3 = 618000491 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 941945503 ^ i2;
        if (this.presets.remove(str) == (1552737446 ^ i4)) {
            lcdyudzkmtsytxkf(i4, 127924304);
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -463002318) {
            i4 = 1868115231 ^ i4;
            this.config.set(tlrtjohzdx(kgaqvvhrrrqdkoh(), tdzymamzjydelof(), i4), this.presets);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1632743991) {
                int i5 = 1151133334 ^ i4;
                save(521556227);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1169589893) {
                    int i6 = 744109017 ^ i5;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1169589893 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1406949343 ^ i5)) {
                        break;
                    }
                }
                int i7 = 431769028 ^ i5;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -661067854 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (819159512 ^ i4)) {
                int i8 = 502421181 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -463002318 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1957607272 ^ i4)) {
                    int i9 = 638604711 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1632743991 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1134621500 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i10 = 61208871 ^ i4;
        throw new IllegalAccessException();
    }

    public String getMessage(Messages messages, int i) {
        int i2 = 742418670 ^ (877341905 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1944847157) {
            return this.messages.getOrDefault(messages, tlrtjohzdx(kxmoveitghoisom(), tdzymamzjydelof(), 1368880861 ^ i2));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1944847157 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (368724835 ^ i2)) {
                int i3 = 1119907579 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 11029025 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1481528888 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 616840339 ^ i2;
        throw new IllegalAccessException();
    }

    public void sendMessage(Player player, Messages messages, int i) {
        int i2 = 1570331782 ^ (697124803 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -320272616) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -320272616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (934854522 ^ i2)) {
                    break;
                }
            }
            int i3 = 770030301 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 592610592 ^ i2;
        String orDefault = this.messages.getOrDefault(messages, tlrtjohzdx(zwooypvcglmenno(), tdzymamzjydelof(), i4));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -159568359) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -159568359 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (757356721 ^ i4)) {
                    break;
                }
            }
            int i5 = 1919237366 ^ i4;
            throw new RuntimeException("double");
        }
        int i6 = 1591842706 ^ i4;
        if (orDefault.isEmpty() != (1613640273 ^ i6)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 24220299) {
                int i7 = 301587384 ^ i6;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 24220299 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (213707433 ^ i6)) {
                    break;
                }
            }
            int i8 = 1019832123 ^ i6;
            throw new IllegalAccessException("double");
        }
        int i9 = 2001300308 ^ i6;
        player.sendMessage(ChatFormater.color(orDefault));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1153775576) {
            int i10 = 1714550197 ^ i9;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1900064949 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (507974819 ^ i9)) {
                int i11 = 1088025417 ^ i9;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1967823485 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (387760169 ^ i9)) {
                    int i12 = 744993478 ^ i9;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1153775576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (91350590 ^ i9)) {
                        break;
                    }
                }
            }
        }
        int i13 = 1683068809 ^ i9;
        throw new RuntimeException();
    }

    private void save(int i) {
        int i2;
        int i3 = 1370628958 ^ (906212332 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1908758688) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1908758688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (306494023 ^ i3)) {
                    break;
                }
            }
            int i4 = 60637802 ^ i3;
            throw new RuntimeException("double");
        }
        ?? r0 = 818343819 ^ i3;
        int i5 = r0;
        try {
            this.config.save(new File(this.plugin.getModuleDataFolder(493044696), tlrtjohzdx(ckcguguxmvlbipw(), tdzymamzjydelof(), i5)));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -135125767) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -135125767 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2072373683 ^ i5)) {
                        int i6 = 526534121 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -850087680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1453910752 ^ i5)) {
                            break;
                        }
                    }
                }
                int i7 = 395540981 ^ i5;
                throw new IllegalAccessException("double");
            }
            i5 = 2085648611 ^ i5;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 359785442) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 496839544 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2068938866 ^ i5)) {
                        int i8 = 1767248058 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 359785442 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1373908416 ^ i5)) {
                            break;
                        }
                    }
                }
                int i9 = 59547307 ^ i5;
                throw new IOException();
            }
            int lcdyudzkmtsytxkf = lcdyudzkmtsytxkf(i5, 1527032412);
            try {
                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(lcdyudzkmtsytxkf) == 29006708) {
                    throw new IOException();
                }
                throw null;
            } catch (IOException e) {
                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                    case -850087680:
                        i2 = 301445405 ^ lcdyudzkmtsytxkf;
                        break;
                    case 496839544:
                        i2 = 200180306 ^ lcdyudzkmtsytxkf;
                        break;
                    default:
                        throw new IOException("Error in hash");
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1122580968) {
                    int i10 = 1653851980 ^ i2;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1122580968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1253986408 ^ i2)) {
                        int i11 = 731767491 ^ i2;
                        throw new IOException("double");
                    }
                }
            }
        } catch (IOException e2) {
            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                case -135125767:
                    int lcdyudzkmtsytxkf2 = lcdyudzkmtsytxkf(i5, 2007393024);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lcdyudzkmtsytxkf2) == 1254178042) {
                        int i12 = 1794314864 ^ lcdyudzkmtsytxkf2;
                        this.plugin.getLogger(583940502).severe("Failed to save Billford config: " + r0.getMessage());
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 492416889) {
                            int i13 = 1231410590 ^ i12;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 492416889 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1470521569 ^ i12)) {
                                int i14 = 1741768313 ^ i12;
                                throw new IllegalAccessException("double");
                            }
                        }
                    } else {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lcdyudzkmtsytxkf2) == 1254178042 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(lcdyudzkmtsytxkf2) == (2101816057 ^ lcdyudzkmtsytxkf2)) {
                                int i15 = 290763570 ^ lcdyudzkmtsytxkf2;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                    break;
                default:
                    throw new IllegalAccessException("Error in hash");
            }
        }
    }

    @Generated
    public String getCurrentPreset(int i) {
        int i2 = 27791878 ^ (602972985 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1586255050) {
            int i3 = 360093655 ^ i2;
            return this.currentPreset;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1586255050 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (900483287 ^ i2)) {
                int i4 = 706086473 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -180819342 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (219743361 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1347712931 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public String getPresetChangeInterval(int i) {
        int i2 = 936706013 ^ (75450194 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -787211958) {
            int i3 = 483037083 ^ i2;
            return this.presetChangeInterval;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 926967186 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1452013867 ^ i2)) {
                int i4 = 1653382883 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -787211958 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (35256176 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 159789682 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public long getLastPresetChange(int i) {
        int i2 = 1132583121 ^ (1122474660 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1199296155) {
            int i3 = 939973661 ^ i2;
            return this.lastPresetChange;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1199296155 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1378582124 ^ i2)) {
                int i4 = 910742315 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2024984974 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (411379384 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2132106101 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public List<String> getPresets() {
        int i = 482354978 ^ (1331027373 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -790230711) {
            int i2 = 2103024231 ^ i;
            return this.presets;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 975886962 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (452132358 ^ i)) {
                int i3 = 1196356735 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -790230711 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2125108520 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1310961536 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public String getGuiTitle() {
        int i = 1617952090 ^ (298864480 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1045148448) {
            int i2 = 1542926815 ^ i;
            return this.guiTitle;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 504218138 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (300387968 ^ i)) {
                int i3 = 1415056119 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1045148448 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1415458278 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1176901432 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public int getGuiSize() {
        int i = 669818966 ^ (730929105 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 799301899) {
            int i2 = 857848607 ^ i;
            return this.guiSize;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1230390798 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (534055551 ^ i)) {
                int i3 = 455769915 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 799301899 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2022290851 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 780062266 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public List<Integer> getRequiredItemsSlots() {
        int i = 622047619 ^ (135383376 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 609885098) {
            int i2 = 1917200416 ^ i;
            return this.requiredItemsSlots;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1234478423 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (839484825 ^ i)) {
                int i3 = 1878949972 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 609885098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (850633092 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 574305889 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public List<Integer> getFillItemSlots() {
        int i = 1897436982 ^ (1003471882 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 452150481) {
            int i2 = 1297128005 ^ i;
            return this.fillItemSlots;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1886885627 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (553830418 ^ i)) {
                int i3 = 205749684 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 452150481 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1661519630 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 15272396 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public String getEditorTitle() {
        int i = 1064931374 ^ (1720939808 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2095123135) {
            int i2 = 506725423 ^ i;
            return this.editorTitle;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1925108793 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (146181382 ^ i)) {
                int i3 = 735105907 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2095123135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1514206303 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 17871550 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public int getEditorSize() {
        int i = 1877453065 ^ (307411854 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1579071224) {
            int i2 = 725107519 ^ i;
            return this.editorSize;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -131903247 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (519081421 ^ i)) {
                int i3 = 1459876236 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1579071224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1002434607 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 95236849 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public HashMap<Messages, String> getMessages() {
        int i = 1138463218 ^ (1282648633 ^ 1770601382);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 822608747) {
            int i2 = 608890878 ^ i;
            return this.messages;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 822608747 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (159850208 ^ i)) {
                int i3 = 360374207 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 325024922 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1545735169 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 220593440 ^ i;
        throw new IOException();
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
        f167255RWXuds = (-914745051) ^ new Random(-1596231269794237116L).nextInt();
    }

    public static String tlrtjohzdx(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] tdzymamzjydelof() {
        return new byte[]{21, 61, 12, 30};
    }

    private static byte[] cacwkdlsswufzby() {
        return new byte[]{-38, -5, 57, 98, 38, 97, 62, 93, 39, 121, 61, 70, 32, 107, 63, 66, 39, 126};
    }

    private static byte[] uprzrnwjrrcvusq() {
        return new byte[]{-34, -14, 61, 75, 36, 98, 57, 69, 37, 100, 60, 73, 34, 99, 58, 89, 34, 105, 57, 3, 36, 122, 61, 90, 32, 111, 60, 88, 37, 105, 59, 91, 35, 37, 59, 75, 32, 105, 61, 64, 36, Byte.MAX_VALUE, 57, 70, 37, 122, 60, 1, 34, Byte.MAX_VALUE, 58, 66, 34, 119, 57, 75};
    }

    private static byte[] hubagsgcryfyvuw() {
        return new byte[]{-36, -15, 52, 75, 35, 97, 56, 71, 37, 102, 63, 64, 34, 100, 57, 88, 32, 105, 59, 3, 45, 105, 58, 94, 33, 122, 60, 91, 38, 96, 59, 70, 32, 125, 57, 3, 34, 126, 52, 91, 35, 109, 56, 88, 37, 111, 63, 82};
    }

    private static byte[] hnskzrbgtqynycn() {
        return new byte[0];
    }

    private static byte[] xbdprryjvoxtxiu() {
        return new byte[]{-38, -12, 52, 75, 32, 96, 59, 68, 37, 102, 61, 78, 45, 101, 57, 88, 34, 111, 60, 4, 36, 108, 52, 92, 32, 96, 59, 6, 37, 126, 61, 65, 45, 126, 57, 70, 34, 110};
    }

    private static byte[] kahmzkttpgsuels() {
        return new byte[]{-38, -12, 54, -80, 34, 99, 57, -73, 39, -107, -102, 24, 48, 5, 59, -86, 63, 14};
    }

    private static byte[] bqniffpwjzgatvx() {
        return new byte[]{-38, -15, 59, 77, 37, 96, 52, 74, 33, 98, 61, 75, 34, 99, 60, 88, 45, 97, 56, 0, 36, 126, 59, 93, 37, 108, 52, 85, 33, 107, 61, 89, 34, 33, 60, 79, 45, 97, 56, 68, 36, 122, 59, 64, 37, 123, 52, 8, 33, 122, 61, 68, 34, 120, 60, 70, 45, 96};
    }

    private static byte[] iomttibjhbobjkp() {
        return new byte[]{-38, -15, 38, 43, 56, 21, 54, -90, 35, -114, 32, 42, 32, 120, 33, 49, 47, -102, 58, -94, 36, 46, 38, 40, 56, 12, 54, 76, 60, 21, 63, 71, 32, 120, 62, 72, 45, 63, 56, 13, 36, 43, 59, 95, 37, 123, 52, 67, 33, 125, 61, 72, 34, 120, 60, 15};
    }

    private static byte[] ikokjxzvfqiaylh() {
        return new byte[]{-45, -9, 56, 78, 36, 98, 53, 64, 44, 105, 57, 76, 39, 99, 58, 85, 39, 96, 52, 5, 33, Byte.MAX_VALUE, 61, 90, 44, 106, 53, 85, 32, 108, 62, 91, 35, 119};
    }

    private static byte[] hqdzrsqjrftytqf() {
        return new byte[]{-46, -10, 57, 74, 32, 99, 57, 64, 35, 104, 56, 77, 35, 103, 59, 89, 39, 111, 53, 7, 32, 108, 57, 92, 32, 102, 58, 9, 33, 123, 58, 66, 34, 114, 62, 77};
    }

    private static byte[] yppbwlvqajsprdx() {
        return new byte[]{-38, -10, 53, 75, 33, 109, 61, 65, 36, 101, 61, 76, 44, 101, 56, 85, 36, 106, 61, 7, 36, 110, 53, 92, 33, 109, 61, 3, 36, 123, 61, 79, 44, 123, 56, 82, 36, 103, 61, 88, 36, 108, 53, 77, 33, 41, 61, 68, 36, 125, 61, 79, 44, 103, 56, 84, 36, 35, 61, 89, 36, 101, 53, 70, 33, 112, 61, 94};
    }

    private static byte[] cxaycgbvcvdlhwu() {
        return new byte[]{-38, -15, 58, 79, 36, 102, 52, 75, 37, 103, 61, 75, 35, 97, 61, 94, 45, 96, 60, 5, 36, 105, 58, 88, 36, 102, 52, 9, 37, 109, 61, 68, 35, 98, 61, 64, 45, 41, 60, 65, 36, 122, 58, 72, 36, 98, 52, 9, 37, 120, 61, 65, 35, 97, 61, 88, 45, 119};
    }

    private static byte[] omynrbnawptaoer() {
        return new byte[]{-36, -13, 59, 72, 35, 102, 58, 69, 38, 102, 61, 79, 33, 100, 62, 90, 34, 106, 59, 1, 34, 101, 58, 77, 35, 121, 63, 93, 36, 39, 56, 88, 39, 121, 59, 72, 34, Byte.MAX_VALUE, 59, 79, 35, 123, 58, 4, 38, 105, 61, 65, 33, 106, 62, 70, 34, 105, 59, 74};
    }

    private static byte[] hqixemxvaeuljqg() {
        return new byte[]{-39, -13, 63, 76, 39, 100, 61, 66, 39, 97, 62, 73, 38, 98, 62, 92, 36, 105, 62, 0, 39, 124, 63, 92, 39, 104, 61, 93, 39, 104, 62, 91, 38, 32, 62, 77, 36, 101, 62, 79, 39, 98, 63, 73, 39, 104, 61, 3, 39, 100, 62, 65, 38, 121, 62, 75, 36, Byte.MAX_VALUE, 62, 88, 39, 109, 63, 66};
    }

    private static byte[] zywixhtyvmwrwwl() {
        return new byte[]{-39, -13, 63, 28, 39, 96};
    }

    private static byte[] tycludxohfnrehx() {
        return new byte[]{-46, -9, 63, 74, 45, 96, 62, 71, 44, 104, 57, 75, 35, 106, 56, 94, 32, 96, 53, 5, 38, 104, 52, 95, 39, 122, 53, 85, 32, 107, 58, 72, 33, 123, 57, 10, 44, 120, 63, 90, 45, 108, 62, 88, 44, 97, 57, 89};
    }

    private static byte[] elnrumodhukdqvh() {
        return new byte[]{-39, -14, 59, 79, 33, 100, 52, 67, 33, 102, 62, 72, 34, 97, 56, 92, 45, 104, 56, 7, 39, 97, 59, 76, 33, 126, 52, 91, 33, 39, 62, 94, 34, 124, 56, 75, 45, Byte.MAX_VALUE, 56, 76, 39, 121, 59, 0, 33, 110, 52, 71, 33, 107, 62, 64, 34, 105, 56, 75};
    }

    private static byte[] xsnjniujflwalmh() {
        return new byte[]{-46, -11, 61, 73, 34, 103, 60, 68, 35, 104, 59, 73, 32, 101, 63, 92, 35, 111, 53, 7, 36, 120, 59, 95, 37, 110, 58, 84, 34, 105, 57, 93, 38, 126};
    }

    private static byte[] kgaqvvhrrrqdkoh() {
        return new byte[]{-45, -12, 53, 74, 33, 108, 52, 64, 32, 105, 58, 65, 35, 102, 52, 84, 39, 108, 52, 6, 44, 123, 56, 84, 45, 106, 57, 85, 35, 97, 58, 94, 45, 118};
    }

    private static byte[] kxmoveitghoisom() {
        return new byte[0];
    }

    private static byte[] zwooypvcglmenno() {
        return new byte[0];
    }

    private static byte[] ckcguguxmvlbipw() {
        return new byte[]{-38, -14, 57, 75, 45, 103, 61, 65, 37, 104, 61, 71, 32, 108, 52, 5, 36, 117, 60, 64, 36, 97};
    }

    private static int lcdyudzkmtsytxkf(int i, int i2) {
        return i ^ i2;
    }
}
