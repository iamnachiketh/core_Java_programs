package traversingobjects;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class MobileMainClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Mobile> arr = new ArrayList<>();
		
		arr.add(new Mobile("Oneplus",1234,100));
		arr.add(new Mobile("Apple",1549,200));
		
		ListIterator<Mobile> i = arr.listIterator();
		ListIterator<Mobile> it = arr.listIterator(arr.size());
		
		while(i.hasNext()) {
			Mobile m = i.next();
			System.out.println("Brand name: "+m.brand+" Model: "+m.modelNo+" cost: "+m.cost);
		}
		System.out.println("===============================================");
		while(i.hasPrevious()) {
			Mobile m = i.previous();
			System.out.println("Brand name: "+m.brand+" Model: "+m.modelNo+" cost: "+m.cost);
		}
		System.out.println("=================================================");
		
		while(it.hasPrevious()) {
			Mobile m = it.previous();
			System.out.println("Brand name: "+m.brand+" Model: "+m.modelNo+" cost: "+m.cost);
			}
		
		List<Integer> a = new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add(31);
		
		//System.out.println(a.stream().map(i->i+" Hai").toList();
		
		
		
	}

}
