package com.deb.quiz.home;

import java.sql.SQLException;
import java.util.Scanner;

import com.deb.quiz.crud.Delete;
import com.deb.quiz.crud.InsertOne;
import com.deb.quiz.crud.InsertThree;
import com.deb.quiz.crud.InsertTwo;
import com.deb.quiz.crud.Select;
import com.deb.quiz.crud.Update;
import com.deb.quiz.login.Login;

public class Home {

	public static void main(String[] args) throws Exception {

//		Select obj = new Select();
//		obj.select();
//		Insert obj1 =new Insert();
//		obj1.insert();
//		Update obj2 =new Update();
//		obj2.update();
//		Delete obj3 =new Delete();
//		obj3.delete();

		System.out.println("Welcome to Quiz Application");
		System.out.println("**********************************");
		System.out.println("Enter your choise here -  1.Select 2.Insert 3.Update 4.Delete ");
		System.out.println("Enter your value  - ");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
//		do {
		switch (choose) {
		case 1:
			System.out.println("Select data from Database");

			Select obj = new Select();
			obj.select();
			break;
		case 2:
			System.out.println("Insert data to Database");
			// InsertOne obj1 = new InsertOne();       // For insert Static query 
			// obj1.insertData();
			
		//	InsertTwo obj1 = new InsertTwo();        // For insert one time Dynamic query form coder  
		//	obj1.insertedData();
			
			InsertThree obj1 = new InsertThree();    // For insert Dynamic query form user input 
			obj1.insertingdData();

			break;
		case 3:
			System.out.println("Update data in Database");
			Update obj2 = new Update();
			obj2.update();
			break;
		case 4:
			System.out.println("Delete data from Database");
			Delete obj3 = new Delete();
			obj3.delete();
			break;
		case 5:
			System.out.println("See you soon...");
			break;
		default:
			System.out.println("You choose wrong");
		}
//		} while (choose != 5);

	}

}
