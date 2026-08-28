package com.java8.lambdaexpression;

@FunctionalInterface
public interface Vehicle {

    void noOfWheels();

    default void start(){
        System.out.println("Starting Vehicle");
    }
}
