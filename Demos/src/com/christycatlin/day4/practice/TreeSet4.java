package com.christycatlin.day4.practice;

import java.util.TreeSet;

public class TreeSet4 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("Blue");
        treeSet.add("Green");
        treeSet.add("Teal");
        treeSet.add("Red");
        treeSet.add("Purple");
        treeSet.add("Black");

        System.out.println("TreeSet normal order");
        System.out.println(treeSet);
        System.out.println("TreeSet reverse order");
        System.out.println(treeSet.descendingSet());
    }
}
