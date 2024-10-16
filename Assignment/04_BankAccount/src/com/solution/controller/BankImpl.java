package com.solution.controller;

public class BankImpl implements IBank {
	int balance;
	public BankImpl(int balance){
		this.balance=balance;
	}
	@Override
	public void balanceCheck() {
		System.out.println("Your current Amount is:"+balance);

	}

	@Override
	public void Deposit(int amount) {
		this.balance=+amount;
		System.out.println("Your total balance is: "+balance);
	}

	@Override
	public void withdrwan(int amount) {
		this.balance=+amount;
		System.out.println("Your remaining balance is: "+balance);
	}

	@Override
	public void Send(int amount) {
		if(this.balance<amount) {
			System.out.println("Your balance is not enough");
		}
		else {
			this.balance-=amount;
			System.out.println("Your account id debited for Rs."+amount);
			System.out.println("Your remaining balance is :"+balance);
	}

	}
	

}
