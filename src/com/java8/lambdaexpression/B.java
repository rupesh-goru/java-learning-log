package com.java8.lambdaexpression;

public interface B {

    default void m1(){
        System.out.println("From interface B");
    }

    static void m2(){
        System.out.println("Static method from interface B");
    }

}
