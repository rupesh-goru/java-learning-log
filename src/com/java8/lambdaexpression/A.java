package com.java8.lambdaexpression;

public interface A {

    default void m1(){
        System.out.println("From interface A");

    }

    static void m2(){
        System.out.println("Static method from interface A");
    }

}
