package com.priya.spring.lifeCycleAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
@PostConstruct
 public void init(){
     System.out.println("Inside init method");
 }

 @PreDestroy
 public void destroy(){
     System.out.println("Inside destroy method");
 }
}
