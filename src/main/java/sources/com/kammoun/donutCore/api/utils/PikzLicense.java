package com.kammoun.donutCore.api.utils;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.json.JsonWriteFeature;
import com.kammoun.utils.jackson.databind.ObjectMapper;
import com.kammoun.utils.jackson.databind.SerializationFeature;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import lombok.Generated;
import org.erdtman.jcs.JsonCanonicalizer;

public class PikzLicense {
    private static final String PRODUCT_NAME = "DonutUtils";
    private static final String VERSION = "1.0.0";
    public static String LICENSE_KEY;
    private static final String BBB = "%%__BUILTBYBIT__%%";
    private static final String USER = "%%__USER__%%";
    private static final String USERNAME = "%%__USERNAME__%%";
    private static final String RESOURCE = "%%__RESOURCE__%%";
    private static final String B_VERSION = "%%__VERSION__%%";
    private static final String B_TIMESTAMP = "%%__TIMESTAMP__%%";
    private static final LinkedHashMap<String, String> EXTRA_FIELDS;
    public static final String LK_NOT_FOUND = "lk not found";
    public static final String LK_EXPIRED = "lk has expired";
    public static final String LK_IP_NOT_ALLOWED = "ip not allowed";
    public static final String LK_INVALID_KEY = "invalid key format";
    public static final String LK_DECRYPTION_FAILED = "failed to decrypt key";
    public static final String LK_REQUIRED = "lk is required";
    public static final String LK_INTERNAL_SERVER_ERROR = "internal server error";
    public static final String LK_FAILED_TO_RETRIEVE_IPS = "failed to retrieve license ips";
    public static final String LK_INVALID_REQUEST_BODY = "invalid request body";
    public static final String LK_INVALID_NONCE = "invalid nonce";
    public static final String LK_INVALID_CIPHER = "invalid cipher";
    public static final String LK_DECRYPTION_PAYLOAD_FAILED = "failed to decrypt payload";
    public static final String LK_INVALID_LICENSE_PAYLOAD_FORMAT = "invalid license payload format";
    public static final String LK_FAILED_TO_RETRIEVE_RESOURCES = "failed to retrieve license resources";
    public static final String LK_FAILED_TO_RETRIEVE_ADDONS = "failed to retrieve license addons";
    public static final String LK_TIMESTAMP_TOO_OLD = "request timestamp too old";
    public static final String LK_TIMESTAMP_TOO_NEW = "request timestamp too new";
    private static int xCOMoU7lOG = 0;
    private transient int ia48TTtwEr = 1587412510;
    private static byte[] qxehnkhrqp;
    private static String[] nothing_to_see_here = new String[18];

    public static class CryptoUtils {
        private static final ObjectMapper mapper;
        private static int xcZgftD5vp = 0;
        private transient int d5e6u1ANUP = 110061155;
        private static String[] nothing_to_see_here = new String[19];

        CryptoUtils() {
            int i = 1990809507 ^ (1585790012 ^ 969574365);
            int parseInt = 1067609153 ^ (2068063160 ^ Integer.parseInt("1426105275"));
            this.d5e6u1ANUP = 110061155 ^ xcZgftD5vp;
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                    case 45054041:
                        int i2 = 1356647678 ^ parseInt;
                        return;
                    case 160001806:
                    case 711594252:
                    default:
                        throw new IllegalAccessException();
                    case 1600741323:
                        return;
                }
            }
        }

        private static ObjectMapper createMapper(int i) {
            int i2 = 337418422 ^ (179504154 ^ (316454783 ^ 160903008));
            ObjectMapper objectMapper = new ObjectMapper();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 790635928) {
                i2 = 1706525595 ^ i2;
                objectMapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, (boolean) ((byte) (1616086825 ^ i2)));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 43792707) {
                    i2 = 143832700 ^ i2;
                    objectMapper.configure(SerializationFeature.INDENT_OUTPUT, (boolean) ((byte) (1757491540 ^ i2)));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1175030435) {
                        i2 = 1705156264 ^ i2;
                        objectMapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, (boolean) ((byte) (224636924 ^ i2)));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1797095392) {
                            int i3 = 1865116108 ^ i2;
                            objectMapper.getFactory().configure(JsonWriteFeature.ESCAPE_NON_ASCII.mappedFeature(), (boolean) ((byte) (1648936497 ^ i3)));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 306590083) {
                                int i4 = 1382923377 ^ i3;
                                return objectMapper;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 306590083 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (298360594 ^ i3)) {
                                    break;
                                }
                            }
                            int i5 = 1649614756 ^ i3;
                            throw new IOException("double");
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 43792707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1760832333 ^ i2)) {
                    int i6 = 1755344473 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2127834615 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (225651229 ^ i2)) {
                        int i7 = 1469104806 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1175030435 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (742800034 ^ i2)) {
                            int i8 = 1385053139 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 790635928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (141530283 ^ i2)) {
                                int i9 = 2111037472 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1797095392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (548638341 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            int i10 = 1761992318 ^ i2;
            throw new RuntimeException();
        }

        public static ObjectMapper getMapper(int i) {
            int i2 = 457211449 ^ (782913876 ^ (2000671128 ^ 160903008));
            return mapper;
        }

        public static String stringify(Object obj, int i) {
            int i2 = 1064314150 ^ (1973809028 ^ 160903008);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 437726738) {
                ?? r0 = 1758511307 ^ i2;
                i2 = r0;
                try {
                    String writeValueAsString = mapper.writeValueAsString(obj);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1553016905) {
                        i2 = 1341811121 ^ i2;
                        String encodedString = new JsonCanonicalizer(writeValueAsString).getEncodedString();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 591553987) {
                            i2 = 1809754455 ^ i2;
                            return encodedString;
                        }
                    }
                } catch (Exception e) {
                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                        case 591553987:
                            i2 = ynqmwwoaopobxtct(i2, 673647984);
                            break;
                        case 1553016905:
                            i2 = 1742562497 ^ i2;
                            break;
                        default:
                            throw new IllegalAccessException("Error in hash");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1652166210) {
                        throw new RuntimeException(ujjkycqbzy(umllrqccrdvzciu(), difblkvhlsigufj(), 418889247 ^ i2), r0);
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2109157240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (63657533 ^ i2)) {
                    int i3 = 164741935 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 437726738 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2013834034 ^ i2)) {
                        int i4 = 1032704972 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1652166210 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (984192718 ^ i2)) {
                            int i5 = 671894826 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1553016905 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (182718921 ^ i2)) {
                                int i6 = 1544859616 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 591553987 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (174290498 ^ i2)) {
                                    int i7 = 762375668 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1513619782 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (801124800 ^ i2)) {
                                        int i8 = 1129412328 ^ i2;
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        public static String encodeBase64(byte[] bArr, int i) {
            int i2 = 1140878742 ^ (2022004802 ^ 160903008);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1466903135) {
                int i3 = 1410790160 ^ i2;
                return Base64.getEncoder().encodeToString(bArr);
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1466903135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (752179700 ^ i2)) {
                    int i4 = 936992560 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 136793379 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (152182346 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 825241112 ^ i2;
            throw new IllegalAccessException();
        }

        public static byte[] decodeBase64(String str, int i) {
            int i2 = 754642090 ^ (2060738217 ^ 160903008);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -36902118) {
                int i3 = 310504785 ^ i2;
                return Base64.getDecoder().decode(str);
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1774420370 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (128933114 ^ i2)) {
                    int i4 = 2103571064 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -36902118 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1871425494 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1820675042 ^ i2;
            throw new IllegalAccessException();
        }

        public static PublicKey loadPublicKey(String str, int i) throws Exception {
            int i2 = 486433884 ^ (1948680806 ^ 160903008);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 176048851) {
                int i3 = 1012325219 ^ i2;
                byte[] decodeBase64 = decodeBase64(str, 750622574);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -389508662) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 527785867 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1354539580 ^ i3)) {
                            int i4 = 1947682475 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -389508662 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2133977896 ^ i3)) {
                                break;
                            }
                        }
                    }
                    int i5 = 600301066 ^ i3;
                    throw new RuntimeException("double");
                }
                i2 = 2029153277 ^ i3;
                X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(decodeBase64);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 794545697) {
                    i2 = 44355721 ^ i2;
                    KeyFactory keyFactory = KeyFactory.getInstance(ujjkycqbzy(epvaxtfbuiqinmq(), difblkvhlsigufj(), i2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 981289577) {
                        int i6 = 1151402684 ^ i2;
                        return keyFactory.generatePublic(x509EncodedKeySpec);
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 981289577 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1250487932 ^ i2)) {
                    int i7 = 1982442296 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 794545697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (313879461 ^ i2)) {
                        int i8 = 564270453 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 176048851 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1938218650 ^ i2)) {
                            break;
                        }
                    }
                }
            }
            int i9 = 621221951 ^ i2;
            throw new IllegalAccessException();
        }

        public static String encryptAesKey(byte[] bArr, PublicKey publicKey, int i) throws Exception {
            int i2 = 1286549016 ^ (1111790983 ^ 160903008);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1004840952) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1004840952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1436659869 ^ i2)) {
                        break;
                    }
                }
                int i3 = 1304357830 ^ i2;
                throw new IOException("double");
            }
            int i4 = 960828797 ^ i2;
            Cipher cipher = Cipher.getInstance(ujjkycqbzy(xzomtouefmvvbgw(), difblkvhlsigufj(), i4));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -238285807) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -238285807 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1813122188 ^ i4)) {
                        break;
                    }
                }
                int i5 = 749958507 ^ i4;
                throw new IllegalAccessException("double");
            }
            int i6 = 744347105 ^ i4;
            OAEPParameterSpec oAEPParameterSpec = new OAEPParameterSpec(ujjkycqbzy(kovnfabfghvefkm(), difblkvhlsigufj(), i6), ujjkycqbzy(yteumehbylfkgne(), difblkvhlsigufj(), i6), MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1826446568) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -793746079 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (375607040 ^ i6)) {
                        int i7 = 1644447612 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1826446568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1873097526 ^ i6)) {
                            break;
                        }
                    }
                }
                int i8 = 290906760 ^ i6;
                throw new IllegalAccessException("double");
            }
            int i9 = 1497158768 ^ i6;
            cipher.init((byte) (1264091154 ^ i9), publicKey, oAEPParameterSpec);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1522794650) {
                i9 = 712019323 ^ i9;
                byte[] doFinal = cipher.doFinal(bArr);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 155216707) {
                    int i10 = 1530790340 ^ i9;
                    return encodeBase64(doFinal, 441714310);
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 155216707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1226527888 ^ i9)) {
                    int i11 = 719031428 ^ i9;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1522794650 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1476829202 ^ i9)) {
                        break;
                    }
                }
            }
            int i12 = 1097888910 ^ i9;
            throw new IllegalAccessException();
        }

        public static String generateAesKey(int i) throws Exception {
            int i2 = 1562354404 ^ (2041689884 ^ (1013437860 ^ 160903008));
            KeyGenerator keyGenerator = KeyGenerator.getInstance(ujjkycqbzy(pqsnkoljuhmswsf(), difblkvhlsigufj(), i2));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1963492896) {
                i2 = 1371841268 ^ i2;
                keyGenerator.init((short) (1083854024 ^ i2));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 80899650) {
                    i2 = 966355279 ^ i2;
                    byte[] encoded = keyGenerator.generateKey().getEncoded();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -937876421) {
                        int i3 = 1273304681 ^ i2;
                        return encodeBase64(encoded, 441714310);
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 80899650 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (41132238 ^ i2)) {
                    int i4 = 1755881030 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1963492896 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1651194690 ^ i2)) {
                        int i5 = 1961966526 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -937876421 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (875451348 ^ i2)) {
                            break;
                        }
                    }
                }
            }
            int i6 = 1336416835 ^ i2;
            throw new IllegalAccessException();
        }

        public static EncryptedLicensePayload encryptLicensePayload(LicensePayload licensePayload, String str, int i) throws Exception {
            int i2 = 1689453073 ^ (1133803652 ^ 160903008);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1971498921) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1971498921 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1266036415 ^ i2)) {
                        break;
                    }
                }
                int i3 = 1482702380 ^ i2;
                throw new RuntimeException("double");
            }
            int i4 = 1560288089 ^ i2;
            byte[] bArr = new byte[(byte) (1940934304 ^ i4)];
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1652394653) {
                i4 = 451098738 ^ i4;
                SecureRandom secureRandom = new SecureRandom();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1251718899) {
                    int i5 = 1702860534 ^ i4;
                    secureRandom.nextBytes(bArr);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1634140480) {
                        i5 = 1030006183 ^ i5;
                        Cipher cipher = Cipher.getInstance(ujjkycqbzy(ksffacqxixfomil(), difblkvhlsigufj(), i5));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1975374727) {
                            int i6 = 961499586 ^ i5;
                            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec((short) (134681805 ^ i6), bArr);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1077453416) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1077453416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (313647604 ^ i6)) {
                                        break;
                                    }
                                }
                                int i7 = 1873564223 ^ i6;
                                throw new IllegalAccessException("double");
                            }
                            int i8 = 1980306663 ^ i6;
                            cipher.init((byte) (2114846891 ^ i8), new SecretKeySpec(decodeBase64(str, 750622574), ujjkycqbzy(rccocqwszocktns(), difblkvhlsigufj(), i8)), gCMParameterSpec);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -261094061) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -261094061 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1237890223 ^ i8)) {
                                        break;
                                    }
                                }
                                int i9 = 81361859 ^ i8;
                                throw new RuntimeException("double");
                            }
                            i5 = 2011941685 ^ i8;
                            byte[] doFinal = cipher.doFinal(stringify(licensePayload, 1689464251).getBytes(StandardCharsets.UTF_8));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1328438520) {
                                int i10 = 431417599 ^ i5;
                                String encodeBase64 = encodeBase64(bArr, 441714310);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != -2103895296) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -2103895296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1046772170 ^ i10)) {
                                            break;
                                        }
                                    }
                                    int i11 = 1228209612 ^ i10;
                                    throw new RuntimeException("double");
                                }
                                i5 = 562120745 ^ i10;
                                String encryptAesKey = encryptAesKey(decodeBase64(str, 750622574), loadPublicKey(ujjkycqbzy(qpiwqffntiwzlki(), difblkvhlsigufj(), i5), 1428063458), 594650114);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1902945719) {
                                    int i12 = 721118132 ^ i5;
                                    return new EncryptedLicensePayload(encodeBase64, encodeBase64(doFinal, 441714310), encryptAesKey, 1085175859);
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1902945719 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1329415230 ^ i5)) {
                            int i13 = 827040524 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1634140480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (333963643 ^ i5)) {
                                int i14 = 1959069765 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1328438520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1333853480 ^ i5)) {
                                    int i15 = 1158767939 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1975374727 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (616667539 ^ i5)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    int i16 = 1034811882 ^ i5;
                    throw new RuntimeException();
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1652394653 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1996875684 ^ i4)) {
                    int i17 = 884392551 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1251718899 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (634763993 ^ i4)) {
                        break;
                    }
                }
            }
            int i18 = 526844685 ^ i4;
            throw new IllegalAccessException("double");
        }

        public static SignedLicenseResponse decryptLicenseResponse(EncryptedLicenseResponse encryptedLicenseResponse, String str, int i) throws Exception {
            int i2 = 354685533 ^ (1132093379 ^ 160903008);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -28633102) {
                int i3 = 2040695706 ^ i2;
                byte[] decode = Base64.getDecoder().decode(str);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 861883169) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 861883169 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (569206076 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 1110870635 ^ i3;
                    throw new RuntimeException("double");
                }
                i2 = 125224454 ^ i3;
                byte[] decode2 = Base64.getDecoder().decode(encryptedLicenseResponse.getNonce(1552812348));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 149519121) {
                    int i5 = 1532037489 ^ i2;
                    byte[] decode3 = Base64.getDecoder().decode(encryptedLicenseResponse.getCiphertext(796801164));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -765382501) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -765382501 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (565858945 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 1372761167 ^ i5;
                        throw new RuntimeException("double");
                    }
                    int i7 = 677031610 ^ i5;
                    Cipher cipher = Cipher.getInstance(ujjkycqbzy(cemzhcnhuoaykxc(), difblkvhlsigufj(), i7));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -1867233974) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1867233974 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (136557493 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 1527422987 ^ i7;
                        throw new IllegalAccessException("double");
                    }
                    i2 = 1221984816 ^ i7;
                    GCMParameterSpec gCMParameterSpec = new GCMParameterSpec((short) (448825881 ^ i2), decode2);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -704359224) {
                        int i9 = 1990024260 ^ i2;
                        SecretKeySpec secretKeySpec = new SecretKeySpec(decode, ujjkycqbzy(iviptolczkmlibv(), difblkvhlsigufj(), i9));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 1659811563) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1659811563 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (614565109 ^ i9)) {
                                    break;
                                }
                            }
                            int i10 = 979540858 ^ i9;
                            throw new RuntimeException("double");
                        }
                        i2 = 1324668502 ^ i9;
                        cipher.init((byte) (581501065 ^ i2), secretKeySpec, gCMParameterSpec);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 357041241) {
                            int i11 = 2031844786 ^ i2;
                            byte[] doFinal = cipher.doFinal(decode3);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != -577508918) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -577508918 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (214573737 ^ i11)) {
                                        break;
                                    }
                                }
                                int i12 = 1980673355 ^ i11;
                                throw new IOException("double");
                            }
                            i2 = 438920503 ^ i11;
                            String str2 = new String(doFinal, StandardCharsets.UTF_8);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 215531634) {
                                int i13 = 391502114 ^ i2;
                                return (SignedLicenseResponse) mapper.readValue(str2, SignedLicenseResponse.class);
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 215531634 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (911370152 ^ i2)) {
                    int i14 = 1730919392 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -28633102 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1761668271 ^ i2)) {
                        int i15 = 1492670861 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 149519121 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (204531419 ^ i2)) {
                            int i16 = 1560005782 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 357041241 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1853133463 ^ i2)) {
                                int i17 = 1155096286 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -704359224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (973456634 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            int i18 = 1813619415 ^ i2;
            throw new IllegalAccessException();
        }

        public static boolean verifySignature(SignedLicenseResponse signedLicenseResponse, PublicKey publicKey, int i) {
            int i2 = 81289836 ^ (673932984 ^ 160903008);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 723606945) {
                int i3 = 948006685 ^ i2;
                int i4 = i3;
                try {
                    Signature signature = Signature.getInstance(ujjkycqbzy(dguajvxqocraoij(), difblkvhlsigufj(), i4));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -282450616) {
                        i4 = 221318551 ^ i4;
                        signature.initVerify(publicKey);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2036184592) {
                            i4 = 1833699607 ^ i4;
                            String stringify = stringify(signedLicenseResponse.getData(1456677543), 1689464251);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -322830005) {
                                int i5 = 1785278805 ^ i4;
                                signature.update(stringify.getBytes(StandardCharsets.UTF_8));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1081373728) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1081373728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (254253040 ^ i5)) {
                                            break;
                                        }
                                    }
                                    int i6 = 109747293 ^ i5;
                                    throw new RuntimeException("double");
                                }
                                i2 = 26299408 ^ i5;
                                byte[] decode = Base64.getDecoder().decode(signedLicenseResponse.getSignature(971093508));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1291719840) {
                                    i4 = 101200004 ^ i2;
                                    boolean verify = signature.verify(decode);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2092929216) {
                                        i4 = 1443204315 ^ i4;
                                        return verify;
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 862718362 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1777150097 ^ i4)) {
                            int i7 = 717118440 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2092929216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1376159013 ^ i4)) {
                                int i8 = 34914415 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2137292288 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (891639392 ^ i4)) {
                                    int i9 = 457421169 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2036184592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1616207374 ^ i4)) {
                                        int i10 = 1868616608 ^ i4;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -282450616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (180659742 ^ i4)) {
                                            int i11 = 385301862 ^ i4;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -322830005 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1016877249 ^ i4)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i12 = 108552448 ^ i4;
                    throw new IllegalAccessException();
                } catch (Exception e) {
                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                        case -2092929216:
                            i2 = 1641869393 ^ i4;
                            break;
                        case -2036184592:
                            i2 = ynqmwwoaopobxtct(i4, 1633727623);
                            break;
                        case -1291719840:
                            i2 = 1741996245 ^ i4;
                            break;
                        case -1081373728:
                            i2 = 1715834053 ^ i4;
                            break;
                        case -322830005:
                            i2 = 204258704 ^ i4;
                            break;
                        case -282450616:
                            i2 = 1817295120 ^ i4;
                            break;
                        default:
                            throw new RuntimeException("Error in hash");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1918374453) {
                        return (byte) (267161536 ^ (2119725689 ^ i2));
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 723606945 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (272494487 ^ i2)) {
                    int i13 = 1907023776 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1291719840 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (609266751 ^ i2)) {
                        int i14 = 786540549 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1918374453 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (896586237 ^ i2)) {
                            int i15 = 605209239 ^ i2;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }
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
            int parseInt = 1550860568 ^ (1209245282 ^ Integer.parseInt("1426105275"));
            xcZgftD5vp = (-1322671747) ^ new Random(-1960411393384468750L).nextInt();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 186377738) {
                int i = 1568285217 ^ parseInt;
                mapper = createMapper(465745840);
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -523569408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1670592257 ^ parseInt)) {
                    int i2 = 976469189 ^ parseInt;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 186377738 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (394096546 ^ parseInt)) {
                        break;
                    }
                }
            }
            int i3 = 1918913927 ^ parseInt;
            throw new IllegalAccessException();
        }

        public static String ujjkycqbzy(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] difblkvhlsigufj() {
            return new byte[]{70, 20, 113, 30, 33, 58, 38, 69, 20, 94, 61, 118, 37, 58, 80, 57, 12, 102, 51, 68, 51, 50, 115, 119, 57, 99, 37, 11};
        }

        private static byte[] umllrqccrdvzciu() {
            return new byte[]{-119, -33, 67, 105, 21, 106, 22, 30, 34, 1, 12, 39, 23, 111, 100, 40, 60, 32, 5, 24, 2, 38, 65, 53, 13, 55, 21, 75, 112, 78, 64, 75, 19, 103, 18, 29, 36, 22, 11, 32, 20, 46, 98, 124, 56, 56, 3, 86, 5, 98, 66, 34, 11, 60, 17, 85, 118, 72, 71, 68, 16, 109, 20, 21, 32, 3, 13, 100, 19, 67, 97, 94, 62, 24, 7, 59};
        }

        private static byte[] epvaxtfbuiqinmq() {
            return new byte[]{-114, -34, 72, 121, 18, 91, 23, 52};
        }

        private static byte[] kovnfabfghvefkm() {
            return new byte[]{-117, -37, 73, 120, 23, 71, 22, 61, 37, 64, 13, 124, 16, 57, 101, 63};
        }

        private static byte[] yteumehbylfkgne() {
            return new byte[]{-117, -37, 73, 102, 23, 72, 22, 58, 37, 92};
        }

        private static byte[] xzomtouefmvvbgw() {
            return new byte[]{-119, -37, 69, Byte.MAX_VALUE, 24, 92, 16, 52, 45, 73, 12, 3, 17, 74, 105, 78, 58, 121, 10, 51, 2, 67, 71, 1, 0, 6, 19, 108, Byte.MAX_VALUE, 69, 64, 90, 21, 97, 31, 35, 34, 38, 4, 15, 20, 39, 100, 56, 53, 102, 5, 66, 10, 75, 66, 41, 13, 52, 28, 115, 112, 99, 72, 96, 16, 59, 18, 38, 45, 10, 11, 34, 28, 102, 97, 96, 56, 59, 10, 22};
        }

        private static byte[] pqsnkoljuhmswsf() {
            return new byte[]{-118, -46, 64, 107, 18, 75, 21, 38};
        }

        private static byte[] ksffacqxixfomil() {
            return new byte[]{Byte.MIN_VALUE, -39, 71, 103, 16, 70, 31, 46, 39, 73, 15, 7, 29, 72, 105, 77, 52, 122, 11, 56, 5, 101, 66, 30, 0, 58, 22, 87, 116, 70, 73, 70, 24, 109, 30, 17};
        }

        private static byte[] rccocqwszocktns() {
            return new byte[]{-118, -38, 64, 107, 25, 75, 16, 46};
        }

        private static byte[] qpiwqffntiwzlki() {
            return new byte[]{Byte.MIN_VALUE, -40, 68, 107, 22, 64, 16, 60, 45, 36, 14, 10, 29, 103, 99, 78, 60, 17, 11, 53, 6, 109, 68, 47, 15, 34, 28, 91, 117, 74, 73, 64, 18, 75, 22, 69, 44, 26, 8, 126, 18, 75, 102, 72, 53, 15, 0, 52, 11, 67, 64, 0, 9, 27, 29, 119, 115, 111, 70, 108, 23, 91, 31, 69, 39, 42, 5, 12, 22, 69, 96, 73, 52, 23, 6, 63, 4, 102, 69, 12, 0, 24, 22, Byte.MAX_VALUE, 126, 114, 66, 109, 17, 66, 30, 67, 33, 85, 10, 45, 19, 89, 105, 52, 63, 103, 11, 7, 0, 73, 67, 56, 1, 97, 16, 124, 113, 96, 71, 102, 24, 53, 21, 23, 44, 4, 14, 118, 21, 97, 104, 108, 57, 42, 4, 61, 5, 120, 74, 6, 10, 32, 29, 107, 117, 68, 65, 99, 25, 95, 19, 58, 35, 62, 11, 20, 28, 108, 99, 70, 52, 60, 0, 89, 3, 97, 75, 50, 12, 15, 18, 19, 112, 66, 72, 67, 18, 60, 30, 3, 39, 9, 13, 36, 29, 110, 101, 104, 59, 49, 5, 31, 10, 104, 64, 123, 1, 23, 22, 77, 118, 122, 73, 21, 20, 76, 17, 89, 34, 25, 4, 29, 22, 60, 104, 116, 63, 98, 3, 77, 11, 108, 70, 46, 14, 60, 19, 124, Byte.MAX_VALUE, Byte.MAX_VALUE, 66, 113, 25, 119, 21, 32, 36, 40, 5, 54, 16, 76, 103, 82, 58, 26, 10, 68, 0, 49, 75, 15, 10, 18, 21, 2, 126, 22, 68, 18, 22, 72, 16, 39, 45, 73, 14, 14, 29, 76, 99, 73, 60, 7, 11, 36, 6, 114, 68, 40, 15, 35, 28, 118, 117, 76, 73, 76, 18, 101, 22, 58, 44, 95, 8, 54, 18, 80, 102, 93, 53, 113, 0, 34, 11, 76, 64, 38, 9, 21, 29, 106, 115, 27, 70, 100, 23, 69, 31, 24, 39, 17, 5, 40, 22, 88, 96, 106, 52, 29, 6, 20, 4, 87, 69, 21, 0, 109, 22, 72, 126, 82, 66, 103, 17, 86, 30, 5, 33, 21, 10, 112, 19, 72, 105, 50, 63, 59, 11, 56, 0, 49, 67, 122, 1, 104, 16, 114, 113, 105, 71, 97, 24, 116, 21, 10, 44, 24, 14, 15, 21, 79, 104, 65, 57, 54, 4, 58, 5, 49, 74, 125, 10, 4, 29, 95, 117, 76, 65, 84, 25, 69, 19, 21, 35, 36, 11, 32, 28, 107, 99, 97, 52, 100, 0, 40, 3, 32, 75, 54, 12, 53, 18, 9, 112, 72, 72, 92, 18, 120, 30, 37, 39, 32, 13, 122, 29, 72, 101, 91, 59, 36, 5, 56, 10, 108, 64, 48, 1, 38, 22, 126, 118, Byte.MAX_VALUE, 73, Byte.MAX_VALUE, 20, 84, 17, 63, 34, 11, 4, 10, 22, 92, 104, 61, 63, 42, 3, 24, 11, 83, 70, 120, 14, 97, 19, 125, Byte.MAX_VALUE, 72, 66, 94, 25, 38, 21, 7, 36, 54, 5, 17, 16, 122, 103, 66, 58, 44, 10, 62, 0, 105, 75, 36, 10, 3, 21, 118, 126, 31, 68, 98, 22, 98, 16, 18, 45, 44, 14, 44, 29, Byte.MAX_VALUE, 99, 64, 60, 112, 11, 15, 6, 71, 68, 2, 15, 107, 28, 24, 117, 112, 73, 93, 18, 88, 22, 78, 44, 89, 8, 24, 18, 98, 102, 99, 53, 19, 0, 16, 11, 77, 64, 11, 9, 45, 29, 94, 115, 71, 70, 96, 23, 88, 31, 25, 39, 9, 5, 7, 22, Byte.MAX_VALUE, 96, 71, 52, 62, 6, 23, 4, 118, 69, 10, 0, 19, 22, 85, 126, 117, 66, 91, 17, 71, 30, 38, 33, 36, 10, 36, 19, 121, 105, 103, 63, 59, 11, 6, 0, 125, 67, 10, 1, 0, 16, 107, 113, 8, 71, 90, 24, 50, 21, 37, 44, 14, 14, 22, 21, 40, 104, 64, 57, 59, 4, 30, 5, 86, 74, 56, 10, 0, 29, 105, 117, 64, 65, 97, 25, 56, 19, 7, 35, 3, 11, 109, 28, 105, 99, 65, 52, 56, 0, 49, 3, 77, 75, 124, 12, 40, 18, 126, 112, 64, 72, 86, 18, 125, 30, 10, 39, 93, 13, 12, 29, 104, 101, 107, 59, 45, 5, 29, 10, 109, 64, 117, 1, 39, 22, 107, 118, 110, 73, 89, 20, 80, 17, 26, 34, 92, 4, 101, 22, 58, 104, 104, 63, 60, 3, 24, 11, 46, 70, 12, 14, 6, 19, 8, Byte.MAX_VALUE, 68, 66, 72, 25, 38, 21, 68, 36, 82, 5, 118, 16, 117, 103, 77, 58, 23, 10, 37, 0, 70, 75, 112, 10, 20, 21, 25, 126, 81, 68, 77, 22, 98, 16, 90, 45, 83, 14, 104, 29, 69, 99, 95, 60, 14, 11, 62, 6, 78, 68, 5, 15, 2, 28, 114, 117, 99};
        }

        private static byte[] cemzhcnhuoaykxc() {
            return new byte[]{-119, -40, 70, 104, 19, 79, 30, 34, 44, 72, 12, 2, 18, 78, 98, 68, 52, 125, 11, 51, 2, 110, 68, 16, 11, 50, 29, 91, 126, 73, 64, 68, 22, 99, 20, 18};
        }

        private static byte[] iviptolczkmlibv() {
            return new byte[]{-119, -45, 64, 103, 17, 71, 31, 39};
        }

        private static byte[] dguajvxqocraoij() {
            return new byte[]{-115, -37, 64, 120, 23, 70, 19, 60, 33, 89, 13, 114, 16, 58, 100, 123, 52, 58, 6, 0, 2, 111, 69, 17, 12, 8, 16, Byte.MAX_VALUE};
        }

        private static int ynqmwwoaopobxtct(int i, int i2) {
            return i2 ^ i;
        }
    }

    public static class EncryptedLicensePayload {

        @JsonProperty("nonce")
        String nonce;

        @JsonProperty("ciphertext")
        String ciphertext;

        @JsonProperty("encrypted_key")
        String encryptedAesKey;
        private static int OHsY2Lsf7m = 0;
        private transient int JGXviGGzGY = 197974222;
        private static String[] nothing_to_see_here = new String[18];

        @Generated
        public String getNonce(int i) {
            int i2 = 348151339 ^ (959316828 ^ 457912435);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1255446495) {
                int i3 = 1625382828 ^ i2;
                return this.nonce;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1255446495 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (831148581 ^ i2)) {
                    int i4 = 1601685684 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1306421950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (730921962 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 196185739 ^ i2;
            throw new RuntimeException();
        }

        @Generated
        public String getCiphertext(int i) {
            int i2 = 1803343803 ^ (1378840977 ^ 457912435);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 281326281) {
                int i3 = 1145872885 ^ i2;
                return this.ciphertext;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 281326281 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (63669693 ^ i2)) {
                    int i4 = 389808449 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 849460579 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (327398989 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 286211267 ^ i2;
            throw new IOException();
        }

        @Generated
        public String getEncryptedAesKey(int i) {
            int i2 = 519114870 ^ (2052034135 ^ 457912435);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -5410157) {
                int i3 = 964435731 ^ i2;
                return this.encryptedAesKey;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 877496842 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (979424178 ^ i2)) {
                    int i4 = 708416675 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -5410157 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (837824490 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 393198474 ^ i2;
            throw new IOException();
        }

        @Generated
        public void setNonce(String str) {
            int i = 317714607 ^ (1946490308 ^ 457912435);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -317806397) {
                int i2 = 2096731647 ^ i;
                this.nonce = str;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 180487992 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1290863914 ^ i)) {
                    int i3 = 557946891 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -317806397 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1556333302 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 447245001 ^ i;
            throw new IllegalAccessException();
        }

        @Generated
        public void setCiphertext(String str) {
            int i = 754783911 ^ (390409757 ^ 457912435);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 127419977) {
                int i2 = 2064821876 ^ i;
                this.ciphertext = str;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 127419977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (413189236 ^ i)) {
                    int i3 = 1563559329 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -552782358 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1864134736 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 912449390 ^ i;
            throw new IllegalAccessException();
        }

        @Generated
        public void setEncryptedAesKey(String str) {
            int i = 1461898651 ^ (167319391 ^ 457912435);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 747066810) {
                int i2 = 1894267260 ^ i;
                this.encryptedAesKey = str;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 747066810 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1578188152 ^ i)) {
                    int i3 = 1693484245 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1413046695 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (702546622 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 857370732 ^ i;
            throw new IOException();
        }

        @lombok.Generated
        public boolean equals(java.lang.Object r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.EncryptedLicensePayload.equals(java.lang.Object):boolean");
        }

        @Generated
        protected boolean canEqual(Object obj, int i) {
            int i2 = 1897567414 ^ (767705052 ^ 457912435);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1016912074) {
                int i3 = 1760118317 ^ i2;
                return obj instanceof EncryptedLicensePayload;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1016912074 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1873277210 ^ i2)) {
                    int i4 = 1520428676 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2077682081 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2108076097 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1277539054 ^ i2;
            throw new IOException();
        }

        @lombok.Generated
        public int hashCode() {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.EncryptedLicensePayload.hashCode():int");
        }

        @Generated
        public String toString() {
            int i = 588497891 ^ (1248784287 ^ 457912435);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1850679173) {
                int i2 = 668159278 ^ i;
                return "PikzLicense.EncryptedLicensePayload(nonce=" + getNonce(1184518503) + ", ciphertext=" + getCiphertext(197264026) + ", encryptedAesKey=" + getEncryptedAesKey(1301009907) + ")";
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1356166902 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (866599635 ^ i)) {
                    int i3 = 405076780 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1850679173 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (881610204 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 827733586 ^ i;
            throw new RuntimeException();
        }

        @Generated
        public EncryptedLicensePayload(String str, String str2, String str3, int i) {
            int i2 = 883230473 ^ (288749994 ^ 1909601054);
            int parseInt = 793478959 ^ (1184441146 ^ Integer.parseInt("1032874408"));
            this.JGXviGGzGY = 197974222 ^ OHsY2Lsf7m;
            int i3 = 1495964758 ^ parseInt;
            this.nonce = str;
            this.ciphertext = str2;
            this.encryptedAesKey = str3;
        }

        @Generated
        public EncryptedLicensePayload() {
            int i = 49297323 ^ (705259700 ^ 2076902728);
            int parseInt = 2104941140 ^ (332720555 ^ Integer.parseInt("1032874408"));
            this.JGXviGGzGY = 197974222 ^ OHsY2Lsf7m;
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                    case 20044858:
                        int i2 = 1182856183 ^ parseInt;
                        return;
                    case 44032167:
                    default:
                        throw new RuntimeException();
                    case 1090951904:
                    case 2007723840:
                        return;
                }
            }
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
            OHsY2Lsf7m = (-1818590631) ^ new Random(-3140156932325442140L).nextInt();
        }

        public static String jvsjcsmwip(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] ybiyyujrhqoixcx() {
            return new byte[]{30, 7, 57, 119, 38, 12, 103, 104, 106, 62, 58, 80, 125, 44, 25, 71, 103, 68, 59, 71, 44, 5, 94, 102, 59, 114, 113, 104, 21, 97, 24, 95, 108, 100, 69, 47, 3, 77, 46, 125, 65, 106, 45, 1, 105, 81, 101, 50, 111, 120, 7, 21};
        }

        private static int cpwpwitslztutcxp(int i, int i2) {
            return i2 ^ i;
        }
    }

    public static class EncryptedLicenseResponse {

        @JsonProperty("nonce")
        String nonce;

        @JsonProperty("ciphertext")
        String ciphertext;
        private static int TwYBsPvCRC = 0;
        private transient int WiNRM4lNxW = 720926881;
        private static String[] nothing_to_see_here = new String[18];

        @Generated
        public String getNonce(int i) {
            int i2 = 198321895 ^ (578274831 ^ 1069265249);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1326281656) {
                int i3 = 1121719616 ^ i2;
                return this.nonce;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1326281656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1689301982 ^ i2)) {
                    int i4 = 1474350655 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1508759990 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (15434069 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 884742767 ^ i2;
            throw new IOException();
        }

        @Generated
        public String getCiphertext(int i) {
            int i2 = 1508441842 ^ (1512569431 ^ 1069265249);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -475681247) {
                int i3 = 80050468 ^ i2;
                return this.ciphertext;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -980523263 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2020684955 ^ i2)) {
                    int i4 = 42472668 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -475681247 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (789184409 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 247960753 ^ i2;
            throw new IOException();
        }

        @Generated
        public void setNonce(String str) {
            int i = 1774000930 ^ (314164931 ^ 1069265249);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 637232130) {
                int i2 = 592958214 ^ i;
                this.nonce = str;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1061551155 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (178839565 ^ i)) {
                    int i3 = 1886935008 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 637232130 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1953830705 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1887318254 ^ i;
            throw new IOException();
        }

        @Generated
        public void setCiphertext(String str) {
            int i = 1239949435 ^ (248314364 ^ 1069265249);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -990165197) {
                int i2 = 962338532 ^ i;
                this.ciphertext = str;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 236695570 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (462735094 ^ i)) {
                    int i3 = 352663427 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -990165197 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (999276429 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 906262079 ^ i;
            throw new IOException();
        }

        @lombok.Generated
        public boolean equals(java.lang.Object r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.EncryptedLicenseResponse.equals(java.lang.Object):boolean");
        }

        @Generated
        protected boolean canEqual(Object obj, int i) {
            int i2 = 478478858 ^ (1483799335 ^ 1069265249);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -630046109) {
                int i3 = 155514541 ^ i2;
                return obj instanceof EncryptedLicenseResponse;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -630046109 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (996101578 ^ i2)) {
                    int i4 = 341078049 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1873414389 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1925757298 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 789805966 ^ i2;
            throw new IllegalAccessException();
        }

        @lombok.Generated
        public int hashCode() {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.EncryptedLicenseResponse.hashCode():int");
        }

        @Generated
        public String toString() {
            int i = 326348983 ^ (1855876749 ^ 1069265249);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 313752282) {
                int i2 = 525103244 ^ i;
                return "PikzLicense.EncryptedLicenseResponse(nonce=" + getNonce(1552812348) + ", ciphertext=" + getCiphertext(796801164) + ")";
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -388956486 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1756259250 ^ i)) {
                    int i3 = 699577086 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 313752282 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (427735195 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 112015313 ^ i;
            throw new IllegalAccessException();
        }

        @Generated
        public EncryptedLicenseResponse(String str, String str2) {
            int i = 1845887206 ^ 1386365087;
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                    case 92143694:
                        int i2 = 1134859001 ^ i;
                        break;
                    case 419803816:
                    default:
                        throw new IOException();
                    case 1006362939:
                    case 1253389173:
                        break;
                }
            }
            int parseInt = 1385887410 ^ (1731693592 ^ Integer.parseInt("1252894762"));
            this.WiNRM4lNxW = 720926881 ^ TwYBsPvCRC;
            int i3 = 2081829482 ^ parseInt;
            this.nonce = str;
            this.ciphertext = str2;
        }

        @lombok.Generated
        public EncryptedLicenseResponse() {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.EncryptedLicenseResponse.<init>():void");
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
            TwYBsPvCRC = 1728690724 ^ new Random(519274497152823371L).nextInt();
        }

        public static String mooxwizacc(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] bxclzturxmqnrqc() {
            return new byte[]{68, 126, 99, 4, 117, 65, 59, 64, 6, 108, 88, 81, 116, 67, 91, 17, 59, 47, 42, 12, 49, 17, 95, 120, 68, 14, 51, 11, 115, 56, 44, 109, 43, 14, 21, 64, 100, 118, 18, 117, 124, 63, 46};
        }

        private static int hrcspnrflksfvapl(int i, int i2) {
            return i2 ^ i;
        }
    }

    public static class LicensePayload {

        @JsonProperty("license_key")
        String licenseKey;

        @JsonProperty("resource_name")
        String resourceName;

        @JsonProperty("extra_fields")
        LinkedHashMap<String, String> extraFields;

        @JsonProperty("operating_system")
        String operatingSystem;

        @JsonProperty("server_version")
        String serverVersion;

        @JsonProperty("timestamp")
        long timestamp;
        private static int gS17LlGzY4 = 0;
        private transient int XMCCa3Usph = 1042668483;
        private static String zyjqxlhaxs;
        private static String[] nothing_to_see_here = new String[15];

        @Generated
        public String getLicenseKey(int i) {
            int i2 = 2112998228 ^ (1603137949 ^ 399663238);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1384983943) {
                int i3 = 1352753402 ^ i2;
                return this.licenseKey;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 679073195 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (897311933 ^ i2)) {
                    int i4 = 540122572 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1384983943 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1816303945 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1372823799 ^ i2;
            throw new IOException();
        }

        @Generated
        public String getResourceName(int i) {
            int i2 = 1701139559 ^ (201962313 ^ 399663238);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -168542909) {
                int i3 = 1060747457 ^ i2;
                return this.resourceName;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 205126474 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2092772831 ^ i2)) {
                    int i4 = 847334055 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -168542909 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (736502938 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1169290913 ^ i2;
            throw new RuntimeException();
        }

        @Generated
        public LinkedHashMap getExtraFields(int i) {
            int i2 = 1842742351 ^ (2141520241 ^ 399663238);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 755707328) {
                int i3 = 443961042 ^ i2;
                return this.extraFields;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -21406896 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1562342019 ^ i2)) {
                    int i4 = 207814308 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 755707328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (158809564 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1264046658 ^ i2;
            throw new IllegalAccessException();
        }

        @Generated
        public String getOperatingSystem(int i) {
            int i2 = 614059918 ^ (2021920493 ^ 399663238);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1585254186) {
                int i3 = 1417943452 ^ i2;
                return this.operatingSystem;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1585254186 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (683377259 ^ i2)) {
                    int i4 = 1199728642 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -94518328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (52405116 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1269309885 ^ i2;
            throw new IOException();
        }

        @Generated
        public String getServerVersion(int i) {
            int i2 = 1353631613 ^ (1036010755 ^ 399663238);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -706275389) {
                int i3 = 1153292325 ^ i2;
                return this.serverVersion;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -267790615 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1005797631 ^ i2)) {
                    int i4 = 1815180763 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -706275389 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1995457078 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1428047156 ^ i2;
            throw new RuntimeException();
        }

        @Generated
        public long getTimestamp(int i) {
            int i2 = 1870237334 ^ (211315474 ^ 399663238);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1583601645) {
                int i3 = 2133455956 ^ i2;
                return this.timestamp;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1583601645 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (564711386 ^ i2)) {
                    int i4 = 754220695 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1490258608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1705591786 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 153759316 ^ i2;
            throw new IllegalAccessException();
        }

        @Generated
        public void setLicenseKey(String str) {
            int i = 95085302 ^ (695438772 ^ 399663238);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -665289183) {
                int i2 = 1988940746 ^ i;
                this.licenseKey = str;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1816060018 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (135266645 ^ i)) {
                    int i3 = 1646285545 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -665289183 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1959662024 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1542600917 ^ i;
            throw new IllegalAccessException();
        }

        @Generated
        public void setResourceName(String str) {
            int i = 100787591 ^ (192448029 ^ 399663238);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -715646752) {
                int i2 = 1865055194 ^ i;
                this.resourceName = str;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -715646752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1141338997 ^ i)) {
                    int i3 = 81688219 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1408514509 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1587742826 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1893950194 ^ i;
            throw new IOException();
        }

        @Generated
        public void setExtraFields(LinkedHashMap<String, String> linkedHashMap) {
            int i = 2132582210 ^ (1419558845 ^ 399663238);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -493747255) {
                int i2 = 1709325924 ^ i;
                this.extraFields = linkedHashMap;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -846991126 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1275908061 ^ i)) {
                    int i3 = 1183118661 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -493747255 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1470729239 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1434898094 ^ i;
            throw new IllegalAccessException();
        }

        @Generated
        public void setOperatingSystem(String str) {
            int i = 2038021864 ^ (438688576 ^ 399663238);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1536153229) {
                int i2 = 1362305893 ^ i;
                this.operatingSystem = str;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1536153229 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (884973066 ^ i)) {
                    int i3 = 490751083 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 770257497 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1262395960 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 858942714 ^ i;
            throw new RuntimeException();
        }

        @Generated
        public void setServerVersion(String str) {
            int i = 533270413 ^ (1943512014 ^ 399663238);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -563714517) {
                int i2 = 1894935186 ^ i;
                this.serverVersion = str;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1509241528 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (488010994 ^ i)) {
                    int i3 = 906062343 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -563714517 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2004133574 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 273337628 ^ i;
            throw new IllegalAccessException();
        }

        @Generated
        public void setTimestamp(long j) {
            int i = 269924613 ^ (700295759 ^ 399663238);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1942724193) {
                int i2 = 1608397376 ^ i;
                this.timestamp = j;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1925575581 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1520588626 ^ i)) {
                    int i3 = 1773843437 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1942724193 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1661229161 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1504500704 ^ i;
            throw new RuntimeException();
        }

        @lombok.Generated
        public boolean equals(java.lang.Object r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.LicensePayload.equals(java.lang.Object):boolean");
        }

        @Generated
        protected boolean canEqual(Object obj, int i) {
            int i2 = 2082303442 ^ (413472692 ^ 399663238);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1689200893) {
                int i3 = 342020837 ^ i2;
                return obj instanceof LicensePayload;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1689200893 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1405628069 ^ i2)) {
                    int i4 = 1696996138 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 944128043 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (652309678 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 2047059050 ^ i2;
            throw new IllegalAccessException();
        }

        @lombok.Generated
        public int hashCode() {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.LicensePayload.hashCode():int");
        }

        @Generated
        public String toString() {
            int i = 198195799 ^ (1190641514 ^ 399663238);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -676385318) {
                int i2 = 2129201408 ^ i;
                return "PikzLicense.LicensePayload(licenseKey=" + getLicenseKey(240048879) + ", resourceName=" + getResourceName(1689819068) + ", extraFields=" + String.valueOf(getExtraFields(2083547181)) + ", operatingSystem=" + getOperatingSystem(1007783193) + ", serverVersion=" + getServerVersion(680696218) + ", timestamp=" + getTimestamp(1698907094) + ")";
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -676385318 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (480646546 ^ i)) {
                    int i3 = 845215855 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 552035801 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (302171409 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 818290045 ^ i;
            throw new RuntimeException();
        }

        @lombok.Generated
        public LicensePayload(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.LinkedHashMap<java.lang.String, java.lang.String> r8, java.lang.String r9, java.lang.String r10, long r11) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.LicensePayload.<init>(java.lang.String, java.lang.String, java.util.LinkedHashMap, java.lang.String, java.lang.String, long, int):void");
        }

        @Generated
        public LicensePayload() {
            zfwffcbsvxtsdtxg(319329069 ^ 48559116, 1138081260);
            int parseInt = 2088590030 ^ (164981463 ^ Integer.parseInt("663874260"));
            this.XMCCa3Usph = 1042668483 ^ gS17LlGzY4;
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                    case 256918996:
                        int i = 1459849282 ^ parseInt;
                        return;
                    case 551479979:
                    default:
                        throw new IllegalAccessException();
                    case 1261528356:
                    case 1491788084:
                        return;
                }
            }
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
            zyjqxlhaxs = ByteBuffer.wrap(whnjfxlofbovwmd()).asCharBuffer().toString();
            gS17LlGzY4 = (-202135906) ^ new Random(-3371403171401194613L).nextInt();
        }

        public static String bungmnseyv(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = zyjqxlhaxs.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

        private static byte[] whnjfxlofbovwmd() {
            return new byte[0];
        }

        private static int zfwffcbsvxtsdtxg(int i, int i2) {
            return i2 ^ i;
        }
    }

    public static class LicenseResponse {

        @JsonProperty("license_key")
        String licenseKey;

        @JsonProperty("resources")
        String[] resources;

        @JsonProperty("discord_id")
        String discordId;

        @JsonProperty("bbb_username")
        String bbbUsername;

        @JsonProperty("creation_date")
        long creationDate;

        @JsonProperty("associated_ips")
        String[] associatedIPs;

        @JsonProperty("addons")
        String[] addons;

        @JsonProperty("timestamp")
        long timestamp;

        private static int f103ncVkg0lMd = 0;

        private transient int f110HUzAkV4jB = 478417538;
        private static String[] nothing_to_see_here = new String[19];

        @Generated
        public String getLicenseKey(int i) {
            int i2 = 1333920499 ^ (1701602158 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1201113136) {
                int i3 = 1846058959 ^ i2;
                return this.licenseKey;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1201113136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1846810968 ^ i2)) {
                    int i4 = 461564294 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -936605269 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (476305210 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 2146519805 ^ i2;
            throw new IOException();
        }

        @Generated
        public String[] getResources(int i) {
            int i2 = 1394676567 ^ (187930339 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 797922971) {
                int i3 = 1640659778 ^ i2;
                return this.resources;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 797922971 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1215133592 ^ i2)) {
                    int i4 = 705665606 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 568102024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (139942755 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1468358855 ^ i2;
            throw new IllegalAccessException();
        }

        @Generated
        public String getDiscordId(int i) {
            int i2 = 764900820 ^ (935469379 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1035067265) {
                int i3 = 1717481857 ^ i2;
                return this.discordId;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1035067265 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (359883869 ^ i2)) {
                    int i4 = 1466809854 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 256136074 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (746001966 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 525319978 ^ i2;
            throw new IllegalAccessException();
        }

        @Generated
        public String getBbbUsername(int i) {
            int i2 = 1521283775 ^ (1320846432 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1336462785) {
                int i3 = 1690249008 ^ i2;
                return this.bbbUsername;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1783755842 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1783170537 ^ i2)) {
                    int i4 = 599192451 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1336462785 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1279554142 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1022438163 ^ i2;
            throw new IllegalAccessException();
        }

        @Generated
        public long getCreationDate(int i) {
            int i2 = 1757404655 ^ (1163259722 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2142573040) {
                int i3 = 1436503785 ^ i2;
                return this.creationDate;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 749771098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1118711702 ^ i2)) {
                    int i4 = 1591607744 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2142573040 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (621538847 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 28184302 ^ i2;
            throw new RuntimeException();
        }

        @Generated
        public String[] getAssociatedIPs(int i) {
            int i2 = 435588211 ^ (1648841669 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 848660106) {
                int i3 = 1296018225 ^ i2;
                return this.associatedIPs;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 848660106 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1756203833 ^ i2)) {
                    int i4 = 1505453488 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1533599488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (570487403 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1920174023 ^ i2;
            throw new IllegalAccessException();
        }

        @Generated
        public String[] getAddons(int i) {
            int i2 = 364595463 ^ (1865677019 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 996079066) {
                int i3 = 1911370245 ^ i2;
                return this.addons;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1271437839 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (53715795 ^ i2)) {
                    int i4 = 740878920 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 996079066 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (646489802 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1974258614 ^ i2;
            throw new IllegalAccessException();
        }

        @Generated
        public long getTimestamp(int i) {
            int i2 = 1056624272 ^ (1437021454 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1242257462) {
                int i3 = 3234693 ^ i2;
                return this.timestamp;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1242257462 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (53466479 ^ i2)) {
                    int i4 = 1139099717 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1266779166 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1261059999 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 485272335 ^ i2;
            throw new RuntimeException();
        }

        @Generated
        public void setLicenseKey(String str) {
            int i = 1999879708 ^ (1750468095 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 339125281) {
                int i2 = 1114362748 ^ i;
                this.licenseKey = str;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 124272579 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (969790574 ^ i)) {
                    int i3 = 205638804 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 339125281 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (801442025 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 433062612 ^ i;
            throw new RuntimeException();
        }

        @Generated
        public void setResources(String[] strArr) {
            int i = 2138830672 ^ (1592792165 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -482057584) {
                int i2 = 638033225 ^ i;
                this.resources = strArr;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -747075367 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (682070018 ^ i)) {
                    int i3 = 94607837 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -482057584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (137528587 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1680898000 ^ i;
            throw new RuntimeException();
        }

        @Generated
        public void setDiscordId(String str) {
            int i = 1604354987 ^ (70566381 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 867789067) {
                int i2 = 1450356694 ^ i;
                this.discordId = str;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2144593991 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (567336063 ^ i)) {
                    int i3 = 1908046749 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 867789067 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1343644361 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 766188150 ^ i;
            throw new IllegalAccessException();
        }

        @Generated
        public void setBbbUsername(String str) {
            int i = 93498056 ^ (186494891 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1687990239) {
                int i2 = 584073180 ^ i;
                this.bbbUsername = str;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1914523968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (770516006 ^ i)) {
                    int i3 = 1497862120 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1687990239 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1529813145 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1439140714 ^ i;
            throw new IllegalAccessException();
        }

        @Generated
        public void setCreationDate(long j) {
            int i = 1706620087 ^ (1328909098 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1150253104) {
                int i2 = 1892029582 ^ i;
                this.creationDate = j;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1027613603 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1668237237 ^ i)) {
                    int i3 = 883823920 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1150253104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (509832912 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1418688097 ^ i;
            throw new RuntimeException();
        }

        @Generated
        public void setAssociatedIPs(String[] strArr) {
            int i = 1868253011 ^ (1611621500 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1782947263) {
                int i2 = 1090891013 ^ i;
                this.associatedIPs = strArr;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1651045781 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (962995015 ^ i)) {
                    int i3 = 494860408 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1782947263 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1283193197 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1375186346 ^ i;
            throw new RuntimeException();
        }

        @Generated
        public void setAddons(String[] strArr) {
            int i = 657659299 ^ (2057752774 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 62214163) {
                int i2 = 1335384597 ^ i;
                this.addons = strArr;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2138538169 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1831241469 ^ i)) {
                    int i3 = 1589769600 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 62214163 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (84391190 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1023880999 ^ i;
            throw new RuntimeException();
        }

        @Generated
        public void setTimestamp(long j) {
            int i = 284498059 ^ (772290245 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 418515272) {
                int i2 = 1386079961 ^ i;
                this.timestamp = j;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1944240254 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (347195719 ^ i)) {
                    int i3 = 1173014019 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 418515272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1724477064 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1811172026 ^ i;
            throw new IOException();
        }

        @lombok.Generated
        public boolean equals(java.lang.Object r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.LicenseResponse.equals(java.lang.Object):boolean");
        }

        @Generated
        protected boolean canEqual(Object obj, int i) {
            int i2 = 1269742728 ^ (2070860057 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1763186608) {
                int i3 = 2114350627 ^ i2;
                return obj instanceof LicenseResponse;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1763186608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1318813718 ^ i2)) {
                    int i4 = 1265904415 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1725208917 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1571939792 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 2056828228 ^ i2;
            throw new IllegalAccessException();
        }

        @lombok.Generated
        public int hashCode() {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.LicenseResponse.hashCode():int");
        }

        @Generated
        public String toString() {
            int i = 2124138028 ^ (1824960651 ^ 1038315367);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 2112933377) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -436997711 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1734157535 ^ i)) {
                        int i2 = 1599412552 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2112933377 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1643952677 ^ i)) {
                            break;
                        }
                    }
                }
                int i3 = 1713060523 ^ i;
                throw new IOException();
            }
            int i4 = 318793718 ^ i;
            String licenseKey = getLicenseKey(527066744);
            String deepToString = Arrays.deepToString(getResources(246264889));
            String discordId = getDiscordId(1340264102);
            String bbbUsername = getBbbUsername(1824871582);
            long creationDate = getCreationDate(1711081746);
            String deepToString2 = Arrays.deepToString(getAssociatedIPs(342680995));
            String deepToString3 = Arrays.deepToString(getAddons(327278506));
            getTimestamp(1959406999);
            return "PikzLicense.LicenseResponse(licenseKey=" + licenseKey + ", resources=" + deepToString + ", discordId=" + discordId + ", bbbUsername=" + bbbUsername + ", creationDate=" + creationDate + ", associatedIPs=" + licenseKey + ", addons=" + deepToString2 + ", timestamp=" + deepToString3 + ")";
        }

        @lombok.Generated
        public LicenseResponse(java.lang.String r5, java.lang.String[] r6, java.lang.String r7, java.lang.String r8, long r9, java.lang.String[] r11, java.lang.String[] r12, long r13) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.LicenseResponse.<init>(java.lang.String, java.lang.String[], java.lang.String, java.lang.String, long, java.lang.String[], java.lang.String[], long):void");
        }

        @lombok.Generated
        public LicenseResponse() {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.LicenseResponse.<init>():void");
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
            f103ncVkg0lMd = (-1677104611) ^ new Random(7177866973153494351L).nextInt();
        }

        public static String uoxgqpxgjx(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] eqrhgurrzzqsyiv() {
            return new byte[]{73, 67, 38, 34, 119, 54, 30, 3, Byte.MAX_VALUE, 72, 1, 1, 6, 90, 125, 34, 117, 45, 91, 105, 85, 123, 106, 38, 89, 97, 116, 34, 62, 47, 40, 62, 115, 126, 40, 100, 60, 99, 122, 82, 27, 12, 109, 46, 41, 45, 88, 75, 43, 29, 37, 31, 56, 124, 54, 116, 98, 26, 121, 113, 22, 67, 40, 69, 92, 37, 20, 9, 13, 33, 104, 17, 74, 93, 80, 28, 25, 89, 76, 82, 122, 30, 49, 99, 72, 94, 118, 61, 98, 73, 60, 102, 92, 110, 33, 89, 44, 36, 24, 125, 49, 18, 56, 100, 67, 91, 63};
        }

        private static int hthxihfylcutwmgo(int i, int i2) {
            return i ^ i2;
        }
    }

    public static class LicenseVerificationException extends Exception {
        private static int AK4aEx6EUR = 0;
        private transient int hYGBlxldcD = 2097497346;
        private static String[] nothing_to_see_here = new String[15];

        public LicenseVerificationException(String str) {
            super(str);
            int i = 1307099478 ^ (779269115 ^ 216881204);
            int parseInt = 1520892455 ^ (1318411125 ^ Integer.parseInt("2068089803"));
            this.hYGBlxldcD = 2097497346 ^ AK4aEx6EUR;
            int zqrvwoeayjelrgvd = 919456896 ^ zqrvwoeayjelrgvd(parseInt, 501824595);
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
            AK4aEx6EUR = (-1701288082) ^ new Random(4241818779145790147L).nextInt();
        }

        private static int zqrvwoeayjelrgvd(int i, int i2) {
            return i ^ i2;
        }
    }

    public static class SignedLicenseResponse {

        @JsonProperty("signature")
        String signature;

        @JsonProperty("data")
        LicenseResponse data;

        private static int f124IjO7qCEPe = 0;
        private transient int HNyEWRA6xK = 482526142;
        private static String azwhpceafy;
        private static String[] nothing_to_see_here = new String[13];

        @Generated
        public String getSignature(int i) {
            int i2 = 62869228 ^ (1946810161 ^ 475827881);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1599191971) {
                int i3 = 355776836 ^ i2;
                return this.signature;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -151752317 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2091393168 ^ i2)) {
                    int i4 = 1816264356 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1599191971 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1965640386 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 159910822 ^ i2;
            throw new IllegalAccessException();
        }

        @Generated
        public LicenseResponse getData(int i) {
            int i2 = 2089690054 ^ (1610145312 ^ 475827881);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -111961479) {
                int i3 = 1896015831 ^ i2;
                return this.data;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -111961479 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1065370423 ^ i2)) {
                    int i4 = 383464697 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1900324034 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1269056801 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1173974468 ^ i2;
            throw new IOException();
        }

        @Generated
        public void setSignature(String str) {
            int i = 162978834 ^ (118204857 ^ 475827881);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1760569328) {
                int i2 = 1857239798 ^ i;
                this.signature = str;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1760569328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1865400284 ^ i)) {
                    int i3 = 409122690 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -493482077 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (559777173 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1117768823 ^ i;
            throw new IOException();
        }

        @Generated
        public void setData(LicenseResponse licenseResponse) {
            int i = 36553400 ^ (627334472 ^ 475827881);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -660043063) {
                int i2 = 299822268 ^ i;
                this.data = licenseResponse;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1449127721 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (320060473 ^ i)) {
                    int i3 = 1751219036 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -660043063 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (6348631 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 427320240 ^ i;
            throw new IOException();
        }

        @lombok.Generated
        public boolean equals(java.lang.Object r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.SignedLicenseResponse.equals(java.lang.Object):boolean");
        }

        @Generated
        protected boolean canEqual(Object obj, int i) {
            int i2 = 1825601168 ^ (473835749 ^ 475827881);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1704363747) {
                int i3 = 797287403 ^ i2;
                return obj instanceof SignedLicenseResponse;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1704363747 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (931595382 ^ i2)) {
                    int i4 = 154090034 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 431724986 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2070331208 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 270285841 ^ i2;
            throw new IllegalAccessException();
        }

        @Generated
        public int hashCode() {
            int hashCode;
            int i;
            int hashCode2;
            int npkmbzqdibfptjih;
            int i2 = 954984311 ^ (1203990480 ^ 475827881);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 463482995) {
                int i3 = 1404252875 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2043042263) {
                    i2 = 1340897808 ^ i3;
                    byte b = (byte) (2133544660 ^ i2);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -111511893) {
                        i2 = 1763525934 ^ i2;
                        String signature = getSignature(971093508);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1313841192) {
                            int i4 = 1704452059 ^ i2;
                            int i5 = b * ((byte) (1939985435 ^ i4));
                            if (signature != null) {
                                i2 = npkmbzqdibfptjih(i4, 1359341675);
                                hashCode = signature.hashCode();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 354542169) {
                                    i = 1711653464 ^ i2;
                                }
                            } else {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1659985661) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1659985661 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1602562063 ^ i4)) {
                                            break;
                                        }
                                    }
                                    int i6 = 1307488914 ^ i4;
                                    throw new IOException("double");
                                }
                                i3 = 1770461723 ^ i4;
                                hashCode = (byte) (438750736 ^ i3);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -784961064) {
                                    int i7 = 1456025763 ^ i3;
                                    try {
                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i7) != 84980137) {
                                            throw null;
                                        }
                                        throw new RuntimeException();
                                    } catch (RuntimeException e) {
                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                            case 1736438978:
                                                i = 297826509 ^ i7;
                                                break;
                                            case 1746292675:
                                                i = 808275885 ^ i7;
                                                break;
                                            default:
                                                throw new IllegalAccessException("Error in hash");
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -377736534) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -377736534 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (65206956 ^ i)) {
                                                    int i8 = 259573621 ^ i;
                                                    throw new RuntimeException("double");
                                                }
                                            }
                                        }
                                        while (true) {
                                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                                                case 76302699:
                                                    i = 428767302 ^ i;
                                                    break;
                                                case 177388600:
                                                case 1974317961:
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                            int i9 = i5 + hashCode;
                            LicenseResponse data = getData(1456677543);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 621801626) {
                                i3 = 1464716514 ^ i;
                                int i10 = i9 * ((byte) (334246602 ^ i3));
                                if (data != null) {
                                    i = npkmbzqdibfptjih(i3, 1535047903);
                                    hashCode2 = data.hashCode();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1150701938) {
                                        int i11 = 944751531 ^ i;
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1150701938 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (108456002 ^ i)) {
                                            int i12 = 1635335335 ^ i;
                                            throw new IOException("double");
                                        }
                                    }
                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1620994168) {
                                    int i13 = 960881181 ^ i3;
                                    hashCode2 = (byte) (715772103 ^ i13);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1431209825) {
                                        int npkmbzqdibfptjih2 = npkmbzqdibfptjih(i13, 1663639531);
                                        try {
                                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(npkmbzqdibfptjih2) != 241817757) {
                                                throw null;
                                            }
                                            throw new IllegalAccessException();
                                        } catch (IllegalAccessException e2) {
                                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                                                case -170291071:
                                                    npkmbzqdibfptjih = npkmbzqdibfptjih(npkmbzqdibfptjih2, 1560652968);
                                                    break;
                                                case 1275492410:
                                                    npkmbzqdibfptjih = 708727231 ^ npkmbzqdibfptjih2;
                                                    break;
                                                default:
                                                    throw new RuntimeException("Error in hash");
                                            }
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(npkmbzqdibfptjih) == 502592963) {
                                                npkmbzqdibfptjih(npkmbzqdibfptjih, 325293885);
                                            } else {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(npkmbzqdibfptjih) == 502592963 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(npkmbzqdibfptjih) == (1057153473 ^ npkmbzqdibfptjih)) {
                                                        int i14 = 318950481 ^ npkmbzqdibfptjih;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1431209825 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (955373292 ^ i13)) {
                                                int i15 = 2089998454 ^ i13;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1746292675 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (762753010 ^ i13)) {
                                                    int i16 = 1712683580 ^ i13;
                                                    throw new RuntimeException("double");
                                                }
                                            }
                                        }
                                    }
                                }
                                return i10 + hashCode2;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 621801626 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (984704813 ^ i)) {
                                    int i17 = 771981874 ^ i;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -784961064 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (379609183 ^ i3)) {
                        int i18 = 396320346 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2043042263 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1215453883 ^ i3)) {
                            int i19 = 38134718 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1620994168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (521170413 ^ i3)) {
                                int i20 = 526855103 ^ i3;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 354542169 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1844504665 ^ i2)) {
                    int i21 = 1998635885 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2031596501 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1738115727 ^ i2)) {
                        int i22 = 542897197 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1736438978 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1351186624 ^ i2)) {
                            int i23 = 1353815538 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -170291071 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1517619780 ^ i2)) {
                                int i24 = 1146135806 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 463482995 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1256969505 ^ i2)) {
                                    int i25 = 68005258 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -111511893 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (368639932 ^ i2)) {
                                        int i26 = 928156649 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1313841192 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2020580322 ^ i2)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i27 = 403805557 ^ i2;
            throw new RuntimeException();
        }

        @Generated
        public String toString() {
            int i = 153899663 ^ (1299796293 ^ 475827881);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1068733670) {
                int i2 = 916093007 ^ i;
                return "PikzLicense.SignedLicenseResponse(signature=" + getSignature(971093508) + ", data=" + String.valueOf(getData(1456677543)) + ")";
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1956620643 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1464999553 ^ i)) {
                    int i3 = 1832188734 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1068733670 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1042305130 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 656683728 ^ i;
            throw new IOException();
        }

        @lombok.Generated
        public SignedLicenseResponse(java.lang.String r5, com.kammoun.donutCore.api.utils.PikzLicense.LicenseResponse r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.SignedLicenseResponse.<init>(java.lang.String, com.kammoun.donutCore.api.utils.PikzLicense$LicenseResponse):void");
        }

        @lombok.Generated
        public SignedLicenseResponse() {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.SignedLicenseResponse.<init>():void");
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
            azwhpceafy = ByteBuffer.wrap(yrhgqlhlckmkipe()).asCharBuffer().toString();
            f124IjO7qCEPe = (-1620448597) ^ new Random(-1141201318479850803L).nextInt();
        }

        public static String ofmxzzursm(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = azwhpceafy.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

        private static byte[] yrhgqlhlckmkipe() {
            return new byte[0];
        }

        private static int npkmbzqdibfptjih(int i, int i2) {
            return i ^ i2;
        }
    }

    public PikzLicense() {
        int i = 1955793220 ^ (334705064 ^ 757915244);
        int parseInt = 1678272131 ^ (1883181913 ^ Integer.parseInt("1585156954"));
        this.ia48TTtwEr = 1587412510 ^ xCOMoU7lOG;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 267695316:
                    int i2 = 737592309 ^ parseInt;
                    return;
                case 1057476436:
                    return;
                case 1783224176:
                case 1905939340:
                default:
                    throw new IllegalAccessException();
            }
        }
    }

    public static LicenseResponse verifyLicense(int i) throws Exception {
        int i2 = 439961324 ^ (1136184644 ^ (608084907 ^ 1269274490));
        validateLicenseKey(817978247);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1329202231) {
            i2 = 2075561578 ^ i2;
            LicensePayload buildLicensePayload = buildLicensePayload(886539140);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1836157082) {
                i2 = 1235915683 ^ i2;
                String generateAesKey = CryptoUtils.generateAesKey(784988031);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 539301248) {
                    int i3 = 738878402 ^ i2;
                    EncryptedLicensePayload encryptLicensePayload = CryptoUtils.encryptLicensePayload(buildLicensePayload, generateAesKey, 1385856308);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1081478033) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1081478033 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (562186640 ^ i3)) {
                                break;
                            }
                        }
                        int i4 = 1034807608 ^ i3;
                        throw new IOException("double");
                    }
                    i2 = 698744943 ^ i3;
                    String sendRequest = sendRequest(encryptLicensePayload, 2053806412);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 222693608) {
                        int i5 = 503816033 ^ i2;
                        return processResponse(sendRequest, generateAesKey, 425333539);
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1836157082 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (173400394 ^ i2)) {
                int i6 = 1644704371 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1329202231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (67678438 ^ i2)) {
                    int i7 = 1061494606 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 222693608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (383502169 ^ i2)) {
                        int i8 = 1710390911 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 539301248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (401191431 ^ i2)) {
                            int i9 = 926191208 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -42273824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (926475746 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i10 = 1420013133 ^ i2;
        throw new IOException();
    }

    private static void validateLicenseKey(int i) throws LicenseVerificationException {
        int i2;
        int i3 = 977810709 ^ (370304855 ^ (408393466 ^ 1269274490));
        if (LICENSE_KEY != null) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -44917229) {
                i3 = 97669699 ^ i3;
                if (LICENSE_KEY.trim().isEmpty() != (2054685057 ^ i3)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -742388725) {
                        i2 = 1857345248 ^ i3;
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                        case 222886033:
                            int i4 = 71863126 ^ i3;
                            return;
                        case 765069956:
                        default:
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1503216888 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (156247114 ^ i3)) {
                                    int i5 = 1584950309 ^ i3;
                                    throw new IllegalAccessException("double");
                                }
                            }
                            break;
                        case 1364149685:
                            return;
                        case 1766622354:
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -44917229 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1108183493 ^ i3)) {
                    int i6 = 593239215 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -242985285 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1742306122 ^ i3)) {
                        int i7 = 1259462855 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -742388725 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (808932336 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i8 = 2000721440 ^ i3;
            throw new RuntimeException();
        }
        i2 = 1801880739 ^ i3;
        throw new LicenseVerificationException(vqzsdmpcpz(yrqxkvmzcddrywl(), i2));
    }

    private static LicensePayload buildLicensePayload(int i) {
        int i2 = 533014543 ^ (251196398 ^ (647908226 ^ 1269274490));
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -534759221) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -534759221 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1703386658 ^ i2)) {
                    break;
                }
            }
            int i3 = 1300441997 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 874733386 ^ i2;
        String str = LICENSE_KEY;
        String vqzsdmpcpz = vqzsdmpcpz(khwamvflgyrvunn(), i4);
        LinkedHashMap<String, String> linkedHashMap = EXTRA_FIELDS;
        String vqzsdmpcpz2 = vqzsdmpcpz(qknuxllvqkobfog(), i4);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1094369946) {
            i4 = 679425875 ^ i4;
            LicensePayload licensePayload = new LicensePayload(str, vqzsdmpcpz, linkedHashMap, System.getProperty(vqzsdmpcpz2) + " " + System.getProperty(vqzsdmpcpz(opcpmzxvbxowoeh(), i4)), vqzsdmpcpz(wdqtzkklynuetbm(), i4), currentTimeMillis, 369204042);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 46364675) {
                int i5 = 867233262 ^ i4;
                return licensePayload;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1094369946 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (729277304 ^ i4)) {
                int i6 = 564986438 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1622927502 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1305987369 ^ i4)) {
                    int i7 = 1748294272 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 46364675 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1509525636 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1144317409 ^ i4;
        throw new RuntimeException();
    }

    private static String sendRequest(EncryptedLicensePayload encryptedLicensePayload, int i) throws Exception {
        int uplfawohnmipuebx;
        HttpResponse send;
        int i2 = 1016292578 ^ (1636352820 ^ 1269274490);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1243511456) {
            int i3 = 1952705228 ^ i2;
            HttpRequest.Builder uri = HttpRequest.newBuilder().uri(URI.create(vqzsdmpcpz(ylmmcmfqmdejqks(), i3)));
            String vqzsdmpcpz = vqzsdmpcpz(fogkuzpfmyiwvyo(), i3);
            String vqzsdmpcpz2 = vqzsdmpcpz(idfuajrcocnvpex(), i3);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 385798915) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 385798915 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (123411153 ^ i3)) {
                        int i4 = 2042421216 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -362842581 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1826250481 ^ i3)) {
                            break;
                        }
                    }
                }
                int i5 = 932685670 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 935997604 ^ i3;
            HttpRequest.Builder header = uri.header(vqzsdmpcpz, vqzsdmpcpz2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1464904158) {
                int i6 = 1950421624 ^ i2;
                HttpRequest build = header.POST(HttpRequest.BodyPublishers.ofString(CryptoUtils.stringify(encryptedLicensePayload, 1689464251))).build();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 178767329) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 178767329 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (809469867 ^ i6)) {
                            break;
                        }
                    }
                    int i7 = 1734666392 ^ i6;
                    throw new IllegalAccessException("double");
                }
                ?? r0 = 2114130299 ^ i6;
                try {
                    send = HttpClient.newHttpClient().send(build, HttpResponse.BodyHandlers.ofString());
                } catch (HttpTimeoutException e) {
                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                        case -1324574976:
                            uplfawohnmipuebx = 1713808688 ^ r0;
                            break;
                        case -98780390:
                            uplfawohnmipuebx = 793026739 ^ r0;
                            break;
                        case -88125894:
                            uplfawohnmipuebx = uplfawohnmipuebx(r0, 793828887);
                            break;
                        case 938225314:
                            uplfawohnmipuebx = 922399236 ^ r0;
                            break;
                        case 1053983362:
                            uplfawohnmipuebx = uplfawohnmipuebx(r0, 937256832);
                            break;
                        default:
                            throw new RuntimeException("Error in hash");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(uplfawohnmipuebx) == -2143699325) {
                        throw new LicenseVerificationException(vqzsdmpcpz(emktfefykfhdwvc(), 223140117 ^ uplfawohnmipuebx));
                    }
                } catch (Exception e2) {
                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                        case -1324574976:
                            i2 = 1467901277 ^ r0;
                            break;
                        case -98780390:
                            i2 = 505176286 ^ r0;
                            break;
                        case -88125894:
                            i2 = uplfawohnmipuebx(r0, 503848570);
                            break;
                        case 938225314:
                            i2 = 128086633 ^ r0;
                            break;
                        case 1053983362:
                            i2 = uplfawohnmipuebx(r0, 109422573);
                            break;
                        default:
                            throw new RuntimeException("Error in hash");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 184532458) {
                        int i8 = 1034299116 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -405894517) {
                            int i9 = 478778914 ^ i8;
                            throw new LicenseVerificationException("Failed to send license verification request: " + r0.getMessage());
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -405894517 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1634111821 ^ i8)) {
                                int i10 = 1205556439 ^ i8;
                                throw new RuntimeException("double");
                            }
                        }
                    }
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(r0) != -88125894) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(r0) == -88125894 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(r0) == (597148469 ^ r0)) {
                            int i11 = 317570205 ^ r0;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(r0) == 1053983362 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(r0) == (1455908567 ^ r0)) {
                                break;
                            }
                        }
                    }
                    int i12 = 1401511950 ^ r0;
                    throw new IOException("double");
                }
                int i13 = 430599187 ^ r0;
                if (send.statusCode() == ((short) (1191019804 ^ i13))) {
                    int i14 = 431887031 ^ i13;
                    String str = (String) send.body();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -98780390) {
                        int i15 = 110514865 ^ i14;
                        return str;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -98780390 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (887104639 ^ i14)) {
                            break;
                        }
                    }
                    int i16 = 1630057150 ^ i14;
                    throw new IllegalAccessException("double");
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) != 938225314) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 938225314 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1821466779 ^ i13)) {
                            break;
                        }
                    }
                    int i17 = 1314384528 ^ i13;
                    throw new IllegalAccessException("double");
                }
                uplfawohnmipuebx = 1356601140 ^ i13;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(uplfawohnmipuebx) == -1324574976) {
                    int i18 = 1375453872 ^ uplfawohnmipuebx;
                    throw new LicenseVerificationException("Server error: " + send.statusCode() + " " + ((String) send.body()));
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(uplfawohnmipuebx) == -1324574976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(uplfawohnmipuebx) == (962075783 ^ uplfawohnmipuebx)) {
                        int i19 = 1746415039 ^ uplfawohnmipuebx;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(uplfawohnmipuebx) == -2143699325 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(uplfawohnmipuebx) == (787146856 ^ uplfawohnmipuebx)) {
                            int i20 = 2062590814 ^ uplfawohnmipuebx;
                            throw new IOException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 184532458 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (511955271 ^ i2)) {
                int i21 = 1286167232 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1464904158 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (910880434 ^ i2)) {
                    int i22 = 1602140195 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1243511456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1432295324 ^ i2)) {
                        int i23 = 565642098 ^ i2;
                        throw new IllegalAccessException();
                    }
                }
            }
        }
    }

    private static com.kammoun.donutCore.api.utils.PikzLicense.LicenseResponse processResponse(java.lang.String r5, java.lang.String r6, int r7) throws java.lang.Exception {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.PikzLicense.processResponse(java.lang.String, java.lang.String, int):com.kammoun.donutCore.api.utils.PikzLicense$LicenseResponse");
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
        int parseInt = 893371629 ^ (1431110679 ^ Integer.parseInt("1585156954"));
        qxehnkhrqp = pxkeyjorwgeuxql();
        xCOMoU7lOG = (-1803843547) ^ new Random(-4536728205256349910L).nextInt();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) != -263545599) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -263545599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1262349443 ^ parseInt)) {
                    int i = 1008805221 ^ parseInt;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1768474405 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (562904649 ^ parseInt)) {
                        break;
                    }
                }
            }
            int i2 = 1727582189 ^ parseInt;
            throw new RuntimeException();
        }
        int i3 = 959245569 ^ parseInt;
        LICENSE_KEY = vqzsdmpcpz(prymeozdgjhynfx(), i3);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 959313160) {
            int i4 = 1979144634 ^ i3;
            EXTRA_FIELDS = new LinkedHashMap<String, String>() {

                private static int f98QC68UV3OI = 0;
                private transient int PAkJ9RlZC3 = 260350955;
                private static String[] nothing_to_see_here = new String[13];

                {
                    jqfcalqjjnkpzker(765983213 ^ 112465354, 375690095);
                    int parseInt2 = 322174795 ^ (281474585 ^ Integer.parseInt("1048737306"));
                    this.PAkJ9RlZC3 = 260350955 ^ f98QC68UV3OI;
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt2)) {
                            case 118995948:
                                parseInt2 = 1118419461 ^ parseInt2;
                                break;
                            case 1132957141:
                            case 1208601090:
                                break;
                            case 1603215450:
                            default:
                                throw new RuntimeException();
                        }
                    }
                    put("user_name", System.getProperty("user.name"));
                    put("user_home", System.getProperty("user.home"));
                    int i5 = 866246138 ^ (1436441 ^ (36795745 ^ parseInt2));
                    put("user_dir", System.getProperty("user.dir"));
                    int i6 = 304345389 ^ i5;
                    put("java_version", System.getProperty("java.version"));
                    int i7 = 1253559567 ^ (1729885011 ^ i6);
                    int i8 = 202257015 ^ i7;
                    put("operating_system", System.getProperty("os.name") + " " + System.getProperty("os.version"));
                    int i9 = 2135505748 ^ i8;
                    put("bbb_bbb", PikzLicense.BBB);
                    int i10 = 472413841 ^ i9;
                    put("bbb_user", PikzLicense.USER);
                    int i11 = 861959362 ^ i10;
                    put("bbb_username", PikzLicense.USERNAME);
                    int i12 = 1193453188 ^ i11;
                    put("bbb_resource", PikzLicense.RESOURCE);
                    int i13 = 49506952 ^ i12;
                    put("bbb_version", PikzLicense.B_VERSION);
                    int i14 = 1256692641 ^ i13;
                    put("bbb_timestamp", PikzLicense.B_TIMESTAMP);
                    int i15 = 2144573329 ^ i14;
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
                    f98QC68UV3OI = 1028700681 ^ new Random(-2744192912071392868L).nextInt();
                }

                private static int jqfcalqjjnkpzker(int i5, int i6) {
                    return i5 ^ i6;
                }
            };
        } else {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 959313160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (271849765 ^ i3)) {
                    break;
                }
            }
            int i5 = 2091443390 ^ i3;
            throw new IllegalAccessException("double");
        }
    }

    public static String vqzsdmpcpz(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ qxehnkhrqp[i3 % qxehnkhrqp.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] pxkeyjorwgeuxql() {
        return new byte[]{2, 82, 8, 74, 86, 94, 15, 8, 47, 5, 6, 98, 35, 102, 66, 116, 94, 91, 100, 58, 98, 3, 70, 90, 7, 106, 41, 19, 103, 70, 84, 53, 28, 2, 27, 12, 118, 101, 126, 30, 78, 114, 25, 80, 81, 124, 85, 11, 61, 119, 112, 111, 49, 62, 10, 49, 81, 97, 58, 115, 90};
    }

    private static byte[] prymeozdgjhynfx() {
        return new byte[0];
    }

    private static byte[] yrqxkvmzcddrywl() {
        return new byte[]{-49, -103, 48, 31, 96, 13, 55, 24, 30, 95, 50, 41, 26, 112, 122, 62, 110, 15, 87, Byte.MAX_VALUE, 90, 79, 112, 11, 63, 40, 24, 69, 83, 26};
    }

    private static byte[] opcpmzxvbxowoeh() {
        return new byte[]{-51, -101, 57, 19, 98, 29, 55, 21, 29, 67, 55, 49, 18, 34, 118, 55, 102, 1, 86, 101, 83, 91};
    }

    private static byte[] wdqtzkklynuetbm() {
        return new byte[]{-51, -101, 57, 77, 98, 64, 55, 11, 29, 27, 55, 100};
    }

    private static byte[] khwamvflgyrvunn() {
        return new byte[]{-51, -97, 57, 62, 99, 2, 55, 86, 25, 71, 55, 36, 18, 3, 119, 51, 102, 2, 82, 97, 83, 66};
    }

    private static byte[] qknuxllvqkobfog() {
        return new byte[]{-51, -97, 57, 21, 99, 30, 55, 22, 25, 92, 55, 49, 18, 59, 119, 34};
    }

    private static byte[] emktfefykfhdwvc() {
        return new byte[]{-50, -100, 56, 52, 103, 5, 55, 88, 29, 85, 52, 61, 19, 39, 115, 35, 102, 72, 86, 124, 80, 87, 118, 26, 54, 46, 17, 69, 85, 1, 102, 36, 44, 66, 42, 91, 78, 39, 76, 94, 124, 38, 41, 17, 96, 58, 109, 24, 15, 54, 66, 55, 1, 97, 59, 102, 105, 54, 8, 102, 104, 92, 98, 79, 123, 16};
    }

    private static byte[] ylmmcmfqmdejqks() {
        return new byte[]{-51, -101, 61, 26, 110, 25, 56, 74, 31, 69, 55, 39, 22, 100, 122, 104, 105, 66, 84, 102, 83, 92, 115, 1, 63, 60, 30, 75, 87, 5, 101, 102, 41, 20, 35, 79, 65, 58, 78, 69, Byte.MAX_VALUE, 62, 44, 27, 105, 59, 98, 72, 13, 35, 65, 48, 4, 105, 50, 44, 102, 47, 10, 58, 107, 78, 103, 31, 114, 4, 105, 73, 56, 118, 52, 31, 87, 109, 94, 67, 67, 71, 107, 34, 11, 49, 54, 12, 98, 93, 93, 121, 35, 46};
    }

    private static byte[] fogkuzpfmyiwvyo() {
        return new byte[]{-51, -101, 61, 49, 110, 2, 56, 80, 31, 65, 55, 49, 22, 48, 122, 51, 105, 64, 84, 94, 83, 76, 115, 18, 63, 60};
    }

    private static byte[] idfuajrcocnvpex() {
        return new byte[]{-51, -101, 61, 19, 110, 29, 56, 78, 31, 89, 55, 61, 22, 61, 122, 38, 105, 25, 84, 99, 83, 90, 115, 12, 63, 118, 30, 79, 87, 5, 101, 108, 41, 84};
    }

    private static byte[] legktnvbgymkkkk() {
        return new byte[]{-60, -102, 56, 51, 102, 38, 60, 115, 31, Byte.MAX_VALUE, 49, 27, 23, 60, 115, 6, 108, 37, 92, 79, 82, 80, 118, 0, 52, 41, 25, 67, 80, 29, 96, 108, 45, 118, 41, 5, 78, 37, 78, 26, 126, 1, 42, 35, 97, 21, 98, 126, 9, 1, 65, 29, 3, 79, 50, 73, 97, 22, 10, 3, 105, 97, 98, 8, 125, 39, 106, 114, 57, 85, 55, Byte.MAX_VALUE, 90, 86, 86, 53, 68, 8, 104, 29, 10, 25, 52, 55, 110, 102, 91, 95, 33, 22, 126, 86, 5, 27, 50, 66, 63, 23, 85, 115, 41, 74, 70, 93, 97, 47, 78, 19, 51, 59, 71, 11, 95, 71, 13, 112, 1, 94, 86, 109, 71, 7, 51, 87, 58, 24, 110, 15, 63, 72, 31, 126, 53, 42, 19, 23, 117, 50, 106, 60, 85, 111, 80, 119, 126, 59, 55, 25, 25, 113, 84, 38, 100, 99, 43, 120, 47, 81, 71, 125, 76, 68, 118, 51, 41, 48, 97, 102, 102, 95, 13, 42, 71, 108, 5, Byte.MAX_VALUE, 59, 99, 99, 58, 2, 35, 106, 95, 98, 93, 121, 15, 110, 85, 63, 38, 49, 117, 83, 96, 84, 37, 76, 81, 107, 30, 10, 124, 48, 3, 106, 108, 93, 42, 39, 45, 119, 85, 7, 28, 58, 65, 60, 35, 85, 35, 45, 59, 66, 114, 103, 59, 72, 31, 58, 93, 69, 15, 87, 117, 14, 112, 1, 56, 82, 68, 67, 90, 53, 84, 60, 53, 103, 42, 61, 8, 23, 3, 54, 98, 19, 22, 113, 20, 110, 76, 83, 71, 86, 114, 119, 47, 53, 2, 17, 119, 87, 10, 100, 104, 47, 64, 43, 113, 65, 56, 74, 75, Byte.MAX_VALUE, 40, 43, 38, 105, 121, 101, 71, 13, 31, 67, 9, 1, 41, 61, 82, 101, 24, 11, 39, 104, 125, 106, 109, 122, 85, 110, 119, 59, 82, 53, 91, 85, 105, 82, 27, 69, 57, 105, 62, 2, 29, 51, 26, 106, 96, 89, 73, 35, 105, 113, 18, 1, 93, 51, 103, 62, 19, 93, 58, 46, 9, 66, 29, 99, 33, 76, 94, 60, 101, 67, 11, 94, 55, 12, 14, 9, 94, 81, 79, 67, 37, 49, 47, 56, 4, 97, 20, 59, 73, 30, 121, 52, 30, 27, 26, 114, 40, 110, 39, 87, 59, 82, 9, 113, 56, 51, 57, 24, 78, 85, 5, 108, 78, 44, 94, 43, 116, 69, 49, 78, 79, 121, 47, 45, 85, 96, 21, 103, 16, 5, 50, 64, 53, 1, 62, 57, 111, 97, 35, 13, 52, 110, 101, 99, 115, 120, 83, 102, 121, 56, 65, 53, 70, 81, 93, 86, 28, 67, 28, 111, 38, 11, 18, 49, 36, 98, 98, 90, 75, 35, 31, 117, 3, 5, 96, 53, 120, 56, 117, 84, 55, 44, 27, 74, 124, 96, 82, 76, 85, 56, 73, 71, 44, 88, 116, 10, 17, 0, 22, 83, 91, 75, 57, 50, 30, 56, 51, 101, 22, 63, 114, 24, 91, 50, 54, 18, 3, 112, 0, 102, 84, 84, 74, 82, 89, 117, 15, 55, 24, 30, 76, 83, 4, 101, 73, 46, 29, 35, 67, 70, 28, 78, 105, 125, 120, 41, 67, 102, 29, 97, 79, 12, 16, 66, 109, 9, 61, 58, 83, 97, 59, 9, 43, 106, 119, 101, 89, 126, 46, 111, 118, 58, 104, 61, 87, 82, 124, 86, 62, 71, 62, 107, 56, 13, 48, 55, 48, 107, 71, 88, 94, 43, 59, 118, 11, 5, 90, 49, 100, 60, 6, 82, 37, 42, 40, 67, 89, 98, 37, 68, 50, 59, 75, 71, 32, 92, 112, 14, 84, 6, 9, 85, Byte.MAX_VALUE, 66, 16, 48, 38, 48, 45, 102, 50, 63, 22, 28, 67, 54, 106, 20, 3, 118, 35, 111, 62, 86, 33, 90, 126, 118, 11, 55, 50, 26, 117, 87, 9, 99, 83, 40, 103, 42, 93, 68, 19, 70, 24, 126, 60, 41, 15, 98, 101, 101, 88, 10, 10, 68, 54, 0, 78, 56, 71, 105, 110, 10, 52, 106, 117, 97, 94, 122, 30, 105, 77, 60, 103, 52, 0, 80, 80, 94, 20, 68, 0, 107, 45, 9, 57, 51, 25, 109, 0, 94, 106, 34, 2, 116, 39, 13, 95, 50, 125, 60, 43, 86, 126, 46, 93, 69, 28, 100, 7, 77, 10, 57, 104, 79, 104, 95, 70, 14, 109, 2, 80, 81, 106, 68, 9, 54, 73, 57, 78, 100, 91, 55, 12, 31, 70, 54, 20, 16, 21, 114, 21, 105, 42, 80, 58, 83, 113, 116, 65, 63, 43, 25, 76, 87, 28, 103, 40, 44, 15, 44, 23, 66, 29, 79, 125, 124, 19, 33, 46, 97, 12, 101, 123, 14, 20, 64, 22, 6, 76};
    }

    private static byte[] hfmfqmwtxamttol() {
        return new byte[]{-51, -98, 56, 48, 98, 4, 56, 79, 22, 86, 55, 61, 19, 60, 118, 36, 105, 74, 93, 100, 83, 89, 118, 10, 51, 59, 30, 76, 94, 7, 101, 99, 44, 17, 47, 75, 65, 61, 71, 75, Byte.MAX_VALUE, 47, 41, 2, 101, 60, 98, 79, 4, 55, 65, 57};
    }

    private static byte[] nfzczuxlgxnxnmy() {
        return new byte[]{-51, -103, 63, 42, 99, 13, 58, 79, 24, 68, 55, 57, 20, 58, 119, 49, 107, 10, 83, 43, 83, 67, 113, 1, 50, 49, 28, 66, 80, 4, 101, 117, 43, 81, 46, 87, 67, 33, 73, 15, Byte.MAX_VALUE, 47, 46, 17, 100, 106, 96, 75, 10, 41, 65, 52, 6, 44, 63, 104, 100, 57, 13, 38, 107, 22, 101, 85, Byte.MAX_VALUE, 18, 107, 27, 63, 106, 52, 93, 85, 126, 83, 84, 65, 4, 108, 48, 11, 33};
    }

    private static byte[] qltikeeegustihz() {
        return new byte[]{-51, -103, 48, 53, 111, 6, 56, 73, 27, 85, 50, 54, 21, 54, 116, 39, 105, 79, 85, 98, 90, 92, Byte.MAX_VALUE, 15, 48, 56, 29, 76, 83, 13, 98, 105, 42, 21, 44, 74, 71, 52, 70, 91, 119, 52, 46, 8, 101, 35, 97, 64, 11, 43, 70, 120, 6, 121, 59, 113, 105, 37, 3, 48, 109, 86, 102, 77, 126, 27, 104, 68, 62, 125};
    }

    private static int uplfawohnmipuebx(int i, int i2) {
        return i ^ i2;
    }
}
