package com.kammoun.utils.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotation
public @interface JsonSubTypes {

    public @interface Type {
        Class<?> value();

        String name() default "";

        String[] names() default {};
    }

    Type[] value();

    boolean failOnRepeatedNames() default false;
}
