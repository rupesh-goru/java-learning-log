package com.sortingtechniques;

public class Student{

    int id;
    String name;
    int marks;

    public Student() {
    }
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    /*@Override
    public int compareTo(Student student) {
    //return this.marks - student.marks; //sorts in ascending order.
      //  return student.marks - this.marks;//sorts in descending order.
       // return student.id-this.id; //sorts based on id in descending order.
       // return student.name.compareTo(this.name);//comparison of a string in descending order.
        return this.name.compareTo(student.name);//comparison of a string in ascending order.
    }*/
}
