package com.kammoun.utils.jackson.core.util;

import com.kammoun.utils.jackson.core.util.RecyclerPool.WithPool;
import java.io.Serializable;
import java.util.Deque;
import java.util.Optional;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicReference;

public interface RecyclerPool<P extends WithPool<P>> extends Serializable {

    public static abstract class BoundedPoolBase<P extends WithPool<P>> extends StatefulImplBase<P> {
        private static final long serialVersionUID = 1;
        public static final int DEFAULT_CAPACITY = 100;
        private final transient ArrayBlockingQueue<P> pool;
        private final transient int capacity;

        public BoundedPoolBase(int i) {
            super(i);
            this.capacity = i <= 0 ? 100 : i;
            this.pool = new ArrayBlockingQueue<>(this.capacity);
        }

        @Override
        public P acquirePooled() {
            P poll = this.pool.poll();
            if (poll == null) {
                poll = createPooled();
            }
            return poll;
        }

        @Override
        public void releasePooled(P p) {
            this.pool.offer(p);
        }

        @Override
        public boolean clear() {
            this.pool.clear();
            return true;
        }

        public int capacity() {
            return this.capacity;
        }
    }

    public static abstract class ConcurrentDequePoolBase<P extends WithPool<P>> extends StatefulImplBase<P> {
        private static final long serialVersionUID = 1;
        protected final transient Deque<P> pool;

        public ConcurrentDequePoolBase(int i) {
            super(i);
            this.pool = new ConcurrentLinkedDeque();
        }

        @Override
        public P acquirePooled() {
            P pollFirst = this.pool.pollFirst();
            if (pollFirst == null) {
                pollFirst = createPooled();
            }
            return pollFirst;
        }

        @Override
        public void releasePooled(P p) {
            this.pool.offerLast(p);
        }

        @Override
        public boolean clear() {
            this.pool.clear();
            return true;
        }
    }

    public static abstract class LockFreePoolBase<P extends WithPool<P>> extends StatefulImplBase<P> {
        private static final long serialVersionUID = 1;
        private final transient AtomicReference<Node<P>> head;

        protected static class Node<P> {
            final P value;
            Node<P> next;

            Node(P p) {
                this.value = p;
            }
        }

        public LockFreePoolBase(int i) {
            super(i);
            this.head = new AtomicReference<>();
        }

        @Override
        public P acquirePooled() {
            Node<P> node;
            for (int i = 0; i < 3 && (node = this.head.get()) != null; i++) {
                if (this.head.compareAndSet(node, node.next)) {
                    node.next = null;
                    return node.value;
                }
            }
            return createPooled();
        }

        @Override
        public void releasePooled(P p) {
            Node node = new Node(p);
            for (int i = 0; i < 3; i++) {
                node.next = this.head.get();
                if (this.head.compareAndSet(node.next, node)) {
                    return;
                }
            }
        }

        @Override
        public boolean clear() {
            this.head.set(null);
            return true;
        }
    }

    public static abstract class NonRecyclingPoolBase<P extends WithPool<P>> implements RecyclerPool<P> {
        private static final long serialVersionUID = 1;

        @Override
        public P acquireAndLinkPooled() {
            return acquirePooled();
        }

        @Override
        public abstract P acquirePooled();

        @Override
        public void releasePooled(P p) {
        }

        @Override
        public boolean clear() {
            return true;
        }
    }

    public static abstract class StatefulImplBase<P extends WithPool<P>> implements RecyclerPool<P> {
        private static final long serialVersionUID = 1;
        public static final int SERIALIZATION_SHARED = -1;
        public static final int SERIALIZATION_NON_SHARED = 1;
        protected final int _serialization;

        protected StatefulImplBase(int i) {
            this._serialization = i;
        }

        public Optional<StatefulImplBase<P>> _resolveToShared(StatefulImplBase<P> statefulImplBase) {
            return this._serialization == -1 ? Optional.of(statefulImplBase) : Optional.empty();
        }

        public abstract P createPooled();
    }

    public static abstract class ThreadLocalPoolBase<P extends WithPool<P>> implements RecyclerPool<P> {
        private static final long serialVersionUID = 1;

        @Override
        public P acquireAndLinkPooled() {
            return acquirePooled();
        }

        @Override
        public abstract P acquirePooled();

        @Override
        public void releasePooled(P p) {
        }

        @Override
        public boolean clear() {
            return false;
        }
    }

    public interface WithPool<P extends WithPool<P>> {
        P withPool(RecyclerPool<P> recyclerPool);

        void releaseToPool();
    }

    default P acquireAndLinkPooled() {
        return (P) acquirePooled().withPool(this);
    }

    P acquirePooled();

    void releasePooled(P p);

    default boolean clear() {
        return false;
    }
}
