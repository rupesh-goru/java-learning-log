package com.collections.sets;

import java.util.TreeSet;

public class TreeSetIntro {
    static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(30);
        treeSet.add(20);
        /*INTERVIEW QUESTION:-------*/
        /*In treeSet null is not accepted at least one null also. because of sorting internally it sorts*/
        //treeSet.add(null);
        //treeSet.add(null);
        /*this is sorted set so it will come in ascending order.*/
        System.out.println(treeSet);
        System.out.println(treeSet.size());
    }
}
