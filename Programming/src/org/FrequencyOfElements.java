package org;

import java.util.*;

public class FrequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {34,76,23,98,56,54,66,12,23,89};
		frequencyOfElements(a);
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void frequencyOfElements(int[] a) {
		boolean[] b = new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(b[i] == false) {
			int count = 0;
			for(int j=i;j<a.length;j++) {
					if(a[i] == a[j]) {
						count++;
						b[j] = true;
					}
				}
			System.out.println("The frequency of "+a[i]+" is "+count);
			}
		}
		
	}

}
