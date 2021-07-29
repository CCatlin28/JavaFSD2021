package com.christycatlin.day3;

public class Demo13 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //16 default
        sb.append("Hello");
        System.out.println(sb.capacity());//16 still
        sb.append("Welcome to java class, Have a nice day");
        System.out.println(sb.capacity()); //43 auto increases the capacity as needed
    }
}
