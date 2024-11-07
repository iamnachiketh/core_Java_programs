package org;

public class CalculatorImpl implements Calculator{
	
	@Override
	public void add(int a, int b) {
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
	}
	
	@Override
	public void mult(int a, int b) {
		System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
	}
	
	@Override
	public void div(int a, int b) {
		System.out.println("Division of "+a+" and "+b+" is "+((double)a/b));
	}
	
	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction of "+a+" and "+b+" is "+(Math.abs(a-b)));
	}
}
