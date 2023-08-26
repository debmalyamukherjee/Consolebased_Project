package com.home;

import java.util.Scanner;
import com.app.Cred_Application;
import com.app.Cred_Gift;
import reward.user.UserData;

public class Home implements Runnable{
	
	@Override
	public void run() {
		Login l = new Login();
		try {
			l.check1();
			Thread.sleep(5000);
			l.check1();
			Thread.sleep(5000);
			l.check1();
			} 
		catch (Exception e) {
			System.out.println("Something wrong");
		}
	}

	public static void main(String[] args) {

		System.out.println(" ******* Rewards Application *******  ");
		System.out.println("*******Login Page*********");
			
		Home ob = new Home();
		Thread t1 = new Thread(ob);
		t1.start();	
		}
}