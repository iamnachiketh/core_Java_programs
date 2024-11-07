package com;

public class Customer extends Amazon{
	
	@Override
	void buy(String product) {
		System.out.println("Product: "+product);
	}
	
	@Override
	void pay(int amount) {
		System.out.println("Amount: "+amount);
	} 
	public static void main(String[] args) {
		Customer c = new Customer();
		c.buy("Mobile");
		c.pay(30000);
	}
}
