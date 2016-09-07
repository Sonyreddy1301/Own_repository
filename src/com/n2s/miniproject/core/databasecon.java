package com.n2s.miniproject.core;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databasecon {
	private static Connection con;

	public static Connection getconnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to a selected database..."); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details","root", "admin");
			System.out.println("Connected Database Successfully...");
		} catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return con;
	}

}


