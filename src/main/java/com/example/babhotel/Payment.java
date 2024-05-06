package com.example.babhotel;

import java.util.Date;

public class Payment {
    private String payment_id;
    private Date paymentDate;
    private double amount;
    private String method;

    public Payment(String payment_id, Date paymentDate, double amount, String method) {
        this.payment_id = payment_id;
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.method = method;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
