package com.christycatlin.day4.practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("red");
        hashSet.add("blue");
        hashSet.add("purple");
        hashSet.add("green");

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
