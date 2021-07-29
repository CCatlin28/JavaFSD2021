package com.christycatlin.day3;

public class CreatingStringPractice {
    public static void main(String[] args) {
        String s1 = "Hello my name is: ";
        String s2 = "Christy";
        String s3 = s1.concat(s2);

        System.out.println(s3);

        String s4 = new String("Christy");
        String s5 = "Mike";

        System.out.println(s4==s2); //false
        System.out.println(s4==s5); //false
        System.out.println(s4.equals(s2)); //true
        System.out.println(s4.equals(s5)); //false
        System.out.println(s4.compareTo(s2)); // 0
        System.out.println(s4.compareTo(s5)); // -

    }
}
