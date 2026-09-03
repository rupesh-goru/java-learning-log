package com.java8.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MethodReferences {

    static void main(String[] args) {


        List<Employee> emplist = new ArrayList<>();

        emplist.add(new Employee(1, "Sahithi", new Department("Java")));
        emplist.add(new Employee(2, "Ravi", new Department("Django")));
        emplist.add(new Employee(3, "Priya", new Department("React.js")));
        emplist.add(new Employee(4, "Kiran", new Department("Python")));
        emplist.add(new Employee(5, "Anjali", new Department("Java")));
        emplist.add(new Employee(6, "Arjun", new Department("DevOps")));
        emplist.add(new Employee(7, "Sneha", new Department("Database")));
        emplist.add(new Employee(8, "Vikram", new Department("Java")));
        emplist.add(new Employee(9, "Meghana", new Department("Django")));
        emplist.add(new Employee(10, "Rohan", new Department("React.js")));
        emplist.add(new Employee(11, "Deepika", new Department("Python")));
        emplist.add(new Employee(12, "Varun", new Department("Java")));
        emplist.add(new Employee(13, "Swathi", new Department("DevOps")));
        emplist.add(new Employee(14, "Nikhil", new Department("Database")));

        //get employees only from java dpt.

        emplist
                .stream()
                .filter(emp -> emp.getDepartment().getDepartmentName().equals("Java"))
                .forEach(System.out::println);

        //get count employees from all depts.

        Map<String, Long> collect = emplist
                .stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.getDepartment().getDepartmentName(), //we cannot do multiple chained operations using method references.
                        Collectors.counting()));
        System.out.println(collect);

        List<String> studentNames = Arrays.asList("Rupesh", "Surya", "Pavan", "Kumar", "Sahithi", "Trisha");
        /*I want to form employee objects.*/

        List<Student> list = studentNames
                .stream()
                .map(Student::new) //object::new - but this works only if there is only one parameter in the student class. if in case multiple parms are there it won't work.
                .toList();
        System.out.println(list);


        //methodReferences();
    }

    private static void methodReferences() {
        List<String> rivers = Arrays.asList(
                "Ganga",
                "Yamuna",
                "Godavari",
                "Krishna",
                "Narmada",
                "Tapi",
                "Mahanadi",
                "Kaveri",
                "Brahmaputra",
                "Indus",
                "Sutlej",
                "Beas",
                "Ravi",
                "Chenab",
                "Jhelum",
                "Ghaghara",
                "Gandak",
                "Kosi",
                "Son",
                "Chambal"
        );

        /*Convert all names to upper case in the list.*/

        rivers
                .stream()
               // .map(str -> str.toUpperCase())
                .map(String::toUpperCase)
               // .forEach(str -> System.out.println(str));
                .forEach(System.out::println);


        /*Interview Q. Print back sting with only alphabets*/
        String trainName = "@12805L-L-T-  EXPRESS^&*()";

        String collect = trainName
                .chars()
                .filter(Character::isAlphabetic)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(collect);

        List<Integer> numbers = Arrays.asList(10,11,13,17,18,19,20,24);
        numbers
                .stream()
                .filter(MethodReferences::isPrime)
                .forEach(System.out::println);
    }

    public  static  boolean isPrime(int num){

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
