package com.example.babhotel;

import java.util.Date;

public class Staff {
    private String staff_ID;
    private String fName;
    private String lName;
    private String role;
    private String address;
    private String contact;
    private Integer salary;
    private Date DOB;


    public Staff() {
    }

    public Staff(String staff_ID, String fName, String lName, String role, String address, String contact, Integer salary, Date DOB) {
        this.staff_ID = staff_ID;
        this.fName = fName;
        this.lName = lName;
        this.role = role;
        this.address = address;
        this.contact = contact;
        this.salary = salary;
        this.DOB = DOB;
    }

    public String getStaff_ID() {
        return staff_ID;
    }

    public void setStaff_ID(String staff_ID) {
        this.staff_ID = staff_ID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }
}
