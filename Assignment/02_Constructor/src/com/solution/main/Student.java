package com.solution.main;

class Parent {
	Parent(){
		System.out.println("Parent Class constructor ");
		
	}
	
}
 class Child extends Parent{
	Child(){
		System.out.println("Child class constructor ");
	}
 }
public class Student{
 public static void main(String[]args) {
	 Child c=new Child();
	 
 } }

