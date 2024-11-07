package org;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swiggy().start();
		new Thread( new Zomato(),"Zomato").start();
		
	}

}
