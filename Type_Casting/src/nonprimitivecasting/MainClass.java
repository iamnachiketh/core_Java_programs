package nonprimitivecasting;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Car();
		System.out.println(v.brand);
		v.start();
		
		Car c = (Car) v;
		
		System.out.println(c.brand+" "+c.fuel);
		c.drive();
		c.start();
		
	}

}
