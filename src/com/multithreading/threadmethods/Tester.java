package com.multithreading.threadmethods;

public class Tester {
    static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread1 thread1 = new Thread1(counter);
        Thread2 thread2 = new Thread2(counter);

        thread1.start();
        thread2.start();

        thread1.join(); //holding of thread
        thread2.join(); //holding of thread
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted" + e.getMessage());
        }*/
        System.out.println("Count value: " + counter.count);
    }
}
