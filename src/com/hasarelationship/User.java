package com.hasarelationship;

public class User {
    static void main(String[] args) {
        Car car = new Car();
        car.brand = "Renault";
        car.model = "Duster-2026";
        car.price = 1500000;

        Engine engine = new Engine();
        engine.capacity = 1200;
        engine.fuelType = "Diesel";

        car.engine = engine;
        System.out.println("Car Brand: " + car.brand);
        System.out.println("Car Model: " + car.model);
        System.out.println("Car Price: " + car.price);

        /*Accessing the capacity instance variable of the Engine object through the Car object using the dot operator.*/
        //Accessing the Engine object's capacity through the Car object
        System.out.println(car.engine.capacity);
        // Accessing the Engine object's fuel type through the Car object
        System.out.println(car.engine.fuelType);

        /*this gets the deafault values while trying to print the object or if you dont want put a toString and override.*/
        System.out.println(car);
        System.out.println(car.engine); //printing of object gives the default value that means it is a toString access.
        System.out.println("======================================");

        Engine engine2 = new Engine("Diesel", 1500);
        Car car2 = new Car("Toyato","Hycross", 4000000,engine2 );
        System.out.println(car2);

        /*Creating on the go(single line!)*/
        Car car3 = new Car("Maserati","Avante", 90000000,new Engine("Diesel", 8500) );
        System.out.println(car3);
    }
}
