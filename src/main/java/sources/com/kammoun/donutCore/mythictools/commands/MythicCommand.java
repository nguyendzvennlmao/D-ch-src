package com.kammoun.donutCore.mythictools.commands;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.mythictools.MythicPlugin;
import com.kammoun.donutCore.mythictools.manager.Messages;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.command.CommandSender;

public class MythicCommand extends KCommand {
    private final MythicPlugin plugin;
    private static int umFKQh3KZu = 0;
    private transient int piE0NQqhY7 = 451631640;
    private static String wtdwnnstnx;
    private static String[] nothing_to_see_here = new String[15];

    public MythicCommand(com.kammoun.donutCore.mythictools.MythicPlugin r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.commands.MythicCommand.<init>(com.kammoun.donutCore.mythictools.MythicPlugin, int):void");
    }

    @Override
    public void execute(org.bukkit.command.CommandSender r7, java.lang.String[] r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.commands.MythicCommand.execute(org.bukkit.command.CommandSender, java.lang.String[], int):void");
    }

    private void handleGive(org.bukkit.command.CommandSender r7, java.lang.String[] r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.commands.MythicCommand.handleGive(org.bukkit.command.CommandSender, java.lang.String[], int):void");
    }

    private void handleSelfDestruct(org.bukkit.command.CommandSender r7, java.lang.String[] r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.commands.MythicCommand.handleSelfDestruct(org.bukkit.command.CommandSender, java.lang.String[], int):void");
    }

    private void handleList(org.bukkit.command.CommandSender r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.commands.MythicCommand.handleList(org.bukkit.command.CommandSender, int):void");
    }

    private void sendHelp(CommandSender commandSender, int i) {
        int i2 = 2012085011 ^ (269890399 ^ 1476915397);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1981367) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1981367 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (794216112 ^ i2)) {
                    break;
                }
            }
            int i3 = 980920341 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1758408485 ^ i2;
        this.plugin.getMessagesManager(779504345).send(commandSender, Messages.COMMAND_HELP_HEADER, new String[(byte) (1462966188 ^ i4)], 1962894834);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1181172382) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1181172382 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (583252145 ^ i4)) {
                    break;
                }
            }
            int i5 = 886261247 ^ i4;
            throw new IOException("double");
        }
        int i6 = 1604493932 ^ i4;
        this.plugin.getMessagesManager(779504345).send(commandSender, Messages.COMMAND_HELP_GIVE, new String[(byte) (143766976 ^ i6)], 1962894834);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1150135808) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1150135808 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1787331243 ^ i6)) {
                    break;
                }
            }
            int i7 = 1464556860 ^ i6;
            throw new RuntimeException("double");
        }
        int i8 = 933281476 ^ i6;
        this.plugin.getMessagesManager(779504345).send(commandSender, Messages.COMMAND_HELP_SELFDESTRUCT, new String[(byte) (1060178692 ^ i8)], 1962894834);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -108505055) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -108505055 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1346511992 ^ i8)) {
                    break;
                }
            }
            int i9 = 1535431645 ^ i8;
            throw new RuntimeException("double");
        }
        int i10 = 545896830 ^ i8;
        this.plugin.getMessagesManager(779504345).send(commandSender, Messages.COMMAND_HELP_SELFDESTRUCT_DELAYED, new String[(byte) (532198010 ^ i10)], 1962894834);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -37383216) {
            int i11 = 1092757136 ^ i10;
            this.plugin.getMessagesManager(779504345).send(commandSender, Messages.COMMAND_HELP_LIST, new String[(byte) (1587188970 ^ i11)], 1962894834);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != -187390126) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -187390126 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (385901712 ^ i11)) {
                        break;
                    }
                }
                int i12 = 722717636 ^ i11;
                throw new IOException("double");
            }
            i10 = 2051811383 ^ i11;
            this.plugin.getMessagesManager(779504345).send(commandSender, Messages.COMMAND_HELP_RELOAD, new String[(byte) (618052829 ^ i10)], 1962894834);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 649455337) {
                i10 = 1697441439 ^ i10;
                this.plugin.getMessagesManager(779504345).send(commandSender, Messages.COMMAND_HELP_FOOTER, new String[(byte) (1106926146 ^ i10)], 1962894834);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 265474578) {
                    int i13 = 150652041 ^ i10;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 649455337 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (136690488 ^ i10)) {
                int i14 = 1819014631 ^ i10;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 265474578 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1703851208 ^ i10)) {
                    int i15 = 87578052 ^ i10;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -37383216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (403691927 ^ i10)) {
                        break;
                    }
                }
            }
        }
        int i16 = 1731809016 ^ i10;
        throw new IllegalAccessException();
    }

    @Override
    public java.util.List onTab(org.bukkit.command.CommandSender r6, java.lang.String[] r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.commands.MythicCommand.onTab(org.bukkit.command.CommandSender, java.lang.String[], int):java.util.List");
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⢰⣧⣼⣯⠄⣸⣠⣶⣶⣦⣾⠄⠄⠄⠄⡀⠄⢀⣿⣿⠄⠄⠄⢸⡇⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿⠄";
        nothing_to_see_here[2] = "⠄⠄⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿⠄";
        nothing_to_see_here[3] = "⠄⠄⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⠄";
        nothing_to_see_here[4] = "⠄⢀⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋⣰";
        nothing_to_see_here[5] = "⠄⣼⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀⣤";
        nothing_to_see_here[6] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿⡗";
        nothing_to_see_here[7] = "⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄";
        nothing_to_see_here[8] = "⢸⣿⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄";
        nothing_to_see_here[9] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃⠄";
        nothing_to_see_here[10] = "⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄⠄";
        nothing_to_see_here[11] = "⠄⠄⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄⠄";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠈⠛⢿⣿⣿⣿⠁⠞⢿⣿⣿⡄⢿⣿⡇⣸⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄";
        nothing_to_see_here[13] = "⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣾⣦⡙⠻⣷⣾⣿⠃⠿⠋⠁⠄⠄⠄⠄⠄⢀⣠⣴";
        nothing_to_see_here[14] = "⣿⣿⣿⣶⣶⣮⣥⣒⠲⢮⣝⡿⣿⣿⡆⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⣠⣴⣿⣿⣿";
        wtdwnnstnx = ByteBuffer.wrap(fhwgjnweykqjjyw()).asCharBuffer().toString();
        umFKQh3KZu = (-630745586) ^ new Random(7506626016915998824L).nextInt();
    }

    public static String dwafvlvgda(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = wtdwnnstnx.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] chxceggolgjnerz() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 0};
    }

    private static byte[] cujiggybfxvzysw() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 6};
    }

    private static byte[] kshxmrugrebeaau() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 10};
    }

    private static byte[] fhjdmswkkocvskd() {
        return new byte[]{0, 0, 0, 2, 0, 0, 0, 14};
    }

    private static byte[] mdmeakswrtaxhkw() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 16};
    }

    private static byte[] ialywkhgxzkvave() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 28};
    }

    private static byte[] hvowijrqcqpwyin() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 36};
    }

    private static byte[] byuqraxlhnbmlol() {
        return new byte[]{0, 0, 0, 16, 0, 0, 0, 44};
    }

    private static byte[] lobnqhcenjkaedu() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 60};
    }

    private static byte[] ktozpizzvffcnfn() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 67};
    }

    private static byte[] sariwxxyrzyyrjw() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 73};
    }

    private static byte[] xjewbbcmtvydfqp() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 79};
    }

    private static byte[] nbbujavskabdrge() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 87};
    }

    private static byte[] agcegqcmkdnzruj() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 93};
    }

    private static byte[] xktnlfecyfqkgvg() {
        return new byte[]{0, 0, 0, 2, 0, 0, 0, 99};
    }

    private static byte[] jvkkqkcxcrdvsxw() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 101};
    }

    private static byte[] vkckhxaufnwcmvd() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 107};
    }

    private static byte[] zkxyrksbuilbvry() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 117};
    }

    private static byte[] wbrzgsaihioawbw() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 123};
    }

    private static byte[] xqygsmpyiaelooe() {
        return new byte[]{0, 0, 0, 2, 0, 0, 0, 123};
    }

    private static byte[] kqqvsdfckbouogz() {
        return new byte[]{0, 0, 0, 2, 0, 0, 0, 125};
    }

    private static byte[] anbrnfuemyxcrse() {
        return new byte[]{0, 0, 0, 2, 0, 0, 0, Byte.MAX_VALUE};
    }

    private static byte[] qzdktdowsdwrsmf() {
        return new byte[]{0, 0, 0, 2, 0, 0, 0, -127};
    }

    private static byte[] nasebnhgbpahjul() {
        return new byte[]{0, 0, 0, 2, 0, 0, 0, -125};
    }

    private static byte[] ybdgyuhtvpwgpit() {
        return new byte[]{0, 0, 0, 3, 0, 0, 0, -123};
    }

    private static byte[] hxkfgzzfuukwotp() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, -120};
    }

    private static byte[] czovvprzptujkft() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, -116};
    }

    private static byte[] rymmrwemmlhmhoj() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, -104};
    }

    private static byte[] qawrxfnkyrcsuty() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, -100};
    }

    private static byte[] sjukuuceptvokkw() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, -94};
    }

    private static byte[] ssnmhpxitqnrrwf() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, -90};
    }

    private static byte[] jhcnkhhotrnwltn() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, -78};
    }

    private static byte[] fhwgjnweykqjjyw() {
        return new byte[]{56, 71, 55, 80, 57, 95, 50, 86, 54, 89, 53, 83, 56, 85, 57, 88, 55, 67, 57, 87, 49, 84, 52, 80, 54, 70, 48, 67, 49, 69, 49, 92, 56, 75, 57, 85, 50, 94, 57, 94, 52, 92, 56, 92, 48, 65, 50, 77, 56, 70, 56, 77, 57, 83, 50, 70, 49, 18, 52, 73, 51, 93, 55, 89, 57, 64, 49, 82, 52, 75, 51, 20, 52, 19, 49, 89, 48, 88, 48, 93, 51, 65, 54, 95, 56, 68, 53, 21, 57, 93, 52, 73, 56, 65, 50, 95, 51, 80, 48, 87, 48, 103, 53, 70, 55, 92, 57, 95, 52, 92, 56, 106, 50, 67, 51, 64, 48, 68, 48, 93, 49, 23, 54, 64, 55, 90, 53, 89, 55, 91, 49, 65, 54, 17, 49, 22, 49, 68, 50, 89, 49, 91, 56, 88, 49, 22, 49, 17, 51, 76, 57, 86, 50, 90, 53, 88, 49, 17, 55, 17, 53, 80, 51, 93, 55, 88, 54, 66, 52, 91, 49, 71, 48, 18, 49, 22, 56, 69, 57, 91, 56, 87, 56, 85, 49, 22, 51, 21, 54, 66, 49, 90, 57, 85, 51, 85, 54, 19, 49, 28, 57, 5, 51, 18, 56, 71, 54, 95, 48, 93, 51, 82, 56, 22, 49, 20, 57, 80, 49, 68, 56, 65, 56, 89, 49, 69, 57, 93, 49, 94, 56, 93, 56, 29, 49, 23, 49, 71, 54, 86, 49, 89, 55, 85, 49, 23, 53, 27, 57, 1, 53, 7, 57, 88, 53, 3, 57, 88, 53, 7, 57, 84, 53, 1, 57, 84, 53, 5, 57, 0, 48, 92, 57, 83, 55, 90, 48, 68, 52, 93, 57, 71, 55, 86, 48, 94, 52, 94, 56, 93, 52, 82, 51, 67, 50, 64, 56, 74, 57, 65, 55, 80, 48, 70, 57, 88, 55, 90, 48, 65, 52, 76, 57, 70, 55, 86, 48, 94, 52, 87, 56, 88, 52, 83, 52, 95, 49, 94, 49, 66, 48, 80, 56, 65, 53, 87, 56, 94, 48, 95, 52, 92, 50, 80, 50, 75, 50, 68, 57, 70, 56, 71, 53, 81, 56, 70, 49, 95, 48, 89, 54, 65, 54, 81};
    }

    private static int thjeezhdjmrurgwb(int i, int i2) {
        return i ^ i2;
    }
}
