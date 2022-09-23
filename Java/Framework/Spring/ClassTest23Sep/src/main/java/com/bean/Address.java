package com.bean;

public class Address {
    int aid;
    int faltno;
    int pincode;
    String city;
    public Address(){

    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getFaltno() {
        return faltno;
    }

    public void setFaltno(int faltno) {
        this.faltno = faltno;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(int aid, int faltno, int pincode, String city) {
        this.aid = aid;
        this.faltno = faltno;
        this.pincode = pincode;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", faltno=" + faltno +
                ", pincode=" + pincode +
                ", city='" + city + '\'' +
                '}';
    }
}
