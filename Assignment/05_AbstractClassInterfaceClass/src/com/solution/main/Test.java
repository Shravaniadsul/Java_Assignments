package com.solution.main;

abstract class Animal{

	public abstract void name();
	public  abstract void color();
	
}

class Dog extends Animal{

	@Override
	public void name() {
	System.out.println("Dog name is Guddi");
	}

	@Override
	public void color() {
	System.out.println("Dog color is White");
	}


	
	
}
interface IAnimal{
	public void sleep();
	 public void sound();
	
}
	 class Cat implements IAnimal{

		@Override
		public void sleep() {
			System.out.println("dog is sleeping");
		}

		@Override
		public void sound() {
			System.out.println("wolf");
		}	
		 
	 }

public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name();
		dog.color();
		Cat cat= new Cat();
		cat.sleep();
		cat.sound();
		
	}

}
