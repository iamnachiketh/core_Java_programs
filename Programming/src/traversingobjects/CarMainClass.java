package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class CarMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Omini",1000000);
		Car c2 = new Car("Mauthi 800",200000);
		Car c3 = new Car("Ambassador",300000000);
		
		ArrayList<Car> arr = new ArrayList<>();
		
		arr.add(c1);
		arr.add(c2);
		arr.add(c3);
		
		Iterator<Car> i = arr.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
