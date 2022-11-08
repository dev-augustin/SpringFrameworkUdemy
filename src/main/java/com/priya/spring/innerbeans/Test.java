package com.priya.spring.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("innerbeanConfig.xml");
        Employee employee = (Employee) ctx.getBean("employee");

    }
}
