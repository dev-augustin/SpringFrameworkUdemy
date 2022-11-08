package com.priya.spring.innerbeans;

public class Employee {

    private  int employeeId;
    private Address address;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Employee Id=" + employeeId +
                ", address=" + address +
                '}';
    }
}
