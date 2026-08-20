package com.collections;

import java.util.ArrayList;

public class Lists {
  public static void main(String[] args) {

      Student student = new Student(69, "Sahithi", 24);

      /*Here we can print hetrogeneous values. Like as follows*/
      ArrayList li = new  ArrayList();
      li.add("a");
      li.add(69);
      li.add("Goru Rupesh Surya Pavan Kumar");
      li.add(69.369852);
      li.add(true);
      li.add(student); // we can add object as well.
      li.add(10); //can add duplicates as well
      //insertion order also maintained.
      /*That means in which order you give it maintains that order only.*/
      /*can insert value like this but this result in a biggest problem.*/
      li.add(1,8523244); //can give index and specify its value. in real time this is a huge problem
      /*in real time we do not work with hetrogeneous data because its a risky short since every index gets shifted, it will lead to error. entire code will be screwed.*/
      /*in real time we use GENERICS <>*/

      /****Although ArrayList can store heterogeneous data when declared with Object, we generally use homogeneous data because generics provide type safety, eliminate unnecessary type casting, reduce runtime errors, and make the code easier to understand and maintain.****/
      System.out.println(li);
      /*hence list are hetrogeneous in nature*/

      /*To get a particular value using the index. we need to give .get(index value)*/
      System.out.println(li.get(3));
      System.out.println(li.get(6)); //object will also get printed here.

      Student stu  = (Student) li.get(6); //TYPE CASTING
      System.out.println(stu.getName());
      System.out.println(stu.getAge());
      System.out.println(stu.getStudentID());

      /*Class cast exception----run time exception.*/
      /*because in 6th index it is integer type, you type cast to object type and that's lead to class cast exception.*/
      /*Student stu2 = (Student) li.get(6);
      System.out.println(stu2);*/

      System.out.println("============================================================================================================================");

      /*Only homogeneous data is allowed here.*/
      ArrayList<Integer> li2 = new ArrayList<>();
      li2.add(78);
      li2.add(2369); //duplicates allowed
     // li2.add(963.2588); gives error.
      System.out.println(li2);


    }
}
