package com.kammoun.utils.jackson.databind.util;

import java.lang.annotation.Annotation;

public interface Annotations {
    <A extends Annotation> A get(Class<A> cls);

    boolean has(Class<?> cls);

    boolean hasOneOf(Class<? extends Annotation>[] clsArr);

    int size();
}
