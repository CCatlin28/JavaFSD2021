package com.christycatlin.day3;

public class Demo6 {
    public static void main(String[] args) {
        String str = "Hello" + " "+"World";
        System.out.println(str);

        //behind the scenes on the plus operator
        //String str = (new StringBuilder()).append("Hello").append("World").toString()

        String str2 = 10+20+0+ "Sum" + 40 + 50;
        System.out.println(str2); //60Sum4050
    }



}
