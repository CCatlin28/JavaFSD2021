package com.christycatlin.day4.practice;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println(list);

        list.addLast("Four");

        System.out.println(list);
    }
}
