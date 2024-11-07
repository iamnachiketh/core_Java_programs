package org;

import java.util.TreeSet;

public class CarMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Car> ts = new TreeSet<Car>(new CarColorComparator());
		
		ts.add(new Car("Honda",20000,"Grey"));
		ts.add(new Car("Maruthi",10000,"Sliver"));
		ts.add(new Car("KIA",40000,"Dark Red"));
		ts.add(new Car("Ford",30000,"Yellow"));
		
		for(Car i:ts) {
			System.out.println("Brand: "+i.brand+" Cost: "+i.cost+" Color: "+i.color);
			System.out.println();
		}
	}

}
