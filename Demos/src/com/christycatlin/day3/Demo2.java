package com.christycatlin.day3;

public class Demo2 {
    public static void main(String[] args) {
        String str ="Hello";
        str.concat("World"); // we are using concat() method to append the string at the end
        System.out.println(str); // will print Hello because strings are immutable and can't be changed
        String str1 = "Hello ";
        String str2 = str1.concat("World");
        System.out.println(str1);
        System.out.println(str2);
    }
}
