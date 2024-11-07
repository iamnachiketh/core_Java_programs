package com;

public class Vehicle {
	String brand = "Mahindra";
}

class Car extends Vehicle{
	void drive() {
		System.out.println("Car has started!!!");
	}
}

class Bike extends Vehicle{
	void ride() {
		System.out.println("Bike has started!!!");
	}
}
