package com.java8.defaultandstaticmethodsininterfaces;

import com.java8.lambdaexpression.A;
import com.java8.lambdaexpression.B;
import com.java8.lambdaexpression.C;

public class Test {
    static void main(String[] args) {
        Benz benz = new Benz();
        Tata tata = new Tata();

        benz.airBags();
        tata.airBags();
        Car.headLights();


        /*benz.start();
        benz.stop();

        *//*static method so we can call with ClassName no need of creating obj*//*
        Car.changeGear();*/


        C c = new C();
        c.m1();

        A.m2();
        B.m2();


    }
}
