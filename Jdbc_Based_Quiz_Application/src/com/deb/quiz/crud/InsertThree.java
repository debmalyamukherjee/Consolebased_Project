package com.deb.quiz.crud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.deb.quiz.connection.ConnectionDatabase;

public class InsertThree {

	Connection connect = null;
	PreparedStatement pstmnt = null;
	Scanner sc = null;
	BufferedReader reader = null;
	
	public void insertingdData() throws SQLException, InterruptedException, IOException {

		String url = "jdbc:postgresql://localhost:5432/Db";
		String userName = "postgres";
		String password = "0000";

		try {
			Class.forName("org.postgresql.Driver");
		    connect = DriverManager.getConnection(url, userName, password);
			String ss = "insert into quiz(id,question,optionone,optiontwo,optionthree,optionfour,answer) values(?,?,?,?,?,?,?)";
		    pstmnt = connect.prepareStatement(ss);

			System.out.println("Please enter the following details to be stored in DB");

		    sc = new Scanner(System.in);
			System.out.println("Enter your id -");
			Integer id = sc.nextInt();
			Thread.sleep(5000);

			reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your question -");
			String q = reader.readLine();
			Thread.sleep(9000);
			
		//	reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your option 1. -");
			String one = reader.readLine();
			Thread.sleep(9000);

			System.out.println("Enter your option 2. -");
			String two = reader.readLine();
			Thread.sleep(9000);

			System.out.println("Enter your option 3.-");
			String three = reader.readLine();
			Thread.sleep(9000);

			System.out.println("Enter your option 4. -");
			String four = reader.readLine();
			Thread.sleep(9000);

			System.out.println("Enter your Answer -");
			String ans = reader.readLine();
			
			pstmnt.setInt(1, id);
			pstmnt.setString(2, q);
			pstmnt.setString(3, one);
			pstmnt.setString(4, two);
			pstmnt.setString(5, three);
			pstmnt.setString(6, four);
			pstmnt.setString(7, ans);
			
			int insertData = pstmnt.executeUpdate();
			
			if (insertData == 1) {
				System.out.println("Data inserted");
			} else {
				System.out.println("Not inserted ");
			}
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			ConnectionDatabase.closeResource(null, pstmnt, connect);
			pstmnt.close();
			connect.close();
			sc.close();
		}

	}

}
