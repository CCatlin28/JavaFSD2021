package com.christycatlin.day3;

public class Demo4 {
    public static void main(String[] args) {
        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String ("Mark");
        String s4 = "Paul";

        System.out.println(s1==s2); //true same location in memory as both refer to the same object in the pool
        System.out.println(s1==s3); //false different memory location
        System.out.println(s1==s4); //false they are different
    }
}
