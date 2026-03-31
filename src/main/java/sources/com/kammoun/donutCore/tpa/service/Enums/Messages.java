package com.kammoun.donutCore.tpa.service.Enums;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import lombok.Generated;

public final class Messages {
    public static final Messages CONFIG_RELOAD;
    public static final Messages USER_NOT_FOUND;
    public static final Messages SELF_TELEPORT;
    public static final Messages NON_VALID_REQUEST;
    public static final Messages TELEPORT_COUNTDOWN;
    public static final Messages TELEPORT_COUNTDOWN_ACTIONBAR;
    public static final Messages TELEPORT_CANCELLED;
    public static final Messages NO_REQUESTS_FOUND;
    public static final Messages ACCEPTED_TELEPORT;
    public static final Messages TARGET_ACCEPTED_TELEPORT;
    public static final Messages RECEIVE_REQUEST;
    public static final Messages RECEIVE_HERE_REQUEST;
    public static final Messages SENT_REQUEST;
    public static final Messages SENT_HERE_REQUEST;
    public static final Messages CANCELLED_REQUEST;
    public static final Messages CANCELLED_REQUEST_SENDER;
    public static final Messages TPA_TOGGLE_ON;
    public static final Messages TPA_TOGGLE_OFF;
    public static final Messages BLOCK_TPA_REQUEST;
    public static final Messages TPAUTO_TOGGLE_ON;
    public static final Messages TPAUTO_TOGGLE_OFF;
    public static final Messages TPA_HERE_TOGGLE_ON;
    public static final Messages TPA_HERE_TOGGLE_OFF;
    public static final Messages BLOCK_TPHERE_REQUEST;
    public static final Messages REQUEST_COOLDOWN;
    public static final Messages CANCEL_REQUESTS;
    public static final Messages CANCEL_REQUESTS_FAILED;
    public static final Messages TPA_REQUEST_SENDER_ACTIONBAR;
    public static final Messages TPA_HERE_REQUEST_SENDER_ACTIONBAR;
    public static final Messages TPA_REQUEST_REQUESTER_ACTIONBAR;
    public static final Messages TPA_HERE_REQUEST_REQUESTER_ACTIONBAR;
    public static final Messages TELEPORT_MOVEMENT_CANCELLATION_ACTION_BAR;
    public static final Messages TPA_TOGGLE_ON_ACTIONBAR;
    public static final Messages TPA_HERE_TOGGLE_ON_ACTIONBAR;
    public static final Messages TPA_TOGGLE_OFF_ACTIONBAR;
    public static final Messages TPA_HERE_TOGGLE_OFF_ACTIONBAR;
    public static final Messages TPA_AUTO_TOGGLE_ON_ACTIONBAR;
    public static final Messages TPA_AUTO_TOGGLE_OFF_ACTIONBAR;
    private final String path;
    private final String defaultMessage;
    private static final Messages[] $VALUES;
    private static byte[] nvikzjrqyk;

    public static Messages[] values() {
        int i = 12689765 ^ (1873735096 ^ (325195619 ^ 188545418));
        return (Messages[]) $VALUES.clone();
    }

    public static Messages valueOf(String str) {
        int i = 1563783549 ^ (584572113 ^ 188545418);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1494048461) {
            int i2 = 49121017 ^ i;
            return (Messages) Enum.valueOf(Messages.class, str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1494048461 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1086956433 ^ i)) {
                int i3 = 1226766319 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1315006725 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1718261965 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 74491765 ^ i;
        throw new IllegalAccessException();
    }

    private Messages(java.lang.String r5, int r6, java.lang.String r7, java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.service.Enums.Messages.<init>(java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    @Generated
    public String getPath() {
        int i = 1244609626 ^ (104633132 ^ 763720507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 213312107) {
            int i2 = 723407380 ^ i;
            return this.path;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1413771978 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1819015155 ^ i)) {
                int i3 = 1778599451 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 213312107 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1443598650 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 200842347 ^ i;
        throw new IOException();
    }

    @Generated
    public String getDefaultMessage() {
        int i = 1649678312 ^ (1194372447 ^ 763720507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1192119392) {
            int i2 = 2112273514 ^ i;
            return this.defaultMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1192119392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (330251029 ^ i)) {
                int i3 = 1509216925 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1472483533 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (979582398 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1260848612 ^ i;
        throw new IllegalAccessException();
    }

    private static Messages[] $values() {
        int i = 118389600 ^ (1418494505 ^ (977323241 ^ 188545418));
        Messages[] messagesArr = new Messages[(byte) (1660863500 ^ i)];
        messagesArr[(byte) (1660863530 ^ i)] = CONFIG_RELOAD;
        messagesArr[(byte) (1660863531 ^ i)] = USER_NOT_FOUND;
        messagesArr[(byte) (1660863528 ^ i)] = SELF_TELEPORT;
        messagesArr[(byte) (1660863529 ^ i)] = NON_VALID_REQUEST;
        messagesArr[(byte) (1660863534 ^ i)] = TELEPORT_COUNTDOWN;
        messagesArr[(byte) (1660863535 ^ i)] = TELEPORT_COUNTDOWN_ACTIONBAR;
        messagesArr[(byte) (1660863532 ^ i)] = TELEPORT_CANCELLED;
        messagesArr[(byte) (1660863533 ^ i)] = NO_REQUESTS_FOUND;
        messagesArr[(byte) (1660863522 ^ i)] = ACCEPTED_TELEPORT;
        messagesArr[(byte) (1660863523 ^ i)] = TARGET_ACCEPTED_TELEPORT;
        messagesArr[(byte) (1660863520 ^ i)] = RECEIVE_REQUEST;
        messagesArr[(byte) (1660863521 ^ i)] = RECEIVE_HERE_REQUEST;
        messagesArr[(byte) (1660863526 ^ i)] = SENT_REQUEST;
        messagesArr[(byte) (1660863527 ^ i)] = SENT_HERE_REQUEST;
        messagesArr[(byte) (1660863524 ^ i)] = CANCELLED_REQUEST;
        messagesArr[(byte) (1660863525 ^ i)] = CANCELLED_REQUEST_SENDER;
        messagesArr[(byte) (1660863546 ^ i)] = TPA_TOGGLE_ON;
        messagesArr[(byte) (1660863547 ^ i)] = TPA_TOGGLE_OFF;
        messagesArr[(byte) (1660863544 ^ i)] = BLOCK_TPA_REQUEST;
        messagesArr[(byte) (1660863545 ^ i)] = TPAUTO_TOGGLE_ON;
        messagesArr[(byte) (1660863550 ^ i)] = TPAUTO_TOGGLE_OFF;
        messagesArr[(byte) (1660863551 ^ i)] = TPA_HERE_TOGGLE_ON;
        messagesArr[(byte) (1660863548 ^ i)] = TPA_HERE_TOGGLE_OFF;
        messagesArr[(byte) (1660863549 ^ i)] = BLOCK_TPHERE_REQUEST;
        messagesArr[(byte) (1660863538 ^ i)] = REQUEST_COOLDOWN;
        messagesArr[(byte) (1660863539 ^ i)] = CANCEL_REQUESTS;
        messagesArr[(byte) (1660863536 ^ i)] = CANCEL_REQUESTS_FAILED;
        messagesArr[(byte) (1660863537 ^ i)] = TPA_REQUEST_SENDER_ACTIONBAR;
        messagesArr[(byte) (1660863542 ^ i)] = TPA_HERE_REQUEST_SENDER_ACTIONBAR;
        messagesArr[(byte) (1660863543 ^ i)] = TPA_REQUEST_REQUESTER_ACTIONBAR;
        messagesArr[(byte) (1660863540 ^ i)] = TPA_HERE_REQUEST_REQUESTER_ACTIONBAR;
        messagesArr[(byte) (1660863541 ^ i)] = TELEPORT_MOVEMENT_CANCELLATION_ACTION_BAR;
        messagesArr[(byte) (1660863498 ^ i)] = TPA_TOGGLE_ON_ACTIONBAR;
        messagesArr[(byte) (1660863499 ^ i)] = TPA_HERE_TOGGLE_ON_ACTIONBAR;
        messagesArr[(byte) (1660863496 ^ i)] = TPA_TOGGLE_OFF_ACTIONBAR;
        messagesArr[(byte) (1660863497 ^ i)] = TPA_HERE_TOGGLE_OFF_ACTIONBAR;
        messagesArr[(byte) (1660863502 ^ i)] = TPA_AUTO_TOGGLE_ON_ACTIONBAR;
        messagesArr[(byte) (1660863503 ^ i)] = TPA_AUTO_TOGGLE_OFF_ACTIONBAR;
        return messagesArr;
    }

    static {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.service.Enums.Messages.m448clinit():void");
    }

    public static String ojxjmdbcsj(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ nvikzjrqyk[i3 % nvikzjrqyk.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] ohejqsgkpagpldh() {
        return new byte[]{18, 24, 38, 3, 79, 60, 59, 55, 30, 99, 88, 108, Byte.MAX_VALUE, 61, 27, 67, 64, 16, 101, 41, 27, 92, 59, 95, 44, 120, 27, 76, 87, 85, 40, 13, 54, 105, 27, 90, Byte.MAX_VALUE, 26, 80, 107, 120, 11, 33, 111, 18, 37, 38, 14, 81, 90, 64, 90, 12, 50};
    }

    private static byte[] lkrphtobkwmmwam() {
        return new byte[]{-35, -47, 30, 96, 125, 90, 13, 67, 39, 0, 105, 5, 71, 69, 41, 57, 118, 117, 92, 71, 42, 44, 3, 38, 30, 24, 45, 51, 110, 32};
    }

    private static byte[] tppgxyoykkxxrkx() {
        return new byte[]{-35, -47, 30, 64, 125, 122, 13, 99, 39, 32, 105, 119, 71, 101, 41, 25, 118, 85, 92, 53, 42, 12, 3, 6, 30, 56, 45, 19, 110, 0};
    }

    private static byte[] lbclhqdmrjwwquk() {
        return new byte[]{-35, -47, 30, 19, 125, 108, 13, 32, 39, 62, 105, 14, 71, 91, 41, 55, 118, 1, 92, 62, 42, 82, 3, -46, 30, 107, 45, 27, 110, 68, 25, 110, 14, 44, 41, 10, 73, 89, 105, 122, 73, 27, 25, 60, 32, 53, 16, 79, 104, 7, 113, 13, 52, 125, 32, 72, 16, 64, 118, 40, 10, 39, 38, 51, 106, 121, 73, 123, 34, 19, 113, 85, 93, 63, 41, 7, 13, 1, 21, 61, 42, 90, 111, 5, 26, 87, 0, 45, 34, 5, 78, 72, 104, 125, 74, 81, 23, 48, 43, 120, 23, 81, 105, 2, 114, 10, 58, 34};
    }

    private static byte[] uxsemzhsygcgnxm() {
        return new byte[]{-35, -34, 21, Byte.MAX_VALUE, 118, 69, 13, 78, 43, 12, 105, 3, 76, 78, 34, 57, 118, 110, 80, 93, 42, 58, 8, 63, 21, 11, 45, 42, 98, 48, 25, 113, 5, 8, 34, 56};
    }

    private static byte[] coshvonuzweghcp() {
        return new byte[]{-35, -34, 21, 95, 118, 101, 13, 110, 43, 126, 105, 35, 76, 110, 34, 25, 118, 78, 80, 125, 42, 72, 8, 31, 21, 43, 45, 10, 98, 16, 25, 81, 5, 40, 34, 24};
    }

    private static byte[] jjoxmeeasxigshr() {
        return new byte[]{-35, -34, 21, 23, 118, 105, 13, 84, 43, 54, 105, 57, 76, 106, 34, 5, 118, 72, 80, 107, 42, 17, 8, 77, 21, 60, 45, 30, 98, 20, 25, 65, 5, 62, 34, 31, 73, 89, 101, 123, 73, 86, 18, 50, 43, 118, 16, 74, 100, 74, 113, 13, 63, 111, 43, 90, 16, 20, 122, 105, 10, 118, 45, 56, 97, 41, 73, 126, 46, 93};
    }

    private static byte[] dmsecooeteynhvh() {
        return new byte[]{-35, -46, 17, 116, 119, 76, 2, 77, 40, 17, 105, 28, 72, 69, 35, 62, 121, 97, 83, 92, 42, 54, 12, 57, 20, 12, 34, 41, 97, 49, 25, 125, 1, 14, 35, 63};
    }

    private static byte[] kxxtdzlckfjvxdm() {
        return new byte[]{-35, -46, 17, 84, 119, 108, 2, 109, 40, 49, 105, 60, 72, 101, 35, 30, 121, 65, 83, 124, 42, 68, 12, 25, 20, 44, 34, 9, 97, 17, 25, 93, 1, 46, 35, 31};
    }

    private static byte[] gktdkqumrupvczh() {
        return new byte[]{-35, -46, 17, 17, 119, 110, 2, 90, 40, 61, 105, 44, 72, 41, 35, 1, 121, 81, 83, 123, 42, 10, 12, 14, 20, 58, 34, 11, 97, 2, 25, 77, 1, 49, 35, 7, 70, 87, 102, 122, 73, 90, 22, 62, 42, 119, 31, 86, 103, 2, 113, 1, 59, 99, 42, 77, 31, 23, 121, 40, 10, 114, 41, 59, 96, 60, 70, 112, 45, 23, 113, 87, 82, 56, 35, 77, 2, 25, 26, 44, 42, 8, 96, 20, 16, 89, 15, 46, 45, 31, 78, 1};
    }

    private static byte[] apwagbxjodcpoki() {
        return new byte[]{-35, -43, 20, 116, 123, 68, 15, 75, 39, 20, 105, 27, 77, 69, 47, 54, 116, 103, 92, 89, 42, 49, 9, 57, 24, 4, 47, 47, 110, 52, 25, 122, 4, 14, 47, 55, 75, 119, 105, 12, 73, 124, 19, 21, 38, 88, 18, 121, 104, 60};
    }

    private static byte[] pjkwwrplxihkteq() {
        return new byte[]{-35, -43, 20, 84, 123, 100, 15, 107, 39, 52, 105, 59, 77, 101, 47, 22, 116, 71, 92, 121, 42, 67, 9, 25, 24, 36, 47, 15, 110, 20, 25, 90, 4, 46, 47, 23, 75, 5, 105, 44, 73, 92, 19, 53, 38, 120, 18, 89, 104, 28};
    }

    private static byte[] pajcihlahcajvaw() {
        return new byte[]{-35, -43, 20, 17, 123, 102, 15, 32, 39, 39, 105, 50, 77, 104, 47, 3, 116, 71, 92, 111, 42, 75, 9, 75, 24, 41, 47, 31, 110, 18, 25, 31, 4, 57, 47, 6, 75, 75, 105, 51, 73, 80, 19, 53, 38, 121, 18, 88, 104, 78, 113, 17, 62, 105, 38, 84, 18, 67, 118, 40, 10, 113, 44, 50, 108, 57, 75, 106, 34, 7, 113, 77, 87, 111, 47, 17, 15, 77, 21, 62, 42, 27, 101, 16, 28, 65, 2, 62, 34, 29, 78, 92, 98, 113};
    }

    private static byte[] btjluauvedxevws() {
        return new byte[]{-44, -46, 19, 97, 122, 94, 9, 69, 43, 4, 109, 17, 73, 77, 41, 35, 115, 96, 93, 67, 46, 62, 14, 34, 30, 12, 46, 51, 98, 44, 30, 125, 4, 4, 40, 32, 71, 97, 101, 2, 77, 120, 19, 31, 39, 73, 19, 114, 103, 32, 114, 38, 63, 69, 42, 108, 19, 103};
    }

    private static byte[] qdcbvpkypfsqqjm() {
        return new byte[]{-44, -46, 19, 65, 122, 126, 9, 101, 43, 118, 109, 49, 73, 109, 41, 3, 115, 64, 93, 49, 46, 30, 14, 2, 30, 44, 46, 19, 98, 12, 30, 93, 4, 118, 40, 0, 71, 65, 101, 112, 77, 88, 19, 63, 39, 105, 19, 82, 103, 0, 114, 6, 63, 101, 42, 76, 19, 71};
    }

    private static byte[] tzumtqrhlxcqixj() {
        return new byte[]{-44, -46, 19, 19, 122, 57, 9, 93, 43, 52, 109, 44, 73, 47, 41, 3, 115, 64, 93, 60, 46, 4, 14, 2, 30, 60, 46, 84, 98, 1, 30, 91, 4, 56, 40, 10, 71, 95, 101, 41, 77, 80, 19, 50, 39, 122, 19, 27, 103, 27, 114, 24, 63, 111, 42, 72, 19, 71, 122, 107, 9, 36, 43, 41, 109, 60, 73, 121, 41, 4, 115, 64, 93, 111, 46, 30, 14, 30, 30, 101};
    }

    private static byte[] pbamycnoqbzdsxu() {
        return new byte[]{-35, -47, 16, 119, 125, 68, 3, 74, 47, 25, 105, 17, 73, 84, 41, 35, 120, 114, 84, 88, 42, 47, 13, 59, 30, 9, 35, 33, 102, 62, 25, 126, 0, 14, 41, 59, 71, 109, 97, 1, 73, 105};
    }

    private static byte[] ervorhvfhmsmnoc() {
        return new byte[]{-35, -47, 16, 87, 125, 100, 3, 106, 47, 57, 105, 49, 73, 38, 41, 3, 120, 82, 84, 120, 42, 15, 13, 27, 30, 41, 35, 83, 102, 30, 25, 94, 0, 46, 41, 27, 71, 77, 97, 33, 73, 73};
    }

    private static byte[] ehemzoeqmysekes() {
        return new byte[]{-35, -47, 16, 19, 125, 107, 3, 81, 47, 50, 105, 59, 73, Byte.MAX_VALUE, 41, 87, 120, 87, 84, 99, 42, 15, 13, 27, 30, 108, 35, 23, 102, 31, 25, 27, 0, 49, 41, 1, 71, 92, 97, 114, 73, 92, 23, 58, 32, 114, 30, 89, 96, 19, 113, 24, 58, 109, 32, 66, 30, 86, 126, 37, 10, 117, 40, 37, 106, 48, 71, 106, 42, 8, 113, 67, 83, 63, 41, 26, 3, 8, 29, 48, 42, 15, 97, 6, 26, 74, 14, 47, 42, 16, 78, 2};
    }

    private static byte[] divqkhcwawhgiqc() {
        return new byte[]{-37, -45, 16, 96, 125, 73, 2, 72, 47, 17, 108, 10, 72, 64, 43, 40, 115, 117, 82, 66, 45, 40, 9, 32, 21, 30, 42, 53, 99, 55, 31, 123, 6, 31, 40, 60, 72, 96};
    }

    private static byte[] wunspsaoceewhlp() {
        return new byte[]{-37, -45, 16, 64, 125, 105, 2, 104, 47, 49, 108, 42, 72, 96, 43, 8, 115, 85, 82, 48, 45, 8, 9, 0, 21, 62, 42, 21, 99, 23, 31, 91, 6, 63, 40, 28, 72, 64};
    }

    private static byte[] yiymqvsbnlepnkx() {
        return new byte[]{-37, -45, 16, 18, 125, 59, 2, 80, 47, 49, 108, 54, 72, 106, 43, 10, 115, 78, 82, 111, 45, 31, 9, 6, 21, 37, 42, 28, 99, 67, 31, 86, 6, 62, 40, 75, 72, 8, 102, Byte.MAX_VALUE, 74, 11, 24, 108, 35, 113, 18, 9, 102, 14, 112, 6, 63, 38, 37, 88, 16, 93, 125, 97, 2, 97, 47, 113, 108, 124, 72, 56, 43, 90, 115, 82, 82, 120, 45, 8, 9, 0, 21, 37, 42, 31, 99, 16, 31, 17};
    }

    private static byte[] ajnwhiesuphlsvw() {
        return new byte[]{-35, -44, 21, 100, 123, 94, 15, 64, 39, 11, 105, 13, 76, 75, 47, 32, 116, 115, 92, 91, 42, 60, 8, 56, 24, 21, 47, 41, 110, 39, 25, 112, 5, 30, 47, 45, 75, 126, 105, 3, 73, 121, 18, 31, 38, 67, 18, 113, 104, 34, 113, 39, 63, 67, 38, 107, 18, 103};
    }

    private static byte[] ooefxykwkbloxhn() {
        return new byte[]{-35, -44, 21, 68, 123, 126, 15, 96, 39, 121, 105, 45, 76, 107, 47, 0, 116, 83, 92, 123, 42, 28, 8, 24, 24, 103, 47, 9, 110, 7, 25, 80, 5, 62, 47, 13, 75, 94, 105, 113, 73, 89, 18, 63, 38, 99, 18, 81, 104, 2, 113, 7, 63, 99, 38, 75, 18, 71};
    }

    private static byte[] kgknhajyjprhund() {
        return new byte[]{-35, -44, 21, 22, 123, 57, 15, 88, 39, 59, 105, 42, 76, 46, 47, 2, 116, 67, 92, 112, 42, 27, 8, 76, 24, 108, 47, 89, 110, 82, 25, 14, 5, 57, 47, 89, 75, 74, 105, 57, 73, 29, 18, 44, 38, 123, 18, 89, 104, 20, 113, 12, 63, 115, 38, 15, 18, 19, 118, 60, 10, 36, 45, 49, 108, 126, 75, Byte.MAX_VALUE, 34, 17, 113, 79, 86, Byte.MAX_VALUE, 47, 30, 15, 6, 21, 61, 42, 11, 100, 70, 28, 77, 2, 58, 34, 28, 78, 92, 99, 61, 76, 74, 21, 45, 43, 60};
    }

    private static byte[] lutzfkpdlicckao() {
        return new byte[]{-44, -44, 31, 110, 120, 85, 3, 78, 40, 4, 107, 1, 70, 69, 34, 60, 120, 97, 93, 86, 34, 32, 12, 57, 20, 15, 45, 58, 100, 51, 17, 123, 15, 18, 35, 56, 71, 96, 105, 29, 79, 124, 25, 21, 36, 92, 21, 101};
    }

    private static byte[] cyjvitqlezvusps() {
        return new byte[]{-44, -44, 31, 78, 120, 117, 3, 110, 40, 118, 107, 33, 70, 101, 34, 28, 120, 65, 93, 118, 34, 0, 12, 75, 20, 47, 45, 26, 100, 65, 17, 91, 15, 50, 35, 24, 71, 64, 105, 61, 79, 92, 25, 53, 36, 124, 21, 69};
    }

    private static byte[] yojixlsxgdqkkob() {
        return new byte[]{-44, -44, 31, 28, 120, 50, 3, 86, 40, 52, 107, 32, 70, 45, 34, 9, 120, 67, 93, 58, 34, 11, 12, 9, 20, 55, 45, 84, 100, 13, 17, 89, 15, 50, 35, 9, 71, 89, 105, 38, 79, 91, 25, 57, 36, 122, 21, 23, 104, 25, 121, 18, 52, 101, 42, 11, 31, 72, 120, 96, 3, 126, 40, 46, 107, 48, 70, 121, 34, 15, 120, 85, 93, 52};
    }

    private static byte[] iexvrgkharbudid() {
        return new byte[]{-35, -48, 21, 103, 121, 90, 3, 65, 42, 8, 105, 26, 76, 88, 45, 33, 120, 104, 81, 66, 42, 63, 8, 32, 26, 9, 35, 60, 99, 45, 25, Byte.MAX_VALUE, 5, 6, 45, 35, 71, 107, 100, 25, 73, 99, 18, 30, 36, 80, 30, 109, 101, 39, 113, 34, 63, 76, 36, 108, 30, 117, 123, 90};
    }

    private static byte[] brsiuyvfpsziuxo() {
        return new byte[]{-35, -48, 21, 71, 121, 122, 3, 97, 42, 122, 105, 58, 76, 120, 45, 1, 120, 72, 81, 48, 42, 3, 8, 10, 26, 60, 35, 30, 99, 76, 25, 78, 5, 54, 45, 11, 71, 74, 100, 51, 73, 89, 18, 114, 36, 124, 30, 95, 101, 8, 113, 64, 63, 99, 36, 77, 30, 64, 123, 97, 10, 111, 45, 61, 110, 56, 71, 107, 47, 5};
    }

    private static byte[] dctnrelmstuwews() {
        return new byte[]{-35, -48, 21, 21, 121, 61, 3, 89, 42, 56, 105, 46, 76, 42, 45, 7, 120, 66, 81, 61, 42, 5, 8, 0, 26, 110, 35, 23, 99, 14, 25, 84, 5, 62, 45, 9, 71, 95, 100, Byte.MAX_VALUE, 73, 93, 18, 60, 36, 112, 30, 92, 101, 30, 113, 25, 63, 107, 36, 64, 30, 83, 123, 40, 10, 97, 45, 63, 110, 54, 71, 42, 47, 3, 113, 66, 86, 117, 45, 15, 3, 24, 24, 35, 42, 9, 100, 17, 30, 27, 14, 44, 47, 11, 78, 92, 99, 46, 78, 88, 25, 43, 38, 101, 23, 74, 98, 68};
    }

    private static byte[] knpualrhevxkzmb() {
        return new byte[]{-38, -41, 16, 103, 119, 78, 14, 73, 47, 19, 104, 5, 72, 81, 44, 51, 114, 109, 83, 92, 45, 59, 3, 39, 25, 24, 42, 46};
    }

    private static byte[] gnutnjusdovvflv() {
        return new byte[]{-38, -41, 16, 71, 119, 110, 14, 105, 47, 51, 104, 119, 72, 113, 44, 19, 114, 77, 83, 124, 45, 27, 3, 7, 25, 56, 42, 14};
    }

    private static byte[] rftwjsupnzbswxo() {
        return new byte[]{-38, -41, 16, 18, 119, 110, 14, 35, 47, 57, 104, 14, 72, 85, 44, 55, 114, 1, 83, 63, 45, 83, 3, -45, 25, 108, 42, 28, 103, 67, 31, 108, 1, 51, 41, 30, 73, 10, 102, 63, 64, 93, 20, 51, 35, 125, 22, 87, 102, 22, 119, 79, 62, 119, 36, 77, 16, 88, 119, 110, 14, 117, 47, 58, 104, 40, 72, 113, 44, 86, 114, 85, 83, 118, 45, 75, 3, 17, 25, 37, 42, 15, 103, 17, 31, 70, 1, 57, 41, 7, 73, 76, 102, 125};
    }

    private static byte[] jwrvcxnlfnvronx() {
        return new byte[]{-39, -46, 22, 96, 125, 95, 14, 71, 43, 9, 104, 19, 77, 75, 46, 32, 117, 96, 85, 65, 41, 59, 14, 33, 25, 10, 43, 60, 101, 42, 29, 121, 3, 3, 43, 34, 77, 103};
    }

    private static byte[] itkojnmwxasadmy() {
        return new byte[]{-39, -46, 22, 64, 125, Byte.MAX_VALUE, 14, 103, 43, 123, 104, 51, 77, 107, 46, 0, 117, 64, 85, 51, 41, 27, 14, 1, 25, 42, 43, 28, 101, 10, 29, 89, 3, 113, 43, 2, 77, 71};
    }

    private static byte[] lnzvgwcwpfzefgo() {
        return new byte[]{-39, -46, 22, 18, 125, 110, 14, 95, 43, 57, 104, 46, 77, 41, 46, 0, 117, 64, 85, 62, 41, 1, 14, 1, 25, 58, 43, 91, 101, 7, 29, 95, 3, 63, 43, 8, 77, 89, 101, 46, 77, 87, 17, 54, 32, 113, 19, 31, 100, 27, 112, 29, 62, 105, 39, 76, 19, 68, Byte.MAX_VALUE, 110, 9, 36, 43, 32, 109, 60, 79, 123, 41, 5, 117, 68, 80, 111, 43, 31, 9, 31, 25, 103};
    }

    private static byte[] dgahupoqfjqeixp() {
        return new byte[]{-35, -43, 18, 99, 120, 76, 12, 80, 41, 6, 105, 27, 75, 92, 44, 34, 119, 121, 82, 90, 42, 33, 15, 34, 27, 1, 44, 62, 96, 42, 25, 104, 2, 21};
    }

    private static byte[] etnadxtcdzdfwtg() {
        return new byte[]{-35, -43, 18, 67, 120, 108, 12, 112, 41, 38, 105, 59, 75, 124, 44, 2, 119, 11, 82, 122, 42, 1, 15, 2, 27, 33, 44, 30, 96, 10, 25, 72, 2, 53};
    }

    private static byte[] fvsxmcgjkbfavbb() {
        return new byte[]{-35, -43, 18, 23, 120, 106, 12, 88, 41, 60, 105, 43, 75, 40, 44, 4, 119, 67, 82, 57, 42, 1, 15, 3, 27, 109, 44, 25, 96, 10, 25, 80, 2, 55, 44, 11, 72, 67, 103, 44, 73, 87, 21, 125, 37, 118, 17, 87, 102, 24, 113, 72, 56, 115, 37, 72, 17, 91, 120, 104, 10, 108, 42, 63, 111, 62, 72, 43, 44, 1, 113, 71, 81, 106, 44, 28, 12, 12, 27, 59, 42, 10, 99, 20, 31, 24, 1, 43, 44, 5, 78, 8, 100, 45, 79, 86, 22, 48, 37, 102, 23, 28, 101, 24, 119, 3, 59, 101, 37, 81, 23, 84, 123, 124, 12, 44};
    }

    private static byte[] jzcuqoslvtbzmnf() {
        return new byte[]{-37, -43, 18, 97, 122, 92, 12, 68, 41, 14, 108, 18, 74, 72, 44, 35, 119, 103, 81, 64, 46, 62, 12, 40, 27, 27, 47, 47, 98, 32, 31, 108, 1, 15, 47, 51, 74, 120, 103, 28, 79, 104, 21, 12, 39, 80, 17, 111, 102, 60, 116, 41, 57, 80, 37, 117, 17, 112, 123, 73, 14, 83, 41, 24, 111, 17, 75, 69, 46, 49, 119, 99, 82, 73};
    }

    private static byte[] xctbdzxacbrprqg() {
        return new byte[]{-37, -43, 18, 65, 122, 124, 12, 100, 41, 124, 108, 50, 74, 104, 44, 3, 119, 71, 81, 50, 46, 30, 12, 8, 27, 59, 47, 15, 98, 0, 31, 76, 1, 47, 47, 65, 74, 88, 103, 60, 79, 72, 21, 44, 39, 112, 17, 79, 102, 28, 116, 9, 57, 112, 37, 7, 17, 80, 123, 105, 14, 115, 41, 56, 111, 49, 75, 101, 46, 17, 119, 67, 82, 105};
    }

    private static byte[] arhgtfnxdzdaotb() {
        return new byte[]{-37, -43, 18, 19, 122, 47, 12, 53, 41, 97, 108, 57, 74, 60, 44, 23, 119, 71, 81, 58, 46, 28, 12, 1, 27, 43, 47, 3, 98, 0, 31, 77, 1, 126, 47, 76, 74, 12, 103, 110, 79, 74, 21, 60, 39, 123, 17, 72, 102, 72, 116, 21, 57, 109, 37, 95, 17, 17, 123, 107, 14, 39, 41, 37, 111, 46, 75, 99, 46, 22, 119, 80, 82, 126, 47, 74, 14, 29, 27, 47, 44, 15, 99, 22, 29, 88, 1, 40, 44, 28, 75, 2};
    }

    private static byte[] vquijatzelhazgi() {
        return new byte[]{-38, -34, 31, 100, Byte.MAX_VALUE, 72, 10, 73, 38, 16, 97, 5, 76, 66, 42, 32, 114, 124, 83, 79, 34, 34, 11, 33, 29, 28, 35, 63, 110, 33, 27, 120, 7, 22, 41, 54, 73, 124, 105, 27, 72, 123, 16, 19, 42, 80, 31, 114, 98, 38, 113, 39, 62, 75, 36, 117, 31, 121, Byte.MAX_VALUE, 66, 10, 75, 38, 10, 97, 20, 76, 78, 42, 38, 114, 97, 83, 95, 34, 33, 11, 49, 29, 8, 35, 59, 110, 62};
    }

    private static byte[] gcromapowiesmsd() {
        return new byte[]{-38, -34, 31, 68, Byte.MAX_VALUE, 104, 10, 105, 38, 48, 97, 37, 76, 98, 42, 0, 114, 92, 83, 61, 34, 2, 11, 1, 29, 60, 35, 31, 110, 1, 27, 88, 7, 54, 41, 22, 73, 14, 105, 59, 72, 91, 16, 51, 42, 112, 31, 82, 98, 6, 113, 7, 62, 107, 36, 85, 31, 89, Byte.MAX_VALUE, 98, 10, 107, 38, 120, 97, 52, 76, 110, 42, 6, 114, 65, 83, Byte.MAX_VALUE, 34, 1, 11, 67, 29, 40, 35, 27, 110, 30};
    }

    private static byte[] lasdntljweguyfg() {
        return new byte[]{-38, -34, 31, 22, Byte.MAX_VALUE, 110, 10, 81, 38, 48, 97, 57, 76, 104, 42, 2, 114, 71, 83, 98, 34, 27, 11, 15, 29, 62, 35, 19, 110, 3, 27, 83, 7, 120, 41, 10, 73, 66, 105, 43, 72, 26, 16, 63, 42, 118, 31, 82, 98, 4, 113, 75, 62, 105, 36, 64, 31, 94, Byte.MAX_VALUE, 110, 10, 96, 38, 57, 97, 48, 76, 105, 42, 82, 114, 73, 83, 99, 34, 79, 11, 23, 29, 37, 35, 15, 110, 76, 27, 85, 7, 57, 41, 20, 73, 70, 105, 120, 72, 87, 16, 50, 42, 101, 31, 82, 98, 14, 113, 74};
    }

    private static byte[] halrsvfwxvjnpuf() {
        return new byte[]{-40, -45, 31, 112, 124, 71, 3, 73, 39, 17, 108, 28, 79, 73, 47, 36, 112, 123, 81, 88, 34, 32, 8, 36, 20, 9, 34, 60};
    }

    private static byte[] ngimrpvyifwiiyl() {
        return new byte[]{-40, -45, 31, 80, 124, 103, 3, 105, 39, 49, 108, 60, 79, 105, 47, 86, 112, 91, 81, 120, 34, 0, 8, 4, 20, 41, 34, 28};
    }

    private static byte[] jblyhayzxlhggyd() {
        return new byte[]{-40, -45, 31, 21, 124, 105, 3, 85, 39, 50, 108, 57, 79, 97, 47, 26, 112, 77, 81, 120, 34, 8, 8, 75, 20, 59, 34, 13, 99, 15, 24, 93, 2, 52, 43, 16, 75, 93, 105, 61, 75, 74, 25, 51, 43, 125, 18, 78, 97, 73, 116, 11, 60, 101, 38, 12, 31, 22, 124, 101, 3, 116, 39, 114, 108, 56, 79, 125, 47, 85};
    }

    private static byte[] okhcosbnkkeqoki() {
        return new byte[]{-35, -46, 31, 100, 120, 88, 12, 67, 41, 8, 105, 13, 70, 65, 44, 48, 119, 98, 82, 81, 42, 44, 2, 51, 27, 3, 44, 55};
    }

    private static byte[] knkrlmupmjidino() {
        return new byte[]{-35, -46, 31, 68, 120, 120, 12, 99, 41, 122, 105, 45, 70, 97, 44, 16, 119, 66, 82, 113, 42, 12, 2, 65, 27, 35, 44, 23};
    }

    private static byte[] nedighyoqbyzrmk() {
        return new byte[]{-35, -46, 31, 22, 120, 105, 12, 91, 41, 56, 105, 44, 70, 41, 44, 5, 119, 64, 82, 61, 42, 7, 2, 3, 27, 59, 44, 89, 96, 0, 25, 91, 15, 57, 44, 11, 72, 95, 103, 43, 73, 87, 24, 50, 37, 118, 17, 27, 102, 26, 113, 31, 53, 96, 37, 12, 17, 68, 120, 109, 10, 115, 39, 37, 111, 61, 72, 123, 44, 3, 113, 86, 92, 52, 44, 72, 12, 76, 27, 123, 42, 81, 110, 73, 31, 77, 1, 44, 44, 15, 78, 71, 105, 61, 79, 77, 22, 63, 37, 101, 23, 84, 104, 14, 119, 9, 59, 107, 37, 73, 23, 22, 118, 105, 12, 108, 41, 36, 111, 120, 78, 124, 34, 0, 119, 76, 82, 121, 44, 26, 10, 15, 21, 98};
    }

    private static byte[] bzltlpmofaqflte() {
        return new byte[]{-44, -34, 19, 98, 123, 93, 13, 67, 39, 14, 97, 13, 74, 70, 42, 42, 117, 125, 93, 95, 46, 46, 15, 41, 26, 1, 34, 49, 110, 63, 29, 118, 7, 25, 46, 37};
    }

    private static byte[] bzmndnccqueerlg() {
        return new byte[]{-44, -34, 19, 66, 123, 125, 13, 99, 39, 118, 97, 56, 74, 124, 42, 1, 117, 70, 93, 61, 46, 29, 15, 1, 26, 42, 34, 19, 110, 12, 29, 92, 7, 114, 46, 12, 71, 69, 101, 56};
    }

    private static byte[] tkzbspplbcgodgv() {
        return new byte[]{-44, -34, 19, 16, 123, 108, 13, 91, 39, 52, 97, 44, 74, 46, 42, 7, 117, 76, 93, 48, 46, 7, 15, 1, 26, 109, 34, 24, 110, 15, 29, 87, 7, 56, 46, 6, 71, 81, 101, 126, 76, 91, 23, 47, 43, 105, 31, 84, 100, 78, 113, 13, 57, 104, 42, 66, 19, 83, 123, 125, 13, 118, 39, 50, 97, 55, 74, 110, 42, 85, 117, 93, 93, 96, 46, 8, 15, 78, 26, 63, 34, 17, 110, 17, 29, 76, 7, 58, 46, 16, 71, 87, 101, 45, 76, 20, 23, 122, 43, 59, 31, 12, 100, 70, 113, 67, 57, Byte.MAX_VALUE, 42, 81, 19, 87, 123, 120, 13, 118, 39, 52, 97, 121, 74, 111, 42, 26, 117, 91, 93, 48, 46, 29, 15, 30, 26, 44, 34, 1, 110, 20, 29, 86, 7, 118};
    }

    private static byte[] dthfcnnrwqclujg() {
        return new byte[]{-34, -42, 20, 116, 125, 67, 8, 74, 39, 17, 106, 22, 77, 87, 41, 36, 115, 114, 92, 89, 41, 50, 9, 56, 30, 14, 40, 47, 110, 49, 26, 121, 4, 15, 41, 61};
    }

    private static byte[] hshccxztjparxyx() {
        return new byte[]{-34, -42, 20, 84, 125, 99, 8, 106, 39, 49, 106, 54, 77, 37, 41, 4, 115, 82, 92, 121, 41, 64, 9, 24, 30, 46, 40, 15, 110, 17, 26, 89, 4, 47, 41, 29};
    }

    private static byte[] hzpdekdapuuflod() {
        return new byte[]{-34, -42, 20, 16, 125, 108, 8, 81, 39, 58, 106, 60, 77, 124, 41, 80, 115, 87, 92, 107, 41, 8, 9, 24, 30, 107, 40, 23, 110, 23, 26, 28, 4, 50, 41, 6, 76, 92, 105, 122, 74, 91, 19, 57, 32, 117, 21, 89, 104, 27, 114, 31, 62, 110, 32, 69, 21, 86, 118, 45, 9, 114, 44, 38, 106, 62, 76, 47, 34, 0, 114, 68, 87, 109, 41, 26, 8, 8, 21, 58, 41, 9, 101, 19, 26, 16};
    }

    private static byte[] svnzellyvduwhcb() {
        return new byte[]{-40, -43, 17, 96, 122, 85, 12, 64, 44, 8, 106, 19, 72, 77, 34, 38, 118, 103, 81, 68, 44, 63, 14, 41, 27, 9, 41, 63, 101, 46, 31, 125, 15, 1, 45, 39, 75, 110, 103, 26};
    }

    private static byte[] byldyzwcitmgnpk() {
        return new byte[]{-40, -43, 17, 64, 122, 117, 12, 96, 44, 122, 106, 51, 72, 109, 34, 6, 118, 71, 81, 54, 44, 31, 14, 9, 27, 41, 41, 31, 101, 14, 31, 93, 15, 115, 45, 7, 75, 78, 103, 58};
    }

    private static byte[] tqnuljzdtspqwku() {
        return new byte[]{-40, -43, 17, 18, 122, 100, 12, 88, 44, 56, 106, 46, 72, 47, 34, 6, 118, 71, 81, 59, 44, 5, 14, 9, 27, 110, 41, 20, 101, 13, 31, 86, 15, 57, 45, 13, 75, 90, 103, 124, 77, 83, 22, 58, 32, 114, 20, 92, 102, 31, 121, 25, 58, 105, 38, 68, 17, 83, 122, 37, 12, 117, 44, 39, 106, 51, 72, 109, 34, 6, 118, 71, 81, 59, 44, 25, 14, 3, 27, 63, 41, 13, 101, 7, 31, 75, 15, 42, 45, 27, 75, 6};
    }

    private static byte[] jaqsnoqhaxfvxtk() {
        return new byte[]{-40, -33, 17, 96, 123, 94, 11, 64, 43, 8, 96, 26, 72, 92, 41, 39, 118, 106, 81, 78, 44, 63, 15, 34, 28, 9, 46, 63, 111, 46, 31, 124, 4, 6, 45, 32, 75, 108, 103, 3, 76, 120, 17, 26, 39, 69, 30, 112, 102, 33, 114, 36, 58, 69, 38, 97, 17, 102};
    }

    private static byte[] qgknjpuphhwuaxt() {
        return new byte[]{-40, -33, 17, 64, 123, 126, 11, 96, 43, 122, 96, 58, 72, 124, 41, 7, 118, 74, 81, 60, 44, 31, 15, 2, 28, 41, 46, 31, 111, 14, 31, 92, 4, 116, 45, 0, 75, 76, 103, 113, 76, 88, 17, 58, 39, 101, 30, 80, 102, 1, 114, 4, 58, 101, 38, 65, 17, 70};
    }

    private static byte[] nhjmomgmdkcychd() {
        return new byte[]{-40, -33, 17, 18, 123, 57, 11, 88, 43, 56, 96, 46, 72, 46, 41, 1, 118, 64, 81, 49, 44, 5, 15, 2, 28, 57, 46, 88, 111, 3, 31, 90, 4, 58, 45, 10, 75, 82, 103, 40, 76, 80, 17, 55, 39, 118, 30, 25, 102, 15, 114, 6, 58, 107, 38, 0, 17, 64, 123, 107, 11, 109, 43, 50, 96, 43, 72, 102, 41, 1, 118, 81, 81, 49, 44, 25, 15, 8, 28, 63, 46, 13, 111, 7, 31, 74, 4, 45, 45, 28, 75, 12};
    }

    private static byte[] dknoqshblkqywjl() {
        return new byte[]{-39, -42, 20, 99, 122, 78, 8, 78, 44, 19, 105, 14, 75, 71, 44, 34, 117, 118, 80, 71, 41, 43, 14, 39, 31, 24, 41, 55, 102, 51, 28, 124, 1, 21, 46, 63, 74, 101, 98, 0, 77, 125, 18, 25, 32, 68, 23, 117, 101, 32, 119, 39, 57, 66, 39, 104, 20, 101};
    }

    private static byte[] dnzudtbytpmdzoe() {
        return new byte[]{-39, -42, 20, 67, 122, 110, 8, 110, 44, 51, 105, 46, 75, 103, 44, 2, 117, 86, 80, 53, 41, 11, 14, 7, 31, 56, 41, 23, 102, 19, 28, 92, 1, 53, 46, 31, 74, 69, 98, 114, 77, 93, 18, 57, 32, 100, 23, 85, 101, 0, 119, 7, 57, 98, 39, 72, 20, 69};
    }

    private static byte[] dsfbltcxytmucar() {
        return new byte[]{-39, -42, 20, 17, 122, 60, 8, 86, 44, 51, 105, 50, 75, 109, 44, 0, 117, 77, 80, 106, 41, 28, 14, 1, 31, 35, 41, 30, 102, 71, 28, 81, 1, 52, 46, 72, 74, 13, 98, 124, 77, 12, 18, 106, 32, 115, 23, 13, 101, 9, 119, 12, 57, 37, 39, 93, 20, 94, 122, 102, 8, 103, 44, 115, 105, 120, 75, 63, 44, 80, 117, 81, 80, 125, 41, 11, 14, 7, 31, 35, 41, 29, 102, 20, 28, 22};
    }

    private static byte[] tncuefadzsfncmh() {
        return new byte[]{-39, -48, 23, 117, 123, 73, 3, 70, 45, 19, 111, 13, 72, 93, 45, 62, 114, 103, 80, 65, 42, 63, 15, 44, 20, 6, 40, 60, 96, 52, 31, 118, 0, 3, 41, 61};
    }

    private static byte[] kjwwcxdeisbwxwe() {
        return new byte[]{-39, -48, 23, 85, 123, 105, 3, 102, 45, 51, 111, 45, 72, 125, 45, 30, 114, 71, 80, 51, 42, 31, 15, 12, 20, 38, 40, 28, 96, 20, 31, 86, 0, 35, 41, 29};
    }

    private static byte[] nbbimuapskfupmi() {
        return new byte[]{-39, -48, 23, 18, 123, 61, 3, 92, 45, 57, 111, 40, 72, 41, 45, 26, 114, 64, 80, 125, 42, 14, 15, 25, 20, 62, 40, 28, 96, 0, 31, 25, 0, 37, 41, 1, 74, 68, 97, 47, 76, 29, 25, 41, 33, 117, 17, 83, 102, 11, 118, 18, 62, 110, 39, 93, 23, 64, 123, 36};
    }

    private static byte[] iczxgkyrpmndpqo() {
        return new byte[]{-40, -41, 21, 102, 121, 74, 14, 79, 40, 3, 104, 0, 73, 89, 40, 51, 118, 119, 81, 76, 40, 47, 13, 63, 25, 26};
    }

    private static byte[] gjqsmuzorstjiiy() {
        return new byte[]{-40, -41, 21, 70, 121, 106, 14, 111, 40, 35, 104, 114, 73, 121, 40, 19, 118, 87, 81, 108, 40, 15, 13, 31, 25, 58};
    }

    private static byte[] oxijmaqnzoetfjw() {
        return new byte[]{-40, -41, 21, 19, 121, 56, 14, 88, 40, 56, 104, 42, 73, 43, 40, 5, 118, 67, 81, 119, 40, 30, 13, 76, 25, 104, 45, 91, 103, 86, 30, 11, 5, 63, 45, 93, 75, 76, 99, 56, 78, 29, 20, 41, 36, 125, 22, 92, 103, 21, 115, 10, 58, 118, 38, 13, 21, 19, 121, 56, 14, 33, 40, 54, 104, Byte.MAX_VALUE, 73, Byte.MAX_VALUE, 40, 19, 118, 74, 81, 124, 40, 26, 13, 3, 25, 60, 45, 12, 103, 70, 30, 73, 5, 57, 45, 29, 75, 95, 99, 56, 78, 75, 20, 45, 36, 63, 22, 29, 103, 74, 115, 12, 58, 80, 38, 64, 21, 92, 121, 124, 14, 33, 40, 35, 104, 58, 73, 103, 40, 19, 118, 86, 81, 118, 40, 24, 13, 24, 25, 110, 45, 10, 103, 3, 30, 74, 5, 41, 45, 9, 75, 89, 99, 41, 78, 24, 20, 52, 36, 120, 22, 90, 103, 4, 115, 27, 58, 36, 38, 74, 21, 80, 121, 47, 14, 96, 40, 119, 104, 43, 73, 123, 40, 86, 118, 82, 81, 107, 40, 11, 13, 28, 25, 96};
    }

    private static byte[] pzudkahbdvcqrqf() {
        return new byte[]{-44, -42, 21, 118, 125, 76, 3, 73, 40, 24, 105, 26, 73, 67, 42, 36, 112, 116, 93, 93, 40, 59, 9, 59, 20, 13, 45, 39, 102, 50, 30, 108};
    }

    private static byte[] jvffoiwjznccngr() {
        return new byte[]{-44, -42, 21, 86, 125, 108, 3, 105, 40, 56, 105, 58, 73, 99, 42, 86, 112, 84, 93, 125, 40, 27, 9, 27, 20, 45, 45, 7, 102, 18, 30, 76};
    }

    private static byte[] gkbtqkqxxmfhykc() {
        return new byte[]{-44, -42, 21, 19, 125, 110, 3, 94, 40, 52, 105, 42, 73, 40, 42, 13, 112, 67, 93, 56, 40, 9, 9, 15, 20, 38, 45, 23, 102, 3, 30, 83, 7, 61, 43, 9, 71, 79, 99, 125, 74, 91, 25, 51, 36, 113, 23, 29, 103, 7, 113, 4, 60, 36, 42, 93, 21, 93, 125, 104, 3, 39, 40, 15, 105, 15, 73, 78, 42, 91, 112, 84, 93, 125, 40, 27, 9, 27, 20, 45, 45, 7, 102, 18, 30, 76, 7, Byte.MAX_VALUE};
    }

    private static byte[] imagtzmswazpopk() {
        return new byte[]{-38, -46, 22, 121, 125, 75, 12, 73, 43, 22, 109, 25, 70, 67, 45, 43, 112, 119, 83, 89, 43, 52, 9, 60, 27, 13, 46, 41, 98, 49, 17, 108, 0, 1, 43, 41, 73, 110, 96, 27, 74, 113, 22, 26, 39, 87};
    }

    private static byte[] cyvikasgwovbjjf() {
        return new byte[]{-38, -46, 22, 89, 125, 107, 12, 105, 43, 54, 109, 57, 70, 99, 45, 89, 112, 87, 83, 121, 43, 20, 9, 28, 27, 45, 46, 9, 98, 17, 17, 76, 0, 115, 43, 9, 73, 78, 96, 59, 74, 81, 22, 58, 39, 119};
    }

    private static byte[] yycwvyjcrnzfcag() {
        return new byte[]{-38, -46, 22, 28, 125, 105, 12, 94, 43, 58, 109, 41, 70, 47, 45, 16, 112, 76, 83, 120, 43, 69, 9, 7, 27, 39, 46, 14, 98, 69, 17, 82, 0, 63, 43, 4, 73, 74, 96, 114, 74, 92, 22, 49, 39, 106, 19, 30, 104, 60, 118, 61, 60, 70, 36, 13, 22, 72, 125, 111, 12, 118, 43, 32, 109, 57, 70, 124, 45, 0, 112, 86, 83, 60, 43, 17, 9, 6, 27, 104, 46, 25, 98, 4, 17, 81, 0, 61, 43, 10, 73, 67, 96, 124};
    }

    private static byte[] vocrnimygczxsao() {
        return new byte[]{-35, -48, 30, 124, 118, 75, 12, 95, 42, 6, 105, 30, 71, 93, 34, 46, 119, 98, 81, 77, 42, 63, 3, 61, 21, 31, 44, 61, 99, 45, 25, 111, 14, 22, 34, 38};
    }

    private static byte[] xhchrovhxfvyser() {
        return new byte[]{-35, -48, 30, 92, 118, 107, 12, 45, 42, 38, 105, 62, 71, 125, 34, 14, 119, 66, 81, 109, 42, 31, 3, 29, 21, 109, 44, 29, 99, 13, 25, 79, 14, 54, 34, 6};
    }

    private static byte[] pblyyfarwogedyn() {
        return new byte[]{-35, -48, 30, 20, 118, 103, 12, 68, 42, 59, 105, 62, 71, Byte.MAX_VALUE, 34, 91, 119, 73, 81, 113, 42, 31, 3, 78, 21, 40, 44, 26, 99, 20, 25, 95, 14, 120, 34, 3, 72, 67, 100, 37, 73, 28, 25, 42, 43, 120, 17, 85, 101, 8, 113, 29, 52, 108, 43, 82, 17, 64, 123, 43, 10, 114, 38, 55, 97, 37, 72, Byte.MAX_VALUE, 47, 17, 113, 84, 93, 108, 34, 23, 12, 70};
    }

    private static byte[] xnvqzugtbxgdmxa() {
        return new byte[]{-35, -42, 16, 97, 126, 92, 8, 79, 38, 14, 105, 9, 73, 68, 42, 52, 115, 110, 93, 87, 42, 40, 13, 54, 29, 7, 40, 51, 111, 33};
    }

    private static byte[] ipqobtkvgtsmxbh() {
        return new byte[]{-35, -42, 16, 65, 126, 124, 8, 111, 38, 124, 105, 41, 73, 100, 42, 20, 115, 78, 93, 119, 42, 8, 13, 68, 29, 39, 40, 19, 111, 1};
    }

    private static byte[] ttatdosunhmdeaw() {
        return new byte[]{-35, -42, 16, 19, 126, 109, 8, 87, 38, 62, 105, 40, 73, 44, 42, 1, 115, 76, 93, 59, 42, 3, 13, 6, 29, 104, 40, 25, 111, 8, 25, 82, 0, 56, 42, 15, 76, 81, 104, 121, 73, 91, 23, 58, 35, 118, 21, 82, 105, 24, 113, 31, 58, 109, 35, 70, 21, 93, 119, 46, 10, 114, 40, 37, 105, 61, 76, 36, 35, 3, 113, 68, 83, 110, 42, 25, 8, 3, 20, 57, 42, 9, 97, 16, 25, 19, 5, 112, 35, 78, 78, 28, 102, 117, 73, 20, 18, 34, 42, 103, 23, 94, 103, 4, 113, 15, 63, 121, 42, 79, 23, 70, 121, 101, 10, 96, 45, 61, 96, 50, 78, 105, 45, 85, 113, 70, 86, Byte.MAX_VALUE, 35, 28, 10, 78, 26, 58, 42, 12, 100, 4, 16, 90, 7, 42, 45, 9, 78, 3};
    }

    private static byte[] efuosmggvjvyotr() {
        return new byte[]{-34, -41, 17, 96, 124, 76, 8, 77, 47, 17, 106, 12, 72, 69, 40, 36, 115, 114, 84, 65, 41, 47, 12, 41, 31, 3, 40, 57, 102, 39, 26, 113, 1, 18, 40, 42, 76, 104};
    }

    private static byte[] stdfbdrqgprtwfw() {
        return new byte[]{-34, -41, 17, 64, 124, 108, 8, 109, 47, 49, 106, 44, 72, 101, 40, 4, 115, 82, 84, 51, 41, 15, 12, 9, 31, 35, 40, 25, 102, 7, 26, 81, 1, 50, 40, 10, 76, 72};
    }

    private static byte[] flxkzvzkpnzwpue() {
        return new byte[]{-34, -41, 17, 18, 124, 106, 8, 85, 47, 49, 106, 48, 72, 111, 40, 6, 115, 73, 84, 108, 41, 24, 12, 72, 31, 37, 40, 27, 102, 17, 26, 29, 1, 60, 40, 10, 76, 73, 97, 50, 74, 27, 22, 59, 33, 113, 21, 86, 96, 14, 114, 15, 59, 105, 33, 65, 21, 80, 126, 111, 9, 38};
    }

    private static byte[] bsiolveexxediwp() {
        return new byte[]{-43, -48, 17, 100, 123, 79, 9, 84, 39, 29, 111, 30, 76, 93, 41, 46, 113, 104, 92, 93, 44, 44, 15, 40, 30, 25, 34, 33, 96, 39, 27, 125, 4, 4, 42, 55, 70, 104, 103, 20, 76, 124, 19, 14, 43, 83, 17, 107, 98, 58};
    }

    private static byte[] ulajdsgxpjqjbpn() {
        return new byte[]{-43, -48, 17, 68, 123, 111, 9, 116, 39, 61, 111, 62, 76, 125, 41, 92, 113, 72, 92, 125, 44, 12, 15, 8, 30, 57, 34, 1, 96, 7, 27, 93, 4, 118, 42, 23, 70, 72, 103, 52, 76, 92, 19, 46, 43, 115, 17, 75, 98, 26};
    }

    private static byte[] csawbldkgaqnlvn() {
        return new byte[]{-43, -48, 17, 22, 123, 60, 9, 35, 39, 42, 111, 55, 76, 104, 41, 8, 113, 76, 92, 108, 44, 74, 15, 77, 30, 111, 34, 66, 96, 3, 27, 90, 4, 56, 42, 6, 70, 93, 103, 44, 76, 92, 19, 58, 43, 60, 17, 64, 98, 1, 114, 29, 61, 121, 43, 15, 17, 66, 123, 107, 9, 119, 39, 47, 111, 62, 76, 122, 41, 5, 113, 7};
    }

    private static byte[] asmefmgjyimhlyf() {
        return new byte[]{-35, -46, 20, 98, 120, 91, 9, 79, 41, 9, 105, 13, 77, 71, 44, 51, 114, 110, 82, 80, 42, 44, 9, 53, 27, 0, 41, 51, 96, 38, 25, 103, 4, 29, 44, 46, 77, 119, 103, 23, 73, 113, 19, 20, 37, 80, 20, 118, 102, 61};
    }

    private static byte[] vmeltvjharukuml() {
        return new byte[]{-35, -46, 20, 66, 120, 123, 9, 111, 41, 123, 105, 45, 77, 103, 44, 19, 114, 78, 82, 112, 42, 12, 9, 71, 27, 32, 41, 19, 96, 6, 25, 21, 4, 61, 44, 14, 77, 87, 103, 55, 73, 81, 19, 52, 37, 112, 20, 86, 102, 29};
    }

    private static byte[] ftistowcpqvhums() {
        return new byte[]{-35, -46, 20, 16, 120, 60, 9, 87, 41, 57, 105, 44, 77, 47, 44, 6, 114, 76, 82, 60, 42, 7, 9, 5, 27, 111, 41, 25, 96, 15, 25, 86, 4, 59, 44, 8, 77, 81, 103, 126, 73, 95, 19, 57, 37, 113, 20, 82, 102, 31, 113, 27, 62, 110, 37, 65, 20, 93, 120, 41, 10, 118, 44, 38, 111, 58, 77, 36, 44, 4, 113, 64, 87, 109, 44, 30, 9, 3, 27, 62, 42, 13, 101, 19, 31, 20};
    }

    private static byte[] wtqmnyhefbzknxd() {
        return new byte[]{-34, -46, 17, 98, 119, 78, 13, 70, 44, 19, 111, 22, 71, 92, 45, 52, 114, 122, 82, 82, 35, 46, 13, 63, 30, 8, 44, 32, 111, 48, 30, 122, 4, 13, 44, 60, 71, 104, 102, 10, 74, 106};
    }

    private static byte[] silbtpfzvbtcuxz() {
        return new byte[]{-34, -46, 17, 66, 119, 110, 13, 102, 44, 51, 111, 54, 71, 124, 45, 20, 114, 8, 82, 114, 35, 14, 13, 31, 30, 40, 44, 82, 111, 16, 30, 90, 4, 45, 44, 28, 71, 72, 102, 42, 74, 74};
    }

    private static byte[] qvpbamehczyujjt() {
        return new byte[]{-34, -46, 17, 22, 119, 40, 13, 54, 44, 98, 111, 102, 71, 50, 45, 21, 114, 71, 82, 63, 35, 27, 13, 1, 30, 44, 44, 6, 111, 7, 30, 77, 4, 121, 44, 73, 71, 11, 102, 63, 74, 77, 22, 57, 42, 124, 16, 72, 99, 79, 119, 16, 52, 106, 36, 95, 20, 22, 120, 110, 3, 32, 40, 37, 106, 41, 72, 111, 35, 28, 118, 71, 87, 110, 44, 10, 3, 72, 26, 56, 41, 28, 96, 23, 16, 79, 0, 62, 41, 28, 72, 93, 104, 114, 78, 51, 19, 122, 37, 54, 30, 5, 103, 11, 114, 3, 59, 104, 42, 76, 16, 90, 125, 51, 12, 118, 38, 33, 110, 48, 77, 87, 44, 19, 120, 72, 83, 118, 41, 4, 12, 13, 20, 33, 45, 26, 101, 90, 31, 17, 14, 42, 45, 24, 77, 78, 103, 57, 64, 95, 23, 62, 32, 117, 17, 77, 105, 25, 118, 72, 62, 34, 37, 91, 30, 88, 121, 111, 9, 123, 41, 53, 96, 41, 73, 42, 41, 72, 119, 5, 93, 61, 45, 93, 9, 94, 27, 114, 35, 67, 97, 3, 26, 90, 1, 1, 35, 46, 73, 100, 98, 23, 79, 123, 25, 19, 36, 55, 20, 111, 102, 38, 120, 77, 58, 65, 32, 110, 17, 115, 119, 78, 13, 85, 44, 2, 111, 2, 71, 54, 45, 94, 114, 70, 82, 118, 35, 2, 13, 14, 30, 38, 44, 65, 111, 104, 30, 31, 4, 124, 44, 21, 71, 11, 102, 58, 74, 106, 22, 52, 42, 123, 16, 79, 99, 79, 119, 29, 52, 96, 36, 70, 20, 83, 120, Byte.MAX_VALUE, 3, 111, 40, 35, 106, 45, 72, 46, 35, 6, 118, 71, 87, 109, 44, 26, 3, 13, 26, 57, 41, 13, 96, 70, 16, 87, 0, 50, 41, 8, 72, 65, 104, 40, 78, 25, 19, 56, 37, 115, 30, 25, 103, 9, 114, 79, 59, 117, 42, 95, 16, 17, 125, 125, 12, 118, 38, 53, 110, 46, 77, 38};
    }

    private static byte[] hsxzmmctzfohgvj() {
        return new byte[]{-35, -48, 16, 110, 123, 85, 11, 79, 43, 15, 105, 19, 73, 65, 47, 40, 112, 108, 80, 69, 42, 63, 13, 41, 24, 6, 43, 50, 98, 42, 25, Byte.MAX_VALUE, 0, 15, 47, 44, 79, 101, 101, 30, 73, 99, 23, 23, 38, 95, 22, 99, 100, 32, 113, 34, 58, 69, 38, 99, 22, 123, 122, 93};
    }

    private static byte[] wthctutakurgpjk() {
        return new byte[]{-35, -48, 16, 78, 123, 117, 11, 111, 43, 125, 105, 51, 73, 97, 47, 8, 112, 76, 80, 55, 42, 31, 13, 9, 24, 38, 43, 18, 98, 10, 25, 95, 0, 125, 47, 12, 79, 69, 101, 62, 73, 17, 23, 55, 38, Byte.MAX_VALUE, 22, 67, 100, 0, 113, 2, 58, 101, 38, 67, 22, 91, 122, 125};
    }

    private static byte[] hzxdtholgrxecbg() {
        return new byte[]{-35, -48, 16, 28, 123, 50, 11, 87, 43, 63, 105, 46, 73, 35, 47, 8, 112, 76, 80, 58, 42, 5, 13, 9, 24, 97, 43, 25, 98, 9, 25, 84, 0, 55, 47, 6, 79, 81, 101, 120, 73, 93, 23, 53, 38, Byte.MAX_VALUE, 22, 82, 100, 25, 113, 25, 58, 98, 38, 79, 22, 93, 122, 47, 10, 116, 40, 42, 108, 61, 79, 97, 46, 2, 113, 66, 83, 48, 47, 23, 11, 3, 25, 58, 42, 14, 97, 9, 28, 71, 6, 36, 46, 26, 78, 3};
    }

    private static byte[] spqohcctrqcgvss() {
        return new byte[]{-35, -47, 18, 97, 120, 91, 15, 71, 42, 11, 105, 18, 75, 78, 44, 38, 116, 100, 81, 65, 42, 56, 15, 44, 27, 30, 47, 40, 99, 39, 25, 104, 2, 11, 44, 50, 75, 120, 100, 25, 73, 115, 21, 29, 37, 87, 18, 109, 101, 50, 113, 45, 56, 71, 37, 123, 18, 123, 123, 68, 10, 79, 42, 23, 111, 26, 75, 94};
    }

    private static byte[] iwrcfcehqquaswo() {
        return new byte[]{-35, -47, 18, 65, 120, 123, 15, 103, 42, 121, 105, 50, 75, 110, 44, 6, 116, 68, 81, 51, 42, 24, 15, 12, 27, 62, 47, 8, 99, 7, 25, 72, 2, 43, 44, 64, 75, 88, 100, 57, 73, 83, 21, 61, 37, 119, 18, 77, 101, 64, 113, 13, 56, 103, 37, 91, 18, 91, 123, 100, 10, 111, 42, 55, 111, 58, 75, 126};
    }

    private static byte[] kupwfefupkmnwtr() {
        return new byte[]{-35, -47, 18, 19, 120, 60, 15, 95, 42, 59, 105, 47, 75, 43, 44, 7, 116, 68, 81, 112, 42, 30, 15, 73, 27, 105, 47, 94, 99, 82, 25, 11, 2, 60, 44, 92, 75, 77, 100, 57, 73, 24, 21, 41, 37, 126, 18, 94, 101, 20, 113, 9, 56, 118, 37, 10, 18, 20, 123, 60, 10, 33, 42, 52, 111, 123, 75, 120, 47, 4, 113, 78, 81, 122, 44, 25, 15, 11, 24, 111, 42, 8, 99, 6, 31, 75, 2, 45, 47, 8, 78, 95, 100, 41, 79, 18};
    }

    private static byte[] fqnenoquspfjvet() {
        return new byte[]{-35, -48, 16, 99, Byte.MAX_VALUE, 74, 14, 78, 43, 7, 105, 4, 73, 70, 43, 53, 117, 117, 80, 92, 42, 52, 13, 62, 28, 14, 46, 42, 98, 48, 25, Byte.MAX_VALUE, 0, 9, 43, 61};
    }

    private static byte[] cbmnrbzotzdqvfh() {
        return new byte[]{-35, -48, 16, 67, Byte.MAX_VALUE, 106, 14, 110, 43, 39, 105, 118, 73, 102, 43, 21, 117, 85, 80, 124, 42, 70, 13, 30, 28, 46, 46, 10, 98, 16, 25, 95, 0, 41, 43, 29};
    }

    private static byte[] qdcpaldjdbrjdkj() {
        return new byte[]{-35, -48, 16, 22, Byte.MAX_VALUE, 56, 14, 89, 43, 60, 105, 46, 73, 46, 43, 3, 117, 66, 80, 119, 42, 31, 13, 76, 28, 109, 46, 88, 98, 85, 25, 10, 0, 57, 43, 88, 74, 75, 101, 62, 73, 25, 23, 44, 34, 122, 19, 88, 100, 19, 113, 8, 58, 115, 34, 14, 19, 18, 122, 59, 10, 32, 40, 49, 104, Byte.MAX_VALUE, 74, 126, 46, 3, 113, 79, 83, Byte.MAX_VALUE, 43, 29, 14, 13, 25, 104, 42, 9, 97, 3, 24, 79, 3, 43, 46, 15, 78, 94, 102, 44, 72, 22};
    }

    private static byte[] mbwvxqoodfpwckz() {
        return new byte[]{-34, -41, 21, 99, 120, 78, 12, 69, 38, 20, 104, 22, 77, 92, 44, 49, 113, 119, 87, 75, 40, 43, 12, 57, 27, 28, 35, 59, 103, 53, 26, 110};
    }

    private static byte[] cmrbtfitmkadhdb() {
        return new byte[]{-34, -41, 21, 67, 120, 110, 12, 101, 38, 52, 104, 54, 77, 124, 44, 17, 113, 5, 87, 107, 40, 11, 12, 25, 27, 60, 35, 27, 103, 21, 26, 78};
    }

    private static byte[] fshlrjjdqpuxadf() {
        return new byte[]{-34, -41, 21, 23, 120, 40, 12, 53, 38, 101, 104, 102, 77, 50, 44, 16, 113, 74, 87, 60, 40, 30, 12, 4, 27, 40, 35, 7, 103, 3, 26, 72, 1, 123, 42, 66, 77, 12, 99, 63, 79, 79, 22, 59, 42, 121, 22, 73, 99, 77, 119, 20, 61, 101, 32, 93, 21, 17, 120, 106, 12, 38, 38, 37, 104, 47, 77, 107, 44, 84, 113, 90, 87, 124, 40, 31, 12, 29, 27, 44, 35, 13, 103, 18, 26, 20, 1, 84, 42, 66, 77, 10, 99, 101, 79, 95, 22, 50, 42, 126, 22, 94, 99, 6, 119, 87, 61, 120, 32, 93, 21, 95, 120, 84, 12, 101, 38, 62, 104, 50, 77, 103, 44, 21, 113, 70, 87, 125, 40, 84, 12, 71, 27, 61, 35, 14, 103, 7, 26, 91, 1, 61, 42, 1, 77, 79, 99, 41, 79, 72, 22, 126, 42, 50, 22, 77, 99, 1, 119, 12, 61, 115, 32, 77, 21, 67, 120, 46, 12, 56, 38, 119, 104, 124, 77, 57, 44, 64, 113, 17, 87, 33, 40, 10, 12, 10, 27, 18, 35, 61, 103, 42, 26, 115, 1, 29, 42, 41, 77, 10, 99, 13, 79, 115, 22, 126, 42, 86, 22, 126, 99, 46, 119, 40, 61, 90, 32, 124, 21, 108, 120, 55, 12, 41, 38, 50, 104, 51, 77, 99, 44, 23, 113, 67, 87, 39, 40, 100, 12, 72, 27, 105, 35, 2, 103, 64, 26, 89, 1, 10, 42, 10, 77, 67, 99, 42, 79, 28, 22, 42, 42, 114, 22, 81, 99, 8, 119, 29, 61, 101, 32, 90, 21, 69, 120, 43, 12, 116, 38, 52, 104, 46, 77, Byte.MAX_VALUE, 44, 17, 113, 91, 87, 109, 40, 78, 12, 5, 27, 32, 35, 25, 103, 14, 26, 78, 1, 126, 42, 0, 77, 79, 99, 121, 79, 93, 22, 126, 42, 99, 22, 77, 99, 77, 119, 25, 61, 120, 32, 73, 21, 65, 120, 37};
    }

    private static byte[] pmvtalrmoenpktq() {
        return new byte[]{-35, -48, 16, 96, Byte.MAX_VALUE, 85, 15, 64, 46, 9, 105, 9, 73, 79, 43, 43, 116, 115, 85, 89, 42, 56, 13, 60, 28, 30, 47, 40, 103, 37, 25, 107, 0, 11, 43, 38, 75, Byte.MAX_VALUE, 96, 10, 73, 121, 23, 10, 34, 67, 18, 121, 97, 44, 113, 57, 58, 76, 34, 110, 18, 123, Byte.MAX_VALUE, 75, 10, 65, 40, 6};
    }

    private static byte[] lowrlwlbuwotpcb() {
        return new byte[]{-35, -48, 16, 64, Byte.MAX_VALUE, 117, 15, 96, 46, 123, 105, 41, 73, 111, 43, 11, 116, 83, 85, 121, 42, 24, 13, 28, 28, 108, 47, 8, 103, 5, 25, 75, 0, 43, 43, 6, 75, 95, 96, 42, 73, 89, 23, 42, 34, 49, 18, 89, 97, 12, 113, 25, 58, 108, 34, 78, 18, 91, Byte.MAX_VALUE, 107, 10, 97, 40, 38};
    }

    private static byte[] pxmbllzulsvoggl() {
        return new byte[]{-35, -48, 16, 18, Byte.MAX_VALUE, 38, 15, 49, 46, 102, 105, 56, 73, 59, 43, 28, 116, 67, 85, 57, 42, 27, 13, 4, 28, 32, 47, 3, 103, 5, 25, 72, 0, 123, 43, 67, 75, 10, 96, 105, 73, 79, 23, 61, 34, 114, 18, 76, 97, 79, 113, 20, 58, 106, 34, 84, 18, 21, Byte.MAX_VALUE, 104, 10, 32, 40, 32, 104, 37, 75, 106, 43, 86, 113, 85, 83, 123, 43, 20, 15, 28, 28, 40, 42, 8, 97, 22, 24, 26};
    }

    private static byte[] kkhvhojnsamrpxa() {
        return new byte[]{-35, -44, 30, 99, 126, 94, 2, 78, 43, 15, 105, 11, 71, 70, 42, 46, 121, 124, 80, 95, 42, 40, 3, 44, 29, 6, 34, 49, 98, 51, 25, 113, 14, 19};
    }

    private static byte[] fkztxcvszbxstmq() {
        return new byte[]{-35, -44, 30, 67, 126, 126, 2, 110, 43, 119, 105, 62, 71, 124, 42, 5, 121, 71, 80, 61, 42, 27, 3, 4, 29, 45, 34, 19, 98, 0, 25, 91, 14, 112, 42, 7, 70, 76};
    }

    private static byte[] kxzuxhqvqyudumj() {
        return new byte[]{-35, -44, 30, 17, 126, 111, 2, 86, 43, 53, 105, 42, 71, 46, 42, 3, 121, 77, 80, 48, 42, 1, 3, 4, 29, 61, 34, 84, 98, 13, 25, 75, 14, 41, 42, 7, 70, 2, 101, 51, 73, 91, 25, 56, 35, 114, 31, 70, 100, 23, 113, 0, 52, 104, 35, 77, 31, 27, 122, 113, 10, 116, 38, 54, 105, 126, 70, 119, 46, 31, 113, 82, 93, 104, 42, 11, 2, 20, 25, 53, 42, 12, 111, 79, 25, 31, 15, 119, 46, 84, 78, 1, 104, 112, 73, 77, 24, 39, 39, 125, 23, 72, 105, 26, 113, 7, 53, 42, 39, 71, 23, 95, 119, 122, 10, 37, 39, 47, 109, 37, 78, 111, 35, 2, 113, 86, 92, 126, 46, 76};
    }
}
