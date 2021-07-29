package com.christycatlin.day3;

public class Demo24 {
    public static void main(String[] args) throws Exception {
//        try{
//            doSomething();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
        doSomething();
    }

    public static void doSomething() throws Exception{
       try {
           doSomethingElse();
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    private static void doSomethingElse() throws Exception{
        doSomethingSomethingElse();
    }
    private static void doSomethingSomethingElse() throws Exception{
        throw new Exception();
    }
}
