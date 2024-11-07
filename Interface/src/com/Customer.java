package com;

public class Customer implements Uber {
	
	@Override
	public void pay() {
		System.out.println("i am Rich");
	}
	
	@Override
	public void bookCab() {
		System.out.println("A**hole");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.bookCab();
		c.pay();
		Gpay.reward();
	}

}
