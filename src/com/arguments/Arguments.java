package com.arguments;

public class Arguments {
    public static void main(String... args) {
        sum(69,1);
        sum(69,2, 96);
        sum(69,3, 65, 6);
        sum(786, 8965, 58744, 562,457, 120);
    }

   /*static void sum(int a, int b) {
        System.out.println(a + b);
    }

    static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    static void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c);
    }*/

//NOTE: Instead of writing so many arguments like this simply we can use varargs so that it can accommodate like this using varargs.

    /* VARARGS(Variable Arguments): We use varargs when we don't know in advance how many arguments a method will receive.
    (...) indicates variable arguments.
     * Varargs allows a method to accept any number of arguments of the same type.
     * Syntax: returnType methodName(dataType... variableName)*/

    static void sum(int... numbers) {

        int sum = 0;
        for(int number : numbers) {
           sum += number;
        }
        System.out.println(sum);
    }

}
