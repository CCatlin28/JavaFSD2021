package com.christycatlin.day5.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

class Function{
    Addition addition = new Addition();
    Subtraction subtraction = new Subtraction();
    Multiplication multiplication = new Multiplication();
    Division division = new Division();
    Scanner scanner = new Scanner(System.in);

   public int math = scanner.nextInt();{

        if(math == 1) {
           addition.Add();
        } else if (math == 2){
           subtraction.Sub();
        } else if (math == 3){
            multiplication.Mul();
        }else if (math == 4){
            division.Div();
        } else {
            System.out.println("Please start over, you have input an invalid number");
        }

    }

}

class Addition {
    public double a;
    public double b;
    Scanner scanner = new Scanner(System.in);

    public void Add() {
            System.out.println("Input the first number to be added");
            a = scanner.nextDouble();
            System.out.println("Input the second number to be added");
            b = scanner.nextDouble();
            double c = a + b;
            System.out.println("Addition Equation: " + a + " + " + b + " = " + c);
    }
}

    class Subtraction{
        public double a;
        public double b;
        Scanner scanner = new Scanner(System.in);
        public void Sub() {
                System.out.println("Input the number to be subtracted from");
                a = scanner.nextDouble();
                System.out.println("Input the number to subtract");
                b = scanner.nextDouble();
                double c = a - b;
                System.out.println("Subtraction Equation: " + a + " + " + b + " = " + c);
        }

}

class Multiplication {
    public double a;
    public double b;
    Scanner scanner = new Scanner(System.in);

    public void Mul() {
            System.out.println("Input the first number to be multiplied");
            a = scanner.nextDouble();
            System.out.println("Input the second number to be multiplied");
            b = scanner.nextDouble();
            double c = a * b;
            System.out.println("Multiplication Equation: " + a + " + " + b + " = " + c);
    }
}

class Division{
    public double a;
    public double b;
    Scanner scanner = new Scanner(System.in);
    public void Div() {
            System.out.println("Input the number to be divided from");
            a = scanner.nextDouble();
            System.out.println("Input the number to divide");
            b = scanner.nextDouble();
            double c = a / b;
            System.out.println("Division Equation: " + a + " + " + b + " = " + c);
    }

}

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Select which Mathematical Function to Perform");
        System.out.println("Type the menu number to select the required Function");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        try{
            Function function = new Function();
        } catch (InputMismatchException i){
            System.out.println("Please start over, you have input an invalid option");
        }

    }


}
