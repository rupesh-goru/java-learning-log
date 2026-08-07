package com.dynamicmethoddispatch;

public class Test {
    static void main(String[] args) {
        Sim sim = new Airtel();
        sim.calling();

        Sim sim2 = new Jio();
        sim2.calling();
        sim.ott();
        sim2.ott();

        Sim sim3 = new Jio();
        sim3.calling();
        //variables come from parent class only.
        System.out.println(sim.a);
        //System.out.println(sim.b); cannot access child class features & variables.
        sim.calling();
        //sim.data(); cannot access because this method is coming from child class

        /*If you want to access child class's methods or variables then you need to Airtel airtel = new Airtel(); */
    }
}
