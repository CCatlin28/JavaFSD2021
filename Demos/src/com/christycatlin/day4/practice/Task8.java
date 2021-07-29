package com.christycatlin.day4.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("teal");
        arrayList.add("pink");
        arrayList.add("yellow");
        arrayList.add("blue");
        arrayList.add("red");
        arrayList.add("green");
        arrayList.add("purple");
        arrayList.add("black");

        System.out.println("Array Before Sorting:");
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println("Array After Sorting:");
        System.out.println(arrayList);
    }
}
