package com.deb.quiz.login;

import java.util.Scanner;

class LoginException extends Exception{
	public LoginException(String msg) {
		super(msg);
	}
}


public class Login {

	Scanner sc = new Scanner(System.in);

	public void login_Credential() throws LoginException {
		System.out.println(" -----  LOGIN PAGE----- ");
		System.out.println("Enter your First Name: -");
		sc.next();
		System.out.println("Enter your Second Name: -");
		sc.next();
		System.out.println("Enter your City Name: -");
		sc.next();
		System.out.println("Enter your Password: -");
		int pass = sc.nextInt();
		if (pass == 12345) {
			System.out.println("  Quiz app for professionals ------ ");
	//		Quiz_App qa = new Quiz_App();
	//		qa.playQuiz();
	//		qa.printscore();
	//		qa.yesNo();

		} else {
			LoginException le = new LoginException("Please enter your proper password");
			System.out.println(le.getMessage());
			throw le;
			//System.out.println("Please enter your proper password");
		}

	}
	
	public void exceptionChecking() {
		Login l = new Login();
		try {
			l.login_Credential();
		}
		catch (Exception e) {
			try {
				l.login_Credential();
			} catch (Exception e2) {
				System.out.println("Blocked !! bye");
			}
		}
	}
}
