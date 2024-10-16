package com.solution.main;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class ListProgram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<Integer>numbers=new ArrayList<>();
		System.out.println("Enter integer(type 'done' to finish):");
		
		while(sc.hasNextInt()) {
			numbers.add(sc.nextInt());
		}
		if(numbers.size()<2) {
			System.out.println("Not enough numbers to find second largest and second smallest.");
		}else {

			
			int secondSmallest=numbers.get(1);
			int secondLargest=numbers.get(numbers.size()-2);
			System.out.println("Second smallest:"+secondSmallest);
			System.out.println("Second largest:"+secondLargest);

		}
		sc.close();
	}

}
