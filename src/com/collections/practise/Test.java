package com.collections.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

   public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(13);
        list.add(89);
        list.add(40);
        list.add(77);
        list.add(99);
        list.add(99);// duplicates allowed.

       System.out.println(list);

       /*Collections.sort() is used to sort the elements of a List in ascending order (by default).*/
       Collections.sort(list);
       System.out.println(list);

       /*Collections.reverse(); reverses the order of elements in the List. It does not sort the elements.*/
       Collections.reverse(list);
       System.out.println(list);

       /*To sort elements in descending order directly.*/
       Collections.sort(list,Collections.reverseOrder());
       System.out.println(list);

       /*Collections.shuffle(list) is used to randomly rearrange the elements of a List.*/
       Collections.shuffle(list);
       System.out.println(list);

       /*Collections.max(list) returns the maximum (largest) element from a collection according to its natural ordering.*/
       Integer max = Collections.max(list);
       System.out.println(max);

       /*Collections.min(list) returns the minimum (smallest) element from a collection according to its natural ordering.*/
       Integer min = Collections.min(list);
       System.out.println(min);

      /*Collections.frequency(collection, element) returns the number of times a particular element occurs in a collection.*/
       int frequency = Collections.frequency(list, 99);
       System.out.println(frequency);

       Collections.sort(list);
       System.out.println(list);

       /*Collections.swap(list, index1, index2) is used to exchange the positions of two.*/
       Collections.swap(list, 0, 1);
       System.out.println(list);

       /*Collections.rotate(list, distance) rotates the elements of a List by the specified number of positions.*/
       Collections.rotate(list, 5);
       System.out.println(list);

       Collections.sort(list);
       System.out.println(list);

       /*Collections.replaceAll(list, oldValue, newValue) replaces every occurrence of one element with another element in a List.*/
       Collections.replaceAll(list, 99, 999);
       System.out.println(list);

       /*2nd way of passing elements into a list.*/
       /*You can pass elements in a list inside also like this...
       * You cannot do this List<Integer> list1 = List.of(10, 20, 30, 40);

list1.add(50);       // ❌ UnsupportedOperationException
list1.remove(10);    // ❌ UnsupportedOperationException
list1.set(0, 100);   // ❌ UnsupportedOperationException*/
       /*⚠️ Very important: List.of() creates an immutable List. You cannot modify it.*/
       List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
       System.out.println(list1);

       /*3rd way of passing elements into a list.*/
       /*Important difference from List.of().Arrays.asList() creates a fixed-size List.*/
       /*list.add(50);       // ❌ UnsupportedOperationException
list.remove(20);    // ❌ UnsupportedOperationException

But you can replace/update an existing element:
list.set(0, 100); */
       List<Integer> list2 = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);
       System.out.println(list2);
   }
}
