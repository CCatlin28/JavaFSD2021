package com.christycatlin.day1;

class Parent1{
    public void display(){
        System.out.println("Parent Display");
    }
}

class Child1 extends Parent1{
    @Override
    public void display() {
        System.out.println("Child Display");
    }
}
public class Demo28 {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.display();

        //((Parent1)c1).display;

        //Child1 c2 = new Parent1();
        Parent1 p1 = new Child1();
        p1.display();
    }
}