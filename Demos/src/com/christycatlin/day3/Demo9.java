package com.christycatlin.day3;

public class Demo9 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "HelloWorld";

        String str4 = str1 +str2;

        System.out.println(str3); //HelloWorld
        System.out.println(str4); //HelloWorld
        System.out.println(str3.equals(str4)); //true
        System.out.println(str3==str4); //false
    }
}
