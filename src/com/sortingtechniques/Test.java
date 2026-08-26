package com.sortingtechniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Sahithi", 21));
        studentList.add(new Student(2, "Mahesh Babu", 69));
        studentList.add(new Student(3, "Pawan Kalyan", 24));
        System.out.println(studentList);

        Collections.sort(studentList, new IdComparator());

        System.out.println(studentList);

        Collections.sort(studentList, new MarksComparator());
        System.out.println(studentList);

    }
}
