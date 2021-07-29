package com.christycatlin.day4;

import java.util.TreeSet;

public class Demo12 {
    public static void main(String[] args) {
        //Create TreeSet and add element
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(65);
        treeSet.add(21);
        treeSet.add(11);
        treeSet.add(2);
        treeSet.add(15);

        for (int number: treeSet){
            System.out.println(number);
        }

        //pollFirst()
        //PostLAst()
        System.out.println("Highest: "+treeSet.pollFirst());
        System.out.println("Lowest: "+treeSet.pollLast());
    }
}
