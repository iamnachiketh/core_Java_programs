package org;

import java.util.Scanner;

public class Employee {
	Employee(int id){
		this.id = id;
	}
	
	Employee(int id,String name){
		this(id);
		this.name = name;
	}
	
	Employee(String name,int id,double salary){
		this(id,name);
		this.salary = salary;
	}
	
	String name;
	int id;
	double salary;
	
	void displayDetails() {
		System.out.println("id : "+this.id+"\t EName : "+this.name+"\t Salary : "+this.salary);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		Employee[] s = new Employee[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Name : ");
			String name = sc.next();
			System.out.println("Enter the ID : ");
			int id = sc.nextInt();
			System.out.println("Enter the salary : ");
			double salary = sc.nextDouble();
			s[i] = new Employee(name,id,salary);
			
		}
		System.out.println("==========================================");
		for(int j=0;j<s.length;j++) {
			s[j].displayDetails();
		}
		
		sc.close();
	}
}
