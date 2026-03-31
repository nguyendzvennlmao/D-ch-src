package com.kammoun.utils.jackson.databind.annotation;

import com.kammoun.utils.jackson.annotation.JacksonAnnotation;
import com.kammoun.utils.jackson.databind.jsontype.TypeResolverBuilder;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotation
public @interface JsonTypeResolver {
    Class<? extends TypeResolverBuilder<?>> value();
}
