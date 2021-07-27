package com.christycatlin.day2;

interface ICustomer{

}
class User{

}
class Customer implements ICustomer{

}

public class Demo26 {
    public static void main(String[] args) {
        Customer customer = new Customer();
      //  ICustomer iCustomer = new ICustomer();
        // ICustomer is abstract and can't be called like this
        ICustomer iCustomer = new Customer();
        // this is allowed as the class Customer will have defined ICustomer
        //ICustomer iCustomer = new User();
        // this is not allowed as the User class is not connected to the ICustomer interface

    }
}
