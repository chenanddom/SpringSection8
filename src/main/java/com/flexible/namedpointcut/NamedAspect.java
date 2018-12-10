package com.flexible.namedpointcut;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;

@Aspect
public class NamedAspect {
    @Before("NamedPointcut.inPkgGreetTo()")
    public void pkgGreetTo(){
        System.out.println("----------pkgGreetTo() executed!---");
    }
    @Before("!target(com.flexible.pointcutbreakdown.annotation.PoliteWaiter) && NamedPointcut.inPkgGreetTo()")
    public void pkgGreetToNotNaivewaiter(){
        System.out.println("----------pkgGreetToNotNaivewaiter() executed!---");
//        Ordered
//        JoinPoint
//        ProceedingJoinPoint
    }
}
