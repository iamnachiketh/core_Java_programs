package traversingobjects;

public class Car {

	String brand;
	int cost;
	Car(String brand, int cost){
		this.brand = brand;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Brand: "+this.brand+" Cost: "+this.cost;
	}
}
