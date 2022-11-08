package com.priya.spring.refTypes;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("refTypesConfig.xml");
        Student student= (Student) ctx.getBean("student");
        System.out.println(student.getScores().getChemistry());
        System.out.println(student);
    }
}

