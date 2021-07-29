package com.christycatlin.day4.practice;

import java.util.ArrayList;

public class Task6 {
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

        arrayList.remove(2);

        System.out.println(arrayList);
    }
}
