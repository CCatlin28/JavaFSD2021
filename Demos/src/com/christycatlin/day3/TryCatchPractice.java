package com.christycatlin.day3;

public class TryCatchPractice {

    public static void main(String[] args) {
        int y = 0;

        try {
            y = 100/0;
            System.out.println(y);
        } catch (ArithmeticException ae){
            System.out.println("You can't divide by 0");
        } catch (Exception e){
            System.out.println("How did you get a non math error on a math question");
        }
        finally {
            System.out.println("lets do some math");
        }
    }
}
