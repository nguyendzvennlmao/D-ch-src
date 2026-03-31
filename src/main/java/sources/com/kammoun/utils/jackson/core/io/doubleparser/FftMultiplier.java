package com.kammoun.utils.jackson.core.io.doubleparser;

import java.math.BigInteger;

class FftMultiplier {
    public static final double COS_0_25;
    public static final double SIN_0_25;
    private static final int FFT_THRESHOLD = 33220;
    private static final int MAX_MAG_LENGTH = 67108864;
    private static final int ROOTS3_CACHE_SIZE = 20;
    private static final int ROOTS_CACHE2_SIZE = 20;
    private static final int TOOM_COOK_THRESHOLD = 1920;
    private static volatile ComplexVector[] ROOTS2_CACHE;
    private static volatile ComplexVector[] ROOTS3_CACHE;
    static final boolean $assertionsDisabled;

    public static final class ComplexVector {
        private static final int COMPLEX_SIZE_SHIFT = 1;
        static final int IMAG = 1;
        static final int REAL = 0;
        private final double[] a;
        private final int length;
        private final int offset;

        ComplexVector(int i) {
            this.a = new double[i << 1];
            this.length = i;
            this.offset = 0;
        }

        ComplexVector(ComplexVector complexVector, int i, int i2) {
            this.length = i2 - i;
            this.a = complexVector.a;
            this.offset = i << 1;
        }

        void add(int i, MutableComplex mutableComplex) {
            double[] dArr = this.a;
            int realIdx = realIdx(i);
            dArr[realIdx] = dArr[realIdx] + mutableComplex.real;
            double[] dArr2 = this.a;
            int imagIdx = imagIdx(i);
            dArr2[imagIdx] = dArr2[imagIdx] + mutableComplex.imag;
        }

        void addInto(int i, ComplexVector complexVector, int i2, MutableComplex mutableComplex) {
            mutableComplex.real = this.a[realIdx(i)] + complexVector.real(i2);
            mutableComplex.imag = this.a[imagIdx(i)] + complexVector.imag(i2);
        }

        void addTimesIInto(int i, ComplexVector complexVector, int i2, MutableComplex mutableComplex) {
            mutableComplex.real = this.a[realIdx(i)] - complexVector.imag(i2);
            mutableComplex.imag = this.a[imagIdx(i)] + complexVector.real(i2);
        }

        void applyInverseWeights(ComplexVector complexVector) {
            int i = complexVector.offset;
            double[] dArr = complexVector.a;
            int i2 = (this.offset + this.length) << 1;
            for (int i3 = this.offset; i3 < i2; i3 += 2) {
                double d = this.a[i3 + 0];
                double d2 = this.a[i3 + 1];
                this.a[i3] = FastDoubleSwar.fma(d, dArr[i + 0], d2 * dArr[i + 1]);
                this.a[i3 + 1] = FastDoubleSwar.fma(-d, dArr[i + 1], d2 * dArr[i + 0]);
                i += 2;
            }
        }

        void applyWeights(ComplexVector complexVector) {
            int i = complexVector.offset;
            double[] dArr = complexVector.a;
            int i2 = (this.offset + this.length) << 1;
            for (int i3 = this.offset; i3 < i2; i3 += 2) {
                double d = this.a[i3 + 0];
                this.a[i3 + 0] = d * dArr[i + 0];
                this.a[i3 + 1] = d * dArr[i + 1];
                i += 2;
            }
        }

        void copyInto(int i, MutableComplex mutableComplex) {
            mutableComplex.real = this.a[realIdx(i)];
            mutableComplex.imag = this.a[imagIdx(i)];
        }

        double imag(int i) {
            return this.a[(i << 1) + this.offset + 1];
        }

        void imag(int i, double d) {
            this.a[(i << 1) + this.offset + 1] = d;
        }

        private int imagIdx(int i) {
            return (i << 1) + this.offset + 1;
        }

        void multiply(int i, MutableComplex mutableComplex) {
            int realIdx = realIdx(i);
            int imagIdx = imagIdx(i);
            double d = this.a[realIdx];
            double d2 = this.a[imagIdx];
            this.a[realIdx] = FastDoubleSwar.fma(d, mutableComplex.real, (-d2) * mutableComplex.imag);
            this.a[imagIdx] = FastDoubleSwar.fma(d, mutableComplex.imag, d2 * mutableComplex.real);
        }

        void multiplyByIAnd(int i, MutableComplex mutableComplex) {
            int realIdx = realIdx(i);
            int imagIdx = imagIdx(i);
            double d = this.a[realIdx];
            double d2 = this.a[imagIdx];
            this.a[realIdx] = FastDoubleSwar.fma(-d, mutableComplex.imag, (-d2) * mutableComplex.real);
            this.a[imagIdx] = FastDoubleSwar.fma(d, mutableComplex.real, (-d2) * mutableComplex.imag);
        }

        void multiplyConjugate(int i, MutableComplex mutableComplex) {
            int realIdx = realIdx(i);
            int imagIdx = imagIdx(i);
            double d = this.a[realIdx];
            double d2 = this.a[imagIdx];
            this.a[realIdx] = FastDoubleSwar.fma(d, mutableComplex.real, d2 * mutableComplex.imag);
            this.a[imagIdx] = FastDoubleSwar.fma(-d, mutableComplex.imag, d2 * mutableComplex.real);
        }

        void multiplyConjugateInto(int i, MutableComplex mutableComplex, MutableComplex mutableComplex2) {
            double d = this.a[realIdx(i)];
            double d2 = this.a[imagIdx(i)];
            mutableComplex2.real = FastDoubleSwar.fma(d, mutableComplex.real, d2 * mutableComplex.imag);
            mutableComplex2.imag = FastDoubleSwar.fma(-d, mutableComplex.imag, d2 * mutableComplex.real);
        }

        void multiplyConjugateTimesI(int i, MutableComplex mutableComplex) {
            int realIdx = realIdx(i);
            int imagIdx = imagIdx(i);
            double d = this.a[realIdx];
            double d2 = this.a[imagIdx];
            this.a[realIdx] = FastDoubleSwar.fma(-d, mutableComplex.imag, d2 * mutableComplex.real);
            this.a[imagIdx] = FastDoubleSwar.fma(-d, mutableComplex.real, (-d2) * mutableComplex.imag);
        }

        void multiplyInto(int i, MutableComplex mutableComplex, MutableComplex mutableComplex2) {
            double d = this.a[realIdx(i)];
            double d2 = this.a[imagIdx(i)];
            mutableComplex2.real = FastDoubleSwar.fma(d, mutableComplex.real, (-d2) * mutableComplex.imag);
            mutableComplex2.imag = FastDoubleSwar.fma(d, mutableComplex.imag, d2 * mutableComplex.real);
        }

        void multiplyPointwise(ComplexVector complexVector) {
            int i = complexVector.offset;
            double[] dArr = complexVector.a;
            int i2 = (this.offset + this.length) << 1;
            for (int i3 = this.offset; i3 < i2; i3 += 2) {
                double d = this.a[i3 + 0];
                double d2 = this.a[i3 + 1];
                double d3 = dArr[i + 0];
                double d4 = dArr[i + 1];
                this.a[i3 + 0] = FastDoubleSwar.fma(d, d3, (-d2) * d4);
                this.a[i3 + 1] = FastDoubleSwar.fma(d, d4, d2 * d3);
                i += 2;
            }
        }

        double part(int i, int i2) {
            return this.a[(i << 1) + i2];
        }

        double real(int i) {
            return this.a[(i << 1) + this.offset];
        }

        void real(int i, double d) {
            this.a[(i << 1) + this.offset] = d;
        }

        private int realIdx(int i) {
            return (i << 1) + this.offset;
        }

        void set(int i, double d, double d2) {
            int realIdx = realIdx(i);
            this.a[realIdx] = d;
            this.a[realIdx + 1] = d2;
        }

        void squarePointwise() {
            int i = (this.offset + this.length) << 1;
            for (int i2 = this.offset; i2 < i; i2 += 2) {
                double d = this.a[i2 + 0];
                double d2 = this.a[i2 + 1];
                this.a[i2 + 0] = FastDoubleSwar.fma(d, d, (-d2) * d2);
                this.a[i2 + 1] = 2.0d * d * d2;
            }
        }

        void subtractInto(int i, ComplexVector complexVector, int i2, MutableComplex mutableComplex) {
            mutableComplex.real = this.a[realIdx(i)] - complexVector.real(i2);
            mutableComplex.imag = this.a[imagIdx(i)] - complexVector.imag(i2);
        }

        void subtractTimesIInto(int i, ComplexVector complexVector, int i2, MutableComplex mutableComplex) {
            mutableComplex.real = this.a[realIdx(i)] + complexVector.imag(i2);
            mutableComplex.imag = this.a[imagIdx(i)] - complexVector.real(i2);
        }

        void timesTwoToThe(int i, int i2) {
            int realIdx = realIdx(i);
            int imagIdx = imagIdx(i);
            double d = this.a[realIdx];
            double d2 = this.a[imagIdx];
            this.a[realIdx] = FastDoubleMath.fastScalb(d, i2);
            this.a[imagIdx] = FastDoubleMath.fastScalb(d2, i2);
        }
    }

    public static final class MutableComplex {
        double real;
        double imag;

        MutableComplex() {
        }

        void add(MutableComplex mutableComplex) {
            this.real += mutableComplex.real;
            this.imag += mutableComplex.imag;
        }

        void add(ComplexVector complexVector, int i) {
            this.real += complexVector.real(i);
            this.imag += complexVector.imag(i);
        }

        void addInto(MutableComplex mutableComplex, MutableComplex mutableComplex2) {
            mutableComplex2.real = this.real + mutableComplex.real;
            mutableComplex2.imag = this.imag + mutableComplex.imag;
        }

        void addTimesI(MutableComplex mutableComplex) {
            this.real -= mutableComplex.imag;
            this.imag += mutableComplex.real;
        }

        void addTimesI(ComplexVector complexVector, int i) {
            this.real -= complexVector.imag(i);
            this.imag += complexVector.real(i);
        }

        void addTimesIInto(MutableComplex mutableComplex, MutableComplex mutableComplex2) {
            mutableComplex2.real = this.real - mutableComplex.imag;
            mutableComplex2.imag = this.imag + mutableComplex.real;
        }

        void copyInto(ComplexVector complexVector, int i) {
            complexVector.real(i, this.real);
            complexVector.imag(i, this.imag);
        }

        void multiply(MutableComplex mutableComplex) {
            double d = this.real;
            this.real = FastDoubleSwar.fma(d, mutableComplex.real, (-this.imag) * mutableComplex.imag);
            this.imag = FastDoubleSwar.fma(d, mutableComplex.imag, this.imag * mutableComplex.real);
        }

        void multiplyConjugate(MutableComplex mutableComplex) {
            double d = this.real;
            this.real = FastDoubleSwar.fma(d, mutableComplex.real, this.imag * mutableComplex.imag);
            this.imag = FastDoubleSwar.fma(-d, mutableComplex.imag, this.imag * mutableComplex.real);
        }

        void set(ComplexVector complexVector, int i) {
            this.real = complexVector.real(i);
            this.imag = complexVector.imag(i);
        }

        void squareInto(MutableComplex mutableComplex) {
            mutableComplex.real = FastDoubleSwar.fma(this.real, this.real, (-this.imag) * this.imag);
            mutableComplex.imag = 2.0d * this.real * this.imag;
        }

        void subtract(MutableComplex mutableComplex) {
            this.real -= mutableComplex.real;
            this.imag -= mutableComplex.imag;
        }

        void subtract(ComplexVector complexVector, int i) {
            this.real -= complexVector.real(i);
            this.imag -= complexVector.imag(i);
        }

        void subtractInto(MutableComplex mutableComplex, MutableComplex mutableComplex2) {
            mutableComplex2.real = this.real - mutableComplex.real;
            mutableComplex2.imag = this.imag - mutableComplex.imag;
        }

        void subtractInto(MutableComplex mutableComplex, ComplexVector complexVector, int i) {
            complexVector.real(i, this.real - mutableComplex.real);
            complexVector.imag(i, this.imag - mutableComplex.imag);
        }

        void subtractTimesI(MutableComplex mutableComplex) {
            this.real += mutableComplex.imag;
            this.imag -= mutableComplex.real;
        }

        void subtractTimesI(ComplexVector complexVector, int i) {
            this.real += complexVector.imag(i);
            this.imag -= complexVector.real(i);
        }

        void subtractTimesIInto(MutableComplex mutableComplex, MutableComplex mutableComplex2) {
            mutableComplex2.real = this.real + mutableComplex.imag;
            mutableComplex2.imag = this.imag - mutableComplex.real;
        }
    }

    FftMultiplier() {
    }

    static int bitsPerFftPoint(int i) {
        if (i <= 9728) {
            return 19;
        }
        if (i <= 18432) {
            return 18;
        }
        if (i <= 69632) {
            return 17;
        }
        if (i <= 262144) {
            return 16;
        }
        if (i <= 983040) {
            return 15;
        }
        if (i <= 3670016) {
            return 14;
        }
        if (i <= 13631488) {
            return 13;
        }
        if (i <= 25165824) {
            return 12;
        }
        if (i <= 92274688) {
            return 11;
        }
        if (i <= 335544320) {
            return 10;
        }
        return i <= 1207959552 ? 9 : 8;
    }

    private static ComplexVector calculateRootsOfUnity(int i) {
        if (i == 1) {
            ComplexVector complexVector = new ComplexVector(1);
            complexVector.real(0, 1.0d);
            complexVector.imag(0, 0.0d);
            return complexVector;
        }
        ComplexVector complexVector2 = new ComplexVector(i);
        complexVector2.set(0, 1.0d, 0.0d);
        complexVector2.set(i / 2, COS_0_25, SIN_0_25);
        double d = 1.5707963267948966d / i;
        for (int i2 = 1; i2 < i / 2; i2++) {
            double d2 = d * i2;
            double cos = Math.cos(d2);
            double sin = Math.sin(d2);
            complexVector2.set(i2, cos, sin);
            complexVector2.set(i - i2, sin, cos);
        }
        return complexVector2;
    }

    private static void fft(ComplexVector complexVector, ComplexVector[] complexVectorArr) {
        int i = complexVector.length;
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
        MutableComplex mutableComplex = new MutableComplex();
        MutableComplex mutableComplex2 = new MutableComplex();
        MutableComplex mutableComplex3 = new MutableComplex();
        MutableComplex mutableComplex4 = new MutableComplex();
        MutableComplex mutableComplex5 = new MutableComplex();
        MutableComplex mutableComplex6 = new MutableComplex();
        int i2 = numberOfLeadingZeros;
        while (i2 >= 2) {
            ComplexVector complexVector2 = complexVectorArr[i2 - 2];
            int i3 = 1 << i2;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 < i) {
                    for (int i6 = 0; i6 < i3 / 4; i6++) {
                        mutableComplex5.set(complexVector2, i6);
                        mutableComplex5.squareInto(mutableComplex6);
                        int i7 = i5 + i6;
                        int i8 = i5 + i6 + (i3 / 4);
                        int i9 = i5 + i6 + (i3 / 2);
                        int i10 = i5 + i6 + ((i3 * 3) / 4);
                        complexVector.addInto(i7, complexVector, i8, mutableComplex);
                        mutableComplex.add(complexVector, i9);
                        mutableComplex.add(complexVector, i10);
                        complexVector.subtractTimesIInto(i7, complexVector, i8, mutableComplex2);
                        mutableComplex2.subtract(complexVector, i9);
                        mutableComplex2.addTimesI(complexVector, i10);
                        mutableComplex2.multiplyConjugate(mutableComplex5);
                        complexVector.subtractInto(i7, complexVector, i8, mutableComplex3);
                        mutableComplex3.add(complexVector, i9);
                        mutableComplex3.subtract(complexVector, i10);
                        mutableComplex3.multiplyConjugate(mutableComplex6);
                        complexVector.addTimesIInto(i7, complexVector, i8, mutableComplex4);
                        mutableComplex4.subtract(complexVector, i9);
                        mutableComplex4.subtractTimesI(complexVector, i10);
                        mutableComplex4.multiply(mutableComplex5);
                        mutableComplex.copyInto(complexVector, i7);
                        mutableComplex2.copyInto(complexVector, i8);
                        mutableComplex3.copyInto(complexVector, i9);
                        mutableComplex4.copyInto(complexVector, i10);
                    }
                    i4 = i5 + i3;
                }
            }
            i2 -= 2;
        }
        if (i2 > 0) {
            for (int i11 = 0; i11 < i; i11 += 2) {
                complexVector.copyInto(i11, mutableComplex);
                complexVector.copyInto(i11 + 1, mutableComplex2);
                complexVector.add(i11, mutableComplex2);
                mutableComplex.subtractInto(mutableComplex2, complexVector, i11 + 1);
            }
        }
    }

    private static void fft3(ComplexVector complexVector, ComplexVector complexVector2, ComplexVector complexVector3, int i, double d) {
        double sqrt = i * (-0.5d) * Math.sqrt(3.0d);
        for (int i2 = 0; i2 < complexVector.length; i2++) {
            double real = complexVector.real(i2) + complexVector2.real(i2) + complexVector3.real(i2);
            double imag = complexVector.imag(i2) + complexVector2.imag(i2) + complexVector3.imag(i2);
            double imag2 = sqrt * (complexVector3.imag(i2) - complexVector2.imag(i2));
            double real2 = sqrt * (complexVector2.real(i2) - complexVector3.real(i2));
            double real3 = 0.5d * (complexVector2.real(i2) + complexVector3.real(i2));
            double imag3 = 0.5d * (complexVector2.imag(i2) + complexVector3.imag(i2));
            double real4 = (complexVector.real(i2) - real3) + imag2;
            double imag4 = (complexVector.imag(i2) + real2) - imag3;
            double real5 = (complexVector.real(i2) - real3) - imag2;
            double imag5 = (complexVector.imag(i2) - real2) - imag3;
            complexVector.real(i2, real * d);
            complexVector.imag(i2, imag * d);
            complexVector2.real(i2, real4 * d);
            complexVector2.imag(i2, imag4 * d);
            complexVector3.real(i2, real5 * d);
            complexVector3.imag(i2, imag5 * d);
        }
    }

    private static void fftMixedRadix(ComplexVector complexVector, ComplexVector[] complexVectorArr, ComplexVector complexVector2) {
        int i = complexVector.length / 3;
        ComplexVector complexVector3 = new ComplexVector(complexVector, 0, i);
        ComplexVector complexVector4 = new ComplexVector(complexVector, i, i * 2);
        ComplexVector complexVector5 = new ComplexVector(complexVector, i * 2, complexVector.length);
        fft3(complexVector3, complexVector4, complexVector5, 1, 1.0d);
        MutableComplex mutableComplex = new MutableComplex();
        for (int i2 = 0; i2 < complexVector.length / 4; i2++) {
            mutableComplex.set(complexVector2, i2);
            complexVector4.multiplyConjugate(i2, mutableComplex);
            complexVector5.multiplyConjugate(i2, mutableComplex);
            complexVector5.multiplyConjugate(i2, mutableComplex);
        }
        for (int i3 = complexVector.length / 4; i3 < i; i3++) {
            mutableComplex.set(complexVector2, i3 - (complexVector.length / 4));
            complexVector4.multiplyConjugateTimesI(i3, mutableComplex);
            complexVector5.multiplyConjugateTimesI(i3, mutableComplex);
            complexVector5.multiplyConjugateTimesI(i3, mutableComplex);
        }
        fft(complexVector3, complexVectorArr);
        fft(complexVector4, complexVectorArr);
        fft(complexVector5, complexVectorArr);
    }

    static BigInteger fromFftVector(ComplexVector complexVector, int i, int i2) {
        if (!$assertionsDisabled && i2 > 25) {
            throw new AssertionError(i2 + " does not fit into an int with slack");
        }
        int min = (int) Math.min(complexVector.length, (2147483648L / i2) + 1);
        byte[] bArr = new byte[(int) ((8 * ((min * i2) + 31)) / 32)];
        int i3 = (1 << i2) - 1;
        int i4 = 32 - i2;
        long j = 0;
        int length = (bArr.length * 8) - i2;
        int i5 = 0;
        int min2 = Math.min(Math.max(0, length >> 3), bArr.length - 4);
        for (int i6 = 0; i6 <= 1; i6++) {
            for (int i7 = 0; i7 < min; i7++) {
                long round = Math.round(complexVector.part(i7, i6)) + j;
                j = round >> i2;
                int min3 = Math.min(Math.max(0, length >> 3), bArr.length - 4);
                i5 = (int) ((i5 >>> ((min2 - min3) << 3)) | ((round & i3) << ((i4 - length) + (min3 << 3))));
                FastDoubleSwar.writeIntBE(bArr, min3, i5);
                min2 = min3;
                length -= i2;
            }
        }
        return new BigInteger(i, bArr);
    }

    private static ComplexVector[] getRootsOfUnity2(int i) {
        ComplexVector[] complexVectorArr = new ComplexVector[i + 1];
        for (int i2 = i; i2 >= 0; i2 -= 2) {
            if (i2 < 20) {
                if (ROOTS2_CACHE[i2] == null) {
                    ROOTS2_CACHE[i2] = calculateRootsOfUnity(1 << i2);
                }
                complexVectorArr[i2] = ROOTS2_CACHE[i2];
            } else {
                complexVectorArr[i2] = calculateRootsOfUnity(1 << i2);
            }
        }
        return complexVectorArr;
    }

    private static ComplexVector getRootsOfUnity3(int i) {
        if (i >= 20) {
            return calculateRootsOfUnity(3 << i);
        }
        if (ROOTS3_CACHE[i] == null) {
            ROOTS3_CACHE[i] = calculateRootsOfUnity(3 << i);
        }
        return ROOTS3_CACHE[i];
    }

    private static void ifft(ComplexVector complexVector, ComplexVector[] complexVectorArr) {
        int i = complexVector.length;
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
        MutableComplex mutableComplex = new MutableComplex();
        MutableComplex mutableComplex2 = new MutableComplex();
        MutableComplex mutableComplex3 = new MutableComplex();
        MutableComplex mutableComplex4 = new MutableComplex();
        MutableComplex mutableComplex5 = new MutableComplex();
        MutableComplex mutableComplex6 = new MutableComplex();
        MutableComplex mutableComplex7 = new MutableComplex();
        MutableComplex mutableComplex8 = new MutableComplex();
        int i2 = 1;
        if (numberOfLeadingZeros % 2 != 0) {
            for (int i3 = 0; i3 < i; i3 += 2) {
                complexVector.copyInto(i3 + 1, mutableComplex3);
                complexVector.copyInto(i3, mutableComplex);
                complexVector.add(i3, mutableComplex3);
                mutableComplex.subtractInto(mutableComplex3, complexVector, i3 + 1);
            }
            i2 = 1 + 1;
        }
        MutableComplex mutableComplex9 = new MutableComplex();
        MutableComplex mutableComplex10 = new MutableComplex();
        while (i2 <= numberOfLeadingZeros) {
            ComplexVector complexVector2 = complexVectorArr[i2 - 1];
            int i4 = 1 << (i2 + 1);
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 < i) {
                    for (int i7 = 0; i7 < i4 / 4; i7++) {
                        mutableComplex9.set(complexVector2, i7);
                        mutableComplex9.squareInto(mutableComplex10);
                        int i8 = i6 + i7;
                        int i9 = i6 + i7 + (i4 / 4);
                        int i10 = i6 + i7 + (i4 / 2);
                        int i11 = i6 + i7 + ((i4 * 3) / 4);
                        complexVector.copyInto(i8, mutableComplex);
                        complexVector.multiplyInto(i9, mutableComplex9, mutableComplex2);
                        complexVector.multiplyInto(i10, mutableComplex10, mutableComplex3);
                        complexVector.multiplyConjugateInto(i11, mutableComplex9, mutableComplex4);
                        mutableComplex.addInto(mutableComplex2, mutableComplex5);
                        mutableComplex5.add(mutableComplex3);
                        mutableComplex5.add(mutableComplex4);
                        mutableComplex.addTimesIInto(mutableComplex2, mutableComplex6);
                        mutableComplex6.subtract(mutableComplex3);
                        mutableComplex6.subtractTimesI(mutableComplex4);
                        mutableComplex.subtractInto(mutableComplex2, mutableComplex7);
                        mutableComplex7.add(mutableComplex3);
                        mutableComplex7.subtract(mutableComplex4);
                        mutableComplex.subtractTimesIInto(mutableComplex2, mutableComplex8);
                        mutableComplex8.subtract(mutableComplex3);
                        mutableComplex8.addTimesI(mutableComplex4);
                        mutableComplex5.copyInto(complexVector, i8);
                        mutableComplex6.copyInto(complexVector, i9);
                        mutableComplex7.copyInto(complexVector, i10);
                        mutableComplex8.copyInto(complexVector, i11);
                    }
                    i5 = i6 + i4;
                }
            }
            i2 += 2;
        }
        for (int i12 = 0; i12 < i; i12++) {
            complexVector.timesTwoToThe(i12, -numberOfLeadingZeros);
        }
    }

    private static void ifftMixedRadix(ComplexVector complexVector, ComplexVector[] complexVectorArr, ComplexVector complexVector2) {
        int i = complexVector.length / 3;
        ComplexVector complexVector3 = new ComplexVector(complexVector, 0, i);
        ComplexVector complexVector4 = new ComplexVector(complexVector, i, i * 2);
        ComplexVector complexVector5 = new ComplexVector(complexVector, i * 2, complexVector.length);
        ifft(complexVector3, complexVectorArr);
        ifft(complexVector4, complexVectorArr);
        ifft(complexVector5, complexVectorArr);
        MutableComplex mutableComplex = new MutableComplex();
        for (int i2 = 0; i2 < complexVector.length / 4; i2++) {
            mutableComplex.set(complexVector2, i2);
            complexVector4.multiply(i2, mutableComplex);
            complexVector5.multiply(i2, mutableComplex);
            complexVector5.multiply(i2, mutableComplex);
        }
        for (int i3 = complexVector.length / 4; i3 < i; i3++) {
            mutableComplex.set(complexVector2, i3 - (complexVector.length / 4));
            complexVector4.multiplyByIAnd(i3, mutableComplex);
            complexVector5.multiplyByIAnd(i3, mutableComplex);
            complexVector5.multiplyByIAnd(i3, mutableComplex);
        }
        fft3(complexVector3, complexVector4, complexVector5, -1, 0.3333333333333333d);
    }

    public static BigInteger multiply(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!$assertionsDisabled && bigInteger == null) {
            throw new AssertionError("a==null");
        }
        if (!$assertionsDisabled && bigInteger2 == null) {
            throw new AssertionError("b==null");
        }
        if (bigInteger2.signum() == 0 || bigInteger.signum() == 0) {
            return BigInteger.ZERO;
        }
        if (bigInteger2 == bigInteger) {
            return square(bigInteger2);
        }
        int bitLength = bigInteger.bitLength();
        int bitLength2 = bigInteger2.bitLength();
        if (bitLength + bitLength2 > 2147483648L) {
            throw new ArithmeticException("BigInteger would overflow supported range");
        }
        return (bitLength <= TOOM_COOK_THRESHOLD || bitLength2 <= TOOM_COOK_THRESHOLD || (bitLength <= FFT_THRESHOLD && bitLength2 <= FFT_THRESHOLD)) ? bigInteger.multiply(bigInteger2) : multiplyFft(bigInteger, bigInteger2);
    }

    static BigInteger multiplyFft(BigInteger bigInteger, BigInteger bigInteger2) {
        int signum = bigInteger.signum() * bigInteger2.signum();
        byte[] byteArray = (bigInteger.signum() < 0 ? bigInteger.negate() : bigInteger).toByteArray();
        byte[] byteArray2 = (bigInteger2.signum() < 0 ? bigInteger2.negate() : bigInteger2).toByteArray();
        int max = Math.max(byteArray.length, byteArray2.length) * 8;
        int bitsPerFftPoint = bitsPerFftPoint(max);
        int i = (((max + bitsPerFftPoint) - 1) / bitsPerFftPoint) + 1;
        int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i - 1);
        int i2 = 1 << numberOfLeadingZeros;
        int i3 = (i2 * 3) / 4;
        if (i >= i3 || numberOfLeadingZeros <= 3) {
            ComplexVector[] rootsOfUnity2 = getRootsOfUnity2(numberOfLeadingZeros);
            ComplexVector fftVector = toFftVector(byteArray, i2, bitsPerFftPoint);
            fftVector.applyWeights(rootsOfUnity2[numberOfLeadingZeros]);
            fft(fftVector, rootsOfUnity2);
            ComplexVector fftVector2 = toFftVector(byteArray2, i2, bitsPerFftPoint);
            fftVector2.applyWeights(rootsOfUnity2[numberOfLeadingZeros]);
            fft(fftVector2, rootsOfUnity2);
            fftVector.multiplyPointwise(fftVector2);
            ifft(fftVector, rootsOfUnity2);
            fftVector.applyInverseWeights(rootsOfUnity2[numberOfLeadingZeros]);
            return fromFftVector(fftVector, signum, bitsPerFftPoint);
        }
        ComplexVector[] rootsOfUnity22 = getRootsOfUnity2(numberOfLeadingZeros - 2);
        ComplexVector rootsOfUnity3 = getRootsOfUnity3(numberOfLeadingZeros - 2);
        ComplexVector rootsOfUnity32 = getRootsOfUnity3(numberOfLeadingZeros - 4);
        ComplexVector fftVector3 = toFftVector(byteArray, i3, bitsPerFftPoint);
        fftVector3.applyWeights(rootsOfUnity3);
        fftMixedRadix(fftVector3, rootsOfUnity22, rootsOfUnity32);
        ComplexVector fftVector4 = toFftVector(byteArray2, i3, bitsPerFftPoint);
        fftVector4.applyWeights(rootsOfUnity3);
        fftMixedRadix(fftVector4, rootsOfUnity22, rootsOfUnity32);
        fftVector3.multiplyPointwise(fftVector4);
        ifftMixedRadix(fftVector3, rootsOfUnity22, rootsOfUnity32);
        fftVector3.applyInverseWeights(rootsOfUnity3);
        return fromFftVector(fftVector3, signum, bitsPerFftPoint);
    }

    static BigInteger square(BigInteger bigInteger) {
        return bigInteger.signum() == 0 ? BigInteger.ZERO : bigInteger.bitLength() < FFT_THRESHOLD ? bigInteger.multiply(bigInteger) : squareFft(bigInteger);
    }

    static BigInteger squareFft(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length * 8;
        int bitsPerFftPoint = bitsPerFftPoint(length);
        int i = (((length + bitsPerFftPoint) - 1) / bitsPerFftPoint) + 1;
        int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i - 1);
        int i2 = 1 << numberOfLeadingZeros;
        int i3 = (i2 * 3) / 4;
        if (i >= i3) {
            ComplexVector fftVector = toFftVector(byteArray, i2, bitsPerFftPoint);
            ComplexVector[] rootsOfUnity2 = getRootsOfUnity2(numberOfLeadingZeros);
            fftVector.applyWeights(rootsOfUnity2[numberOfLeadingZeros]);
            fft(fftVector, rootsOfUnity2);
            fftVector.squarePointwise();
            ifft(fftVector, rootsOfUnity2);
            fftVector.applyInverseWeights(rootsOfUnity2[numberOfLeadingZeros]);
            return fromFftVector(fftVector, 1, bitsPerFftPoint);
        }
        ComplexVector fftVector2 = toFftVector(byteArray, i3, bitsPerFftPoint);
        ComplexVector[] rootsOfUnity22 = getRootsOfUnity2(numberOfLeadingZeros - 2);
        ComplexVector rootsOfUnity3 = getRootsOfUnity3(numberOfLeadingZeros - 2);
        ComplexVector rootsOfUnity32 = getRootsOfUnity3(numberOfLeadingZeros - 4);
        fftVector2.applyWeights(rootsOfUnity3);
        fftMixedRadix(fftVector2, rootsOfUnity22, rootsOfUnity32);
        fftVector2.squarePointwise();
        ifftMixedRadix(fftVector2, rootsOfUnity22, rootsOfUnity32);
        fftVector2.applyInverseWeights(rootsOfUnity3);
        return fromFftVector(fftVector2, 1, bitsPerFftPoint);
    }

    static ComplexVector toFftVector(byte[] bArr, int i, int i2) {
        if (!$assertionsDisabled && i2 > 25) {
            throw new AssertionError(i2 + " does not fit into an int with slack");
        }
        ComplexVector complexVector = new ComplexVector(i);
        if (bArr.length < 4) {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 0, bArr2, 4 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        int i3 = 1 << i2;
        int i4 = i3 / 2;
        int i5 = i3 - 1;
        int i6 = 32 - i2;
        int i7 = 0;
        int i8 = 0;
        int length = bArr.length * 8;
        while (true) {
            int i9 = length - i2;
            if (i9 <= (-i2)) {
                break;
            }
            int min = Math.min(Math.max(0, i9 >> 3), bArr.length - 4);
            i7 = (i4 - (((FastDoubleSwar.readIntBE(bArr, min) >>> ((i6 - i9) + (min << 3))) & i5) + i7)) >>> 31;
            complexVector.real(i8, r0 - (i3 & (-i7)));
            i8++;
            length = i9;
        }
        if (i7 > 0) {
            complexVector.real(i8, i7);
        }
        return complexVector;
    }

    static {
        $assertionsDisabled = !FftMultiplier.class.desiredAssertionStatus();
        COS_0_25 = Math.cos(0.7853981633974483d);
        SIN_0_25 = Math.sin(0.7853981633974483d);
        ROOTS2_CACHE = new ComplexVector[20];
        ROOTS3_CACHE = new ComplexVector[20];
    }
}
