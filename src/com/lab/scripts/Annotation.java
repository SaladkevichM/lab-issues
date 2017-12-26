package com.lab.scripts;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) //can use in method only.

public @interface Annotation {

    public boolean enabled() default true;
    
}
