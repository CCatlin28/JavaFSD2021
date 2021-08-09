package com.christycatlin.try1.bank;

import java.sql.*;


public interface IDatabaseLink {
    public static void AccountLink() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "ol@Hou4all");
        Statement statement = conn.createStatement();
        ResultSet customerSet = statement.executeQuery("select * from customer");
        ResultSet accountSet = statement.executeQuery("select * from account");
        ResultSet employeeSet = statement.executeQuery("select * from employee");
        while (customerSet.next()){
            System.out.println("Id: " + customerSet.getInt(1) + ", Name: "
                    + customerSet.getString(2) + ", Email: " + customerSet.getString(3));
        }
        conn.close();

    };

}
