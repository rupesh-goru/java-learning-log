package com.java8.defaultandstaticmethodsininterfaces;

public class Test {
    static void main(String[] args) {
        Benz benz = new Benz();
        Tata tata = new Tata();

        benz.airBags();
        tata.airBags();

        Car.headLights();


        /*benz.start();
        benz.stop();

        *//*static method so we can call with ClassName no need of creating obj*//*
        Car.changeGear();*/
    }
}
