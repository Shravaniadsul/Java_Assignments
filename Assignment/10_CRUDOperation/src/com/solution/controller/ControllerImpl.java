package com.solution.controller;

import java.util.Scanner;

import com.solution.Employee.Employee;
import com.solution.service.IService;
import com.solution.service.ServiceImpl;

public class ControllerImpl implements IController {
	Scanner sc=null;
	Employee emp=null;
	IService service = null;
	
	@Override
	public Employee select() {
		sc= new Scanner(System.in);
		System.out.println("Enter a Id to get Employee Information::");
		int Id = sc.nextInt();
		
		service = new ServiceImpl();
		emp = service.select(Id);
		return emp;
		
	}
	@Override
	public void insert() {
		sc= new Scanner(System.in);
		System.out.println("Id::");
		Integer Id = sc.nextInt();
		System.out.println("Name::");
		String Name = sc.next();
		System.out.println("Age::");
		Integer Age = sc.nextInt();
		System.out.println("City::");
		String City = sc.next();
		
		emp = new Employee();
		emp.setId(Id);
		emp.setName(Name);
		emp.setAge(Age);
		emp.setCity(City);
		
		service = new ServiceImpl();
		int rowCount = service.insert(emp);
		if(rowCount!=0) {
			System.out.println("Data Inserted Sucessfully");
		}
		else {
			System.out.println("Data Insertion Failed");
		}
	}
	@Override
	public void update() {
		sc= new Scanner(System.in);
		System.out.println("Enter Id whose data to be updated::");
		Integer Id = sc.nextInt();
		System.out.println("Name::");
		String Name = sc.next();
		System.out.println("Age::");
		Integer Age = sc.nextInt();
		System.out.println("City::");
		String City = sc.next();
		
		emp = new Employee();
		emp.setId(Id);
		emp.setName(Name);
		emp.setAge(Age);
		emp.setCity(City);
		
		service = new ServiceImpl();
		
		Integer rowCount = service.update(emp);
		if(rowCount != 0) {
			System.out.println("Data Updated Sucessfully");
		}else {
			System.out.println("Data Updation Failed");
		}
	}
	@Override
	public void delete() {
		Scanner sc=new Scanner(System.in);
		Integer rowCount = null;
		System.out.println("Enter Serial_no to delete record: ");
		int Id = sc.nextInt();
		service = new ServiceImpl();
		
		Employee emp = service.select(Id);
		System.out.println(emp);
		
		System.out.println();
	    System.out.print("Do you want to delete this record ??[y/n] :: ");
	    String s = sc.next();
	    
	    System.out.println();
	    
	    if(s.equalsIgnoreCase("y")) {
		     rowCount=service.delete(Id);
		    }else {
		    	System.out.println("Data Has been not deleted");
		    }
			
		    if(rowCount != null) {
		    	System.out.println("Record deleted succefully");
		    }
		    else {
		    	System.out.println("deletion failed");
		    }
			

		
	}
	}
	
	
	

