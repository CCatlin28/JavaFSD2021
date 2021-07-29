package com.christycatlin.day4;

import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("yellow");
        colors.add("red");
        colors.add("orange");
        colors.add("blue");
        colors.add("pink");

        //before sorting
        System.out.println("before sorting...");
        for (String color: colors) {
            System.out.println(color);
        }

        // after sorting
        System.out.println("after sorting...");
        Collections.sort(colors);
        for (String color: colors) {
            System.out.println(color);
        }


        //list of numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(6);

        //before sorting
        System.out.println("before sorting...");
        for (int num: numbers) {
            System.out.println(num);
        }

        // after sorting
        System.out.println("after sorting...");
        Collections.sort(numbers);
        for (int num: numbers) {
            System.out.println(num);
        }
    }
}
