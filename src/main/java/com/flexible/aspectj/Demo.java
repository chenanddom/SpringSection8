package com.flexible.aspectj;

import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-07
 * Time: 11:09
 */
public class Demo {
    public static void main(String[] args) {
        //创建被代理的对象
        Waiter waiter = new PoliteWaiter();
        //AspectJ代理工厂
        AspectJProxyFactory factory = new AspectJProxyFactory();
        //提娜佳目标类
        factory.setTarget(waiter);
        //添加切面类
        factory.addAspect(PreGreetingAspect.class);
        //生成切入的代理对象
        Waiter proxy = factory.getProxy();
        proxy.greetTo("张三");
    }
    @Test
    public void testMethod(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Waiter waiter = (Waiter) context.getBean("waiter");
        waiter.greetTo("zhangsan");

    }
}
