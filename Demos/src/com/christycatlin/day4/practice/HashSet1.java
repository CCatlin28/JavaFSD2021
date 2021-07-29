package com.christycatlin.day4.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("red");
        hashSet.add("blue");
        hashSet.add("purple");
        hashSet.add("green");

        System.out.println("Start as HashSet");
        System.out.println(hashSet);

        //unable to append to the end of a hashSet because it does not maintain order
        // transform into a LinkedHashSet

        LinkedHashSet orderedSet = new LinkedHashSet();
        orderedSet.addAll(hashSet);

        System.out.println("Convert to Linked HashSet");
        System.out.println(orderedSet);

        orderedSet.add("teal");

        System.out.println("Add new color to end");
        System.out.println(orderedSet);

    }
}
