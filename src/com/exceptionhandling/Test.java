package com.exceptionhandling;
/*Interview Question.*/
public class Test {
    static void main(String[] args) {
        int res = divide();
        System.out.println(res);
    }
    static int divide(){
        try{
            int a = 1;
            int b = 0;
            int res = a / b;
            return res;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Divided by 0 leads to infinity");
            return -1;
        }
        finally {
            return 5;
        }
    }
}
