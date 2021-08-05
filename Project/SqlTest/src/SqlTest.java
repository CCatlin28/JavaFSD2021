import java.sql.*;

public class SqlTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Step 1: load the driver
        //Class.forName("jdbc:mysql://localhost:3306/revature");
        //this is the way to use if not setting up in the system directly
        /*
        system direct set up
        File>Project Structure> Modules>Dependencies> add > link D:\mysql-connector-java-8.0.26
        ensure that it shows up below
         */

        //Step 2: Create Connection Object
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "ol@Hou4all");

        //Step 3: Create Statement Object
        Statement statement = conn.createStatement();

        //Step 4: Execute Query
        ResultSet resultSet = statement.executeQuery("select * from employee");
        while (resultSet.next()){
            System.out.println("Id: " + resultSet.getInt(1) + ", Name: "
            + resultSet.getString(2) + ", Email: " + resultSet.getString(3));
        }

        //Step 5: Close the connection
        conn.close();
    }


}
