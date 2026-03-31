package com.kammoun.utils.jackson.core.io.doubleparser;

import java.nio.charset.StandardCharsets;

public final class JavaFloatBitsFromByteArray extends AbstractJavaFloatingPointBitsFromByteArray {
    @Override
    long nan() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override
    long negativeInfinity() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override
    long positiveInfinity() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override
    long valueOfFloatLiteral(byte[] bArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        return Float.floatToRawIntBits(Float.isNaN(FastFloatMath.tryDecFloatToFloatTruncated(z, j, i3, z2, i4)) ? Float.parseFloat(new String(bArr, i, i2 - i, StandardCharsets.ISO_8859_1)) : r0);
    }

    @Override
    long valueOfHexLiteral(byte[] bArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        return Float.floatToRawIntBits(Float.isNaN(FastFloatMath.tryHexFloatToFloatTruncated(z, j, i3, z2, i4)) ? Float.parseFloat(new String(bArr, i, i2 - i, StandardCharsets.ISO_8859_1)) : r0);
    }
}
