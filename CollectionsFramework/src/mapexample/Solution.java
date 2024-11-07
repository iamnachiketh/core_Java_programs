package mapexample;

import java.util.LinkedHashMap;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
		
		lhm.put("Alex",20);
		lhm.put("Harsh", 19);
		lhm.put("Arun",34);
		
		for(String s: lhm.keySet()) {
			System.out.println(s+" is "+lhm.get(s)+" years old!!");
		}
		
		System.out.println("========================================");
		
		lhm.forEach((s,v)->System.out.println(s+" is "+v+" years old!!"));
	}

}
