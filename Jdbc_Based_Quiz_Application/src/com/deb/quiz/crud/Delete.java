package com.deb.quiz.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.deb.quiz.connection.ConnectionDatabase;

public class Delete {
	
	public  void delete() throws SQLException {

		Connection connect = null;
		PreparedStatement pstmnt = null;
//		ResultSet result = null;
		Scanner scan = null;

		try {
			connect = ConnectionDatabase.getDbConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection also fine!");

		if (connect != null) {
			String sql = "delete from quiz  where id=?";
			pstmnt = connect.prepareStatement(sql);
		}
		if (pstmnt != null) {
			scan = new Scanner(System.in);
			System.out.println("Kindly enter the id -  ");
			int id = scan.nextInt();
			
			pstmnt.setInt(1, id);
			int data = pstmnt.executeUpdate();
			if(data==1) {
				System.out.println("Successs");
			}
			else {
				System.out.println("Fail");
			}
		}
		ConnectionDatabase.closeResource(null, pstmnt, connect);
		// scan.close();
	        pstmnt.close();
	     //   result.close();
	        connect.close();;
	}


}
