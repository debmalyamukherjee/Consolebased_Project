package com.deb.quiz.crud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.deb.quiz.connection.ConnectionDatabase;

public class Update {

	public  void update() throws SQLException, InterruptedException, IOException {

		Connection connect = null;
		PreparedStatement pstmnt = null;
		ResultSet result = null;
		Scanner scan = null;
		BufferedReader reader = null;

		try {
			connect = ConnectionDatabase.getDbConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection also fine!");

		if (connect != null) {
			String sql = "update  quiz set optionfour=?,answer=? where id=?";
			pstmnt = connect.prepareStatement(sql);
		}
		if (pstmnt != null) {
			scan = new Scanner(System.in);
			System.out.println("Kindly enter the id -  ");
			int id = scan.nextInt();
			Thread.sleep(10000);
			
			reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter your option4-");
			String optionfour = reader.readLine();
			Thread.sleep(10000);
			System.out.println("Please enter your Answer-");
			String answer = reader.readLine();

			pstmnt.setString(1, optionfour);
			pstmnt.setString(2, answer);
			pstmnt.setInt(3, id);
			boolean data = pstmnt.execute();
			if(data==true) {
				result =pstmnt.getResultSet();
			}
			else {
				int rows=pstmnt.getUpdateCount();
				if(rows>0) {
					System.out.println("Data  updated");
				}
				else {
					System.out.println("Failed");
				}
			}
			
		}
		ConnectionDatabase.closeResource(result, pstmnt, connect);
     //   scan.close();
        pstmnt.close();
    //    result.close();
        connect.close();
	}

}
