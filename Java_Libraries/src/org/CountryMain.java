package org;

public class CountryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country[] c = new Country[2];
		c[0] = new Country("US",30000,1);
		c[1] = new Country("UK",453654,2);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].cid);
		}
	
	}

}
