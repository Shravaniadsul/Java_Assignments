package com.solution.main;


class EvenThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even::"+i);
			}
	}
}
}
	class OddThread extends Thread{
		public void start() {
			for(int i=1;i<=10;i++) {
				if(i%2!=0) {
					System.out.println("Odd::"+i);
				}
		}
	}}


	
public class ThreadProgram {

	public static void main(String[] args) {
		EvenThread even=new EvenThread();
		even.run();
		OddThread odd=new OddThread();
		odd.start();
		
	}

}
