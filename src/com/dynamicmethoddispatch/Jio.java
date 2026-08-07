package com.dynamicmethoddispatch;

public class Jio implements Sim {
    int c = 20;
    @Override
    public void calling() {
        System.out.println("Jio unlimited calling");
    }

    @Override
    public void ott() {
        System.out.println("Jio Hotstar");
    }
}
