package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Alex");
		arr.add("Allen");
		arr.add("Naveen");
		Iterator<String> i = arr.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
