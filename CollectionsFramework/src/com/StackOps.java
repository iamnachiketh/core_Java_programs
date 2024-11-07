package com;

import java.util.*;

public class StackOps<F>{

	LinkedList<F> arr = new LinkedList<>();
	
	void push(F obj) {
		arr.add(obj);
	}
	
	void pop() {
		if(arr.isEmpty()) System.out.println("List is empty");
		else arr.remove(arr.get(arr.size()-1));
	}
	
	void displayElements() {
		System.out.println(arr);
	}

}
