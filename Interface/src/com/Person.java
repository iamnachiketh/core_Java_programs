package com;

public interface Person {
	int age = 22;
	private void eat() {
		System.out.println("Default void!!");
	}
	
	default void call() {
		eat();
	}
}
