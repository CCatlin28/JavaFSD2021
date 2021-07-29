package com.christycatlin.day3;

public class Demo22 {
    public static void main(String[] args) {

       // case 1 no exception occurs
        try{
            int c = 10/5;
            System.out.println(c);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Case 1: finally called");
        }

        // case 2 exception occurs but not handled
        try{
            int c = 20/0;
            System.out.println(c);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Case 2: finally called");
        }
        // case 3 exception occurs but not handled
        try{
            int c = 10/0;
            System.out.println(c);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Case 3: finally called");
        }
    }
}
