package storingobjects;

import java.util.Comparator;

public class MobileBrandComparator implements Comparator<Mobile>{
	int choice;
	public MobileBrandComparator(int choice) {
		this.choice = choice;
	}
	@Override
	public int compare(Mobile m1,Mobile m2) {
		switch(choice) {
		case 1: return m1.brand.compareTo(m2.brand);
		case 2: return m2.brand.compareTo(m1.brand);
		default: System.out.println("Invalid choice");
		}
		return 0;
	}
}
