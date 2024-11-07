package mapexample;

import java.util.*;
import java.util.Map.Entry;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new LinkedHashMap<>();
		
		m.put(10,"Apple");
		m.put(20,"Samsung");
		m.put(30,"Oneplue");
		m.put(40, "Poco");
		
		Set<Map.Entry<Integer,String>> set = m.entrySet();
		
		for(Entry<Integer,String> entry:set) {
			Integer k = entry.getKey();
			String s = entry.getValue();
			System.out.println(k+" -> "+s);
		}
		System.out.println("==============================================");
		for(Integer i:m.keySet()) {
			System.out.println(i+" -> "+m.get(i));
		}
		
		
	}

}
