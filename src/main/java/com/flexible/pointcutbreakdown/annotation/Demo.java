package com.flexible.pointcutbreakdown.annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Waiter waiter = (Waiter) context.getBean("waiter_3");
        waiter.greetTo("zhangsan");

    }
}
