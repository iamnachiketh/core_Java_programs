package mapexample;

import java.util.Comparator;

public class CricketExpComparator implements Comparator<Cricket>{

	
	@Override
	public int compare(Cricket c1,Cricket c2) {
		return c1.age - c2.age;
	}
	
}
