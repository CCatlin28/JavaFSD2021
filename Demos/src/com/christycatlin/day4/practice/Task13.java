package com.christycatlin.day4.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Task13 {
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

        System.out.println("Starting list:");
        System.out.println(arrayList);
        Collections.swap(arrayList, 0, 7);
        System.out.println("List with first and last index swapped");
        System.out.println(arrayList);
    }




}
