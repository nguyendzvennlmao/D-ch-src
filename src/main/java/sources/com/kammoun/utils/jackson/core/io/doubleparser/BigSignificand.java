package com.kammoun.utils.jackson.core.io.doubleparser;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

class BigSignificand {
    private static final long LONG_MASK = 4294967295L;
    private final int numInts;
    private final int[] x;
    private int firstNonZeroInt;

    public BigSignificand(long j) {
        if (j <= 0 || j >= 2147483647L) {
            throw new IllegalArgumentException("numBits=" + j);
        }
        this.numInts = (((int) ((j + 63) >>> 6)) + 1) << 1;
        this.x = new int[this.numInts];
        this.firstNonZeroInt = this.numInts;
    }

    public void add(int i) {
        if (i == 0) {
            return;
        }
        long j = i & LONG_MASK;
        int i2 = this.numInts - 1;
        while (j != 0) {
            long x = (x(i2) & LONG_MASK) + j;
            x(i2, (int) x);
            j = x >>> 32;
            i2--;
        }
        this.firstNonZeroInt = Math.min(this.firstNonZeroInt, i2 + 1);
    }

    public void fma(int i, int i2) {
        long j = i & LONG_MASK;
        long j2 = i2;
        int i3 = this.numInts - 1;
        while (i3 >= this.firstNonZeroInt) {
            long x = (j * (x(i3) & LONG_MASK)) + j2;
            x(i3, (int) x);
            j2 = x >>> 32;
            i3--;
        }
        if (j2 != 0) {
            x(i3, (int) j2);
            this.firstNonZeroInt = i3;
        }
    }

    public BigInteger toBigInteger() {
        byte[] bArr = new byte[this.x.length << 2];
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).asIntBuffer();
        for (int i = 0; i < this.x.length; i++) {
            asIntBuffer.put(i, this.x[i]);
        }
        return new BigInteger(bArr);
    }

    private void x(int i, int i2) {
        this.x[i] = i2;
    }

    private int x(int i) {
        return this.x[i];
    }
}
