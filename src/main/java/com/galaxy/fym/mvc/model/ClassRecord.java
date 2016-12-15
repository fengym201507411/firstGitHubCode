package com.galaxy.fym.mvc.model;

/**
 * Created by fengyiming on 2016/8/15.
 */
public @interface ClassRecord {

    String author() default "";

    String[] record() default {};
}
