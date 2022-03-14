package com.hamitmizrak.qualifier3;

import javax.inject.Qualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Target({TYPE,METHOD,PARAMETER,FIELD})
@Retention(RUNTIME)
@Documented
public @interface QualifierMultiple2 {

    //enum
    EFazlaSecenekler value();
}
