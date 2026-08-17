package com.multithreading.callable;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*Calculator calculator = new Calculator();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(calculator);
        executorService.shutdown();*/

        Callable<Integer> calculator2 = new Calculator2();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(calculator2);

        Future<Integer> future = executorService.submit(calculator2);
        System.out.println(future.isDone());
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        /*Can get that value and can do any operations on it.*/

        Integer num = future.get(); //throws exception
        System.out.println(future.isDone());
        System.out.println(num);
        System.out.println(num / 2);
        System.out.println(num % 2);
        System.out.println(num * 69);

        executorService.shutdown();
    }
}
