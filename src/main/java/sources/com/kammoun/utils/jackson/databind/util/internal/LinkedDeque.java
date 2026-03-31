package com.kammoun.utils.jackson.databind.util.internal;

import com.kammoun.utils.jackson.databind.util.internal.Linked;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class LinkedDeque<E extends Linked<E>> extends AbstractCollection<E> implements Deque<E> {
    E first;
    E last;

    abstract class AbstractLinkedIterator implements Iterator<E> {
        E cursor;

        AbstractLinkedIterator(E e) {
            this.cursor = e;
        }

        @Override
        public boolean hasNext() {
            return this.cursor != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E e = this.cursor;
            this.cursor = (E) computeNext();
            return e;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        abstract E computeNext();
    }

    void linkFirst(E e) {
        E e2 = this.first;
        this.first = e;
        if (e2 == null) {
            this.last = e;
        } else {
            e2.setPrevious(e);
            e.setNext(e2);
        }
    }

    void linkLast(E e) {
        E e2 = this.last;
        this.last = e;
        if (e2 == null) {
            this.first = e;
        } else {
            e2.setNext(e);
            e.setPrevious(e2);
        }
    }

    E unlinkFirst() {
        E e = this.first;
        E e2 = (E) e.getNext();
        e.setNext(null);
        this.first = e2;
        if (e2 == null) {
            this.last = null;
        } else {
            e2.setPrevious(null);
        }
        return e;
    }

    E unlinkLast() {
        E e = this.last;
        E e2 = (E) e.getPrevious();
        e.setPrevious(null);
        this.last = e2;
        if (e2 == null) {
            this.first = null;
        } else {
            e2.setNext(null);
        }
        return e;
    }

    void unlink(E e) {
        E e2 = (E) e.getPrevious();
        E e3 = (E) e.getNext();
        if (e2 == null) {
            this.first = e3;
        } else {
            e2.setNext(e3);
            e.setPrevious(null);
        }
        if (e3 == null) {
            this.last = e2;
        } else {
            e3.setPrevious(e2);
            e.setNext(null);
        }
    }

    @Override
    public boolean isEmpty() {
        return this.first == null;
    }

    void checkNotEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public int size() {
        int i = 0;
        Linked linked = this.first;
        while (true) {
            Linked linked2 = linked;
            if (linked2 == null) {
                return i;
            }
            i++;
            linked = linked2.getNext();
        }
    }

    @Override
    public void clear() {
        E e = this.first;
        while (true) {
            E e2 = e;
            if (e2 == null) {
                this.last = null;
                this.first = null;
                return;
            } else {
                ?? next = e2.getNext();
                e2.setPrevious(null);
                e2.setNext(null);
                e = next;
            }
        }
    }

    @Override
    public boolean contains(Object obj) {
        return (obj instanceof Linked) && contains((Linked<?>) obj);
    }

    public boolean contains(Linked<?> linked) {
        return (linked.getPrevious() == null && linked.getNext() == null && linked != this.first) ? false : true;
    }

    public void moveToFront(E e) {
        if (e != this.first) {
            unlink(e);
            linkFirst(e);
        }
    }

    public void moveToBack(E e) {
        if (e != this.last) {
            unlink(e);
            linkLast(e);
        }
    }

    @Override
    public E peek() {
        return peekFirst();
    }

    @Override
    public E peekFirst() {
        return this.first;
    }

    @Override
    public E peekLast() {
        return this.last;
    }

    @Override
    public E getFirst() {
        checkNotEmpty();
        return peekFirst();
    }

    @Override
    public E getLast() {
        checkNotEmpty();
        return peekLast();
    }

    @Override
    public E element() {
        return getFirst();
    }

    @Override
    public boolean offer(E e) {
        return offerLast((LinkedDeque<E>) e);
    }

    @Override
    public boolean offerFirst(E e) {
        if (contains((Linked<?>) e)) {
            return false;
        }
        linkFirst(e);
        return true;
    }

    @Override
    public boolean offerLast(E e) {
        if (contains((Linked<?>) e)) {
            return false;
        }
        linkLast(e);
        return true;
    }

    @Override
    public boolean add(E e) {
        return offerLast((LinkedDeque<E>) e);
    }

    @Override
    public void addFirst(E e) {
        if (!offerFirst((LinkedDeque<E>) e)) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void addLast(E e) {
        if (!offerLast((LinkedDeque<E>) e)) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public E poll() {
        return pollFirst();
    }

    @Override
    public E pollFirst() {
        if (isEmpty()) {
            return null;
        }
        return unlinkFirst();
    }

    @Override
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return unlinkLast();
    }

    @Override
    public E remove() {
        return removeFirst();
    }

    @Override
    public boolean remove(Object obj) {
        return (obj instanceof Linked) && remove((LinkedDeque<E>) obj);
    }

    public boolean remove(E e) {
        if (!contains((Linked<?>) e)) {
            return false;
        }
        unlink(e);
        return true;
    }

    @Override
    public E removeFirst() {
        checkNotEmpty();
        return pollFirst();
    }

    @Override
    public boolean removeFirstOccurrence(Object obj) {
        return remove(obj);
    }

    @Override
    public E removeLast() {
        checkNotEmpty();
        return pollLast();
    }

    @Override
    public boolean removeLastOccurrence(Object obj) {
        return remove(obj);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override
    public void push(E e) {
        addFirst((LinkedDeque<E>) e);
    }

    @Override
    public E pop() {
        return removeFirst();
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedDeque<E>.AbstractLinkedIterator(this.first) {
            @Override
            E computeNext() {
                return (E) this.cursor.getNext();
            }
        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new LinkedDeque<E>.AbstractLinkedIterator(this.last) {
            @Override
            E computeNext() {
                return (E) this.cursor.getPrevious();
            }
        };
    }
}
