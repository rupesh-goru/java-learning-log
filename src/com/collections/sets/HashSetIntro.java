package com.collections.sets;

import java.util.HashSet;

public class HashSetIntro {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(50);//duplicates not allowed in set
        set.add(10);//duplicates not allowed in set
        System.out.println(set);
        set.add(null);
        set.add(null);
        System.out.println(set);
        System.out.println(set.size());

        /*You cannot use traditional for loop to iterate over this because no indexing is allowed either you should use for each or iterator.*/
        for(Integer i : set){
            System.out.println(i);
        }
/*rest all other methods are same as list methods except indexof and get methods.*/
    }
}
