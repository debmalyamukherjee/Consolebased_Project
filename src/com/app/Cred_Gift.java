package com.app;

import java.util.Scanner;

import reward.gifts.Gift;

public class Cred_Gift {
	Gift gift[] = new Gift[1];
	private int points=1000;
	
	public Cred_Gift() {
		gift[0]	= new Gift(1,"TV");
	//	gift[1]	= new Gift(2,"AC",30000);
	//	gift[2]	= new Gift(3,"FAN",4343);
	}
	public void showGifts() {
		System.out.println(" Show gift for winners - ");
		for(Gift g : gift) {
			System.out.println("ID - " + g.getId());
		//	System.out.println("GIFT - " + g.getGift());
			System.out.println("Claim Credit Card Reward Points - ");
	//		int points = g.getPoints();
			System.out.println("POINTS - " +  (points));
		}
	}
	public void calculate() {
		
		Scanner ss = new Scanner(System.in);
		 int amt = ss.nextInt();
		 System.out.println("Enter redem points - ");
			points = (points - amt);
			System.out.println("Now your points left- " + points);
			if(points==0) {
				System.out.println("Bye");
				System.exit(0);
				 
			}
		
	}
	
	 public void selection() {
		 Scanner sc = new Scanner(System.in);
		 Cred_Gift cg =new Cred_Gift();
		 int sw;
			do {
		//	System.out.println("1.Gift1   2.Gift2   3.Gift3  4.Exit ");
			System.out.println("1.Gift  2.Exit ");
			System.out.println("Choose any one -");
			sw = sc.nextInt();
			switch (sw) { 
			case 1:
				System.out.println("Gift -  ");
				cg.calculate();
				break;
			case 2:
				 System.out.println("See you soon...");
				break;
				default:
					System.out.println("You choose wrong  ");
			}
	 }
			while(sw!=2);
	 }

}