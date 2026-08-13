package com.multithreading.locks;

public class T2 extends Thread {
    T1 t1;

    @Override
    public void run() {
       /* try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }*/
        System.out.println("Thread2 is running");
    }
}
