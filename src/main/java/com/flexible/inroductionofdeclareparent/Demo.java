package com.flexible.inroductionofdeclareparent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Waiter waiter = (Waiter) context.getBean("waiter_2");
        waiter.greetTo("zhangsan");
        Seller seller = (Seller) waiter;
        seller.sell("apple");
    }
}
