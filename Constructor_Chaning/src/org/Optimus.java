package org;

public class Optimus extends Robot{
	String name, color;
	Double maxSpeed;
	public Optimus(String name, String color,Double maxSpeed,String brand,int runningHours,int cpu) {
		super(brand,runningHours,cpu);
		this.name = name;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	void displayFeatures() {
		super.displayFeatures();;
		System.out.println("\nName: "+this.name+"\nColor: "+this.color+"\nMax Speed: "+this.maxSpeed);
	}
}
