package com.priya.spring.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("mapConfig.xml");
        Customer customer = (Customer) ctx.getBean("customer");
//        System.out.println(customer.getId());
//        System.out.println(customer.getProducts());
        System.out.println(customer);
    }
}
