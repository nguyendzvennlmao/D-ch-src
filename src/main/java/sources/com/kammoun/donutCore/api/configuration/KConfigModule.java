package com.kammoun.donutCore.api.configuration;

import com.kammoun.donutCore.api.module.DonutModule;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.configuration.file.FileConfiguration;

public abstract class KConfigModule {
    protected final DonutModule plugin;
    private final File file;
    private final String resourcePath;
    protected FileConfiguration config;
    private static int sL446CKIC6 = 0;
    private transient int lofuZ7s0ne = 1908922218;
    private static String nphrtokxog;
    private static String[] nothing_to_see_here = new String[15];

    public KConfigModule(DonutModule donutModule, String str, int i) {
        this(donutModule, str, donutModule.getModuleName(1940043514) + "/" + str, 621788501);
        fcosvknwdjmxwurm(779600359 ^ 1324555664, 1751750600);
        int parseInt = 799043202 ^ (1031872604 ^ Integer.parseInt("449578337"));
        this.lofuZ7s0ne = 1908922218 ^ sL446CKIC6;
        int fcosvknwdjmxwurm = 2129981082 ^ fcosvknwdjmxwurm(parseInt, 1701546762);
    }

    public KConfigModule(DonutModule donutModule, String str, String str2, int i) {
        int i2 = 666625041 ^ (883153324 ^ 828933003);
        int parseInt = 1518731614 ^ (1648015881 ^ Integer.parseInt("449578337"));
        this.lofuZ7s0ne = 1908922218 ^ sL446CKIC6;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 45765368:
                    parseInt = 293287720 ^ parseInt;
                    break;
                case 304906202:
                    break;
                case 785017803:
                default:
                    throw new IOException();
                case 1327332527:
            }
        }
        this.plugin = donutModule;
        this.resourcePath = str2;
        this.file = new File(String.valueOf(donutModule.getApi(2142241109).getDataFolder()) + "/" + donutModule.getModuleName(1940043514), str);
        load(985210593);
        int i3 = 366131617 ^ (369365110 ^ (575062562 ^ (1367894533 ^ (405854519 ^ parseInt))));
    }

    public final void load(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.configuration.KConfigModule.load(int):void");
    }

    @Generated
    public FileConfiguration getConfig() {
        int i = 329430569 ^ (316998224 ^ 2053449107);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -652964013) {
            int i2 = 1822976398 ^ i;
            return this.config;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -652964013 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (49096256 ^ i)) {
                int i3 = 668232627 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1135099104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1055950492 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1095957117 ^ i;
        throw new IllegalAccessException();
    }

    static {
        nothing_to_see_here[0] = "⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆";
        nothing_to_see_here[5] = "⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿";
        nothing_to_see_here[6] = "⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀";
        nothing_to_see_here[7] = "⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[8] = "⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉              ";
        nphrtokxog = ByteBuffer.wrap(wscibjkglrhppvm()).asCharBuffer().toString();
        sL446CKIC6 = 1240239577 ^ new Random(1267951593300952370L).nextInt();
    }

    public static String qaczkejnzy(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = nphrtokxog.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] wscibjkglrhppvm() {
        return new byte[0];
    }

    private static int fcosvknwdjmxwurm(int i, int i2) {
        return i ^ i2;
    }
}
