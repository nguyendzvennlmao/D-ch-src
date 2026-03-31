package com.kammoun.utils.jackson.core.io.doubleparser;

public final class JavaFloatBitsFromCharSequence extends AbstractJavaFloatingPointBitsFromCharSequence {
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
    long valueOfFloatLiteral(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        return Float.floatToRawIntBits(Float.isNaN(FastFloatMath.tryDecFloatToFloatTruncated(z, j, i3, z2, i4)) ? Float.parseFloat(charSequence.subSequence(i, i2).toString()) : r0);
    }

    @Override
    long valueOfHexLiteral(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        return Float.floatToRawIntBits(Float.isNaN(FastFloatMath.tryHexFloatToFloatTruncated(z, j, i3, z2, i4)) ? Float.parseFloat(charSequence.subSequence(i, i2).toString()) : r0);
    }
}
