package com.kammoun.donutCore.api.utils.items;

import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.Generated;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

public class KItem {
    private final ItemStack itemStack;
    private ItemMeta meta;
    private final Map<String, Object> nbtTags;
    private final JavaPlugin plugin;
    private Integer slot;
    private double price;
    private List<String> clickCommands;
    private String permission;
    private CommandType commandType;
    private static int p9FiwNf0tv = 0;

    private transient int f13777zYo8SEG = 1251587999;
    private static byte[] nhzdwtxtdf;
    private static String[] nothing_to_see_here = new String[17];

    static class AnonymousClass1 {
        static final int[] $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType;
        private static int dS6rnDHCvF = 0;
        private transient int ocbTzJynzC = 761783819;
        private static String[] nothing_to_see_here = new String[15];

        static {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.KItem.AnonymousClass1.m43clinit():void");
        }

        public static String jpfccljpsx(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] omhbohiadrgawjn() {
            return new byte[]{82, 3, 43, 35, 40, 34, 82, 75, 115, 80, 74, 66, 80, 48, 107, 34, 25, 50, 32, 29, 22, 114, 22, 108, 19, 32, 73, 104, 120, 102, 126, 110, 51, 40, 107, 13, 13, 82, 27, 125, 47, 3, 97, 37, 85, 102, 59, 15, 20, 95, 32, 9, 64, 108, 3, 94, 117, 101, 41, 26, 42, 45, 98, 27, 9, 79, 45, 82, 39, 59, 31, 120, 88, 117, 84, 90, 11, 90, 104, 69, 34, 79, 108, 60, 35, 11, 5, 38, 31, 34, 44, 12, 60, 70, Byte.MAX_VALUE, 52, 98, 14, 1, 126, 26, 51, 68, 50, 5, 82, 105, 89, 72, 125, 5, 114, 102, 123, 26, 112, 8, 10, 19, 33, 9, 25, 5};
        }

        private static int dgjbqnttspbeloxw(int i, int i2) {
            return i ^ i2;
        }
    }

    public static final class CommandType {
        public static final CommandType PLAYER;
        public static final CommandType CONSOLE;
        public static final CommandType BUNGEE;
        private static final CommandType[] $VALUES;
        private static String hexeuowdyq;

        public static CommandType[] values() {
            int i = 1493570503 ^ (70686119 ^ (1583472121 ^ 1910116796));
            return (CommandType[]) $VALUES.clone();
        }

        public static CommandType valueOf(String str) {
            int i = 1590695429 ^ (2106920304 ^ 1910116796);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1795664310) {
                int i2 = 1584346275 ^ i;
                return (CommandType) Enum.valueOf(CommandType.class, str);
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1736569680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (167792198 ^ i)) {
                    int i3 = 1131975680 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1795664310 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1276540596 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 265419964 ^ i;
            throw new IOException();
        }

        private CommandType(java.lang.String r5, int r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.KItem.CommandType.<init>(java.lang.String, int):void");
        }

        public static Optional<CommandType> fromString(String str) {
            int i = 1805496692 ^ (948485555 ^ 1910116796);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 377023449) {
                i = 1189893085 ^ i;
                if (str != null) {
                    int vidfevwfpoulzqlc = vidfevwfpoulzqlc(i, 1971057427);
                    int i2 = vidfevwfpoulzqlc;
                    try {
                        Optional<CommandType> of = Optional.of(valueOf(str.toUpperCase()));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1966740056) {
                            i2 = 1315962900 ^ i2;
                            return of;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -112857846 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (867445659 ^ i2)) {
                                int i3 = 1746407424 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1966740056 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1859817357 ^ i2)) {
                                    break;
                                }
                            }
                        }
                        int i4 = 1062988218 ^ i2;
                        throw new IllegalAccessException("double");
                    } catch (IllegalArgumentException e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case -1966740056:
                                int vidfevwfpoulzqlc2 = vidfevwfpoulzqlc(i2, 1477829721);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(vidfevwfpoulzqlc2) == 1248513890) {
                                    int i5 = 1992478436 ^ vidfevwfpoulzqlc2;
                                    return Optional.empty();
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(vidfevwfpoulzqlc2) == 1248513890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(vidfevwfpoulzqlc2) == (678828414 ^ vidfevwfpoulzqlc2)) {
                                        int i6 = 1859802712 ^ vidfevwfpoulzqlc2;
                                        throw new RuntimeException("double");
                                    }
                                }
                                break;
                            default:
                                throw new IOException("Error in hash");
                        }
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 555382067) {
                    int i7 = 1379971980 ^ i;
                    return Optional.empty();
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 377023449 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1967827331 ^ i)) {
                    int i8 = 1213357047 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1289754287 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (208405550 ^ i)) {
                        int i9 = 1585678351 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 555382067 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1830793710 ^ i)) {
                            break;
                        }
                    }
                }
            }
            int i10 = 159491960 ^ i;
            throw new IllegalAccessException();
        }

        private static CommandType[] $values() {
            int i = 449234941 ^ (1155294800 ^ (1903347372 ^ 1910116796));
            CommandType[] commandTypeArr = new CommandType[(byte) (1588754110 ^ i)];
            commandTypeArr[(byte) (1588754109 ^ i)] = PLAYER;
            commandTypeArr[(byte) (1588754108 ^ i)] = CONSOLE;
            commandTypeArr[(byte) (1588754111 ^ i)] = BUNGEE;
            return commandTypeArr;
        }

        static {
            int parseInt = 1957284686 ^ (349984344 ^ Integer.parseInt("955251066"));
            hexeuowdyq = ByteBuffer.wrap(extqalmfgbvbnid()).asCharBuffer().toString();
            int i = 578234279 ^ parseInt;
            PLAYER = new CommandType(fpfglivvba(ioqerefyoynzvfs(), i), (byte) (2062369739 ^ i));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -680911269) {
                i = 1891543000 ^ i;
                CONSOLE = new CommandType(fpfglivvba(qvirwdalueryysc(), i), (byte) (173270034 ^ i));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1386160280) {
                    i = 446376734 ^ i;
                    BUNGEE = new CommandType(fpfglivvba(cmhkxmgrrzejdtq(), i), (byte) (281595663 ^ i));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2042202008) {
                        int i2 = 1844801769 ^ i;
                        $VALUES = $values();
                        return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1386160280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (123003717 ^ i)) {
                    int i3 = 242265624 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2042202008 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (652680903 ^ i)) {
                        int i4 = 652624367 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -680911269 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (773889811 ^ i)) {
                            break;
                        }
                    }
                }
            }
            int i5 = 1568762048 ^ i;
            throw new IllegalAccessException();
        }

        public static String fpfglivvba(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = hexeuowdyq.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

        private static byte[] ioqerefyoynzvfs() {
            return new byte[]{0, 0, 0, 6, 0, 0, 0, 0};
        }

        private static byte[] cmhkxmgrrzejdtq() {
            return new byte[]{0, 0, 0, 6, 0, 0, 0, 6};
        }

        private static byte[] qvirwdalueryysc() {
            return new byte[]{0, 0, 0, 7, 0, 0, 0, 12};
        }

        private static byte[] extqalmfgbvbnid() {
            return new byte[]{50, 96, 54, 126, 51, 119, 57, 110, 51, 124, 50, 98, 50, 122, 49, 96, 57, 123, 54, 113, 49, 119, 56, 116, 49, 116, 51, 125, 55, 126, 48, 96, 53, 126, 55, Byte.MAX_VALUE, 50, 114};
        }

        private static int vidfevwfpoulzqlc(int i, int i2) {
            return i2 ^ i;
        }
    }

    @NotNull
    public static ItemStack multiplyItemStack(ItemStack itemStack, int i) {
        int i2 = 1590305419 ^ (394265062 ^ 1005064258);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1794008709) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1794008709 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1299988891 ^ i2)) {
                    break;
                }
            }
            int i3 = 1364852223 ^ i2;
            throw new IOException("double");
        }
        int i4 = 784040004 ^ i2;
        ItemStack clone = itemStack.clone();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -523396262) {
            i4 = 556303830 ^ i4;
            clone.setAmount(i);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -376850965) {
                int i5 = 124059170 ^ i4;
                return clone;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -760331013 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1870786883 ^ i4)) {
                int i6 = 2033991319 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -523396262 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1274702544 ^ i4)) {
                    int i7 = 1336651163 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -376850965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (656887083 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1177553476 ^ i4;
        throw new IOException();
    }

    public KItem(org.bukkit.Material r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.KItem.<init>(org.bukkit.Material, int):void");
    }

    public KItem(JavaPlugin javaPlugin, Material material, int i) {
        xnlkuihuurrzxwwx(1970334453 ^ 619302329, 1305606421);
        int parseInt = 415521252 ^ (651287050 ^ Integer.parseInt("576544183"));
        this.f13777zYo8SEG = 1251587999 ^ p9FiwNf0tv;
        this.nbtTags = new HashMap();
        this.price = 0.0d;
        this.clickCommands = new ArrayList();
        this.commandType = CommandType.PLAYER;
        this.plugin = javaPlugin;
        this.itemStack = new ItemStack(material);
        this.meta = this.itemStack.getItemMeta();
        int i2 = 1195946475 ^ (737058372 ^ (1359715679 ^ (957646494 ^ (641205395 ^ (37035980 ^ (1360485858 ^ (1015062391 ^ (708192774 ^ parseInt))))))));
    }

    public KItem(ItemStack itemStack, int i) {
        this((JavaPlugin) null, itemStack, 484901997);
        int i2 = 1768455084 ^ 280610345;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 201729760:
                    int i3 = 1768372119 ^ i2;
                    break;
                case 662685783:
                    break;
                case 1896386140:
                case 2040145238:
                default:
                    throw new IllegalAccessException();
            }
        }
        int parseInt = 234911336 ^ (1022075341 ^ Integer.parseInt("576544183"));
        this.f13777zYo8SEG = 1251587999 ^ p9FiwNf0tv;
        int i4 = 1045492837 ^ (774625478 ^ parseInt);
    }

    public KItem(JavaPlugin javaPlugin, ItemStack itemStack, int i) {
        xnlkuihuurrzxwwx(887456700 ^ 124549399, 331996915);
        int parseInt = 834771376 ^ (870113375 ^ Integer.parseInt("576544183"));
        this.f13777zYo8SEG = 1251587999 ^ p9FiwNf0tv;
        int xnlkuihuurrzxwwx = 1653465547 ^ xnlkuihuurrzxwwx(parseInt, 1388012487);
        this.nbtTags = new HashMap();
        this.price = 0.0d;
        this.clickCommands = new ArrayList();
        this.commandType = CommandType.PLAYER;
        this.plugin = javaPlugin;
        this.itemStack = itemStack.clone();
        this.meta = this.itemStack.getItemMeta();
        int i2 = 1094714130 ^ (1579733398 ^ (1681839047 ^ (1731422317 ^ (1944648248 ^ (894560156 ^ (1203799207 ^ xnlkuihuurrzxwwx))))));
    }

    public boolean hasPermission(Player player) {
        int i = 1201592948 ^ (1060592909 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 1321272608) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1321272608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (697819139 ^ i)) {
                    int i2 = 248413587 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 556317920 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1261341699 ^ i)) {
                        break;
                    }
                }
            }
            int i3 = 218282833 ^ i;
            throw new RuntimeException("double");
        }
        int i4 = 1588770234 ^ i;
        if (this.permission != null) {
            i4 = xnlkuihuurrzxwwx(i4, 494882682);
            if (this.permission.isEmpty() == (1242946148 ^ i4)) {
                int i5 = 2012821209 ^ i4;
                return player.hasPermission(this.permission);
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1353634594) {
                return (byte) (2091173113 ^ (917577372 ^ i4));
            }
        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1152079630) {
            return (byte) (69539741 ^ (1397719682 ^ i4));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1353634594 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (89504776 ^ i4)) {
                int i6 = 2024755246 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1152079630 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1711128182 ^ i4)) {
                    int i7 = 447193116 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -278436375 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (701988999 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1149693003 ^ i4;
        throw new RuntimeException();
    }

    public com.kammoun.donutCore.api.utils.items.KItem name(java.lang.String r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.KItem.name(java.lang.String, int):com.kammoun.donutCore.api.utils.items.KItem");
    }

    public KItem amount(int i, int i2) {
        int i3 = 194598822 ^ (1302100836 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1146857223) {
            i3 = 2041336547 ^ i3;
            this.itemStack.setAmount(i);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1992740834) {
                int i4 = 1449771360 ^ i3;
                return this;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1992740834 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (374023862 ^ i3)) {
                int i5 = 42649889 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1146857223 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (578309022 ^ i3)) {
                    int i6 = 1001797050 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -980892448 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (596209581 ^ i3)) {
                        break;
                    }
                }
            }
        }
        int i7 = 52874959 ^ i3;
        throw new RuntimeException();
    }

    public KItem lore(List list, int i) {
        int i2 = 504926247 ^ (1123550738 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1820954433) {
            i2 = 277469629 ^ i2;
            if (list != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -389594455) {
                    i2 = 176392955 ^ i2;
                    if (list.isEmpty() == (932930222 ^ i2)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1126492815) {
                            i2 = 925698263 ^ i2;
                            if (this.meta == null) {
                                xnlkuihuurrzxwwx(i2, 1564612971);
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 95638472) {
                                i2 = 1902960715 ^ i2;
                                ItemMeta itemMeta = this.meta;
                                Stream stream = list.stream();
                                Function function = ChatFormater::color;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1898688109) {
                                    int i3 = 844923499 ^ i2;
                                    Stream map = stream.map(function);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 472924874) {
                                        int i4 = 2072551463 ^ i3;
                                        List list2 = (List) map.collect(Collectors.toList());
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1066056719) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1066056719 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (751996442 ^ i4)) {
                                                    break;
                                                }
                                            }
                                            int i5 = 254093247 ^ i4;
                                            throw new IllegalAccessException("double");
                                        }
                                        i3 = 1751194574 ^ i4;
                                        itemMeta.setLore(list2);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2088919678) {
                                            int i6 = 228311202 ^ i3;
                                        }
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 472924874 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (311962147 ^ i3)) {
                                            int i7 = 1338323564 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2088919678 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (736962180 ^ i3)) {
                                                break;
                                            }
                                        }
                                    }
                                    int i8 = 472619742 ^ i3;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                            case 196950186:
                                int i9 = 1785663932 ^ i2;
                                break;
                            case 373042529:
                                break;
                            case 1105481027:
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -389594455 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1118306913 ^ i2)) {
                        int i10 = 1164068209 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -274491246 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1048755091 ^ i2)) {
                            int i11 = 1287220896 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1898688109 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1673488065 ^ i2)) {
                                int i12 = 1927779997 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1126492815 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (714953936 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                int i13 = 1217035351 ^ i2;
                throw new IllegalAccessException();
            }
            int i14 = 1626118983 ^ i2;
            return this;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1820954433 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (179532367 ^ i2)) {
                int i15 = 2065928400 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 95638472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (190503722 ^ i2)) {
                    int i16 = 467900190 ^ i2;
                    throw new RuntimeException("double");
                }
            }
        }
    }

    public KItem permission(String str, int i) {
        int i2 = 2116431598 ^ (1069482840 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2025565351) {
            i2 = 1768157850 ^ i2;
            this.permission = str;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -866400374) {
                int i3 = 1474284036 ^ i2;
                return this;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2025565351 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (422371809 ^ i2)) {
                int i4 = 2133539228 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1923454888 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1071238959 ^ i2)) {
                    int i5 = 2070753688 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -866400374 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (391831505 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 392734423 ^ i2;
        throw new IOException();
    }

    public KItem commandType(CommandType commandType) {
        int i = 1212507204 ^ (594536101 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -757519904) {
            i = 532597658 ^ i;
            this.commandType = commandType;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 791639344) {
                int i2 = 750580896 ^ i;
                return this;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 791639344 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1429510631 ^ i)) {
                int i3 = 664883635 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -757519904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (517491752 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1286397635 ^ i;
        throw new RuntimeException();
    }

    public KItem lore(String[] strArr, int i) {
        int i2 = 1237197583 ^ (340370637 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1680933113) {
            int i3 = 418325760 ^ i2;
            return lore(Arrays.asList(strArr), 882542907);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1680933113 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (877837209 ^ i2)) {
                int i4 = 292836776 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1555552007 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (404550786 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1680212172 ^ i2;
        throw new IllegalAccessException();
    }

    public KItem damage(int i, int i2) {
        int i3 = 2046748278 ^ (470244251 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1539255936) {
            i3 = 40952596 ^ i3;
            if ((this.meta instanceof Damageable) == (385415460 ^ i3)) {
                xnlkuihuurrzxwwx(i3, 1891948758);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1211643616) {
                i3 = 1079744737 ^ i3;
                this.meta.setDamage(i);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1256518102) {
                    int i4 = 815743031 ^ i3;
                }
            }
            return this;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1256518102 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1819605899 ^ i3)) {
                int i5 = 1447141171 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 836833171 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (951802798 ^ i3)) {
                    int i6 = 1579115218 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1539255936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (190528454 ^ i3)) {
                        int i7 = 729400110 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1211643616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2062851317 ^ i3)) {
                            break;
                        }
                    }
                }
            }
        }
        int i8 = 1023236476 ^ i3;
        throw new RuntimeException();
    }

    public KItem enchant(Enchantment enchantment, int i, int i2) {
        int i3 = 240419907 ^ (190043729 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1548243333) {
            i3 = 865365376 ^ i3;
            if (this.meta == null) {
                xnlkuihuurrzxwwx(i3, 1622603317);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1058325114) {
                i3 = 1181070881 ^ i3;
                this.meta.addEnchant(enchantment, i, (byte) (25636463 ^ i3));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 205091696) {
                    int i4 = 651378708 ^ i3;
                }
            }
            return this;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1058325114 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (449663006 ^ i3)) {
                int i5 = 982398466 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 983790545 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (272599995 ^ i3)) {
                    int i6 = 1181574598 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1548243333 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (959725396 ^ i3)) {
                        int i7 = 1119041219 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 205091696 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (202957224 ^ i3)) {
                            break;
                        }
                    }
                }
            }
        }
        int i8 = 73809695 ^ i3;
        throw new IOException();
    }

    public com.kammoun.donutCore.api.utils.items.KItem flag(org.bukkit.inventory.ItemFlag[] r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.KItem.flag(org.bukkit.inventory.ItemFlag[], int):com.kammoun.donutCore.api.utils.items.KItem");
    }

    public com.kammoun.donutCore.api.utils.items.KItem glow(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.KItem.glow(int):com.kammoun.donutCore.api.utils.items.KItem");
    }

    public KItem unbreakable(boolean z, int i) {
        int i2 = 1424531775 ^ (246115233 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1502833177) {
            i2 = 840663781 ^ i2;
            if (this.meta == null) {
                xnlkuihuurrzxwwx(i2, 47964110);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -917537488) {
                i2 = 1684746532 ^ i2;
                this.meta.setUnbreakable(z);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -367594477) {
                    int i3 = 1722871530 ^ i2;
                }
            }
            return this;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -917537488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1719584285 ^ i2)) {
                int i4 = 1523153049 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -367594477 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1206572981 ^ i2)) {
                    int i5 = 1615041022 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1502833177 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1063338281 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1050873829 ^ i2;
        throw new RuntimeException();
    }

    public KItem modelData(int i, int i2) {
        int i3 = 505651455 ^ (1170743857 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1422993561) {
            i3 = 190581264 ^ i3;
            if (this.meta == null) {
                int i4 = 985140078 ^ i3;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 238123033) {
                i3 = 167745589 ^ i3;
                this.meta.setCustomModelData(Integer.valueOf(i));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1104001457) {
                    int i5 = 860328795 ^ i3;
                }
            }
            return this;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1422993561 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1115575315 ^ i3)) {
                int i6 = 118382273 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 238123033 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (89137972 ^ i3)) {
                    int i7 = 560426690 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1104001457 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1998155515 ^ i3)) {
                        int i8 = 1522826054 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -604953752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (679945686 ^ i3)) {
                            break;
                        }
                    }
                }
            }
        }
        int i9 = 1125135829 ^ i3;
        throw new IllegalAccessException();
    }

    public KItem price(double d, int i) {
        int i2 = 2095363841 ^ (1568738450 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -2136939918) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2136939918 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1502658799 ^ i2)) {
                    int i3 = 141091715 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 575983779 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1698442407 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 1953242660 ^ i2;
            throw new RuntimeException();
        }
        int i5 = 2136131435 ^ i2;
        this.price = d;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2050414889) {
            int i6 = 1259094321 ^ i5;
            return this;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2050414889 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (662379741 ^ i5)) {
                break;
            }
        }
        int i7 = 709508542 ^ i5;
        throw new IllegalAccessException("double");
    }

    public KItem commands(List list, int i) {
        int i2 = 501745693 ^ (1493633298 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1393215855) {
            i2 = 759120888 ^ i2;
            this.clickCommands = list;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -988862128) {
                int i3 = 181378153 ^ i2;
                return this;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1821128168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1414573339 ^ i2)) {
                int i4 = 212996893 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1393215855 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (441273942 ^ i2)) {
                    int i5 = 162192199 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -988862128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (939932556 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 340507177 ^ i2;
        throw new RuntimeException();
    }

    public KItem commands(String... strArr) {
        int i = 1208059373 ^ (555883375 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1030632712) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1030632712 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1423135606 ^ i)) {
                    break;
                }
            }
            int i2 = 795521510 ^ i;
            throw new RuntimeException("double");
        }
        int i3 = 1048460023 ^ i;
        this.clickCommands = new ArrayList(Arrays.asList(strArr));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 828382529) {
            int i4 = 192900600 ^ i3;
            return this;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1788572289 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (941860495 ^ i3)) {
                int i5 = 1770152121 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 828382529 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1839662063 ^ i3)) {
                    break;
                }
            }
        }
        int i6 = 1593277265 ^ i3;
        throw new IllegalAccessException();
    }

    public com.kammoun.donutCore.api.utils.items.KItem skullOwner(java.lang.String r6, org.bukkit.plugin.java.JavaPlugin r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.KItem.skullOwner(java.lang.String, org.bukkit.plugin.java.JavaPlugin, int):com.kammoun.donutCore.api.utils.items.KItem");
    }

    public com.kammoun.donutCore.api.utils.items.KItem texture(java.lang.String r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.KItem.texture(java.lang.String, int):com.kammoun.donutCore.api.utils.items.KItem");
    }

    public KItem armorColor(Color color, int i) {
        int i2 = 634784255 ^ (1723105681 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1868989031) {
            i2 = 211932294 ^ i2;
            if ((this.meta instanceof LeatherArmorMeta) != (1051917109 ^ i2)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -174597719) {
                    i2 = 2104546088 ^ i2;
                    this.meta.setColor(color);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 504447210) {
                        int i3 = 860520360 ^ i2;
                        return this;
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 104603636:
                        break;
                    case 159053828:
                        int i4 = 1312468096 ^ i2;
                        break;
                    case 765751945:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 504447210 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1147300690 ^ i2)) {
                int i5 = 1044862818 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1868989031 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1283374393 ^ i2)) {
                    int i6 = 1288149688 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2076000853 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1281397799 ^ i2)) {
                        int i7 = 499313152 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -174597719 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1788351620 ^ i2)) {
                            int i8 = 367291514 ^ i2;
                            throw new IOException();
                        }
                    }
                }
            }
        }
    }

    public KItem potionEffect(PotionEffectType potionEffectType, int i, int i2, int i3) {
        int i4 = 198402854 ^ (787063161 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1571083246) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1571083246 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1684847226 ^ i4)) {
                    break;
                }
            }
            int i5 = 2100501289 ^ i4;
            throw new RuntimeException("double");
        }
        int i6 = 1579494535 ^ i4;
        if ((this.meta instanceof PotionMeta) == (174999813 ^ i6)) {
            int i7 = 563535768 ^ i6;
        } else {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1399998504) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1399998504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2122738132 ^ i6)) {
                        break;
                    }
                }
                int i8 = 1931452285 ^ i6;
                throw new IOException("double");
            }
            int i9 = 920794564 ^ i6;
            this.meta.addCustomEffect(new PotionEffect(potionEffectType, i, i2), (byte) (1015839936 ^ i9));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -463215095) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -463215095 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (498499149 ^ i9)) {
                        int i10 = 1714750510 ^ i9;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1606726889 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (160431107 ^ i9)) {
                            break;
                        }
                    }
                }
                int i11 = 153994890 ^ i9;
                throw new RuntimeException();
            }
            int i12 = 393538140 ^ i9;
        }
        return this;
    }

    public KItem potionColor(Color color, int i) {
        int i2 = 948064993 ^ (291571465 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -996699734) {
            i2 = 1733397903 ^ i2;
            if ((this.meta instanceof PotionMeta) != (1069776826 ^ i2)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -31719983) {
                    int i3 = 14033678 ^ i2;
                    this.meta.setColor(color);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -123017823) {
                        int i4 = 1015924432 ^ i3;
                        return this;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -123017823 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1522684341 ^ i3)) {
                            break;
                        }
                    }
                    int i5 = 73979598 ^ i3;
                    throw new IllegalAccessException("double");
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 193657019:
                        int i6 = 1012655582 ^ i2;
                        break;
                    case 307693533:
                        break;
                    case 1122368969:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -31719983 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (467626785 ^ i2)) {
                int i7 = 121504100 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 482661152 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1201862600 ^ i2)) {
                    int i8 = 509618876 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -996699734 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (846923858 ^ i2)) {
                        int i9 = 1157634888 ^ i2;
                        throw new IOException();
                    }
                }
            }
        }
    }

    public KItem addBannerPattern(Pattern pattern) {
        int i = 910783616 ^ (1604748374 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -990726056) {
            i = 120448985 ^ i;
            if ((this.meta instanceof BannerMeta) == (531869906 ^ i)) {
                xnlkuihuurrzxwwx(i, 130882409);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -40008048) {
                i = 693583402 ^ i;
                this.meta.addPattern(pattern);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1222346815) {
                    int i2 = 781854019 ^ i;
                }
            }
            return this;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -990726056 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (165532966 ^ i)) {
                int i3 = 60257503 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -40008048 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (732622611 ^ i)) {
                    int i4 = 1113448570 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1007329832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1441556643 ^ i)) {
                        int i5 = 2089312373 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1222346815 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1460173495 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i6 = 1091208613 ^ i;
        throw new IllegalAccessException();
    }

    public KItem bannerPatterns(List<Pattern> list) {
        int i = 447723044 ^ (1917658255 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -862344272) {
            i = 749255398 ^ i;
            if ((this.meta instanceof BannerMeta) != (893095824 ^ i)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1445167999) {
                    i = 45476678 ^ i;
                    this.meta.setPatterns(list);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1133304143) {
                        int i2 = 1537409463 ^ i;
                        return this;
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                    case 119755548:
                        int i3 = 1494674161 ^ i;
                        break;
                    case 1853953084:
                    case 1861842266:
                        break;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1133304143 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (658619805 ^ i)) {
                int i4 = 2043936507 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1445167999 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (30020019 ^ i)) {
                    int i5 = 706826459 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1634413323 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (638703357 ^ i)) {
                        int i6 = 633369425 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -862344272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (312493153 ^ i)) {
                            int i7 = 1253730726 ^ i;
                            throw new IllegalAccessException();
                        }
                    }
                }
            }
        }
    }

    public KItem nbt(String str, Object obj, int i) {
        int i2 = 444288795 ^ (613653008 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 2093717170) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2093717170 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1817318353 ^ i2)) {
                    break;
                }
            }
            int i3 = 847453275 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1553824470 ^ i2;
        this.nbtTags.put(str, obj);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1742716928) {
            int i5 = 907171950 ^ i4;
            return this;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 682787697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1168898493 ^ i4)) {
                int i6 = 1679795016 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1742716928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (240289641 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 640908975 ^ i4;
        throw new IOException();
    }

    public KItem modifyMeta(Consumer<ItemMeta> consumer) {
        int i = 1472453235 ^ (61189903 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 683578633) {
            i = 1349199522 ^ i;
            if (this.meta != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1410883557) {
                    i = 882363342 ^ i;
                    consumer.accept(this.meta);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 257556074) {
                        int i2 = 2025229508 ^ i;
                        return this;
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                    case 60976569:
                        int i3 = 1277249290 ^ i;
                        break;
                    case 1625001593:
                    case 1971535819:
                        break;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1410883557 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (828334061 ^ i)) {
                int i4 = 1006589061 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 257556074 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (244934390 ^ i)) {
                    int i5 = 890418703 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 683578633 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (306543582 ^ i)) {
                        int i6 = 1584312179 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -890398647 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1458965336 ^ i)) {
                            int i7 = 2140946488 ^ i;
                            throw new IllegalAccessException();
                        }
                    }
                }
            }
        }
    }

    public org.bukkit.inventory.ItemStack getItemStack(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.KItem.getItemStack(int):org.bukkit.inventory.ItemStack");
    }

    public static com.kammoun.donutCore.api.utils.items.KItem fromConfig(org.bukkit.configuration.ConfigurationSection r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.KItem.fromConfig(org.bukkit.configuration.ConfigurationSection, int):com.kammoun.donutCore.api.utils.items.KItem");
    }

    public static void toConfig(org.bukkit.inventory.ItemStack r5, org.bukkit.configuration.ConfigurationSection r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.items.KItem.toConfig(org.bukkit.inventory.ItemStack, org.bukkit.configuration.ConfigurationSection, int):void");
    }

    @Generated
    public void setMeta(ItemMeta itemMeta, int i) {
        int i2 = 1354502001 ^ (413966355 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -888650247) {
            int i3 = 728637417 ^ i2;
            this.meta = itemMeta;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -888650247 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1984752292 ^ i2)) {
                int i4 = 1284403812 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1871136080 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1963246368 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2010291829 ^ i2;
        throw new IOException();
    }

    @Generated
    public void setSlot(Integer num, int i) {
        int i2 = 1621780556 ^ (227391998 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -491539592) {
            int i3 = 872579187 ^ i2;
            this.slot = num;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -491539592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (741274988 ^ i2)) {
                int i4 = 848743330 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1118286049 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1761360377 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1406452476 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public void setPrice(double d) {
        int i = 1502629258 ^ (60162363 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1539267425) {
            int i2 = 658880667 ^ i;
            this.price = d;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1636999096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2035022843 ^ i)) {
                int i3 = 1362367987 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1539267425 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (347162403 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 880155705 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public void setClickCommands(List<String> list) {
        int i = 281104446 ^ (1071251837 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -212355854) {
            int i2 = 1905061236 ^ i;
            this.clickCommands = list;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -212355854 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (874528941 ^ i)) {
                int i3 = 1485572709 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2133909329 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1677583265 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1841610704 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public void setPermission(String str) {
        int i = 1095469275 ^ (2064407052 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1504946258) {
            int i2 = 1621067271 ^ i;
            this.permission = str;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1504946258 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (613261312 ^ i)) {
                int i3 = 486943756 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1565497449 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1670638261 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1265750129 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public void setCommandType(CommandType commandType) {
        int i = 1215432272 ^ (2014549343 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 142714514) {
            int i2 = 765382132 ^ i;
            this.commandType = commandType;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1685571891 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (165113067 ^ i)) {
                int i3 = 181755012 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 142714514 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (557809007 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 653537829 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public ItemMeta getMeta(int i) {
        int i2 = 696603432 ^ (216798205 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1597556670) {
            int i3 = 1274373926 ^ i2;
            return this.meta;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -9698960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1318384754 ^ i2)) {
                int i4 = 1262176689 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1597556670 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1191906707 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2070469305 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public Integer getSlot(int i) {
        int i2 = 474323531 ^ (914011261 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -629911718) {
            int i3 = 234001346 ^ i2;
            return this.slot;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -629911718 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1136796841 ^ i2)) {
                int i4 = 2067353319 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1243557558 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (712937239 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 596106049 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public double getPrice(int i) {
        int i2 = 439790935 ^ (1769822106 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 299034752) {
            int i3 = 581531836 ^ i2;
            return this.price;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 77147489 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (514222120 ^ i2)) {
                int i4 = 383245504 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 299034752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (858814721 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 549559761 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public List getClickCommands(int i) {
        int i2 = 356279396 ^ (896264020 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1993267350) {
            int i3 = 389271259 ^ i2;
            return this.clickCommands;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 816796082 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (895076845 ^ i2)) {
                int i4 = 999687811 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1993267350 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1339150386 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1651056866 ^ i2;
        throw new IOException();
    }

    @Generated
    public String getPermission() {
        int i = 925180722 ^ (1301939241 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1584662064) {
            int i2 = 1861341207 ^ i;
            return this.permission;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1584662064 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1653413798 ^ i)) {
                int i3 = 198268871 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 704284299 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1897771847 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1745365487 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public CommandType getCommandType(int i) {
        int i2 = 1132227193 ^ (2143707533 ^ 1903273949);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1851613514) {
            int i3 = 1619168422 ^ i2;
            return this.commandType;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1783170169 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1363610698 ^ i2)) {
                int i4 = 170388196 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1851613514 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1689264409 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1382860907 ^ i2;
        throw new RuntimeException();
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
        nhzdwtxtdf = mzdmkadfermgeco();
        p9FiwNf0tv = 292676659 ^ new Random(7671241069220835562L).nextInt();
    }

    public static String unyrwblsnh(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ nhzdwtxtdf[i3 % nhzdwtxtdf.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] mzdmkadfermgeco() {
        return new byte[]{65};
    }

    private static byte[] odjnzudwecrwnoc() {
        return new byte[]{-114, -122, 117, 7, 115, 28, 115, 9, 113, 12, 112, 12, 117, 1, 115, 28};
    }

    private static byte[] werqcbscqknzktz() {
        return new byte[]{-114, -115, 113, 21, 115, 6, 116, 1, 114, 0, 112, 29, 113, 27, 115, 94, 116, 31, 114, 27, 112, 22, 113, 19, 115, 31, 116, 95, 114, 16, 112, 19, 113, 2, 115, 18};
    }

    private static byte[] pwldbbxvlnuosph() {
        return new byte[]{-114, -114, 116, 7, 118, 2, 117, 26, 113, 21, 112, 20};
    }

    private static byte[] ivmsfhikptnortv() {
        return new byte[]{-116, -118, 115, 23, 118, 22, 113, 24, 117, 23};
    }

    private static byte[] jhdahkmqgcxbbpm() {
        return new byte[]{-121, -115, 120, 16, 119, 23, 112, 16, 113, 17, 114, 25, 117, 25, 121, 4, 115, 28, 121, 23, 120, 27, 119, 13, 112, 0};
    }

    private static byte[] eyrmyzoaqgdqlnd() {
        return new byte[]{-114, -121, 116, 2, 118, 30, 117, 0, 112, 24, 112, 23, 116, 28, 118, 92, 117, 17, 112, 23, 112, 30, 116, 23, 118, 18, 117, 0, 112, 2};
    }

    private static byte[] starrjdstmclnvm() {
        return new byte[]{-115, -113, 112, 27, 119, 25, 113, 2, 119, 19};
    }

    private static byte[] kfgqrlnpickojrt() {
        return new byte[]{-121, -117, 120, 2, 118, 0, 118, 17, 115, 20};
    }

    private static byte[] enflowyplxljecw() {
        return new byte[]{-114, -115, 112, 2, 116, 29, 120, 16, 115, 10, 112, 23, 112, 22, 116, 24, 120, 19, 115, 26, 112, 30, 112, 18};
    }

    private static byte[] hlcwdpfmhmdmhbv() {
        return new byte[]{-117, -118, 113, 20, 115, 26, 120, 10, 121, 16};
    }

    private static byte[] iamrqonyrxhbkfn() {
        return new byte[]{-115, -114, 112, 4, 112, 7, 120, 16, 121, 19, 115, 20};
    }

    private static byte[] qkiumywaqyamqvt() {
        return new byte[]{-122, -118, 121, 12, 117, 4, 118, 17, 117, 20};
    }

    private static byte[] xqkhetmyzooiweq() {
        return new byte[]{-119, -117, 114, 18, 116, 22, 121, 2, 117, 18, 116, 95, 112, 4, 119, 22, 113, 1, 119, 29, 114, 31, 116, 25};
    }

    private static byte[] hobwfsedazndzod() {
        return new byte[]{-114, -119, 121, 18, 121, 28, 112, 0, 113, 1, 112, 26, 121, 23, 121, 12, 112, 94, 113, 31, 112, 23, 121, 27, 121, 16};
    }

    private static byte[] ofxosjvehxnwlpf() {
        return new byte[]{-114, -114, 121, 31, 120, 22, 119, 13, 121, 16, 112, 3, 121, 27, 120, 22, 119, 21};
    }

    private static byte[] wwgrjjtkzizgeok() {
        return new byte[]{-122, -122, 115, 23, 116, 30, 113, 20, 121, 28, 116, 6};
    }

    private static byte[] kfamccecfbfulry() {
        return new byte[]{-122, -122, 115, 88};
    }

    private static byte[] usfutaudylvdqrf() {
        return new byte[]{-115, -114, 114, 23, 115, 27, 121, 1, 121, 9, 115, 29, 114, 18, 115, 11, 121, 95, 121, 23, 115, 16, 114, 30, 115, 23};
    }

    private static byte[] eidhxdbjhrrwmsp() {
        return new byte[]{-114, -122, 119, 20, 117, 24, 113, 11, 119, 6, 112, 21, 119, 17, 117, 8, 113, 54, 119, 23, 112, 20, 119, 21};
    }

    private static byte[] wizgcmjoylzpeoo() {
        return new byte[]{-120, -118, 119, 21, 114, 28, 118, 27, 114, 30, 117, 22, 112, 28, 114, 2, 120, 31, 118, 16, 119, 30, 114, 6, 118, 11};
    }

    private static byte[] cysnxbuszxnfqvn() {
        return new byte[]{-115, -114, 117, 23, 117, 18, 120, 4};
    }

    private static byte[] hgrfrbsibatvokb() {
        return new byte[]{-114, -121, 116, 5, 117, 27, 117, 7, 120, 17, 112, 23, 116, 27, 117, 89, 117, 16, 120, 23, 112, 20, 116, 26, 117, 6};
    }

    private static byte[] sqcxyyzzfiuisrg() {
        return new byte[]{-114, -121, 116, 89};
    }

    private static byte[] jqnmiskofwsdyhw() {
        return new byte[]{-115, -114, 118, 23, 120, 24, 116, 29, 115, 30, 113, 23, 116, 22, 119, 16, 112, 0};
    }

    private static byte[] qjgarfcfelkvseu() {
        return new byte[]{-114, -120, 120, 3, 119, 19, 112, 11, 118, 29, 119, 17, 115, 4, 118, 3, 121, 31, 112, 24, 120, 29};
    }

    private static byte[] teozniofdziydvo() {
        return new byte[]{-114, -115, 112, 7, 120, 23, 117, 0, 116, 30, 112, 29, 112, 25, 120, 85, 117, 23, 116, 24, 112, 30, 112, 24, 120, 10};
    }

    private static byte[] kkkkxyoyqbvcmed() {
        return new byte[]{-114, -115, 112, 91};
    }

    private static byte[] wsgfvjirfgdwndc() {
        return new byte[]{-114, -113, 120, 5, 117, 27, 121, 5, 119, 27, 112, 31, 120, 27, 117, 89, 121, 20, 119, 20, 112, 22, 120, 16, 117, 23, 121, 5, 119, 1};
    }

    private static byte[] ihcteyzjswhfsql() {
        return new byte[]{-119, -121, 112, 16, 115, 24, 112, 3, 119, 7, 120, 28, 116, 18, 113, 9, 112, 57, 119, 25, 112, 25, 115, 20};
    }

    private static byte[] wyqysqeberltamn() {
        return new byte[]{-114, -117, 118, 1, 119, 31, 117, 6, 112, 28, 112, 24, 118, 95, 119, 27, 117, 4, 112, 30, 112, 17, 118, 0};
    }

    private static byte[] phukbimbcaqjqwa() {
        return new byte[]{-119, -116, 114, 23, 119, 21, 119, 22, 121, 16, 115, 1};
    }

    private static byte[] vzbymlohpmbesxa() {
        return new byte[]{-114, -113, 121, 2, 121, 31, 118, 6, 117, 27, 112, 31, 121, 28, 121, 93, 118, 17, 117, 29, 112, 28, 121, 29, 121, 2};
    }

    private static byte[] fixokpdxghclpuz() {
        return new byte[]{-114, -118, 117, 5, 114, 29, 113, 11, 119, 29, 112, 28, 117, 6, 114, 11, 113, 16, 119, 31, 112, 27};
    }

    private static byte[] rrgkckzlyorhswv() {
        return new byte[]{-120, -117, 113, 24, 113, 16, 115, 6};
    }

    private static byte[] dcutpcbymgnglsb() {
        return new byte[]{-119, -114, 114, 11, 118, 29, 121, 7, 119, 27, 113, 30, 120, 91, 118, 22, 114, 0, 119, 31, 114, 29, 118, 4};
    }

    private static byte[] aiiqxqhfhfkowiu() {
        return new byte[]{-114, -113, 116, 16, 115, 31, 118, 22, 112, 18, 112, 3};
    }

    private static byte[] pjzxujwidwreyfa() {
        return new byte[]{-114, -114, 113, 23, 114, 27, 119, 23, 115, 28, 112, 16, 113, 28, 114, 1, 119, 25, 115, 17, 112, 31, 113, 6, 114, 6};
    }

    private static byte[] jratgziunqwuvth() {
        return new byte[]{-115, -113, 117, 18, 115, 24, 121, 22, 117, 5, 115, 30, 117, 7};
    }

    private static byte[] cbrlvogdlljlcqo() {
        return new byte[]{-114, -114, 118, 18, 116, 29, 118, 20, 116, 27, 112, 16, 118, 25, 116, 7, 118, 26, 116, 22, 112, 31, 118, 3, 116, 0};
    }

    private static byte[] oitlsqkxahaaoao() {
        return new byte[]{-114, -116, 113, 27, 113, 24, 116, 20, 119, 20, 112, 18, 113, 22, 113, 19, 116, 10};
    }

    private static byte[] qetskoragerggqq() {
        return new byte[]{-119, -118, 121, 19, 115, 24, 114, 22, 113, 0};
    }

    private static byte[] rmdgvdlyyufoqmb() {
        return new byte[]{-115, -117, 120, 29, 115, 20, 112, 28, 118, 18, 116, 31, 121, 22};
    }

    private static byte[] leuefdhvwgmmsia() {
        return new byte[]{-115, -118, 112, 53, 113, 29, 113, 26, 115, 24, 112, 23, 113, 28, 113, 19, 115, 33, 112, 15, 113, 2, 113, 18};
    }

    private static byte[] mchyudrhmhwzpkj() {
        return new byte[]{-114, -119, 113, 0, 115, 28, 121, 28, 121, 7};
    }

    private static byte[] ybjrdleawjzzwnu() {
        return new byte[]{-114, -121, 118, 29, 113, 20, 115, 7, 112, 20, 112, 10, 118, 25, 113, 20, 115, 31};
    }

    private static byte[] zojjnxmtwinnodm() {
        return new byte[]{-114, -117, 117, 6, 119, 21, 116, 30, 113, 1};
    }

    private static byte[] hnkjqjjsipfxfvc() {
        return new byte[]{-117, -121, 113, 16, 114, 21, 115, 2, 121, 16, 120, 92, 114, 2, 116, 28, 113, 13, 117, 17, 113, 29, 114, 26};
    }

    private static byte[] lzljzcfbijbtawe() {
        return new byte[]{-115, -114, 115, 23, 119, 22, 114, 31, 121, 22};
    }

    private static byte[] mcmesduyywjbifc() {
        return new byte[]{-116, -121, 120, 1, 121, 30, 113, 13, 121, 27, 120, 23, 113, 23, 113, 92, 121, 28, 114, 30, 120, 23, 121, 20, 113, 26, 121, 6, 120, 11};
    }

    private static byte[] dhxqjfqjziauvyn() {
        return new byte[]{-114, -121, 115, 0, 120, 23, 115, 0, 115, 28, 112, 23, 115, 30, 120, 85, 115, 17, 115, 19, 112, 30, 115, 21, 120, 27, 115, 0, 115, 6};
    }

    private static byte[] nqmeimladaqaiqa() {
        return new byte[]{-120, -119, 120, 29, 121, 25, 112, 27, 118, 23, 120, 30, 121, 29};
    }

    private static byte[] yseobotdzpeiygp() {
        return new byte[]{-115, -114, 116, 16, 117, 31, 120, 21, 118, 17, 115, 16, 116, 27, 117, 5, 120, 27, 118, 28, 115, 31, 116, 1, 117, 2};
    }

    private static byte[] xfjcvcvonbkgxno() {
        return new byte[]{-120, -115, 116, 52, 121, 23, 116, 24, 113, 27, 114, 21, 119, 23, 120, 16, 117, 37, 118, 11, 116, 7, 121, 29};
    }

    private static byte[] twzfvffyqkdelpd() {
        return new byte[]{-114, -115, 120, 27, 113, 22, 118, 26, 116, 24, 112, 0};
    }

    private static byte[] mrwjfppdhbwaaql() {
        return new byte[]{-116, -113, 114, 5, 112, 24, 121, 7, 116, 6, 112, 23, 117, 2, 121, 23};
    }

    private static byte[] zlhmjduizdkctfj() {
        return new byte[]{-114, -121, 116, 62, 121, 54, 112, 49, 117, 44, 112, 48, 116, 55, 121, 33, 112, 47};
    }

    private static byte[] wxpzncbzruttiad() {
        return new byte[]{-114, -114, 115, 0, 115, 30, 114, 12, 112, 26, 112, 30, 115, 30, 115, 92, 114, 27, 112, 28, 112, 29, 115, 31, 115, 3};
    }

    private static byte[] rytxtsbbowfyuun() {
        return new byte[]{-115, -114, 115, 18, 118, 2, 121, 4, 121, 7, 115, 30, 115, 28, 118, 90, 121, 26, 121, 28, 115, 21, 115, 20, 118, 27, 121, 90, 121, 23, 115, 16, 115, 5, 118, 22};
    }

    private static byte[] ipbaibmdvaidnfm() {
        return new byte[]{-114, -117, 112, 23, 116, 16, 115, 0, 112, 22, 112, 89, 112, 5, 116, 30, 115, 7, 112, 26, 112, 27, 112, 27};
    }

    private static byte[] ybojloegbrsmqxz() {
        return new byte[]{-117, -115, 114, 6, 115, 28, 116, 9, 114, 1, 114, 7, 114, 1, 121, 17};
    }

    private static byte[] uqaqhsmjmuxwkul() {
        return new byte[]{-114, -119, 119, 6, 113, 25, 112, 12, 112, 28, 112, 26, 119, 88, 113, 29, 112, 14, 112, 30, 112, 19, 119, 7};
    }

    private static byte[] oivbeirhlzxktli() {
        return new byte[]{-114, -122, 119, 16, 121, 27, 114, 17, 115, 31, 112, 24, 119, 27, 121, 1, 114, 31, 115, 18, 112, 23, 119, 1, 121, 6};
    }

    private static byte[] rvaeddvosnoaola() {
        return new byte[]{-114, -122, 113, 28, 114, 16, 116, 10, 115, 9, 112, 21, 113, 25, 114, 0};
    }

    private static byte[] ngahvdgrlelxhsx() {
        return new byte[]{-114, -122, 113, 61, 114, 23, 116, 26, 115, 17, 112, 24, 113, 22, 114, 13, 116, 20, 115, 28, 112, 23, 113, 12, 114, 10};
    }

    private static byte[] srpiqrphkfpehxv() {
        return new byte[]{-114, -122, 113, 29, 114, 23, 116, 26, 115, 17};
    }

    private static byte[] zxthsjybzmdplec() {
        return new byte[]{-114, -122, 113, 60, 114, 24, 116, 20, 115, 24, 112, 30, 113, 29};
    }

    private static byte[] puxrkcpgimrhxsc() {
        return new byte[]{-114, -122, 113, 59, 114, 12, 116, 10, 115, 13, 112, 22, 113, 21, 114, 52, 116, 22, 115, 29, 112, 28, 113, 20, 114, 61, 116, 24, 115, 13, 112, 24};
    }

    private static byte[] krxptmraqwsjlpc() {
        return new byte[]{-114, -122, 113, 43, 114, 18, 116, 12, 115, 21, 112, 21, 113, 55, 114, 14, 116, 23, 115, 28, 112, 11};
    }

    private static byte[] drmgaabcnuyxwkq() {
        return new byte[]{-114, -122, 113, 40, 114, 22, 116, 13, 115, 16, 112, 22, 113, 22};
    }

    private static byte[] vmscjevspghghdl() {
        return new byte[]{-114, -122, 113, 59, 114, 12, 116, 10, 115, 13, 112, 22, 113, 21, 114, 41, 116, 22, 115, 13, 112, 16, 113, 23, 114, 23, 116, 60, 115, 31, 112, 31, 113, 29, 114, 26, 116, 13, 115, 10};
    }

    private static byte[] isfkpvvhyyqmnfi() {
        return new byte[]{-114, -122, 113, 57, 114, 13, 116, 13, 115, 11, 112, 16, 113, 26, 114, 12, 116, 13, 115, 28, 112, 52, 113, 23, 114, 29, 116, 16, 115, 31, 112, 16, 113, 29, 114, 11, 116, 10};
    }

    private static byte[] lnsqkktokimcyne() {
        return new byte[]{-114, -122, 113, 45, 114, 23, 116, 27, 115, 11, 112, 28, 113, 25, 114, 18, 116, 24, 115, 27, 112, 21, 113, 29};
    }

    private static byte[] xkocdewcoempfnz() {
        return new byte[]{-114, -122, 113, 10, 114, 28, 116, 9, 115, 24, 112, 16, 113, 10, 114, 58, 116, 22, 115, 10, 112, 13};
    }

    private static byte[] jwlktjrsmhbknxl() {
        return new byte[]{-114, -122, 113, 48, 114, 16, 116, 29, 115, 28, 112, 63, 113, 20, 114, 24, 116, 30, 115, 10};
    }

    private static byte[] hehwbtrtuvmmogt() {
        return new byte[]{-114, -122, 113, 59, 114, 24, 116, 23, 115, 61, 112, 28, 113, 11, 114, 13, 116, 11, 115, 22, 112, 0};
    }

    private static byte[] guwksrcccebjuhp() {
        return new byte[]{-114, -122, 113, 59, 114, 24, 116, 23, 115, 41, 112, 21, 113, 25, 114, 26, 116, 28, 115, 54, 112, 23};
    }

    private static byte[] lhmlsmclvaxknig() {
        return new byte[]{-114, -122, 113, 58, 114, 21, 116, 22, 115, 26, 112, 18, 113, 61, 114, 23, 116, 13, 115, 16, 112, 13, 113, 1, 114, 45, 116, 24, 115, 30};
    }

    private static byte[] xcpfofvxxioksik() {
        return new byte[]{-114, -120, 117, 9, 114, 23, 115, 0, 116, 25, 119, 26, 121, 28, 120, 94, 116, 23, 112, 24, 117, 21, 114, 23, 115, 6};
    }

    private static byte[] jwzojofkyznkvwb() {
        return new byte[]{-114, -116, 120, 3, 115, 25, 119, 18, 114, 3, 112, 22, 120, 23, 115, 28, 119, 17, 114, 19, 112, 31, 120, 19};
    }

    private static byte[] yayloohupmyryeo() {
        return new byte[]{-114, -114, 112, 42, 119, 18, 117, 13, 119, 21, 112, 29, 112, 54, 119, 14, 117, 22, 119, 28, 112, 3};
    }

    private static byte[] airizsjrtwmwmpi() {
        return new byte[]{-114, -114, 112, 41, 119, 11, 117, 23, 119, 9, 112, 20, 112, 11, 119, 13, 117, 17, 119, 28, 112, 2};
    }

    private static byte[] aavhtuwxptjkmck() {
        return new byte[]{-122, -117, 116, 0, 113, 30, 116, 12, 121, 17, 116, 27, 112, 31, 113, 89, 120, 26, 120, 27, 116, 28, 113, 30, 116, 10};
    }

    private static byte[] vtkjutreznmmodo() {
        return new byte[]{-118, -121, 112, 22, 120, 28, 118, 23, 119, 1, 120, 30, 119, 12};
    }

    private static byte[] kgwykydzvjxoojg() {
        return new byte[]{-114, -118, 116, 16, 114, 29, 116, 31, 118, 26, 112, 7};
    }

    private static byte[] jmieshakazzsydm() {
        return new byte[]{-116, -117, 119, 18, 120, 26, 115, 1, 119, 2, 116, 27, 118, 25, 115, 10, 114, 90, 114, 26, 119, 23, 120, 30, 115, 23};
    }

    private static byte[] euovheykepndyiw() {
        return new byte[]{-116, -117, 119, -47};
    }

    private static byte[] wnafwtofysffhgh() {
        return new byte[]{-116, -117, 119, 80};
    }

    private static byte[] qfwdnrmjbmxkpnm() {
        return new byte[]{-114, -117, 113, 0, 121, 10, 113, 27, 119, 21};
    }

    private static byte[] uylmxnqaustgxqt() {
        return new byte[]{-114, -119, 119, 21, 120, 22, 116, 5, 114, 21, 112, 91, 119, 7, 120, 24, 116, 2, 114, 25, 112, 25, 119, 25};
    }

    private static byte[] cmtakosbqhtgovg() {
        return new byte[]{-114, -118, 117, 31, 116, 28, 121, 23, 117, 14};
    }

    private static byte[] dwliqyspdtulacw() {
        return new byte[]{-119, -114, 121, 27, 121, 28, 115, 3, 117, 18};
    }

    private static byte[] rxepfkkhnwtxukz() {
        return new byte[]{-121, -121, 114, 4, 119, 25, 115, 6, 115, 16, 120, 29, 116, 25, 118, 94, 114, 22, 121, 30, 114, 18, 119, 19, 115, 17, 115, 13, 120, 1};
    }

    private static byte[] ggkbyebnftkklcd() {
        return new byte[]{-114, -118, 118, 0, 118, 22, 116, 4, 117, 31, 112, 25, 121, 26, 112, 88, 118, 21, 118, 31, 116, 22, 117, 19, 112, 21, 121, 0, 112, 6};
    }

    private static byte[] yvuranxhsxjlwnq() {
        return new byte[]{-119, -115, 115, 22, 116, 4, 114, 5, 120, 3, 114, 28, 117, 25, 113, 95, 118, 21, 119, 29, 115, 17, 116, 20, 114, 26, 120, 90, 114, 23, 117, 21, 113, 6, 118, 25};
    }

    private static byte[] dsaxmlxnyvwgfgz() {
        return new byte[]{-115, -115, 113, 19, 114, 30, 118, 25, 113, 20, 114, 2};
    }

    private static byte[] znllqfkptvfwgml() {
        return new byte[]{-114, -115, 117, 13, 114, 29, 119, 15, 119, 1, 112, 7, 117, 11, 114, 29, 119, 4};
    }

    private static byte[] fxzdddfhlufkqzk() {
        return new byte[]{-114, -118, 113, 6, 116, 22, 117, 12, 117, 1, 112, 16, 113, 4, 116, 25};
    }

    private static byte[] nzpudqldgoskcvy() {
        return new byte[]{-119, -113, 117, 35, 115, 16, 119, 27, 118, 2, 112, 16};
    }

    private static byte[] zuhsgvvxnunmrvu() {
        return new byte[]{-120, -120, 117, 30, 114, 26, 116, 6};
    }

    private static byte[] jevwhwqdvjgthor() {
        return new byte[]{-117, -114, 121, 30, 115, 18, 115, 13, 112, 16, 113, 11, 115, 26, 115, 18, 121, 28};
    }

    private static byte[] bgylpzziigpzkym() {
        return new byte[]{-122, -121, 113, 13, 121, 18, 114, 11, 118, 12, 120, 4, 121, 11, 119, 23};
    }

    private static byte[] rcewdeqyrhsvjrn() {
        return new byte[]{-117, -118, 113, 28, 117, 25, 116, 20, 121, 20, 117, 22, 120, 16};
    }

    private static byte[] wwhqdiygmzheqqd() {
        return new byte[]{-119, -115, 117, 21, 114, 18, 120, 4, 118, 18, 114, 7, 120, 27, 115, 25, 112, 26};
    }

    private static byte[] ivbmblqgifrstck() {
        return new byte[]{-120, -119, 121, -33};
    }

    private static byte[] wriqbygwpcnptbu() {
        return new byte[]{-120, -119, 121, 94};
    }

    private static byte[] crryvnkkmkeoieq() {
        return new byte[]{-114, -113, 120, 26, 112, 25, 120, 28, 118, 26, 112, 21, 120, 25, 112, 24};
    }

    private static byte[] ibxkqwwwggemhrw() {
        return new byte[]{-122, -114, 120, 1, 119, 5, 116, 3, 113, 17, 113, 22, 114, 16};
    }

    private static byte[] hgwtkutenpwrxua() {
        return new byte[]{-115, -118, 117, 29, 112, 26, 119, 1, 112, 22, 117, 18, 116, 21, 116, 5};
    }

    private static byte[] qvcfndgqwfnwywv() {
        return new byte[]{-114, -113, 114, 28, 116, 24, 115, 1};
    }

    private static byte[] zqrzjxnwgoarrop() {
        return new byte[]{-114, -122, 114, 30, 115, 22, 113, 26, 119, 31};
    }

    private static byte[] walyrfxmicqgohd() {
        return new byte[]{-114, -122, 114, 73};
    }

    private static byte[] vglmvxeoqeklprg() {
        return new byte[]{-114, -115, 115, 19, 114, 26, 119, 24, 115, 25};
    }

    private static byte[] jqqypvalmmzxcoj() {
        return new byte[]{-114, -117, 120, 22, 112, 25, 115, 5, 112, 26, 112, 24, 120, 23};
    }

    private static byte[] erkxdeuighrajqx() {
        return new byte[]{-117, -113, 120, 75};
    }

    private static byte[] nexhszopurljzma() {
        return new byte[]{-116, -114, 119, 75};
    }

    private static byte[] zdjjpivzklulblj() {
        return new byte[]{-115, -114, 115, 66};
    }

    private static byte[] zmzesvsyufgoawy() {
        return new byte[]{-114, -113, 120, 34, 116, 57, 120, 49, 112, 2, 112, 21, 120, 20, 116, 47, 120, 88, 112, 53, 112, 17, 120, 23, 116, 28, 120, 23, 112, 2, 112, 80, 120, 10, 116, 23, 120, 12, 112, 86, 112, 3, 120, 18, 116, 7, 120, 20, 112, 26, 112, 80, 120, 22, 116, 5, 120, 22, 112, 19, 112, 2, 120, 89, 116, 5, 120, 17, 112, 2, 112, 24, 120, 22, 116, 7, 120, 12, 112, 86, 112, 17, 120, 89, 116, 2, 120, 20, 112, 3, 112, 23, 120, 16, 116, 28, 120, 88, 112, 31, 112, 30, 120, 10, 116, 6, 120, 25, 112, 24, 112, 19, 120, 28, 116, 92};
    }

    private static byte[] hfvrxfyazlmrnir() {
        return new byte[]{-114, -117, 117, 34, 118, 61, 121, 62, 112, 4, 116, 16, 121, 27, 118, 36, 119, 80, 112, 55, 117, 24, 118, 24, 121, 25, 112, 31, 116, 1, 121, 86, 118, 10, 119, 21, 112, 0, 117, 89, 118, 2, 121, 18, 112, 8, 116, 1, 121, 3, 118, 11, 119, 21, 112, 84, 117, 14, 118, 31, 121, 3, 112, 24, 116, 26, 121, 3, 118, 13, 119, 80, 112, 21, 117, 89, 118, 6, 121, 27, 112, 5, 116, 18, 121, 31, 118, 23, 119, 80, 112, 29, 117, 23, 118, 5, 121, 3, 112, 17, 116, 27, 121, 21, 118, 28, 119, 94};
    }

    private static int xnlkuihuurrzxwwx(int i, int i2) {
        return i ^ i2;
    }
}
