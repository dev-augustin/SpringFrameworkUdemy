package com.priya.spring.employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args){
    ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
    Employee emp = (Employee) ctx.getBean("emp");
    System.out.println("Employee ID: "+emp.getId());
    System.out.println("Employee Name: "+emp.getName());
//    Resource resource = new ClassPathResource("config.xml");
//    try {
//        System.out.println(resource.getFile().getAbsolutePath());
//    } catch (IOException e) {
//        throw new RuntimeException(e);
//    }
}
}
// Reference: To add filepath for config.xml
//https://stackoverflow.com/questions/42863382/java-io-filenotfoundexception-class-path-resource-cannot-be-opened-because-it-d