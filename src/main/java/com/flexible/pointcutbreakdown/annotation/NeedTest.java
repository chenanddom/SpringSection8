package com.flexible.pointcutbreakdown.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-07
 * Time: 8:33
 */
@Retention(RetentionPolicy.RUNTIME)//声明注解的保留期限
@Target(ElementType.METHOD)//声明可以使用该注解的目标类型
public @interface NeedTest {//定义注解类

    /**
     * 需要注意的几点
     * 1.成员无入参
     * 2.可以使用default设置默认值
     * 3.成员类型受限(只能是合法的基本数据类型，以及包装类，String,Class,enums,注解类型，以及String,Class,enums,注解类型的数组类型)
     * 4.
     *
     * @return
     */
    boolean value() default true;//声明注解成员
}


