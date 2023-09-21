package com.deb.quiz.crud;

import java.sql.Statement;

import com.deb.quiz.connection.ConnectionDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertOne {
	Connection connect = null;
	Statement stmt = null;
	
	public void insertData() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/Db";
		String userName = "postgres";
		String password = "0000";
		try {
			Class.forName("org.postgresql.Driver");
			connect = DriverManager.getConnection(url, userName, password);
			String q = "insert into quiz(id,question,optionone,optiontwo,optionthree,optionfour,answer) values(6,'Automatic type conversion is possible in which of the possible cases-','Byte to int','Int to long','Long to int','Short to int','Int to long')";
		    stmt = connect.createStatement();
			stmt.executeUpdate(q);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			ConnectionDatabase.closeResource(null, stmt, connect);
			stmt.close();
			connect.close();
		}
	}
}
