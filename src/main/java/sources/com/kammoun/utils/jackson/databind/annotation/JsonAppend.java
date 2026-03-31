package com.kammoun.utils.jackson.databind.annotation;

import com.kammoun.utils.jackson.annotation.JacksonAnnotation;
import com.kammoun.utils.jackson.annotation.JsonInclude;
import com.kammoun.utils.jackson.databind.ser.VirtualBeanPropertyWriter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotation
public @interface JsonAppend {

    public @interface Attr {
        String value();

        String propName() default "";

        String propNamespace() default "";

        JsonInclude.Include include() default JsonInclude.Include.NON_NULL;

        boolean required() default false;
    }

    public @interface Prop {
        Class<? extends VirtualBeanPropertyWriter> value();

        String name() default "";

        String namespace() default "";

        JsonInclude.Include include() default JsonInclude.Include.NON_NULL;

        boolean required() default false;

        Class<?> type() default Object.class;
    }

    Attr[] attrs() default {};

    Prop[] props() default {};

    boolean prepend() default false;
}
