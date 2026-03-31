package com.kammoun.utils.jackson.databind.deser.std;

import com.kammoun.utils.jackson.core.Base64Variants;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.exc.InvalidFormatException;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

public class UUIDDeserializer extends FromStringDeserializer<UUID> {
    private static final long serialVersionUID = 1;
    static final int[] HEX_DIGITS = new int[127];

    public UUIDDeserializer() {
        super(UUID.class);
    }

    @Override
    public Object getEmptyValue(DeserializationContext deserializationContext) {
        return new UUID(0L, 0L);
    }

    @Override
    public UUID _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
        if (str.length() == 36) {
            if (str.charAt(8) != '-' || str.charAt(13) != '-' || str.charAt(18) != '-' || str.charAt(23) != '-') {
                _badFormat(str, deserializationContext);
            }
            return new UUID((intFromChars(str, 0, deserializationContext) << 32) + ((shortFromChars(str, 9, deserializationContext) << 16) | shortFromChars(str, 14, deserializationContext)), (((shortFromChars(str, 19, deserializationContext) << 16) | shortFromChars(str, 24, deserializationContext)) << 32) | ((intFromChars(str, 28, deserializationContext) << 32) >>> 32));
        }
        if (str.length() == 24) {
            return _fromBytes(Base64Variants.getDefaultVariant().decode(convertFromUrlSafe(str)), deserializationContext);
        }
        if (str.length() != 22) {
            return _badFormat(str, deserializationContext);
        }
        return _fromBytes(Base64Variants.MODIFIED_FOR_URL.decode(convertToUrlSafe(str)), deserializationContext);
    }

    @Override
    public UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws IOException {
        return obj instanceof byte[] ? _fromBytes((byte[]) obj, deserializationContext) : (UUID) super._deserializeEmbedded(obj, deserializationContext);
    }

    private UUID _badFormat(String str, DeserializationContext deserializationContext) throws IOException {
        return (UUID) deserializationContext.handleWeirdStringValue(handledType(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
    }

    int intFromChars(String str, int i, DeserializationContext deserializationContext) throws JsonMappingException {
        return (byteFromChars(str, i, deserializationContext) << 24) + (byteFromChars(str, i + 2, deserializationContext) << 16) + (byteFromChars(str, i + 4, deserializationContext) << 8) + byteFromChars(str, i + 6, deserializationContext);
    }

    int shortFromChars(String str, int i, DeserializationContext deserializationContext) throws JsonMappingException {
        return (byteFromChars(str, i, deserializationContext) << 8) + byteFromChars(str, i + 2, deserializationContext);
    }

    int byteFromChars(String str, int i, DeserializationContext deserializationContext) throws JsonMappingException {
        int i2;
        char charAt = str.charAt(i);
        char charAt2 = str.charAt(i + 1);
        return (charAt > 127 || charAt2 > 127 || (i2 = (HEX_DIGITS[charAt] << 4) | HEX_DIGITS[charAt2]) < 0) ? (charAt > 127 || HEX_DIGITS[charAt] < 0) ? _badChar(str, i, deserializationContext, charAt) : _badChar(str, i + 1, deserializationContext, charAt2) : i2;
    }

    int _badChar(String str, int i, DeserializationContext deserializationContext, char c) throws JsonMappingException {
        throw deserializationContext.weirdStringException(str, handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(c), Integer.toHexString(c)));
    }

    private UUID _fromBytes(byte[] bArr, DeserializationContext deserializationContext) throws JsonMappingException {
        if (bArr.length != 16) {
            throw InvalidFormatException.from(deserializationContext.getParser(), "Can only construct UUIDs from byte[16]; got " + bArr.length + " bytes", bArr, handledType());
        }
        return new UUID(_long(bArr, 0), _long(bArr, 8));
    }

    private String convertToUrlSafe(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private String convertFromUrlSafe(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    private static long _long(byte[] bArr, int i) {
        return (_int(bArr, i) << 32) | ((_int(bArr, i + 4) << 32) >>> 32);
    }

    private static int _int(byte[] bArr, int i) {
        return (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    static {
        Arrays.fill(HEX_DIGITS, -1);
        for (int i = 0; i < 10; i++) {
            HEX_DIGITS[48 + i] = i;
        }
        for (int i2 = 0; i2 < 6; i2++) {
            HEX_DIGITS[97 + i2] = 10 + i2;
            HEX_DIGITS[65 + i2] = 10 + i2;
        }
    }
}
