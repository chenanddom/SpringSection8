package com.flexible.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-07
 * Time: 10:55
 */
@Aspect
public class PreGreetingAspect {
    /**
     * 这段代码包含了横切的逻辑
     * @Before 增强的类型
     * "execution(* greetTo(..))"目标切点的表达式
     */
    @Before("execution(* greetTo(..))")
    public void beforeGreeting(){
        System.out.println("How are you");
    }
}
