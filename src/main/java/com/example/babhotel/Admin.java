package com.example.babhotel;

import java.util.Date;

public class Admin extends Staff {
    private String admin_ID;
    private String username;
    private String password;
    private String email;

    public Admin() {

    }

    public Admin(String staff_ID, String fName, String lName, String role, String address, String contact, Integer salary, Date DOB, String admin_ID, String username, String password, String email) {
        super(staff_ID, fName, lName, role, address, contact, salary, DOB);
        this.admin_ID = admin_ID;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getAdmin_ID() {
        return admin_ID;
    }

    public void setAdmin_ID(String admin_ID) {
        this.admin_ID = admin_ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
