package com.flexible.namedpointcut;

import org.aspectj.lang.annotation.Pointcut;

public class NamedPointcut {
    //通过注解方法inpackage()对该切点进行命名，方法可视域修饰符为private
    //表明该命名切点只能在本切面类中使用
    @Pointcut("within(com.flexible.*)")
    private void inpackage(){}

    //通过注解方法greetTo()对该切点进行命名，方法可以视域修饰符为protected
    //表明该命名切点可以在当前包中的切面类，自切脉你类只要。
    @Pointcut("execution(* greetTo(..))")
    protected void greetTo(){}

    //引用命名切点定义的切点，本切点也是命名切点，它对应的可视域为public
    @Pointcut("inpackage() && greetTo()")
    public void inPkgGreetTo(){}

}
