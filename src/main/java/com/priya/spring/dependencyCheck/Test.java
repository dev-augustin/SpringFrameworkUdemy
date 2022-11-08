package com.priya.spring.dependencyCheck;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("dependencyCheckConfig.xml");
        Prescription prescription = (Prescription) ctx.getBean("prescription");
        System.out.println(prescription);

    }
}