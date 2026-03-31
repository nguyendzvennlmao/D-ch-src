package com.kammoun.utils.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.List;

public final class ObjectBuffer {
    private static final int SMALL_CHUNK = 16384;
    private static final int MAX_CHUNK = 262144;
    private LinkedNode<Object[]> _head;
    private LinkedNode<Object[]> _tail;
    private int _size;
    private Object[] _freeBuffer;

    public Object[] resetAndStart() {
        _reset();
        if (this._freeBuffer != null) {
            return this._freeBuffer;
        }
        Object[] objArr = new Object[12];
        this._freeBuffer = objArr;
        return objArr;
    }

    public Object[] resetAndStart(Object[] objArr, int i) {
        _reset();
        if (this._freeBuffer == null || this._freeBuffer.length < i) {
            this._freeBuffer = new Object[Math.max(12, i)];
        }
        System.arraycopy(objArr, 0, this._freeBuffer, 0, i);
        return this._freeBuffer;
    }

    public Object[] appendCompletedChunk(Object[] objArr) {
        LinkedNode<Object[]> linkedNode = new LinkedNode<>(objArr, null);
        if (this._head == null) {
            this._tail = linkedNode;
            this._head = linkedNode;
        } else {
            this._tail.linkNext(linkedNode);
            this._tail = linkedNode;
        }
        int length = objArr.length;
        this._size += length;
        if (length < SMALL_CHUNK) {
            length += length;
        } else if (length < MAX_CHUNK) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public Object[] completeAndClearBuffer(Object[] objArr, int i) {
        int i2 = i + this._size;
        Object[] objArr2 = new Object[i2];
        _copyTo(objArr2, i2, objArr, i);
        _reset();
        return objArr2;
    }

    public <T> T[] completeAndClearBuffer(Object[] objArr, int i, Class<T> cls) {
        int i2 = i + this._size;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i2));
        _copyTo(tArr, i2, objArr, i);
        _reset();
        return tArr;
    }

    public void completeAndClearBuffer(Object[] objArr, int i, List<Object> list) {
        LinkedNode<Object[]> linkedNode = this._head;
        while (true) {
            LinkedNode<Object[]> linkedNode2 = linkedNode;
            if (linkedNode2 == null) {
                break;
            }
            for (Object obj : linkedNode2.value()) {
                list.add(obj);
            }
            linkedNode = linkedNode2.next();
        }
        for (int i2 = 0; i2 < i; i2++) {
            list.add(objArr[i2]);
        }
        _reset();
    }

    public int initialCapacity() {
        if (this._freeBuffer == null) {
            return 0;
        }
        return this._freeBuffer.length;
    }

    public int bufferedSize() {
        return this._size;
    }

    protected void _reset() {
        if (this._tail != null) {
            this._freeBuffer = this._tail.value();
        }
        this._tail = null;
        this._head = null;
        this._size = 0;
    }

    protected final void _copyTo(Object obj, int i, Object[] objArr, int i2) {
        int i3 = 0;
        LinkedNode<Object[]> linkedNode = this._head;
        while (true) {
            LinkedNode<Object[]> linkedNode2 = linkedNode;
            if (linkedNode2 == null) {
                break;
            }
            Object[] value = linkedNode2.value();
            int length = value.length;
            System.arraycopy(value, 0, obj, i3, length);
            i3 += length;
            linkedNode = linkedNode2.next();
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 != i) {
            throw new IllegalStateException("Should have gotten " + i + " entries, got " + i4);
        }
    }
}
