package com.christycatlin.day6;


// 1st way
//interface Rectangle{
//    public void draw();
//}
//class Test implements Rectangle{
//
//    @Override
//    public void draw() {
//        System.out.println("drawing...");
//    }
//}

// 2nd way
interface Rectangle{
    void draw();
}


public class Demo9 {
    public static void main(String[] args) {
        // first way
//        Test test = new Test();
//        test.draw();

        // second way (without using labda)
        Rectangle rectangle = new Rectangle() {
            @Override
            public void draw() {

            }
        };
        rectangle.draw();

        //3rd way using lambda
        Rectangle rectangle1 = () -> {
            System.out.println("drawing...");
        };
        rectangle1.draw();


    }
}
