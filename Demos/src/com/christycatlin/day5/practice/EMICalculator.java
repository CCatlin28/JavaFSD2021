package com.christycatlin.day5.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EMICalculator {
    public static void main(String[] args) {
        double p;
        double r;
        double n;
        double e;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Welcome to the EMI Calculator");
            System.out.println("Please input the Loan Amount");
            p = scanner.nextDouble();
            System.out.println("Please input the Interest Rate");
            r = scanner.nextDouble();
            System.out.println("Please input the Tenure");
            n = scanner.nextDouble();
            e = (p * r * (1 + r) * n) / ((1 + r) * n - 1);
            System.out.println("Your EMI is " + e);
        } catch(InputMismatchException i){
            System.out.println("Your Input was invalid, please start over");
        }
    }
}
