package com.kammoun.donutCore.tpa.commands.model;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.tpa.TeleportPlugin;
import com.kammoun.donutCore.tpa.manager.TeleportManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class TpaRequest extends KCommand {
    protected final TeleportPlugin plugin;
    protected final TeleportManager manager;
    private static int TxrCRrIt2r = 0;

    private transient int f1238te33PvUjm = 520485703;
    private static String lpwnoapdka;
    private static String[] nothing_to_see_here = new String[17];

    public TpaRequest(TeleportPlugin teleportPlugin, String str, int i) {
        super(str, 1543881941);
        int i2 = 1629316454 ^ 304512566;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 256047056:
                    int i3 = 2131730356 ^ i2;
                    break;
                case 859694357:
                case 1086186553:
                default:
                    throw new IllegalAccessException();
                case 1541337223:
                    break;
            }
        }
        int parseInt = 821732243 ^ (1659794578 ^ Integer.parseInt("1579176933"));
        this.f1238te33PvUjm = 520485703 ^ TxrCRrIt2r;
        int oudsecbfhpztvnqn = 1184050714 ^ oudsecbfhpztvnqn(parseInt, 485260637);
        this.plugin = teleportPlugin;
        this.manager = teleportPlugin.getTeleportManager(325711881);
        int i4 = 381930114 ^ (1900968176 ^ oudsecbfhpztvnqn);
    }

    @Override
    public void execute(org.bukkit.command.CommandSender r7, java.lang.String[] r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.commands.model.TpaRequest.execute(org.bukkit.command.CommandSender, java.lang.String[], int):void");
    }

    @Override
    public List onTab(CommandSender commandSender, String[] strArr, int i) {
        int i2 = 90844666 ^ (539169668 ^ 1617592649);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 689830330) {
            int i3 = 1718724529 ^ i2;
            Stream stream = Bukkit.getOnlinePlayers().stream();
            Function function = (v0) -> {
                return v0.getName();
            };
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 445695025) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 445695025 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1484960899 ^ i3)) {
                        int i4 = 948192255 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -913401224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (267694691 ^ i3)) {
                            break;
                        }
                    }
                }
                int i5 = 1321137595 ^ i3;
                throw new IllegalAccessException("double");
            }
            i2 = 1349274735 ^ i3;
            Stream map = stream.map(function);
            Predicate predicate = 
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.commands.model.TpaRequest.onTab(org.bukkit.command.CommandSender, java.lang.String[], int):java.util.List");
        }

        protected abstract void openMenu(Player player, Player player2, int i);

        protected abstract void sendRequestDirectly(Player player, Player player2, int i);

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
            lpwnoapdka = ByteBuffer.wrap(dfmwmkidgessimg()).asCharBuffer().toString();
            TxrCRrIt2r = 134829317 ^ new Random(1557311161249846635L).nextInt();
        }

        public static String qktiknhrew(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = lpwnoapdka.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

        private static byte[] wczgknxjhymohaz() {
            return new byte[]{0, 0, 0, 8, 0, 0, 0, 0};
        }

        private static byte[] dfmwmkidgessimg() {
            return new byte[]{49, 17, 55, 65, 51, 85, 52, 83, 52, 72, 49, 81, 55, 67, 51, 28};
        }

        private static int oudsecbfhpztvnqn(int i, int i2) {
            return i ^ i2;
        }
    }
