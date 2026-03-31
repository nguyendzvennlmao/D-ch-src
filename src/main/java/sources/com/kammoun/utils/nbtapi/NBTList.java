package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.iface.ReadWriteNBTList;
import com.kammoun.utils.nbtapi.utils.MinecraftVersion;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public abstract class NBTList<T> implements List<T>, ReadWriteNBTList<T> {
    private String listName;
    private NBTCompound parent;
    private NBTType type;
    protected Object listObject;

    public NBTList(NBTCompound nBTCompound, String str, NBTType nBTType, Object obj) {
        this.parent = nBTCompound;
        this.listName = str;
        this.type = nBTType;
        this.listObject = obj;
    }

    public String getName() {
        return this.listName;
    }

    public NBTCompound getParent() {
        return this.parent;
    }

    private void validateClosed() {
        if (this.parent.isClosed()) {
            throw new NbtApiException("Tried using closed NBT data!");
        }
    }

    private void validateWritable() {
        if (getParent().isReadOnly()) {
            throw new NbtApiException("Tried setting data in read only mode!");
        }
    }

    public void save() {
        validateClosed();
        this.parent.set(this.listName, this.listObject);
    }

    protected abstract Object asTag(T t);

    @Override
    public boolean add(T t) {
        validateClosed();
        validateWritable();
        try {
            try {
                this.parent.getWriteLock().lock();
                if (MinecraftVersion.getVersion().getVersionId() >= MinecraftVersion.MC1_14_R1.getVersionId()) {
                    ReflectionMethod.LIST_ADD.run(this.listObject, Integer.valueOf(size()), asTag(t));
                } else {
                    ReflectionMethod.LEGACY_LIST_ADD.run(this.listObject, asTag(t));
                }
                save();
                this.parent.getWriteLock().unlock();
                return true;
            } catch (Exception e) {
                throw new NbtApiException(e);
            }
        } catch (Throwable th) {
            this.parent.getWriteLock().unlock();
            throw th;
        }
    }

    @Override
    public void add(int i, T t) {
        validateClosed();
        validateWritable();
        try {
            try {
                this.parent.getWriteLock().lock();
                if (MinecraftVersion.getVersion().getVersionId() >= MinecraftVersion.MC1_14_R1.getVersionId()) {
                    ReflectionMethod.LIST_ADD.run(this.listObject, Integer.valueOf(i), asTag(t));
                } else {
                    ReflectionMethod.LEGACY_LIST_ADD.run(this.listObject, asTag(t));
                }
                save();
                this.parent.getWriteLock().unlock();
            } catch (Exception e) {
                throw new NbtApiException(e);
            }
        } catch (Throwable th) {
            this.parent.getWriteLock().unlock();
            throw th;
        }
    }

    @Override
    public T set(int i, T t) {
        validateClosed();
        validateWritable();
        try {
            try {
                this.parent.getWriteLock().lock();
                T t2 = get(i);
                ReflectionMethod.LIST_SET.run(this.listObject, Integer.valueOf(i), asTag(t));
                save();
                this.parent.getWriteLock().unlock();
                return t2;
            } catch (Exception e) {
                throw new NbtApiException(e);
            }
        } catch (Throwable th) {
            this.parent.getWriteLock().unlock();
            throw th;
        }
    }

    @Override
    public T remove(int i) {
        validateClosed();
        validateWritable();
        try {
            try {
                this.parent.getWriteLock().lock();
                T t = get(i);
                ReflectionMethod.LIST_REMOVE_KEY.run(this.listObject, Integer.valueOf(i));
                save();
                this.parent.getWriteLock().unlock();
                return t;
            } catch (Exception e) {
                throw new NbtApiException(e);
            }
        } catch (Throwable th) {
            this.parent.getWriteLock().unlock();
            throw th;
        }
    }

    @Override
    public int size() {
        validateClosed();
        try {
            try {
                this.parent.getReadLock().lock();
                int intValue = ((Integer) ReflectionMethod.LIST_SIZE.run(this.listObject, new Object[0])).intValue();
                this.parent.getReadLock().unlock();
                return intValue;
            } catch (Exception e) {
                throw new NbtApiException(e);
            }
        } catch (Throwable th) {
            this.parent.getReadLock().unlock();
            throw th;
        }
    }

    @Override
    public NBTType getType() {
        return this.type;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            remove(0);
        }
    }

    @Override
    public boolean contains(Object obj) {
        validateClosed();
        try {
            this.parent.getReadLock().lock();
            for (int i = 0; i < size(); i++) {
                if (obj.equals(get(i))) {
                    return true;
                }
            }
            this.parent.getReadLock().unlock();
            return false;
        } finally {
            this.parent.getReadLock().unlock();
        }
    }

    @Override
    public int indexOf(Object obj) {
        validateClosed();
        try {
            this.parent.getReadLock().lock();
            for (int i = 0; i < size(); i++) {
                if (obj.equals(get(i))) {
                    return i;
                }
            }
            this.parent.getReadLock().unlock();
            return -1;
        } finally {
            this.parent.getReadLock().unlock();
        }
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        validateClosed();
        try {
            this.parent.getWriteLock().lock();
            int size = size();
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return size != size();
        } finally {
            this.parent.getWriteLock().unlock();
        }
    }

    @Override
    public boolean addAll(int i, Collection<? extends T> collection) {
        validateClosed();
        try {
            this.parent.getWriteLock().lock();
            int size = size();
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                int i2 = i;
                i++;
                add(i2, it.next());
            }
            return size != size();
        } finally {
            this.parent.getWriteLock().unlock();
        }
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        validateClosed();
        try {
            this.parent.getReadLock().lock();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            this.parent.getReadLock().unlock();
            return true;
        } finally {
            this.parent.getReadLock().unlock();
        }
    }

    @Override
    public int lastIndexOf(Object obj) {
        validateClosed();
        try {
            this.parent.getReadLock().lock();
            int i = -1;
            for (int i2 = 0; i2 < size(); i2++) {
                if (obj.equals(get(i2))) {
                    i = i2;
                }
            }
            return i;
        } finally {
            this.parent.getReadLock().unlock();
        }
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        validateClosed();
        try {
            this.parent.getWriteLock().lock();
            int size = size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return size != size();
        } finally {
            this.parent.getWriteLock().unlock();
        }
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        validateClosed();
        try {
            this.parent.getWriteLock().lock();
            int size = size();
            for (Object obj : collection) {
                int i = 0;
                while (i < size()) {
                    if (!obj.equals(get(i))) {
                        int i2 = i;
                        i--;
                        remove(i2);
                    }
                    i++;
                }
            }
            return size != size();
        } finally {
            this.parent.getWriteLock().unlock();
        }
    }

    @Override
    public boolean remove(Object obj) {
        validateClosed();
        try {
            this.parent.getWriteLock().lock();
            int size = size();
            int indexOf = indexOf(obj);
            if (indexOf != -1) {
                remove(indexOf);
            }
            return size != size();
        } finally {
            this.parent.getWriteLock().unlock();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = -1;

            @Override
            public boolean hasNext() {
                return NBTList.this.size() > this.index + 1;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                NBTList nBTList = NBTList.this;
                int i = this.index + 1;
                this.index = i;
                return nBTList.get(i);
            }

            @Override
            public void remove() {
                NBTList.this.remove(this.index);
                this.index--;
            }
        };
    }

    @Override
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override
    public ListIterator<T> listIterator(final int i) {
        return new ListIterator<T>() {
            int index;

            {
                this.index = i - 1;
            }

            @Override
            public void add(T t) {
                this.add(this.index, t);
            }

            @Override
            public boolean hasNext() {
                return NBTList.this.size() > this.index + 1;
            }

            @Override
            public boolean hasPrevious() {
                return this.index >= 0 && this.index <= NBTList.this.size();
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                NBTList nBTList = NBTList.this;
                int i2 = this.index + 1;
                this.index = i2;
                return nBTList.get(i2);
            }

            @Override
            public int nextIndex() {
                return this.index + 1;
            }

            @Override
            public T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException("Id: " + (this.index - 1));
                }
                NBTList nBTList = NBTList.this;
                int i2 = this.index;
                this.index = i2 - 1;
                return nBTList.get(i2);
            }

            @Override
            public int previousIndex() {
                return this.index - 1;
            }

            @Override
            public void remove() {
                this.remove(this.index);
                this.index--;
            }

            @Override
            public void set(T t) {
                this.set(this.index, t);
            }
        };
    }

    @Override
    public Object[] toArray() {
        validateClosed();
        try {
            this.parent.getReadLock().lock();
            Object[] objArr = new Object[size()];
            for (int i = 0; i < size(); i++) {
                objArr[i] = get(i);
            }
            return objArr;
        } finally {
            this.parent.getReadLock().unlock();
        }
    }

    @Override
    public <E> E[] toArray(E[] eArr) {
        validateClosed();
        try {
            this.parent.getReadLock().lock();
            E[] eArr2 = (E[]) Arrays.copyOf(eArr, size());
            Arrays.fill(eArr2, (Object) null);
            Class<?> componentType = eArr.getClass().getComponentType();
            for (int i = 0; i < size(); i++) {
                if (!componentType.isInstance(get(i))) {
                    throw new ArrayStoreException("The array does not match the objects stored in the List.");
                }
                eArr2[i] = get(i);
            }
            return eArr2;
        } finally {
            this.parent.getReadLock().unlock();
        }
    }

    @Override
    public List<T> subList(int i, int i2) {
        validateClosed();
        try {
            this.parent.getReadLock().lock();
            ArrayList arrayList = new ArrayList();
            for (int i3 = i; i3 < i2; i3++) {
                arrayList.add(get(i3));
            }
            return arrayList;
        } finally {
            this.parent.getReadLock().unlock();
        }
    }

    @Override
    public boolean removeIf(Predicate<? super T> predicate) {
        return super.removeIf(predicate);
    }

    public String toString() {
        validateClosed();
        try {
            this.parent.getReadLock().lock();
            return this.listObject.toString();
        } finally {
            this.parent.getReadLock().unlock();
        }
    }
}
