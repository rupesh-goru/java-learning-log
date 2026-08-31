package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

//removing of duplicates is very imp. Interview question.
        List<Integer> numbers = Arrays.asList(10,10,15,5,15,20,786,17);

        List<Integer> list = numbers
                .stream()
                .distinct() //intermediate operation.
                .toList();
        System.out.println(list);

        //Find the largest number in a list is the most asked interview question.

        Integer maxNumber = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .get();
        System.out.println(maxNumber);

        //Find the second - largest number in a list is the most asked interview question.

        Integer secondLargest = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondLargest);

        Integer thirdLargest = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .distinct() //to remove duplicates.
                .skip(2)
                .findFirst()
                .get();
        System.out.println(thirdLargest);

        //Find first largest nums into a list.

        List<Integer> limitedData = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(3)
                .toList();
        System.out.println(limitedData);


        //sortings();
        //filters();
    }

    private static void sortings() {
        List<Integer> numbers = Arrays.asList(11, 69, 89,56,854,698, 22, 33, 44, 55, 66, 77, 88, 99, 100);

        /*Sorting in ascending order.*/
        List<Integer> collect = numbers
                .stream()
                .sorted() //intermediate operation
                .collect(Collectors.toList()); //terminal operation.

        System.out.println(collect);

        /*Sorting in descending order.*/
        List<Integer> descendingOrder = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(descendingOrder);

        List<Employee> empList = new ArrayList();
        empList.add(new Employee(1,"Panjaa",69520));
        empList.add(new Employee(2,"Thammudu",45625));
        empList.add(new Employee(3,"Badri",87456));
        empList.add(new Employee(4,"Jalsa",78965));
        empList.add(new Employee(5,"Gabbar Singh",25632));
        empList.add(new Employee(6,"Teenmaar",12365));
        empList.add(new Employee(7,"OG",23655));

        List<Employee> list3 = empList
                .stream()
             //   .sorted((emp1, emp2 ) -> (int) (emp1.salary - emp2.salary)) // this comes in ascending order.
                .sorted((emp1, emp2 ) -> (int) (emp2.salary - emp1.salary))
                .toList();

        System.out.println(list3);
    }

    private static void filters() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /*Creation of a stream.*/
        Stream<Integer> stream = numbers.stream();
        stream.forEach(num -> System.out.println(num));

        /*Streams once used cannot be resued again so we need to create stream again to reuse it.*/
        /*Stream<Integer> stream1 = numbers.stream();
        stream1.forEach(num -> System.out.println(num));*/

        System.out.println("============================================");

        //Print odd numbers from a list.
        numbers
                .stream()
                .filter(num -> num % 2 != 0) //intermediate operation
                .forEach(num -> System.out.println(num)); //terminal operation has to be the last operation.

        List<Integer> evenNumbers = numbers
                .stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers = " + evenNumbers);

        List<Integer> list = numbers
                .stream()
                .filter(num -> num > 6)
                .toList();
        System.out.println("List = " + list);
    }
}
