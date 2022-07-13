package com.ivorymanager.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.TYPE.FIELD.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String ttt() default  "aa";

}
