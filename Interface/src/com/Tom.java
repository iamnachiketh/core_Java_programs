package com;

public class Tom implements Person{
	
	public static void main(String[] args) {
		System.out.println(Person.age);
		Tom tom = new Tom();
		tom.call();
	}
}
