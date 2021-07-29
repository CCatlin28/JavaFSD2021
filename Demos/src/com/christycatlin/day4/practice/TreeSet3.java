package com.christycatlin.day4.practice;

import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("Blue");
        treeSet.add("Green");
        treeSet.add("Teal");
        treeSet.add("Red");
        treeSet.add("Purple");
        treeSet.add("Black");

        TreeSet treeSet2 = new TreeSet();
        treeSet2.add("Pink");
        treeSet2.add("Yellow");
        treeSet2.add("Orange");

        System.out.println("First TreeSet");
        System.out.println(treeSet);
        System.out.println("Second TreeSet");
        System.out.println(treeSet2);
        treeSet.addAll(treeSet2);
        System.out.println("Combined TreeSets");
        System.out.println(treeSet);
    }
}
