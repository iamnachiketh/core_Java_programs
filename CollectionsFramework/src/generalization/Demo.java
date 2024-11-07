package generalization;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();
		
		arr.add(40);  // new Integer(40);
		arr.add(true); // new Boelean(true);
		arr.add("java"); // new String("java");
		arr.add(20);	// new Integer(20);
		arr.add(1.45);
		
		for(Object i:arr) {
			if(i instanceof Double) System.out.println(i);
		}

	}

}
