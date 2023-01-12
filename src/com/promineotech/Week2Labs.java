package com.promineotech;

import java.util.*;

public class Week2Labs {
	public static void main(String[] args)  {
	boolean loggedIn = false;
	int loginAttempts = 0;
	Scanner sc= new Scanner(System.in);    
	while (!loggedIn) {
	    if (loginAttempts >= 3) {
	        System.out.println("Too many login attempts, access blocked for 15 minutes!");
	        try {
	            Thread.sleep(900000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        loginAttempts = 0;
	    }
	    System.out.print("Enter username: ");   
	    String username = sc.nextLine();   
	    System.out.print("Enter password: ");  
	    String password = sc.nextLine();   
	    if (username.equals("samy123") && password.equals("12345")) {
	        System.out.println("Welcome back " + username);
	        loggedIn = true;
	    } else { 
	        System.out.println("Inaccurate credentials!"); 
	        loginAttempts++;
	    } // end of else 
	} // end of while
	}
}


