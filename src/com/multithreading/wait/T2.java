package com.multithreading.wait;

public class T2 extends Thread{
    Object obj;
    public T2(Object obj){
        this.obj=obj;
    }
    @Override
    public void run(){
        synchronized (obj){
            System.out.println("Thread 2 is running");
            //System.out.println("T2 Notifying T1");
            System.out.println("T2 notifying all threads");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("T2 is interrupted");
            }
            //obj.notify();
            obj.notifyAll();
        }
    }

}
