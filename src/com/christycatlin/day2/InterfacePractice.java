package com.christycatlin.day2;

interface IShape{
    double area();
    double outside();
}
class Rectangle10 implements IShape{
    double length;
    double width;

    @Override
    public double area() {
       double area = (length*width);
        System.out.println("The area is " +area);
       return area;
    }

    @Override
    public double outside() {
        double outside = ((2*length)+(2*width));
        System.out.println("The perimiter is " + outside);
        return outside;
    }
}

class Circle10 implements IShape{
    double radius;
    float pi = (float) 3.14;

    @Override
    public double area() {
        double area = pi * (radius*radius);
        System.out.println("The area is " +area);
        return area;
    }

    @Override
    public double outside() {
        double outside = 2 * pi * radius;
        System.out.println("The circumfrance is " + outside);
        return outside;
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
        Rectangle10 rec = new Rectangle10();
        Circle10 cir = new Circle10();

        rec.width = 10;
        rec.length = 20;
        cir.radius = 5;

        rec.area();
        rec.outside();
        cir.area();
        cir.outside();
    }
}
