package com.christycatlin.day3;

public class Demo30 {
    public static void main(String[] args) {

        // 1st
        try {

        } catch (Exception e) {

        }

        // 2nd option multiple catch

        try {

        } catch (ArithmeticException ae) {

        } catch (Exception e) {

        }

        //3rd
        try {
            try {

            } catch (Exception e) {
            }
        } catch (Exception e) {

        }

        //4th
        try{

        } finally {

        }

        //5th... not allowed does not work
//        catch (Exception e){
//
//        }
    }
}

