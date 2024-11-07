package com;

public class BankImpl implements Bank{
	
	double balance;
	
	@Override
	public void deposit(double amount) {
		System.out.println("The amount to deposit: $"+amount);
		this.balance +=amount;
		System.out.println("The amount deposited successfuly");
	}
	
	@Override
	public void withdraw(double amount) {
		System.out.println("The amount to withdraw: $"+amount);
		this.balance -=amount;
		System.out.println("The amount widthdrawn successfuly");
	}
	
	@Override
	public double checkBalance() {
		System.out.println("The balance is : $"+this.balance);
		return this.balance;
	}
}
