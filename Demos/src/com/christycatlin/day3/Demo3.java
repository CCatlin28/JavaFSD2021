package com.christycatlin.day3;

public class Demo3 {
    public static void main(String[] args) {

        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String ("Mark");
        String s4 = "Paul";

        System.out.println(s1.equals(s2)); //true, same location and same value
        System.out.println(s1.equals(s3)); // true same value even though different location
        System.out.println(s1.equals(s4)); // false not the same

        String s5 = "MARK";
        System.out.println(s1.equals(s5)); // false case sensitive
        System.out.println(s1.equalsIgnoreCase(s5)); // true case diference removed
    }
}
