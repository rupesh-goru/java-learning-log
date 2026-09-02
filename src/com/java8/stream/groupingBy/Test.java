package com.java8.stream.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    static void main(String[] args) {


        Employee employee1 = new Employee(1, "Rupesh", 65000.36, new Department(1, "IT"));
        Employee employee2 = new Employee(2, "Rahul", 70000, new Department(2, "HR"));
        Employee employee3 = new Employee(3, "Virat", 85000, new Department(3, "Finance"));
        Employee employee4 = new Employee(4, "Rohit", 78000, new Department(1, "IT"));
        Employee employee5 = new Employee(5, "Hardik", 55000, new Department(4, "Sales"));
        Employee employee6 = new Employee(6, "Jasprit", 92000, new Department(4, "Sales"));
        Employee employee7 = new Employee(7, "Shreyas", 70000, new Department(2, "HR"));

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);

        /*Interview Q. Return all employees grouped by their depts.*/

        Map<String, List<Employee>> collect = employees
                .stream()
                .collect(Collectors.groupingBy(emp -> emp.getDepartment().getDepartment_name()));
        collect
                .entrySet()
                .forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));


         /*Interview Q. find the count of employees in each dpt.*/

        Map<String, Long> collect1 = employees
                .stream()
                .collect(Collectors.groupingBy(emp -> emp.getDepartment().getDepartment_name(), Collectors.counting()));
        System.out.println(collect1);

        /*Interview Q. Cal the AVERAGE salary of each dpt.*/

        Map<String, Double> averagingSalary = employees
                .stream()
                .collect(Collectors.groupingBy(emp -> emp.getDepartment().getDepartment_name(), Collectors.averagingDouble(emp -> emp.getSalary())));
        System.out.println(averagingSalary);

         /*Interview Q. To get the highest count of the employees in the dpt and print the name of the dpt which has highest employees.*/



    }
}
