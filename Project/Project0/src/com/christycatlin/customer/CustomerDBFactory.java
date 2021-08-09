package com.christycatlin.customer;

public class CustomerDBFactory {
    private static ICustomerDB db;
    private CustomerDBFactory(){}
    public static ICustomerDB getCustDB(){
        if(db==null)
            db = new CustomerDBImpl();
        return db;
    }
}
