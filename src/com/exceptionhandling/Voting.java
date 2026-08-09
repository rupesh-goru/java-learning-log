package com.exceptionhandling;

import java.util.Scanner;

public class Voting {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
try {
    if (age >= 18) {
        System.out.println("You are eligible to vote");
    } else {
        throw new InvalidAgeException("Age below 18 not allowed to exercise you UAF ");
    }
} catch (InvalidAgeException e) {
    System.out.println(e.getMessage());
}
        input.close();
    }
}
