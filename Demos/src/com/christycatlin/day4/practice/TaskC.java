package com.christycatlin.day4.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TaskC {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,"Room 1");
        hashMap.put(2, "Room 2");
        hashMap.put(3, "Room 3");
        hashMap.put(4, "Room 4");

        HashMap hashMap2 = new HashMap();
        hashMap2.put(5,"Room 5");
        hashMap2.put(6, "Room 6");
        hashMap2.put(7, "Room 7");
        hashMap2.put(8, "Room 8");

        System.out.println("Map 1");
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("Map 2");
        Set set2 = hashMap2.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator2.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        hashMap.putAll(hashMap2);
        System.out.println("Mearged Maps");
        Set set3 = hashMap.entrySet();
        Iterator iterator3 = set3.iterator();
        while (iterator3.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator3.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
