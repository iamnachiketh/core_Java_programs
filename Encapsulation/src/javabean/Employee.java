package javabean;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setId(int id) {
		this.id = id;
	}
	
	int getId() {
		return this.id;
	}
	
	String getName() {
		return this.name;
	} 
	
	double getSalary() {
		return this.salary;
	}
}
