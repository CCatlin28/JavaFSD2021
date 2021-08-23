package com.christy.connections;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.concurrent.Executor;

public class ConnectionFactory  {
	
	private static Connection connection = null;

    public ConnectionFactory(){

    }

    public static Connection getConnection () throws SQLException, ClassNotFoundException {
    	Class.forName("com.mysql.jdbc.Driver");
        if (connection == null){
            ResourceBundle bundle = ResourceBundle.getBundle("com/christy/connections/dbConfig");
            String url = bundle.getString("url");
            String username = bundle.getString("username");
            String password = bundle.getString("password");
            connection = DriverManager.getConnection(url, username, password);

        }
        return connection;
    }

}