package com.christycatlin.day4;

import java.util.HashMap;
import java.util.Map;

public class Demo16 {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();
        student.put(1, "Mark");
        student.put(2, "Paul");
 //       student.put("", "Watson"); // can't do this as wrong value type for key
    }
}
