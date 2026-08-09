package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {

    static String name;
    static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Enter number 1: ");
            int num1 = sc.nextInt();
            System.out.println("Enter number 2: ");
            int num2 = sc.nextInt();

            System.out.println(num1 / num2);
            System.out.println("Hiiiiii from if the try block works or else will not come");
        } catch (InputMismatchException e) {
            // System.out.println(e.getMessage()); // this prints msg.
            // System.out.println("Invalid input / do not divide by zero or try to divide by other number");
            System.out.println("Invalid input / only integers are allowed");
        } catch (ArithmeticException e) {
            System.out.println("Don't divide with zero");
        }
        /*Can put how many(infinite) like this by putting | */ catch (StringIndexOutOfBoundsException |
                                                                      ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Something went wrong / Chnage the input");
        } finally {
            System.out.println("Entered finally block");
            sc.close();

        }
        System.out.println("Bye....instantly comes if try works and if try also not works out directly here");
        //System.out.println(name.length());// this gives null pointer exception which is nightmare for devs.
        /*any operation on null will lead to null pointer exception, the above is the example.*/

        /*Possible but no use.*/
        try{

        }
        finally {

        }
    }
}
