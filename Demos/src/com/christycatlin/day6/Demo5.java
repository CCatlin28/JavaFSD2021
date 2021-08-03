package com.christycatlin.day6;

class Calculator{

    public static int count = 0;

    // instance of the class
    private static Calculator instance = null;

    private Calculator(){
        count++;
        System.out.println("Count: "+ count);
        System.out.println("Constructor called");
    }

    public static Calculator getInstance(){
        if(instance == null)
            instance = new Calculator();
        return instance;
    }


}



public class Demo5 {
    public static void main(String[] args) {
        // this works only if the constructor is public
//        Calculator calculator1  =new Calculator();
//        Calculator calculator2 = new Calculator();
//        Calculator calculator3 = new Calculator();

// this works if the constructor is public or private... it is better if it is private for memory management
        Calculator calculator1 = Calculator.getInstance();
        Calculator calculator2 = Calculator.getInstance();
        Calculator calculator3 = Calculator.getInstance();

    }


}
