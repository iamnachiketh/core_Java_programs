package org;

import java.util.Scanner;

public class CalculatorMainClass {
	static Scanner sc = new Scanner(System.in);
	static void display(Calculator c) {
		if(c instanceof CalculatorImpl) {
			/**
			 * @author NACHIKETHA
			 * - a and b are local variables so we have to intialize it before using it.
			 */
			int a=0,b=0;
			boolean flag = true;
			// Accepting 2 numbers only when choice is 1 2 3 4
			while(flag) {
				System.out.println("Enter the operation to do\n"
						+ "1) Addition\n"
						+ "2) Substraction\n"
						+ "3) Division\n"
						+ "4) Multiplication\n"
						+ "5) To exit out of the program");
				
				
				int opp = sc.nextInt();
				if(opp>=1 && opp<=4) {
					System.out.println("Enter two numbers");
					a = sc.nextInt();
					b = sc.nextInt();	
				}
				
				switch(opp) {
				case 1: c.add(a, b);
				break;
				case 2: c.sub(a, b);
				break;
				case 3: c.div(a, b);
				break;
				case 4: c.mult(a, b);
				break;
				case 5: {
					System.out.println("Exiting the program....");
					flag = false;
				}
				break;
				default: System.out.println("Invalid choice!!!");
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------- Welcome to Calculator Project -------");
		System.out.println("=======================================================");
		display(new CalculatorImpl());
		return;
	}

}
