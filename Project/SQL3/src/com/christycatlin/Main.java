package com.christycatlin;

import java.sql.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        mainMenu();

    }

    public static void mainMenu() throws SQLException {
        System.out.println("Please make a selection from the Below List");
        System.out.println("********************");
        System.out.println("1. Add New Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Remove Employee");
        System.out.println("4. View All Employees");
        System.out.println("5. View Employee by ID");
        System.out.println("6. Exit");
        System.out.println("********************");
        menu();
    }

    public static void menu() throws SQLException {
        EmployeeDAOImpl dao = new EmployeeDAOImpl();
        Scanner scanner = new Scanner(System.in);
        try {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Enter Employee Name");
                    String n = scanner.next();
                    System.out.println("Enter Employee Email");
                    String e = scanner.next();
                    dao.addEmployee(n, e);
                    mainMenu();
                    break;
                case 2:
                    System.out.println("Enter Employee ID");
                    int id = scanner.nextInt();
                    System.out.println("Enter Employee NEW Name");
                    String n2 = scanner.next();
                    System.out.println("Enter Employee NEW Email");
                    String e2 = scanner.next();
                    Employee employee = new Employee(id, n2, e2);
                    dao.updateEmployee(employee);
                    mainMenu();
                    break;
                case 3:
                    System.out.println("Enter Employee ID of Employee to be removed");
                    int id2 = scanner.nextInt();
                    dao.deleteEmployee(id2);
                    mainMenu();
                    break;
                case 4:
                    List<Employee> employees = dao.getEmployees();
                    for (Employee employee1 : employees) {
                        System.out.println(employee1);
                    }
                    mainMenu();
                    break;
                case 5:
                    System.out.println("Enter Employee ID of Employee to view");
                    int id3 = scanner.nextInt();
                    List<Employee> employees2 = dao.employeeById(id3);
                    System.out.println(employees2);
                    mainMenu();
                    break;
                case 6:
                    System.out.println("Goodbye, Have a Good Day!");
                    break;
                default:
                    System.out.println("Please Select 1-6");
                    mainMenu();
                    break;


            }
        } catch (InputMismatchException exception){
            System.out.println("Please Select 1-6");
            mainMenu();

        }

    }

}
