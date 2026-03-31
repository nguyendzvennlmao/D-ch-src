package com.kammoun.utils.jackson.core.io.doubleparser;

public final class JavaDoubleBitsFromCharSequence extends AbstractJavaFloatingPointBitsFromCharSequence {
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
    long valueOfFloatLiteral(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        double tryDecFloatToDoubleTruncated = FastDoubleMath.tryDecFloatToDoubleTruncated(z, j, i3, z2, i4);
        return Double.doubleToRawLongBits(Double.isNaN(tryDecFloatToDoubleTruncated) ? Double.parseDouble(charSequence.subSequence(i, i2).toString()) : tryDecFloatToDoubleTruncated);
    }

    @Override
    long valueOfHexLiteral(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        double tryHexFloatToDoubleTruncated = FastDoubleMath.tryHexFloatToDoubleTruncated(z, j, i3, z2, i4);
        return Double.doubleToRawLongBits(Double.isNaN(tryHexFloatToDoubleTruncated) ? Double.parseDouble(charSequence.subSequence(i, i2).toString()) : tryHexFloatToDoubleTruncated);
    }
}
