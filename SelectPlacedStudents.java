package com.lab.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
		
public class SelectPlacedStudents 
{
   public static void main(String[] args) {
		        String url = "jdbc:mysql://localhost:3306/Anudip"; // Update the URL as needed
		        String username = "root";
		        String password = "Sbg@240901";

		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection connection = DriverManager.getConnection(url, username, password);
		            Statement statement = connection.createStatement();

		            // SQL query to select placed students
		            String selectQuery = "SELECT * FROM student WHERE placement_status = 'Placed'";
		            ResultSet resultSet = statement.executeQuery(selectQuery);

		            // Iterate through the result set and display placed students
		            while (resultSet.next()) {
		                int id = resultSet.getInt("id");
		                String name = resultSet.getString("name");
		                String batch = resultSet.getString("batch");
		                String placementStatus = resultSet.getString("placement_status");

		                System.out.println("ID: " + id + ", Name: " + name + ", Batch: " + batch + ", Placement Status: " + placementStatus);
		            }

		            resultSet.close();
		            statement.close();
		            connection.close();
		        } 
		        catch (ClassNotFoundException | SQLException e)
		        {
		            e.printStackTrace();
		        }
		    }
		

	}


