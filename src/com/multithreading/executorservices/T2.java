package com.multithreading.executorservices;

public class T2 extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " T2 is running");
           // System.out.println(T2.currentThread().getName());
        }
    }
}
