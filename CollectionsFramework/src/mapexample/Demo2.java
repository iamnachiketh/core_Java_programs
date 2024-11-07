package mapexample;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<Integer,String> m = new LinkedHashMap<>();
		
		m.put(10,"Apple");
		m.put(20,"Samsung");
		m.put(30,"Oneplue");
		m.put(40, "Poco");
		Map<Integer,String> m1 = new LinkedHashMap<>();
		m1.put(50, "Apple");
		m1.put(60, "nothing");
		System.out.println(m1);
		m.putAll(m1);
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.get(20));
		System.out.println(m.containsKey(90));
		System.out.println(m.containsValue("apple"));
		System.out.println(m.remove(30));
		
		for(Integer key:m.keySet()) {
			System.out.println(key+": "+m.get(key));
		}
		System.out.println("=======================================");
		m.forEach((k,v)->System.out.println(k+": "+v));
	}

}
