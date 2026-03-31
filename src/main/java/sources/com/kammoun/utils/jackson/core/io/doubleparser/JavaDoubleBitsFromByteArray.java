package com.kammoun.utils.jackson.core.io.doubleparser;

import java.nio.charset.StandardCharsets;

public final class JavaDoubleBitsFromByteArray extends AbstractJavaFloatingPointBitsFromByteArray {
    @Override
    long nan() {
        return Double.doubleToRawLongBits(Double.NaN);
    }

    @Override
    long negativeInfinity() {
        return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
    }

    @Override
    long positiveInfinity() {
        return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
    }

    @Override
    long valueOfFloatLiteral(byte[] bArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        double tryDecFloatToDoubleTruncated = FastDoubleMath.tryDecFloatToDoubleTruncated(z, j, i3, z2, i4);
        return Double.doubleToRawLongBits(Double.isNaN(tryDecFloatToDoubleTruncated) ? Double.parseDouble(new String(bArr, i, i2 - i, StandardCharsets.ISO_8859_1)) : tryDecFloatToDoubleTruncated);
    }

    @Override
    long valueOfHexLiteral(byte[] bArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        double tryHexFloatToDoubleTruncated = FastDoubleMath.tryHexFloatToDoubleTruncated(z, j, i3, z2, i4);
        return Double.doubleToRawLongBits(Double.isNaN(tryHexFloatToDoubleTruncated) ? Double.parseDouble(new String(bArr, i, i2 - i, StandardCharsets.ISO_8859_1)) : tryHexFloatToDoubleTruncated);
    }
}
