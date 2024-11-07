package com;

public class Student {
	
	public int age = 22;
	
	public static void  study() {
		System.out.println("Studying Java");
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Age : "+s.age);
		study(); // Student.study();
		
	}
}
