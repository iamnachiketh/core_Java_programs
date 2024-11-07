package org;

import java.util.Scanner;

public class Student {
	Student(int age){
		this.age = age;
	}
	
	Student(int age,String name){
		this(age);
		this.name = name;
	}
	
	String name;
	int age;
	
	void displayDetails() {
		System.out.println("Name : "+this.name+"\t Age : "+this.age);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		Student[] s = new Student[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Name : ");
			String name = sc.next();
			System.out.println("Enter the age : ");
			int age = sc.nextInt();
			s[i] = new Student(age,name);
			
		}
		System.out.println("==========================================");
		for(int j=0;j<s.length;j++) {
			s[j].displayDetails();
		}
		
		sc.close();
	}
}
