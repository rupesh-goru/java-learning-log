package com.java8.defaultandstaticmethodsininterfaces;

public interface Car {

    void start();

    default void airBags(){
        System.out.println("2 Air bags");
    }
    static void headLights(){
        System.out.println("Head lights mandatory in BS6 vehicles started from 2020.");
    }
/*
    //Java8 feature.
    default void stop() {
        System.out.println("stop");
    }
*//*static method overriding is not possible.*//*
    static void changeGear() {
        System.out.println("changed Gear");
    }*/
}
