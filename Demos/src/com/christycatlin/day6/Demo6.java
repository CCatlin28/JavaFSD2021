package com.christycatlin.day6;

interface ICar{
    void getCarModel();
    void getCarColor();
}
class Audi implements ICar{

    @Override
    public void getCarModel() {
        System.out.println("Audi A6");
    }

    @Override
    public void getCarColor() {
        System.out.println("Black");

    }
}

class Bmw implements ICar{

    @Override
    public void getCarModel() {
        System.out.println("5 Series");

    }

    @Override
    public void getCarColor() {
        System.out.println("White");

    }
}

class CarFactrory{
    public static ICar getCarInstance(int id){
        switch (id){
            case 1:
                return new Audi();
            case 2:
                return new Bmw();
            default:
                return null;
        }
    }
}
public class Demo6 {
    public static void main(String[] args) {
//        Audi car1 = new Audi();
//        car1.getCarColor();
//        car1.getCarModel();
//
//        Bmw car2 = new Bmw();
//        car2.getCarColor();
//        car2.getCarModel();

        ICar car1 = CarFactrory.getCarInstance(2);
        car1.getCarColor();
        car1.getCarModel();
    }

}
