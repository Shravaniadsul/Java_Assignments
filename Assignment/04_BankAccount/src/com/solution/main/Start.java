package com.solution.main;

import java.util.Scanner;

import com.solution.controller.BankImpl;

 class Test {
public void StartAtm() {
	System.out.println("*********Welcome to HDFC Bank ATM********");
	System.out.println("Select your option \n 1.balanceCheck \n 2.Deposit \n 3.withdrwan \n 4.Send \n 5.Exit \n ");
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your option::\n");
	int option=sc.nextInt();
	
	
	
	BankImpl hdfc = new BankImpl(2500);
	switch(option) {
	case 1:hdfc.balanceCheck();
		break;
	case 2:System.out.println("Enter amount:");
			int amount = sc.nextInt();
			hdfc.Deposit(amount);
		break;
	case 3:System.out.println("Enter amount:");
			int amount1= sc.nextInt();
		   hdfc.withdrwan(amount1);
		break;
	case 4:System.out.println("Enter amount:");
		int amount2= sc.nextInt();
		hdfc.Send(amount2);
		break;
	case 5: System.out.println("Thank you for using our Bank ATM");
		break;
	default :System.out.println("Invalid option!!please try again");
			break;
	}
}
}

public class Start {
	public static void main(String [] args) {
		Test T= new Test();
		T.StartAtm();
	}
}