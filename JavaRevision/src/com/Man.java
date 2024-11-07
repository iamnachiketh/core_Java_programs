package com;

public class Man extends Person{
	Man(String name,int age,String animalKingdom){
		this(age,animalKingdom);
		this.name = name;
	}
	
	Man(int age,String animalKingdom){
		super(animalKingdom);
		this.age = age;
	}
	
	String name;
	int age;
}
