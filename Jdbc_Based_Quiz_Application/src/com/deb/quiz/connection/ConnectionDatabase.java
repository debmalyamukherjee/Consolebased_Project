package com.deb.quiz.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDatabase {
	
	static
	{
		//load and register Driver
		try 
		{
			Class.forName("org.postgresql.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
		
			e.printStackTrace();
		}
		
		System.out.println("Driver registered successfully!");
	}
	
	public static Connection getDbConnection() throws SQLException
	{
		// EstablishConnection
		
					String url ="jdbc:postgresql://localhost:5432/Db";
					String userName="postgres";
					String password="0000";
					
						return DriverManager.getConnection(url, userName, password);			
					
	}
	
	public static void closeResource(ResultSet rs, Statement st, Connection c) throws SQLException
	{
		if(rs!=null)
			rs.close();
		if(st!=null)
			st.close();
		if(c!=null)
		c.close();
	}	

}
