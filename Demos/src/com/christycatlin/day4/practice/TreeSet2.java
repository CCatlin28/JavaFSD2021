package com.christycatlin.day4.practice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("Blue");
        treeSet.add("Green");
        treeSet.add("Teal");
        treeSet.add("Red");
        treeSet.add("Purple");
        treeSet.add("Black");

        Iterator tree = treeSet.iterator();
        while(tree.hasNext()){
            System.out.println(tree.next());
        }
    }
}
