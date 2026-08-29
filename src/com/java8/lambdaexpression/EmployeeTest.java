package com.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {
    static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(7, "Sahithi", 94000));
        empList.add(new Employee(8, "Rukmini", 70000));
        empList.add(new Employee(9, "Kaira", 80000));
        empList.add(new Employee(10, "Fayaz", 50005));

        //Collections.sort(empList, new EmployeeComparator());
        Collections.sort(empList, (emp1, emp2) -> (int) (emp1.salary - emp2.salary));// sorting of salary in ascending order
        System.out.println(empList);

        Collections.sort(empList,(emp1, emp2) -> emp2.empId - emp1.empId ); // sorting of id in descending order.
        System.out.println(empList);


    }
}
