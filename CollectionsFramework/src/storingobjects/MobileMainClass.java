package storingobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MobileMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Mobile> arr = new ArrayList<>();
		System.out.println("1) Sort using cost\n2) sort using brand");
		System.out.println("Enter your choice :");
		int choice1 = new Scanner(System.in).nextInt();
	
		arr.add(new Mobile("Samsung",20000));
		arr.add(new Mobile("Apple",30000));
		arr.add(new Mobile("Nothing",2000));
		
		switch(choice1){
		case 1: {
			System.out.println("1) Asecnding order\n2) Descending order");
			System.out.println("Enter your choice :");
			int choice2 = new Scanner(System.in).nextInt();
			Collections.sort(arr,new MobileCostComparator(choice2));
			}
		break;
		case 2: {
			System.out.println("1) Asecnding order\n2) Descending order");
			System.out.println("Enter your choice :");
			int choice2 = new Scanner(System.in).nextInt();
			Collections.sort(arr,new MobileBrandComparator(choice2));
			}
		break;
		default: {
			System.out.println("Invalid choice");
			return;
		}
		}
		
		for(Mobile m:arr) {
			System.out.println(m);
		}
	}

}
