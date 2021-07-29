package com.christycatlin.day4.practice;

import java.util.HashSet;

public class HashSet4 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("red");
        hashSet.add("blue");
        hashSet.add("purple");
        hashSet.add("green");

        System.out.println("Begining Hash Set");
        System.out.println(hashSet);

        hashSet.removeAll(hashSet);

        System.out.println("After Deletion");
        System.out.println(hashSet);
    }
}
