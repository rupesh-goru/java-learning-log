package com.stringbuilderandstringbuffer;

public class Test {
    static void main(String[] args) {
        StringBuilder sb =  new StringBuilder();
        sb.append("I love you");
        sb.append(" Sahithi"); //here same string will get updated.
        System.out.println(sb);
        System.out.println(sb.length());
        sb.insert(18, " forever!");
        System.out.println(sb);
        System.out.println(sb.length());

        sb.replace(0,6, "I die for");
        System.out.println(sb);
        System.out.println(sb.length());

        sb.delete(0,6);
        System.out.println(sb);
        System.out.println(sb.length());

        sb.deleteCharAt(23);
        System.out.println(sb); // will delete 23rd character i.e., "!"

        //reversing a string.
        sb.reverse();
        System.out.println(sb);

        /*Instead of appending the vaules you cna simply pass values inside the constructor as well.*/
        StringBuffer stringBuffer = new StringBuffer("Staff Selection Commission");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        /*Capacity.*/
        /*  NON-PARAMtized case*/
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pawan Kalyan kon");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());

        System.out.println("=======================================================================");
        /*Paramzied case*/
        StringBuilder stringBuilder2 = new StringBuilder("Munna");
        System.out.println(stringBuilder2.length());
        System.out.println(stringBuilder2.capacity());/*Default value = 16 + length of the string passed as string inside constructor.*/
    }
}
