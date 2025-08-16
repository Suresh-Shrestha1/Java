//25. Write a Java program to select all data from employee table using JDBC.
import java.sql.*;
public class SelectAllEmployee {
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

            // SQL query to select all data from employee table
            String sql = "SELECT * FROM employee";

            // execute the query
            ResultSet rs = stmt.executeQuery(sql);

            // print the results
            System.out.println("Employee Records:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                int salary = rs.getInt("salary");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Email: " + email + ", Phone: " + phone + ", Address: " + address + ", Salary: " + salary);
            }
            // close the result set, statement and connection
            rs.close();
            stmt.close();
            conn.close();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
