package comparingobjects;

public class Car {
	double cost;
	
	Car(double cost){
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car c = (Car) obj;
			return this.cost == c.cost;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(4000.56);
		Car c2 = new Car(2000.00);
		System.out.println(c1.equals(c2));
		System.out.println(c1);
		System.out.println(c2);
		if(c1.equals(c2)) System.out.println("Same cost");
		else System.out.println("Different cost");
	}

}
