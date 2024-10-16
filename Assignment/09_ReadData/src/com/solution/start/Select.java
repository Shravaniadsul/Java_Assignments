package com.solution.start;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.soution.util.JDBCUtil;

public class Select {
	public static void main(String[]args) throws Exception {
		Connection connection = null;
		Statement stmt = null;
		ResultSet resultSet =null;
	try {
		connection = JDBCUtil.getconnection();
		stmt = connection.createStatement();
		String sqlSelectQuery = "Select * From Class_A";
		
		resultSet = stmt.executeQuery(sqlSelectQuery);
		System.out.println("ID\tNAME\tAGE\tCITY");
		
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3)+"\t"+resultSet.getString(4));
			
		}
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	
	finally {
		try {
			JDBCUtil.cleanup(connection, stmt, resultSet);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}
	
}

