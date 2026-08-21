package com.collections.sets;

import java.util.LinkedHashSet;

public class LinkedHashSetIntro {
    static void main(String[] args) {
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<Integer>();
        linkedSet.add(1);
        linkedSet.add(2);
        linkedSet.add(1);
        linkedSet.add(3);
        linkedSet.add(4);
        linkedSet.add(4);
        linkedSet.add(null);
        linkedSet.add(null);
        System.out.println(linkedSet.size());
        /*The main dif of HashSet and LinkedHashSet is LinkedHashSet follows insertion order*/
        System.out.println("Insertion order is followed here: " + linkedSet);
    }
}
