package com.kammoun.utils.jackson.core.sym;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.core.JsonFactory;
import com.kammoun.utils.jackson.core.StreamReadConstraints;
import com.kammoun.utils.jackson.core.TokenStreamFactory;
import com.kammoun.utils.jackson.core.exc.StreamConstraintsException;
import com.kammoun.utils.jackson.core.util.InternCache;
import java.io.IOException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

public final class CharsToNameCanonicalizer {
    public static final int HASH_MULT = 33;
    private static final int DEFAULT_T_SIZE = 64;
    private static final int MAX_T_SIZE = 65536;
    static final int MAX_ENTRIES_FOR_REUSE = 12000;
    static final int MAX_COLL_CHAIN_LENGTH = 150;
    protected final CharsToNameCanonicalizer _parent;
    protected final AtomicReference<TableInfo> _tableInfo;
    protected final StreamReadConstraints _streamReadConstraints;
    protected final int _seed;
    protected final int _factoryFeatures;
    protected boolean _canonicalize;
    protected String[] _symbols;
    protected Bucket[] _buckets;
    protected int _size;
    protected int _sizeThreshold;
    protected int _indexMask;
    protected int _longestCollisionList;
    protected boolean _hashShared;
    protected BitSet _overflows;

    public static final class Bucket {
        public final String symbol;
        public final Bucket next;
        public final int length;

        public Bucket(String str, Bucket bucket) {
            this.symbol = str;
            this.next = bucket;
            this.length = bucket == null ? 1 : bucket.length + 1;
        }

        public String has(char[] cArr, int i, int i2) {
            if (this.symbol.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.symbol.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.symbol;
                }
            }
            return null;
        }
    }

    public static final class TableInfo {
        final int size;
        final int longestCollisionList;
        final String[] symbols;
        final Bucket[] buckets;

        public TableInfo(int i, int i2, String[] strArr, Bucket[] bucketArr) {
            this.size = i;
            this.longestCollisionList = i2;
            this.symbols = strArr;
            this.buckets = bucketArr;
        }

        public TableInfo(CharsToNameCanonicalizer charsToNameCanonicalizer) {
            this.size = charsToNameCanonicalizer._size;
            this.longestCollisionList = charsToNameCanonicalizer._longestCollisionList;
            this.symbols = charsToNameCanonicalizer._symbols;
            this.buckets = charsToNameCanonicalizer._buckets;
        }

        public static TableInfo createInitial(int i) {
            return new TableInfo(0, 0, new String[i], new Bucket[i >> 1]);
        }
    }

    private CharsToNameCanonicalizer(StreamReadConstraints streamReadConstraints, int i, int i2) {
        this._parent = null;
        this._seed = i2;
        this._streamReadConstraints = streamReadConstraints;
        this._canonicalize = true;
        this._factoryFeatures = i;
        this._hashShared = false;
        this._longestCollisionList = 0;
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(64));
    }

    private CharsToNameCanonicalizer(CharsToNameCanonicalizer charsToNameCanonicalizer, StreamReadConstraints streamReadConstraints, int i, int i2, TableInfo tableInfo) {
        this._parent = charsToNameCanonicalizer;
        this._streamReadConstraints = streamReadConstraints;
        this._seed = i2;
        this._tableInfo = null;
        this._factoryFeatures = i;
        this._canonicalize = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
        this._symbols = tableInfo.symbols;
        this._buckets = tableInfo.buckets;
        this._size = tableInfo.size;
        this._longestCollisionList = tableInfo.longestCollisionList;
        int length = this._symbols.length;
        this._sizeThreshold = _thresholdSize(length);
        this._indexMask = length - 1;
        this._hashShared = true;
    }

    private static int _thresholdSize(int i) {
        return i - (i >> 2);
    }

    @Deprecated
    public static CharsToNameCanonicalizer createRoot() {
        return createRoot((TokenStreamFactory) null);
    }

    @Deprecated
    public static CharsToNameCanonicalizer createRoot(int i) {
        return createRoot(null, i);
    }

    public static CharsToNameCanonicalizer createRoot(TokenStreamFactory tokenStreamFactory) {
        return createRoot(tokenStreamFactory, 0);
    }

    public static CharsToNameCanonicalizer createRoot(TokenStreamFactory tokenStreamFactory, int i) {
        StreamReadConstraints streamReadConstraints;
        int factoryFeatures;
        if (i == 0) {
            i = System.identityHashCode(tokenStreamFactory);
        }
        if (tokenStreamFactory == null) {
            streamReadConstraints = StreamReadConstraints.defaults();
            factoryFeatures = 0;
        } else {
            streamReadConstraints = tokenStreamFactory.streamReadConstraints();
            factoryFeatures = tokenStreamFactory.getFactoryFeatures();
        }
        return new CharsToNameCanonicalizer(streamReadConstraints, factoryFeatures, i);
    }

    public CharsToNameCanonicalizer makeChild() {
        return new CharsToNameCanonicalizer(this, this._streamReadConstraints, this._factoryFeatures, this._seed, this._tableInfo.get());
    }

    @Deprecated
    public CharsToNameCanonicalizer makeChild(int i) {
        return makeChild();
    }

    public void release() {
        if (maybeDirty() && this._parent != null && this._canonicalize) {
            this._parent.mergeChild(new TableInfo(this));
            this._hashShared = true;
        }
    }

    private void mergeChild(TableInfo tableInfo) {
        int i = tableInfo.size;
        TableInfo tableInfo2 = this._tableInfo.get();
        if (i == tableInfo2.size) {
            return;
        }
        if (i > MAX_ENTRIES_FOR_REUSE) {
            tableInfo = TableInfo.createInitial(64);
        }
        this._tableInfo.compareAndSet(tableInfo2, tableInfo);
    }

    public int size() {
        return this._tableInfo != null ? this._tableInfo.get().size : this._size;
    }

    public int bucketCount() {
        return this._symbols.length;
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public int hashSeed() {
        return this._seed;
    }

    public int collisionCount() {
        int i = 0;
        for (Bucket bucket : this._buckets) {
            if (bucket != null) {
                i += bucket.length;
            }
        }
        return i;
    }

    public int maxCollisionLength() {
        return this._longestCollisionList;
    }

    public String findSymbol(char[] cArr, int i, int i2, int i3) throws IOException {
        if (i2 < 1) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        if (!this._canonicalize) {
            this._streamReadConstraints.validateNameLength(i2);
            return new String(cArr, i, i2);
        }
        int _hashToIndex = _hashToIndex(i3);
        String str = this._symbols[_hashToIndex];
        if (str != null) {
            if (str.length() == i2) {
                int i4 = 0;
                while (str.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 == i2) {
                        return str;
                    }
                }
            }
            Bucket bucket = this._buckets[_hashToIndex >> 1];
            if (bucket != null) {
                String has = bucket.has(cArr, i, i2);
                if (has != null) {
                    return has;
                }
                String _findSymbol2 = _findSymbol2(cArr, i, i2, bucket.next);
                if (_findSymbol2 != null) {
                    return _findSymbol2;
                }
            }
        }
        this._streamReadConstraints.validateNameLength(i2);
        return _addSymbol(cArr, i, i2, i3, _hashToIndex);
    }

    private String _findSymbol2(char[] cArr, int i, int i2, Bucket bucket) {
        while (bucket != null) {
            String has = bucket.has(cArr, i, i2);
            if (has != null) {
                return has;
            }
            bucket = bucket.next;
        }
        return null;
    }

    private String _addSymbol(char[] cArr, int i, int i2, int i3, int i4) throws IOException {
        if (this._hashShared) {
            copyArrays();
            this._hashShared = false;
        } else if (this._size >= this._sizeThreshold) {
            rehash();
            i4 = _hashToIndex(calcHash(cArr, i, i2));
        }
        String str = new String(cArr, i, i2);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this._factoryFeatures)) {
            str = InternCache.instance.intern(str);
        }
        this._size++;
        if (this._symbols[i4] == null) {
            this._symbols[i4] = str;
        } else {
            int i5 = i4 >> 1;
            Bucket bucket = new Bucket(str, this._buckets[i5]);
            int i6 = bucket.length;
            if (i6 > MAX_COLL_CHAIN_LENGTH) {
                _handleSpillOverflow(i5, bucket, i4);
            } else {
                this._buckets[i5] = bucket;
                this._longestCollisionList = Math.max(i6, this._longestCollisionList);
            }
        }
        return str;
    }

    private void _handleSpillOverflow(int i, Bucket bucket, int i2) throws IOException {
        if (this._overflows == null) {
            this._overflows = new BitSet();
            this._overflows.set(i);
        } else if (this._overflows.get(i)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this._factoryFeatures)) {
                _reportTooManyCollisions(MAX_COLL_CHAIN_LENGTH);
            }
            this._canonicalize = false;
        } else {
            this._overflows.set(i);
        }
        this._symbols[i2] = bucket.symbol;
        this._buckets[i] = null;
        this._size -= bucket.length;
        this._longestCollisionList = -1;
    }

    public int _hashToIndex(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this._indexMask;
    }

    public int calcHash(char[] cArr, int i, int i2) {
        int i3 = this._seed;
        int i4 = i + i2;
        for (int i5 = i; i5 < i4; i5++) {
            i3 = (i3 * 33) + cArr[i5];
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public int calcHash(String str) {
        int length = str.length();
        int i = this._seed;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 33) + str.charAt(i2);
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    private void copyArrays() {
        String[] strArr = this._symbols;
        this._symbols = (String[]) Arrays.copyOf(strArr, strArr.length);
        Bucket[] bucketArr = this._buckets;
        this._buckets = (Bucket[]) Arrays.copyOf(bucketArr, bucketArr.length);
    }

    private void rehash() throws IOException {
        int length = this._symbols.length;
        int i = length + length;
        if (i > MAX_T_SIZE) {
            this._size = 0;
            this._canonicalize = false;
            this._symbols = new String[64];
            this._buckets = new Bucket[32];
            this._indexMask = 63;
            this._hashShared = false;
            return;
        }
        String[] strArr = this._symbols;
        Bucket[] bucketArr = this._buckets;
        this._symbols = new String[i];
        this._buckets = new Bucket[i >> 1];
        this._indexMask = i - 1;
        this._sizeThreshold = _thresholdSize(i);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            String str = strArr[i4];
            if (str != null) {
                i2++;
                int _hashToIndex = _hashToIndex(calcHash(str));
                if (this._symbols[_hashToIndex] == null) {
                    this._symbols[_hashToIndex] = str;
                } else {
                    int i5 = _hashToIndex >> 1;
                    Bucket bucket = new Bucket(str, this._buckets[i5]);
                    this._buckets[i5] = bucket;
                    i3 = Math.max(i3, bucket.length);
                }
            }
        }
        int i6 = length >> 1;
        for (int i7 = 0; i7 < i6; i7++) {
            Bucket bucket2 = bucketArr[i7];
            while (true) {
                Bucket bucket3 = bucket2;
                if (bucket3 != null) {
                    i2++;
                    String str2 = bucket3.symbol;
                    int _hashToIndex2 = _hashToIndex(calcHash(str2));
                    if (this._symbols[_hashToIndex2] == null) {
                        this._symbols[_hashToIndex2] = str2;
                    } else {
                        int i8 = _hashToIndex2 >> 1;
                        Bucket bucket4 = new Bucket(str2, this._buckets[i8]);
                        this._buckets[i8] = bucket4;
                        i3 = Math.max(i3, bucket4.length);
                    }
                    bucket2 = bucket3.next;
                }
            }
        }
        this._longestCollisionList = i3;
        this._overflows = null;
        if (i2 != this._size) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this._size), Integer.valueOf(i2)));
        }
    }

    protected void _reportTooManyCollisions(int i) throws StreamConstraintsException {
        throw new StreamConstraintsException("Longest collision chain in symbol table (of size " + this._size + ") now exceeds maximum, " + i + " -- suspect a DoS attack based on hash collisions");
    }

    protected void verifyInternalConsistency() {
        int i = 0;
        int length = this._symbols.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this._symbols[i2] != null) {
                i++;
            }
        }
        int i3 = length >> 1;
        for (int i4 = 0; i4 < i3; i4++) {
            Bucket bucket = this._buckets[i4];
            while (true) {
                Bucket bucket2 = bucket;
                if (bucket2 != null) {
                    i++;
                    bucket = bucket2.next;
                }
            }
        }
        if (i != this._size) {
            throw new IllegalStateException(String.format("Internal error: expected internal size %d vs calculated count %d", Integer.valueOf(this._size), Integer.valueOf(i)));
        }
    }
}
