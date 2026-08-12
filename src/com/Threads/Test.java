package com.Threads;

public class Test {
   public static void main(String[] args) {
       // System.out.println("The name of the current Thread in Test.java is: " + Thread.currentThread().getName());
        MyThreads myThreads = new MyThreads();
        myThreads.start();
        /*System.out.println("Bye!");
       System.out.println("Bye! 2");*/
       for(int i=0;i<=20;i++){
           System.out.println("Bye = "+i);
       }
    }
}
