//24. Write a Java program to insert data into employee table using JDBC.

import java.sql.*;
public class InsertIntoEmployeeTable {
    public static void main(String[] args) {
        // JDBC URL, username and password of MySQL database
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "root";   // Replace with your MySQL username
        String password = "root";   // Replace with your MySQL password

        try {
            // establish connection
            Connection conn = DriverManager.getConnection(url, username, password);

            // create statement
            Statement stmt = conn.createStatement();

            // insert data into employee table
            String sql = "INSERT INTO employee (id, name, age, email, phone, address, salary) VALUES (1, 'John Doe', 30, 'john@gmail.com', '123-456-7890', '123 Main St', 50000), (2, 'Jane Smith', 25, 'jane12@gmail.com', '987-654-3210', '456 Elm St', 60000), (3, 'Alice Johnson', 28, 'alice@gmail.com', '555-123-4567', '789 Oak St', 70000)";
            // execute the insert statement
            stmt.executeUpdate(sql);
            System.out.println("Data inserted successfully into employee table.");
            // close the statement and connection
            stmt.close();
            conn.close();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
