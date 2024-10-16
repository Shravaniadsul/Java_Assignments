package com.soution.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Driver loaded successfully");
	}

	public static Connection getconnection() throws SQLException{
		String user="root";
		String password ="Shravani@12";
		String url="jdbc:mysql://localhost:3306/school";
		
		Connection connection = DriverManager.getConnection(url,user,password);
		System.out.println("Connection established Successfully");
		return connection;
		
	}
	public static void cleanup(Connection connection,Statement statement, ResultSet resultset)throws SQLException{
		if(resultset!=null )
			resultset.close();
		
		if(statement!=null)
			statement.close();
		
		if(connection!=null)
			connection.close();
		
		System.out.println("Connection closed successfully");
		
	}}

