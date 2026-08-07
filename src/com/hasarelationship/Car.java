package com.hasarelationship;

public class Car {

    String brand;
    String model;
    double price;

    /* Reference variable
       Car has an Engine object
       This represents the Has-A Relationship*/
    Engine engine; //Has-a relationship

    public Car() {
    }

    public Car(String brand, String model, double price, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.engine = engine;
    }

    //alt+fn+ins - select to string
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", engine=" + engine +
                '}';
    }
}

/*Interview Question

Q: Why is this called a Has-A Relationship?

Answer:
A Has-A Relationship exists when one class contains a reference to another class as one of its data members.
In this example, the Car class contains an Engine reference, meaning a car has an engine.*/
