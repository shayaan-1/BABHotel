package com.example.babhotel;

import java.util.Date;

public class Customer {
    private int customerId;
    private String fname;
    private String lname;
    private String email;
    private String address;
    private String phone;
    private String nationality;
    private Date DOB;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Customer() {
    }

    public Customer(int customerId, String fname, String lname, String email, String address, String phone, String nationality, Date DOB) {
        this.customerId = customerId;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.nationality = nationality;
        this.DOB = DOB;
    }
}
