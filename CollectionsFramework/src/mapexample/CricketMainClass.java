package mapexample;

import java.util.TreeMap;

public class CricketMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Cricket> tm = new TreeMap<>();
		
		tm.put(89,new Cricket("Virat","batsman","india",34));
		tm.put(102,new Cricket("Rohit","batsman","india",35));
		tm.put(245,new Cricket("Chris Gayle","batsman","west indies",40));
		tm.put(45,new Cricket("Ashwin","bowler","india",32));
		tm.put(57,new Cricket("Brit lee","bowler","aussie",43));
		
		for(Integer i:tm.keySet()) {
			System.out.println(tm.get(i)+" Score: "+i);
		}
	}

}
