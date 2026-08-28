package com.java8.defaultandstaticmethodsininterfaces;

public class Benz implements Car{
    @Override
    public void start() {
        System.out.println("Benz started");
    }

    public void airBags(){
        System.out.println("6 air bags");
    }
/*    //@Override
   public void stop() {
        System.out.println("Benz stopped");
    }*/
}
