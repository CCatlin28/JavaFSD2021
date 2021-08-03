package com.christycatlin.day6;
// improper Dependency Management
//class Car{
//    Engine engine;
//    Tire tire;
//    public Car(){
//        this.engine = new Engine();
//        this.tire = new Tire();
//    }
//}
//class Engine{
//    public Engine(String type){
//
//    }
//
//}
//class Tire{
//    public Tire(String type){
//
//    }
//
//}

class Engine{

}

class Tire{

}

class CarFactory2{
    public static void getInstance(int id){
        switch (id){
            case 0:
                System.out.println("0 ");
                break;
            case 1:
                System.out.println("1");
                break;

        }
    }
}

class Car{
    Engine engine;
    Tire tire;

    public Car(Engine engine, Tire tire){
        this.tire = tire;
        this.engine = engine;
    }


}
public class Demo7 {
    public static void main(String[] args) {


    }
}
