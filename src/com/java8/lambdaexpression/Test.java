package com.java8.lambdaexpression;

public class Test {
    public static void main(String[] args) {

        /*-> lambda expression.*/
        Vehicle lorry = () -> {
            System.out.println("10 wheels");
        };

        lorry.noOfWheels();
        lorry.start();
    }
}
