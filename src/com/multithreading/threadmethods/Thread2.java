package com.multithreading.threadmethods;

public class Thread2 extends Thread {
    Counter counter;
    public Thread2(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            //System.out.println(i + " <-T2 iteration");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            counter.increment();
        }
    }
}
