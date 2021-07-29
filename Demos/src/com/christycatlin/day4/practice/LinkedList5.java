package com.christycatlin.day4.practice;

import java.util.LinkedList;

public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println("Before Change");
        System.out.println(list);
        list.add(1, "One and a half");
        System.out.println("After addition");
        System.out.println(list);
    }
}
