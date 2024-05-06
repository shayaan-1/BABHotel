package com.example.babhotel;

public class Room {
    private int roomNo;
    private String roomType;
    private int floor;
    private boolean availability;
    private float pricePerNight;
    private int capacity;

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public float getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(float pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Room() {

    }

    public Room(int roomNo, String roomType, int floor, boolean availability, float pricePerNight, int capacity) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.floor = floor;
        this.availability = availability;
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
    }
}
