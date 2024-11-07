package day1;

import java.util.Scanner;

public class Demo {
	
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the two numbers");
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("The division of two numbers is: "+(a/b));
		}catch(Exception e) {
			System.out.println("There has been some error: "+e);
		}
		
	}

}
