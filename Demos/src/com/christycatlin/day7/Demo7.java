package com.christycatlin.day7;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("Drawing A Rectangle...");
    }
}

class Cone{


    void draw() {
        System.out.println("Drawing A Cone...");
    }
}
class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Drawing A Circle...");
    }
}

class Test{
    // accepts only child class of the Shape class
    public static void drawShape(List<? extends Shape> list){
        for(Shape shape: list){
            shape.draw(); // calling method of shape class by child class instance
        }
    }
}

public class Demo7 {
    public static void main(String[] args) {
        List<Rectangle> rectangleList = new ArrayList<>();
        List<Circle> circleList = new ArrayList<>();
        List<Cone> coneList = new ArrayList<>();

        Test.drawShape(rectangleList);
        Test.drawShape(circleList);
       // Test.drawShape(coneList); // does not work because the paramater is set to only accept a child class of Shape
        // even though all parameters within Cone class match those of the Shape class it won't work as it does not extend Shape
    }
}
