package com.hasarelationship;

public class Engine {
    String fuelType;
    int capacity;

    public Engine() {
    }

    //alt+fn+ins - select to string
    @Override
    public String toString() {
        return "Engine{" +
                "fuelType='" + fuelType + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public Engine(String fuelType, int capacity) {
        this.fuelType = fuelType;
        this.capacity = capacity;


    }
}
