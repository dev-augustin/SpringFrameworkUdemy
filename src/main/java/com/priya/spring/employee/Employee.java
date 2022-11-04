package com.priya.spring.employee;

public class Employee {

    private String name;
    private int id;

    public Employee(){

    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setId(int id){
        this.id=id;
    }
}
