package com.solution.main;

import java.util.Scanner;

class NegativeNumber extends Exception{
	
	
	}
public class Start {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number::");
		int num=sc.nextInt();
		
		try {
			if(num<0) {
				throw new NegativeNumber();
			}
			
		}catch(Exception e) {
			System.out.println("Exception handeled number is negative:"+num);
			
		}
		finally {
			if(num>0) {
				System.out.println("Number is positive:"+num);
			}else {
				System.out.println("Final block is successfully exiected");
			}
		}
	}

}


