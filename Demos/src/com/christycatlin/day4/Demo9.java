package com.christycatlin.day4;

import java.util.HashSet;
import java.util.Iterator;

public class Demo9 {
    public static void main(String[] args) {
        //create HashSet and add elements
        HashSet<String> set = new HashSet<>();
        set.add("Mark");
        set.add("Paul");
        set.add("Watson");
        set.add("Mark");// will auto remove as this is a duplicate
        set.add(null);
        set.add(null);// will disapear as only one null allowed


        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //remove()
        set.remove("Paul");
        System.out.println(set);

        //removeAll()
        //removeIf()
        //clear()
    }
}
