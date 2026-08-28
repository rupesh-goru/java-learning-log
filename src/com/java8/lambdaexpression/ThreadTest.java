package com.java8.lambdaexpression;


public class ThreadTest {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        t1.start();

        Thread t2 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        t2.start();

        Calculator startingSum = (a,  b) -> {
            System.out.println("Starting sum");
            int sum = a + b;

            return sum;
        };
        int sum = startingSum.sum(69  , 2);
        System.out.println(sum);

    }
}
