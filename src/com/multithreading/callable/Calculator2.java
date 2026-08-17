package com.multithreading.callable;

import java.util.concurrent.Callable;

public class Calculator2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int a = 69;
        int b = 66;
        int c = a + b;
        return c;
    }
}
