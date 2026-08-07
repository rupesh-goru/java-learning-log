package com.wrapperclasses;

public class Test {
    static void main(String[] args) {
        int a = 21;
        System.out.println(a);
/*METHOD 1*/
        Integer b = new Integer(69);//this is deprecated no longer in use
        System.out.println(b);
        /*METHOD 2*/
        Integer c = Integer.valueOf(15);
        System.out.println(c);

        /*Auto boxing*/
        Integer d = Integer.valueOf(a);
        System.out.println("(Auto-boxing)The value of a can can be updated like this: " + d);

        /*Auto Un-boxing*/
        Integer e = Integer.valueOf(18);
        int f = e.intValue();
        System.out.println("(Auto Un-boxing)The value of a can can be updated like this: " + f);

        /*No need to put above all instead, this is the wise method to assign values.*/
        /*METHOD 3*/
        Integer g = 8888;
        System.out.println(g);

        Integer h = a; //Auto boxing(Wrapper class -> normal value)
        System.out.println(h);

        int i = g;//Auto Un-boxing(Normal value -> Wrapper class)
        System.out.println(i);

    }
}
