package com.objectclass;

public class Student {
    int id;
    String name;

    /*To see Object --> ctrl+N search Object or hit shift button twice.*/

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String getName(){
        return this.name;
    }
    @Override
    public boolean equals(Object obj) {
        Student student = (Student)obj; // Explicit type casting
        boolean output =  (this.id == student.id) &&
                (this.name.equals(student.name));
        return output;
    }
    //alt+fn+ins - select to string
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
