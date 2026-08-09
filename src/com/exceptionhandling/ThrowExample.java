
package com.exceptionhandling;

public class ThrowExample {

    public static void main(String[] args) {

        int age = 6;

        try {
            if (age < 18) {
                throw new ArithmeticException("Age is below 18");
            }

            System.out.println("Eligible");

        } catch (ArithmeticException e) {
            System.out.println("Not Eligible");
        }
    }
}

