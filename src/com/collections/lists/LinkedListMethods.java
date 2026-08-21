package com.collections.lists;

import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {

        /*By-default in java when we create a linked list in java it will be double linked list it traverses both sides from front and back*/

        LinkedList<Integer> list = new LinkedList<>();

        /*same methods like lists here also but extra you will be having:-
        * list.addFirst();
        * list.addLast();
        * list.removeFirst();
        * list/removeLast();
        * list.getFirst();
        * list.getLast();*/

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(59);
        list.addLast(69);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);



    }
}
