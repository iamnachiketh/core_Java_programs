package javabean;

public class Mobile {
	private  int cost;
	
	private  String brand;
	
	void setDetails(int cost, String brand) {
		this.brand = brand;
		this.cost = cost;
	}
	
	void getDetails() {
		System.out.println("Brand: "+this.brand+"\t Cost: "+this.cost);
	}
}
