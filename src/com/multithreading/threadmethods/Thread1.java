package com.multithreading.threadmethods;

public class Thread1 extends Thread {

    Counter counter;

    public Thread1(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            //System.out.println(i + " <-T1 iteration");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter.increment();
        }
    }

}
