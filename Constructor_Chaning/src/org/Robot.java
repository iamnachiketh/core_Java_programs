package org;

public class Robot {
	String brand;
	int runningHours;
	int cpu;
	Robot(String brand,int runningHours,int cpu){
		this.brand = brand;
		this.cpu = cpu;
		this.runningHours = runningHours;
	}
	
	void displayFeatures() {
		System.out.println("Brand: "+this.brand+"\nNumber of CPU: "+this.cpu+"\nNumber of Hours it can run: "+this.runningHours);
		return;
	}
}
