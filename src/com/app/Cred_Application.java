package com.app;

import java.util.Scanner;

import reward.gifts.Gift;
import reward.user.UserData;

public class Cred_Application  {
 
	UserData userD[] = new UserData[4];
	
	public Cred_Application() {
		userD[0] = new UserData(1,"Deb",1234);
		userD[1] = new UserData(2,"Raj",4333);
		userD[2] = new UserData(3,"Deepak",6554);
		userD[3] = new UserData(4,"Rai",1269);
	}
	
	public void display() {
	    System.out.println(" Users Are -");
	    for(UserData u : userD) {
	    	System.out.println("User- " + u.toString());
	    }
		}
	public void userData() {
		for(UserData u : userD) {
			System.out.println(" ID - " + u.getId());
			System.out.println(" NAME - " + u.getName());
	
			System.out.println("*****************************");
		}
	}
	
	public void getRedem() {
		System.out.println("Want to redem - ");
		System.out.println("Press yes otherwise no - ");
		Scanner sc = new Scanner(System.in);
		String choise = sc.next();
		String selection = "yes";
		if(choise.equals(selection)) {
			System.out.println("yes you can");
		}
		else {
			System.exit(0);
		}
	}
	
	public void showEverything()  {
		Cred_Application ca = new Cred_Application();
	
		ca.userData();
		ca.getRedem();
			
		Cred_Gift cg = new Cred_Gift();
		cg.showGifts();
		cg.selection();
	
		
	}
}
