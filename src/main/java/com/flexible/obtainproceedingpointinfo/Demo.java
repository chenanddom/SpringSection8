package com.flexible.obtainproceedingpointinfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Waiter waiter = (Waiter) context.getBean("waiter_4");
        waiter.greetTo("zhangsan");
    }
}
