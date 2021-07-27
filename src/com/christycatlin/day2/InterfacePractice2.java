package com.christycatlin.day2;

interface IOne{
    void one();
}

interface ITwo{
    void two();
}

interface IThree{
   void three();
}
 abstract class Alpha implements IOne, ITwo{

 }

 class Beta extends Alpha implements IThree{

     @Override
     public void one() {

     }

     @Override
     public void two() {

     }

     @Override
     public void three() {

     }
 }

public class InterfacePractice2 {
}
