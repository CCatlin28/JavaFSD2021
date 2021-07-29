package com.christycatlin.day4.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("One");
        list.add("Two");
        list.add("Three");

        Iterator iterator = list.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
