package com.multithreading.threadmethods;

public class Counter {
    int count =  0;
    public synchronized void increment() {
        System.out.println("Incrementing.....");
        /*synchronized(this) {
            this.count++;
        }*/
        this.count++;
    }
}
