package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		Iterator<Integer> a = arr.iterator();
		
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		System.out.println("===================================");
		arr.forEach((v) -> {
			
		});
		
		
	}

}
