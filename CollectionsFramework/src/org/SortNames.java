package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> arr = new ArrayList<>();
		
		arr.add("Alex");
		arr.add("Jeff");
		arr.add("Nathan");
		arr.add("Tom");
		arr.add("Ajax");
		arr.add("Elon");
		arr.add("Harsh");
		
		System.out.println(" 1) To Sort the names in alphabetical order\n "
				+"2) To Sort the names in alphabetical order and Reverse it");
	
		int choice = new Scanner(System.in).nextInt();
		switch(choice) {
		case 1:{
			Collections.sort(arr);
			for(String i: arr) {
				System.out.println(i);
			}
		}
		break;
		
		case 2:{
			Collections.sort(arr);
			Collections.reverse(arr);
			for(String i: arr) {
				System.out.println(i);
			}
		}
		break;
		
		default: System.out.println("Invalid Choice");
		}
	}
	

}
