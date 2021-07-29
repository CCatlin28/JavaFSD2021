package com.christycatlin.day4.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TaskA {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "Room 1");
        hashMap.put(2, "Room 2");
        hashMap.put(3, "Room 3");
        hashMap.put(4, "Room 4");

        for (int i = 0; i <= hashMap.size(); i++) {
            System.out.println(hashMap.get(i));
        }

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
