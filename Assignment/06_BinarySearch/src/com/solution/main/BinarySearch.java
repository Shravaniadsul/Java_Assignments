package com.solution.main;

import java.util.Scanner;

public class BinarySearch {

	public static int BinarySearch(int arr[], int target) {
		int low=0;
		int high=arr.length-1;
		int mid = 0;
		
		while(low<=high) {
			
			mid=(low+high)/2;
			
		
	
		if(arr[mid]==target) {
			return mid;
			
		}else if(arr[mid]<target) {
			low=mid+1;
			
		}else {
			high=mid-1;
		}
		}
		return -1;
		}

	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		int arr1[]= {2,5,6,8,12,18,19,30,34};
		System.out.println("Enter a target value::");
		int target=sc.nextInt();
		int search=BinarySearch(arr1 , target);
		if(search==-1) {
			System.out.println("Target value is not found");
		}
		else {
			System.out.println("Target value is found::"+search);
		}
	}
}
