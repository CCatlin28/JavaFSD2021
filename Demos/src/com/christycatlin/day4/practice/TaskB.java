package com.christycatlin.day4.practice;

import java.util.HashMap;

public class TaskB {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,"Room 1");
        hashMap.put(2, "Room 2");
        hashMap.put(3, "Room 3");
        hashMap.put(4, "Room 4");

        int sizeMap = hashMap.size();
        System.out.println(sizeMap);
    }
}
