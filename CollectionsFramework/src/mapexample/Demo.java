package mapexample;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object,Object> m = new HashMap<>();
		
		m.put(10,"Hai");
		m.put("java", "cool");
		m.put(1.5, 90);
		 System.out.println(m.containsKey("java"));
		 System.out.println(m.get(10));
		 System.out.println(m.containsValue(200));
		 System.out.println(m.get(198));
		 
		 System.out.println(m);
		 m.remove(10);
		 System.out.println(m);
		 
		 m.clear();
		 System.out.println(m);
	}

}
