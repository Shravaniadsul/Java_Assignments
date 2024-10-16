package com.solution.Shape;

import java.util.Scanner;

import com.solution.Shape.IShape;
import com.solution.Shape.ShapeImpl;

public class ShapeImpl implements IShape {

		Scanner sc= new Scanner(System.in);
		float pie= (float) 3.14;
		@Override
		public void areaOfCircle() {
			System.out.println("Enter a radius of circle::");
			float r=sc.nextFloat();
			double area=pie*(r*r);
			System.out.println(area);
		}

		@Override
		public void primeterOfCircle() {
			System.out.println("Enter a primeter of circle::");
			float r=sc.nextFloat();
			double primeter=pie*2*r;
			System.out.println(primeter);
		}

		@Override
		public void areaOfTriangle() {
			System.out.println("Enter a base a::");
			float a=sc.nextFloat();
			System.out.println("Enter a height b::");
			float b=sc.nextFloat();
			double Triangle=(1/2)*a*b;
			System.out.println(Triangle);
			

		}

		@Override
		public void PrimeterOfTriangle() {
			System.out.println("Enter a length of side a::");
			float a=sc.nextFloat();
			System.out.println("Enter a length of side b::");
			float b=sc.nextFloat();
			System.out.println("Enter a length of side c::");
			float c=sc.nextFloat();
			double primeter=a+b+c;
			System.out.println(primeter);
		}
		
		public static void main(String []args) {
			IShape s=new ShapeImpl();
			s.areaOfCircle();
			s.primeterOfCircle();
			s.areaOfTriangle();
			s.PrimeterOfTriangle();
			
		}

}
