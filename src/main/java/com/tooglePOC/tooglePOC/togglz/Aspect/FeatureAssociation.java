package com.tooglePOC.tooglePOC.togglz.Aspect;


import com.tooglePOC.tooglePOC.togglz.MyFeatures;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE })
public @interface FeatureAssociation {
    MyFeatures value();
}
