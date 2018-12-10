package com.flexible.pointcutbreakdown.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TestAspect {

@AfterReturning("@annotation(com.flexible.pointcutbreakdown.annotation.NeedTest)")
public void needTestFun(){
    System.out.println("needTestFun() executed!");
}
}
