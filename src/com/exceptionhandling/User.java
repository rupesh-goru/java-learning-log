package com.exceptionhandling;

import java.util.Scanner;

public class User {

    static String name;
    static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number 1: ");
            int num1 = sc.nextInt();
            System.out.println("Enter number 2: ");
            int num2 = sc.nextInt();

            System.out.println(num1 / num2);
            System.out.println("Hiiiiii from if the try block works or else will not come");
        }
        catch (Exception e) {
            System.out.println(e.getMessage()); // this prints msg.
            System.out.println("Invalid input / do not divide by zero or try to divide by other number");
        }
        System.out.println("Bye....instantly comes if try works and if try also not works out directly here");
        //System.out.println(name.length());// this gives null pointer exception which is nightmare for devs.
        /*any operation on null will lead to null pointer exception, the above is the example.*/
    }
}
