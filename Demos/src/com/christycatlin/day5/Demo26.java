package com.christycatlin.day5;

import java.util.Scanner;

public class Demo26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name and Last Name");

        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        System.out.println("FullName: "+firstname+" "+lastname);
    }
}
