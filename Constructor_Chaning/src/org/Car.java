package org;

import java.util.Scanner;

public class Car {
	Car(int cost){
		this.cost = cost;
	}
	
	Car(int cost,String brand){
		this(cost);
		this.brand = brand;
	}
	
	String brand;
	int cost;
	
	void displayDetails() {
		System.out.println("Brand : "+this.brand+"\t Cost : "+this.cost);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		Car[] c = new Car[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the brand : ");
			String brand = sc.next();
			System.out.println("Enter the cost : ");
			int cost = sc.nextInt();
			c[i] = new Car(cost,brand);
			
		}
		System.out.println("==========================================");
		for(int j=0;j<c.length;j++) {
			c[j].displayDetails();
		}
		
		sc.close();
	}

}
