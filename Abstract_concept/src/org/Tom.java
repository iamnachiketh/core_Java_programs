package org;

public class Tom extends Employee {
	
	@Override
	void eat() {
		System.out.println("Eats!!");
	}
	
	@Override
	void walk() {
	System.out.println("Walks!!!");
	}
	
	@Override
	void work() {
		System.out.println("Employee works!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tom t = new Tom();
		t.eat();
		t.walk();
		t.work();
	}

}
