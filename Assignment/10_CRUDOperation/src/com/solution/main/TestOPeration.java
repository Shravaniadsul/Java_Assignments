package com.solution.main;

import java.util.Scanner;

import com.solution.Employee.Employee;
import com.solution.controller.ControllerImpl;
import com.solution.controller.IController;

public class TestOPeration {

	public static void main(String[] args) {
		start();
	}
	public static void start() {
		IController controller = null;
		System.out.println("************Welcome to Employee Information***********");
	    System.out.println("1.Get Employee Information By Id \n2.Insert new Employee Information\n3.Update exsiting employee information\n4.Delete Employee Information\n5.Exit"); 
		
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter option :: "); 
	    
	    int x = sc.nextInt();
	    
	    if(x==1) {
	   controller  = new ControllerImpl();
	   Employee emp = controller.select(); 
	    
	    System.out.println(emp);
	    }
	    else if(x==2) {
	    	controller = new ControllerImpl();
	    	 controller.insert();
	    	
	    }
	    else if(x==3) {
	    	controller = new ControllerImpl();
	    	controller.update();
	    }
	    else if(x==4) {
	    	controller = new ControllerImpl();
	    	controller.delete();
	    }
	    else if(x==5) {
	    	System.exit(0);
	    	System.out.println("Thank you for using our System");
	    	
	    }
	    else {
	    	System.out.println("Invalid Input Please Try Again");
	    }
	    
	    
	    
	}
}
