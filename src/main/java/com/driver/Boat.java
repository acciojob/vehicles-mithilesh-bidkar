package com.driver;

public class Boat implements WaterVehicle{
   private String name;
    private int capacity;

    public Boat() {
    }

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getVehicleName() {
        return name;
    }

    public int getVehicleCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
