package storingobjects;

import java.util.Comparator;

public class PenCostComparator implements Comparator<Pen>{
	@Override
	public int compare(Pen p1,Pen p2) {
		return p1.cost - p2.cost;
	}
}
