package com.lab.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AllrecordAccess {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con =null;
		try {
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb ", "root" ,"Sbg@240901");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Statement stmt = con.createStatement();
		
		ResultSet rs =stmt.executeQuery("Select * from emp");
		
		int id ;
		String name , desig ,dept;
		int sal;
		
		System.out.println("Employee details");
		System.out.println("==========");
		
		while(rs.next())
		{
			id = rs.getInt(1);
			name = rs.getString(2);
			desig =rs.getString(3);
			dept = rs.getString(4);
			sal =rs.getInt(5);
			System.out.println(id+"		"+name+"	"+desig+"	"+dept+"	"+sal);
		}
		
	}

}



