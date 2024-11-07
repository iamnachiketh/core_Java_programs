package com;

public class Women extends Person{
	public Women(String name,int age,String animalKingdom) {
		this(age,animalKingdom);
		this.name = name;
	}
	
	public Women(int age,String animalKingdom) {
		super(animalKingdom);
		this.age = age;
	}
	
	String name;
	int age;
}
