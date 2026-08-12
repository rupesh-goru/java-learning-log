package com.Threads;

public class MyThreads extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("Pawan Kalyan Thread");
        System.out.println("The name of the current Thread in MyThreads.java is: " + Thread.currentThread().getName());
       // System.out.println("MyThreads is running");
        for(int i=0;i<=20;i++){
            System.out.println("Hi "+i);
        }
    }

}
