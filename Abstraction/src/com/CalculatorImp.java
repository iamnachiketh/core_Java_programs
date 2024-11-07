package com;

import java.util.Scanner;

public class CalculatorImp implements Calculator{
	@Override	
	public void add(int a,int b) {
		System.out.print("Add "+a+" and "+b+": ");
		System.out.print(a+b);
		}
	
	@Override
	public void multi(int a,int b) {
		System.out.print("Multiply "+a+" and "+b+": ");
		System.out.print(a*b);
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new CalculatorImp();// Upcasting **important
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers a and b to add");
		int a = sc.nextInt(),b = sc.nextInt();
		cal.add(a, b);
		System.out.println("\n\nEnter two numbers a and b to multiply");
		a = sc.nextInt();
		b = sc.nextInt();
		cal.multi(a, b);
		sc.close();
	}
}
