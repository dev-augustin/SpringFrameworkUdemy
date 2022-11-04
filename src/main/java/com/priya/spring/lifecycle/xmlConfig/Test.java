package com.priya.spring.lifecycle.xmlConfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("lifeCycleConfig.xml");
        Patient patient = (Patient) ctx.getBean("lifeCycle");
        System.out.println(patient.getId());
        System.out.println(patient);
        ctx.registerShutdownHook();
    }


}
