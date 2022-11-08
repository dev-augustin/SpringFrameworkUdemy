package com.priya.spring.innerbeans;

public class Address {

    private int hNo;
    private String city;
    private String street;

    public int gethNo() {
        return hNo;
    }

    public void sethNo(int hNo) {
        this.hNo = hNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "hNo=" + hNo +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
