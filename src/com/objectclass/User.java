package com.objectclass;

public class User {
    static void main(String[] args) {

        Student student1 =  new Student(1, "Sahithi");
        Student student2 =  new Student(2, "Samantha");
        Student student3 =  new Student(2, "Samantha");

        boolean result = student1.equals(student2);
        System.out.println(result);

        boolean result1 = student2.equals(student3);
        System.out.println(result1);

        int stHashCode = student1.hashCode();
        System.out.println(stHashCode);
        int stHashCode2 = student2.hashCode();
        System.out.println(stHashCode2);
        int stHashCode3 = student3.hashCode();
        System.out.println(stHashCode3);

        /*Both hash codes will be same. If you pass two values same then the hash code will be same for both.*/
        String str1 = "Pawan Kalyan";
        String str2 = "Pawan Kalyan";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(student1);
        System.out.println(student2);
    }
}
