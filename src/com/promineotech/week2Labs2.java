package com.promineotech;

public class week2Labs2 {

	public static void main(String[] args) {
		
		int age = 16;
		
		
		System.out.println(age >= 16);
		age = 18;
		System.out.println(age >= 16);

		boolean hasLicense = true;
		
		  if (age >= 16 && hasLicense) {
		  System.out.println("You can drive!");
		  
		 } else {
			 System.out.println("You cannot drive");
			 
		 }
		  
		double costOfMilk = 3.15;
		int thirstLevel = 7;
		
		if (costOfMilk < 2.5 || thirstLevel > 6) {
		System.out.println("Milk Please");
		
		} else { 
			System.out.println("No Thanks");
		}
		 
		
		int numberOfCookies = 20;
		int numberOfChildren = 12;
		
		int remainingCookies = numberOfCookies % numberOfChildren;
		
		if (remainingCookies >= 5) {
			System.out.println("Jackpot!");
		} else if (remainingCookies >= 2) {
			System.out.println("Whoohoooo!");
		} else if (remainingCookies >= 0) {
			System.out.println("Yes!");
		} else {
			System.out.println("Sadface");
		}
		
		
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;
				
		switch(loyaltyMemberStatus)	{
			case "SILVER":
				loyaltyMemberDiscount = .1;
				break;
			case "GOLD":
				loyaltyMemberDiscount = .15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = .25;
				break;
		}
		
		System.out.println(loyaltyMemberDiscount);
		
		double billTotal = 775;
		double adjustedBillTotal = billTotal - billTotal * loyaltyMemberDiscount;
		System.out.println(adjustedBillTotal);
		
		if (adjustedBillTotal > 500) {
			if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
			} else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
			}
		}
		System.out.println(loyaltyMemberStatus);
		
		
		
		
		String username = "Tommy123";
		String password = "12345";
		if (username.equals ("Tommy123") && password.equals("12345")) {
		System.out.println("login successful"); 
		} else {
			System.out.println("access denied");
		}
		

		
		for(int i =0; i < 10; i ++) {
			System.out.println(i);
		}
		
		for(int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
		for(int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for(int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " EVEN"); 
				} else {
					System.out.println(i + " ODD");
			}
		}
		
		int i = 100;
		while (i > 0) {
			System.out.println(i + " " + (i % 3));
			i --;
				
			}
		
		
		
	} //main end

} //class end
