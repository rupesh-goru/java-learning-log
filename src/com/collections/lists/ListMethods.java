package com.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    static void main(String[] args) {
        /*Dynamic method dispatch.(DMD)*/
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(69);
        list.add(58);
        list.add(7444);
        System.out.println(list);
        System.out.println("The length/size of this array is: " + list.size());
        list.add(1,15);
        System.out.println(list);
        System.out.println("The length/size of this array after inserting a value is: " + list.size());

        //to set a value.
        list.set(1,96);
        System.out.println(list);
        System.out.println("The length/size of this array after setting(set() method replaces that particular value) a value is: " + list.size());

        //to remove a value. here we need to give index in ();
        list.remove(4);
        System.out.println(list);
        System.out.println("The length/size of this array after removing a value is: " + list.size());

        //contains()- returns T/F -if that value is present in that list or not
        System.out.println("list.contains() returns T/F & here in this case it is: " + list.contains(25));
        System.out.println("list.contains() ->> " + 96);

        //indexOf()- returns the value's index. Since a list can contain duplicate values so if a particular value is repeated multiple times thae this method will return only the first occurrence of that value.
        System.out.println(list.indexOf(96));

        //lastIndexOf()-  returns last index.
        /*returns -1 if we pass a value that is not available in the list*/
        System.out.println("list.indexOf(786 which is not available in the list hence returns -1) ->> " + list.lastIndexOf(786));
        System.out.println("list.indexOf(96) ->> " + list.indexOf(96));

        //isEmpty()- returns T/F.
        System.out.println(list.isEmpty());
        List <Integer> list2 = new ArrayList<Integer>();
        System.out.println(list2.isEmpty());

        //addAll()- you can add list elements into list 2.
        list2.addAll(list);
        list2.add(654);
        System.out.println(list2);
        System.out.println(list2.isEmpty());

        //clear() - with this you can remove entire data inside a list.
        list2.clear();
        System.out.println(list2);
        System.out.println(list2.isEmpty());
    }
}
