package storingobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PenMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pen> arr = new ArrayList<>();
		arr.add(new Pen(1000));
		arr.add(new Pen(5000));
		arr.add(new Pen(3000));
		
		Collections.sort(arr,new PenCostComparator());
		Collections.sort(null);
		
		for(Object i:arr) {
			System.out.println(i);
		}
	}

}
