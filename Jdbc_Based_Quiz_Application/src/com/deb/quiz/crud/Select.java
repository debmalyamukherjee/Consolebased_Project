package com.deb.quiz.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.deb.quiz.connection.ConnectionDatabase;

public class Select {
	
	public void select() throws SQLException {
		Connection connect=null;
		PreparedStatement pstmnt=null;
		ResultSet result=null;
		Scanner scan=null;
		
		try {
			connect=ConnectionDatabase.getDbConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection also fine!");
		
		if(connect!=null)
		{
		// String sql="select * from emp";
		 String sql = "select * from quiz ";
		 pstmnt=connect.prepareStatement(sql);
		}
		if(pstmnt!=null) {
//			scan=new Scanner(System.in);
//			System.out.println("Kindly enter the id -  ");
//			Integer id=scan.nextInt();
//			
//			pstmnt.setInt(1, id);
			result=pstmnt.executeQuery();

		}
		if(result!=null) {
			while(result.next())
			{
				System.out.println("ID\tQUESTION\tOPTION-A\tOPTION-B\tOPTION-C\tOPTION-D");
				System.out.println(result.getInt(1) + "\t" + result.getString(2) + "\t" +
				
		           result.getString(3) + "\t" + result.getString(4)+ "\t"+
		           result.getString(5) + "\t" + result.getString(6)  );
			}
		}
		ConnectionDatabase.closeResource(result, pstmnt, connect);
		// scan.close();
	        pstmnt.close();
	        result.close();
	        connect.close();
	}

}
