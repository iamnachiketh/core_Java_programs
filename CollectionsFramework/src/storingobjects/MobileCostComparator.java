package storingobjects;

import java.util.Comparator;

public class MobileCostComparator implements Comparator<Mobile>{
	int choice;
	public MobileCostComparator(int choice) {
		this.choice = choice;
	}
	@Override
	public int compare(Mobile m1,Mobile m2) {
		switch(choice) {
		case 1: return m1.cost - m2.cost;
		case 2: return m2.cost - m1.cost;
		default: System.out.println("Invalid choice");
		}
		return 0;
	}
}
