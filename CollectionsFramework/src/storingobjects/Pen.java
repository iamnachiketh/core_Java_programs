package storingobjects;

public class Pen implements Comparable<Pen>{
	Integer cost;
	Pen(Integer cost){
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Cost is: "+this.cost;
	}
	
	@Override
	public int compareTo(Pen p) {
		return this.cost - p.cost;
	}	
	
}
