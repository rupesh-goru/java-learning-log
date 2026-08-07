package com.dynamicmethoddispatch;

public class Airtel implements Sim {
    int a = 98;
    int b = 69;
    @Override
    public void calling() {
        System.out.println("Airtel calling");
    }

    @Override
    public void ott() {
        System.out.println("Zee 5");
    }
//this method is not overridden so u cannot access it with parent class. only overridden methods are accessible
    public void data(){
        System.out.println("Airtel data");
    }
}
