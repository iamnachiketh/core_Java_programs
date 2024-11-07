package customsorting;

import java.util.*;

public class CarMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Car> ts = new TreeSet<>(new CarCostComparator());
		ts.add(new Car(1000));
		ts.add(new Car(5000));
		ts.add(new Car(10000));
		
		for(Car c:ts) {
			System.out.println(c);
		}
 	}

}
