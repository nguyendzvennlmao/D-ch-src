package com.kammoun.utils.nbtapi.iface;

import com.kammoun.utils.nbtapi.NBTType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public interface ReadableNBTList<T> extends Iterable<T> {
    T get(int i);

    int size();

    NBTType getType();

    boolean isEmpty();

    boolean contains(Object obj);

    int indexOf(Object obj);

    boolean containsAll(Collection<?> collection);

    int lastIndexOf(Object obj);

    Object[] toArray();

    <E> E[] toArray(E[] eArr);

    List<T> subList(int i, int i2);

    default List<T> toListCopy() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterator();
        Objects.requireNonNull(arrayList);
        it.forEachRemaining(arrayList::add);
        return arrayList;
    }
}
