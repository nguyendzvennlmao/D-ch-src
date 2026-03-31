package org.erdtman.jcs;

class NumberDiyFp {
    private long f;
    private int e;
    static final int kSignificandSize = 64;
    static final long kUint64MSB = Long.MIN_VALUE;
    static final boolean $assertionsDisabled;

    public NumberDiyFp() {
        this.f = 0L;
        this.e = 0;
    }

    public NumberDiyFp(long j, int i) {
        this.f = j;
        this.e = i;
    }

    private static boolean uint64_gte(long j, long j2) {
        if (j != j2) {
            if (!(((j > j2) ^ (j < 0)) ^ (j2 < 0))) {
                return false;
            }
        }
        return true;
    }

    void subtract(NumberDiyFp numberDiyFp) {
        if (!$assertionsDisabled && this.e != numberDiyFp.e) {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && !uint64_gte(this.f, numberDiyFp.f)) {
            throw new AssertionError();
        }
        this.f -= numberDiyFp.f;
    }

    public static NumberDiyFp minus(NumberDiyFp numberDiyFp, NumberDiyFp numberDiyFp2) {
        NumberDiyFp numberDiyFp3 = new NumberDiyFp(numberDiyFp.f, numberDiyFp.e);
        numberDiyFp3.subtract(numberDiyFp2);
        return numberDiyFp3;
    }

    void multiply(NumberDiyFp numberDiyFp) {
        long j = this.f >>> 32;
        long j2 = this.f & 4294967295L;
        long j3 = numberDiyFp.f >>> 32;
        long j4 = numberDiyFp.f & 4294967295L;
        long j5 = j * j3;
        long j6 = j2 * j3;
        long j7 = j * j4;
        this.e += numberDiyFp.e + 64;
        this.f = j5 + (j7 >>> 32) + (j6 >>> 32) + ((((((j2 * j4) >>> 32) + (j7 & 4294967295L)) + (j6 & 4294967295L)) + 2147483648L) >>> 32);
    }

    public static NumberDiyFp times(NumberDiyFp numberDiyFp, NumberDiyFp numberDiyFp2) {
        NumberDiyFp numberDiyFp3 = new NumberDiyFp(numberDiyFp.f, numberDiyFp.e);
        numberDiyFp3.multiply(numberDiyFp2);
        return numberDiyFp3;
    }

    public void normalize() {
        if (!$assertionsDisabled && this.f == 0) {
            throw new AssertionError();
        }
        long j = this.f;
        int i = this.e;
        while ((j & (-18014398509481984L)) == 0) {
            j <<= 10;
            i -= 10;
        }
        while ((j & kUint64MSB) == 0) {
            j <<= 1;
            i--;
        }
        this.f = j;
        this.e = i;
    }

    static NumberDiyFp normalize(NumberDiyFp numberDiyFp) {
        NumberDiyFp numberDiyFp2 = new NumberDiyFp(numberDiyFp.f, numberDiyFp.e);
        numberDiyFp2.normalize();
        return numberDiyFp2;
    }

    public long f() {
        return this.f;
    }

    public int e() {
        return this.e;
    }

    public void setF(long j) {
        this.f = j;
    }

    public void setE(int i) {
        this.e = i;
    }

    public String toString() {
        return "[DiyFp f:" + this.f + ", e:" + this.e + "]";
    }

    static {
        $assertionsDisabled = !NumberDiyFp.class.desiredAssertionStatus();
    }
}
