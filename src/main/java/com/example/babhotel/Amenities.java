package com.example.babhotel;

public class Amenities {
    private String amenity_id;
    private String name;
    private String description;
    private double price;
    private boolean availability;

    public Amenities(String amenity_id, String name, String description, double price, boolean availability) {
        this.amenity_id = amenity_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.availability = availability;
    }

    public String getAmenity_id() {
        return amenity_id;
    }

    public void setAmenity_id(String amenity_id) {
        this.amenity_id = amenity_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
