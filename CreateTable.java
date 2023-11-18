package com.lab.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	 public static void main(String[] args) {
	        // Database connection parameters
	        String url = "jdbc:mysql://localhost:3306/mydb"; // Change to your database URL
	        String username = "root";
	        String password = "Sbg@240901";

    // SQL statement to create a table
    String createTableSQL = "CREATE TABLE IF NOT EXISTS Customer("
            + "id INT PRIMARY KEY,"
            + "name VARCHAR(255),"
            + "age INT"
            + ")";

    try {
        // Register the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Open a connection to the database
        Connection connection = DriverManager.getConnection(url, username, password);

        // Create a statement
        Statement statement = connection.createStatement();

        // Execute the SQL statement to create the table
        statement.executeUpdate(createTableSQL);

        System.out.println("Table created successfully.");

        // Close the statement and connection
        statement.close();
        connection.close();
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
}
}
