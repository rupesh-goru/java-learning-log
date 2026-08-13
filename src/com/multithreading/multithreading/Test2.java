package com.multithreading.multithreading;

public class Test2 {
    static void main(String[] args) {
        //This THREAD is by extending the Thread class.
        /*MyThreads t1 = new MyThreads();
        t1.start();*/
//This THREAD is by implementing Runnable interface.
        Runnable t2 = new MyThreads2();
      /*****/  Thread thread = new Thread(t2);/*****/
        thread.start();

    }
}
