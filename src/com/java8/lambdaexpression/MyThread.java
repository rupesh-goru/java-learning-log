package com.java8.lambdaexpression;

public class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("My Thread started...");
    }
}
