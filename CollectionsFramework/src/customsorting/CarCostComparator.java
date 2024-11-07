package customsorting;

import java.util.Comparator;

public class CarCostComparator implements Comparator<Car>{
	
	@Override
	public int compare(Car c1, Car c2) {
		return c1.cost - c2.cost;
	}
}
