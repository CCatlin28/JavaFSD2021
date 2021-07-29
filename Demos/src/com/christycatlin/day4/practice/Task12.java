package com.christycatlin.day4.practice;

import java.util.ArrayList;

public class Task12 {
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
        System.out.println("A small portion");
        System.out.println(arrayList.subList(3,7));
    }
}
