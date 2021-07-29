package com.christycatlin.day3;

import java.util.Arrays;

public class Demo10 {
    public static void main(String[] args) {
        String message = "Hello, welcome to java";
        String[] result = message.split("\\,");
        System.out.println(Arrays.toString(result));
        System.out.println(result.length);
        System.out.println(result[0]);
        System.out.println(result[1]);

        String[] result2 = message.split(",");
        System.out.println(Arrays.toString(result2));
        System.out.println(result2.length);
        System.out.println(result2[0]);
        System.out.println(result2[1]);
    }
}
