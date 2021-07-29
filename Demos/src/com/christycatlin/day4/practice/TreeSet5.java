package com.christycatlin.day4.practice;

import java.util.TreeSet;

public class TreeSet5 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("Blue");
        treeSet.add("Green");
        treeSet.add("Teal");
        treeSet.add("Red");
        treeSet.add("Purple");
        treeSet.add("Black");

        System.out.println("Entire TreeSet: " + treeSet);
        System.out.println("First Item: " +treeSet.first()+", Last Item: "+treeSet.last());
    }
}
