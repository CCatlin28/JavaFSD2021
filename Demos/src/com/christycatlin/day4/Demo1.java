package com.christycatlin.day4;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> mList = new ArrayList<String>();

        mList.add("Mark");
        mList.add("Paul");
        mList.add("Watson");
        // mList.add(10); will give a compile time error because of type safety

        System.out.println(mList);
// iterator
        Iterator iterator = mList.iterator();
        //hasNext() will check if iterator has the element
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //forEach
        for(String name: mList){
            System.out.println(name);
        }
    }
}
