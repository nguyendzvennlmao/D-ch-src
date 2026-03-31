package com.kammoun.utils.nbtapi.wrapper;

import com.kammoun.utils.nbtapi.iface.ReadWriteNBTCompoundList;
import com.kammoun.utils.nbtapi.wrapper.NBTProxy;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ProxiedList<E extends NBTProxy> implements ProxyList<E> {
    private final ReadWriteNBTCompoundList nbt;
    private final Class<E> proxy;

    private class Itr implements Iterator<E> {
        int cursor;
        int lastRet;

        private Itr() {
            this.cursor = 0;
            this.lastRet = -1;
        }

        @Override
        public boolean hasNext() {
            return this.cursor != ProxiedList.this.size();
        }

        @Override
        public E next() {
            try {
                int i = this.cursor;
                E e = (E) ProxiedList.this.get(i);
                this.lastRet = i;
                this.cursor = i + 1;
                return e;
            } catch (IndexOutOfBoundsException e2) {
                throw new NoSuchElementException();
            }
        }

        @Override
        public void remove() {
            if (this.lastRet < 0) {
                throw new IllegalStateException();
            }
            try {
                ProxiedList.this.remove(this.lastRet);
                if (this.lastRet < this.cursor) {
                    this.cursor--;
                }
                this.lastRet = -1;
            } catch (IndexOutOfBoundsException e) {
                throw new ConcurrentModificationException();
            }
        }
    }

    public ProxiedList(ReadWriteNBTCompoundList readWriteNBTCompoundList, Class<E> cls) {
        this.nbt = readWriteNBTCompoundList;
        this.proxy = cls;
    }

    @Override
    public E get(int i) {
        return (E) new ProxyBuilder(this.nbt.get(i), this.proxy).build();
    }

    @Override
    public int size() {
        return this.nbt.size();
    }

    @Override
    public void remove(int i) {
        this.nbt.remove(i);
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    @Override
    public E addCompound() {
        return (E) new ProxyBuilder(this.nbt.addCompound(), this.proxy).build();
    }

    @Override
    public boolean isEmpty() {
        return this.nbt.isEmpty();
    }
}
