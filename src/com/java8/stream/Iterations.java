package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterations {

    static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        System.out.println("==================================");

        for(Integer i : numbers){
            System.out.println(i);
        }

        System.out.println("==================================");

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("==================================");

        //Java8 - forEach method to iterate

        numbers.forEach(num -> System.out.println(num) );



    }
}
