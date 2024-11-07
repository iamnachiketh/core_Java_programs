package com;

import java.util.Scanner;

public class BankMainClass {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Bank b = new BankImpl();
		b.checkBalance();
		System.out.print("Enter the amount:");
		double amount = sc.nextDouble();
		System.out.println("Select \n1)to Deposit\n2)to withdraw");
		int select = sc.nextInt();
		if(select == 1) b.deposit(amount);
		else if(select == 2) {
			if(b.checkBalance()<amount) {
				System.out.println("Balance is too low!!!");
			}else {
				b.withdraw(amount);
			}
		}else System.out.println("Invalid selection!!!");
		b.checkBalance();
	}
}
