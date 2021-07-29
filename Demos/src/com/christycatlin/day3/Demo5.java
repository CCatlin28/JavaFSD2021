package com.christycatlin.day3;

public class Demo5 {
    public static void main(String[] args) {
        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String ("Mark");
        String s4 = "Paul";


        System.out.println(s1.compareTo(s2)); // 0
        System.out.println(s1.compareTo(s3)); // 0
        System.out.println(s1.compareTo(s4)); // -
        System.out.println(s4.compareTo(s1)); // +
    }
}
