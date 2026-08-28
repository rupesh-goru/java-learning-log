package com.java8.anonymous;

public class Test {
    public static void main(String[] args) {

        Bike bike = new Bike();
        bike.noOfWheels();

        //Anonymous Inner Class
Vehicle car = new Vehicle() {
    @Override
    public void noOfWheels() {
        System.out.println("4 Wheels");
    }

   /* @Override
    public void start() {
        System.out.println("Car started");
    }*/
    /*public  void stop() {
        System.out.println("Car stopped");
    }*/ //no use of writing this, but we cannot access them.
};
car.noOfWheels();
bike.stop();




    }
}
