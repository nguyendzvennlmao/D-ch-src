package com.kammoun.utils.nbtapi.wrapper;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NBTTarget {

    public enum Type {
        AUTOMATIC,
        GET,
        SET,
        HAS
    }

    String value();

    Type type() default Type.AUTOMATIC;
}
