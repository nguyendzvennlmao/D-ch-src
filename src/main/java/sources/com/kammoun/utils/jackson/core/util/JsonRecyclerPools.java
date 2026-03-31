package com.kammoun.utils.jackson.core.util;

import com.kammoun.utils.jackson.core.util.RecyclerPool;

public final class JsonRecyclerPools {

    public static class BoundedPool extends RecyclerPool.BoundedPoolBase<BufferRecycler> {
        private static final long serialVersionUID = 1;
        protected static final BoundedPool GLOBAL = new BoundedPool(-1);

        protected BoundedPool(int i) {
            super(i);
        }

        public static BoundedPool construct(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("capacity must be > 0, was: " + i);
            }
            return new BoundedPool(i);
        }

        @Override
        public BufferRecycler createPooled() {
            return new BufferRecycler();
        }

        protected Object readResolve() {
            return _resolveToShared(GLOBAL).orElseGet(() -> {
                return construct(this._serialization);
            });
        }
    }

    public static class ConcurrentDequePool extends RecyclerPool.ConcurrentDequePoolBase<BufferRecycler> {
        private static final long serialVersionUID = 1;
        protected static final ConcurrentDequePool GLOBAL = new ConcurrentDequePool(-1);

        protected ConcurrentDequePool(int i) {
            super(i);
        }

        public static ConcurrentDequePool construct() {
            return new ConcurrentDequePool(1);
        }

        @Override
        public BufferRecycler createPooled() {
            return new BufferRecycler();
        }

        protected Object readResolve() {
            return _resolveToShared(GLOBAL).orElseGet(() -> {
                return construct();
            });
        }
    }

    public static class LockFreePool extends RecyclerPool.LockFreePoolBase<BufferRecycler> {
        private static final long serialVersionUID = 1;
        protected static final LockFreePool GLOBAL = new LockFreePool(-1);

        protected LockFreePool(int i) {
            super(i);
        }

        public static LockFreePool construct() {
            return new LockFreePool(1);
        }

        @Override
        public BufferRecycler createPooled() {
            return new BufferRecycler();
        }

        protected Object readResolve() {
            return _resolveToShared(GLOBAL).orElseGet(() -> {
                return construct();
            });
        }
    }

    public static class NonRecyclingPool extends RecyclerPool.NonRecyclingPoolBase<BufferRecycler> {
        private static final long serialVersionUID = 1;
        protected static final NonRecyclingPool GLOBAL = new NonRecyclingPool();

        protected NonRecyclingPool() {
        }

        @Override
        public BufferRecycler acquirePooled() {
            return new BufferRecycler();
        }

        protected Object readResolve() {
            return GLOBAL;
        }
    }

    public static class ThreadLocalPool extends RecyclerPool.ThreadLocalPoolBase<BufferRecycler> {
        private static final long serialVersionUID = 1;
        protected static final ThreadLocalPool GLOBAL = new ThreadLocalPool();

        private ThreadLocalPool() {
        }

        @Override
        public BufferRecycler acquirePooled() {
            return BufferRecyclers.getBufferRecycler();
        }

        protected Object readResolve() {
            return GLOBAL;
        }
    }

    public static RecyclerPool<BufferRecycler> defaultPool() {
        return newLockFreePool();
    }

    public static RecyclerPool<BufferRecycler> threadLocalPool() {
        return ThreadLocalPool.GLOBAL;
    }

    public static RecyclerPool<BufferRecycler> nonRecyclingPool() {
        return NonRecyclingPool.GLOBAL;
    }

    public static RecyclerPool<BufferRecycler> sharedConcurrentDequePool() {
        return ConcurrentDequePool.GLOBAL;
    }

    public static RecyclerPool<BufferRecycler> newConcurrentDequePool() {
        return ConcurrentDequePool.construct();
    }

    public static RecyclerPool<BufferRecycler> sharedLockFreePool() {
        return LockFreePool.GLOBAL;
    }

    public static RecyclerPool<BufferRecycler> newLockFreePool() {
        return LockFreePool.construct();
    }

    public static RecyclerPool<BufferRecycler> sharedBoundedPool() {
        return BoundedPool.GLOBAL;
    }

    public static RecyclerPool<BufferRecycler> newBoundedPool(int i) {
        return BoundedPool.construct(i);
    }
}
