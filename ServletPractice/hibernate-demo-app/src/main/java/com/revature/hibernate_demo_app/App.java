package com.revature.hibernate_demo_app;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Project has started.... This is cool" );
        
        //this is the formation of a configuration object  
        //take note when importing there are 3 different options to import
        //select the one with hibernate in the path string
        Configuration cfg = new Configuration();
        
        //reading the configuration and loading it into the object
        cfg.configure("hibernate.cfg.xml");
        
        //this is the creation of the factory that makes everything
        SessionFactory factory = cfg.buildSessionFactory();
        //this opens the session (look at the name of the method)
        Session session = factory.openSession();
        //the transaction now begins
        Transaction t = session.beginTransaction();
        
//        //create employee
//        Employee employee = new Employee();
//        employee.setID(2);
//        employee.setName("Paul");
//        employee.setEmail("p@gmail.com");
//        
//        
//        //create address
//        Address address = new Address();
//        address.setCity("city2");
//        address.setStreet("street2");
//        address.setOpen(true);
//        address.setCreated(new Date());
//        address.setX(456.789);
//        
//        //save the info
//        session.save(employee);
//        session.save(address);
        
        //fetch data
//        Address address1 = session.get(Address.class,1);
//        System.out.println(address1);
//        
//        Address address2 = session.get(Address.class,3);
//        System.out.println(address2);
        
        Address address3 = session.load(Address.class,3);
        System.out.println(address3);
        
        
        
        //commit the transaction
        t.commit();
        //close the session
        session.close();
        
//        System.out.println(employee);
    
    }
}
