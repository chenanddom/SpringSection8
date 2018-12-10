package com.flexible.obtainproceedingpointinfo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TestAspect {

    @Around("execution(* com.flexible.obtainproceedingpointinfo..*(..))")
    public void joinPointAccess(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("------joinPointAccess----");
        System.out.println("args[0]:" + proceedingJoinPoint.getArgs()[0]);
        System.out.println("signature:" + proceedingJoinPoint.getTarget().getClass());
        proceedingJoinPoint.proceed();
        System.out.println("------joinPointAccess----");
    }
}
