package com.java.javacore.annotations;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Authors.class)
public @interface Author {
    String name();
}
