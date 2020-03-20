package com.rabbit.aop.aop.config;

import java.lang.annotation.*;

/**
 * aop注解
 *
 * @Author 廖凡
 * @Date 2020/3/20 15:50
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LocalAopAnnotation {
    String desc() default "空";
}
