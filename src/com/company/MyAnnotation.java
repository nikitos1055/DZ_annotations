package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD , ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})

public @interface MyAnnotation {
    String name() default "BMW";
}
