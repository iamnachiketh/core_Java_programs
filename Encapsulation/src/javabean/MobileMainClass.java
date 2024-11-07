package javabean;

import java.util.Scanner;

public class MobileMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Mobile m = new Mobile();
		try {
			System.out.println("Enter the cost: ");
			int cost = sc.nextInt();
			System.out.println("Enter the brand: ");
			String brand = sc.next();
			m.setDetails(cost,brand);
			m.getDetails();	
		}catch(Exception e) {
//			System.out.println(e.toString());
			System.out.println(e.toString().substring(10));
		}
	}

}
