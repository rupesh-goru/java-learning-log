package com.java8.anonymous;

public class Bike implements Vehicle {

    @Override
    public void noOfWheels() {
        System.out.println("Bike no of wheels: 2");
    }

    public void stop() {
        System.out.println("Bike stopped");
    }
}
