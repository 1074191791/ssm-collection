package com.zhou.annotation;

import com.zhou.emum.DataSourceKey;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhous
 * @create 2019-07-06 17:50
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSourceSelector {
    DataSourceKey dataSource() default DataSourceKey.DB1;
}