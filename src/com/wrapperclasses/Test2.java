package com.wrapperclasses;

public class Test2 {
    Integer b;
    static Integer z;
    static int x;
    int k;

    public static void main(String[] args) {
        String s = "6969";
        System.out.println(s + 1);

        /*To convert a string into integer.--> Integer.parseInt()*/
        int number = Integer.parseInt(s);
        System.out.println(number + 1);

        /*Not possible case because string which has "FLM" WHICH is alphabets cannot convert to int.
        * if "100" it can change*/
       /* String s2 = "FLM";
       int num2  =  Integer.parseInt(s2);
        System.out.println(num2);*/

        /*To convert an integer into a String.-->String.valueOf()*/
        int a = 150;
        String num3  = String.valueOf(a);
        System.out.println(a + 1);
        System.out.println(num3 + 2);

        Test2 t = new Test2();
        System.out.println(t.b);//This gives output as "null" because b is an Integer wrapper class, so in this regd. the default value of any class in java is null
        System.out.println(t.k);//This give 0 as output because the default val of int is 0 and int is a primitive dataType

        Character c1 = 'A';
        Character c2 = 'B';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 + c2);
//Different methods in character.
        System.out.println(Character.isLetter(c1));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isDigit('r'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('k'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase('R'));
        System.out.println(Character.isLowerCase('5'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('s'));
        System.out.println(Character.isUpperCase('4'));
        System.out.println(Character.toLowerCase('Y'));
        System.out.println(Character.toUpperCase('g'));
        System.out.println(Character.toLowerCase('r'));
        System.out.println(Character.toUpperCase('S'));
        //static varibales should be declared with ClassName
        // gives null because static variables also have default values and every class default valu is null in java even if it is a wrapper class as well
        System.out.println(Test2.z); //Test2 is a ClassName
        System.out.println(Test2.x);//Test2 is a ClassName

    }
}
