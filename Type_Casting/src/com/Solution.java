package com;

public class Solution {
	static void display(Vehicle obj) {
		if(obj instanceof Car) {
			Car c = (Car)obj;
			System.out.println(c.brand);
			c.drive();
		}else if(obj instanceof Bike) {
			Bike b = new Bike();
			System.out.println(b.brand);
			b.ride();
		}
	}
}
