package com.solution.controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.solution.dao.Student;



public class StudentApp {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public com.solution.dao.Student selectData(int id) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		Student std = null;
		
		try {
			connection  = DriverManager.getConnection("jdbc:mysql:///school","root","Shravani@12");
			
			String SelectQuery = "SELECT ID ,NAME,Age,CITY FROM Class_A WHERE ID = ?";
			
			if(connection != null) {
				pstmt = connection.prepareStatement(SelectQuery);
			}
			
			if(pstmt != null) {
				pstmt.setInt(1, id);
				
				resultSet = pstmt.executeQuery();
			}
			
			if(resultSet != null) {
			   std = new Student();
				while(resultSet.next()) {
			   std.setId(resultSet.getInt(1));
			   std.setName(resultSet.getString(2));
			   std.setAge(resultSet.getInt(3));
			   std.setCity(resultSet.getString(4));
				}
				return std;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
				if(connection !=null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return std;
		
	}
}