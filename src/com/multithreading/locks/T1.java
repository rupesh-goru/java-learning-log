package com.multithreading.locks;

public class T1 extends Thread {
    T2  t2;
    @Override
    public void run() {
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thread1 is running");
    }
}
