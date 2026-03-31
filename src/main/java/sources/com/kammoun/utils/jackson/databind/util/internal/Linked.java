package com.kammoun.utils.jackson.databind.util.internal;

import com.kammoun.utils.jackson.databind.util.internal.Linked;

interface Linked<T extends Linked<T>> {
    T getPrevious();

    void setPrevious(T t);

    T getNext();

    void setNext(T t);
}
