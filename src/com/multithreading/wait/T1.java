package com.multithreading.wait;

public class T1 extends Thread{
    Object obj;
    public T1(Object obj){
        this.obj=obj;
    }
    @Override
    public void run(){

        synchronized (obj){
            System.out.println("Thread 1 is running");
            System.out.println("T1 entering into wait state...");
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //the below statement gets resumed only after 5secs that is given in T2
            System.out.println("T1 resumed successfully");
        }
    }
}
