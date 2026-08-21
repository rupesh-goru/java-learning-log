package com.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterations {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        /*Printing an array with Normal for-loop*/
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("============================");

        /*Printing an array with Normal for-each loop.*/
        for(Integer num : list){
            System.out.println(num);
        }

        System.out.println("======================================");

        /*Iterator-> safest way to iterate all collections in java*/

        /*“Iterator is an interface in the java.util package that is used to traverse elements of a Collection one by one. It provides methods like hasNext(), next(), and remove(). We can obtain an Iterator from a Collection using the iterator() method. One important advantage is that we can safely remove elements from a collection while iterating using iterator.remove().”*/

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            int num = iterator.next();
            if(num == 3){
                iterator.remove();
            }
            System.out.println(num);
        }
        System.out.println(list);

        System.out.println("===========================");
        list.add(2,3);
        ListIterator<Integer> iterator1 = list.listIterator();

        System.out.println(list);

        System.out.println(iterator1.hasNext());
        System.out.println(iterator1.next());
        System.out.println(iterator1.hasNext());
        System.out.println(iterator1.next());
        System.out.println(iterator1.hasNext());
        System.out.println(iterator1.next());
        System.out.println(iterator1.hasPrevious());
        System.out.println(iterator1.previous());
        System.out.println(iterator1.hasPrevious());
        System.out.println(iterator1.previous());
        System.out.println(iterator1.hasPrevious());
        System.out.println(iterator1.previous());
        System.out.println(iterator1.hasPrevious());

        System.out.println(list);
        list.add(5);
        list.add(null);
        list.add(null);
        System.out.println(list);


    }
}
