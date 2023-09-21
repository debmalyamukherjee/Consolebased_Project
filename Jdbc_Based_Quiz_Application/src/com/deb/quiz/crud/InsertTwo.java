package com.deb.quiz.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.deb.quiz.connection.ConnectionDatabase;

public class InsertTwo {
	
	Connection connect = null;
	PreparedStatement pstmnt = null;
	
	public void insertedData() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/Db";
		String userName = "postgres";
		String password = "0000";

		try {
			Class.forName("org.postgresql.Driver");
			 connect = DriverManager.getConnection(url, userName, password);
			String s = "insert into quiz(id,question,optionone,optiontwo,optionthree,optionfour,answer) values(?,?,?,?,?,?,?)";
		    pstmnt = connect.prepareStatement(s);
			pstmnt.setInt(1, 7);
			pstmnt.setString(2, "When an array is passed to a method, what does the method receive?");
			pstmnt.setString(3, "Copy of first element");
			pstmnt.setString(4, "length of the array");
			pstmnt.setString(5, "The reference of the array");
			pstmnt.setString(6, "copy of the array ");
			pstmnt.setString(7, "The reference of the array");
			int insert = pstmnt.executeUpdate();
			if (insert == 1) {
				System.out.println("Data inserted");
			} else {
				System.out.println("Not inserted ");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			ConnectionDatabase.closeResource(null, pstmnt, connect);
			connect.close();
			pstmnt.close();
		}
	}

}
