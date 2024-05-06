package com.example.babhotel;

public class Inventoey {
    private String item_id;
    private String name;
    private int quantity;
    private double price_per_unit;
    private String description;


    public Inventoey(String item_id, String name, int quantity, double price_per_unit, String description) {
        this.item_id = item_id;
        this.name = name;
        this.quantity = quantity;
        this.price_per_unit = price_per_unit;
        this.description = description;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice_per_unit() {
        return price_per_unit;
    }

    public void setPrice_per_unit(double price_per_unit) {
        this.price_per_unit = price_per_unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
