package com.home;

import java.util.Scanner;

import com.app.Cred_Application;

class Login {
	public void check1() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Your password - ");
		int password1 = sc.nextInt();
		int password = 2222;

		if (password == password1) {
			Cred_Application c = new Cred_Application();
			c.showEverything();
		} else {
			System.out.println("wrong");
		}

	}

}
