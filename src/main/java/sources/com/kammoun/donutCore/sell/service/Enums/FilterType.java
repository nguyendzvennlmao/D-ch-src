package com.kammoun.donutCore.sell.service.Enums;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Generated;

public final class FilterType {
    public static final FilterType ALL;
    public static final FilterType BLOCKS;
    public static final FilterType TOOLS;
    public static final FilterType FOOD;
    public static final FilterType COMBAT;
    public static final FilterType POTIONS;
    public static final FilterType BOOKS;
    public static final FilterType INGREDIENTS;
    public static final FilterType UTILITIES;
    private final String displayName;
    private final List<String> lore;
    private static final FilterType[] $VALUES;

    public static FilterType[] values() {
        int i = 399373836 ^ (1367087192 ^ (1791013171 ^ 1586361975));
        return (FilterType[]) $VALUES.clone();
    }

    public static FilterType valueOf(String str) {
        int i = 1706086209 ^ (1529281329 ^ 1586361975);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 14553147) {
            int i2 = 611315038 ^ i;
            return (FilterType) Enum.valueOf(FilterType.class, str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 597785290 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (324596187 ^ i)) {
                int i3 = 1595140581 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 14553147 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (229010148 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 856289635 ^ i;
        throw new RuntimeException();
    }

    private FilterType(String str, int i, String str2, List list) {
        int i2 = 1701951426 ^ 407498822;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 43874231:
                    int i3 = 884369933 ^ i2;
                    break;
                case 1138679798:
                    break;
                case 1762470595:
                default:
                    throw new IllegalAccessException();
                case 2129091901:
            }
        }
        int kkpfdmoyokhxtjot = 982424574 ^ kkpfdmoyokhxtjot(1140853355 ^ (335623925 ^ Integer.parseInt("428806423")), 246921882);
        this.displayName = str2;
        this.lore = list;
        int i4 = 616576196 ^ (978227106 ^ kkpfdmoyokhxtjot);
    }

    public FilterType next() {
        int i = 1480106449 ^ (1499780575 ^ 826806730);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2136789471) {
            i = 245427338 ^ i;
            FilterType[] values = values();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -173782415) {
                return values[(ordinal() + ((byte) (621152137 ^ (464686790 ^ i)))) % values.length];
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2136789471 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (776701634 ^ i)) {
                int i2 = 768006621 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -173782415 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1198895788 ^ i)) {
                    break;
                }
            }
        }
        int i3 = 1821052561 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public String getDisplayName() {
        int i = 1925337654 ^ (603659137 ^ 826806730);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 59425771) {
            int i2 = 61804798 ^ i;
            return this.displayName;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 59425771 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1860111844 ^ i)) {
                int i3 = 794121546 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 519193627 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1210937861 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1286832716 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public List<String> getLore() {
        int i = 1475104390 ^ (1281735378 ^ 826806730);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1443835121) {
            int i2 = 726084891 ^ i;
            return this.lore;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1443835121 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1861464670 ^ i)) {
                int i3 = 261084876 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 204882984 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (302255324 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 228077173 ^ i;
        throw new IllegalAccessException();
    }

    private static FilterType[] $values() {
        int i = 1302149387 ^ (252220608 ^ (103575467 ^ 1586361975));
        FilterType[] filterTypeArr = new FilterType[(byte) (439628830 ^ i)];
        filterTypeArr[(byte) (439628823 ^ i)] = ALL;
        filterTypeArr[(byte) (439628822 ^ i)] = BLOCKS;
        filterTypeArr[(byte) (439628821 ^ i)] = TOOLS;
        filterTypeArr[(byte) (439628820 ^ i)] = FOOD;
        filterTypeArr[(byte) (439628819 ^ i)] = COMBAT;
        filterTypeArr[(byte) (439628818 ^ i)] = POTIONS;
        filterTypeArr[(byte) (439628817 ^ i)] = BOOKS;
        filterTypeArr[(byte) (439628816 ^ i)] = INGREDIENTS;
        filterTypeArr[(byte) (439628831 ^ i)] = UTILITIES;
        return filterTypeArr;
    }

    static {
        int parseInt = 735851227 ^ (1112447250 ^ (1338947321 ^ Integer.parseInt("428806423")));
        ALL = new FilterType(gmpxhoxfbf(potahxklcfwlzrg(), pcklnlznkoqdzea(), parseInt), (byte) (1070795815 ^ parseInt), gmpxhoxfbf(vdqjimvwahzehow(), pcklnlznkoqdzea(), parseInt), List.of(gmpxhoxfbf(xrwuhgusuvetaaz(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(dtorxzjxjkglvgj(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(nzzcdmrnkbgirhj(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(rslooztpfvcywvk(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(abfnzinjcsdgkyn(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(otxafkmnyhxlifc(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(stxzzorodfahzsk(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(tccpinxsuccdgrp(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(eyoknqpfkqxsuxx(), pcklnlznkoqdzea(), parseInt)));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -23568071) {
            int i = 184753397 ^ parseInt;
            BLOCKS = new FilterType(gmpxhoxfbf(ljgyigzlzsvbnfc(), pcklnlznkoqdzea(), i), (byte) (886051027 ^ i), gmpxhoxfbf(yjsyxinoghsijnp(), pcklnlznkoqdzea(), i), List.of(gmpxhoxfbf(dzljsqbiyzcqiin(), pcklnlznkoqdzea(), i), gmpxhoxfbf(cnjtihankowmmbk(), pcklnlznkoqdzea(), i), gmpxhoxfbf(nopzafrbvqrbwak(), pcklnlznkoqdzea(), i), gmpxhoxfbf(cikuszlzaavvuxt(), pcklnlznkoqdzea(), i), gmpxhoxfbf(zsknojvhztjvovi(), pcklnlznkoqdzea(), i), gmpxhoxfbf(fxouopyijkmxozm(), pcklnlznkoqdzea(), i), gmpxhoxfbf(tauivnnyuoltsmk(), pcklnlznkoqdzea(), i), gmpxhoxfbf(sdbvbgkxduatsal(), pcklnlznkoqdzea(), i), gmpxhoxfbf(kwfkykorglrchoo(), pcklnlznkoqdzea(), i)));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1501526383) {
                parseInt = 1447850139 ^ i;
                TOOLS = new FilterType(gmpxhoxfbf(ogminvljjxxvxas(), pcklnlznkoqdzea(), parseInt), (byte) (1654415435 ^ parseInt), gmpxhoxfbf(ppmebznypibkuii(), pcklnlznkoqdzea(), parseInt), List.of(gmpxhoxfbf(jqiuxumfxeszfhs(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(frwbpxeljtbfvnf(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(wzatnpktbrqhqla(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(xczafjnshyvujsa(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(vgntyoljdbhqppm(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(ygoewyctttyawth(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(zqzxjrzcprrjmyh(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(axdwvwytqimzhzv(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(ttkrcwijdxsyciy(), pcklnlznkoqdzea(), parseInt)));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 350421579) {
                    parseInt = 505974945 ^ parseInt;
                    FOOD = new FilterType(gmpxhoxfbf(gfdkorpzjedojqz(), pcklnlznkoqdzea(), parseInt), (byte) (2092232939 ^ parseInt), gmpxhoxfbf(miwfbtelyvsmjfb(), pcklnlznkoqdzea(), parseInt), List.of(gmpxhoxfbf(wstbgaxyxvpdgoy(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(fbznyianhfalryf(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(uiggymvwrdgnjoe(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(rttuyqqjrdkjdsz(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(qigkapwjdljmxfa(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(bshqggfiftaqeiw(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(ofchtndthlwlwpz(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(asfqtpkhthxitim(), pcklnlznkoqdzea(), parseInt), gmpxhoxfbf(xztrbiibagexxmn(), pcklnlznkoqdzea(), parseInt)));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -442005693) {
                        int i2 = 677495146 ^ parseInt;
                        COMBAT = new FilterType(gmpxhoxfbf(rbyppuxxhmgdbfn(), pcklnlznkoqdzea(), i2), (byte) (1423257990 ^ i2), gmpxhoxfbf(sgodhmkzpmcjsrn(), pcklnlznkoqdzea(), i2), List.of(gmpxhoxfbf(ggfyzdywxjqsfbm(), pcklnlznkoqdzea(), i2), gmpxhoxfbf(uxjwymonkstklde(), pcklnlznkoqdzea(), i2), gmpxhoxfbf(lqbzfexoqjrbywi(), pcklnlznkoqdzea(), i2), gmpxhoxfbf(riopgxieyiwzmga(), pcklnlznkoqdzea(), i2), gmpxhoxfbf(bbluwqdufbhtcxo(), pcklnlznkoqdzea(), i2), gmpxhoxfbf(bymiepyulxtwnwm(), pcklnlznkoqdzea(), i2), gmpxhoxfbf(nvmclsfvawzafxb(), pcklnlznkoqdzea(), i2), gmpxhoxfbf(lrhxjivameovxvm(), pcklnlznkoqdzea(), i2), gmpxhoxfbf(qvnrqfsogrkgvwe(), pcklnlznkoqdzea(), i2)));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1498837998) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1498837998 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (72704719 ^ i2)) {
                                    break;
                                }
                            }
                            int i3 = 1921789480 ^ i2;
                            throw new RuntimeException("double");
                        }
                        i = 1450665672 ^ i2;
                        POTIONS = new FilterType(gmpxhoxfbf(clyotapkcsukjhr(), pcklnlznkoqdzea(), i), (byte) (44193615 ^ i), gmpxhoxfbf(xlccuxzwgpbcxin(), pcklnlznkoqdzea(), i), List.of(gmpxhoxfbf(qfnygyvphfmjdnh(), pcklnlznkoqdzea(), i), gmpxhoxfbf(jebmtjwkxqwqkzb(), pcklnlznkoqdzea(), i), gmpxhoxfbf(anrrflcbdkmvjyb(), pcklnlznkoqdzea(), i), gmpxhoxfbf(mltmdgmukwfgwwm(), pcklnlznkoqdzea(), i), gmpxhoxfbf(annpznzskbzuabb(), pcklnlznkoqdzea(), i), gmpxhoxfbf(qldaodajtzqzhej(), pcklnlznkoqdzea(), i), gmpxhoxfbf(npgidxabjadhwaf(), pcklnlznkoqdzea(), i), gmpxhoxfbf(qbrxuhajphvrftz(), pcklnlznkoqdzea(), i), gmpxhoxfbf(gloxgemlakcnvxt(), pcklnlznkoqdzea(), i)));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 353548880) {
                            i = 114699014 ^ i;
                            BOOKS = new FilterType(gmpxhoxfbf(ggbfsqvzhmkzvjz(), pcklnlznkoqdzea(), i), (byte) (74742858 ^ i), gmpxhoxfbf(lcytgwqxuvgngak(), pcklnlznkoqdzea(), i), List.of(gmpxhoxfbf(yeejzpjdgtbtiyh(), pcklnlznkoqdzea(), i), gmpxhoxfbf(rktyjabkqpqgpsr(), pcklnlznkoqdzea(), i), gmpxhoxfbf(rgvbgcsswmexiyl(), pcklnlznkoqdzea(), i), gmpxhoxfbf(fidjznygrnibaqs(), pcklnlznkoqdzea(), i), gmpxhoxfbf(zdkydlclswxjutq(), pcklnlznkoqdzea(), i), gmpxhoxfbf(ptlhkovhutdhhus(), pcklnlznkoqdzea(), i), gmpxhoxfbf(pwoqdyvwpysofok(), pcklnlznkoqdzea(), i), gmpxhoxfbf(iaxqdcfynriowpm(), pcklnlznkoqdzea(), i), gmpxhoxfbf(zyuhbhcjawtfiud(), pcklnlznkoqdzea(), i)));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 597942880) {
                                int i4 = 1517143422 ^ i;
                                INGREDIENTS = new FilterType(gmpxhoxfbf(ghwwobstpqweiue(), pcklnlznkoqdzea(), i4), (byte) (1578744117 ^ i4), gmpxhoxfbf(btlqmkmwmsepphk(), pcklnlznkoqdzea(), i4), List.of(gmpxhoxfbf(ozpdyjrypvbuull(), pcklnlznkoqdzea(), i4), gmpxhoxfbf(hrhumeqavmlysti(), pcklnlznkoqdzea(), i4), gmpxhoxfbf(izfabdswrzgrrpj(), pcklnlznkoqdzea(), i4), gmpxhoxfbf(zuduzqoyhehwmcy(), pcklnlznkoqdzea(), i4), gmpxhoxfbf(erlhxkifvrxurjq(), pcklnlznkoqdzea(), i4), gmpxhoxfbf(crtfntbwwfpficg(), pcklnlznkoqdzea(), i4), gmpxhoxfbf(quhdwkhqbcuorxa(), pcklnlznkoqdzea(), i4), gmpxhoxfbf(dvqpxmzznusikyl(), pcklnlznkoqdzea(), i4), gmpxhoxfbf(mwzdqlzlbfevadm(), pcklnlznkoqdzea(), i4)));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -254948974) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -254948974 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (74926570 ^ i4)) {
                                            break;
                                        }
                                    }
                                    int i5 = 900281981 ^ i4;
                                    throw new RuntimeException("double");
                                }
                                i = 489735213 ^ i4;
                                UTILITIES = new FilterType(gmpxhoxfbf(boorjbmbcgrlvhf(), pcklnlznkoqdzea(), i), (byte) (1126792471 ^ i), gmpxhoxfbf(wiriqknvvvhckwc(), pcklnlznkoqdzea(), i), List.of(gmpxhoxfbf(nmuwguqnvdypfqi(), pcklnlznkoqdzea(), i), gmpxhoxfbf(puhiufahbwbtjkq(), pcklnlznkoqdzea(), i), gmpxhoxfbf(pzfaplkejhpxdcl(), pcklnlznkoqdzea(), i), gmpxhoxfbf(dkucqsafraghnxk(), pcklnlznkoqdzea(), i), gmpxhoxfbf(mbxrpgsyaolmhsw(), pcklnlznkoqdzea(), i), gmpxhoxfbf(llbfjzisowybeyh(), pcklnlznkoqdzea(), i), gmpxhoxfbf(fblkruqqfyyafwb(), pcklnlznkoqdzea(), i), gmpxhoxfbf(xutejfgvxoukcfd(), pcklnlznkoqdzea(), i), gmpxhoxfbf(jvbjbsbyjgonjik(), pcklnlznkoqdzea(), i)));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 424405242) {
                                    int i6 = 919881117 ^ i;
                                    $VALUES = $values();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 353548880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (536075649 ^ i)) {
                    int i7 = 1379938897 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 424405242 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1905959229 ^ i)) {
                        int i8 = 1718811372 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1501526383 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (224020012 ^ i)) {
                            int i9 = 458778349 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 597942880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1993331196 ^ i)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i10 = 818498509 ^ i;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -23568071 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1659707464 ^ parseInt)) {
                int i11 = 661550285 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1343634413 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (318482658 ^ parseInt)) {
                    int i12 = 572550393 ^ parseInt;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -442005693 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (2034859232 ^ parseInt)) {
                        int i13 = 972118567 ^ parseInt;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 350421579 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (527643325 ^ parseInt)) {
                            break;
                        }
                    }
                }
            }
        }
        int i14 = 143869312 ^ parseInt;
        throw new IllegalAccessException();
    }

    public static String gmpxhoxfbf(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] pcklnlznkoqdzea() {
        return new byte[]{26, 13, 39, 121, 120, 28, 118, 55, 93, 51, 89, 55, 84, 113, 40, 120, 67, 4, 40, 114, 90, 72, 78, 104, 46, 90, 108, 88, 33, 114, 96, 114, 47, 2, 23, 44, 109, 7, 95, 57, 100, 33, 7, 14, 98, 74, 17, 54, 85, 103, 53, 112, 97, 74, 29, 121, 48, 3, 6, 6, 44, 123, 1, 34, Byte.MAX_VALUE, 1, 100, 87, 62, 65, 80, 124, 45, 18, 104, 29, 111, 113, 29, 106, 47, 66, 30, 51, 117, 48, 19, 125, 62, 120, 109, 37, 4, 39, 13, 102, 115, 111, 57, 125, 66, 106, 9, 123, 60, 125, 28, 93, 7, 64, 109, 3};
    }

    private static byte[] ogminvljjxxvxas() {
        return new byte[]{-43, -60, 18, 25, 76, 98, 67, 76, 110, 76, 104, 82};
    }

    private static byte[] ppmebznypibkuii() {
        return new byte[]{-43, -60, 18, 25, 76, 66, 67, 108, 110, 108, 104, 114};
    }

    private static byte[] jqiuxumfxeszfhs() {
        return new byte[]{-43, -60, 18, 107, 76, 75, 99, 33, 110, 32, 104, 64, 97, 41, 28, 37};
    }

    private static byte[] frwbpxeljtbfvnf() {
        return new byte[]{-43, -60, 18, 107, 76, 75, 99, 33, 110, 32, 104, 67, 97, 41, 28, 38, 118, 83, 27, 42, 107, 13};
    }

    private static byte[] wzatnpktbrqhqla() {
        return new byte[]{-43, -60, 18, 107, 76, 14, 67, 51, 110, 48, 104, 103, 97, 124, 28, 113, 118, 6, 59, 99, 107, 94, 123, 8, 26, 4, 89, 3, 18, 45, 81, 55};
    }

    private static byte[] xczafjnshyvujsa() {
        return new byte[]{-43, -60, 18, 107, 76, 75, 99, 33, 110, 32, 104, 71, 97, 42, 28, 38, 118, 84};
    }

    private static byte[] vgntyoljdbhqppm() {
        return new byte[]{-43, -60, 18, 107, 76, 75, 99, 33, 110, 32, 104, 66, 97, 42, 28, 36, 118, 82, 27, 32, 107, 10};
    }

    private static byte[] ygoewyctttyawth() {
        return new byte[]{-43, -60, 18, 107, 76, 75, 99, 33, 110, 32, 104, 81, 97, 42, 28, 61, 118, 89, 27, 46, 107, 16, 123, 47};
    }

    private static byte[] zqzxjrzcprrjmyh() {
        return new byte[]{-43, -60, 18, 107, 76, 75, 99, 33, 110, 32, 104, 67, 97, 42, 28, 38, 118, 91, 27, 50};
    }

    private static byte[] axdwvwytqimzhzv() {
        return new byte[]{-43, -60, 18, 107, 76, 75, 99, 33, 110, 32, 104, 72, 97, 43, 28, 46, 118, 66, 27, 36, 107, 26, 123, 53, 26, 14, 89, 2, 18, 53, 81, 55};
    }

    private static byte[] ttkrcwijdxsyciy() {
        return new byte[]{-43, -60, 18, 107, 76, 75, 99, 33, 110, 32, 104, 84, 97, 49, 28, 32, 118, 92, 27, 40, 107, 10, 123, 53, 26, 14, 89, 31};
    }

    private static byte[] gfdkorpzjedojqz() {
        return new byte[]{-42, -62, 30, 13, 74, 96, 68, 65, 110, 65};
    }

    private static byte[] miwfbtelyvsmjfb() {
        return new byte[]{-42, -62, 30, 13, 74, 64, 68, 97, 110, 97};
    }

    private static byte[] wstbgaxyxvpdgoy() {
        return new byte[]{-42, -62, 30, 109, 74, 73, 100, 44, 110, 37, 107, 70, 109, 47, 26, 39};
    }

    private static byte[] fbznyianhfalryf() {
        return new byte[]{-42, -62, 30, 109, 74, 73, 100, 44, 110, 37, 107, 69, 109, 47, 26, 36, 113, 94, 27, 47, 104, 11};
    }

    private static byte[] uiggymvwrdgnjoe() {
        return new byte[]{-42, -62, 30, 109, 74, 73, 100, 44, 110, 37, 107, 83, 109, 44, 26, 36, 113, 81, 27, 55};
    }

    private static byte[] rttuyqqjrdkjdsz() {
        return new byte[]{-42, -62, 30, 109, 74, 12, 68, 62, 110, 53, 107, 97, 109, 122, 26, 115, 113, 11, 59, 102, 104, 88, 119, 28, 28, 6, 94, 14, 18, 32};
    }

    private static byte[] qigkapwjdljmxfa() {
        return new byte[]{-42, -62, 30, 109, 74, 73, 100, 44, 110, 37, 107, 68, 109, 44, 26, 38, 113, 95, 27, 37, 104, 12};
    }

    private static byte[] bshqggfiftaqeiw() {
        return new byte[]{-42, -62, 30, 109, 74, 73, 100, 44, 110, 37, 107, 87, 109, 44, 26, 63, 113, 84, 27, 43, 104, 22, 119, 41};
    }

    private static byte[] ofchtndthlwlwpz() {
        return new byte[]{-42, -62, 30, 109, 74, 73, 100, 44, 110, 37, 107, 69, 109, 44, 26, 36, 113, 86, 27, 55};
    }

    private static byte[] asfqtpkhthxitim() {
        return new byte[]{-42, -62, 30, 109, 74, 73, 100, 44, 110, 37, 107, 78, 109, 45, 26, 44, 113, 79, 27, 33, 104, 28, 119, 51, 28, 12, 94, 15, 18, 48, 82, 49};
    }

    private static byte[] xztrbiibagexxmn() {
        return new byte[]{-42, -62, 30, 109, 74, 73, 100, 44, 110, 37, 107, 82, 109, 55, 26, 34, 113, 81, 27, 45, 104, 12, 119, 51, 28, 12, 94, 18};
    }

    private static byte[] ggbfsqvzhmkzvjz() {
        return new byte[]{-45, -58, 16, 15, 74, 107, 64, 72, 106, 76, 110, 80};
    }

    private static byte[] lcytgwqxuvgngak() {
        return new byte[]{-45, -58, 16, 15, 74, 75, 64, 104, 106, 108, 110, 112};
    }

    private static byte[] yeejzpjdgtbtiyh() {
        return new byte[]{-45, -58, 16, 107, 74, 66, 96, 37, 106, 39, 110, 66, 102, 37, 30, 36};
    }

    private static byte[] rktyjabkqpqgpsr() {
        return new byte[]{-45, -58, 16, 107, 74, 66, 96, 37, 106, 39, 110, 65, 102, 37, 30, 39, 116, 83, 31, 45, 104, 3};
    }

    private static byte[] rgvbgcsswmexiyl() {
        return new byte[]{-45, -58, 16, 107, 74, 66, 96, 37, 106, 39, 110, 87, 102, 38, 30, 39, 116, 92, 31, 53};
    }

    private static byte[] fidjznygrnibaqs() {
        return new byte[]{-45, -58, 16, 107, 74, 66, 96, 37, 106, 39, 110, 69, 102, 38, 30, 39, 116, 84};
    }

    private static byte[] zdkydlclswxjutq() {
        return new byte[]{-45, -58, 16, 107, 74, 66, 96, 37, 106, 39, 110, 64, 102, 38, 30, 37, 116, 82, 31, 39, 104, 4};
    }

    private static byte[] ptlhkovhutdhhus() {
        return new byte[]{-45, -58, 16, 107, 74, 66, 96, 37, 106, 39, 110, 83, 102, 38, 30, 60, 116, 89, 31, 41, 104, 30, 120, 43};
    }

    private static byte[] pwoqdyvwpysofok() {
        return new byte[]{-45, -58, 16, 107, 74, 7, 64, 55, 106, 55, 110, 101, 102, 112, 30, 112, 116, 6, 63, 100, 104, 80, 120, 26, 25, 1, 91, 3, 19, 33, 86, 49};
    }

    private static byte[] iaxqdcfynriowpm() {
        return new byte[]{-45, -58, 16, 107, 74, 66, 96, 37, 106, 39, 110, 74, 102, 39, 30, 47, 116, 66, 31, 35, 104, 20, 120, 49, 25, 11, 91, 2, 19, 62, 86, 49};
    }

    private static byte[] zyuhbhcjawtfiud() {
        return new byte[]{-45, -58, 16, 107, 74, 66, 96, 37, 106, 39, 110, 86, 102, 61, 30, 33, 116, 92, 31, 47, 104, 4, 120, 49, 25, 11, 91, 31};
    }

    private static byte[] ljgyigzlzsvbnfc() {
        return new byte[]{-36, -54, 17, 11, 77, 97, 70, 74, 107, 72, 97, 74, 100, 23};
    }

    private static byte[] yjsyxinoghsijnp() {
        return new byte[]{-36, -54, 17, 11, 77, 65, 70, 106, 107, 104, 97, 106, 100, 55};
    }

    private static byte[] dzljsqbiyzcqiin() {
        return new byte[]{-36, -54, 17, 111, 77, 75, 102, 39, 107, 43, 97, 64, 100, 40, 25, 36};
    }

    private static byte[] cnjtihankowmmbk() {
        return new byte[]{-36, -54, 17, 111, 77, 14, 70, 53, 107, 59, 97, 103, 100, 125, 25, 112, 113, 4, 48, 104, 108, 88, 123, 27, 30, 4, 90, 15, 25, 39, 80, 44, 30, 65};
    }

    private static byte[] nopzafrbvqrbwak() {
        return new byte[]{-36, -54, 17, 111, 77, 75, 102, 39, 107, 43, 97, 85, 100, 43, 25, 39, 113, 94, 16, 57};
    }

    private static byte[] cikuszlzaavvuxt() {
        return new byte[]{-36, -54, 17, 111, 77, 75, 102, 39, 107, 43, 97, 71, 100, 43, 25, 39, 113, 86};
    }

    private static byte[] zsknojvhztjvovi() {
        return new byte[]{-36, -54, 17, 111, 77, 75, 102, 39, 107, 43, 97, 66, 100, 43, 25, 37, 113, 80, 16, 43, 108, 12};
    }

    private static byte[] fxouopyijkmxozm() {
        return new byte[]{-36, -54, 17, 111, 77, 75, 102, 39, 107, 43, 97, 81, 100, 43, 25, 60, 113, 91, 16, 37, 108, 22, 123, 42};
    }

    private static byte[] tauivnnyuoltsmk() {
        return new byte[]{-36, -54, 17, 111, 77, 75, 102, 39, 107, 43, 97, 67, 100, 43, 25, 39, 113, 89, 16, 57};
    }

    private static byte[] sdbvbgkxduatsal() {
        return new byte[]{-36, -54, 17, 111, 77, 75, 102, 39, 107, 43, 97, 72, 100, 42, 25, 47, 113, 64, 16, 47, 108, 28, 123, 48, 30, 13, 90, 14, 25, 48, 80, 52};
    }

    private static byte[] kwfkykorglrchoo() {
        return new byte[]{-36, -54, 17, 111, 77, 75, 102, 39, 107, 43, 97, 84, 100, 48, 25, 33, 113, 94, 16, 35, 108, 12, 123, 48, 30, 13, 90, 19};
    }

    private static byte[] ghwwobstpqweiue() {
        return new byte[]{-43, -57, 16, 8, 79, 102, 66, 65, 108, 85, 104, 71, 99, 13, 31, 5, 119, 112, 25, 8, 107, 41, 121, 3};
    }

    private static byte[] btlqmkmwmsepphk() {
        return new byte[]{-43, -57, 16, 8, 79, 70, 66, 97, 108, 117, 104, 103, 99, 45, 31, 37, 119, 80, 25, 40, 107, 9, 121, 35};
    }

    private static byte[] ozpdyjrypvbuull() {
        return new byte[]{-43, -57, 16, 103, 79, 78, 98, 36, 108, 39, 104, 67, 99, 37, 31, 32};
    }

    private static byte[] hrhumeqavmlysti() {
        return new byte[]{-43, -57, 16, 103, 79, 78, 98, 36, 108, 39, 104, 64, 99, 37, 31, 35, 119, 86, 25, 45, 107, 14};
    }

    private static byte[] izfabdswrzgrrpj() {
        return new byte[]{-43, -57, 16, 103, 79, 78, 98, 36, 108, 39, 104, 86, 99, 38, 31, 35, 119, 89, 25, 53};
    }

    private static byte[] zuduzqoyhehwmcy() {
        return new byte[]{-43, -57, 16, 103, 79, 78, 98, 36, 108, 39, 104, 68, 99, 38, 31, 35, 119, 81};
    }

    private static byte[] erlhxkifvrxurjq() {
        return new byte[]{-43, -57, 16, 103, 79, 78, 98, 36, 108, 39, 104, 65, 99, 38, 31, 33, 119, 87, 25, 39, 107, 9};
    }

    private static byte[] crtfntbwwfpficg() {
        return new byte[]{-43, -57, 16, 103, 79, 78, 98, 36, 108, 39, 104, 82, 99, 38, 31, 56, 119, 92, 25, 41, 107, 19, 121, 35};
    }

    private static byte[] quhdwkhqbcuorxa() {
        return new byte[]{-43, -57, 16, 103, 79, 78, 98, 36, 108, 39, 104, 64, 99, 38, 31, 35, 119, 94, 25, 53};
    }

    private static byte[] dvqpxmzznusikyl() {
        return new byte[]{-43, -57, 16, 103, 79, 11, 66, 54, 108, 55, 104, 100, 99, 112, 31, 116, 119, 3, 57, 100, 107, 93, 121, 25, 25, 0, 88, 14, 16, 52, 81, 34, 24, 94, 32, 113, 89, 83, 110, 99, 85, 96, 48, 69};
    }

    private static byte[] mwzdqlzlbfevadm() {
        return new byte[]{-43, -57, 16, 103, 79, 78, 98, 36, 108, 39, 104, 87, 99, 61, 31, 37, 119, 89, 25, 47, 107, 9, 121, 57, 25, 11, 88, 26};
    }

    private static byte[] boorjbmbcgrlvhf() {
        return new byte[]{-43, -61, 21, 26, 79, 113, 68, 74, 106, 70, 104, 79, 102, 19, 31, 8, 113, 117, 31, 24};
    }

    private static byte[] wiriqknvvvhckwc() {
        return new byte[]{-43, -61, 21, 26, 79, 81, 68, 106, 106, 102, 104, 111, 102, 51, 31, 40, 113, 85, 31, 56};
    }

    private static byte[] nmuwguqnvdypfqi() {
        return new byte[]{-43, -61, 21, 105, 79, 67, 100, 33, 106, 42, 104, 71, 102, 43, 31, 45};
    }

    private static byte[] puhiufahbwbtjkq() {
        return new byte[]{-43, -61, 21, 105, 79, 67, 100, 33, 106, 42, 104, 68, 102, 43, 31, 46, 113, 83, 31, 32, 107, 10};
    }

    private static byte[] pzfaplkejhpxdcl() {
        return new byte[]{-43, -61, 21, 105, 79, 67, 100, 33, 106, 42, 104, 82, 102, 40, 31, 46, 113, 92, 31, 56};
    }

    private static byte[] dkucqsafraghnxk() {
        return new byte[]{-43, -61, 21, 105, 79, 67, 100, 33, 106, 42, 104, 64, 102, 40, 31, 46, 113, 84};
    }

    private static byte[] mbxrpgsyaolmhsw() {
        return new byte[]{-43, -61, 21, 105, 79, 67, 100, 33, 106, 42, 104, 69, 102, 40, 31, 44, 113, 82, 31, 42, 107, 13};
    }

    private static byte[] llbfjzisowybeyh() {
        return new byte[]{-43, -61, 21, 105, 79, 67, 100, 33, 106, 42, 104, 86, 102, 40, 31, 53, 113, 89, 31, 36, 107, 23, 124, 45};
    }

    private static byte[] fblkruqqfyyafwb() {
        return new byte[]{-43, -61, 21, 105, 79, 67, 100, 33, 106, 42, 104, 68, 102, 40, 31, 46, 113, 91, 31, 56};
    }

    private static byte[] xutejfgvxoukcfd() {
        return new byte[]{-43, -61, 21, 105, 79, 67, 100, 33, 106, 42, 104, 79, 102, 41, 31, 38, 113, 66, 31, 46, 107, 29, 124, 55, 25, 6, 94, 2, 22, 63, 81, 48};
    }

    private static byte[] jvbjbsbyjgonjik() {
        return new byte[]{-43, -61, 21, 105, 79, 6, 68, 51, 106, 58, 104, 96, 102, 126, 31, 121, 113, 6, 63, 105, 107, 89, 124, 11, 25, 23, 94, 5, 22, 39, 81, 42, 29, 64, 32, 124, 95, 86, 104, 115};
    }

    private static byte[] potahxklcfwlzrg() {
        return new byte[]{-43, -62, 16, 8, 79, 105, 67, 67};
    }

    private static byte[] vdqjimvwahzehow() {
        return new byte[]{-43, -62, 16, 8, 79, 73, 67, 99};
    }

    private static byte[] xrwuhgusuvetaaz() {
        return new byte[]{-43, -62, 16, 111, 79, 6, 67, 63, 108, 54, 104, 97, 99, 120, 31, 121, 118, 10, 57, 101, 107, 88, 121, 25, 25, 15, 89, 12};
    }

    private static byte[] dtorxzjxjkglvgj() {
        return new byte[]{-43, -62, 16, 111, 79, 67, 99, 45, 108, 38, 104, 69, 99, 45, 31, 46, 118, 95, 25, 44, 107, 11};
    }

    private static byte[] nzzcdmrnkbgirhj() {
        return new byte[]{-43, -62, 16, 111, 79, 67, 99, 45, 108, 38, 104, 83, 99, 46, 31, 46, 118, 80, 25, 52};
    }

    private static byte[] rslooztpfvcywvk() {
        return new byte[]{-43, -62, 16, 111, 79, 67, 99, 45, 108, 38, 104, 65, 99, 46, 31, 46, 118, 88};
    }

    private static byte[] abfnzinjcsdgkyn() {
        return new byte[]{-43, -62, 16, 111, 79, 67, 99, 45, 108, 38, 104, 68, 99, 46, 31, 44, 118, 94, 25, 38, 107, 12};
    }

    private static byte[] otxafkmnyhxlifc() {
        return new byte[]{-43, -62, 16, 111, 79, 67, 99, 45, 108, 38, 104, 87, 99, 46, 31, 53, 118, 85, 25, 40, 107, 22, 121, 43};
    }

    private static byte[] stxzzorodfahzsk() {
        return new byte[]{-43, -62, 16, 111, 79, 67, 99, 45, 108, 38, 104, 69, 99, 46, 31, 46, 118, 87, 25, 52};
    }

    private static byte[] tccpinxsuccdgrp() {
        return new byte[]{-43, -62, 16, 111, 79, 67, 99, 45, 108, 38, 104, 78, 99, 47, 31, 38, 118, 78, 25, 34, 107, 28, 121, 49, 25, 6, 89, 14, 16, 51, 81, 49};
    }

    private static byte[] eyoknqpfkqxsuxx() {
        return new byte[]{-43, -62, 16, 111, 79, 67, 99, 45, 108, 38, 104, 82, 99, 53, 31, 40, 118, 80, 25, 46, 107, 12, 121, 49, 25, 6, 89, 19};
    }

    private static byte[] rbyppuxxhmgdbfn() {
        return new byte[]{-43, -58, 21, 9, 74, 102, 65, 67, 101, 71, 104, 66, 102, 22};
    }

    private static byte[] sgodhmkzpmcjsrn() {
        return new byte[]{-43, -58, 21, 9, 74, 70, 65, 99, 101, 103, 104, 98, 102, 54};
    }

    private static byte[] ggfyzdywxjqsfbm() {
        return new byte[]{-43, -58, 21, 108, 74, 79, 97, 44, 101, 37, 104, 66, 102, 46, 26, 33};
    }

    private static byte[] uxjwymonkstklde() {
        return new byte[]{-43, -58, 21, 108, 74, 79, 97, 44, 101, 37, 104, 65, 102, 46, 26, 34, 116, 94, 16, 47, 107, 15};
    }

    private static byte[] lqbzfexoqjrbywi() {
        return new byte[]{-43, -58, 21, 108, 74, 79, 97, 44, 101, 37, 104, 87, 102, 45, 26, 34, 116, 81, 16, 55};
    }

    private static byte[] riopgxieyiwzmga() {
        return new byte[]{-43, -58, 21, 108, 74, 79, 97, 44, 101, 37, 104, 69, 102, 45, 26, 34, 116, 89};
    }

    private static byte[] bbluwqdufbhtcxo() {
        return new byte[]{-43, -58, 21, 108, 74, 10, 65, 62, 101, 53, 104, 101, 102, 123, 26, 117, 116, 11, 48, 102, 107, 92, 124, 24, 28, 0, 91, 12, 25, 38, 81, 39, 29, 69};
    }

    private static byte[] bymiepyulxtwnwm() {
        return new byte[]{-43, -58, 21, 108, 74, 79, 97, 44, 101, 37, 104, 83, 102, 45, 26, 57, 116, 84, 16, 43, 107, 18, 124, 40};
    }

    private static byte[] nvmclsfvawzafxb() {
        return new byte[]{-43, -58, 21, 108, 74, 79, 97, 44, 101, 37, 104, 65, 102, 45, 26, 34, 116, 86, 16, 55};
    }

    private static byte[] lrhxjivameovxvm() {
        return new byte[]{-43, -58, 21, 108, 74, 79, 97, 44, 101, 37, 104, 74, 102, 44, 26, 42, 116, 79, 16, 33, 107, 24, 124, 50, 28, 10, 91, 15, 25, 48, 81, 53};
    }

    private static byte[] qvnrqfsogrkgvwe() {
        return new byte[]{-43, -58, 21, 108, 74, 79, 97, 44, 101, 37, 104, 86, 102, 54, 26, 36, 116, 81, 16, 45, 107, 8, 124, 50, 28, 10, 91, 18};
    }

    private static byte[] clyotapkcsukjhr() {
        return new byte[]{-48, -58, 22, 16, 75, 101, 71, 83, 105, 78, 104, 65, 103, 9, 25, 27};
    }

    private static byte[] xlccuxzwgpbcxin() {
        return new byte[]{-48, -58, 22, 16, 75, 69, 71, 115, 105, 110, 104, 97, 103, 41, 25, 59};
    }

    private static byte[] qfnygyvphfmjdnh() {
        return new byte[]{-48, -58, 22, 102, 75, 76, 103, 37, 105, 39, 104, 79, 103, 43, 25, 36};
    }

    private static byte[] jebmtjwkxqwqkzb() {
        return new byte[]{-48, -58, 22, 102, 75, 76, 103, 37, 105, 39, 104, 76, 103, 43, 25, 39, 119, 83, 25, 32, 105, 13};
    }

    private static byte[] anrrflcbdkmvjyb() {
        return new byte[]{-48, -58, 22, 102, 75, 76, 103, 37, 105, 39, 104, 90, 103, 40, 25, 39, 119, 92, 25, 56};
    }

    private static byte[] mltmdgmukwfgwwm() {
        return new byte[]{-48, -58, 22, 102, 75, 76, 103, 37, 105, 39, 104, 72, 103, 40, 25, 39, 119, 84};
    }

    private static byte[] annpznzskbzuabb() {
        return new byte[]{-48, -58, 22, 102, 75, 76, 103, 37, 105, 39, 104, 77, 103, 40, 25, 37, 119, 82, 25, 42, 105, 10};
    }

    private static byte[] qldaodajtzqzhej() {
        return new byte[]{-48, -58, 22, 102, 75, 9, 71, 55, 105, 55, 104, 104, 103, 126, 25, 112, 119, 6, 57, 105, 105, 94, Byte.MAX_VALUE, 8, 26, 1, 93, 21, 18, 45, 81, 45, 27, 88, 38, 102};
    }

    private static byte[] npgidxabjadhwaf() {
        return new byte[]{-48, -58, 22, 102, 75, 76, 103, 37, 105, 39, 104, 76, 103, 40, 25, 39, 119, 91, 25, 56};
    }

    private static byte[] qbrxuhajphvrftz() {
        return new byte[]{-48, -58, 22, 102, 75, 76, 103, 37, 105, 39, 104, 71, 103, 41, 25, 47, 119, 66, 25, 46, 105, 26, Byte.MAX_VALUE, 49, 26, 11, 93, 15, 18, 48, 81, 49};
    }

    private static byte[] gloxgemlakcnvxt() {
        return new byte[]{-48, -58, 22, 102, 75, 76, 103, 37, 105, 39, 104, 91, 103, 51, 25, 33, 119, 92, 25, 34, 105, 10, Byte.MAX_VALUE, 49, 26, 11, 93, 18};
    }

    private static int kkpfdmoyokhxtjot(int i, int i2) {
        return i ^ i2;
    }
}
