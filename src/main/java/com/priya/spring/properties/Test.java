package com.priya.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("propertiesConfig.xml");
        CountriesAndLanguages countriesAndLanguages= (CountriesAndLanguages) ctx.getBean("countriesAndLangs");
        System.out.println(countriesAndLanguages);
    }
}
