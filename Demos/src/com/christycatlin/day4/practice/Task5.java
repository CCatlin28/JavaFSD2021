package com.christycatlin.day4.practice;

import java.util.ArrayList;

public class Task5 {
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

        System.out.println(arrayList);

        arrayList.set(2, "rainbow");

        System.out.println(arrayList);
    }
}
