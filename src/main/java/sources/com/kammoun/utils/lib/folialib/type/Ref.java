package com.kammoun.utils.lib.folialib.type;

public class Ref<T> {
    private T value;

    public Ref() {
        this.value = null;
    }

    public Ref(T t) {
        this.value = t;
    }

    public T get() {
        return this.value;
    }

    public void set(T t) {
        this.value = t;
    }
}
