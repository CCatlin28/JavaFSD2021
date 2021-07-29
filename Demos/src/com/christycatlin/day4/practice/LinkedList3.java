package com.christycatlin.day4.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");

        Iterator iterator = list.listIterator(3);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
