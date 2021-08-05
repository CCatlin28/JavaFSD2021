package com.christycatlin.day7;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String blank = scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
