package com.multithreading.executorservices;

public class T1 extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " T1 is running");
           // System.out.println(T1.currentThread().getName());
        }
    }
}
