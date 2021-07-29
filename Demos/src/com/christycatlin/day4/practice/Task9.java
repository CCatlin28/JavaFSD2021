package com.christycatlin.day4.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("teal");
        arrayList.add("pink");
        arrayList.add("yellow");
        arrayList.add("blue");


        ArrayList<String> arrayList2 = new ArrayList();
        arrayList2.add("red");
        arrayList2.add("green");
        arrayList2.add("purple");
        arrayList2.add("black");

        System.out.println("First List:");
        System.out.println(arrayList);
        System.out.println("Second List:");
        System.out.println(arrayList2);
        arrayList.addAll(arrayList2);
        System.out.println("Combined List:");
        System.out.println(arrayList);


    }
}
