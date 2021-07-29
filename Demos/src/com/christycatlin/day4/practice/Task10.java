package com.christycatlin.day4.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Task10 {
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
        Collections.sort(arrayList);
        System.out.println("List in Alphabetical Order:");
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println("List Shuffled:");
        System.out.println(arrayList);

    }
}
