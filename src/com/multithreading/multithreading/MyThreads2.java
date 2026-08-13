package com.multithreading.multithreading;

public class MyThreads2 implements Runnable{
    @Override
    public void run() {
        System.out.println("New Thread 2 - Runnable Interface");
        System.out.println("Task running in thread: " + Thread.currentThread().getName());
    }
}
