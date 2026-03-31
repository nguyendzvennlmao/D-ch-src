package com.kammoun.utils.jackson.databind.util.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class PrivateMaxEntriesMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    static final long MAXIMUM_CAPACITY = 9223372034707292160L;
    static final int READ_BUFFER_THRESHOLD = 4;
    static final int READ_BUFFER_DRAIN_THRESHOLD = 8;
    static final int READ_BUFFER_SIZE = 16;
    static final int READ_BUFFER_INDEX_MASK = 15;
    static final int WRITE_BUFFER_DRAIN_THRESHOLD = 16;
    final ConcurrentMap<K, Node<K, V>> data;
    final int concurrencyLevel;
    final AtomicLong capacity;
    transient Set<K> keySet;
    transient Collection<V> values;
    transient Set<Map.Entry<K, V>> entrySet;
    static final long serialVersionUID = 1;
    static final int NCPU = Runtime.getRuntime().availableProcessors();
    static final int NUMBER_OF_READ_BUFFERS = Math.min(4, ceilingNextPowerOfTwo(NCPU));
    static final int READ_BUFFERS_MASK = NUMBER_OF_READ_BUFFERS - 1;
    final Lock evictionLock = new ReentrantLock();
    final AtomicLong weightedSize = new AtomicLong();
    final LinkedDeque<Node<K, V>> evictionDeque = new LinkedDeque<>();
    final Queue<Runnable> writeBuffer = new ConcurrentLinkedQueue();
    final AtomicReference<DrainStatus> drainStatus = new AtomicReference<>(DrainStatus.IDLE);
    final long[] readBufferReadCount = new long[NUMBER_OF_READ_BUFFERS];
    final AtomicLongArray readBufferWriteCount = new AtomicLongArray(NUMBER_OF_READ_BUFFERS);
    final AtomicLongArray readBufferDrainAtWriteCount = new AtomicLongArray(NUMBER_OF_READ_BUFFERS);
    final AtomicReferenceArray<Node<K, V>> readBuffers = new AtomicReferenceArray<>(NUMBER_OF_READ_BUFFERS * 16);

    public final class AddTask implements Runnable {
        final Node<K, V> node;
        final int weight;

        AddTask(Node<K, V> node, int i) {
            this.weight = i;
            this.node = node;
        }

        @Override
        public void run() {
            PrivateMaxEntriesMap.this.weightedSize.lazySet(PrivateMaxEntriesMap.this.weightedSize.get() + this.weight);
            if (((WeightedValue) this.node.get()).isAlive()) {
                PrivateMaxEntriesMap.this.evictionDeque.add((LinkedDeque<Node<K, V>>) this.node);
                PrivateMaxEntriesMap.this.evict();
            }
        }
    }

    public static final class Builder<K, V> {
        static final int DEFAULT_CONCURRENCY_LEVEL = 16;
        static final int DEFAULT_INITIAL_CAPACITY = 16;
        long capacity = -1;
        int initialCapacity = 16;
        int concurrencyLevel = 16;

        public Builder<K, V> initialCapacity(int i) {
            PrivateMaxEntriesMap.checkArgument(i >= 0);
            this.initialCapacity = i;
            return this;
        }

        public Builder<K, V> maximumCapacity(long j) {
            PrivateMaxEntriesMap.checkArgument(j >= 0);
            this.capacity = j;
            return this;
        }

        public Builder<K, V> concurrencyLevel(int i) {
            PrivateMaxEntriesMap.checkArgument(i > 0);
            this.concurrencyLevel = i;
            return this;
        }

        public PrivateMaxEntriesMap<K, V> build() {
            PrivateMaxEntriesMap.checkState(this.capacity >= 0);
            return new PrivateMaxEntriesMap<>(this);
        }
    }

    public enum DrainStatus {
        IDLE {
            @Override
            boolean shouldDrainBuffers(boolean z) {
                return !z;
            }
        },
        REQUIRED {
            @Override
            boolean shouldDrainBuffers(boolean z) {
                return true;
            }
        },
        PROCESSING {
            @Override
            boolean shouldDrainBuffers(boolean z) {
                return false;
            }
        };

        abstract boolean shouldDrainBuffers(boolean z);
    }

    final class EntryIterator implements Iterator<Map.Entry<K, V>> {
        final Iterator<Node<K, V>> iterator;
        Node<K, V> current;

        EntryIterator() {
            this.iterator = PrivateMaxEntriesMap.this.data.values().iterator();
        }

        @Override
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override
        public Map.Entry<K, V> next() {
            this.current = this.iterator.next();
            return new WriteThroughEntry(this.current);
        }

        @Override
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.current != null);
            PrivateMaxEntriesMap.this.remove(this.current.key);
            this.current = null;
        }
    }

    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        final PrivateMaxEntriesMap<K, V> map;

        EntrySet() {
            this.map = PrivateMaxEntriesMap.this;
        }

        @Override
        public int size() {
            return this.map.size();
        }

        @Override
        public void clear() {
            this.map.clear();
        }

        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Node<K, V> node = this.map.data.get(entry.getKey());
            return node != null && node.getValue().equals(entry.getValue());
        }

        @Override
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException("ConcurrentLinkedHashMap does not allow add to be called on entrySet()");
        }

        @Override
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.map.remove(entry.getKey(), entry.getValue());
        }
    }

    final class KeyIterator implements Iterator<K> {
        final Iterator<K> iterator;
        K current;

        KeyIterator() {
            this.iterator = PrivateMaxEntriesMap.this.data.keySet().iterator();
        }

        @Override
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override
        public K next() {
            this.current = this.iterator.next();
            return this.current;
        }

        @Override
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.current != null);
            PrivateMaxEntriesMap.this.remove(this.current);
            this.current = null;
        }
    }

    final class KeySet extends AbstractSet<K> {
        final PrivateMaxEntriesMap<K, V> map;

        KeySet() {
            this.map = PrivateMaxEntriesMap.this;
        }

        @Override
        public int size() {
            return this.map.size();
        }

        @Override
        public void clear() {
            this.map.clear();
        }

        @Override
        public Iterator<K> iterator() {
            return new KeyIterator();
        }

        @Override
        public boolean contains(Object obj) {
            return PrivateMaxEntriesMap.this.containsKey(obj);
        }

        @Override
        public boolean remove(Object obj) {
            return this.map.remove(obj) != null;
        }

        @Override
        public Object[] toArray() {
            return this.map.data.keySet().toArray();
        }

        @Override
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.map.data.keySet().toArray(tArr);
        }
    }

    public static final class Node<K, V> extends AtomicReference<WeightedValue<V>> implements Linked<Node<K, V>> {
        final K key;
        Node<K, V> prev;
        Node<K, V> next;

        Node(K k, WeightedValue<V> weightedValue) {
            super(weightedValue);
            this.key = k;
        }

        @Override
        public Node<K, V> getPrevious() {
            return this.prev;
        }

        @Override
        public void setPrevious(Node<K, V> node) {
            this.prev = node;
        }

        @Override
        public Node<K, V> getNext() {
            return this.next;
        }

        @Override
        public void setNext(Node<K, V> node) {
            this.next = node;
        }

        V getValue() {
            return ((WeightedValue) get()).value;
        }
    }

    public final class RemovalTask implements Runnable {
        final Node<K, V> node;

        RemovalTask(Node<K, V> node) {
            this.node = node;
        }

        @Override
        public void run() {
            PrivateMaxEntriesMap.this.evictionDeque.remove((LinkedDeque<Node<K, V>>) this.node);
            PrivateMaxEntriesMap.this.makeDead(this.node);
        }
    }

    static final class SerializationProxy<K, V> implements Serializable {
        final int concurrencyLevel;
        final Map<K, V> data;
        final long capacity;
        static final long serialVersionUID = 1;

        SerializationProxy(PrivateMaxEntriesMap<K, V> privateMaxEntriesMap) {
            this.concurrencyLevel = privateMaxEntriesMap.concurrencyLevel;
            this.data = new HashMap(privateMaxEntriesMap);
            this.capacity = privateMaxEntriesMap.capacity.get();
        }

        Object readResolve() {
            PrivateMaxEntriesMap<K, V> build = new Builder().maximumCapacity(this.capacity).build();
            build.putAll(this.data);
            return build;
        }
    }

    public final class UpdateTask implements Runnable {
        final int weightDifference;
        final Node<K, V> node;

        UpdateTask(Node<K, V> node, int i) {
            this.weightDifference = i;
            this.node = node;
        }

        @Override
        public void run() {
            PrivateMaxEntriesMap.this.weightedSize.lazySet(PrivateMaxEntriesMap.this.weightedSize.get() + this.weightDifference);
            PrivateMaxEntriesMap.this.applyRead(this.node);
            PrivateMaxEntriesMap.this.evict();
        }
    }

    final class ValueIterator implements Iterator<V> {
        final Iterator<Node<K, V>> iterator;
        Node<K, V> current;

        ValueIterator() {
            this.iterator = PrivateMaxEntriesMap.this.data.values().iterator();
        }

        @Override
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override
        public V next() {
            this.current = this.iterator.next();
            return this.current.getValue();
        }

        @Override
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.current != null);
            PrivateMaxEntriesMap.this.remove(this.current.key);
            this.current = null;
        }
    }

    final class Values extends AbstractCollection<V> {
        Values() {
        }

        @Override
        public int size() {
            return PrivateMaxEntriesMap.this.size();
        }

        @Override
        public void clear() {
            PrivateMaxEntriesMap.this.clear();
        }

        @Override
        public Iterator<V> iterator() {
            return new ValueIterator();
        }

        @Override
        public boolean contains(Object obj) {
            return PrivateMaxEntriesMap.this.containsValue(obj);
        }
    }

    public static final class WeightedValue<V> {
        final int weight;
        final V value;

        WeightedValue(V v, int i) {
            this.weight = i;
            this.value = v;
        }

        boolean contains(Object obj) {
            return obj == this.value || this.value.equals(obj);
        }

        boolean isAlive() {
            return this.weight > 0;
        }
    }

    public final class WriteThroughEntry extends AbstractMap.SimpleEntry<K, V> {
        static final long serialVersionUID = 1;

        WriteThroughEntry(Node<K, V> node) {
            super(node.key, node.getValue());
        }

        @Override
        public V setValue(V v) {
            PrivateMaxEntriesMap.this.put(getKey(), v);
            return (V) super.setValue(v);
        }

        Object writeReplace() {
            return new AbstractMap.SimpleEntry(this);
        }
    }

    static int ceilingNextPowerOfTwo(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }

    private static int readBufferIndex(int i, int i2) {
        return (16 * i) + i2;
    }

    PrivateMaxEntriesMap(Builder<K, V> builder) {
        this.concurrencyLevel = builder.concurrencyLevel;
        this.capacity = new AtomicLong(Math.min(builder.capacity, MAXIMUM_CAPACITY));
        this.data = new ConcurrentHashMap(builder.initialCapacity, 0.75f, this.concurrencyLevel);
    }

    static void checkNotNull(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
    }

    static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public long capacity() {
        return this.capacity.get();
    }

    public void setCapacity(long j) {
        checkArgument(j >= 0);
        this.evictionLock.lock();
        try {
            this.capacity.lazySet(Math.min(j, MAXIMUM_CAPACITY));
            drainBuffers();
            evict();
        } finally {
            this.evictionLock.unlock();
        }
    }

    boolean hasOverflowed() {
        return this.weightedSize.get() > this.capacity.get();
    }

    void evict() {
        Node<K, V> poll;
        while (hasOverflowed() && (poll = this.evictionDeque.poll()) != null) {
            this.data.remove(poll.key, poll);
            makeDead(poll);
        }
    }

    void afterRead(Node<K, V> node) {
        int readBufferIndex = readBufferIndex();
        drainOnReadIfNeeded(readBufferIndex, recordRead(readBufferIndex, node));
    }

    static int readBufferIndex() {
        return ((int) Thread.currentThread().getId()) & READ_BUFFERS_MASK;
    }

    long recordRead(int i, Node<K, V> node) {
        long j = this.readBufferWriteCount.get(i);
        this.readBufferWriteCount.lazySet(i, j + serialVersionUID);
        this.readBuffers.lazySet(readBufferIndex(i, (int) (j & 15)), node);
        return j;
    }

    void drainOnReadIfNeeded(int i, long j) {
        if (this.drainStatus.get().shouldDrainBuffers(j - this.readBufferDrainAtWriteCount.get(i) < 4)) {
            tryToDrainBuffers();
        }
    }

    void afterWrite(Runnable runnable) {
        this.writeBuffer.add(runnable);
        this.drainStatus.lazySet(DrainStatus.REQUIRED);
        tryToDrainBuffers();
    }

    void tryToDrainBuffers() {
        if (this.evictionLock.tryLock()) {
            try {
                this.drainStatus.lazySet(DrainStatus.PROCESSING);
                drainBuffers();
            } finally {
                this.drainStatus.compareAndSet(DrainStatus.PROCESSING, DrainStatus.IDLE);
                this.evictionLock.unlock();
            }
        }
    }

    void drainBuffers() {
        drainReadBuffers();
        drainWriteBuffer();
    }

    void drainReadBuffers() {
        int id = (int) Thread.currentThread().getId();
        int i = id + NUMBER_OF_READ_BUFFERS;
        for (int i2 = id; i2 < i; i2++) {
            drainReadBuffer(i2 & READ_BUFFERS_MASK);
        }
    }

    void drainReadBuffer(int i) {
        int readBufferIndex;
        Node<K, V> node;
        long j = this.readBufferWriteCount.get(i);
        for (int i2 = 0; i2 < 8 && (node = this.readBuffers.get((readBufferIndex = readBufferIndex(i, (int) (this.readBufferReadCount[i] & 15))))) != null; i2++) {
            this.readBuffers.lazySet(readBufferIndex, null);
            applyRead(node);
            long[] jArr = this.readBufferReadCount;
            jArr[i] = jArr[i] + serialVersionUID;
        }
        this.readBufferDrainAtWriteCount.lazySet(i, j);
    }

    void applyRead(Node<K, V> node) {
        if (this.evictionDeque.contains((Linked<?>) node)) {
            this.evictionDeque.moveToBack(node);
        }
    }

    void drainWriteBuffer() {
        Runnable poll;
        for (int i = 0; i < 16 && (poll = this.writeBuffer.poll()) != null; i++) {
            poll.run();
        }
    }

    boolean tryToRetire(Node<K, V> node, WeightedValue<V> weightedValue) {
        if (weightedValue.isAlive()) {
            return node.compareAndSet(weightedValue, new WeightedValue(weightedValue.value, -weightedValue.weight));
        }
        return false;
    }

    void makeRetired(Node<K, V> node) {
        WeightedValue weightedValue;
        do {
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.isAlive()) {
                return;
            }
        } while (!node.compareAndSet(weightedValue, new WeightedValue(weightedValue.value, -weightedValue.weight)));
    }

    void makeDead(Node<K, V> node) {
        WeightedValue weightedValue;
        do {
            weightedValue = (WeightedValue) node.get();
        } while (!node.compareAndSet(weightedValue, new WeightedValue(weightedValue.value, 0)));
        this.weightedSize.lazySet(this.weightedSize.get() - Math.abs(weightedValue.weight));
    }

    @Override
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    @Override
    public int size() {
        return this.data.size();
    }

    @Override
    public void clear() {
        this.evictionLock.lock();
        while (true) {
            try {
                Node<K, V> poll = this.evictionDeque.poll();
                if (poll == null) {
                    break;
                }
                this.data.remove(poll.key, poll);
                makeDead(poll);
            } finally {
                this.evictionLock.unlock();
            }
        }
        for (int i = 0; i < this.readBuffers.length(); i++) {
            this.readBuffers.lazySet(i, null);
        }
        while (true) {
            Runnable poll2 = this.writeBuffer.poll();
            if (poll2 == null) {
                return;
            } else {
                poll2.run();
            }
        }
    }

    @Override
    public boolean containsKey(Object obj) {
        return this.data.containsKey(obj);
    }

    @Override
    public boolean containsValue(Object obj) {
        checkNotNull(obj);
        Iterator<Node<K, V>> it = this.data.values().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object obj) {
        Node<K, V> node = this.data.get(obj);
        if (node == null) {
            return null;
        }
        afterRead(node);
        return node.getValue();
    }

    @Override
    public V put(K k, V v) {
        return put(k, v, false);
    }

    @Override
    public V putIfAbsent(K k, V v) {
        return put(k, v, true);
    }

    V put(K k, V v, boolean z) {
        WeightedValue weightedValue;
        checkNotNull(k);
        checkNotNull(v);
        WeightedValue weightedValue2 = new WeightedValue(v, 1);
        Node<K, V> node = new Node<>(k, weightedValue2);
        while (true) {
            Node<K, V> putIfAbsent = this.data.putIfAbsent(node.key, node);
            if (putIfAbsent == null) {
                afterWrite(new AddTask(node, 1));
                return null;
            }
            if (z) {
                afterRead(putIfAbsent);
                return putIfAbsent.getValue();
            }
            do {
                weightedValue = (WeightedValue) putIfAbsent.get();
                if (!weightedValue.isAlive()) {
                    break;
                }
            } while (!putIfAbsent.compareAndSet(weightedValue, weightedValue2));
            int i = 1 - weightedValue.weight;
            if (i == 0) {
                afterRead(putIfAbsent);
            } else {
                afterWrite(new UpdateTask(putIfAbsent, i));
            }
            return weightedValue.value;
        }
    }

    @Override
    public V remove(Object obj) {
        Node<K, V> remove = this.data.remove(obj);
        if (remove == null) {
            return null;
        }
        makeRetired(remove);
        afterWrite(new RemovalTask(remove));
        return remove.getValue();
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        Node<K, V> node = this.data.get(obj);
        if (node == null || obj2 == null) {
            return false;
        }
        WeightedValue<V> weightedValue = (WeightedValue) node.get();
        while (weightedValue.contains(obj2)) {
            if (tryToRetire(node, weightedValue)) {
                if (!this.data.remove(obj, node)) {
                    return false;
                }
                afterWrite(new RemovalTask(node));
                return true;
            }
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.isAlive()) {
                return false;
            }
        }
        return false;
    }

    @Override
    public V replace(K k, V v) {
        WeightedValue weightedValue;
        checkNotNull(k);
        checkNotNull(v);
        WeightedValue weightedValue2 = new WeightedValue(v, 1);
        Node<K, V> node = this.data.get(k);
        if (node == null) {
            return null;
        }
        do {
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.isAlive()) {
                return null;
            }
        } while (!node.compareAndSet(weightedValue, weightedValue2));
        int i = 1 - weightedValue.weight;
        if (i == 0) {
            afterRead(node);
        } else {
            afterWrite(new UpdateTask(node, i));
        }
        return weightedValue.value;
    }

    @Override
    public boolean replace(K k, V v, V v2) {
        WeightedValue weightedValue;
        checkNotNull(k);
        checkNotNull(v);
        checkNotNull(v2);
        WeightedValue weightedValue2 = new WeightedValue(v2, 1);
        Node<K, V> node = this.data.get(k);
        if (node == null) {
            return false;
        }
        do {
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.isAlive() || !weightedValue.contains(v)) {
                return false;
            }
        } while (!node.compareAndSet(weightedValue, weightedValue2));
        int i = 1 - weightedValue.weight;
        if (i == 0) {
            afterRead(node);
            return true;
        }
        afterWrite(new UpdateTask(node, i));
        return true;
    }

    @Override
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    @Override
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.values = values;
        return values;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    Object writeReplace() {
        return new SerializationProxy(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }
}
