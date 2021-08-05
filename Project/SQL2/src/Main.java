import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        //step 2
        String host = "jdbc:mysql://localhost:3306/";
        String database = "revature";
        String connectionString = host + database;
        String username = "root";
        String password = "ol@Hou4all";
        Connection conn = DriverManager.getConnection(connectionString, username,password);
       // step 3
        Statement statement = conn.createStatement();
        //Step 4 Execute Queary
        //Demo 1: Create a table
//        String query = "create table employee (id INTEGER PRIMARY KEY AUTO_INCREMENT, name CHAR(20), email CHAR(50))";
////        statement.executeUpdate(query);
////        System.out.println("Table created succesfully");
        //Demo 2: Insert data into our table  my addition how to do multiple rows
//        String query = "insert into employee (name, email) values(?, ?)";
//        //Get PrepareStatement object
//        PreparedStatement preparedStatement = conn.prepareStatement(query);
//        //set the values to query
//        preparedStatement.setString(1, "Mark Smith");
//        preparedStatement.setString(2, "m@gmail.com");
//        int rowAffected = preparedStatement.executeUpdate();
//        System.out.println("(" + rowAffected + ") rows affected");
//        preparedStatement.setString(1, "Paul Jones");
//        preparedStatement.setString(2, "p@gmail.com");
//        // execute the query
//        int rowAffected2 = preparedStatement.executeUpdate();
//        System.out.println("(" + rowAffected2 + ") rows affected");
        // Demp 3: Update data in our table
//        String query = "update employee set name = ?, email = ? where id = ?";
//        PreparedStatement preparedStatement = conn.prepareStatement(query);
//        preparedStatement.setString(1, "Paul");
//        preparedStatement.setString(2, "p@gmail.com");
//        preparedStatement.setInt(3,1);
//        int rowAffected = preparedStatement.executeUpdate();
//        System.out.println("(" + rowAffected + ") rows affected");
        //Demo 4: Delete data from our table
//        String query = "delete from employee where id = ?";
//        PreparedStatement preparedStatement = conn.prepareStatement(query);
//        preparedStatement.setInt(1, 2);
//        int rowAffected = preparedStatement.executeUpdate();
//        System.out.println("(" + rowAffected + ") rows affected");

        //Demo 5: read the data from table
        String query = "select * from employee";
        ResultSet resultSet = statement.executeQuery(query);

        while(resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            System.out.println("ID: "+id+", name: "+name+", email: "+email);
        }


        // Step 5 Close Connection
        if (conn.isClosed()){
            System.out.println("connection closed");
        } else {
            System.out.println("connection open");
        }
    }
}
